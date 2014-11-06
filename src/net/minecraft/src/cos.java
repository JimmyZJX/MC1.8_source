package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.BitSet;
/*   3:    */ import java.util.EnumSet;
/*   4:    */ import java.util.LinkedList;
/*   5:    */ import java.util.Queue;
/*   6:    */ import java.util.Set;
/*   7:    */ 
/*   8:    */ public class cos
/*   9:    */ {
/*  10: 20 */   private static final int a = (int)Math.pow(16.0D, 0.0D);
/*  11: 21 */   private static final int b = (int)Math.pow(16.0D, 1.0D);
/*  12: 22 */   private static final int c = (int)Math.pow(16.0D, 2.0D);
/*  13: 24 */   private final BitSet d = new BitSet(4096);
/*  14: 26 */   private static final int[] e = new int[1352];
/*  15:    */   
/*  16:    */   static
/*  17:    */   {
/*  18: 28 */     int i = 0;
/*  19: 29 */     int j = 15;
/*  20:    */     
/*  21: 31 */     int k = 0;
/*  22: 32 */     for (int m = 0; m < 16; m++) {
/*  23: 33 */       for (int n = 0; n < 16; n++) {
/*  24: 34 */         for (int i1 = 0; i1 < 16; i1++) {
/*  25: 35 */           if ((m == 0) || (m == 15) || (n == 0) || (n == 15) || (i1 == 0) || (i1 == 15)) {
/*  26: 36 */             e[(k++)] = a(m, n, i1);
/*  27:    */           }
/*  28:    */         }
/*  29:    */       }
/*  30:    */     }
/*  31:    */   }
/*  32:    */   
/*  33: 43 */   private int f = 4096;
/*  34:    */   
/*  35:    */   public void a(BlockPosition paramdt)
/*  36:    */   {
/*  37: 46 */     this.d.set(c(paramdt), true);
/*  38: 47 */     this.f -= 1;
/*  39:    */   }
/*  40:    */   
/*  41:    */   private static int c(BlockPosition paramdt)
/*  42:    */   {
/*  43: 51 */     return a(paramdt.getX() & 0xF, paramdt.getY() & 0xF, paramdt.getZ() & 0xF);
/*  44:    */   }
/*  45:    */   
/*  46:    */   private static int a(int paramInt1, int paramInt2, int paramInt3)
/*  47:    */   {
/*  48: 55 */     return paramInt1 << 0 | paramInt2 << 8 | paramInt3 << 4;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public cou a()
/*  52:    */   {
/*  53: 59 */     cou localcou = new cou();
/*  54: 61 */     if (4096 - this.f < 256) {
/*  55: 62 */       localcou.a(true);
/*  56: 63 */     } else if (this.f == 0) {
/*  57: 64 */       localcou.a(false);
/*  58:    */     } else {
/*  59: 66 */       for (int k : e) {
/*  60: 67 */         if (!this.d.get(k)) {
/*  61: 68 */           localcou.a(a(k));
/*  62:    */         }
/*  63:    */       }
/*  64:    */     }
/*  65: 73 */     return localcou;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public Set b(BlockPosition paramdt)
/*  69:    */   {
/*  70: 77 */     return a(c(paramdt));
/*  71:    */   }
/*  72:    */   
/*  73:    */   private Set a(int paramInt)
/*  74:    */   {
/*  75: 81 */     EnumSet localEnumSet = EnumSet.noneOf(EnumDirection.class);
/*  76:    */     
/*  77: 83 */     LinkedList localLinkedList = Lists.newLinkedList();
/*  78: 84 */     localLinkedList.add(Integer.valueOf(paramInt));
/*  79: 85 */     this.d.set(paramInt, true);
/*  80: 87 */     while (!localLinkedList.isEmpty())
/*  81:    */     {
/*  82: 88 */       int i = ((Integer)localLinkedList.poll()).intValue();
/*  83: 89 */       a(i, localEnumSet);
/*  84: 91 */       for (EnumDirection localej : EnumDirection.values())
/*  85:    */       {
/*  86: 92 */         int m = a(i, localej);
/*  87: 93 */         if ((m >= 0) && (!this.d.get(m)))
/*  88:    */         {
/*  89: 94 */           this.d.set(m, true);
/*  90: 95 */           localLinkedList.add(Integer.valueOf(m));
/*  91:    */         }
/*  92:    */       }
/*  93:    */     }
/*  94: 99 */     return localEnumSet;
/*  95:    */   }
/*  96:    */   
/*  97:    */   private void a(int paramInt, Set paramSet)
/*  98:    */   {
/*  99:103 */     int i = paramInt >> 0 & 0xF;
/* 100:104 */     if (i == 0) {
/* 101:105 */       paramSet.add(EnumDirection.WEST);
/* 102:106 */     } else if (i == 15) {
/* 103:107 */       paramSet.add(EnumDirection.EAST);
/* 104:    */     }
/* 105:110 */     int j = paramInt >> 8 & 0xF;
/* 106:111 */     if (j == 0) {
/* 107:112 */       paramSet.add(EnumDirection.DOWN);
/* 108:113 */     } else if (j == 15) {
/* 109:114 */       paramSet.add(EnumDirection.UP);
/* 110:    */     }
/* 111:117 */     int k = paramInt >> 4 & 0xF;
/* 112:118 */     if (k == 0) {
/* 113:119 */       paramSet.add(EnumDirection.NORTH);
/* 114:120 */     } else if (k == 15) {
/* 115:121 */       paramSet.add(EnumDirection.SOUTH);
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   private int a(int paramInt, EnumDirection paramej)
/* 120:    */   {
/* 121:126 */     switch (cot.a[paramej.ordinal()])
/* 122:    */     {
/* 123:    */     case 1: 
/* 124:129 */       if ((paramInt >> 8 & 0xF) == 0) {
/* 125:130 */         return -1;
/* 126:    */       }
/* 127:132 */       return paramInt - c;
/* 128:    */     case 2: 
/* 129:135 */       if ((paramInt >> 8 & 0xF) == 15) {
/* 130:136 */         return -1;
/* 131:    */       }
/* 132:138 */       return paramInt + c;
/* 133:    */     case 3: 
/* 134:141 */       if ((paramInt >> 4 & 0xF) == 0) {
/* 135:142 */         return -1;
/* 136:    */       }
/* 137:144 */       return paramInt - b;
/* 138:    */     case 4: 
/* 139:147 */       if ((paramInt >> 4 & 0xF) == 15) {
/* 140:148 */         return -1;
/* 141:    */       }
/* 142:150 */       return paramInt + b;
/* 143:    */     case 5: 
/* 144:153 */       if ((paramInt >> 0 & 0xF) == 0) {
/* 145:154 */         return -1;
/* 146:    */       }
/* 147:156 */       return paramInt - a;
/* 148:    */     case 6: 
/* 149:159 */       if ((paramInt >> 0 & 0xF) == 15) {
/* 150:160 */         return -1;
/* 151:    */       }
/* 152:162 */       return paramInt + a;
/* 153:    */     }
/* 154:164 */     return -1;
/* 155:    */   }
/* 156:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cos
 * JD-Core Version:    0.7.0.1
 */