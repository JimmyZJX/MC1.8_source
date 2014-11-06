package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ final class ai
/*   4:    */   implements Predicate<Entity>
/*   5:    */ {
				private final String a;
				private final boolean b;
/*   6:    */   ai(String paramString, boolean paramBoolean) {a=paramString;b=paramBoolean;}
/*   7:    */   
/*   8:    */   public boolean apply(Entity paramwv)
/*   9:    */   {
/*  10:181 */     return EntityList.a(paramwv, this.a) != this.b;
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ai
 * JD-Core Version:    0.7.0.1
 */