package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bmi
/*   5:    */   extends bmk
/*   6:    */ {
/*   7:    */   private boolean a;
/*   8:    */   private boolean b;
/*   9:    */   
/*  10:    */   public bmi() {}
/*  11:    */   
/*  12:    */   public bmi(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*  13:    */   {
/*  14:581 */     super(paramInt);
/*  15:    */     
/*  16:583 */     this.m = paramej;
/*  17:584 */     this.d = a(paramRandom);
/*  18:585 */     this.l = parambjb;
/*  19:    */     
/*  20:587 */     this.a = (paramRandom.nextInt(2) == 0);
/*  21:588 */     this.b = (paramRandom.nextInt(2) == 0);
/*  22:    */   }
/*  23:    */   
/*  24:    */   protected void a(NBTTagCompound paramfn)
/*  25:    */   {
/*  26:593 */     super.a(paramfn);
/*  27:594 */     paramfn.setBoolean("Left", this.a);
/*  28:595 */     paramfn.setBoolean("Right", this.b);
/*  29:    */   }
/*  30:    */   
/*  31:    */   protected void b(NBTTagCompound paramfn)
/*  32:    */   {
/*  33:600 */     super.b(paramfn);
/*  34:601 */     this.a = paramfn.getBoolean("Left");
/*  35:602 */     this.b = paramfn.getBoolean("Right");
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void a(bms parambms, List<bms> paramList, Random paramRandom)
/*  39:    */   {
/*  40:607 */     a((bmh)parambms, paramList, paramRandom, 1, 1);
/*  41:608 */     if (this.a) {
/*  42:609 */       b((bmh)parambms, paramList, paramRandom, 1, 2);
/*  43:    */     }
/*  44:611 */     if (this.b) {
/*  45:612 */       c((bmh)parambms, paramList, paramRandom, 1, 2);
/*  46:    */     }
/*  47:    */   }
/*  48:    */   
/*  49:    */   public static bmi a(List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*  50:    */   {
/*  51:617 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, 7, paramej);
/*  52:619 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*  53:620 */       return null;
/*  54:    */     }
/*  55:623 */     return new bmi(paramInt4, paramRandom, localbjb, paramej);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*  59:    */   {
/*  60:628 */     if (a(paramaqu, parambjb)) {
/*  61:629 */       return false;
/*  62:    */     }
/*  63:633 */     a(paramaqu, parambjb, 0, 0, 0, 4, 4, 6, true, paramRandom, blr.c());
/*  64:    */     
/*  65:635 */     a(paramaqu, paramRandom, parambjb, this.d, 1, 1, 0);
/*  66:    */     
/*  67:637 */     a(paramaqu, paramRandom, parambjb, bml.a, 1, 1, 6);
/*  68:    */     
/*  69:639 */     a(paramaqu, parambjb, paramRandom, 0.1F, 1, 2, 1, BlockList.torch.instance());
/*  70:640 */     a(paramaqu, parambjb, paramRandom, 0.1F, 3, 2, 1, BlockList.torch.instance());
/*  71:641 */     a(paramaqu, parambjb, paramRandom, 0.1F, 1, 2, 5, BlockList.torch.instance());
/*  72:642 */     a(paramaqu, parambjb, paramRandom, 0.1F, 3, 2, 5, BlockList.torch.instance());
/*  73:644 */     if (this.a) {
/*  74:645 */       a(paramaqu, parambjb, 0, 1, 2, 0, 3, 4, BlockList.air.instance(), BlockList.air.instance(), false);
/*  75:    */     }
/*  76:647 */     if (this.b) {
/*  77:648 */       a(paramaqu, parambjb, 4, 1, 2, 4, 3, 4, BlockList.air.instance(), BlockList.air.instance(), false);
/*  78:    */     }
/*  79:651 */     return true;
/*  80:    */   }
/*  81:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmi
 * JD-Core Version:    0.7.0.1
 */