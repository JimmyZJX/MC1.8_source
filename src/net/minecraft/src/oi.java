package net.minecraft.src;
/*   1:    */ final class oi
/*   2:    */   extends eg
/*   3:    */ {
/*   4:307 */   private boolean b = true;
/*   5:    */   
/*   6:    */   protected ItemStack b(dz paramdz, ItemStack paramamj)
/*   7:    */   {
/*   8:312 */     if (EnumDyeColor.WHITE == EnumDyeColor.fromIndex(paramamj.getDamage2()))
/*   9:    */     {
/*  10:313 */       World world = paramdz.i();
/*  11:    */       
/*  12:315 */       BlockPosition pos = paramdz.d().a(ave.b(paramdz.f()));
/*  13:316 */       if (akw.a(paramamj, world, pos))
/*  14:    */       {
/*  15:317 */         if (!world.isClient) {
/*  16:318 */           world.playLevelEvent(2005, pos, 0);
/*  17:    */         }
/*  18:    */       }
/*  19:    */       else {
/*  20:321 */         this.b = false;
/*  21:    */       }
/*  22:324 */       return paramamj;
/*  23:    */     }
/*  24:326 */     return super.b(paramdz, paramamj);
/*  25:    */   }
/*  26:    */   
/*  27:    */   protected void a(dz paramdz)
/*  28:    */   {
/*  29:332 */     if (this.b) {
/*  30:333 */       paramdz.i().playLevelEvent(1000, paramdz.d(), 0);
/*  31:    */     } else {
/*  32:335 */       paramdz.i().playLevelEvent(1001, paramdz.d(), 0);
/*  33:    */     }
/*  34:    */   }
/*  35:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     oi
 * JD-Core Version:    0.7.0.1
 */