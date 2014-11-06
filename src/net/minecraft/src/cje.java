package net.minecraft.src;
/*  1:   */ public enum cje
/*  2:   */ { a(
				new cjh(cjg.f,cjg.e,cjg.a,null),
				new cjh(cjg.f,cjg.e,cjg.d,null),
				new cjh(cjg.c,cjg.e,cjg.d,null),
				new cjh(cjg.c,cjg.e,cjg.a,null)
			  ),
			  b(
				new cjh(cjg.f,cjg.b,cjg.d,null),
				new cjh(cjg.f,cjg.b,cjg.a,null),
				new cjh(cjg.c,cjg.b,cjg.a,null),
				new cjh(cjg.c,cjg.b,cjg.d,null)
			  ),
			  c(
				new cjh(cjg.c,cjg.b,cjg.d,null),
				new cjh(cjg.c,cjg.e,cjg.d,null),
				new cjh(cjg.f,cjg.e,cjg.d,null),
				new cjh(cjg.f,cjg.b,cjg.d,null)
			  ),
			  d(
				new cjh(cjg.f,cjg.b,cjg.a,null),
				new cjh(cjg.f,cjg.e,cjg.a,null),
				new cjh(cjg.c,cjg.e,cjg.a,null),
				new cjh(cjg.c,cjg.b,cjg.a,null)
			  ),
			  e(
				new cjh(cjg.f,cjg.b,cjg.d,null),
				new cjh(cjg.f,cjg.e,cjg.d,null),
				new cjh(cjg.f,cjg.e,cjg.a,null),
				new cjh(cjg.f,cjg.b,cjg.a,null)
			  ),
			  f(
				new cjh(cjg.c,cjg.b,cjg.a,null),
				new cjh(cjg.c,cjg.e,cjg.a,null),
				new cjh(cjg.c,cjg.e,cjg.d,null),
				new cjh(cjg.c,cjg.b,cjg.d,null)
			  );
/*  3:   */   private static final cje[] g;
/*  4:   */   private final cjh[] h;
/*  5:   */   
/*  6:   */   static
/*  7:   */   {
/*  8:31 */     g = new cje[6];
/*  9:   */     
/* 10:   */ 
/* 11:   */ 
/* 12:   */ 
/* 13:   */ 
/* 14:   */ 
/* 15:   */ 
/* 16:   */ 
/* 17:   */ 
/* 18:   */ 
/* 19:   */ 
/* 20:   */ 
/* 21:44 */     g[cjg.e] = a;
/* 22:45 */     g[cjg.b] = b;
/* 23:46 */     g[cjg.d] = c;
/* 24:47 */     g[cjg.a] = d;
/* 25:48 */     g[cjg.f] = e;
/* 26:49 */     g[cjg.c] = f;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public static cje a(EnumDirection paramej)
/* 30:   */   {
/* 31:55 */     return g[paramej.a()];
/* 32:   */   }
/* 33:   */   
/* 34:   */   private cje(cjh... paramVarArgs)
/* 35:   */   {
/* 36:59 */     this.h = paramVarArgs;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public cjh a(int paramInt)
/* 40:   */   {
/* 41:63 */     return this.h[paramInt];
/* 42:   */   }
/* 43:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cje
 * JD-Core Version:    0.7.0.1
 */