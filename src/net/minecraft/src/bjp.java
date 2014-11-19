package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bjp
/*   5:    */   extends bkb
/*   6:    */ {
/*   7:    */   public bjp() {}
/*   8:    */   
/*   9:    */   public bjp(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*  10:    */   {
/*  11:506 */     super(paramInt);
/*  12:    */     
/*  13:508 */     this.m = paramej;
/*  14:509 */     this.l = parambjb;
/*  15:    */   }
/*  16:    */   
/*  17:    */   protected bjp(Random paramRandom, int paramInt1, int paramInt2)
/*  18:    */   {
/*  19:513 */     super(0);
/*  20:    */     
/*  21:515 */     this.m = en.HORIZONTAL.getRandomDirection(paramRandom);
/*  22:517 */     switch (bjo.a[this.m.ordinal()])
/*  23:    */     {
/*  24:    */     case 1: 
/*  25:    */     case 2: 
/*  26:520 */       this.l = new bjb(paramInt1, 64, paramInt2, paramInt1 + 19 - 1, 73, paramInt2 + 19 - 1);
/*  27:521 */       break;
/*  28:    */     default: 
/*  29:523 */       this.l = new bjb(paramInt1, 64, paramInt2, paramInt1 + 19 - 1, 73, paramInt2 + 19 - 1);
/*  30:    */     }
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void a(bms parambms, List<bms> paramList, Random paramRandom)
/*  34:    */   {
/*  35:530 */     a((bkf)parambms, paramList, paramRandom, 8, 3, false);
/*  36:531 */     b((bkf)parambms, paramList, paramRandom, 3, 8, false);
/*  37:532 */     c((bkf)parambms, paramList, paramRandom, 3, 8, false);
/*  38:    */   }
/*  39:    */   
/*  40:    */   public static bjp a(List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*  41:    */   {
/*  42:536 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -8, -3, 0, 19, 10, 19, paramej);
/*  43:538 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*  44:539 */       return null;
/*  45:    */     }
/*  46:542 */     return new bjp(paramInt4, paramRandom, localbjb, paramej);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*  50:    */   {
/*  51:548 */     a(paramaqu, parambjb, 7, 3, 0, 11, 4, 18, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  52:549 */     a(paramaqu, parambjb, 0, 3, 7, 18, 4, 11, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  53:    */     
/*  54:551 */     a(paramaqu, parambjb, 8, 5, 0, 10, 7, 18, BlockList.air.instance(), BlockList.air.instance(), false);
/*  55:552 */     a(paramaqu, parambjb, 0, 5, 8, 18, 7, 10, BlockList.air.instance(), BlockList.air.instance(), false);
/*  56:    */     
/*  57:554 */     a(paramaqu, parambjb, 7, 5, 0, 7, 5, 7, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  58:555 */     a(paramaqu, parambjb, 7, 5, 11, 7, 5, 18, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  59:556 */     a(paramaqu, parambjb, 11, 5, 0, 11, 5, 7, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  60:557 */     a(paramaqu, parambjb, 11, 5, 11, 11, 5, 18, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  61:558 */     a(paramaqu, parambjb, 0, 5, 7, 7, 5, 7, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  62:559 */     a(paramaqu, parambjb, 11, 5, 7, 18, 5, 7, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  63:560 */     a(paramaqu, parambjb, 0, 5, 11, 7, 5, 11, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  64:561 */     a(paramaqu, parambjb, 11, 5, 11, 18, 5, 11, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  65:    */     
/*  66:    */ 
/*  67:564 */     a(paramaqu, parambjb, 7, 2, 0, 11, 2, 5, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  68:565 */     a(paramaqu, parambjb, 7, 2, 13, 11, 2, 18, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  69:566 */     a(paramaqu, parambjb, 7, 0, 0, 11, 1, 3, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  70:567 */     a(paramaqu, parambjb, 7, 0, 15, 11, 1, 18, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  71:    */     int j;
/*  72:568 */     for (int i = 7; i <= 11; i++) {
/*  73:569 */       for (j = 0; j <= 2; j++)
/*  74:    */       {
/*  75:570 */         b(paramaqu, BlockList.netherBrick.instance(), i, -1, j, parambjb);
/*  76:571 */         b(paramaqu, BlockList.netherBrick.instance(), i, -1, 18 - j, parambjb);
/*  77:    */       }
/*  78:    */     }
/*  79:575 */     a(paramaqu, parambjb, 0, 2, 7, 5, 2, 11, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  80:576 */     a(paramaqu, parambjb, 13, 2, 7, 18, 2, 11, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  81:577 */     a(paramaqu, parambjb, 0, 0, 7, 3, 1, 11, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  82:578 */     a(paramaqu, parambjb, 15, 0, 7, 18, 1, 11, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  83:579 */     for (int i = 0; i <= 2; i++) {
/*  84:580 */       for (j = 7; j <= 11; j++)
/*  85:    */       {
/*  86:581 */         b(paramaqu, BlockList.netherBrick.instance(), i, -1, j, parambjb);
/*  87:582 */         b(paramaqu, BlockList.netherBrick.instance(), 18 - i, -1, j, parambjb);
/*  88:    */       }
/*  89:    */     }
/*  90:586 */     return true;
/*  91:    */   }
/*  92:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjp
 * JD-Core Version:    0.7.0.1
 */