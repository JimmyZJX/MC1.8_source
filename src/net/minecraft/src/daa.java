package net.minecraft.src;
/*    1:     */ import java.util.HashMap;
/*    2:     */ import java.util.HashSet;
/*    3:     */ import org.apache.logging.log4j.LogManager;
/*    4:     */ import org.apache.logging.log4j.Logger;
/*    5:     */ import tv.twitch.AuthToken;
/*    6:     */ import tv.twitch.Core;
/*    7:     */ import tv.twitch.ErrorCode;
/*    8:     */ import tv.twitch.StandardCoreAPI;
/*    9:     */ import tv.twitch.chat.Chat;
/*   10:     */ import tv.twitch.chat.ChatEmoticonData;
/*   11:     */ import tv.twitch.chat.ChatTokenizationOption;
/*   12:     */ import tv.twitch.chat.IChatAPIListener;
/*   13:     */ import tv.twitch.chat.StandardChatAPI;
/*   14:     */ 
/*   15:     */ public class daa
/*   16:     */ {
/*   17: 160 */   private static final Logger q = LogManager.getLogger();
/*   18: 164 */   protected dah a = null;
/*   19: 166 */   protected String b = "";
/*   20: 167 */   protected String c = "";
/*   21: 168 */   protected String d = "";
/*   22: 169 */   protected Core e = null;
/*   23: 170 */   protected Chat f = null;
/*   24: 172 */   protected daf g = daf.a;
/*   25: 173 */   protected AuthToken h = new AuthToken();
/*   26: 175 */   protected HashMap<String,dae> i = new HashMap<String,dae>();
/*   27: 177 */   protected int j = 128;
/*   28: 178 */   protected dag k = dag.a;
/*   29: 179 */   protected dag l = dag.a;
/*   30: 180 */   protected ChatEmoticonData m = null;
/*   31: 182 */   protected int n = 500;
/*   32: 183 */   protected int o = 2000;
/*   33: 187 */   protected IChatAPIListener p = new dab(this);
/*   34:     */   
/*   35:     */   public void a(dah paramdah)
/*   36:     */   {
/*   37: 758 */     this.a = paramdah;
/*   38:     */   }
/*   39:     */   
/*   40:     */   public void a(AuthToken paramAuthToken)
/*   41:     */   {
/*   42: 799 */     this.h = paramAuthToken;
/*   43:     */   }
/*   44:     */   
/*   45:     */   public void a(String paramString)
/*   46:     */   {
/*   47: 816 */     this.c = paramString;
/*   48:     */   }
/*   49:     */   
/*   50:     */   public void c(String paramString)
/*   51:     */   {
/*   52: 850 */     this.b = paramString;
/*   53:     */   }
/*   54:     */   
/*   55:     */   public daf h()
/*   56:     */   {
/*   57: 859 */     return this.g;
/*   58:     */   }
/*   59:     */   
/*   60:     */   public boolean d(String paramString)
/*   61:     */   {
/*   62: 954 */     if (!this.i.containsKey(paramString)) {
/*   63: 956 */       return false;
/*   64:     */     }
/*   65: 959 */     dae localdae = (dae)this.i.get(paramString);
/*   66: 960 */     return localdae.a() == dad.c;
/*   67:     */   }
/*   68:     */   
/*   69:     */   public dad e(String paramString)
/*   70:     */   {
/*   71: 969 */     if (!this.i.containsKey(paramString)) {
/*   72: 971 */       return dad.e;
/*   73:     */     }
/*   74: 974 */     dae localdae = (dae)this.i.get(paramString);
/*   75: 975 */     return localdae.a();
/*   76:     */   }
/*   77:     */   
/*   78:     */   public daa()
/*   79:     */   {
/*   80:1043 */     this.e = Core.getInstance();
/*   81:1045 */     if (this.e == null) {
/*   82:1047 */       this.e = new Core(new StandardCoreAPI());
/*   83:     */     }
/*   84:1050 */     this.f = new Chat(new StandardChatAPI());
/*   85:     */   }
/*   86:     */   
/*   87:     */   public boolean n()
/*   88:     */   {
/*   89:1055 */     if (this.g != daf.a) {
/*   90:1057 */       return false;
/*   91:     */     }
/*   92:1060 */     a(daf.b);
/*   93:     */     
/*   94:1062 */     ErrorCode localErrorCode = this.e.initialize(this.c, null);
/*   95:1063 */     if (ErrorCode.failed(localErrorCode))
/*   96:     */     {
/*   97:1065 */       a(daf.a);
/*   98:     */       
/*   99:1067 */       String localObject = ErrorCode.getString(localErrorCode);
/*  100:1068 */       n(String.format("Error initializing Twitch sdk: %s", new Object[] { localObject }));
/*  101:     */       
/*  102:1070 */       return false;
/*  103:     */     }
/*  104:1074 */     this.l = this.k;
/*  105:     */     
/*  106:1076 */     HashSet<ChatTokenizationOption> localObject = new HashSet<ChatTokenizationOption>();
/*  107:1077 */     switch (dac.c[this.k.ordinal()])
/*  108:     */     {
/*  109:     */     case 1: 
/*  110:1080 */       (localObject).add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_NONE);
/*  111:1081 */       break;
/*  112:     */     case 2: 
/*  113:1083 */       (localObject).add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_URLS);
/*  114:1084 */       break;
/*  115:     */     case 3: 
/*  116:1086 */       (localObject).add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_TEXTURES);
/*  117:     */     }
/*  118:1091 */     localErrorCode = this.f.initialize(localObject, this.p);
/*  119:1092 */     if (ErrorCode.failed(localErrorCode))
/*  120:     */     {
/*  121:1094 */       this.e.shutdown();
/*  122:1095 */       a(daf.a);
/*  123:     */       
/*  124:1097 */       String str = ErrorCode.getString(localErrorCode);
/*  125:1098 */       n(String.format("Error initializing Twitch chat: %s", new Object[] { str }));
/*  126:     */       
/*  127:1100 */       return false;
/*  128:     */     }
/*  129:1104 */     a(daf.c);
/*  130:1105 */     return true;
/*  131:     */   }
/*  132:     */   
/*  133:     */   public boolean j(String paramString)
/*  134:     */   {
/*  135:1116 */     return a(paramString, false);
/*  136:     */   }
/*  137:     */   
/*  138:     */   protected boolean a(String paramString, boolean paramBoolean)
/*  139:     */   {
/*  140:1131 */     if (this.g != daf.c) {
/*  141:1133 */       return false;
/*  142:     */     }
/*  143:1136 */     if (this.i.containsKey(paramString))
/*  144:     */     {
/*  145:1138 */       n("Already in channel: " + paramString);
/*  146:1139 */       return false;
/*  147:     */     }
/*  148:1142 */     if ((paramString == null) || (paramString.equals(""))) {
/*  149:1144 */       return false;
/*  150:     */     }
/*  151:1147 */     dae localdae = new dae(this, paramString);
/*  152:1148 */     this.i.put(paramString, localdae);
/*  153:     */     
/*  154:1150 */     boolean bool = localdae.a(paramBoolean);
/*  155:1152 */     if (!bool) {
/*  156:1154 */       this.i.remove(paramString);
/*  157:     */     }
/*  158:1157 */     return bool;
/*  159:     */   }
/*  160:     */   
/*  161:     */   public boolean l(String paramString)
/*  162:     */   {
/*  163:1166 */     if (this.g != daf.c) {
/*  164:1168 */       return false;
/*  165:     */     }
/*  166:1171 */     if (!this.i.containsKey(paramString))
/*  167:     */     {
/*  168:1173 */       n("Not in channel: " + paramString);
/*  169:1174 */       return false;
/*  170:     */     }
/*  171:1177 */     dae localdae = (dae)this.i.get(paramString);
/*  172:1178 */     return localdae.g();
/*  173:     */   }
/*  174:     */   
/*  175:     */   public boolean o()
/*  176:     */   {
/*  177:1183 */     if (this.g != daf.c) {
/*  178:1185 */       return false;
/*  179:     */     }
/*  180:1189 */     ErrorCode localErrorCode = this.f.shutdown();
/*  181:1190 */     if (ErrorCode.failed(localErrorCode))
/*  182:     */     {
/*  183:1192 */       String str = ErrorCode.getString(localErrorCode);
/*  184:1193 */       n(String.format("Error shutting down chat: %s", new Object[] { str }));
/*  185:     */       
/*  186:1195 */       return false;
/*  187:     */     }
/*  188:1198 */     t();
/*  189:     */     
/*  190:1200 */     a(daf.d);
/*  191:     */     
/*  192:1202 */     return true;
/*  193:     */   }
/*  194:     */   
/*  195:     */   public void p()
/*  196:     */   {
/*  197:1210 */     if (h() != daf.a)
/*  198:     */     {
/*  199:1212 */       o();
/*  200:1215 */       if (h() == daf.d) {
/*  201:1217 */         while (h() != daf.a) {
/*  202:     */           try
/*  203:     */           {
/*  204:1221 */             Thread.sleep(200L);
/*  205:1222 */             q();
/*  206:     */           }
/*  207:     */           catch (InterruptedException localInterruptedException) {}
/*  208:     */         }
/*  209:     */       }
/*  210:     */     }
/*  211:     */   }
/*  212:     */   
/*  213:     */   public void q()
/*  214:     */   {
/*  215:1237 */     if (this.g == daf.a) {
/*  216:1239 */       return;
/*  217:     */     }
/*  218:1242 */     ErrorCode localErrorCode = this.f.flushEvents();
/*  219:1243 */     if (ErrorCode.failed(localErrorCode))
/*  220:     */     {
/*  221:1245 */       String str = ErrorCode.getString(localErrorCode);
/*  222:1246 */       n(String.format("Error flushing chat events: %s", new Object[] { str }));
/*  223:     */     }
/*  224:     */   }
/*  225:     */   
/*  226:     */   public boolean a(String paramString1, String paramString2)
/*  227:     */   {
/*  228:1258 */     if (this.g != daf.c) {
/*  229:1260 */       return false;
/*  230:     */     }
/*  231:1263 */     if (!this.i.containsKey(paramString1))
/*  232:     */     {
/*  233:1265 */       n("Not in channel: " + paramString1);
/*  234:1266 */       return false;
/*  235:     */     }
/*  236:1269 */     dae localdae = (dae)this.i.get(paramString1);
/*  237:1270 */     return localdae.b(paramString2);
/*  238:     */   }
/*  239:     */   
/*  240:     */   protected void a(daf paramdaf)
/*  241:     */   {
/*  242:1303 */     if (paramdaf == this.g) {
/*  243:1305 */       return;
/*  244:     */     }
/*  245:1308 */     this.g = paramdaf;
/*  246:     */     try
/*  247:     */     {
/*  248:1312 */       if (this.a != null) {
/*  249:1314 */         this.a.a(paramdaf);
/*  250:     */       }
/*  251:     */     }
/*  252:     */     catch (Exception localException)
/*  253:     */     {
/*  254:1319 */       n(localException.toString());
/*  255:     */     }
/*  256:     */   }
/*  257:     */   
/*  258:     */   protected void r()
/*  259:     */   {
/*  260:1328 */     if (this.l == dag.a) {
/*  261:1330 */       return;
/*  262:     */     }
/*  263:1333 */     if (this.m == null)
/*  264:     */     {
/*  265:1335 */       ErrorCode localErrorCode = this.f.downloadEmoticonData();
/*  266:1336 */       if (ErrorCode.failed(localErrorCode))
/*  267:     */       {
/*  268:1338 */         String str = ErrorCode.getString(localErrorCode);
/*  269:1339 */         n(String.format("Error trying to download emoticon data: %s", new Object[] { str }));
/*  270:     */       }
/*  271:     */     }
/*  272:     */   }
/*  273:     */   
/*  274:     */   protected void s()
/*  275:     */   {
/*  276:1346 */     if (this.m != null) {
/*  277:1348 */       return;
/*  278:     */     }
/*  279:1351 */     this.m = new ChatEmoticonData();
/*  280:1352 */     ErrorCode localErrorCode = this.f.getEmoticonData(this.m);
/*  281:1354 */     if (ErrorCode.succeeded(localErrorCode)) {
/*  282:     */       try
/*  283:     */       {
/*  284:1358 */         if (this.a != null) {
/*  285:1360 */           this.a.d();
/*  286:     */         }
/*  287:     */       }
/*  288:     */       catch (Exception localException)
/*  289:     */       {
/*  290:1365 */         n(localException.toString());
/*  291:     */       }
/*  292:     */     } else {
/*  293:1370 */       n("Error preparing emoticon data: " + ErrorCode.getString(localErrorCode));
/*  294:     */     }
/*  295:     */   }
/*  296:     */   
/*  297:     */   protected void t()
/*  298:     */   {
/*  299:1376 */     if (this.m == null) {
/*  300:1378 */       return;
/*  301:     */     }
/*  302:1381 */     ErrorCode localErrorCode = this.f.clearEmoticonData();
/*  303:1383 */     if (ErrorCode.succeeded(localErrorCode))
/*  304:     */     {
/*  305:1385 */       this.m = null;
/*  306:     */       try
/*  307:     */       {
/*  308:1389 */         if (this.a != null) {
/*  309:1391 */           this.a.e();
/*  310:     */         }
/*  311:     */       }
/*  312:     */       catch (Exception localException)
/*  313:     */       {
/*  314:1396 */         n(localException.toString());
/*  315:     */       }
/*  316:     */     }
/*  317:     */     else
/*  318:     */     {
/*  319:1401 */       n("Error clearing emoticon data: " + ErrorCode.getString(localErrorCode));
/*  320:     */     }
/*  321:     */   }
/*  322:     */   
/*  323:     */   protected void n(String paramString)
/*  324:     */   {
/*  325:1420 */     q.error(daq.a, "[Chat controller] {}", new Object[] { paramString });
/*  326:     */   }
/*  327:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     daa
 * JD-Core Version:    0.7.0.1
 */