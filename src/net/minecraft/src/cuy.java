package net.minecraft.src;
/*  1:   */ import com.google.common.base.Charsets;
/*  2:   */ import com.google.gson.JsonElement;
/*  3:   */ import com.google.gson.JsonObject;
/*  4:   */ import com.google.gson.JsonParseException;
/*  5:   */ import com.google.gson.JsonParser;

/*  6:   */ import java.awt.image.BufferedImage;
/*  7:   */ import java.io.BufferedReader;
/*  8:   */ import java.io.File;
import java.io.IOException;
/*  9:   */ import java.io.InputStream;
/* 10:   */ import java.io.InputStreamReader;
/* 11:   */ import java.net.URI;
import java.util.zip.ZipException;

/* 12:   */ import org.apache.commons.io.IOUtils;
/* 13:   */ import org.apache.logging.log4j.LogManager;
/* 14:   */ import org.apache.logging.log4j.Logger;
/* 15:   */ 
/* 16:   */ public abstract class cuy
/* 17:   */   implements cvm
/* 18:   */ {
/* 19:20 */   private static final Logger b = LogManager.getLogger();
/* 20:   */   protected final File a;
/* 21:   */   
/* 22:   */   public cuy(File paramFile)
/* 23:   */   {
/* 24:25 */     this.a = paramFile;
/* 25:   */   }
/* 26:   */   
/* 27:   */   private static String c(oa paramoa)
/* 28:   */   {
/* 29:29 */     return String.format("%s/%s/%s", new Object[] { "assets", paramoa.b(), paramoa.a() });
/* 30:   */   }
/* 31:   */   
/* 32:   */   protected static String a(File paramFile1, File paramFile2)
/* 33:   */   {
/* 34:33 */     return paramFile1.toURI().relativize(paramFile2.toURI()).getPath();
/* 35:   */   }
/* 36:   */   
/* 37:   */   public InputStream a(oa paramoa) throws ZipException, IOException
/* 38:   */   {
/* 39:38 */     return a(c(paramoa));
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean b(oa paramoa)
/* 43:   */   {
/* 44:43 */     return b(c(paramoa));
/* 45:   */   }
/* 46:   */   
/* 47:   */   protected abstract InputStream a(String paramString) throws cvn, ZipException, IOException;
/* 48:   */   
/* 49:   */   protected abstract boolean b(String paramString);
/* 50:   */   
/* 51:   */   protected void c(String paramString)
/* 52:   */   {
/* 53:51 */     b.warn("ResourcePack: ignored non-lowercase namespace: %s in %s", new Object[] { paramString, this.a });
/* 54:   */   }
/* 55:   */   
/* 56:   */   public cwi a(cwk paramcwk, String paramString) throws cvn, ZipException, IOException
/* 57:   */   {
/* 58:56 */     return a(paramcwk, a("pack.mcmeta"), paramString);
/* 59:   */   }
/* 60:   */   
/* 61:   */   static cwi a(cwk paramcwk, InputStream paramInputStream, String paramString)
/* 62:   */   {
/* 63:60 */     JsonObject localJsonObject = null;
/* 64:61 */     BufferedReader localBufferedReader = null;
/* 65:   */     try
/* 66:   */     {
/* 67:63 */       localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream, Charsets.UTF_8));
/* 68:64 */       localJsonObject = new JsonParser().parse(localBufferedReader).getAsJsonObject();
/* 69:   */     }
/* 70:   */     catch (RuntimeException localRuntimeException)
/* 71:   */     {
/* 72:66 */       throw new JsonParseException(localRuntimeException);
/* 73:   */     }
/* 74:   */     finally
/* 75:   */     {
/* 76:68 */       IOUtils.closeQuietly(localBufferedReader);
/* 77:   */     }
/* 78:71 */     return paramcwk.a(paramString, localJsonObject);
/* 79:   */   }
/* 80:   */   
/* 81:   */   public BufferedImage a() throws ZipException, IOException
/* 82:   */   {
/* 83:76 */     return cuj.a(a("pack.png"));
/* 84:   */   }
/* 85:   */   
/* 86:   */   public String b()
/* 87:   */   {
/* 88:81 */     return this.a.getName();
/* 89:   */   }
/* 90:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cuy
 * JD-Core Version:    0.7.0.1
 */