package net.minecraft.src;
/*   1:    */ class ato
/*   2:    */   implements Runnable
/*   3:    */ {
				private final BlockPosition a;
				private final atn b;
/*   4:    */   ato(atn paramatn, BlockPosition paramdt) {a=paramdt;b=paramatn;}
/*   5:    */   
/*   6:    */   public void run()
/*   7:    */   {
/*   8: 99 */     bcm localbcm = this.b.a.s(this.a);
/*   9:100 */     if ((localbcm instanceof bck))
/*  10:    */     {
/*  11:101 */       ((bck)localbcm).m();
/*  12:102 */       this.b.a.c(this.a, BlockList.bY, 1, 0);
/*  13:    */     }
/*  14:    */   }
/*  15:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ato
 * JD-Core Version:    0.7.0.1
 */