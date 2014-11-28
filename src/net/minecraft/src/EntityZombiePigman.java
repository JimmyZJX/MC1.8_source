package net.minecraft.src;
/*   3:    */ import java.util.UUID;
/*   4:    */ 
/*   5:    */ public class EntityZombiePigman
/*   6:    */   extends EntityZombie
/*   7:    */ {
/*   8: 25 */   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
/*   9: 26 */   private static final ya bk = new ya(c, "Attacking speed boost", 0.05D, 0).a(false);
/*  10:    */   private int anger;
/*  11:    */   private int bm;
/*  12:    */   private UUID bn;
/*  13:    */   
/*  14:    */   public EntityZombiePigman(World paramaqu)
/*  15:    */   {
/*  16: 34 */     super(paramaqu);
/*  17: 35 */     this.ab = true;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void b(EntityLiving paramxm)
/*  21:    */   {
/*  22: 40 */     super.b(paramxm);
/*  23: 41 */     if (paramxm != null) {
/*  24: 42 */       this.bn = paramxm.getUUID();
/*  25:    */     }
/*  26:    */   }
/*  27:    */   
/*  28:    */   protected void n()
/*  29:    */   {
/*  30: 48 */     this.targetSelector.addGoal(1, new afq(this));
/*  31: 49 */     this.targetSelector.addGoal(2, new afp(this));
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected void aW()
/*  35:    */   {
/*  36: 54 */     super.aW();
/*  37:    */     
/*  38: 56 */     getAttribute(b).a(0.0D);
/*  39: 57 */     getAttribute(MobAttribute.movementSpeed).a(0.2300000041723251D);
/*  40: 58 */     getAttribute(MobAttribute.attackDamage).a(5.0D);
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void onUpdate()
/*  44:    */   {
/*  45: 63 */     super.onUpdate();
/*  46:    */   }
/*  47:    */   
/*  48:    */   protected void mobTick()
/*  49:    */   {
/*  50: 68 */     xz localxz = getAttribute(MobAttribute.movementSpeed);
/*  51: 69 */     if (ck())
/*  52:    */     {
/*  53: 70 */       if ((!i_()) && (!localxz.a(bk))) {
/*  54: 71 */         localxz.b(bk);
/*  55:    */       }
/*  56: 73 */       this.anger -= 1;
/*  57:    */     }
/*  58: 74 */     else if (localxz.a(bk))
/*  59:    */     {
/*  60: 75 */       localxz.c(bk);
/*  61:    */     }
/*  62: 78 */     if ((this.bm > 0) && 
/*  63: 79 */       (--this.bm == 0)) {
/*  64: 80 */       a("mob.zombiepig.zpigangry", bA() * 2.0F, ((this.rng.nextFloat() - this.rng.nextFloat()) * 0.2F + 1.0F) * 1.8F);
/*  65:    */     }
/*  66: 84 */     if ((this.anger > 0) && 
/*  67: 85 */       (this.bn != null) && (bc() == null))
/*  68:    */     {
/*  69: 86 */       EntityPlayer player = this.world.b(this.bn);
/*  70: 87 */       b(player);
/*  71: 88 */       this.aL = player;
/*  72: 89 */       this.aM = bd();
/*  73:    */     }
/*  74: 93 */     super.mobTick();
/*  75:    */   }
/*  76:    */   
/*  77:    */   public boolean canSpawn()
/*  78:    */   {
/*  79: 98 */     return this.world.getDifficulty() != EnumDifficulty.PEACEFUL;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public boolean spawnAABBCheck()
/*  83:    */   {
/*  84:103 */     return (this.world.isCollisionFree(getAABB(), this)) && (this.world.getCollidingAABBs(this, getAABB()).isEmpty()) && (!this.world.isInLiquid(getAABB()));
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void writeEntityToNBT(NBTTagCompound tag)
/*  88:    */   {
/*  89:108 */     super.writeEntityToNBT(tag);
/*  90:109 */     tag.setShort("Anger", (short)this.anger);
/*  91:110 */     if (this.bn != null) {
/*  92:111 */       tag.setString("HurtBy", this.bn.toString());
/*  93:    */     } else {
/*  94:113 */       tag.setString("HurtBy", "");
/*  95:    */     }
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/*  99:    */   {
/* 100:119 */     super.readEntityFromNBT(paramfn);
/* 101:120 */     this.anger = paramfn.e("Anger");
/* 102:121 */     String str = paramfn.getString("HurtBy");
/* 103:122 */     if (str.length() > 0)
/* 104:    */     {
/* 105:123 */       this.bn = UUID.fromString(str);
/* 106:    */       
/* 107:125 */       EntityPlayer localahd = this.world.b(this.bn);
/* 108:126 */       b(localahd);
/* 109:127 */       if (localahd != null)
/* 110:    */       {
/* 111:128 */         this.aL = localahd;
/* 112:129 */         this.aM = bd();
/* 113:    */       }
/* 114:    */     }
/* 115:    */   }
/* 116:    */   
/* 117:    */   public boolean a(DamageSource paramwh, float paramFloat)
/* 118:    */   {
/* 119:136 */     if (isImmuneTo(paramwh)) {
/* 120:137 */       return false;
/* 121:    */     }
/* 122:139 */     Entity localwv = paramwh.getAttacker();
/* 123:140 */     if ((localwv instanceof EntityPlayer)) {
/* 124:141 */       enrage(localwv);
/* 125:    */     }
/* 126:143 */     return super.a(paramwh, paramFloat);
/* 127:    */   }
/* 128:    */   
/* 129:    */   private void enrage(Entity paramwv)
/* 130:    */   {
/* 131:147 */     this.anger = (400 + this.rng.nextInt(400));
/* 132:148 */     this.bm = this.rng.nextInt(40);
/* 133:149 */     if ((paramwv instanceof EntityLiving)) {
/* 134:150 */       b((EntityLiving)paramwv);
/* 135:    */     }
/* 136:    */   }
/* 137:    */   
/* 138:    */   public boolean ck()
/* 139:    */   {
/* 140:155 */     return this.anger > 0;
/* 141:    */   }
/* 142:    */   
/* 143:    */   protected String z()
/* 144:    */   {
/* 145:160 */     return "mob.zombiepig.zpig";
/* 146:    */   }
/* 147:    */   
/* 148:    */   protected String bn()
/* 149:    */   {
/* 150:165 */     return "mob.zombiepig.zpighurt";
/* 151:    */   }
/* 152:    */   
/* 153:    */   protected String bo()
/* 154:    */   {
/* 155:170 */     return "mob.zombiepig.zpigdeath";
/* 156:    */   }
/* 157:    */   
/* 158:    */   protected void b(boolean paramBoolean, int paramInt)
/* 159:    */   {
/* 160:175 */     int i = this.rng.nextInt(2 + paramInt);
/* 161:176 */     for (int j = 0; j < i; j++) {
/* 162:177 */       a(ItemList.rottenFlesh, 1);
/* 163:    */     }
/* 164:179 */     i = this.rng.nextInt(2 + paramInt);
/* 165:180 */     for (j = 0; j < i; j++) {
/* 166:181 */       a(ItemList.goldNugget, 1);
/* 167:    */     }
/* 168:    */   }
/* 169:    */   
/* 170:    */   public boolean onRightClick(EntityPlayer paramahd)
/* 171:    */   {
/* 172:187 */     return false;
/* 173:    */   }
/* 174:    */   
/* 175:    */   protected void bp()
/* 176:    */   {
/* 177:192 */     a(ItemList.goldIngot, 1);
/* 178:    */   }
/* 179:    */   
/* 180:    */   protected void a(vu paramvu)
/* 181:    */   {
/* 182:197 */     setItemStack(0, new ItemStack(ItemList.goldenSword));
/* 183:    */   }
/* 184:    */   
/* 185:    */   public xq beforeSpawn(vu paramvu, xq paramxq)
/* 186:    */   {
/* 187:203 */     super.beforeSpawn(paramvu, paramxq);
/* 188:204 */     m(false);
/* 189:205 */     return paramxq;
/* 190:    */   }
				static void enrage(EntityZombiePigman arg0, Entity arg1) {arg0.enrage(arg1);}
/* 191:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afo
 * JD-Core Version:    0.7.0.1
 */