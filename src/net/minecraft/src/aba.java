package net.minecraft.src;
/*  1:   */ public class aba
/*  2:   */   extends aay
/*  3:   */ {
/*  4:   */   private BlockPosition f;
/*  5:   */   
/*  6:   */   public aba(EntityMob paramxn, World paramaqu)
/*  7:   */   {
/*  8:24 */     super(paramxn, paramaqu);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public bpv a(BlockPosition paramdt)
/* 12:   */   {
/* 13:29 */     this.f = paramdt;
/* 14:30 */     return super.a(paramdt);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public bpv a(Entity paramwv)
/* 18:   */   {
/* 19:35 */     this.f = new BlockPosition(paramwv);
/* 20:36 */     return super.a(paramwv);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public boolean a(Entity paramwv, double paramDouble)
/* 24:   */   {
/* 25:41 */     bpv localbpv = a(paramwv);
/* 26:42 */     if (localbpv != null) {
/* 27:43 */       return a(localbpv, paramDouble);
/* 28:   */     }
/* 29:45 */     this.f = new BlockPosition(paramwv);
/* 30:46 */     this.e = paramDouble;
/* 31:47 */     return true;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void tick()
/* 35:   */   {
/* 36:53 */     if (m())
/* 37:   */     {
/* 38:54 */       if (this.f != null)
/* 39:   */       {
/* 40:55 */         double d = this.mob.width * this.mob.width;
/* 41:57 */         if ((this.mob.c(this.f) < d) || ((this.mob.yPos > this.f.getY()) && (this.mob.c(new BlockPosition(this.f.getX(), MathUtils.floor(this.mob.yPos), this.f.getZ())) < d))) {
/* 42:58 */           this.f = null;
/* 43:   */         } else {
/* 44:60 */           this.mob.q().setTarget(this.f.getX(), this.f.getY(), this.f.getZ(), this.e);
/* 45:   */         }
/* 46:   */       }
/* 47:63 */       return;
/* 48:   */     }
/* 49:65 */     super.tick();
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aba
 * JD-Core Version:    0.7.0.1
 */