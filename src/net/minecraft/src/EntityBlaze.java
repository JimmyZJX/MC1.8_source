package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class EntityBlaze
/*   4:    */   extends EntityHostileMob
/*   5:    */ {
/*   6: 21 */   private float b = 0.5F;
/*   7:    */   private int c;
/*   8:    */   
/*   9:    */   public EntityBlaze(World paramaqu)
/*  10:    */   {
/*  11: 27 */     super(paramaqu);
/*  12:    */     
/*  13: 29 */     this.ab = true;
/*  14: 30 */     this.b_ = 10;
/*  15:    */     
/*  16: 32 */     this.goalSelector.addGoal(4, new aen(this));
/*  17: 33 */     this.goalSelector.addGoal(5, new zo(this, 1.0D));
/*  18: 34 */     this.goalSelector.addGoal(7, new zy(this, 1.0D));
/*  19: 35 */     this.goalSelector.addGoal(8, new zh(this, EntityPlayer.class, 8.0F));
/*  20: 36 */     this.goalSelector.addGoal(8, new zx(this));
/*  21:    */     
/*  22: 38 */     this.targetSelector.addGoal(1, new aal(this, true, new Class[0]));
/*  23: 39 */     this.targetSelector.addGoal(2, new aaq(this, EntityPlayer.class, true));
/*  24:    */   }
/*  25:    */   
/*  26:    */   protected void aW()
/*  27:    */   {
/*  28: 44 */     super.aW();
/*  29: 45 */     a(afs.e).a(6.0D);
/*  30: 46 */     a(afs.d).a(0.2300000041723251D);
/*  31: 47 */     a(afs.b).a(48.0D);
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected void h()
/*  35:    */   {
/*  36: 52 */     super.h();
/*  37:    */     
/*  38: 54 */     this.ac.a(16, new Byte((byte)0));
/*  39:    */   }
/*  40:    */   
/*  41:    */   protected String z()
/*  42:    */   {
/*  43: 59 */     return "mob.blaze.breathe";
/*  44:    */   }
/*  45:    */   
/*  46:    */   protected String bn()
/*  47:    */   {
/*  48: 64 */     return "mob.blaze.hit";
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected String bo()
/*  52:    */   {
/*  53: 69 */     return "mob.blaze.death";
/*  54:    */   }
/*  55:    */   
/*  56:    */   public int b(float paramFloat)
/*  57:    */   {
/*  58: 74 */     return 15728880;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public float c(float paramFloat)
/*  62:    */   {
/*  63: 79 */     return 1.0F;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void m()
/*  67:    */   {
/*  68: 85 */     if ((!this.C) && (this.yVelocity < 0.0D)) {
/*  69: 86 */       this.yVelocity *= 0.6D;
/*  70:    */     }
/*  71: 89 */     if (this.world.isClient)
/*  72:    */     {
/*  73: 90 */       if ((this.rng.nextInt(24) == 0) && (!R())) {
/*  74: 91 */         this.world.a(this.xPos + 0.5D, this.yPos + 0.5D, this.zPos + 0.5D, "fire.fire", 1.0F + this.rng.nextFloat(), this.rng.nextFloat() * 0.7F + 0.3F, false);
/*  75:    */       }
/*  76: 93 */       for (int i = 0; i < 2; i++) {
/*  77: 94 */         this.world.a(EnumParticleEffect.m, this.xPos + (this.rng.nextDouble() - 0.5D) * this.width, this.yPos + this.rng.nextDouble() * this.height, this.zPos + (this.rng.nextDouble() - 0.5D) * this.width, 0.0D, 0.0D, 0.0D, new int[0]);
/*  78:    */       }
/*  79:    */     }
/*  80: 98 */     super.m();
/*  81:    */   }
/*  82:    */   
/*  83:    */   protected void mobTick()
/*  84:    */   {
/*  85:103 */     if (U()) {
/*  86:104 */       a(DamageSource.f, 1.0F);
/*  87:    */     }
/*  88:107 */     this.c -= 1;
/*  89:108 */     if (this.c <= 0)
/*  90:    */     {
/*  91:109 */       this.c = 100;
/*  92:110 */       this.b = (0.5F + (float)this.rng.nextGaussian() * 3.0F);
/*  93:    */     }
/*  94:113 */     EntityLiving localxm = u();
/*  95:114 */     if ((localxm != null) && (localxm.yPos + localxm.getEyeHeight() > this.yPos + getEyeHeight() + this.b))
/*  96:    */     {
/*  97:115 */       this.yVelocity += (0.300000011920929D - this.yVelocity) * 0.300000011920929D;
/*  98:116 */       this.ai = true;
/*  99:    */     }
/* 100:119 */     super.mobTick();
/* 101:    */   }
/* 102:    */   
/* 103:    */   public void e(float paramFloat1, float paramFloat2) {}
/* 104:    */   
/* 105:    */   protected Item A()
/* 106:    */   {
/* 107:128 */     return ItemList.bv;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public boolean au()
/* 111:    */   {
/* 112:133 */     return n();
/* 113:    */   }
/* 114:    */   
/* 115:    */   protected void b(boolean paramBoolean, int paramInt)
/* 116:    */   {
/* 117:138 */     if (paramBoolean)
/* 118:    */     {
/* 119:139 */       int i = this.rng.nextInt(2 + paramInt);
/* 120:140 */       for (int j = 0; j < i; j++) {
/* 121:141 */         a(ItemList.bv, 1);
/* 122:    */       }
/* 123:    */     }
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean n()
/* 127:    */   {
/* 128:147 */     return (this.ac.a(16) & 0x1) != 0;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void a(boolean paramBoolean)
/* 132:    */   {
/* 133:151 */     byte b1 = this.ac.a(16);
/* 134:152 */     if (paramBoolean) {
/* 135:153 */       b1 = (byte)(b1 | 0x1);
/* 136:    */     } else {
/* 137:155 */       b1 = (byte)(b1 & 0xFFFFFFFE);
/* 138:    */     }
/* 139:157 */     this.ac.b(16, Byte.valueOf(b1));
/* 140:    */   }
/* 141:    */   
/* 142:    */   protected boolean spawnLightCheck()
/* 143:    */   {
/* 144:162 */     return true;
/* 145:    */   }
/* 146:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aem
 * JD-Core Version:    0.7.0.1
 */