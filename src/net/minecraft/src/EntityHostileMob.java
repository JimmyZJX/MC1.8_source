package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public abstract class EntityHostileMob
/*   4:    */   extends EntityWalkingMob
/*   5:    */   implements aex
/*   6:    */ {
/*   7: 20 */   protected final zb a = new yp(this, new afn(this), 4.0F, 1.0D, 2.0D);
/*   8:    */   
/*   9:    */   public EntityHostileMob(World paramaqu)
/*  10:    */   {
/*  11: 28 */     super(paramaqu);
/*  12: 29 */     this.b_ = 5;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void m()
/*  16:    */   {
/*  17: 34 */     bw();
/*  18: 35 */     float f = c(1.0F);
/*  19: 36 */     if (f > 0.5F) {
/*  20: 37 */       this.aO += 2;
/*  21:    */     }
/*  22: 39 */     super.m();
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void onUpdate()
/*  26:    */   {
/*  27: 44 */     super.onUpdate();
/*  28: 45 */     if ((!this.world.isClient) && (this.world.getDifficulty() == EnumDifficulty.PEACEFUL)) {
/*  29: 46 */       setDead();
/*  30:    */     }
/*  31:    */   }
/*  32:    */   
/*  33:    */   protected String P()
/*  34:    */   {
/*  35: 52 */     return "game.hostile.swim";
/*  36:    */   }
/*  37:    */   
/*  38:    */   protected String aa()
/*  39:    */   {
/*  40: 57 */     return "game.hostile.swim.splash";
/*  41:    */   }
/*  42:    */   
/*  43:    */   public boolean a(wh paramwh, float paramFloat)
/*  44:    */   {
/*  45: 62 */     if (b(paramwh)) {
/*  46: 63 */       return false;
/*  47:    */     }
/*  48: 65 */     if (super.a(paramwh, paramFloat))
/*  49:    */     {
/*  50: 66 */       Entity localwv = paramwh.j();
/*  51: 67 */       if ((this.rider == localwv) || (this.vehicle == localwv)) {
/*  52: 68 */         return true;
/*  53:    */       }
/*  54: 70 */       return true;
/*  55:    */     }
/*  56: 72 */     return false;
/*  57:    */   }
/*  58:    */   
/*  59:    */   protected String bn()
/*  60:    */   {
/*  61: 77 */     return "game.hostile.hurt";
/*  62:    */   }
/*  63:    */   
/*  64:    */   protected String bo()
/*  65:    */   {
/*  66: 82 */     return "game.hostile.die";
/*  67:    */   }
/*  68:    */   
/*  69:    */   protected String n(int paramInt)
/*  70:    */   {
/*  71: 87 */     if (paramInt > 4) {
/*  72: 88 */       return "game.hostile.hurt.fall.big";
/*  73:    */     }
/*  74: 90 */     return "game.hostile.hurt.fall.small";
/*  75:    */   }
/*  76:    */   
/*  77:    */   public boolean r(Entity paramwv)
/*  78:    */   {
/*  79:102 */     float f = (float)a(afs.e).e();
/*  80:103 */     int i = 0;
/*  81:105 */     if ((paramwv instanceof EntityLiving))
/*  82:    */     {
/*  83:106 */       f += aph.a(bz(), ((EntityLiving)paramwv).by());
/*  84:107 */       i += aph.a(this);
/*  85:    */     }
/*  86:110 */     boolean bool = paramwv.a(wh.a(this), f);
/*  87:112 */     if (bool)
/*  88:    */     {
/*  89:113 */       if (i > 0)
/*  90:    */       {
/*  91:114 */         paramwv.g(-MathUtils.sin(this.yaw * 3.141593F / 180.0F) * i * 0.5F, 0.1D, MathUtils.cos(this.yaw * 3.141593F / 180.0F) * i * 0.5F);
/*  92:115 */         this.xVelocity *= 0.6D;
/*  93:116 */         this.zVelocity *= 0.6D;
/*  94:    */       }
/*  95:119 */       int j = aph.b(this);
/*  96:120 */       if (j > 0) {
/*  97:121 */         paramwv.e(j * 4);
/*  98:    */       }
/*  99:124 */       a(this, paramwv);
/* 100:    */     }
/* 101:127 */     return bool;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public float a(BlockPosition paramdt)
/* 105:    */   {
/* 106:132 */     return 0.5F - this.world.o(paramdt);
/* 107:    */   }
/* 108:    */   
/* 109:    */   protected boolean spawnLightCheck()
/* 110:    */   {
/* 111:136 */     BlockPosition footPos = new BlockPosition(this.xPos, getAABB().minY, this.zPos);
/* 112:138 */     if (this.world.getLightLevel(EnumSkyBlock.SKY, footPos) > this.random.nextInt(32)) {
/* 113:139 */       return false;
/* 114:    */     }
/* 115:142 */     int i = this.world.l(footPos);
/* 116:144 */     if (this.world.R())
/* 117:    */     {
/* 118:145 */       int j = this.world.ab();
/* 119:146 */       this.world.b(10);
/* 120:147 */       i = this.world.l(footPos);
/* 121:148 */       this.world.b(j);
/* 122:    */     }
/* 123:150 */     return i <= this.random.nextInt(8);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean canSpawn()
/* 127:    */   {
/* 128:155 */     return (this.world.getDifficulty() != EnumDifficulty.PEACEFUL) && (spawnLightCheck()) && (super.canSpawn());
/* 129:    */   }
/* 130:    */   
/* 131:    */   protected void aW()
/* 132:    */   {
/* 133:160 */     super.aW();
/* 134:    */     
/* 135:162 */     bx().b(afs.e);
/* 136:    */   }
/* 137:    */   
/* 138:    */   protected boolean aZ()
/* 139:    */   {
/* 140:167 */     return true;
/* 141:    */   }
/* 142:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afm
 * JD-Core Version:    0.7.0.1
 */