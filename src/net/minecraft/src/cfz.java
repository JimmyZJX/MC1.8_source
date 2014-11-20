package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class cfz
/*   4:    */   extends cgw
/*   5:    */ {
/*   6:271 */   private int a = 160;
/*   7:    */   private boolean ax;
/*   8:    */   private boolean ay;
/*   9:    */   private final cgx az;
/*  10:    */   private float aA;
/*  11:    */   private float aB;
/*  12:    */   private float aC;
/*  13:    */   private boolean aD;
/*  14:    */   
/*  15:    */   public cfz(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, cgx paramcgx)
/*  16:    */   {
/*  17:282 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  18:283 */     this.xVelocity = paramDouble4;
/*  19:284 */     this.yVelocity = paramDouble5;
/*  20:285 */     this.zVelocity = paramDouble6;
/*  21:286 */     this.az = paramcgx;
/*  22:    */     
/*  23:288 */     this.h *= 0.75F;
/*  24:    */     
/*  25:290 */     this.g = (48 + this.rng.nextInt(12));
/*  26:291 */     this.T = false;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public void a(boolean paramBoolean)
/*  30:    */   {
/*  31:295 */     this.ax = paramBoolean;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void i(boolean paramBoolean)
/*  35:    */   {
/*  36:299 */     this.ay = paramBoolean;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void a(int paramInt)
/*  40:    */   {
/*  41:303 */     float f1 = ((paramInt & 0xFF0000) >> 16) / 255.0F;
/*  42:304 */     float f2 = ((paramInt & 0xFF00) >> 8) / 255.0F;
/*  43:305 */     float f3 = ((paramInt & 0xFF) >> 0) / 255.0F;
/*  44:306 */     float f4 = 1.0F;
/*  45:307 */     b(f1 * f4, f2 * f4, f3 * f4);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void b(int paramInt)
/*  49:    */   {
/*  50:311 */     this.aA = (((paramInt & 0xFF0000) >> 16) / 255.0F);
/*  51:312 */     this.aB = (((paramInt & 0xFF00) >> 8) / 255.0F);
/*  52:313 */     this.aC = (((paramInt & 0xFF) >> 0) / 255.0F);
/*  53:314 */     this.aD = true;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public AABB S()
/*  57:    */   {
/*  58:319 */     return null;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public boolean ae()
/*  62:    */   {
/*  63:324 */     return false;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void a(VertexBuffer paramciv, Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*  67:    */   {
/*  68:329 */     if ((!this.ay) || (this.f < this.g / 3) || ((this.f + this.g) / 3 % 2 == 0)) {
/*  69:330 */       super.a(paramciv, paramwv, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*  70:    */     }
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void onUpdate()
/*  74:    */   {
/*  75:336 */     this.lastX = this.xPos;
/*  76:337 */     this.lastY = this.yPos;
/*  77:338 */     this.lastZ = this.zPos;
/*  78:340 */     if (this.f++ >= this.g) {
/*  79:341 */       setDead();
/*  80:    */     }
/*  81:343 */     if (this.f > this.g / 2)
/*  82:    */     {
/*  83:344 */       h(1.0F - (this.f - this.g / 2) / this.g);
/*  84:346 */       if (this.aD)
/*  85:    */       {
/*  86:347 */         this.ap += (this.aA - this.ap) * 0.2F;
/*  87:348 */         this.aq += (this.aB - this.aq) * 0.2F;
/*  88:349 */         this.ar += (this.aC - this.ar) * 0.2F;
/*  89:    */       }
/*  90:    */     }
/*  91:353 */     k(this.a + (7 - this.f * 8 / this.g));
/*  92:    */     
/*  93:355 */     this.yVelocity -= 0.004D;
/*  94:356 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/*  95:357 */     this.xVelocity *= 0.910000026226044D;
/*  96:358 */     this.yVelocity *= 0.910000026226044D;
/*  97:359 */     this.zVelocity *= 0.910000026226044D;
/*  98:361 */     if (this.C)
/*  99:    */     {
/* 100:362 */       this.xVelocity *= 0.699999988079071D;
/* 101:363 */       this.zVelocity *= 0.699999988079071D;
/* 102:    */     }
/* 103:366 */     if ((this.ax) && (this.f < this.g / 2) && ((this.f + this.g) % 2 == 0))
/* 104:    */     {
/* 105:367 */       cfz localcfz = new cfz(this.world, this.xPos, this.yPos, this.zPos, 0.0D, 0.0D, 0.0D, this.az);
/* 106:368 */       localcfz.h(0.99F);
/* 107:369 */       localcfz.b(this.ap, this.aq, this.ar);
/* 108:370 */       localcfz.f = (localcfz.g / 2);
/* 109:371 */       if (this.aD)
/* 110:    */       {
/* 111:372 */         localcfz.aD = true;
/* 112:373 */         localcfz.aA = this.aA;
/* 113:374 */         localcfz.aB = this.aB;
/* 114:375 */         localcfz.aC = this.aC;
/* 115:    */       }
/* 116:377 */       localcfz.ay = this.ay;
/* 117:378 */       this.az.a(localcfz);
/* 118:    */     }
/* 119:    */   }
/* 120:    */   
/* 121:    */   public int b(float paramFloat)
/* 122:    */   {
/* 123:388 */     return 15728880;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public float c(float paramFloat)
/* 127:    */   {
/* 128:393 */     return 1.0F;
/* 129:    */   }
/* 130:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cfz
 * JD-Core Version:    0.7.0.1
 */