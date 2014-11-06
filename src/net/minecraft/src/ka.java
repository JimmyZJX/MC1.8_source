package net.minecraft.src;
/*  1:   */ public class ka
/*  2:   */   extends jy
/*  3:   */ {
/*  4:   */   public ka()
/*  5:   */   {
/*  6:24 */     this.h = true;
/*  7:   */   }
/*  8:   */   
/*  9:   */   public ka(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, boolean paramBoolean)
/* 10:   */   {
/* 11:28 */     super(paramInt);
/* 12:29 */     this.b = paramByte1;
/* 13:30 */     this.c = paramByte2;
/* 14:31 */     this.d = paramByte3;
/* 15:32 */     this.e = paramByte4;
/* 16:33 */     this.f = paramByte5;
/* 17:34 */     this.g = paramBoolean;
/* 18:35 */     this.h = true;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 22:   */   {
/* 23:40 */     super.fromBuffer(paramhd);
/* 24:41 */     this.b = paramhd.readByte();
/* 25:42 */     this.c = paramhd.readByte();
/* 26:43 */     this.d = paramhd.readByte();
/* 27:44 */     this.e = paramhd.readByte();
/* 28:45 */     this.f = paramhd.readByte();
/* 29:46 */     this.g = paramhd.readBoolean();
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 33:   */   {
/* 34:51 */     super.toBuffer(paramhd);
/* 35:52 */     paramhd.writeByte(this.b);
/* 36:53 */     paramhd.writeByte(this.c);
/* 37:54 */     paramhd.writeByte(this.d);
/* 38:55 */     paramhd.writeByte(this.e);
/* 39:56 */     paramhd.writeByte(this.f);
/* 40:57 */     paramhd.writeBoolean(this.g);
/* 41:   */   }
/* 42:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ka
 * JD-Core Version:    0.7.0.1
 */