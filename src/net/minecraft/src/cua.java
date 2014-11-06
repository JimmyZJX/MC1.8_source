package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.awt.image.BufferedImage;
/*   4:    */ import java.io.IOException;
/*   5:    */ import java.util.Collection;
/*   6:    */ import java.util.HashMap;
/*   7:    */ import java.util.Iterator;
/*   8:    */ import java.util.List;
/*   9:    */ import java.util.Map;
/*  10:    */ import java.util.Map.Entry;
/*  11:    */ import org.apache.logging.log4j.LogManager;
/*  12:    */ import org.apache.logging.log4j.Logger;
/*  13:    */ 
/*  14:    */ public class cua
/*  15:    */   extends cto
/*  16:    */   implements cul
/*  17:    */ {
/*  18: 26 */   private static final Logger h = LogManager.getLogger();
/*  19: 28 */   public static final oa f = new oa("missingno");
/*  20: 29 */   public static final oa g = new oa("textures/atlas/blocks.png");
/*  21: 32 */   private final List<cue> i = Lists.newArrayList();
/*  22: 33 */   private final Map<Object,cue> j = Maps.newHashMap();
/*  23: 34 */   private final Map k = Maps.newHashMap();
/*  24:    */   private final String l;
/*  25:    */   private final cts m;
/*  26:    */   private int n;
/*  27: 41 */   private final cue o = new cue("missingno");
/*  28:    */   
/*  29:    */   public cua(String paramString)
/*  30:    */   {
/*  31: 44 */     this(paramString, null);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public cua(String paramString, cts paramcts)
/*  35:    */   {
/*  36: 48 */     this.l = paramString;
/*  37: 49 */     this.m = paramcts;
/*  38:    */   }
/*  39:    */   
/*  40:    */   private void g()
/*  41:    */   {
/*  42: 53 */     int[] arrayOfInt = cuj.b;
/*  43: 54 */     this.o.b(16);
/*  44: 55 */     this.o.c(16);
/*  45:    */     
/*  46: 57 */     int[][] arrayOfInt1 = new int[this.n + 1][];
/*  47: 58 */     arrayOfInt1[0] = arrayOfInt;
/*  48: 59 */     this.o.a(Lists.newArrayList(new int[][][] { arrayOfInt1 }));
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(cvk paramcvk)
/*  52:    */   {
/*  53: 64 */     if (this.m != null) {
/*  54: 65 */       a(paramcvk, this.m);
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void a(cvk paramcvk, cts paramcts)
/*  59:    */   {
/*  60: 70 */     this.j.clear();
/*  61: 71 */     paramcts.a(this);
/*  62:    */     
/*  63: 73 */     g();
/*  64:    */     
/*  65: 75 */     c();
/*  66:    */     
/*  67: 77 */     b(paramcvk);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void b(cvk paramcvk)
/*  71:    */   {
/*  72: 81 */     int i1 = bsu.B();
/*  73: 82 */     ctw localctw = new ctw(i1, i1, true, 0, this.n);
/*  74:    */     
/*  75: 84 */     this.k.clear();
/*  76: 85 */     this.i.clear();
/*  77:    */     
/*  78: 87 */     int i2 = 2147483647;
/*  79: 88 */     int i3 = 1 << this.n;
/*  80: 91 */     for (Map.Entry localEntry : this.j.entrySet())
/*  81:    */     {
/*  82: 92 */       cue localObject1 = (cue)localEntry.getValue();
/*  83: 93 */       oa localObject2 = new oa(((cue)localObject1).i());
/*  84:    */       
/*  85: 95 */       oa localoa1 = a((oa)localObject2, 0);
/*  86:    */       try
/*  87:    */       {
/*  88: 97 */         cvj localcvj = paramcvk.a(localoa1);
/*  89:    */         
/*  90: 99 */         BufferedImage[] localObject4 = new BufferedImage[1 + this.n];
/*  91:100 */         localObject4[0] = cuj.a(localcvj.b());
/*  92:    */         
/*  93:    */ 
/*  94:103 */         cxb localObject5 = (cxb)localcvj.a("texture");
/*  95:    */         int i8;
/*  96:    */         Iterator localIterator2;
/*  97:104 */         if (localObject5 != null)
/*  98:    */         {
/*  99:105 */           List localObject6 = ((cxb)localObject5).c();
/* 100:108 */           if (!((List)localObject6).isEmpty())
/* 101:    */           {
/* 102:109 */             int i7 = localObject4[0].getWidth();
/* 103:110 */             i8 = localObject4[0].getHeight();
/* 104:111 */             if ((MathUtils.smallestEncompassingPowerOfTwo(i7) != i7) || (MathUtils.smallestEncompassingPowerOfTwo(i8) != i8)) {
/* 105:112 */               throw new RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
/* 106:    */             }
/* 107:    */           }
/* 108:116 */           for (localIterator2 = ((List)localObject6).iterator(); localIterator2.hasNext();)
/* 109:    */           {
/* 110:116 */             i8 = ((Integer)localIterator2.next()).intValue();
/* 111:118 */             if ((i8 > 0) && (i8 < localObject4.length - 1) && (localObject4[i8] == null))
/* 112:    */             {
/* 113:119 */               oa localoa2 = a((oa)localObject2, i8);
/* 114:    */               try
/* 115:    */               {
/* 116:121 */                 localObject4[i8] = cuj.a(paramcvk.a(localoa2).b());
/* 117:    */               }
/* 118:    */               catch (IOException localIOException2)
/* 119:    */               {
/* 120:123 */                 h.error("Unable to load miplevel {} from: {}", new Object[] { Integer.valueOf(i8), localoa2, localIOException2 });
/* 121:    */               }
/* 122:    */             }
/* 123:    */           }
/* 124:    */         }
/* 125:129 */         cwo localObject6 = (cwo)localcvj.a("animation");
/* 126:130 */         ((cue)localObject1).a((BufferedImage[])localObject4, (cwo)localObject6);
/* 127:    */       }
/* 128:    */       catch (RuntimeException localRuntimeException)
/* 129:    */       {
/* 130:132 */         h.error("Unable to parse metadata from " + localoa1, localRuntimeException);
/* 131:133 */         continue;
/* 132:    */       }
/* 133:    */       catch (IOException localIOException1)
/* 134:    */       {
/* 135:135 */         h.error("Using missing texture, unable to load " + localoa1, localIOException1);
/* 137:136 */         continue;
/* 136:    */       }
/* 138:    */       
/* 139:    */ 
/* 140:139 */       i2 = Math.min(i2, Math.min(((cue)localObject1).c(), ((cue)localObject1).d()));
/* 141:140 */       int i6 = Math.min(Integer.lowestOneBit(((cue)localObject1).c()), Integer.lowestOneBit(((cue)localObject1).d()));
/* 142:141 */       if (i6 < i3)
/* 143:    */       {
/* 144:142 */         h.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[] { localoa1, Integer.valueOf(((cue)localObject1).c()), Integer.valueOf(((cue)localObject1).d()), Integer.valueOf(MathUtils.log2(i3)), Integer.valueOf(MathUtils.log2(i6)) });
/* 145:143 */         i3 = i6;
/* 146:    */       }
/* 147:146 */       localctw.a((cue)localObject1);
/* 148:    */     }
/* 149:    */     
/* 150:    */     Object localObject5;
/* 151:    */     Object localObject6;
/* 152:150 */     int i4 = Math.min(i2, i3);
/* 153:151 */     int i5 = MathUtils.log2(i4);
/* 154:152 */     if (i5 < this.n)
/* 155:    */     {
/* 156:153 */       h.debug("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[] { this.l, Integer.valueOf(this.n), Integer.valueOf(i5), Integer.valueOf(i4) });
/* 157:154 */       this.n = i5;
/* 158:    */     }
/* 159:157 */     for (Iterator<cue> localObject1 = this.j.values().iterator(); (localObject1).hasNext();)
/* 160:    */     {
/* 161:157 */       cue localObject2 = localObject1.next();
/* 162:    */       try
/* 163:    */       {
/* 164:159 */         (localObject2).d(this.n);
/* 165:    */       }
/* 166:    */       catch (Throwable localThrowable1)
/* 167:    */       {
/* 168:161 */         b localObject3 = net.minecraft.src.b.a(localThrowable1, "Applying mipmap");
/* 169:162 */         j localObject4 = (localObject3).a("Sprite being mipmapped");
/* 170:    */         
/* 171:164 */         ((j)localObject4).a("Sprite name", new cub(this, (cue)localObject2));
/* 172:    */         
/* 173:    */ 
/* 174:    */ 
/* 175:    */ 
/* 176:    */ 
/* 177:    */ 
/* 178:171 */         ((j)localObject4).a("Sprite size", new cuc(this, (cue)localObject2));
/* 179:    */         
/* 180:    */ 
/* 181:    */ 
/* 182:    */ 
/* 183:    */ 
/* 184:    */ 
/* 185:178 */         ((j)localObject4).a("Sprite frames", new cud(this, (cue)localObject2));
/* 186:    */         
/* 187:    */ 
/* 188:    */ 
/* 189:    */ 
/* 190:    */ 
/* 191:    */ 
/* 192:185 */         ((j)localObject4).a("Mipmap levels", Integer.valueOf(this.n));
/* 193:    */         
/* 194:187 */         throw new u((b)localObject3);
/* 195:    */       }
/* 196:    */     }
/* 197:    */     Object localObject3;
/* 198:190 */     this.o.d(this.n);
/* 199:    */     
/* 200:    */ 
/* 201:193 */     localctw.a(this.o);
/* 202:    */     try
/* 203:    */     {
/* 204:197 */       localctw.c();
/* 205:    */     }
/* 206:    */     catch (ctz localctz)
/* 207:    */     {
/* 208:199 */       throw localctz;
/* 209:    */     }
/* 210:204 */     h.info("Created: {}x{} {}-atlas", new Object[] { Integer.valueOf(localctw.a()), Integer.valueOf(localctw.b()), this.l });
/* 211:205 */     cuj.a(b(), this.n, localctw.a(), localctw.b());
/* 212:    */     
/* 213:207 */     HashMap localHashMap = Maps.newHashMap(this.j);
/* 214:208 */     for (Object localObject2 = localctw.d().iterator(); ((Iterator)localObject2).hasNext();)
/* 215:    */     {
/* 216:208 */       cue localcue = (cue)((Iterator)localObject2).next();
/* 217:    */       
/* 218:    */ 
/* 219:211 */       localObject3 = localcue.i();
/* 220:212 */       localHashMap.remove(localObject3);
/* 221:213 */       this.k.put(localObject3, localcue);
/* 222:    */       try
/* 223:    */       {
/* 224:217 */         cuj.a(localcue.a(0), localcue.c(), localcue.d(), localcue.a(), localcue.b(), false, false);
/* 225:    */       }
/* 226:    */       catch (Throwable localThrowable2)
/* 227:    */       {
/* 228:219 */         localObject5 = net.minecraft.src.b.a(localThrowable2, "Stitching texture atlas");
/* 229:220 */         localObject6 = ((b)localObject5).a("Texture being stitched together");
/* 230:    */         
/* 231:222 */         ((j)localObject6).a("Atlas path", this.l);
/* 232:223 */         ((j)localObject6).a("Sprite", localcue);
/* 233:    */         
/* 234:225 */         throw new u((b)localObject5);
/* 235:    */       }
/* 236:228 */       if (localcue.m()) {
/* 237:229 */         this.i.add(localcue);
/* 238:    */       }
/* 239:    */     }
/* 240:    */     cue localcue;
/* 241:234 */     for (Iterator<cue> localObject2 = localHashMap.values().iterator(); localObject2.hasNext();)
/* 242:    */     {
/* 243:234 */       localcue = (cue)localObject2.next();
/* 244:235 */       localcue.a(this.o);
/* 245:    */     }
/* 246:238 */     cuj.a(this.l.replaceAll("/", "_"), b(), this.n, localctw.a(), localctw.b());
/* 247:    */   }
/* 248:    */   
/* 249:    */   private oa a(oa paramoa, int paramInt)
/* 250:    */   {
/* 251:242 */     if (paramInt == 0) {
/* 252:243 */       return new oa(paramoa.b(), String.format("%s/%s%s", new Object[] { this.l, paramoa.a(), ".png" }));
/* 253:    */     }
/* 254:245 */     return new oa(paramoa.b(), String.format("%s/mipmaps/%s.%d%s", new Object[] { this.l, paramoa.a(), Integer.valueOf(paramInt), ".png" }));
/* 255:    */   }
/* 256:    */   
/* 257:    */   public cue a(String paramString)
/* 258:    */   {
/* 259:251 */     cue localcue = (cue)this.k.get(paramString);
/* 260:252 */     if (localcue == null) {
/* 261:253 */       localcue = this.o;
/* 262:    */     }
/* 263:255 */     return localcue;
/* 264:    */   }
/* 265:    */   
/* 266:    */   public void d()
/* 267:    */   {
/* 268:259 */     cuj.b(b());
/* 269:260 */     for (cue localcue : this.i) {
/* 270:261 */       localcue.j();
/* 271:    */     }
/* 272:    */   }
/* 273:    */   
/* 274:    */   public cue a(oa paramoa)
/* 275:    */   {
/* 276:266 */     if (paramoa == null) {
/* 277:267 */       throw new IllegalArgumentException("Location cannot be null!");
/* 278:    */     }
/* 279:270 */     cue localcue = this.j.get(paramoa);
/* 280:271 */     if (localcue == null)
/* 281:    */     {
/* 282:272 */       localcue = cue.a(paramoa);
/* 283:273 */       this.j.put(paramoa.toString(), localcue);
/* 284:    */     }
/* 285:276 */     return localcue;
/* 286:    */   }
/* 287:    */   
/* 288:    */   public void e()
/* 289:    */   {
/* 290:281 */     d();
/* 291:    */   }
/* 292:    */   
/* 293:    */   public void a(int paramInt)
/* 294:    */   {
/* 295:285 */     this.n = paramInt;
/* 296:    */   }
/* 297:    */   
/* 298:    */   public cue f()
/* 299:    */   {
/* 300:289 */     return this.o;
/* 301:    */   }
/* 302:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cua
 * JD-Core Version:    0.7.0.1
 */