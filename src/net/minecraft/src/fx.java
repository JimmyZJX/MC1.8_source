package net.minecraft.src;
/*  1:   */ public class fx
/*  2:   */ {
/*  3: 4 */   public static final fx a = new fy(0L);
/*  4:   */   private final long b;
/*  5:   */   private long c;
/*  6:   */   
/*  7:   */   public fx(long paramLong)
/*  8:   */   {
/*  9:15 */     this.b = paramLong;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void a(long paramLong)
/* 13:   */   {
/* 14:19 */     this.c += paramLong / 8L;
/* 15:20 */     if (this.c > this.b) {
/* 16:21 */       throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.c + "bytes where max allowed: " + this.b);
/* 17:   */     }
/* 18:   */   }
/* 19:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     fx
 * JD-Core Version:    0.7.0.1
 */