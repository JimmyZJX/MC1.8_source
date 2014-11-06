package net.minecraft.src;
/*   2:    */ 
/*   3:    */ class cof
/*   4:    */   implements Runnable
/*   5:    */ {
				private final coa a;
				private final cod b;
/*   6:    */   cof(cod paramcod, coa paramcoa) {a=paramcoa;b=paramcod;}
/*   7:    */   
/*   8:    */   public void run()
/*   9:    */   {
/*  10:167 */     cod.a(this.b).remove(this.a);
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cof
 * JD-Core Version:    0.7.0.1
 */