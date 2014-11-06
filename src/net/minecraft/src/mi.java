package net.minecraft.src;
/*  1:   */ public class mi
/*  2:   */   extends mg
/*  3:   */ {
/*  4:   */   public mi()
/*  5:   */   {
/*  6:21 */     this.g = true;
/*  7:22 */     this.h = true;
/*  8:   */   }
/*  9:   */   
/* 10:   */   public mi(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, boolean paramBoolean)
/* 11:   */   {
/* 12:26 */     this.a = paramDouble1;
/* 13:27 */     this.b = paramDouble2;
/* 14:28 */     this.c = paramDouble3;
/* 15:29 */     this.d = paramFloat1;
/* 16:30 */     this.e = paramFloat2;
/* 17:31 */     this.f = paramBoolean;
/* 18:32 */     this.h = true;
/* 19:33 */     this.g = true;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 23:   */   {
/* 24:38 */     this.a = paramhd.readDouble();
/* 25:39 */     this.b = paramhd.readDouble();
/* 26:40 */     this.c = paramhd.readDouble();
/* 27:41 */     this.d = paramhd.readFloat();
/* 28:42 */     this.e = paramhd.readFloat();
/* 29:43 */     super.fromBuffer(paramhd);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 33:   */   {
/* 34:48 */     paramhd.writeDouble(this.a);
/* 35:49 */     paramhd.writeDouble(this.b);
/* 36:50 */     paramhd.writeDouble(this.c);
/* 37:51 */     paramhd.writeFloat(this.d);
/* 38:52 */     paramhd.writeFloat(this.e);
/* 39:53 */     super.toBuffer(paramhd);
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     mi
 * JD-Core Version:    0.7.0.1
 */