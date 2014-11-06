package net.minecraft.src;
/*  1:   */ import net.minecraft.realms.RealmsButton;
/*  2:   */ 
/*  3:   */ public class bvr
/*  4:   */   extends bug
/*  5:   */ {
/*  6:   */   private RealmsButton o;
/*  7:   */   
/*  8:   */   public bvr(RealmsButton paramRealmsButton, int paramInt1, int paramInt2, int paramInt3, String paramString)
/*  9:   */   {
/* 10:11 */     super(paramInt1, paramInt2, paramInt3, paramString);
/* 11:12 */     this.o = paramRealmsButton;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public bvr(RealmsButton paramRealmsButton, int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4, int paramInt5)
/* 15:   */   {
/* 16:16 */     super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramString);
/* 17:17 */     this.o = paramRealmsButton;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public int c()
/* 21:   */   {
/* 22:21 */     return this.k;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public boolean d()
/* 26:   */   {
/* 27:25 */     return this.l;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void b(boolean paramBoolean)
/* 31:   */   {
/* 32:29 */     this.l = paramBoolean;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void a(String paramString)
/* 36:   */   {
/* 37:33 */     this.j = paramString;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public int b()
/* 41:   */   {
/* 42:38 */     return super.b();
/* 43:   */   }
/* 44:   */   
/* 45:   */   public int e()
/* 46:   */   {
/* 47:42 */     return this.i;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public boolean c(bsu parambsu, int paramInt1, int paramInt2)
/* 51:   */   {
/* 52:47 */     if (super.c(parambsu, paramInt1, paramInt2)) {
/* 53:48 */       this.o.clicked(paramInt1, paramInt2);
/* 54:   */     }
/* 55:50 */     return super.c(parambsu, paramInt1, paramInt2);
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void a(int paramInt1, int paramInt2)
/* 59:   */   {
/* 60:55 */     this.o.released(paramInt1, paramInt2);
/* 61:   */   }
/* 62:   */   
/* 63:   */   public void b(bsu parambsu, int paramInt1, int paramInt2)
/* 64:   */   {
/* 65:60 */     this.o.renderBg(paramInt1, paramInt2);
/* 66:   */   }
/* 67:   */   
/* 68:   */   public RealmsButton f()
/* 69:   */   {
/* 70:64 */     return this.o;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public int a(boolean paramBoolean)
/* 74:   */   {
/* 75:69 */     return this.o.getYImage(paramBoolean);
/* 76:   */   }
/* 77:   */   
/* 78:   */   public int c(boolean paramBoolean)
/* 79:   */   {
/* 80:73 */     return super.a(paramBoolean);
/* 81:   */   }
/* 82:   */   
/* 83:   */   public int g()
/* 84:   */   {
/* 85:77 */     return this.g;
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvr
 * JD-Core Version:    0.7.0.1
 */