package net.minecraft.src;
/*   1:    */ public class kb
/*   2:    */   extends jy
/*   3:    */ {
/*   4:    */   public kb()
/*   5:    */   {
/*   6: 96 */     this.h = true;
/*   7:    */   }
/*   8:    */   
/*   9:    */   public kb(int paramInt, byte paramByte1, byte paramByte2, boolean paramBoolean)
/*  10:    */   {
/*  11:100 */     super(paramInt);
/*  12:101 */     this.e = paramByte1;
/*  13:102 */     this.f = paramByte2;
/*  14:103 */     this.h = true;
/*  15:104 */     this.g = paramBoolean;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  19:    */   {
/*  20:109 */     super.fromBuffer(paramhd);
/*  21:110 */     this.e = paramhd.readByte();
/*  22:111 */     this.f = paramhd.readByte();
/*  23:112 */     this.g = paramhd.readBoolean();
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  27:    */   {
/*  28:117 */     super.toBuffer(paramhd);
/*  29:118 */     paramhd.writeByte(this.e);
/*  30:119 */     paramhd.writeByte(this.f);
/*  31:120 */     paramhd.writeBoolean(this.g);
/*  32:    */   }
/*  33:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     kb
 * JD-Core Version:    0.7.0.1
 */