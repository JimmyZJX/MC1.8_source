package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class alf
/*   4:    */   extends Item
/*   5:    */ {
/*   6:    */   public int a(ItemStack paramamj, int paramInt)
/*   7:    */   {
/*   8: 14 */     if (paramInt == 1)
/*   9:    */     {
/*  10: 15 */       NBTBase localgd = a(paramamj, "Colors");
/*  11: 16 */       if ((localgd instanceof ft))
/*  12:    */       {
/*  13: 17 */         ft localft = (ft)localgd;
/*  14: 18 */         int[] arrayOfInt1 = localft.c();
/*  15: 19 */         if (arrayOfInt1.length == 1) {
/*  16: 20 */           return arrayOfInt1[0];
/*  17:    */         }
/*  18: 22 */         int i = 0;
/*  19: 23 */         int j = 0;
/*  20: 24 */         int k = 0;
/*  21: 25 */         for (int i1 : arrayOfInt1)
/*  22:    */         {
/*  23: 26 */           i += ((i1 & 0xFF0000) >> 16);
/*  24: 27 */           j += ((i1 & 0xFF00) >> 8);
/*  25: 28 */           k += ((i1 & 0xFF) >> 0);
/*  26:    */         }
/*  27: 30 */         i /= arrayOfInt1.length;
/*  28: 31 */         j /= arrayOfInt1.length;
/*  29: 32 */         k /= arrayOfInt1.length;
/*  30: 33 */         return i << 16 | j << 8 | k;
/*  31:    */       }
/*  32: 35 */       return 9079434;
/*  33:    */     }
/*  34: 37 */     return super.a(paramamj, paramInt);
/*  35:    */   }
/*  36:    */   
/*  37:    */   public static NBTBase a(ItemStack paramamj, String paramString)
/*  38:    */   {
/*  39: 41 */     if (paramamj.hasTagCompound())
/*  40:    */     {
/*  41: 42 */       NBTTagCompound localfn = paramamj.getTagCompound().getCompoundTag("Explosion");
/*  42: 43 */       if (localfn != null) {
/*  43: 44 */         return localfn.a(paramString);
/*  44:    */       }
/*  45:    */     }
/*  46: 47 */     return null;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void a(ItemStack paramamj, EntityPlayer paramahd, List<String> paramList, boolean paramBoolean)
/*  50:    */   {
/*  51: 52 */     if (paramamj.hasTagCompound())
/*  52:    */     {
/*  53: 53 */       NBTTagCompound localfn = paramamj.getTagCompound().getCompoundTag("Explosion");
/*  54: 54 */       if (localfn != null) {
/*  55: 55 */         a(localfn, paramList);
/*  56:    */       }
/*  57:    */     }
/*  58:    */   }
/*  59:    */   
/*  60:    */   public static void a(NBTTagCompound paramfn, List<String> paramList)
/*  61:    */   {
/*  62: 62 */     int i = paramfn.d("Type");
/*  63: 63 */     if ((i >= 0) && (i <= 4)) {
/*  64: 64 */       paramList.add(fi.a("item.fireworksCharge.type." + i).trim());
/*  65:    */     } else {
/*  66: 66 */       paramList.add(fi.a("item.fireworksCharge.type").trim());
/*  67:    */     }
/*  68: 71 */     int[] arrayOfInt1 = paramfn.l("Colors");
/*  70:    */     int i1;
/*  71:    */     int i2;
/*  72: 72 */     if (arrayOfInt1.length > 0)
/*  73:    */     {
/*  74: 73 */       int j = 1;
/*  75: 74 */       String str = "";
/*  76: 75 */       for (int n : arrayOfInt1)
/*  77:    */       {
/*  78: 76 */         if (j == 0) {
/*  79: 77 */           str = str + ", ";
/*  80:    */         }
/*  81: 79 */         j = 0;
/*  82:    */         
/*  83:    */ 
/*  84: 82 */         i1 = 0;
/*  85: 83 */         for (i2 = 0; i2 < akw.a.length; i2++) {
/*  86: 84 */           if (n == akw.a[i2])
/*  87:    */           {
/*  88: 85 */             i1 = 1;
/*  89: 86 */             str = str + fi.a(new StringBuilder().append("item.fireworksCharge.").append(EnumDyeColor.fromIndex(i2).d()).toString());
/*  90: 87 */             break;
/*  91:    */           }
/*  92:    */         }
/*  93: 90 */         if (i1 == 0) {
/*  94: 91 */           str = str + fi.a("item.fireworksCharge.customColor");
/*  95:    */         }
/*  96:    */       }
/*  97: 94 */       paramList.add(str);
/*  98:    */     }
/*  99: 98 */     int[] arrayOfInt2 = paramfn.l("FadeColors");
/* 100: 99 */     if (arrayOfInt2.length > 0)
/* 101:    */     {
/* 102:100 */       boolean bool1 = true;
/* 103:101 */       String localString = fi.a("item.fireworksCharge.fadeTo") + " ";
/* 104:102 */       for (int i4 : arrayOfInt2)
/* 105:    */       {
/* 106:103 */         if (!bool1) {
/* 107:104 */           localString = localString + ", ";
/* 108:    */         }
/* 109:106 */         bool1 = false;
/* 110:    */         
/* 111:    */ 
/* 112:109 */         i2 = 0;
/* 113:110 */         for (int i3 = 0; i3 < 16; i3++) {
/* 114:111 */           if (i4 == akw.a[i3])
/* 115:    */           {
/* 116:112 */             i2 = 1;
/* 117:113 */             localString = localString + fi.a(new StringBuilder().append("item.fireworksCharge.").append(EnumDyeColor.fromIndex(i3).d()).toString());
/* 118:114 */             break;
/* 119:    */           }
/* 120:    */         }
/* 121:117 */         if (i2 == 0) {
/* 122:118 */           localString = localString + fi.a("item.fireworksCharge.customColor");
/* 123:    */         }
/* 124:    */       }
/* 125:121 */       paramList.add(localString);
/* 126:    */     }
/* 127:125 */     boolean bool1 = paramfn.getBoolean("Trail");
/* 128:126 */     if (bool1) {
/* 129:127 */       paramList.add(fi.a("item.fireworksCharge.trail"));
/* 130:    */     }
/* 131:131 */     boolean bool2 = paramfn.getBoolean("Flicker");
/* 132:132 */     if (bool2) {
/* 133:133 */       paramList.add(fi.a("item.fireworksCharge.flicker"));
/* 134:    */     }
/* 135:    */   }
/* 136:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     alf
 * JD-Core Version:    0.7.0.1
 */