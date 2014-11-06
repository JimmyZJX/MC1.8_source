package net.minecraft.src;
/*   1:    */ public class um
/*   2:    */ {
/*   3:    */   private transient un[] a;
/*   4:    */   private transient int b;
/*   5:    */   private int c;
/*   6:    */   private final float d;
/*   7:    */   
/*   8:    */   public um()
/*   9:    */   {
/*  10: 16 */     this.d = 0.75F;
/*  11: 17 */     this.c = 12;
/*  12: 18 */     this.a = new un[16];
/*  13:    */   }
/*  14:    */   
/*  15:    */   private static int g(int paramInt)
/*  16:    */   {
/*  17: 22 */     paramInt ^= paramInt >>> 20 ^ paramInt >>> 12;
/*  18: 23 */     return paramInt ^ paramInt >>> 7 ^ paramInt >>> 4;
/*  19:    */   }
/*  20:    */   
/*  21:    */   private static int a(int paramInt1, int paramInt2)
/*  22:    */   {
/*  23: 27 */     return paramInt1 & paramInt2 - 1;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public Object a(int paramInt)
/*  27:    */   {
/*  28: 39 */     int i = g(paramInt);
/*  29: 40 */     for (un localun = this.a[a(i, this.a.length)]; localun != null; localun = localun.c) {
/*  30: 41 */       if (localun.a == paramInt) {
/*  31: 42 */         return localun.b;
/*  32:    */       }
/*  33:    */     }
/*  34: 45 */     return null;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public boolean b(int paramInt)
/*  38:    */   {
/*  39: 49 */     return c(paramInt) != null;
/*  40:    */   }
/*  41:    */   
/*  42:    */   final un c(int paramInt)
/*  43:    */   {
/*  44: 53 */     int i = g(paramInt);
/*  45: 54 */     for (un localun = this.a[a(i, this.a.length)]; localun != null; localun = localun.c) {
/*  46: 55 */       if (localun.a == paramInt) {
/*  47: 56 */         return localun;
/*  48:    */       }
/*  49:    */     }
/*  50: 59 */     return null;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void a(int paramInt, Object paramObject)
/*  54:    */   {
/*  55: 63 */     int i = g(paramInt);
/*  56: 64 */     int j = a(i, this.a.length);
/*  57: 65 */     for (un localun = this.a[j]; localun != null; localun = localun.c) {
/*  58: 66 */       if (localun.a == paramInt)
/*  59:    */       {
/*  60: 67 */         localun.b = paramObject;
/*  61: 68 */         return;
/*  62:    */       }
/*  63:    */     }
/*  64: 72 */     a(i, paramInt, paramObject, j);
/*  65:    */   }
/*  66:    */   
/*  67:    */   private void h(int paramInt)
/*  68:    */   {
/*  69: 77 */     un[] arrayOfun1 = this.a;
/*  70: 78 */     int i = arrayOfun1.length;
/*  71: 79 */     if (i == 1073741824)
/*  72:    */     {
/*  73: 80 */       this.c = 2147483647;
/*  74: 81 */       return;
/*  75:    */     }
/*  76: 84 */     un[] arrayOfun2 = new un[paramInt];
/*  77: 85 */     a(arrayOfun2);
/*  78: 86 */     this.a = arrayOfun2;
/*  79: 87 */     this.c = ((int)(paramInt * this.d));
/*  80:    */   }
/*  81:    */   
/*  82:    */   private void a(un[] paramArrayOfun)
/*  83:    */   {
/*  84: 91 */     un[] arrayOfun = this.a;
/*  85: 92 */     int i = paramArrayOfun.length;
/*  86: 93 */     for (int j = 0; j < arrayOfun.length; j++)
/*  87:    */     {
/*  88: 94 */       un localObject = arrayOfun[j];
/*  89: 95 */       if (localObject != null)
/*  90:    */       {
/*  91: 96 */         arrayOfun[j] = null;
/*  92:    */         do
/*  93:    */         {
/*  94: 98 */           un localun = ((un)localObject).c;
/*  95: 99 */           int k = a(((un)localObject).d, i);
/*  96:100 */           ((un)localObject).c = paramArrayOfun[k];
/*  97:101 */           paramArrayOfun[k] = localObject;
/*  98:102 */           localObject = localun;
/*  99:103 */         } while (localObject != null);
/* 100:    */       }
/* 101:    */     }
/* 102:    */   }
/* 103:    */   
/* 104:    */   public Object d(int paramInt)
/* 105:    */   {
/* 106:109 */     un localun = e(paramInt);
/* 107:110 */     return localun == null ? null : localun.b;
/* 108:    */   }
/* 109:    */   
/* 110:    */   final un e(int paramInt)
/* 111:    */   {
/* 112:114 */     int i = g(paramInt);
/* 113:115 */     int j = a(i, this.a.length);
/* 114:116 */     un localObject1 = this.a[j];
/* 115:117 */     un localObject2 = localObject1;
/* 116:119 */     while (localObject2 != null)
/* 117:    */     {
/* 118:120 */       un localun = localObject2.c;
/* 119:121 */       if (localObject2.a == paramInt)
/* 120:    */       {
/* 121:122 */         this.b -= 1;
/* 122:123 */         if (localObject1 == localObject2) {
/* 123:124 */           this.a[j] = localun;
/* 124:    */         } else {
/* 125:126 */           localObject1.c = localun;
/* 126:    */         }
/* 127:128 */         return localObject2;
/* 128:    */       }
/* 129:130 */       localObject1 = localObject2;
/* 130:131 */       localObject2 = localun;
/* 131:    */     }
/* 132:134 */     return localObject2;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void c()
/* 136:    */   {
/* 137:138 */     un[] arrayOfun = this.a;
/* 138:139 */     for (int i = 0; i < arrayOfun.length; i++) {
/* 139:140 */       arrayOfun[i] = null;
/* 140:    */     }
/* 141:142 */     this.b = 0;
/* 142:    */   }
/* 143:    */   
/* 144:    */   private void a(int paramInt1, int paramInt2, Object paramObject, int paramInt3)
/* 145:    */   {
/* 146:233 */     un localun = this.a[paramInt3];
/* 147:234 */     this.a[paramInt3] = new un(paramInt1, paramInt2, paramObject, localun);
/* 148:235 */     if (this.b++ >= this.c) {
/* 149:236 */       h(2 * this.a.length);
/* 150:    */     }
/* 151:    */   }
				static int f(int arg0) {return g(arg0);}
/* 152:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     um
 * JD-Core Version:    0.7.0.1
 */