package net.minecraft.src;
/*   1:    */ public class yz
/*   2:    */   extends GoalType
/*   3:    */ {
/*   4:    */   private EntityPet d;
/*   5:    */   private EntityLiving e;
/*   6:    */   World a;
/*   7:    */   private double f;
/*   8:    */   private Navigator g;
/*   9:    */   private int h;
/*  10:    */   float b;
/*  11:    */   float c;
/*  12:    */   private boolean i;
/*  13:    */   
/*  14:    */   public yz(EntityPet paramxx, double paramDouble, float paramFloat1, float paramFloat2)
/*  15:    */   {
/*  16: 25 */     this.d = paramxx;
/*  17: 26 */     this.a = paramxx.world;
/*  18: 27 */     this.f = paramDouble;
/*  19: 28 */     this.g = paramxx.getNavigator();
/*  20: 29 */     this.c = paramFloat1;
/*  21: 30 */     this.b = paramFloat2;
/*  22: 31 */     a(3);
/*  23: 33 */     if (!(paramxx.getNavigator() instanceof aay)) {
/*  24: 34 */       throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
/*  25:    */     }
/*  26:    */   }
/*  27:    */   
/*  28:    */   public boolean canStart()
/*  29:    */   {
/*  30: 40 */     EntityLiving localxm = this.d.l_();
/*  31: 41 */     if (localxm == null) {
/*  32: 42 */       return false;
/*  33:    */     }
/*  34: 44 */     if (this.d.cl()) {
/*  35: 45 */       return false;
/*  36:    */     }
/*  37: 47 */     if (this.d.h(localxm) < this.c * this.c) {
/*  38: 48 */       return false;
/*  39:    */     }
/*  40: 50 */     this.e = localxm;
/*  41: 51 */     return true;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean canContinue()
/*  45:    */   {
/*  46: 56 */     return (!this.g.m()) && (this.d.h(this.e) > this.b * this.b) && (!this.d.cl());
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void start()
/*  50:    */   {
/*  51: 61 */     this.h = 0;
/*  52: 62 */     this.i = ((aay)this.d.getNavigator()).e();
/*  53: 63 */     ((aay)this.d.getNavigator()).a(false);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void stop()
/*  57:    */   {
/*  58: 68 */     this.e = null;
/*  59: 69 */     this.g.n();
/*  60: 70 */     ((aay)this.d.getNavigator()).a(true);
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void tick()
/*  64:    */   {
/*  65: 75 */     this.d.p().a(this.e, 10.0F, this.d.bP());
/*  66: 76 */     if (this.d.cl()) {
/*  67: 77 */       return;
/*  68:    */     }
/*  69: 80 */     if (--this.h > 0) {
/*  70: 81 */       return;
/*  71:    */     }
/*  72: 83 */     this.h = 10;
/*  73: 85 */     if (this.g.a(this.e, this.f)) {
/*  74: 86 */       return;
/*  75:    */     }
/*  76: 88 */     if (this.d.cb()) {
/*  77: 89 */       return;
/*  78:    */     }
/*  79: 91 */     if (this.d.h(this.e) < 144.0D) {
/*  80: 92 */       return;
/*  81:    */     }
/*  82: 96 */     int j = MathUtils.floor(this.e.xPos) - 2;
/*  83: 97 */     int k = MathUtils.floor(this.e.zPos) - 2;
/*  84: 98 */     int m = MathUtils.floor(this.e.getAABB().minY);
/*  85: 99 */     for (int n = 0; n <= 4; n++) {
/*  86:100 */       for (int i1 = 0; i1 <= 4; i1++) {
/*  87:101 */         if ((n < 1) || (i1 < 1) || (n > 3) || (i1 > 3)) {
/*  88:104 */           if ((World.isFlatSurface(this.a, new BlockPosition(j + n, m - 1, k + i1))) && (!this.a.getBlock(new BlockPosition(j + n, m, k + i1)).getType().isOpaqueCube()) && (!this.a.getBlock(new BlockPosition(j + n, m + 1, k + i1)).getType().isOpaqueCube()))
/*  89:    */           {
/*  90:105 */             this.d.setPositionAndAngles(j + n + 0.5F, m, k + i1 + 0.5F, this.d.yaw, this.d.pitch);
/*  91:106 */             this.g.n();
/*  92:107 */             return;
/*  93:    */           }
/*  94:    */         }
/*  95:    */       }
/*  96:    */     }
/*  97:    */   }
/*  98:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yz
 * JD-Core Version:    0.7.0.1
 */