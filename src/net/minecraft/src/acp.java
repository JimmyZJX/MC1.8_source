package net.minecraft.src;
/*   2:    */ 
/*   3:    */ class acp
/*   4:    */   extends zb
/*   5:    */ {
/*   6:    */   private EntitySquid a;
/*   7:    */   
/*   8:    */   public acp(EntitySquid paramaco)
/*   9:    */   {
/*  10:193 */     this.a = paramaco;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean a()
/*  14:    */   {
/*  15:198 */     return true;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void e()
/*  19:    */   {
/*  20:203 */     int i = this.a.bg();
/*  21:205 */     if (i > 100)
/*  22:    */     {
/*  23:206 */       this.a.b(0.0F, 0.0F, 0.0F);
/*  24:    */     }
/*  25:207 */     else if ((this.a.bb().nextInt(50) == 0) || (!EntitySquid.a(this.a)) || (!this.a.n()))
/*  26:    */     {
/*  27:208 */       float f1 = this.a.bb().nextFloat() * 3.141593F * 2.0F;
/*  28:209 */       float f2 = MathUtils.cos(f1) * 0.2F;
/*  29:210 */       float f3 = -0.1F + this.a.bb().nextFloat() * 0.2F;
/*  30:211 */       float f4 = MathUtils.sin(f1) * 0.2F;
/*  31:212 */       this.a.b(f2, f3, f4);
/*  32:    */     }
/*  33:    */   }
/*  34:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     acp
 * JD-Core Version:    0.7.0.1
 */