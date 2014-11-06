package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ final class baz
/*  4:   */   implements Predicate<EnumDirection>
/*  5:   */ {
/*  6:   */   public boolean apply(EnumDirection paramej)
/*  7:   */   {
/*  8:27 */     return paramej != EnumDirection.DOWN;
/*  9:   */   }
/* 10:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     baz
 * JD-Core Version:    0.7.0.1
 */