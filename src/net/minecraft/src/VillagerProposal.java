package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class VillagerProposal
/*   4:    */   extends zb
/*   5:    */ {
/*   6:    */   private EntityVillager villager;
/*   7:    */   private EntityVillager mate;
/*   8:    */   private World world;
/*   9:    */   private int countDown;
/*  10:    */   Village village;
/*  11:    */   
/*  12:    */   public VillagerProposal(EntityVillager villager)
/*  13:    */   {
/*  14: 18 */     this.villager = villager;
/*  15: 19 */     this.world = villager.world;
/*  16: 20 */     a(3);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public boolean a()
/*  20:    */   {
/*  21: 25 */     if (this.villager.getAge() != 0) {
/*  22: 26 */       return false;
/*  23:    */     }
/*  24: 28 */     if (this.villager.getRNG().nextInt(500) != 0) {
/*  25: 29 */       return false;
/*  26:    */     }
/*  27: 32 */     this.village = this.world.getVillageManager().getNearestVillage(new BlockPosition(this.villager), 0);
/*  28: 33 */     if (this.village == null) {
/*  29: 34 */       return false;
/*  30:    */     }
/*  31: 36 */     if ((!checkPopulation()) || (!this.villager.testWilling(true))) {
/*  32: 37 */       return false;
/*  33:    */     }
/*  34: 40 */     EntityVillager mate = this.world.getNearestEntity(EntityVillager.class, this.villager.getAABB().expand(8.0D, 3.0D, 8.0D), this.villager);
/*  35: 41 */     if (mate == null) {
/*  36: 42 */       return false;
/*  37:    */     }
/*  38: 45 */     this.mate = mate;
/*  39: 46 */     if ((this.mate.getAge() != 0) || (!this.mate.testWilling(true))) {
/*  40: 47 */       return false;
/*  41:    */     }
/*  42: 50 */     return true;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void c()
/*  46:    */   {
/*  47: 55 */     this.countDown = 300;
/*  48: 56 */     this.villager.l(true);
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void d()
/*  52:    */   {
/*  53: 61 */     this.village = null;
/*  54: 62 */     this.mate = null;
/*  55: 63 */     this.villager.l(false);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public boolean b()
/*  59:    */   {
/*  60: 68 */     return (this.countDown >= 0) && (checkPopulation()) && (this.villager.getAge() == 0) && (this.villager.testWilling(false));
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void e()
/*  64:    */   {
/*  65: 73 */     this.countDown -= 1;
/*  66: 74 */     this.villager.p().a(this.mate, 10.0F, 30.0F);
/*  67: 76 */     if (this.villager.h(this.mate) > 2.25D) {
/*  68: 77 */       this.villager.s().a(this.mate, 0.25D);
/*  69: 79 */     } else if ((this.countDown == 0) && (this.mate.ck())) {
/*  70: 80 */       mate();
/*  71:    */     }
/*  72: 84 */     if (this.villager.getRNG().nextInt(35) == 0) {
/*  73: 85 */       this.world.sendSignal(this.villager, (byte)12);
/*  74:    */     }
/*  75:    */   }
/*  76:    */   
/*  77:    */   private boolean checkPopulation()
/*  78:    */   {
/*  79: 90 */     if (!this.village.i()) {
/*  80: 91 */       return false;
/*  81:    */     }
/*  82: 94 */     int i = (int)(this.village.countDoors() * 0.35D);
/*  83: 95 */     return this.village.getPopulation() < i;
/*  84:    */   }
/*  85:    */   
/*  86:    */   private void mate()
/*  87:    */   {
/*  88: 99 */     EntityVillager baby = this.villager.getBaby(this.mate);
/*  89:100 */     this.mate.setAge(6000);
/*  90:101 */     this.villager.setAge(6000);
/*  91:102 */     this.mate.setWilling(false);
/*  92:103 */     this.villager.setWilling(false);
/*  93:104 */     baby.setAge(-24000);
/*  94:105 */     baby.setPositionAndAngles(this.villager.xPos, this.villager.yPos, this.villager.zPos, 0.0F, 0.0F);
/*  95:106 */     this.world.spawnEntity(baby);
/*  96:107 */     this.world.sendSignal(baby, (byte)12);
/*  97:    */   }
/*  98:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zj
 * JD-Core Version:    0.7.0.1
 */