package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class ahm
/*   4:    */   extends Entity
/*   5:    */ {
/*   6:    */   private int a;
/*   7:    */   private int b;
/*   8:    */   
/*   9:    */   public ahm(World paramaqu)
/*  10:    */   {
/*  11: 22 */     super(paramaqu);
/*  12: 23 */     a(0.25F, 0.25F);
/*  13:    */   }
/*  14:    */   
/*  15:    */   protected void h()
/*  16:    */   {
/*  17: 28 */     this.data.addNullData(8, 5);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public boolean a(double paramDouble)
/*  21:    */   {
/*  22: 33 */     return paramDouble < 4096.0D;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public ahm(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, ItemStack paramamj)
/*  26:    */   {
/*  27: 37 */     super(paramaqu);
/*  28: 38 */     this.a = 0;
/*  29:    */     
/*  30: 40 */     a(0.25F, 0.25F);
/*  31:    */     
/*  32: 42 */     setPos(paramDouble1, paramDouble2, paramDouble3);
/*  33:    */     
/*  34: 44 */     int i = 1;
/*  35: 45 */     if ((paramamj != null) && (paramamj.hasTagCompound()))
/*  36:    */     {
/*  37: 46 */       this.data.b(8, paramamj);
/*  38:    */       
/*  39: 48 */       NBTTagCompound localfn1 = paramamj.getTagCompound();
/*  40: 49 */       NBTTagCompound localfn2 = localfn1.getCompoundTag("Fireworks");
/*  41: 50 */       if (localfn2 != null) {
/*  42: 51 */         i += localfn2.d("Flight");
/*  43:    */       }
/*  44:    */     }
/*  45: 54 */     this.xVelocity = (this.rng.nextGaussian() * 0.001D);
/*  46: 55 */     this.zVelocity = (this.rng.nextGaussian() * 0.001D);
/*  47: 56 */     this.yVelocity = 0.05D;
/*  48:    */     
/*  49: 58 */     this.b = (10 * i + this.rng.nextInt(6) + this.rng.nextInt(7));
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/*  53:    */   {
/*  54: 63 */     this.xVelocity = paramDouble1;
/*  55: 64 */     this.yVelocity = paramDouble2;
/*  56: 65 */     this.zVelocity = paramDouble3;
/*  57: 66 */     if ((this.lastPitch == 0.0F) && (this.lastYaw == 0.0F))
/*  58:    */     {
/*  59: 67 */       float f = MathUtils.sqrt(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*  60: 68 */       this.lastYaw = (this.yaw = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/*  61: 69 */       this.lastPitch = (this.pitch = (float)(Math.atan2(paramDouble2, f) * 180.0D / 3.141592741012573D));
/*  62:    */     }
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void onUpdate()
/*  66:    */   {
/*  67: 75 */     this.P = this.xPos;
/*  68: 76 */     this.Q = this.yPos;
/*  69: 77 */     this.R = this.zPos;
/*  70: 78 */     super.onUpdate();
/*  71:    */     
/*  72: 80 */     this.xVelocity *= 1.15D;
/*  73: 81 */     this.zVelocity *= 1.15D;
/*  74: 82 */     this.yVelocity += 0.04D;
/*  75: 83 */     move(this.xVelocity, this.yVelocity, this.zVelocity);
/*  76:    */     
/*  77: 85 */     float f = MathUtils.sqrt(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/*  78: 86 */     this.yaw = ((float)(Math.atan2(this.xVelocity, this.zVelocity) * 180.0D / 3.141592741012573D));
/*  79: 87 */     this.pitch = ((float)(Math.atan2(this.yVelocity, f) * 180.0D / 3.141592741012573D));
/*  80: 89 */     while (this.pitch - this.lastPitch < -180.0F) {
/*  81: 90 */       this.lastPitch -= 360.0F;
/*  82:    */     }
/*  83: 92 */     while (this.pitch - this.lastPitch >= 180.0F) {
/*  84: 93 */       this.lastPitch += 360.0F;
/*  85:    */     }
/*  86: 96 */     while (this.yaw - this.lastYaw < -180.0F) {
/*  87: 97 */       this.lastYaw -= 360.0F;
/*  88:    */     }
/*  89: 99 */     while (this.yaw - this.lastYaw >= 180.0F) {
/*  90:100 */       this.lastYaw += 360.0F;
/*  91:    */     }
/*  92:103 */     this.pitch = (this.lastPitch + (this.pitch - this.lastPitch) * 0.2F);
/*  93:104 */     this.yaw = (this.lastYaw + (this.yaw - this.lastYaw) * 0.2F);
/*  94:106 */     if ((this.a == 0) && (!R())) {
/*  95:107 */       this.world.a(this, "fireworks.launch", 3.0F, 1.0F);
/*  96:    */     }
/*  97:110 */     this.a += 1;
/*  98:111 */     if ((this.world.isClient) && (this.a % 2 < 2)) {
/*  99:112 */       this.world.a(EnumParticleEffect.FIREWORKS_SPARK, this.xPos, this.yPos - 0.3D, this.zPos, this.rng.nextGaussian() * 0.05D, -this.yVelocity * 0.5D, this.rng.nextGaussian() * 0.05D, new int[0]);
/* 100:    */     }
/* 101:114 */     if ((!this.world.isClient) && (this.a > this.b))
/* 102:    */     {
/* 103:115 */       this.world.sendSignal(this, (byte)17);
/* 104:116 */       setDead();
/* 105:    */     }
/* 106:    */   }
/* 107:    */   
/* 108:    */   public void onSignal(byte paramByte)
/* 109:    */   {
/* 110:122 */     if ((paramByte == 17) && (this.world.isClient))
/* 111:    */     {
/* 112:123 */       ItemStack localamj = this.data.getItemStack(8);
/* 113:124 */       NBTTagCompound localfn = null;
/* 114:125 */       if ((localamj != null) && (localamj.hasTagCompound())) {
/* 115:126 */         localfn = localamj.getTagCompound().getCompoundTag("Fireworks");
/* 116:    */       }
/* 117:128 */       this.world.a(this.xPos, this.yPos, this.zPos, this.xVelocity, this.yVelocity, this.zVelocity, localfn);
/* 118:    */     }
/* 119:130 */     super.onSignal(paramByte);
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 123:    */   {
/* 124:135 */     paramfn.setInt("Life", this.a);
/* 125:136 */     paramfn.setInt("LifeTime", this.b);
/* 126:137 */     ItemStack localamj = this.data.getItemStack(8);
/* 127:138 */     if (localamj != null)
/* 128:    */     {
/* 129:139 */       NBTTagCompound localfn = new NBTTagCompound();
/* 130:140 */       localamj.writeToNBT(localfn);
/* 131:141 */       paramfn.setNBT("FireworksItem", localfn);
/* 132:    */     }
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 136:    */   {
/* 137:147 */     this.a = paramfn.getInteger("Life");
/* 138:148 */     this.b = paramfn.getInteger("LifeTime");
/* 139:    */     
/* 140:150 */     NBTTagCompound localfn = paramfn.getCompoundTag("FireworksItem");
/* 141:151 */     if (localfn != null)
/* 142:    */     {
/* 143:152 */       ItemStack localamj = ItemStack.loadItemStackFromNBT(localfn);
/* 144:153 */       if (localamj != null) {
/* 145:154 */         this.data.b(8, localamj);
/* 146:    */       }
/* 147:    */     }
/* 148:    */   }
/* 149:    */   
/* 150:    */   public float c(float paramFloat)
/* 151:    */   {
/* 152:161 */     return super.c(paramFloat);
/* 153:    */   }
/* 154:    */   
/* 155:    */   public int b(float paramFloat)
/* 156:    */   {
/* 157:166 */     return super.b(paramFloat);
/* 158:    */   }
/* 159:    */   
/* 160:    */   public boolean aE()
/* 161:    */   {
/* 162:171 */     return false;
/* 163:    */   }
/* 164:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahm
 * JD-Core Version:    0.7.0.1
 */