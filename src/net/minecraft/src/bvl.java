package net.minecraft.src;
/*  1:   */ public class bvl
/*  2:   */   extends bug
/*  3:   */ {
/*  4: 9 */   private float p = 1.0F;
/*  5:   */   public boolean o;
/*  6:   */   private btr q;
/*  7:   */   private final float r;
/*  8:   */   private final float s;
/*  9:   */   
/* 10:   */   public bvl(int paramInt1, int paramInt2, int paramInt3, btr parambtr)
/* 11:   */   {
/* 12:16 */     this(paramInt1, paramInt2, paramInt3, parambtr, 0.0F, 1.0F);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public bvl(int paramInt1, int paramInt2, int paramInt3, btr parambtr, float paramFloat1, float paramFloat2)
/* 16:   */   {
/* 17:20 */     super(paramInt1, paramInt2, paramInt3, 150, 20, "");
/* 18:21 */     this.q = parambtr;
/* 19:22 */     this.r = paramFloat1;
/* 20:23 */     this.s = paramFloat2;
/* 21:   */     
/* 22:25 */     bsu localbsu = bsu.z();
/* 23:26 */     this.p = parambtr.c(localbsu.t.a(parambtr));
/* 24:27 */     this.j = localbsu.t.c(parambtr);
/* 25:   */   }
/* 26:   */   
/* 27:   */   protected int a(boolean paramBoolean)
/* 28:   */   {
/* 29:32 */     return 0;
/* 30:   */   }
/* 31:   */   
/* 32:   */   protected void b(bsu parambsu, int paramInt1, int paramInt2)
/* 33:   */   {
/* 34:37 */     if (!this.m) {
/* 35:38 */       return;
/* 36:   */     }
/* 37:41 */     if (this.o)
/* 38:   */     {
/* 39:42 */       this.p = ((paramInt1 - (this.h + 4)) / (this.f - 8));
/* 40:43 */       this.p = MathUtils.clamp(this.p, 0.0F, 1.0F);
/* 41:44 */       float f = this.q.d(this.p);
/* 42:45 */       parambsu.t.a(this.q, f);
/* 43:46 */       this.p = this.q.c(f);
/* 44:47 */       this.j = parambsu.t.c(this.q);
/* 45:   */     }
/* 46:50 */     parambsu.N().a(a);
/* 47:51 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 48:52 */     b(this.h + (int)(this.p * (this.f - 8)), this.i, 0, 66, 4, 20);
/* 49:53 */     b(this.h + (int)(this.p * (this.f - 8)) + 4, this.i, 196, 66, 4, 20);
/* 50:   */   }
/* 51:   */   
/* 52:   */   public boolean c(bsu parambsu, int paramInt1, int paramInt2)
/* 53:   */   {
/* 54:58 */     if (super.c(parambsu, paramInt1, paramInt2))
/* 55:   */     {
/* 56:59 */       this.p = ((paramInt1 - (this.h + 4)) / (this.f - 8));
/* 57:60 */       this.p = MathUtils.clamp(this.p, 0.0F, 1.0F);
/* 58:61 */       parambsu.t.a(this.q, this.q.d(this.p));
/* 59:62 */       this.j = parambsu.t.c(this.q);
/* 60:63 */       this.o = true;
/* 61:64 */       return true;
/* 62:   */     }
/* 63:67 */     return false;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void a(int paramInt1, int paramInt2)
/* 67:   */   {
/* 68:72 */     this.o = false;
/* 69:   */   }
/* 70:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvl
 * JD-Core Version:    0.7.0.1
 */