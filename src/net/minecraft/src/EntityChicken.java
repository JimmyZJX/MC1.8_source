package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class EntityChicken
/*   4:    */   extends EntityAnimal
/*   5:    */ {
/*   6:    */   public float bk;
/*   7:    */   public float bm;
/*   8:    */   public float bn;
/*   9:    */   public float bo;
/*  10: 22 */   public float bp = 1.0F;
/*  11:    */   public int bq;
/*  12:    */   public boolean isChickenJockey;
/*  13:    */   
/*  14:    */   public EntityChicken(World paramaqu)
/*  15:    */   {
/*  16: 27 */     super(paramaqu);
/*  17: 28 */     a(0.4F, 0.7F);
/*  18: 29 */     this.bq = (this.rng.nextInt(6000) + 6000);
/*  19:    */     
/*  20: 31 */     this.goalSelector.addGoal(0, new yy(this));
/*  21: 32 */     this.goalSelector.addGoal(1, new zu(this, 1.4D));
/*  22: 33 */     this.goalSelector.addGoal(2, new yt(this, 1.0D));
/*  23: 34 */     this.goalSelector.addGoal(3, new aag(this, 1.0D, ItemList.N, false));
/*  24: 35 */     this.goalSelector.addGoal(4, new za(this, 1.1D));
/*  25: 36 */     this.goalSelector.addGoal(5, new zy(this, 1.0D));
/*  26: 37 */     this.goalSelector.addGoal(6, new zh(this, EntityPlayer.class, 6.0F));
/*  27: 38 */     this.goalSelector.addGoal(7, new zx(this));
/*  28:    */   }
/*  29:    */   
/*  30:    */   public float getEyeHeight()
/*  31:    */   {
/*  32: 43 */     return this.height;
/*  33:    */   }
/*  34:    */   
/*  35:    */   protected void aW()
/*  36:    */   {
/*  37: 48 */     super.aW();
/*  38:    */     
/*  39: 50 */     a(afs.a).a(4.0D);
/*  40: 51 */     a(afs.d).a(0.25D);
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void m()
/*  44:    */   {
/*  45: 56 */     super.m();
/*  46:    */     
/*  47: 58 */     this.bo = this.bk;
/*  48: 59 */     this.bn = this.bm;
/*  49:    */     
/*  50: 61 */     this.bm = ((float)(this.bm + (this.C ? -1 : 4) * 0.3D));
/*  51: 62 */     this.bm = MathUtils.clamp(this.bm, 0.0F, 1.0F);
/*  52: 64 */     if ((!this.C) && (this.bp < 1.0F)) {
/*  53: 65 */       this.bp = 1.0F;
/*  54:    */     }
/*  55: 67 */     this.bp = ((float)(this.bp * 0.9D));
/*  56: 69 */     if ((!this.C) && (this.yVelocity < 0.0D)) {
/*  57: 70 */       this.yVelocity *= 0.6D;
/*  58:    */     }
/*  59: 73 */     this.bk += this.bp * 2.0F;
/*  60: 75 */     if ((!this.world.isClient) && (!i_()) && (!getIsChickenJockey()) && (--this.bq <= 0))
/*  61:    */     {
/*  62: 76 */       a("mob.chicken.plop", 1.0F, (this.rng.nextFloat() - this.rng.nextFloat()) * 0.2F + 1.0F);
/*  63: 77 */       a(ItemList.aP, 1);
/*  64: 78 */       this.bq = (this.rng.nextInt(6000) + 6000);
/*  65:    */     }
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void e(float paramFloat1, float paramFloat2) {}
/*  69:    */   
/*  70:    */   protected String z()
/*  71:    */   {
/*  72: 88 */     return "mob.chicken.say";
/*  73:    */   }
/*  74:    */   
/*  75:    */   protected String bn()
/*  76:    */   {
/*  77: 93 */     return "mob.chicken.hurt";
/*  78:    */   }
/*  79:    */   
/*  80:    */   protected String bo()
/*  81:    */   {
/*  82: 98 */     return "mob.chicken.hurt";
/*  83:    */   }
/*  84:    */   
/*  85:    */   protected void a(BlockPosition paramdt, ProtoBlock paramatr)
/*  86:    */   {
/*  87:103 */     a("mob.chicken.step", 0.15F, 1.0F);
/*  88:    */   }
/*  89:    */   
/*  90:    */   protected Item A()
/*  91:    */   {
/*  92:108 */     return ItemList.G;
/*  93:    */   }
/*  94:    */   
/*  95:    */   protected void b(boolean paramBoolean, int paramInt)
/*  96:    */   {
/*  97:114 */     int i = this.rng.nextInt(3) + this.rng.nextInt(1 + paramInt);
/*  98:115 */     for (int j = 0; j < i; j++) {
/*  99:116 */       a(ItemList.G, 1);
/* 100:    */     }
/* 101:119 */     if (au()) {
/* 102:120 */       a(ItemList.bl, 1);
/* 103:    */     } else {
/* 104:122 */       a(ItemList.bk, 1);
/* 105:    */     }
/* 106:    */   }
/* 107:    */   
/* 108:    */   public EntityChicken getBaby(EntityPassiveMob paramws)
/* 109:    */   {
/* 110:128 */     return new EntityChicken(this.world);
/* 111:    */   }
/* 112:    */   
/* 113:    */   public boolean d(ItemStack paramamj)
/* 114:    */   {
/* 115:133 */     return (paramamj != null) && (paramamj.getItem() == ItemList.N);
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 119:    */   {
/* 120:138 */     super.readEntityFromNBT(paramfn);
/* 121:139 */     this.isChickenJockey = paramfn.getBoolean("IsChickenJockey");
/* 122:140 */     if (paramfn.c("EggLayTime")) {
/* 123:141 */       this.bq = paramfn.getInteger("EggLayTime");
/* 124:    */     }
/* 125:    */   }
/* 126:    */   
/* 127:    */   protected int b(EntityPlayer paramahd)
/* 128:    */   {
/* 129:147 */     if (getIsChickenJockey()) {
/* 130:148 */       return 10;
/* 131:    */     }
/* 132:150 */     return super.b(paramahd);
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 136:    */   {
/* 137:155 */     super.writeEntityToNBT(paramfn);
/* 138:156 */     paramfn.setBoolean("IsChickenJockey", this.isChickenJockey);
/* 139:157 */     paramfn.setInt("EggLayTime", this.bq);
/* 140:    */   }
/* 141:    */   
/* 142:    */   protected boolean canDespawn()
/* 143:    */   {
/* 144:162 */     return (getIsChickenJockey()) && (this.rider == null);
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void al()
/* 148:    */   {
/* 149:167 */     super.al();
/* 150:168 */     float f1 = MathUtils.sin(this.aG * 3.141593F / 180.0F);
/* 151:169 */     float f2 = MathUtils.cos(this.aG * 3.141593F / 180.0F);
/* 152:170 */     float f3 = 0.1F;
/* 153:171 */     float f4 = 0.0F;
/* 154:    */     
/* 155:173 */     this.rider.setPos(this.xPos + f3 * f1, this.yPos + this.height * 0.5F + this.rider.am() + f4, this.zPos - f3 * f2);
/* 156:174 */     if ((this.rider instanceof EntityLiving)) {
/* 157:175 */       ((EntityLiving)this.rider).aG = this.aG;
/* 158:    */     }
/* 159:    */   }
/* 160:    */   
/* 161:    */   public boolean getIsChickenJockey()
/* 162:    */   {
/* 163:180 */     return this.isChickenJockey;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void l(boolean paramBoolean)
/* 167:    */   {
/* 168:184 */     this.isChickenJockey = paramBoolean;
/* 169:    */   }
/* 170:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abr
 * JD-Core Version:    0.7.0.1
 */