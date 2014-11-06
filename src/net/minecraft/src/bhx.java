package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhx
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  7:   */   {
/*  8:15 */     while ((paramaqu.d(paramdt)) && (paramdt.getY() > 2)) {
/*  9:16 */       paramdt = paramdt.down();
/* 10:   */     }
/* 11:19 */     if (paramaqu.getBlock(paramdt).getProto() != BlockList.aJ) {
/* 12:20 */       return false;
/* 13:   */     }
/* 14:22 */     paramdt = paramdt.up(paramRandom.nextInt(4));
/* 15:   */     
/* 16:24 */     int i = paramRandom.nextInt(4) + 7;
/* 17:25 */     int j = i / 4 + paramRandom.nextInt(2);
/* 18:27 */     if ((j > 1) && (paramRandom.nextInt(60) == 0)) {
/* 19:28 */       paramdt = paramdt.up(10 + paramRandom.nextInt(30));
/* 20:   */     }
/* 21:   */     int n;
/* 22:31 */     for (int k = 0; k < i; k++)
/* 23:   */     {
/* 24:32 */       float f1 = (1.0F - k / i) * j;
/* 25:33 */       n = MathUtils.ceil(f1);
/* 26:35 */       for (int i1 = -n; i1 <= n; i1++)
/* 27:   */       {
/* 28:36 */         float f2 = MathUtils.abs(i1) - 0.25F;
/* 29:37 */         for (int i3 = -n; i3 <= n; i3++)
/* 30:   */         {
/* 31:38 */           float f3 = MathUtils.abs(i3) - 0.25F;
/* 32:39 */           if (((i1 == 0) && (i3 == 0)) || (f2 * f2 + f3 * f3 <= f1 * f1)) {
/* 33:42 */             if (((i1 != -n) && (i1 != n) && (i3 != -n) && (i3 != n)) || 
/* 34:43 */               (paramRandom.nextFloat() <= 0.75F))
/* 35:   */             {
/* 36:48 */               ProtoBlock localatr2 = paramaqu.getBlock(paramdt.offset(i1, k, i3)).getProto();
/* 37:49 */               if ((localatr2.getMaterial() == Material.air) || (localatr2 == BlockList.dirt) || (localatr2 == BlockList.aJ) || (localatr2 == BlockList.aI)) {
/* 38:50 */                 setBlock(paramaqu, paramdt.offset(i1, k, i3), BlockList.cB);
/* 39:   */               }
/* 40:52 */               if ((k != 0) && (n > 1))
/* 41:   */               {
/* 42:53 */                 localatr2 = paramaqu.getBlock(paramdt.offset(i1, -k, i3)).getProto();
/* 43:54 */                 if ((localatr2.getMaterial() == Material.air) || (localatr2 == BlockList.dirt) || (localatr2 == BlockList.aJ) || (localatr2 == BlockList.aI)) {
/* 44:55 */                   setBlock(paramaqu, paramdt.offset(i1, -k, i3), BlockList.cB);
/* 45:   */                 }
/* 46:   */               }
/* 47:   */             }
/* 48:   */           }
/* 49:   */         }
/* 50:   */       }
/* 51:   */     }
/* 52:61 */     int k = j - 1;
/* 53:62 */     if (k < 0) {
/* 54:63 */       k = 0;
/* 55:64 */     } else if (k > 1) {
/* 56:65 */       k = 1;
/* 57:   */     }
/* 58:67 */     for (int m = -k; m <= k; m++) {
/* 59:68 */       for (n = -k; n <= k; n++)
/* 60:   */       {
/* 61:69 */         BlockPosition localdt = paramdt.offset(m, -1, n);
/* 62:70 */         int i2 = 50;
/* 63:71 */         if ((Math.abs(m) == 1) && (Math.abs(n) == 1)) {
/* 64:72 */           i2 = paramRandom.nextInt(5);
/* 65:   */         }
/* 66:74 */         while (localdt.getY() > 50)
/* 67:   */         {
/* 68:75 */           ProtoBlock localatr1 = paramaqu.getBlock(localdt).getProto();
/* 69:76 */           if ((localatr1.getMaterial() != Material.air) && (localatr1 != BlockList.dirt) && (localatr1 != BlockList.aJ) && (localatr1 != BlockList.aI) && (localatr1 != BlockList.cB)) {
/* 70:   */             break;
/* 71:   */           }
/* 72:77 */           setBlock(paramaqu, localdt, BlockList.cB);
/* 73:   */           
/* 74:   */ 
/* 75:   */ 
/* 76:81 */           localdt = localdt.down();
/* 77:82 */           i2--;
/* 78:83 */           if (i2 <= 0)
/* 79:   */           {
/* 80:84 */             localdt = localdt.down(paramRandom.nextInt(5) + 1);
/* 81:85 */             i2 = paramRandom.nextInt(5);
/* 82:   */           }
/* 83:   */         }
/* 84:   */       }
/* 85:   */     }
/* 86:91 */     return true;
/* 87:   */   }
/* 88:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhx
 * JD-Core Version:    0.7.0.1
 */