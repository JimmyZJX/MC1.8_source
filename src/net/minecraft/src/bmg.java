package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bmg
/*   5:    */   extends bmk
/*   6:    */ {
/*   7:    */   private boolean a;
/*   8:    */   
/*   9:    */   public bmg() {}
/*  10:    */   
/*  11:    */   public bmg(int paramInt1, Random paramRandom, int paramInt2, int paramInt3)
/*  12:    */   {
/*  13:450 */     super(paramInt1);
/*  14:    */     
/*  15:452 */     this.a = true;
/*  16:453 */     this.m = EnumHorizontalVertical.HORIZONTAL.getRandomDirection(paramRandom);
/*  17:454 */     this.d = bml.a;
/*  18:456 */     switch (blu.b[this.m.ordinal()])
/*  19:    */     {
/*  20:    */     case 1: 
/*  21:    */     case 2: 
/*  22:459 */       this.l = new bjb(paramInt2, 64, paramInt3, paramInt2 + 5 - 1, 74, paramInt3 + 5 - 1);
/*  23:460 */       break;
/*  24:    */     default: 
/*  25:462 */       this.l = new bjb(paramInt2, 64, paramInt3, paramInt2 + 5 - 1, 74, paramInt3 + 5 - 1);
/*  26:    */     }
/*  27:    */   }
/*  28:    */   
/*  29:    */   public bmg(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*  30:    */   {
/*  31:468 */     super(paramInt);
/*  32:    */     
/*  33:470 */     this.a = false;
/*  34:471 */     this.m = paramej;
/*  35:472 */     this.d = a(paramRandom);
/*  36:473 */     this.l = parambjb;
/*  37:    */   }
/*  38:    */   
/*  39:    */   protected void a(NBTTagCompound paramfn)
/*  40:    */   {
/*  41:478 */     super.a(paramfn);
/*  42:479 */     paramfn.setBoolean("Source", this.a);
/*  43:    */   }
/*  44:    */   
/*  45:    */   protected void b(NBTTagCompound paramfn)
/*  46:    */   {
/*  47:484 */     super.b(paramfn);
/*  48:485 */     this.a = paramfn.getBoolean("Source");
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(bms parambms, List paramList, Random paramRandom)
/*  52:    */   {
/*  53:490 */     if (this.a) {
/*  54:492 */       blr.a(blx.class);
/*  55:    */     }
/*  56:494 */     a((bmh)parambms, paramList, paramRandom, 1, 1);
/*  57:    */   }
/*  58:    */   
/*  59:    */   public static bmg a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*  60:    */   {
/*  61:498 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, -7, 0, 5, 11, 5, paramej);
/*  62:500 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*  63:501 */       return null;
/*  64:    */     }
/*  65:504 */     return new bmg(paramInt4, paramRandom, localbjb, paramej);
/*  66:    */   }
/*  67:    */   
/*  68:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*  69:    */   {
/*  70:509 */     if (a(paramaqu, parambjb)) {
/*  71:510 */       return false;
/*  72:    */     }
/*  73:514 */     a(paramaqu, parambjb, 0, 0, 0, 4, 10, 4, true, paramRandom, blr.c());
/*  74:    */     
/*  75:516 */     a(paramaqu, paramRandom, parambjb, this.d, 1, 7, 0);
/*  76:    */     
/*  77:518 */     a(paramaqu, paramRandom, parambjb, bml.a, 1, 1, 4);
/*  78:    */     
/*  79:    */ 
/*  80:521 */     a(paramaqu, BlockList.stoneBrick.instance(), 2, 6, 1, parambjb);
/*  81:522 */     a(paramaqu, BlockList.stoneBrick.instance(), 1, 5, 1, parambjb);
/*  82:523 */     a(paramaqu, BlockList.U.instance(bbg.a.a()), 1, 6, 1, parambjb);
/*  83:524 */     a(paramaqu, BlockList.stoneBrick.instance(), 1, 5, 2, parambjb);
/*  84:525 */     a(paramaqu, BlockList.stoneBrick.instance(), 1, 4, 3, parambjb);
/*  85:526 */     a(paramaqu, BlockList.U.instance(bbg.a.a()), 1, 5, 3, parambjb);
/*  86:527 */     a(paramaqu, BlockList.stoneBrick.instance(), 2, 4, 3, parambjb);
/*  87:528 */     a(paramaqu, BlockList.stoneBrick.instance(), 3, 3, 3, parambjb);
/*  88:529 */     a(paramaqu, BlockList.U.instance(bbg.a.a()), 3, 4, 3, parambjb);
/*  89:530 */     a(paramaqu, BlockList.stoneBrick.instance(), 3, 3, 2, parambjb);
/*  90:531 */     a(paramaqu, BlockList.stoneBrick.instance(), 3, 2, 1, parambjb);
/*  91:532 */     a(paramaqu, BlockList.U.instance(bbg.a.a()), 3, 3, 1, parambjb);
/*  92:533 */     a(paramaqu, BlockList.stoneBrick.instance(), 2, 2, 1, parambjb);
/*  93:534 */     a(paramaqu, BlockList.stoneBrick.instance(), 1, 1, 1, parambjb);
/*  94:535 */     a(paramaqu, BlockList.U.instance(bbg.a.a()), 1, 2, 1, parambjb);
/*  95:536 */     a(paramaqu, BlockList.stoneBrick.instance(), 1, 1, 2, parambjb);
/*  96:537 */     a(paramaqu, BlockList.U.instance(bbg.a.a()), 1, 1, 3, parambjb);
/*  97:    */     
/*  98:539 */     return true;
/*  99:    */   }
/* 100:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmg
 * JD-Core Version:    0.7.0.1
 */