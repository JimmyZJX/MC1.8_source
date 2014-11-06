package net.minecraft.src;
/*  1:   */ import com.google.common.collect.ComparisonChain;
/*  3:   */ import java.util.Comparator;
/*  4:   */ 
/*  5:   */ final class cba
/*  6:   */   implements Comparator<ces>
/*  7:   */ {
/*  8:   */   public int compare(ces paramces1, ces paramces2)
/*  9:   */   {
/* 10:26 */     return ComparisonChain.start().compare(paramces1.a().getId(), paramces2.a().getId()).result();
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cba
 * JD-Core Version:    0.7.0.1
 */