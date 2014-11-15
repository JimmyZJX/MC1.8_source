package net.minecraft.src;
/*  1:   */ public class ahq
/*  2:   */   extends ahr
/*  3:   */ {
/*  4:   */   public ahq(World paramaqu)
/*  5:   */   {
/*  6:12 */     super(paramaqu);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public ahq(World paramaqu, EntityLiving paramxm)
/* 10:   */   {
/* 11:16 */     super(paramaqu, paramxm);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public ahq(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 15:   */   {
/* 16:20 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected void a(HitResult parambru)
/* 20:   */   {
/* 21:25 */     if (parambru.d != null)
/* 22:   */     {
/* 23:26 */       int i = 0;
/* 24:27 */       if ((parambru.d instanceof EntityBlaze)) {
/* 25:28 */         i = 3;
/* 26:   */       }
/* 27:30 */       parambru.d.a(DamageSource.a(this, n()), i);
/* 28:   */     }
/* 29:32 */     for (int i = 0; i < 8; i++) {
/* 30:33 */       this.world.a(ew.F, this.xPos, this.yPos, this.zPos, 0.0D, 0.0D, 0.0D, new int[0]);
/* 31:   */     }
/* 32:35 */     if (!this.world.isClient) {
/* 33:36 */       setDead();
/* 34:   */     }
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahq
 * JD-Core Version:    0.7.0.1
 */