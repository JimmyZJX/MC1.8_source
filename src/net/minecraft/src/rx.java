package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonElement;
/*  2:   */ import com.google.gson.JsonObject;
/*  3:   */ import java.text.ParseException;
/*  4:   */ import java.text.SimpleDateFormat;
/*  5:   */ import java.util.Date;
/*  6:   */ 
/*  7:   */ public abstract class rx
/*  8:   */   extends sr
/*  9:   */ {
/* 10:10 */   public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
/* 11:   */   protected final Date b;
/* 12:   */   protected final String c;
/* 13:   */   protected final Date d;
/* 14:   */   protected final String e;
/* 15:   */   
/* 16:   */   public rx(Object paramObject, Date paramDate1, String paramString1, Date paramDate2, String paramString2)
/* 17:   */   {
/* 18:19 */     super(paramObject);
/* 19:20 */     this.b = (paramDate1 == null ? new Date() : paramDate1);
/* 20:21 */     this.c = (paramString1 == null ? "(Unknown)" : paramString1);
/* 21:22 */     this.d = paramDate2;
/* 22:23 */     this.e = (paramString2 == null ? "Banned by an operator." : paramString2);
/* 23:   */   }
/* 24:   */   
/* 25:   */   protected rx(Object paramObject, JsonObject paramJsonObject)
/* 26:   */   {
/* 27:27 */     super(paramObject, paramJsonObject);
/* 28:   */     Date localDate;
/* 29:   */     try
/* 30:   */     {
/* 31:30 */       localDate = paramJsonObject.has("created") ? a.parse(paramJsonObject.get("created").getAsString()) : new Date();
/* 32:   */     }
/* 33:   */     catch (ParseException localParseException1)
/* 34:   */     {
/* 35:32 */       localDate = new Date();
/* 36:   */     }
/* 37:34 */     this.b = localDate;
/* 38:35 */     this.c = (paramJsonObject.has("source") ? paramJsonObject.get("source").getAsString() : "(Unknown)");
/* 39:   */     Date localObject;
/* 40:   */     try
/* 41:   */     {
/* 42:38 */       localObject = paramJsonObject.has("expires") ? a.parse(paramJsonObject.get("expires").getAsString()) : null;
/* 43:   */     }
/* 44:   */     catch (ParseException localParseException2)
/* 45:   */     {
/* 46:40 */       localObject = null;
/* 47:   */     }
/* 48:42 */     this.d = localObject;
/* 49:43 */     this.e = (paramJsonObject.has("reason") ? paramJsonObject.get("reason").getAsString() : "Banned by an operator.");
/* 50:   */   }
/* 51:   */   
/* 52:   */   public Date c()
/* 53:   */   {
/* 54:55 */     return this.d;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public String d()
/* 58:   */   {
/* 59:59 */     return this.e;
/* 60:   */   }
/* 61:   */   
/* 62:   */   boolean e()
/* 63:   */   {
/* 64:64 */     if (this.d == null) {
/* 65:65 */       return false;
/* 66:   */     }
/* 67:67 */     return this.d.before(new Date());
/* 68:   */   }
/* 69:   */   
/* 70:   */   protected void a(JsonObject paramJsonObject)
/* 71:   */   {
/* 72:72 */     paramJsonObject.addProperty("created", a.format(this.b));
/* 73:73 */     paramJsonObject.addProperty("source", this.c);
/* 74:74 */     paramJsonObject.addProperty("expires", this.d == null ? "forever" : a.format(this.d));
/* 75:75 */     paramJsonObject.addProperty("reason", this.e);
/* 76:   */   }
/* 77:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     rx
 * JD-Core Version:    0.7.0.1
 */