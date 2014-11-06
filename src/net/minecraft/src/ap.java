package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ final class ap
/*   4:    */   implements Predicate<Entity>
/*   5:    */ {
				private final String a;
				private final boolean b;
/*   6:    */   ap(String paramString, boolean paramBoolean) {a=paramString;b=paramBoolean;}
/*   7:    */   
/*   8:    */   public boolean apply(Entity paramwv)
/*   9:    */   {
/*  10:249 */     if (!(paramwv instanceof EntityLiving)) {
/*  11:250 */       return false;
/*  12:    */     }
/*  13:253 */     EntityLiving localxm = (EntityLiving)paramwv;
/*  14:254 */     bsf localbsf = localxm.bN();
/*  15:255 */     String str = localbsf == null ? "" : localbsf.b();
/*  16:256 */     return str.equals(this.a) != this.b;
/*  17:    */   }
/*  18:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ap
 * JD-Core Version:    0.7.0.1
 */