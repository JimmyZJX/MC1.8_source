package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bmj
/*   5:    */   extends bmk
/*   6:    */ {
/*   7:    */   public bmj() {}
/*   8:    */   
/*   9:    */   public bmj(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*  10:    */   {
/*  11:769 */     super(paramInt);
/*  12:    */     
/*  13:771 */     this.m = paramej;
/*  14:772 */     this.d = a(paramRandom);
/*  15:773 */     this.l = parambjb;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void a(bms parambms, List<bms> paramList, Random paramRandom)
/*  19:    */   {
/*  20:778 */     a((bmh)parambms, paramList, paramRandom, 1, 1);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public static bmj a(List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*  24:    */   {
/*  25:782 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, -7, 0, 5, 11, 8, paramej);
/*  26:784 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*  27:785 */       return null;
/*  28:    */     }
/*  29:788 */     return new bmj(paramInt4, paramRandom, localbjb, paramej);
/*  30:    */   }
/*  31:    */   
/*  32:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*  33:    */   {
/*  34:793 */     if (a(paramaqu, parambjb)) {
/*  35:794 */       return false;
/*  36:    */     }
/*  37:798 */     a(paramaqu, parambjb, 0, 0, 0, 4, 10, 7, true, paramRandom, blr.c());
/*  38:    */     
/*  39:800 */     a(paramaqu, paramRandom, parambjb, this.d, 1, 7, 0);
/*  40:    */     
/*  41:802 */     a(paramaqu, paramRandom, parambjb, bml.a, 1, 1, 7);
/*  42:    */     
/*  43:    */ 
/*  44:805 */     int i = a(BlockList.aw, 2);
/*  45:806 */     for (int j = 0; j < 6; j++)
/*  46:    */     {
/*  47:807 */       a(paramaqu, BlockList.aw.instance(i), 1, 6 - j, 1 + j, parambjb);
/*  48:808 */       a(paramaqu, BlockList.aw.instance(i), 2, 6 - j, 1 + j, parambjb);
/*  49:809 */       a(paramaqu, BlockList.aw.instance(i), 3, 6 - j, 1 + j, parambjb);
/*  50:810 */       if (j < 5)
/*  51:    */       {
/*  52:811 */         a(paramaqu, BlockList.stoneBrick.instance(), 1, 5 - j, 1 + j, parambjb);
/*  53:812 */         a(paramaqu, BlockList.stoneBrick.instance(), 2, 5 - j, 1 + j, parambjb);
/*  54:813 */         a(paramaqu, BlockList.stoneBrick.instance(), 3, 5 - j, 1 + j, parambjb);
/*  55:    */       }
/*  56:    */     }
/*  57:817 */     return true;
/*  58:    */   }
/*  59:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmj
 * JD-Core Version:    0.7.0.1
 */