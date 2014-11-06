package net.minecraft.src;
/*  1:   */ public final class pi
/*  2:   */   extends RuntimeException
/*  3:   */ {
/*  4: 4 */   public static final pi a = new pi();
/*  5:   */   
/*  6:   */   private pi()
/*  7:   */   {
/*  8: 7 */     setStackTrace(new StackTraceElement[0]);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public synchronized Throwable fillInStackTrace()
/* 12:   */   {
/* 13:12 */     setStackTrace(new StackTraceElement[0]);
/* 14:13 */     return this;
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     pi
 * JD-Core Version:    0.7.0.1
 */