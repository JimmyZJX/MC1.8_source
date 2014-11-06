package net.minecraft.src;
/*   1:    */ import java.util.Iterator;
/*   2:    */ 
/*   3:    */ final class du
/*   4:    */   implements Iterable<BlockPosition>
/*   5:    */ {
				final BlockPosition a;
				final BlockPosition b;
/*   6:    */   du(BlockPosition paramdt1, BlockPosition paramdt2) {a=paramdt1;b=paramdt2;}
/*   7:    */   
/*   8:    */   public Iterator<BlockPosition> iterator()
/*   9:    */   {
/*  10:173 */     return new dv(this);
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     du
 * JD-Core Version:    0.7.0.1
 */