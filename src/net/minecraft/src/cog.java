package net.minecraft.src;
/*   1:    */ class cog
/*   2:    */   implements Runnable
/*   3:    */ {
				private final aql a;
				private final VertexBuffer b;
				private final cop c;
				private final cok d;
				private final cod e;
/*   4:    */   cog(cod paramcod, aql paramaql, VertexBuffer paramciv, cop paramcop, cok paramcok) {a=paramaql;b=paramciv;c=paramcop;d=paramcok;e=paramcod;}
/*   5:    */   
/*   6:    */   public void run()
/*   7:    */   {
/*   8:207 */     this.e.a(this.a, this.b, this.c, this.d);
/*   9:    */   }
/*  10:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cog
 * JD-Core Version:    0.7.0.1
 */