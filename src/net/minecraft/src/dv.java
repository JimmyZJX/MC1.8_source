package net.minecraft.src;
/*   1:    */ import com.google.common.collect.AbstractIterator;
/*   2:    */ 
/*   3:    */ class dv
/*   4:    */   extends AbstractIterator<BlockPosition>
/*   5:    */ {
				private final du a;
/*   6:174 */   private BlockPosition b = null;
/*   7:    */   
/*   8:    */   dv(du paramdu) {a=paramdu;}
/*   9:    */   
/*  10:    */   protected BlockPosition computeNext()
/*  11:    */   {
/*  12:178 */     if (this.b == null)
/*  13:    */     {
/*  14:180 */       this.b = this.a.a;
/*  15:181 */       return this.b;
/*  16:    */     }
/*  17:182 */     if (this.b.equals(this.a.b)) {
/*  18:184 */       return (BlockPosition)endOfData();
/*  19:    */     }
/*  20:187 */     int i = this.b.getX();
/*  21:188 */     int j = this.b.getY();
/*  22:189 */     int k = this.b.getZ();
/*  23:190 */     if (i < this.a.b.getX())
/*  24:    */     {
/*  25:191 */       i++;
/*  26:    */     }
/*  27:192 */     else if (j < this.a.b.getY())
/*  28:    */     {
/*  29:193 */       i = this.a.a.getX();
/*  30:194 */       j++;
/*  31:    */     }
/*  32:195 */     else if (k < this.a.b.getZ())
/*  33:    */     {
/*  34:196 */       i = this.a.a.getX();
/*  35:197 */       j = this.a.a.getY();
/*  36:198 */       k++;
/*  37:    */     }
/*  38:200 */     this.b = new BlockPosition(i, j, k);
/*  39:201 */     return this.b;
/*  40:    */   }
/*  41:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dv
 * JD-Core Version:    0.7.0.1
 */