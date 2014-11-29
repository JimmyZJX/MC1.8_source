package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhr
/*  4:   */   extends bir
/*  5:   */ {
/*  6:   */   private int a;
/*  7:   */   private int b;
/*  8:   */   
/*  9:   */   public bhr(int paramInt1, int paramInt2)
/* 10:   */   {
/* 11:16 */     super(false);
/* 12:17 */     this.b = paramInt1;
/* 13:18 */     this.a = paramInt2;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 17:   */   {
/* 18:   */     BlockType localatr1;
/* 19:25 */     while ((((localatr1 = paramaqu.getBlock(paramdt).getType()).getMaterial() == Material.air) || (localatr1.getMaterial() == Material.leaves)) && (paramdt.getY() > 0)) {
/* 20:26 */       paramdt = paramdt.down();
/* 21:   */     }
/* 22:29 */     BlockType localatr2 = paramaqu.getBlock(paramdt).getType();
/* 23:30 */     if ((localatr2 == BlockList.dirt) || (localatr2 == BlockList.grass))
/* 24:   */     {
/* 25:31 */       paramdt = paramdt.up();
/* 26:32 */       setBlock(paramaqu, paramdt, BlockList.log, this.b);
/* 27:34 */       for (int i = paramdt.getY(); i <= paramdt.getY() + 2; i++)
/* 28:   */       {
/* 29:35 */         int j = i - paramdt.getY();
/* 30:36 */         int k = 2 - j;
/* 31:37 */         for (int m = paramdt.getX() - k; m <= paramdt.getX() + k; m++)
/* 32:   */         {
/* 33:38 */           int n = m - paramdt.getX();
/* 34:39 */           for (int i1 = paramdt.getZ() - k; i1 <= paramdt.getZ() + k; i1++)
/* 35:   */           {
/* 36:40 */             int i2 = i1 - paramdt.getZ();
/* 37:41 */             if ((Math.abs(n) != k) || (Math.abs(i2) != k) || (paramRandom.nextInt(2) != 0))
/* 38:   */             {
/* 39:44 */               BlockPosition localdt = new BlockPosition(m, i, i1);
/* 40:45 */               if (!paramaqu.getBlock(localdt).getType().m()) {
/* 41:46 */                 setBlock(paramaqu, localdt, BlockList.leaves, this.a);
/* 42:   */               }
/* 43:   */             }
/* 44:   */           }
/* 45:   */         }
/* 46:   */       }
/* 47:   */     }
/* 48:52 */     return true;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhr
 * JD-Core Version:    0.7.0.1
 */