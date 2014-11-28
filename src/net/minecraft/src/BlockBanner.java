package net.minecraft.src;
/*   1:    */ public class BlockBanner
/*   2:    */   extends atb
/*   3:    */ {
/*   4:    */   public BlockBanner()
/*   5:    */   {
/*   6:187 */     j(this.L.b().setData(b, Integer.valueOf(0)));
/*   7:    */   }
/*   8:    */   
/*   9:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  10:    */   {
/*  11:192 */     if (!paramaqu.getBlock(paramdt.down()).getProto().getMaterial().a())
/*  12:    */     {
/*  13:193 */       b(paramaqu, paramdt, parambec, 0);
/*  14:194 */       paramaqu.g(paramdt);
/*  15:    */     }
/*  16:197 */     super.a(paramaqu, paramdt, parambec, paramatr);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public Block instance(int paramInt)
/*  20:    */   {
/*  21:202 */     return instance().setData(b, Integer.valueOf(paramInt));
/*  22:    */   }
/*  23:    */   
/*  24:    */   public int c(Block parambec)
/*  25:    */   {
/*  26:207 */     return ((Integer)parambec.getData(b)).intValue();
/*  27:    */   }
/*  28:    */   
/*  29:    */   protected bed e()
/*  30:    */   {
/*  31:212 */     return new bed(this, new IBlockData[] { b });
/*  32:    */   }
/*  33:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     atd
 * JD-Core Version:    0.7.0.1
 */