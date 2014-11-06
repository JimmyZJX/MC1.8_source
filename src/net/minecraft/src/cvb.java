package net.minecraft.src;
/*  1:   */ import com.google.common.collect.ImmutableSet;

/*  2:   */ import java.awt.image.BufferedImage;
/*  3:   */ import java.io.File;
/*  4:   */ import java.io.FileInputStream;
/*  5:   */ import java.io.FileNotFoundException;
import java.io.IOException;
/*  6:   */ import java.io.InputStream;
/*  7:   */ import java.util.Map;
/*  8:   */ import java.util.Set;
/*  9:   */ 
/* 10:   */ public class cvb
/* 11:   */   implements cvm
/* 12:   */ {
/* 13:16 */   public static final Set a = ImmutableSet.of("minecraft", "realms");
/* 14:   */   private final Map b;
/* 15:   */   
/* 16:   */   public cvb(Map paramMap)
/* 17:   */   {
/* 18:20 */     this.b = paramMap;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public InputStream a(oa paramoa) throws FileNotFoundException
/* 22:   */   {
/* 23:25 */     InputStream localInputStream1 = d(paramoa);
/* 24:26 */     if (localInputStream1 != null) {
/* 25:27 */       return localInputStream1;
/* 26:   */     }
/* 27:31 */     InputStream localInputStream2 = c(paramoa);
/* 28:32 */     if (localInputStream2 != null) {
/* 29:33 */       return localInputStream2;
/* 30:   */     }
/* 31:36 */     throw new FileNotFoundException(paramoa.a());
/* 32:   */   }
/* 33:   */   
/* 34:   */   public InputStream c(oa paramoa) throws FileNotFoundException
/* 35:   */   {
/* 36:40 */     File localFile = (File)this.b.get(paramoa.toString());
/* 37:   */     
/* 38:42 */     return (localFile == null) || (!localFile.isFile()) ? null : new FileInputStream(localFile);
/* 39:   */   }
/* 40:   */   
/* 41:   */   private InputStream d(oa paramoa)
/* 42:   */   {
/* 43:46 */     return cvb.class.getResourceAsStream("/assets/" + paramoa.b() + "/" + paramoa.a());
/* 44:   */   }
/* 45:   */   
/* 46:   */   public boolean b(oa paramoa)
/* 47:   */   {
/* 48:51 */     return (d(paramoa) != null) || (this.b.containsKey(paramoa.toString()));
/* 49:   */   }
/* 50:   */   
/* 51:   */   public Set c()
/* 52:   */   {
/* 53:56 */     return a;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public cwi a(cwk paramcwk, String paramString)
/* 57:   */   {
/* 58:   */     try
/* 59:   */     {
/* 60:62 */       FileInputStream localFileInputStream = new FileInputStream((File)this.b.get("pack.mcmeta"));
/* 61:63 */       return cuy.a(paramcwk, localFileInputStream, paramString);
/* 62:   */     }
/* 63:   */     catch (RuntimeException localRuntimeException)
/* 64:   */     {
/* 65:65 */       return null;
/* 66:   */     }
/* 67:   */     catch (FileNotFoundException localFileNotFoundException) {}
/* 68:67 */     return null;
/* 69:   */   }
/* 70:   */   
/* 71:   */   public BufferedImage a() throws IOException
/* 72:   */   {
/* 73:73 */     return cuj.a(cvb.class.getResourceAsStream("/" + new oa("pack.png").a()));
/* 74:   */   }
/* 75:   */   
/* 76:   */   public String b()
/* 77:   */   {
/* 78:78 */     return "Default";
/* 79:   */   }
/* 80:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cvb
 * JD-Core Version:    0.7.0.1
 */