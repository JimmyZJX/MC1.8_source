package net.minecraft.src;
/*  1:   */ import java.util.Comparator;
/*  2:   */ 
/*  3:   */ class bef
/*  4:   */   implements Comparator<IBlockData>
/*  5:   */ {
/*  6:   */   bef(bed parambed) {}
/*  7:   */   
/*  8:   */   public int compare(IBlockData parambex1, IBlockData parambex2)
/*  9:   */   {
/* 10:36 */     return parambex1.getName().compareTo(parambex2.getName());
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bef
 * JD-Core Version:    0.7.0.1
 */