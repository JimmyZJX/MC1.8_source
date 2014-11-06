package net.minecraft.src;
/*   2:    */ 
/*   3:    */ class coe
/*   4:    */   implements Runnable
/*   5:    */ {
				private final coa a;
				private final cod b;
/*   6:    */   coe(cod paramcod, coa paramcoa) {a=paramcoa;b=paramcod;}
/*   7:    */   
/*   8:    */   public void run()
/*   9:    */   {
/*  10:102 */     cod.a(this.b).remove(this.a);
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     coe
 * JD-Core Version:    0.7.0.1
 */