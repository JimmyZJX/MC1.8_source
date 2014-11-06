package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ public class bky
/*    4:     */   extends blb
/*    5:     */ {
/*    6:     */   public bky() {}
/*    7:     */   
/*    8:     */   public bky(EnumDirection paramej, blf paramblf, Random paramRandom)
/*    9:     */   {
/*   10:1272 */     super(1, paramej, paramblf, 1, 1, 2);
/*   11:     */   }
/*   12:     */   
/*   13:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   14:     */   {
/*   15:1277 */     blf localblf1 = this.k.b[EnumDirection.NORTH.a()];
/*   16:1278 */     blf localblf2 = this.k;
/*   17:1279 */     if (this.k.a / 25 > 0)
/*   18:     */     {
/*   19:1280 */       a(paramaqu, parambjb, 0, 8, localblf1.c[EnumDirection.DOWN.a()]);
/*   20:1281 */       a(paramaqu, parambjb, 0, 0, localblf2.c[EnumDirection.DOWN.a()]);
/*   21:     */     }
/*   22:1283 */     if (localblf2.b[EnumDirection.UP.a()] == null) {
/*   23:1284 */       a(paramaqu, parambjb, 1, 4, 1, 6, 4, 7, a);
/*   24:     */     }
/*   25:1286 */     if (localblf1.b[EnumDirection.UP.a()] == null) {
/*   26:1287 */       a(paramaqu, parambjb, 1, 4, 8, 6, 4, 14, a);
/*   27:     */     }
/*   28:1291 */     a(paramaqu, parambjb, 0, 3, 0, 0, 3, 15, b, b, false);
/*   29:1292 */     a(paramaqu, parambjb, 7, 3, 0, 7, 3, 15, b, b, false);
/*   30:1293 */     a(paramaqu, parambjb, 1, 3, 0, 7, 3, 0, b, b, false);
/*   31:1294 */     a(paramaqu, parambjb, 1, 3, 15, 6, 3, 15, b, b, false);
/*   32:1295 */     a(paramaqu, parambjb, 0, 2, 0, 0, 2, 15, a, a, false);
/*   33:1296 */     a(paramaqu, parambjb, 7, 2, 0, 7, 2, 15, a, a, false);
/*   34:1297 */     a(paramaqu, parambjb, 1, 2, 0, 7, 2, 0, a, a, false);
/*   35:1298 */     a(paramaqu, parambjb, 1, 2, 15, 6, 2, 15, a, a, false);
/*   36:1299 */     a(paramaqu, parambjb, 0, 1, 0, 0, 1, 15, b, b, false);
/*   37:1300 */     a(paramaqu, parambjb, 7, 1, 0, 7, 1, 15, b, b, false);
/*   38:1301 */     a(paramaqu, parambjb, 1, 1, 0, 7, 1, 0, b, b, false);
/*   39:1302 */     a(paramaqu, parambjb, 1, 1, 15, 6, 1, 15, b, b, false);
/*   40:     */     
/*   41:     */ 
/*   42:1305 */     a(paramaqu, parambjb, 1, 1, 1, 1, 1, 2, b, b, false);
/*   43:1306 */     a(paramaqu, parambjb, 6, 1, 1, 6, 1, 2, b, b, false);
/*   44:1307 */     a(paramaqu, parambjb, 1, 3, 1, 1, 3, 2, b, b, false);
/*   45:1308 */     a(paramaqu, parambjb, 6, 3, 1, 6, 3, 2, b, b, false);
/*   46:1309 */     a(paramaqu, parambjb, 1, 1, 13, 1, 1, 14, b, b, false);
/*   47:1310 */     a(paramaqu, parambjb, 6, 1, 13, 6, 1, 14, b, b, false);
/*   48:1311 */     a(paramaqu, parambjb, 1, 3, 13, 1, 3, 14, b, b, false);
/*   49:1312 */     a(paramaqu, parambjb, 6, 3, 13, 6, 3, 14, b, b, false);
/*   50:     */     
/*   51:     */ 
/*   52:1315 */     a(paramaqu, parambjb, 2, 1, 6, 2, 3, 6, b, b, false);
/*   53:1316 */     a(paramaqu, parambjb, 5, 1, 6, 5, 3, 6, b, b, false);
/*   54:1317 */     a(paramaqu, parambjb, 2, 1, 9, 2, 3, 9, b, b, false);
/*   55:1318 */     a(paramaqu, parambjb, 5, 1, 9, 5, 3, 9, b, b, false);
/*   56:     */     
/*   57:1320 */     a(paramaqu, parambjb, 3, 2, 6, 4, 2, 6, b, b, false);
/*   58:1321 */     a(paramaqu, parambjb, 3, 2, 9, 4, 2, 9, b, b, false);
/*   59:1322 */     a(paramaqu, parambjb, 2, 2, 7, 2, 2, 8, b, b, false);
/*   60:1323 */     a(paramaqu, parambjb, 5, 2, 7, 5, 2, 8, b, b, false);
/*   61:     */     
/*   62:1325 */     a(paramaqu, e, 2, 2, 5, parambjb);
/*   63:1326 */     a(paramaqu, e, 5, 2, 5, parambjb);
/*   64:1327 */     a(paramaqu, e, 2, 2, 10, parambjb);
/*   65:1328 */     a(paramaqu, e, 5, 2, 10, parambjb);
/*   66:1329 */     a(paramaqu, b, 2, 3, 5, parambjb);
/*   67:1330 */     a(paramaqu, b, 5, 3, 5, parambjb);
/*   68:1331 */     a(paramaqu, b, 2, 3, 10, parambjb);
/*   69:1332 */     a(paramaqu, b, 5, 3, 10, parambjb);
/*   70:1335 */     if (localblf2.c[EnumDirection.SOUTH.a()]) {
/*   71:1336 */       a(paramaqu, parambjb, 3, 1, 0, 4, 2, 0, f, f, false);
/*   72:     */     }
/*   73:1338 */     if (localblf2.c[EnumDirection.EAST.a()]) {
/*   74:1339 */       a(paramaqu, parambjb, 7, 1, 3, 7, 2, 4, f, f, false);
/*   75:     */     }
/*   76:1341 */     if (localblf2.c[EnumDirection.WEST.a()]) {
/*   77:1342 */       a(paramaqu, parambjb, 0, 1, 3, 0, 2, 4, f, f, false);
/*   78:     */     }
/*   79:1344 */     if (localblf1.c[EnumDirection.NORTH.a()]) {
/*   80:1345 */       a(paramaqu, parambjb, 3, 1, 15, 4, 2, 15, f, f, false);
/*   81:     */     }
/*   82:1347 */     if (localblf1.c[EnumDirection.WEST.a()]) {
/*   83:1348 */       a(paramaqu, parambjb, 0, 1, 11, 0, 2, 12, f, f, false);
/*   84:     */     }
/*   85:1350 */     if (localblf1.c[EnumDirection.EAST.a()]) {
/*   86:1351 */       a(paramaqu, parambjb, 7, 1, 11, 7, 2, 12, f, f, false);
/*   87:     */     }
/*   88:1354 */     return true;
/*   89:     */   }
/*   90:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bky
 * JD-Core Version:    0.7.0.1
 */