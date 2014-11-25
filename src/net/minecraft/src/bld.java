package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ public class bld
/*    4:     */   extends blb
/*    5:     */ {
/*    6:     */   public bld() {}
/*    7:     */   
/*    8:     */   public bld(EnumDirection paramej, blf paramblf, Random paramRandom)
/*    9:     */   {
/*   10:1063 */     super(1, paramej, paramblf, 1, 1, 1);
/*   11:     */   }
/*   12:     */   
/*   13:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   14:     */   {
/*   15:1068 */     if (this.k.a / 25 > 0) {
/*   16:1069 */       a(paramaqu, parambjb, 0, 0, this.k.c[EnumDirection.DOWN.a()]);
/*   17:     */     }
/*   18:1071 */     if (this.k.b[EnumDirection.UP.a()] == null) {
/*   19:1072 */       a(paramaqu, parambjb, 1, 4, 1, 6, 4, 6, a);
/*   20:     */     }
/*   21:1077 */     for (int i = 1; i <= 6; i++) {
/*   22:1078 */       for (int j = 1; j <= 6; j++) {
/*   23:1079 */         if (paramRandom.nextInt(3) != 0)
/*   24:     */         {
/*   25:1080 */           int k = 2 + (paramRandom.nextInt(4) == 0 ? 0 : 1);
/*   26:1081 */           a(paramaqu, parambjb, i, k, j, i, 3, j, BlockList.v.instance(1), BlockList.v.instance(1), false);
/*   27:     */         }
/*   28:     */       }
/*   29:     */     }
/*   30:1086 */     a(paramaqu, parambjb, 0, 1, 0, 0, 1, 7, b, b, false);
/*   31:1087 */     a(paramaqu, parambjb, 7, 1, 0, 7, 1, 7, b, b, false);
/*   32:1088 */     a(paramaqu, parambjb, 1, 1, 0, 6, 1, 0, b, b, false);
/*   33:1089 */     a(paramaqu, parambjb, 1, 1, 7, 6, 1, 7, b, b, false);
/*   34:     */     
/*   35:1091 */     a(paramaqu, parambjb, 0, 2, 0, 0, 2, 7, c, c, false);
/*   36:1092 */     a(paramaqu, parambjb, 7, 2, 0, 7, 2, 7, c, c, false);
/*   37:1093 */     a(paramaqu, parambjb, 1, 2, 0, 6, 2, 0, c, c, false);
/*   38:1094 */     a(paramaqu, parambjb, 1, 2, 7, 6, 2, 7, c, c, false);
/*   39:     */     
/*   40:1096 */     a(paramaqu, parambjb, 0, 3, 0, 0, 3, 7, b, b, false);
/*   41:1097 */     a(paramaqu, parambjb, 7, 3, 0, 7, 3, 7, b, b, false);
/*   42:1098 */     a(paramaqu, parambjb, 1, 3, 0, 6, 3, 0, b, b, false);
/*   43:1099 */     a(paramaqu, parambjb, 1, 3, 7, 6, 3, 7, b, b, false);
/*   44:     */     
/*   45:1101 */     a(paramaqu, parambjb, 0, 1, 3, 0, 2, 4, c, c, false);
/*   46:1102 */     a(paramaqu, parambjb, 7, 1, 3, 7, 2, 4, c, c, false);
/*   47:1103 */     a(paramaqu, parambjb, 3, 1, 0, 4, 2, 0, c, c, false);
/*   48:1104 */     a(paramaqu, parambjb, 3, 1, 7, 4, 2, 7, c, c, false);
/*   49:1106 */     if (this.k.c[EnumDirection.SOUTH.a()]) {
/*   50:1107 */       a(paramaqu, parambjb, 3, 1, 0, 4, 2, 0, f, f, false);
/*   51:     */     }
/*   52:1111 */     return true;
/*   53:     */   }
/*   54:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bld
 * JD-Core Version:    0.7.0.1
 */