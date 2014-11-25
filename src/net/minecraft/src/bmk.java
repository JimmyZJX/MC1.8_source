package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ abstract class bmk
/*   5:    */   extends bms
/*   6:    */ {
/*   7:211 */   protected bml d = bml.a;
/*   8:    */   
/*   9:    */   public bmk() {}
/*  10:    */   
/*  11:    */   protected bmk(int paramInt)
/*  12:    */   {
/*  13:218 */     super(paramInt);
/*  14:    */   }
/*  15:    */   
/*  16:    */   protected void a(NBTTagCompound tag)
/*  17:    */   {
/*  18:227 */     tag.setString("EntryDoor", this.d.name());
/*  19:    */   }
/*  20:    */   
/*  21:    */   protected void b(NBTTagCompound tag)
/*  22:    */   {
/*  23:232 */     this.d = bml.valueOf(tag.getString("EntryDoor"));
/*  24:    */   }
/*  25:    */   
/*  26:    */   protected void a(World paramaqu, Random paramRandom, bjb parambjb, bml parambml, int paramInt1, int paramInt2, int paramInt3)
/*  27:    */   {
/*  28:236 */     switch (blu.a[parambml.ordinal()])
/*  29:    */     {
/*  30:    */     case 1: 
/*  31:    */     default: 
/*  32:239 */       a(paramaqu, parambjb, paramInt1, paramInt2, paramInt3, paramInt1 + 3 - 1, paramInt2 + 3 - 1, paramInt3, BlockList.air.instance(), BlockList.air.instance(), false);
/*  33:240 */       break;
/*  34:    */     case 2: 
/*  35:242 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1, paramInt2, paramInt3, parambjb);
/*  36:243 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1, paramInt2 + 1, paramInt3, parambjb);
/*  37:244 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1, paramInt2 + 2, paramInt3, parambjb);
/*  38:245 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1 + 1, paramInt2 + 2, paramInt3, parambjb);
/*  39:246 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1 + 2, paramInt2 + 2, paramInt3, parambjb);
/*  40:247 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1 + 2, paramInt2 + 1, paramInt3, parambjb);
/*  41:248 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1 + 2, paramInt2, paramInt3, parambjb);
/*  42:249 */       a(paramaqu, BlockList.woodenDoor.instance(), paramInt1 + 1, paramInt2, paramInt3, parambjb);
/*  43:250 */       a(paramaqu, BlockList.woodenDoor.instance(8), paramInt1 + 1, paramInt2 + 1, paramInt3, parambjb);
/*  44:251 */       break;
/*  45:    */     case 3: 
/*  46:253 */       a(paramaqu, BlockList.air.instance(), paramInt1 + 1, paramInt2, paramInt3, parambjb);
/*  47:254 */       a(paramaqu, BlockList.air.instance(), paramInt1 + 1, paramInt2 + 1, paramInt3, parambjb);
/*  48:255 */       a(paramaqu, BlockList.ironBars.instance(), paramInt1, paramInt2, paramInt3, parambjb);
/*  49:256 */       a(paramaqu, BlockList.ironBars.instance(), paramInt1, paramInt2 + 1, paramInt3, parambjb);
/*  50:257 */       a(paramaqu, BlockList.ironBars.instance(), paramInt1, paramInt2 + 2, paramInt3, parambjb);
/*  51:258 */       a(paramaqu, BlockList.ironBars.instance(), paramInt1 + 1, paramInt2 + 2, paramInt3, parambjb);
/*  52:259 */       a(paramaqu, BlockList.ironBars.instance(), paramInt1 + 2, paramInt2 + 2, paramInt3, parambjb);
/*  53:260 */       a(paramaqu, BlockList.ironBars.instance(), paramInt1 + 2, paramInt2 + 1, paramInt3, parambjb);
/*  54:261 */       a(paramaqu, BlockList.ironBars.instance(), paramInt1 + 2, paramInt2, paramInt3, parambjb);
/*  55:262 */       break;
/*  56:    */     case 4: 
/*  57:264 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1, paramInt2, paramInt3, parambjb);
/*  58:265 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1, paramInt2 + 1, paramInt3, parambjb);
/*  59:266 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1, paramInt2 + 2, paramInt3, parambjb);
/*  60:267 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1 + 1, paramInt2 + 2, paramInt3, parambjb);
/*  61:268 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1 + 2, paramInt2 + 2, paramInt3, parambjb);
/*  62:269 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1 + 2, paramInt2 + 1, paramInt3, parambjb);
/*  63:270 */       a(paramaqu, BlockList.stoneBrick.instance(), paramInt1 + 2, paramInt2, paramInt3, parambjb);
/*  64:271 */       a(paramaqu, BlockList.ironDoor.instance(), paramInt1 + 1, paramInt2, paramInt3, parambjb);
/*  65:272 */       a(paramaqu, BlockList.ironDoor.instance(8), paramInt1 + 1, paramInt2 + 1, paramInt3, parambjb);
/*  66:273 */       a(paramaqu, BlockList.stoneButton.instance(a(BlockList.stoneButton, 4)), paramInt1 + 2, paramInt2 + 1, paramInt3 + 1, parambjb);
/*  67:274 */       a(paramaqu, BlockList.stoneButton.instance(a(BlockList.stoneButton, 3)), paramInt1 + 2, paramInt2 + 1, paramInt3 - 1, parambjb);
/*  68:    */     }
/*  69:    */   }
/*  70:    */   
/*  71:    */   protected bml a(Random paramRandom)
/*  72:    */   {
/*  73:280 */     int i = paramRandom.nextInt(5);
/*  74:281 */     switch (i)
/*  75:    */     {
/*  76:    */     case 0: 
/*  77:    */     case 1: 
/*  78:    */     default: 
/*  79:285 */       return bml.a;
/*  80:    */     case 2: 
/*  81:287 */       return bml.b;
/*  82:    */     case 3: 
/*  83:289 */       return bml.c;
/*  84:    */     }
/*  85:291 */     // return bml.d;
/*  86:    */   }
/*  87:    */   
/*  88:    */   protected bms a(bmh parambmh, List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2)
/*  89:    */   {
/*  90:296 */     if (this.m != null) {
/*  91:297 */       switch (blu.b[this.m.ordinal()])
/*  92:    */       {
/*  93:    */       case 1: 
/*  94:299 */         return blr.a(parambmh, paramList, paramRandom, this.l.a + paramInt1, this.l.b + paramInt2, this.l.c - 1, this.m, d());
/*  95:    */       case 2: 
/*  96:301 */         return blr.a(parambmh, paramList, paramRandom, this.l.a + paramInt1, this.l.b + paramInt2, this.l.f + 1, this.m, d());
/*  97:    */       case 3: 
/*  98:303 */         return blr.a(parambmh, paramList, paramRandom, this.l.a - 1, this.l.b + paramInt2, this.l.c + paramInt1, this.m, d());
/*  99:    */       case 4: 
/* 100:305 */         return blr.a(parambmh, paramList, paramRandom, this.l.d + 1, this.l.b + paramInt2, this.l.c + paramInt1, this.m, d());
/* 101:    */       }
/* 102:    */     }
/* 103:308 */     return null;
/* 104:    */   }
/* 105:    */   
/* 106:    */   protected bms b(bmh parambmh, List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2)
/* 107:    */   {
/* 108:312 */     if (this.m != null) {
/* 109:313 */       switch (blu.b[this.m.ordinal()])
/* 110:    */       {
/* 111:    */       case 1: 
/* 112:315 */         return blr.a(parambmh, paramList, paramRandom, this.l.a - 1, this.l.b + paramInt1, this.l.c + paramInt2, EnumDirection.WEST, d());
/* 113:    */       case 2: 
/* 114:317 */         return blr.a(parambmh, paramList, paramRandom, this.l.a - 1, this.l.b + paramInt1, this.l.c + paramInt2, EnumDirection.WEST, d());
/* 115:    */       case 3: 
/* 116:319 */         return blr.a(parambmh, paramList, paramRandom, this.l.a + paramInt2, this.l.b + paramInt1, this.l.c - 1, EnumDirection.NORTH, d());
/* 117:    */       case 4: 
/* 118:321 */         return blr.a(parambmh, paramList, paramRandom, this.l.a + paramInt2, this.l.b + paramInt1, this.l.c - 1, EnumDirection.NORTH, d());
/* 119:    */       }
/* 120:    */     }
/* 121:324 */     return null;
/* 122:    */   }
/* 123:    */   
/* 124:    */   protected bms c(bmh parambmh, List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2)
/* 125:    */   {
/* 126:328 */     if (this.m != null) {
/* 127:329 */       switch (blu.b[this.m.ordinal()])
/* 128:    */       {
/* 129:    */       case 1: 
/* 130:331 */         return blr.a(parambmh, paramList, paramRandom, this.l.d + 1, this.l.b + paramInt1, this.l.c + paramInt2, EnumDirection.EAST, d());
/* 131:    */       case 2: 
/* 132:333 */         return blr.a(parambmh, paramList, paramRandom, this.l.d + 1, this.l.b + paramInt1, this.l.c + paramInt2, EnumDirection.EAST, d());
/* 133:    */       case 3: 
/* 134:335 */         return blr.a(parambmh, paramList, paramRandom, this.l.a + paramInt2, this.l.b + paramInt1, this.l.f + 1, EnumDirection.SOUTH, d());
/* 135:    */       case 4: 
/* 136:337 */         return blr.a(parambmh, paramList, paramRandom, this.l.a + paramInt2, this.l.b + paramInt1, this.l.f + 1, EnumDirection.SOUTH, d());
/* 137:    */       }
/* 138:    */     }
/* 139:340 */     return null;
/* 140:    */   }
/* 141:    */   
/* 142:    */   protected static boolean a(bjb parambjb)
/* 143:    */   {
/* 144:344 */     return (parambjb != null) && (parambjb.b > 10);
/* 145:    */   }
/* 146:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmk
 * JD-Core Version:    0.7.0.1
 */