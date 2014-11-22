package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class afu
/*   4:    */   extends zy
/*   5:    */ {
/*   6:    */   private final EntitySilverfish a;
/*   7:    */   private EnumDirection b;
/*   8:    */   private boolean c;
/*   9:    */   
/*  10:    */   public afu(EntitySilverfish paramaft)
/*  11:    */   {
/*  12:194 */     super(paramaft, 1.0D, 10);
/*  13:195 */     this.a = paramaft;
/*  14:    */     
/*  15:197 */     a(1);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean canStart()
/*  19:    */   {
/*  20:202 */     if (this.a.u() != null) {
/*  21:203 */       return false;
/*  22:    */     }
/*  23:205 */     if (!this.a.getNavigator().m()) {
/*  24:206 */       return false;
/*  25:    */     }
/*  26:209 */     Random localRandom = this.a.getRNG();
/*  27:210 */     if (localRandom.nextInt(10) == 0)
/*  28:    */     {
/*  29:211 */       this.b = EnumDirection.a(localRandom);
/*  30:    */       
/*  31:213 */       BlockPosition localdt = new BlockPosition(this.a.xPos, this.a.yPos + 0.5D, this.a.zPos).a(this.b);
/*  32:214 */       Block localbec = this.a.world.getBlock(localdt);
/*  33:215 */       if (axs.d(localbec))
/*  34:    */       {
/*  35:216 */         this.c = true;
/*  36:217 */         return true;
/*  37:    */       }
/*  38:    */     }
/*  39:221 */     this.c = false;
/*  40:222 */     return super.canStart();
/*  41:    */   }
/*  42:    */   
/*  43:    */   public boolean canContinue()
/*  44:    */   {
/*  45:227 */     if (this.c) {
/*  46:228 */       return false;
/*  47:    */     }
/*  48:230 */     return super.canContinue();
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void start()
/*  52:    */   {
/*  53:235 */     if (!this.c)
/*  54:    */     {
/*  55:236 */       super.start();
/*  56:237 */       return;
/*  57:    */     }
/*  58:240 */     World localaqu = this.a.world;
/*  59:241 */     BlockPosition localdt = new BlockPosition(this.a.xPos, this.a.yPos + 0.5D, this.a.zPos).a(this.b);
/*  60:242 */     Block localbec = localaqu.getBlock(localdt);
/*  61:244 */     if (axs.d(localbec))
/*  62:    */     {
/*  63:245 */       localaqu.setBlock(localdt, BlockList.monsterEgg.instance().a(axs.a, EnumMonsterEggVariants.a(localbec)), 3);
/*  64:246 */       this.a.y();
/*  65:247 */       this.a.setDead();
/*  66:    */     }
/*  67:    */   }
/*  68:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afu
 * JD-Core Version:    0.7.0.1
 */