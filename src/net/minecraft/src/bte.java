package net.minecraft.src;
/*   1:    */ class bte
/*   2:    */   extends Thread
/*   3:    */ {
				private final bsu a;
/*   4:    */   bte(bsu parambsu, String paramString)
/*   5:    */   {
/*   6:587 */     super(paramString);
				  a=parambsu;
/*   7:    */   }
/*   8:    */   
/*   9:    */   public void run()
/*  10:    */   {
/*  11:590 */     while (this.a.z) {
/*  12:    */       try
/*  13:    */       {
/*  14:592 */         Thread.sleep(2147483647L);
/*  15:    */       }
/*  16:    */       catch (InterruptedException localInterruptedException) {}
/*  17:    */     }
/*  18:    */   }
/*  19:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bte
 * JD-Core Version:    0.7.0.1
 */