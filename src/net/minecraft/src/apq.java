package net.minecraft.src;
/*  1:   */ public class apq
/*  2:   */   extends Enchantment
/*  3:   */ {
/*  4:   */   protected apq(int paramInt1, oa paramoa, int paramInt2, apg paramapg)
/*  5:   */   {
/*  6: 7 */     super(paramInt1, paramoa, paramInt2, paramapg);
/*  7:   */     
/*  8: 9 */     c("fishingSpeed");
/*  9:   */   }
/* 10:   */   
/* 11:   */   public int a(int paramInt)
/* 12:   */   {
/* 13:14 */     return 15 + (paramInt - 1) * 9;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public int b(int paramInt)
/* 17:   */   {
/* 18:19 */     return super.a(paramInt) + 50;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public int b()
/* 22:   */   {
/* 23:24 */     return 3;
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     apq
 * JD-Core Version:    0.7.0.1
 */