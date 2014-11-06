package net.minecraft.src;
/*  1:   */ import java.util.Map;
/*  2:   */ import java.util.Map.Entry;
/*  3:   */ import java.util.Random;
/*  4:   */ 
/*  5:   */ public class bjd
/*  6:   */   extends bmm
/*  7:   */ {
/*  8:10 */   private double d = 0.004D;
/*  9:   */   
/* 10:   */   public bjd() {}
/* 11:   */   
/* 12:   */   public String a()
/* 13:   */   {
/* 14:17 */     return "Mineshaft";
/* 15:   */   }
/* 16:   */   
/* 17:   */   public bjd(Map<String,String> paramMap)
/* 18:   */   {
/* 19:21 */     for (Map.Entry<String,String> localEntry : paramMap.entrySet()) {
/* 20:22 */       if (((String)localEntry.getKey()).equals("chance")) {
/* 21:23 */         this.d = MathUtils.getDouble((String)localEntry.getValue(), this.d);
/* 22:   */       }
/* 23:   */     }
/* 24:   */   }
/* 25:   */   
/* 26:   */   protected boolean a(int paramInt1, int paramInt2)
/* 27:   */   {
/* 28:30 */     return (this.b.nextDouble() < this.d) && (this.b.nextInt(80) < Math.max(Math.abs(paramInt1), Math.abs(paramInt2)));
/* 29:   */   }
/* 30:   */   
/* 31:   */   protected bmv b(int paramInt1, int paramInt2)
/* 32:   */   {
/* 33:35 */     return new bjk(this.c, this.b, paramInt1, paramInt2);
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjd
 * JD-Core Version:    0.7.0.1
 */