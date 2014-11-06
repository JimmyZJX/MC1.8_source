package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ import net.minecraft.server.MinecraftServer;
/*   3:    */ 
/*   4:    */ public class pg
/*   5:    */   implements Callable<String>
/*   6:    */ {
				private MinecraftServer a;
/*   7:    */   public pg(MinecraftServer paramMinecraftServer) {a=paramMinecraftServer;}
/*   8:    */   
/*   9:    */   public String call()
/*  10:    */   {
/*  11:824 */     return MinecraftServer.a(this.a).p() + " / " + MinecraftServer.a(this.a).q() + "; " + MinecraftServer.a(this.a).e;
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     pg
 * JD-Core Version:    0.7.0.1
 */