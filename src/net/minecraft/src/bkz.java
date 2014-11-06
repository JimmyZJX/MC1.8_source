package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bkz
/*   4:    */   extends blb
/*   5:    */ {
/*   6:    */   public bkz() {}
/*   7:    */   
/*   8:    */   public bkz(EnumDirection paramej, blf paramblf)
/*   9:    */   {
/*  10:851 */     super(1, paramej, paramblf, 1, 1, 1);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*  14:    */   {
/*  15:857 */     a(paramaqu, parambjb, 0, 3, 0, 2, 3, 7, b, b, false);
/*  16:858 */     a(paramaqu, parambjb, 5, 3, 0, 7, 3, 7, b, b, false);
/*  17:859 */     a(paramaqu, parambjb, 0, 2, 0, 1, 2, 7, b, b, false);
/*  18:860 */     a(paramaqu, parambjb, 6, 2, 0, 7, 2, 7, b, b, false);
/*  19:861 */     a(paramaqu, parambjb, 0, 1, 0, 0, 1, 7, b, b, false);
/*  20:862 */     a(paramaqu, parambjb, 7, 1, 0, 7, 1, 7, b, b, false);
/*  21:    */     
/*  22:    */ 
/*  23:865 */     a(paramaqu, parambjb, 0, 1, 7, 7, 3, 7, b, b, false);
/*  24:    */     
/*  25:    */ 
/*  26:868 */     a(paramaqu, parambjb, 1, 1, 0, 2, 3, 0, b, b, false);
/*  27:869 */     a(paramaqu, parambjb, 5, 1, 0, 6, 3, 0, b, b, false);
/*  28:871 */     if (this.k.c[EnumDirection.NORTH.a()]) {
/*  29:872 */       a(paramaqu, parambjb, 3, 1, 7, 4, 2, 7, f, f, false);
/*  30:    */     }
/*  31:874 */     if (this.k.c[EnumDirection.WEST.a()]) {
/*  32:875 */       a(paramaqu, parambjb, 0, 1, 3, 1, 2, 4, f, f, false);
/*  33:    */     }
/*  34:877 */     if (this.k.c[EnumDirection.EAST.a()]) {
/*  35:878 */       a(paramaqu, parambjb, 6, 1, 3, 7, 2, 4, f, f, false);
/*  36:    */     }
/*  37:881 */     return true;
/*  38:    */   }
/*  39:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkz
 * JD-Core Version:    0.7.0.1
 */