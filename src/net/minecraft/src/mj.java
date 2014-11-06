package net.minecraft.src;
/*   1:    */ public class mj
/*   2:    */   extends mg
/*   3:    */ {
/*   4:    */   public mj()
/*   5:    */   {
/*   6: 91 */     this.h = true;
/*   7:    */   }
/*   8:    */   
/*   9:    */   public mj(float paramFloat1, float paramFloat2, boolean paramBoolean)
/*  10:    */   {
/*  11: 95 */     this.d = paramFloat1;
/*  12: 96 */     this.e = paramFloat2;
/*  13: 97 */     this.f = paramBoolean;
/*  14: 98 */     this.h = true;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  18:    */   {
/*  19:103 */     this.d = paramhd.readFloat();
/*  20:104 */     this.e = paramhd.readFloat();
/*  21:105 */     super.fromBuffer(paramhd);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  25:    */   {
/*  26:110 */     paramhd.writeFloat(this.d);
/*  27:111 */     paramhd.writeFloat(this.e);
/*  28:112 */     super.toBuffer(paramhd);
/*  29:    */   }
/*  30:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     mj
 * JD-Core Version:    0.7.0.1
 */