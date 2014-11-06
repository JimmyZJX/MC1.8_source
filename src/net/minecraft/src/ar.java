package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ final class ar
/*   4:    */   implements Predicate<Entity>
/*   5:    */ {
				private final String a;
				private final boolean b;
/*   6:    */   ar(String paramString, boolean paramBoolean) {a=paramString;b=paramBoolean;}
/*   7:    */   
/*   8:    */   public boolean apply(Entity paramwv)
/*   9:    */   {
/*  10:319 */     return paramwv.getName().equals(this.a) != this.b;
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ar
 * JD-Core Version:    0.7.0.1
 */