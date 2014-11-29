package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ import java.util.UUID;
/*   4:    */ 
/*   5:    */ public class EntityWitch
/*   6:    */   extends EntityHostileMob
/*   7:    */   implements afr
/*   8:    */ {
/*   9: 29 */   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
/*  10: 30 */   private static final ya c = new ya(b, "Drinking speed penalty", -0.25D, 0).a(false);
/*  11: 33 */   private static final Item[] bk = { ItemList.aT, ItemList.aY, ItemList.redstone, ItemList.bB, ItemList.bA, ItemList.H, ItemList.stick, ItemList.stick };
/*  12:    */   private int bl;
/*  13:    */   
/*  14:    */   public EntityWitch(World paramaqu)
/*  15:    */   {
/*  16: 40 */     super(paramaqu);
/*  17: 41 */     a(0.6F, 1.95F);
/*  18:    */     
/*  19: 43 */     this.goalSelector.addGoal(1, new GoalSwim(this));
/*  20: 44 */     this.goalSelector.addGoal(2, new zz(this, 1.0D, 60, 10.0F));
/*  21: 45 */     this.goalSelector.addGoal(2, new zy(this, 1.0D));
/*  22: 46 */     this.goalSelector.addGoal(2, this.a);
/*  23: 47 */     this.goalSelector.addGoal(3, new zh(this, EntityPlayer.class, 8.0F));
/*  24: 48 */     this.goalSelector.addGoal(3, new zx(this));
/*  25:    */     
/*  26: 50 */     this.targetSelector.addGoal(1, new aal(this, false, new Class[0]));
/*  27: 51 */     this.targetSelector.addGoal(2, new aaq(this, EntityPlayer.class, true));
/*  28:    */   }
/*  29:    */   
/*  30:    */   protected void h()
/*  31:    */   {
/*  32: 56 */     super.h();
/*  33:    */     
/*  34: 58 */     H().addData(21, Byte.valueOf((byte)0));
/*  35:    */   }
/*  36:    */   
/*  37:    */   protected String z()
/*  38:    */   {
/*  39: 63 */     return null;
/*  40:    */   }
/*  41:    */   
/*  42:    */   protected String bn()
/*  43:    */   {
/*  44: 68 */     return null;
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected String bo()
/*  48:    */   {
/*  49: 73 */     return null;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void a(boolean paramBoolean)
/*  53:    */   {
/*  54: 77 */     H().b(21, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean n()
/*  58:    */   {
/*  59: 81 */     return H().getByte(21) == 1;
/*  60:    */   }
/*  61:    */   
/*  62:    */   protected void aW()
/*  63:    */   {
/*  64: 86 */     super.aW();
/*  65:    */     
/*  66: 88 */     getAttribute(MobAttribute.maxHealth).a(26.0D);
/*  67: 89 */     getAttribute(MobAttribute.movementSpeed).a(0.25D);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void m()
/*  71:    */   {
/*  72: 94 */     if (!this.world.isClient)
/*  73:    */     {
/*  74:    */       List<PotionEffect> localObject;
/*  75: 95 */       if (n())
/*  76:    */       {
/*  77: 96 */         if (this.bl-- <= 0)
/*  78:    */         {
/*  79: 97 */           a(false);
/*  80: 98 */           ItemStack localamj = getHeldItemStack();
/*  81: 99 */           setItemStack(0, null);
/*  82:101 */           if ((localamj != null) && (localamj.getItem() == ItemList.potion))
/*  83:    */           {
/*  84:102 */             localObject = ItemList.potion.h(localamj);
/*  85:103 */             if (localObject != null) {
/*  86:104 */               for (PotionEffect localwq : localObject) {
/*  87:105 */                 c(new PotionEffect(localwq));
/*  88:    */               }
/*  89:    */             }
/*  90:    */           }
/*  91:110 */           getAttribute(MobAttribute.movementSpeed).c(c);
/*  92:    */         }
/*  93:    */       }
/*  94:    */       else
/*  95:    */       {
/*  96:113 */         int i = -1;
/*  97:115 */         if ((this.rng.nextFloat() < 0.15F) && (a(Material.water)) && (!a(Potion.waterBreathing))) {
/*  98:116 */           i = 8237;
/*  99:117 */         } else if ((this.rng.nextFloat() < 0.15F) && (au()) && (!a(Potion.fireResistance))) {
/* 100:118 */           i = 16307;
/* 101:119 */         } else if ((this.rng.nextFloat() < 0.05F) && (getHealth() < bt())) {
/* 102:120 */           i = 16341;
/* 103:121 */         } else if ((this.rng.nextFloat() < 0.25F) && (u() != null) && (!a(Potion.speed)) && (u().h(this) > 121.0D)) {
/* 104:122 */           i = 16274;
/* 105:123 */         } else if ((this.rng.nextFloat() < 0.25F) && (u() != null) && (!a(Potion.speed)) && (u().h(this) > 121.0D)) {
/* 106:124 */           i = 16274;
/* 107:    */         }
/* 108:127 */         if (i > -1)
/* 109:    */         {
/* 110:128 */           setItemStack(0, new ItemStack(ItemList.potion, 1, i));
/* 111:129 */           this.bl = getHeldItemStack().l();
/* 112:130 */           a(true);
/* 113:131 */           xz localObject1 = getAttribute(MobAttribute.movementSpeed);
/* 114:132 */           localObject1.c(c);
/* 115:133 */           localObject1.b(c);
/* 116:    */         }
/* 117:    */       }
/* 118:137 */       if (this.rng.nextFloat() < 0.00075F) {
/* 119:138 */         this.world.sendSignal(this, (byte)15);
/* 120:    */       }
/* 121:    */     }
/* 122:142 */     super.m();
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void onSignal(byte paramByte)
/* 126:    */   {
/* 127:147 */     if (paramByte == 15) {
/* 128:148 */       for (int i = 0; i < this.rng.nextInt(35) + 10; i++) {
/* 129:149 */         this.world.a(EnumParticleEffect.r, this.xPos + this.rng.nextGaussian() * 0.1299999952316284D, getAABB().maxY + 0.5D + this.rng.nextGaussian() * 0.1299999952316284D, this.zPos + this.rng.nextGaussian() * 0.1299999952316284D, 0.0D, 0.0D, 0.0D, new int[0]);
/* 130:    */       }
/* 131:    */     } else {
/* 132:152 */       super.onSignal(paramByte);
/* 133:    */     }
/* 134:    */   }
/* 135:    */   
/* 136:    */   protected float c(DamageSource paramwh, float paramFloat)
/* 137:    */   {
/* 138:158 */     paramFloat = super.c(paramwh, paramFloat);
/* 139:160 */     if (paramwh.getAttacker() == this) {
/* 140:161 */       paramFloat = 0.0F;
/* 141:    */     }
/* 142:163 */     if (paramwh.s()) {
/* 143:164 */       paramFloat = (float)(paramFloat * 0.15D);
/* 144:    */     }
/* 145:167 */     return paramFloat;
/* 146:    */   }
/* 147:    */   
/* 148:    */   protected void b(boolean paramBoolean, int paramInt)
/* 149:    */   {
/* 150:172 */     int i = this.rng.nextInt(3) + 1;
/* 151:173 */     for (int j = 0; j < i; j++)
/* 152:    */     {
/* 153:174 */       int k = this.rng.nextInt(3);
/* 154:175 */       Item localalq = bk[this.rng.nextInt(bk.length)];
/* 155:176 */       if (paramInt > 0) {
/* 156:177 */         k += this.rng.nextInt(paramInt + 1);
/* 157:    */       }
/* 158:180 */       for (int m = 0; m < k; m++) {
/* 159:181 */         a(localalq, 1);
/* 160:    */       }
/* 161:    */     }
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void a(EntityLiving paramxm, float paramFloat)
/* 165:    */   {
/* 166:188 */     if (n()) {
/* 167:189 */       return;
/* 168:    */     }
/* 169:192 */     ahv localahv = new ahv(this.world, this, 32732);
/* 170:193 */     double d1 = paramxm.yPos + paramxm.getEyeHeight() - 1.100000023841858D;
/* 171:194 */     localahv.pitch -= -20.0F;
/* 172:195 */     double d2 = paramxm.xPos + paramxm.xVelocity - this.xPos;
/* 173:196 */     double d3 = d1 - this.yPos;
/* 174:197 */     double d4 = paramxm.zPos + paramxm.zVelocity - this.zPos;
/* 175:198 */     float f = MathUtils.sqrt(d2 * d2 + d4 * d4);
/* 176:200 */     if ((f >= 8.0F) && (!paramxm.a(Potion.slowness))) {
/* 177:201 */       localahv.a(32698);
/* 178:202 */     } else if ((paramxm.getHealth() >= 8.0F) && (!paramxm.a(Potion.poison))) {
/* 179:203 */       localahv.a(32660);
/* 180:204 */     } else if ((f <= 3.0F) && (!paramxm.a(Potion.weakness)) && (this.rng.nextFloat() < 0.25F)) {
/* 181:205 */       localahv.a(32696);
/* 182:    */     }
/* 183:208 */     localahv.c(d2, d3 + f * 0.2F, d4, 0.75F, 8.0F);
/* 184:    */     
/* 185:210 */     this.world.spawnEntity(localahv);
/* 186:    */   }
/* 187:    */   
/* 188:    */   public float getEyeHeight()
/* 189:    */   {
/* 190:215 */     return 1.62F;
/* 191:    */   }
/* 192:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     agi
 * JD-Core Version:    0.7.0.1
 */