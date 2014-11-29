package net.minecraft.src;
/*   1:    */ final class og
/*   2:    */   extends eg
/*   3:    */ {
/*   4:238 */   private final eg b = new eg();
/*   5:    */   
/*   6:    */   public ItemStack b(dz paramdz, ItemStack paramamj)
/*   7:    */   {
/*   8:242 */     World localaqu = paramdz.i();
/*   9:    */     
/*  10:244 */     BlockPosition localdt = paramdz.d().offset(ave.b(paramdz.f()));
/*  11:    */     
/*  12:246 */     Block localbec = localaqu.getBlock(localdt);
/*  13:247 */     BlockType localatr = localbec.getType();
/*  14:248 */     Material localbof = localatr.getMaterial();
/*  15:    */     Item localalq;
/*  16:251 */     if ((Material.water.equals(localbof)) && ((localatr instanceof BlockLiquid)) && (((Integer)localbec.getData(BlockLiquid.level)).intValue() == 0)) {
/*  17:252 */       localalq = ItemList.ax;
/*  18:253 */     } else if ((Material.lava.equals(localbof)) && ((localatr instanceof BlockLiquid)) && (((Integer)localbec.getData(BlockLiquid.level)).intValue() == 0)) {
/*  19:254 */       localalq = ItemList.ay;
/*  20:    */     } else {
/*  21:256 */       return super.b(paramdz, paramamj);
/*  22:    */     }
/*  23:259 */     localaqu.g(localdt);
/*  24:260 */     if (--paramamj.stackSize == 0)
/*  25:    */     {
/*  26:261 */       paramamj.a(localalq);
/*  27:262 */       paramamj.stackSize = 1;
/*  28:    */     }
/*  29:263 */     else if (((bcx)paramdz.h()).a(new ItemStack(localalq)) < 0)
/*  30:    */     {
/*  31:264 */       this.b.a(paramdz, new ItemStack(localalq));
/*  32:    */     }
/*  33:266 */     return paramamj;
/*  34:    */   }
/*  35:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     og
 * JD-Core Version:    0.7.0.1
 */