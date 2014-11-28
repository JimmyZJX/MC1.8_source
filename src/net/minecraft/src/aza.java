package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class aza
/*  4:   */   extends auu
/*  5:   */ {
/*  6:   */   protected Item j()
/*  7:   */   {
/*  8:13 */     return ItemList.potato;
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected Item l()
/* 12:   */   {
/* 13:18 */     return ItemList.potato;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, float paramFloat, int paramInt)
/* 17:   */   {
/* 18:23 */     super.a(paramaqu, paramdt, parambec, paramFloat, paramInt);
/* 19:25 */     if (paramaqu.isClient) {
/* 20:26 */       return;
/* 21:   */     }
/* 22:29 */     if ((((Integer)parambec.getData(a)).intValue() >= 7) && (paramaqu.rng.nextInt(50) == 0)) {
/* 23:30 */       a(paramaqu, paramdt, new ItemStack(ItemList.bU));
/* 24:   */     }
/* 25:   */   }
/* 26:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aza
 * JD-Core Version:    0.7.0.1
 */