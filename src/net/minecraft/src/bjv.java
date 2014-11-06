package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bjv
/*    5:     */   extends bkb
/*    6:     */ {
/*    7:     */   public bjv() {}
/*    8:     */   
/*    9:     */   public bjv(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   10:     */   {
/*   11:1167 */     super(paramInt);
/*   12:     */     
/*   13:1169 */     this.m = paramej;
/*   14:1170 */     this.l = parambjb;
/*   15:     */   }
/*   16:     */   
/*   17:     */   public void a(bms parambms, List paramList, Random paramRandom)
/*   18:     */   {
/*   19:1175 */     a((bkf)parambms, paramList, paramRandom, 1, 0, true);
/*   20:1176 */     b((bkf)parambms, paramList, paramRandom, 0, 1, true);
/*   21:1177 */     c((bkf)parambms, paramList, paramRandom, 0, 1, true);
/*   22:     */   }
/*   23:     */   
/*   24:     */   public static bjv a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   25:     */   {
/*   26:1181 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, 0, 0, 5, 7, 5, paramej);
/*   27:1183 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   28:1184 */       return null;
/*   29:     */     }
/*   30:1187 */     return new bjv(paramInt4, paramRandom, localbjb, paramej);
/*   31:     */   }
/*   32:     */   
/*   33:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   34:     */   {
/*   35:1193 */     a(paramaqu, parambjb, 0, 0, 0, 4, 1, 4, BlockList.by.instance(), BlockList.by.instance(), false);
/*   36:     */     
/*   37:1195 */     a(paramaqu, parambjb, 0, 2, 0, 4, 5, 4, BlockList.air.instance(), BlockList.air.instance(), false);
/*   38:     */     
/*   39:     */ 
/*   40:1198 */     a(paramaqu, parambjb, 0, 2, 0, 0, 5, 0, BlockList.by.instance(), BlockList.by.instance(), false);
/*   41:1199 */     a(paramaqu, parambjb, 4, 2, 0, 4, 5, 0, BlockList.by.instance(), BlockList.by.instance(), false);
/*   42:1200 */     a(paramaqu, parambjb, 0, 2, 4, 0, 5, 4, BlockList.by.instance(), BlockList.by.instance(), false);
/*   43:1201 */     a(paramaqu, parambjb, 4, 2, 4, 4, 5, 4, BlockList.by.instance(), BlockList.by.instance(), false);
/*   44:     */     
/*   45:     */ 
/*   46:1204 */     a(paramaqu, parambjb, 0, 6, 0, 4, 6, 4, BlockList.by.instance(), BlockList.by.instance(), false);
/*   47:1207 */     for (int i = 0; i <= 4; i++) {
/*   48:1208 */       for (int j = 0; j <= 4; j++) {
/*   49:1209 */         b(paramaqu, BlockList.by.instance(), i, -1, j, parambjb);
/*   50:     */       }
/*   51:     */     }
/*   52:1213 */     return true;
/*   53:     */   }
/*   54:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjv
 * JD-Core Version:    0.7.0.1
 */