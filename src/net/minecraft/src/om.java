package net.minecraft.src;
/*   1:    */ final class om
/*   2:    */   extends eg
/*   3:    */ {
/*   4:    */   protected ItemStack b(dz paramdz, ItemStack paramamj)
/*   5:    */   {
/*   6:442 */     World localaqu = paramdz.i();
/*   7:443 */     BlockPosition localdt = paramdz.d().offset(ave.b(paramdz.f()));
/*   8:445 */     if (localaqu.isEmpty(localdt))
/*   9:    */     {
/*  10:446 */       if (!localaqu.isClient)
/*  11:    */       {
/*  12:447 */         Block localbec = BlockList.bX.instance().setData(auo.a, Boolean.valueOf(false));
/*  13:448 */         localaqu.setBlock(localdt, localbec, 3);
/*  14:449 */         aju.a(localaqu, localdt, paramamj);
/*  15:450 */         localaqu.c(paramdz.d(), paramdz.e());
/*  16:    */       }
/*  17:452 */       paramamj.stackSize -= 1;
/*  18:    */     }
/*  19:454 */     return paramamj;
/*  20:    */   }
/*  21:    */   
/*  22:    */   protected void a(dz paramdz) {}
/*  23:    */   
/*  24:    */   protected void a(dz paramdz, EnumDirection paramej) {}
/*  25:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     om
 * JD-Core Version:    0.7.0.1
 */