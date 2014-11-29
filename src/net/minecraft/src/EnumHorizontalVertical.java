package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import com.google.common.collect.Iterators;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.Random;
/*   5:    */ 
/*   6:    */ public enum EnumHorizontalVertical
/*   7:    */   implements Predicate<EnumDirection>, Iterable<EnumDirection>
/*   8:    */ { HORIZONTAL,VERTICAL;
/*   9:    */   public EnumDirection[] getDirectionList()
/*  10:    */   {
/*  11:405 */     switch (ek.c[ordinal()])
/*  12:    */     {
/*  13:    */     case 1: 
/*  14:407 */       return new EnumDirection[] { EnumDirection.NORTH, EnumDirection.EAST, EnumDirection.SOUTH, EnumDirection.WEST };
/*  15:    */     case 2: 
/*  16:409 */       return new EnumDirection[] { EnumDirection.UP, EnumDirection.DOWN };
/*  17:    */     }
/*  18:411 */     throw new Error("Someone's been tampering with the universe!");
/*  19:    */   }
/*  20:    */   
/*  21:    */   public EnumDirection getRandomDirection(Random rng)
/*  22:    */   {
/*  23:425 */     EnumDirection[] dirList = getDirectionList();
/*  24:426 */     return dirList[rng.nextInt(dirList.length)];
/*  25:    */   }
/*  26:    */   
/*  27:    */   public boolean apply(EnumDirection dir)
/*  28:    */   {
/*  29:436 */     return (dir != null) && (dir.getAxis().d() == this);
/*  30:    */   }
/*  31:    */   
/*  32:    */   public Iterator<EnumDirection> iterator()
/*  33:    */   {
/*  34:441 */     return Iterators.forArray(getDirectionList());
/*  35:    */   }
/*  36:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     en
 * JD-Core Version:    0.7.0.1
 */