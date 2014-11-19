package net.minecraft.src;
/*  1:   */ import com.google.common.base.Function;
/*  2:   */ 
/*  3:   */ final class bee
/*  4:   */   implements Function<IBlockData<?>,String>
/*  5:   */ {
/*  6:   */   public String apply(IBlockData<?> parambex)
/*  7:   */   {
/*  8:21 */     return parambex == null ? "<NULL>" : parambex.getName();
/*  9:   */   }
/* 10:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bee
 * JD-Core Version:    0.7.0.1
 */