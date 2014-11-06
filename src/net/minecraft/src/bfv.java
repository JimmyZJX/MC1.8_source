package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.io.BufferedInputStream;
/*   3:    */ import java.io.ByteArrayInputStream;
/*   4:    */ import java.io.DataInputStream;
/*   5:    */ import java.io.DataOutputStream;
/*   6:    */ import java.io.File;
/*   7:    */ import java.io.IOException;
/*   8:    */ import java.io.RandomAccessFile;
/*   9:    */ import java.util.List;
/*  10:    */ import java.util.zip.DeflaterOutputStream;
/*  11:    */ import java.util.zip.GZIPInputStream;
/*  12:    */ import java.util.zip.InflaterInputStream;
/*  13:    */ import net.minecraft.server.MinecraftServer;
/*  14:    */ 
/*  15:    */ public class bfv
/*  16:    */ {
/*  17: 78 */   private static final byte[] a = new byte[4096];
/*  18:    */   private final File b;
/*  19:    */   private RandomAccessFile c;
/*  20:    */   private final int[] d;
/*  21:    */   private final int[] e;
/*  22:    */   private List f;
/*  23:    */   private int g;
/*  24:    */   private long h;
/*  25:    */   
/*  26:    */   public bfv(File paramFile)
/*  27:    */   {
/*  28: 89 */     this.d = new int[1024];
/*  29: 90 */     this.e = new int[1024];
/*  30:    */     
/*  31: 92 */     this.b = paramFile;
/*  32:    */     
/*  33: 94 */     this.g = 0;
/*  34:    */     try
/*  35:    */     {
/*  36: 97 */       if (paramFile.exists()) {
/*  37: 98 */         this.h = paramFile.lastModified();
/*  38:    */       }
/*  39:101 */       this.c = new RandomAccessFile(paramFile, "rw");
/*  40:103 */       if (this.c.length() < 4096L)
/*  41:    */       {
/*  42:105 */         for (int i = 0; i < 1024; i++) {
/*  43:106 */           this.c.writeInt(0);
/*  44:    */         }
/*  45:109 */         for (int i = 0; i < 1024; i++) {
/*  46:110 */           this.c.writeInt(0);
/*  47:    */         }
/*  48:113 */         this.g += 8192;
/*  49:    */       }
/*  50:116 */       if ((this.c.length() & 0xFFF) != 0L) {
/*  51:118 */         for (int i = 0; i < (this.c.length() & 0xFFF); i++) {
/*  52:119 */           this.c.write(0);
/*  53:    */         }
/*  54:    */       }
/*  55:124 */       int i = (int)this.c.length() / 4096;
/*  56:125 */       this.f = Lists.newArrayListWithCapacity(i);
/*  57:127 */       for (int j = 0; j < i; j++) {
/*  58:128 */         this.f.add(Boolean.valueOf(true));
/*  59:    */       }
/*  60:131 */       this.f.set(0, Boolean.valueOf(false));
/*  61:132 */       this.f.set(1, Boolean.valueOf(false));
/*  62:    */       
/*  63:134 */       this.c.seek(0L);
/*  64:    */       int k;
/*  65:135 */       for (int j = 0; j < 1024; j++)
/*  66:    */       {
/*  67:136 */         k = this.c.readInt();
/*  68:137 */         this.d[j] = k;
/*  69:138 */         if ((k != 0) && ((k >> 8) + (k & 0xFF) <= this.f.size())) {
/*  70:139 */           for (int m = 0; m < (k & 0xFF); m++) {
/*  71:140 */             this.f.set((k >> 8) + m, Boolean.valueOf(false));
/*  72:    */           }
/*  73:    */         }
/*  74:    */       }
/*  75:144 */       for (int j = 0; j < 1024; j++)
/*  76:    */       {
/*  77:145 */         k = this.c.readInt();
/*  78:146 */         this.e[j] = k;
/*  79:    */       }
/*  80:    */     }
/*  81:    */     catch (IOException localIOException)
/*  82:    */     {
/*  83:149 */       localIOException.printStackTrace();
/*  84:    */     }
/*  85:    */   }
/*  86:    */   
/*  87:    */   public synchronized DataInputStream a(int paramInt1, int paramInt2)
/*  88:    */   {
/*  89:170 */     if (d(paramInt1, paramInt2)) {
/*  90:171 */       return null;
/*  91:    */     }
/*  92:    */     try
/*  93:    */     {
/*  94:175 */       int i = e(paramInt1, paramInt2);
/*  95:176 */       if (i == 0) {
/*  96:177 */         return null;
/*  97:    */       }
/*  98:180 */       int j = i >> 8;
/*  99:181 */       int k = i & 0xFF;
/* 100:183 */       if (j + k > this.f.size()) {
/* 101:184 */         return null;
/* 102:    */       }
/* 103:187 */       this.c.seek(j * 4096);
/* 104:188 */       int m = this.c.readInt();
/* 105:190 */       if (m > 4096 * k) {
/* 106:191 */         return null;
/* 107:    */       }
/* 108:192 */       if (m <= 0) {
/* 109:193 */         return null;
/* 110:    */       }
/* 111:196 */       int n = this.c.readByte();
/* 112:    */       byte[] arrayOfByte;
/* 113:197 */       if (n == 1)
/* 114:    */       {
/* 115:198 */         arrayOfByte = new byte[m - 1];
/* 116:199 */         this.c.read(arrayOfByte);
/* 117:200 */         return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(arrayOfByte))));
/* 118:    */       }
/* 119:201 */       if (n == 2)
/* 120:    */       {
/* 121:202 */         arrayOfByte = new byte[m - 1];
/* 122:203 */         this.c.read(arrayOfByte);
/* 123:204 */         return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(arrayOfByte))));
/* 124:    */       }
/* 125:207 */       return null;
/* 126:    */     }
/* 127:    */     catch (IOException localIOException) {}
/* 128:209 */     return null;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public DataOutputStream b(int paramInt1, int paramInt2)
/* 132:    */   {
/* 133:214 */     if (d(paramInt1, paramInt2)) {
/* 134:215 */       return null;
/* 135:    */     }
/* 136:218 */     return new DataOutputStream(new DeflaterOutputStream(new bfw(this, paramInt1, paramInt2)));
/* 137:    */   }
/* 138:    */   
/* 139:    */   protected synchronized void a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3)
/* 140:    */   {
/* 141:    */     try
/* 142:    */     {
/* 143:243 */       int i = e(paramInt1, paramInt2);
/* 144:244 */       int j = i >> 8;
/* 145:245 */       int k = i & 0xFF;
/* 146:246 */       int m = (paramInt3 + 5) / 4096 + 1;
/* 147:249 */       if (m >= 256) {
/* 148:250 */         return;
/* 149:    */       }
/* 150:253 */       if ((j != 0) && (k == m))
/* 151:    */       {
/* 152:255 */         a(j, paramArrayOfByte, paramInt3);
/* 153:    */       }
/* 154:    */       else
/* 155:    */       {
/* 156:260 */         for (int n = 0; n < k; n++) {
/* 157:261 */           this.f.set(j + n, Boolean.valueOf(true));
/* 158:    */         }
/* 159:265 */         int n = this.f.indexOf(Boolean.valueOf(true));
/* 160:266 */         int i1 = 0;
/* 161:    */         int i2;
/* 162:267 */         if (n != -1) {
/* 163:268 */           for (i2 = n; i2 < this.f.size(); i2++)
/* 164:    */           {
/* 165:269 */             if (i1 != 0)
/* 166:    */             {
/* 167:270 */               if (((Boolean)this.f.get(i2)).booleanValue()) {
/* 168:271 */                 i1++;
/* 169:    */               } else {
/* 170:273 */                 i1 = 0;
/* 171:    */               }
/* 172:    */             }
/* 173:275 */             else if (((Boolean)this.f.get(i2)).booleanValue())
/* 174:    */             {
/* 175:276 */               n = i2;
/* 176:277 */               i1 = 1;
/* 177:    */             }
/* 178:279 */             if (i1 >= m) {
/* 179:    */               break;
/* 180:    */             }
/* 181:    */           }
/* 182:    */         }
/* 183:285 */         if (i1 >= m)
/* 184:    */         {
/* 185:287 */           j = n;
/* 186:288 */           a(paramInt1, paramInt2, j << 8 | m);
/* 187:289 */           for (i2 = 0; i2 < m; i2++) {
/* 188:290 */             this.f.set(j + i2, Boolean.valueOf(false));
/* 189:    */           }
/* 190:292 */           a(j, paramArrayOfByte, paramInt3);
/* 191:    */         }
/* 192:    */         else
/* 193:    */         {
/* 194:295 */           this.c.seek(this.c.length());
/* 195:296 */           j = this.f.size();
/* 196:297 */           for (i2 = 0; i2 < m; i2++)
/* 197:    */           {
/* 198:298 */             this.c.write(a);
/* 199:299 */             this.f.add(Boolean.valueOf(false));
/* 200:    */           }
/* 201:301 */           this.g += 4096 * m;
/* 202:    */           
/* 203:303 */           a(j, paramArrayOfByte, paramInt3);
/* 204:304 */           a(paramInt1, paramInt2, j << 8 | m);
/* 205:    */         }
/* 206:    */       }
/* 207:307 */       b(paramInt1, paramInt2, (int)(MinecraftServer.ax() / 1000L));
/* 208:    */     }
/* 209:    */     catch (IOException localIOException)
/* 210:    */     {
/* 211:309 */       localIOException.printStackTrace();
/* 212:    */     }
/* 213:    */   }
/* 214:    */   
/* 215:    */   private void a(int paramInt1, byte[] paramArrayOfByte, int paramInt2) throws IOException
/* 216:    */   {
/* 217:315 */     this.c.seek(paramInt1 * 4096);
/* 218:316 */     this.c.writeInt(paramInt2 + 1);
/* 219:317 */     this.c.writeByte(2);
/* 220:318 */     this.c.write(paramArrayOfByte, 0, paramInt2);
/* 221:    */   }
/* 222:    */   
/* 223:    */   private boolean d(int paramInt1, int paramInt2)
/* 224:    */   {
/* 225:323 */     return (paramInt1 < 0) || (paramInt1 >= 32) || (paramInt2 < 0) || (paramInt2 >= 32);
/* 226:    */   }
/* 227:    */   
/* 228:    */   private int e(int paramInt1, int paramInt2)
/* 229:    */   {
/* 230:327 */     return this.d[(paramInt1 + paramInt2 * 32)];
/* 231:    */   }
/* 232:    */   
/* 233:    */   public boolean c(int paramInt1, int paramInt2)
/* 234:    */   {
/* 235:331 */     return e(paramInt1, paramInt2) != 0;
/* 236:    */   }
/* 237:    */   
/* 238:    */   private void a(int paramInt1, int paramInt2, int paramInt3) throws IOException
/* 239:    */   {
/* 240:335 */     this.d[(paramInt1 + paramInt2 * 32)] = paramInt3;
/* 241:336 */     this.c.seek((paramInt1 + paramInt2 * 32) * 4);
/* 242:337 */     this.c.writeInt(paramInt3);
/* 243:    */   }
/* 244:    */   
/* 245:    */   private void b(int paramInt1, int paramInt2, int paramInt3) throws IOException
/* 246:    */   {
/* 247:341 */     this.e[(paramInt1 + paramInt2 * 32)] = paramInt3;
/* 248:342 */     this.c.seek(4096 + (paramInt1 + paramInt2 * 32) * 4);
/* 249:343 */     this.c.writeInt(paramInt3);
/* 250:    */   }
/* 251:    */   
/* 252:    */   public void c() throws IOException
/* 253:    */   {
/* 254:347 */     if (this.c != null) {
/* 255:348 */       this.c.close();
/* 256:    */     }
/* 257:    */   }
/* 258:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bfv
 * JD-Core Version:    0.7.0.1
 */