package net.minecraft.src;
/*  1:   */ import java.io.OutputStream;
/*  2:   */ import java.io.PrintStream;
/*  3:   */ import org.apache.logging.log4j.LogManager;
/*  4:   */ import org.apache.logging.log4j.Logger;
/*  5:   */ 
/*  6:   */ public class pc
/*  7:   */   extends PrintStream
/*  8:   */ {
/*  9:10 */   private static final Logger a = LogManager.getLogger();
/* 10:   */   private final String b;
/* 11:   */   
/* 12:   */   public pc(String paramString, OutputStream paramOutputStream)
/* 13:   */   {
/* 14:14 */     super(paramOutputStream);
/* 15:15 */     this.b = paramString;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void println(String paramString)
/* 19:   */   {
/* 20:20 */     a(paramString);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void println(Object paramObject)
/* 24:   */   {
/* 25:25 */     a(String.valueOf(paramObject));
/* 26:   */   }
/* 27:   */   
/* 28:   */   private void a(String paramString)
/* 29:   */   {
/* 30:29 */     StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
/* 31:30 */     StackTraceElement localStackTraceElement = arrayOfStackTraceElement[java.lang.Math.min(3, arrayOfStackTraceElement.length)];
/* 32:31 */     a.info("[{}]@.({}:{}): {}", new Object[] { this.b, localStackTraceElement.getFileName(), Integer.valueOf(localStackTraceElement.getLineNumber()), paramString });
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     pc
 * JD-Core Version:    0.7.0.1
 */