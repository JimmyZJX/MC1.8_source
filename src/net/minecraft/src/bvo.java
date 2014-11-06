package net.minecraft.src;
/*   1:    */ public class bvo
/*   2:    */   extends bub
/*   3:    */   implements cax
/*   4:    */ {
/*   5: 19 */   private static final oa f = new oa("textures/gui/widgets.png");
/*   6: 20 */   public static final oa a = new oa("textures/gui/spectator_widgets.png");
/*   7:    */   private final bsu g;
/*   8:    */   private long h;
/*   9:    */   private car i;
/*  10:    */   
/*  11:    */   public bvo(bsu parambsu)
/*  12:    */   {
/*  13: 29 */     this.g = parambsu;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void a(int paramInt)
/*  17:    */   {
/*  18: 33 */     this.h = bsu.I();
/*  19: 35 */     if (this.i != null) {
/*  20: 36 */       this.i.b(paramInt);
/*  21:    */     } else {
/*  22: 38 */       this.i = new car(this);
/*  23:    */     }
/*  24:    */   }
/*  25:    */   
/*  26:    */   private float c()
/*  27:    */   {
/*  28: 43 */     long l = this.h - bsu.I() + 5000L;
/*  29: 44 */     return MathUtils.clamp((float)l / 2000.0F, 0.0F, 1.0F);
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void a(buf parambuf, float paramFloat)
/*  33:    */   {
/*  34: 48 */     if (this.i == null) {
/*  35: 49 */       return;
/*  36:    */     }
/*  37: 52 */     float f1 = c();
/*  38: 53 */     if (f1 <= 0.0F)
/*  39:    */     {
/*  40: 54 */       this.i.d();
/*  41: 55 */       return;
/*  42:    */     }
/*  43: 58 */     int j = parambuf.a() / 2;
/*  44: 59 */     float f2 = this.e;
/*  45: 60 */     this.e = -90.0F;
/*  46: 61 */     float f3 = parambuf.b() - 22.0F * f1;
/*  47:    */     
/*  48: 63 */     cay localcay = this.i.f();
/*  49:    */     
/*  50: 65 */     a(parambuf, f1, j, f3, localcay);
/*  51:    */     
/*  52: 67 */     this.e = f2;
/*  53:    */   }
/*  54:    */   
/*  55:    */   protected void a(buf parambuf, float paramFloat1, int paramInt, float paramFloat2, cay paramcay)
/*  56:    */   {
/*  57: 71 */     cjm.B();
/*  58: 72 */     cjm.enableBlend();
/*  59: 73 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/*  60: 74 */     cjm.c(1.0F, 1.0F, 1.0F, paramFloat1);
/*  61: 75 */     this.g.N().a(f);
/*  62: 76 */     a(paramInt - 91, paramFloat2, 0, 0, 182, 22);
/*  63: 78 */     if (paramcay.b() >= 0) {
/*  64: 79 */       a(paramInt - 91 - 1 + paramcay.b() * 20, paramFloat2 - 1.0F, 0, 22, 24, 22);
/*  65:    */     }
/*  66: 82 */     bss.c();
/*  67: 84 */     for (int j = 0; j < 9; j++) {
/*  68: 85 */       a(j, parambuf.a() / 2 - 90 + j * 20 + 2, paramFloat2 + 3.0F, paramFloat1, paramcay.a(j));
/*  69:    */     }
/*  70: 88 */     bss.a();
/*  71: 89 */     cjm.C();
/*  72: 90 */     cjm.disableBlend();
/*  73:    */   }
/*  74:    */   
/*  75:    */   private void a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, caw paramcaw)
/*  76:    */   {
/*  77: 94 */     this.g.N().a(a);
/*  78: 96 */     if (paramcaw != car.a)
/*  79:    */     {
/*  80: 97 */       int j = (int)(paramFloat2 * 255.0F);
/*  81:    */       
/*  82: 99 */       cjm.glPushMatrix();
/*  83:100 */       cjm.glTranslatef(paramInt2, paramFloat1, 0.0F);
/*  84:101 */       float f1 = paramcaw.A_() ? 1.0F : 0.25F;
/*  85:102 */       cjm.c(f1, f1, f1, paramFloat2);
/*  86:103 */       paramcaw.a(f1, j);
/*  87:104 */       cjm.glPopMatrix();
/*  88:    */       
/*  89:106 */       String str = String.valueOf(bto.c(this.g.t.as[paramInt1].i()));
/*  90:107 */       if ((j > 3) && (paramcaw.A_())) {
/*  91:108 */         this.g.k.a(str, paramInt2 + 19 - 2 - this.g.k.a(str), paramFloat1 + 6.0F + 3.0F, 16777215 + (j << 24));
/*  92:    */       }
/*  93:    */     }
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void a(buf parambuf)
/*  97:    */   {
/*  98:114 */     int j = (int)(c() * 255.0F);
/*  99:116 */     if ((j > 3) && (this.i != null))
/* 100:    */     {
/* 101:117 */       caw localcaw = this.i.b();
/* 102:118 */       String str = localcaw != car.a ? localcaw.z_().d() : this.i.c().b().d();
/* 103:120 */       if (str != null)
/* 104:    */       {
/* 105:121 */         int k = (parambuf.a() - this.g.k.a(str)) / 2;
/* 106:122 */         int m = parambuf.b() - 35;
/* 107:    */         
/* 108:124 */         cjm.glPushMatrix();
/* 109:125 */         cjm.enableBlend();
/* 110:126 */         cjm.glBlendFuncSeparate(770, 771, 1, 0);
/* 111:127 */         this.g.k.a(str, k, m, 16777215 + (j << 24));
/* 112:128 */         cjm.disableBlend();
/* 113:129 */         cjm.glPopMatrix();
/* 114:    */       }
/* 115:    */     }
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void a(car paramcar)
/* 119:    */   {
/* 120:136 */     this.i = null;
/* 121:137 */     this.h = 0L;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public boolean a()
/* 125:    */   {
/* 126:141 */     return this.i != null;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void b(int paramInt)
/* 130:    */   {
/* 131:145 */     int j = this.i.e() + paramInt;
/* 132:146 */     while ((j >= 0) && (j <= 8) && ((this.i.a(j) == car.a) || (!this.i.a(j).A_()))) {
/* 133:147 */       j += paramInt;
/* 134:    */     }
/* 135:150 */     if ((j >= 0) && (j <= 8))
/* 136:    */     {
/* 137:151 */       this.i.b(j);
/* 138:152 */       this.h = bsu.I();
/* 139:    */     }
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void b()
/* 143:    */   {
/* 144:157 */     this.h = bsu.I();
/* 145:159 */     if (a())
/* 146:    */     {
/* 147:160 */       int j = this.i.e();
/* 148:161 */       if (j != -1) {
/* 149:162 */         this.i.b(j);
/* 150:    */       }
/* 151:    */     }
/* 152:    */     else
/* 153:    */     {
/* 154:165 */       this.i = new car(this);
/* 155:    */     }
/* 156:    */   }
/* 157:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvo
 * JD-Core Version:    0.7.0.1
 */