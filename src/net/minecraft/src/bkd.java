package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bkd
/*   5:    */   extends bkb
/*   6:    */ {
/*   7:    */   public bkd() {}
/*   8:    */   
/*   9:    */   public bkd(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*  10:    */   {
/*  11:600 */     super(paramInt);
/*  12:    */     
/*  13:602 */     this.m = paramej;
/*  14:603 */     this.l = parambjb;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void a(bms parambms, List paramList, Random paramRandom)
/*  18:    */   {
/*  19:608 */     a((bkf)parambms, paramList, paramRandom, 2, 0, false);
/*  20:609 */     b((bkf)parambms, paramList, paramRandom, 0, 2, false);
/*  21:610 */     c((bkf)parambms, paramList, paramRandom, 0, 2, false);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public static bkd a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*  25:    */   {
/*  26:614 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -2, 0, 0, 7, 9, 7, paramej);
/*  27:616 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*  28:617 */       return null;
/*  29:    */     }
/*  30:620 */     return new bkd(paramInt4, paramRandom, localbjb, paramej);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*  34:    */   {
/*  35:626 */     a(paramaqu, parambjb, 0, 0, 0, 6, 1, 6, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  36:    */     
/*  37:628 */     a(paramaqu, parambjb, 0, 2, 0, 6, 7, 6, BlockList.air.instance(), BlockList.air.instance(), false);
/*  38:    */     
/*  39:    */ 
/*  40:631 */     a(paramaqu, parambjb, 0, 2, 0, 1, 6, 0, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  41:632 */     a(paramaqu, parambjb, 0, 2, 6, 1, 6, 6, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  42:633 */     a(paramaqu, parambjb, 5, 2, 0, 6, 6, 0, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  43:634 */     a(paramaqu, parambjb, 5, 2, 6, 6, 6, 6, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  44:635 */     a(paramaqu, parambjb, 0, 2, 0, 0, 6, 1, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  45:636 */     a(paramaqu, parambjb, 0, 2, 5, 0, 6, 6, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  46:637 */     a(paramaqu, parambjb, 6, 2, 0, 6, 6, 1, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  47:638 */     a(paramaqu, parambjb, 6, 2, 5, 6, 6, 6, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  48:    */     
/*  49:    */ 
/*  50:641 */     a(paramaqu, parambjb, 2, 6, 0, 4, 6, 0, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  51:642 */     a(paramaqu, parambjb, 2, 5, 0, 4, 5, 0, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*  52:643 */     a(paramaqu, parambjb, 2, 6, 6, 4, 6, 6, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  53:644 */     a(paramaqu, parambjb, 2, 5, 6, 4, 5, 6, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*  54:645 */     a(paramaqu, parambjb, 0, 6, 2, 0, 6, 4, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  55:646 */     a(paramaqu, parambjb, 0, 5, 2, 0, 5, 4, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*  56:647 */     a(paramaqu, parambjb, 6, 6, 2, 6, 6, 4, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  57:648 */     a(paramaqu, parambjb, 6, 5, 2, 6, 5, 4, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*  58:651 */     for (int i = 0; i <= 6; i++) {
/*  59:652 */       for (int j = 0; j <= 6; j++) {
/*  60:653 */         b(paramaqu, BlockList.netherBrick.instance(), i, -1, j, parambjb);
/*  61:    */       }
/*  62:    */     }
/*  63:657 */     return true;
/*  64:    */   }
/*  65:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkd
 * JD-Core Version:    0.7.0.1
 */