package net.minecraft.src;
/*  1:   */ public class bxc
/*  2:   */   extends bxf
/*  3:   */   implements uy
/*  4:   */ {
/*  5: 6 */   private String a = "";
/*  6: 7 */   private String f = "";
/*  7:   */   private int g;
/*  8:   */   private boolean h;
/*  9:   */   
/* 10:   */   public void a(String paramString)
/* 11:   */   {
/* 12:13 */     b(paramString);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void b(String paramString)
/* 16:   */   {
/* 17:18 */     this.a = paramString;
/* 18:   */     
/* 19:20 */     c("Working...");
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void c(String paramString)
/* 23:   */   {
/* 24:25 */     this.f = paramString;
/* 25:   */     
/* 26:27 */     a(0);
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(int paramInt)
/* 30:   */   {
/* 31:32 */     this.g = paramInt;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void a()
/* 35:   */   {
/* 36:37 */     this.h = true;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 40:   */   {
/* 41:42 */     if (this.h)
/* 42:   */     {
/* 43:43 */       this.j.a((bxf)null);
/* 44:44 */       return;
/* 45:   */     }
/* 46:47 */     c();
/* 47:   */     
/* 48:49 */     a(this.q, this.a, this.l / 2, 70, 16777215);
/* 49:50 */     a(this.q, this.f + " " + this.g + "%", this.l / 2, 90, 16777215);
/* 50:   */     
/* 51:52 */     super.a(paramInt1, paramInt2, paramFloat);
/* 52:   */   }
/* 53:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxc
 * JD-Core Version:    0.7.0.1
 */