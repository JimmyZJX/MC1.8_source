package net.minecraft.src;
/*  1:   */ public class it
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private BlockPosition b;
/*  6:   */   private int c;
/*  7:   */   
/*  8:   */   public it() {}
/*  9:   */   
/* 10:   */   public it(int paramInt1, BlockPosition paramdt, int paramInt2)
/* 11:   */   {
/* 12:19 */     this.a = paramInt1;
/* 13:20 */     this.b = paramdt;
/* 14:21 */     this.c = paramInt2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 18:   */   {
/* 19:26 */     this.a = paramhd.e();
/* 20:27 */     this.b = paramhd.readBlockPosition();
/* 21:28 */     this.c = paramhd.readUnsignedByte();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 25:   */   {
/* 26:33 */     paramhd.b(this.a);
/* 27:34 */     paramhd.writeBlockPosition(this.b);
/* 28:35 */     paramhd.writeByte(this.c);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(ik paramik)
/* 32:   */   {
/* 33:40 */     paramik.a(this);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int a()
/* 37:   */   {
/* 38:44 */     return this.a;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public BlockPosition b()
/* 42:   */   {
/* 43:48 */     return this.b;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public int c()
/* 47:   */   {
/* 48:52 */     return this.c;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     it
 * JD-Core Version:    0.7.0.1
 */