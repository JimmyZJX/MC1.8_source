package net.minecraft.src;
/*   1:    */ import com.google.common.base.Splitter;
/*   2:    */ import com.google.common.collect.Iterables;
/*   4:    */ import java.util.regex.Pattern;
/*   5:    */ 
/*   6:    */ class gk
/*   7:    */   extends gh
/*   8:    */ {
/*   9:324 */   private static final Pattern c = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[d|D]");
/*  10:325 */   private static final Pattern d = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+[f|F]");
/*  11:326 */   private static final Pattern e = Pattern.compile("[-+]?[0-9]+[b|B]");
/*  12:327 */   private static final Pattern f = Pattern.compile("[-+]?[0-9]+[l|L]");
/*  13:328 */   private static final Pattern g = Pattern.compile("[-+]?[0-9]+[s|S]");
/*  14:329 */   private static final Pattern h = Pattern.compile("[-+]?[0-9]+");
/*  15:330 */   private static final Pattern i = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+");
/*  16:331 */   private static final Splitter j = Splitter.on(',').omitEmptyStrings();
/*  17:    */   protected String b;
/*  18:    */   
/*  19:    */   public gk(String paramString1, String paramString2)
/*  20:    */   {
/*  21:336 */     this.a = paramString1;
/*  22:337 */     this.b = paramString2;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public NBTBase a()
/*  26:    */   {
/*  27:    */     try
/*  28:    */     {
/*  29:346 */       if (c.matcher(this.b).matches()) {
/*  30:347 */         return new fq(Double.parseDouble(this.b.substring(0, this.b.length() - 1)));
/*  31:    */       }
/*  32:349 */       if (d.matcher(this.b).matches()) {
/*  33:350 */         return new fs(Float.parseFloat(this.b.substring(0, this.b.length() - 1)));
/*  34:    */       }
/*  35:352 */       if (e.matcher(this.b).matches()) {
/*  36:353 */         return new fm(Byte.parseByte(this.b.substring(0, this.b.length() - 1)));
/*  37:    */       }
/*  38:355 */       if (f.matcher(this.b).matches()) {
/*  39:356 */         return new fw(Long.parseLong(this.b.substring(0, this.b.length() - 1)));
/*  40:    */       }
/*  41:358 */       if (g.matcher(this.b).matches()) {
/*  42:359 */         return new gb(Short.parseShort(this.b.substring(0, this.b.length() - 1)));
/*  43:    */       }
/*  44:361 */       if (h.matcher(this.b).matches()) {
/*  45:362 */         return new fu(Integer.parseInt(this.b));
/*  46:    */       }
/*  47:364 */       if (i.matcher(this.b).matches()) {
/*  48:365 */         return new fq(Double.parseDouble(this.b));
/*  49:    */       }
/*  50:367 */       if ((this.b.equalsIgnoreCase("true")) || (this.b.equalsIgnoreCase("false"))) {
/*  51:368 */         return new fm((byte)(Boolean.parseBoolean(this.b) ? 1 : 0));
/*  52:    */       }
/*  53:    */     }
/*  54:    */     catch (NumberFormatException localNumberFormatException1)
/*  55:    */     {
/*  56:371 */       this.b = this.b.replaceAll("\\\\\"", "\"");
/*  57:372 */       return new gc(this.b);
/*  58:    */     }
/*  59:376 */     if ((this.b.startsWith("[")) && (this.b.endsWith("]")))
/*  60:    */     {
/*  61:377 */       String localObject = this.b.substring(1, this.b.length() - 1);
/*  62:    */       
/*  63:379 */       String[] arrayOfString = (String[])Iterables.toArray(j.split((CharSequence)localObject), String.class);
/*  64:    */       try
/*  65:    */       {
/*  66:381 */         int[] arrayOfInt = new int[arrayOfString.length];
/*  67:382 */         for (int m = 0; m < arrayOfString.length; m++) {
/*  68:383 */           arrayOfInt[m] = Integer.parseInt(arrayOfString[m].trim());
/*  69:    */         }
/*  70:385 */         return new ft(arrayOfInt);
/*  71:    */       }
/*  72:    */       catch (NumberFormatException localNumberFormatException2)
/*  73:    */       {
/*  74:387 */         return new gc(this.b);
/*  75:    */       }
/*  76:    */     }
/*  77:392 */     if ((this.b.startsWith("\"")) && (this.b.endsWith("\""))) {
/*  78:393 */       this.b = this.b.substring(1, this.b.length() - 1);
/*  79:    */     }
/*  80:396 */     this.b = this.b.replaceAll("\\\\\"", "\"");
/*  81:    */     
/*  82:398 */     Object localObject = new StringBuilder();
/*  83:399 */     for (int k = 0; k < this.b.length(); k++) {
/*  84:400 */       if ((k < this.b.length() - 1) && (this.b.charAt(k) == '\\') && (this.b.charAt(k + 1) == '\\'))
/*  85:    */       {
/*  86:401 */         ((StringBuilder)localObject).append('\\');
/*  87:402 */         k++;
/*  88:    */       }
/*  89:    */       else
/*  90:    */       {
/*  91:404 */         ((StringBuilder)localObject).append(this.b.charAt(k));
/*  92:    */       }
/*  93:    */     }
/*  94:407 */     return new gc(((StringBuilder)localObject).toString());
/*  95:    */   }
/*  96:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gk
 * JD-Core Version:    0.7.0.1
 */