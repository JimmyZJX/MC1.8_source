package net.minecraft.src;
/*  2:   */ 
/*  3:   */ public class aac
/*  4:   */   extends GoalType
/*  5:   */ {
/*  6:   */   private EntityHorse a;
/*  7:   */   private double b;
/*  8:   */   private double c;
/*  9:   */   private double d;
/* 10:   */   private double e;
/* 11:   */   
/* 12:   */   public aac(EntityHorse paramabt, double paramDouble)
/* 13:   */   {
/* 14:16 */     this.a = paramabt;
/* 15:17 */     this.b = paramDouble;
/* 16:18 */     a(1);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public boolean canStart()
/* 20:   */   {
/* 21:23 */     if ((this.a.cm()) || (this.a.rider == null)) {
/* 22:24 */       return false;
/* 23:   */     }
/* 24:26 */     Vec3 localbrw = abf.a(this.a, 5, 4);
/* 25:27 */     if (localbrw == null) {
/* 26:28 */       return false;
/* 27:   */     }
/* 28:30 */     this.c = localbrw.x;
/* 29:31 */     this.d = localbrw.y;
/* 30:32 */     this.e = localbrw.z;
/* 31:33 */     return true;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void start()
/* 35:   */   {
/* 36:38 */     this.a.getNavigator().a(this.c, this.d, this.e, this.b);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public boolean canContinue()
/* 40:   */   {
/* 41:43 */     return (!this.a.getNavigator().m()) && (this.a.rider != null);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void tick()
/* 45:   */   {
/* 46:48 */     if (this.a.getRNG().nextInt(50) == 0)
/* 47:   */     {
/* 48:49 */       if ((this.a.rider instanceof EntityPlayer))
/* 49:   */       {
/* 50:50 */         int i = this.a.cA();
/* 51:51 */         int j = this.a.cG();
/* 52:52 */         if ((j > 0) && (this.a.getRNG().nextInt(j) < i))
/* 53:   */         {
/* 54:53 */           this.a.h((EntityPlayer)this.a.rider);
/* 55:54 */           this.a.world.sendSignal(this.a, (byte)7);
/* 56:55 */           return;
/* 57:   */         }
/* 58:57 */         this.a.u(5);
/* 59:   */       }
/* 60:60 */       this.a.rider.mount((Entity)null);
/* 61:61 */       this.a.rider = null;
/* 62:62 */       this.a.cU();
/* 63:63 */       this.a.world.sendSignal(this.a, (byte)6);
/* 64:   */     }
/* 65:   */   }
/* 66:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aac
 * JD-Core Version:    0.7.0.1
 */