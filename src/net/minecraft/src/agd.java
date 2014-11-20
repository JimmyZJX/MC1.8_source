package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class agd
/*   4:    */   extends zb
/*   5:    */ {
/*   6:    */   private EntitySlime a;
/*   7:    */   private float b;
/*   8:    */   private int c;
/*   9:    */   
/*  10:    */   public agd(EntitySlime paramafy)
/*  11:    */   {
/*  12:417 */     this.a = paramafy;
/*  13:418 */     a(2);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public boolean a()
/*  17:    */   {
/*  18:423 */     return (this.a.u() == null) && ((this.a.C) || (this.a.V()) || (this.a.ab()));
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void e()
/*  22:    */   {
/*  23:428 */     if (--this.c <= 0)
/*  24:    */     {
/*  25:429 */       this.c = (40 + this.a.getRNG().nextInt(60));
/*  26:430 */       this.b = this.a.getRNG().nextInt(360);
/*  27:    */     }
/*  28:432 */     ((agc)this.a.q()).a(this.b, false);
/*  29:    */   }
/*  30:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agd
 * JD-Core Version:    0.7.0.1
 */