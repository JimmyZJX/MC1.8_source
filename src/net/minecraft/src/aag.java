package net.minecraft.src;
/*   1:    */ public class aag
/*   2:    */   extends GoalType
/*   3:    */ {
/*   4:    */   private EntityWalkingMob a;
/*   5:    */   private double b;
/*   6:    */   private double c;
/*   7:    */   private double d;
/*   8:    */   private double e;
/*   9:    */   private double f;
/*  10:    */   private double g;
/*  11:    */   private EntityPlayer h;
/*  12:    */   private int i;
/*  13:    */   private boolean j;
/*  14:    */   private Item k;
/*  15:    */   private boolean l;
/*  16:    */   private boolean m;
/*  17:    */   
/*  18:    */   public aag(EntityWalkingMob paramxu, double paramDouble, Item paramalq, boolean paramBoolean)
/*  19:    */   {
/*  20: 22 */     this.a = paramxu;
/*  21: 23 */     this.b = paramDouble;
/*  22: 24 */     this.k = paramalq;
/*  23: 25 */     this.l = paramBoolean;
/*  24: 26 */     a(3);
/*  25: 27 */     if (!(paramxu.getNavigator() instanceof aay)) {
/*  26: 28 */       throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
/*  27:    */     }
/*  28:    */   }
/*  29:    */   
/*  30:    */   public boolean canStart()
/*  31:    */   {
/*  32: 34 */     if (this.i > 0)
/*  33:    */     {
/*  34: 35 */       this.i -= 1;
/*  35: 36 */       return false;
/*  36:    */     }
/*  37: 38 */     this.h = this.a.world.getNearestPlayer(this.a, 10.0D);
/*  38: 39 */     if (this.h == null) {
/*  39: 40 */       return false;
/*  40:    */     }
/*  41: 42 */     ItemStack localamj = this.h.bY();
/*  42: 43 */     if (localamj == null) {
/*  43: 44 */       return false;
/*  44:    */     }
/*  45: 46 */     if (localamj.getItem() != this.k) {
/*  46: 47 */       return false;
/*  47:    */     }
/*  48: 49 */     return true;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public boolean canContinue()
/*  52:    */   {
/*  53: 54 */     if (this.l)
/*  54:    */     {
/*  55: 55 */       if (this.a.h(this.h) < 36.0D)
/*  56:    */       {
/*  57: 56 */         if (this.h.dist2(this.c, this.d, this.e) > 0.01D) {
/*  58: 57 */           return false;
/*  59:    */         }
/*  60: 59 */         if ((Math.abs(this.h.pitch - this.f) > 5.0D) || (Math.abs(this.h.yaw - this.g) > 5.0D)) {
/*  61: 60 */           return false;
/*  62:    */         }
/*  63:    */       }
/*  64:    */       else
/*  65:    */       {
/*  66: 63 */         this.c = this.h.xPos;
/*  67: 64 */         this.d = this.h.yPos;
/*  68: 65 */         this.e = this.h.zPos;
/*  69:    */       }
/*  70: 67 */       this.f = this.h.pitch;
/*  71: 68 */       this.g = this.h.yaw;
/*  72:    */     }
/*  73: 70 */     return canStart();
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void start()
/*  77:    */   {
/*  78: 75 */     this.c = this.h.xPos;
/*  79: 76 */     this.d = this.h.yPos;
/*  80: 77 */     this.e = this.h.zPos;
/*  81: 78 */     this.j = true;
/*  82: 79 */     this.m = ((aay)this.a.getNavigator()).e();
/*  83: 80 */     ((aay)this.a.getNavigator()).a(false);
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void stop()
/*  87:    */   {
/*  88: 85 */     this.h = null;
/*  89: 86 */     this.a.getNavigator().n();
/*  90: 87 */     this.i = 100;
/*  91: 88 */     this.j = false;
/*  92: 89 */     ((aay)this.a.getNavigator()).a(this.m);
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void tick()
/*  96:    */   {
/*  97: 94 */     this.a.p().a(this.h, 30.0F, this.a.bP());
/*  98: 95 */     if (this.a.h(this.h) < 6.25D) {
/*  99: 96 */       this.a.getNavigator().n();
/* 100:    */     } else {
/* 101: 98 */       this.a.getNavigator().a(this.h, this.b);
/* 102:    */     }
/* 103:    */   }
/* 104:    */   
/* 105:    */   public boolean f()
/* 106:    */   {
/* 107:103 */     return this.j;
/* 108:    */   }
/* 109:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aag
 * JD-Core Version:    0.7.0.1
 */