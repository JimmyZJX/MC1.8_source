package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ final class azd
/*  4:   */   implements Predicate<EnumRailState>
/*  5:   */ {
/*  6:   */   public boolean apply(EnumRailState paramatl)
/*  7:   */   {
/*  8:18 */     return (paramatl != EnumRailState.j) && (paramatl != EnumRailState.i) && (paramatl != EnumRailState.g) && (paramatl != EnumRailState.h);
/*  9:   */   }
/* 10:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azd
 * JD-Core Version:    0.7.0.1
 */