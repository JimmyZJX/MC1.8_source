package net.minecraft.src;
/*   1:    */ import java.util.LinkedList;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class blh
/*   5:    */   extends bmv
/*   6:    */ {
/*   7:    */   public blh() {}
/*   8:    */   
/*   9:    */   public blh(World paramaqu, Random paramRandom, int paramInt1, int paramInt2)
/*  10:    */   {
/*  11: 96 */     super(paramInt1, paramInt2);
/*  12: 97 */     arm localarm = paramaqu.b(new BlockPosition(paramInt1 * 16 + 8, 0, paramInt2 * 16 + 8));
/*  13:    */     bms localObject;
/*  14: 98 */     if ((localarm == arm.K) || (localarm == arm.L))
/*  15:    */     {
/*  16: 99 */       localObject = new bll(paramRandom, paramInt1 * 16, paramInt2 * 16);
/*  17:100 */       this.a.add(localObject);
/*  18:    */     }
/*  19:101 */     else if (localarm == arm.v)
/*  20:    */     {
/*  21:102 */       localObject = new blo(paramRandom, paramInt1 * 16, paramInt2 * 16);
/*  22:103 */       this.a.add(localObject);
/*  23:    */     }
/*  24:104 */     else if ((localarm == arm.r) || (localarm == arm.G))
/*  25:    */     {
/*  26:105 */       localObject = new blk(paramRandom, paramInt1 * 16, paramInt2 * 16);
/*  27:106 */       this.a.add(localObject);
/*  28:    */     }
/*  29:109 */     c();
/*  30:    */   }
/*  31:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     blh
 * JD-Core Version:    0.7.0.1
 */