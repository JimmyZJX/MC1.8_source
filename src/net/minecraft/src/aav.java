package net.minecraft.src;
/*  1:   */ public class aav
/*  2:   */   extends aaw
/*  3:   */ {
/*  4:   */   EntityPet a;
/*  5:   */   EntityLiving b;
/*  6:   */   private int c;
/*  7:   */   
/*  8:   */   public aav(EntityPet paramxx)
/*  9:   */   {
/* 10:12 */     super(paramxx, false);
/* 11:13 */     this.a = paramxx;
/* 12:14 */     a(1);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean canStart()
/* 16:   */   {
/* 17:19 */     if (!this.a.cj()) {
/* 18:20 */       return false;
/* 19:   */     }
/* 20:22 */     EntityLiving localxm = this.a.l_();
/* 21:23 */     if (localxm == null) {
/* 22:24 */       return false;
/* 23:   */     }
/* 24:26 */     this.b = localxm.be();
/* 25:27 */     int i = localxm.bf();
/* 26:28 */     return (i != this.c) && (a(this.b, false)) && (this.a.a(this.b, localxm));
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void start()
/* 30:   */   {
/* 31:33 */     this.e.d(this.b);
/* 32:   */     
/* 33:35 */     EntityLiving localxm = this.a.l_();
/* 34:36 */     if (localxm != null) {
/* 35:37 */       this.c = localxm.bf();
/* 36:   */     }
/* 37:40 */     super.start();
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aav
 * JD-Core Version:    0.7.0.1
 */