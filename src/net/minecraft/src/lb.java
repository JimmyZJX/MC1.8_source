package net.minecraft.src;
/*  1:   */ public class lb
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private float a;
/*  5:   */   private int b;
/*  6:   */   private int c;
/*  7:   */   
/*  8:   */   public lb() {}
/*  9:   */   
/* 10:   */   public lb(float paramFloat, int paramInt1, int paramInt2)
/* 11:   */   {
/* 12:17 */     this.a = paramFloat;
/* 13:18 */     this.b = paramInt1;
/* 14:19 */     this.c = paramInt2;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 18:   */   {
/* 19:24 */     this.a = paramhd.readFloat();
/* 20:25 */     this.c = paramhd.e();
/* 21:26 */     this.b = paramhd.e();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 25:   */   {
/* 26:31 */     paramhd.writeFloat(this.a);
/* 27:32 */     paramhd.b(this.c);
/* 28:33 */     paramhd.b(this.b);
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
/* 46:   */   public int c()
/* 47:   */   {
/* 48:50 */     return this.c;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     lb
 * JD-Core Version:    0.7.0.1
 */