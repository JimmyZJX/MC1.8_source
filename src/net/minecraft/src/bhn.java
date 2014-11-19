package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicates;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class bhn
/*  5:   */   extends bhp
/*  6:   */ {
/*  7:15 */   private static final beq a = beq.a(BlockList.sand).a(BlockSand.a, Predicates.<Comparable>equalTo(bac.a));
/*  8:16 */   private final Block b = BlockList.U.instance().a(bbf.M, bbg.b).a(BlockSlab.half, EnumSlabHalf.BOTTOM);
/*  9:17 */   private final Block c = BlockList.A.instance();
/* 10:18 */   private final Block d = BlockList.flowingWater.instance();
/* 11:   */   
/* 12:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 13:   */   {
/* 14:22 */     while ((paramaqu.isEmpty(paramdt)) && (paramdt.getY() > 2)) {
/* 15:23 */       paramdt = paramdt.down();
/* 16:   */     }
/* 17:26 */     if (!a.apply(paramaqu.getBlock(paramdt))) {
/* 18:27 */       return false;
/* 19:   */     }
/* 20:   */     int k;
/* 21:31 */     for (int i = -2; i <= 2; i++) {
/* 22:32 */       for (k = -2; k <= 2; k++) {
/* 23:33 */         if ((paramaqu.isEmpty(paramdt.offset(i, -1, k))) && (paramaqu.isEmpty(paramdt.offset(i, -2, k)))) {
/* 24:34 */           return false;
/* 25:   */         }
/* 26:   */       }
/* 27:   */     }
/* 28:40 */     for (int i = -1; i <= 0; i++) {
/* 29:41 */       for (k = -2; k <= 2; k++) {
/* 30:42 */         for (int n = -2; n <= 2; n++) {
/* 31:43 */           paramaqu.setBlock(paramdt.offset(k, i, n), this.c, 2);
/* 32:   */         }
/* 33:   */       }
/* 34:   */     }
/* 35:49 */     paramaqu.setBlock(paramdt, this.d, 2);
/* 36:50 */     for (EnumDirection localej : en.HORIZONTAL) {
/* 37:51 */       paramaqu.setBlock(paramdt.a(localej), this.d, 2);
/* 38:   */     }
/* 39:   */     int m;
/* 40:55 */     for (int j = -2; j <= 2; j++) {
/* 41:56 */       for (m = -2; m <= 2; m++) {
/* 42:57 */         if ((j == -2) || (j == 2) || (m == -2) || (m == 2)) {
/* 43:58 */           paramaqu.setBlock(paramdt.offset(j, 1, m), this.c, 2);
/* 44:   */         }
/* 45:   */       }
/* 46:   */     }
/* 47:63 */     paramaqu.setBlock(paramdt.offset(2, 1, 0), this.b, 2);
/* 48:64 */     paramaqu.setBlock(paramdt.offset(-2, 1, 0), this.b, 2);
/* 49:65 */     paramaqu.setBlock(paramdt.offset(0, 1, 2), this.b, 2);
/* 50:66 */     paramaqu.setBlock(paramdt.offset(0, 1, -2), this.b, 2);
/* 51:69 */     for (int j = -1; j <= 1; j++) {
/* 52:70 */       for (m = -1; m <= 1; m++) {
/* 53:71 */         if ((j == 0) && (m == 0)) {
/* 54:72 */           paramaqu.setBlock(paramdt.offset(j, 4, m), this.c, 2);
/* 55:   */         } else {
/* 56:74 */           paramaqu.setBlock(paramdt.offset(j, 4, m), this.b, 2);
/* 57:   */         }
/* 58:   */       }
/* 59:   */     }
/* 60:80 */     for (int j = 1; j <= 3; j++)
/* 61:   */     {
/* 62:81 */       paramaqu.setBlock(paramdt.offset(-1, j, -1), this.c, 2);
/* 63:82 */       paramaqu.setBlock(paramdt.offset(-1, j, 1), this.c, 2);
/* 64:83 */       paramaqu.setBlock(paramdt.offset(1, j, -1), this.c, 2);
/* 65:84 */       paramaqu.setBlock(paramdt.offset(1, j, 1), this.c, 2);
/* 66:   */     }
/* 67:87 */     return true;
/* 68:   */   }
/* 69:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhn
 * JD-Core Version:    0.7.0.1
 */