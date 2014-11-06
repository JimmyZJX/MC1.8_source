package net.minecraft.src;
/*   1:    */ import com.google.common.base.Splitter;
/*   2:    */ import com.google.common.collect.Iterables;
/*   3:    */ import com.google.common.collect.Maps;
/*   4:    */ import java.io.IOException;
/*   5:    */ import java.io.InputStream;
/*   6:    */ import java.util.IllegalFormatException;
/*   7:    */ import java.util.List;
/*   8:    */ import java.util.Map;
/*   9:    */ import java.util.regex.Matcher;
/*  10:    */ import java.util.regex.Pattern;
/*  11:    */ import org.apache.commons.io.Charsets;
/*  12:    */ import org.apache.commons.io.IOUtils;
/*  13:    */ 
/*  14:    */ public class cwf
/*  15:    */ {
/*  16: 20 */   private static final Splitter b = Splitter.on('=').limit(2);
/*  17: 21 */   private static final Pattern c = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
/*  18: 24 */   Map<String,String> a = Maps.newHashMap();
/*  19:    */   private boolean d;
/*  20:    */   
/*  21:    */   public synchronized void a(cvk paramcvk, List<String> paramList)
/*  22:    */   {
/*  23: 28 */     this.a.clear();
/*  24: 30 */     for (String str1 : paramList)
/*  25:    */     {
/*  26: 31 */       String str2 = String.format("lang/%s.lang", new Object[] { str1 });
/*  27: 33 */       for (String str3 : paramcvk.a()) {
/*  28:    */         try
/*  29:    */         {
/*  30: 35 */           a(paramcvk.b(new oa(str3, str2)));
/*  31:    */         }
/*  32:    */         catch (IOException localIOException) {}
/*  33:    */       }
/*  34:    */     }
/*  36: 41 */     b();
/*  37:    */   }
/*  38:    */   
/*  39:    */   public boolean a()
/*  40:    */   {
/*  41: 45 */     return this.d;
/*  42:    */   }
/*  43:    */   
/*  44:    */   private void b()
/*  45:    */   {
/*  46: 49 */     this.d = false;
/*  47:    */     
/*  48: 51 */     int i = 0;
/*  49: 52 */     int j = 0;
/*  50: 54 */     for (String str : this.a.values())
/*  51:    */     {
/*  52: 55 */       int k = str.length();
/*  53: 56 */       j += k;
/*  54: 58 */       for (int m = 0; m < k; m++) {
/*  55: 59 */         if (str.charAt(m) >= 'Ā') {
/*  56: 60 */           i++;
/*  57:    */         }
/*  58:    */       }
/*  59:    */     }
/*  60: 65 */     float f = i / j;
/*  61: 66 */     this.d = (f > 0.1D);
/*  62:    */   }
/*  63:    */   
/*  64:    */   private void a(List<cvj> paramList) throws IOException
/*  65:    */   {
/*  66: 70 */     for (cvj localcvj : paramList)
/*  67:    */     {
/*  68: 71 */       InputStream localInputStream = localcvj.b();
/*  69:    */       try
/*  70:    */       {
/*  71: 73 */         a(localInputStream);
/*  72:    */       }
/*  73:    */       finally
/*  74:    */       {
/*  75: 75 */         IOUtils.closeQuietly(localInputStream);
/*  76:    */       }
/*  77:    */     }
/*  78:    */   }
/*  79:    */   
/*  80:    */   private void a(InputStream paramInputStream) throws IOException
/*  81:    */   {
/*  82: 81 */     for (String str1 : IOUtils.readLines(paramInputStream, Charsets.UTF_8)) {
/*  83: 83 */       if ((!str1.isEmpty()) && (str1.charAt(0) != '#'))
/*  84:    */       {
/*  85: 87 */         String[] arrayOfString = (String[])Iterables.toArray(b.split(str1), String.class);
/*  86: 90 */         if ((arrayOfString != null) && (arrayOfString.length == 2))
/*  87:    */         {
/*  88: 95 */           String str2 = arrayOfString[0];
/*  89: 96 */           String str3 = c.matcher(arrayOfString[1]).replaceAll("%$1s");
/*  90:    */           
/*  91: 98 */           this.a.put(str2, str3);
/*  92:    */         }
/*  93:    */       }
/*  94:    */     }
/*  95:    */   }
/*  96:    */   
/*  97:    */   private String b(String paramString)
/*  98:    */   {
/*  99:103 */     String str = (String)this.a.get(paramString);
/* 100:104 */     return str == null ? paramString : str;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String a(String paramString, Object[] paramArrayOfObject)
/* 104:    */   {
/* 105:108 */     String str = b(paramString);
/* 106:    */     try
/* 107:    */     {
/* 108:110 */       return String.format(str, paramArrayOfObject);
/* 109:    */     }
/* 110:    */     catch (IllegalFormatException localIllegalFormatException) {}
/* 111:112 */     return "Format error: " + str;
/* 112:    */   }
/* 113:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cwf
 * JD-Core Version:    0.7.0.1
 */