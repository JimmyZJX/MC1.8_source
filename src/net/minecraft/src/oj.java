package net.minecraft.src;
/*   1:    */ final class oj
/*   2:    */   extends eg
/*   3:    */ {
/*   4:    */   protected ItemStack b(dz paramdz, ItemStack paramamj)
/*   5:    */   {
/*   6:343 */     World localaqu = paramdz.i();
/*   7:344 */     BlockPosition localdt = paramdz.d().offset(ave.b(paramdz.f()));
/*   8:    */     
/*   9:346 */     aek localaek = new aek(localaqu, localdt.getX() + 0.5D, localdt.getY(), localdt.getZ() + 0.5D, null);
/*  10:347 */     localaqu.spawnEntity(localaek);
/*  11:348 */     localaqu.a(localaek, "game.tnt.primed", 1.0F, 1.0F);
/*  12:    */     
/*  13:350 */     paramamj.stackSize -= 1;
/*  14:351 */     return paramamj;
/*  15:    */   }
/*  16:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     oj
 * JD-Core Version:    0.7.0.1
 */