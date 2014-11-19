package net.minecraft.src;
/*   1:    */ import java.util.Arrays;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class bcq
/*   5:    */   extends bdf
/*   6:    */   implements pm, we
/*   7:    */ {
/*   8: 32 */   private static final int[] a = { 3 };
/*   9: 35 */   private static final int[] f = { 0, 1, 2 };
/*  10: 42 */   private ItemStack[] g = new ItemStack[4];
/*  11:    */   private int h;
/*  12:    */   private boolean[] i;
/*  13:    */   private Item j;
/*  14:    */   private String k;
/*  15:    */   
/*  16:    */   public String getName()
/*  17:    */   {
/*  18: 51 */     return k_() ? this.k : "container.brewing";
/*  19:    */   }
/*  20:    */   
/*  21:    */   public boolean k_()
/*  22:    */   {
/*  23: 56 */     return (this.k != null) && (this.k.length() > 0);
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void a(String paramString)
/*  27:    */   {
/*  28: 60 */     this.k = paramString;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public int n_()
/*  32:    */   {
/*  33: 65 */     return this.g.length;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void c()
/*  37:    */   {
/*  38: 70 */     if (this.h > 0)
/*  39:    */     {
/*  40: 71 */       this.h -= 1;
/*  41: 73 */       if (this.h == 0)
/*  42:    */       {
/*  43: 75 */         o();
/*  44: 76 */         o_();
/*  45:    */       }
/*  46: 77 */       else if (!n())
/*  47:    */       {
/*  48: 78 */         this.h = 0;
/*  49: 79 */         o_();
/*  50:    */       }
/*  51: 80 */       else if (this.j != this.g[3].getItem())
/*  52:    */       {
/*  53: 81 */         this.h = 0;
/*  54: 82 */         o_();
/*  55:    */       }
/*  56:    */     }
/*  57: 84 */     else if (n())
/*  58:    */     {
/*  59: 85 */       this.h = 400;
/*  60: 86 */       this.j = this.g[3].getItem();
/*  61:    */     }
/*  62: 89 */     if (!this.world.isClient)
/*  63:    */     {
/*  64: 90 */       boolean[] arrayOfBoolean = m();
/*  65: 91 */       if (!Arrays.equals(arrayOfBoolean, this.i))
/*  66:    */       {
/*  67: 92 */         this.i = arrayOfBoolean;
/*  68: 93 */         Block localbec = this.world.getBlock(v());
/*  69: 94 */         if (!(localbec.getProto() instanceof aub)) {
/*  70: 95 */           return;
/*  71:    */         }
/*  72: 97 */         for (int m = 0; m < aub.a.length; m++) {
/*  73: 98 */           localbec = localbec.a(aub.a[m], Boolean.valueOf(arrayOfBoolean[m]));
/*  74:    */         }
/*  75:100 */         this.world.setBlock(this.pos, localbec, 2);
/*  76:    */       }
/*  77:    */     }
/*  78:    */   }
/*  79:    */   
/*  80:    */   private boolean n()
/*  81:    */   {
/*  82:106 */     if ((this.g[3] == null) || (this.g[3].stackSize <= 0)) {
/*  83:107 */       return false;
/*  84:    */     }
/*  85:109 */     ItemStack localamj = this.g[3];
/*  86:111 */     if (!localamj.getItem().l(localamj)) {
/*  87:112 */       return false;
/*  88:    */     }
/*  89:115 */     boolean bool = false;
/*  90:116 */     for (int m = 0; m < 3; m++) {
/*  91:117 */       if ((this.g[m] != null) && (this.g[m].getItem() == ItemList.potion))
/*  92:    */       {
/*  93:118 */         int n = this.g[m].getDamage2();
/*  94:119 */         int i1 = c(n, localamj);
/*  95:121 */         if ((!ItemPotion.f(n)) && (ItemPotion.f(i1)))
/*  96:    */         {
/*  97:122 */           bool = true;
/*  98:123 */           break;
/*  99:    */         }
/* 100:126 */         List localList1 = ItemList.potion.e(n);
/* 101:127 */         List localList2 = ItemList.potion.e(i1);
/* 102:129 */         if (((n <= 0) || (localList1 != localList2)) && ((localList1 == null) || ((!localList1.equals(localList2)) && (localList2 != null)))) {
/* 103:131 */           if (n != i1)
/* 104:    */           {
/* 105:132 */             bool = true;
/* 106:133 */             break;
/* 107:    */           }
/* 108:    */         }
/* 109:    */       }
/* 110:    */     }
/* 111:137 */     return bool;
/* 112:    */   }
/* 113:    */   
/* 114:    */   private void o()
/* 115:    */   {
/* 116:165 */     if (!n()) {
/* 117:166 */       return;
/* 118:    */     }
/* 119:169 */     ItemStack localamj = this.g[3];
/* 120:172 */     for (int m = 0; m < 3; m++) {
/* 121:173 */       if ((this.g[m] != null) && (this.g[m].getItem() == ItemList.potion))
/* 122:    */       {
/* 123:174 */         int n = this.g[m].getDamage2();
/* 124:175 */         int i1 = c(n, localamj);
/* 125:    */         
/* 126:177 */         List localList1 = ItemList.potion.e(n);
/* 127:178 */         List localList2 = ItemList.potion.e(i1);
/* 128:180 */         if (((n > 0) && (localList1 == localList2)) || ((localList1 != null) && ((localList1.equals(localList2)) || (localList2 == null))))
/* 129:    */         {
/* 130:181 */           if ((!ItemPotion.f(n)) && (ItemPotion.f(i1))) {
/* 131:182 */             this.g[m].b(i1);
/* 132:    */           }
/* 133:    */         }
/* 134:184 */         else if (n != i1) {
/* 135:185 */           this.g[m].b(i1);
/* 136:    */         }
/* 137:    */       }
/* 138:    */     }
/* 139:203 */     if (localamj.getItem().r())
/* 140:    */     {
/* 141:204 */       this.g[3] = new ItemStack(localamj.getItem().q());
/* 142:    */     }
/* 143:    */     else
/* 144:    */     {
/* 145:206 */       this.g[3].stackSize -= 1;
/* 146:207 */       if (this.g[3].stackSize <= 0) {
/* 147:208 */         this.g[3] = null;
/* 148:    */       }
/* 149:    */     }
/* 150:    */   }
/* 151:    */   
/* 152:    */   private int c(int paramInt, ItemStack paramamj)
/* 153:    */   {
/* 154:214 */     if (paramamj == null) {
/* 155:215 */       return paramInt;
/* 156:    */     }
/* 157:225 */     if (paramamj.getItem().l(paramamj)) {
/* 158:226 */       return PotionHelper.parsePotionOperation(paramInt, paramamj.getItem().j(paramamj));
/* 159:    */     }
/* 160:228 */     return paramInt;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void readFromNBT(NBTTagCompound paramfn)
/* 164:    */   {
/* 165:234 */     super.readFromNBT(paramfn);
/* 166:    */     
/* 167:236 */     fv localfv = paramfn.c("Items", 10);
/* 168:237 */     this.g = new ItemStack[n_()];
/* 169:238 */     for (int m = 0; m < localfv.c(); m++)
/* 170:    */     {
/* 171:239 */       NBTTagCompound localfn = localfv.b(m);
/* 172:240 */       int n = localfn.d("Slot");
/* 173:241 */       if ((n >= 0) && (n < this.g.length)) {
/* 174:242 */         this.g[n] = ItemStack.loadItemStackFromNBT(localfn);
/* 175:    */       }
/* 176:    */     }
/* 177:246 */     this.h = paramfn.e("BrewTime");
/* 178:247 */     if (paramfn.hasKey("CustomName", 8)) {
/* 179:248 */       this.k = paramfn.getString("CustomName");
/* 180:    */     }
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void writeToNBT(NBTTagCompound paramfn)
/* 184:    */   {
/* 185:254 */     super.writeToNBT(paramfn);
/* 186:    */     
/* 187:256 */     paramfn.setShort("BrewTime", (short)this.h);
/* 188:257 */     fv localfv = new fv();
/* 189:259 */     for (int m = 0; m < this.g.length; m++) {
/* 190:260 */       if (this.g[m] != null)
/* 191:    */       {
/* 192:261 */         NBTTagCompound localfn = new NBTTagCompound();
/* 193:262 */         localfn.setByte("Slot", (byte)m);
/* 194:263 */         this.g[m].writeToNBT(localfn);
/* 195:264 */         localfv.a(localfn);
/* 196:    */       }
/* 197:    */     }
/* 198:267 */     paramfn.setNBT("Items", localfv);
/* 199:268 */     if (k_()) {
/* 200:269 */       paramfn.setString("CustomName", this.k);
/* 201:    */     }
/* 202:    */   }
/* 203:    */   
/* 204:    */   public ItemStack a(int paramInt)
/* 205:    */   {
/* 206:276 */     if ((paramInt >= 0) && (paramInt < this.g.length)) {
/* 207:277 */       return this.g[paramInt];
/* 208:    */     }
/* 209:279 */     return null;
/* 210:    */   }
/* 211:    */   
/* 212:    */   public ItemStack a(int paramInt1, int paramInt2)
/* 213:    */   {
/* 214:285 */     if ((paramInt1 >= 0) && (paramInt1 < this.g.length))
/* 215:    */     {
/* 216:286 */       ItemStack localamj = this.g[paramInt1];
/* 217:287 */       this.g[paramInt1] = null;
/* 218:288 */       return localamj;
/* 219:    */     }
/* 220:290 */     return null;
/* 221:    */   }
/* 222:    */   
/* 223:    */   public ItemStack b(int paramInt)
/* 224:    */   {
/* 225:296 */     if ((paramInt >= 0) && (paramInt < this.g.length))
/* 226:    */     {
/* 227:297 */       ItemStack localamj = this.g[paramInt];
/* 228:298 */       this.g[paramInt] = null;
/* 229:299 */       return localamj;
/* 230:    */     }
/* 231:301 */     return null;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public void a(int paramInt, ItemStack paramamj)
/* 235:    */   {
/* 236:306 */     if ((paramInt >= 0) && (paramInt < this.g.length)) {
/* 237:307 */       this.g[paramInt] = paramamj;
/* 238:    */     }
/* 239:    */   }
/* 240:    */   
/* 241:    */   public int p_()
/* 242:    */   {
/* 243:314 */     return 64;
/* 244:    */   }
/* 245:    */   
/* 246:    */   public boolean a(EntityPlayer paramahd)
/* 247:    */   {
/* 248:319 */     if (this.world.s(this.pos) != this) {
/* 249:320 */       return false;
/* 250:    */     }
/* 251:322 */     if (paramahd.e(this.pos.getX() + 0.5D, this.pos.getY() + 0.5D, this.pos.getZ() + 0.5D) > 64.0D) {
/* 252:323 */       return false;
/* 253:    */     }
/* 254:325 */     return true;
/* 255:    */   }
/* 256:    */   
/* 257:    */   public void b(EntityPlayer paramahd) {}
/* 258:    */   
/* 259:    */   public void c(EntityPlayer paramahd) {}
/* 260:    */   
/* 261:    */   public boolean b(int paramInt, ItemStack paramamj)
/* 262:    */   {
/* 263:338 */     if (paramInt == 3) {
/* 264:340 */       return paramamj.getItem().l(paramamj);
/* 265:    */     }
/* 266:346 */     return (paramamj.getItem() == ItemList.potion) || (paramamj.getItem() == ItemList.bA);
/* 267:    */   }
/* 268:    */   
/* 269:    */   public boolean[] m()
/* 270:    */   {
/* 271:350 */     boolean[] arrayOfBoolean = new boolean[3];
/* 272:351 */     for (int m = 0; m < 3; m++) {
/* 273:352 */       if (this.g[m] != null) {
/* 274:353 */         arrayOfBoolean[m] = true;
/* 275:    */       }
/* 276:    */     }
/* 277:356 */     return arrayOfBoolean;
/* 278:    */   }
/* 279:    */   
/* 280:    */   public int[] a(EnumDirection paramej)
/* 281:    */   {
/* 282:361 */     if (paramej == EnumDirection.UP) {
/* 283:362 */       return a;
/* 284:    */     }
/* 285:365 */     return f;
/* 286:    */   }
/* 287:    */   
/* 288:    */   public boolean a(int paramInt, ItemStack paramamj, EnumDirection paramej)
/* 289:    */   {
/* 290:370 */     return b(paramInt, paramamj);
/* 291:    */   }
/* 292:    */   
/* 293:    */   public boolean b(int paramInt, ItemStack paramamj, EnumDirection paramej)
/* 294:    */   {
/* 295:375 */     return true;
/* 296:    */   }
/* 297:    */   
/* 298:    */   public String k()
/* 299:    */   {
/* 300:380 */     return "minecraft:brewing_stand";
/* 301:    */   }
/* 302:    */   
/* 303:    */   public aib a(ahb paramahb, EntityPlayer paramahd)
/* 304:    */   {
/* 305:385 */     return new aii(paramahb, this);
/* 306:    */   }
/* 307:    */   
/* 308:    */   public int a_(int paramInt)
/* 309:    */   {
/* 310:390 */     switch (paramInt)
/* 311:    */     {
/* 312:    */     case 0: 
/* 313:392 */       return this.h;
/* 314:    */     }
/* 315:394 */     return 0;
/* 316:    */   }
/* 317:    */   
/* 318:    */   public void b(int paramInt1, int paramInt2)
/* 319:    */   {
/* 320:399 */     switch (paramInt1)
/* 321:    */     {
/* 322:    */     case 0: 
/* 323:401 */       this.h = paramInt2;
/* 324:    */     }
/* 325:    */   }
/* 326:    */   
/* 327:    */   public int g()
/* 328:    */   {
/* 329:408 */     return 1;
/* 330:    */   }
/* 331:    */   
/* 332:    */   public void l()
/* 333:    */   {
/* 334:413 */     for (int m = 0; m < this.g.length; m++) {
/* 335:414 */       this.g[m] = null;
/* 336:    */     }
/* 337:    */   }
/* 338:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcq
 * JD-Core Version:    0.7.0.1
 */