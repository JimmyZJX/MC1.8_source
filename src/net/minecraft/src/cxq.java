package net.minecraft.src;
/*   1:    */ import com.google.common.collect.ComparisonChain;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ class cxq
/*   5:    */   extends WeightedRandomItem
/*   6:    */   implements Comparable<cxq>
/*   7:    */ {
/*   8:    */   protected final cxe b;
/*   9:    */   
/*  10:    */   public cxq(cxe paramcxe, int paramInt)
/*  11:    */   {
/*  12: 87 */     super(paramInt);
/*  13: 88 */     this.b = paramcxe;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public int compareTo(cxq paramcxq)
/*  17:    */   {
/*  18: 93 */     return ComparisonChain.start().compare(paramcxq.weight, this.weight).compare(a(), paramcxq.a()).result();
/*  19:    */   }
/*  20:    */   
/*  21:    */   protected int a()
/*  22:    */   {
/*  23:100 */     int i = this.b.a().size();
/*  24:102 */     for (EnumDirection localej : EnumDirection.values()) {
/*  25:103 */       i += this.b.a(localej).size();
/*  26:    */     }
/*  27:106 */     return i;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public String toString()
/*  31:    */   {
/*  32:111 */     return "MyWeighedRandomItem{weight=" + this.weight + ", model=" + this.b + '}';
/*  33:    */   }
/*  34:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxq
 * JD-Core Version:    0.7.0.1
 */