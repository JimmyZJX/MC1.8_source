package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ 
/*   3:    */ class qu
/*   4:    */   implements Predicate<EntityLiving>
/*   5:    */ {
				private final WorldServer a;
/*   6:    */   qu(WorldServer paramqt) {a=paramqt;}
/*   7:    */   
/*   8:    */   public boolean apply(EntityLiving paramxm)
/*   9:    */   {
/*  10:401 */     return (paramxm != null) && (paramxm.ai()) && (this.a.i(paramxm.c()));
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     qu
 * JD-Core Version:    0.7.0.1
 */