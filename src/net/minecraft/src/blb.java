package net.minecraft.src;
/*   1:    */ public abstract class blb
/*   2:    */   extends bms
/*   3:    */ {
/*   4: 37 */   protected static final Block a = BlockList.cI.a(azi.b);
/*   5: 38 */   protected static final Block b = BlockList.cI.a(azi.M);
/*   6: 39 */   protected static final Block c = BlockList.cI.a(azi.N);
/*   7: 41 */   protected static final Block d = b;
/*   8: 43 */   protected static final Block e = BlockList.cJ.instance();
/*   9: 46 */   protected static final Block f = BlockList.water.instance();
/*  10: 57 */   protected static final int g = a(2, 0, 0);
/*  11: 58 */   protected static final int h = a(2, 2, 0);
/*  12: 59 */   protected static final int i = a(0, 1, 0);
/*  13: 60 */   protected static final int j = a(4, 1, 0);
/*  14:    */   protected blf k;
/*  15:    */   
/*  16:    */   protected static final int a(int paramInt1, int paramInt2, int paramInt3)
/*  17:    */   {
/*  18: 69 */     return paramInt2 * 25 + paramInt3 * 5 + paramInt1;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public blb()
/*  22:    */   {
/*  23: 87 */     super(0);
/*  24:    */   }
/*  25:    */   
/*  26:    */   public blb(int paramInt)
/*  27:    */   {
/*  28: 91 */     super(paramInt);
/*  29:    */   }
/*  30:    */   
/*  31:    */   public blb(EnumDirection paramej, bjb parambjb)
/*  32:    */   {
/*  33: 95 */     super(1);
/*  34: 96 */     this.m = paramej;
/*  35: 97 */     this.l = parambjb;
/*  36:    */   }
/*  37:    */   
/*  38:    */   protected blb(int paramInt1, EnumDirection paramej, blf paramblf, int paramInt2, int paramInt3, int paramInt4)
/*  39:    */   {
/*  40:101 */     super(paramInt1);
/*  41:102 */     this.m = paramej;
/*  42:103 */     this.k = paramblf;
/*  43:    */     
/*  44:105 */     int m = paramblf.a;
/*  45:106 */     int n = m % 5;
/*  46:107 */     int i1 = m / 5 % 5;
/*  47:108 */     int i2 = m / 25;
/*  48:113 */     if ((paramej == EnumDirection.NORTH) || (paramej == EnumDirection.SOUTH)) {
/*  49:114 */       this.l = new bjb(0, 0, 0, paramInt2 * 8 - 1, paramInt3 * 4 - 1, paramInt4 * 8 - 1);
/*  50:    */     } else {
/*  51:117 */       this.l = new bjb(0, 0, 0, paramInt4 * 8 - 1, paramInt3 * 4 - 1, paramInt2 * 8 - 1);
/*  52:    */     }
/*  53:120 */     switch (bkj.a[paramej.ordinal()])
/*  54:    */     {
/*  55:    */     case 1: 
/*  56:122 */       this.l.a(n * 8, i2 * 4, -(i1 + paramInt4) * 8 + 1);
/*  57:123 */       break;
/*  58:    */     case 2: 
/*  59:126 */       this.l.a(n * 8, i2 * 4, i1 * 8);
/*  60:127 */       break;
/*  61:    */     case 3: 
/*  62:129 */       this.l.a(-(i1 + paramInt4) * 8 + 1, i2 * 4, n * 8);
/*  63:130 */       break;
/*  64:    */     default: 
/*  65:132 */       this.l.a(i1 * 8, i2 * 4, n * 8);
/*  66:    */     }
/*  67:    */   }
/*  68:    */   
/*  69:    */   protected void a(NBTTagCompound paramfn) {}
/*  70:    */   
/*  71:    */   protected void b(NBTTagCompound paramfn) {}
/*  72:    */   
/*  73:    */   protected void a(World paramaqu, bjb parambjb, int paramInt1, int paramInt2, boolean paramBoolean)
/*  74:    */   {
/*  75:146 */     if (paramBoolean)
/*  76:    */     {
/*  77:147 */       a(paramaqu, parambjb, paramInt1 + 0, 0, paramInt2 + 0, paramInt1 + 2, 0, paramInt2 + 8 - 1, a, a, false);
/*  78:148 */       a(paramaqu, parambjb, paramInt1 + 5, 0, paramInt2 + 0, paramInt1 + 8 - 1, 0, paramInt2 + 8 - 1, a, a, false);
/*  79:149 */       a(paramaqu, parambjb, paramInt1 + 3, 0, paramInt2 + 0, paramInt1 + 4, 0, paramInt2 + 2, a, a, false);
/*  80:150 */       a(paramaqu, parambjb, paramInt1 + 3, 0, paramInt2 + 5, paramInt1 + 4, 0, paramInt2 + 8 - 1, a, a, false);
/*  81:    */       
/*  82:152 */       a(paramaqu, parambjb, paramInt1 + 3, 0, paramInt2 + 2, paramInt1 + 4, 0, paramInt2 + 2, b, b, false);
/*  83:153 */       a(paramaqu, parambjb, paramInt1 + 3, 0, paramInt2 + 5, paramInt1 + 4, 0, paramInt2 + 5, b, b, false);
/*  84:154 */       a(paramaqu, parambjb, paramInt1 + 2, 0, paramInt2 + 3, paramInt1 + 2, 0, paramInt2 + 4, b, b, false);
/*  85:155 */       a(paramaqu, parambjb, paramInt1 + 5, 0, paramInt2 + 3, paramInt1 + 5, 0, paramInt2 + 4, b, b, false);
/*  86:    */     }
/*  87:    */     else
/*  88:    */     {
/*  89:157 */       a(paramaqu, parambjb, paramInt1 + 0, 0, paramInt2 + 0, paramInt1 + 8 - 1, 0, paramInt2 + 8 - 1, a, a, false);
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:    */   protected void a(World paramaqu, bjb parambjb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Block parambec)
/*  94:    */   {
/*  95:162 */     for (int m = paramInt2; m <= paramInt5; m++) {
/*  96:163 */       for (int n = paramInt1; n <= paramInt4; n++) {
/*  97:164 */         for (int i1 = paramInt3; i1 <= paramInt6; i1++) {
/*  98:165 */           if (a(paramaqu, n, m, i1, parambjb) == f) {
/*  99:168 */             a(paramaqu, parambec, n, m, i1, parambjb);
/* 100:    */           }
/* 101:    */         }
/* 102:    */       }
/* 103:    */     }
/* 104:    */   }
/* 105:    */   
/* 106:    */   protected boolean a(bjb parambjb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 107:    */   {
/* 108:175 */     int m = a(paramInt1, paramInt2);
/* 109:176 */     int n = b(paramInt1, paramInt2);
/* 110:177 */     int i1 = a(paramInt3, paramInt4);
/* 111:178 */     int i2 = b(paramInt3, paramInt4);
/* 112:179 */     return parambjb.a(Math.min(m, i1), Math.min(n, i2), Math.max(m, i1), Math.max(n, i2));
/* 113:    */   }
/* 114:    */   
/* 115:    */   protected boolean a(World paramaqu, bjb parambjb, int paramInt1, int paramInt2, int paramInt3)
/* 116:    */   {
/* 117:183 */     int m = a(paramInt1, paramInt3);
/* 118:184 */     int n = d(paramInt2);
/* 119:185 */     int i1 = b(paramInt1, paramInt3);
/* 120:187 */     if (parambjb.b(new BlockPosition(m, n, i1)))
/* 121:    */     {
/* 122:188 */       EntityGuardian localafg = new EntityGuardian(paramaqu);
/* 123:189 */       localafg.a(true);
/* 124:190 */       localafg.g(localafg.bt());
/* 125:191 */       localafg.setPositionAndAngles(m + 0.5D, n, i1 + 0.5D, 0.0F, 0.0F);
/* 126:192 */       localafg.beforeSpawn(paramaqu.E(new BlockPosition(localafg)), null);
/* 127:193 */       paramaqu.spawnEntity(localafg);
/* 128:194 */       return true;
/* 129:    */     }
/* 130:196 */     return false;
/* 131:    */   }
/* 132:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     blb
 * JD-Core Version:    0.7.0.1
 */