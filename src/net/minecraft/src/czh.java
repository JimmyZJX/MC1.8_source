package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.gson.Gson;
/*   3:    */ import com.google.gson.GsonBuilder;
/*   4:    */ import java.io.FileNotFoundException;
/*   5:    */ import java.io.IOException;
/*   6:    */ import java.io.InputStream;
/*   7:    */ import java.io.InputStreamReader;
/*   8:    */ import java.lang.reflect.ParameterizedType;
/*   9:    */ import java.util.ArrayList;
/*  10:    */ import java.util.List;
/*  11:    */ import java.util.Map;
/*  12:    */ import java.util.Map.Entry;
/*  13:    */ import java.util.Random;
/*  14:    */ import org.apache.commons.io.IOUtils;
/*  15:    */ import org.apache.commons.lang3.ArrayUtils;
/*  16:    */ import org.apache.logging.log4j.LogManager;
/*  17:    */ import org.apache.logging.log4j.Logger;
/*  18:    */ 
/*  19:    */ public class czh
/*  20:    */   implements cvl, pm
/*  21:    */ {
/*  22: 33 */   private static final Logger b = LogManager.getLogger();
/*  23: 35 */   private static final Gson c = new GsonBuilder().registerTypeAdapter(cya.class, new cyd()).create();
/*  24: 37 */   private static final ParameterizedType d = new czi();
/*  25: 57 */   public static final cyz a = new cyz(new oa("meta:missing_sound"), 0.0D, 0.0D, false);
/*  26: 59 */   private final czl e = new czl();
/*  27:    */   private final cza f;
/*  28:    */   private final cvk g;
/*  29:    */   
/*  30:    */   public czh(cvk paramcvk, bto parambto)
/*  31:    */   {
/*  32: 64 */     this.g = paramcvk;
/*  33: 65 */     this.f = new cza(this, parambto);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void a(cvk paramcvk)
/*  37:    */   {
/*  38: 70 */     this.f.a();
/*  39:    */     
/*  40: 72 */     this.e.a();
/*  41: 74 */     for (String str : paramcvk.a()) {
/*  42:    */       try
/*  43:    */       {
/*  44: 76 */         List<cvj> localList = paramcvk.b(new oa(str, "sounds.json"));
/*  45: 78 */         for (cvj localcvj : localList) {
/*  46:    */           try
/*  47:    */           {
/*  48: 80 */             Map<String,cya> localMap = a(localcvj.b());
/*  49: 81 */             for (Map.Entry<String,cya> localEntry : localMap.entrySet()) {
/*  50: 82 */               a(new oa(str, localEntry.getKey()), localEntry.getValue());
/*  51:    */             }
/*  52:    */           }
/*  53:    */           catch (RuntimeException localRuntimeException)
/*  54:    */           {
/*  55: 85 */             b.warn("Invalid sounds.json", localRuntimeException);
/*  56:    */           }
/*  57:    */         }
/*  58:    */       }
/*  59:    */       catch (IOException localIOException) {}
/*  60:    */     }
/*  61:    */   }
/*  62:    */   
/*  63:    */   protected Map a(InputStream paramInputStream)
/*  64:    */   {
/*  65:    */     try
/*  66:    */     {
/*  67: 95 */       return (Map)c.fromJson(new InputStreamReader(paramInputStream), d);
/*  68:    */     }
/*  69:    */     finally
/*  70:    */     {
/*  71: 97 */       IOUtils.closeQuietly(paramInputStream);
/*  72:    */     }
/*  73:    */   }
/*  74:    */   
/*  75:    */   private void a(oa paramoa, cya paramcya)
/*  76:    */   {
/*  77:103 */     int i = !this.e.d(paramoa) ? 1 : 0;
/*  78:    */     czg localczg;
/*  79:104 */     if ((i != 0) || (paramcya.b()))
/*  80:    */     {
/*  81:105 */       if (i == 0) {
/*  82:106 */         b.debug("Replaced sound event location {}", new Object[] { paramoa });
/*  83:    */       }
/*  84:108 */       localczg = new czg(paramoa, 1.0D, 1.0D, paramcya.c());
/*  85:109 */       this.e.a(localczg);
/*  86:    */     }
/*  87:    */     else
/*  88:    */     {
/*  89:111 */       localczg = (czg)this.e.a(paramoa);
/*  90:    */     }
/*  91:114 */     for (cyb localcyb : paramcya.a())
/*  92:    */     {
/*  93:115 */       String str1 = localcyb.a();
/*  94:    */       
/*  95:117 */       oa localoa1 = new oa(str1);
/*  96:118 */       String str2 = str1.contains(":") ? localoa1.b() : paramoa.b();
/*  97:    */       Object localObject1;
/*  98:121 */       switch (czk.a[localcyb.e().ordinal()])
/*  99:    */       {
/* 100:    */       case 1: 
/* 101:123 */         oa localoa2 = new oa(str2, "sounds/" + localoa1.a() + ".ogg");
/* 102:    */         
/* 103:125 */         InputStream localInputStream = null;
/* 104:    */         try
/* 105:    */         {
/* 106:127 */           localInputStream = this.g.a(localoa2).b();
/* 107:    */         }
/* 108:    */         catch (FileNotFoundException localFileNotFoundException)
/* 109:    */         {
/* 110:129 */           b.warn("File {} does not exist, cannot add it to event {}", new Object[] { localoa2, paramoa });
/* 111:    */           
/* 112:    */ 
/* 113:    */ 
/* 114:    */ 
/* 115:    */ 
/* 116:135 */           IOUtils.closeQuietly(localInputStream); continue;
/* 117:    */         }
/* 118:    */         catch (IOException localIOException)
/* 119:    */         {
/* 120:132 */           b.warn("Could not load sound file " + localoa2 + ", cannot add it to event " + paramoa, localIOException);
/* 121:    */           
/* 122:    */ 
/* 123:135 */           IOUtils.closeQuietly(localInputStream); continue;
/* 124:    */         }
/* 125:    */         finally
/* 126:    */         {
/* 127:135 */           IOUtils.closeQuietly(localInputStream);
/* 128:    */         }
/* 129:138 */         localObject1 = new czn(new cyz(localoa2, localcyb.c(), localcyb.b(), localcyb.f()), localcyb.d());
/* 130:139 */         break;
/* 131:    */       case 2: 
/* 132:141 */         localObject1 = new czj(this, str2, localcyb);
/* 133:    */         
/* 134:    */ 
/* 135:    */ 
/* 136:    */ 
/* 137:    */ 
/* 138:    */ 
/* 139:    */ 
/* 140:    */ 
/* 141:    */ 
/* 142:    */ 
/* 143:    */ 
/* 144:    */ 
/* 145:    */ 
/* 146:    */ 
/* 147:156 */         break;
/* 148:    */       default: 
/* 149:158 */         throw new IllegalStateException("IN YOU FACE");
/* 150:    */         
/* 151:    */ 
/* 153:    */       }
/* 152:161 */       localczg.a((czm)localObject1);
/* 154:    */     }
/* 155:    */   }
/* 156:    */   
/* 157:    */   public czg a(oa paramoa)
/* 158:    */   {
/* 159:166 */     return (czg)this.e.a(paramoa);
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void a(cye paramcye)
/* 163:    */   {
/* 164:170 */     this.f.c(paramcye);
/* 165:    */   }
/* 166:    */   
/* 167:    */   public void a(cye paramcye, int paramInt)
/* 168:    */   {
/* 169:174 */     this.f.a(paramcye, paramInt);
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void a(EntityPlayer paramahd, float paramFloat)
/* 173:    */   {
/* 174:178 */     this.f.a(paramahd, paramFloat);
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void a()
/* 178:    */   {
/* 179:182 */     this.f.e();
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void b()
/* 183:    */   {
/* 184:186 */     this.f.c();
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void d()
/* 188:    */   {
/* 189:190 */     this.f.b();
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void c()
/* 193:    */   {
/* 194:195 */     this.f.d();
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void e()
/* 198:    */   {
/* 199:199 */     this.f.f();
/* 200:    */   }
/* 201:    */   
/* 202:    */   public void a(cxz paramcxz, float paramFloat)
/* 203:    */   {
/* 204:203 */     if ((paramcxz == cxz.a) && (paramFloat <= 0.0F)) {
/* 205:204 */       b();
/* 206:    */     }
/* 207:207 */     this.f.a(paramcxz, paramFloat);
/* 208:    */   }
/* 209:    */   
/* 210:    */   public void b(cye paramcye)
/* 211:    */   {
/* 212:211 */     this.f.b(paramcye);
/* 213:    */   }
/* 214:    */   
/* 215:    */   public czg a(cxz... paramVarArgs)
/* 216:    */   {
/* 217:215 */     ArrayList<czg> localArrayList = Lists.newArrayList();
/* 218:217 */     for (oa localoa : this.e.c())
/* 219:    */     {
/* 220:218 */       czg localczg = (czg)this.e.a(localoa);
/* 221:219 */       if (ArrayUtils.contains(paramVarArgs, localczg.d())) {
/* 222:220 */         localArrayList.add(localczg);
/* 223:    */       }
/* 224:    */     }
/* 225:224 */     if (localArrayList.isEmpty()) {
/* 226:225 */       return null;
/* 227:    */     }
/* 228:227 */     return (czg)localArrayList.get(new Random().nextInt(localArrayList.size()));
/* 229:    */   }
/* 230:    */   
/* 231:    */   public boolean c(cye paramcye)
/* 232:    */   {
/* 233:232 */     return this.f.a(paramcye);
/* 234:    */   }
				static czl a(czh arg0) {return arg0.e;}
/* 235:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     czh
 * JD-Core Version:    0.7.0.1
 */