package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;

/*   2:    */ import net.minecraft.server.MinecraftServer;
/*   3:    */ 
/*   4:    */ public class pf
/*   5:    */   implements Callable<String>
/*   6:    */ {
				private final MinecraftServer a;
/*   7:    */   public pf(MinecraftServer paramMinecraftServer) {a=paramMinecraftServer;}
/*   8:    */   
/*   9:    */   public String call()
/*  10:    */   {
/*  11:816 */     return this.a.b.a ? this.a.b.c() : "N/A (disabled)";
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     pf
 * JD-Core Version:    0.7.0.1
 */