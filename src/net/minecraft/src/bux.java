package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class bux
/*  5:   */   extends buu<buy>
/*  6:   */ {
/*  7:10 */   private final List<buy> u = Lists.newArrayList();
/*  8:   */   
/*  9:   */   public bux(bsu parambsu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, btr... paramVarArgs)
/* 10:   */   {
/* 11:13 */     super(parambsu, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 12:14 */     this.k = false;
/* 13:16 */     for (int i = 0; i < paramVarArgs.length; i += 2)
/* 14:   */     {
/* 15:17 */       btr localbtr1 = paramVarArgs[i];
/* 16:18 */       btr localbtr2 = i < paramVarArgs.length - 1 ? paramVarArgs[(i + 1)] : null;
/* 17:19 */       bug localbug1 = a(parambsu, paramInt1 / 2 - 155, 0, localbtr1);
/* 18:20 */       bug localbug2 = a(parambsu, paramInt1 / 2 - 155 + 160, 0, localbtr2);
/* 19:   */       
/* 20:22 */       this.u.add(new buy(localbug1, localbug2));
/* 21:   */     }
/* 22:   */   }
/* 23:   */   
/* 24:   */   private bug a(bsu parambsu, int paramInt1, int paramInt2, btr parambtr)
/* 25:   */   {
/* 26:27 */     if (parambtr == null) {
/* 27:28 */       return null;
/* 28:   */     }
/* 29:30 */     int i = parambtr.c();
/* 30:31 */     return parambtr.a() ? new bvl(i, paramInt1, paramInt2, parambtr) : new buw(i, paramInt1, paramInt2, parambtr, parambsu.t.c(parambtr));
/* 31:   */   }
/* 32:   */   
/* 33:   */   public buy b(int paramInt)
/* 34:   */   {
/* 35:36 */     return this.u.get(paramInt);
/* 36:   */   }
/* 37:   */   
/* 38:   */   protected int b()
/* 39:   */   {
/* 40:41 */     return this.u.size();
/* 41:   */   }
/* 42:   */   
/* 43:   */   public int c()
/* 44:   */   {
/* 45:46 */     return 400;
/* 46:   */   }
/* 47:   */   
/* 48:   */   protected int d()
/* 49:   */   {
/* 50:51 */     return super.d() + 32;
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bux
 * JD-Core Version:    0.7.0.1
 */