package net.minecraft.src;
/*  1:   */ import org.apache.commons.lang3.StringUtils;
/*  2:   */ import org.apache.commons.lang3.Validate;
/*  3:   */ 
/*  4:   */ public class oa
/*  5:   */ {
/*  6:   */   protected final String a;
/*  7:   */   protected final String b;
/*  8:   */   
/*  9:   */   protected oa(int paramInt, String... paramVarArgs)
/* 10:   */   {
/* 11:14 */     this.a = (StringUtils.isEmpty(paramVarArgs[0]) ? "minecraft" : paramVarArgs[0].toLowerCase());
/* 12:15 */     this.b = paramVarArgs[1];
/* 13:   */     
/* 14:17 */     Validate.notNull(this.b);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public oa(String paramString)
/* 18:   */   {
/* 19:21 */     this(0, a(paramString));
/* 20:   */   }
/* 21:   */   
/* 22:   */   public oa(String paramString1, String paramString2)
/* 23:   */   {
/* 24:25 */     this(0, new String[] { paramString1, paramString2 });
/* 25:   */   }
/* 26:   */   
/* 27:   */   protected static String[] a(String paramString)
/* 28:   */   {
/* 29:29 */     String[] arrayOfString = { null, paramString };
/* 30:30 */     int i = paramString.indexOf(':');
/* 31:31 */     if (i >= 0)
/* 32:   */     {
/* 33:32 */       arrayOfString[1] = paramString.substring(i + 1, paramString.length());
/* 34:33 */       if (i > 1) {
/* 35:34 */         arrayOfString[0] = paramString.substring(0, i);
/* 36:   */       }
/* 37:   */     }
/* 38:38 */     return arrayOfString;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String a()
/* 42:   */   {
/* 43:42 */     return this.b;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String b()
/* 47:   */   {
/* 48:46 */     return this.a;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public String toString()
/* 52:   */   {
/* 53:51 */     return this.a + ':' + this.b;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public boolean equals(Object paramObject)
/* 57:   */   {
/* 58:56 */     if (this == paramObject) {
/* 59:57 */       return true;
/* 60:   */     }
/* 61:60 */     if ((paramObject instanceof oa))
/* 62:   */     {
/* 63:61 */       oa localoa = (oa)paramObject;
/* 64:   */       
/* 65:63 */       return (this.a.equals(localoa.a)) && (this.b.equals(localoa.b));
/* 66:   */     }
/* 67:66 */     return false;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public int hashCode()
/* 71:   */   {
/* 72:71 */     return 31 * this.a.hashCode() + this.b.hashCode();
/* 73:   */   }
/* 74:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     oa
 * JD-Core Version:    0.7.0.1
 */