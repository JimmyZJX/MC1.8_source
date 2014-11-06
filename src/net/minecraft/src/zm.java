package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class zm
/*   5:    */   extends zb
/*   6:    */ {
/*   7:    */   private EntityWalkingMob a;
/*   8:    */   private double b;
/*   9:    */   private bpv c;
/*  10:    */   private abh d;
/*  11:    */   private boolean e;
/*  12: 23 */   private List<abh> f = Lists.newArrayList();
/*  13:    */   
/*  14:    */   public zm(EntityWalkingMob paramxu, double paramDouble, boolean paramBoolean)
/*  15:    */   {
/*  16: 26 */     this.a = paramxu;
/*  17: 27 */     this.b = paramDouble;
/*  18: 28 */     this.e = paramBoolean;
/*  19: 29 */     a(1);
/*  20: 31 */     if (!(paramxu.s() instanceof aay)) {
/*  21: 32 */       throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
/*  22:    */     }
/*  23:    */   }
/*  24:    */   
/*  25:    */   public boolean a()
/*  26:    */   {
/*  27: 38 */     f();
/*  28: 40 */     if ((this.e) && (this.a.world.w())) {
/*  29: 41 */       return false;
/*  30:    */     }
/*  31: 44 */     abi localabi = this.a.world.ae().a(new BlockPosition(this.a), 0);
/*  32: 45 */     if (localabi == null) {
/*  33: 46 */       return false;
/*  34:    */     }
/*  35: 49 */     this.d = a(localabi);
/*  36: 50 */     if (this.d == null) {
/*  37: 51 */       return false;
/*  38:    */     }
/*  39: 54 */     aay localaay = (aay)this.a.s();
/*  40: 55 */     boolean bool = localaay.g();
/*  41: 56 */     localaay.b(false);
/*  42: 57 */     this.c = localaay.a(this.d.d());
/*  43: 58 */     localaay.b(bool);
/*  44: 59 */     if (this.c != null) {
/*  45: 60 */       return true;
/*  46:    */     }
/*  47: 63 */     Vec3 localbrw = abf.a(this.a, 10, 7, new Vec3(this.d.d().getX(), this.d.d().getY(), this.d.d().getZ()));
/*  48: 64 */     if (localbrw == null) {
/*  49: 65 */       return false;
/*  50:    */     }
/*  51: 67 */     localaay.b(false);
/*  52: 68 */     this.c = this.a.s().a(localbrw.x, localbrw.y, localbrw.z);
/*  53: 69 */     localaay.b(bool);
/*  54: 70 */     return this.c != null;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean b()
/*  58:    */   {
/*  59: 75 */     if (this.a.s().m()) {
/*  60: 76 */       return false;
/*  61:    */     }
/*  62: 78 */     float f1 = this.a.J + 4.0F;
/*  63: 79 */     return this.a.b(this.d.d()) > f1 * f1;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void c()
/*  67:    */   {
/*  68: 84 */     this.a.s().a(this.c, this.b);
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void d()
/*  72:    */   {
/*  73: 89 */     if ((this.a.s().m()) || (this.a.b(this.d.d()) < 16.0D)) {
/*  74: 90 */       this.f.add(this.d);
/*  75:    */     }
/*  76:    */   }
/*  77:    */   
/*  78:    */   private abh a(abi paramabi)
/*  79:    */   {
/*  80: 95 */     abh localObject = null;
/*  81: 96 */     int i = 2147483647;
/*  82: 97 */     List<abh> localList = paramabi.f();
/*  83: 98 */     for (abh localabh : localList)
/*  84:    */     {
/*  85: 99 */       int j = localabh.b(MathUtils.floor(this.a.xPos), MathUtils.floor(this.a.yPos), MathUtils.floor(this.a.zPos));
/*  86:100 */       if (j < i) {
/*  87:101 */         if (!a(localabh))
/*  88:    */         {
/*  89:104 */           localObject = localabh;
/*  90:105 */           i = j;
/*  91:    */         }
/*  92:    */       }
/*  93:    */     }
/*  94:108 */     return localObject;
/*  95:    */   }
/*  96:    */   
/*  97:    */   private boolean a(abh paramabh)
/*  98:    */   {
/*  99:112 */     for (abh localabh : this.f) {
/* 100:113 */       if (paramabh.d().equals(localabh.d())) {
/* 101:114 */         return true;
/* 102:    */       }
/* 103:    */     }
/* 104:117 */     return false;
/* 105:    */   }
/* 106:    */   
/* 107:    */   private void f()
/* 108:    */   {
/* 109:121 */     if (this.f.size() > 15) {
/* 110:122 */       this.f.remove(0);
/* 111:    */     }
/* 112:    */   }
/* 113:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zm
 * JD-Core Version:    0.7.0.1
 */