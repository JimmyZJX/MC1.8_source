package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class blm
/*   4:    */   extends bmu
/*   5:    */ {
/*   6:    */   public void a(Random paramRandom, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*   7:    */   {
/*   8:601 */     if (paramRandom.nextFloat() < 0.4F) {
/*   9:602 */       this.a = BlockList.cobblestone.instance();
/*  10:    */     } else {
/*  11:604 */       this.a = BlockList.mossyCobblestone.instance();
/*  12:    */     }
/*  13:    */   }
				blm(blj arg0) {}
/*  14:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     blm
 * JD-Core Version:    0.7.0.1
 */