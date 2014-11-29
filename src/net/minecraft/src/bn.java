package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class bn
/*   5:    */   extends CommandBase
/*   6:    */ {
/*   7:    */   public String c()
/*   8:    */   {
/*   9: 29 */     return "fill";
/*  10:    */   }
/*  11:    */   
/*  12:    */   public int a()
/*  13:    */   {
/*  14: 34 */     return 2;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public String c(ICommandSender paramae)
/*  18:    */   {
/*  19: 39 */     return "commands.fill.usage";
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  23:    */   {
/*  24: 44 */     if (paramArrayOfString.length < 7) {
/*  25: 45 */       throw new WrongUsageException("commands.fill.usage", new Object[0]);
/*  26:    */     }
/*  27: 47 */     paramae.a(ag.b, 0);
/*  28:    */     
/*  29: 49 */     BlockPosition localdt1 = a(paramae, paramArrayOfString, 0, false);
/*  30: 50 */     BlockPosition localdt2 = a(paramae, paramArrayOfString, 3, false);
/*  31: 51 */     BlockType localatr1 = CommandBase.g(paramae, paramArrayOfString[6]);
/*  32:    */     
/*  33: 53 */     int i = 0;
/*  34: 54 */     if (paramArrayOfString.length >= 8) {
/*  35: 55 */       i = a(paramArrayOfString[7], 0, 15);
/*  36:    */     }
/*  37: 58 */     BlockPosition localdt3 = new BlockPosition(Math.min(localdt1.getX(), localdt2.getX()), Math.min(localdt1.getY(), localdt2.getY()), Math.min(localdt1.getZ(), localdt2.getZ()));
/*  38: 59 */     BlockPosition localdt4 = new BlockPosition(Math.max(localdt1.getX(), localdt2.getX()), Math.max(localdt1.getY(), localdt2.getY()), Math.max(localdt1.getZ(), localdt2.getZ()));
/*  39:    */     
/*  40: 61 */     int j = (localdt4.getX() - localdt3.getX() + 1) * (localdt4.getY() - localdt3.getY() + 1) * (localdt4.getZ() - localdt3.getZ() + 1);
/*  41: 62 */     if (j > 32768) {
/*  42: 63 */       throw new CommandException("commands.fill.tooManyBlocks", new Object[] { Integer.valueOf(j), Integer.valueOf(32768) });
/*  43:    */     }
/*  44: 66 */     if ((localdt3.getY() < 0) || (localdt4.getY() >= 256)) {
/*  45: 67 */       throw new CommandException("commands.fill.outOfWorld", new Object[0]);
/*  46:    */     }
/*  47: 70 */     World localaqu = paramae.e();
/*  48: 71 */     for (int k = localdt3.getZ(); k < localdt4.getZ() + 16; k += 16) {
/*  49: 72 */       for (int m = localdt3.getX(); m < localdt4.getX() + 16; m += 16) {
/*  50: 73 */         if (!localaqu.e(new BlockPosition(m, localdt4.getY() - localdt3.getY(), k))) {
/*  51: 74 */           throw new CommandException("commands.fill.outOfWorld", new Object[0]);
/*  52:    */         }
/*  53:    */       }
/*  54:    */     }
/*  55: 79 */     NBTTagCompound localfn = new NBTTagCompound();
/*  56: 80 */     int m = 0;
/*  57: 81 */     if ((paramArrayOfString.length >= 10) && (localatr1.x()))
/*  58:    */     {
/*  59: 82 */       String localObject = a(paramae, paramArrayOfString, 9).c();
/*  60:    */       try
/*  61:    */       {
/*  62: 84 */         localfn = gg.a((String)localObject);
/*  63: 85 */         m = 1;
/*  64:    */       }
/*  65:    */       catch (gf localgf)
/*  66:    */       {
/*  67: 87 */         throw new CommandException("commands.fill.tagError", new Object[] { localgf.getMessage() });
/*  68:    */       }
/*  69:    */     }
/*  70: 91 */     List<BlockPosition> localObject = Lists.newArrayList();
/*  71:    */     
/*  72: 93 */     j = 0;
/*  73: 94 */     for (int n = localdt3.getZ(); n <= localdt4.getZ(); n++) {
/*  74: 95 */       for (int i1 = localdt3.getY(); i1 <= localdt4.getY(); i1++) {
/*  75: 96 */         for (int i2 = localdt3.getX(); i2 <= localdt4.getX(); i2++)
/*  76:    */         {
/*  77: 97 */           BlockPosition localdt6 = new BlockPosition(i2, i1, n);
/*  78: 99 */           if (paramArrayOfString.length >= 9) {
/*  79:100 */             if ((paramArrayOfString[8].equals("outline")) || (paramArrayOfString[8].equals("hollow")))
/*  80:    */             {
/*  81:101 */               if ((i2 != localdt3.getX()) && (i2 != localdt4.getX()) && (i1 != localdt3.getY()) && (i1 != localdt4.getY()) && (n != localdt3.getZ()) && (n != localdt4.getZ()))
/*  82:    */               {
/*  83:102 */                 if (!paramArrayOfString[8].equals("hollow")) {
/*  84:    */                   continue;
/*  85:    */                 }
/*  86:103 */                 localaqu.setBlock(localdt6, BlockList.air.instance(), 2);
/*  87:104 */                 localObject.add(localdt6); continue;
/*  88:    */               }
/*  89:    */             }
/*  90:108 */             else if (paramArrayOfString[8].equals("destroy")) {
/*  91:109 */               localaqu.b(localdt6, true);
/*  92:110 */             } else if (paramArrayOfString[8].equals("keep"))
/*  93:    */             {
/*  94:111 */               if (!localaqu.isEmpty(localdt6)) {
/*  95:    */                 continue;
/*  96:    */               }
/*  97:    */             }
/*  98:114 */             else if ((paramArrayOfString[8].equals("replace")) && (!localatr1.x())) {
/*  99:115 */               if (paramArrayOfString.length > 9)
/* 100:    */               {
/* 101:116 */                 BlockType localatr3 = CommandBase.g(paramae, paramArrayOfString[9]);
/* 102:117 */                 if (localaqu.getBlock(localdt6).getType() != localatr3) {}
/* 103:    */               }
/* 104:121 */               else if (paramArrayOfString.length > 10)
/* 105:    */               {
/* 106:122 */                 int i3 = CommandBase.a(paramArrayOfString[10]);
/* 107:123 */                 Block localbec = localaqu.getBlock(localdt6);
/* 108:124 */                 if (localbec.getType().c(localbec) != i3) {
/* 109:    */                   continue;
/* 110:    */                 }
/* 111:    */               }
/* 112:    */             }
/* 113:    */           }
/* 114:131 */           bcm localbcm1 = localaqu.s(localdt6);
/* 115:132 */           if (localbcm1 != null)
/* 116:    */           {
/* 117:133 */             if ((localbcm1 instanceof vq)) {
/* 118:134 */               ((vq)localbcm1).l();
/* 119:    */             }
/* 120:136 */             localaqu.setBlock(localdt6, BlockList.barrier.instance(), localatr1 == BlockList.barrier ? 2 : 4);
/* 121:    */           }
/* 122:139 */           Block localbec = localatr1.instance(i);
/* 123:140 */           if (localaqu.setBlock(localdt6, localbec, 2))
/* 124:    */           {
/* 125:143 */             ((List)localObject).add(localdt6);
/* 126:144 */             j++;
/* 127:146 */             if (m != 0)
/* 128:    */             {
/* 129:147 */               bcm localbcm2 = localaqu.s(localdt6);
/* 130:148 */               if (localbcm2 != null)
/* 131:    */               {
/* 132:149 */                 localfn.setInt("x", localdt6.getX());
/* 133:150 */                 localfn.setInt("y", localdt6.getY());
/* 134:151 */                 localfn.setInt("z", localdt6.getZ());
/* 135:    */                 
/* 136:153 */                 localbcm2.readFromNBT(localfn);
/* 137:    */               }
/* 138:    */             }
/* 139:    */           }
/* 140:    */         }
/* 141:    */       }
/* 142:    */     }
/* 143:160 */     for (BlockPosition localdt5 : localObject)
/* 144:    */     {
/* 145:161 */       BlockType localatr2 = localaqu.getBlock(localdt5).getType();
/* 146:162 */       localaqu.b(localdt5, localatr2);
/* 147:    */     }
/* 148:165 */     if (j <= 0) {
/* 149:166 */       throw new CommandException("commands.fill.failed", new Object[0]);
/* 150:    */     }
/* 151:168 */     paramae.a(ag.b, j);
/* 152:169 */     a(paramae, this, "commands.fill.success", new Object[] { Integer.valueOf(j) });
/* 153:    */   }
/* 154:    */   
/* 155:    */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 156:    */   {
/* 157:175 */     if ((paramArrayOfString.length > 0) && (paramArrayOfString.length <= 3)) {
/* 158:176 */       return a(paramArrayOfString, 0, paramdt);
/* 159:    */     }
/* 160:177 */     if ((paramArrayOfString.length > 3) && (paramArrayOfString.length <= 6)) {
/* 161:178 */       return a(paramArrayOfString, 3, paramdt);
/* 162:    */     }
/* 163:179 */     if (paramArrayOfString.length == 7) {
/* 164:180 */       return a(paramArrayOfString, BlockType.c.c());
/* 165:    */     }
/* 166:181 */     if (paramArrayOfString.length == 9) {
/* 167:182 */       return a(paramArrayOfString, new String[] { "replace", "destroy", "keep", "hollow", "outline" });
/* 168:    */     }
/* 169:185 */     return null;
/* 170:    */   }
/* 171:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bn
 * JD-Core Version:    0.7.0.1
 */