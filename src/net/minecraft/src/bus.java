package net.minecraft.src;
/*  1:   */ public class bus
/*  2:   */   extends bug
/*  3:   */ {
/*  4: 7 */   private boolean o = false;
/*  5:   */   
/*  6:   */   public bus(int paramInt1, int paramInt2, int paramInt3)
/*  7:   */   {
/*  8:10 */     super(paramInt1, paramInt2, paramInt3, 20, 20, "");
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean c()
/* 12:   */   {
/* 13:14 */     return this.o;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void b(boolean paramBoolean)
/* 17:   */   {
/* 18:18 */     this.o = paramBoolean;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(bsu parambsu, int paramInt1, int paramInt2)
/* 22:   */   {
/* 23:23 */     if (!this.m) {
/* 24:24 */       return;
/* 25:   */     }
/* 26:27 */     parambsu.N().a(bug.a);
/* 27:28 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 28:   */     
/* 29:30 */     int i = (paramInt1 >= this.h) && (paramInt2 >= this.i) && (paramInt1 < this.h + this.f) && (paramInt2 < this.i + this.g) ? 1 : 0;
/* 30:   */     but localbut;
/* 31:33 */     if (this.o)
/* 32:   */     {
/* 33:34 */       if (!this.l) {
/* 34:35 */         localbut = but.c;
/* 35:36 */       } else if (i != 0) {
/* 36:37 */         localbut = but.b;
/* 37:   */       } else {
/* 38:39 */         localbut = but.a;
/* 39:   */       }
/* 40:   */     }
/* 41:42 */     else if (!this.l) {
/* 42:43 */       localbut = but.f;
/* 43:44 */     } else if (i != 0) {
/* 44:45 */       localbut = but.e;
/* 45:   */     } else {
/* 46:47 */       localbut = but.d;
/* 47:   */     }
/* 48:51 */     b(this.h, this.i, localbut.a(), localbut.b(), this.f, this.g);
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bus
 * JD-Core Version:    0.7.0.1
 */