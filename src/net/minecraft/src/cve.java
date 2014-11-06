package net.minecraft.src;
/*  1:   */ import com.google.common.base.Splitter;
/*  2:   */ import com.google.common.collect.Lists;
/*  3:   */ import com.google.common.collect.Sets;

/*  4:   */ import java.io.Closeable;
/*  5:   */ import java.io.File;
/*  6:   */ import java.io.IOException;
/*  7:   */ import java.io.InputStream;
/*  8:   */ import java.util.ArrayList;
/*  9:   */ import java.util.Collections;
/* 10:   */ import java.util.Enumeration;
/* 11:   */ import java.util.HashSet;
/* 12:   */ import java.util.List;
/* 13:   */ import java.util.Set;
/* 14:   */ import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
/* 15:   */ import java.util.zip.ZipFile;
/* 16:   */ 
/* 17:   */ public class cve
/* 18:   */   extends cuy
/* 19:   */   implements Closeable
/* 20:   */ {
/* 21:19 */   public static final Splitter b = Splitter.on('/').omitEmptyStrings().limit(3);
/* 22:   */   private ZipFile c;
/* 23:   */   
/* 24:   */   public cve(File paramFile)
/* 25:   */   {
/* 26:23 */     super(paramFile);
/* 27:   */   }
/* 28:   */   
/* 29:   */   private ZipFile d() throws ZipException, IOException
/* 30:   */   {
/* 31:27 */     if (this.c == null) {
/* 32:28 */       this.c = new ZipFile(this.a);
/* 33:   */     }
/* 34:31 */     return this.c;
/* 35:   */   }
/* 36:   */   
/* 37:   */   protected InputStream a(String paramString) throws ZipException, IOException
/* 38:   */   {
/* 39:36 */     ZipFile localZipFile = d();
/* 40:37 */     ZipEntry localZipEntry = localZipFile.getEntry(paramString);
/* 41:39 */     if (localZipEntry == null) {
/* 42:40 */       throw new cvn(this.a, paramString);
/* 43:   */     }
/* 44:43 */     return localZipFile.getInputStream(localZipEntry);
/* 45:   */   }
/* 46:   */   
/* 47:   */   public boolean b(String paramString)
/* 48:   */   {
/* 49:   */     try
/* 50:   */     {
/* 51:49 */       return d().getEntry(paramString) != null;
/* 52:   */     }
/* 53:   */     catch (IOException localIOException) {}
/* 54:51 */     return false;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public Set c()
/* 58:   */   {
/* 59:   */     ZipFile localZipFile;
/* 60:   */     try
/* 61:   */     {
/* 62:59 */       localZipFile = d();
/* 63:   */     }
/* 64:   */     catch (IOException localIOException)
/* 65:   */     {
/* 66:61 */       return Collections.emptySet();
/* 67:   */     }
/* 68:64 */     Enumeration localEnumeration = localZipFile.entries();
/* 69:   */     
/* 70:66 */     HashSet localHashSet = Sets.newHashSet();
/* 71:68 */     while (localEnumeration.hasMoreElements())
/* 72:   */     {
/* 73:69 */       ZipEntry localZipEntry = (ZipEntry)localEnumeration.nextElement();
/* 74:   */       
/* 75:71 */       String str1 = localZipEntry.getName();
/* 76:72 */       if (str1.startsWith("assets/"))
/* 77:   */       {
/* 78:73 */         ArrayList localArrayList = Lists.newArrayList(b.split(str1));
/* 79:74 */         if (localArrayList.size() > 1)
/* 80:   */         {
/* 81:75 */           String str2 = (String)localArrayList.get(1);
/* 82:76 */           if (!str2.equals(str2.toLowerCase())) {
/* 83:77 */             c(str2);
/* 84:   */           } else {
/* 85:79 */             localHashSet.add(str2);
/* 86:   */           }
/* 87:   */         }
/* 88:   */       }
/* 89:   */     }
/* 90:85 */     return localHashSet;
/* 91:   */   }
/* 92:   */   
/* 93:   */   protected void finalize() throws Throwable
/* 94:   */   {
/* 95:90 */     close();
/* 96:91 */     super.finalize();
/* 97:   */   }
/* 98:   */   
/* 99:   */   public void close() throws IOException
/* :0:   */   {
/* :1:96 */     if (this.c != null)
/* :2:   */     {
/* :3:97 */       this.c.close();
/* :4:98 */       this.c = null;
/* :5:   */     }
/* :6:   */   }
/* :7:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cve
 * JD-Core Version:    0.7.0.1
 */