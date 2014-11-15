package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class EntityGhast
/*   4:    */   extends xl
/*   5:    */   implements aex
/*   6:    */ {
/*   7: 31 */   private int a = 1;
/*   8:    */   
/*   9:    */   public EntityGhast(World paramaqu)
/*  10:    */   {
/*  11: 34 */     super(paramaqu);
/*  12: 35 */     a(4.0F, 4.0F);
/*  13: 36 */     this.ab = true;
/*  14: 37 */     this.b_ = 5;
/*  15:    */     
/*  16: 39 */     this.f = new afc(this);
/*  17:    */     
/*  18: 41 */     this.i.a(5, new afe(this));
/*  19:    */     
/*  20: 43 */     this.i.a(7, new afb(this));
/*  21: 44 */     this.i.a(7, new afd(this));
/*  22:    */     
/*  23: 46 */     this.bg.a(1, new aao(this));
/*  24:    */   }
/*  25:    */   
/*  26:    */   public boolean n()
/*  27:    */   {
/*  28: 50 */     return this.ac.a(16) != 0;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void a(boolean paramBoolean)
/*  32:    */   {
/*  33: 54 */     this.ac.b(16, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/*  34:    */   }
/*  35:    */   
/*  36:    */   public int cd()
/*  37:    */   {
/*  38: 58 */     return this.a;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void onUpdate()
/*  42:    */   {
/*  43: 63 */     super.onUpdate();
/*  44: 65 */     if ((!this.world.isClient) && (this.world.getDifficulty() == EnumDifficulty.PEACEFUL)) {
/*  45: 66 */       setDead();
/*  46:    */     }
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean a(DamageSource paramwh, float paramFloat)
/*  50:    */   {
/*  51: 72 */     if (b(paramwh)) {
/*  52: 73 */       return false;
/*  53:    */     }
/*  54: 75 */     if (("fireball".equals(paramwh.p())) && 
/*  55: 76 */       ((paramwh.j() instanceof EntityPlayer)))
/*  56:    */     {
/*  57: 78 */       super.a(paramwh, 1000.0F);
/*  58: 79 */       ((EntityPlayer)paramwh.j()).b(AchievementList.z);
/*  59: 80 */       return true;
/*  60:    */     }
/*  61: 84 */     return super.a(paramwh, paramFloat);
/*  62:    */   }
/*  63:    */   
/*  64:    */   protected void h()
/*  65:    */   {
/*  66: 89 */     super.h();
/*  67:    */     
/*  68: 91 */     this.ac.a(16, Byte.valueOf((byte)0));
/*  69:    */   }
/*  70:    */   
/*  71:    */   protected void aW()
/*  72:    */   {
/*  73: 96 */     super.aW();
/*  74:    */     
/*  75: 98 */     a(afs.a).a(10.0D);
/*  76: 99 */     a(afs.b).a(100.0D);
/*  77:    */   }
/*  78:    */   
/*  79:    */   protected String z()
/*  80:    */   {
/*  81:104 */     return "mob.ghast.moan";
/*  82:    */   }
/*  83:    */   
/*  84:    */   protected String bn()
/*  85:    */   {
/*  86:109 */     return "mob.ghast.scream";
/*  87:    */   }
/*  88:    */   
/*  89:    */   protected String bo()
/*  90:    */   {
/*  91:114 */     return "mob.ghast.death";
/*  92:    */   }
/*  93:    */   
/*  94:    */   protected Item A()
/*  95:    */   {
/*  96:119 */     return ItemList.H;
/*  97:    */   }
/*  98:    */   
/*  99:    */   protected void b(boolean paramBoolean, int paramInt)
/* 100:    */   {
/* 101:124 */     int i = this.random.nextInt(2) + this.random.nextInt(1 + paramInt);
/* 102:125 */     for (int j = 0; j < i; j++) {
/* 103:126 */       a(ItemList.bw, 1);
/* 104:    */     }
/* 105:128 */     i = this.random.nextInt(3) + this.random.nextInt(1 + paramInt);
/* 106:129 */     for (j = 0; j < i; j++) {
/* 107:130 */       a(ItemList.H, 1);
/* 108:    */     }
/* 109:    */   }
/* 110:    */   
/* 111:    */   protected float bA()
/* 112:    */   {
/* 113:136 */     return 10.0F;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public boolean canSpawn()
/* 117:    */   {
/* 118:141 */     return (this.random.nextInt(20) == 0) && (super.canSpawn()) && (this.world.getDifficulty() != EnumDifficulty.PEACEFUL);
/* 119:    */   }
/* 120:    */   
/* 121:    */   public int getMaxSpawnedInChunk()
/* 122:    */   {
/* 123:146 */     return 1;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 127:    */   {
/* 128:151 */     super.writeEntityToNBT(paramfn);
/* 129:152 */     paramfn.setInt("ExplosionPower", this.a);
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 133:    */   {
/* 134:157 */     super.readEntityFromNBT(paramfn);
/* 135:158 */     if (paramfn.hasKey("ExplosionPower", 99)) {
/* 136:159 */       this.a = paramfn.getInteger("ExplosionPower");
/* 137:    */     }
/* 138:    */   }
/* 139:    */   
/* 140:    */   public float aR()
/* 141:    */   {
/* 142:353 */     return 2.6F;
/* 143:    */   }
/* 144:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     afa
 * JD-Core Version:    0.7.0.1
 */