package net.minecraft.src;
/*  1:   */ public class aaa
/*  2:   */   extends zb
/*  3:   */ {
/*  4:   */   private EntityWalkingMob a;
/*  5:   */   private abh b;
/*  6:   */   
/*  7:   */   public aaa(EntityWalkingMob paramxu)
/*  8:   */   {
/*  9:14 */     this.a = paramxu;
/* 10:15 */     if (!(paramxu.s() instanceof aay)) {
/* 11:16 */       throw new IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");
/* 12:   */     }
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean a()
/* 16:   */   {
/* 17:22 */     if (this.a.world.w()) {
/* 18:23 */       return false;
/* 19:   */     }
/* 20:26 */     BlockPosition localdt = new BlockPosition(this.a);
/* 21:   */     
/* 22:28 */     abi localabi = this.a.world.ae().a(localdt, 16);
/* 23:29 */     if (localabi == null) {
/* 24:30 */       return false;
/* 25:   */     }
/* 26:32 */     this.b = localabi.b(localdt);
/* 27:33 */     if (this.b == null) {
/* 28:34 */       return false;
/* 29:   */     }
/* 30:36 */     return this.b.b(localdt) < 2.25D;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public boolean b()
/* 34:   */   {
/* 35:41 */     if (this.a.world.w()) {
/* 36:42 */       return false;
/* 37:   */     }
/* 38:44 */     return (!this.b.i()) && (this.b.c(new BlockPosition(this.a)));
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void c()
/* 42:   */   {
/* 43:49 */     ((aay)this.a.s()).b(false);
/* 44:50 */     ((aay)this.a.s()).c(false);
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void d()
/* 48:   */   {
/* 49:55 */     ((aay)this.a.s()).b(true);
/* 50:56 */     ((aay)this.a.s()).c(true);
/* 51:57 */     this.b = null;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void e()
/* 55:   */   {
/* 56:62 */     this.b.b();
/* 57:   */   }
/* 58:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aaa
 * JD-Core Version:    0.7.0.1
 */