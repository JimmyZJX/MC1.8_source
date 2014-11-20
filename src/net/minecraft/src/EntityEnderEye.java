package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class EntityEnderEye
/*   4:    */   extends Entity
/*   5:    */ {
/*   6:    */   private double a;
/*   7:    */   private double b;
/*   8:    */   private double c;
/*   9:    */   private int d;
/*  10:    */   private boolean e;
/*  11:    */   
/*  12:    */   public EntityEnderEye(World world)
/*  13:    */   {
/*  14: 22 */     super(world);
/*  15: 23 */     a(0.25F, 0.25F);
/*  16:    */   }
/*  17:    */   
/*  18:    */   protected void h() {}
/*  19:    */   
/*  20:    */   public boolean a(double paramDouble)
/*  21:    */   {
/*  22: 32 */     double d1 = getAABB().a() * 4.0D;
/*  23: 33 */     d1 *= 64.0D;
/*  24: 34 */     return paramDouble < d1 * d1;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public EntityEnderEye(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  28:    */   {
/*  29: 38 */     super(paramaqu);
/*  30: 39 */     this.d = 0;
/*  31:    */     
/*  32: 41 */     a(0.25F, 0.25F);
/*  33:    */     
/*  34: 43 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void a(BlockPosition paramdt)
/*  38:    */   {
/*  39: 47 */     double d1 = paramdt.getX();
/*  40: 48 */     int i = paramdt.getY();
/*  41: 49 */     double d2 = paramdt.getZ();
/*  42:    */     
/*  43: 51 */     double d3 = d1 - this.xPos;double d4 = d2 - this.zPos;
/*  44: 52 */     float f = MathUtils.a(d3 * d3 + d4 * d4);
/*  45: 54 */     if (f > 12.0F)
/*  46:    */     {
/*  47: 55 */       this.a = (this.xPos + d3 / f * 12.0D);
/*  48: 56 */       this.c = (this.zPos + d4 / f * 12.0D);
/*  49: 57 */       this.b = (this.yPos + 8.0D);
/*  50:    */     }
/*  51:    */     else
/*  52:    */     {
/*  53: 59 */       this.a = d1;
/*  54: 60 */       this.b = i;
/*  55: 61 */       this.c = d2;
/*  56:    */     }
/*  57: 64 */     this.d = 0;
/*  58: 65 */     this.e = (this.rng.nextInt(5) > 0);
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/*  62:    */   {
/*  63: 70 */     this.xVelocity = paramDouble1;
/*  64: 71 */     this.yVelocity = paramDouble2;
/*  65: 72 */     this.zVelocity = paramDouble3;
/*  66: 73 */     if ((this.lastPitch == 0.0F) && (this.lastYaw == 0.0F))
/*  67:    */     {
/*  68: 74 */       float f = MathUtils.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*  69: 75 */       this.lastYaw = (this.yaw = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.141592741012573D));
/*  70: 76 */       this.lastPitch = (this.pitch = (float)(Math.atan2(paramDouble2, f) * 180.0D / 3.141592741012573D));
/*  71:    */     }
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void onUpdate()
/*  75:    */   {
/*  76: 82 */     this.P = this.xPos;
/*  77: 83 */     this.Q = this.yPos;
/*  78: 84 */     this.R = this.zPos;
/*  79: 85 */     super.onUpdate();
/*  80:    */     
/*  81: 87 */     this.xPos += this.xVelocity;
/*  82: 88 */     this.yPos += this.yVelocity;
/*  83: 89 */     this.zPos += this.zVelocity;
/*  84:    */     
/*  85: 91 */     float f1 = MathUtils.a(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/*  86: 92 */     this.yaw = ((float)(Math.atan2(this.xVelocity, this.zVelocity) * 180.0D / 3.141592741012573D));
/*  87: 93 */     this.pitch = ((float)(Math.atan2(this.yVelocity, f1) * 180.0D / 3.141592741012573D));
/*  88: 95 */     while (this.pitch - this.lastPitch < -180.0F) {
/*  89: 96 */       this.lastPitch -= 360.0F;
/*  90:    */     }
/*  91: 98 */     while (this.pitch - this.lastPitch >= 180.0F) {
/*  92: 99 */       this.lastPitch += 360.0F;
/*  93:    */     }
/*  94:102 */     while (this.yaw - this.lastYaw < -180.0F) {
/*  95:103 */       this.lastYaw -= 360.0F;
/*  96:    */     }
/*  97:105 */     while (this.yaw - this.lastYaw >= 180.0F) {
/*  98:106 */       this.lastYaw += 360.0F;
/*  99:    */     }
/* 100:109 */     this.pitch = (this.lastPitch + (this.pitch - this.lastPitch) * 0.2F);
/* 101:110 */     this.yaw = (this.lastYaw + (this.yaw - this.lastYaw) * 0.2F);
/* 102:112 */     if (!this.world.isClient)
/* 103:    */     {
/* 104:113 */       double d1 = this.a - this.xPos;double d2 = this.c - this.zPos;
/* 105:114 */       float f3 = (float)Math.sqrt(d1 * d1 + d2 * d2);
/* 106:115 */       float f4 = (float)Math.atan2(d2, d1);
/* 107:116 */       double d3 = f1 + (f3 - f1) * 0.0025D;
/* 108:117 */       if (f3 < 1.0F)
/* 109:    */       {
/* 110:118 */         d3 *= 0.8D;
/* 111:119 */         this.yVelocity *= 0.8D;
/* 112:    */       }
/* 113:121 */       this.xVelocity = (Math.cos(f4) * d3);
/* 114:122 */       this.zVelocity = (Math.sin(f4) * d3);
/* 115:124 */       if (this.yPos < this.b) {
/* 116:125 */         this.yVelocity += (1.0D - this.yVelocity) * 0.01499999966472387D;
/* 117:    */       } else {
/* 118:127 */         this.yVelocity += (-1.0D - this.yVelocity) * 0.01499999966472387D;
/* 119:    */       }
/* 120:    */     }
/* 121:131 */     float f2 = 0.25F;
/* 122:132 */     if (V()) {
/* 123:133 */       for (int i = 0; i < 4; i++) {
/* 124:134 */         this.world.a(EnumParticleEffect.e, this.xPos - this.xVelocity * f2, this.yPos - this.yVelocity * f2, this.zPos - this.zVelocity * f2, this.xVelocity, this.yVelocity, this.zVelocity, new int[0]);
/* 125:    */       }
/* 126:    */     } else {
/* 127:137 */       this.world.a(EnumParticleEffect.y, this.xPos - this.xVelocity * f2 + this.rng.nextDouble() * 0.6D - 0.3D, this.yPos - this.yVelocity * f2 - 0.5D, this.zPos - this.zVelocity * f2 + this.rng.nextDouble() * 0.6D - 0.3D, this.xVelocity, this.yVelocity, this.zVelocity, new int[0]);
/* 128:    */     }
/* 129:140 */     if (!this.world.isClient)
/* 130:    */     {
/* 131:141 */       b(this.xPos, this.yPos, this.zPos);
/* 132:    */       
/* 133:143 */       this.d += 1;
/* 134:144 */       if ((this.d > 80) && (!this.world.isClient))
/* 135:    */       {
/* 136:145 */         setDead();
/* 137:146 */         if (this.e) {
/* 138:147 */           this.world.spawnEntity(new EntityItem(this.world, this.xPos, this.yPos, this.zPos, new ItemStack(ItemList.bH)));
/* 139:    */         } else {
/* 140:149 */           this.world.playLevelEvent(2003, new BlockPosition(this), 0);
/* 141:    */         }
/* 142:    */       }
/* 143:    */     }
/* 144:    */   }
/* 145:    */   
/* 146:    */   public void writeEntityToNBT(NBTTagCompound paramfn) {}
/* 147:    */   
/* 148:    */   public void readEntityFromNBT(NBTTagCompound paramfn) {}
/* 149:    */   
/* 150:    */   public float c(float paramFloat)
/* 151:    */   {
/* 152:165 */     return 1.0F;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public int b(float paramFloat)
/* 156:    */   {
/* 157:170 */     return 15728880;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public boolean aE()
/* 161:    */   {
/* 162:175 */     return false;
/* 163:    */   }
/* 164:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahk
 * JD-Core Version:    0.7.0.1
 */