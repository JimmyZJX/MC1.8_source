package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ class afh
/*   4:    */   implements Predicate<qw>
/*   5:    */ {
				private final EntityGuardian a;
/*   6:    */   afh(EntityGuardian paramafg) {a=paramafg;}
/*   7:    */   
/*   8:    */   public boolean apply(qw paramqw)
/*   9:    */   {
/*  10:393 */     return (this.a.h(paramqw) < 2500.0D) && (paramqw.c.c());
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afh
 * JD-Core Version:    0.7.0.1
 */