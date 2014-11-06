package net.minecraft.src;
/*   1:    */ import net.minecraft.server.MinecraftServer;
/*   2:    */ import org.apache.logging.log4j.Logger;
/*   3:    */ 
/*   4:    */ public class pd
/*   5:    */   implements uy
/*   6:    */ {
/*   7:187 */   private long b = MinecraftServer.ax();
/*   8:    */   
/*   9:    */   public pd(MinecraftServer paramMinecraftServer) {}
/*  10:    */   
/*  11:    */   public void a(String paramString) {}
/*  12:    */   
/*  13:    */   public void b(String paramString) {}
/*  14:    */   
/*  15:    */   public void a(int paramInt)
/*  16:    */   {
/*  17:199 */     if (MinecraftServer.ax() - this.b >= 1000L)
/*  18:    */     {
/*  19:200 */       this.b = MinecraftServer.ax();
/*  20:201 */       MinecraftServer.aL().info("Converting... " + paramInt + "%");
/*  21:    */     }
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void a() {}
/*  25:    */   
/*  26:    */   public void c(String paramString) {}
/*  27:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     pd
 * JD-Core Version:    0.7.0.1
 */