package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bhv
/*   4:    */   extends bhp
/*   5:    */ {
/*   6: 12 */   private int a = -1;
/*   7:    */   
/*   8:    */   public bhv(int paramInt)
/*   9:    */   {
/*  10: 15 */     super(true);
/*  11: 16 */     this.a = paramInt;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public bhv()
/*  15:    */   {
/*  16: 20 */     super(false);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  20:    */   {
/*  21: 25 */     int i = paramRandom.nextInt(2);
/*  22: 26 */     if (this.a >= 0) {
/*  23: 27 */       i = this.a;
/*  24:    */     }
/*  25: 30 */     int j = paramRandom.nextInt(3) + 4;
/*  26:    */     
/*  27: 32 */     int k = 1;
/*  28: 33 */     if ((paramdt.getY() < 1) || (paramdt.getY() + j + 1 >= 256)) {
/*  29: 34 */       return false;
/*  30:    */     }
/*  31:    */     int i2;
/*  32: 37 */     for (int m = paramdt.getY(); m <= paramdt.getY() + 1 + j; m++)
/*  33:    */     {
/*  34: 38 */       int n = 3;
/*  35: 39 */       if (m <= paramdt.getY() + 3) {
/*  36: 40 */         n = 0;
/*  37:    */       }
/*  38: 42 */       for (int i1 = paramdt.getX() - n; (i1 <= paramdt.getX() + n) && (k != 0); i1++) {
/*  39: 43 */         for (i2 = paramdt.getZ() - n; (i2 <= paramdt.getZ() + n) && (k != 0); i2++) {
/*  40: 44 */           if ((m >= 0) && (m < 256))
/*  41:    */           {
/*  42: 45 */             ProtoBlock localatr3 = paramaqu.getBlock(new BlockPosition(i1, m, i2)).getProto();
/*  43: 46 */             if ((localatr3.getMaterial() != Material.air) && (localatr3.getMaterial() != Material.leaves)) {
/*  44: 47 */               k = 0;
/*  45:    */             }
/*  46:    */           }
/*  47:    */           else
/*  48:    */           {
/*  49: 50 */             k = 0;
/*  50:    */           }
/*  51:    */         }
/*  52:    */       }
/*  53:    */     }
/*  54: 56 */     if (k == 0) {
/*  55: 57 */       return false;
/*  56:    */     }
/*  57: 60 */     ProtoBlock localatr1 = paramaqu.getBlock(paramdt.down()).getProto();
/*  58: 61 */     if ((localatr1 != BlockList.dirt) && (localatr1 != BlockList.grass) && (localatr1 != BlockList.bw)) {
/*  59: 62 */       return false;
/*  60:    */     }
/*  61: 65 */     int n = paramdt.getY() + j;
/*  62: 66 */     if (i == 1) {
/*  63: 67 */       n = paramdt.getY() + j - 3;
/*  64:    */     }
/*  65: 69 */     for (int i1 = n; i1 <= paramdt.getY() + j; i1++)
/*  66:    */     {
/*  67: 70 */       i2 = 1;
/*  68: 71 */       if (i1 < paramdt.getY() + j) {
/*  69: 72 */         i2++;
/*  70:    */       }
/*  71: 74 */       if (i == 0) {
/*  72: 75 */         i2 = 3;
/*  73:    */       }
/*  74: 77 */       for (int i3 = paramdt.getX() - i2; i3 <= paramdt.getX() + i2; i3++) {
/*  75: 78 */         for (int i4 = paramdt.getZ() - i2; i4 <= paramdt.getZ() + i2; i4++)
/*  76:    */         {
/*  77: 79 */           int i5 = 5;
/*  78: 80 */           if (i3 == paramdt.getX() - i2) {
/*  79: 81 */             i5--;
/*  80:    */           }
/*  81: 83 */           if (i3 == paramdt.getX() + i2) {
/*  82: 84 */             i5++;
/*  83:    */           }
/*  84: 86 */           if (i4 == paramdt.getZ() - i2) {
/*  85: 87 */             i5 -= 3;
/*  86:    */           }
/*  87: 89 */           if (i4 == paramdt.getZ() + i2) {
/*  88: 90 */             i5 += 3;
/*  89:    */           }
/*  90: 93 */           if ((i == 0) || (i1 < paramdt.getY() + j))
/*  91:    */           {
/*  92: 94 */             if (((i3 == paramdt.getX() - i2) || (i3 == paramdt.getX() + i2)) && ((i4 == paramdt.getZ() - i2) || (i4 == paramdt.getZ() + i2))) {
/*  93:    */               continue;
/*  94:    */             }
/*  95: 97 */             if ((i3 == paramdt.getX() - (i2 - 1)) && (i4 == paramdt.getZ() - i2)) {
/*  96: 98 */               i5 = 1;
/*  97:    */             }
/*  98:100 */             if ((i3 == paramdt.getX() - i2) && (i4 == paramdt.getZ() - (i2 - 1))) {
/*  99:101 */               i5 = 1;
/* 100:    */             }
/* 101:104 */             if ((i3 == paramdt.getX() + (i2 - 1)) && (i4 == paramdt.getZ() - i2)) {
/* 102:105 */               i5 = 3;
/* 103:    */             }
/* 104:107 */             if ((i3 == paramdt.getX() + i2) && (i4 == paramdt.getZ() - (i2 - 1))) {
/* 105:108 */               i5 = 3;
/* 106:    */             }
/* 107:111 */             if ((i3 == paramdt.getX() - (i2 - 1)) && (i4 == paramdt.getZ() + i2)) {
/* 108:112 */               i5 = 7;
/* 109:    */             }
/* 110:114 */             if ((i3 == paramdt.getX() - i2) && (i4 == paramdt.getZ() + (i2 - 1))) {
/* 111:115 */               i5 = 7;
/* 112:    */             }
/* 113:118 */             if ((i3 == paramdt.getX() + (i2 - 1)) && (i4 == paramdt.getZ() + i2)) {
/* 114:119 */               i5 = 9;
/* 115:    */             }
/* 116:121 */             if ((i3 == paramdt.getX() + i2) && (i4 == paramdt.getZ() + (i2 - 1))) {
/* 117:122 */               i5 = 9;
/* 118:    */             }
/* 119:    */           }
/* 120:126 */           if ((i5 == 5) && (i1 < paramdt.getY() + j)) {
/* 121:127 */             i5 = 0;
/* 122:    */           }
/* 123:129 */           if ((i5 != 0) || (paramdt.getY() >= paramdt.getY() + j - 1))
/* 124:    */           {
/* 125:131 */             BlockPosition localdt = new BlockPosition(i3, i1, i4);
/* 126:132 */             if (!paramaqu.getBlock(localdt).getProto().m()) {
/* 127:133 */               setBlock(paramaqu, localdt, ProtoBlock.c(ProtoBlock.a(BlockList.bg) + i), i5);
/* 128:    */             }
/* 129:    */           }
/* 130:    */         }
/* 131:    */       }
/* 132:    */     }
/* 133:139 */     for (int i1 = 0; i1 < j; i1++)
/* 134:    */     {
/* 135:140 */       ProtoBlock localatr2 = paramaqu.getBlock(paramdt.up(i1)).getProto();
/* 136:142 */       if (!localatr2.m()) {
/* 137:143 */         setBlock(paramaqu, paramdt.up(i1), ProtoBlock.c(ProtoBlock.a(BlockList.bg) + i), 10);
/* 138:    */       }
/* 139:    */     }
/* 140:146 */     return true;
/* 141:    */   }
/* 142:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhv
 * JD-Core Version:    0.7.0.1
 */