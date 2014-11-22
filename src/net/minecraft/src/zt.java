package net.minecraft.src;
/*  1:   */ public class zt
/*  2:   */   extends yv
/*  3:   */ {
/*  4:   */   boolean g;
/*  5:   */   int h;
/*  6:   */   
/*  7:   */   public zt(EntityMob paramxn, boolean paramBoolean)
/*  8:   */   {
/*  9:10 */     super(paramxn);
/* 10:11 */     this.a = paramxn;
/* 11:12 */     this.g = paramBoolean;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean canContinue()
/* 15:   */   {
/* 16:17 */     return (this.g) && (this.h > 0) && (super.canContinue());
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void start()
/* 20:   */   {
/* 21:22 */     this.h = 20;
/* 22:23 */     this.c.a(this.a.world, this.b, true);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void stop()
/* 26:   */   {
/* 27:28 */     if (this.g) {
/* 28:29 */       this.c.a(this.a.world, this.b, false);
/* 29:   */     }
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void tick()
/* 33:   */   {
/* 34:35 */     this.h -= 1;
/* 35:36 */     super.tick();
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zt
 * JD-Core Version:    0.7.0.1
 */