package net.minecraft.src;
/*  1:   */ public class coz
/*  2:   */   implements cox
/*  3:   */ {
/*  4:   */   private cpa a;
/*  5:   */   private double b;
/*  6:   */   private double c;
/*  7:   */   private double d;
/*  8:   */   
/*  9:   */   public coz()
/* 10:   */   {
/* 11:11 */     this(coy.a());
/* 12:   */   }
/* 13:   */   
/* 14:   */   public coz(cpa paramcpa)
/* 15:   */   {
/* 16:15 */     this.a = paramcpa;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(double paramDouble1, double paramDouble2, double paramDouble3)
/* 20:   */   {
/* 21:20 */     this.b = paramDouble1;
/* 22:21 */     this.c = paramDouble2;
/* 23:22 */     this.d = paramDouble3;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public boolean b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/* 27:   */   {
/* 28:32 */     return this.a.b(paramDouble1 - this.b, paramDouble2 - this.c, paramDouble3 - this.d, paramDouble4 - this.b, paramDouble5 - this.c, paramDouble6 - this.d);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public boolean a(AABB parambrt)
/* 32:   */   {
/* 33:37 */     return b(parambrt.minX, parambrt.minY, parambrt.minZ, parambrt.maxX, parambrt.maxY, parambrt.maxZ);
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     coz
 * JD-Core Version:    0.7.0.1
 */