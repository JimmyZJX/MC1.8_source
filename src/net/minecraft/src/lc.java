package net.minecraft.src;
/*  1:   */ public class lc
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private float a;
/*  5:   */   private int b;
/*  6:   */   private float c;
/*  7:   */   
/*  8:   */   public lc() {}
/*  9:   */   
/* 10:   */   public lc(float paramFloat1, int paramInt, float paramFloat2)
/* 11:   */   {
/* 12:17 */     this.a = paramFloat1;
/* 13:18 */     this.b = paramInt;
/* 14:19 */     this.c = paramFloat2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 18:   */   {
/* 19:24 */     this.a = paramhd.readFloat();
/* 20:25 */     this.b = paramhd.e();
/* 21:26 */     this.c = paramhd.readFloat();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 25:   */   {
/* 26:31 */     paramhd.writeFloat(this.a);
/* 27:32 */     paramhd.b(this.b);
/* 28:33 */     paramhd.writeFloat(this.c);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(ik paramik)
/* 32:   */   {
/* 33:38 */     paramik.a(this);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public float a()
/* 37:   */   {
/* 38:42 */     return this.a;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int b()
/* 42:   */   {
/* 43:46 */     return this.b;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public float c()
/* 47:   */   {
/* 48:50 */     return this.c;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     lc
 * JD-Core Version:    0.7.0.1
 */