package net.minecraft.src;
/*  1:   */ public class li
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private long a;
/*  5:   */   private long b;
/*  6:   */   
/*  7:   */   public li() {}
/*  8:   */   
/*  9:   */   public li(long paramLong1, long paramLong2, boolean paramBoolean)
/* 10:   */   {
/* 11:16 */     this.a = paramLong1;
/* 12:17 */     this.b = paramLong2;
/* 13:19 */     if (!paramBoolean)
/* 14:   */     {
/* 15:20 */       this.b = (-this.b);
/* 16:21 */       if (this.b == 0L) {
/* 17:22 */         this.b = -1L;
/* 18:   */       }
/* 19:   */     }
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 23:   */   {
/* 24:29 */     this.a = paramhd.readLong();
/* 25:30 */     this.b = paramhd.readLong();
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 29:   */   {
/* 30:35 */     paramhd.writeLong(this.a);
/* 31:36 */     paramhd.writeLong(this.b);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void a(ik paramik)
/* 35:   */   {
/* 36:41 */     paramik.a(this);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public long a()
/* 40:   */   {
/* 41:45 */     return this.a;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public long b()
/* 45:   */   {
/* 46:49 */     return this.b;
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     li
 * JD-Core Version:    0.7.0.1
 */