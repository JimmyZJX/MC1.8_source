package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ class bkk
/*    4:     */   implements bks
/*    5:     */ {
/*    6:     */   public boolean a(blf paramblf)
/*    7:     */   {
/*    8:1943 */     if ((paramblf.c[EnumDirection.EAST.a()]) && (!paramblf.b[EnumDirection.EAST.a()].d)) {
/*    9:1944 */       return true;
/*   10:     */     }
/*   11:1946 */     return false;
/*   12:     */   }
/*   13:     */   
/*   14:     */   public blb a(EnumDirection paramej, blf paramblf, Random paramRandom)
/*   15:     */   {
/*   16:1951 */     blf localblf = paramblf;
/*   17:1952 */     localblf.d = true;
/*   18:1953 */     localblf.b[EnumDirection.EAST.a()].d = true;
/*   19:1954 */     return new bku(paramej, localblf, paramRandom);
/*   20:     */   }
				  bkk(bkj arg0) {}
/*   21:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkk
 * JD-Core Version:    0.7.0.1
 */