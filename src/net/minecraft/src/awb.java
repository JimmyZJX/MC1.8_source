package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ final class awb
/*   4:    */   implements Predicate<EnumFlowerVariant>
/*   5:    */ {
				private final awc a;
/*   6:    */   awb(awc paramawc) {a=paramawc;}
/*   7:    */   
/*   8:    */   public boolean apply(EnumFlowerVariant paramawa)
/*   9:    */   {
/*  10:109 */     return paramawa.a() == this.a;
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     awb
 * JD-Core Version:    0.7.0.1
 */