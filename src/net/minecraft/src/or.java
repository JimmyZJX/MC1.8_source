package net.minecraft.src;
/*  1:   */ class or
/*  2:   */   extends oc
/*  3:   */ {
			  private final ItemStack b;
			  private final oq c;
/*  4:   */   or(oq paramoq, ItemStack paramamj) {b=paramamj;c=paramoq;}
/*  5:   */   
/*  6:   */   protected aho a(World paramaqu, ex paramex)
/*  7:   */   {
/*  8:87 */     return new ahv(paramaqu, paramex.a(), paramex.b(), paramex.c(), this.b.k());
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected float a()
/* 12:   */   {
/* 13:92 */     return super.a() * 0.5F;
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected float b()
/* 17:   */   {
/* 18:97 */     return super.b() * 1.25F;
/* 19:   */   }
/* 20:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     or
 * JD-Core Version:    0.7.0.1
 */