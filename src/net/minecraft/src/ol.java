package net.minecraft.src;
/*   1:    */ final class ol
/*   2:    */   extends eg
/*   3:    */ {
/*   4:409 */   private boolean b = true;
/*   5:    */   
/*   6:    */   protected ItemStack b(dz paramdz, ItemStack paramamj)
/*   7:    */   {
/*   8:413 */     World localaqu = paramdz.i();
/*   9:414 */     BlockPosition localdt = paramdz.d().offset(ave.b(paramdz.f()));
/*  10:415 */     azk localazk = (azk)BlockList.pumpkin;
/*  11:417 */     if ((localaqu.isEmpty(localdt)) && (localazk.d(localaqu, localdt)))
/*  12:    */     {
/*  13:418 */       if (!localaqu.isClient) {
/*  14:419 */         localaqu.setBlock(localdt, localazk.instance(), 3);
/*  15:    */       }
/*  16:421 */       paramamj.stackSize -= 1;
/*  17:    */     }
/*  18:    */     else
/*  19:    */     {
/*  20:423 */       this.b = false;
/*  21:    */     }
/*  22:426 */     return paramamj;
/*  23:    */   }
/*  24:    */   
/*  25:    */   protected void a(dz paramdz)
/*  26:    */   {
/*  27:431 */     if (this.b) {
/*  28:432 */       paramdz.i().playLevelEvent(1000, paramdz.d(), 0);
/*  29:    */     } else {
/*  30:434 */       paramdz.i().playLevelEvent(1001, paramdz.d(), 0);
/*  31:    */     }
/*  32:    */   }
/*  33:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ol
 * JD-Core Version:    0.7.0.1
 */