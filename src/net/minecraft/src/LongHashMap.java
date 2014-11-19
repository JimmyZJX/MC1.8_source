package net.minecraft.src;
/*   1:    */ public class LongHashMap
/*   2:    */ {
/*   3:    */   private transient LongHashMapEntry[] hashArray;
/*   4:    */   private transient int numHashElements;
/*   5:    */   private int maxIndex;
/*   6:    */   private int capacity;
/*   7:    */   private final float percentUseable;
/*   8:    */   private volatile transient int f;
/*   9:    */   
/*  10:    */   public LongHashMap()
/*  11:    */   {
/*  12: 20 */     this.percentUseable = 0.75F;
/*  13: 21 */     this.capacity = 3072;
/*  14: 22 */     this.hashArray = new LongHashMapEntry[4096];
/*  15: 23 */     this.maxIndex = (this.hashArray.length - 1);
/*  16:    */   }
/*  17:    */   
/*  18:    */   private static int getHashedKey(long paramLong)
/*  19:    */   {
/*  20: 27 */     return hash((int)(paramLong ^ paramLong >>> 32));
/*  21:    */   }
/*  22:    */   
/*  23:    */   private static int hash(int paramInt)
/*  24:    */   {
/*  25: 31 */     paramInt ^= paramInt >>> 20 ^ paramInt >>> 12;
/*  26: 32 */     return paramInt ^ paramInt >>> 7 ^ paramInt >>> 4;
/*  27:    */   }
/*  28:    */   
/*  29:    */   private static int getHashIndex(int paramInt1, int paramInt2)
/*  30:    */   {
/*  31: 36 */     return paramInt1 & paramInt2;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public int getNumHashElements()
/*  35:    */   {
/*  36: 40 */     return this.numHashElements;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public Object getValueByKey(long paramLong)
/*  40:    */   {
/*  41: 48 */     int i = getHashedKey(paramLong);
/*  42: 49 */     for (LongHashMapEntry localus = this.hashArray[getHashIndex(i, this.maxIndex)]; localus != null; localus = localus.nextEntry) {
/*  43: 50 */       if (localus.key == paramLong) {
/*  44: 51 */         return localus.value;
/*  45:    */       }
/*  46:    */     }
/*  47: 54 */     return null;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public boolean containsItem(long paramLong)
/*  51:    */   {
/*  52: 58 */     return getEntry(paramLong) != null;
/*  53:    */   }
/*  54:    */   
/*  55:    */   final LongHashMapEntry getEntry(long paramLong)
/*  56:    */   {
/*  57: 62 */     int i = getHashedKey(paramLong);
/*  58: 63 */     for (LongHashMapEntry localus = this.hashArray[getHashIndex(i, this.maxIndex)]; localus != null; localus = localus.nextEntry) {
/*  59: 64 */       if (localus.key == paramLong) {
/*  60: 65 */         return localus;
/*  61:    */       }
/*  62:    */     }
/*  63: 68 */     return null;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void add(long paramLong, Object paramObject)
/*  67:    */   {
/*  68: 72 */     int i = getHashedKey(paramLong);
/*  69: 73 */     int j = getHashIndex(i, this.maxIndex);
/*  70: 74 */     for (LongHashMapEntry localus = this.hashArray[j]; localus != null; localus = localus.nextEntry) {
/*  71: 75 */       if (localus.key == paramLong)
/*  72:    */       {
/*  73: 76 */         localus.value = paramObject;
/*  74: 77 */         return;
/*  75:    */       }
/*  76:    */     }
/*  77: 81 */     this.f += 1;
/*  78: 82 */     createKey(i, paramLong, paramObject, j);
/*  79:    */   }
/*  80:    */   
/*  81:    */   private void resizeTable(int paramInt)
/*  82:    */   {
/*  83: 87 */     LongHashMapEntry[] arrayOfus1 = this.hashArray;
/*  84: 88 */     int i = arrayOfus1.length;
/*  85: 89 */     if (i == 1073741824)
/*  86:    */     {
/*  87: 90 */       this.capacity = 2147483647;
/*  88: 91 */       return;
/*  89:    */     }
/*  90: 94 */     LongHashMapEntry[] arrayOfus2 = new LongHashMapEntry[paramInt];
/*  91: 95 */     copyHashTableTo(arrayOfus2);
/*  92: 96 */     this.hashArray = arrayOfus2;
/*  93: 97 */     this.maxIndex = (this.hashArray.length - 1);
/*  94: 98 */     this.capacity = ((int)(paramInt * this.percentUseable));
/*  95:    */   }
/*  96:    */   
/*  97:    */   private void copyHashTableTo(LongHashMapEntry[] paramArrayOfus)
/*  98:    */   {
/*  99:102 */     LongHashMapEntry[] arrayOfus = this.hashArray;
/* 100:103 */     int i = paramArrayOfus.length;
/* 101:104 */     for (int j = 0; j < arrayOfus.length; j++)
/* 102:    */     {
/* 103:105 */       LongHashMapEntry localObject = arrayOfus[j];
/* 104:106 */       if (localObject != null)
/* 105:    */       {
/* 106:107 */         arrayOfus[j] = null;
/* 107:    */         do
/* 108:    */         {
/* 109:109 */           LongHashMapEntry localus = ((LongHashMapEntry)localObject).nextEntry;
/* 110:110 */           int k = getHashIndex(((LongHashMapEntry)localObject).hash, i - 1);
/* 111:111 */           ((LongHashMapEntry)localObject).nextEntry = paramArrayOfus[k];
/* 112:112 */           paramArrayOfus[k] = localObject;
/* 113:113 */           localObject = localus;
/* 114:114 */         } while (localObject != null);
/* 115:    */       }
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   public Object remove(long paramLong)
/* 120:    */   {
/* 121:120 */     LongHashMapEntry localus = removeKey(paramLong);
/* 122:121 */     return localus == null ? null : localus.value;
/* 123:    */   }
/* 124:    */   
/* 125:    */   final LongHashMapEntry removeKey(long paramLong)
/* 126:    */   {
/* 127:125 */     int i = getHashedKey(paramLong);
/* 128:126 */     int j = getHashIndex(i, this.maxIndex);
/* 129:127 */     LongHashMapEntry localObject1 = this.hashArray[j];
/* 130:128 */     LongHashMapEntry localObject2 = localObject1;
/* 131:130 */     while (localObject2 != null)
/* 132:    */     {
/* 133:131 */       LongHashMapEntry localus = localObject2.nextEntry;
/* 134:132 */       if (localObject2.key == paramLong)
/* 135:    */       {
/* 136:133 */         this.f += 1;
/* 137:134 */         this.numHashElements -= 1;
/* 138:135 */         if (localObject1 == localObject2) {
/* 139:136 */           this.hashArray[j] = localus;
/* 140:    */         } else {
/* 141:138 */           localObject1.nextEntry = localus;
/* 142:    */         }
/* 143:140 */         return localObject2;
/* 144:    */       }
/* 145:142 */       localObject1 = localObject2;
/* 146:143 */       localObject2 = localus;
/* 147:    */     }
/* 148:146 */     return localObject2;
/* 149:    */   }
/* 150:    */   
/* 151:    */   private void createKey(int paramInt1, long paramLong, Object paramObject, int paramInt2)
/* 152:    */   {
/* 153:246 */     LongHashMapEntry localus = this.hashArray[paramInt2];
/* 154:247 */     this.hashArray[paramInt2] = new LongHashMapEntry(paramInt1, paramLong, paramObject, localus);
/* 155:248 */     if (this.numHashElements++ >= this.capacity) {
/* 156:249 */       resizeTable(2 * this.hashArray.length);
/* 157:    */     }
/* 158:    */   }
				static int getHashCode(long arg0) {return getHashedKey(arg0);}
/* 159:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ur
 * JD-Core Version:    0.7.0.1
 */