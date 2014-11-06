package net.minecraft.src;
/*  1:   */ public class jd
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   
/*  6:   */   public jd() {}
/*  7:   */   
/*  8:   */   public jd(int paramInt)
/*  9:   */   {
/* 10:17 */     this.a = paramInt;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(ik paramik)
/* 14:   */   {
/* 15:22 */     paramik.a(this);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 19:   */   {
/* 20:27 */     this.a = paramhd.readUnsignedByte();
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 24:   */   {
/* 25:32 */     paramhd.writeByte(this.a);
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jd
 * JD-Core Version:    0.7.0.1
 */