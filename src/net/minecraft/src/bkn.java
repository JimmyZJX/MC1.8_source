package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ class bkn
/*    4:     */   implements bks
/*    5:     */ {
/*    6:     */   public boolean a(blf paramblf)
/*    7:     */   {
/*    8:2005 */     if ((paramblf.c[EnumDirection.NORTH.a()]) && (!paramblf.b[EnumDirection.NORTH.a()].d) && 
/*    9:2006 */       (paramblf.c[EnumDirection.UP.a()]) && (!paramblf.b[EnumDirection.UP.a()].d))
/*   10:     */     {
/*   11:2007 */       blf localblf = paramblf.b[EnumDirection.NORTH.a()];
/*   12:     */       
/*   13:2009 */       return (localblf.c[EnumDirection.UP.a()]) && (!localblf.b[EnumDirection.UP.a()].d);
/*   14:     */     }
/*   15:2012 */     return false;
/*   16:     */   }
/*   17:     */   
/*   18:     */   public blb a(EnumDirection paramej, blf paramblf, Random paramRandom)
/*   19:     */   {
/*   20:2017 */     paramblf.d = true;
/*   21:2018 */     paramblf.b[EnumDirection.NORTH.a()].d = true;
/*   22:2019 */     paramblf.b[EnumDirection.UP.a()].d = true;
/*   23:2020 */     paramblf.b[EnumDirection.NORTH.a()].b[EnumDirection.UP.a()].d = true;
/*   24:2021 */     return new bkx(paramej, paramblf, paramRandom);
/*   25:     */   }
				  bkn(bkj arg0) {}
/*   26:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkn
 * JD-Core Version:    0.7.0.1
 */