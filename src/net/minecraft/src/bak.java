package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ final class bak
/*  4:   */   implements Predicate<bei>
/*  5:   */ {
/*  6:   */   public boolean apply(bei parambei)
/*  7:   */   {
/*  8:42 */     return (parambei.a().getType() == BlockList.ce) && ((parambei.b() instanceof bdm)) && (((bdm)parambei.b()).c() == 1);
/*  9:   */   }
/* 10:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bak
 * JD-Core Version:    0.7.0.1
 */