package net.minecraft.src;
/*  1:   */ public class jz
/*  2:   */   extends jy
/*  3:   */ {
/*  4:   */   public jz() {}
/*  5:   */   
/*  6:   */   public jz(int paramInt, byte paramByte1, byte paramByte2, byte paramByte3, boolean paramBoolean)
/*  7:   */   {
/*  8:67 */     super(paramInt);
/*  9:68 */     this.b = paramByte1;
/* 10:69 */     this.c = paramByte2;
/* 11:70 */     this.d = paramByte3;
/* 12:71 */     this.g = paramBoolean;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 16:   */   {
/* 17:76 */     super.fromBuffer(paramhd);
/* 18:77 */     this.b = paramhd.readByte();
/* 19:78 */     this.c = paramhd.readByte();
/* 20:79 */     this.d = paramhd.readByte();
/* 21:80 */     this.g = paramhd.readBoolean();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 25:   */   {
/* 26:85 */     super.toBuffer(paramhd);
/* 27:86 */     paramhd.writeByte(this.b);
/* 28:87 */     paramhd.writeByte(this.c);
/* 29:88 */     paramhd.writeByte(this.d);
/* 30:89 */     paramhd.writeBoolean(this.g);
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jz
 * JD-Core Version:    0.7.0.1
 */