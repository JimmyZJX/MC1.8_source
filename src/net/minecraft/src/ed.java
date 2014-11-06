package net.minecraft.src;
/*  1:   */ import com.google.common.base.Function;
/*  2:   */ import java.util.Arrays;
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ class ed<E>
/*  6:   */   implements Function<E[],List<E>>
/*  7:   */ {
/*  8:   */   public List<E> apply(E[] paramArrayOfObject)
/*  9:   */   {
/* 10:50 */     return Arrays.asList((E[])paramArrayOfObject);
/* 11:   */   }
			  ed(ec arg0) {}
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ed
 * JD-Core Version:    0.7.0.1
 */