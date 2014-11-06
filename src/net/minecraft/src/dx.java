package net.minecraft.src;
/*   1:    */ import com.google.common.collect.AbstractIterator;
/*   2:    */ 
/*   3:    */ class dx
/*   4:    */   extends AbstractIterator<dy>
/*   5:    */ {
				private final dw a;
/*   6:245 */   private dy b = null;
/*   7:    */   
/*   8:    */   dx(dw paramdw) {a=paramdw;}
/*   9:    */   
/*  10:    */   protected dy computeNext()
/*  11:    */   {
/*  12:249 */     if (this.b == null)
/*  13:    */     {
/*  14:251 */       this.b = new dy(this.a.a.getX(), this.a.a.getY(), this.a.a.getZ(), null);
/*  15:252 */       return this.b;
/*  16:    */     }
/*  17:253 */     if (this.b.equals(this.a.b)) {
/*  18:255 */       return (dy)endOfData();
/*  19:    */     }
/*  20:258 */     int i = this.b.getX();
/*  21:259 */     int j = this.b.getY();
/*  22:260 */     int k = this.b.getZ();
/*  23:261 */     if (i < this.a.b.getX())
/*  24:    */     {
/*  25:262 */       i++;
/*  26:    */     }
/*  27:263 */     else if (j < this.a.b.getY())
/*  28:    */     {
/*  29:264 */       i = this.a.a.getX();
/*  30:265 */       j++;
/*  31:    */     }
/*  32:266 */     else if (k < this.a.b.getZ())
/*  33:    */     {
/*  34:267 */       i = this.a.a.getX();
/*  35:268 */       j = this.a.a.getY();
/*  36:269 */       k++;
/*  37:    */     }
/*  38:271 */     this.b.b = i;
/*  39:272 */     this.b.c = j;
/*  40:273 */     this.b.d = k;
/*  41:274 */     return this.b;
/*  42:    */   }
/*  43:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dx
 * JD-Core Version:    0.7.0.1
 */