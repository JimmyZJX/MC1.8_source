package net.minecraft.src;
/*   1:    */ import io.netty.util.concurrent.GenericFutureListener;
/*   2:    */ 
/*   3:    */ class gx
/*   4:    */ {
/*   5:    */   private final id a;
/*   6:    */   private final GenericFutureListener[] b;
/*   7:    */   
/*   8:    */   public gx(id paramid, GenericFutureListener... paramVarArgs)
/*   9:    */   {
/*  10:339 */     this.a = paramid;
/*  11:340 */     this.b = paramVarArgs;
/*  12:    */   }
				static id a(gx arg0) {return arg0.a;}
				static GenericFutureListener[] b(gx arg0) {return arg0.b;}
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gx
 * JD-Core Version:    0.7.0.1
 */