package net.minecraft.src;
/*   1:    */ import java.util.Iterator;
/*   2:    */ 
/*   3:    */ final class dw
/*   4:    */   implements Iterable<dy>
/*   5:    */ {
				final BlockPosition a;
				final BlockPosition b;
/*   6:    */   dw(BlockPosition paramdt1, BlockPosition paramdt2) {a=paramdt1;b=paramdt2;}
/*   7:    */   
/*   8:    */   public Iterator<dy> iterator()
/*   9:    */   {
/*  10:244 */     return new dx(this);
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dw
 * JD-Core Version:    0.7.0.1
 */