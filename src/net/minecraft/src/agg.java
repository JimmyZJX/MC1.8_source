package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class agg
/*   4:    */   implements xq
/*   5:    */ {
/*   6:    */   public int a;
/*   7:    */   
/*   8:    */   public void a(Random paramRandom)
/*   9:    */   {
/*  10:197 */     int i = paramRandom.nextInt(5);
/*  11:198 */     if (i <= 1) {
/*  12:199 */       this.a = Potion.c.id;
/*  13:200 */     } else if (i <= 2) {
/*  14:201 */       this.a = Potion.g.id;
/*  15:202 */     } else if (i <= 3) {
/*  16:203 */       this.a = Potion.l.id;
/*  17:204 */     } else if (i <= 4) {
/*  18:205 */       this.a = Potion.p.id;
/*  19:    */     }
/*  20:    */   }
/*  21:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agg
 * JD-Core Version:    0.7.0.1
 */