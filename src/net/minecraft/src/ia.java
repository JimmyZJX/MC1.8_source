package net.minecraft.src;
/*  1:   */ public class ia
/*  2:   */   extends IllegalArgumentException
/*  3:   */ {
/*  4:   */   public ia(hz paramhz, String paramString)
/*  5:   */   {
/*  6: 5 */     super(String.format("Error parsing: %s: %s", new Object[] { paramhz, paramString }));
/*  7:   */   }
/*  8:   */   
/*  9:   */   public ia(hz paramhz, int paramInt)
/* 10:   */   {
/* 11: 9 */     super(String.format("Invalid index %d requested for %s", new Object[] { Integer.valueOf(paramInt), paramhz }));
/* 12:   */   }
/* 13:   */   
/* 14:   */   public ia(hz paramhz, Throwable paramThrowable)
/* 15:   */   {
/* 16:13 */     super(String.format("Error while parsing: %s", new Object[] { paramhz }), paramThrowable);
/* 17:   */   }
/* 18:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ia
 * JD-Core Version:    0.7.0.1
 */