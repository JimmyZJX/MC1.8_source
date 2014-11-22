package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ import java.util.Set;
/*   3:    */ 
/*   4:    */ class aev
/*   5:    */   extends GoalType
/*   6:    */ {
/*   7:    */   private EntityEnderman a;
/*   8:    */   
/*   9:    */   public aev(EntityEnderman paramaer)
/*  10:    */   {
/*  11:505 */     this.a = paramaer;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public boolean canStart()
/*  15:    */   {
/*  16:510 */     if (!this.a.world.getGameRules().getBoolean("mobGriefing")) {
/*  17:511 */       return false;
/*  18:    */     }
/*  19:513 */     if (this.a.ck().getProto().getMaterial() != Material.air) {
/*  20:514 */       return false;
/*  21:    */     }
/*  22:516 */     if (this.a.getRNG().nextInt(20) != 0) {
/*  23:517 */       return false;
/*  24:    */     }
/*  25:519 */     return true;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void tick()
/*  29:    */   {
/*  30:524 */     Random localRandom = this.a.getRNG();
/*  31:525 */     World localaqu = this.a.world;
/*  32:    */     
/*  33:527 */     int i = MathUtils.floor(this.a.xPos - 2.0D + localRandom.nextDouble() * 4.0D);
/*  34:528 */     int j = MathUtils.floor(this.a.yPos + localRandom.nextDouble() * 3.0D);
/*  35:529 */     int k = MathUtils.floor(this.a.zPos - 2.0D + localRandom.nextDouble() * 4.0D);
/*  36:530 */     BlockPosition localdt = new BlockPosition(i, j, k);
/*  37:531 */     Block localbec = localaqu.getBlock(localdt);
/*  38:532 */     ProtoBlock localatr = localbec.getProto();
/*  39:533 */     if (EntityEnderman.co().contains(localatr))
/*  40:    */     {
/*  41:534 */       this.a.a(localbec);
/*  42:535 */       localaqu.setBlock(localdt, BlockList.air.instance());
/*  43:    */     }
/*  44:    */   }
/*  45:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aev
 * JD-Core Version:    0.7.0.1
 */