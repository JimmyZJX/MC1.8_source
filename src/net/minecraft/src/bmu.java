package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public abstract class bmu
/*   4:    */ {
/*   5:628 */   protected Block a = BlockList.air.instance();
/*   6:    */   
/*   7:    */   public abstract void a(Random paramRandom, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
/*   8:    */   
/*   9:    */   public Block a()
/*  10:    */   {
/*  11:633 */     return this.a;
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmu
 * JD-Core Version:    0.7.0.1
 */