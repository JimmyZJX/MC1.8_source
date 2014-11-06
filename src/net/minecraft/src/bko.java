package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ class bko
/*    4:     */   implements bks
/*    5:     */ {
/*    6:     */   public boolean a(blf paramblf)
/*    7:     */   {
/*    8:1961 */     if ((paramblf.c[EnumDirection.NORTH.a()]) && (!paramblf.b[EnumDirection.NORTH.a()].d)) {
/*    9:1962 */       return true;
/*   10:     */     }
/*   11:1964 */     return false;
/*   12:     */   }
/*   13:     */   
/*   14:     */   public blb a(EnumDirection paramej, blf paramblf, Random paramRandom)
/*   15:     */   {
/*   16:1969 */     blf localblf = paramblf;
/*   17:1970 */     if ((!paramblf.c[EnumDirection.NORTH.a()]) || (paramblf.b[EnumDirection.NORTH.a()].d)) {
/*   18:1971 */       localblf = paramblf.b[EnumDirection.SOUTH.a()];
/*   19:     */     }
/*   20:1973 */     localblf.d = true;
/*   21:1974 */     localblf.b[EnumDirection.NORTH.a()].d = true;
/*   22:1975 */     return new bky(paramej, localblf, paramRandom);
/*   23:     */   }
				  bko(bkj arg0) {}
/*   24:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bko
 * JD-Core Version:    0.7.0.1
 */