package net.minecraft.src;
/*  1:   */ import org.lwjgl.opengl.GL11;
/*  2:   */ 
/*  3:   */ public abstract class cto
/*  4:   */   implements cui
/*  5:   */ {
/*  6: 6 */   protected int a = -1;
/*  7:   */   protected boolean b;
/*  8:   */   protected boolean c;
/*  9:   */   protected boolean d;
/* 10:   */   protected boolean e;
/* 11:   */   
/* 12:   */   public void a(boolean paramBoolean1, boolean paramBoolean2)
/* 13:   */   {
/* 14:14 */     this.b = paramBoolean1;
/* 15:15 */     this.c = paramBoolean2;
/* 16:   */     
/* 17:17 */     int i = -1;
/* 18:18 */     int j = -1;
/* 19:19 */     if (paramBoolean1)
/* 20:   */     {
/* 21:20 */       i = paramBoolean2 ? 9987 : 9729;
/* 22:21 */       j = 9729;
/* 23:   */     }
/* 24:   */     else
/* 25:   */     {
/* 26:23 */       i = paramBoolean2 ? 9986 : 9728;
/* 27:24 */       j = 9728;
/* 28:   */     }
/* 29:26 */     GL11.glTexParameteri(3553, 10241, i);
/* 30:27 */     GL11.glTexParameteri(3553, 10240, j);
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void b(boolean paramBoolean1, boolean paramBoolean2)
/* 34:   */   {
/* 35:32 */     this.d = this.b;
/* 36:33 */     this.e = this.c;
/* 37:34 */     a(paramBoolean1, paramBoolean2);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void a()
/* 41:   */   {
/* 42:39 */     a(this.d, this.e);
/* 43:   */   }
/* 44:   */   
/* 45:   */   public int b()
/* 46:   */   {
/* 47:44 */     if (this.a == -1) {
/* 48:45 */       this.a = cuj.a();
/* 49:   */     }
/* 50:48 */     return this.a;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void c()
/* 54:   */   {
/* 55:53 */     if (this.a != -1)
/* 56:   */     {
/* 57:54 */       cuj.a(this.a);
/* 58:55 */       this.a = -1;
/* 59:   */     }
/* 60:   */   }
/* 61:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cto
 * JD-Core Version:    0.7.0.1
 */