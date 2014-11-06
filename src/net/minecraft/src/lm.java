package net.minecraft.src;
/*  1:   */ public class lm
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private ho a;
/*  5:   */   private ho b;
/*  6:   */   
/*  7:   */   public lm() {}
/*  8:   */   
/*  9:   */   public lm(ho paramho)
/* 10:   */   {
/* 11:18 */     this.a = paramho;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 15:   */   {
/* 16:23 */     this.a = paramhd.d();
/* 17:24 */     this.b = paramhd.d();
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 21:   */   {
/* 22:29 */     paramhd.a(this.a);
/* 23:30 */     paramhd.a(this.b);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(ik paramik)
/* 27:   */   {
/* 28:35 */     paramik.a(this);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public ho a()
/* 32:   */   {
/* 33:39 */     return this.a;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public ho b()
/* 37:   */   {
/* 38:43 */     return this.b;
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     lm
 * JD-Core Version:    0.7.0.1
 */