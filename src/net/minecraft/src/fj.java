package net.minecraft.src;
/*   1:    */ import com.google.common.base.Splitter;
/*   2:    */ import com.google.common.collect.Iterables;
/*   3:    */ import com.google.common.collect.Maps;
/*   4:    */ import java.io.IOException;
/*   5:    */ import java.io.InputStream;
/*   6:    */ import java.util.IllegalFormatException;
/*   7:    */ import java.util.Map;
/*   8:    */ import java.util.regex.Matcher;
/*   9:    */ import java.util.regex.Pattern;
/*  10:    */ import org.apache.commons.io.Charsets;
/*  11:    */ import org.apache.commons.io.IOUtils;
/*  12:    */ 
/*  13:    */ public class fj
/*  14:    */ {
/*  15: 16 */   private static final Pattern a = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
/*  16: 17 */   private static final Splitter b = Splitter.on('=').limit(2);
/*  17: 19 */   private static fj c = new fj();
/*  18: 21 */   private final Map d = Maps.newHashMap();
/*  19:    */   private long e;
/*  20:    */   
/*  21:    */   public fj()
/*  22:    */   {
/*  23:    */     try
/*  24:    */     {
/*  25: 26 */       InputStream localInputStream = fj.class.getResourceAsStream("/assets/minecraft/lang/en_US.lang");
/*  26: 27 */       for (String str1 : IOUtils.readLines(localInputStream, Charsets.UTF_8)) {
/*  27: 29 */         if ((!str1.isEmpty()) && (str1.charAt(0) != '#'))
/*  28:    */         {
/*  29: 33 */           String[] arrayOfString = (String[])Iterables.toArray(b.split(str1), String.class);
/*  30: 36 */           if ((arrayOfString != null) && (arrayOfString.length == 2))
/*  31:    */           {
/*  32: 41 */             String str2 = arrayOfString[0];
/*  33: 42 */             String str3 = a.matcher(arrayOfString[1]).replaceAll("%$1s");
/*  34:    */             
/*  35: 44 */             this.d.put(str2, str3);
/*  36:    */           }
/*  37:    */         }
/*  38:    */       }
/*  39: 46 */       this.e = System.currentTimeMillis();
/*  40:    */     }
/*  41:    */     catch (IOException localIOException) {}
/*  42:    */   }
/*  43:    */   
/*  44:    */   static fj a()
/*  45:    */   {
/*  46: 54 */     return c;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public static synchronized void a(Map paramMap)
/*  50:    */   {
/*  51: 58 */     c.d.clear();
/*  52: 59 */     c.d.putAll(paramMap);
/*  53: 60 */     c.e = System.currentTimeMillis();
/*  54:    */   }
/*  55:    */   
/*  56:    */   public synchronized String a(String paramString)
/*  57:    */   {
/*  58: 92 */     return c(paramString);
/*  59:    */   }
/*  60:    */   
/*  61:    */   public synchronized String a(String paramString, Object... paramVarArgs)
/*  62:    */   {
/*  63: 96 */     String str = c(paramString);
/*  64:    */     try
/*  65:    */     {
/*  66: 98 */       return String.format(str, paramVarArgs);
/*  67:    */     }
/*  68:    */     catch (IllegalFormatException localIllegalFormatException) {}
/*  69:100 */     return "Format error: " + str;
/*  70:    */   }
/*  71:    */   
/*  72:    */   private String c(String paramString)
/*  73:    */   {
/*  74:105 */     String str = (String)this.d.get(paramString);
/*  75:106 */     return str == null ? paramString : str;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public synchronized boolean b(String paramString)
/*  79:    */   {
/*  80:110 */     return this.d.containsKey(paramString);
/*  81:    */   }
/*  82:    */   
/*  83:    */   public long c()
/*  84:    */   {
/*  85:114 */     return this.e;
/*  86:    */   }
/*  87:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     fj
 * JD-Core Version:    0.7.0.1
 */