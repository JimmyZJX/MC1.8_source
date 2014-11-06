package net.minecraft.src;
/*   1:    */ public class bft
/*   2:    */ {
/*   3:    */   public static bfu a(NBTTagCompound paramfn)
/*   4:    */   {
/*   5: 17 */     int i = paramfn.getInteger("xPos");
/*   6: 18 */     int j = paramfn.getInteger("zPos");
/*   7:    */     
/*   8: 20 */     bfu localbfu = new bfu(i, j);
/*   9: 21 */     localbfu.g = paramfn.k("Blocks");
/*  10: 22 */     localbfu.f = new bfn(paramfn.k("Data"), 7);
/*  11: 23 */     localbfu.e = new bfn(paramfn.k("SkyLight"), 7);
/*  12: 24 */     localbfu.d = new bfn(paramfn.k("BlockLight"), 7);
/*  13: 25 */     localbfu.c = paramfn.k("HeightMap");
/*  14: 26 */     localbfu.b = paramfn.getBoolean("TerrainPopulated");
/*  15: 27 */     localbfu.h = paramfn.c("Entities", 10);
/*  16: 28 */     localbfu.i = paramfn.c("TileEntities", 10);
/*  17: 29 */     localbfu.j = paramfn.c("TileTicks", 10);
/*  18:    */     try
/*  19:    */     {
/*  20: 33 */       localbfu.a = paramfn.getLong("LastUpdate");
/*  21:    */     }
/*  22:    */     catch (ClassCastException localClassCastException)
/*  23:    */     {
/*  24: 35 */       localbfu.a = paramfn.getInteger("LastUpdate");
/*  25:    */     }
/*  26: 38 */     return localbfu;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public static void a(bfu parambfu, NBTTagCompound paramfn, arz paramarz)
/*  30:    */   {
/*  31: 42 */     paramfn.setInt("xPos", parambfu.k);
/*  32: 43 */     paramfn.setInt("zPos", parambfu.l);
/*  33: 44 */     paramfn.a("LastUpdate", parambfu.a);
/*  34: 45 */     int[] arrayOfInt = new int[parambfu.c.length];
/*  35: 46 */     for (int i = 0; i < parambfu.c.length; i++) {
/*  36: 47 */       arrayOfInt[i] = parambfu.c[i];
/*  37:    */     }
/*  38: 49 */     paramfn.setIntArray("HeightMap", arrayOfInt);
/*  39: 50 */     paramfn.setBoolean("TerrainPopulated", parambfu.b);
/*  40:    */     
/*  41: 52 */     fv localfv = new fv();
/*  42: 53 */     for (int j = 0; j < 8; j++)
/*  43:    */     {
/*  44: 55 */       int k = 1;
/*  45:    */       int i4;
/*  46: 56 */       for (int m = 0; (m < 16) && (k != 0); m++) {
/*  47: 57 */         for (int i1 = 0; (i1 < 16) && (k != 0); i1++) {
/*  48: 58 */           for (int i2 = 0; i2 < 16; i2++)
/*  49:    */           {
/*  50: 59 */             int i3 = m << 11 | i2 << 7 | i1 + (j << 4);
/*  51: 60 */             i4 = parambfu.g[i3];
/*  52: 61 */             if (i4 != 0)
/*  53:    */             {
/*  54: 62 */               k = 0;
/*  55: 63 */               break;
/*  56:    */             }
/*  57:    */           }
/*  58:    */         }
/*  59:    */       }
/*  60: 69 */       if (k == 0)
/*  61:    */       {
/*  62: 74 */         byte[] arrayOfByte2 = new byte[4096];
/*  63: 75 */         bff localbff1 = new bff();
/*  64: 76 */         bff localbff2 = new bff();
/*  65: 77 */         bff localbff3 = new bff();
/*  66: 79 */         for (i4 = 0; i4 < 16; i4++) {
/*  67: 80 */           for (int i5 = 0; i5 < 16; i5++) {
/*  68: 81 */             for (int i6 = 0; i6 < 16; i6++)
/*  69:    */             {
/*  70: 82 */               int i7 = i4 << 11 | i6 << 7 | i5 + (j << 4);
/*  71: 83 */               int i8 = parambfu.g[i7];
/*  72:    */               
/*  73: 85 */               arrayOfByte2[(i5 << 8 | i6 << 4 | i4)] = ((byte)(i8 & 0xFF));
/*  74: 86 */               localbff1.a(i4, i5, i6, parambfu.f.a(i4, i5 + (j << 4), i6));
/*  75: 87 */               localbff2.a(i4, i5, i6, parambfu.e.a(i4, i5 + (j << 4), i6));
/*  76: 88 */               localbff3.a(i4, i5, i6, parambfu.d.a(i4, i5 + (j << 4), i6));
/*  77:    */             }
/*  78:    */           }
/*  79:    */         }
/*  80: 93 */         NBTTagCompound localfn = new NBTTagCompound();
/*  81:    */         
/*  82: 95 */         localfn.setByte("Y", (byte)(j & 0xFF));
/*  83: 96 */         localfn.setByteArray("Blocks", arrayOfByte2);
/*  84: 97 */         localfn.setByteArray("Data", localbff1.a());
/*  85: 98 */         localfn.setByteArray("SkyLight", localbff2.a());
/*  86: 99 */         localfn.setByteArray("BlockLight", localbff3.a());
/*  87:    */         
/*  88:101 */         localfv.a(localfn);
/*  89:    */       }
/*  90:    */     }
/*  91:103 */     paramfn.setNBT("Sections", localfv);
/*  92:    */     
/*  93:    */ 
/*  94:106 */     byte[] arrayOfByte1 = new byte[256];
/*  95:107 */     for (int k = 0; k < 16; k++) {
/*  96:108 */       for (int n = 0; n < 16; n++) {
/*  97:109 */         arrayOfByte1[(n << 4 | k)] = ((byte)(paramarz.a(new BlockPosition(parambfu.k << 4 | k, 0, parambfu.l << 4 | n), arm.ad).az & 0xFF));
/*  98:    */       }
/*  99:    */     }
/* 100:112 */     paramfn.setByteArray("Biomes", arrayOfByte1);
/* 101:113 */     paramfn.setNBT("Entities", parambfu.h);
/* 102:114 */     paramfn.setNBT("TileEntities", parambfu.i);
/* 103:115 */     if (parambfu.j != null) {
/* 104:116 */       paramfn.setNBT("TileTicks", parambfu.j);
/* 105:    */     }
/* 106:    */   }
/* 107:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bft
 * JD-Core Version:    0.7.0.1
 */