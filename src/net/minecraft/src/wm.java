package net.minecraft.src;
/*  1:   */ public class wm
/*  2:   */   extends Potion
/*  3:   */ {
/*  4:   */   protected wm(int paramInt1, oa paramoa, boolean paramBoolean, int paramInt2)
/*  5:   */   {
/*  6: 8 */     super(paramInt1, paramoa, paramBoolean, paramInt2);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public double a(int paramInt, ya paramya)
/* 10:   */   {
/* 11:13 */     if (this.id == Potion.weakness.id) {
/* 12:14 */       return -0.5F * (paramInt + 1);
/* 13:   */     }
/* 14:16 */     return 1.3D * (paramInt + 1);
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wm
 * JD-Core Version:    0.7.0.1
 */