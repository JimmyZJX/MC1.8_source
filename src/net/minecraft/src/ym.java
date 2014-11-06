package net.minecraft.src;
/*   1:    */ public class ym
/*   2:    */ {
/*   3:    */   private EntityMob a;
/*   4:    */   private float b;
/*   5:    */   private float c;
/*   6:    */   private boolean d;
/*   7:    */   private double e;
/*   8:    */   private double f;
/*   9:    */   private double g;
/*  10:    */   
/*  11:    */   public ym(EntityMob paramxn)
/*  12:    */   {
/*  13: 15 */     this.a = paramxn;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void a(Entity paramwv, float paramFloat1, float paramFloat2)
/*  17:    */   {
/*  18: 19 */     this.e = paramwv.xPos;
/*  19: 20 */     if ((paramwv instanceof EntityLiving)) {
/*  20: 21 */       this.f = (paramwv.yPos + paramwv.aR());
/*  21:    */     } else {
/*  22: 23 */       this.f = ((paramwv.getAABB().minY + paramwv.getAABB().maxY) / 2.0D);
/*  23:    */     }
/*  24: 25 */     this.g = paramwv.zPos;
/*  25: 26 */     this.b = paramFloat1;
/*  26: 27 */     this.c = paramFloat2;
/*  27: 28 */     this.d = true;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  31:    */   {
/*  32: 32 */     this.e = paramDouble1;
/*  33: 33 */     this.f = paramDouble2;
/*  34: 34 */     this.g = paramDouble3;
/*  35: 35 */     this.b = paramFloat1;
/*  36: 36 */     this.c = paramFloat2;
/*  37: 37 */     this.d = true;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void a()
/*  41:    */   {
/*  42: 41 */     this.a.pitch = 0.0F;
/*  43: 43 */     if (this.d)
/*  44:    */     {
/*  45: 44 */       this.d = false;
/*  46:    */       
/*  47: 46 */       double d1 = this.e - this.a.xPos;
/*  48: 47 */       double d2 = this.f - (this.a.yPos + this.a.aR());
/*  49: 48 */       double d3 = this.g - this.a.zPos;
/*  50: 49 */       double d4 = MathUtils.a(d1 * d1 + d3 * d3);
/*  51:    */       
/*  52: 51 */       float f2 = (float)(Math.atan2(d3, d1) * 180.0D / 3.141592741012573D) - 90.0F;
/*  53: 52 */       float f3 = (float)-(Math.atan2(d2, d4) * 180.0D / 3.141592741012573D);
/*  54: 53 */       this.a.pitch = a(this.a.pitch, f3, this.c);
/*  55: 54 */       this.a.aI = a(this.a.aI, f2, this.b);
/*  56:    */     }
/*  57:    */     else
/*  58:    */     {
/*  59: 56 */       this.a.aI = a(this.a.aI, this.a.aG, 10.0F);
/*  60:    */     }
/*  61: 59 */     float f1 = MathUtils.wrapDegrees(this.a.aI - this.a.aG);
/*  62: 61 */     if (!this.a.s().m())
/*  63:    */     {
/*  64: 63 */       if (f1 < -75.0F) {
/*  65: 64 */         this.a.aI = (this.a.aG - 75.0F);
/*  66:    */       }
/*  67: 66 */       if (f1 > 75.0F) {
/*  68: 67 */         this.a.aI = (this.a.aG + 75.0F);
/*  69:    */       }
/*  70:    */     }
/*  71:    */   }
/*  72:    */   
/*  73:    */   private float a(float paramFloat1, float paramFloat2, float paramFloat3)
/*  74:    */   {
/*  75: 73 */     float f1 = MathUtils.wrapDegrees(paramFloat2 - paramFloat1);
/*  76: 74 */     if (f1 > paramFloat3) {
/*  77: 75 */       f1 = paramFloat3;
/*  78:    */     }
/*  79: 77 */     if (f1 < -paramFloat3) {
/*  80: 78 */       f1 = -paramFloat3;
/*  81:    */     }
/*  82: 80 */     return paramFloat1 + f1;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public boolean b()
/*  86:    */   {
/*  87: 84 */     return this.d;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public double e()
/*  91:    */   {
/*  92: 96 */     return this.e;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public double f()
/*  96:    */   {
/*  97:100 */     return this.f;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public double g()
/* 101:    */   {
/* 102:104 */     return this.g;
/* 103:    */   }
/* 104:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ym
 * JD-Core Version:    0.7.0.1
 */