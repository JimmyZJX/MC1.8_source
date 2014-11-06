package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bai
/*  4:   */   extends atg
/*  5:   */ {
/*  6:   */   protected bai()
/*  7:   */   {
/*  8:21 */     super(Material.d);
/*  9:22 */     float f1 = 0.25F;
/* 10:23 */     float f2 = 1.0F;
/* 11:24 */     a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/* 15:   */   {
/* 16:30 */     return null;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public AABB a(World paramaqu, BlockPosition paramdt)
/* 20:   */   {
/* 21:35 */     a(paramaqu, paramdt);
/* 22:36 */     return super.a(paramaqu, paramdt);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public boolean isOpaqueCube()
/* 26:   */   {
/* 27:41 */     return false;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public boolean b(IBlockAccess paramard, BlockPosition paramdt)
/* 31:   */   {
/* 32:46 */     return true;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public boolean c()
/* 36:   */   {
/* 37:51 */     return false;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public bcm a(World paramaqu, int paramInt)
/* 41:   */   {
/* 42:56 */     return new bdj();
/* 43:   */   }
/* 44:   */   
/* 45:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 46:   */   {
/* 47:62 */     return ItemList.ap;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public Item b(World paramaqu, BlockPosition paramdt)
/* 51:   */   {
/* 52:67 */     return ItemList.ap;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 56:   */   {
/* 57:72 */     if (paramaqu.isClient) {
/* 58:73 */       return true;
/* 59:   */     }
/* 60:76 */     bcm localbcm = paramaqu.s(paramdt);
/* 61:77 */     if ((localbcm instanceof bdj)) {
/* 62:78 */       return ((bdj)localbcm).b(paramahd);
/* 63:   */     }
/* 64:81 */     return false;
/* 65:   */   }
/* 66:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bai
 * JD-Core Version:    0.7.0.1
 */