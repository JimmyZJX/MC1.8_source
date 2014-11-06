package net.minecraft.src;
/*  1:   */ public class abb
/*  2:   */   extends aaz
/*  3:   */ {
/*  4:   */   public abb(EntityMob paramxn, World paramaqu)
/*  5:   */   {
/*  6:12 */     super(paramxn, paramaqu);
/*  7:   */   }
/*  8:   */   
/*  9:   */   protected bpw a()
/* 10:   */   {
/* 11:17 */     return new bpw(new bpx());
/* 12:   */   }
/* 13:   */   
/* 14:   */   protected boolean b()
/* 15:   */   {
/* 16:22 */     return o();
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected Vec3 c()
/* 20:   */   {
/* 21:27 */     return new Vec3(this.b.xPos, this.b.yPos + this.b.K * 0.5D, this.b.zPos);
/* 22:   */   }
/* 23:   */   
/* 24:   */   protected void l()
/* 25:   */   {
/* 26:32 */     Vec3 localbrw1 = c();
/* 27:   */     
/* 28:   */ 
/* 29:35 */     float f = this.b.J * this.b.J;
/* 30:36 */     int i = 6;
/* 31:37 */     if (localbrw1.g(this.d.a(this.b, this.d.e())) < f) {
/* 32:38 */       this.d.a();
/* 33:   */     }
/* 34:41 */     for (int j = Math.min(this.d.e() + i, this.d.d() - 1); j > this.d.e(); j--)
/* 35:   */     {
/* 36:42 */       Vec3 localbrw2 = this.d.a(this.b, j);
/* 37:43 */       if (localbrw2.g(localbrw1) <= 36.0D) {
/* 38:46 */         if (a(localbrw1, localbrw2, 0, 0, 0))
/* 39:   */         {
/* 40:47 */           this.d.c(j);
/* 41:48 */           break;
/* 42:   */         }
/* 43:   */       }
/* 44:   */     }
/* 45:52 */     a(localbrw1);
/* 46:   */   }
/* 47:   */   
/* 48:   */   protected void d()
/* 49:   */   {
/* 50:57 */     super.d();
/* 51:   */   }
/* 52:   */   
/* 53:   */   protected boolean a(Vec3 parambrw1, Vec3 parambrw2, int paramInt1, int paramInt2, int paramInt3)
/* 54:   */   {
/* 55:62 */     HitResult localbru = this.c.a(parambrw1, new Vec3(parambrw2.x, parambrw2.y + this.b.K * 0.5D, parambrw2.z), false, true, false);
/* 56:63 */     return (localbru == null) || (localbru.a == brv.MISS);
/* 57:   */   }
/* 58:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abb
 * JD-Core Version:    0.7.0.1
 */