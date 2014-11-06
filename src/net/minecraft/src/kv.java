package net.minecraft.src;
/*  1:   */ public class kv
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   
/*  6:   */   public kv() {}
/*  7:   */   
/*  8:   */   public kv(int paramInt)
/*  9:   */   {
/* 10:17 */     this.a = paramInt;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 14:   */   {
/* 15:22 */     this.a = paramhd.readByte();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 19:   */   {
/* 20:27 */     paramhd.writeByte(this.a);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(ik paramik)
/* 24:   */   {
/* 25:32 */     paramik.a(this);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public int a()
/* 29:   */   {
/* 30:36 */     return this.a;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     kv
 * JD-Core Version:    0.7.0.1
 */