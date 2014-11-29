package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bip
/*   4:    */   extends bhc
/*   5:    */ {
/*   6:    */   public bip()
/*   7:    */   {
/*   8: 14 */     super(false);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  12:    */   {
/*  13: 19 */     int i = paramRandom.nextInt(4) + 5;
/*  14: 20 */     while (paramaqu.getBlock(paramdt.down()).getType().getMaterial() == Material.water) {
/*  15: 21 */       paramdt = paramdt.down();
/*  16:    */     }
/*  17: 24 */     int j = 1;
/*  18: 25 */     if ((paramdt.getY() < 1) || (paramdt.getY() + i + 1 > 256)) {
/*  19: 26 */       return false;
/*  20:    */     }
/*  21:    */     int n;
/*  22:    */     int i2;
/*  23: 29 */     for (int k = paramdt.getY(); k <= paramdt.getY() + 1 + i; k++)
/*  24:    */     {
/*  25: 30 */       int m = 1;
/*  26: 31 */       if (k == paramdt.getY()) {
/*  27: 32 */         m = 0;
/*  28:    */       }
/*  29: 34 */       if (k >= paramdt.getY() + 1 + i - 2) {
/*  30: 35 */         m = 3;
/*  31:    */       }
/*  32: 37 */       for (n = paramdt.getX() - m; (n <= paramdt.getX() + m) && (j != 0); n++) {
/*  33: 38 */         for (i2 = paramdt.getZ() - m; (i2 <= paramdt.getZ() + m) && (j != 0); i2++) {
/*  34: 39 */           if ((k >= 0) && (k < 256))
/*  35:    */           {
/*  36: 40 */             BlockType localatr3 = paramaqu.getBlock(new BlockPosition(n, k, i2)).getType();
/*  37: 41 */             if ((localatr3.getMaterial() != Material.air) && (localatr3.getMaterial() != Material.leaves)) {
/*  38: 42 */               if ((localatr3 == BlockList.water) || (localatr3 == BlockList.flowingWater))
/*  39:    */               {
/*  40: 43 */                 if (k > paramdt.getY()) {
/*  41: 44 */                   j = 0;
/*  42:    */                 }
/*  43:    */               }
/*  44:    */               else {
/*  45: 47 */                 j = 0;
/*  46:    */               }
/*  47:    */             }
/*  48:    */           }
/*  49:    */           else
/*  50:    */           {
/*  51: 51 */             j = 0;
/*  52:    */           }
/*  53:    */         }
/*  54:    */       }
/*  55:    */     }
/*  56: 57 */     if (j == 0) {
/*  57: 58 */       return false;
/*  58:    */     }
/*  59: 61 */     BlockType localatr1 = paramaqu.getBlock(paramdt.down()).getType();
/*  60: 62 */     if (((localatr1 != BlockList.grass) && (localatr1 != BlockList.dirt)) || (paramdt.getY() >= 256 - i - 1)) {
/*  61: 63 */       return false;
/*  62:    */     }
/*  63: 66 */     makeDirt(paramaqu, paramdt.down());
/*  64:    */     int i3;
/*  65:    */     int i4;
/*  66:    */     BlockPosition localdt3;
/*  67: 68 */     for (int m = paramdt.getY() - 3 + i; m <= paramdt.getY() + i; m++)
/*  68:    */     {
/*  69: 69 */       n = m - (paramdt.getY() + i);
/*  70: 70 */       i2 = 2 - n / 2;
/*  71: 71 */       for (i3 = paramdt.getX() - i2; i3 <= paramdt.getX() + i2; i3++)
/*  72:    */       {
/*  73: 72 */         i4 = i3 - paramdt.getX();
/*  74: 73 */         for (int i5 = paramdt.getZ() - i2; i5 <= paramdt.getZ() + i2; i5++)
/*  75:    */         {
/*  76: 74 */           int i6 = i5 - paramdt.getZ();
/*  77: 75 */           if ((Math.abs(i4) != i2) || (Math.abs(i6) != i2) || ((paramRandom.nextInt(2) != 0) && (n != 0)))
/*  78:    */           {
/*  79: 78 */             localdt3 = new BlockPosition(i3, m, i5);
/*  80: 79 */             if (!paramaqu.getBlock(localdt3).getType().m()) {
/*  81: 80 */               setBlock(paramaqu, localdt3, BlockList.leaves);
/*  82:    */             }
/*  83:    */           }
/*  84:    */         }
/*  85:    */       }
/*  86:    */     }
/*  87: 86 */     for (int m = 0; m < i; m++)
/*  88:    */     {
/*  89: 87 */       BlockType localatr2 = paramaqu.getBlock(paramdt.up(m)).getType();
/*  90: 88 */       if ((localatr2.getMaterial() == Material.air) || (localatr2.getMaterial() == Material.leaves) || (localatr2 == BlockList.flowingWater) || (localatr2 == BlockList.water)) {
/*  91: 89 */         setBlock(paramaqu, paramdt.up(m), BlockList.log);
/*  92:    */       }
/*  93:    */     }
/*  94: 93 */     for (int m = paramdt.getY() - 3 + i; m <= paramdt.getY() + i; m++)
/*  95:    */     {
/*  96: 94 */       int i1 = m - (paramdt.getY() + i);
/*  97: 95 */       i2 = 2 - i1 / 2;
/*  98: 96 */       for (i3 = paramdt.getX() - i2; i3 <= paramdt.getX() + i2; i3++) {
/*  99: 97 */         for (i4 = paramdt.getZ() - i2; i4 <= paramdt.getZ() + i2; i4++)
/* 100:    */         {
/* 101: 98 */           BlockPosition localdt1 = new BlockPosition(i3, m, i4);
/* 102:100 */           if (paramaqu.getBlock(localdt1).getType().getMaterial() == Material.leaves)
/* 103:    */           {
/* 104:101 */             BlockPosition localdt2 = localdt1.west();
/* 105:102 */             localdt3 = localdt1.east();
/* 106:103 */             BlockPosition localdt4 = localdt1.north();
/* 107:104 */             BlockPosition localdt5 = localdt1.south();
/* 108:106 */             if ((paramRandom.nextInt(4) == 0) && (paramaqu.getBlock(localdt2).getType().getMaterial() == Material.air)) {
/* 109:107 */               a(paramaqu, localdt2, bbv.S);
/* 110:    */             }
/* 111:109 */             if ((paramRandom.nextInt(4) == 0) && (paramaqu.getBlock(localdt3).getType().getMaterial() == Material.air)) {
/* 112:110 */               a(paramaqu, localdt3, bbv.T);
/* 113:    */             }
/* 114:112 */             if ((paramRandom.nextInt(4) == 0) && (paramaqu.getBlock(localdt4).getType().getMaterial() == Material.air)) {
/* 115:113 */               a(paramaqu, localdt4, bbv.Q);
/* 116:    */             }
/* 117:115 */             if ((paramRandom.nextInt(4) == 0) && (paramaqu.getBlock(localdt5).getType().getMaterial() == Material.air)) {
/* 118:116 */               a(paramaqu, localdt5, bbv.R);
/* 119:    */             }
/* 120:    */           }
/* 121:    */         }
/* 122:    */       }
/* 123:    */     }
/* 124:122 */     return true;
/* 125:    */   }
/* 126:    */   
/* 127:    */   private void a(World paramaqu, BlockPosition paramdt, int paramInt)
/* 128:    */   {
/* 129:126 */     setBlock(paramaqu, paramdt, BlockList.vine, paramInt);
/* 130:127 */     int i = 4;
/* 131:    */     
/* 132:129 */     paramdt = paramdt.down();
/* 133:130 */     while ((paramaqu.getBlock(paramdt).getType().getMaterial() == Material.air) && (i > 0))
/* 134:    */     {
/* 135:131 */       setBlock(paramaqu, paramdt, BlockList.vine, paramInt);
/* 136:132 */       paramdt = paramdt.down();
/* 137:133 */       i--;
/* 138:    */     }
/* 139:    */   }
/* 140:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bip
 * JD-Core Version:    0.7.0.1
 */