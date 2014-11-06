package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class EntitySquid
/*   4:    */   extends EntityWaterMob
/*   5:    */ {
/*   6:    */   public float a;
/*   7:    */   public float b;
/*   8:    */   public float c;
/*   9:    */   public float bi;
/*  10:    */   public float bj;
/*  11:    */   public float bk;
/*  12:    */   public float bl;
/*  13:    */   public float bm;
/*  14:    */   private float bn;
/*  15:    */   private float bo;
/*  16:    */   private float bp;
/*  17:    */   private float bq;
/*  18:    */   private float br;
/*  19:    */   private float bs;
/*  20:    */   
/*  21:    */   public EntitySquid(World paramaqu)
/*  22:    */   {
/*  23: 29 */     super(paramaqu);
/*  24: 30 */     a(0.95F, 0.95F);
/*  25: 31 */     this.random.setSeed(1 + getID());
/*  26: 32 */     this.bo = (1.0F / (this.random.nextFloat() + 1.0F) * 0.2F);
/*  27:    */     
/*  28: 34 */     this.i.a(0, new acp(this));
/*  29:    */   }
/*  30:    */   
/*  31:    */   protected void aW()
/*  32:    */   {
/*  33: 39 */     super.aW();
/*  34:    */     
/*  35: 41 */     a(afs.a).a(10.0D);
/*  36:    */   }
/*  37:    */   
/*  38:    */   public float aR()
/*  39:    */   {
/*  40: 46 */     return this.K * 0.5F;
/*  41:    */   }
/*  42:    */   
/*  43:    */   protected String z()
/*  44:    */   {
/*  45: 51 */     return null;
/*  46:    */   }
/*  47:    */   
/*  48:    */   protected String bn()
/*  49:    */   {
/*  50: 56 */     return null;
/*  51:    */   }
/*  52:    */   
/*  53:    */   protected String bo()
/*  54:    */   {
/*  55: 61 */     return null;
/*  56:    */   }
/*  57:    */   
/*  58:    */   protected float bA()
/*  59:    */   {
/*  60: 66 */     return 0.4F;
/*  61:    */   }
/*  62:    */   
/*  63:    */   protected Item A()
/*  64:    */   {
/*  65: 71 */     return null;
/*  66:    */   }
/*  67:    */   
/*  68:    */   protected boolean r_()
/*  69:    */   {
/*  70: 76 */     return false;
/*  71:    */   }
/*  72:    */   
/*  73:    */   protected void b(boolean paramBoolean, int paramInt)
/*  74:    */   {
/*  75: 81 */     int i = this.random.nextInt(3 + paramInt) + 1;
/*  76: 82 */     for (int j = 0; j < i; j++) {
/*  77: 83 */       a(new ItemStack(ItemList.dye, 1, EnumDyeColor.BLACK.b()), 0.0F);
/*  78:    */     }
/*  79:    */   }
/*  80:    */   
/*  81:    */   public boolean V()
/*  82:    */   {
/*  83: 89 */     return this.world.a(getAABB().expand(0.0D, -0.6000000238418579D, 0.0D), Material.water, this);
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void m()
/*  87:    */   {
/*  88: 94 */     super.m();
/*  89:    */     
/*  90: 96 */     this.b = this.a;
/*  91: 97 */     this.bi = this.c;
/*  92:    */     
/*  93: 99 */     this.bk = this.bj;
/*  94:100 */     this.bm = this.bl;
/*  95:    */     
/*  96:102 */     this.bj += this.bo;
/*  97:103 */     if (this.bj > 6.283185307179586D) {
/*  98:104 */       if (this.world.isClient)
/*  99:    */       {
/* 100:105 */         this.bj = 6.283186F;
/* 101:    */       }
/* 102:    */       else
/* 103:    */       {
/* 104:107 */         this.bj = ((float)(this.bj - 6.283185307179586D));
/* 105:108 */         if (this.random.nextInt(10) == 0) {
/* 106:109 */           this.bo = (1.0F / (this.random.nextFloat() + 1.0F) * 0.2F);
/* 107:    */         }
/* 108:111 */         this.world.a(this, (byte)19);
/* 109:    */       }
/* 110:    */     }
/* 111:115 */     if (this.Y)
/* 112:    */     {
/* 113:116 */       if (this.bj < 3.141593F)
/* 114:    */       {
/* 115:117 */         float f = this.bj / 3.141593F;
/* 116:118 */         this.bl = (MathUtils.a(f * f * 3.141593F) * 3.141593F * 0.25F);
/* 117:120 */         if (f > 0.75D)
/* 118:    */         {
/* 119:121 */           this.bn = 1.0F;
/* 120:122 */           this.bp = 1.0F;
/* 121:    */         }
/* 122:    */         else
/* 123:    */         {
/* 124:124 */           this.bp *= 0.8F;
/* 125:    */         }
/* 126:    */       }
/* 127:    */       else
/* 128:    */       {
/* 129:127 */         this.bl = 0.0F;
/* 130:128 */         this.bn *= 0.9F;
/* 131:129 */         this.bp *= 0.99F;
/* 132:    */       }
/* 133:132 */       if (!this.world.isClient)
/* 134:    */       {
/* 135:133 */         this.xVelocity = (this.bq * this.bn);
/* 136:134 */         this.yVelocity = (this.br * this.bn);
/* 137:135 */         this.zVelocity = (this.bs * this.bn);
/* 138:    */       }
/* 139:138 */       float f = MathUtils.a(this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity);
/* 140:    */       
/* 141:140 */       this.aG += (-(float)Math.atan2(this.xVelocity, this.zVelocity) * 180.0F / 3.141593F - this.aG) * 0.1F;
/* 142:141 */       this.yaw = this.aG;
/* 143:142 */       this.c = ((float)(this.c + 3.141592653589793D * this.bp * 1.5D));
/* 144:143 */       this.a += (-(float)Math.atan2(f, this.yVelocity) * 180.0F / 3.141593F - this.a) * 0.1F;
/* 145:    */     }
/* 146:    */     else
/* 147:    */     {
/* 148:145 */       this.bl = (MathUtils.abs(MathUtils.sin(this.bj)) * 3.141593F * 0.25F);
/* 149:147 */       if (!this.world.isClient)
/* 150:    */       {
/* 151:149 */         this.xVelocity = 0.0D;
/* 152:150 */         this.yVelocity -= 0.08D;
/* 153:151 */         this.yVelocity *= 0.9800000190734863D;
/* 154:152 */         this.zVelocity = 0.0D;
/* 155:    */       }
/* 156:156 */       this.a = ((float)(this.a + (-90.0F - this.a) * 0.02D));
/* 157:    */     }
/* 158:    */   }
/* 159:    */   
/* 160:    */   public void g(float paramFloat1, float paramFloat2)
/* 161:    */   {
/* 162:162 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/* 163:    */   }
/* 164:    */   
/* 165:    */   public boolean canSpawn()
/* 166:    */   {
/* 167:167 */     return (this.yPos > 45.0D) && (this.yPos < 63.0D) && (super.canSpawn());
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void a(byte paramByte)
/* 171:    */   {
/* 172:172 */     if (paramByte == 19) {
/* 173:173 */       this.bj = 0.0F;
/* 174:    */     } else {
/* 175:175 */       super.a(paramByte);
/* 176:    */     }
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void b(float paramFloat1, float paramFloat2, float paramFloat3)
/* 180:    */   {
/* 181:180 */     this.bq = paramFloat1;
/* 182:181 */     this.br = paramFloat2;
/* 183:182 */     this.bs = paramFloat3;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public boolean n()
/* 187:    */   {
/* 188:186 */     return (this.bq != 0.0F) || (this.br != 0.0F) || (this.bs != 0.0F);
/* 189:    */   }
				static boolean a(EntitySquid arg0) {return arg0.Y;}
/* 190:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aco
 * JD-Core Version:    0.7.0.1
 */