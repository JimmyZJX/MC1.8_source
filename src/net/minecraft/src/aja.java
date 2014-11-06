package net.minecraft.src;
/*  1:   */ class aja
/*  2:   */   extends ajk
/*  3:   */ {
			  private final EntityHorse a;
			  private final aiy b;
/*  4:   */   aja(aiy paramaiy, vq paramvq, int paramInt1, int paramInt2, int paramInt3, EntityHorse paramabt)
/*  5:   */   {
/*  6:30 */     super(paramvq, paramInt1, paramInt2, paramInt3);
				a=paramabt;b=paramaiy;
/*  7:   */   }
/*  8:   */   
/*  9:   */   public boolean a(ItemStack paramamj)
/* 10:   */   {
/* 11:33 */     return (super.a(paramamj)) && (this.a.cM()) && (EntityHorse.a(paramamj.getItem()));
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean b()
/* 15:   */   {
/* 16:38 */     return this.a.cM();
/* 17:   */   }
/* 18:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aja
 * JD-Core Version:    0.7.0.1
 */