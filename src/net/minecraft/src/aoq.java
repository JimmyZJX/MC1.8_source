package net.minecraft.src;
/*    1:     */ import java.util.Comparator;
/*    2:     */ 
/*    3:     */ class aoq
/*    4:     */   implements Comparator<aoo>
/*    5:     */ {
/*    6:     */   aoq(RecipeList paramaop) {}
/*    7:     */   
/*    8:     */   public int compare(aoo paramaoo1, aoo paramaoo2)
/*    9:     */   {
/*   10:1068 */     if (((paramaoo1 instanceof aot)) && ((paramaoo2 instanceof aos))) {
/*   11:1069 */       return 1;
/*   12:     */     }
/*   13:1071 */     if (((paramaoo2 instanceof aot)) && ((paramaoo1 instanceof aos))) {
/*   14:1072 */       return -1;
/*   15:     */     }
/*   16:1075 */     if (paramaoo2.a() < paramaoo1.a()) {
/*   17:1076 */       return -1;
/*   18:     */     }
/*   19:1078 */     if (paramaoo2.a() > paramaoo1.a()) {
/*   20:1079 */       return 1;
/*   21:     */     }
/*   22:1081 */     return 0;
/*   23:     */   }
/*   24:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aoq
 * JD-Core Version:    0.7.0.1
 */