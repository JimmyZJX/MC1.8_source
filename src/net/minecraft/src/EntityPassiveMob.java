package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public abstract class EntityPassiveMob
/*   4:    */   extends EntityWalkingMob
/*   5:    */ {
/*   6:    */   protected int age;
/*   7:    */   protected int forcedAge;
/*   8:    */   protected int c;
/*   9:    */   
/*  10:    */   public EntityPassiveMob(World paramaqu)
/*  11:    */   {
/*  12: 24 */     super(paramaqu);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public abstract EntityPassiveMob getBaby(EntityPassiveMob paramws);
/*  16:    */   
/*  17:    */   public boolean onRightClick(EntityPlayer player)
/*  18:    */   {
/*  19: 31 */     ItemStack stack = player.bg.h();
/*  20: 33 */     if ((stack != null) && (stack.getItem() == ItemList.spawnEgg))
/*  21:    */     {
/*  22: 34 */       if (!this.world.isClient)
/*  23:    */       {
/*  24: 35 */         Class<? extends Entity> localClass = EntityList.fromID(stack.getDamage2());
/*  25: 36 */         if ((localClass != null) && (getClass() == localClass))
/*  26:    */         {
/*  27: 37 */           EntityPassiveMob localws = getBaby(this);
/*  28: 38 */           if (localws != null)
/*  29:    */           {
/*  30: 39 */             localws.setAge(-24000);
/*  31: 40 */             localws.setPositionAndAngles(this.xPos, this.yPos, this.zPos, 0.0F, 0.0F);
/*  32:    */             
/*  33: 42 */             this.world.spawnEntity(localws);
/*  34: 44 */             if (stack.s()) {
/*  35: 45 */               localws.a(stack.q());
/*  36:    */             }
/*  37: 48 */             if (!player.by.d)
/*  38:    */             {
/*  39: 49 */               stack.stackSize -= 1;
/*  40: 51 */               if (stack.stackSize <= 0) {
/*  41: 52 */                 player.bg.a(player.bg.c, null);
/*  42:    */               }
/*  43:    */             }
/*  44:    */           }
/*  45:    */         }
/*  46:    */       }
/*  47: 58 */       return true;
/*  48:    */     }
/*  49: 60 */     return false;
/*  50:    */   }
/*  51:    */   
/*  52:    */   protected void h()
/*  53:    */   {
/*  54: 65 */     super.h();
/*  55: 66 */     this.ac.a(12, Byte.valueOf((byte)0));
/*  56:    */   }
/*  57:    */   
/*  58:    */   public int getAge()
/*  59:    */   {
/*  60: 70 */     if (this.world.isClient) {
/*  61: 71 */       return this.ac.a(12);
/*  62:    */     }
/*  63: 73 */     return this.age;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void a(int paramInt, boolean paramBoolean)
/*  67:    */   {
/*  68: 78 */     int i = getAge();
/*  69: 79 */     int j = i;
/*  70: 80 */     i += paramInt * 20;
/*  71: 81 */     if (i > 0)
/*  72:    */     {
/*  73: 82 */       i = 0;
/*  74: 83 */       if (j < 0) {
/*  75: 84 */         n();
/*  76:    */       }
/*  77:    */     }
/*  78: 87 */     int k = i - j;
/*  79: 88 */     setAge(i);
/*  80: 89 */     if (paramBoolean)
/*  81:    */     {
/*  82: 90 */       this.forcedAge += k;
/*  83: 91 */       if (this.c == 0) {
/*  84: 92 */         this.c = 40;
/*  85:    */       }
/*  86:    */     }
/*  87: 95 */     if (getAge() == 0) {
/*  88: 96 */       setAge(this.forcedAge);
/*  89:    */     }
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void a(int paramInt)
/*  93:    */   {
/*  94:101 */     a(paramInt, false);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void setAge(int paramInt)
/*  98:    */   {
/*  99:105 */     this.ac.b(12, Byte.valueOf((byte)MathUtils.clamp(paramInt, -1, 1)));
/* 100:106 */     this.age = paramInt;
/* 101:107 */     a(i_());
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 105:    */   {
/* 106:112 */     super.writeEntityToNBT(paramfn);
/* 107:113 */     paramfn.setInt("Age", getAge());
/* 108:114 */     paramfn.setInt("ForcedAge", this.forcedAge);
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 112:    */   {
/* 113:119 */     super.readEntityFromNBT(paramfn);
/* 114:120 */     setAge(paramfn.getInteger("Age"));
/* 115:121 */     this.forcedAge = paramfn.getInteger("ForcedAge");
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void m()
/* 119:    */   {
/* 120:126 */     super.m();
/* 121:128 */     if (this.world.isClient)
/* 122:    */     {
/* 123:129 */       if (this.c > 0)
/* 124:    */       {
/* 125:130 */         if (this.c % 4 == 0) {
/* 126:131 */           this.world.a(EnumParticleEffect.VILLAGER_HAPPY, this.xPos + this.rng.nextFloat() * this.width * 2.0F - this.width, this.yPos + 0.5D + this.rng.nextFloat() * this.height, this.zPos + this.rng.nextFloat() * this.width * 2.0F - this.width, 0.0D, 0.0D, 0.0D, new int[0]);
/* 127:    */         }
/* 128:133 */         this.c -= 1;
/* 129:    */       }
/* 130:135 */       a(i_());
/* 131:    */     }
/* 132:    */     else
/* 133:    */     {
/* 134:137 */       int i = getAge();
/* 135:138 */       if (i < 0)
/* 136:    */       {
/* 137:139 */         i++;
/* 138:140 */         setAge(i);
/* 139:141 */         if (i == 0) {
/* 140:142 */           n();
/* 141:    */         }
/* 142:    */       }
/* 143:144 */       else if (i > 0)
/* 144:    */       {
/* 145:145 */         i--;
/* 146:146 */         setAge(i);
/* 147:    */       }
/* 148:    */     }
/* 149:    */   }
/* 150:    */   
/* 151:    */   protected void n() {}
/* 152:    */   
/* 153:    */   public boolean i_()
/* 154:    */   {
/* 155:156 */     return getAge() < 0;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void a(boolean paramBoolean)
/* 159:    */   {
/* 160:160 */     a(paramBoolean ? 0.5F : 1.0F);
/* 161:    */   }
/* 162:    */   
/* 163:163 */   private float bk = -1.0F;
/* 164:    */   private float bl;
/* 165:    */   
/* 166:    */   protected final void a(float paramFloat1, float paramFloat2)
/* 167:    */   {
/* 168:168 */     int i = this.bk > 0.0F ? 1 : 0;
/* 169:    */     
/* 170:170 */     this.bk = paramFloat1;
/* 171:171 */     this.bl = paramFloat2;
/* 172:173 */     if (i == 0) {
/* 173:174 */       a(1.0F);
/* 174:    */     }
/* 175:    */   }
/* 176:    */   
/* 177:    */   protected final void a(float paramFloat)
/* 178:    */   {
/* 179:179 */     super.a(this.bk * paramFloat, this.bl * paramFloat);
/* 180:    */   }
/* 181:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ws
 * JD-Core Version:    0.7.0.1
 */