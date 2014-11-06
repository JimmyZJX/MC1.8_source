package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import tv.twitch.AuthToken;
/*   3:    */ import tv.twitch.ErrorCode;
/*   4:    */ import tv.twitch.broadcast.ArchivingState;
/*   5:    */ import tv.twitch.broadcast.ChannelInfo;
/*   6:    */ import tv.twitch.broadcast.FrameBuffer;
/*   7:    */ import tv.twitch.broadcast.GameInfo;
/*   8:    */ import tv.twitch.broadcast.GameInfoList;
/*   9:    */ import tv.twitch.broadcast.IStreamCallbacks;
/*  10:    */ import tv.twitch.broadcast.IngestList;
/*  11:    */ import tv.twitch.broadcast.StreamInfo;
/*  12:    */ import tv.twitch.broadcast.UserInfo;
/*  13:    */ 
/*  14:    */ class czv
/*  15:    */   implements IStreamCallbacks
/*  16:    */ {
				private final czu a;
/*  17:    */   czv(czu paramczu) {a=paramczu;}
/*  18:    */   
/*  19:    */   public void requestAuthTokenCallback(ErrorCode paramErrorCode, AuthToken paramAuthToken)
/*  20:    */   {
/*  21:196 */     if (ErrorCode.succeeded(paramErrorCode))
/*  22:    */     {
/*  23:199 */       this.a.u = paramAuthToken;
/*  24:200 */       this.a.a(czy.d);
/*  25:    */     }
/*  26:    */     else
/*  27:    */     {
/*  28:204 */       this.a.u.data = "";
/*  29:205 */       this.a.a(czy.b);
/*  30:    */       
/*  31:207 */       String str = ErrorCode.getString(paramErrorCode);
/*  32:208 */       this.a.d(String.format("RequestAuthTokenDoneCallback got failure: %s", new Object[] { str }));
/*  33:    */     }
/*  34:    */     try
/*  35:    */     {
/*  36:213 */       if (this.a.c != null) {
/*  37:215 */         this.a.c.a(paramErrorCode, paramAuthToken);
/*  38:    */       }
/*  39:    */     }
/*  40:    */     catch (Exception localException)
/*  41:    */     {
/*  42:220 */       this.a.d(localException.toString());
/*  43:    */     }
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void loginCallback(ErrorCode paramErrorCode, ChannelInfo paramChannelInfo)
/*  47:    */   {
/*  48:227 */     if (ErrorCode.succeeded(paramErrorCode))
/*  49:    */     {
/*  50:229 */       this.a.v = paramChannelInfo;
/*  51:230 */       this.a.a(czy.f);
/*  52:231 */       this.a.m = true;
/*  53:    */     }
/*  54:    */     else
/*  55:    */     {
/*  56:235 */       this.a.a(czy.b);
/*  57:236 */       this.a.m = false;
/*  58:    */       
/*  59:238 */       String str = ErrorCode.getString(paramErrorCode);
/*  60:239 */       this.a.d(String.format("LoginCallback got failure: %s", new Object[] { str }));
/*  61:    */     }
/*  62:    */     try
/*  63:    */     {
/*  64:244 */       if (this.a.c != null) {
/*  65:246 */         this.a.c.a(paramErrorCode);
/*  66:    */       }
/*  67:    */     }
/*  68:    */     catch (Exception localException)
/*  69:    */     {
/*  70:251 */       this.a.d(localException.toString());
/*  71:    */     }
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void getIngestServersCallback(ErrorCode paramErrorCode, IngestList paramIngestList)
/*  75:    */   {
/*  76:258 */     if (ErrorCode.succeeded(paramErrorCode))
/*  77:    */     {
/*  78:260 */       this.a.s = paramIngestList;
/*  79:    */       
/*  80:    */ 
/*  81:263 */       this.a.t = this.a.s.getDefaultServer();
/*  82:    */       
/*  83:265 */       this.a.a(czy.h);
/*  84:    */       try
/*  85:    */       {
/*  86:269 */         if (this.a.c != null) {
/*  87:271 */           this.a.c.a(paramIngestList);
/*  88:    */         }
/*  89:    */       }
/*  90:    */       catch (Exception localException)
/*  91:    */       {
/*  92:276 */         this.a.d(localException.toString());
/*  93:    */       }
/*  94:    */     }
/*  95:    */     else
/*  96:    */     {
/*  97:281 */       String str = ErrorCode.getString(paramErrorCode);
/*  98:282 */       this.a.d(String.format("IngestListCallback got failure: %s", new Object[] { str }));
/*  99:    */       
/* 100:    */ 
/* 101:285 */       this.a.a(czy.e);
/* 102:    */     }
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void getUserInfoCallback(ErrorCode paramErrorCode, UserInfo paramUserInfo)
/* 106:    */   {
/* 107:292 */     this.a.w = paramUserInfo;
/* 108:294 */     if (ErrorCode.failed(paramErrorCode))
/* 109:    */     {
/* 110:296 */       String str = ErrorCode.getString(paramErrorCode);
/* 111:297 */       this.a.d(String.format("UserInfoDoneCallback got failure: %s", new Object[] { str }));
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void getStreamInfoCallback(ErrorCode paramErrorCode, StreamInfo paramStreamInfo)
/* 116:    */   {
/* 117:304 */     if (ErrorCode.succeeded(paramErrorCode))
/* 118:    */     {
/* 119:306 */       this.a.x = paramStreamInfo;
/* 120:    */       try
/* 121:    */       {
/* 122:310 */         if (this.a.c != null) {
/* 123:312 */           this.a.c.a(paramStreamInfo);
/* 124:    */         }
/* 125:    */       }
/* 126:    */       catch (Exception localException)
/* 127:    */       {
/* 128:317 */         this.a.d(localException.toString());
/* 129:    */       }
/* 130:    */     }
/* 131:    */     else
/* 132:    */     {
/* 133:322 */       String str = ErrorCode.getString(paramErrorCode);
/* 134:323 */       this.a.e(String.format("StreamInfoDoneCallback got failure: %s", new Object[] { str }));
/* 135:    */     }
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void getArchivingStateCallback(ErrorCode paramErrorCode, ArchivingState paramArchivingState)
/* 139:    */   {
/* 140:330 */     this.a.y = paramArchivingState;
/* 141:332 */     if (ErrorCode.failed(paramErrorCode)) {}
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void runCommercialCallback(ErrorCode paramErrorCode)
/* 145:    */   {
/* 146:342 */     if (ErrorCode.failed(paramErrorCode))
/* 147:    */     {
/* 148:344 */       String str = ErrorCode.getString(paramErrorCode);
/* 149:345 */       this.a.e(String.format("RunCommercialCallback got failure: %s", new Object[] { str }));
/* 150:    */     }
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void setStreamInfoCallback(ErrorCode paramErrorCode)
/* 154:    */   {
/* 155:352 */     if (ErrorCode.failed(paramErrorCode))
/* 156:    */     {
/* 157:354 */       String str = ErrorCode.getString(paramErrorCode);
/* 158:355 */       this.a.e(String.format("SetStreamInfoCallback got failure: %s", new Object[] { str }));
/* 159:    */     }
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void getGameNameListCallback(ErrorCode paramErrorCode, GameInfoList paramGameInfoList)
/* 163:    */   {
/* 164:362 */     if (ErrorCode.failed(paramErrorCode))
/* 165:    */     {
/* 166:364 */       String str = ErrorCode.getString(paramErrorCode);
/* 167:365 */       this.a.d(String.format("GameNameListCallback got failure: %s", new Object[] { str }));
/* 168:    */     }
/* 169:    */     try
/* 170:    */     {
/* 171:370 */       if (this.a.c != null) {
/* 172:372 */         this.a.c.a(paramErrorCode, paramGameInfoList == null ? new GameInfo[0] : paramGameInfoList.list);
/* 173:    */       }
/* 174:    */     }
/* 175:    */     catch (Exception localException)
/* 176:    */     {
/* 177:377 */       this.a.d(localException.toString());
/* 178:    */     }
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void bufferUnlockCallback(long paramLong)
/* 182:    */   {
/* 183:384 */     FrameBuffer localFrameBuffer = FrameBuffer.lookupBuffer(paramLong);
/* 184:    */     
/* 185:    */ 
/* 186:387 */     this.a.k.add(localFrameBuffer);
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void startCallback(ErrorCode paramErrorCode)
/* 190:    */   {
/* 191:393 */     if (ErrorCode.succeeded(paramErrorCode))
/* 192:    */     {
/* 193:    */       try
/* 194:    */       {
/* 195:397 */         if (this.a.c != null) {
/* 196:399 */           this.a.c.b();
/* 197:    */         }
/* 198:    */       }
/* 199:    */       catch (Exception localException1)
/* 200:    */       {
/* 201:404 */         this.a.d(localException1.toString());
/* 202:    */       }
/* 203:407 */       this.a.a(czy.k);
/* 204:    */     }
/* 205:    */     else
/* 206:    */     {
/* 207:411 */       this.a.q = null;
/* 208:412 */       this.a.r = null;
/* 209:    */       
/* 210:414 */       this.a.a(czy.i);
/* 211:    */       try
/* 212:    */       {
/* 213:418 */         if (this.a.c != null) {
/* 214:420 */           this.a.c.c(paramErrorCode);
/* 215:    */         }
/* 216:    */       }
/* 217:    */       catch (Exception localException2)
/* 218:    */       {
/* 219:425 */         this.a.d(localException2.toString());
/* 220:    */       }
/* 221:428 */       String str = ErrorCode.getString(paramErrorCode);
/* 222:429 */       this.a.d(String.format("startCallback got failure: %s", new Object[] { str }));
/* 223:    */     }
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void stopCallback(ErrorCode paramErrorCode)
/* 227:    */   {
/* 228:436 */     if (ErrorCode.succeeded(paramErrorCode))
/* 229:    */     {
/* 230:438 */       this.a.q = null;
/* 231:439 */       this.a.r = null;
/* 232:    */       
/* 233:441 */       this.a.P();
/* 234:    */       try
/* 235:    */       {
/* 236:445 */         if (this.a.c != null) {
/* 237:447 */           this.a.c.c();
/* 238:    */         }
/* 239:    */       }
/* 240:    */       catch (Exception localException)
/* 241:    */       {
/* 242:452 */         this.a.d(localException.toString());
/* 243:    */       }
/* 244:455 */       if (this.a.m) {
/* 245:457 */         this.a.a(czy.i);
/* 246:    */       } else {
/* 247:461 */         this.a.a(czy.b);
/* 248:    */       }
/* 249:    */     }
/* 250:    */     else
/* 251:    */     {
/* 252:467 */       this.a.a(czy.i);
/* 253:    */       
/* 254:469 */       String str = ErrorCode.getString(paramErrorCode);
/* 255:470 */       this.a.d(String.format("stopCallback got failure: %s", new Object[] { str }));
/* 256:    */     }
/* 257:    */   }
/* 258:    */   
/* 259:    */   public void sendActionMetaDataCallback(ErrorCode paramErrorCode)
/* 260:    */   {
/* 261:477 */     if (ErrorCode.failed(paramErrorCode))
/* 262:    */     {
/* 263:479 */       String str = ErrorCode.getString(paramErrorCode);
/* 264:480 */       this.a.d(String.format("sendActionMetaDataCallback got failure: %s", new Object[] { str }));
/* 265:    */     }
/* 266:    */   }
/* 267:    */   
/* 268:    */   public void sendStartSpanMetaDataCallback(ErrorCode paramErrorCode)
/* 269:    */   {
/* 270:487 */     if (ErrorCode.failed(paramErrorCode))
/* 271:    */     {
/* 272:489 */       String str = ErrorCode.getString(paramErrorCode);
/* 273:490 */       this.a.d(String.format("sendStartSpanMetaDataCallback got failure: %s", new Object[] { str }));
/* 274:    */     }
/* 275:    */   }
/* 276:    */   
/* 277:    */   public void sendEndSpanMetaDataCallback(ErrorCode paramErrorCode)
/* 278:    */   {
/* 279:497 */     if (ErrorCode.failed(paramErrorCode))
/* 280:    */     {
/* 281:499 */       String str = ErrorCode.getString(paramErrorCode);
/* 282:500 */       this.a.d(String.format("sendEndSpanMetaDataCallback got failure: %s", new Object[] { str }));
/* 283:    */     }
/* 284:    */   }
/* 285:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     czv
 * JD-Core Version:    0.7.0.1
 */