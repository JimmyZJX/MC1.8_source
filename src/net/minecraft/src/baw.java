package net.minecraft.src;
/*  1:   */ public class baw
/*  2:   */   extends bai
/*  3:   */ {
/*  4:10 */   public static final BlockDataInteger a = BlockDataInteger.getInstance("rotation", 0, 15);
/*  5:   */   
/*  6:   */   public baw()
/*  7:   */   {
/*  8:13 */     j(this.L.b().setData(a, Integer.valueOf(0)));
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/* 12:   */   {
/* 13:18 */     if (!paramaqu.getBlock(paramdt.down()).getProto().getMaterial().a())
/* 14:   */     {
/* 15:19 */       b(paramaqu, paramdt, parambec, 0);
/* 16:20 */       paramaqu.g(paramdt);
/* 17:   */     }
/* 18:23 */     super.a(paramaqu, paramdt, parambec, paramatr);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public Block instance(int paramInt)
/* 22:   */   {
/* 23:28 */     return instance().setData(a, Integer.valueOf(paramInt));
/* 24:   */   }
/* 25:   */   
/* 26:   */   public int c(Block parambec)
/* 27:   */   {
/* 28:34 */     return ((Integer)parambec.getProperty(a)).intValue();
/* 29:   */   }
/* 30:   */   
/* 31:   */   protected bed e()
/* 32:   */   {
/* 33:39 */     return new bed(this, new IBlockData[] { a });
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     baw
 * JD-Core Version:    0.7.0.1
 */