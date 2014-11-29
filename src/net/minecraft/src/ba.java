package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.LinkedList;
/*   5:    */ import java.util.List;
/*   6:    */ 
/*   7:    */ public class ba
/*   8:    */   extends CommandBase
/*   9:    */ {
/*  10:    */   public String c()
/*  11:    */   {
/*  12: 30 */     return "clone";
/*  13:    */   }
/*  14:    */   
/*  15:    */   public int a()
/*  16:    */   {
/*  17: 35 */     return 2;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public String c(ICommandSender paramae)
/*  21:    */   {
/*  22: 40 */     return "commands.clone.usage";
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  26:    */   {
/*  27: 45 */     if (paramArrayOfString.length < 9) {
/*  28: 46 */       throw new WrongUsageException("commands.clone.usage", new Object[0]);
/*  29:    */     }
/*  30: 48 */     paramae.a(ag.b, 0);
/*  31:    */     
/*  32: 50 */     BlockPosition localdt1 = a(paramae, paramArrayOfString, 0, false);
/*  33: 51 */     BlockPosition localdt2 = a(paramae, paramArrayOfString, 3, false);
/*  34: 52 */     BlockPosition localdt3 = a(paramae, paramArrayOfString, 6, false);
/*  35:    */     
/*  36: 54 */     bjb localbjb1 = new bjb(localdt1, localdt2);
/*  37: 55 */     bjb localbjb2 = new bjb(localdt3, localdt3.offset(localbjb1.b()));
/*  38:    */     
/*  39: 57 */     int i = localbjb1.c() * localbjb1.d() * localbjb1.e();
/*  40: 58 */     if (i > 32768) {
/*  41: 59 */       throw new CommandException("commands.clone.tooManyBlocks", new Object[] { Integer.valueOf(i), Integer.valueOf(32768) });
/*  42:    */     }
/*  43: 61 */     int j = 0;
/*  44: 62 */     BlockType localatr = null;
/*  45: 63 */     int k = -1;
/*  46: 64 */     if (((paramArrayOfString.length < 11) || ((!paramArrayOfString[10].equals("force")) && (!paramArrayOfString[10].equals("move")))) && (localbjb1.a(localbjb2))) {
/*  47: 65 */       throw new CommandException("commands.clone.noOverlap", new Object[0]);
/*  48:    */     }
/*  49: 66 */     if ((paramArrayOfString.length >= 11) && (paramArrayOfString[10].equals("move"))) {
/*  50: 67 */       j = 1;
/*  51:    */     }
/*  52: 70 */     if ((localbjb1.b < 0) || (localbjb1.e >= 256) || (localbjb2.b < 0) || (localbjb2.e >= 256)) {
/*  53: 71 */       throw new CommandException("commands.clone.outOfWorld", new Object[0]);
/*  54:    */     }
/*  55: 73 */     World localaqu = paramae.e();
/*  56: 74 */     if ((!localaqu.a(localbjb1)) || (!localaqu.a(localbjb2))) {
/*  57: 75 */       throw new CommandException("commands.clone.outOfWorld", new Object[0]);
/*  58:    */     }
/*  59: 78 */     int m = 0;
/*  60: 79 */     if (paramArrayOfString.length >= 10) {
/*  61: 80 */       if (paramArrayOfString[9].equals("masked"))
/*  62:    */       {
/*  63: 81 */         m = 1;
/*  64:    */       }
/*  65: 82 */       else if (paramArrayOfString[9].equals("filtered"))
/*  66:    */       {
/*  67: 83 */         if (paramArrayOfString.length >= 12) {
/*  68: 84 */           localatr = g(paramae, paramArrayOfString[11]);
/*  69:    */         } else {
/*  70: 86 */           throw new WrongUsageException("commands.clone.usage", new Object[0]);
/*  71:    */         }
/*  72: 88 */         if (paramArrayOfString.length >= 13) {
/*  73: 89 */           k = a(paramArrayOfString[12], 0, 15);
/*  74:    */         }
/*  75:    */       }
/*  76:    */     }
/*  77: 94 */     ArrayList localArrayList1 = Lists.newArrayList();
/*  78: 95 */     ArrayList localArrayList2 = Lists.newArrayList();
/*  79: 96 */     ArrayList localArrayList3 = Lists.newArrayList();
/*  80: 97 */     LinkedList<BlockPosition> localLinkedList = Lists.newLinkedList();
/*  81:    */     
/*  82: 99 */     BlockPosition localdt4 = new BlockPosition(localbjb2.a - localbjb1.a, localbjb2.b - localbjb1.b, localbjb2.c - localbjb1.c);
/*  83:    */     
/*  84:    */     
/*  85:    */     
/*  86:100 */     for (int n = localbjb1.c; n <= localbjb1.f; n++) {
/*  87:101 */       for (int i1 = localbjb1.b; i1 <= localbjb1.e; i1++) {
/*  88:102 */         for (int i2 = localbjb1.a; i2 <= localbjb1.d; i2++)
/*  89:    */         {
/*  90:103 */           BlockPosition localObject4 = new BlockPosition(i2, i1, n);
/*  91:104 */           BlockPosition localObject5 = ((BlockPosition)localObject4).offset(localdt4);
/*  92:    */           
/*  93:106 */           Block localObject6 = localaqu.getBlock((BlockPosition)localObject4);
/*  94:107 */           if ((m == 0) || (((Block)localObject6).getType() != BlockList.air)) {
/*  95:109 */             if (localatr != null)
/*  96:    */             {
/*  97:110 */               if (((Block)localObject6).getType() == localatr) {
/*  98:113 */                 if ((k >= 0) && (((Block)localObject6).getType().c((Block)localObject6) != k)) {}
/*  99:    */               }
/* 100:    */             }
/* 101:    */             else
/* 102:    */             {
/* 103:118 */               bcm localbcm = localaqu.s((BlockPosition)localObject4);
/* 104:119 */               if (localbcm != null)
/* 105:    */               {
/* 106:120 */                 NBTTagCompound localfn = new NBTTagCompound();
/* 107:121 */                 localbcm.writeToNBT(localfn);
/* 108:122 */                 localArrayList2.add(new bb((BlockPosition)localObject5, (Block)localObject6, localfn));
/* 109:123 */                 localLinkedList.addLast(localObject4);
/* 110:    */               }
/* 111:124 */               else if ((((Block)localObject6).getType().m()) || (((Block)localObject6).getType().isOpaqueCube()))
/* 112:    */               {
/* 113:125 */                 localArrayList1.add(new bb((BlockPosition)localObject5, (Block)localObject6, null));
/* 114:126 */                 localLinkedList.addLast(localObject4);
/* 115:    */               }
/* 116:    */               else
/* 117:    */               {
/* 118:128 */                 localArrayList3.add(new bb((BlockPosition)localObject5, (Block)localObject6, null));
/* 119:129 */                 localLinkedList.addFirst(localObject4);
/* 120:    */               }
/* 121:    */             }
/* 122:    */           }
/* 123:    */         }
/* 124:    */       }
/* 125:    */     }
/* 126:135 */     if (j != 0)
/* 127:    */     {
/* 128:136 */       for (Iterator<BlockPosition> localObject1 = localLinkedList.iterator(); ((Iterator)localObject1).hasNext();)
/* 129:    */       {
/* 130:136 */         BlockPosition localObject2 = localObject1.next();
/* 131:137 */         bcm localObject3 = localaqu.s((BlockPosition)localObject2);
/* 132:138 */         if ((localObject3 instanceof vq)) {
/* 133:139 */           ((vq)localObject3).l();
/* 134:    */         }
/* 135:141 */         localaqu.setBlock((BlockPosition)localObject2, BlockList.barrier.instance(), 2);
/* 136:    */       }
/* 137:143 */       for (Iterator<BlockPosition>localObject1 = localLinkedList.iterator(); ((Iterator)localObject1).hasNext();)
/* 138:    */       {
/* 139:143 */         BlockPosition localObject2 = (BlockPosition)((Iterator)localObject1).next();
/* 140:144 */         localaqu.setBlock((BlockPosition)localObject2, BlockList.air.instance(), 3);
/* 141:    */       }
/* 142:    */     }
/* 143:148 */     Object localObject1 = Lists.newArrayList();
/* 144:149 */     ((List)localObject1).addAll(localArrayList1);
/* 145:150 */     ((List)localObject1).addAll(localArrayList2);
/* 146:151 */     ((List)localObject1).addAll(localArrayList3);
/* 147:    */     
/* 148:153 */     Object localObject2 = Lists.reverse((List)localObject1);
/* 149:154 */     for (Object localObject3 = ((List)localObject2).iterator(); ((Iterator)localObject3).hasNext();)
/* 150:    */     {
/* 151:154 */       bb localObject4 = (bb)((Iterator)localObject3).next();
/* 152:155 */       bcm localObject5 = localaqu.s(((bb)localObject4).a);
/* 153:156 */       if ((localObject5 instanceof vq)) {
/* 154:157 */         ((vq)localObject5).l();
/* 155:    */       }
/* 156:159 */       localaqu.setBlock(((bb)localObject4).a, BlockList.barrier.instance(), 2);
/* 157:    */     }
/* 158:162 */     i = 0;
/* 159:163 */     for (Iterator<bb> localObject3 = ((List)localObject1).iterator(); ((Iterator)localObject3).hasNext();)
/* 160:    */     {
/* 161:163 */       bb localObject4 = localObject3.next();
/* 162:164 */       if (localaqu.setBlock(((bb)localObject4).a, ((bb)localObject4).b, 2)) {
/* 163:165 */         i++;
/* 164:    */       }
/* 165:    */     }
/* 166:168 */     for (Iterator<bb> localObject3 = localArrayList2.iterator(); ((Iterator)localObject3).hasNext();)
/* 167:    */     {
/* 168:168 */       bb localObject4 = localObject3.next();
/* 169:169 */       bcm localObject5 = localaqu.s(((bb)localObject4).a);
/* 170:170 */       if ((((bb)localObject4).c != null) && (localObject5 != null))
/* 171:    */       {
/* 172:171 */         ((bb)localObject4).c.setInt("x", ((bb)localObject4).a.getX());
/* 173:172 */         ((bb)localObject4).c.setInt("y", ((bb)localObject4).a.getY());
/* 174:173 */         ((bb)localObject4).c.setInt("z", ((bb)localObject4).a.getZ());
/* 175:174 */         ((bcm)localObject5).readFromNBT(((bb)localObject4).c);
/* 176:175 */         ((bcm)localObject5).o_();
/* 177:    */       }
/* 178:177 */       localaqu.setBlock(((bb)localObject4).a, ((bb)localObject4).b, 2);
/* 179:    */     }
/* 180:180 */     for (Iterator<bb> localObject3 = ((List)localObject2).iterator(); ((Iterator)localObject3).hasNext();)
/* 181:    */     {
/* 182:180 */       bb localObject4 = (bb)((Iterator)localObject3).next();
/* 183:181 */       localaqu.b(((bb)localObject4).a, ((bb)localObject4).b.getType());
/* 184:    */     }
/* 185:184 */     List<TickListener> localObject3 = localaqu.a(localbjb1, false);
/* 186:185 */     if (localObject3 != null) {
/* 187:186 */       for (Iterator<TickListener> localObject4 = ((List)localObject3).iterator(); ((Iterator)localObject4).hasNext();)
/* 188:    */       {
/* 189:186 */         TickListener localObject5 = (TickListener)((Iterator)localObject4).next();
/* 190:187 */         if (localbjb1.b(((TickListener)localObject5).a))
/* 191:    */         {
/* 192:188 */           BlockPosition localObject6 = ((TickListener)localObject5).a.offset(localdt4);
/* 193:189 */           localaqu.b((BlockPosition)localObject6, ((TickListener)localObject5).a(), (int)(((TickListener)localObject5).time - localaqu.getWorldInfo().getRealTime()), ((TickListener)localObject5).c);
/* 194:    */         }
/* 195:    */       }
/* 196:    */     }
/* 197:194 */     if (i <= 0) {
/* 198:195 */       throw new CommandException("commands.clone.failed", new Object[0]);
/* 199:    */     }
/* 200:197 */     paramae.a(ag.b, i);
/* 201:198 */     a(paramae, this, "commands.clone.success", new Object[] { Integer.valueOf(i) });
/* 202:    */   }
/* 203:    */   
/* 204:    */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 205:    */   {
/* 206:204 */     if ((paramArrayOfString.length > 0) && (paramArrayOfString.length <= 3)) {
/* 207:205 */       return a(paramArrayOfString, 0, paramdt);
/* 208:    */     }
/* 209:206 */     if ((paramArrayOfString.length > 3) && (paramArrayOfString.length <= 6)) {
/* 210:207 */       return a(paramArrayOfString, 3, paramdt);
/* 211:    */     }
/* 212:208 */     if ((paramArrayOfString.length > 6) && (paramArrayOfString.length <= 9)) {
/* 213:209 */       return a(paramArrayOfString, 6, paramdt);
/* 214:    */     }
/* 215:210 */     if (paramArrayOfString.length == 10) {
/* 216:211 */       return a(paramArrayOfString, new String[] { "replace", "masked", "filtered" });
/* 217:    */     }
/* 218:212 */     if (paramArrayOfString.length == 11) {
/* 219:213 */       return a(paramArrayOfString, new String[] { "normal", "force", "move" });
/* 220:    */     }
/* 221:214 */     if ((paramArrayOfString.length == 12) && ("filtered".equals(paramArrayOfString[9]))) {
/* 222:215 */       return a(paramArrayOfString, BlockType.c.c());
/* 223:    */     }
/* 224:217 */     return null;
/* 225:    */   }
/* 226:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ba
 * JD-Core Version:    0.7.0.1
 */