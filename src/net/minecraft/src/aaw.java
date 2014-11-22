package net.minecraft.src;
/*   2:    */ import org.apache.commons.lang3.StringUtils;
/*   3:    */ 
/*   4:    */ public abstract class aaw
/*   5:    */   extends GoalType
/*   6:    */ {
/*   7:    */   protected final EntityWalkingMob e;
/*   8:    */   protected boolean f;
/*   9:    */   private boolean a;
/*  10:    */   private int b;
/*  11:    */   private int c;
/*  12:    */   private int d;
/*  13:    */   
/*  14:    */   public aaw(EntityWalkingMob paramxu, boolean paramBoolean)
/*  15:    */   {
/*  16: 34 */     this(paramxu, paramBoolean, false);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public aaw(EntityWalkingMob paramxu, boolean paramBoolean1, boolean paramBoolean2)
/*  20:    */   {
/*  21: 38 */     this.e = paramxu;
/*  22: 39 */     this.f = paramBoolean1;
/*  23: 40 */     this.a = paramBoolean2;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public boolean canContinue()
/*  27:    */   {
/*  28: 45 */     EntityLiving localxm = this.e.u();
/*  29: 46 */     if (localxm == null) {
/*  30: 47 */       return false;
/*  31:    */     }
/*  32: 49 */     if (!localxm.ai()) {
/*  33: 50 */       return false;
/*  34:    */     }
/*  35: 53 */     bsf localbsf1 = this.e.bN();
/*  36: 54 */     bsf localbsf2 = localxm.bN();
/*  37: 55 */     if ((localbsf1 != null) && (localbsf2 == localbsf1)) {
/*  38: 56 */       return false;
/*  39:    */     }
/*  40: 59 */     double d1 = f();
/*  41: 60 */     if (this.e.h(localxm) > d1 * d1) {
/*  42: 61 */       return false;
/*  43:    */     }
/*  44: 63 */     if (this.f) {
/*  45: 64 */       if (this.e.getSensor().canSee(localxm)) {
/*  46: 65 */         this.d = 0;
/*  47: 67 */       } else if (++this.d > 60) {
/*  48: 68 */         return false;
/*  49:    */       }
/*  50:    */     }
/*  51: 72 */     if (((localxm instanceof EntityPlayer)) && 
/*  52: 73 */       (((EntityPlayer)localxm).by.a)) {
/*  53: 74 */       return false;
/*  54:    */     }
/*  55: 77 */     return true;
/*  56:    */   }
/*  57:    */   
/*  58:    */   protected double f()
/*  59:    */   {
/*  60: 81 */     xz localxz = this.e.a(afs.b);
/*  61: 82 */     return localxz == null ? 16.0D : localxz.e();
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void start()
/*  65:    */   {
/*  66: 87 */     this.b = 0;
/*  67: 88 */     this.c = 0;
/*  68: 89 */     this.d = 0;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void stop()
/*  72:    */   {
/*  73: 94 */     this.e.d((EntityLiving)null);
/*  74:    */   }
/*  75:    */   
/*  76:    */   public static boolean a(EntityMob paramxn, EntityLiving paramxm, boolean paramBoolean1, boolean paramBoolean2)
/*  77:    */   {
/*  78: 98 */     if (paramxm == null) {
/*  79: 99 */       return false;
/*  80:    */     }
/*  81:101 */     if (paramxm == paramxn) {
/*  82:102 */       return false;
/*  83:    */     }
/*  84:104 */     if (!paramxm.ai()) {
/*  85:105 */       return false;
/*  86:    */     }
/*  87:107 */     if (!paramxn.a(paramxm.getClass())) {
/*  88:108 */       return false;
/*  89:    */     }
/*  90:111 */     bsf localbsf1 = paramxn.bN();
/*  91:112 */     bsf localbsf2 = paramxm.bN();
/*  92:113 */     if ((localbsf1 != null) && (localbsf2 == localbsf1)) {
/*  93:114 */       return false;
/*  94:    */     }
/*  95:117 */     if (((paramxn instanceof xt)) && (StringUtils.isNotEmpty(((xt<?>)paramxn).b())))
/*  96:    */     {
/*  97:118 */       if (((paramxm instanceof xt)) && (((xt<?>)paramxn).b().equals(((xt<?>)paramxm).b()))) {
/*  98:120 */         return false;
/*  99:    */       }
/* 100:123 */       if (paramxm == ((xt<?>)paramxn).l_()) {
/* 101:125 */         return false;
/* 102:    */       }
/* 103:    */     }
/* 104:127 */     else if (((paramxm instanceof EntityPlayer)) && 
/* 105:128 */       (!paramBoolean1) && (((EntityPlayer)paramxm).by.a))
/* 106:    */     {
/* 107:129 */       return false;
/* 108:    */     }
/* 109:133 */     if ((paramBoolean2) && (!paramxn.getSensor().canSee(paramxm))) {
/* 110:134 */       return false;
/* 111:    */     }
/* 112:137 */     return true;
/* 113:    */   }
/* 114:    */   
/* 115:    */   protected boolean a(EntityLiving paramxm, boolean paramBoolean)
/* 116:    */   {
/* 117:141 */     if (!a(this.e, paramxm, paramBoolean, this.f)) {
/* 118:142 */       return false;
/* 119:    */     }
/* 120:145 */     if (!this.e.d(new BlockPosition(paramxm))) {
/* 121:146 */       return false;
/* 122:    */     }
/* 123:149 */     if (this.a)
/* 124:    */     {
/* 125:150 */       if (--this.c <= 0) {
/* 126:151 */         this.b = 0;
/* 127:    */       }
/* 128:153 */       if (this.b == 0) {
/* 129:154 */         this.b = (a(paramxm) ? 1 : 2);
/* 130:    */       }
/* 131:156 */       if (this.b == 2) {
/* 132:157 */         return false;
/* 133:    */       }
/* 134:    */     }
/* 135:161 */     return true;
/* 136:    */   }
/* 137:    */   
/* 138:    */   private boolean a(EntityLiving paramxm)
/* 139:    */   {
/* 140:165 */     this.c = (10 + this.e.getRNG().nextInt(5));
/* 141:166 */     bpv localbpv = this.e.getNavigator().a(paramxm);
/* 142:167 */     if (localbpv == null) {
/* 143:168 */       return false;
/* 144:    */     }
/* 145:170 */     bpt localbpt = localbpv.c();
/* 146:171 */     if (localbpt == null) {
/* 147:172 */       return false;
/* 148:    */     }
/* 149:174 */     int i = localbpt.a - MathUtils.floor(paramxm.xPos);
/* 150:175 */     int j = localbpt.c - MathUtils.floor(paramxm.zPos);
/* 151:176 */     return i * i + j * j <= 2.25D;
/* 152:    */   }
/* 153:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aaw
 * JD-Core Version:    0.7.0.1
 */