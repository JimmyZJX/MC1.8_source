package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class bnk
/*   6:    */   extends bnp
/*   7:    */ {
/*   8:    */   public arz a;
/*   9:    */   public boolean b;
/*  10:    */   public int c;
/*  11:    */   public bne d;
/*  12:    */   public List<bne> e;
/*  13:485 */   public List<bnn> f = Lists.newArrayList();
/*  14:486 */   public List<bnl> g = Lists.newArrayList();
/*  15:    */   
/*  16:    */   public bnk() {}
/*  17:    */   
/*  18:    */   public bnk(arz paramarz, int paramInt1, Random paramRandom, int paramInt2, int paramInt3, List<bne> paramList, int paramInt4)
/*  19:    */   {
/*  20:495 */     super(null, 0, paramRandom, paramInt2, paramInt3);
/*  21:496 */     this.a = paramarz;
/*  22:497 */     this.e = paramList;
/*  23:498 */     this.c = paramInt4;
/*  24:    */     
/*  25:500 */     arm localarm = paramarz.a(new BlockPosition(paramInt2, 0, paramInt3), arm.ad);
/*  26:501 */     this.b = ((localarm == arm.r) || (localarm == arm.G));
/*  27:502 */     a(this.b);
/*  28:    */   }
/*  29:    */   
/*  30:    */   public arz e()
/*  31:    */   {
/*  32:506 */     return this.a;
/*  33:    */   }
/*  34:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bnk
 * JD-Core Version:    0.7.0.1
 */