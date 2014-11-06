package net.minecraft.src;
/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class ro
/*  4:   */   implements na
/*  5:   */ {
/*  6:   */   private final MinecraftServer a;
/*  7:   */   private final gr b;
/*  8:   */   
/*  9:   */   public ro(MinecraftServer paramMinecraftServer, gr paramgr)
/* 10:   */   {
/* 11:17 */     this.a = paramMinecraftServer;
/* 12:18 */     this.b = paramgr;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(mz parammz)
/* 16:   */   {
/* 17:23 */     switch (rp.a[parammz.a().ordinal()])
/* 18:   */     {
/* 19:   */     case 1: 
/* 20:25 */       this.b.a(gy.d);
/* 21:   */       hy localhy;
/* 22:27 */       if (parammz.b() > 47)
/* 23:   */       {
/* 24:28 */         localhy = new hy("Outdated server! I'm still on 1.8");
/* 25:29 */         this.b.a(new ng(localhy));
/* 26:30 */         this.b.a(localhy);
/* 27:   */       }
/* 28:31 */       else if (parammz.b() < 47)
/* 29:   */       {
/* 30:32 */         localhy = new hy("Outdated client! Please use 1.8");
/* 31:33 */         this.b.a(new ng(localhy));
/* 32:34 */         this.b.a(localhy);
/* 33:   */       }
/* 34:   */       else
/* 35:   */       {
/* 36:36 */         this.b.a(new rq(this.a, this.b));
/* 37:   */       }
/* 38:38 */       break;
/* 39:   */     case 2: 
/* 40:40 */       this.b.a(gy.c);
/* 41:41 */       this.b.a(new ru(this.a, this.b));
/* 42:42 */       break;
/* 43:   */     default: 
/* 44:44 */       throw new UnsupportedOperationException("Invalid intention " + parammz.a());
/* 45:   */     }
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void a(ho paramho) {}
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ro
 * JD-Core Version:    0.7.0.1
 */