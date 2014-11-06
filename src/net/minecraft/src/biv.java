package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.HashMap;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Map;
/*   8:    */ 
/*   9:    */ public class biv
/*  10:    */ {
/*  11: 26 */   private final List<biw> a = Lists.newArrayList();
/*  12: 27 */   private final Map<String,Map<String,String>> b = Maps.newHashMap();
/*  13:    */   private int c;
/*  14:    */   
/*  15:    */   public int a()
/*  16:    */   {
/*  17: 31 */     return this.c;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void a(int paramInt)
/*  21:    */   {
/*  22: 35 */     this.c = paramInt;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public Map<String,Map<String,String>> b()
/*  26:    */   {
/*  27: 39 */     return this.b;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public List<biw> c()
/*  31:    */   {
/*  32: 43 */     return this.a;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void d()
/*  36:    */   {
/*  37: 47 */     int i = 0;
/*  38: 49 */     for (biw localbiw : this.a)
/*  39:    */     {
/*  40: 50 */       localbiw.b(i);
/*  41: 51 */       i += localbiw.b();
/*  42:    */     }
/*  43:    */   }
/*  44:    */   
/*  45:    */   public String toString()
/*  46:    */   {
/*  47: 57 */     StringBuilder localStringBuilder = new StringBuilder();
/*  48:    */     
/*  49: 59 */     localStringBuilder.append(3);
/*  50: 60 */     localStringBuilder.append(";");
/*  51: 62 */     for (int i = 0; i < this.a.size(); i++)
/*  52:    */     {
/*  53: 63 */       if (i > 0) {
/*  54: 64 */         localStringBuilder.append(",");
/*  55:    */       }
/*  56: 66 */       localStringBuilder.append(((biw)this.a.get(i)).toString());
/*  57:    */     }
/*  58: 69 */     localStringBuilder.append(";");
/*  59: 70 */     localStringBuilder.append(this.c);
/*  60: 72 */     if (!this.b.isEmpty())
/*  61:    */     {
/*  62: 73 */       localStringBuilder.append(";");
/*  63: 74 */       int i = 0;
/*  64: 76 */       for (Map.Entry<String,Map<String,String>> localEntry1 : this.b.entrySet())
/*  65:    */       {
/*  66: 77 */         if (i++ > 0) {
/*  67: 78 */           localStringBuilder.append(",");
/*  68:    */         }
/*  69: 80 */         localStringBuilder.append(((String)localEntry1.getKey()).toLowerCase());
/*  70:    */         
/*  71: 82 */         Map<String,String> localMap = localEntry1.getValue();
/*  72: 83 */         if (!localMap.isEmpty())
/*  73:    */         {
/*  74: 84 */           localStringBuilder.append("(");
/*  75: 85 */           int j = 0;
/*  76: 87 */           for (Map.Entry<String,String> localEntry2 : localMap.entrySet())
/*  77:    */           {
/*  78: 88 */             if (j++ > 0) {
/*  79: 89 */               localStringBuilder.append(" ");
/*  80:    */             }
/*  81: 91 */             localStringBuilder.append((String)localEntry2.getKey());
/*  82: 92 */             localStringBuilder.append("=");
/*  83: 93 */             localStringBuilder.append((String)localEntry2.getValue());
/*  84:    */           }
/*  85: 96 */           localStringBuilder.append(")");
/*  86:    */         }
/*  87:    */       }
/*  88:    */     }
/*  89:    */     else
/*  90:    */     {
/*  91:100 */       localStringBuilder.append(";");
/*  92:    */     }
/*  93:103 */     return localStringBuilder.toString();
/*  94:    */   }
/*  95:    */   
/*  96:    */   private static biw a(int paramInt1, String paramString, int paramInt2)
/*  97:    */   {
/*  98:107 */     String[] arrayOfString = paramInt1 >= 3 ? paramString.split("\\*", 2) : paramString.split("x", 2);
/*  99:108 */     int i = 1;
/* 100:109 */     int j = 0;
/* 101:111 */     if (arrayOfString.length == 2) {
/* 102:    */       try
/* 103:    */       {
/* 104:113 */         i = Integer.parseInt(arrayOfString[0]);
/* 105:114 */         if (paramInt2 + i >= 256) {
/* 106:115 */           i = 256 - paramInt2;
/* 107:    */         }
/* 108:117 */         if (i < 0) {
/* 109:118 */           i = 0;
/* 110:    */         }
/* 111:    */       }
/* 112:    */       catch (Throwable localThrowable1)
/* 113:    */       {
/* 114:121 */         return null;
/* 115:    */       }
/* 116:    */     }
/* 117:125 */     ProtoBlock localatr = null;
/* 118:    */     try
/* 119:    */     {
/* 120:127 */       String str = arrayOfString[(arrayOfString.length - 1)];
/* 121:128 */       if (paramInt1 < 3)
/* 122:    */       {
/* 123:129 */         arrayOfString = str.split(":", 2);
/* 124:130 */         if (arrayOfString.length > 1) {
/* 125:131 */           j = Integer.parseInt(arrayOfString[1]);
/* 126:    */         }
/* 127:133 */         localatr = ProtoBlock.c(Integer.parseInt(arrayOfString[0]));
/* 128:    */       }
/* 129:    */       else
/* 130:    */       {
/* 131:135 */         arrayOfString = str.split(":", 3);
/* 132:136 */         localatr = arrayOfString.length > 1 ? ProtoBlock.b(arrayOfString[0] + ":" + arrayOfString[1]) : null;
/* 133:137 */         if (localatr != null)
/* 134:    */         {
/* 135:138 */           j = arrayOfString.length > 2 ? Integer.parseInt(arrayOfString[2]) : 0;
/* 136:    */         }
/* 137:    */         else
/* 138:    */         {
/* 139:140 */           localatr = ProtoBlock.b(arrayOfString[0]);
/* 140:141 */           if (localatr != null) {
/* 141:142 */             j = arrayOfString.length > 1 ? Integer.parseInt(arrayOfString[1]) : 0;
/* 142:    */           }
/* 143:    */         }
/* 144:145 */         if (localatr == null) {
/* 145:146 */           return null;
/* 146:    */         }
/* 147:    */       }
/* 148:150 */       if (localatr == BlockList.air) {
/* 149:151 */         j = 0;
/* 150:    */       }
/* 151:154 */       if ((j < 0) || (j > 15)) {
/* 152:155 */         j = 0;
/* 153:    */       }
/* 154:    */     }
/* 155:    */     catch (Throwable localThrowable2)
/* 156:    */     {
/* 157:158 */       return null;
/* 158:    */     }
/* 159:161 */     biw localbiw = new biw(paramInt1, i, localatr, j);
/* 160:162 */     localbiw.b(paramInt2);
/* 161:163 */     return localbiw;
/* 162:    */   }
/* 163:    */   
/* 164:    */   private static List<biw> a(int paramInt, String paramString)
/* 165:    */   {
/* 166:167 */     if ((paramString == null) || (paramString.length() < 1)) {
/* 167:168 */       return null;
/* 168:    */     }
/* 169:171 */     ArrayList<biw> localArrayList = Lists.newArrayList();
/* 170:172 */     String[] arrayOfString1 = paramString.split(",");
/* 171:173 */     int i = 0;
/* 172:175 */     for (String str : arrayOfString1)
/* 173:    */     {
/* 174:176 */       biw localbiw = a(paramInt, str, i);
/* 175:177 */       if (localbiw == null) {
/* 176:178 */         return null;
/* 177:    */       }
/* 178:180 */       localArrayList.add(localbiw);
/* 179:181 */       i += localbiw.b();
/* 180:    */     }
/* 181:184 */     return localArrayList;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public static biv a(String paramString)
/* 185:    */   {
/* 186:188 */     if (paramString == null) {
/* 187:189 */       return e();
/* 188:    */     }
/* 189:191 */     String[] arrayOfString1 = paramString.split(";", -1);
/* 190:192 */     int i = arrayOfString1.length == 1 ? 0 : MathUtils.getInt(arrayOfString1[0], 0);
/* 191:193 */     if ((i < 0) || (i > 3)) {
/* 192:194 */       return e();
/* 193:    */     }
/* 194:197 */     biv localbiv = new biv();
/* 195:198 */     int j = arrayOfString1.length == 1 ? 0 : 1;
/* 196:199 */     List<biw> localList = a(i, arrayOfString1[(j++)]);
/* 197:201 */     if ((localList == null) || (localList.isEmpty())) {
/* 198:202 */       return e();
/* 199:    */     }
/* 200:205 */     localbiv.c().addAll(localList);
/* 201:206 */     localbiv.d();
/* 202:    */     
/* 203:208 */     int k = arm.q.az;
/* 204:209 */     if ((i > 0) && (arrayOfString1.length > j)) {
/* 205:210 */       k = MathUtils.getInt(arrayOfString1[(j++)], k);
/* 206:    */     }
/* 207:212 */     localbiv.a(k);
/* 208:214 */     if ((i > 0) && (arrayOfString1.length > j))
/* 209:    */     {
/* 210:215 */       String[] arrayOfString2 = arrayOfString1[(j++)].toLowerCase().split(",");
/* 211:217 */       for (String str : arrayOfString2)
/* 212:    */       {
/* 213:218 */         String[] arrayOfString4 = str.split("\\(", 2);
/* 214:219 */         HashMap<String,String> localHashMap = Maps.newHashMap();
/* 215:221 */         if (arrayOfString4[0].length() > 0)
/* 216:    */         {
/* 217:222 */           localbiv.b().put(arrayOfString4[0], localHashMap);
/* 218:224 */           if ((arrayOfString4.length > 1) && (arrayOfString4[1].endsWith(")")) && (arrayOfString4[1].length() > 1))
/* 219:    */           {
/* 220:225 */             String[] arrayOfString5 = arrayOfString4[1].substring(0, arrayOfString4[1].length() - 1).split(" ");
/* 221:227 */             for (int i1 = 0; i1 < arrayOfString5.length; i1++)
/* 222:    */             {
/* 223:228 */               String[] arrayOfString6 = arrayOfString5[i1].split("=", 2);
/* 224:229 */               if (arrayOfString6.length == 2) {
/* 225:230 */                 localHashMap.put(arrayOfString6[0], arrayOfString6[1]);
/* 226:    */               }
/* 227:    */             }
/* 228:    */           }
/* 229:    */         }
/* 230:    */       }
/* 231:    */     }
/* 232:    */     else
/* 233:    */     {
/* 234:237 */       localbiv.b().put("village", Maps.<String,String>newHashMap());
/* 235:    */     }
/* 236:240 */     return localbiv;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public static biv e()
/* 240:    */   {
/* 241:244 */     biv localbiv = new biv();
/* 242:    */     
/* 243:246 */     localbiv.a(arm.q.az);
/* 244:247 */     localbiv.c().add(new biw(1, BlockList.bedrock));
/* 245:248 */     localbiv.c().add(new biw(2, BlockList.dirt));
/* 246:249 */     localbiv.c().add(new biw(1, BlockList.grass));
/* 247:250 */     localbiv.d();
/* 248:251 */     localbiv.b().put("village", Maps.<String,String>newHashMap());
/* 249:    */     
/* 250:253 */     return localbiv;
/* 251:    */   }
/* 252:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     biv
 * JD-Core Version:    0.7.0.1
 */