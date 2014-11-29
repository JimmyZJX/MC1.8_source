package net.minecraft.src;
/*  1:   */ class ajc
/*  2:   */   extends ajk
/*  3:   */ {
			  private final int a;
			  private final ajb b;
/*  4:   */   ajc(ajb paramajb, vq paramvq, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  5:   */   {
/*  6:44 */     super(paramvq, paramInt1, paramInt2, paramInt3);
				a=paramInt4;b=paramajb;
/*  7:   */   }
/*  8:   */   
/*  9:   */   public int a()
/* 10:   */   {
/* 11:47 */     return 1;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean a(ItemStack paramamj)
/* 15:   */   {
/* 16:52 */     if (paramamj == null) {
/* 17:53 */       return false;
/* 18:   */     }
/* 19:55 */     if ((paramamj.getItem() instanceof ItemArmor)) {
/* 20:56 */       return ((ItemArmor)paramamj.getItem()).b == this.a;
/* 21:   */     }
/* 22:58 */     if ((paramamj.getItem() == Item.fromBlock(BlockList.pumpkin)) || (paramamj.getItem() == ItemList.skull)) {
/* 23:59 */       return this.a == 0;
/* 24:   */     }
/* 25:61 */     return false;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public String c()
/* 29:   */   {
/* 30:67 */     return ItemArmor.a[this.a];
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajc
 * JD-Core Version:    0.7.0.1
 */