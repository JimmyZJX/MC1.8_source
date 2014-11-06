package net.minecraft.src;
/*  1:   */ public class u
/*  2:   */   extends RuntimeException
/*  3:   */ {
/*  4:   */   private final b a;
/*  5:   */   
/*  6:   */   public u(b paramb)
/*  7:   */   {
/*  8: 9 */     this.a = paramb;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public b a()
/* 12:   */   {
/* 13:13 */     return this.a;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public Throwable getCause()
/* 17:   */   {
/* 18:18 */     return this.a.b();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public String getMessage()
/* 22:   */   {
/* 23:23 */     return this.a.a();
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     u
 * JD-Core Version:    0.7.0.1
 */