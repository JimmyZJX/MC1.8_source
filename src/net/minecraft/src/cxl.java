package net.minecraft.src;
/*  1:   */ import org.apache.commons.lang3.StringUtils;
/*  2:   */ 
/*  3:   */ public class cxl
/*  4:   */   extends oa
/*  5:   */ {
/*  6:   */   private final String c;
/*  7:   */   
/*  8:   */   protected cxl(int paramInt, String... paramVarArgs)
/*  9:   */   {
/* 10:14 */     super(0, new String[] { paramVarArgs[0], paramVarArgs[1] });
/* 11:   */     
/* 12:16 */     this.c = (StringUtils.isEmpty(paramVarArgs[2]) ? "normal" : paramVarArgs[2].toLowerCase());
/* 13:   */   }
/* 14:   */   
/* 15:   */   public cxl(String paramString)
/* 16:   */   {
/* 17:24 */     this(0, b(paramString));
/* 18:   */   }
/* 19:   */   
/* 20:   */   public cxl(oa paramoa, String paramString)
/* 21:   */   {
/* 22:28 */     this(paramoa.toString(), paramString);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public cxl(String paramString1, String paramString2)
/* 26:   */   {
/* 27:32 */     this(0, b(paramString1 + '#' + (paramString2 == null ? "normal" : paramString2)));
/* 28:   */   }
/* 29:   */   
/* 30:   */   protected static String[] b(String paramString)
/* 31:   */   {
/* 32:36 */     String[] arrayOfString = { null, paramString, null };
/* 33:   */     
/* 34:38 */     int i = paramString.indexOf('#');
/* 35:39 */     String str = paramString;
/* 36:40 */     if (i >= 0)
/* 37:   */     {
/* 38:41 */       arrayOfString[2] = paramString.substring(i + 1, paramString.length());
/* 39:42 */       if (i > 1) {
/* 40:43 */         str = paramString.substring(0, i);
/* 41:   */       }
/* 42:   */     }
/* 43:47 */     System.arraycopy(oa.a(str), 0, arrayOfString, 0, 2);
/* 44:   */     
/* 45:49 */     return arrayOfString;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public String c()
/* 49:   */   {
/* 50:53 */     return this.c;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public boolean equals(Object paramObject)
/* 54:   */   {
/* 55:58 */     if (this == paramObject) {
/* 56:59 */       return true;
/* 57:   */     }
/* 58:61 */     if (((paramObject instanceof cxl)) && 
/* 59:62 */       (super.equals(paramObject)))
/* 60:   */     {
/* 61:63 */       cxl localcxl = (cxl)paramObject;
/* 62:   */       
/* 63:65 */       return this.c.equals(localcxl.c);
/* 64:   */     }
/* 65:68 */     return false;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public int hashCode()
/* 69:   */   {
/* 70:73 */     return 31 * super.hashCode() + this.c.hashCode();
/* 71:   */   }
/* 72:   */   
/* 73:   */   public String toString()
/* 74:   */   {
/* 75:78 */     return super.toString() + '#' + this.c;
/* 76:   */   }
/* 77:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxl
 * JD-Core Version:    0.7.0.1
 */