package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class zm
/*   5:    */   extends GoalType
/*   6:    */ {
/*   7:    */   private EntityWalkingMob a;
/*   8:    */   private double b;
/*   9:    */   private bpv c;
/*  10:    */   private VillageDoor d;
/*  11:    */   private boolean e;
/*  12: 23 */   private List<VillageDoor> f = Lists.newArrayList();
/*  13:    */   
/*  14:    */   public zm(EntityWalkingMob paramxu, double paramDouble, boolean paramBoolean)
/*  15:    */   {
/*  16: 26 */     this.a = paramxu;
/*  17: 27 */     this.b = paramDouble;
/*  18: 28 */     this.e = paramBoolean;
/*  19: 29 */     a(1);
/*  20: 31 */     if (!(paramxu.getNavigator() instanceof aay)) {
/*  21: 32 */       throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
/*  22:    */     }
/*  23:    */   }
/*  24:    */   
/*  25:    */   public boolean canStart()
/*  26:    */   {
/*  27: 38 */     f();
/*  28: 40 */     if ((this.e) && (this.a.world.w())) {
/*  29: 41 */       return false;
/*  30:    */     }
/*  31: 44 */     Village localabi = this.a.world.getVillageManager().getNearestVillage(new BlockPosition(this.a), 0);
/*  32: 45 */     if (localabi == null) {
/*  33: 46 */       return false;
/*  34:    */     }
/*  35: 49 */     this.d = a(localabi);
/*  36: 50 */     if (this.d == null) {
/*  37: 51 */       return false;
/*  38:    */     }
/*  39: 54 */     aay localaay = (aay)this.a.getNavigator();
/*  40: 55 */     boolean bool = localaay.g();
/*  41: 56 */     localaay.b(false);
/*  42: 57 */     this.c = localaay.a(this.d.getPos());
/*  43: 58 */     localaay.b(bool);
/*  44: 59 */     if (this.c != null) {
/*  45: 60 */       return true;
/*  46:    */     }
/*  47: 63 */     Vec3 localbrw = abf.a(this.a, 10, 7, new Vec3(this.d.getPos().getX(), this.d.getPos().getY(), this.d.getPos().getZ()));
/*  48: 64 */     if (localbrw == null) {
/*  49: 65 */       return false;
/*  50:    */     }
/*  51: 67 */     localaay.b(false);
/*  52: 68 */     this.c = this.a.getNavigator().a(localbrw.x, localbrw.y, localbrw.z);
/*  53: 69 */     localaay.b(bool);
/*  54: 70 */     return this.c != null;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean canContinue()
/*  58:    */   {
/*  59: 75 */     if (this.a.getNavigator().m()) {
/*  60: 76 */       return false;
/*  61:    */     }
/*  62: 78 */     float f1 = this.a.width + 4.0F;
/*  63: 79 */     return this.a.b(this.d.getPos()) > f1 * f1;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void start()
/*  67:    */   {
/*  68: 84 */     this.a.getNavigator().a(this.c, this.b);
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void stop()
/*  72:    */   {
/*  73: 89 */     if ((this.a.getNavigator().m()) || (this.a.b(this.d.getPos()) < 16.0D)) {
/*  74: 90 */       this.f.add(this.d);
/*  75:    */     }
/*  76:    */   }
/*  77:    */   
/*  78:    */   private VillageDoor a(Village paramabi)
/*  79:    */   {
/*  80: 95 */     VillageDoor localObject = null;
/*  81: 96 */     int i = 2147483647;
/*  82: 97 */     List<VillageDoor> localList = paramabi.f();
/*  83: 98 */     for (VillageDoor localabh : localList)
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
/*  97:    */   private boolean a(VillageDoor paramabh)
/*  98:    */   {
/*  99:112 */     for (VillageDoor localabh : this.f) {
/* 100:113 */       if (paramabh.getPos().equals(localabh.getPos())) {
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