package net.minecraft.src;
/*  1:   */ import com.google.common.base.Function;
/*  2:   */ 
/*  3:   */ public class aku
/*  4:   */   extends amr
/*  5:   */ {
/*  6:   */   public aku(BlockType paramatr1, BlockType paramatr2, Function paramFunction)
/*  7:   */   {
/*  8:10 */     super(paramatr1, paramatr2, paramFunction);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public int a(ItemStack paramamj, int paramInt)
/* 12:   */   {
/* 13:15 */     avk localavk = avk.a(paramamj.getDamage2());
/* 14:16 */     if ((localavk == avk.c) || (localavk == avk.d)) {
/* 15:17 */       return aqt.a(0.5D, 1.0D);
/* 16:   */     }
/* 17:20 */     return super.a(paramamj, paramInt);
/* 18:   */   }
/* 19:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aku
 * JD-Core Version:    0.7.0.1
 */