package net.minecraft.src;
/*   1:    */ import com.google.common.base.Charsets;
/*   2:    */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*   3:    */ import io.netty.buffer.ByteBuf;
/*   4:    */ import io.netty.buffer.ByteBufInputStream;
/*   5:    */ import io.netty.buffer.Unpooled;
/*   6:    */ import io.netty.handler.codec.base64.Base64;
/*   7:    */ import java.awt.image.BufferedImage;
/*   8:    */ import java.util.List;
/*   9:    */ import java.util.concurrent.ScheduledThreadPoolExecutor;
/*  10:    */ import java.util.concurrent.ThreadPoolExecutor;
/*  11:    */ import org.apache.commons.lang3.Validate;
/*  12:    */ import org.apache.logging.log4j.LogManager;
/*  13:    */ import org.apache.logging.log4j.Logger;
/*  14:    */ 
/*  15:    */ public class bzs
/*  16:    */   implements buv
/*  17:    */ {
/*  18: 32 */   private static final Logger a = LogManager.getLogger();
/*  19: 33 */   private static final ThreadPoolExecutor b = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build());
/*  20: 36 */   private static final oa c = new oa("textures/misc/unknown_server.png");
/*  21: 37 */   private static final oa d = new oa("textures/gui/server_selection.png");
/*  22:    */   private final bzp e;
/*  23:    */   private final bsu f;
/*  24:    */   private final cew g;
/*  25:    */   private final oa h;
/*  26:    */   private String i;
/*  27:    */   private ctp j;
/*  28:    */   private long k;
/*  29:    */   
/*  30:    */   protected bzs(bzp parambzp, cew paramcew)
/*  31:    */   {
/*  32: 54 */     this.e = parambzp;
/*  33: 55 */     this.g = paramcew;
/*  34: 56 */     this.f = bsu.z();
/*  35: 57 */     this.h = new oa("servers/" + paramcew.b + "/icon");
/*  36: 58 */     this.j = ((ctp)this.f.N().b(this.h));
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
/*  40:    */   {
/*  41: 63 */     if (!this.g.h)
/*  42:    */     {
/*  43: 64 */       this.g.h = true;
/*  44: 65 */       this.g.e = -2L;
/*  45: 66 */       this.g.d = "";
/*  46: 67 */       this.g.c = "";
/*  47:    */       
/*  48: 69 */       b.submit(new bzt(this));
/*  49:    */     }
/*  50: 85 */     int m = this.g.f > 47 ? 1 : 0;
/*  51: 86 */     int n = this.g.f < 47 ? 1 : 0;
/*  52: 87 */     int i1 = (m != 0) || (n != 0) ? 1 : 0;
/*  53:    */     
/*  54: 89 */     this.f.k.a(this.g.a, paramInt2 + 32 + 3, paramInt3 + 1, 16777215);
/*  55:    */     
/*  56: 91 */     List<String> localList = this.f.k.c(this.g.d, paramInt4 - 32 - 2);
/*  57: 92 */     for (int i2 = 0; i2 < Math.min(localList.size(), 2); i2++) {
/*  58: 93 */       this.f.k.a((String)localList.get(i2), paramInt2 + 32 + 3, paramInt3 + 12 + this.f.k.a * i2, 8421504);
/*  59:    */     }
/*  60: 96 */     String str1 = i1 != 0 ? net.minecraft.src.a.e + this.g.g : this.g.c;
/*  61: 97 */     int i3 = this.f.k.a(str1);
/*  62: 98 */     this.f.k.a(str1, paramInt2 + paramInt4 - i3 - 15 - 2, paramInt3 + 1, 8421504);
/*  63:    */     
/*  64:100 */     int i4 = 0;
/*  65:    */     
/*  66:102 */     String str2 = null;
/*  67:    */     int i5;
/*  68:    */     String str3;
/*  69:105 */     if (i1 != 0)
/*  70:    */     {
/*  71:106 */       i5 = 5;
/*  72:107 */       str3 = m != 0 ? "Client out of date!" : "Server out of date!";
/*  73:108 */       str2 = this.g.i;
/*  74:    */     }
/*  75:109 */     else if ((this.g.h) && (this.g.e != -2L))
/*  76:    */     {
/*  77:110 */       if (this.g.e < 0L) {
/*  78:111 */         i5 = 5;
/*  79:112 */       } else if (this.g.e < 150L) {
/*  80:113 */         i5 = 0;
/*  81:114 */       } else if (this.g.e < 300L) {
/*  82:115 */         i5 = 1;
/*  83:116 */       } else if (this.g.e < 600L) {
/*  84:117 */         i5 = 2;
/*  85:118 */       } else if (this.g.e < 1000L) {
/*  86:119 */         i5 = 3;
/*  87:    */       } else {
/*  88:121 */         i5 = 4;
/*  89:    */       }
/*  90:124 */       if (this.g.e < 0L)
/*  91:    */       {
/*  92:125 */         str3 = "(no connection)";
/*  93:    */       }
/*  94:    */       else
/*  95:    */       {
/*  96:127 */         str3 = this.g.e + "ms";
/*  97:128 */         str2 = this.g.i;
/*  98:    */       }
/*  99:    */     }
/* 100:    */     else
/* 101:    */     {
/* 102:131 */       i4 = 1;
/* 103:132 */       i5 = (int)(bsu.I() / 100L + paramInt1 * 2 & 0x7);
/* 104:133 */       if (i5 > 4) {
/* 105:134 */         i5 = 8 - i5;
/* 106:    */       }
/* 107:136 */       str3 = "Pinging...";
/* 108:    */     }
/* 109:139 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 110:140 */     this.f.N().a(bub.d);
/* 111:141 */     bub.a(paramInt2 + paramInt4 - 15, paramInt3, i4 * 10, 176 + i5 * 8, 10, 8, 256.0F, 256.0F);
/* 112:143 */     if ((this.g.c() != null) && (!this.g.c().equals(this.i)))
/* 113:    */     {
/* 114:144 */       this.i = this.g.c();
/* 115:145 */       c();
/* 116:146 */       this.e.h().b();
/* 117:    */     }
/* 118:149 */     if (this.j != null) {
/* 119:150 */       a(paramInt2, paramInt3, this.h);
/* 120:    */     } else {
/* 121:152 */       a(paramInt2, paramInt3, c);
/* 122:    */     }
/* 123:155 */     int i6 = paramInt6 - paramInt2;
/* 124:156 */     int i7 = paramInt7 - paramInt3;
/* 125:157 */     if ((i6 >= paramInt4 - 15) && (i6 <= paramInt4 - 5) && (i7 >= 0) && (i7 <= 8)) {
/* 126:158 */       this.e.a(str3);
/* 127:159 */     } else if ((i6 >= paramInt4 - i3 - 15 - 2) && (i6 <= paramInt4 - 15 - 2) && (i7 >= 0) && (i7 <= 8)) {
/* 128:160 */       this.e.a(str2);
/* 129:    */     }
/* 130:163 */     if ((this.f.t.z) || (paramBoolean))
/* 131:    */     {
/* 132:164 */       this.f.N().a(d);
/* 133:165 */       bub.a(paramInt2, paramInt3, paramInt2 + 32, paramInt3 + 32, -1601138544);
/* 134:166 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 135:167 */       int i8 = paramInt6 - paramInt2;
/* 136:168 */       int i9 = paramInt7 - paramInt3;
/* 137:170 */       if (b()) {
/* 138:171 */         if ((i8 < 32) && (i8 > 16)) {
/* 139:172 */           bub.a(paramInt2, paramInt3, 0.0F, 32.0F, 32, 32, 256.0F, 256.0F);
/* 140:    */         } else {
/* 141:174 */           bub.a(paramInt2, paramInt3, 0.0F, 0.0F, 32, 32, 256.0F, 256.0F);
/* 142:    */         }
/* 143:    */       }
/* 144:177 */       if (this.e.a(this, paramInt1)) {
/* 145:178 */         if ((i8 < 16) && (i9 < 16)) {
/* 146:179 */           bub.a(paramInt2, paramInt3, 96.0F, 32.0F, 32, 32, 256.0F, 256.0F);
/* 147:    */         } else {
/* 148:181 */           bub.a(paramInt2, paramInt3, 96.0F, 0.0F, 32, 32, 256.0F, 256.0F);
/* 149:    */         }
/* 150:    */       }
/* 151:184 */       if (this.e.b(this, paramInt1)) {
/* 152:185 */         if ((i8 < 16) && (i9 > 16)) {
/* 153:186 */           bub.a(paramInt2, paramInt3, 64.0F, 32.0F, 32, 32, 256.0F, 256.0F);
/* 154:    */         } else {
/* 155:188 */           bub.a(paramInt2, paramInt3, 64.0F, 0.0F, 32, 32, 256.0F, 256.0F);
/* 156:    */         }
/* 157:    */       }
/* 158:    */     }
/* 159:    */   }
/* 160:    */   
/* 161:    */   protected void a(int paramInt1, int paramInt2, oa paramoa)
/* 162:    */   {
/* 163:195 */     this.f.N().a(paramoa);
/* 164:196 */     cjm.enableBlend();
/* 165:197 */     bub.a(paramInt1, paramInt2, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
/* 166:198 */     cjm.disableBlend();
/* 167:    */   }
/* 168:    */   
/* 169:    */   private boolean b()
/* 170:    */   {
/* 171:202 */     return true;
/* 172:    */   }
/* 173:    */   
/* 174:    */   private void c()
/* 175:    */   {
/* 176:206 */     if (this.g.c() == null)
/* 177:    */     {
/* 178:207 */       this.f.N().c(this.h);
/* 179:208 */       this.j = null;
/* 180:    */     }
/* 181:    */     else
/* 182:    */     {
/* 183:211 */       ByteBuf localByteBuf1 = Unpooled.copiedBuffer(this.g.c(), Charsets.UTF_8);
/* 184:212 */       ByteBuf localByteBuf2 = Base64.decode(localByteBuf1);
/* 185:    */       BufferedImage localBufferedImage;
/* 186:    */       try
/* 187:    */       {
/* 188:215 */         localBufferedImage = cuj.a(new ByteBufInputStream(localByteBuf2));
/* 189:216 */         Validate.validState(localBufferedImage.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
/* 190:217 */         Validate.validState(localBufferedImage.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
/* 191:    */       }
/* 192:    */       catch (Exception localException)
/* 193:    */       {
/* 194:219 */         a.error("Invalid icon for server " + this.g.a + " (" + this.g.b + ")", localException);
/* 195:220 */         this.g.a((String)null); return;
/* 196:    */       }
/* 197:    */       finally
/* 198:    */       {
/* 199:223 */         localByteBuf1.release();
/* 200:224 */         localByteBuf2.release();
/* 201:    */       }
/* 202:227 */       if (this.j == null)
/* 203:    */       {
/* 204:228 */         this.j = new ctp(localBufferedImage.getWidth(), localBufferedImage.getHeight());
/* 205:229 */         this.f.N().a(this.h, this.j);
/* 206:    */       }
/* 207:232 */       localBufferedImage.getRGB(0, 0, localBufferedImage.getWidth(), localBufferedImage.getHeight(), this.j.e(), 0, localBufferedImage.getWidth());
/* 208:233 */       this.j.d();
/* 209:    */     }
/* 210:    */   }
/* 211:    */   
/* 212:    */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 213:    */   {
/* 214:239 */     if (paramInt5 <= 32)
/* 215:    */     {
/* 216:240 */       if ((paramInt5 < 32) && (paramInt5 > 16) && (b()))
/* 217:    */       {
/* 218:242 */         this.e.b(paramInt1);
/* 219:243 */         this.e.f();
/* 220:244 */         return true;
/* 221:    */       }
/* 222:246 */       if ((paramInt5 < 16) && (paramInt6 < 16) && (this.e.a(this, paramInt1)))
/* 223:    */       {
/* 224:248 */         this.e.a(this, paramInt1, bxf.r());
/* 225:249 */         return true;
/* 226:    */       }
/* 227:251 */       if ((paramInt5 < 16) && (paramInt6 > 16) && (this.e.b(this, paramInt1)))
/* 228:    */       {
/* 229:253 */         this.e.b(this, paramInt1, bxf.r());
/* 230:254 */         return true;
/* 231:    */       }
/* 232:    */     }
/* 233:258 */     this.e.b(paramInt1);
/* 234:259 */     if (bsu.I() - this.k < 250L) {
/* 235:260 */       this.e.f();
/* 236:    */     }
/* 237:262 */     this.k = bsu.I();
/* 238:    */     
/* 239:264 */     return false;
/* 240:    */   }
/* 241:    */   
/* 242:    */   public void a(int paramInt1, int paramInt2, int paramInt3) {}
/* 243:    */   
/* 244:    */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
/* 245:    */   
/* 246:    */   public cew a()
/* 247:    */   {
/* 248:276 */     return this.g;
/* 249:    */   }
				static cew a(bzs parambzs) {return parambzs.g;}
				static bzp b(bzs parambzs) {return parambzs.e;}
/* 250:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzs
 * JD-Core Version:    0.7.0.1
 */