package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhf
/*  4:   */   extends bhc
/*  5:   */ {
/*  6:   */   private boolean a;
/*  7:   */   
/*  8:   */   public bhf(boolean paramBoolean1, boolean paramBoolean2)
/*  9:   */   {
/* 10:19 */     super(paramBoolean1);
/* 11:20 */     this.a = paramBoolean2;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 15:   */   {
/* 16:25 */     int i = paramRandom.nextInt(3) + 5;
/* 17:26 */     if (this.a) {
/* 18:27 */       i += paramRandom.nextInt(7);
/* 19:   */     }
/* 20:30 */     int j = 1;
/* 21:31 */     if ((paramdt.getY() < 1) || (paramdt.getY() + i + 1 > 256)) {
/* 22:32 */       return false;
/* 23:   */     }
/* 24:   */     int n;
/* 25:   */     int i1;
/* 26:35 */     for (int k = paramdt.getY(); k <= paramdt.getY() + 1 + i; k++)
/* 27:   */     {
/* 28:36 */       int m = 1;
/* 29:37 */       if (k == paramdt.getY()) {
/* 30:38 */         m = 0;
/* 31:   */       }
/* 32:40 */       if (k >= paramdt.getY() + 1 + i - 2) {
/* 33:41 */         m = 2;
/* 34:   */       }
/* 35:43 */       for (n = paramdt.getX() - m; (n <= paramdt.getX() + m) && (j != 0); n++) {
/* 36:44 */         for (i1 = paramdt.getZ() - m; (i1 <= paramdt.getZ() + m) && (j != 0); i1++) {
/* 37:45 */           if ((k >= 0) && (k < 256))
/* 38:   */           {
/* 39:46 */             if (!canGrowInto(paramaqu.getBlock(new BlockPosition(n, k, i1)).getType())) {
/* 40:47 */               j = 0;
/* 41:   */             }
/* 42:   */           }
/* 43:   */           else {
/* 44:50 */             j = 0;
/* 45:   */           }
/* 46:   */         }
/* 47:   */       }
/* 48:   */     }
/* 49:56 */     if (j == 0) {
/* 50:57 */       return false;
/* 51:   */     }
/* 52:60 */     BlockType localatr1 = paramaqu.getBlock(paramdt.down()).getType();
/* 53:61 */     if (((localatr1 != BlockList.grass) && (localatr1 != BlockList.dirt) && (localatr1 != BlockList.ak)) || (paramdt.getY() >= 256 - i - 1)) {
/* 54:62 */       return false;
/* 55:   */     }
/* 56:65 */     makeDirt(paramaqu, paramdt.down());
/* 57:67 */     for (int m = paramdt.getY() - 3 + i; m <= paramdt.getY() + i; m++)
/* 58:   */     {
/* 59:68 */       n = m - (paramdt.getY() + i);
/* 60:69 */       i1 = 1 - n / 2;
/* 61:70 */       for (int i2 = paramdt.getX() - i1; i2 <= paramdt.getX() + i1; i2++)
/* 62:   */       {
/* 63:71 */         int i3 = i2 - paramdt.getX();
/* 64:72 */         for (int i4 = paramdt.getZ() - i1; i4 <= paramdt.getZ() + i1; i4++)
/* 65:   */         {
/* 66:73 */           int i5 = i4 - paramdt.getZ();
/* 67:74 */           if ((Math.abs(i3) != i1) || (Math.abs(i5) != i1) || ((paramRandom.nextInt(2) != 0) && (n != 0)))
/* 68:   */           {
/* 69:77 */             BlockPosition localdt = new BlockPosition(i2, m, i4);
/* 70:78 */             BlockType localatr3 = paramaqu.getBlock(localdt).getType();
/* 71:79 */             if ((localatr3.getMaterial() == Material.air) || (localatr3.getMaterial() == Material.leaves)) {
/* 72:80 */               setBlock(paramaqu, localdt, BlockList.leaves, EnumWoodVariant.BIRCH.getIndex());
/* 73:   */             }
/* 74:   */           }
/* 75:   */         }
/* 76:   */       }
/* 77:   */     }
/* 78:85 */     for (int m = 0; m < i; m++)
/* 79:   */     {
/* 80:86 */       BlockType localatr2 = paramaqu.getBlock(paramdt.up(m)).getType();
/* 81:87 */       if ((localatr2.getMaterial() == Material.air) || (localatr2.getMaterial() == Material.leaves)) {
/* 82:88 */         setBlock(paramaqu, paramdt.up(m), BlockList.log, EnumWoodVariant.BIRCH.getIndex());
/* 83:   */       }
/* 84:   */     }
/* 85:91 */     return true;
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhf
 * JD-Core Version:    0.7.0.1
 */