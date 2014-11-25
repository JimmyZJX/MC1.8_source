package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ class bmf
/*    4:     */   extends bmu
/*    5:     */ {
/*    6:     */   public void a(Random paramRandom, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*    7:     */   {
/*    8:1599 */     if (paramBoolean)
/*    9:     */     {
/*   10:1600 */       float f = paramRandom.nextFloat();
/*   11:1601 */       if (f < 0.2F) {
/*   12:1602 */         this.a = BlockList.stoneBrick.instance(bbc.N);
/*   13:1603 */       } else if (f < 0.5F) {
/*   14:1604 */         this.a = BlockList.stoneBrick.instance(bbc.M);
/*   15:1605 */       } else if (f < 0.55F) {
/*   16:1606 */         this.a = BlockList.monsterEgg.instance(EnumMonsterEggVariants.c.a());
/*   17:     */       } else {
/*   18:1608 */         this.a = BlockList.stoneBrick.instance();
/*   19:     */       }
/*   20:     */     }
/*   21:     */     else
/*   22:     */     {
/*   23:1611 */       this.a = BlockList.air.instance();
/*   24:     */     }
/*   25:     */   }
				  bmf(bls arg0) {}
/*   26:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmf
 * JD-Core Version:    0.7.0.1
 */