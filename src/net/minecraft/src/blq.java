package net.minecraft.src;
/*   1:    */ import java.util.LinkedList;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class blq
/*   6:    */   extends bmv
/*   7:    */ {
/*   8:    */   public blq() {}
/*   9:    */   
/*  10:    */   public blq(World paramaqu, Random paramRandom, int paramInt1, int paramInt2)
/*  11:    */   {
/*  12:125 */     super(paramInt1, paramInt2);
/*  13:    */     
/*  14:127 */     blr.b();
/*  15:    */     
/*  16:129 */     bmh localbmh = new bmh(0, paramRandom, (paramInt1 << 4) + 2, (paramInt2 << 4) + 2);
/*  17:130 */     this.a.add(localbmh);
/*  18:131 */     localbmh.a(localbmh, this.a, paramRandom);
/*  19:    */     
/*  20:133 */     List localList = localbmh.c;
/*  21:134 */     while (!localList.isEmpty())
/*  22:    */     {
/*  23:135 */       int i = paramRandom.nextInt(localList.size());
/*  24:136 */       bms localbms = (bms)localList.remove(i);
/*  25:137 */       localbms.a(localbmh, this.a, paramRandom);
/*  26:    */     }
/*  27:140 */     c();
/*  28:141 */     a(paramaqu, paramRandom, 10);
/*  29:    */   }
/*  30:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     blq
 * JD-Core Version:    0.7.0.1
 */