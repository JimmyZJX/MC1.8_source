package net.minecraft.src;
/*   1:    */ public class ur
/*   2:    */ {
/*   3:    */   private transient us[] a;
/*   4:    */   private transient int b;
/*   5:    */   private int c;
/*   6:    */   private int d;
/*   7:    */   private final float e;
/*   8:    */   private volatile transient int f;
/*   9:    */   
/*  10:    */   public ur()
/*  11:    */   {
/*  12: 20 */     this.e = 0.75F;
/*  13: 21 */     this.d = 3072;
/*  14: 22 */     this.a = new us[4096];
/*  15: 23 */     this.c = (this.a.length - 1);
/*  16:    */   }
/*  17:    */   
/*  18:    */   private static int g(long paramLong)
/*  19:    */   {
/*  20: 27 */     return a((int)(paramLong ^ paramLong >>> 32));
/*  21:    */   }
/*  22:    */   
/*  23:    */   private static int a(int paramInt)
/*  24:    */   {
/*  25: 31 */     paramInt ^= paramInt >>> 20 ^ paramInt >>> 12;
/*  26: 32 */     return paramInt ^ paramInt >>> 7 ^ paramInt >>> 4;
/*  27:    */   }
/*  28:    */   
/*  29:    */   private static int a(int paramInt1, int paramInt2)
/*  30:    */   {
/*  31: 36 */     return paramInt1 & paramInt2;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public int a()
/*  35:    */   {
/*  36: 40 */     return this.b;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public Object a(long paramLong)
/*  40:    */   {
/*  41: 48 */     int i = g(paramLong);
/*  42: 49 */     for (us localus = this.a[a(i, this.c)]; localus != null; localus = localus.c) {
/*  43: 50 */       if (localus.a == paramLong) {
/*  44: 51 */         return localus.b;
/*  45:    */       }
/*  46:    */     }
/*  47: 54 */     return null;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public boolean b(long paramLong)
/*  51:    */   {
/*  52: 58 */     return c(paramLong) != null;
/*  53:    */   }
/*  54:    */   
/*  55:    */   final us c(long paramLong)
/*  56:    */   {
/*  57: 62 */     int i = g(paramLong);
/*  58: 63 */     for (us localus = this.a[a(i, this.c)]; localus != null; localus = localus.c) {
/*  59: 64 */       if (localus.a == paramLong) {
/*  60: 65 */         return localus;
/*  61:    */       }
/*  62:    */     }
/*  63: 68 */     return null;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void a(long paramLong, Object paramObject)
/*  67:    */   {
/*  68: 72 */     int i = g(paramLong);
/*  69: 73 */     int j = a(i, this.c);
/*  70: 74 */     for (us localus = this.a[j]; localus != null; localus = localus.c) {
/*  71: 75 */       if (localus.a == paramLong)
/*  72:    */       {
/*  73: 76 */         localus.b = paramObject;
/*  74: 77 */         return;
/*  75:    */       }
/*  76:    */     }
/*  77: 81 */     this.f += 1;
/*  78: 82 */     a(i, paramLong, paramObject, j);
/*  79:    */   }
/*  80:    */   
/*  81:    */   private void b(int paramInt)
/*  82:    */   {
/*  83: 87 */     us[] arrayOfus1 = this.a;
/*  84: 88 */     int i = arrayOfus1.length;
/*  85: 89 */     if (i == 1073741824)
/*  86:    */     {
/*  87: 90 */       this.d = 2147483647;
/*  88: 91 */       return;
/*  89:    */     }
/*  90: 94 */     us[] arrayOfus2 = new us[paramInt];
/*  91: 95 */     a(arrayOfus2);
/*  92: 96 */     this.a = arrayOfus2;
/*  93: 97 */     this.c = (this.a.length - 1);
/*  94: 98 */     this.d = ((int)(paramInt * this.e));
/*  95:    */   }
/*  96:    */   
/*  97:    */   private void a(us[] paramArrayOfus)
/*  98:    */   {
/*  99:102 */     us[] arrayOfus = this.a;
/* 100:103 */     int i = paramArrayOfus.length;
/* 101:104 */     for (int j = 0; j < arrayOfus.length; j++)
/* 102:    */     {
/* 103:105 */       us localObject = arrayOfus[j];
/* 104:106 */       if (localObject != null)
/* 105:    */       {
/* 106:107 */         arrayOfus[j] = null;
/* 107:    */         do
/* 108:    */         {
/* 109:109 */           us localus = ((us)localObject).c;
/* 110:110 */           int k = a(((us)localObject).d, i - 1);
/* 111:111 */           ((us)localObject).c = paramArrayOfus[k];
/* 112:112 */           paramArrayOfus[k] = localObject;
/* 113:113 */           localObject = localus;
/* 114:114 */         } while (localObject != null);
/* 115:    */       }
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   public Object d(long paramLong)
/* 120:    */   {
/* 121:120 */     us localus = e(paramLong);
/* 122:121 */     return localus == null ? null : localus.b;
/* 123:    */   }
/* 124:    */   
/* 125:    */   final us e(long paramLong)
/* 126:    */   {
/* 127:125 */     int i = g(paramLong);
/* 128:126 */     int j = a(i, this.c);
/* 129:127 */     us localObject1 = this.a[j];
/* 130:128 */     us localObject2 = localObject1;
/* 131:130 */     while (localObject2 != null)
/* 132:    */     {
/* 133:131 */       us localus = localObject2.c;
/* 134:132 */       if (localObject2.a == paramLong)
/* 135:    */       {
/* 136:133 */         this.f += 1;
/* 137:134 */         this.b -= 1;
/* 138:135 */         if (localObject1 == localObject2) {
/* 139:136 */           this.a[j] = localus;
/* 140:    */         } else {
/* 141:138 */           localObject1.c = localus;
/* 142:    */         }
/* 143:140 */         return localObject2;
/* 144:    */       }
/* 145:142 */       localObject1 = localObject2;
/* 146:143 */       localObject2 = localus;
/* 147:    */     }
/* 148:146 */     return localObject2;
/* 149:    */   }
/* 150:    */   
/* 151:    */   private void a(int paramInt1, long paramLong, Object paramObject, int paramInt2)
/* 152:    */   {
/* 153:246 */     us localus = this.a[paramInt2];
/* 154:247 */     this.a[paramInt2] = new us(paramInt1, paramLong, paramObject, localus);
/* 155:248 */     if (this.b++ >= this.d) {
/* 156:249 */       b(2 * this.a.length);
/* 157:    */     }
/* 158:    */   }
				static int f(long arg0) {return g(arg0);}
/* 159:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ur
 * JD-Core Version:    0.7.0.1
 */