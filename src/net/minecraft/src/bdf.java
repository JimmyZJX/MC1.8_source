package net.minecraft.src;
/*  1:   */ public abstract class bdf
/*  2:   */   extends bcm
/*  3:   */   implements vv, vy
/*  4:   */ {
/*  5:12 */   private vx a = vx.a;
/*  6:   */   
/*  7:   */   public void a(NBTTagCompound paramfn)
/*  8:   */   {
/*  9:16 */     super.a(paramfn);
/* 10:   */     
/* 11:18 */     this.a = vx.b(paramfn);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void b(NBTTagCompound paramfn)
/* 15:   */   {
/* 16:23 */     super.b(paramfn);
/* 17:25 */     if (this.a != null) {
/* 18:26 */       this.a.a(paramfn);
/* 19:   */     }
/* 20:   */   }
/* 21:   */   
/* 22:   */   public boolean q_()
/* 23:   */   {
/* 24:32 */     return (this.a != null) && (!this.a.a());
/* 25:   */   }
/* 26:   */   
/* 27:   */   public vx i()
/* 28:   */   {
/* 29:37 */     return this.a;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void a(vx paramvx)
/* 33:   */   {
/* 34:42 */     this.a = paramvx;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public ho e_()
/* 38:   */   {
/* 39:52 */     if (k_()) {
/* 40:53 */       return new hy(getName());
/* 41:   */     }
/* 42:55 */     return new hz(getName(), new Object[0]);
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bdf
 * JD-Core Version:    0.7.0.1
 */