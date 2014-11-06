package net.minecraft.src;
/*  1:   */ public class cdc
/*  2:   */   extends cdp
/*  3:   */ {
/*  4:   */   public cdc()
/*  5:   */   {
/*  6:10 */     this(0.0F, false);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public cdc(float paramFloat, boolean paramBoolean)
/* 10:   */   {
/* 11:14 */     super(paramFloat, 0.0F, 64, 32);
/* 12:16 */     if (!paramBoolean)
/* 13:   */     {
/* 14:17 */       this.h = new cdy(this, 40, 16);
/* 15:18 */       this.h.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, paramFloat);
/* 16:19 */       this.h.a(-5.0F, 2.0F, 0.0F);
/* 17:   */       
/* 18:21 */       this.i = new cdy(this, 40, 16);
/* 19:22 */       this.i.i = true;
/* 20:23 */       this.i.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, paramFloat);
/* 21:24 */       this.i.a(5.0F, 2.0F, 0.0F);
/* 22:   */       
/* 23:26 */       this.j = new cdy(this, 0, 16);
/* 24:27 */       this.j.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, paramFloat);
/* 25:28 */       this.j.a(-2.0F, 12.0F, 0.0F);
/* 26:   */       
/* 27:30 */       this.k = new cdy(this, 0, 16);
/* 28:31 */       this.k.i = true;
/* 29:32 */       this.k.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, paramFloat);
/* 30:33 */       this.k.a(2.0F, 12.0F, 0.0F);
/* 31:   */     }
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3)
/* 35:   */   {
/* 36:39 */     this.o = (((EntitySkeleton)paramxm).ck() == 1);
/* 37:40 */     super.a(paramxm, paramFloat1, paramFloat2, paramFloat3);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 41:   */   {
/* 42:45 */     super.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdc
 * JD-Core Version:    0.7.0.1
 */