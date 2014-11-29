package net.minecraft.src;
/*  1:   */ public class aah
/*  2:   */   extends GoalType
/*  3:   */ {
/*  4:   */   private EntityVillager a;
/*  5:   */   
/*  6:   */   public aah(EntityVillager paramagp)
/*  7:   */   {
/*  8:12 */     this.a = paramagp;
/*  9:13 */     a(5);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean canStart()
/* 13:   */   {
/* 14:18 */     if (!this.a.ai()) {
/* 15:19 */       return false;
/* 16:   */     }
/* 17:21 */     if (this.a.isInWater()) {
/* 18:22 */       return false;
/* 19:   */     }
/* 20:24 */     if (!this.a.landing) {
/* 21:25 */       return false;
/* 22:   */     }
/* 23:27 */     if (this.a.G) {
/* 24:28 */       return false;
/* 25:   */     }
/* 26:31 */     EntityPlayer localahd = this.a.u_();
/* 27:32 */     if (localahd == null) {
/* 28:34 */       return false;
/* 29:   */     }
/* 30:37 */     if (this.a.h(localahd) > 16.0D) {
/* 31:39 */       return false;
/* 32:   */     }
/* 33:42 */     if (!(localahd.bi instanceof aib)) {
/* 34:44 */       return false;
/* 35:   */     }
/* 36:47 */     return true;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void start()
/* 40:   */   {
/* 41:52 */     this.a.getNavigator().n();
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void stop()
/* 45:   */   {
/* 46:57 */     this.a.a_((EntityPlayer)null);
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aah
 * JD-Core Version:    0.7.0.1
 */