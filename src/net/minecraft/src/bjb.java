package net.minecraft.src;
/*   1:    */ import com.google.common.base.Objects;
/*   2:    */ import com.google.common.base.Objects.ToStringHelper;
/*   3:    */ 
/*   4:    */ public class bjb
/*   5:    */ {
/*   6:    */   public int a;
/*   7:    */   public int b;
/*   8:    */   public int c;
/*   9:    */   public int d;
/*  10:    */   public int e;
/*  11:    */   public int f;
/*  12:    */   
/*  13:    */   public bjb() {}
/*  14:    */   
/*  15:    */   public bjb(int[] paramArrayOfInt)
/*  16:    */   {
/*  17: 21 */     if (paramArrayOfInt.length == 6)
/*  18:    */     {
/*  19: 22 */       this.a = paramArrayOfInt[0];
/*  20: 23 */       this.b = paramArrayOfInt[1];
/*  21: 24 */       this.c = paramArrayOfInt[2];
/*  22: 25 */       this.d = paramArrayOfInt[3];
/*  23: 26 */       this.e = paramArrayOfInt[4];
/*  24: 27 */       this.f = paramArrayOfInt[5];
/*  25:    */     }
/*  26:    */   }
/*  27:    */   
/*  28:    */   public static bjb a()
/*  29:    */   {
/*  30: 32 */     return new bjb(2147483647, 2147483647, 2147483647, -2147483648, -2147483648, -2147483648);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public static bjb a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, EnumDirection paramej)
/*  34:    */   {
/*  35: 36 */     switch (bjc.a[paramej.ordinal()])
/*  36:    */     {
/*  37:    */     default: 
/*  38: 38 */       return new bjb(paramInt1 + paramInt4, paramInt2 + paramInt5, paramInt3 + paramInt6, paramInt1 + paramInt7 - 1 + paramInt4, paramInt2 + paramInt8 - 1 + paramInt5, paramInt3 + paramInt9 - 1 + paramInt6);
/*  39:    */     case 1: 
/*  40: 41 */       return new bjb(paramInt1 + paramInt4, paramInt2 + paramInt5, paramInt3 - paramInt9 + 1 + paramInt6, paramInt1 + paramInt7 - 1 + paramInt4, paramInt2 + paramInt8 - 1 + paramInt5, paramInt3 + paramInt6);
/*  41:    */     case 2: 
/*  42: 44 */       return new bjb(paramInt1 + paramInt4, paramInt2 + paramInt5, paramInt3 + paramInt6, paramInt1 + paramInt7 - 1 + paramInt4, paramInt2 + paramInt8 - 1 + paramInt5, paramInt3 + paramInt9 - 1 + paramInt6);
/*  43:    */     case 3: 
/*  44: 47 */       return new bjb(paramInt1 - paramInt9 + 1 + paramInt6, paramInt2 + paramInt5, paramInt3 + paramInt4, paramInt1 + paramInt6, paramInt2 + paramInt8 - 1 + paramInt5, paramInt3 + paramInt7 - 1 + paramInt4);
/*  45:    */     }
/*  46: 50 */     return new bjb(paramInt1 + paramInt6, paramInt2 + paramInt5, paramInt3 + paramInt4, paramInt1 + paramInt9 - 1 + paramInt6, paramInt2 + paramInt8 - 1 + paramInt5, paramInt3 + paramInt7 - 1 + paramInt4);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public static bjb a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  50:    */   {
/*  51: 55 */     return new bjb(Math.min(paramInt1, paramInt4), Math.min(paramInt2, paramInt5), Math.min(paramInt3, paramInt6), Math.max(paramInt1, paramInt4), Math.max(paramInt2, paramInt5), Math.max(paramInt3, paramInt6));
/*  52:    */   }
/*  53:    */   
/*  54:    */   public bjb(bjb parambjb)
/*  55:    */   {
/*  56: 59 */     this.a = parambjb.a;
/*  57: 60 */     this.b = parambjb.b;
/*  58: 61 */     this.c = parambjb.c;
/*  59: 62 */     this.d = parambjb.d;
/*  60: 63 */     this.e = parambjb.e;
/*  61: 64 */     this.f = parambjb.f;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public bjb(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  65:    */   {
/*  66: 68 */     this.a = paramInt1;
/*  67: 69 */     this.b = paramInt2;
/*  68: 70 */     this.c = paramInt3;
/*  69: 71 */     this.d = paramInt4;
/*  70: 72 */     this.e = paramInt5;
/*  71: 73 */     this.f = paramInt6;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public bjb(fd paramfd1, fd paramfd2)
/*  75:    */   {
/*  76: 77 */     this.a = Math.min(paramfd1.getX(), paramfd2.getX());
/*  77: 78 */     this.b = Math.min(paramfd1.getY(), paramfd2.getY());
/*  78: 79 */     this.c = Math.min(paramfd1.getZ(), paramfd2.getZ());
/*  79: 80 */     this.d = Math.max(paramfd1.getX(), paramfd2.getX());
/*  80: 81 */     this.e = Math.max(paramfd1.getY(), paramfd2.getY());
/*  81: 82 */     this.f = Math.max(paramfd1.getZ(), paramfd2.getZ());
/*  82:    */   }
/*  83:    */   
/*  84:    */   public bjb(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  85:    */   {
/*  86: 86 */     this.a = paramInt1;
/*  87: 87 */     this.c = paramInt2;
/*  88: 88 */     this.d = paramInt3;
/*  89: 89 */     this.f = paramInt4;
/*  90:    */     
/*  91:    */ 
/*  92: 92 */     this.b = 1;
/*  93: 93 */     this.e = 512;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public boolean a(bjb parambjb)
/*  97:    */   {
/*  98: 97 */     return (this.d >= parambjb.a) && (this.a <= parambjb.d) && (this.f >= parambjb.c) && (this.c <= parambjb.f) && (this.e >= parambjb.b) && (this.b <= parambjb.e);
/*  99:    */   }
/* 100:    */   
/* 101:    */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 102:    */   {
/* 103:109 */     return (this.d >= paramInt1) && (this.a <= paramInt3) && (this.f >= paramInt2) && (this.c <= paramInt4);
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void b(bjb parambjb)
/* 107:    */   {
/* 108:113 */     this.a = Math.min(this.a, parambjb.a);
/* 109:114 */     this.b = Math.min(this.b, parambjb.b);
/* 110:115 */     this.c = Math.min(this.c, parambjb.c);
/* 111:116 */     this.d = Math.max(this.d, parambjb.d);
/* 112:117 */     this.e = Math.max(this.e, parambjb.e);
/* 113:118 */     this.f = Math.max(this.f, parambjb.f);
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void a(int paramInt1, int paramInt2, int paramInt3)
/* 117:    */   {
/* 118:137 */     this.a += paramInt1;
/* 119:138 */     this.b += paramInt2;
/* 120:139 */     this.c += paramInt3;
/* 121:140 */     this.d += paramInt1;
/* 122:141 */     this.e += paramInt2;
/* 123:142 */     this.f += paramInt3;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean b(fd paramfd)
/* 127:    */   {
/* 128:155 */     return (paramfd.getX() >= this.a) && (paramfd.getX() <= this.d) && (paramfd.getZ() >= this.c) && (paramfd.getZ() <= this.f) && (paramfd.getY() >= this.b) && (paramfd.getY() <= this.e);
/* 129:    */   }
/* 130:    */   
/* 131:    */   public fd b()
/* 132:    */   {
/* 133:159 */     return new fd(this.d - this.a, this.e - this.b, this.f - this.c);
/* 134:    */   }
/* 135:    */   
/* 136:    */   public int c()
/* 137:    */   {
/* 138:163 */     return this.d - this.a + 1;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public int d()
/* 142:    */   {
/* 143:167 */     return this.e - this.b + 1;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public int e()
/* 147:    */   {
/* 148:171 */     return this.f - this.c + 1;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public fd f()
/* 152:    */   {
/* 153:175 */     return new BlockPosition(this.a + (this.d - this.a + 1) / 2, this.b + (this.e - this.b + 1) / 2, this.c + (this.f - this.c + 1) / 2);
/* 154:    */   }
/* 155:    */   
/* 156:    */   public String toString()
/* 157:    */   {
/* 158:180 */     return Objects.toStringHelper(this).add("x0", this.a).add("y0", this.b).add("z0", this.c).add("x1", this.d).add("y1", this.e).add("z1", this.f).toString();
/* 159:    */   }
/* 160:    */   
/* 161:    */   public ft g()
/* 162:    */   {
/* 163:191 */     return new ft(new int[] { this.a, this.b, this.c, this.d, this.e, this.f });
/* 164:    */   }
/* 165:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjb
 * JD-Core Version:    0.7.0.1
 */