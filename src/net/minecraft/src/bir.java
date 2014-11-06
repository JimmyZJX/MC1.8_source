package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bir
/*   4:    */   extends bhc
/*   5:    */ {
/*   6:    */   private final int a;
/*   7:    */   private final boolean b;
/*   8:    */   private final int c;
/*   9:    */   private final int d;
/*  10:    */   
/*  11:    */   public bir(boolean paramBoolean)
/*  12:    */   {
/*  13: 20 */     this(paramBoolean, 4, 0, 0, false);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public bir(boolean paramBoolean1, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean2)
/*  17:    */   {
/*  18: 24 */     super(paramBoolean1);
/*  19: 25 */     this.a = paramInt1;
/*  20: 26 */     this.c = paramInt2;
/*  21: 27 */     this.d = paramInt3;
/*  22: 28 */     this.b = paramBoolean2;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public boolean generate(World world, Random paramRandom, BlockPosition pos)
/*  26:    */   {
/*  27: 33 */     int i = paramRandom.nextInt(3) + this.a;
/*  28:    */     
/*  29: 35 */     int j = 1;
/*  30: 36 */     if ((pos.getY() < 1) || (pos.getY() + i + 1 > 256)) {
/*  31: 37 */       return false;
/*  32:    */     }
/*  33: 40 */     for (int k = pos.getY(); k <= pos.getY() + 1 + i; k++)
/*  34:    */     {
/*  35: 41 */       int m = 1;
/*  36: 42 */       if (k == pos.getY()) {
/*  37: 43 */         m = 0;
/*  38:    */       }
/*  39: 45 */       if (k >= pos.getY() + 1 + i - 2) {
/*  40: 46 */         m = 2;
/*  41:    */       }
/*  42: 48 */       for (int n = pos.getX() - m; (n <= pos.getX() + m) && (j != 0); n++) {
/*  43: 49 */         for (int i1 = pos.getZ() - m; (i1 <= pos.getZ() + m) && (j != 0); i1++) {
/*  44: 50 */           if ((k >= 0) && (k < 256))
/*  45:    */           {
/*  46: 51 */             if (!canGrowInto(world.getBlock(new BlockPosition(n, k, i1)).getProto())) {
/*  47: 52 */               j = 0;
/*  48:    */             }
/*  49:    */           }
/*  50:    */           else {
/*  51: 55 */             j = 0;
/*  52:    */           }
/*  53:    */         }
/*  54:    */       }
/*  55:    */     }
/*  56: 61 */     if (j == 0) {
/*  57: 62 */       return false;
/*  58:    */     }
/*  59: 65 */     ProtoBlock localatr1 = world.getBlock(pos.down()).getProto();
/*  60: 66 */     if (((localatr1 != BlockList.grass) && (localatr1 != BlockList.dirt) && (localatr1 != BlockList.ak)) || (pos.getY() >= 256 - i - 1)) {
/*  61: 67 */       return false;
/*  62:    */     }
/*  63: 70 */     makeDirt(world, pos.down());
/*  64:    */     
/*  65: 72 */     int m = 3;
/*  66: 73 */     int n = 0;
/*  67:    */     int i4;
/*  68:    */     int i5;
/*  69:    */     int i6;
/*  70:    */     BlockPosition localdt3;
/*  71:    */     Object localObject;
/*  72: 74 */     for (int i1 = pos.getY() - m + i; i1 <= pos.getY() + i; i1++)
/*  73:    */     {
/*  74: 75 */       int i2 = i1 - (pos.getY() + i);
/*  75: 76 */       i4 = n + 1 - i2 / 2;
/*  76: 77 */       for (i5 = pos.getX() - i4; i5 <= pos.getX() + i4; i5++)
/*  77:    */       {
/*  78: 78 */         i6 = i5 - pos.getX();
/*  79: 79 */         for (int i7 = pos.getZ() - i4; i7 <= pos.getZ() + i4; i7++)
/*  80:    */         {
/*  81: 80 */           int i8 = i7 - pos.getZ();
/*  82: 81 */           if ((Math.abs(i6) != i4) || (Math.abs(i8) != i4) || ((paramRandom.nextInt(2) != 0) && (i2 != 0)))
/*  83:    */           {
/*  84: 84 */             localdt3 = new BlockPosition(i5, i1, i7);
/*  85: 85 */             localObject = world.getBlock(localdt3).getProto();
/*  86: 86 */             if ((((ProtoBlock)localObject).getMaterial() == Material.air) || (((ProtoBlock)localObject).getMaterial() == Material.leaves) || (((ProtoBlock)localObject).getMaterial() == Material.l)) {
/*  87: 87 */               setBlock(world, localdt3, BlockList.leaves, this.d);
/*  88:    */             }
/*  89:    */           }
/*  90:    */         }
/*  91:    */       }
/*  92:    */     }
/*  93: 92 */     for (int i1 = 0; i1 < i; i1++)
/*  94:    */     {
/*  95: 93 */       ProtoBlock localatr2 = world.getBlock(pos.up(i1)).getProto();
/*  96: 94 */       if ((localatr2.getMaterial() == Material.air) || (localatr2.getMaterial() == Material.leaves) || (localatr2.getMaterial() == Material.l))
/*  97:    */       {
/*  98: 95 */         setBlock(world, pos.up(i1), BlockList.log, this.c);
/*  99: 96 */         if ((this.b) && (i1 > 0))
/* 100:    */         {
/* 101: 97 */           if ((paramRandom.nextInt(3) > 0) && (world.d(pos.offset(-1, i1, 0)))) {
/* 102: 98 */             setBlock(world, pos.offset(-1, i1, 0), BlockList.vine, bbv.S);
/* 103:    */           }
/* 104:100 */           if ((paramRandom.nextInt(3) > 0) && (world.d(pos.offset(1, i1, 0)))) {
/* 105:101 */             setBlock(world, pos.offset(1, i1, 0), BlockList.vine, bbv.T);
/* 106:    */           }
/* 107:103 */           if ((paramRandom.nextInt(3) > 0) && (world.d(pos.offset(0, i1, -1)))) {
/* 108:104 */             setBlock(world, pos.offset(0, i1, -1), BlockList.vine, bbv.Q);
/* 109:    */           }
/* 110:106 */           if ((paramRandom.nextInt(3) > 0) && (world.d(pos.offset(0, i1, 1)))) {
/* 111:107 */             setBlock(world, pos.offset(0, i1, 1), BlockList.vine, bbv.R);
/* 112:    */           }
/* 113:    */         }
/* 114:    */       }
/* 115:    */     }
/* 116:113 */     if (this.b)
/* 117:    */     {
/* 118:    */       int i3;
/* 119:114 */       for (int i1 = pos.getY() - 3 + i; i1 <= pos.getY() + i; i1++)
/* 120:    */       {
/* 121:115 */         i3 = i1 - (pos.getY() + i);
/* 122:116 */         i4 = 2 - i3 / 2;
/* 123:117 */         for (i5 = pos.getX() - i4; i5 <= pos.getX() + i4; i5++) {
/* 124:118 */           for (i6 = pos.getZ() - i4; i6 <= pos.getZ() + i4; i6++)
/* 125:    */           {
/* 126:119 */             BlockPosition localdt1 = new BlockPosition(i5, i1, i6);
/* 127:121 */             if (world.getBlock(localdt1).getProto().getMaterial() == Material.leaves)
/* 128:    */             {
/* 129:122 */               BlockPosition localdt2 = localdt1.west();
/* 130:123 */               localdt3 = localdt1.east();
/* 131:124 */               localObject = localdt1.north();
/* 132:125 */               BlockPosition localdt4 = localdt1.south();
/* 133:127 */               if ((paramRandom.nextInt(4) == 0) && (world.getBlock(localdt2).getProto().getMaterial() == Material.air)) {
/* 134:128 */                 a(world, localdt2, bbv.S);
/* 135:    */               }
/* 136:130 */               if ((paramRandom.nextInt(4) == 0) && (world.getBlock(localdt3).getProto().getMaterial() == Material.air)) {
/* 137:131 */                 a(world, localdt3, bbv.T);
/* 138:    */               }
/* 139:133 */               if ((paramRandom.nextInt(4) == 0) && (world.getBlock((BlockPosition)localObject).getProto().getMaterial() == Material.air)) {
/* 140:134 */                 a(world, (BlockPosition)localObject, bbv.Q);
/* 141:    */               }
/* 142:136 */               if ((paramRandom.nextInt(4) == 0) && (world.getBlock(localdt4).getProto().getMaterial() == Material.air)) {
/* 143:137 */                 a(world, localdt4, bbv.R);
/* 144:    */               }
/* 145:    */             }
/* 146:    */           }
/* 147:    */         }
/* 148:    */       }
/* 149:145 */       if ((paramRandom.nextInt(5) == 0) && (i > 5)) {
/* 150:146 */         for (int i1 = 0; i1 < 2; i1++) {
/* 151:147 */           for (i3 = 0; i3 < 4; i3++) {
/* 152:148 */             if (paramRandom.nextInt(4 - i1) == 0)
/* 153:    */             {
/* 154:149 */               i4 = paramRandom.nextInt(3);
/* 155:150 */               EnumDirection localej = EnumDirection.b(i3).d();
/* 156:    */               
/* 157:152 */               setBlock(world, pos.offset(localej.g(), i - 5 + i1, localej.i()), BlockList.bN, i4 << 2 | EnumDirection.b(i3).b());
/* 158:    */             }
/* 159:    */           }
/* 160:    */         }
/* 161:    */       }
/* 162:    */     }
/* 163:158 */     return true;
/* 164:    */   }
/* 165:    */   
/* 166:    */   private void a(World paramaqu, BlockPosition paramdt, int paramInt)
/* 167:    */   {
/* 168:162 */     setBlock(paramaqu, paramdt, BlockList.vine, paramInt);
/* 169:163 */     int i = 4;
/* 170:    */     
/* 171:165 */     paramdt = paramdt.down();
/* 172:166 */     while ((paramaqu.getBlock(paramdt).getProto().getMaterial() == Material.air) && (i > 0))
/* 173:    */     {
/* 174:167 */       setBlock(paramaqu, paramdt, BlockList.vine, paramInt);
/* 175:168 */       paramdt = paramdt.down();
/* 176:169 */       i--;
/* 177:    */     }
/* 178:    */   }
/* 179:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bir
 * JD-Core Version:    0.7.0.1
 */