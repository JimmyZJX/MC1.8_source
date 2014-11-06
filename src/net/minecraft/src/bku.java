package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ public class bku
/*    4:     */   extends blb
/*    5:     */ {
/*    6:     */   public bku() {}
/*    7:     */   
/*    8:     */   public bku(EnumDirection paramej, blf paramblf, Random paramRandom)
/*    9:     */   {
/*   10:1202 */     super(1, paramej, paramblf, 2, 1, 1);
/*   11:     */   }
/*   12:     */   
/*   13:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   14:     */   {
/*   15:1207 */     blf localblf1 = this.k.b[EnumDirection.EAST.a()];
/*   16:1208 */     blf localblf2 = this.k;
/*   17:1209 */     if (this.k.a / 25 > 0)
/*   18:     */     {
/*   19:1210 */       a(paramaqu, parambjb, 8, 0, localblf1.c[EnumDirection.DOWN.a()]);
/*   20:1211 */       a(paramaqu, parambjb, 0, 0, localblf2.c[EnumDirection.DOWN.a()]);
/*   21:     */     }
/*   22:1213 */     if (localblf2.b[EnumDirection.UP.a()] == null) {
/*   23:1214 */       a(paramaqu, parambjb, 1, 4, 1, 7, 4, 6, a);
/*   24:     */     }
/*   25:1216 */     if (localblf1.b[EnumDirection.UP.a()] == null) {
/*   26:1217 */       a(paramaqu, parambjb, 8, 4, 1, 14, 4, 6, a);
/*   27:     */     }
/*   28:1221 */     a(paramaqu, parambjb, 0, 3, 0, 0, 3, 7, b, b, false);
/*   29:1222 */     a(paramaqu, parambjb, 15, 3, 0, 15, 3, 7, b, b, false);
/*   30:1223 */     a(paramaqu, parambjb, 1, 3, 0, 15, 3, 0, b, b, false);
/*   31:1224 */     a(paramaqu, parambjb, 1, 3, 7, 14, 3, 7, b, b, false);
/*   32:1225 */     a(paramaqu, parambjb, 0, 2, 0, 0, 2, 7, a, a, false);
/*   33:1226 */     a(paramaqu, parambjb, 15, 2, 0, 15, 2, 7, a, a, false);
/*   34:1227 */     a(paramaqu, parambjb, 1, 2, 0, 15, 2, 0, a, a, false);
/*   35:1228 */     a(paramaqu, parambjb, 1, 2, 7, 14, 2, 7, a, a, false);
/*   36:1229 */     a(paramaqu, parambjb, 0, 1, 0, 0, 1, 7, b, b, false);
/*   37:1230 */     a(paramaqu, parambjb, 15, 1, 0, 15, 1, 7, b, b, false);
/*   38:1231 */     a(paramaqu, parambjb, 1, 1, 0, 15, 1, 0, b, b, false);
/*   39:1232 */     a(paramaqu, parambjb, 1, 1, 7, 14, 1, 7, b, b, false);
/*   40:     */     
/*   41:     */ 
/*   42:1235 */     a(paramaqu, parambjb, 5, 1, 0, 10, 1, 4, b, b, false);
/*   43:1236 */     a(paramaqu, parambjb, 6, 2, 0, 9, 2, 3, a, a, false);
/*   44:1237 */     a(paramaqu, parambjb, 5, 3, 0, 10, 3, 4, b, b, false);
/*   45:     */     
/*   46:1239 */     a(paramaqu, e, 6, 2, 3, parambjb);
/*   47:1240 */     a(paramaqu, e, 9, 2, 3, parambjb);
/*   48:1243 */     if (localblf2.c[EnumDirection.SOUTH.a()]) {
/*   49:1244 */       a(paramaqu, parambjb, 3, 1, 0, 4, 2, 0, f, f, false);
/*   50:     */     }
/*   51:1246 */     if (localblf2.c[EnumDirection.NORTH.a()]) {
/*   52:1247 */       a(paramaqu, parambjb, 3, 1, 7, 4, 2, 7, f, f, false);
/*   53:     */     }
/*   54:1249 */     if (localblf2.c[EnumDirection.WEST.a()]) {
/*   55:1250 */       a(paramaqu, parambjb, 0, 1, 3, 0, 2, 4, f, f, false);
/*   56:     */     }
/*   57:1252 */     if (localblf1.c[EnumDirection.SOUTH.a()]) {
/*   58:1253 */       a(paramaqu, parambjb, 11, 1, 0, 12, 2, 0, f, f, false);
/*   59:     */     }
/*   60:1255 */     if (localblf1.c[EnumDirection.NORTH.a()]) {
/*   61:1256 */       a(paramaqu, parambjb, 11, 1, 7, 12, 2, 7, f, f, false);
/*   62:     */     }
/*   63:1258 */     if (localblf1.c[EnumDirection.EAST.a()]) {
/*   64:1259 */       a(paramaqu, parambjb, 15, 1, 3, 15, 2, 4, f, f, false);
/*   65:     */     }
/*   66:1262 */     return true;
/*   67:     */   }
/*   68:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bku
 * JD-Core Version:    0.7.0.1
 */