package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bjq
/*   5:    */   extends bkb
/*   6:    */ {
/*   7:    */   private int b;
/*   8:    */   
/*   9:    */   public bjq() {}
/*  10:    */   
/*  11:    */   public bjq(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*  12:    */   {
/*  13:427 */     super(paramInt);
/*  14:    */     
/*  15:429 */     this.m = paramej;
/*  16:430 */     this.l = parambjb;
/*  17:431 */     this.b = paramRandom.nextInt();
/*  18:    */   }
/*  19:    */   
/*  20:    */   public static bjq a(List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*  21:    */   {
/*  22:435 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -1, -3, 0, 5, 10, 8, paramej);
/*  23:437 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*  24:438 */       return null;
/*  25:    */     }
/*  26:441 */     return new bjq(paramInt4, paramRandom, localbjb, paramej);
/*  27:    */   }
/*  28:    */   
/*  29:    */   protected void b(NBTTagCompound paramfn)
/*  30:    */   {
/*  31:446 */     super.b(paramfn);
/*  32:    */     
/*  33:448 */     this.b = paramfn.getInteger("Seed");
/*  34:    */   }
/*  35:    */   
/*  36:    */   protected void a(NBTTagCompound paramfn)
/*  37:    */   {
/*  38:453 */     super.a(paramfn);
/*  39:    */     
/*  40:455 */     paramfn.setInt("Seed", this.b);
/*  41:    */   }
/*  42:    */   
/*  43:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*  44:    */   {
/*  45:460 */     Random localRandom = new Random(this.b);
/*  46:    */     int j;
/*  47:    */     int k;
/*  48:463 */     for (int i = 0; i <= 4; i++) {
/*  49:464 */       for (j = 3; j <= 4; j++)
/*  50:    */       {
/*  51:465 */         k = localRandom.nextInt(8);
/*  52:466 */         a(paramaqu, parambjb, i, j, 0, i, j, k, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  53:    */       }
/*  54:    */     }
/*  55:472 */     int i = localRandom.nextInt(8);
/*  56:473 */     a(paramaqu, parambjb, 0, 5, 0, 0, 5, i, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  57:    */     
/*  58:    */ 
/*  59:476 */     i = localRandom.nextInt(8);
/*  60:477 */     a(paramaqu, parambjb, 4, 5, 0, 4, 5, i, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  61:481 */     for (i = 0; i <= 4; i++)
/*  62:    */     {
/*  63:482 */       j = localRandom.nextInt(5);
/*  64:483 */       a(paramaqu, parambjb, i, 2, 0, i, 2, j, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  65:    */     }
/*  66:485 */     for (i = 0; i <= 4; i++) {
/*  67:486 */       for (j = 0; j <= 1; j++)
/*  68:    */       {
/*  69:487 */         k = localRandom.nextInt(3);
/*  70:488 */         a(paramaqu, parambjb, i, j, 0, i, j, k, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  71:    */       }
/*  72:    */     }
/*  73:492 */     return true;
/*  74:    */   }
/*  75:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjq
 * JD-Core Version:    0.7.0.1
 */