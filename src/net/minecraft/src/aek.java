package net.minecraft.src;
/*   1:    */ public class aek
/*   2:    */   extends Entity
/*   3:    */ {
/*   4:    */   public int a;
/*   5:    */   private EntityLiving b;
/*   6:    */   
/*   7:    */   public aek(World paramaqu)
/*   8:    */   {
/*   9: 17 */     super(paramaqu);
/*  10: 18 */     this.k = true;
/*  11: 19 */     a(0.98F, 0.98F);
/*  12:    */   }
/*  13:    */   
/*  14:    */   public aek(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, EntityLiving paramxm)
/*  15:    */   {
/*  16: 23 */     this(paramaqu);
/*  17:    */     
/*  18: 25 */     setPos(paramDouble1, paramDouble2, paramDouble3);
/*  19:    */     
/*  20: 27 */     float f = (float)(Math.random() * 3.141592741012573D * 2.0D);
/*  21: 28 */     this.xVelocity = (-(float)Math.sin(f) * 0.02F);
/*  22: 29 */     this.yVelocity = 0.2000000029802322D;
/*  23: 30 */     this.zVelocity = (-(float)Math.cos(f) * 0.02F);
/*  24:    */     
/*  25: 32 */     this.a = 80;
/*  26:    */     
/*  27: 34 */     this.lastX = paramDouble1;
/*  28: 35 */     this.lastY = paramDouble2;
/*  29: 36 */     this.lastZ = paramDouble3;
/*  30: 37 */     this.b = paramxm;
/*  31:    */   }
/*  32:    */   
/*  33:    */   protected void h() {}
/*  34:    */   
/*  35:    */   protected boolean r_()
/*  36:    */   {
/*  37: 46 */     return false;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public boolean ad()
/*  41:    */   {
/*  42: 51 */     return !this.isDead;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void onUpdate()
/*  46:    */   {
/*  47: 56 */     this.lastX = this.xPos;
/*  48: 57 */     this.lastY = this.yPos;
/*  49: 58 */     this.lastZ = this.zPos;
/*  50:    */     
/*  51: 60 */     this.yVelocity -= 0.03999999910593033D;
/*  52: 61 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/*  53: 62 */     this.xVelocity *= 0.9800000190734863D;
/*  54: 63 */     this.yVelocity *= 0.9800000190734863D;
/*  55: 64 */     this.zVelocity *= 0.9800000190734863D;
/*  56: 66 */     if (this.C)
/*  57:    */     {
/*  58: 67 */       this.xVelocity *= 0.699999988079071D;
/*  59: 68 */       this.zVelocity *= 0.699999988079071D;
/*  60: 69 */       this.yVelocity *= -0.5D;
/*  61:    */     }
/*  62: 72 */     if (this.a-- <= 0)
/*  63:    */     {
/*  64: 73 */       setDead();
/*  65: 74 */       if (!this.world.isClient) {
/*  66: 75 */         l();
/*  67:    */       }
/*  68:    */     }
/*  69:    */     else
/*  70:    */     {
/*  71: 78 */       W();
/*  72: 79 */       this.world.a(EnumParticleEffect.l, this.xPos, this.yPos + 0.5D, this.zPos, 0.0D, 0.0D, 0.0D, new int[0]);
/*  73:    */     }
/*  74:    */   }
/*  75:    */   
/*  76:    */   private void l()
/*  77:    */   {
/*  78: 84 */     float f = 4.0F;
/*  79: 85 */     this.world.a(this, this.xPos, this.yPos + this.height / 2.0F, this.zPos, f, true);
/*  80:    */   }
/*  81:    */   
/*  82:    */   protected void writeEntityToNBT(NBTTagCompound paramfn)
/*  83:    */   {
/*  84: 90 */     paramfn.setByte("Fuse", (byte)this.a);
/*  85:    */   }
/*  86:    */   
/*  87:    */   protected void readEntityFromNBT(NBTTagCompound paramfn)
/*  88:    */   {
/*  89: 95 */     this.a = paramfn.d("Fuse");
/*  90:    */   }
/*  91:    */   
/*  92:    */   public EntityLiving j()
/*  93:    */   {
/*  94: 99 */     return this.b;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public float getEyeHeight()
/*  98:    */   {
/*  99:104 */     return 0.0F;
/* 100:    */   }
/* 101:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aek
 * JD-Core Version:    0.7.0.1
 */