package net.minecraft.src;
/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class ru
/*  4:   */   implements nv
/*  5:   */ {
/*  6:   */   private final MinecraftServer a;
/*  7:   */   private final gr b;
/*  8:   */   
/*  9:   */   public ru(MinecraftServer paramMinecraftServer, gr paramgr)
/* 10:   */   {
/* 11:13 */     this.a = paramMinecraftServer;
/* 12:14 */     this.b = paramgr;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(ho paramho) {}
/* 16:   */   
/* 17:   */   public void a(nx paramnx)
/* 18:   */   {
/* 19:29 */     this.b.a(new no(this.a.aE()));
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(nw paramnw)
/* 23:   */   {
/* 24:34 */     this.b.a(new nn(paramnw.a()));
/* 25:   */   }
/* 26:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ru
 * JD-Core Version:    0.7.0.1
 */