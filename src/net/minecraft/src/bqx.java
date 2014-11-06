package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class bqx
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final WorldInfo a;
/*   6:    */   bqx(WorldInfo parambqo) {a=parambqo;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:646 */     return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", new Object[] { WorldInfo.o(this.a).b(), Integer.valueOf(WorldInfo.o(this.a).a()), Boolean.valueOf(WorldInfo.p(this.a)), Boolean.valueOf(WorldInfo.q(this.a)) });
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqx
 * JD-Core Version:    0.7.0.1
 */