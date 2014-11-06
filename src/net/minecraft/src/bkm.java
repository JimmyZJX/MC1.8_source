package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ class bkm
/*    4:     */   implements bks
/*    5:     */ {
/*    6:     */   public boolean a(blf paramblf)
/*    7:     */   {
/*    8:1925 */     if ((paramblf.c[EnumDirection.UP.a()]) && (!paramblf.b[EnumDirection.UP.a()].d)) {
/*    9:1926 */       return true;
/*   10:     */     }
/*   11:1928 */     return false;
/*   12:     */   }
/*   13:     */   
/*   14:     */   public blb a(EnumDirection paramej, blf paramblf, Random paramRandom)
/*   15:     */   {
/*   16:1933 */     blf localblf = paramblf;
/*   17:1934 */     localblf.d = true;
/*   18:1935 */     localblf.b[EnumDirection.UP.a()].d = true;
/*   19:1936 */     return new bkw(paramej, localblf, paramRandom);
/*   20:     */   }
				  bkm(bkj arg0) {}
/*   21:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkm
 * JD-Core Version:    0.7.0.1
 */