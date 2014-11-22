package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class aaf
/*  5:   */   extends GoalType
/*  6:   */ {
/*  7:   */   private EntityVillager a;
/*  8:   */   private EntityIronGolem b;
/*  9:   */   private int c;
/* 10:   */   private boolean d;
/* 11:   */   
/* 12:   */   public aaf(EntityVillager paramagp)
/* 13:   */   {
/* 14:16 */     this.a = paramagp;
/* 15:17 */     a(3);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean canStart()
/* 19:   */   {
/* 20:22 */     if (this.a.getAge() >= 0) {
/* 21:23 */       return false;
/* 22:   */     }
/* 23:25 */     if (!this.a.world.w()) {
/* 24:26 */       return false;
/* 25:   */     }
/* 26:29 */     List<EntityIronGolem> localList = this.a.world.getEntityList(EntityIronGolem.class, this.a.getAABB().expand(6.0D, 2.0D, 6.0D));
/* 27:30 */     if (localList.isEmpty()) {
/* 28:31 */       return false;
/* 29:   */     }
/* 30:34 */     for (EntityIronGolem localacq : localList) {
/* 31:35 */       if (localacq.ck() > 0)
/* 32:   */       {
/* 33:36 */         this.b = localacq;
/* 34:37 */         break;
/* 35:   */       }
/* 36:   */     }
/* 37:40 */     return this.b != null;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public boolean canContinue()
/* 41:   */   {
/* 42:45 */     return this.b.ck() > 0;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void start()
/* 46:   */   {
/* 47:50 */     this.c = this.a.getRNG().nextInt(320);
/* 48:51 */     this.d = false;
/* 49:52 */     this.b.getNavigator().n();
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void stop()
/* 53:   */   {
/* 54:57 */     this.b = null;
/* 55:58 */     this.a.getNavigator().n();
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void tick()
/* 59:   */   {
/* 60:63 */     this.a.p().a(this.b, 30.0F, 30.0F);
/* 61:64 */     if (this.b.ck() == this.c)
/* 62:   */     {
/* 63:65 */       this.a.getNavigator().a(this.b, 0.5D);
/* 64:66 */       this.d = true;
/* 65:   */     }
/* 66:69 */     if ((this.d) && 
/* 67:70 */       (this.a.h(this.b) < 4.0D))
/* 68:   */     {
/* 69:71 */       this.b.a(false);
/* 70:72 */       this.a.getNavigator().n();
/* 71:   */     }
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aaf
 * JD-Core Version:    0.7.0.1
 */