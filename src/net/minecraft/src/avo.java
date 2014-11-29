package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class avo
/*  4:   */   extends atg
/*  5:   */ {
/*  6:   */   protected avo()
/*  7:   */   {
/*  8:20 */     super(Material.rock);
/*  9:21 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
/* 10:22 */     e(0);
/* 11:23 */     setCreativeTab(CreativeTabs.tabDeco);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean isOpaqueCube()
/* 15:   */   {
/* 16:28 */     return false;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void c(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 20:   */   {
/* 21:33 */     super.c(paramaqu, paramdt, parambec, paramRandom);
/* 22:35 */     for (int i = -2; i <= 2; i++) {
/* 23:36 */       for (int j = -2; j <= 2; j++)
/* 24:   */       {
/* 25:37 */         if ((i > -2) && (i < 2) && (j == -1)) {
/* 26:38 */           j = 2;
/* 27:   */         }
/* 28:40 */         if (paramRandom.nextInt(16) == 0) {
/* 29:43 */           for (int k = 0; k <= 1; k++)
/* 30:   */           {
/* 31:44 */             BlockPosition localdt = paramdt.offset(i, k, j);
/* 32:45 */             if (paramaqu.getBlock(localdt).getType() == BlockList.bookshelf)
/* 33:   */             {
/* 34:46 */               if (!paramaqu.isEmpty(paramdt.offset(i / 2, 0, j / 2))) {
/* 35:   */                 break;
/* 36:   */               }
/* 37:50 */               paramaqu.a(EnumParticleEffect.z, paramdt.getX() + 0.5D, paramdt.getY() + 2.0D, paramdt.getZ() + 0.5D, i + paramRandom.nextFloat() - 0.5D, k - paramRandom.nextFloat() - 1.0F, j + paramRandom.nextFloat() - 0.5D, new int[0]);
/* 38:   */             }
/* 39:   */           }
/* 40:   */         }
/* 41:   */       }
/* 42:   */     }
/* 43:   */   }
/* 44:   */   
/* 45:   */   public boolean c()
/* 46:   */   {
/* 47:59 */     return false;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public int b()
/* 51:   */   {
/* 52:64 */     return 3;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public bcm a(World paramaqu, int paramInt)
/* 56:   */   {
/* 57:69 */     return new bcz();
/* 58:   */   }
/* 59:   */   
/* 60:   */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 61:   */   {
/* 62:74 */     if (paramaqu.isClient) {
/* 63:75 */       return true;
/* 64:   */     }
/* 65:78 */     bcm localbcm = paramaqu.s(paramdt);
/* 66:79 */     if ((localbcm instanceof bcz)) {
/* 67:80 */       paramahd.a((bcz)localbcm);
/* 68:   */     }
/* 69:83 */     return true;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityLiving paramxm, ItemStack paramamj)
/* 73:   */   {
/* 74:88 */     super.a(paramaqu, paramdt, parambec, paramxm, paramamj);
/* 75:89 */     if (paramamj.s())
/* 76:   */     {
/* 77:90 */       bcm localbcm = paramaqu.s(paramdt);
/* 78:91 */       if ((localbcm instanceof bcz)) {
/* 79:92 */         ((bcz)localbcm).a(paramamj.q());
/* 80:   */       }
/* 81:   */     }
/* 82:   */   }
/* 83:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avo
 * JD-Core Version:    0.7.0.1
 */