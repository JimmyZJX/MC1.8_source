package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class avp
/*  5:   */   extends atg
/*  6:   */ {
/*  7:   */   protected avp(Material parambof)
/*  8:   */   {
/*  9:22 */     super(parambof);
/* 10:23 */     a(1.0F);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public bcm a(World paramaqu, int paramInt)
/* 14:   */   {
/* 15:28 */     return new bdn();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/* 19:   */   {
/* 20:33 */     float f = 0.0625F;
/* 21:34 */     a(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/* 25:   */   {
/* 26:39 */     if (paramej == EnumDirection.DOWN) {
/* 27:40 */       return super.a(paramard, paramdt, paramej);
/* 28:   */     }
/* 29:43 */     return false;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, AABB parambrt, List paramList, Entity paramwv) {}
/* 33:   */   
/* 34:   */   public boolean c()
/* 35:   */   {
/* 36:52 */     return false;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public boolean isOpaqueCube()
/* 40:   */   {
/* 41:57 */     return false;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public int a(Random paramRandom)
/* 45:   */   {
/* 46:62 */     return 0;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Entity paramwv)
/* 50:   */   {
/* 51:67 */     if ((paramwv.vehicle == null) && (paramwv.rider == null) && 
/* 52:68 */       (!paramaqu.isClient)) {
/* 53:69 */       paramwv.c(1);
/* 54:   */     }
/* 55:   */   }
/* 56:   */   
/* 57:   */   public void c(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 58:   */   {
/* 59:76 */     double d1 = paramdt.getX() + paramRandom.nextFloat();
/* 60:77 */     double d2 = paramdt.getY() + 0.8F;
/* 61:78 */     double d3 = paramdt.getZ() + paramRandom.nextFloat();
/* 62:79 */     double d4 = 0.0D;
/* 63:80 */     double d5 = 0.0D;
/* 64:81 */     double d6 = 0.0D;
/* 65:   */     
/* 66:83 */     paramaqu.a(ew.l, d1, d2, d3, d4, d5, d6, new int[0]);
/* 67:   */   }
/* 68:   */   
/* 69:   */   public Item b(World paramaqu, BlockPosition paramdt)
/* 70:   */   {
/* 71:88 */     return null;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public MapColor g(Block parambec)
/* 75:   */   {
/* 76:93 */     return MapColor.J;
/* 77:   */   }
/* 78:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avp
 * JD-Core Version:    0.7.0.1
 */