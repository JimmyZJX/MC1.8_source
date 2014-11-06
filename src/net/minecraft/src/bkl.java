package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ class bkl
/*    4:     */   implements bks
/*    5:     */ {
/*    6:     */   public boolean a(blf paramblf)
/*    7:     */   {
/*    8:1982 */     if ((paramblf.c[EnumDirection.EAST.a()]) && (!paramblf.b[EnumDirection.EAST.a()].d) && 
/*    9:1983 */       (paramblf.c[EnumDirection.UP.a()]) && (!paramblf.b[EnumDirection.UP.a()].d))
/*   10:     */     {
/*   11:1984 */       blf localblf = paramblf.b[EnumDirection.EAST.a()];
/*   12:     */       
/*   13:1986 */       return (localblf.c[EnumDirection.UP.a()]) && (!localblf.b[EnumDirection.UP.a()].d);
/*   14:     */     }
/*   15:1989 */     return false;
/*   16:     */   }
/*   17:     */   
/*   18:     */   public blb a(EnumDirection paramej, blf paramblf, Random paramRandom)
/*   19:     */   {
/*   20:1994 */     paramblf.d = true;
/*   21:1995 */     paramblf.b[EnumDirection.EAST.a()].d = true;
/*   22:1996 */     paramblf.b[EnumDirection.UP.a()].d = true;
/*   23:1997 */     paramblf.b[EnumDirection.EAST.a()].b[EnumDirection.UP.a()].d = true;
/*   24:1998 */     return new bkv(paramej, paramblf, paramRandom);
/*   25:     */   }
				  bkl(bkj arg0) {}
/*   26:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkl
 * JD-Core Version:    0.7.0.1
 */