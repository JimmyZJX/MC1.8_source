package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public abstract class EntityAnimal
/*   4:    */   extends EntityPassiveMob
/*   5:    */   implements wt
/*   6:    */ {
/*   7: 20 */   protected ProtoBlock bl = BlockList.grass;
/*   8:    */   private int bk;
/*   9:    */   private EntityPlayer bm;
/*  10:    */   
/*  11:    */   public EntityAnimal(World paramaqu)
/*  12:    */   {
/*  13: 25 */     super(paramaqu);
/*  14:    */   }
/*  15:    */   
/*  16:    */   protected void mobTick()
/*  17:    */   {
/*  18: 30 */     if (getAge() != 0) {
/*  19: 31 */       this.bk = 0;
/*  20:    */     }
/*  21: 33 */     super.mobTick();
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void m()
/*  25:    */   {
/*  26: 38 */     super.m();
/*  27: 40 */     if (getAge() != 0) {
/*  28: 41 */       this.bk = 0;
/*  29:    */     }
/*  30: 44 */     if (this.bk > 0)
/*  31:    */     {
/*  32: 45 */       this.bk -= 1;
/*  33: 46 */       if (this.bk % 10 == 0)
/*  34:    */       {
/*  35: 47 */         double d1 = this.rng.nextGaussian() * 0.02D;
/*  36: 48 */         double d2 = this.rng.nextGaussian() * 0.02D;
/*  37: 49 */         double d3 = this.rng.nextGaussian() * 0.02D;
/*  38: 50 */         this.world.a(EnumParticleEffect.HEART, this.xPos + this.rng.nextFloat() * this.width * 2.0F - this.width, this.yPos + 0.5D + this.rng.nextFloat() * this.height, this.zPos + this.rng.nextFloat() * this.width * 2.0F - this.width, d1, d2, d3, new int[0]);
/*  39:    */       }
/*  40:    */     }
/*  41:    */   }
/*  42:    */   
/*  43:    */   public boolean a(DamageSource paramwh, float paramFloat)
/*  44:    */   {
/*  45: 57 */     if (isImmuneTo(paramwh)) {
/*  46: 58 */       return false;
/*  47:    */     }
/*  48: 60 */     this.bk = 0;
/*  49: 61 */     return super.a(paramwh, paramFloat);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public float a(BlockPosition paramdt)
/*  53:    */   {
/*  54: 66 */     if (this.world.getBlock(paramdt.down()).getProto() == BlockList.grass) {
/*  55: 67 */       return 10.0F;
/*  56:    */     }
/*  57: 69 */     return this.world.o(paramdt) - 0.5F;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/*  61:    */   {
/*  62: 74 */     super.writeEntityToNBT(paramfn);
/*  63: 75 */     paramfn.setInt("InLove", this.bk);
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/*  67:    */   {
/*  68: 80 */     super.readEntityFromNBT(paramfn);
/*  69: 81 */     this.bk = paramfn.getInteger("InLove");
/*  70:    */   }
/*  71:    */   
/*  72:    */   public boolean canSpawn()
/*  73:    */   {
/*  74: 86 */     int i = MathUtils.floor(this.xPos);
/*  75: 87 */     int j = MathUtils.floor(getAABB().minY);
/*  76: 88 */     int k = MathUtils.floor(this.zPos);
/*  77: 89 */     BlockPosition localdt = new BlockPosition(i, j, k);
/*  78: 90 */     return (this.world.getBlock(localdt.down()).getProto() == this.bl) && (this.world.k(localdt) > 8) && (super.canSpawn());
/*  79:    */   }
/*  80:    */   
/*  81:    */   public int w()
/*  82:    */   {
/*  83: 95 */     return 120;
/*  84:    */   }
/*  85:    */   
/*  86:    */   protected boolean canDespawn()
/*  87:    */   {
/*  88:100 */     return false;
/*  89:    */   }
/*  90:    */   
/*  91:    */   protected int b(EntityPlayer paramahd)
/*  92:    */   {
/*  93:105 */     return 1 + this.world.rng.nextInt(3);
/*  94:    */   }
/*  95:    */   
/*  96:    */   public boolean d(ItemStack paramamj)
/*  97:    */   {
/*  98:109 */     if (paramamj == null) {
/*  99:110 */       return false;
/* 100:    */     }
/* 101:112 */     return paramamj.getItem() == ItemList.wheat;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public boolean onRightClick(EntityPlayer paramahd)
/* 105:    */   {
/* 106:117 */     ItemStack localamj = paramahd.bg.h();
/* 107:118 */     if (localamj != null)
/* 108:    */     {
/* 109:119 */       if ((d(localamj)) && (getAge() == 0) && (this.bk <= 0))
/* 110:    */       {
/* 111:120 */         a(paramahd, localamj);
/* 112:121 */         c(paramahd);
/* 113:122 */         return true;
/* 114:    */       }
/* 115:123 */       if ((i_()) && (d(localamj)))
/* 116:    */       {
/* 117:124 */         a(paramahd, localamj);
/* 118:125 */         a((int)(-getAge() / 20 * 0.1F), true);
/* 119:126 */         return true;
/* 120:    */       }
/* 121:    */     }
/* 122:129 */     return super.onRightClick(paramahd);
/* 123:    */   }
/* 124:    */   
/* 125:    */   protected void a(EntityPlayer paramahd, ItemStack paramamj)
/* 126:    */   {
/* 127:133 */     if (!paramahd.abilities.instabuild)
/* 128:    */     {
/* 129:134 */       paramamj.stackSize -= 1;
/* 130:135 */       if (paramamj.stackSize <= 0) {
/* 131:136 */         paramahd.bg.a(paramahd.bg.c, null);
/* 132:    */       }
/* 133:    */     }
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void c(EntityPlayer paramahd)
/* 137:    */   {
/* 138:142 */     this.bk = 600;
/* 139:143 */     this.bm = paramahd;
/* 140:    */     
/* 141:145 */     this.world.sendSignal(this, (byte)18);
/* 142:    */   }
/* 143:    */   
/* 144:    */   public EntityPlayer co()
/* 145:    */   {
/* 146:149 */     return this.bm;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public boolean cp()
/* 150:    */   {
/* 151:153 */     return this.bk > 0;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void cq()
/* 155:    */   {
/* 156:157 */     this.bk = 0;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public boolean a(EntityAnimal paramabq)
/* 160:    */   {
/* 161:161 */     if (paramabq == this) {
/* 162:162 */       return false;
/* 163:    */     }
/* 164:164 */     if (paramabq.getClass() != getClass()) {
/* 165:165 */       return false;
/* 166:    */     }
/* 167:167 */     return (cp()) && (paramabq.cp());
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void onSignal(byte paramByte)
/* 171:    */   {
/* 172:172 */     if (paramByte == 18) {
/* 173:173 */       for (int i = 0; i < 7; i++)
/* 174:    */       {
/* 175:174 */         double d1 = this.rng.nextGaussian() * 0.02D;
/* 176:175 */         double d2 = this.rng.nextGaussian() * 0.02D;
/* 177:176 */         double d3 = this.rng.nextGaussian() * 0.02D;
/* 178:177 */         this.world.a(EnumParticleEffect.HEART, this.xPos + this.rng.nextFloat() * this.width * 2.0F - this.width, this.yPos + 0.5D + this.rng.nextFloat() * this.height, this.zPos + this.rng.nextFloat() * this.width * 2.0F - this.width, d1, d2, d3, new int[0]);
/* 179:    */       }
/* 180:    */     } else {
/* 181:180 */       super.onSignal(paramByte);
/* 182:    */     }
/* 183:    */   }
/* 184:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abq
 * JD-Core Version:    0.7.0.1
 */