package net.minecraft.src;
/*   1:    */ import java.io.ByteArrayOutputStream;
/*   2:    */ 
/*   3:    */ class bfw
/*   4:    */   extends ByteArrayOutputStream
/*   5:    */ {
/*   6:    */   private int b;
/*   7:    */   private int c;
				private final bfv a;
/*   8:    */   
/*   9:    */   public bfw(bfv parambfv, int paramInt1, int paramInt2)
/*  10:    */   {
/*  11:229 */     super(8096);
				  a=parambfv;
/*  12:230 */     this.b = paramInt1;
/*  13:231 */     this.c = paramInt2;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void close()
/*  17:    */   {
/*  18:236 */     this.a.a(this.b, this.c, this.buf, this.count);
/*  19:    */   }
/*  20:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bfw
 * JD-Core Version:    0.7.0.1
 */