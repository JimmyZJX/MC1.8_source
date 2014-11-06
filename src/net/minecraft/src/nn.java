package net.minecraft.src;
/*  1:   */ public class nn
/*  2:   */   implements id<nm>
/*  3:   */ {
/*  4:   */   private long a;
/*  5:   */   
/*  6:   */   public nn() {}
/*  7:   */   
/*  8:   */   public nn(long paramLong)
/*  9:   */   {
/* 10:16 */     this.a = paramLong;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 14:   */   {
/* 15:21 */     this.a = paramhd.readLong();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 19:   */   {
/* 20:26 */     paramhd.writeLong(this.a);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(nm paramnm)
/* 24:   */   {
/* 25:31 */     paramnm.a(this);
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     nn
 * JD-Core Version:    0.7.0.1
 */