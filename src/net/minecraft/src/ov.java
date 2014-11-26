package net.minecraft.src;
/*   1:    */ final class ov
/*   2:    */   extends eg
/*   3:    */ {
/*   4:179 */   private final eg b = new eg();
/*   5:    */   
/*   6:    */   public ItemStack b(dz paramdz, ItemStack paramamj)
/*   7:    */   {
/*   8:183 */     EnumDirection localej = ave.b(paramdz.f());
/*   9:184 */     World localaqu = paramdz.i();
/*  10:    */     
/*  11:    */ 
/*  12:187 */     double d1 = paramdz.a() + localej.g() * 1.125F;
/*  13:188 */     double d2 = paramdz.b() + localej.h() * 1.125F;
/*  14:189 */     double d3 = paramdz.c() + localej.i() * 1.125F;
/*  15:    */     
/*  16:191 */     BlockPosition localdt = paramdz.d().offset(localej);
/*  17:192 */     Material localbof = localaqu.getBlock(localdt).getProto().getMaterial();
/*  18:    */     double d4;
/*  19:195 */     if (Material.water.equals(localbof)) {
/*  20:196 */       d4 = 1.0D;
/*  21:197 */     } else if ((Material.air.equals(localbof)) && (Material.water.equals(localaqu.getBlock(localdt.down()).getProto().getMaterial()))) {
/*  22:198 */       d4 = 0.0D;
/*  23:    */     } else {
/*  24:200 */       return this.b.a(paramdz, paramamj);
/*  25:    */     }
/*  26:203 */     adu localadu = new adu(localaqu, d1, d2 + d4, d3);
/*  27:204 */     localaqu.spawnEntity(localadu);
/*  28:    */     
/*  29:206 */     paramamj.split(1);
/*  30:207 */     return paramamj;
/*  31:    */   }
/*  32:    */   
/*  33:    */   protected void a(dz paramdz)
/*  34:    */   {
/*  35:212 */     paramdz.i().playLevelEvent(1000, paramdz.d(), 0);
/*  36:    */   }
/*  37:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ov
 * JD-Core Version:    0.7.0.1
 */