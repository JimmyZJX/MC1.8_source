package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.Iterator;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Map;
/*   7:    */ import java.util.Random;
/*   8:    */ 
/*   9:    */ public abstract class bmm
/*  10:    */   extends bgt
/*  11:    */ {
/*  12:    */   private bmr d;
/*  13: 23 */   protected Map<Long,bmv> e = Maps.newHashMap();
/*  14:    */   
/*  15:    */   public abstract String a();
/*  16:    */   
/*  17:    */   protected final void a(World paramaqu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, bgk parambgk)
/*  18:    */   {
/*  19: 33 */     a(paramaqu);
/*  20: 39 */     if (this.e.containsKey(Long.valueOf(ChunkID.toLong(paramInt1, paramInt2)))) {
/*  21: 40 */       return;
/*  22:    */     }
/*  23: 44 */     this.b.nextInt();
/*  24:    */     try
/*  25:    */     {
/*  26: 47 */       if (a(paramInt1, paramInt2))
/*  27:    */       {
/*  28: 48 */         bmv localbmv = b(paramInt1, paramInt2);
/*  29: 49 */         this.e.put(Long.valueOf(ChunkID.toLong(paramInt1, paramInt2)), localbmv);
/*  30: 50 */         a(paramInt1, paramInt2, localbmv);
/*  31:    */       }
/*  32:    */     }
/*  33:    */     catch (Throwable localThrowable)
/*  34:    */     {
/*  35: 53 */       b localb = net.minecraft.src.b.a(localThrowable, "Exception preparing structure feature");
/*  36: 54 */       j localj = localb.a("Feature being prepared");
/*  37:    */       
/*  38: 56 */       localj.a("Is feature chunk", new bmn(this, paramInt1, paramInt2));
/*  39:    */       
/*  40:    */ 
/*  41:    */ 
/*  42:    */ 
/*  43:    */ 
/*  44:    */ 
/*  45: 63 */       localj.a("Chunk location", String.format("%d,%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
/*  46:    */       
/*  47: 65 */       localj.a("Chunk pos hash", new bmo(this, paramInt1, paramInt2));
/*  48:    */       
/*  49:    */ 
/*  50:    */ 
/*  51:    */ 
/*  52:    */ 
/*  53:    */ 
/*  54: 72 */       localj.a("Structure type", new bmp(this));
/*  55:    */       
/*  56:    */ 
/*  57:    */ 
/*  58:    */ 
/*  59:    */ 
/*  60:    */ 
/*  61: 79 */       throw new u(localb);
/*  62:    */     }
/*  63:    */   }
/*  64:    */   
/*  65:    */   public boolean a(World paramaqu, Random paramRandom, ChunkID paramaqm)
/*  66:    */   {
/*  67: 84 */     a(paramaqu);
/*  68:    */     
/*  69: 86 */     int i = (paramaqm.x << 4) + 8;
/*  70: 87 */     int j = (paramaqm.z << 4) + 8;
/*  71:    */     
/*  72: 89 */     boolean bool = false;
/*  73: 90 */     for (bmv localbmv : this.e.values()) {
/*  74: 91 */       if ((localbmv.d()) && (localbmv.a(paramaqm)) && 
/*  75: 92 */         (localbmv.a().a(i, j, i + 15, j + 15)))
/*  76:    */       {
/*  77: 93 */         localbmv.a(paramaqu, paramRandom, new bjb(i, j, i + 15, j + 15));
/*  78: 94 */         localbmv.b(paramaqm);
/*  79: 95 */         bool = true;
/*  80:    */         
/*  81:    */ 
/*  82: 98 */         a(localbmv.e(), localbmv.f(), localbmv);
/*  83:    */       }
/*  84:    */     }
/*  85:103 */     return bool;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public boolean b(BlockPosition paramdt)
/*  89:    */   {
/*  90:133 */     a(this.c);
/*  91:134 */     return c(paramdt) != null;
/*  92:    */   }
/*  93:    */   
/*  94:    */   protected bmv c(BlockPosition paramdt)
/*  95:    */   {
/*  96:138 */     for (bmv localbmv : this.e.values()) {
/*  97:139 */       if ((localbmv.d()) && 
/*  98:140 */         (localbmv.a().b(paramdt)))
/*  99:    */       {
/* 100:141 */         Iterator<bms> localIterator2 = localbmv.b().iterator();
/* 101:142 */         while (localIterator2.hasNext())
/* 102:    */         {
/* 103:143 */           bms localbms = (bms)localIterator2.next();
/* 104:144 */           if (localbms.c().b(paramdt)) {
/* 105:145 */             return localbmv;
/* 106:    */           }
/* 107:    */         }
/* 108:    */       }
/* 109:    */     }
/* 110:151 */     return null;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public boolean a(World paramaqu, BlockPosition paramdt)
/* 114:    */   {
/* 115:165 */     a(paramaqu);
/* 116:167 */     for (bmv localbmv : this.e.values()) {
/* 117:168 */       if ((localbmv.d()) && 
/* 118:169 */         (localbmv.a().b(paramdt))) {
/* 119:170 */         return true;
/* 120:    */       }
/* 121:    */     }
/* 122:174 */     return false;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public BlockPosition b(World paramaqu, BlockPosition paramdt)
/* 126:    */   {
/* 127:180 */     this.c = paramaqu;
/* 128:    */     
/* 129:182 */     a(paramaqu);
/* 130:    */     
/* 131:184 */     this.b.setSeed(paramaqu.J());
/* 132:185 */     long l1 = this.b.nextLong();
/* 133:186 */     long l2 = this.b.nextLong();
/* 134:187 */     long l3 = (paramdt.getX() >> 4) * l1;
/* 135:188 */     long l4 = (paramdt.getZ() >> 4) * l2;
/* 136:189 */     this.b.setSeed(l3 ^ l4 ^ paramaqu.J());
/* 137:    */     
/* 138:191 */     a(paramaqu, paramdt.getX() >> 4, paramdt.getZ() >> 4, 0, 0, null);
/* 139:    */     
/* 140:193 */     double d1 = 1.7976931348623157E+308D;
/* 141:194 */     BlockPosition localObject1 = null;
/* 142:196 */     for (Iterator<bmv> localObject2 = this.e.values().iterator(); localObject2.hasNext();)
/* 143:    */     {
/* 144:196 */       bmv localObject3 = localObject2.next();
/* 145:197 */       if (((bmv)localObject3).d())
/* 146:    */       {
/* 147:198 */         bms localObject4 = (bms)((bmv)localObject3).b().get(0);
/* 148:199 */         BlockPosition localdt = ((bms)localObject4).a();
/* 149:    */         
/* 150:201 */         double d2 = localdt.i(paramdt);
/* 151:203 */         if (d2 < d1)
/* 152:    */         {
/* 153:204 */           d1 = d2;
/* 154:205 */           localObject1 = localdt;
/* 155:    */         }
/* 156:    */       }
/* 157:    */     }
/* 158:    */     BlockPosition localObject3;
/* 159:    */     
/* 160:    */     BlockPosition localdt;
/* 161:    */     double d2;
/* 162:209 */     if (localObject1 != null) {
/* 163:210 */       return localObject1;
/* 164:    */     }
/* 165:212 */     List<BlockPosition> localObject2 = y_();
/* 166:213 */     if (localObject2 != null)
/* 167:    */     {
/* 168:214 */       localObject3 = null;
/* 169:215 */       for (Iterator<BlockPosition> localObject4 = localObject2.iterator(); localObject4.hasNext();)
/* 170:    */       {
/* 171:215 */         localdt = localObject4.next();
/* 172:216 */         d2 = localdt.i(paramdt);
/* 173:218 */         if (d2 < d1)
/* 174:    */         {
/* 175:219 */           d1 = d2;
/* 176:220 */           localObject3 = localdt;
/* 177:    */         }
/* 178:    */       }
/* 179:223 */       return localObject3;
/* 180:    */     }
/* 181:226 */     return null;
/* 182:    */   }
/* 183:    */   
/* 184:    */   protected List<BlockPosition> y_()
/* 185:    */   {
/* 186:230 */     return null;
/* 187:    */   }
/* 188:    */   
/* 189:    */   private void a(World paramaqu)
/* 190:    */   {
/* 191:    */     NBTTagCompound localfn1;
/* 192:234 */     if (this.d == null)
/* 193:    */     {
/* 194:235 */       this.d = ((bmr)paramaqu.a(bmr.class, a()));
/* 195:237 */       if (this.d == null)
/* 196:    */       {
/* 197:238 */         this.d = new bmr(a());
/* 198:239 */         paramaqu.a(a(), this.d);
/* 199:    */       }
/* 200:    */       else
/* 201:    */       {
/* 202:241 */         localfn1 = this.d.a();
/* 203:243 */         for (String str : localfn1.c())
/* 204:    */         {
/* 205:244 */           NBTBase localgd = localfn1.a(str);
/* 206:245 */           if (localgd.a() == 10)
/* 207:    */           {
/* 208:246 */             NBTTagCompound localfn2 = (NBTTagCompound)localgd;
/* 209:248 */             if ((localfn2.c("ChunkX")) && (localfn2.c("ChunkZ")))
/* 210:    */             {
/* 211:249 */               int i = localfn2.getInteger("ChunkX");
/* 212:250 */               int j = localfn2.getInteger("ChunkZ");
/* 213:    */               
/* 214:252 */               bmv localbmv = bmq.a(localfn2, paramaqu);
/* 215:253 */               if (localbmv != null) {
/* 216:254 */                 this.e.put(Long.valueOf(ChunkID.toLong(i, j)), localbmv);
/* 217:    */               }
/* 218:    */             }
/* 219:    */           }
/* 220:    */         }
/* 221:    */       }
/* 222:    */     }
/* 223:    */   }
/* 224:    */   
/* 225:    */   private void a(int paramInt1, int paramInt2, bmv parambmv)
/* 226:    */   {
/* 227:264 */     this.d.a(parambmv.a(paramInt1, paramInt2), paramInt1, paramInt2);
/* 228:265 */     this.d.c();
/* 229:    */   }
/* 230:    */   
/* 231:    */   protected abstract boolean a(int paramInt1, int paramInt2);
/* 232:    */   
/* 233:    */   protected abstract bmv b(int paramInt1, int paramInt2);
/* 234:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmm
 * JD-Core Version:    0.7.0.1
 */