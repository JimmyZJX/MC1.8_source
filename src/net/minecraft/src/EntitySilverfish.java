package net.minecraft.src;
/*   1:    */ public class EntitySilverfish
/*   2:    */   extends EntityHostileMob
/*   3:    */ {
/*   4:    */   private afv b;
/*   5:    */   
/*   6:    */   public EntitySilverfish(World paramaqu)
/*   7:    */   {
/*   8: 31 */     super(paramaqu);
/*   9: 32 */     a(0.4F, 0.3F);
/*  10:    */     
/*  11: 34 */     this.i.a(1, new yy(this));
/*  12:    */     
/*  13: 36 */     this.i.a(3, this.b = new afv(this));
/*  14:    */     
/*  15: 38 */     this.i.a(4, new zk(this, EntityPlayer.class, 1.0D, false));
/*  16: 39 */     this.i.a(5, new afu(this));
/*  17:    */     
/*  18: 41 */     this.bg.a(1, new aal(this, true, new Class[0]));
/*  19: 42 */     this.bg.a(2, new aaq(this, EntityPlayer.class, true));
/*  20:    */   }
/*  21:    */   
/*  22:    */   public float aR()
/*  23:    */   {
/*  24: 47 */     return 0.1F;
/*  25:    */   }
/*  26:    */   
/*  27:    */   protected void aW()
/*  28:    */   {
/*  29: 52 */     super.aW();
/*  30:    */     
/*  31: 54 */     a(afs.a).a(8.0D);
/*  32: 55 */     a(afs.d).a(0.25D);
/*  33: 56 */     a(afs.e).a(1.0D);
/*  34:    */   }
/*  35:    */   
/*  36:    */   protected boolean r_()
/*  37:    */   {
/*  38: 61 */     return false;
/*  39:    */   }
/*  40:    */   
/*  41:    */   protected String z()
/*  42:    */   {
/*  43: 66 */     return "mob.silverfish.say";
/*  44:    */   }
/*  45:    */   
/*  46:    */   protected String bn()
/*  47:    */   {
/*  48: 71 */     return "mob.silverfish.hit";
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected String bo()
/*  52:    */   {
/*  53: 76 */     return "mob.silverfish.kill";
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean a(DamageSource paramwh, float paramFloat)
/*  57:    */   {
/*  58: 81 */     if (b(paramwh)) {
/*  59: 82 */       return false;
/*  60:    */     }
/*  61: 84 */     if (((paramwh instanceof wi)) || (paramwh == DamageSource.l)) {
/*  62: 85 */       this.b.f();
/*  63:    */     }
/*  64: 87 */     return super.a(paramwh, paramFloat);
/*  65:    */   }
/*  66:    */   
/*  67:    */   protected void a(BlockPosition paramdt, ProtoBlock paramatr)
/*  68:    */   {
/*  69: 92 */     a("mob.silverfish.step", 0.15F, 1.0F);
/*  70:    */   }
/*  71:    */   
/*  72:    */   protected Item A()
/*  73:    */   {
/*  74: 97 */     return null;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void onUpdate()
/*  78:    */   {
/*  79:103 */     this.aG = this.yaw;
/*  80:    */     
/*  81:105 */     super.onUpdate();
/*  82:    */   }
/*  83:    */   
/*  84:    */   public float a(BlockPosition paramdt)
/*  85:    */   {
/*  86:111 */     if (this.world.getBlock(paramdt.down()).getProto() == BlockList.stone) {
/*  87:112 */       return 10.0F;
/*  88:    */     }
/*  89:114 */     return super.a(paramdt);
/*  90:    */   }
/*  91:    */   
/*  92:    */   protected boolean spawnLightCheck()
/*  93:    */   {
/*  94:119 */     return true;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public boolean canSpawn()
/*  98:    */   {
/*  99:124 */     if (super.canSpawn())
/* 100:    */     {
/* 101:125 */       EntityPlayer localahd = this.world.a(this, 5.0D);
/* 102:126 */       return localahd == null;
/* 103:    */     }
/* 104:128 */     return false;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public xs by()
/* 108:    */   {
/* 109:133 */     return xs.c;
/* 110:    */   }
/* 111:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aft
 * JD-Core Version:    0.7.0.1
 */