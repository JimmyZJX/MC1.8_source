package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bhy
/*   4:    */   extends TerrainGenerator
/*   5:    */ {
/*   6:    */   private BlockType a;
/*   7:    */   
/*   8:    */   public bhy(BlockType paramatr)
/*   9:    */   {
/*  10: 17 */     this.a = paramatr;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  14:    */   {
/*  15: 22 */     paramdt = paramdt.offset(-8, 0, -8);
/*  16: 23 */     while ((paramdt.getY() > 5) && (paramaqu.isEmpty(paramdt))) {
/*  17: 24 */       paramdt = paramdt.down();
/*  18:    */     }
/*  19: 26 */     if (paramdt.getY() <= 4) {
/*  20: 27 */       return false;
/*  21:    */     }
/*  22: 30 */     paramdt = paramdt.down(4);
/*  23:    */     
/*  24: 32 */     boolean[] arrayOfBoolean = new boolean[2048];
/*  25:    */     
/*  26: 34 */     int i = paramRandom.nextInt(4) + 4;
/*  27: 35 */     for (int j = 0; j < i; j++)
/*  28:    */     {
/*  29: 36 */       double d1 = paramRandom.nextDouble() * 6.0D + 3.0D;
/*  30: 37 */       double d2 = paramRandom.nextDouble() * 4.0D + 2.0D;
/*  31: 38 */       double d3 = paramRandom.nextDouble() * 6.0D + 3.0D;
/*  32:    */       
/*  33: 40 */       double d4 = paramRandom.nextDouble() * (16.0D - d1 - 2.0D) + 1.0D + d1 / 2.0D;
/*  34: 41 */       double d5 = paramRandom.nextDouble() * (8.0D - d2 - 4.0D) + 2.0D + d2 / 2.0D;
/*  35: 42 */       double d6 = paramRandom.nextDouble() * (16.0D - d3 - 2.0D) + 1.0D + d3 / 2.0D;
/*  36: 44 */       for (int i2 = 1; i2 < 15; i2++) {
/*  37: 45 */         for (int i3 = 1; i3 < 15; i3++) {
/*  38: 46 */           for (int i4 = 1; i4 < 7; i4++)
/*  39:    */           {
/*  40: 47 */             double d7 = (i2 - d4) / (d1 / 2.0D);
/*  41: 48 */             double d8 = (i4 - d5) / (d2 / 2.0D);
/*  42: 49 */             double d9 = (i3 - d6) / (d3 / 2.0D);
/*  43: 50 */             double d10 = d7 * d7 + d8 * d8 + d9 * d9;
/*  44: 51 */             if (d10 < 1.0D) {
/*  45: 52 */               arrayOfBoolean[((i2 * 16 + i3) * 8 + i4)] = true;
/*  46:    */             }
/*  47:    */           }
/*  48:    */         }
/*  49:    */       }
/*  50:    */     }
/*  51:    */     int k;
/*  52:    */     int m;
/*  53:    */     Object localObject;
/*  54: 59 */     for (int j = 0; j < 16; j++) {
/*  55: 60 */       for (k = 0; k < 16; k++) {
/*  56: 61 */         for (m = 0; m < 8; m++)
/*  57:    */         {
/*  58: 62 */           int n = (!arrayOfBoolean[((j * 16 + k) * 8 + m)]) && (((j < 15) && (arrayOfBoolean[(((j + 1) * 16 + k) * 8 + m)])) || ((j > 0) && (arrayOfBoolean[(((j - 1) * 16 + k) * 8 + m)])) || ((k < 15) && (arrayOfBoolean[((j * 16 + (k + 1)) * 8 + m)])) || ((k > 0) && (arrayOfBoolean[((j * 16 + (k - 1)) * 8 + m)])) || ((m < 7) && (arrayOfBoolean[((j * 16 + k) * 8 + (m + 1))])) || ((m > 0) && (arrayOfBoolean[((j * 16 + k) * 8 + (m - 1))]))) ? 1 : 0;
/*  59: 71 */           if (n != 0)
/*  60:    */           {
/*  61: 72 */             localObject = paramaqu.getBlock(paramdt.offset(j, m, k)).getType().getMaterial();
/*  62: 73 */             if ((m >= 4) && (((Material)localObject).isLiquid())) {
/*  63: 74 */               return false;
/*  64:    */             }
/*  65: 76 */             if ((m < 4) && (!((Material)localObject).a()) && (paramaqu.getBlock(paramdt.offset(j, m, k)).getType() != this.a)) {
/*  66: 77 */               return false;
/*  67:    */             }
/*  68:    */           }
/*  69:    */         }
/*  70:    */       }
/*  71:    */     }
/*  72: 84 */     for (int j = 0; j < 16; j++) {
/*  73: 85 */       for (k = 0; k < 16; k++) {
/*  74: 86 */         for (m = 0; m < 8; m++) {
/*  75: 87 */           if (arrayOfBoolean[((j * 16 + k) * 8 + m)]) {
/*  76: 88 */             paramaqu.setBlock(paramdt.offset(j, m, k), m >= 4 ? BlockList.air.instance() : this.a.instance(), 2);
/*  77:    */           }
/*  78:    */         }
/*  79:    */       }
/*  80:    */     }
/*  81: 94 */     for (int j = 0; j < 16; j++) {
/*  82: 95 */       for (k = 0; k < 16; k++) {
/*  83: 96 */         for (m = 4; m < 8; m++) {
/*  84: 97 */           if (arrayOfBoolean[((j * 16 + k) * 8 + m)])
/*  85:    */           {
/*  86: 98 */             BlockPosition localdt = paramdt.offset(j, m - 1, k);
/*  87:100 */             if ((paramaqu.getBlock(localdt).getType() == BlockList.dirt) && (paramaqu.getLightLevel(EnumSkyBlock.SKY, paramdt.offset(j, m, k)) > 0))
/*  88:    */             {
/*  89:101 */               localObject = paramaqu.b(localdt);
/*  90:102 */               if (((arm)localObject).ak.getType() == BlockList.bw) {
/*  91:103 */                 paramaqu.setBlock(localdt, BlockList.bw.instance(), 2);
/*  92:    */               } else {
/*  93:105 */                 paramaqu.setBlock(localdt, BlockList.grass.instance(), 2);
/*  94:    */               }
/*  95:    */             }
/*  96:    */           }
/*  97:    */         }
/*  98:    */       }
/*  99:    */     }
/* 100:113 */     if (this.a.getMaterial() == Material.lava) {
/* 101:114 */       for (int j = 0; j < 16; j++) {
/* 102:115 */         for (k = 0; k < 16; k++) {
/* 103:116 */           for (m = 0; m < 8; m++)
/* 104:    */           {
/* 105:117 */             int i1 = (!arrayOfBoolean[((j * 16 + k) * 8 + m)]) && (((j < 15) && (arrayOfBoolean[(((j + 1) * 16 + k) * 8 + m)])) || ((j > 0) && (arrayOfBoolean[(((j - 1) * 16 + k) * 8 + m)])) || ((k < 15) && (arrayOfBoolean[((j * 16 + (k + 1)) * 8 + m)])) || ((k > 0) && (arrayOfBoolean[((j * 16 + (k - 1)) * 8 + m)])) || ((m < 7) && (arrayOfBoolean[((j * 16 + k) * 8 + (m + 1))])) || ((m > 0) && (arrayOfBoolean[((j * 16 + k) * 8 + (m - 1))]))) ? 1 : 0;
/* 106:126 */             if ((i1 != 0) && 
/* 107:127 */               ((m < 4) || (paramRandom.nextInt(2) != 0)) && (paramaqu.getBlock(paramdt.offset(j, m, k)).getType().getMaterial().a())) {
/* 108:128 */               paramaqu.setBlock(paramdt.offset(j, m, k), BlockList.stone.instance(), 2);
/* 109:    */             }
/* 110:    */           }
/* 111:    */         }
/* 112:    */       }
/* 113:    */     }
/* 114:136 */     if (this.a.getMaterial() == Material.water) {
/* 115:137 */       for (int j = 0; j < 16; j++) {
/* 116:138 */         for (k = 0; k < 16; k++)
/* 117:    */         {
/* 118:139 */           m = 4;
/* 119:140 */           if (paramaqu.v(paramdt.offset(j, m, k))) {
/* 120:141 */             paramaqu.setBlock(paramdt.offset(j, m, k), BlockList.aI.instance(), 2);
/* 121:    */           }
/* 122:    */         }
/* 123:    */       }
/* 124:    */     }
/* 125:147 */     return true;
/* 126:    */   }
/* 127:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhy
 * JD-Core Version:    0.7.0.1
 */