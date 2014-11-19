package net.minecraft.src;
/*   1:    */ import java.util.UUID;
/*   2:    */ 
/*   3:    */ public abstract class EntityWalkingMob
/*   4:    */   extends EntityMob
/*   5:    */ {
/*   6: 13 */   public static final UUID bi = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
/*   7: 14 */   public static final ya bj = new ya(bi, "Fleeing speed bonus", 2.0D, 2).a(false);
/*   8:    */   
/*   9:    */   public EntityWalkingMob(World paramaqu)
/*  10:    */   {
/*  11: 17 */     super(paramaqu);
/*  12:    */     
/*  13: 19 */     this.c = new zo(this, 1.0D);
/*  14:    */   }
/*  15:    */   
/*  16: 22 */   private BlockPosition a = BlockPosition.zero;
/*  17: 23 */   private float b = -1.0F;
/*  18:    */   private zb c;
/*  19:    */   private boolean bk;
/*  20:    */   
/*  21:    */   public float a(BlockPosition paramdt)
/*  22:    */   {
/*  23: 28 */     return 0.0F;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public boolean canSpawn()
/*  27:    */   {
/*  28: 33 */     return (super.canSpawn()) && (a(new BlockPosition(this.xPos, getAABB().minY, this.zPos)) >= 0.0F);
/*  29:    */   }
/*  30:    */   
/*  31:    */   public boolean cd()
/*  32:    */   {
/*  33: 37 */     return !this.h.m();
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean ce()
/*  37:    */   {
/*  38: 42 */     return d(new BlockPosition(this));
/*  39:    */   }
/*  40:    */   
/*  41:    */   public boolean d(BlockPosition paramdt)
/*  42:    */   {
/*  43: 46 */     if (this.b == -1.0F) {
/*  44: 47 */       return true;
/*  45:    */     }
/*  46: 49 */     return this.a.i(paramdt) < this.b * this.b;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void a(BlockPosition paramdt, int paramInt)
/*  50:    */   {
/*  51: 53 */     this.a = paramdt;
/*  52: 54 */     this.b = paramInt;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public BlockPosition cf()
/*  56:    */   {
/*  57: 58 */     return this.a;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public float cg()
/*  61:    */   {
/*  62: 62 */     return this.b;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void ch()
/*  66:    */   {
/*  67: 66 */     this.b = -1.0F;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public boolean ci()
/*  71:    */   {
/*  72: 70 */     return this.b != -1.0F;
/*  73:    */   }
/*  74:    */   
/*  75:    */   protected void bZ()
/*  76:    */   {
/*  77: 75 */     super.bZ();
/*  78: 77 */     if ((cb()) && (cc() != null) && (cc().world == this.world))
/*  79:    */     {
/*  80: 79 */       Entity localwv = cc();
/*  81: 80 */       a(new BlockPosition((int)localwv.xPos, (int)localwv.yPos, (int)localwv.zPos), 5);
/*  82:    */       
/*  83: 82 */       float f = g(localwv);
/*  84: 84 */       if (((this instanceof EntityPet)) && (((EntityPet)this).cl()))
/*  85:    */       {
/*  86: 85 */         if (f > 10.0F) {
/*  87: 86 */           a(true, true);
/*  88:    */         }
/*  89: 88 */         return;
/*  90:    */       }
/*  91: 91 */       if (!this.bk)
/*  92:    */       {
/*  93: 92 */         this.i.a(2, this.c);
/*  94: 93 */         if ((s() instanceof aay)) {
/*  95: 94 */           ((aay)s()).a(false);
/*  96:    */         }
/*  97: 96 */         this.bk = true;
/*  98:    */       }
/*  99: 99 */       n(f);
/* 100:101 */       if (f > 4.0F) {
/* 101:103 */         s().a(localwv, 1.0D);
/* 102:    */       }
/* 103:105 */       if (f > 6.0F)
/* 104:    */       {
/* 105:107 */         double d1 = (localwv.xPos - this.xPos) / f;
/* 106:108 */         double d2 = (localwv.yPos - this.yPos) / f;
/* 107:109 */         double d3 = (localwv.zPos - this.zPos) / f;
/* 108:    */         
/* 109:111 */         this.xVelocity += d1 * Math.abs(d1) * 0.4D;
/* 110:112 */         this.yVelocity += d2 * Math.abs(d2) * 0.4D;
/* 111:113 */         this.zVelocity += d3 * Math.abs(d3) * 0.4D;
/* 112:    */       }
/* 113:115 */       if (f > 10.0F) {
/* 114:116 */         a(true, true);
/* 115:    */       }
/* 116:    */     }
/* 117:118 */     else if ((!cb()) && (this.bk))
/* 118:    */     {
/* 119:119 */       this.bk = false;
/* 120:120 */       this.i.a(this.c);
/* 121:121 */       if ((s() instanceof aay)) {
/* 122:122 */         ((aay)s()).a(true);
/* 123:    */       }
/* 124:124 */       ch();
/* 125:    */     }
/* 126:    */   }
/* 127:    */   
/* 128:    */   protected void n(float paramFloat) {}
/* 129:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     xu
 * JD-Core Version:    0.7.0.1
 */