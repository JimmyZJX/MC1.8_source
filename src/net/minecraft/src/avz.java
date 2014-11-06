package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ class avz
/*  4:   */   implements Predicate<EnumFlowerVariant>
/*  5:   */ {
			  private final avy a;
/*  6:   */   avz(avy paramavy) {a=paramavy;}
/*  7:   */   
/*  8:   */   public boolean apply(EnumFlowerVariant paramawa)
/*  9:   */   {
/* 10:52 */     return paramawa.a() == this.a.j();
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avz
 * JD-Core Version:    0.7.0.1
 */