package net.minecraft.src;
/*  1:   */ public class ly
/*  2:   */   implements id<ls>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private short b;
/*  6:   */   private boolean c;
/*  7:   */   
/*  8:   */   public ly() {}
/*  9:   */   
/* 10:   */   public ly(int paramInt, short paramShort, boolean paramBoolean)
/* 11:   */   {
/* 12:17 */     this.a = paramInt;
/* 13:18 */     this.b = paramShort;
/* 14:19 */     this.c = paramBoolean;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void a(ls paramls)
/* 18:   */   {
/* 19:24 */     paramls.a(this);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 23:   */   {
/* 24:29 */     this.a = paramhd.readByte();
/* 25:30 */     this.b = paramhd.readShort();
/* 26:31 */     this.c = (paramhd.readByte() != 0);
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 30:   */   {
/* 31:36 */     paramhd.writeByte(this.a);
/* 32:37 */     paramhd.writeShort(this.b);
/* 33:38 */     paramhd.writeByte(this.c ? 1 : 0);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int a()
/* 37:   */   {
/* 38:42 */     return this.a;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public short b()
/* 42:   */   {
/* 43:46 */     return this.b;
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ly
 * JD-Core Version:    0.7.0.1
 */