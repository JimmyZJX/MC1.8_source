package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Random;
/*   6:    */ 
/*   7:    */ public class bmy
/*   8:    */ {
/*   9:    */   public static void a()
/*  10:    */   {
/*  11: 35 */     bmq.a(bna.class, "ViBH");
/*  12: 36 */     bmq.a(bnb.class, "ViDF");
/*  13: 37 */     bmq.a(bnc.class, "ViF");
/*  14: 38 */     bmq.a(bnd.class, "ViL");
/*  15: 39 */     bmq.a(bnf.class, "ViPH");
/*  16: 40 */     bmq.a(bng.class, "ViSH");
/*  17: 41 */     bmq.a(bnh.class, "ViSmH");
/*  18: 42 */     bmq.a(bni.class, "ViST");
/*  19: 43 */     bmq.a(bnj.class, "ViS");
/*  20: 44 */     bmq.a(bnk.class, "ViStart");
/*  21: 45 */     bmq.a(bnl.class, "ViSR");
/*  22: 46 */     bmq.a(bnm.class, "ViTRH");
/*  23: 47 */     bmq.a(bnp.class, "ViW");
/*  24:    */   }
/*  25:    */   
/*  26:    */   public static List<bne> a(Random paramRandom, int paramInt)
/*  27:    */   {
/*  28: 72 */     ArrayList<bne> localArrayList = Lists.newArrayList();
/*  29:    */     
/*  30: 74 */     localArrayList.add(new bne(bng.class, 4, MathUtils.nextInt(paramRandom, 2 + paramInt, 4 + paramInt * 2)));
/*  31: 75 */     localArrayList.add(new bne(bni.class, 20, MathUtils.nextInt(paramRandom, 0 + paramInt, 1 + paramInt)));
/*  32: 76 */     localArrayList.add(new bne(bna.class, 20, MathUtils.nextInt(paramRandom, 0 + paramInt, 2 + paramInt)));
/*  33: 77 */     localArrayList.add(new bne(bnh.class, 3, MathUtils.nextInt(paramRandom, 2 + paramInt, 5 + paramInt * 3)));
/*  34: 78 */     localArrayList.add(new bne(bnf.class, 15, MathUtils.nextInt(paramRandom, 0 + paramInt, 2 + paramInt)));
/*  35: 79 */     localArrayList.add(new bne(bnb.class, 3, MathUtils.nextInt(paramRandom, 1 + paramInt, 4 + paramInt)));
/*  36: 80 */     localArrayList.add(new bne(bnc.class, 3, MathUtils.nextInt(paramRandom, 2 + paramInt, 4 + paramInt * 2)));
/*  37: 81 */     localArrayList.add(new bne(bnj.class, 15, MathUtils.nextInt(paramRandom, 0, 1 + paramInt)));
/*  38: 82 */     localArrayList.add(new bne(bnm.class, 8, MathUtils.nextInt(paramRandom, 0 + paramInt, 3 + paramInt * 2)));
/*  39:    */     
/*  40:    */ 
/*  41: 85 */     Iterator<bne> localIterator = localArrayList.iterator();
/*  42: 86 */     while (localIterator.hasNext()) {
/*  43: 87 */       if (((bne)localIterator.next()).d == 0) {
/*  44: 88 */         localIterator.remove();
/*  45:    */       }
/*  46:    */     }
/*  47: 92 */     return localArrayList;
/*  48:    */   }
/*  49:    */   
/*  50:    */   private static int a(List<bne> paramList)
/*  51:    */   {
/*  52: 96 */     int i = 0;
/*  53: 97 */     int j = 0;
/*  54: 98 */     for (bne localbne : paramList)
/*  55:    */     {
/*  56: 99 */       if ((localbne.d > 0) && (localbne.c < localbne.d)) {
/*  57:100 */         i = 1;
/*  58:    */       }
/*  59:102 */       j += localbne.b;
/*  60:    */     }
/*  61:104 */     return i != 0 ? j : -1;
/*  62:    */   }
/*  63:    */   
/*  64:    */   private static bnn a(bnk parambnk, bne parambne, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*  65:    */   {
/*  66:108 */     Class localClass = parambne.a;
/*  67:109 */     bnn localObject = null;
/*  68:111 */     if (localClass == bng.class) {
/*  69:112 */       localObject = bng.a(parambnk, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  70:113 */     } else if (localClass == bni.class) {
/*  71:114 */       localObject = bni.a(parambnk, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  72:115 */     } else if (localClass == bna.class) {
/*  73:116 */       localObject = bna.a(parambnk, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  74:117 */     } else if (localClass == bnh.class) {
/*  75:118 */       localObject = bnh.a(parambnk, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  76:119 */     } else if (localClass == bnf.class) {
/*  77:120 */       localObject = bnf.a(parambnk, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  78:121 */     } else if (localClass == bnb.class) {
/*  79:122 */       localObject = bnb.a(parambnk, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  80:123 */     } else if (localClass == bnc.class) {
/*  81:124 */       localObject = bnc.a(parambnk, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  82:125 */     } else if (localClass == bnj.class) {
/*  83:126 */       localObject = bnj.a(parambnk, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  84:127 */     } else if (localClass == bnm.class) {
/*  85:128 */       localObject = bnm.a(parambnk, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  86:    */     }
/*  87:131 */     return localObject;
/*  88:    */   }
/*  89:    */   
/*  90:    */   private static bnn c(bnk parambnk, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*  91:    */   {
/*  92:135 */     int i = a(parambnk.e);
/*  93:136 */     if (i <= 0) {
/*  94:137 */       return null;
/*  95:    */     }
/*  96:140 */     int j = 0;
/*  97:    */     int k;
/*  98:141 */     while (j < 5)
/*  99:    */     {
/* 100:142 */       j++;
/* 101:    */       
/* 102:144 */       k = paramRandom.nextInt(i);
/* 103:145 */       for (bne localbne : parambnk.e)
/* 104:    */       {
/* 105:146 */         k -= localbne.b;
/* 106:147 */         if (k < 0)
/* 107:    */         {
/* 108:148 */           if ((!localbne.a(paramInt4)) || ((localbne == parambnk.d) && (parambnk.e.size() > 1))) {
/* 109:    */             break;
/* 110:    */           }
/* 111:152 */           bnn localbnn = a(parambnk, localbne, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/* 112:153 */           if (localbnn != null)
/* 113:    */           {
/* 114:154 */             localbne.c += 1;
/* 115:155 */             parambnk.d = localbne;
/* 116:157 */             if (!localbne.a()) {
/* 117:158 */               parambnk.e.remove(localbne);
/* 118:    */             }
/* 119:160 */             return localbnn;
/* 120:    */           }
/* 121:    */         }
/* 122:    */       }
/* 123:    */     }
/* 124:167 */     bjb localbjb = bnd.a(parambnk, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej);
/* 125:168 */     if (localbjb != null) {
/* 126:169 */       return new bnd(parambnk, paramInt4, paramRandom, localbjb, paramej);
/* 127:    */     }
/* 128:172 */     return null;
/* 129:    */   }
/* 130:    */   
/* 131:    */   private static bms d(bnk parambnk, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/* 132:    */   {
/* 133:176 */     if (paramInt4 > 50) {
/* 134:177 */       return null;
/* 135:    */     }
/* 136:179 */     if ((Math.abs(paramInt1 - parambnk.c().a) > 112) || (Math.abs(paramInt3 - parambnk.c().c) > 112)) {
/* 137:180 */       return null;
/* 138:    */     }
/* 139:183 */     bnn localbnn = c(parambnk, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4 + 1);
/* 140:184 */     if (localbnn != null)
/* 141:    */     {
/* 142:185 */       int i = (localbnn.l.a + localbnn.l.d) / 2;
/* 143:186 */       int j = (localbnn.l.c + localbnn.l.f) / 2;
/* 144:187 */       int k = localbnn.l.d - localbnn.l.a;
/* 145:188 */       int m = localbnn.l.f - localbnn.l.c;
/* 146:189 */       int n = k > m ? k : m;
/* 147:190 */       if (parambnk.e().a(i, j, n / 2 + 4, bmw.d))
/* 148:    */       {
/* 149:191 */         paramList.add(localbnn);
/* 150:192 */         parambnk.f.add(localbnn);
/* 151:193 */         return localbnn;
/* 152:    */       }
/* 153:    */     }
/* 154:196 */     return null;
/* 155:    */   }
/* 156:    */   
/* 157:    */   private static bms e(bnk parambnk, List<bnl> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/* 158:    */   {
/* 159:200 */     if (paramInt4 > 3 + parambnk.c) {
/* 160:201 */       return null;
/* 161:    */     }
/* 162:203 */     if ((Math.abs(paramInt1 - parambnk.c().a) > 112) || (Math.abs(paramInt3 - parambnk.c().c) > 112)) {
/* 163:204 */       return null;
/* 164:    */     }
/* 165:207 */     bjb localbjb = bnl.a(parambnk, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej);
/* 166:208 */     if ((localbjb != null) && (localbjb.b > 10))
/* 167:    */     {
/* 168:209 */       bnl localbnl = new bnl(parambnk, paramInt4, paramRandom, localbjb, paramej);
/* 169:210 */       int i = (localbnl.l.a + localbnl.l.d) / 2;
/* 170:211 */       int j = (localbnl.l.c + localbnl.l.f) / 2;
/* 171:212 */       int k = localbnl.l.d - localbnl.l.a;
/* 172:213 */       int m = localbnl.l.f - localbnl.l.c;
/* 173:214 */       int n = k > m ? k : m;
/* 174:215 */       if (parambnk.e().a(i, j, n / 2 + 4, bmw.d))
/* 175:    */       {
/* 176:216 */         paramList.add(localbnl);
/* 177:217 */         parambnk.g.add(localbnl);
/* 178:218 */         return localbnl;
/* 179:    */       }
/* 180:    */     }
/* 181:222 */     return null;
/* 182:    */   }
				static bms a(bnk arg0, List arg1, Random arg2, int arg3, int arg4, int arg5, EnumDirection arg6, int arg7) {return d(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7);}
				static bms b(bnk arg0, List arg1, Random arg2, int arg3, int arg4, int arg5, EnumDirection arg6, int arg7) {return e(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7);}
/* 183:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmy
 * JD-Core Version:    0.7.0.1
 */