package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class aee
/*   4:    */   extends adx
/*   5:    */ {
/*   6:    */   private int c;
/*   7:    */   public double a;
/*   8:    */   public double b;
/*   9:    */   
/*  10:    */   public aee(World paramaqu)
/*  11:    */   {
/*  12: 24 */     super(paramaqu);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public aee(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  16:    */   {
/*  17: 28 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public EnumMinecartVariant s()
/*  21:    */   {
/*  22: 33 */     return EnumMinecartVariant.c;
/*  23:    */   }
/*  24:    */   
/*  25:    */   protected void h()
/*  26:    */   {
/*  27: 38 */     super.h();
/*  28: 39 */     this.ac.a(16, new Byte((byte)0));
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void onUpdate()
/*  32:    */   {
/*  33: 44 */     super.onUpdate();
/*  34: 46 */     if (this.c > 0) {
/*  35: 47 */       this.c -= 1;
/*  36:    */     }
/*  37: 49 */     if (this.c <= 0) {
/*  38: 50 */       this.a = (this.b = 0.0D);
/*  39:    */     }
/*  40: 52 */     i(this.c > 0);
/*  41: 54 */     if ((j()) && (this.rng.nextInt(4) == 0)) {
/*  42: 55 */       this.world.a(EnumParticleEffect.m, this.xPos, this.yPos + 0.8D, this.zPos, 0.0D, 0.0D, 0.0D, new int[0]);
/*  43:    */     }
/*  44:    */   }
/*  45:    */   
/*  46:    */   protected double m()
/*  47:    */   {
/*  48: 61 */     return 0.2D;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(DamageSource paramwh)
/*  52:    */   {
/*  53: 66 */     super.a(paramwh);
/*  54: 68 */     if (!paramwh.c()) {
/*  55: 69 */       a(new ItemStack(BlockList.al, 1), 0.0F);
/*  56:    */     }
/*  57:    */   }
/*  58:    */   
/*  59:    */   protected void a(BlockPosition paramdt, Block parambec)
/*  60:    */   {
/*  61: 75 */     super.a(paramdt, parambec);
/*  62:    */     
/*  63: 77 */     double d1 = this.a * this.a + this.b * this.b;
/*  64: 78 */     if ((d1 > 0.0001D) && (this.xVelocity * this.xVelocity + this.zVelocity * this.zVelocity > 0.001D))
/*  65:    */     {
/*  66: 79 */       d1 = MathUtils.a(d1);
/*  67: 80 */       this.a /= d1;
/*  68: 81 */       this.b /= d1;
/*  69: 83 */       if (this.a * this.xVelocity + this.b * this.zVelocity < 0.0D)
/*  70:    */       {
/*  71: 84 */         this.a = 0.0D;
/*  72: 85 */         this.b = 0.0D;
/*  73:    */       }
/*  74:    */       else
/*  75:    */       {
/*  76: 87 */         double d2 = d1 / m();
/*  77: 88 */         this.a *= d2;
/*  78: 89 */         this.b *= d2;
/*  79:    */       }
/*  80:    */     }
/*  81:    */   }
/*  82:    */   
/*  83:    */   protected void o()
/*  84:    */   {
/*  85: 96 */     double d1 = this.a * this.a + this.b * this.b;
/*  86: 98 */     if (d1 > 0.0001D)
/*  87:    */     {
/*  88: 99 */       d1 = MathUtils.a(d1);
/*  89:100 */       this.a /= d1;
/*  90:101 */       this.b /= d1;
/*  91:102 */       double d2 = 1.0D;
/*  92:103 */       this.xVelocity *= 0.800000011920929D;
/*  93:104 */       this.yVelocity *= 0.0D;
/*  94:105 */       this.zVelocity *= 0.800000011920929D;
/*  95:106 */       this.xVelocity += this.a * d2;
/*  96:107 */       this.zVelocity += this.b * d2;
/*  97:    */     }
/*  98:    */     else
/*  99:    */     {
/* 100:109 */       this.xVelocity *= 0.9800000190734863D;
/* 101:110 */       this.yVelocity *= 0.0D;
/* 102:111 */       this.zVelocity *= 0.9800000190734863D;
/* 103:    */     }
/* 104:114 */     super.o();
/* 105:    */   }
/* 106:    */   
/* 107:    */   public boolean e(EntityPlayer paramahd)
/* 108:    */   {
/* 109:119 */     ItemStack localamj = paramahd.bg.h();
/* 110:120 */     if ((localamj != null) && (localamj.getItem() == ItemList.h))
/* 111:    */     {
/* 112:121 */       if (!paramahd.by.d) {
/* 113:121 */         if (--localamj.stackSize == 0) {
/* 114:122 */           paramahd.bg.a(paramahd.bg.c, null);
/* 115:    */         }
/* 116:    */       }
/* 117:124 */       this.c += 3600;
/* 118:    */     }
/* 119:126 */     this.a = (this.xPos - paramahd.xPos);
/* 120:127 */     this.b = (this.zPos - paramahd.zPos);
/* 121:    */     
/* 122:129 */     return true;
/* 123:    */   }
/* 124:    */   
/* 125:    */   protected void writeEntityToNBT(NBTTagCompound paramfn)
/* 126:    */   {
/* 127:134 */     super.writeEntityToNBT(paramfn);
/* 128:135 */     paramfn.setDouble("PushX", this.a);
/* 129:136 */     paramfn.setDouble("PushZ", this.b);
/* 130:137 */     paramfn.setShort("Fuel", (short)this.c);
/* 131:    */   }
/* 132:    */   
/* 133:    */   protected void readEntityFromNBT(NBTTagCompound paramfn)
/* 134:    */   {
/* 135:142 */     super.readEntityFromNBT(paramfn);
/* 136:143 */     this.a = paramfn.i("PushX");
/* 137:144 */     this.b = paramfn.i("PushZ");
/* 138:145 */     this.c = paramfn.e("Fuel");
/* 139:    */   }
/* 140:    */   
/* 141:    */   protected boolean j()
/* 142:    */   {
/* 143:149 */     return (this.ac.a(16) & 0x1) != 0;
/* 144:    */   }
/* 145:    */   
/* 146:    */   protected void i(boolean paramBoolean)
/* 147:    */   {
/* 148:153 */     if (paramBoolean) {
/* 149:154 */       this.ac.b(16, Byte.valueOf((byte)(this.ac.a(16) | 0x1)));
/* 150:    */     } else {
/* 151:156 */       this.ac.b(16, Byte.valueOf((byte)(this.ac.a(16) & 0xFFFFFFFE)));
/* 152:    */     }
/* 153:    */   }
/* 154:    */   
/* 155:    */   public Block u()
/* 156:    */   {
/* 157:162 */     return (j() ? BlockList.am : BlockList.al).instance().a(awj.a, EnumDirection.NORTH);
/* 158:    */   }
/* 159:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aee
 * JD-Core Version:    0.7.0.1
 */