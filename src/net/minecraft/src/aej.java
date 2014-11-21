package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class aej
/*   4:    */   extends adx
/*   5:    */ {
/*   6: 20 */   private int a = -1;
/*   7:    */   
/*   8:    */   public aej(World paramaqu)
/*   9:    */   {
/*  10: 23 */     super(paramaqu);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public aej(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  14:    */   {
/*  15: 27 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public EnumMinecartVariant s()
/*  19:    */   {
/*  20: 32 */     return EnumMinecartVariant.d;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public Block u()
/*  24:    */   {
/*  25: 37 */     return BlockList.W.instance();
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void onUpdate()
/*  29:    */   {
/*  30: 42 */     super.onUpdate();
/*  31: 44 */     if (this.a > 0)
/*  32:    */     {
/*  33: 45 */       this.a -= 1;
/*  34: 46 */       this.world.a(EnumParticleEffect.l, this.xPos, this.yPos + 0.5D, this.zPos, 0.0D, 0.0D, 0.0D, new int[0]);
/*  35:    */     }
/*  36: 47 */     else if (this.a == 0)
/*  37:    */     {
/*  38: 48 */       b(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/*  39:    */     }
/*  40: 51 */     if (this.D)
/*  41:    */     {
/*  42: 52 */       double d = this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity;
/*  43: 54 */       if (d >= 0.009999999776482582D) {
/*  44: 55 */         b(d);
/*  45:    */       }
/*  46:    */     }
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean a(DamageSource paramwh, float paramFloat)
/*  50:    */   {
/*  51: 62 */     Entity localwv = paramwh.i();
/*  52: 63 */     if ((localwv instanceof ahj))
/*  53:    */     {
/*  54: 64 */       ahj localahj = (ahj)localwv;
/*  55: 65 */       if (localahj.au()) {
/*  56: 66 */         b(localahj.xVelocity * localahj.xVelocity + localahj.yVelocity * localahj.yVelocity + localahj.zVelocity * localahj.zVelocity);
/*  57:    */       }
/*  58:    */     }
/*  59: 69 */     return super.a(paramwh, paramFloat);
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void a(DamageSource paramwh)
/*  63:    */   {
/*  64: 74 */     super.a(paramwh);
/*  65:    */     
/*  66: 76 */     double d = this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity;
/*  67: 78 */     if (!paramwh.c()) {
/*  68: 79 */       throwItem(new ItemStack(BlockList.W, 1), 0.0F);
/*  69:    */     }
/*  70: 82 */     if ((paramwh.o()) || (paramwh.c()) || (d >= 0.009999999776482582D)) {
/*  71: 83 */       b(d);
/*  72:    */     }
/*  73:    */   }
/*  74:    */   
/*  75:    */   protected void b(double paramDouble)
/*  76:    */   {
/*  77: 88 */     if (!this.world.isClient)
/*  78:    */     {
/*  79: 89 */       double d = Math.sqrt(paramDouble);
/*  80: 90 */       if (d > 5.0D) {
/*  81: 91 */         d = 5.0D;
/*  82:    */       }
/*  83: 93 */       this.world.a(this, this.xPos, this.yPos, this.zPos, (float)(4.0D + this.rng.nextDouble() * 1.5D * d), true);
/*  84: 94 */       setDead();
/*  85:    */     }
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void e(float paramFloat1, float paramFloat2)
/*  89:    */   {
/*  90:100 */     if (paramFloat1 >= 3.0F)
/*  91:    */     {
/*  92:101 */       float f = paramFloat1 / 10.0F;
/*  93:102 */       b(f * f);
/*  94:    */     }
/*  95:105 */     super.e(paramFloat1, paramFloat2);
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*  99:    */   {
/* 100:110 */     if ((paramBoolean) && (this.a < 0)) {
/* 101:111 */       j();
/* 102:    */     }
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void onSignal(byte paramByte)
/* 106:    */   {
/* 107:117 */     if (paramByte == 10) {
/* 108:118 */       j();
/* 109:    */     } else {
/* 110:120 */       super.onSignal(paramByte);
/* 111:    */     }
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void j()
/* 115:    */   {
/* 116:125 */     this.a = 80;
/* 117:127 */     if (!this.world.isClient)
/* 118:    */     {
/* 119:128 */       this.world.sendSignal(this, (byte)10);
/* 120:129 */       if (!R()) {
/* 121:130 */         this.world.a(this, "game.tnt.primed", 1.0F, 1.0F);
/* 122:    */       }
/* 123:    */     }
/* 124:    */   }
/* 125:    */   
/* 126:    */   public int l()
/* 127:    */   {
/* 128:136 */     return this.a;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public boolean y()
/* 132:    */   {
/* 133:140 */     return this.a > -1;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public float a(aqo paramaqo, World paramaqu, BlockPosition paramdt, Block parambec)
/* 137:    */   {
/* 138:145 */     if ((y()) && ((ati.d(parambec)) || (ati.d(paramaqu, paramdt.up())))) {
/* 139:146 */       return 0.0F;
/* 140:    */     }
/* 141:149 */     return super.a(paramaqo, paramaqu, paramdt, parambec);
/* 142:    */   }
/* 143:    */   
/* 144:    */   public boolean a(aqo paramaqo, World paramaqu, BlockPosition paramdt, Block parambec, float paramFloat)
/* 145:    */   {
/* 146:154 */     if ((y()) && ((ati.d(parambec)) || (ati.d(paramaqu, paramdt.up())))) {
/* 147:155 */       return false;
/* 148:    */     }
/* 149:158 */     return super.a(paramaqo, paramaqu, paramdt, parambec, paramFloat);
/* 150:    */   }
/* 151:    */   
/* 152:    */   protected void readEntityFromNBT(NBTTagCompound paramfn)
/* 153:    */   {
/* 154:163 */     super.readEntityFromNBT(paramfn);
/* 155:164 */     if (paramfn.hasKey("TNTFuse", 99)) {
/* 156:165 */       this.a = paramfn.getInteger("TNTFuse");
/* 157:    */     }
/* 158:    */   }
/* 159:    */   
/* 160:    */   protected void writeEntityToNBT(NBTTagCompound paramfn)
/* 161:    */   {
/* 162:171 */     super.writeEntityToNBT(paramfn);
/* 163:172 */     paramfn.setInt("TNTFuse", this.a);
/* 164:    */   }
/* 165:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aej
 * JD-Core Version:    0.7.0.1
 */