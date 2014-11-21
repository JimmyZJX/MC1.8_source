package net.minecraft.src;
/*  1:   */ public abstract class bpu
/*  2:   */ {
/*  3:   */   protected IBlockAccess a;
/*  4:11 */   protected um b = new um();
/*  5:   */   protected int c;
/*  6:   */   protected int d;
/*  7:   */   protected int e;
/*  8:   */   
/*  9:   */   public void a(IBlockAccess paramard, Entity paramwv)
/* 10:   */   {
/* 11:21 */     this.a = paramard;
/* 12:22 */     this.b.c();
/* 13:   */     
/* 14:24 */     this.c = MathUtils.floor(paramwv.width + 1.0F);
/* 15:25 */     this.d = MathUtils.floor(paramwv.height + 1.0F);
/* 16:26 */     this.e = MathUtils.floor(paramwv.width + 1.0F);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a() {}
/* 20:   */   
/* 21:   */   protected bpt a(int paramInt1, int paramInt2, int paramInt3)
/* 22:   */   {
/* 23:33 */     int i = bpt.a(paramInt1, paramInt2, paramInt3);
/* 24:34 */     bpt localbpt = (bpt)this.b.a(i);
/* 25:36 */     if (localbpt == null)
/* 26:   */     {
/* 27:37 */       localbpt = new bpt(paramInt1, paramInt2, paramInt3);
/* 28:38 */       this.b.a(i, localbpt);
/* 29:   */     }
/* 30:41 */     return localbpt;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public abstract bpt a(Entity paramwv);
/* 34:   */   
/* 35:   */   public abstract bpt a(Entity paramwv, double paramDouble1, double paramDouble2, double paramDouble3);
/* 36:   */   
/* 37:   */   public abstract int a(bpt[] paramArrayOfbpt, Entity paramwv, bpt parambpt1, bpt parambpt2, float paramFloat);
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpu
 * JD-Core Version:    0.7.0.1
 */