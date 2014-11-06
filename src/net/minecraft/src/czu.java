package net.minecraft.src;
/*    1:     */ import com.google.common.collect.Lists;
/*    2:     */ import java.util.Arrays;
/*    3:     */ import java.util.List;
/*    4:     */ import org.apache.logging.log4j.LogManager;
/*    5:     */ import org.apache.logging.log4j.Logger;
/*    6:     */ import tv.twitch.AuthToken;
/*    7:     */ import tv.twitch.Core;
/*    8:     */ import tv.twitch.ErrorCode;
/*    9:     */ import tv.twitch.MessageLevel;
/*   10:     */ import tv.twitch.StandardCoreAPI;
/*   11:     */ import tv.twitch.broadcast.ArchivingState;
/*   12:     */ import tv.twitch.broadcast.AudioDeviceType;
/*   13:     */ import tv.twitch.broadcast.AudioParams;
/*   14:     */ import tv.twitch.broadcast.ChannelInfo;
/*   15:     */ import tv.twitch.broadcast.DesktopStreamAPI;
/*   16:     */ import tv.twitch.broadcast.EncodingCpuUsage;
/*   17:     */ import tv.twitch.broadcast.FrameBuffer;
/*   18:     */ import tv.twitch.broadcast.IStatCallbacks;
/*   19:     */ import tv.twitch.broadcast.IStreamCallbacks;
/*   20:     */ import tv.twitch.broadcast.IngestList;
/*   21:     */ import tv.twitch.broadcast.IngestServer;
/*   22:     */ import tv.twitch.broadcast.PixelFormat;
/*   23:     */ import tv.twitch.broadcast.StartFlags;
/*   24:     */ import tv.twitch.broadcast.Stream;
/*   25:     */ import tv.twitch.broadcast.StreamInfo;
/*   26:     */ import tv.twitch.broadcast.StreamInfoForSetting;
/*   27:     */ import tv.twitch.broadcast.UserInfo;
/*   28:     */ import tv.twitch.broadcast.VideoParams;
/*   29:     */ 
/*   30:     */ public class czu
/*   31:     */ {
/*   32: 142 */   private static final Logger D = LogManager.getLogger();
/*   33: 143 */   protected final int a = 30;
/*   34: 144 */   protected final int b = 3;
/*   35: 146 */   private static final uq E = new uq(String.class, 50);
/*   36: 152 */   private String F = null;
/*   37: 153 */   protected czz c = null;
/*   38: 155 */   protected String d = "";
/*   39: 156 */   protected String e = "";
/*   40: 157 */   protected String f = "";
/*   41: 158 */   protected boolean g = true;
/*   42: 160 */   protected Core h = null;
/*   43: 161 */   protected Stream i = null;
/*   44: 162 */   protected List j = Lists.newArrayList();
/*   45: 163 */   protected List<FrameBuffer> k = Lists.newArrayList();
/*   46: 165 */   protected boolean l = false;
/*   47: 166 */   protected boolean m = false;
/*   48: 167 */   protected boolean n = false;
/*   49: 169 */   protected czy o = czy.a;
/*   50: 171 */   protected String p = null;
/*   51: 172 */   protected VideoParams q = null;
/*   52: 173 */   protected AudioParams r = null;
/*   53: 175 */   protected IngestList s = new IngestList(new IngestServer[0]);
/*   54: 176 */   protected IngestServer t = null;
/*   55: 177 */   protected AuthToken u = new AuthToken();
/*   56: 178 */   protected ChannelInfo v = new ChannelInfo();
/*   57: 179 */   protected UserInfo w = new UserInfo();
/*   58: 180 */   protected StreamInfo x = new StreamInfo();
/*   59: 181 */   protected ArchivingState y = new ArchivingState();
/*   60: 183 */   protected long z = 0L;
/*   61: 184 */   protected dai A = null;
/*   62:     */   private ErrorCode G;
/*   63: 191 */   protected IStreamCallbacks B = new czv(this);
/*   64: 505 */   protected IStatCallbacks C = new czw(this);
/*   65:     */   
/*   66:     */   public void a(czz paramczz)
/*   67:     */   {
/*   68: 521 */     this.c = paramczz;
/*   69:     */   }
/*   70:     */   
/*   71:     */   public boolean b()
/*   72:     */   {
/*   73: 526 */     return this.l;
/*   74:     */   }
/*   75:     */   
/*   76:     */   public void a(String paramString)
/*   77:     */   {
/*   78: 541 */     this.d = paramString;
/*   79:     */   }
/*   80:     */   
/*   81:     */   public StreamInfo j()
/*   82:     */   {
/*   83: 584 */     return this.x;
/*   84:     */   }
/*   85:     */   
/*   86:     */   public ChannelInfo l()
/*   87:     */   {
/*   88: 594 */     return this.v;
/*   89:     */   }
/*   90:     */   
/*   91:     */   public boolean m()
/*   92:     */   {
/*   93: 599 */     return (this.o == czy.k) || (this.o == czy.m);
/*   94:     */   }
/*   95:     */   
/*   96:     */   public boolean n()
/*   97:     */   {
/*   98: 604 */     return this.o == czy.i;
/*   99:     */   }
/*  100:     */   
/*  101:     */   public boolean o()
/*  102:     */   {
/*  103: 609 */     return this.o == czy.n;
/*  104:     */   }
/*  105:     */   
/*  106:     */   public boolean p()
/*  107:     */   {
/*  108: 614 */     return this.o == czy.m;
/*  109:     */   }
/*  110:     */   
/*  111:     */   public boolean q()
/*  112:     */   {
/*  113: 619 */     return this.m;
/*  114:     */   }
/*  115:     */   
/*  116:     */   public IngestServer s()
/*  117:     */   {
/*  118: 633 */     return this.t;
/*  119:     */   }
/*  120:     */   
/*  121:     */   public void a(IngestServer paramIngestServer)
/*  122:     */   {
/*  123: 641 */     this.t = paramIngestServer;
/*  124:     */   }
/*  125:     */   
/*  126:     */   public IngestList t()
/*  127:     */   {
/*  128: 650 */     return this.s;
/*  129:     */   }
/*  130:     */   
/*  131:     */   public void a(float paramFloat)
/*  132:     */   {
/*  133: 662 */     this.i.setVolume(AudioDeviceType.TTV_RECORDER_DEVICE, paramFloat);
/*  134:     */   }
/*  135:     */   
/*  136:     */   public void b(float paramFloat)
/*  137:     */   {
/*  138: 674 */     this.i.setVolume(AudioDeviceType.TTV_PLAYBACK_DEVICE, paramFloat);
/*  139:     */   }
/*  140:     */   
/*  141:     */   public dai w()
/*  142:     */   {
/*  143: 682 */     return this.A;
/*  144:     */   }
/*  145:     */   
/*  146:     */   public long x()
/*  147:     */   {
/*  148: 690 */     return this.i.getStreamTime();
/*  149:     */   }
/*  150:     */   
/*  151:     */   protected boolean y()
/*  152:     */   {
/*  153: 700 */     return true;
/*  154:     */   }
/*  155:     */   
/*  156:     */   public ErrorCode A()
/*  157:     */   {
/*  158: 710 */     return this.G;
/*  159:     */   }
/*  160:     */   
/*  161:     */   public czu()
/*  162:     */   {
/*  163: 717 */     this.h = Core.getInstance();
/*  164: 719 */     if (Core.getInstance() == null) {
/*  165: 721 */       this.h = new Core(new StandardCoreAPI());
/*  166:     */     }
/*  167: 724 */     this.i = new Stream(new DesktopStreamAPI());
/*  168:     */   }
/*  169:     */   
/*  170:     */   protected PixelFormat B()
/*  171:     */   {
/*  172: 729 */     return PixelFormat.TTV_PF_RGBA;
/*  173:     */   }
/*  174:     */   
/*  175:     */   public boolean C()
/*  176:     */   {
/*  177: 737 */     if (this.l) {
/*  178: 739 */       return false;
/*  179:     */     }
/*  180: 742 */     this.i.setStreamCallbacks(this.B);
/*  181:     */     
/*  182: 744 */     ErrorCode localErrorCode = this.h.initialize(this.d, System.getProperty("java.library.path"));
/*  183: 745 */     if (!a(localErrorCode))
/*  184:     */     {
/*  185: 747 */       this.i.setStreamCallbacks(null);
/*  186: 748 */       this.G = localErrorCode;
/*  187: 749 */       return false;
/*  188:     */     }
/*  189: 752 */     localErrorCode = this.h.setTraceLevel(MessageLevel.TTV_ML_ERROR);
/*  190: 753 */     if (!a(localErrorCode))
/*  191:     */     {
/*  192: 755 */       this.i.setStreamCallbacks(null);
/*  193: 756 */       this.h.shutdown();
/*  194: 757 */       this.G = localErrorCode;
/*  195: 758 */       return false;
/*  196:     */     }
/*  197: 761 */     if (ErrorCode.succeeded(localErrorCode))
/*  198:     */     {
/*  199: 763 */       this.l = true;
/*  200: 764 */       a(czy.b);
/*  201: 765 */       return true;
/*  202:     */     }
/*  203: 769 */     this.G = localErrorCode;
/*  204: 770 */     this.h.shutdown();
/*  205: 771 */     return false;
/*  206:     */   }
/*  207:     */   
/*  208:     */   public boolean D()
/*  209:     */   {
/*  210: 780 */     if (!this.l) {
/*  211: 782 */       return true;
/*  212:     */     }
/*  213: 784 */     if (o()) {
/*  214: 786 */       return false;
/*  215:     */     }
/*  216: 789 */     this.n = true;
/*  217:     */     
/*  218: 791 */     F();
/*  219:     */     
/*  220: 793 */     this.i.setStreamCallbacks(null);
/*  221: 794 */     this.i.setStatCallbacks(null);
/*  222:     */     
/*  223: 796 */     ErrorCode localErrorCode = this.h.shutdown();
/*  224: 797 */     a(localErrorCode);
/*  225:     */     
/*  226: 799 */     this.l = false;
/*  227: 800 */     this.n = false;
/*  228: 801 */     a(czy.a);
/*  229:     */     
/*  230: 803 */     return true;
/*  231:     */   }
/*  232:     */   
/*  233:     */   public void E()
/*  234:     */   {
/*  235: 811 */     if (this.o != czy.a)
/*  236:     */     {
/*  237: 813 */       if (this.A != null) {
/*  238: 815 */         this.A.m();
/*  239:     */       }
/*  240: 818 */       while (this.A != null)
/*  241:     */       {
/*  242:     */         try
/*  243:     */         {
/*  244: 822 */           Thread.sleep(200L);
/*  245:     */         }
/*  246:     */         catch (Exception localException)
/*  247:     */         {
/*  248: 826 */           d(localException.toString());
/*  249:     */         }
/*  250: 829 */         K();
/*  251:     */       }
/*  252: 832 */       D();
/*  253:     */     }
/*  254:     */   }
/*  255:     */   
/*  256:     */   public boolean a(String paramString, AuthToken paramAuthToken)
/*  257:     */   {
/*  258: 886 */     if (o()) {
/*  259: 888 */       return false;
/*  260:     */     }
/*  261: 891 */     F();
/*  262: 893 */     if ((paramString == null) || (paramString.isEmpty()))
/*  263:     */     {
/*  264: 895 */       d("Username must be valid");
/*  265: 896 */       return false;
/*  266:     */     }
/*  267: 898 */     if ((paramAuthToken == null) || (paramAuthToken.data == null) || (paramAuthToken.data.isEmpty()))
/*  268:     */     {
/*  269: 900 */       d("Auth token must be valid");
/*  270: 901 */       return false;
/*  271:     */     }
/*  272: 904 */     this.p = paramString;
/*  273: 905 */     this.u = paramAuthToken;
/*  274: 907 */     if (b()) {
/*  275: 909 */       a(czy.d);
/*  276:     */     }
/*  277: 912 */     return true;
/*  278:     */   }
/*  279:     */   
/*  280:     */   public boolean F()
/*  281:     */   {
/*  282: 920 */     if (o()) {
/*  283: 922 */       return false;
/*  284:     */     }
/*  285: 926 */     if (m()) {
/*  286: 928 */       this.i.stop(false);
/*  287:     */     }
/*  288: 931 */     this.p = "";
/*  289: 932 */     this.u = new AuthToken();
/*  290: 934 */     if (!this.m) {
/*  291: 936 */       return false;
/*  292:     */     }
/*  293: 939 */     this.m = false;
/*  294: 942 */     if (!this.n) {
/*  295:     */       try
/*  296:     */       {
/*  297: 946 */         if (this.c != null) {
/*  298: 948 */           this.c.a();
/*  299:     */         }
/*  300:     */       }
/*  301:     */       catch (Exception localException)
/*  302:     */       {
/*  303: 953 */         d(localException.toString());
/*  304:     */       }
/*  305:     */     }
/*  306: 957 */     a(czy.b);
/*  307:     */     
/*  308: 959 */     return true;
/*  309:     */   }
/*  310:     */   
/*  311:     */   public boolean a(String paramString1, String paramString2, String paramString3)
/*  312:     */   {
/*  313: 971 */     if (!this.m) {
/*  314: 973 */       return false;
/*  315:     */     }
/*  316: 976 */     if ((paramString1 == null) || (paramString1.equals(""))) {
/*  317: 978 */       paramString1 = this.p;
/*  318:     */     }
/*  319: 981 */     if (paramString2 == null) {
/*  320: 983 */       paramString2 = "";
/*  321:     */     }
/*  322: 986 */     if (paramString3 == null) {
/*  323: 988 */       paramString3 = "";
/*  324:     */     }
/*  325: 991 */     StreamInfoForSetting localStreamInfoForSetting = new StreamInfoForSetting();
/*  326: 992 */     localStreamInfoForSetting.streamTitle = paramString3;
/*  327: 993 */     localStreamInfoForSetting.gameName = paramString2;
/*  328:     */     
/*  329: 995 */     ErrorCode localErrorCode = this.i.setStreamInfo(this.u, paramString1, localStreamInfoForSetting);
/*  330: 996 */     a(localErrorCode);
/*  331:     */     
/*  332: 998 */     return ErrorCode.succeeded(localErrorCode);
/*  333:     */   }
/*  334:     */   
/*  335:     */   public boolean G()
/*  336:     */   {
/*  337:1007 */     if (!m()) {
/*  338:1009 */       return false;
/*  339:     */     }
/*  340:1012 */     ErrorCode localErrorCode = this.i.runCommercial(this.u);
/*  341:1013 */     a(localErrorCode);
/*  342:     */     
/*  343:1015 */     return ErrorCode.succeeded(localErrorCode);
/*  344:     */   }
/*  345:     */   
/*  346:     */   public VideoParams a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
/*  347:     */   {
/*  348:1034 */     int[] arrayOfInt = this.i.getMaxResolution(paramInt1, paramInt2, paramFloat1, paramFloat2);
/*  349:     */     
/*  350:1036 */     VideoParams localVideoParams = new VideoParams();
/*  351:1037 */     localVideoParams.maxKbps = paramInt1;
/*  352:1038 */     localVideoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
/*  353:1039 */     localVideoParams.pixelFormat = B();
/*  354:1040 */     localVideoParams.targetFps = paramInt2;
/*  355:1041 */     localVideoParams.outputWidth = arrayOfInt[0];
/*  356:1042 */     localVideoParams.outputHeight = arrayOfInt[1];
/*  357:1043 */     localVideoParams.disableAdaptiveBitrate = false;
/*  358:1044 */     localVideoParams.verticalFlip = false;
/*  359:     */     
/*  360:1046 */     return localVideoParams;
/*  361:     */   }
/*  362:     */   
/*  363:     */   public boolean a(VideoParams paramVideoParams)
/*  364:     */   {
/*  365:1089 */     if ((paramVideoParams == null) || (!n())) {
/*  366:1091 */       return false;
/*  367:     */     }
/*  368:1094 */     this.q = paramVideoParams.clone();
/*  369:     */     
/*  370:     */ 
/*  371:1097 */     this.r = new AudioParams();
/*  372:1098 */     this.r.audioEnabled = ((this.g) && (y()));
/*  373:1099 */     this.r.enableMicCapture = this.r.audioEnabled;
/*  374:1100 */     this.r.enablePlaybackCapture = this.r.audioEnabled;
/*  375:1101 */     this.r.enablePassthroughAudio = false;
/*  376:1103 */     if (!O())
/*  377:     */     {
/*  378:1105 */       this.q = null;
/*  379:1106 */       this.r = null;
/*  380:1107 */       return false;
/*  381:     */     }
/*  382:1110 */     ErrorCode localErrorCode = this.i.start(paramVideoParams, this.r, this.t, StartFlags.None, true);
/*  383:1111 */     if (ErrorCode.failed(localErrorCode))
/*  384:     */     {
/*  385:1113 */       P();
/*  386:     */       
/*  387:1115 */       String str = ErrorCode.getString(localErrorCode);
/*  388:1116 */       d(String.format("Error while starting to broadcast: %s", new Object[] { str }));
/*  389:     */       
/*  390:1118 */       this.q = null;
/*  391:1119 */       this.r = null;
/*  392:     */       
/*  393:1121 */       return false;
/*  394:     */     }
/*  395:1124 */     a(czy.j);
/*  396:     */     
/*  397:1126 */     return true;
/*  398:     */   }
/*  399:     */   
/*  400:     */   public boolean H()
/*  401:     */   {
/*  402:1135 */     if (!m()) {
/*  403:1137 */       return false;
/*  404:     */     }
/*  405:1140 */     ErrorCode localErrorCode = this.i.stop(true);
/*  406:1141 */     if (ErrorCode.failed(localErrorCode))
/*  407:     */     {
/*  408:1143 */       String str = ErrorCode.getString(localErrorCode);
/*  409:1144 */       d(String.format("Error while stopping the broadcast: %s", new Object[] { str }));
/*  410:1145 */       return false;
/*  411:     */     }
/*  412:1148 */     a(czy.l);
/*  413:     */     
/*  414:1150 */     return ErrorCode.succeeded(localErrorCode);
/*  415:     */   }
/*  416:     */   
/*  417:     */   public boolean I()
/*  418:     */   {
/*  419:1159 */     if (!m()) {
/*  420:1161 */       return false;
/*  421:     */     }
/*  422:1164 */     ErrorCode localErrorCode = this.i.pauseVideo();
/*  423:1165 */     if (ErrorCode.failed(localErrorCode))
/*  424:     */     {
/*  425:1168 */       H();
/*  426:     */       
/*  427:1170 */       String str = ErrorCode.getString(localErrorCode);
/*  428:1171 */       d(String.format("Error pausing stream: %s\n", new Object[] { str }));
/*  429:     */     }
/*  430:     */     else
/*  431:     */     {
/*  432:1175 */       a(czy.m);
/*  433:     */     }
/*  434:1178 */     return ErrorCode.succeeded(localErrorCode);
/*  435:     */   }
/*  436:     */   
/*  437:     */   public boolean J()
/*  438:     */   {
/*  439:1187 */     if (!p()) {
/*  440:1189 */       return false;
/*  441:     */     }
/*  442:1192 */     a(czy.k);
/*  443:     */     
/*  444:1194 */     return true;
/*  445:     */   }
/*  446:     */   
/*  447:     */   public boolean a(String paramString1, long paramLong, String paramString2, String paramString3)
/*  448:     */   {
/*  449:1207 */     ErrorCode localErrorCode = this.i.sendActionMetaData(this.u, paramString1, paramLong, paramString2, paramString3);
/*  450:1208 */     if (ErrorCode.failed(localErrorCode))
/*  451:     */     {
/*  452:1210 */       String str = ErrorCode.getString(localErrorCode);
/*  453:1211 */       d(String.format("Error while sending meta data: %s\n", new Object[] { str }));
/*  454:     */       
/*  455:1213 */       return false;
/*  456:     */     }
/*  457:1216 */     return true;
/*  458:     */   }
/*  459:     */   
/*  460:     */   public long b(String paramString1, long paramLong, String paramString2, String paramString3)
/*  461:     */   {
/*  462:1229 */     long l1 = this.i.sendStartSpanMetaData(this.u, paramString1, paramLong, paramString2, paramString3);
/*  463:1230 */     if (l1 == -1L) {
/*  464:1232 */       d(String.format("Error in SendStartSpanMetaData\n", new Object[0]));
/*  465:     */     }
/*  466:1235 */     return l1;
/*  467:     */   }
/*  468:     */   
/*  469:     */   public boolean a(String paramString1, long paramLong1, long paramLong2, String paramString2, String paramString3)
/*  470:     */   {
/*  471:1249 */     if (paramLong2 == -1L)
/*  472:     */     {
/*  473:1251 */       d(String.format("Invalid sequence id: %d\n", new Object[] { Long.valueOf(paramLong2) }));
/*  474:1252 */       return false;
/*  475:     */     }
/*  476:1255 */     ErrorCode localErrorCode = this.i.sendEndSpanMetaData(this.u, paramString1, paramLong1, paramLong2, paramString2, paramString3);
/*  477:1256 */     if (ErrorCode.failed(localErrorCode))
/*  478:     */     {
/*  479:1258 */       String str = ErrorCode.getString(localErrorCode);
/*  480:1259 */       d(String.format("Error in SendStopSpanMetaData: %s\n", new Object[] { str }));
/*  481:     */       
/*  482:1261 */       return false;
/*  483:     */     }
/*  484:1264 */     return true;
/*  485:     */   }
/*  486:     */   
/*  487:     */   protected void a(czy paramczy)
/*  488:     */   {
/*  489:1283 */     if (paramczy == this.o) {
/*  490:1285 */       return;
/*  491:     */     }
/*  492:1288 */     this.o = paramczy;
/*  493:     */     try
/*  494:     */     {
/*  495:1292 */       if (this.c != null) {
/*  496:1294 */         this.c.a(paramczy);
/*  497:     */       }
/*  498:     */     }
/*  499:     */     catch (Exception localException)
/*  500:     */     {
/*  501:1299 */       d(localException.toString());
/*  502:     */     }
/*  503:     */   }
/*  504:     */   
/*  505:     */   public void K()
/*  506:     */   {
/*  507:1309 */     if ((this.i == null) || (!this.l)) {
/*  508:1311 */       return;
/*  509:     */     }
/*  510:1314 */     ErrorCode localErrorCode = this.i.pollTasks();
/*  511:1315 */     a(localErrorCode);
/*  512:1318 */     if (o())
/*  513:     */     {
/*  514:1320 */       this.A.k();
/*  515:1323 */       if (this.A.f())
/*  516:     */       {
/*  517:1325 */         this.A = null;
/*  518:1326 */         a(czy.i);
/*  519:     */       }
/*  520:     */     }
/*  521:     */     String str;
/*  522:1330 */     switch (czx.a[this.o.ordinal()])
/*  523:     */     {
/*  524:     */     case 1: 
/*  525:1335 */       a(czy.e);
/*  526:     */       
/*  527:1337 */       localErrorCode = this.i.login(this.u);
/*  528:1338 */       if (ErrorCode.failed(localErrorCode))
/*  529:     */       {
/*  530:1340 */         str = ErrorCode.getString(localErrorCode);
/*  531:1341 */         d(String.format("Error in TTV_Login: %s\n", new Object[] { str }));
/*  532:     */       }
/*  533:1342 */       break;
/*  534:     */     case 2: 
/*  535:1348 */       a(czy.g);
/*  536:     */       
/*  537:1350 */       localErrorCode = this.i.getIngestServers(this.u);
/*  538:1351 */       if (ErrorCode.failed(localErrorCode))
/*  539:     */       {
/*  540:1353 */         a(czy.f);
/*  541:     */         
/*  542:1355 */         str = ErrorCode.getString(localErrorCode);
/*  543:1356 */         d(String.format("Error in TTV_GetIngestServers: %s\n", new Object[] { str }));
/*  544:     */       }
/*  545:1357 */       break;
/*  546:     */     case 3: 
/*  547:1363 */       a(czy.i);
/*  548:     */       
/*  549:     */ 
/*  550:1366 */       localErrorCode = this.i.getUserInfo(this.u);
/*  551:1367 */       if (ErrorCode.failed(localErrorCode))
/*  552:     */       {
/*  553:1369 */         str = ErrorCode.getString(localErrorCode);
/*  554:1370 */         d(String.format("Error in TTV_GetUserInfo: %s\n", new Object[] { str }));
/*  555:     */       }
/*  556:1373 */       L();
/*  557:     */       
/*  558:1375 */       localErrorCode = this.i.getArchivingState(this.u);
/*  559:1376 */       if (ErrorCode.failed(localErrorCode))
/*  560:     */       {
/*  561:1378 */         str = ErrorCode.getString(localErrorCode);
/*  562:1379 */         d(String.format("Error in TTV_GetArchivingState: %s\n", new Object[] { str }));
/*  563:     */       }
/*  564:1380 */       break;
/*  565:     */     case 4: 
/*  566:     */     case 5: 
/*  567:     */       break;
/*  568:     */     case 6: 
/*  569:     */     case 7: 
/*  570:     */     case 8: 
/*  571:     */     case 9: 
/*  572:     */     case 10: 
/*  573:     */       break;
/*  574:     */     case 11: 
/*  575:     */     case 12: 
/*  576:1402 */       L();
/*  577:1403 */       break;
/*  578:     */     }
/*  579:     */   }
/*  580:     */   
/*  581:     */   protected void L()
/*  582:     */   {
/*  583:1414 */     long l1 = System.nanoTime();
/*  584:1415 */     long l2 = (l1 - this.z) / 1000000000L;
/*  585:1418 */     if (l2 < 30L) {
/*  586:1420 */       return;
/*  587:     */     }
/*  588:1423 */     this.z = l1;
/*  589:     */     
/*  590:1425 */     ErrorCode localErrorCode = this.i.getStreamInfo(this.u, this.p);
/*  591:1426 */     if (ErrorCode.failed(localErrorCode))
/*  592:     */     {
/*  593:1428 */       String str = ErrorCode.getString(localErrorCode);
/*  594:1429 */       d(String.format("Error in TTV_GetStreamInfo: %s", new Object[] { str }));
/*  595:     */     }
/*  596:     */   }
/*  597:     */   
/*  598:     */   public dai M()
/*  599:     */   {
/*  600:1442 */     if ((!n()) || (this.s == null)) {
/*  601:1444 */       return null;
/*  602:     */     }
/*  603:1447 */     if (o()) {
/*  604:1449 */       return null;
/*  605:     */     }
/*  606:1452 */     this.A = new dai(this.i, this.s);
/*  607:1453 */     this.A.j();
/*  608:     */     
/*  609:1455 */     a(czy.n);
/*  610:     */     
/*  611:1457 */     return this.A;
/*  612:     */   }
/*  613:     */   
/*  614:     */   protected boolean O()
/*  615:     */   {
/*  616:1477 */     for (int i1 = 0; i1 < 3; i1++)
/*  617:     */     {
/*  618:1479 */       FrameBuffer localFrameBuffer = this.i.allocateFrameBuffer(this.q.outputWidth * this.q.outputHeight * 4);
/*  619:1480 */       if (!localFrameBuffer.getIsValid())
/*  620:     */       {
/*  621:1482 */         d(String.format("Error while allocating frame buffer", new Object[0]));
/*  622:1483 */         return false;
/*  623:     */       }
/*  624:1486 */       this.j.add(localFrameBuffer);
/*  625:1487 */       this.k.add(localFrameBuffer);
/*  626:     */     }
/*  627:1490 */     return true;
/*  628:     */   }
/*  629:     */   
/*  630:     */   protected void P()
/*  631:     */   {
/*  632:1496 */     for (int i1 = 0; i1 < this.j.size(); i1++)
/*  633:     */     {
/*  634:1498 */       FrameBuffer localFrameBuffer = (FrameBuffer)this.j.get(i1);
/*  635:1499 */       localFrameBuffer.free();
/*  636:     */     }
/*  637:1502 */     this.k.clear();
/*  638:1503 */     this.j.clear();
/*  639:     */   }
/*  640:     */   
/*  641:     */   public FrameBuffer Q()
/*  642:     */   {
/*  643:1508 */     if (this.k.size() == 0)
/*  644:     */     {
/*  645:1510 */       d(String.format("Out of free buffers, this should never happen", new Object[0]));
/*  646:1511 */       return null;
/*  647:     */     }
/*  648:1514 */     FrameBuffer localFrameBuffer = (FrameBuffer)this.k.get(this.k.size() - 1);
/*  649:1515 */     this.k.remove(this.k.size() - 1);
/*  650:     */     
/*  651:1517 */     return localFrameBuffer;
/*  652:     */   }
/*  653:     */   
/*  654:     */   public void a(FrameBuffer paramFrameBuffer)
/*  655:     */   {
/*  656:     */     try
/*  657:     */     {
/*  658:1524 */       this.i.captureFrameBuffer_ReadPixels(paramFrameBuffer);
/*  659:     */     }
/*  660:     */     catch (Throwable localThrowable)
/*  661:     */     {
/*  662:1528 */       b localb = net.minecraft.src.b.a(localThrowable, "Trying to submit a frame to Twitch");
/*  663:1529 */       j localj = localb.a("Broadcast State");
/*  664:1530 */       localj.a("Last reported errors", Arrays.toString(E.c()));
/*  665:1531 */       localj.a("Buffer", paramFrameBuffer);
/*  666:1532 */       localj.a("Free buffer count", Integer.valueOf(this.k.size()));
/*  667:1533 */       localj.a("Capture buffer count", Integer.valueOf(this.j.size()));
/*  668:1534 */       throw new u(localb);
/*  669:     */     }
/*  670:     */   }
/*  671:     */   
/*  672:     */   public ErrorCode b(FrameBuffer paramFrameBuffer)
/*  673:     */   {
/*  674:1540 */     if (p()) {
/*  675:1542 */       J();
/*  676:1544 */     } else if (!m()) {
/*  677:1546 */       return ErrorCode.TTV_EC_STREAM_NOT_STARTED;
/*  678:     */     }
/*  679:1549 */     ErrorCode localErrorCode = this.i.submitVideoFrame(paramFrameBuffer);
/*  680:1552 */     if (localErrorCode != ErrorCode.TTV_EC_SUCCESS)
/*  681:     */     {
/*  682:1554 */       String str = ErrorCode.getString(localErrorCode);
/*  683:1555 */       if (ErrorCode.succeeded(localErrorCode))
/*  684:     */       {
/*  685:1557 */         e(String.format("Warning in SubmitTexturePointer: %s\n", new Object[] { str }));
/*  686:     */       }
/*  687:     */       else
/*  688:     */       {
/*  689:1561 */         d(String.format("Error in SubmitTexturePointer: %s\n", new Object[] { str }));
/*  690:     */         
/*  691:     */ 
/*  692:1564 */         H();
/*  693:     */       }
/*  694:1567 */       if (this.c != null) {
/*  695:1569 */         this.c.b(localErrorCode);
/*  696:     */       }
/*  697:     */     }
/*  698:1573 */     return localErrorCode;
/*  699:     */   }
/*  700:     */   
/*  701:     */   protected boolean a(ErrorCode paramErrorCode)
/*  702:     */   {
/*  703:1578 */     if (ErrorCode.failed(paramErrorCode))
/*  704:     */     {
/*  705:1580 */       d(ErrorCode.getString(paramErrorCode));
/*  706:1581 */       return false;
/*  707:     */     }
/*  708:1584 */     return true;
/*  709:     */   }
/*  710:     */   
/*  711:     */   protected void d(String paramString)
/*  712:     */   {
/*  713:1589 */     this.F = paramString;
/*  714:1590 */     E.a("<Error> " + paramString);
/*  715:1591 */     D.error(daq.a, "[Broadcast controller] {}", new Object[] { paramString });
/*  716:     */   }
/*  717:     */   
/*  718:     */   protected void e(String paramString)
/*  719:     */   {
/*  720:1596 */     E.a("<Warning> " + paramString);
/*  721:1597 */     D.warn(daq.a, "[Broadcast controller] {}", new Object[] { paramString });
/*  722:     */   }
/*  723:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     czu
 * JD-Core Version:    0.7.0.1
 */