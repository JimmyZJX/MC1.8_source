package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ final class bej
/*  4:   */   implements Predicate<bei>
/*  5:   */ {
			  private final Predicate<Block> a;
/*  6:   */   bej(Predicate<Block> paramPredicate) {a=paramPredicate;}
/*  7:   */   
/*  8:   */   public boolean apply(bei parambei)
/*  9:   */   {
/* 10:53 */     return (parambei != null) && (this.a.apply(parambei.a()));
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bej
 * JD-Core Version:    0.7.0.1
 */