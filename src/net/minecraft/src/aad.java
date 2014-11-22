package net.minecraft.src;
/*  1:   */ public class aad
/*  2:   */   extends GoalType
/*  3:   */ {
/*  4:   */   private EntityPet a;
/*  5:   */   private boolean b;
/*  6:   */   
/*  7:   */   public aad(EntityPet paramxx)
/*  8:   */   {
/*  9:12 */     this.a = paramxx;
/* 10:13 */     a(5);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean canStart()
/* 14:   */   {
/* 15:18 */     if (!this.a.cj()) {
/* 16:19 */       return false;
/* 17:   */     }
/* 18:21 */     if (this.a.V()) {
/* 19:22 */       return false;
/* 20:   */     }
/* 21:24 */     if (!this.a.C) {
/* 22:25 */       return false;
/* 23:   */     }
/* 24:28 */     EntityLiving localxm = this.a.l_();
/* 25:29 */     if (localxm == null) {
/* 26:30 */       return true;
/* 27:   */     }
/* 28:33 */     if ((this.a.h(localxm) < 144.0D) && (localxm.bc() != null)) {
/* 29:34 */       return false;
/* 30:   */     }
/* 31:37 */     return this.b;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void start()
/* 35:   */   {
/* 36:42 */     this.a.getNavigator().n();
/* 37:43 */     this.a.n(true);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void stop()
/* 41:   */   {
/* 42:48 */     this.a.n(false);
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void a(boolean paramBoolean)
/* 46:   */   {
/* 47:52 */     this.b = paramBoolean;
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aad
 * JD-Core Version:    0.7.0.1
 */