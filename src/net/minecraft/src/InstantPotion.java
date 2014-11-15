package net.minecraft.src;
/*  1:   */ public class InstantPotion
/*  2:   */   extends Potion
/*  3:   */ {
/*  4:   */   public InstantPotion(int paramInt1, oa paramoa, boolean paramBoolean, int paramInt2)
/*  5:   */   {
/*  6: 7 */     super(paramInt1, paramoa, paramBoolean, paramInt2);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public boolean isInstant()
/* 10:   */   {
/* 11:12 */     return true;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean a(int paramInt1, int paramInt2)
/* 15:   */   {
/* 16:17 */     return paramInt1 >= 1;
/* 17:   */   }
/* 18:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wo
 * JD-Core Version:    0.7.0.1
 */