package net.minecraft.src;
/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class rb
/*  4:   */   implements na
/*  5:   */ {
/*  6:   */   private final MinecraftServer a;
/*  7:   */   private final gr b;
/*  8:   */   
/*  9:   */   public rb(MinecraftServer paramMinecraftServer, gr paramgr)
/* 10:   */   {
/* 11:14 */     this.a = paramMinecraftServer;
/* 12:15 */     this.b = paramgr;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(mz parammz)
/* 16:   */   {
/* 17:20 */     this.b.a(parammz.a());
/* 18:21 */     this.b.a(new rq(this.a, this.b));
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(ho paramho) {}
/* 22:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     rb
 * JD-Core Version:    0.7.0.1
 */