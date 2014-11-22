package net.minecraft.src;
/*  1:   */ public class aae
/*  2:   */   extends GoalType
/*  3:   */ {
/*  4:   */   EntityCreeper a;
/*  5:   */   EntityLiving b;
/*  6:   */   
/*  7:   */   public aae(EntityCreeper paramaep)
/*  8:   */   {
/*  9:12 */     this.a = paramaep;
/* 10:13 */     a(1);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean canStart()
/* 14:   */   {
/* 15:18 */     EntityLiving localxm = this.a.u();
/* 16:19 */     return (this.a.ck() > 0) || ((localxm != null) && (this.a.h(localxm) < 9.0D));
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void start()
/* 20:   */   {
/* 21:24 */     this.a.getNavigator().n();
/* 22:25 */     this.b = this.a.u();
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void stop()
/* 26:   */   {
/* 27:30 */     this.b = null;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void tick()
/* 31:   */   {
/* 32:35 */     if (this.b == null)
/* 33:   */     {
/* 34:36 */       this.a.a(-1);
/* 35:37 */       return;
/* 36:   */     }
/* 37:40 */     if (this.a.h(this.b) > 49.0D)
/* 38:   */     {
/* 39:41 */       this.a.a(-1);
/* 40:42 */       return;
/* 41:   */     }
/* 42:45 */     if (!this.a.getSensor().canSee(this.b))
/* 43:   */     {
/* 44:46 */       this.a.a(-1);
/* 45:47 */       return;
/* 46:   */     }
/* 47:50 */     this.a.a(1);
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aae
 * JD-Core Version:    0.7.0.1
 */