package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class big
/*  4:   */   extends bhc
/*  5:   */ {
/*  6:   */   public big()
/*  7:   */   {
/*  8:14 */     super(false);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 12:   */   {
/* 13:20 */     int i = paramRandom.nextInt(5) + 7;
/* 14:21 */     int j = i - paramRandom.nextInt(2) - 3;
/* 15:22 */     int k = i - j;
/* 16:23 */     int m = 1 + paramRandom.nextInt(k + 1);
/* 17:   */     
/* 18:25 */     int n = 1;
/* 19:27 */     if ((paramdt.getY() < 1) || (paramdt.getY() + i + 1 > 256)) {
/* 20:28 */       return false;
/* 21:   */     }
/* 22:   */     int i4;
/* 23:32 */     for (int i1 = paramdt.getY(); (i1 <= paramdt.getY() + 1 + i) && (n != 0); i1++)
/* 24:   */     {
/* 25:33 */       int i2 = 1;
/* 26:34 */       if (i1 - paramdt.getY() < j) {
/* 27:35 */         i2 = 0;
/* 28:   */       } else {
/* 29:37 */         i2 = m;
/* 30:   */       }
/* 31:39 */       for (int i3 = paramdt.getX() - i2; (i3 <= paramdt.getX() + i2) && (n != 0); i3++) {
/* 32:40 */         for (i4 = paramdt.getZ() - i2; (i4 <= paramdt.getZ() + i2) && (n != 0); i4++) {
/* 33:41 */           if ((i1 >= 0) && (i1 < 256))
/* 34:   */           {
/* 35:42 */             if (!canGrowInto(paramaqu.getBlock(new BlockPosition(i3, i1, i4)).getProto())) {
/* 36:43 */               n = 0;
/* 37:   */             }
/* 38:   */           }
/* 39:   */           else {
/* 40:46 */             n = 0;
/* 41:   */           }
/* 42:   */         }
/* 43:   */       }
/* 44:   */     }
/* 45:52 */     if (n == 0) {
/* 46:53 */       return false;
/* 47:   */     }
/* 48:57 */     ProtoBlock localatr1 = paramaqu.getBlock(paramdt.down()).getProto();
/* 49:58 */     if (((localatr1 != BlockList.grass) && (localatr1 != BlockList.dirt)) || (paramdt.getY() >= 256 - i - 1)) {
/* 50:59 */       return false;
/* 51:   */     }
/* 52:62 */     makeDirt(paramaqu, paramdt.down());
/* 53:   */     
/* 54:   */ 
/* 55:65 */     int i2 = 0;
/* 56:66 */     for (int i3 = paramdt.getY() + i; i3 >= paramdt.getY() + j; i3--)
/* 57:   */     {
/* 58:67 */       for (i4 = paramdt.getX() - i2; i4 <= paramdt.getX() + i2; i4++)
/* 59:   */       {
/* 60:68 */         int i5 = i4 - paramdt.getX();
/* 61:69 */         for (int i6 = paramdt.getZ() - i2; i6 <= paramdt.getZ() + i2; i6++)
/* 62:   */         {
/* 63:70 */           int i7 = i6 - paramdt.getZ();
/* 64:71 */           if ((Math.abs(i5) != i2) || (Math.abs(i7) != i2) || (i2 <= 0))
/* 65:   */           {
/* 66:74 */             BlockPosition localdt = new BlockPosition(i4, i3, i6);
/* 67:75 */             if (!paramaqu.getBlock(localdt).getProto().m()) {
/* 68:76 */               setBlock(paramaqu, localdt, BlockList.leaves, EnumWoodVariant.SPRUCE.getIndex());
/* 69:   */             }
/* 70:   */           }
/* 71:   */         }
/* 72:   */       }
/* 73:81 */       if ((i2 >= 1) && (i3 == paramdt.getY() + j + 1)) {
/* 74:82 */         i2--;
/* 75:83 */       } else if (i2 < m) {
/* 76:84 */         i2++;
/* 77:   */       }
/* 78:   */     }
/* 79:87 */     for (int i3 = 0; i3 < i - 1; i3++)
/* 80:   */     {
/* 81:88 */       ProtoBlock localatr2 = paramaqu.getBlock(paramdt.up(i3)).getProto();
/* 82:89 */       if ((localatr2.getMaterial() == Material.air) || (localatr2.getMaterial() == Material.leaves)) {
/* 83:90 */         setBlock(paramaqu, paramdt.up(i3), BlockList.log, EnumWoodVariant.SPRUCE.getIndex());
/* 84:   */       }
/* 85:   */     }
/* 86:93 */     return true;
/* 87:   */   }
/* 88:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     big
 * JD-Core Version:    0.7.0.1
 */