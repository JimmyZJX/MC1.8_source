package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ final class ayq
/*  4:   */   implements Predicate<EnumWoodVariant>
/*  5:   */ {
/*  6:   */   public boolean apply(EnumWoodVariant paramayx)
/*  7:   */   {
/*  8:25 */     return paramayx.getIndex() < 4;
/*  9:   */   }
/* 10:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayq
 * JD-Core Version:    0.7.0.1
 */