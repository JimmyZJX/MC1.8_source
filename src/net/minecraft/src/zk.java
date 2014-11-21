package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class zk
/*   4:    */   extends zb
/*   5:    */ {
/*   6:    */   World a;
/*   7:    */   protected EntityWalkingMob b;
/*   8:    */   int c;
/*   9:    */   double d;
/*  10:    */   boolean e;
/*  11:    */   bpv f;
/*  12:    */   Class<? extends EntityLiving> g;
/*  13:    */   private int h;
/*  14:    */   private double i;
/*  15:    */   private double j;
/*  16:    */   private double k;
/*  17:    */   
/*  18:    */   public zk(EntityWalkingMob paramxu, Class<? extends EntityLiving> paramClass, double paramDouble, boolean paramBoolean)
/*  19:    */   {
/*  20: 25 */     this(paramxu, paramDouble, paramBoolean);
/*  21: 26 */     this.g = paramClass;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public zk(EntityWalkingMob paramxu, double paramDouble, boolean paramBoolean)
/*  25:    */   {
/*  26: 30 */     this.b = paramxu;
/*  27: 31 */     this.a = paramxu.world;
/*  28: 32 */     this.d = paramDouble;
/*  29: 33 */     this.e = paramBoolean;
/*  30: 34 */     a(3);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public boolean a()
/*  34:    */   {
/*  35: 39 */     EntityLiving localxm = this.b.u();
/*  36: 40 */     if (localxm == null) {
/*  37: 41 */       return false;
/*  38:    */     }
/*  39: 43 */     if (!localxm.ai()) {
/*  40: 44 */       return false;
/*  41:    */     }
/*  42: 46 */     if ((this.g != null) && (!this.g.isAssignableFrom(localxm.getClass()))) {
/*  43: 47 */       return false;
/*  44:    */     }
/*  45: 49 */     this.f = this.b.s().a(localxm);
/*  46: 50 */     return this.f != null;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean b()
/*  50:    */   {
/*  51: 55 */     EntityLiving localxm = this.b.u();
/*  52: 56 */     if (localxm == null) {
/*  53: 57 */       return false;
/*  54:    */     }
/*  55: 59 */     if (!localxm.ai()) {
/*  56: 60 */       return false;
/*  57:    */     }
/*  58: 62 */     if (!this.e)
/*  59:    */     {
/*  60: 63 */       if (this.b.s().m()) {
/*  61: 64 */         return false;
/*  62:    */       }
/*  63: 66 */       return true;
/*  64:    */     }
/*  65: 69 */     if (!this.b.d(new BlockPosition(localxm))) {
/*  66: 70 */       return false;
/*  67:    */     }
/*  68: 72 */     return true;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void c()
/*  72:    */   {
/*  73: 77 */     this.b.s().a(this.f, this.d);
/*  74: 78 */     this.h = 0;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void d()
/*  78:    */   {
/*  79: 83 */     this.b.s().n();
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void e()
/*  83:    */   {
/*  84: 88 */     EntityLiving localxm = this.b.u();
/*  85: 89 */     this.b.p().a(localxm, 30.0F, 30.0F);
/*  86: 90 */     double d1 = this.b.dist2(localxm.xPos, localxm.getAABB().minY, localxm.zPos);
/*  87: 91 */     double d2 = a(localxm);
/*  88: 92 */     this.h -= 1;
/*  89: 94 */     if (((this.e) || (this.b.t().canSee(localxm))) && 
/*  90: 95 */       (this.h <= 0) && (
/*  91: 96 */       ((this.i == 0.0D) && (this.j == 0.0D) && (this.k == 0.0D)) || (localxm.dist2(this.i, this.j, this.k) >= 1.0D) || (this.b.getRNG().nextFloat() < 0.05F)))
/*  92:    */     {
/*  93: 97 */       this.i = localxm.xPos;
/*  94: 98 */       this.j = localxm.getAABB().minY;
/*  95: 99 */       this.k = localxm.zPos;
/*  96:100 */       this.h = (4 + this.b.getRNG().nextInt(7));
/*  97:102 */       if (d1 > 1024.0D) {
/*  98:103 */         this.h += 10;
/*  99:104 */       } else if (d1 > 256.0D) {
/* 100:105 */         this.h += 5;
/* 101:    */       }
/* 102:108 */       if (!this.b.s().a(localxm, this.d)) {
/* 103:109 */         this.h += 15;
/* 104:    */       }
/* 105:    */     }
/* 106:115 */     this.c = Math.max(this.c - 1, 0);
/* 107:117 */     if ((d1 <= d2) && (this.c <= 0))
/* 108:    */     {
/* 109:118 */       this.c = 20;
/* 110:119 */       if (this.b.getHeldItemStack() != null) {
/* 111:120 */         this.b.bv();
/* 112:    */       }
/* 113:122 */       this.b.r(localxm);
/* 114:    */     }
/* 115:    */   }
/* 116:    */   
/* 117:    */   protected double a(EntityLiving paramxm)
/* 118:    */   {
/* 119:127 */     return this.b.width * 2.0F * (this.b.width * 2.0F) + paramxm.width;
/* 120:    */   }
/* 121:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zk
 * JD-Core Version:    0.7.0.1
 */