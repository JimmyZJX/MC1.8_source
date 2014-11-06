package net.minecraft.src;
/*   1:    */ public class bum
/*   2:    */   extends bug
/*   3:    */ {
/*   4:  8 */   private float p = 1.0F;
/*   5:    */   public boolean o;
/*   6:    */   private String q;
/*   7:    */   private final float r;
/*   8:    */   private final float s;
/*   9:    */   private final bvb t;
/*  10:    */   private bun u;
/*  11:    */   
/*  12:    */   public bum(bvb parambvb, int paramInt1, int paramInt2, int paramInt3, String paramString, float paramFloat1, float paramFloat2, float paramFloat3, bun parambun)
/*  13:    */   {
/*  14: 17 */     super(paramInt1, paramInt2, paramInt3, 150, 20, "");
/*  15: 18 */     this.q = paramString;
/*  16: 19 */     this.r = paramFloat1;
/*  17: 20 */     this.s = paramFloat2;
/*  18: 21 */     this.p = ((paramFloat3 - paramFloat1) / (paramFloat2 - paramFloat1));
/*  19: 22 */     this.u = parambun;
/*  20: 23 */     this.t = parambvb;
/*  21: 24 */     this.j = e();
/*  22:    */   }
/*  23:    */   
/*  24:    */   public float c()
/*  25:    */   {
/*  26: 28 */     return this.r + (this.s - this.r) * this.p;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public void a(float paramFloat, boolean paramBoolean)
/*  30:    */   {
/*  31: 32 */     this.p = ((paramFloat - this.r) / (this.s - this.r));
/*  32: 33 */     this.j = e();
/*  33: 34 */     if (paramBoolean) {
/*  34: 35 */       this.t.a(this.k, c());
/*  35:    */     }
/*  36:    */   }
/*  37:    */   
/*  38:    */   public float d()
/*  39:    */   {
/*  40: 40 */     return this.p;
/*  41:    */   }
/*  42:    */   
/*  43:    */   private String e()
/*  44:    */   {
/*  45: 49 */     if (this.u == null) {
/*  46: 50 */       return cwc.a(this.q, new Object[0]) + ": " + c();
/*  47:    */     }
/*  48: 52 */     return this.u.a(this.k, cwc.a(this.q, new Object[0]), c());
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected int a(boolean paramBoolean)
/*  52:    */   {
/*  53: 57 */     return 0;
/*  54:    */   }
/*  55:    */   
/*  56:    */   protected void b(bsu parambsu, int paramInt1, int paramInt2)
/*  57:    */   {
/*  58: 62 */     if (!this.m) {
/*  59: 63 */       return;
/*  60:    */     }
/*  61: 66 */     if (this.o)
/*  62:    */     {
/*  63: 67 */       this.p = ((paramInt1 - (this.h + 4)) / (this.f - 8));
/*  64: 68 */       if (this.p < 0.0F) {
/*  65: 69 */         this.p = 0.0F;
/*  66:    */       }
/*  67: 71 */       if (this.p > 1.0F) {
/*  68: 72 */         this.p = 1.0F;
/*  69:    */       }
/*  70: 74 */       this.j = e();
/*  71: 75 */       this.t.a(this.k, c());
/*  72:    */     }
/*  73: 78 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  74: 79 */     b(this.h + (int)(this.p * (this.f - 8)), this.i, 0, 66, 4, 20);
/*  75: 80 */     b(this.h + (int)(this.p * (this.f - 8)) + 4, this.i, 196, 66, 4, 20);
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void a(float paramFloat)
/*  79:    */   {
/*  80: 84 */     this.p = paramFloat;
/*  81: 85 */     this.j = e();
/*  82: 86 */     this.t.a(this.k, c());
/*  83:    */   }
/*  84:    */   
/*  85:    */   public boolean c(bsu parambsu, int paramInt1, int paramInt2)
/*  86:    */   {
/*  87: 91 */     if (super.c(parambsu, paramInt1, paramInt2))
/*  88:    */     {
/*  89: 92 */       this.p = ((paramInt1 - (this.h + 4)) / (this.f - 8));
/*  90: 93 */       if (this.p < 0.0F) {
/*  91: 94 */         this.p = 0.0F;
/*  92:    */       }
/*  93: 96 */       if (this.p > 1.0F) {
/*  94: 97 */         this.p = 1.0F;
/*  95:    */       }
/*  96: 99 */       this.j = e();
/*  97:100 */       this.t.a(this.k, c());
/*  98:101 */       this.o = true;
/*  99:102 */       return true;
/* 100:    */     }
/* 101:105 */     return false;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void a(int paramInt1, int paramInt2)
/* 105:    */   {
/* 106:110 */     this.o = false;
/* 107:    */   }
/* 108:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bum
 * JD-Core Version:    0.7.0.1
 */