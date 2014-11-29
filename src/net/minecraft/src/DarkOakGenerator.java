package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class DarkOakGenerator
/*   4:    */   extends bhc
/*   5:    */ {
/*   6:    */   public DarkOakGenerator(boolean paramBoolean)
/*   7:    */   {
/*   8: 16 */     super(paramBoolean);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean generate(World world, Random paramRandom, BlockPosition pos)
/*  12:    */   {
/*  13: 21 */     int h = paramRandom.nextInt(3) + paramRandom.nextInt(2) + 6;
/*  14:    */     
/*  15: 23 */     int flag = 1;
/*  16: 24 */     if ((pos.getY() < 1) || (pos.getY() + h + 1 > 256)) {
/*  17: 25 */       return false;
/*  18:    */     }
/*  19: 28 */     for (int y = pos.getY(); y <= pos.getY() + 1 + h; y++)
/*  20:    */     {
/*  21: 29 */       int m = 1;
/*  22: 30 */       if (y == pos.getY()) {
/*  23: 31 */         m = 0;
/*  24:    */       }
/*  25: 33 */       if (y >= pos.getY() + 1 + h - 2) {
/*  26: 34 */         m = 2;
/*  27:    */       }
/*  28: 36 */       for (int x = pos.getX() - m; (x <= pos.getX() + m) && (flag != 0); x++) {
/*  29: 37 */         for (int z = pos.getZ() - m; (z <= pos.getZ() + m) && (flag != 0); z++) {
/*  30: 38 */           if ((y >= 0) && (y < 256))
/*  31:    */           {
/*  32: 39 */             if (!canGrowInto(world.getBlock(new BlockPosition(x, y, z)).getType())) {
/*  33: 40 */               flag = 0;
/*  34:    */             }
/*  35:    */           }
/*  36:    */           else {
/*  37: 43 */             flag = 0;
/*  38:    */           }
/*  39:    */         }
/*  40:    */       }
/*  41:    */     }
/*  42: 49 */     if (flag == 0) {
/*  43: 50 */       return false;
/*  44:    */     }
/*  45: 53 */     BlockType blockUnder = world.getBlock(pos.down()).getType();
/*  46: 54 */     if (((blockUnder != BlockList.grass) && (blockUnder != BlockList.dirt)) || (pos.getY() >= 256 - h - 1)) {
/*  47: 55 */       return false;
/*  48:    */     }
/*  49: 58 */     makeDirt(world, pos.down());
/*  50: 59 */     makeDirt(world, pos.offset(1, -1, 0));
/*  51: 60 */     makeDirt(world, pos.offset(1, -1, 1));
/*  52: 61 */     makeDirt(world, pos.offset(0, -1, 1));
/*  53:    */     
/*  54: 63 */     EnumDirection slantDir = EnumHorizontalVertical.HORIZONTAL.getRandomDirection(paramRandom);
/*  55: 64 */     int slantHeight = h - paramRandom.nextInt(4);
/*  56: 65 */     int slantLength = 2 - paramRandom.nextInt(3);
/*  57:    */     
/*  58: 67 */     int xx = pos.getX();int zz = pos.getZ();
/*  59: 68 */     int yMax = 0;
/*  60:    */     int yy;
/*  61: 69 */     for (int dy = 0; dy < h; dy++)
/*  62:    */     {
/*  63: 70 */       yy = pos.getY() + dy;
/*  64: 71 */       if ((dy >= slantHeight) && (slantLength > 0))
/*  65:    */       {
/*  66: 72 */         xx += slantDir.g();
/*  67: 73 */         zz += slantDir.i();
/*  68: 74 */         slantLength--;
/*  69:    */       }
/*  70: 76 */       BlockPosition trunkPos = new BlockPosition(xx, yy, zz);
/*  71: 77 */       Material localbof = world.getBlock(trunkPos).getType().getMaterial();
/*  72: 78 */       if ((localbof == Material.air) || (localbof == Material.leaves))
/*  73:    */       {
/*  74: 79 */         setBlock(world, trunkPos, BlockList.log2, EnumWoodVariant.DARK_OAK.getIndex() - 4);
/*  75: 80 */         setBlock(world, trunkPos.east(), BlockList.log2, EnumWoodVariant.DARK_OAK.getIndex() - 4);
/*  76: 81 */         setBlock(world, trunkPos.south(), BlockList.log2, EnumWoodVariant.DARK_OAK.getIndex() - 4);
/*  77: 82 */         setBlock(world, trunkPos.east().south(), BlockList.log2, EnumWoodVariant.DARK_OAK.getIndex() - 4);
/*  78: 83 */         yMax = yy;
/*  79:    */       }
/*  80:    */     }
/*  81:    */     int dyMax;
/*  82: 87 */     for (int dx = -2; dx <= 0; dx++) {
/*  83: 88 */       for (int dz = -2; dz <= 0; dz++)
/*  84:    */       {
/*  85: 89 */         dyMax = -1;
/*  86: 90 */         makeLeaf(world, xx + dx, yMax + dyMax, zz + dz);
/*  87: 91 */         makeLeaf(world, 1 + xx - dx, yMax + dyMax, zz + dz);
/*  88: 92 */         makeLeaf(world, xx + dx, yMax + dyMax, 1 + zz - dz);
/*  89: 93 */         makeLeaf(world, 1 + xx - dx, yMax + dyMax, 1 + zz - dz);
/*  90: 94 */         if (((dx > -2) || (dz > -1)) && ((dx != -1) || (dz != -2)))
/*  91:    */         {
/*  92: 97 */           dyMax = 1;
/*  93: 98 */           makeLeaf(world, xx + dx, yMax + dyMax, zz + dz);
/*  94: 99 */           makeLeaf(world, 1 + xx - dx, yMax + dyMax, zz + dz);
/*  95:100 */           makeLeaf(world, xx + dx, yMax + dyMax, 1 + zz - dz);
/*  96:101 */           makeLeaf(world, 1 + xx - dx, yMax + dyMax, 1 + zz - dz);
/*  97:    */         }
/*  98:    */       }
/*  99:    */     }
/* 100:104 */     if (paramRandom.nextBoolean())
/* 101:    */     {
/* 102:105 */       makeLeaf(world, xx, yMax + 2, zz);
/* 103:106 */       makeLeaf(world, xx + 1, yMax + 2, zz);
/* 104:107 */       makeLeaf(world, xx + 1, yMax + 2, zz + 1);
/* 105:108 */       makeLeaf(world, xx, yMax + 2, zz + 1);
/* 106:    */     }
/* 107:110 */     for (int dx = -3; dx <= 4; dx++) {
/* 108:111 */       for (int dz = -3; dz <= 4; dz++) {
/* 109:112 */         if (((dx != -3) || (dz != -3)) && ((dx != -3) || (dz != 4)) && ((dx != 4) || (dz != -3)) && ((dx != 4) || (dz != 4))) {
/* 110:115 */           if ((Math.abs(dx) < 3) || (Math.abs(dz) < 3)) {
/* 111:118 */             makeLeaf(world, xx + dx, yMax, zz + dz);
/* 112:    */           }
/* 113:    */         }
/* 114:    */       }
/* 115:    */     }
/* 116:123 */     for (int dx = -1; dx <= 2; dx++) {
/* 117:124 */       for (int dz = -1; dz <= 2; dz++) {
/* 118:125 */         if ((dx < 0) || (dx > 1) || (dz < 0) || (dz > 1)) {
/* 119:128 */           if (paramRandom.nextInt(3) <= 0)
/* 120:    */           {
/* 121:131 */             dyMax = paramRandom.nextInt(3) + 2;
/* 122:132 */             for (int dy = 0; dy < dyMax; dy++) {
/* 123:133 */               setBlock(world, new BlockPosition(pos.getX() + dx, yMax - dy - 1, pos.getZ() + dz), BlockList.log2, EnumWoodVariant.DARK_OAK.getIndex() - 4);
/* 124:    */             }
/* 125:    */             int dy2;
/* 126:135 */             for (int dx2 = -1; dx2 <= 1; dx2++) {
/* 127:136 */               for (dy2 = -1; dy2 <= 1; dy2++) {
/* 128:137 */                 makeLeaf(world, xx + dx + dx2, yMax - 0, zz + dz + dy2);
/* 129:    */               }
/* 130:    */             }
/* 131:140 */             for (int i8 = -2; i8 <= 2; i8++) {
/* 132:141 */               for (dy2 = -2; dy2 <= 2; dy2++) {
/* 133:142 */                 if ((Math.abs(i8) != 2) || (Math.abs(dy2) != 2)) {
/* 134:145 */                   makeLeaf(world, xx + dx + i8, yMax - 1, zz + dz + dy2);
/* 135:    */                 }
/* 136:    */               }
/* 137:    */             }
/* 138:    */           }
/* 139:    */         }
/* 140:    */       }
/* 141:    */     }
/* 142:152 */     return true;
/* 143:    */   }
/* 144:    */   
/* 145:    */   private void makeLeaf(World paramaqu, int paramInt1, int paramInt2, int paramInt3)
/* 146:    */   {
/* 147:156 */     BlockType localatr = paramaqu.getBlock(new BlockPosition(paramInt1, paramInt2, paramInt3)).getType();
/* 148:157 */     if (localatr.getMaterial() == Material.air) {
/* 149:158 */       setBlock(paramaqu, new BlockPosition(paramInt1, paramInt2, paramInt3), BlockList.leaves2, 1);
/* 150:    */     }
/* 151:    */   }
/* 152:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bij
 * JD-Core Version:    0.7.0.1
 */