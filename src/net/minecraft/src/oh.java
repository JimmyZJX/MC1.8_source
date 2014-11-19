package net.minecraft.src;
/*   1:    */ final class oh
/*   2:    */   extends eg
/*   3:    */ {
/*   4:271 */   private boolean b = true;
/*   5:    */   
/*   6:    */   protected ItemStack b(dz paramdz, ItemStack paramamj)
/*   7:    */   {
/*   8:275 */     World localaqu = paramdz.i();
/*   9:    */     
/*  10:277 */     BlockPosition localdt = paramdz.d().a(ave.b(paramdz.f()));
/*  11:278 */     if (localaqu.isEmpty(localdt))
/*  12:    */     {
/*  13:279 */       localaqu.setBlock(localdt, BlockList.fire.instance());
/*  14:281 */       if (paramamj.a(1, localaqu.rng)) {
/*  15:282 */         paramamj.stackSize = 0;
/*  16:    */       }
/*  17:    */     }
/*  18:285 */     else if (localaqu.getBlock(localdt).getProto() == BlockList.W)
/*  19:    */     {
/*  20:286 */       BlockList.W.d(localaqu, localdt, BlockList.W.instance().a(bbk.a, Boolean.valueOf(true)));
/*  21:287 */       localaqu.g(localdt);
/*  22:    */     }
/*  23:    */     else
/*  24:    */     {
/*  25:289 */       this.b = false;
/*  26:    */     }
/*  27:293 */     return paramamj;
/*  28:    */   }
/*  29:    */   
/*  30:    */   protected void a(dz paramdz)
/*  31:    */   {
/*  32:298 */     if (this.b) {
/*  33:299 */       paramdz.i().playLevelEvent(1000, paramdz.d(), 0);
/*  34:    */     } else {
/*  35:301 */       paramdz.i().playLevelEvent(1001, paramdz.d(), 0);
/*  36:    */     }
/*  37:    */   }
/*  38:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     oh
 * JD-Core Version:    0.7.0.1
 */