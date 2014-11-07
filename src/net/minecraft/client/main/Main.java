/*   1:    */ package net.minecraft.client.main;
/*  14:    */ import com.google.gson.GsonBuilder;
/*  15:    */ import com.mojang.authlib.properties.PropertyMap;

/*  17:    */ import java.io.File;
/*  19:    */ import java.net.Authenticator;
/*  20:    */ import java.net.InetSocketAddress;
/*  21:    */ import java.net.Proxy;
/*  23:    */ import java.util.List;

import net.minecraft.src.bsu;
import net.minecraft.src.btw;
import net.minecraft.src.cbf;
import net.minecraft.src.cbg;
import net.minecraft.src.cbh;
import net.minecraft.src.cbi;
import net.minecraft.src.cbj;
import net.minecraft.src.cbk;
import net.minecraft.src.cbl;
import net.minecraft.src.cbm;
/*  24:    */ import joptsimple.ArgumentAcceptingOptionSpec;
/*  25:    */ import joptsimple.NonOptionArgumentSpec;
/*  26:    */ import joptsimple.OptionParser;
/*  27:    */ import joptsimple.OptionSet;
/*  30:    */ 
/*  31:    */ public class Main
/*  32:    */ {
/*  33:    */   public static void main(String[] args)
/*  34:    */   {
/*  35: 23 */     System.setProperty("java.net.preferIPv4Stack", "true");
/*  36:    */     
/*  37: 25 */     OptionParser localOptionParser = new OptionParser();
/*  38: 26 */     localOptionParser.allowsUnrecognizedOptions();
/*  39:    */     
/*  40: 28 */     localOptionParser.accepts("demo");
/*  41: 29 */     localOptionParser.accepts("fullscreen");
/*  42: 30 */     localOptionParser.accepts("checkGlErrors");
/*  43: 31 */     ArgumentAcceptingOptionSpec<String> argServer = localOptionParser.accepts("server").withRequiredArg();
/*  44: 32 */     ArgumentAcceptingOptionSpec<Integer> argPort = localOptionParser.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(25565), new Integer[0]);
/*  45: 33 */     ArgumentAcceptingOptionSpec<File> argGameDir = localOptionParser.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), new File[0]);
/*  46: 34 */     ArgumentAcceptingOptionSpec<File> argAssetsDir = localOptionParser.accepts("assetsDir").withRequiredArg().ofType(File.class);
/*  47: 35 */     ArgumentAcceptingOptionSpec<File> argResourcePackDir = localOptionParser.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
/*  48: 36 */     ArgumentAcceptingOptionSpec<String> argProxyHost = localOptionParser.accepts("proxyHost").withRequiredArg();
/*  49: 37 */     ArgumentAcceptingOptionSpec<Integer> argProxyPort = localOptionParser.accepts("proxyPort").withRequiredArg().defaultsTo("8080", new String[0]).ofType(Integer.class);
/*  50: 38 */     ArgumentAcceptingOptionSpec<String> argProxyUser = localOptionParser.accepts("proxyUser").withRequiredArg();
/*  51: 39 */     ArgumentAcceptingOptionSpec<String> argProxyPass = localOptionParser.accepts("proxyPass").withRequiredArg();
/*  52: 40 */     ArgumentAcceptingOptionSpec<String> argUsername = localOptionParser.accepts("username").withRequiredArg().defaultsTo("Player" + bsu.I() % 1000L, new String[0]);
/*  53: 41 */     ArgumentAcceptingOptionSpec<String> argUUID = localOptionParser.accepts("uuid").withRequiredArg();
/*  54: 42 */     ArgumentAcceptingOptionSpec<String> argAccessToken = localOptionParser.accepts("accessToken").withRequiredArg().required();
/*  55: 43 */     ArgumentAcceptingOptionSpec<String> argVersion = localOptionParser.accepts("version").withRequiredArg().required();
/*  56: 44 */     ArgumentAcceptingOptionSpec<Integer> argWidth = localOptionParser.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(854), new Integer[0]);
/*  57: 45 */     ArgumentAcceptingOptionSpec<Integer> argHeight = localOptionParser.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(480), new Integer[0]);
/*  58: 46 */     ArgumentAcceptingOptionSpec<String> argUserProperties = localOptionParser.accepts("userProperties").withRequiredArg().required();
/*  59: 47 */     ArgumentAcceptingOptionSpec<String> argAssetIndex = localOptionParser.accepts("assetIndex").withRequiredArg();
/*  60: 48 */     ArgumentAcceptingOptionSpec<String> argUserType = localOptionParser.accepts("userType").withRequiredArg().defaultsTo("legacy", new String[0]);
/*  61: 49 */     NonOptionArgumentSpec<String> nonOptions = localOptionParser.nonOptions();
/*  62:    */     
/*  63: 51 */     OptionSet localOptionSet = localOptionParser.parse(args);
/*  64: 52 */     List<String> localList = localOptionSet.valuesOf(nonOptions);
/*  65: 54 */     if (!localList.isEmpty()) {
/*  66: 55 */       System.out.println("Completely ignored arguments: " + localList);
/*  67:    */     }
/*  68: 59 */     String str1 = localOptionSet.valueOf(argProxyHost);
/*  69: 60 */     Proxy localProxy = Proxy.NO_PROXY;
/*  70: 61 */     if (str1 != null) {
/*  71:    */       try
/*  72:    */       {
/*  73: 63 */         localProxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(str1, localOptionSet.valueOf(argProxyPort).intValue()));
/*  74:    */       }
/*  75:    */       catch (Exception localException) {}
/*  76:    */     }
/*  77: 69 */     String str2 = localOptionSet.valueOf(argProxyUser);
/*  78: 70 */     String str3 = localOptionSet.valueOf(argProxyPass);
/*  79: 71 */     if ((!localProxy.equals(Proxy.NO_PROXY)) && (a(str2)) && (a(str3))) {
/*  80: 72 */       Authenticator.setDefault(new cbl(str2, str3));
/*  81:    */     }
/*  82: 81 */     int i = localOptionSet.valueOf(argWidth).intValue();
/*  83: 82 */     int j = localOptionSet.valueOf(argHeight).intValue();
/*  84: 83 */     boolean bool1 = localOptionSet.has("fullscreen");
/*  85: 84 */     boolean bool2 = localOptionSet.has("checkGlErrors");
/*  86: 85 */     boolean bool3 = localOptionSet.has("demo");
/*  87: 86 */     String str4 = localOptionSet.valueOf(argVersion);
/*  88: 87 */     PropertyMap localPropertyMap = new GsonBuilder().registerTypeAdapter(PropertyMap.class, new PropertyMap.Serializer()).create().fromJson((String)localOptionSet.valueOf(argUserProperties), PropertyMap.class);
/*  89:    */     
/*  90:    */ 
/*  91: 90 */     File localFile1 = localOptionSet.valueOf(argGameDir);
/*  92: 91 */     File localFile2 = localOptionSet.has(argAssetsDir) ? localOptionSet.valueOf(argAssetsDir) : new File(localFile1, "assets/");
/*  93: 92 */     File localFile3 = localOptionSet.has(argResourcePackDir) ? localOptionSet.valueOf(argResourcePackDir) : new File(localFile1, "resourcepacks/");
/*  94: 93 */     String str5 = localOptionSet.has(argUUID) ? argUUID.value(localOptionSet) : argUsername.value(localOptionSet);
/*  95: 94 */     String str6 = localOptionSet.has(argAssetIndex) ? argAssetIndex.value(localOptionSet) : null;
/*  96:    */     
/*  97:    */ 
/*  98: 97 */     String str7 = localOptionSet.valueOf(argServer);
/*  99: 98 */     Integer localInteger = localOptionSet.valueOf(argPort);
/* 100:    */     
/* 101:    */ 
/* 102:101 */     btw localbtw = new btw(argUsername.value(localOptionSet), str5, argAccessToken.value(localOptionSet), argUserType.value(localOptionSet));
/* 103:102 */     cbf localcbf = new cbf(new cbk(localbtw, localPropertyMap, localProxy), new cbg(i, j, bool1, bool2), new cbh(localFile1, localFile3, localFile2, str6), new cbi(bool3, str4), new cbj(str7, localInteger.intValue()));
/* 104:    */     
/* 105:    */ 
/* 106:    */ 
/* 107:    */ 
/* 108:    */ 
/* 109:    */ 
/* 110:    */ 
/* 111:110 */     Runtime.getRuntime().addShutdownHook(new cbm("Client Shutdown Thread"));
/* 112:    */     
/* 113:    */ 
/* 114:    */ 
/* 115:    */ 
/* 116:    */ 
/* 117:    */ 
/* 118:117 */     Thread.currentThread().setName("Client thread");
/* 119:    */     
/* 120:    */ 
/* 121:120 */     new bsu(localcbf).a();
/* 122:    */   }
/* 123:    */   
/* 124:    */   private static boolean a(String paramString)
/* 125:    */   {
/* 126:124 */     return (paramString != null) && (!paramString.isEmpty());
/* 127:    */   }
/* 128:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.client.main.Main
 * JD-Core Version:    0.7.0.1
 */