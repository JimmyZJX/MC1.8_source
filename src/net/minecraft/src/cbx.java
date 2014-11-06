package net.minecraft.src;
/*   1:    */ public class cbx
/*   2:    */   extends ccq
/*   3:    */ {
/*   4:    */   private cdy a;
/*   5:    */   private cdy b;
/*   6:    */   private cdy c;
/*   7:    */   private cdy d;
/*   8:    */   private cdy e;
/*   9:    */   private cdy f;
/*  10:    */   
/*  11:    */   public cbx()
/*  12:    */   {
/*  13: 17 */     this.t = 64;
/*  14: 18 */     this.u = 64;
/*  15:    */     
/*  16: 20 */     this.a = new cdy(this, 0, 0);
/*  17: 21 */     this.a.a(-3.0F, -3.0F, -3.0F, 6, 6, 6);
/*  18:    */     
/*  19: 23 */     cdy localcdy1 = new cdy(this, 24, 0);
/*  20: 24 */     localcdy1.a(-4.0F, -6.0F, -2.0F, 3, 4, 1);
/*  21: 25 */     this.a.a(localcdy1);
/*  22: 26 */     cdy localcdy2 = new cdy(this, 24, 0);
/*  23: 27 */     localcdy2.i = true;
/*  24: 28 */     localcdy2.a(1.0F, -6.0F, -2.0F, 3, 4, 1);
/*  25: 29 */     this.a.a(localcdy2);
/*  26:    */     
/*  27: 31 */     this.b = new cdy(this, 0, 16);
/*  28: 32 */     this.b.a(-3.0F, 4.0F, -3.0F, 6, 12, 6);
/*  29: 33 */     this.b.a(0, 34).a(-5.0F, 16.0F, 0.0F, 10, 6, 1);
/*  30:    */     
/*  31: 35 */     this.c = new cdy(this, 42, 0);
/*  32: 36 */     this.c.a(-12.0F, 1.0F, 1.5F, 10, 16, 1);
/*  33: 37 */     this.e = new cdy(this, 24, 16);
/*  34: 38 */     this.e.a(-12.0F, 1.0F, 1.5F);
/*  35: 39 */     this.e.a(-8.0F, 1.0F, 0.0F, 8, 12, 1);
/*  36:    */     
/*  37: 41 */     this.d = new cdy(this, 42, 0);
/*  38: 42 */     this.d.i = true;
/*  39: 43 */     this.d.a(2.0F, 1.0F, 1.5F, 10, 16, 1);
/*  40: 44 */     this.f = new cdy(this, 24, 16);
/*  41: 45 */     this.f.i = true;
/*  42: 46 */     this.f.a(12.0F, 1.0F, 1.5F);
/*  43: 47 */     this.f.a(0.0F, 1.0F, 0.0F, 8, 12, 1);
/*  44:    */     
/*  45: 49 */     this.b.a(this.c);
/*  46: 50 */     this.b.a(this.d);
/*  47: 51 */     this.c.a(this.e);
/*  48: 52 */     this.d.a(this.f);
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*  52:    */   {
/*  53: 61 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/*  54:    */     
/*  55: 63 */     this.a.a(paramFloat6);
/*  56: 64 */     this.b.a(paramFloat6);
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/*  60:    */   {
/*  61:    */     float f1;
/*  62: 69 */     if (((EntityBat)paramwv).n())
/*  63:    */     {
/*  64: 70 */       f1 = 57.295776F;
/*  65: 71 */       this.a.f = (paramFloat5 / 57.295776F);
/*  66: 72 */       this.a.g = (3.141593F - paramFloat4 / 57.295776F);
/*  67: 73 */       this.a.h = 3.141593F;
/*  68:    */       
/*  69: 75 */       this.a.a(0.0F, -2.0F, 0.0F);
/*  70: 76 */       this.c.a(-3.0F, 0.0F, 3.0F);
/*  71: 77 */       this.d.a(3.0F, 0.0F, 3.0F);
/*  72:    */       
/*  73: 79 */       this.b.f = 3.141593F;
/*  74:    */       
/*  75: 81 */       this.c.f = -0.1570796F;
/*  76: 82 */       this.c.g = -1.256637F;
/*  77: 83 */       this.e.g = -1.727876F;
/*  78: 84 */       this.d.f = this.c.f;
/*  79: 85 */       this.d.g = (-this.c.g);
/*  80: 86 */       this.f.g = (-this.e.g);
/*  81:    */     }
/*  82:    */     else
/*  83:    */     {
/*  84: 88 */       f1 = 57.295776F;
/*  85: 89 */       this.a.f = (paramFloat5 / 57.295776F);
/*  86: 90 */       this.a.g = (paramFloat4 / 57.295776F);
/*  87: 91 */       this.a.h = 0.0F;
/*  88:    */       
/*  89: 93 */       this.a.a(0.0F, 0.0F, 0.0F);
/*  90: 94 */       this.c.a(0.0F, 0.0F, 0.0F);
/*  91: 95 */       this.d.a(0.0F, 0.0F, 0.0F);
/*  92:    */       
/*  93: 97 */       this.b.f = (0.7853982F + MathUtils.cos(paramFloat3 * 0.1F) * 0.15F);
/*  94: 98 */       this.b.g = 0.0F;
/*  95:    */       
/*  96:100 */       this.c.g = (MathUtils.cos(paramFloat3 * 1.3F) * 3.141593F * 0.25F);
/*  97:101 */       this.d.g = (-this.c.g);
/*  98:102 */       this.e.g = (this.c.g * 0.5F);
/*  99:103 */       this.f.g = (-this.c.g * 0.5F);
/* 100:    */     }
/* 101:    */   }
/* 102:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cbx
 * JD-Core Version:    0.7.0.1
 */