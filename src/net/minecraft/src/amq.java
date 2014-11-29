package net.minecraft.src;
/*  1:   */ final class amq
/*  2:   */   extends eg
/*  3:   */ {
/*  4:15 */   private final eg b = new eg();
/*  5:   */   
/*  6:   */   public ItemStack b(dz paramdz, ItemStack paramamj)
/*  7:   */   {
/*  8:19 */     EnumDirection localej = ave.b(paramdz.f());
/*  9:20 */     World localaqu = paramdz.i();
/* 10:   */     
/* 11:   */ 
/* 12:   */ 
/* 13:24 */     double d1 = paramdz.a() + localej.g() * 1.125D;
/* 14:25 */     double d2 = Math.floor(paramdz.b()) + localej.h();
/* 15:26 */     double d3 = paramdz.c() + localej.i() * 1.125D;
/* 16:   */     
/* 17:28 */     BlockPosition localdt = paramdz.d().offset(localej);
/* 18:29 */     Block localbec = localaqu.getBlock(localdt);
/* 19:30 */     EnumRailState localatl1 = (localbec.getType() instanceof ati) ? (EnumRailState)localbec.getData(((ati)localbec.getType()).l()) : EnumRailState.a;
/* 20:   */     double d4;
/* 21:33 */     if (ati.d(localbec))
/* 22:   */     {
/* 23:34 */       if (localatl1.c()) {
/* 24:35 */         d4 = 0.6D;
/* 25:   */       } else {
/* 26:37 */         d4 = 0.1D;
/* 27:   */       }
/* 28:   */     }
/* 29:39 */     else if ((localbec.getType().getMaterial() == Material.air) && (ati.d(localaqu.getBlock(localdt.down()))))
/* 30:   */     {
/* 31:40 */       Block localObject = localaqu.getBlock(localdt.down());
/* 32:41 */       EnumRailState localatl2 = (((Block)localObject).getType() instanceof ati) ? (EnumRailState)((Block)localObject).getData(((ati)((Block)localObject).getType()).l()) : EnumRailState.a;
/* 33:42 */       if ((localej == EnumDirection.DOWN) || (!localatl2.c())) {
/* 34:43 */         d4 = -0.9D;
/* 35:   */       } else {
/* 36:45 */         d4 = -0.4D;
/* 37:   */       }
/* 38:   */     }
/* 39:   */     else
/* 40:   */     {
/* 41:48 */       return this.b.a(paramdz, paramamj);
/* 42:   */     }
/* 43:51 */     Object localObject = adx.a(localaqu, d1, d2 + d4, d3, amp.a((amp)paramamj.getItem()));
/* 44:52 */     if (paramamj.s()) {
/* 45:53 */       ((adx)localObject).a(paramamj.q());
/* 46:   */     }
/* 47:55 */     localaqu.spawnEntity((Entity)localObject);
/* 48:   */     
/* 49:57 */     paramamj.split(1);
/* 50:58 */     return paramamj;
/* 51:   */   }
/* 52:   */   
/* 53:   */   protected void a(dz paramdz)
/* 54:   */   {
/* 55:63 */     paramdz.i().playLevelEvent(1000, paramdz.d(), 0);
/* 56:   */   }
/* 57:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     amq
 * JD-Core Version:    0.7.0.1
 */