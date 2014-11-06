package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.io.FileNotFoundException;
/*  3:   */ import java.io.IOException;
/*  4:   */ import java.util.List;
/*  5:   */ 
/*  6:   */ public class ow
/*  7:   */   extends IOException
/*  8:   */ {
/*  9:11 */   private final List a = Lists.newArrayList();
/* 10:   */   private final String b;
/* 11:   */   
/* 12:   */   public ow(String paramString)
/* 13:   */   {
/* 14:15 */     this.a.add(new oy(null));
/* 15:16 */     this.b = paramString;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public ow(String paramString, Throwable paramThrowable)
/* 19:   */   {
/* 20:20 */     super(paramThrowable);
/* 21:21 */     this.a.add(new oy(null));
/* 22:22 */     this.b = paramString;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void a(String paramString)
/* 26:   */   {
/* 27:26 */     oy.a((oy)this.a.get(0), paramString);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void b(String paramString)
/* 31:   */   {
/* 32:30 */     oy.b((oy)this.a.get(0), paramString);
/* 33:31 */     this.a.add(0, new oy(null));
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getMessage()
/* 37:   */   {
/* 38:36 */     return "Invalid " + ((oy)this.a.get(this.a.size() - 1)).toString() + ": " + this.b;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public static ow a(Exception paramException)
/* 42:   */   {
/* 43:40 */     if ((paramException instanceof ow)) {
/* 44:41 */       return (ow)paramException;
/* 45:   */     }
/* 46:43 */     String str = paramException.getMessage();
/* 47:44 */     if ((paramException instanceof FileNotFoundException)) {
/* 48:45 */       str = "File not found";
/* 49:   */     }
/* 50:47 */     return new ow(str, paramException);
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ow
 * JD-Core Version:    0.7.0.1
 */