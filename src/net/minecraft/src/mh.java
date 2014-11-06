package net.minecraft.src;
/*  1:   */ public class mh
/*  2:   */   extends mg
/*  3:   */ {
/*  4:   */   public mh()
/*  5:   */   {
/*  6:60 */     this.g = true;
/*  7:   */   }
/*  8:   */   
/*  9:   */   public mh(double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean)
/* 10:   */   {
/* 11:64 */     this.a = paramDouble1;
/* 12:65 */     this.b = paramDouble2;
/* 13:66 */     this.c = paramDouble3;
/* 14:67 */     this.f = paramBoolean;
/* 15:68 */     this.g = true;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 19:   */   {
/* 20:73 */     this.a = paramhd.readDouble();
/* 21:74 */     this.b = paramhd.readDouble();
/* 22:75 */     this.c = paramhd.readDouble();
/* 23:76 */     super.fromBuffer(paramhd);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 27:   */   {
/* 28:81 */     paramhd.writeDouble(this.a);
/* 29:82 */     paramhd.writeDouble(this.b);
/* 30:83 */     paramhd.writeDouble(this.c);
/* 31:84 */     super.toBuffer(paramhd);
/* 32:   */   }
/* 33:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     mh
 * JD-Core Version:    0.7.0.1
 */