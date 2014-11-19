package net.minecraft.src;
/*  1:   */ public class bbz
/*  2:   */   extends bai
/*  3:   */ {
/*  4:12 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing", en.HORIZONTAL);
/*  5:   */   
/*  6:   */   public bbz()
/*  7:   */   {
/*  8:15 */     j(this.L.b().a(a, EnumDirection.NORTH));
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/* 12:   */   {
/* 13:20 */     EnumDirection localej = (EnumDirection)paramard.getBlock(paramdt).getProperty(a);
/* 14:   */     
/* 15:22 */     float f1 = 0.28125F;
/* 16:23 */     float f2 = 0.78125F;
/* 17:24 */     float f3 = 0.0F;
/* 18:25 */     float f4 = 1.0F;
/* 19:   */     
/* 20:27 */     float f5 = 0.125F;
/* 21:   */     
/* 22:29 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 23:31 */     switch (bca.a[localej.ordinal()])
/* 24:   */     {
/* 25:   */     case 1: 
/* 26:33 */       a(f3, f1, 1.0F - f5, f4, f2, 1.0F);
/* 27:34 */       break;
/* 28:   */     case 2: 
/* 29:36 */       a(f3, f1, 0.0F, f4, f2, f5);
/* 30:37 */       break;
/* 31:   */     case 3: 
/* 32:39 */       a(1.0F - f5, f1, f3, 1.0F, f2, f4);
/* 33:40 */       break;
/* 34:   */     case 4: 
/* 35:42 */       a(0.0F, f1, f3, f5, f2, f4);
/* 36:   */     }
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/* 40:   */   {
/* 41:49 */     EnumDirection localej = (EnumDirection)parambec.getProperty(a);
/* 42:51 */     if (!paramaqu.getBlock(paramdt.a(localej.d())).getProto().getMaterial().a())
/* 43:   */     {
/* 44:52 */       b(paramaqu, paramdt, parambec, 0);
/* 45:53 */       paramaqu.g(paramdt);
/* 46:   */     }
/* 47:56 */     super.a(paramaqu, paramdt, parambec, paramatr);
/* 48:   */   }
/* 49:   */   
/* 50:   */   public Block a(int paramInt)
/* 51:   */   {
/* 52:61 */     EnumDirection localej = EnumDirection.a(paramInt);
/* 53:62 */     if (localej.k() == EnumAxis.Y) {
/* 54:63 */       localej = EnumDirection.NORTH;
/* 55:   */     }
/* 56:65 */     return instance().a(a, localej);
/* 57:   */   }
/* 58:   */   
/* 59:   */   public int c(Block parambec)
/* 60:   */   {
/* 61:71 */     return ((EnumDirection)parambec.getProperty(a)).a();
/* 62:   */   }
/* 63:   */   
/* 64:   */   protected bed e()
/* 65:   */   {
/* 66:76 */     return new bed(this, new IBlockData[] { a });
/* 67:   */   }
/* 68:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbz
 * JD-Core Version:    0.7.0.1
 */