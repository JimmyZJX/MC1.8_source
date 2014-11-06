package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   3:    */ import java.util.LinkedList;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.ListIterator;
/*   7:    */ import tv.twitch.ErrorCode;
/*   9:    */ import tv.twitch.chat.ChatBadgeData;
/*  10:    */ import tv.twitch.chat.ChatChannelInfo;
/*  11:    */ import tv.twitch.chat.ChatEvent;
/*  12:    */ import tv.twitch.chat.ChatRawMessage;
/*  13:    */ import tv.twitch.chat.ChatTokenizedMessage;
/*  14:    */ import tv.twitch.chat.ChatUserInfo;
/*  15:    */ import tv.twitch.chat.IChatChannelListener;
/*  16:    */ 
/*  17:    */ public class dae
/*  18:    */   implements IChatChannelListener
/*  19:    */ {
/*  20:266 */   protected String a = null;
/*  21:267 */   protected boolean b = false;
/*  22:268 */   protected dad c = dad.a;
/*  23:270 */   protected List<ChatUserInfo> d = Lists.newArrayList();
/*  24:271 */   protected LinkedList<ChatRawMessage> e = new LinkedList<ChatRawMessage>();
/*  25:272 */   protected LinkedList<ChatTokenizedMessage> f = new LinkedList<ChatTokenizedMessage>();
/*  26:274 */   protected ChatBadgeData g = null;
				private final daa h;
/*  27:    */   
/*  28:    */   public dae(daa paramdaa, String paramString)
/*  29:    */   {
/*  30:278 */     this.a = paramString;
				  h=paramdaa;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public dad a()
/*  34:    */   {
/*  35:285 */     return this.c;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public boolean a(boolean paramBoolean)
/*  39:    */   {
/*  40:317 */     this.b = paramBoolean;
/*  41:    */     
/*  42:319 */     ErrorCode localErrorCode = ErrorCode.TTV_EC_SUCCESS;
/*  43:322 */     if (paramBoolean) {
/*  44:324 */       localErrorCode = this.h.f.connectAnonymous(this.a, this);
/*  45:    */     } else {
/*  46:328 */       localErrorCode = this.h.f.connect(this.a, this.h.b, this.h.h.data, this);
/*  47:    */     }
/*  48:331 */     if (ErrorCode.failed(localErrorCode))
/*  49:    */     {
/*  50:333 */       String str = ErrorCode.getString(localErrorCode);
/*  51:334 */       this.h.n(String.format("Error connecting: %s", new Object[] { str }));
/*  52:    */       
/*  53:336 */       d(this.a);
/*  54:    */       
/*  55:338 */       return false;
/*  56:    */     }
/*  57:342 */     a(dad.b);
/*  58:343 */     h();
/*  59:    */     
/*  60:345 */     return true;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public boolean g()
/*  64:    */   {
/*  65:351 */     switch (dac.a[this.c.ordinal()])
/*  66:    */     {
/*  67:    */     case 1: 
/*  68:    */     case 2: 
/*  69:357 */       ErrorCode localErrorCode = this.h.f.disconnect(this.a);
/*  70:358 */       if (ErrorCode.failed(localErrorCode))
/*  71:    */       {
/*  72:360 */         String str = ErrorCode.getString(localErrorCode);
/*  73:361 */         this.h.n(String.format("Error disconnecting: %s", new Object[] { str }));
/*  74:    */         
/*  75:363 */         return false;
/*  76:    */       }
/*  77:366 */       a(dad.d);
/*  78:367 */       return true;
/*  79:    */     }
/*  80:374 */     return false;
/*  81:    */   }
/*  82:    */   
/*  83:    */   protected void a(dad paramdad)
/*  84:    */   {
/*  85:381 */     if (paramdad == this.c) {
/*  86:383 */       return;
/*  87:    */     }
/*  88:386 */     this.c = paramdad;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void a(String paramString)
/*  92:    */   {
/*  93:403 */     if (this.h.l == dag.a)
/*  94:    */     {
/*  95:405 */       this.e.clear();
/*  96:406 */       this.f.clear();
/*  97:    */     }
/*  98:    */     else
/*  99:    */     {
/* 101:    */       Object localObject;
/* 102:410 */       if (this.e.size() > 0)
/* 103:    */       {
/* 104:412 */         ListIterator<ChatRawMessage> localListIterator = this.e.listIterator();
/* 105:413 */         while (localListIterator.hasNext())
/* 106:    */         {
/* 107:415 */           localObject = (ChatRawMessage)localListIterator.next();
/* 108:416 */           if (((ChatRawMessage)localObject).userName.equals(paramString)) {
/* 109:418 */             localListIterator.remove();
/* 110:    */           }
/* 111:    */         }
/* 112:    */       }
/* 113:423 */       if (this.f.size() > 0)
/* 114:    */       {
/* 115:425 */         ListIterator<ChatTokenizedMessage> localListIterator = this.f.listIterator();
/* 116:426 */         while (localListIterator.hasNext())
/* 117:    */         {
/* 118:428 */           localObject = (ChatTokenizedMessage)localListIterator.next();
/* 119:429 */           if (((ChatTokenizedMessage)localObject).displayName.equals(paramString)) {
/* 120:431 */             localListIterator.remove();
/* 121:    */           }
/* 122:    */         }
/* 123:    */       }
/* 124:    */     }
/* 125:    */     try
/* 126:    */     {
/* 127:439 */       if (this.h.a != null) {
/* 128:441 */         this.h.a.a(this.a, paramString);
/* 129:    */       }
/* 130:    */     }
/* 131:    */     catch (Exception localException)
/* 132:    */     {
/* 133:446 */       this.h.n(localException.toString());
/* 134:    */     }
/* 135:    */   }
/* 136:    */   
/* 137:    */   public boolean b(String paramString)
/* 138:    */   {
/* 139:452 */     if (this.c != dad.c) {
/* 140:454 */       return false;
/* 141:    */     }
/* 142:457 */     ErrorCode localErrorCode = this.h.f.sendMessage(this.a, paramString);
/* 143:458 */     if (ErrorCode.failed(localErrorCode))
/* 144:    */     {
/* 145:460 */       String str = ErrorCode.getString(localErrorCode);
/* 146:461 */       this.h.n(String.format("Error sending chat message: %s", new Object[] { str }));
/* 147:    */       
/* 148:463 */       return false;
/* 149:    */     }
/* 150:466 */     return true;
/* 151:    */   }
/* 152:    */   
/* 153:    */   protected void h()
/* 154:    */   {
/* 155:474 */     if (this.h.l == dag.a) {
/* 156:476 */       return;
/* 157:    */     }
/* 158:479 */     if (this.g == null)
/* 159:    */     {
/* 160:481 */       ErrorCode localErrorCode = this.h.f.downloadBadgeData(this.a);
/* 161:482 */       if (ErrorCode.failed(localErrorCode))
/* 162:    */       {
/* 163:484 */         String str = ErrorCode.getString(localErrorCode);
/* 164:485 */         this.h.n(String.format("Error trying to download badge data: %s", new Object[] { str }));
/* 165:    */       }
/* 166:    */     }
/* 167:    */   }
/* 168:    */   
/* 169:    */   protected void i()
/* 170:    */   {
/* 171:492 */     if (this.g != null) {
/* 172:494 */       return;
/* 173:    */     }
/* 174:497 */     this.g = new ChatBadgeData();
/* 175:498 */     ErrorCode localErrorCode = this.h.f.getBadgeData(this.a, this.g);
/* 176:500 */     if (ErrorCode.succeeded(localErrorCode)) {
/* 177:    */       try
/* 178:    */       {
/* 179:504 */         if (this.h.a != null) {
/* 180:506 */           this.h.a.c(this.a);
/* 181:    */         }
/* 182:    */       }
/* 183:    */       catch (Exception localException)
/* 184:    */       {
/* 185:511 */         this.h.n(localException.toString());
/* 186:    */       }
/* 187:    */     } else {
/* 188:516 */       this.h.n("Error preparing badge data: " + ErrorCode.getString(localErrorCode));
/* 189:    */     }
/* 190:    */   }
/* 191:    */   
/* 192:    */   protected void j()
/* 193:    */   {
/* 194:522 */     if (this.g == null) {
/* 195:524 */       return;
/* 196:    */     }
/* 197:527 */     ErrorCode localErrorCode = this.h.f.clearBadgeData(this.a);
/* 198:529 */     if (ErrorCode.succeeded(localErrorCode))
/* 199:    */     {
/* 200:531 */       this.g = null;
/* 201:    */       try
/* 202:    */       {
/* 203:535 */         if (this.h.a != null) {
/* 204:537 */           this.h.a.d(this.a);
/* 205:    */         }
/* 206:    */       }
/* 207:    */       catch (Exception localException)
/* 208:    */       {
/* 209:542 */         this.h.n(localException.toString());
/* 210:    */       }
/* 211:    */     }
/* 212:    */     else
/* 213:    */     {
/* 214:547 */       this.h.n("Error releasing badge data: " + ErrorCode.getString(localErrorCode));
/* 215:    */     }
/* 216:    */   }
/* 217:    */   
/* 218:    */   protected void c(String paramString)
/* 219:    */   {
/* 220:    */     try
/* 221:    */     {
/* 222:559 */       if (this.h.a != null) {
/* 223:561 */         this.h.a.a(paramString);
/* 224:    */       }
/* 225:    */     }
/* 226:    */     catch (Exception localException)
/* 227:    */     {
/* 228:566 */       this.h.n(localException.toString());
/* 229:    */     }
/* 230:    */   }
/* 231:    */   
/* 232:    */   protected void d(String paramString)
/* 233:    */   {
/* 234:    */     try
/* 235:    */     {
/* 236:574 */       if (this.h.a != null) {
/* 237:576 */         this.h.a.b(paramString);
/* 238:    */       }
/* 239:    */     }
/* 240:    */     catch (Exception localException)
/* 241:    */     {
/* 242:581 */       this.h.n(localException.toString());
/* 243:    */     }
/* 244:    */   }
/* 245:    */   
/* 246:    */   private void k()
/* 247:    */   {
/* 248:589 */     if (this.c != dad.e)
/* 249:    */     {
/* 250:591 */       a(dad.e);
/* 251:592 */       d(this.a);
/* 252:593 */       j();
/* 253:    */     }
/* 254:    */   }
/* 255:    */   
/* 256:    */   public void chatStatusCallback(String paramString, ErrorCode paramErrorCode)
/* 257:    */   {
/* 258:602 */     if (ErrorCode.succeeded(paramErrorCode)) {
/* 259:604 */       return;
/* 260:    */     }
/* 261:608 */     this.h.i.remove(paramString);
/* 262:    */     
/* 263:610 */     k();
/* 264:    */   }
/* 265:    */   
/* 266:    */   public void chatChannelMembershipCallback(String paramString, ChatEvent paramChatEvent, ChatChannelInfo paramChatChannelInfo)
/* 267:    */   {
/* 268:616 */     switch (dac.b[paramChatEvent.ordinal()])
/* 269:    */     {
/* 270:    */     case 1: 
/* 271:620 */       a(dad.c);
/* 272:621 */       c(paramString);
/* 273:622 */       break;
/* 274:    */     case 2: 
/* 275:626 */       k();
/* 276:627 */       break;
/* 277:    */     }
/* 278:    */   }
/* 279:    */   
/* 280:    */   public void chatChannelUserChangeCallback(String paramString, ChatUserInfo[] paramArrayOfChatUserInfo1, ChatUserInfo[] paramArrayOfChatUserInfo2, ChatUserInfo[] paramArrayOfChatUserInfo3)
/* 281:    */   {
/* 282:    */     int j;
/* 283:639 */     for (int i = 0; i < paramArrayOfChatUserInfo2.length; i++)
/* 284:    */     {
/* 285:641 */       j = this.d.indexOf(paramArrayOfChatUserInfo2[i]);
/* 286:642 */       if (j >= 0) {
/* 287:644 */         this.d.remove(j);
/* 288:    */       }
/* 289:    */     }
/* 290:648 */     for (int i = 0; i < paramArrayOfChatUserInfo3.length; i++)
/* 291:    */     {
/* 292:651 */       j = this.d.indexOf(paramArrayOfChatUserInfo3[i]);
/* 293:652 */       if (j >= 0) {
/* 294:654 */         this.d.remove(j);
/* 295:    */       }
/* 296:657 */       this.d.add(paramArrayOfChatUserInfo3[i]);
/* 297:    */     }
/* 298:660 */     for (int i = 0; i < paramArrayOfChatUserInfo1.length; i++) {
/* 299:662 */       this.d.add(paramArrayOfChatUserInfo1[i]);
/* 300:    */     }
/* 301:    */     try
/* 302:    */     {
/* 303:667 */       if (this.h.a != null) {
/* 304:669 */         this.h.a.a(this.a, paramArrayOfChatUserInfo1, paramArrayOfChatUserInfo2, paramArrayOfChatUserInfo3);
/* 305:    */       }
/* 306:    */     }
/* 307:    */     catch (Exception localException)
/* 308:    */     {
/* 309:674 */       this.h.n(localException.toString());
/* 310:    */     }
/* 311:    */   }
/* 312:    */   
/* 313:    */   public void chatChannelRawMessageCallback(String paramString, ChatRawMessage[] paramArrayOfChatRawMessage)
/* 314:    */   {
/* 315:681 */     for (int i = 0; i < paramArrayOfChatRawMessage.length; i++) {
/* 316:683 */       this.e.addLast(paramArrayOfChatRawMessage[i]);
/* 317:    */     }
/* 318:    */     try
/* 319:    */     {
/* 320:688 */       if (this.h.a != null) {
/* 321:690 */         this.h.a.a(this.a, paramArrayOfChatRawMessage);
/* 322:    */       }
/* 323:    */     }
/* 324:    */     catch (Exception localException)
/* 325:    */     {
/* 326:695 */       this.h.n(localException.toString());
/* 327:    */     }
/* 328:699 */     while (this.e.size() > this.h.j) {
/* 329:701 */       this.e.removeFirst();
/* 330:    */     }
/* 331:    */   }
/* 332:    */   
/* 333:    */   public void chatChannelTokenizedMessageCallback(String paramString, ChatTokenizedMessage[] paramArrayOfChatTokenizedMessage)
/* 334:    */   {
/* 335:708 */     for (int i = 0; i < paramArrayOfChatTokenizedMessage.length; i++) {
/* 336:710 */       this.f.addLast(paramArrayOfChatTokenizedMessage[i]);
/* 337:    */     }
/* 338:    */     try
/* 339:    */     {
/* 340:715 */       if (this.h.a != null) {
/* 341:717 */         this.h.a.a(this.a, paramArrayOfChatTokenizedMessage);
/* 342:    */       }
/* 343:    */     }
/* 344:    */     catch (Exception localException)
/* 345:    */     {
/* 346:722 */       this.h.n(localException.toString());
/* 347:    */     }
/* 348:726 */     while (this.f.size() > this.h.j) {
/* 349:728 */       this.f.removeFirst();
/* 350:    */     }
/* 351:    */   }
/* 352:    */   
/* 353:    */   public void chatClearCallback(String paramString1, String paramString2)
/* 354:    */   {
/* 355:735 */     a(paramString2);
/* 356:    */   }
/* 357:    */   
/* 358:    */   public void chatBadgeDataDownloadCallback(String paramString, ErrorCode paramErrorCode)
/* 359:    */   {
/* 360:741 */     if (ErrorCode.succeeded(paramErrorCode)) {
/* 361:743 */       i();
/* 362:    */     }
/* 363:    */   }
/* 364:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dae
 * JD-Core Version:    0.7.0.1
 */