package net.minecraft.src;
/*   1:    */ public enum cam
/*   2:    */ { a(new hz("stream.unavailable.no_fbo")),
				b(new hz("stream.unavailable.library_arch_mismatch")),
				c(new hz("stream.unavailable.library_failure"),new hz("stream.unavailable.report_to_mojang")),
				d(new hz("stream.unavailable.not_supported.windows")),
				e(new hz("stream.unavailable.not_supported.mac","stream.unavailable.not_supported.mac.okay")),
				f(new hz("stream.unavailable.not_supported.other")),
				g(new hz("stream.unavailable.account_not_migrated"),new hz("stream.unavailable.account_not_migrated.okay")),
				h(new hz("stream.unavailable.account_not_bound"),new hz("stream.unavailable.account_not_bound.okay")),
				i(new hz("stream.unavailable.failed_auth"),new hz("stream.unavailable.failed_auth.okay")),
				j(new hz("stream.unavailable.failed_auth_error")),
				k(new hz("stream.unavailable.initialization_failure"),new hz("stream.unavailable.report_to_mojang")),
				l(new hz("stream.unavailable.unknown"),new hz("stream.unavailable.report_to_mojang"));
/*   3:    */   private final ho m;
/*   4:    */   private final ho n;
/*   5:    */   
/*   6:    */   private cam(ho paramho)
/*   7:    */   {
/*   8:195 */     this(paramho, null);
/*   9:    */   }
/*  10:    */   
/*  11:    */   private cam(ho paramho1, ho paramho2)
/*  12:    */   {
/*  13:199 */     this.m = paramho1;
/*  14:200 */     this.n = paramho2;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public ho a()
/*  18:    */   {
/*  19:204 */     return this.m;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public ho b()
/*  23:    */   {
/*  24:208 */     return this.n;
/*  25:    */   }
/*  26:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cam
 * JD-Core Version:    0.7.0.1
 */