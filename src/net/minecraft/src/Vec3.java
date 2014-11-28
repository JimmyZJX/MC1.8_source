package net.minecraft.src;
/*   1:    */ public class Vec3
/*   2:    */ {
/*   3:    */   public final double x;
/*   4:    */   public final double y;
/*   5:    */   public final double z;
/*   6:    */   
/*   7:    */   public Vec3(double paramDouble1, double paramDouble2, double paramDouble3)
/*   8:    */   {
/*   9: 11 */     if (paramDouble1 == -0.0D) {
/*  10: 12 */       paramDouble1 = 0.0D;
/*  11:    */     }
/*  12: 14 */     if (paramDouble2 == -0.0D) {
/*  13: 15 */       paramDouble2 = 0.0D;
/*  14:    */     }
/*  15: 17 */     if (paramDouble3 == -0.0D) {
/*  16: 18 */       paramDouble3 = 0.0D;
/*  17:    */     }
/*  18: 20 */     this.x = paramDouble1;
/*  19: 21 */     this.y = paramDouble2;
/*  20: 22 */     this.z = paramDouble3;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public Vec3 subtract(Vec3 parambrw)
/*  24:    */   {
/*  25: 26 */     return new Vec3(parambrw.x - this.x, parambrw.y - this.y, parambrw.z - this.z);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public Vec3 normalize()
/*  29:    */   {
/*  30: 30 */     double d = MathUtils.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
/*  31: 31 */     if (d < 0.0001D) {
/*  32: 32 */       return new Vec3(0.0D, 0.0D, 0.0D);
/*  33:    */     }
/*  34: 34 */     return new Vec3(this.x / d, this.y / d, this.z / d);
/*  35:    */   }
/*  36:    */   
/*  37:    */   public double dot(Vec3 parambrw)
/*  38:    */   {
/*  39: 38 */     return this.x * parambrw.x + this.y * parambrw.y + this.z * parambrw.z;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public Vec3 cross(Vec3 v)
/*  43:    */   {
/*  44: 42 */     return new Vec3(this.y * v.z - this.z * v.y, this.z * v.x - this.x * v.z, this.x * v.y - this.y * v.x);
/*  45:    */   }
/*  46:    */   
/*  47:    */   public Vec3 substract(Vec3 v)
/*  48:    */   {
/*  49: 46 */     return substract(v.x, v.y, v.z);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public Vec3 substract(double x, double y, double z)
/*  53:    */   {
/*  54: 50 */     return add(-x, -y, -z);
/*  55:    */   }
/*  56:    */   
/*  57:    */   public Vec3 add(Vec3 v)
/*  58:    */   {
/*  59: 54 */     return add(v.x, v.y, v.z);
/*  60:    */   }
/*  61:    */   
/*  62:    */   public Vec3 add(double x, double y, double z)
/*  63:    */   {
/*  64: 58 */     return new Vec3(this.x + x, this.y + y, this.z + z);
/*  65:    */   }
/*  66:    */   
/*  67:    */   public double dist(Vec3 v)
/*  68:    */   {
/*  69: 62 */     double d1 = v.x - this.x;
/*  70: 63 */     double d2 = v.y - this.y;
/*  71: 64 */     double d3 = v.z - this.z;
/*  72: 65 */     return MathUtils.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
/*  73:    */   }
/*  74:    */   
/*  75:    */   public double dist2(Vec3 v)
/*  76:    */   {
/*  77: 69 */     double d1 = v.x - this.x;
/*  78: 70 */     double d2 = v.y - this.y;
/*  79: 71 */     double d3 = v.z - this.z;
/*  80: 72 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public double norm()
/*  84:    */   {
/*  85: 87 */     return MathUtils.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
/*  86:    */   }
/*  87:    */   
/*  88:    */   public Vec3 a(Vec3 parambrw, double paramDouble)
/*  89:    */   {
/*  90: 91 */     double d1 = parambrw.x - this.x;
/*  91: 92 */     double d2 = parambrw.y - this.y;
/*  92: 93 */     double d3 = parambrw.z - this.z;
/*  93: 95 */     if (d1 * d1 < 1.000000011686097E-007D) {
/*  94: 96 */       return null;
/*  95:    */     }
/*  96: 99 */     double d4 = (paramDouble - this.x) / d1;
/*  97:100 */     if ((d4 < 0.0D) || (d4 > 1.0D)) {
/*  98:101 */       return null;
/*  99:    */     }
/* 100:103 */     return new Vec3(this.x + d1 * d4, this.y + d2 * d4, this.z + d3 * d4);
/* 101:    */   }
/* 102:    */   
/* 103:    */   public Vec3 b(Vec3 parambrw, double paramDouble)
/* 104:    */   {
/* 105:107 */     double d1 = parambrw.x - this.x;
/* 106:108 */     double d2 = parambrw.y - this.y;
/* 107:109 */     double d3 = parambrw.z - this.z;
/* 108:111 */     if (d2 * d2 < 1.000000011686097E-007D) {
/* 109:112 */       return null;
/* 110:    */     }
/* 111:115 */     double d4 = (paramDouble - this.y) / d2;
/* 112:116 */     if ((d4 < 0.0D) || (d4 > 1.0D)) {
/* 113:117 */       return null;
/* 114:    */     }
/* 115:119 */     return new Vec3(this.x + d1 * d4, this.y + d2 * d4, this.z + d3 * d4);
/* 116:    */   }
/* 117:    */   
/* 118:    */   public Vec3 c(Vec3 parambrw, double paramDouble)
/* 119:    */   {
/* 120:123 */     double d1 = parambrw.x - this.x;
/* 121:124 */     double d2 = parambrw.y - this.y;
/* 122:125 */     double d3 = parambrw.z - this.z;
/* 123:127 */     if (d3 * d3 < 1.000000011686097E-007D) {
/* 124:128 */       return null;
/* 125:    */     }
/* 126:131 */     double d4 = (paramDouble - this.z) / d3;
/* 127:132 */     if ((d4 < 0.0D) || (d4 > 1.0D)) {
/* 128:133 */       return null;
/* 129:    */     }
/* 130:135 */     return new Vec3(this.x + d1 * d4, this.y + d2 * d4, this.z + d3 * d4);
/* 131:    */   }
/* 132:    */   
/* 133:    */   public String toString()
/* 134:    */   {
/* 135:139 */     return "(" + this.x + ", " + this.y + ", " + this.z + ")";
/* 136:    */   }
/* 137:    */   
/* 138:    */   public Vec3 a(float paramFloat)
/* 139:    */   {
/* 140:147 */     float f1 = MathUtils.cos(paramFloat);
/* 141:148 */     float f2 = MathUtils.sin(paramFloat);
/* 142:    */     
/* 143:150 */     double d1 = this.x;
/* 144:151 */     double d2 = this.y * f1 + this.z * f2;
/* 145:152 */     double d3 = this.z * f1 - this.y * f2;
/* 146:    */     
/* 147:154 */     return new Vec3(d1, d2, d3);
/* 148:    */   }
/* 149:    */   
/* 150:    */   public Vec3 b(float paramFloat)
/* 151:    */   {
/* 152:158 */     float f1 = MathUtils.cos(paramFloat);
/* 153:159 */     float f2 = MathUtils.sin(paramFloat);
/* 154:    */     
/* 155:161 */     double d1 = this.x * f1 + this.z * f2;
/* 156:162 */     double d2 = this.y;
/* 157:163 */     double d3 = this.z * f1 - this.x * f2;
/* 158:    */     
/* 159:165 */     return new Vec3(d1, d2, d3);
/* 160:    */   }
/* 161:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     brw
 * JD-Core Version:    0.7.0.1
 */