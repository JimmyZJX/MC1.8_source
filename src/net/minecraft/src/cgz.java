package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class cgz
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final int a;
				private final cgx b;
/*   6:    */   cgz(cgx paramcgx, int paramInt) {a=paramInt;b=paramcgx;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:194 */     if (this.a == 0) {
/*  11:195 */       return "MISC_TEXTURE";
/*  12:    */     }
/*  13:196 */     if (this.a == 1) {
/*  14:197 */       return "TERRAIN_TEXTURE";
/*  15:    */     }
/*  16:198 */     if (this.a == 3) {
/*  17:199 */       return "ENTITY_PARTICLE_TEXTURE";
/*  18:    */     }
/*  19:201 */     return "Unknown - " + this.a;
/*  20:    */   }
/*  21:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cgz
 * JD-Core Version:    0.7.0.1
 */