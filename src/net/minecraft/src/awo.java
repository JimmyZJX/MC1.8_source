package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class awo
/*  4:   */   extends avt
/*  5:   */ {
/*  6:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  7:   */   {
/*  8:14 */     if (paramInt > 3) {
/*  9:15 */       paramInt = 3;
/* 10:   */     }
/* 11:17 */     if (paramRandom.nextInt(10 - paramInt * 3) == 0) {
/* 12:18 */       return ItemList.ak;
/* 13:   */     }
/* 14:20 */     return Item.fromProtoBlock(this);
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     awo
 * JD-Core Version:    0.7.0.1
 */