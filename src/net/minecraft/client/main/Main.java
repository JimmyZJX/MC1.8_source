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
/*  33:    */   public static void main(String[] paramArrayOfString)
/*  34:    */   {
/*  35: 23 */     System.setProperty("java.net.preferIPv4Stack", "true");
/*  36:    */     
/*  37: 25 */     OptionParser localOptionParser = new OptionParser();
/*  38: 26 */     localOptionParser.allowsUnrecognizedOptions();
/*  39:    */     
/*  40: 28 */     localOptionParser.accepts("demo");
/*  41: 29 */     localOptionParser.accepts("fullscreen");
/*  42: 30 */     localOptionParser.accepts("checkGlErrors");
/*  43: 31 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec1 = localOptionParser.accepts("server").withRequiredArg();
/*  44: 32 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec2 = localOptionParser.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(25565), new Integer[0]);
/*  45: 33 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec3 = localOptionParser.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), new File[0]);
/*  46: 34 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec4 = localOptionParser.accepts("assetsDir").withRequiredArg().ofType(File.class);
/*  47: 35 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec5 = localOptionParser.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
/*  48: 36 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec6 = localOptionParser.accepts("proxyHost").withRequiredArg();
/*  49: 37 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec7 = localOptionParser.accepts("proxyPort").withRequiredArg().defaultsTo("8080", new String[0]).ofType(Integer.class);
/*  50: 38 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec8 = localOptionParser.accepts("proxyUser").withRequiredArg();
/*  51: 39 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec9 = localOptionParser.accepts("proxyPass").withRequiredArg();
/*  52: 40 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec10 = localOptionParser.accepts("username").withRequiredArg().defaultsTo("Player" + bsu.I() % 1000L, new String[0]);
/*  53: 41 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec11 = localOptionParser.accepts("uuid").withRequiredArg();
/*  54: 42 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec12 = localOptionParser.accepts("accessToken").withRequiredArg().required();
/*  55: 43 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec13 = localOptionParser.accepts("version").withRequiredArg().required();
/*  56: 44 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec14 = localOptionParser.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(854), new Integer[0]);
/*  57: 45 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec15 = localOptionParser.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(480), new Integer[0]);
/*  58: 46 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec16 = localOptionParser.accepts("userProperties").withRequiredArg().required();
/*  59: 47 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec17 = localOptionParser.accepts("assetIndex").withRequiredArg();
/*  60: 48 */     ArgumentAcceptingOptionSpec localArgumentAcceptingOptionSpec18 = localOptionParser.accepts("userType").withRequiredArg().defaultsTo("legacy", new String[0]);
/*  61: 49 */     NonOptionArgumentSpec localNonOptionArgumentSpec = localOptionParser.nonOptions();
/*  62:    */     
/*  63: 51 */     OptionSet localOptionSet = localOptionParser.parse(paramArrayOfString);
/*  64: 52 */     List localList = localOptionSet.valuesOf(localNonOptionArgumentSpec);
/*  65: 54 */     if (!localList.isEmpty()) {
/*  66: 55 */       System.out.println("Completely ignored arguments: " + localList);
/*  67:    */     }
/*  68: 59 */     String str1 = (String)localOptionSet.valueOf(localArgumentAcceptingOptionSpec6);
/*  69: 60 */     Proxy localProxy = Proxy.NO_PROXY;
/*  70: 61 */     if (str1 != null) {
/*  71:    */       try
/*  72:    */       {
/*  73: 63 */         localProxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(str1, ((Integer)localOptionSet.valueOf(localArgumentAcceptingOptionSpec7)).intValue()));
/*  74:    */       }
/*  75:    */       catch (Exception localException) {}
/*  76:    */     }
/*  77: 69 */     String str2 = (String)localOptionSet.valueOf(localArgumentAcceptingOptionSpec8);
/*  78: 70 */     String str3 = (String)localOptionSet.valueOf(localArgumentAcceptingOptionSpec9);
/*  79: 71 */     if ((!localProxy.equals(Proxy.NO_PROXY)) && (a(str2)) && (a(str3))) {
/*  80: 72 */       Authenticator.setDefault(new cbl(str2, str3));
/*  81:    */     }
/*  82: 81 */     int i = ((Integer)localOptionSet.valueOf(localArgumentAcceptingOptionSpec14)).intValue();
/*  83: 82 */     int j = ((Integer)localOptionSet.valueOf(localArgumentAcceptingOptionSpec15)).intValue();
/*  84: 83 */     boolean bool1 = localOptionSet.has("fullscreen");
/*  85: 84 */     boolean bool2 = localOptionSet.has("checkGlErrors");
/*  86: 85 */     boolean bool3 = localOptionSet.has("demo");
/*  87: 86 */     String str4 = (String)localOptionSet.valueOf(localArgumentAcceptingOptionSpec13);
/*  88: 87 */     PropertyMap localPropertyMap = (PropertyMap)new GsonBuilder().registerTypeAdapter(PropertyMap.class, new PropertyMap.Serializer()).create().fromJson((String)localOptionSet.valueOf(localArgumentAcceptingOptionSpec16), PropertyMap.class);
/*  89:    */     
/*  90:    */ 
/*  91: 90 */     File localFile1 = (File)localOptionSet.valueOf(localArgumentAcceptingOptionSpec3);
/*  92: 91 */     File localFile2 = localOptionSet.has(localArgumentAcceptingOptionSpec4) ? (File)localOptionSet.valueOf(localArgumentAcceptingOptionSpec4) : new File(localFile1, "assets/");
/*  93: 92 */     File localFile3 = localOptionSet.has(localArgumentAcceptingOptionSpec5) ? (File)localOptionSet.valueOf(localArgumentAcceptingOptionSpec5) : new File(localFile1, "resourcepacks/");
/*  94: 93 */     String str5 = localOptionSet.has(localArgumentAcceptingOptionSpec11) ? (String)localArgumentAcceptingOptionSpec11.value(localOptionSet) : (String)localArgumentAcceptingOptionSpec10.value(localOptionSet);
/*  95: 94 */     String str6 = localOptionSet.has(localArgumentAcceptingOptionSpec17) ? (String)localArgumentAcceptingOptionSpec17.value(localOptionSet) : null;
/*  96:    */     
/*  97:    */ 
/*  98: 97 */     String str7 = (String)localOptionSet.valueOf(localArgumentAcceptingOptionSpec1);
/*  99: 98 */     Integer localInteger = (Integer)localOptionSet.valueOf(localArgumentAcceptingOptionSpec2);
/* 100:    */     
/* 101:    */ 
/* 102:101 */     btw localbtw = new btw((String)localArgumentAcceptingOptionSpec10.value(localOptionSet), str5, (String)localArgumentAcceptingOptionSpec12.value(localOptionSet), (String)localArgumentAcceptingOptionSpec18.value(localOptionSet));
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