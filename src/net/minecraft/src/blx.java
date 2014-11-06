package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class blx
/*    5:     */   extends bmk
/*    6:     */ {
/*    7:     */   private boolean a;
/*    8:     */   private boolean b;
/*    9:     */   private boolean c;
/*   10:     */   private boolean e;
/*   11:     */   
/*   12:     */   public blx() {}
/*   13:     */   
/*   14:     */   public blx(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   15:     */   {
/*   16:1329 */     super(paramInt);
/*   17:     */     
/*   18:1331 */     this.m = paramej;
/*   19:1332 */     this.d = a(paramRandom);
/*   20:1333 */     this.l = parambjb;
/*   21:     */     
/*   22:1335 */     this.a = paramRandom.nextBoolean();
/*   23:1336 */     this.b = paramRandom.nextBoolean();
/*   24:1337 */     this.c = paramRandom.nextBoolean();
/*   25:1338 */     this.e = (paramRandom.nextInt(3) > 0);
/*   26:     */   }
/*   27:     */   
/*   28:     */   protected void a(NBTTagCompound paramfn)
/*   29:     */   {
/*   30:1343 */     super.a(paramfn);
/*   31:1344 */     paramfn.setBoolean("leftLow", this.a);
/*   32:1345 */     paramfn.setBoolean("leftHigh", this.b);
/*   33:1346 */     paramfn.setBoolean("rightLow", this.c);
/*   34:1347 */     paramfn.setBoolean("rightHigh", this.e);
/*   35:     */   }
/*   36:     */   
/*   37:     */   protected void b(NBTTagCompound paramfn)
/*   38:     */   {
/*   39:1352 */     super.b(paramfn);
/*   40:1353 */     this.a = paramfn.getBoolean("leftLow");
/*   41:1354 */     this.b = paramfn.getBoolean("leftHigh");
/*   42:1355 */     this.c = paramfn.getBoolean("rightLow");
/*   43:1356 */     this.e = paramfn.getBoolean("rightHigh");
/*   44:     */   }
/*   45:     */   
/*   46:     */   public void a(bms parambms, List paramList, Random paramRandom)
/*   47:     */   {
/*   48:1361 */     int i = 3;
/*   49:1362 */     int j = 5;
/*   50:1364 */     if ((this.m == EnumDirection.WEST) || (this.m == EnumDirection.NORTH))
/*   51:     */     {
/*   52:1365 */       i = 8 - i;
/*   53:1366 */       j = 8 - j;
/*   54:     */     }
/*   55:1369 */     a((bmh)parambms, paramList, paramRandom, 5, 1);
/*   56:1370 */     if (this.a) {
/*   57:1371 */       b((bmh)parambms, paramList, paramRandom, i, 1);
/*   58:     */     }
/*   59:1373 */     if (this.b) {
/*   60:1374 */       b((bmh)parambms, paramList, paramRandom, j, 7);
/*   61:     */     }
/*   62:1376 */     if (this.c) {
/*   63:1377 */       c((bmh)parambms, paramList, paramRandom, i, 1);
/*   64:     */     }
/*   65:1379 */     if (this.e) {
/*   66:1380 */       c((bmh)parambms, paramList, paramRandom, j, 7);
/*   67:     */     }
/*   68:     */   }
/*   69:     */   
/*   70:     */   public static blx a(List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   71:     */   {
/*   72:1385 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -4, -3, 0, 10, 9, 11, paramej);
/*   73:1387 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   74:1388 */       return null;
/*   75:     */     }
/*   76:1391 */     return new blx(paramInt4, paramRandom, localbjb, paramej);
/*   77:     */   }
/*   78:     */   
/*   79:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   80:     */   {
/*   81:1396 */     if (a(paramaqu, parambjb)) {
/*   82:1397 */       return false;
/*   83:     */     }
/*   84:1401 */     a(paramaqu, parambjb, 0, 0, 0, 9, 8, 10, true, paramRandom, blr.c());
/*   85:     */     
/*   86:1403 */     a(paramaqu, paramRandom, parambjb, this.d, 4, 3, 0);
/*   87:1406 */     if (this.a) {
/*   88:1407 */       a(paramaqu, parambjb, 0, 3, 1, 0, 5, 3, BlockList.air.instance(), BlockList.air.instance(), false);
/*   89:     */     }
/*   90:1409 */     if (this.c) {
/*   91:1410 */       a(paramaqu, parambjb, 9, 3, 1, 9, 5, 3, BlockList.air.instance(), BlockList.air.instance(), false);
/*   92:     */     }
/*   93:1412 */     if (this.b) {
/*   94:1413 */       a(paramaqu, parambjb, 0, 5, 7, 0, 7, 9, BlockList.air.instance(), BlockList.air.instance(), false);
/*   95:     */     }
/*   96:1415 */     if (this.e) {
/*   97:1416 */       a(paramaqu, parambjb, 9, 5, 7, 9, 7, 9, BlockList.air.instance(), BlockList.air.instance(), false);
/*   98:     */     }
/*   99:1418 */     a(paramaqu, parambjb, 5, 1, 10, 7, 3, 10, BlockList.air.instance(), BlockList.air.instance(), false);
/*  100:     */     
/*  101:     */ 
/*  102:1421 */     a(paramaqu, parambjb, 1, 2, 1, 8, 2, 6, false, paramRandom, blr.c());
/*  103:     */     
/*  104:1423 */     a(paramaqu, parambjb, 4, 1, 5, 4, 4, 9, false, paramRandom, blr.c());
/*  105:1424 */     a(paramaqu, parambjb, 8, 1, 5, 8, 4, 9, false, paramRandom, blr.c());
/*  106:     */     
/*  107:1426 */     a(paramaqu, parambjb, 1, 4, 7, 3, 4, 9, false, paramRandom, blr.c());
/*  108:     */     
/*  109:     */ 
/*  110:1429 */     a(paramaqu, parambjb, 1, 3, 5, 3, 3, 6, false, paramRandom, blr.c());
/*  111:1430 */     a(paramaqu, parambjb, 1, 3, 4, 3, 3, 4, BlockList.U.instance(), BlockList.U.instance(), false);
/*  112:1431 */     a(paramaqu, parambjb, 1, 4, 6, 3, 4, 6, BlockList.U.instance(), BlockList.U.instance(), false);
/*  113:     */     
/*  114:     */ 
/*  115:1434 */     a(paramaqu, parambjb, 5, 1, 7, 7, 1, 8, false, paramRandom, blr.c());
/*  116:1435 */     a(paramaqu, parambjb, 5, 1, 9, 7, 1, 9, BlockList.U.instance(), BlockList.U.instance(), false);
/*  117:1436 */     a(paramaqu, parambjb, 5, 2, 7, 7, 2, 7, BlockList.U.instance(), BlockList.U.instance(), false);
/*  118:     */     
/*  119:     */ 
/*  120:1439 */     a(paramaqu, parambjb, 4, 5, 7, 4, 5, 9, BlockList.U.instance(), BlockList.U.instance(), false);
/*  121:1440 */     a(paramaqu, parambjb, 8, 5, 7, 8, 5, 9, BlockList.U.instance(), BlockList.U.instance(), false);
/*  122:1441 */     a(paramaqu, parambjb, 5, 5, 7, 7, 5, 9, BlockList.T.instance(), BlockList.T.instance(), false);
/*  123:1442 */     a(paramaqu, BlockList.torch.instance(), 6, 5, 6, parambjb);
/*  124:     */     
/*  125:1444 */     return true;
/*  126:     */   }
/*  127:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     blx
 * JD-Core Version:    0.7.0.1
 */