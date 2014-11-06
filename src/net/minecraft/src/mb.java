package net.minecraft.src;
/*  1:   */ public class mb
/*  2:   */   implements id<ls>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   
/*  6:   */   public mb() {}
/*  7:   */   
/*  8:   */   public mb(int paramInt)
/*  9:   */   {
/* 10:15 */     this.a = paramInt;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(ls paramls)
/* 14:   */   {
/* 15:20 */     paramls.a(this);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 19:   */   {
/* 20:25 */     this.a = paramhd.readByte();
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 24:   */   {
/* 25:30 */     paramhd.writeByte(this.a);
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     mb
 * JD-Core Version:    0.7.0.1
 */