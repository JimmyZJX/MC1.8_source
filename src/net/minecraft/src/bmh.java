package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class bmh
/*   6:    */   extends bmg
/*   7:    */ {
/*   8:    */   public bma a;
/*   9:    */   public bmb b;
/*  10:549 */   public List<bmk> c = Lists.newArrayList();
/*  11:    */   
/*  12:    */   public bmh() {}
/*  13:    */   
/*  14:    */   public bmh(int paramInt1, Random paramRandom, int paramInt2, int paramInt3)
/*  15:    */   {
/*  16:556 */     super(0, paramRandom, paramInt2, paramInt3);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public BlockPosition a()
/*  20:    */   {
/*  21:561 */     if (this.b != null) {
/*  22:562 */       return this.b.a();
/*  23:    */     }
/*  24:564 */     return super.a();
/*  25:    */   }
/*  26:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmh
 * JD-Core Version:    0.7.0.1
 */