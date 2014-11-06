package net.minecraft.src;
/*  1:   */ import com.google.common.base.Charsets;
/*  2:   */ import com.google.common.collect.Maps;
/*  3:   */ import com.google.common.io.Files;
/*  4:   */ import com.google.gson.JsonElement;
/*  5:   */ import com.google.gson.JsonObject;
/*  6:   */ import com.google.gson.JsonParseException;
/*  7:   */ import com.google.gson.JsonParser;
/*  8:   */ import java.io.BufferedReader;
/*  9:   */ import java.io.File;
/* 10:   */ import java.io.FileNotFoundException;
/* 11:   */ import java.util.Map;
/* 12:   */ import java.util.Map.Entry;
/* 13:   */ import org.apache.commons.io.IOUtils;
/* 14:   */ import org.apache.logging.log4j.LogManager;
/* 15:   */ import org.apache.logging.log4j.Logger;
/* 16:   */ 
/* 17:   */ public class cuz
/* 18:   */ {
/* 19:22 */   private static final Logger a = LogManager.getLogger();
/* 20:24 */   private final Map b = Maps.newHashMap();
/* 21:   */   
/* 22:   */   public cuz(File paramFile, String paramString)
/* 23:   */   {
/* 24:27 */     if (paramString == null) {
/* 25:28 */       return;
/* 26:   */     }
/* 27:31 */     File localFile1 = new File(paramFile, "objects");
/* 28:   */     
/* 29:33 */     File localFile2 = new File(paramFile, "indexes/" + paramString + ".json");
/* 30:34 */     BufferedReader localBufferedReader = null;
/* 31:   */     try
/* 32:   */     {
/* 33:36 */       localBufferedReader = Files.newReader(localFile2, Charsets.UTF_8);
/* 34:37 */       JsonObject localJsonObject1 = new JsonParser().parse(localBufferedReader).getAsJsonObject();
/* 35:38 */       JsonObject localJsonObject2 = uh.a(localJsonObject1, "objects", (JsonObject)null);
/* 36:39 */       if (localJsonObject2 != null) {
/* 37:40 */         for (Map.Entry localEntry : localJsonObject2.entrySet())
/* 38:   */         {
/* 39:41 */           JsonObject localJsonObject3 = (JsonObject)localEntry.getValue();
/* 40:   */           
/* 41:43 */           String str1 = (String)localEntry.getKey();
/* 42:44 */           String[] arrayOfString = str1.split("/", 2);
/* 43:45 */           String str2 = arrayOfString[0] + ":" + arrayOfString[1];
/* 44:   */           
/* 45:47 */           String str3 = uh.h(localJsonObject3, "hash");
/* 46:48 */           File localFile3 = new File(localFile1, str3.substring(0, 2) + "/" + str3);
/* 47:   */           
/* 48:50 */           this.b.put(str2, localFile3);
/* 49:   */         }
/* 50:   */       }
/* 51:   */     }
/* 52:   */     catch (JsonParseException localJsonParseException)
/* 53:   */     {
/* 54:54 */       a.error("Unable to parse resource index file: " + localFile2);
/* 55:   */     }
/* 56:   */     catch (FileNotFoundException localFileNotFoundException)
/* 57:   */     {
/* 58:56 */       a.error("Can't find the resource index file: " + localFile2);
/* 59:   */     }
/* 60:   */     finally
/* 61:   */     {
/* 62:58 */       IOUtils.closeQuietly(localBufferedReader);
/* 63:   */     }
/* 64:   */   }
/* 65:   */   
/* 66:   */   public Map a()
/* 67:   */   {
/* 68:63 */     return this.b;
/* 69:   */   }
/* 70:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cuz
 * JD-Core Version:    0.7.0.1
 */