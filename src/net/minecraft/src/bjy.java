package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bjy
/*    5:     */   extends bkb
/*    6:     */ {
/*    7:     */   private boolean b;
/*    8:     */   
/*    9:     */   public bjy() {}
/*   10:     */   
/*   11:     */   public bjy(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   12:     */   {
/*   13:1229 */     super(paramInt);
/*   14:     */     
/*   15:1231 */     this.m = paramej;
/*   16:1232 */     this.l = parambjb;
/*   17:     */     
/*   18:1234 */     this.b = (paramRandom.nextInt(3) == 0);
/*   19:     */   }
/*   20:     */   
/*   21:     */   protected void b(NBTTagCompound paramfn)
/*   22:     */   {
/*   23:1239 */     super.b(paramfn);
/*   24:     */     
/*   25:1241 */     this.b = paramfn.getBoolean("Chest");
/*   26:     */   }
/*   27:     */   
/*   28:     */   protected void a(NBTTagCompound paramfn)
/*   29:     */   {
/*   30:1246 */     super.a(paramfn);
/*   31:     */     
/*   32:1248 */     paramfn.setBoolean("Chest", this.b);
/*   33:     */   }
/*   34:     */   
/*   35:     */   public void a(bms parambms, List paramList, Random paramRandom)
/*   36:     */   {
/*   37:1253 */     c((bkf)parambms, paramList, paramRandom, 0, 1, true);
/*   38:     */   }
/*   39:     */   
/*   40:     */   public static bjy a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   41:     */   {
/*   42:1257 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, 0, 0, 5, 7, 5, paramej);
/*   43:1259 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   44:1260 */       return null;
/*   45:     */     }
/*   46:1263 */     return new bjy(paramInt4, paramRandom, localbjb, paramej);
/*   47:     */   }
/*   48:     */   
/*   49:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   50:     */   {
/*   51:1269 */     a(paramaqu, parambjb, 0, 0, 0, 4, 1, 4, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   52:     */     
/*   53:1271 */     a(paramaqu, parambjb, 0, 2, 0, 4, 5, 4, BlockList.air.instance(), BlockList.air.instance(), false);
/*   54:     */     
/*   55:     */ 
/*   56:1274 */     a(paramaqu, parambjb, 0, 2, 0, 0, 5, 4, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   57:1275 */     a(paramaqu, parambjb, 0, 3, 1, 0, 4, 1, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   58:1276 */     a(paramaqu, parambjb, 0, 3, 3, 0, 4, 3, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   59:     */     
/*   60:1278 */     a(paramaqu, parambjb, 4, 2, 0, 4, 5, 0, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   61:     */     
/*   62:1280 */     a(paramaqu, parambjb, 1, 2, 4, 4, 5, 4, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   63:1281 */     a(paramaqu, parambjb, 1, 3, 4, 1, 4, 4, BlockList.bz.instance(), BlockList.netherBrick.instance(), false);
/*   64:1282 */     a(paramaqu, parambjb, 3, 3, 4, 3, 4, 4, BlockList.bz.instance(), BlockList.netherBrick.instance(), false);
/*   65:1284 */     if ((this.b) && 
/*   66:1285 */       (parambjb.b(new BlockPosition(a(1, 3), d(2), b(1, 3)))))
/*   67:     */     {
/*   68:1286 */       this.b = false;
/*   69:1287 */       a(paramaqu, parambjb, paramRandom, 1, 2, 3, a, 2 + paramRandom.nextInt(4));
/*   70:     */     }
/*   71:1292 */     a(paramaqu, parambjb, 0, 6, 0, 4, 6, 4, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   72:1295 */     for (int i = 0; i <= 4; i++) {
/*   73:1296 */       for (int j = 0; j <= 4; j++) {
/*   74:1297 */         b(paramaqu, BlockList.netherBrick.instance(), i, -1, j, parambjb);
/*   75:     */       }
/*   76:     */     }
/*   77:1301 */     return true;
/*   78:     */   }
/*   79:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjy
 * JD-Core Version:    0.7.0.1
 */