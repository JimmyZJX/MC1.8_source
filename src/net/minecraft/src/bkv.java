package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ public class bkv
/*    4:     */   extends blb
/*    5:     */ {
/*    6:     */   public bkv() {}
/*    7:     */   
/*    8:     */   public bkv(EnumDirection paramej, blf paramblf, Random paramRandom)
/*    9:     */   {
/*   10:1364 */     super(1, paramej, paramblf, 2, 2, 1);
/*   11:     */   }
/*   12:     */   
/*   13:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   14:     */   {
/*   15:1369 */     blf localblf1 = this.k.b[EnumDirection.EAST.a()];
/*   16:1370 */     blf localblf2 = this.k;
/*   17:1371 */     blf localblf3 = localblf2.b[EnumDirection.UP.a()];
/*   18:1372 */     blf localblf4 = localblf1.b[EnumDirection.UP.a()];
/*   19:1376 */     if (this.k.a / 25 > 0)
/*   20:     */     {
/*   21:1377 */       a(paramaqu, parambjb, 8, 0, localblf1.c[EnumDirection.DOWN.a()]);
/*   22:1378 */       a(paramaqu, parambjb, 0, 0, localblf2.c[EnumDirection.DOWN.a()]);
/*   23:     */     }
/*   24:1380 */     if (localblf3.b[EnumDirection.UP.a()] == null) {
/*   25:1381 */       a(paramaqu, parambjb, 1, 8, 1, 7, 8, 6, a);
/*   26:     */     }
/*   27:1383 */     if (localblf4.b[EnumDirection.UP.a()] == null) {
/*   28:1384 */       a(paramaqu, parambjb, 8, 8, 1, 14, 8, 6, a);
/*   29:     */     }
/*   30:1388 */     for (int i = 1; i <= 7; i++)
/*   31:     */     {
/*   32:1389 */       Block localbec = b;
/*   33:1390 */       if ((i == 2) || (i == 6)) {
/*   34:1391 */         localbec = a;
/*   35:     */       }
/*   36:1393 */       a(paramaqu, parambjb, 0, i, 0, 0, i, 7, localbec, localbec, false);
/*   37:1394 */       a(paramaqu, parambjb, 15, i, 0, 15, i, 7, localbec, localbec, false);
/*   38:1395 */       a(paramaqu, parambjb, 1, i, 0, 15, i, 0, localbec, localbec, false);
/*   39:1396 */       a(paramaqu, parambjb, 1, i, 7, 14, i, 7, localbec, localbec, false);
/*   40:     */     }
/*   41:1400 */     a(paramaqu, parambjb, 2, 1, 3, 2, 7, 4, b, b, false);
/*   42:1401 */     a(paramaqu, parambjb, 3, 1, 2, 4, 7, 2, b, b, false);
/*   43:1402 */     a(paramaqu, parambjb, 3, 1, 5, 4, 7, 5, b, b, false);
/*   44:1403 */     a(paramaqu, parambjb, 13, 1, 3, 13, 7, 4, b, b, false);
/*   45:1404 */     a(paramaqu, parambjb, 11, 1, 2, 12, 7, 2, b, b, false);
/*   46:1405 */     a(paramaqu, parambjb, 11, 1, 5, 12, 7, 5, b, b, false);
/*   47:     */     
/*   48:1407 */     a(paramaqu, parambjb, 5, 1, 3, 5, 3, 4, b, b, false);
/*   49:1408 */     a(paramaqu, parambjb, 10, 1, 3, 10, 3, 4, b, b, false);
/*   50:     */     
/*   51:1410 */     a(paramaqu, parambjb, 5, 7, 2, 10, 7, 5, b, b, false);
/*   52:1411 */     a(paramaqu, parambjb, 5, 5, 2, 5, 7, 2, b, b, false);
/*   53:1412 */     a(paramaqu, parambjb, 10, 5, 2, 10, 7, 2, b, b, false);
/*   54:1413 */     a(paramaqu, parambjb, 5, 5, 5, 5, 7, 5, b, b, false);
/*   55:1414 */     a(paramaqu, parambjb, 10, 5, 5, 10, 7, 5, b, b, false);
/*   56:1415 */     a(paramaqu, b, 6, 6, 2, parambjb);
/*   57:1416 */     a(paramaqu, b, 9, 6, 2, parambjb);
/*   58:1417 */     a(paramaqu, b, 6, 6, 5, parambjb);
/*   59:1418 */     a(paramaqu, b, 9, 6, 5, parambjb);
/*   60:     */     
/*   61:1420 */     a(paramaqu, parambjb, 5, 4, 3, 6, 4, 4, b, b, false);
/*   62:1421 */     a(paramaqu, parambjb, 9, 4, 3, 10, 4, 4, b, b, false);
/*   63:1422 */     a(paramaqu, e, 5, 4, 2, parambjb);
/*   64:1423 */     a(paramaqu, e, 5, 4, 5, parambjb);
/*   65:1424 */     a(paramaqu, e, 10, 4, 2, parambjb);
/*   66:1425 */     a(paramaqu, e, 10, 4, 5, parambjb);
/*   67:1428 */     if (localblf2.c[EnumDirection.SOUTH.a()]) {
/*   68:1429 */       a(paramaqu, parambjb, 3, 1, 0, 4, 2, 0, f, f, false);
/*   69:     */     }
/*   70:1431 */     if (localblf2.c[EnumDirection.NORTH.a()]) {
/*   71:1432 */       a(paramaqu, parambjb, 3, 1, 7, 4, 2, 7, f, f, false);
/*   72:     */     }
/*   73:1434 */     if (localblf2.c[EnumDirection.WEST.a()]) {
/*   74:1435 */       a(paramaqu, parambjb, 0, 1, 3, 0, 2, 4, f, f, false);
/*   75:     */     }
/*   76:1437 */     if (localblf1.c[EnumDirection.SOUTH.a()]) {
/*   77:1438 */       a(paramaqu, parambjb, 11, 1, 0, 12, 2, 0, f, f, false);
/*   78:     */     }
/*   79:1440 */     if (localblf1.c[EnumDirection.NORTH.a()]) {
/*   80:1441 */       a(paramaqu, parambjb, 11, 1, 7, 12, 2, 7, f, f, false);
/*   81:     */     }
/*   82:1443 */     if (localblf1.c[EnumDirection.EAST.a()]) {
/*   83:1444 */       a(paramaqu, parambjb, 15, 1, 3, 15, 2, 4, f, f, false);
/*   84:     */     }
/*   85:1446 */     if (localblf3.c[EnumDirection.SOUTH.a()]) {
/*   86:1447 */       a(paramaqu, parambjb, 3, 5, 0, 4, 6, 0, f, f, false);
/*   87:     */     }
/*   88:1449 */     if (localblf3.c[EnumDirection.NORTH.a()]) {
/*   89:1450 */       a(paramaqu, parambjb, 3, 5, 7, 4, 6, 7, f, f, false);
/*   90:     */     }
/*   91:1452 */     if (localblf3.c[EnumDirection.WEST.a()]) {
/*   92:1453 */       a(paramaqu, parambjb, 0, 5, 3, 0, 6, 4, f, f, false);
/*   93:     */     }
/*   94:1455 */     if (localblf4.c[EnumDirection.SOUTH.a()]) {
/*   95:1456 */       a(paramaqu, parambjb, 11, 5, 0, 12, 6, 0, f, f, false);
/*   96:     */     }
/*   97:1458 */     if (localblf4.c[EnumDirection.NORTH.a()]) {
/*   98:1459 */       a(paramaqu, parambjb, 11, 5, 7, 12, 6, 7, f, f, false);
/*   99:     */     }
/*  100:1461 */     if (localblf4.c[EnumDirection.EAST.a()]) {
/*  101:1462 */       a(paramaqu, parambjb, 15, 5, 3, 15, 6, 4, f, f, false);
/*  102:     */     }
/*  103:1465 */     return true;
/*  104:     */   }
/*  105:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkv
 * JD-Core Version:    0.7.0.1
 */