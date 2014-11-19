package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bjw
/*    5:     */   extends bkb
/*    6:     */ {
/*    7:     */   private boolean b;
/*    8:     */   
/*    9:     */   public bjw() {}
/*   10:     */   
/*   11:     */   public bjw(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   12:     */   {
/*   13:1317 */     super(paramInt);
/*   14:     */     
/*   15:1319 */     this.m = paramej;
/*   16:1320 */     this.l = parambjb;
/*   17:     */     
/*   18:1322 */     this.b = (paramRandom.nextInt(3) == 0);
/*   19:     */   }
/*   20:     */   
/*   21:     */   protected void b(NBTTagCompound paramfn)
/*   22:     */   {
/*   23:1327 */     super.b(paramfn);
/*   24:     */     
/*   25:1329 */     this.b = paramfn.getBoolean("Chest");
/*   26:     */   }
/*   27:     */   
/*   28:     */   protected void a(NBTTagCompound paramfn)
/*   29:     */   {
/*   30:1334 */     super.a(paramfn);
/*   31:     */     
/*   32:1336 */     paramfn.setBoolean("Chest", this.b);
/*   33:     */   }
/*   34:     */   
/*   35:     */   public void a(bms parambms, List paramList, Random paramRandom)
/*   36:     */   {
/*   37:1341 */     b((bkf)parambms, paramList, paramRandom, 0, 1, true);
/*   38:     */   }
/*   39:     */   
/*   40:     */   public static bjw a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   41:     */   {
/*   42:1345 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, 0, 0, 5, 7, 5, paramej);
/*   43:1347 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   44:1348 */       return null;
/*   45:     */     }
/*   46:1351 */     return new bjw(paramInt4, paramRandom, localbjb, paramej);
/*   47:     */   }
/*   48:     */   
/*   49:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   50:     */   {
/*   51:1357 */     a(paramaqu, parambjb, 0, 0, 0, 4, 1, 4, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   52:     */     
/*   53:1359 */     a(paramaqu, parambjb, 0, 2, 0, 4, 5, 4, BlockList.air.instance(), BlockList.air.instance(), false);
/*   54:     */     
/*   55:     */ 
/*   56:1362 */     a(paramaqu, parambjb, 4, 2, 0, 4, 5, 4, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   57:1363 */     a(paramaqu, parambjb, 4, 3, 1, 4, 4, 1, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   58:1364 */     a(paramaqu, parambjb, 4, 3, 3, 4, 4, 3, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   59:     */     
/*   60:1366 */     a(paramaqu, parambjb, 0, 2, 0, 0, 5, 0, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   61:     */     
/*   62:1368 */     a(paramaqu, parambjb, 0, 2, 4, 3, 5, 4, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   63:1369 */     a(paramaqu, parambjb, 1, 3, 4, 1, 4, 4, BlockList.bz.instance(), BlockList.netherBrick.instance(), false);
/*   64:1370 */     a(paramaqu, parambjb, 3, 3, 4, 3, 4, 4, BlockList.bz.instance(), BlockList.netherBrick.instance(), false);
/*   65:1372 */     if ((this.b) && 
/*   66:1373 */       (parambjb.b(new BlockPosition(a(3, 3), d(2), b(3, 3)))))
/*   67:     */     {
/*   68:1374 */       this.b = false;
/*   69:1375 */       a(paramaqu, parambjb, paramRandom, 3, 2, 3, a, 2 + paramRandom.nextInt(4));
/*   70:     */     }
/*   71:1380 */     a(paramaqu, parambjb, 0, 6, 0, 4, 6, 4, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   72:1383 */     for (int i = 0; i <= 4; i++) {
/*   73:1384 */       for (int j = 0; j <= 4; j++) {
/*   74:1385 */         b(paramaqu, BlockList.netherBrick.instance(), i, -1, j, parambjb);
/*   75:     */       }
/*   76:     */     }
/*   77:1389 */     return true;
/*   78:     */   }
/*   79:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjw
 * JD-Core Version:    0.7.0.1
 */