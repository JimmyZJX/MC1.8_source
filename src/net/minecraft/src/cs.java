package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class cs
/*   4:    */ {
/*   5:    */   double a;
/*   6:    */   double b;
/*   7:    */   
/*   8:    */   cs() {}
/*   9:    */   
/*  10:    */   cs(double paramDouble1, double paramDouble2)
/*  11:    */   {
/*  12:251 */     this.a = paramDouble1;
/*  13:252 */     this.b = paramDouble2;
/*  14:    */   }
/*  15:    */   
/*  16:    */   double a(cs paramcs)
/*  17:    */   {
/*  18:261 */     double d1 = this.a - paramcs.a;
/*  19:262 */     double d2 = this.b - paramcs.b;
/*  20:    */     
/*  21:264 */     return Math.sqrt(d1 * d1 + d2 * d2);
/*  22:    */   }
/*  23:    */   
/*  24:    */   void a()
/*  25:    */   {
/*  26:268 */     double d = b();
/*  27:269 */     this.a /= d;
/*  28:270 */     this.b /= d;
/*  29:    */   }
/*  30:    */   
/*  31:    */   float b()
/*  32:    */   {
/*  33:274 */     return MathUtils.sqrt(this.a * this.a + this.b * this.b);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void b(cs paramcs)
/*  37:    */   {
/*  38:278 */     this.a -= paramcs.a;
/*  39:279 */     this.b -= paramcs.b;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/*  43:    */   {
/*  44:283 */     boolean bool = false;
/*  45:285 */     if (this.a < paramDouble1)
/*  46:    */     {
/*  47:286 */       this.a = paramDouble1;
/*  48:287 */       bool = true;
/*  49:    */     }
/*  50:288 */     else if (this.a > paramDouble3)
/*  51:    */     {
/*  52:289 */       this.a = paramDouble3;
/*  53:290 */       bool = true;
/*  54:    */     }
/*  55:293 */     if (this.b < paramDouble2)
/*  56:    */     {
/*  57:294 */       this.b = paramDouble2;
/*  58:295 */       bool = true;
/*  59:    */     }
/*  60:296 */     else if (this.b > paramDouble4)
/*  61:    */     {
/*  62:297 */       this.b = paramDouble4;
/*  63:298 */       bool = true;
/*  64:    */     }
/*  65:301 */     return bool;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public int a(World paramaqu)
/*  69:    */   {
/*  70:305 */     BlockPosition localdt = new BlockPosition(this.a, 256.0D, this.b);
/*  71:306 */     while (localdt.getY() > 0)
/*  72:    */     {
/*  73:307 */       localdt = localdt.down();
/*  74:309 */       if (paramaqu.getBlock(localdt).getProto().getMaterial() != Material.air) {
/*  75:310 */         return localdt.getY() + 1;
/*  76:    */       }
/*  77:    */     }
/*  78:314 */     return 257;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public boolean b(World paramaqu)
/*  82:    */   {
/*  83:318 */     BlockPosition localdt = new BlockPosition(this.a, 256.0D, this.b);
/*  84:319 */     while (localdt.getY() > 0)
/*  85:    */     {
/*  86:320 */       localdt = localdt.down();
/*  87:    */       
/*  88:322 */       Material localbof = paramaqu.getBlock(localdt).getProto().getMaterial();
/*  89:323 */       if (localbof != Material.air) {
/*  90:324 */         return (!localbof.isLiquid()) && (localbof != Material.o);
/*  91:    */       }
/*  92:    */     }
/*  93:328 */     return false;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void a(Random paramRandom, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/*  97:    */   {
/*  98:332 */     this.a = MathUtils.nextDouble(paramRandom, paramDouble1, paramDouble3);
/*  99:333 */     this.b = MathUtils.nextDouble(paramRandom, paramDouble2, paramDouble4);
/* 100:    */   }
/* 101:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cs
 * JD-Core Version:    0.7.0.1
 */