package net.minecraft.src;
/*   1:    */ import com.google.common.collect.ComparisonChain;
/*   2:    */ import java.util.Comparator;
/*   3:    */ 
/*   4:    */ final class al
/*   5:    */   implements Comparator<Entity>
/*   6:    */ {
				private final BlockPosition a;
/*   7:    */   al(BlockPosition paramdt) {a=paramdt;}
/*   8:    */   
/*   9:    */   public int compare(Entity paramwv1, Entity paramwv2)
/*  10:    */   {
/*  11:456 */     return ComparisonChain.start().compare(paramwv1.b(this.a), paramwv2.b(this.a)).result();
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     al
 * JD-Core Version:    0.7.0.1
 */