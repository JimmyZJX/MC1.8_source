package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bnp
/*   5:    */   extends bnn
/*   6:    */ {
/*   7:    */   public bnp() {}
/*   8:    */   
/*   9:    */   public bnp(bnk parambnk, int paramInt1, Random paramRandom, int paramInt2, int paramInt3)
/*  10:    */   {
/*  11:403 */     super(parambnk, paramInt1);
/*  12:    */     
/*  13:405 */     this.m = en.HORIZONTAL.getRandomDirection(paramRandom);
/*  14:407 */     switch (bmz.a[this.m.ordinal()])
/*  15:    */     {
/*  16:    */     case 1: 
/*  17:    */     case 2: 
/*  18:410 */       this.l = new bjb(paramInt2, 64, paramInt3, paramInt2 + 6 - 1, 78, paramInt3 + 6 - 1);
/*  19:411 */       break;
/*  20:    */     default: 
/*  21:413 */       this.l = new bjb(paramInt2, 64, paramInt3, paramInt2 + 6 - 1, 78, paramInt3 + 6 - 1);
/*  22:    */     }
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void a(bms parambms, List paramList, Random paramRandom)
/*  26:    */   {
/*  27:427 */     bmy.b((bnk)parambms, paramList, paramRandom, this.l.a - 1, this.l.e - 4, this.l.c + 1, EnumDirection.WEST, d());
/*  28:428 */     bmy.b((bnk)parambms, paramList, paramRandom, this.l.d + 1, this.l.e - 4, this.l.c + 1, EnumDirection.EAST, d());
/*  29:429 */     bmy.b((bnk)parambms, paramList, paramRandom, this.l.a + 1, this.l.e - 4, this.l.c - 1, EnumDirection.NORTH, d());
/*  30:430 */     bmy.b((bnk)parambms, paramList, paramRandom, this.l.a + 1, this.l.e - 4, this.l.f + 1, EnumDirection.SOUTH, d());
/*  31:    */   }
/*  32:    */   
/*  33:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*  34:    */   {
/*  35:435 */     if (this.h < 0)
/*  36:    */     {
/*  37:436 */       this.h = b(paramaqu, parambjb);
/*  38:437 */       if (this.h < 0) {
/*  39:438 */         return true;
/*  40:    */       }
/*  41:440 */       this.l.a(0, this.h - this.l.e + 3, 0);
/*  42:    */     }
/*  43:443 */     a(paramaqu, parambjb, 1, 0, 1, 4, 12, 4, BlockList.cobblestone.instance(), BlockList.flowingWater.instance(), false);
/*  44:444 */     a(paramaqu, BlockList.air.instance(), 2, 12, 2, parambjb);
/*  45:445 */     a(paramaqu, BlockList.air.instance(), 3, 12, 2, parambjb);
/*  46:446 */     a(paramaqu, BlockList.air.instance(), 2, 12, 3, parambjb);
/*  47:447 */     a(paramaqu, BlockList.air.instance(), 3, 12, 3, parambjb);
/*  48:    */     
/*  49:449 */     a(paramaqu, BlockList.fence.instance(), 1, 13, 1, parambjb);
/*  50:450 */     a(paramaqu, BlockList.fence.instance(), 1, 14, 1, parambjb);
/*  51:451 */     a(paramaqu, BlockList.fence.instance(), 4, 13, 1, parambjb);
/*  52:452 */     a(paramaqu, BlockList.fence.instance(), 4, 14, 1, parambjb);
/*  53:453 */     a(paramaqu, BlockList.fence.instance(), 1, 13, 4, parambjb);
/*  54:454 */     a(paramaqu, BlockList.fence.instance(), 1, 14, 4, parambjb);
/*  55:455 */     a(paramaqu, BlockList.fence.instance(), 4, 13, 4, parambjb);
/*  56:456 */     a(paramaqu, BlockList.fence.instance(), 4, 14, 4, parambjb);
/*  57:457 */     a(paramaqu, parambjb, 1, 15, 1, 4, 15, 4, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*  58:459 */     for (int i = 0; i <= 5; i++) {
/*  59:460 */       for (int j = 0; j <= 5; j++) {
/*  60:462 */         if ((j == 0) || (j == 5) || (i == 0) || (i == 5))
/*  61:    */         {
/*  62:465 */           a(paramaqu, BlockList.gravel.instance(), j, 11, i, parambjb);
/*  63:466 */           b(paramaqu, j, 12, i, parambjb);
/*  64:    */         }
/*  65:    */       }
/*  66:    */     }
/*  67:470 */     return true;
/*  68:    */   }
/*  69:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bnp
 * JD-Core Version:    0.7.0.1
 */