package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ 
/*  3:   */ class yq
/*  4:   */   implements Predicate<Entity>
/*  5:   */ {
			  private final yp a;
/*  6:   */   yq(yp paramyp) {a=paramyp;}
/*  7:   */   
/*  8:   */   public boolean apply(Entity paramwv)
/*  9:   */   {
/* 10:20 */     return (paramwv.ai()) && (this.a.b.t().a(paramwv));
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yq
 * JD-Core Version:    0.7.0.1
 */