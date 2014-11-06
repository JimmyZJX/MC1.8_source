package net.minecraft.src;
/*   1:    */ class afz
/*   2:    */   extends zb
/*   3:    */ {
/*   4:    */   private EntitySlime a;
/*   5:    */   private int b;
/*   6:    */   
/*   7:    */   public afz(EntitySlime paramafy)
/*   8:    */   {
/*   9:362 */     this.a = paramafy;
/*  10:363 */     a(2);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean a()
/*  14:    */   {
/*  15:368 */     EntityLiving localxm = this.a.u();
/*  16:370 */     if (localxm == null) {
/*  17:371 */       return false;
/*  18:    */     }
/*  19:373 */     if (!localxm.ai()) {
/*  20:374 */       return false;
/*  21:    */     }
/*  22:377 */     return true;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void c()
/*  26:    */   {
/*  27:382 */     this.b = 300;
/*  28:383 */     super.c();
/*  29:    */   }
/*  30:    */   
/*  31:    */   public boolean b()
/*  32:    */   {
/*  33:388 */     EntityLiving localxm = this.a.u();
/*  34:390 */     if (localxm == null) {
/*  35:391 */       return false;
/*  36:    */     }
/*  37:393 */     if (!localxm.ai()) {
/*  38:394 */       return false;
/*  39:    */     }
/*  40:396 */     if (--this.b <= 0) {
/*  41:397 */       return false;
/*  42:    */     }
/*  43:400 */     return true;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void e()
/*  47:    */   {
/*  48:405 */     this.a.a(this.a.u(), 10.0F, 10.0F);
/*  49:406 */     ((agc)this.a.q()).a(this.a.yaw, this.a.cg());
/*  50:    */   }
/*  51:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afz
 * JD-Core Version:    0.7.0.1
 */