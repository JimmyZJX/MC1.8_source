package net.minecraft.src;
/*   1:    */ import com.google.common.base.Objects;
/*   2:    */ import com.google.common.base.Predicate;
/*   3:    */ import com.google.common.base.Predicates;
/*   4:    */ 
/*   5:    */ public class bvc
/*   6:    */   extends bvf
/*   7:    */ {
/*   8:    */   private final Predicate<String> a;
/*   9:    */   
/*  10:    */   public bvc(int paramInt, String paramString, boolean paramBoolean, Predicate<String> paramPredicate)
/*  11:    */   {
/*  12:468 */     super(paramInt, paramString, paramBoolean);
/*  13:469 */     this.a = (Objects.firstNonNull(paramPredicate, Predicates.<String>alwaysTrue()));
/*  14:    */   }
/*  15:    */   
/*  16:    */   public Predicate<String> a()
/*  17:    */   {
/*  18:473 */     return this.a;
/*  19:    */   }
/*  20:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvc
 * JD-Core Version:    0.7.0.1
 */