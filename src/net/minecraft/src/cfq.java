package net.minecraft.src;
/*   1:    */ public class cfq
/*   2:    */   extends cgw
/*   3:    */ {
/*   4:    */   private Material a;
/*   5:    */   private int ax;
/*   6:    */   
/*   7:    */   protected cfq(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, Material parambof)
/*   8:    */   {
/*   9: 16 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3, 0.0D, 0.0D, 0.0D);
/*  10: 17 */     this.xVelocity = (this.yVelocity = this.zVelocity = 0.0D);
/*  11: 19 */     if (parambof == Material.water)
/*  12:    */     {
/*  13: 20 */       this.ap = 0.0F;
/*  14: 21 */       this.aq = 0.0F;
/*  15: 22 */       this.ar = 1.0F;
/*  16:    */     }
/*  17:    */     else
/*  18:    */     {
/*  19: 24 */       this.ap = 1.0F;
/*  20: 25 */       this.aq = 0.0F;
/*  21: 26 */       this.ar = 0.0F;
/*  22:    */     }
/*  23: 28 */     k(113);
/*  24: 29 */     a(0.01F, 0.01F);
/*  25: 30 */     this.i = 0.06F;
/*  26: 31 */     this.a = parambof;
/*  27: 32 */     this.ax = 40;
/*  28:    */     
/*  29: 34 */     this.g = ((int)(64.0D / (Math.random() * 0.8D + 0.2D)));
/*  30: 35 */     this.xVelocity = (this.yVelocity = this.zVelocity = 0.0D);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public int b(float paramFloat)
/*  34:    */   {
/*  35: 40 */     if (this.a == Material.water) {
/*  36: 41 */       return super.b(paramFloat);
/*  37:    */     }
/*  38: 43 */     return 257;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public float c(float paramFloat)
/*  42:    */   {
/*  43: 49 */     if (this.a == Material.water) {
/*  44: 50 */       return super.c(paramFloat);
/*  45:    */     }
/*  46: 52 */     return 1.0F;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void onUpdate()
/*  50:    */   {
/*  51: 58 */     this.lastX = this.xPos;
/*  52: 59 */     this.lastY = this.yPos;
/*  53: 60 */     this.lastZ = this.zPos;
/*  54: 62 */     if (this.a == Material.water)
/*  55:    */     {
/*  56: 63 */       this.ap = 0.2F;
/*  57: 64 */       this.aq = 0.3F;
/*  58: 65 */       this.ar = 1.0F;
/*  59:    */     }
/*  60:    */     else
/*  61:    */     {
/*  62: 67 */       this.ap = 1.0F;
/*  63: 68 */       this.aq = (16.0F / (40 - this.ax + 16));
/*  64: 69 */       this.ar = (4.0F / (40 - this.ax + 8));
/*  65:    */     }
/*  66: 72 */     this.yVelocity -= this.i;
/*  67: 73 */     if (this.ax-- > 0)
/*  68:    */     {
/*  69: 74 */       this.xVelocity *= 0.02D;
/*  70: 75 */       this.yVelocity *= 0.02D;
/*  71: 76 */       this.zVelocity *= 0.02D;
/*  72: 77 */       k(113);
/*  73:    */     }
/*  74:    */     else
/*  75:    */     {
/*  76: 79 */       k(112);
/*  77:    */     }
/*  78: 81 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/*  79: 82 */     this.xVelocity *= 0.9800000190734863D;
/*  80: 83 */     this.yVelocity *= 0.9800000190734863D;
/*  81: 84 */     this.zVelocity *= 0.9800000190734863D;
/*  82: 86 */     if (this.g-- <= 0) {
/*  83: 87 */       setDead();
/*  84:    */     }
/*  85: 90 */     if (this.C)
/*  86:    */     {
/*  87: 91 */       if (this.a == Material.water)
/*  88:    */       {
/*  89: 92 */         setDead();
/*  90: 93 */         this.world.a(EnumParticleEffect.f, this.xPos, this.yPos, this.zPos, 0.0D, 0.0D, 0.0D, new int[0]);
/*  91:    */       }
/*  92:    */       else
/*  93:    */       {
/*  94: 95 */         k(114);
/*  95:    */       }
/*  96: 97 */       this.xVelocity *= 0.699999988079071D;
/*  97: 98 */       this.zVelocity *= 0.699999988079071D;
/*  98:    */     }
/*  99:101 */     BlockPosition localdt = new BlockPosition(this);
/* 100:102 */     Block localbec = this.world.getBlock(localdt);
/* 101:103 */     Material localbof = localbec.getProto().getMaterial();
/* 102:104 */     if ((localbof.isLiquid()) || (localbof.a()))
/* 103:    */     {
/* 104:105 */       double d1 = 0.0D;
/* 105:106 */       if ((localbec.getProto() instanceof BlockLiquid)) {
/* 106:107 */         d1 = BlockLiquid.b(((Integer)localbec.getProperty(BlockLiquid.level)).intValue());
/* 107:    */       }
/* 108:109 */       double d2 = MathUtils.floor(this.yPos) + 1 - d1;
/* 109:110 */       if (this.yPos < d2) {
/* 110:111 */         setDead();
/* 111:    */       }
/* 112:    */     }
/* 113:    */   }
/* 114:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cfq
 * JD-Core Version:    0.7.0.1
 */