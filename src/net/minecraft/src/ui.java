package net.minecraft.src;
/*   1:    */ import com.google.common.util.concurrent.ListenableFuture;
/*   2:    */ import com.google.common.util.concurrent.ListeningExecutorService;
/*   3:    */ import com.google.common.util.concurrent.MoreExecutors;
/*   4:    */ import com.google.common.util.concurrent.ThreadFactoryBuilder;

/*   5:    */ import java.io.BufferedReader;
/*   6:    */ import java.io.DataOutputStream;
/*   7:    */ import java.io.File;
/*   8:    */ import java.io.IOException;
/*   9:    */ import java.io.InputStreamReader;
/*  10:    */ import java.io.UnsupportedEncodingException;
/*  11:    */ import java.net.HttpURLConnection;
/*  12:    */ import java.net.Proxy;
/*  13:    */ import java.net.ServerSocket;
/*  14:    */ import java.net.URL;
/*  15:    */ import java.net.URLEncoder;
/*  16:    */ import java.util.Map;
/*  17:    */ import java.util.Map.Entry;
/*  18:    */ import java.util.concurrent.Executors;
/*  19:    */ import java.util.concurrent.atomic.AtomicInteger;

/*  20:    */ import net.minecraft.server.MinecraftServer;

/*  21:    */ import org.apache.logging.log4j.LogManager;
/*  22:    */ import org.apache.logging.log4j.Logger;
/*  23:    */ 
/*  24:    */ public class ui
/*  25:    */ {
/*  26: 23 */   public static final ListeningExecutorService a = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Downloader %d").build()));
/*  27: 24 */   private static final AtomicInteger b = new AtomicInteger(0);
/*  28: 25 */   private static final Logger c = LogManager.getLogger();
/*  29:    */   
/*  30:    */   public static String a(Map<String,Object> paramMap)
/*  31:    */   {
/*  32: 30 */     StringBuilder localStringBuilder = new StringBuilder();
/*  33: 32 */     for (Map.Entry<String,Object> localEntry : paramMap.entrySet())
/*  34:    */     {
/*  35: 33 */       if (localStringBuilder.length() > 0) {
/*  36: 34 */         localStringBuilder.append('&');
/*  37:    */       }
/*  38:    */       try
/*  39:    */       {
/*  40: 38 */         localStringBuilder.append(URLEncoder.encode((String)localEntry.getKey(), "UTF-8"));
/*  41:    */       }
/*  42:    */       catch (UnsupportedEncodingException localUnsupportedEncodingException1)
/*  43:    */       {
/*  44: 40 */         localUnsupportedEncodingException1.printStackTrace();
/*  45:    */       }
/*  46: 43 */       if (localEntry.getValue() != null)
/*  47:    */       {
/*  48: 44 */         localStringBuilder.append('=');
/*  49:    */         try
/*  50:    */         {
/*  51: 46 */           localStringBuilder.append(URLEncoder.encode(localEntry.getValue().toString(), "UTF-8"));
/*  52:    */         }
/*  53:    */         catch (UnsupportedEncodingException localUnsupportedEncodingException2)
/*  54:    */         {
/*  55: 48 */           localUnsupportedEncodingException2.printStackTrace();
/*  56:    */         }
/*  57:    */       }
/*  58:    */     }
/*  59: 53 */     return localStringBuilder.toString();
/*  60:    */   }
/*  61:    */   
/*  62:    */   public static String a(URL paramURL, Map paramMap, boolean paramBoolean)
/*  63:    */   {
/*  64: 57 */     return a(paramURL, a(paramMap), paramBoolean);
/*  65:    */   }
/*  66:    */   
/*  67:    */   private static String a(URL paramURL, String paramString, boolean paramBoolean)
/*  68:    */   {
/*  69:    */     try
/*  70:    */     {
/*  71: 62 */       Proxy localProxy = MinecraftServer.M() == null ? null : MinecraftServer.M().aw();
/*  72: 63 */       if (localProxy == null) {
/*  73: 64 */         localProxy = Proxy.NO_PROXY;
/*  74:    */       }
/*  75: 66 */       HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection(localProxy);
/*  76: 67 */       localHttpURLConnection.setRequestMethod("POST");
/*  77: 68 */       localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
/*  78:    */       
/*  79: 70 */       localHttpURLConnection.setRequestProperty("Content-Length", "" + paramString.getBytes().length);
/*  80: 71 */       localHttpURLConnection.setRequestProperty("Content-Language", "en-US");
/*  81:    */       
/*  82: 73 */       localHttpURLConnection.setUseCaches(false);
/*  83: 74 */       localHttpURLConnection.setDoInput(true);
/*  84: 75 */       localHttpURLConnection.setDoOutput(true);
/*  85:    */       
/*  86:    */ 
/*  87: 78 */       DataOutputStream localDataOutputStream = new DataOutputStream(localHttpURLConnection.getOutputStream());
/*  88: 79 */       localDataOutputStream.writeBytes(paramString);
/*  89: 80 */       localDataOutputStream.flush();
/*  90: 81 */       localDataOutputStream.close();
/*  91:    */       
/*  92:    */ 
/*  93: 84 */       BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localHttpURLConnection.getInputStream()));
/*  94:    */       
/*  95: 86 */       StringBuffer localStringBuffer = new StringBuffer();
/*  96:    */       String str;
/*  97: 88 */       while ((str = localBufferedReader.readLine()) != null)
/*  98:    */       {
/*  99: 89 */         localStringBuffer.append(str);
/* 100: 90 */         localStringBuffer.append('\r');
/* 101:    */       }
/* 102: 93 */       localBufferedReader.close();
/* 103: 94 */       return localStringBuffer.toString();
/* 104:    */     }
/* 105:    */     catch (Exception localException)
/* 106:    */     {
/* 107: 96 */       if (!paramBoolean) {
/* 108: 97 */         c.error("Could not post to " + paramURL, localException);
/* 109:    */       }
/* 110:    */     }
/* 111: 99 */     return "";
/* 112:    */   }
/* 113:    */   
/* 114:    */   public static ListenableFuture<?> a(File paramFile, String paramString, Map<String,String> paramMap, int paramInt, uy paramuy, Proxy paramProxy)
/* 115:    */   {
/* 116:106 */     ListenableFuture<?> localListenableFuture = a.submit(new uj(paramuy, paramString, paramProxy, paramMap, paramFile, paramInt));
/* 117:    */     
/* 118:    */ 
/* 119:    */ 
/* 120:    */ 
/* 121:    */ 
/* 122:    */ 
/* 123:    */ 
/* 124:    */ 
/* 125:    */ 
/* 126:    */ 
/* 127:    */ 
/* 128:    */ 
/* 129:    */ 
/* 130:    */ 
/* 131:    */ 
/* 132:    */ 
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
/* 147:    */ 
/* 148:    */ 
/* 149:    */ 
/* 150:    */ 
/* 151:    */ 
/* 152:    */ 
/* 153:    */ 
/* 154:    */ 
/* 155:    */ 
/* 156:    */ 
/* 157:    */ 
/* 158:    */ 
/* 159:    */ 
/* 160:    */ 
/* 161:    */ 
/* 162:    */ 
/* 163:    */ 
/* 164:    */ 
/* 165:    */ 
/* 166:    */ 
/* 167:    */ 
/* 168:    */ 
/* 169:    */ 
/* 170:    */ 
/* 171:    */ 
/* 172:    */ 
/* 173:    */ 
/* 174:    */ 
/* 175:    */ 
/* 176:    */ 
/* 177:    */ 
/* 178:    */ 
/* 179:    */ 
/* 180:    */ 
/* 181:    */ 
/* 182:    */ 
/* 183:    */ 
/* 184:    */ 
/* 185:    */ 
/* 186:    */ 
/* 187:    */ 
/* 188:    */ 
/* 189:    */ 
/* 190:    */ 
/* 191:    */ 
/* 192:    */ 
/* 193:    */ 
/* 194:    */ 
/* 195:    */ 
/* 196:    */ 
/* 197:    */ 
/* 198:    */ 
/* 199:    */ 
/* 200:    */ 
/* 201:    */ 
/* 202:    */ 
/* 203:193 */     return localListenableFuture;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public static int a() throws IOException
/* 207:    */   {
/* 208:197 */     ServerSocket localServerSocket = null;
/* 209:198 */     int i = -1;
/* 210:    */     try
/* 211:    */     {
/* 212:201 */       localServerSocket = new ServerSocket(0);
/* 213:202 */       return localServerSocket.getLocalPort();
/* 214:    */     }
/* 215:    */     finally
/* 216:    */     {
/* 217:    */       try
/* 218:    */       {
/* 219:205 */         if (localServerSocket != null) {
/* 220:206 */           localServerSocket.close();
/* 221:    */         }
/* 222:    */       }
/* 223:    */       catch (IOException localIOException2) {}
/* 224:    */     }
/* 225:    */   }
/* 226:    */   
/* 227:    */   public static String a(URL paramURL) throws IOException
/* 228:    */   {
/* 229:246 */     HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection();
/* 230:247 */     localHttpURLConnection.setRequestMethod("GET");
/* 231:    */     
/* 232:    */ 
/* 233:250 */     BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localHttpURLConnection.getInputStream()));
/* 234:    */     
/* 235:252 */     StringBuilder localStringBuilder = new StringBuilder();
/* 236:    */     String str;
/* 237:254 */     while ((str = localBufferedReader.readLine()) != null)
/* 238:    */     {
/* 239:255 */       localStringBuilder.append(str);
/* 240:256 */       localStringBuilder.append('\r');
/* 241:    */     }
/* 242:259 */     localBufferedReader.close();
/* 243:260 */     return localStringBuilder.toString();
/* 244:    */   }
				static Logger b() {return c;}
/* 245:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ui
 * JD-Core Version:    0.7.0.1
 */