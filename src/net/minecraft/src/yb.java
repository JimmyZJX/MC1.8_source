package net.minecraft.src;
/*  1:   */ public abstract class yb
/*  2:   */   implements xy
/*  3:   */ {
/*  4:   */   private final xy a;
/*  5:   */   private final String b;
/*  6:   */   private final double c;
/*  7:   */   private boolean d;
/*  8:   */   
/*  9:   */   protected yb(xy paramxy, String paramString, double paramDouble)
/* 10:   */   {
/* 11:12 */     this.a = paramxy;
/* 12:13 */     this.b = paramString;
/* 13:14 */     this.c = paramDouble;
/* 14:16 */     if (paramString == null) {
/* 15:17 */       throw new IllegalArgumentException("Name cannot be null!");
/* 16:   */     }
/* 17:   */   }
/* 18:   */   
/* 19:   */   public String a()
/* 20:   */   {
/* 21:23 */     return this.b;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public double b()
/* 25:   */   {
/* 26:28 */     return this.c;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public boolean c()
/* 30:   */   {
/* 31:33 */     return this.d;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public yb a(boolean paramBoolean)
/* 35:   */   {
/* 36:37 */     this.d = paramBoolean;
/* 37:38 */     return this;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public xy d()
/* 41:   */   {
/* 42:44 */     return this.a;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public int hashCode()
/* 46:   */   {
/* 47:49 */     return this.b.hashCode();
/* 48:   */   }
/* 49:   */   
/* 50:   */   public boolean equals(Object paramObject)
/* 51:   */   {
/* 52:54 */     return ((paramObject instanceof xy)) && (this.b.equals(((xy)paramObject).a()));
/* 53:   */   }
/* 54:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yb
 * JD-Core Version:    0.7.0.1
 */