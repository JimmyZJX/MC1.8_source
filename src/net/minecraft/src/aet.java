package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class aet
/*   4:    */   extends GoalType
/*   5:    */ {
/*   6:    */   private EntityEnderman a;
/*   7:    */   
/*   8:    */   public aet(EntityEnderman paramaer)
/*   9:    */   {
/*  10:449 */     this.a = paramaer;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean canStart()
/*  14:    */   {
/*  15:454 */     if (!this.a.world.getGameRules().getBoolean("mobGriefing")) {
/*  16:455 */       return false;
/*  17:    */     }
/*  18:457 */     if (this.a.ck().getProto().getMaterial() == Material.air) {
/*  19:458 */       return false;
/*  20:    */     }
/*  21:460 */     if (this.a.getRNG().nextInt(2000) != 0) {
/*  22:461 */       return false;
/*  23:    */     }
/*  24:463 */     return true;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void tick()
/*  28:    */   {
/*  29:468 */     Random localRandom = this.a.getRNG();
/*  30:469 */     World localaqu = this.a.world;
/*  31:    */     
/*  32:471 */     int i = MathUtils.floor(this.a.xPos - 1.0D + localRandom.nextDouble() * 2.0D);
/*  33:472 */     int j = MathUtils.floor(this.a.yPos + localRandom.nextDouble() * 2.0D);
/*  34:473 */     int k = MathUtils.floor(this.a.zPos - 1.0D + localRandom.nextDouble() * 2.0D);
/*  35:474 */     BlockPosition localdt = new BlockPosition(i, j, k);
/*  36:475 */     ProtoBlock localatr1 = localaqu.getBlock(localdt).getProto();
/*  37:476 */     ProtoBlock localatr2 = localaqu.getBlock(localdt.down()).getProto();
/*  38:478 */     if (a(localaqu, localdt, this.a.ck().getProto(), localatr1, localatr2))
/*  39:    */     {
/*  40:479 */       localaqu.setBlock(localdt, this.a.ck(), 3);
/*  41:480 */       this.a.a(BlockList.air.instance());
/*  42:    */     }
/*  43:    */   }
/*  44:    */   
/*  45:    */   private boolean a(World paramaqu, BlockPosition paramdt, ProtoBlock paramatr1, ProtoBlock paramatr2, ProtoBlock paramatr3)
/*  46:    */   {
/*  47:485 */     if (!paramatr1.c(paramaqu, paramdt)) {
/*  48:486 */       return false;
/*  49:    */     }
/*  50:488 */     if (paramatr2.getMaterial() != Material.air) {
/*  51:489 */       return false;
/*  52:    */     }
/*  53:491 */     if (paramatr3.getMaterial() == Material.air) {
/*  54:492 */       return false;
/*  55:    */     }
/*  56:494 */     if (!paramatr3.isOpaqueCube()) {
/*  57:495 */       return false;
/*  58:    */     }
/*  59:497 */     return true;
/*  60:    */   }
/*  61:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aet
 * JD-Core Version:    0.7.0.1
 */