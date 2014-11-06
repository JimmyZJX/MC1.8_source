package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public abstract class cad
/*  4:   */   extends buu
/*  5:   */ {
/*  6:   */   protected final bsu u;
/*  7:   */   protected final List<bzy> v;
/*  8:   */   
/*  9:   */   public cad(bsu parambsu, int paramInt1, int paramInt2, List<bzy> paramList)
/* 10:   */   {
/* 11:16 */     super(parambsu, paramInt1, paramInt2, 32, paramInt2 - 55 + 4, 36);
/* 12:17 */     this.u = parambsu;
/* 13:18 */     this.v = paramList;
/* 14:19 */     this.k = false;
/* 15:   */     
/* 16:21 */     a(true, (int)(parambsu.k.a * 1.5F));
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected void a(int paramInt1, int paramInt2, ckx paramckx)
/* 20:   */   {
/* 21:26 */     String str = net.minecraft.src.a.t + "" + net.minecraft.src.a.r + e();
/* 22:27 */     this.u.k.a(str, paramInt1 + this.b / 2 - this.u.k.a(str) / 2, Math.min(this.d + 3, paramInt2), 16777215);
/* 23:   */   }
/* 24:   */   
/* 25:   */   protected abstract String e();
/* 26:   */   
/* 27:   */   public List<bzy> f()
/* 28:   */   {
/* 29:33 */     return this.v;
/* 30:   */   }
/* 31:   */   
/* 32:   */   protected int b()
/* 33:   */   {
/* 34:38 */     return f().size();
/* 35:   */   }
/* 36:   */   
/* 37:   */   public bzy b(int paramInt)
/* 38:   */   {
/* 39:43 */     return f().get(paramInt);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public int c()
/* 43:   */   {
/* 44:48 */     return this.b;
/* 45:   */   }
/* 46:   */   
/* 47:   */   protected int d()
/* 48:   */   {
/* 49:53 */     return this.f - 6;
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cad
 * JD-Core Version:    0.7.0.1
 */