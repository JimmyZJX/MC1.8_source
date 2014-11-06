package net.minecraft.src;
/*   1:    */ import java.util.Comparator;
/*   2:    */ 
/*   3:    */ class bya
/*   4:    */   implements Comparator<to>
/*   5:    */ {
				private final bxv a;
				private final bxz b;
/*   6:    */   bya(bxz parambxz, bxv parambxv) {a=parambxv;b=parambxz;}
/*   7:    */   
/*   8:    */   public int compare(to paramto1, to paramto2)
/*   9:    */   {
/*  10:457 */     int i = Item.b(paramto1.a());
/*  11:458 */     int j = Item.b(paramto2.a());
/*  12:    */     
/*  13:460 */     tq localtq1 = null;
/*  14:461 */     tq localtq2 = null;
/*  15:462 */     if (this.b.y == 0)
/*  16:    */     {
/*  17:463 */       localtq1 = StatList.K[i];
/*  18:464 */       localtq2 = StatList.K[j];
/*  19:    */     }
/*  20:465 */     else if (this.b.y == 1)
/*  21:    */     {
/*  22:466 */       localtq1 = StatList.I[i];
/*  23:467 */       localtq2 = StatList.I[j];
/*  24:    */     }
/*  25:468 */     else if (this.b.y == 2)
/*  26:    */     {
/*  27:469 */       localtq1 = StatList.J[i];
/*  28:470 */       localtq2 = StatList.J[j];
/*  29:    */     }
/*  30:473 */     if ((localtq1 != null) || (localtq2 != null))
/*  31:    */     {
/*  32:474 */       if (localtq1 == null) {
/*  33:475 */         return 1;
/*  34:    */       }
/*  35:476 */       if (localtq2 == null) {
/*  36:477 */         return -1;
/*  37:    */       }
/*  38:479 */       int k = bxv.b(this.b.u).a(localtq1);
/*  39:480 */       int m = bxv.b(this.b.u).a(localtq2);
/*  40:481 */       if (k != m) {
/*  41:482 */         return (k - m) * this.b.z;
/*  42:    */       }
/*  43:    */     }
/*  44:487 */     return i - j;
/*  45:    */   }
/*  46:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bya
 * JD-Core Version:    0.7.0.1
 */