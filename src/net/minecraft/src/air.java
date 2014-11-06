package net.minecraft.src;
/*  1:   */ class air
/*  2:   */   extends wa
/*  3:   */ {
			  private final aiq a;
/*  4:   */   air(aiq paramaiq, String paramString, boolean paramBoolean, int paramInt)
/*  5:   */   {
/*  6:21 */     super(paramString, paramBoolean, paramInt);
				a=paramaiq;
/*  7:   */   }
/*  8:   */   
/*  9:   */   public int p_()
/* 10:   */   {
/* 11:24 */     return 64;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void o_()
/* 15:   */   {
/* 16:29 */     super.o_();
/* 17:30 */     this.a.a(this);
/* 18:   */   }
/* 19:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     air
 * JD-Core Version:    0.7.0.1
 */