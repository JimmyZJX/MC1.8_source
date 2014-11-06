package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ class bkq
/*    4:     */   implements bks
/*    5:     */ {
/*    6:     */   public boolean a(blf paramblf)
/*    7:     */   {
/*    8:1912 */     return (!paramblf.c[EnumDirection.WEST.a()]) && (!paramblf.c[EnumDirection.EAST.a()]) && (!paramblf.c[EnumDirection.NORTH.a()]) && (!paramblf.c[EnumDirection.SOUTH.a()]) && (!paramblf.c[EnumDirection.UP.a()]);
/*    9:     */   }
/*   10:     */   
/*   11:     */   public blb a(EnumDirection paramej, blf paramblf, Random paramRandom)
/*   12:     */   {
/*   13:1917 */     paramblf.d = true;
/*   14:1918 */     return new bld(paramej, paramblf, paramRandom);
/*   15:     */   }
				  bkq(bkj arg0) {}
/*   16:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkq
 * JD-Core Version:    0.7.0.1
 */