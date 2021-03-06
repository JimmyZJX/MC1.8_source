package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class EntityPig
/*   4:    */   extends EntityAnimal
/*   5:    */ {
/*   6:    */   private final yu bk;
/*   7:    */   
/*   8:    */   public EntityPig(World paramaqu)
/*   9:    */   {
/*  10: 24 */     super(paramaqu);
/*  11: 25 */     a(0.9F, 0.9F);
/*  12:    */     
/*  13: 27 */     ((aay)getNavigator()).a(true);
/*  14: 28 */     this.goalSelector.addGoal(0, new GoalSwim(this));
/*  15: 29 */     this.goalSelector.addGoal(1, new zu(this, 1.25D));
/*  16: 30 */     this.goalSelector.addGoal(2, this.bk = new yu(this, 0.3F));
/*  17: 31 */     this.goalSelector.addGoal(3, new yt(this, 1.0D));
/*  18: 32 */     this.goalSelector.addGoal(4, new aag(this, 1.2D, ItemList.bY, false));
/*  19: 33 */     this.goalSelector.addGoal(4, new aag(this, 1.2D, ItemList.carrot, false));
/*  20: 34 */     this.goalSelector.addGoal(5, new za(this, 1.1D));
/*  21: 35 */     this.goalSelector.addGoal(6, new zy(this, 1.0D));
/*  22: 36 */     this.goalSelector.addGoal(7, new zh(this, EntityPlayer.class, 6.0F));
/*  23: 37 */     this.goalSelector.addGoal(8, new zx(this));
/*  24:    */   }
/*  25:    */   
/*  26:    */   protected void aW()
/*  27:    */   {
/*  28: 42 */     super.aW();
/*  29:    */     
/*  30: 44 */     getAttribute(MobAttribute.maxHealth).a(10.0D);
/*  31: 45 */     getAttribute(MobAttribute.movementSpeed).a(0.25D);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public boolean bV()
/*  35:    */   {
/*  36: 50 */     ItemStack localamj = ((EntityPlayer)this.rider).getHeldItemStack();
/*  37:    */     
/*  38: 52 */     return (localamj != null) && (localamj.getItem() == ItemList.bY);
/*  39:    */   }
/*  40:    */   
/*  41:    */   protected void h()
/*  42:    */   {
/*  43: 57 */     super.h();
/*  44: 58 */     this.data.addData(16, Byte.valueOf((byte)0));
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/*  48:    */   {
/*  49: 63 */     super.writeEntityToNBT(paramfn);
/*  50: 64 */     paramfn.setBoolean("Saddle", cj());
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/*  54:    */   {
/*  55: 69 */     super.readEntityFromNBT(paramfn);
/*  56: 70 */     l(paramfn.getBoolean("Saddle"));
/*  57:    */   }
/*  58:    */   
/*  59:    */   protected String z()
/*  60:    */   {
/*  61: 75 */     return "mob.pig.say";
/*  62:    */   }
/*  63:    */   
/*  64:    */   protected String bn()
/*  65:    */   {
/*  66: 80 */     return "mob.pig.say";
/*  67:    */   }
/*  68:    */   
/*  69:    */   protected String bo()
/*  70:    */   {
/*  71: 85 */     return "mob.pig.death";
/*  72:    */   }
/*  73:    */   
/*  74:    */   protected void a(BlockPosition paramdt, BlockType paramatr)
/*  75:    */   {
/*  76: 90 */     a("mob.pig.step", 0.15F, 1.0F);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public boolean onRightClickMob(EntityPlayer paramahd)
/*  80:    */   {
/*  81: 95 */     if (!super.onRightClickMob(paramahd))
/*  82:    */     {
/*  83: 96 */       if ((cj()) && (!this.world.isClient) && ((this.rider == null) || (this.rider == paramahd)))
/*  84:    */       {
/*  85: 97 */         paramahd.a(this);
/*  86: 98 */         return true;
/*  87:    */       }
/*  88:100 */       return false;
/*  89:    */     }
/*  90:102 */     return true;
/*  91:    */   }
/*  92:    */   
/*  93:    */   protected Item A()
/*  94:    */   {
/*  95:107 */     if (au()) {
/*  96:108 */       return ItemList.cookedPorkchop;
/*  97:    */     }
/*  98:110 */     return ItemList.porkchop;
/*  99:    */   }
/* 100:    */   
/* 101:    */   protected void b(boolean paramBoolean, int paramInt)
/* 102:    */   {
/* 103:115 */     int i = this.rng.nextInt(3) + 1 + this.rng.nextInt(1 + paramInt);
/* 104:117 */     for (int j = 0; j < i; j++) {
/* 105:118 */       if (au()) {
/* 106:119 */         a(ItemList.cookedPorkchop, 1);
/* 107:    */       } else {
/* 108:121 */         a(ItemList.porkchop, 1);
/* 109:    */       }
/* 110:    */     }
/* 111:125 */     if (cj()) {
/* 112:126 */       a(ItemList.saddle, 1);
/* 113:    */     }
/* 114:    */   }
/* 115:    */   
/* 116:    */   public boolean cj()
/* 117:    */   {
/* 118:131 */     return (this.data.getByte(16) & 0x1) != 0;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void l(boolean paramBoolean)
/* 122:    */   {
/* 123:135 */     if (paramBoolean) {
/* 124:136 */       this.data.b(16, Byte.valueOf((byte)1));
/* 125:    */     } else {
/* 126:138 */       this.data.b(16, Byte.valueOf((byte)0));
/* 127:    */     }
/* 128:    */   }
/* 129:    */   
/* 130:    */   public void onStruck(ads paramads)
/* 131:    */   {
/* 132:144 */     if (this.world.isClient) {
/* 133:145 */       return;
/* 134:    */     }
/* 135:148 */     EntityZombiePigman pigman = new EntityZombiePigman(this.world);
/* 136:149 */     pigman.setItemStack(0, new ItemStack(ItemList.goldenSword));
/* 137:150 */     pigman.setPositionAndAngles(this.xPos, this.yPos, this.zPos, this.yaw, this.pitch);
/* 138:151 */     this.world.spawnEntity(pigman);
/* 139:152 */     setDead();
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void e(float paramFloat1, float paramFloat2)
/* 143:    */   {
/* 144:157 */     super.e(paramFloat1, paramFloat2);
/* 145:159 */     if ((paramFloat1 > 5.0F) && ((this.rider instanceof EntityPlayer))) {
/* 146:160 */       ((EntityPlayer)this.rider).increaseStat(AchievementList.u);
/* 147:    */     }
/* 148:    */   }
/* 149:    */   
/* 150:    */   public EntityPig getBaby(EntityPassiveMob paramws)
/* 151:    */   {
/* 152:166 */     return new EntityPig(this.world);
/* 153:    */   }
/* 154:    */   
/* 155:    */   public boolean d(ItemStack paramamj)
/* 156:    */   {
/* 157:171 */     return (paramamj != null) && (paramamj.getItem() == ItemList.carrot);
/* 158:    */   }
/* 159:    */   
/* 160:    */   public yu ck()
/* 161:    */   {
/* 162:175 */     return this.bk;
/* 163:    */   }
/* 164:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aca
 * JD-Core Version:    0.7.0.1
 */