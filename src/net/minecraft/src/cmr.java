package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.HashMap;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Map;
/*   7:    */ import javax.vecmath.Vector3f;
/*   8:    */ 
/*   9:    */ public class cmr
/*  10:    */ {
/*  11: 16 */   public static final List<String> a = Lists.newArrayList(new String[] { "layer0", "layer1", "layer2", "layer3", "layer4" });
/*  12:    */   
/*  13:    */   public cmc a(cua paramcua, cmc paramcmc)
/*  14:    */   {
/*  15: 22 */     HashMap<String,String> localHashMap = Maps.newHashMap();
/*  16:    */     
/*  17: 24 */     ArrayList<clu> localArrayList = Lists.newArrayList();
/*  18: 25 */     for (int i = 0; i < a.size(); i++)
/*  19:    */     {
/*  20: 26 */       String str1 = (String)a.get(i);
/*  21: 27 */       if (!paramcmc.b(str1)) {
/*  22:    */         break;
/*  23:    */       }
/*  24: 31 */       String str2 = paramcmc.c(str1);
/*  25: 32 */       localHashMap.put(str1, str2);
/*  26:    */       
/*  27: 34 */       cue localcue = paramcua.a(new oa(str2).toString());
/*  28: 35 */       localArrayList.addAll(a(i, str1, localcue));
/*  29:    */     }
/*  30: 38 */     if (localArrayList.isEmpty()) {
/*  31: 39 */       return null;
/*  32:    */     }
/*  33: 42 */     localHashMap.put("particle", paramcmc.b("particle") ? paramcmc.c("particle") : (String)localHashMap.get("layer0"));
/*  34:    */     
/*  35: 44 */     return new cmc(localArrayList, localHashMap, false, false, new cmx(paramcmc.g(), paramcmc.h(), paramcmc.i(), paramcmc.j()));
/*  36:    */   }
/*  37:    */   
/*  38:    */   private List<clu> a(int paramInt, String paramString, cue paramcue)
/*  39:    */   {
/*  40: 48 */     HashMap<EnumDirection,clx> localHashMap = Maps.newHashMap();
/*  41: 49 */     localHashMap.put(EnumDirection.SOUTH, new clx(null, paramInt, paramString, new cma(new float[] { 0.0F, 0.0F, 16.0F, 16.0F }, 0)));
/*  42: 50 */     localHashMap.put(EnumDirection.NORTH, new clx(null, paramInt, paramString, new cma(new float[] { 16.0F, 0.0F, 0.0F, 16.0F }, 0)));
/*  43:    */     
/*  44: 52 */     ArrayList<clu> localArrayList = Lists.newArrayList();
/*  45: 53 */     localArrayList.add(new clu(new Vector3f(0.0F, 0.0F, 7.5F), new Vector3f(16.0F, 16.0F, 8.5F), localHashMap, null, true));
/*  46:    */     
/*  47: 55 */     localArrayList.addAll(a(paramcue, paramString, paramInt));
/*  48:    */     
/*  49: 57 */     return localArrayList;
/*  50:    */   }
/*  51:    */   
/*  52:    */   private List<clu> a(cue paramcue, String paramString, int paramInt)
/*  53:    */   {
/*  54: 61 */     float f1 = paramcue.c();
/*  55: 62 */     float f2 = paramcue.d();
/*  56: 63 */     ArrayList<clu> localArrayList = Lists.newArrayList();
/*  57: 65 */     for (cmt localcmt : a(paramcue))
/*  58:    */     {
/*  59: 66 */       float f3 = 0.0F;
/*  60: 67 */       float f4 = 0.0F;
/*  61: 68 */       float f5 = 0.0F;
/*  62: 69 */       float f6 = 0.0F;
/*  63: 70 */       float f7 = 0.0F;
/*  64: 71 */       float f8 = 0.0F;
/*  65: 72 */       float f9 = 0.0F;
/*  66: 73 */       float f10 = 0.0F;
/*  67: 74 */       float f11 = 0.0F;
/*  68: 75 */       float f12 = 0.0F;
/*  69:    */       
/*  70: 77 */       float f13 = localcmt.b();
/*  71: 78 */       float f14 = localcmt.c();
/*  72: 79 */       float f15 = localcmt.d();
/*  73:    */       
/*  74: 81 */       cmu localcmu = localcmt.a();
/*  75: 82 */       switch (cms.a[localcmu.ordinal()])
/*  76:    */       {
/*  77:    */       case 1: 
/*  78: 84 */         f3 = f7 = f13;
/*  79: 85 */         f5 = f8 = f14 + 1.0F;
/*  80: 86 */         f4 = f9 = f15;
/*  81: 87 */         f6 = f10 = f15;
/*  82:    */         
/*  83: 89 */         f11 = 16.0F / f1;
/*  84: 90 */         f12 = 16.0F / (f2 - 1.0F);
/*  85: 91 */         break;
/*  86:    */       case 2: 
/*  87: 93 */         f9 = f10 = f15;
/*  88:    */         
/*  89: 95 */         f3 = f7 = f13;
/*  90: 96 */         f5 = f8 = f14 + 1.0F;
/*  91: 97 */         f4 = f15 + 1.0F;
/*  92: 98 */         f6 = f15 + 1.0F;
/*  93:    */         
/*  94:100 */         f11 = 16.0F / f1;
/*  95:101 */         f12 = 16.0F / (f2 - 1.0F);
/*  96:102 */         break;
/*  97:    */       case 3: 
/*  98:104 */         f3 = f7 = f15;
/*  99:105 */         f5 = f8 = f15;
/* 100:106 */         f4 = f10 = f13;
/* 101:107 */         f6 = f9 = f14 + 1.0F;
/* 102:    */         
/* 103:109 */         f11 = 16.0F / (f1 - 1.0F);
/* 104:110 */         f12 = 16.0F / f2;
/* 105:111 */         break;
/* 106:    */       case 4: 
/* 107:113 */         f7 = f8 = f15;
/* 108:    */         
/* 109:115 */         f3 = f15 + 1.0F;
/* 110:116 */         f5 = f15 + 1.0F;
/* 111:117 */         f4 = f10 = f13;
/* 112:118 */         f6 = f9 = f14 + 1.0F;
/* 113:    */         
/* 114:120 */         f11 = 16.0F / (f1 - 1.0F);
/* 115:121 */         f12 = 16.0F / f2;
/* 116:    */       }
/* 117:125 */       float f16 = 16.0F / f1;
/* 118:126 */       float f17 = 16.0F / f2;
/* 119:    */       
/* 120:128 */       f3 *= f16;
/* 121:129 */       f5 *= f16;
/* 122:130 */       f4 *= f17;
/* 123:131 */       f6 *= f17;
/* 124:    */       
/* 125:133 */       f4 = 16.0F - f4;
/* 126:134 */       f6 = 16.0F - f6;
/* 127:    */       
/* 128:136 */       f7 *= f11;
/* 129:137 */       f8 *= f11;
/* 130:138 */       f9 *= f12;
/* 131:139 */       f10 *= f12;
/* 132:    */       
/* 133:141 */       HashMap<EnumDirection,clx> localHashMap = Maps.newHashMap();
/* 134:142 */       localHashMap.put(localcmu.a(), new clx(null, paramInt, paramString, new cma(new float[] { f7, f9, f8, f10 }, 0)));
/* 135:144 */       switch (cms.a[localcmu.ordinal()])
/* 136:    */       {
/* 137:    */       case 1: 
/* 138:146 */         localArrayList.add(new clu(new Vector3f(f3, f4, 7.5F), new Vector3f(f5, f4, 8.5F), localHashMap, null, true));
/* 139:147 */         break;
/* 140:    */       case 2: 
/* 141:149 */         localArrayList.add(new clu(new Vector3f(f3, f6, 7.5F), new Vector3f(f5, f6, 8.5F), localHashMap, null, true));
/* 142:150 */         break;
/* 143:    */       case 3: 
/* 144:152 */         localArrayList.add(new clu(new Vector3f(f3, f4, 7.5F), new Vector3f(f3, f6, 8.5F), localHashMap, null, true));
/* 145:153 */         break;
/* 146:    */       case 4: 
/* 147:155 */         localArrayList.add(new clu(new Vector3f(f5, f4, 7.5F), new Vector3f(f5, f6, 8.5F), localHashMap, null, true));
/* 148:    */       }
/* 149:    */     }
/* 150:160 */     return localArrayList;
/* 151:    */   }
/* 152:    */   
/* 153:    */   private List<cmt> a(cue paramcue)
/* 154:    */   {
/* 155:164 */     int i = paramcue.c();
/* 156:165 */     int j = paramcue.d();
/* 157:    */     
/* 158:167 */     ArrayList<cmt> localArrayList = Lists.newArrayList();
/* 159:168 */     for (int k = 0; k < paramcue.k(); k++)
/* 160:    */     {
/* 161:169 */       int[] arrayOfInt = paramcue.a(k)[0];
/* 162:170 */       for (int m = 0; m < j; m++) {
/* 163:171 */         for (int n = 0; n < i; n++)
/* 164:    */         {
/* 165:172 */           boolean bool = !a(arrayOfInt, n, m, i, j);
/* 166:    */           
/* 167:174 */           a(cmu.a, localArrayList, arrayOfInt, n, m, i, j, bool);
/* 168:175 */           a(cmu.b, localArrayList, arrayOfInt, n, m, i, j, bool);
/* 169:176 */           a(cmu.c, localArrayList, arrayOfInt, n, m, i, j, bool);
/* 170:177 */           a(cmu.d, localArrayList, arrayOfInt, n, m, i, j, bool);
/* 171:    */         }
/* 172:    */       }
/* 173:    */     }
/* 174:181 */     return localArrayList;
/* 175:    */   }
/* 176:    */   
/* 177:    */   private void a(cmu paramcmu, List<cmt> paramList, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
/* 178:    */   {
/* 179:185 */     int i = (a(paramArrayOfInt, paramInt1 + paramcmu.b(), paramInt2 + paramcmu.c(), paramInt3, paramInt4)) && (paramBoolean) ? 1 : 0;
/* 180:186 */     if (i != 0) {
/* 181:187 */       a(paramList, paramcmu, paramInt1, paramInt2);
/* 182:    */     }
/* 183:    */   }
/* 184:    */   
/* 185:    */   private void a(List<cmt> paramList, cmu paramcmu, int paramInt1, int paramInt2)
/* 186:    */   {
/* 187:192 */     cmt localObject = null;
/* 188:193 */     for (cmt localcmt : paramList) {
/* 189:194 */       if (localcmt.a() == paramcmu)
/* 190:    */       {
/* 191:198 */         int k = cmu.a(paramcmu) ? paramInt2 : paramInt1;
/* 192:200 */         if (localcmt.d() == k)
/* 193:    */         {
/* 194:201 */           localObject = localcmt;
/* 195:202 */           break;
/* 196:    */         }
/* 197:    */       }
/* 198:    */     }
/* 199:206 */     int i = cmu.a(paramcmu) ? paramInt2 : paramInt1;
/* 200:207 */     int j = cmu.a(paramcmu) ? paramInt1 : paramInt2;
/* 201:208 */     if (localObject == null) {
/* 202:209 */       paramList.add(new cmt(paramcmu, j, i));
/* 203:    */     } else {
/* 204:211 */       localObject.a(j);
/* 205:    */     }
/* 206:    */   }
/* 207:    */   
/* 208:    */   private boolean a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 209:    */   {
/* 210:216 */     if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt1 >= paramInt3) || (paramInt2 >= paramInt4)) {
/* 211:217 */       return true;
/* 212:    */     }
/* 213:219 */     return (paramArrayOfInt[(paramInt2 * paramInt3 + paramInt1)] >> 24 & 0xFF) == 0;
/* 214:    */   }
/* 215:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmr
 * JD-Core Version:    0.7.0.1
 */