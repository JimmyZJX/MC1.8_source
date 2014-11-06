package net.minecraft.src;
/*  1:   */ import java.util.Arrays;
/*  2:   */ import java.util.List;
/*  3:   */ import java.util.Map;
/*  4:   */ import java.util.Map.Entry;
/*  5:   */ import java.util.Random;
/*  6:   */ 
/*  7:   */ public class bmw
/*  8:   */   extends bmm
/*  9:   */ {
/* 10:18 */   public static final List d = Arrays.asList(new arm[] { arm.q, arm.r, arm.Y });
/* 11:   */   private int f;
/* 12:21 */   private int g = 32;
/* 13:22 */   private int h = 8;
/* 14:   */   
/* 15:   */   public bmw() {}
/* 16:   */   
/* 17:   */   public bmw(Map<String,String> paramMap)
/* 18:   */   {
/* 19:29 */     this();
/* 20:31 */     for (Map.Entry<String,String> localEntry : paramMap.entrySet()) {
/* 21:32 */       if (((String)localEntry.getKey()).equals("size")) {
/* 22:33 */         this.f = MathUtils.getInt((String)localEntry.getValue(), this.f, 0);
/* 23:34 */       } else if (((String)localEntry.getKey()).equals("distance")) {
/* 24:35 */         this.g = MathUtils.getInt((String)localEntry.getValue(), this.g, this.h + 1);
/* 25:   */       }
/* 26:   */     }
/* 27:   */   }
/* 28:   */   
/* 29:   */   public String a()
/* 30:   */   {
/* 31:42 */     return "Village";
/* 32:   */   }
/* 33:   */   
/* 34:   */   protected boolean a(int paramInt1, int paramInt2)
/* 35:   */   {
/* 36:47 */     int i = paramInt1;
/* 37:48 */     int j = paramInt2;
/* 38:49 */     if (paramInt1 < 0) {
/* 39:50 */       paramInt1 -= this.g - 1;
/* 40:   */     }
/* 41:52 */     if (paramInt2 < 0) {
/* 42:53 */       paramInt2 -= this.g - 1;
/* 43:   */     }
/* 44:56 */     int k = paramInt1 / this.g;
/* 45:57 */     int m = paramInt2 / this.g;
/* 46:58 */     Random localRandom = this.c.a(k, m, 10387312);
/* 47:59 */     k *= this.g;
/* 48:60 */     m *= this.g;
/* 49:61 */     k += localRandom.nextInt(this.g - this.h);
/* 50:62 */     m += localRandom.nextInt(this.g - this.h);
/* 51:63 */     paramInt1 = i;
/* 52:64 */     paramInt2 = j;
/* 53:66 */     if ((paramInt1 == k) && (paramInt2 == m))
/* 54:   */     {
/* 55:67 */       boolean bool = this.c.v().a(paramInt1 * 16 + 8, paramInt2 * 16 + 8, 0, d);
/* 56:68 */       if (bool) {
/* 57:69 */         return true;
/* 58:   */       }
/* 59:   */     }
/* 60:73 */     return false;
/* 61:   */   }
/* 62:   */   
/* 63:   */   protected bmv b(int paramInt1, int paramInt2)
/* 64:   */   {
/* 65:78 */     return new bmx(this.c, this.b, paramInt1, paramInt2, this.f);
/* 66:   */   }
/* 67:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmw
 * JD-Core Version:    0.7.0.1
 */