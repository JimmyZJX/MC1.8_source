package net.minecraft.src;
/*  1:   */ public class ln
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private int b;
/*  6:   */   
/*  7:   */   public ln() {}
/*  8:   */   
/*  9:   */   public ln(int paramInt1, int paramInt2)
/* 10:   */   {
/* 11:16 */     this.a = paramInt1;
/* 12:17 */     this.b = paramInt2;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 16:   */   {
/* 17:22 */     this.a = paramhd.e();
/* 18:23 */     this.b = paramhd.e();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 22:   */   {
/* 23:28 */     paramhd.b(this.a);
/* 24:29 */     paramhd.b(this.b);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(ik paramik)
/* 28:   */   {
/* 29:34 */     paramik.a(this);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public int a()
/* 33:   */   {
/* 34:38 */     return this.a;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public int b()
/* 38:   */   {
/* 39:42 */     return this.b;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ln
 * JD-Core Version:    0.7.0.1
 */