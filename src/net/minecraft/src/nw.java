package net.minecraft.src;
/*  1:   */ public class nw
/*  2:   */   implements id<nv>
/*  3:   */ {
/*  4:   */   private long a;
/*  5:   */   
/*  6:   */   public nw() {}
/*  7:   */   
/*  8:   */   public nw(long paramLong)
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
/* 23:   */   public void a(nv paramnv)
/* 24:   */   {
/* 25:31 */     paramnv.a(this);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public long a()
/* 29:   */   {
/* 30:35 */     return this.a;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     nw
 * JD-Core Version:    0.7.0.1
 */