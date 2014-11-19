package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bjs
/*    5:     */   extends bkb
/*    6:     */ {
/*    7:     */   public bjs() {}
/*    8:     */   
/*    9:     */   public bjs(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   10:     */   {
/*   11:1403 */     super(paramInt);
/*   12:     */     
/*   13:1405 */     this.m = paramej;
/*   14:1406 */     this.l = parambjb;
/*   15:     */   }
/*   16:     */   
/*   17:     */   public void a(bms parambms, List paramList, Random paramRandom)
/*   18:     */   {
/*   19:1411 */     a((bkf)parambms, paramList, paramRandom, 1, 0, true);
/*   20:     */   }
/*   21:     */   
/*   22:     */   public static bjs a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   23:     */   {
/*   24:1415 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, -7, 0, 5, 14, 10, paramej);
/*   25:1417 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   26:1418 */       return null;
/*   27:     */     }
/*   28:1421 */     return new bjs(paramInt4, paramRandom, localbjb, paramej);
/*   29:     */   }
/*   30:     */   
/*   31:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   32:     */   {
/*   33:1427 */     int i = a(BlockList.bA, 2);
/*   34:1428 */     for (int j = 0; j <= 9; j++)
/*   35:     */     {
/*   36:1429 */       int k = Math.max(1, 7 - j);
/*   37:1430 */       int m = Math.min(Math.max(k + 5, 14 - j), 13);
/*   38:1431 */       int n = j;
/*   39:     */       
/*   40:     */ 
/*   41:1434 */       a(paramaqu, parambjb, 0, 0, n, 4, k, n, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   42:     */       
/*   43:1436 */       a(paramaqu, parambjb, 1, k + 1, n, 3, m - 1, n, BlockList.air.instance(), BlockList.air.instance(), false);
/*   44:1437 */       if (j <= 6)
/*   45:     */       {
/*   46:1438 */         a(paramaqu, BlockList.bA.a(i), 1, k + 1, n, parambjb);
/*   47:1439 */         a(paramaqu, BlockList.bA.a(i), 2, k + 1, n, parambjb);
/*   48:1440 */         a(paramaqu, BlockList.bA.a(i), 3, k + 1, n, parambjb);
/*   49:     */       }
/*   50:1443 */       a(paramaqu, parambjb, 0, m, n, 4, m, n, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   51:     */       
/*   52:1445 */       a(paramaqu, parambjb, 0, k + 1, n, 0, m - 1, n, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   53:1446 */       a(paramaqu, parambjb, 4, k + 1, n, 4, m - 1, n, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   54:1447 */       if ((j & 0x1) == 0)
/*   55:     */       {
/*   56:1448 */         a(paramaqu, parambjb, 0, k + 2, n, 0, k + 3, n, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   57:1449 */         a(paramaqu, parambjb, 4, k + 2, n, 4, k + 3, n, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   58:     */       }
/*   59:1453 */       for (int i1 = 0; i1 <= 4; i1++) {
/*   60:1454 */         b(paramaqu, BlockList.netherBrick.instance(), i1, -1, n, parambjb);
/*   61:     */       }
/*   62:     */     }
/*   63:1458 */     return true;
/*   64:     */   }
/*   65:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjs
 * JD-Core Version:    0.7.0.1
 */