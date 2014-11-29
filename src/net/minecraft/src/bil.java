package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bil
/*   4:    */   extends bhc
/*   5:    */ {
/*   6:    */   public bil(boolean paramBoolean)
/*   7:    */   {
/*   8: 16 */     super(paramBoolean);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  12:    */   {
/*  13: 21 */     int localbof1 = paramRandom.nextInt(3) + paramRandom.nextInt(3) + 5;
/*  14:    */     
/*  15: 23 */     int i = 1;
/*  16: 24 */     if ((paramdt.getY() < 1) || (paramdt.getY() + localbof1 + 1 > 256)) {
/*  17: 25 */       return false;
/*  18:    */     }
/*  19: 28 */     for (int j = paramdt.getY(); j <= paramdt.getY() + 1 + localbof1; j++)
/*  20:    */     {
/*  21: 29 */       int k = 1;
/*  22: 30 */       if (j == paramdt.getY()) {
/*  23: 31 */         k = 0;
/*  24:    */       }
/*  25: 33 */       if (j >= paramdt.getY() + 1 + localbof1 - 2) {
/*  26: 34 */         k = 2;
/*  27:    */       }
/*  28: 36 */       for (int m = paramdt.getX() - k; (m <= paramdt.getX() + k) && (i != 0); m++) {
/*  29: 37 */         for (int n = paramdt.getZ() - k; (n <= paramdt.getZ() + k) && (i != 0); n++) {
/*  30: 38 */           if ((j >= 0) && (j < 256))
/*  31:    */           {
/*  32: 39 */             if (!canGrowInto(paramaqu.getBlock(new BlockPosition(m, j, n)).getType())) {
/*  33: 40 */               i = 0;
/*  34:    */             }
/*  35:    */           }
/*  36:    */           else {
/*  37: 43 */             i = 0;
/*  38:    */           }
/*  39:    */         }
/*  40:    */       }
/*  41:    */     }
/*  42: 49 */     if (i == 0) {
/*  43: 50 */       return false;
/*  44:    */     }
/*  45: 53 */     BlockType localatr = paramaqu.getBlock(paramdt.down()).getType();
/*  46: 54 */     if (((localatr != BlockList.grass) && (localatr != BlockList.dirt)) || (paramdt.getY() >= 256 - localbof1 - 1)) {
/*  47: 55 */       return false;
/*  48:    */     }
/*  49: 58 */     makeDirt(paramaqu, paramdt.down());
/*  50:    */     
/*  51: 60 */     EnumDirection localej = EnumHorizontalVertical.HORIZONTAL.getRandomDirection(paramRandom);
/*  52: 61 */     int m = localbof1 - paramRandom.nextInt(4) - 1;
/*  53: 62 */     int n = 3 - paramRandom.nextInt(3);
/*  54:    */     
/*  55: 64 */     int i1 = paramdt.getX();int i2 = paramdt.getZ();
/*  56: 65 */     int i3 = 0;
/*  57:    */     Object localObject3;
/*  58: 66 */     for (int i4 = 0; i4 < localbof1; i4++)
/*  59:    */     {
/*  60: 67 */       int localObject2 = paramdt.getY() + i4;
/*  61: 68 */       if ((i4 >= m) && (n > 0))
/*  62:    */       {
/*  63: 69 */         i1 += localej.g();
/*  64: 70 */         i2 += localej.i();
/*  65: 71 */         n--;
/*  66:    */       }
/*  67: 73 */       BlockPosition localdt1 = new BlockPosition(i1, localObject2, i2);
/*  68: 74 */       localObject3 = paramaqu.getBlock(localdt1).getType().getMaterial();
/*  69: 75 */       if ((localObject3 == Material.air) || (localObject3 == Material.leaves))
/*  70:    */       {
/*  71: 76 */         setBlock(paramaqu, localdt1, BlockList.log2, EnumWoodVariant.ACACIA.getIndex() - 4);
/*  72: 77 */         i3 = localObject2;
/*  73:    */       }
/*  74:    */     }
/*  75: 81 */     Object localObject1 = new BlockPosition(i1, i3, i2);
/*  76:    */     int i5;
/*  77: 82 */     for (int localObject2 = -3; localObject2 <= 3; localObject2++) {
/*  78: 83 */       for (i5 = -3; i5 <= 3; i5++) {
/*  79: 84 */         if ((Math.abs(localObject2) != 3) || (Math.abs(i5) != 3)) {
/*  80: 87 */           b(paramaqu, ((BlockPosition)localObject1).offset(localObject2, 0, i5));
/*  81:    */         }
/*  82:    */       }
/*  83:    */     }
/*  84: 91 */     localObject1 = ((BlockPosition)localObject1).up();
/*  85: 93 */     for (int localObject2 = -1; localObject2 <= 1; localObject2++) {
/*  86: 94 */       for (i5 = -1; i5 <= 1; i5++) {
/*  87: 95 */         b(paramaqu, ((BlockPosition)localObject1).offset(localObject2, 0, i5));
/*  88:    */       }
/*  89:    */     }
/*  90: 99 */     b(paramaqu, ((BlockPosition)localObject1).east(2));
/*  91:100 */     b(paramaqu, ((BlockPosition)localObject1).west(2));
/*  92:101 */     b(paramaqu, ((BlockPosition)localObject1).south(2));
/*  93:102 */     b(paramaqu, ((BlockPosition)localObject1).north(2));
/*  94:    */     
/*  95:    */ 
/*  96:105 */     i1 = paramdt.getX();
/*  97:106 */     i2 = paramdt.getZ();
/*  98:107 */     localObject1 = EnumHorizontalVertical.HORIZONTAL.getRandomDirection(paramRandom);
/*  99:108 */     if (localObject1 != localej)
/* 100:    */     {
/* 101:109 */       int localObject2 = m - paramRandom.nextInt(2) - 1;
/* 102:110 */       i5 = 1 + paramRandom.nextInt(3);
/* 103:    */       
/* 104:112 */       i3 = 0;
/* 105:    */       int i6;
/* 106:113 */       for (int localObject31 = localObject2; (localObject31 < localbof1) && (i5 > 0); i5--)
/* 107:    */       {
/* 108:114 */         if (localObject31 >= 1)
/* 109:    */         {
/* 110:117 */           i6 = paramdt.getY() + localObject31;
/* 111:118 */           i1 += ((EnumDirection)localObject1).g();
/* 112:119 */           i2 += ((EnumDirection)localObject1).i();
/* 113:120 */           BlockPosition localdt2 = new BlockPosition(i1, i6, i2);
/* 114:121 */           Material localbof2 = paramaqu.getBlock(localdt2).getType().getMaterial();
/* 115:122 */           if ((localbof2 == Material.air) || (localbof2 == Material.leaves))
/* 116:    */           {
/* 117:123 */             setBlock(paramaqu, localdt2, BlockList.log2, EnumWoodVariant.ACACIA.getIndex() - 4);
/* 118:124 */             i3 = i6;
/* 119:    */           }
/* 120:    */         }
/* 121:113 */         localObject31++;
/* 122:    */       }
/* 123:127 */       if (i3 > 0)
/* 124:    */       {
/* 125:128 */         localObject3 = new BlockPosition(i1, i3, i2);
/* 126:    */         int i7;
/* 127:129 */         for (i6 = -2; i6 <= 2; i6++) {
/* 128:130 */           for (i7 = -2; i7 <= 2; i7++) {
/* 129:131 */             if ((Math.abs(i6) != 2) || (Math.abs(i7) != 2)) {
/* 130:134 */               b(paramaqu, ((BlockPosition)localObject3).offset(i6, 0, i7));
/* 131:    */             }
/* 132:    */           }
/* 133:    */         }
/* 134:137 */         localObject3 = ((BlockPosition)localObject3).up();
/* 135:138 */         for (i6 = -1; i6 <= 1; i6++) {
/* 136:139 */           for (i7 = -1; i7 <= 1; i7++) {
/* 137:140 */             b(paramaqu, ((BlockPosition)localObject3).offset(i6, 0, i7));
/* 138:    */           }
/* 139:    */         }
/* 140:    */       }
/* 141:    */     }
/* 142:146 */     return true;
/* 143:    */   }
/* 144:    */   
/* 145:    */   private void b(World paramaqu, BlockPosition paramdt)
/* 146:    */   {
/* 147:150 */     Material localbof = paramaqu.getBlock(paramdt).getType().getMaterial();
/* 148:151 */     if ((localbof == Material.air) || (localbof == Material.leaves)) {
/* 149:152 */       setBlock(paramaqu, paramdt, BlockList.leaves2, 0);
/* 150:    */     }
/* 151:    */   }
/* 152:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bil
 * JD-Core Version:    0.7.0.1
 */