package net.minecraft.src;
/*   1:    */ public class cci
/*   2:    */   extends ccq
/*   3:    */ {
/*   4:    */   private cdy a;
/*   5:    */   private cdy b;
/*   6:    */   private cdy[] c;
/*   7:    */   private cdy[] d;
/*   8:    */   
/*   9:    */   public cci()
/*  10:    */   {
/*  11: 17 */     this.t = 64;
/*  12: 18 */     this.u = 64;
/*  13:    */     
/*  14: 20 */     this.c = new cdy[12];
/*  15:    */     
/*  16: 22 */     this.a = new cdy(this);
/*  17: 23 */     this.a.a(0, 0).a(-6.0F, 10.0F, -8.0F, 12, 12, 16);
/*  18: 24 */     this.a.a(0, 28).a(-8.0F, 10.0F, -6.0F, 2, 12, 12);
/*  19: 25 */     this.a.a(0, 28).a(6.0F, 10.0F, -6.0F, 2, 12, 12, true);
/*  20: 26 */     this.a.a(16, 40).a(-6.0F, 8.0F, -6.0F, 12, 2, 12);
/*  21: 27 */     this.a.a(16, 40).a(-6.0F, 22.0F, -6.0F, 12, 2, 12);
/*  22: 29 */     for (int i = 0; i < this.c.length; i++)
/*  23:    */     {
/*  24: 30 */       this.c[i] = new cdy(this, 0, 0);
/*  25: 31 */       this.c[i].a(-1.0F, -4.5F, -1.0F, 2, 9, 2);
/*  26: 32 */       this.a.a(this.c[i]);
/*  27:    */     }
/*  28: 35 */     this.b = new cdy(this, 8, 0);
/*  29: 36 */     this.b.a(-1.0F, 15.0F, 0.0F, 2, 2, 1);
/*  30: 37 */     this.a.a(this.b);
/*  31:    */     
/*  32: 39 */     this.d = new cdy[3];
/*  33: 40 */     this.d[0] = new cdy(this, 40, 0);
/*  34: 41 */     this.d[0].a(-2.0F, 14.0F, 7.0F, 4, 4, 8);
/*  35: 42 */     this.d[1] = new cdy(this, 0, 54);
/*  36: 43 */     this.d[1].a(0.0F, 14.0F, 0.0F, 3, 3, 7);
/*  37: 44 */     this.d[2] = new cdy(this);
/*  38: 45 */     this.d[2].a(41, 32).a(0.0F, 14.0F, 0.0F, 2, 2, 6);
/*  39: 46 */     this.d[2].a(25, 19).a(1.0F, 10.5F, 3.0F, 1, 9, 9);
/*  40:    */     
/*  41: 48 */     this.a.a(this.d[0]);
/*  42: 49 */     this.d[0].a(this.d[1]);
/*  43: 50 */     this.d[1].a(this.d[2]);
/*  44:    */   }
/*  45:    */   
/*  46:    */   public int a()
/*  47:    */   {
/*  48: 54 */     return 54;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*  52:    */   {
/*  53: 59 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/*  54:    */     
/*  55: 61 */     this.a.a(paramFloat6);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/*  59:    */   {
/*  60: 66 */     EntityGuardian localafg = (EntityGuardian)paramwv;
/*  61: 67 */     float f1 = paramFloat3 - localafg.W;
/*  62:    */     
/*  63: 69 */     this.a.g = (paramFloat4 / 57.295776F);
/*  64: 70 */     this.a.f = (paramFloat5 / 57.295776F);
/*  65:    */     
/*  66: 72 */     float[] arrayOfFloat1 = { 1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F };
/*  67:    */     
/*  68:    */ 
/*  69:    */ 
/*  70: 76 */     float[] arrayOfFloat2 = { 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F };
/*  71:    */     
/*  72:    */ 
/*  73:    */ 
/*  74: 80 */     float[] arrayOfFloat3 = { 0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F };
/*  75:    */     
/*  76:    */ 
/*  77:    */ 
/*  78: 84 */     float[] arrayOfFloat4 = { 0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F };
/*  79:    */     
/*  80:    */ 
/*  81:    */ 
/*  82: 88 */     float[] arrayOfFloat5 = { -8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F };
/*  83:    */     
/*  84:    */ 
/*  85:    */ 
/*  86: 92 */     float[] arrayOfFloat6 = { 8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F };
/*  87:    */     
/*  88:    */ 
/*  89:    */ 
/*  90: 96 */     float f2 = (1.0F - localafg.o(f1)) * 0.55F;
/*  91: 98 */     for (int i = 0; i < 12; i++)
/*  92:    */     {
/*  93: 99 */       this.c[i].f = (3.141593F * arrayOfFloat1[i]);
/*  94:100 */       this.c[i].g = (3.141593F * arrayOfFloat2[i]);
/*  95:101 */       this.c[i].h = (3.141593F * arrayOfFloat3[i]);
/*  96:102 */       this.c[i].c = (arrayOfFloat4[i] * (1.0F + MathUtils.cos(paramFloat3 * 1.5F + i) * 0.01F - f2));
/*  97:103 */       this.c[i].d = (16.0F + arrayOfFloat5[i] * (1.0F + MathUtils.cos(paramFloat3 * 1.5F + i) * 0.01F - f2));
/*  98:104 */       this.c[i].e = (arrayOfFloat6[i] * (1.0F + MathUtils.cos(paramFloat3 * 1.5F + i) * 0.01F - f2));
/*  99:    */     }
/* 100:107 */     this.b.e = -8.25F;
/* 101:    */     
/* 102:109 */     Object localObject = bsu.z().aa();
/* 103:110 */     if (localafg.cn()) {
/* 104:111 */       localObject = localafg.co();
/* 105:    */     }
/* 106:113 */     if (localObject != null)
/* 107:    */     {
/* 108:114 */       Vec3 localbrw1 = ((Entity)localObject).e(0.0F);
/* 109:115 */       Vec3 localbrw2 = paramwv.e(0.0F);
/* 110:116 */       double d1 = localbrw1.y - localbrw2.y;
/* 111:117 */       if (d1 > 0.0D) {
/* 112:118 */         this.b.d = 0.0F;
/* 113:    */       } else {
/* 114:120 */         this.b.d = 1.0F;
/* 115:    */       }
/* 116:123 */       Vec3 localbrw3 = paramwv.d(0.0F);
/* 117:124 */       localbrw3 = new Vec3(localbrw3.x, 0.0D, localbrw3.z);
/* 118:125 */       Vec3 localbrw4 = new Vec3(localbrw2.x - localbrw1.x, 0.0D, localbrw2.z - localbrw1.z).normalize().b(1.570796F);
/* 119:126 */       double d2 = localbrw3.dot(localbrw4);
/* 120:127 */       this.b.c = (MathUtils.sqrt((float)Math.abs(d2)) * 2.0F * (float)Math.signum(d2));
/* 121:    */     }
/* 122:129 */     this.b.j = true;
/* 123:    */     
/* 124:131 */     float f3 = localafg.a(f1);
/* 125:132 */     this.d[0].g = (MathUtils.sin(f3) * 3.141593F * 0.05F);
/* 126:133 */     this.d[1].g = (MathUtils.sin(f3) * 3.141593F * 0.1F);
/* 127:134 */     this.d[1].c = -1.5F;
/* 128:135 */     this.d[1].d = 0.5F;
/* 129:136 */     this.d[1].e = 14.0F;
/* 130:137 */     this.d[2].g = (MathUtils.sin(f3) * 3.141593F * 0.15F);
/* 131:138 */     this.d[2].c = 0.5F;
/* 132:139 */     this.d[2].d = 0.5F;
/* 133:140 */     this.d[2].e = 6.0F;
/* 134:    */   }
/* 135:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cci
 * JD-Core Version:    0.7.0.1
 */