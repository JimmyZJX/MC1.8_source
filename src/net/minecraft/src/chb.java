package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class chb
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final int a;
				private final cgx b;
/*   6:    */   chb(cgx paramcgx, int paramInt) {a=paramInt;b=paramcgx;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:277 */     if (this.a == 0) {
/*  11:278 */       return "MISC_TEXTURE";
/*  12:    */     }
/*  13:279 */     if (this.a == 1) {
/*  14:280 */       return "TERRAIN_TEXTURE";
/*  15:    */     }
/*  16:281 */     if (this.a == 3) {
/*  17:282 */       return "ENTITY_PARTICLE_TEXTURE";
/*  18:    */     }
/*  19:284 */     return "Unknown - " + this.a;
/*  20:    */   }
/*  21:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     chb
 * JD-Core Version:    0.7.0.1
 */