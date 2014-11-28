package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.List;
/*   4:    */ 
/*   5:    */ public class aoi
/*   6:    */   implements aoo
/*   7:    */ {
/*   8:    */   private ItemStack a;
/*   9:    */   
/*  10:    */   public boolean a(ain paramain, World paramaqu)
/*  11:    */   {
/*  12: 22 */     this.a = null;
/*  13:    */     
/*  14: 24 */     int i = 0;
/*  15: 25 */     int j = 0;
/*  16: 26 */     int k = 0;
/*  17: 27 */     int m = 0;
/*  18: 28 */     int n = 0;
/*  19: 29 */     int i1 = 0;
/*  20:    */     Object localObject2;
/*  21: 31 */     for (int i2 = 0; i2 < paramain.getSize(); i2++)
/*  22:    */     {
/*  23: 32 */       localObject2 = paramain.get(i2);
/*  24: 33 */       if (localObject2 != null) {
/*  25: 37 */         if (((ItemStack)localObject2).getItem() == ItemList.H) {
/*  26: 38 */           j++;
/*  27: 39 */         } else if (((ItemStack)localObject2).getItem() == ItemList.cc) {
/*  28: 40 */           m++;
/*  29: 41 */         } else if (((ItemStack)localObject2).getItem() == ItemList.dye) {
/*  30: 42 */           k++;
/*  31: 43 */         } else if (((ItemStack)localObject2).getItem() == ItemList.paper) {
/*  32: 44 */           i++;
/*  33: 45 */         } else if (((ItemStack)localObject2).getItem() == ItemList.aT) {
/*  34: 47 */           n++;
/*  35: 48 */         } else if (((ItemStack)localObject2).getItem() == ItemList.diamond) {
/*  36: 50 */           n++;
/*  37: 51 */         } else if (((ItemStack)localObject2).getItem() == ItemList.bL) {
/*  38: 53 */           i1++;
/*  39: 54 */         } else if (((ItemStack)localObject2).getItem() == ItemList.G) {
/*  40: 56 */           i1++;
/*  41: 57 */         } else if (((ItemStack)localObject2).getItem() == ItemList.goldNugget) {
/*  42: 59 */           i1++;
/*  43: 60 */         } else if (((ItemStack)localObject2).getItem() == ItemList.skull) {
/*  44: 62 */           i1++;
/*  45:    */         } else {
/*  46: 64 */           return false;
/*  47:    */         }
/*  48:    */       }
/*  49:    */     }
/*  50: 67 */     n += k + i1;
/*  51: 69 */     if ((j > 3) || (i > 1)) {
/*  52: 70 */       return false;
/*  53:    */     }
/*  54:    */     Object localObject1;
/*  55: 74 */     if ((j >= 1) && (i == 1) && (n == 0))
/*  56:    */     {
/*  57: 75 */       this.a = new ItemStack(ItemList.cb);
/*  58: 76 */       if (m > 0)
/*  59:    */       {
/*  60: 77 */         localObject1 = new NBTTagCompound();
/*  61: 78 */         localObject2 = new NBTTagCompound();
/*  62: 79 */         fv localfv = new fv();
/*  63: 81 */         for (int i5 = 0; i5 < paramain.getSize(); i5++)
/*  64:    */         {
/*  65: 82 */           ItemStack localamj2 = paramain.get(i5);
/*  66: 83 */           if ((localamj2 != null) && (localamj2.getItem() == ItemList.cc)) {
/*  67: 87 */             if ((localamj2.hasTagCompound()) && (localamj2.getTagCompound().hasKey("Explosion", 10))) {
/*  68: 88 */               localfv.a(localamj2.getTagCompound().getCompoundTag("Explosion"));
/*  69:    */             }
/*  70:    */           }
/*  71:    */         }
/*  72: 92 */         ((NBTTagCompound)localObject2).setNBT("Explosions", localfv);
/*  73: 93 */         ((NBTTagCompound)localObject2).setByte("Flight", (byte)j);
/*  74: 94 */         ((NBTTagCompound)localObject1).setNBT("Fireworks", (NBTBase)localObject2);
/*  75: 95 */         this.a.setTagCompound((NBTTagCompound)localObject1);
/*  76:    */       }
/*  77: 97 */       return true;
/*  78:    */     }
/*  79:100 */     if ((j == 1) && (i == 0) && (m == 0) && (k > 0) && (i1 <= 1))
/*  80:    */     {
/*  81:101 */       this.a = new ItemStack(ItemList.cc);
/*  82:102 */       localObject1 = new NBTTagCompound();
/*  83:103 */       localObject2 = new NBTTagCompound();
/*  84:    */       
/*  85:105 */       byte b = 0;
/*  86:    */       
/*  87:107 */       ArrayList localArrayList = Lists.newArrayList();
/*  88:108 */       for (int i6 = 0; i6 < paramain.getSize(); i6++)
/*  89:    */       {
/*  90:109 */         ItemStack localamj3 = paramain.get(i6);
/*  91:110 */         if (localamj3 != null) {
/*  92:114 */           if (localamj3.getItem() == ItemList.dye) {
/*  93:115 */             localArrayList.add(Integer.valueOf(akw.a[(localamj3.getDamage2() & 0xF)]));
/*  94:116 */           } else if (localamj3.getItem() == ItemList.aT) {
/*  95:118 */             ((NBTTagCompound)localObject2).setBoolean("Flicker", true);
/*  96:119 */           } else if (localamj3.getItem() == ItemList.diamond) {
/*  97:121 */             ((NBTTagCompound)localObject2).setBoolean("Trail", true);
/*  98:122 */           } else if (localamj3.getItem() == ItemList.bL) {
/*  99:123 */             b = 1;
/* 100:124 */           } else if (localamj3.getItem() == ItemList.G) {
/* 101:125 */             b = 4;
/* 102:126 */           } else if (localamj3.getItem() == ItemList.goldNugget) {
/* 103:127 */             b = 2;
/* 104:128 */           } else if (localamj3.getItem() == ItemList.skull) {
/* 105:129 */             b = 3;
/* 106:    */           }
/* 107:    */         }
/* 108:    */       }
/* 109:132 */       int[] arrayOfInt2 = new int[localArrayList.size()];
/* 110:133 */       for (int i7 = 0; i7 < arrayOfInt2.length; i7++) {
/* 111:134 */         arrayOfInt2[i7] = ((Integer)localArrayList.get(i7)).intValue();
/* 112:    */       }
/* 113:136 */       ((NBTTagCompound)localObject2).setIntArray("Colors", arrayOfInt2);
/* 114:137 */       ((NBTTagCompound)localObject2).setByte("Type", b);
/* 115:138 */       ((NBTTagCompound)localObject1).setNBT("Explosion", (NBTBase)localObject2);
/* 116:139 */       this.a.setTagCompound((NBTTagCompound)localObject1);
/* 117:140 */       return true;
/* 118:    */     }
/* 119:143 */     if ((j == 0) && (i == 0) && (m == 1) && (k > 0) && (k == n))
/* 120:    */     {
/* 121:144 */       localObject1 = Lists.newArrayList();
/* 122:145 */       for (int i3 = 0; i3 < paramain.getSize(); i3++)
/* 123:    */       {
/* 124:146 */         ItemStack localamj1 = paramain.get(i3);
/* 125:147 */         if (localamj1 != null) {
/* 126:151 */           if (localamj1.getItem() == ItemList.dye)
/* 127:    */           {
/* 128:152 */             ((List)localObject1).add(Integer.valueOf(akw.a[(localamj1.getDamage2() & 0xF)]));
/* 129:    */           }
/* 130:153 */           else if (localamj1.getItem() == ItemList.cc)
/* 131:    */           {
/* 132:154 */             this.a = localamj1.k();
/* 133:155 */             this.a.stackSize = 1;
/* 134:    */           }
/* 135:    */         }
/* 136:    */       }
/* 137:158 */       int[] arrayOfInt1 = new int[((List)localObject1).size()];
/* 138:159 */       for (int i4 = 0; i4 < arrayOfInt1.length; i4++) {
/* 139:160 */         arrayOfInt1[i4] = ((Integer)((List)localObject1).get(i4)).intValue();
/* 140:    */       }
/* 141:162 */       if ((this.a != null) && (this.a.hasTagCompound()))
/* 142:    */       {
/* 143:163 */         NBTTagCompound localfn = this.a.getTagCompound().getCompoundTag("Explosion");
/* 144:164 */         if (localfn == null) {
/* 145:165 */           return false;
/* 146:    */         }
/* 147:167 */         localfn.setIntArray("FadeColors", arrayOfInt1);
/* 148:    */       }
/* 149:    */       else
/* 150:    */       {
/* 151:169 */         return false;
/* 152:    */       }
/* 153:171 */       return true;
/* 154:    */     }
/* 155:174 */     return false;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public ItemStack a(ain paramain)
/* 159:    */   {
/* 160:180 */     return this.a.k();
/* 161:    */   }
/* 162:    */   
/* 163:    */   public int a()
/* 164:    */   {
/* 165:185 */     return 10;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public ItemStack b()
/* 169:    */   {
/* 170:191 */     return this.a;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public ItemStack[] b(ain paramain)
/* 174:    */   {
/* 175:196 */     ItemStack[] arrayOfamj = new ItemStack[paramain.getSize()];
/* 176:198 */     for (int i = 0; i < arrayOfamj.length; i++)
/* 177:    */     {
/* 178:199 */       ItemStack localamj = paramain.get(i);
/* 179:200 */       if ((localamj != null) && (localamj.getItem().r())) {
/* 180:201 */         arrayOfamj[i] = new ItemStack(localamj.getItem().q());
/* 181:    */       }
/* 182:    */     }
/* 183:205 */     return arrayOfamj;
/* 184:    */   }
/* 185:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aoi
 * JD-Core Version:    0.7.0.1
 */