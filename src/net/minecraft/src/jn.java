package net.minecraft.src;
/*  1:   */ public class jn
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   
/*  6:   */   public void fromBuffer(ByteBufWrapper paramhd)
/*  7:   */   {
/*  8:21 */     this.a = paramhd.e();
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 12:   */   {
/* 13:26 */     paramhd.b(this.a);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(ik paramik)
/* 17:   */   {
/* 18:31 */     paramik.a(this);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public int a()
/* 22:   */   {
/* 23:35 */     return this.a;
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jn
 * JD-Core Version:    0.7.0.1
 */