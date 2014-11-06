package net.minecraft.src;
/*  1:   */ import java.util.Comparator;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class bsa
/*  5:   */ {
/*  6: 9 */   public static final Comparator<bsa> a = new bsb();
/*  7:   */   private final bsd b;
/*  8:   */   private final bry c;
/*  9:   */   private final String d;
/* 10:   */   private int e;
/* 11:   */   private boolean f;
/* 12:   */   private boolean g;
/* 13:   */   
/* 14:   */   public bsa(bsd parambsd, bry parambry, String paramString)
/* 15:   */   {
/* 16:30 */     this.b = parambsd;
/* 17:31 */     this.c = parambry;
/* 18:32 */     this.d = paramString;
/* 19:33 */     this.g = true;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(int paramInt)
/* 23:   */   {
/* 24:37 */     if (this.c.c().b()) {
/* 25:38 */       throw new IllegalStateException("Cannot modify read-only score");
/* 26:   */     }
/* 27:40 */     c(c() + paramInt);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void b(int paramInt)
/* 31:   */   {
/* 32:44 */     if (this.c.c().b()) {
/* 33:45 */       throw new IllegalStateException("Cannot modify read-only score");
/* 34:   */     }
/* 35:47 */     c(c() - paramInt);
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void a()
/* 39:   */   {
/* 40:51 */     if (this.c.c().b()) {
/* 41:52 */       throw new IllegalStateException("Cannot modify read-only score");
/* 42:   */     }
/* 43:54 */     a(1);
/* 44:   */   }
/* 45:   */   
/* 46:   */   public int c()
/* 47:   */   {
/* 48:65 */     return this.e;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void c(int paramInt)
/* 52:   */   {
/* 53:69 */     int i = this.e;
/* 54:70 */     this.e = paramInt;
/* 55:71 */     if ((i != paramInt) || (this.g))
/* 56:   */     {
/* 57:72 */       this.g = false;
/* 58:73 */       f().a(this);
/* 59:   */     }
/* 60:   */   }
/* 61:   */   
/* 62:   */   public bry d()
/* 63:   */   {
/* 64:78 */     return this.c;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public String e()
/* 68:   */   {
/* 69:82 */     return this.d;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public bsd f()
/* 73:   */   {
/* 74:86 */     return this.b;
/* 75:   */   }
/* 76:   */   
/* 77:   */   public boolean g()
/* 78:   */   {
/* 79:90 */     return this.f;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public void a(boolean paramBoolean)
/* 83:   */   {
/* 84:94 */     this.f = paramBoolean;
/* 85:   */   }
/* 86:   */   
/* 87:   */   public void a(List paramList)
/* 88:   */   {
/* 89:98 */     c(this.c.c().a(paramList));
/* 90:   */   }
/* 91:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsa
 * JD-Core Version:    0.7.0.1
 */