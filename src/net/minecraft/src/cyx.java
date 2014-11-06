package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class cyx
/*  4:   */   implements pm
/*  5:   */ {
/*  6:14 */   private final Random a = new Random();
/*  7:   */   private final bsu b;
/*  8:   */   private cye c;
/*  9:17 */   private int d = 100;
/* 10:   */   
/* 11:   */   public cyx(bsu parambsu)
/* 12:   */   {
/* 13:20 */     this.b = parambsu;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void c()
/* 17:   */   {
/* 18:25 */     EnumMusic localcyy = this.b.V();
/* 19:27 */     if (this.c != null)
/* 20:   */     {
/* 21:28 */       if (!localcyy.a().equals(this.c.a()))
/* 22:   */       {
/* 23:29 */         this.b.U().b(this.c);
/* 24:30 */         this.d = MathUtils.nextInt(this.a, 0, localcyy.b() / 2);
/* 25:   */       }
/* 26:33 */       if (!this.b.U().c(this.c))
/* 27:   */       {
/* 28:34 */         this.c = null;
/* 29:35 */         this.d = Math.min(MathUtils.nextInt(this.a, localcyy.b(), localcyy.c()), this.d);
/* 30:   */       }
/* 31:   */     }
/* 32:39 */     if ((this.c == null) && (this.d-- <= 0))
/* 33:   */     {
/* 34:40 */       this.c = cxy.a(localcyy.a());
/* 35:41 */       this.b.U().a(this.c);
/* 36:42 */       this.d = 2147483647;
/* 37:   */     }
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cyx
 * JD-Core Version:    0.7.0.1
 */