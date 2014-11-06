package net.minecraft.src;
/*   1:    */ import java.io.DataOutputStream;
/*   2:    */ import java.io.File;
/*   3:    */ import java.io.FileOutputStream;
/*   4:    */ import java.io.IOException;
/*   5:    */ import java.io.InputStream;
/*   6:    */ import java.io.OutputStream;
/*   7:    */ import java.net.Proxy;
/*   8:    */ import java.net.URL;
/*   9:    */ import java.net.URLConnection;
/*  10:    */ import java.util.Map;
/*  11:    */ import java.util.Map.Entry;
/*  12:    */ import java.util.Set;
/*  13:    */ import org.apache.commons.io.FileUtils;
/*  14:    */ import org.apache.commons.io.IOUtils;
/*  15:    */ import org.apache.logging.log4j.Logger;
/*  16:    */ 
/*  17:    */ final class uj
/*  18:    */   implements Runnable
/*  19:    */ {
				uy a;
				String b;
				Proxy c;
				Map<String,String> d;
				File e;
				int f;
/*  20:    */   uj(uy paramuy, String paramString, Proxy paramProxy, Map<String,String> paramMap, File paramFile, int paramInt)  {a=paramuy;b=paramString;c=paramProxy;d=paramMap;e=paramFile;f=paramInt;}
/*  21:    */   
/*  22:    */   public void run()
/*  23:    */   {
/*  24:110 */     InputStream localInputStream = null;
/*  25:111 */     Object localObject1 = null;
/*  26:113 */     if (this.a != null)
/*  27:    */     {
/*  28:114 */       this.a.b("Downloading Resource Pack");
/*  29:115 */       this.a.c("Making Request...");
/*  30:    */     }
/*  31:    */     try
/*  32:    */     {
/*  33:119 */       byte[] arrayOfByte = new byte[4096];
/*  34:120 */       URL localURL = new URL(this.b);
/*  35:121 */       URLConnection localURLConnection = localURL.openConnection(this.c);
/*  36:122 */       float f1 = 0.0F;
/*  37:123 */       float f2 = this.d.entrySet().size();
/*  38:125 */       for (Map.Entry<String,String> localEntry : this.d.entrySet())
/*  39:    */       {
/*  40:126 */         localURLConnection.setRequestProperty(localEntry.getKey(), localEntry.getValue());
/*  41:127 */         if (this.a != null) {
/*  42:128 */           this.a.a((int)(++f1 / f2 * 100.0F));
/*  43:    */         }
/*  44:    */       }
/*  45:132 */       localInputStream = localURLConnection.getInputStream();
/*  46:133 */       f2 = localURLConnection.getContentLength();
/*  47:134 */       int i = localURLConnection.getContentLength();
/*  48:136 */       if (this.a != null) {
/*  49:137 */         this.a.c(String.format("Downloading file (%.2f MB)...", new Object[] { Float.valueOf(f2 / 1000.0F / 1000.0F) }));
/*  50:    */       }
/*  51:140 */       if (this.e.exists())
/*  52:    */       {
/*  53:141 */         long l = this.e.length();
/*  54:143 */         if (l == i)
/*  55:    */         {
/*  56:144 */           if (this.a != null) {
/*  57:145 */             this.a.a();
/*  58:    */           }
/*  59:    */           return;
/*  60:    */         }
/*  61:149 */         ui.b().warn("Deleting " + this.e + " as it does not match what we currently have (" + i + " vs our " + l + ").");
/*  62:150 */         FileUtils.deleteQuietly(this.e);
/*  63:    */       }
/*  64:152 */       else if (this.e.getParentFile() != null)
/*  65:    */       {
/*  66:153 */         this.e.getParentFile().mkdirs();
/*  67:    */       }
/*  68:156 */       localObject1 = new DataOutputStream(new FileOutputStream(this.e));
/*  69:158 */       if ((this.f > 0) && (f2 > this.f))
/*  70:    */       {
/*  71:159 */         if (this.a != null) {
/*  72:160 */           this.a.a();
/*  73:    */         }
/*  74:162 */         throw new IOException("Filesize is bigger than maximum allowed (file is " + f1 + ", limit is " + this.f + ")");
/*  75:    */       }
/*  76:165 */       int j = 0;
/*  77:166 */       while ((j = localInputStream.read(arrayOfByte)) >= 0)
/*  78:    */       {
/*  79:167 */         f1 += j;
/*  80:168 */         if (this.a != null) {
/*  81:169 */           this.a.a((int)(f1 / f2 * 100.0F));
/*  82:    */         }
/*  83:172 */         if ((this.f > 0) && (f1 > this.f))
/*  84:    */         {
/*  85:173 */           if (this.a != null) {
/*  86:174 */             this.a.a();
/*  87:    */           }
/*  88:176 */           throw new IOException("Filesize was bigger than maximum allowed (got >= " + f1 + ", limit was " + this.f + ")");
/*  89:    */         }
/*  90:179 */         ((OutputStream)localObject1).write(arrayOfByte, 0, j);
/*  91:    */       }
/*  92:182 */       if (this.a != null) {
/*  93:183 */         this.a.a();
/*  94:    */       }
/*  95:    */     }
/*  96:    */     catch (Throwable localThrowable)
/*  97:    */     {
/*  98:186 */       localThrowable.printStackTrace();
/*  99:    */     }
/* 100:    */     finally
/* 101:    */     {
/* 102:188 */       IOUtils.closeQuietly(localInputStream);
/* 103:189 */       IOUtils.closeQuietly((OutputStream)localObject1);
/* 104:    */     }
/* 105:    */   }
/* 106:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     uj
 * JD-Core Version:    0.7.0.1
 */