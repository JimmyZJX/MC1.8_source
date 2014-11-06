package net.minecraft.src;
/*  1:   */ public class jj
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private ho a;
/*  5:   */   
/*  6:   */   public jj() {}
/*  7:   */   
/*  8:   */   public jj(ho paramho)
/*  9:   */   {
/* 10:17 */     this.a = paramho;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 14:   */   {
/* 15:22 */     this.a = paramhd.d();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 19:   */   {
/* 20:27 */     paramhd.a(this.a);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(ik paramik)
/* 24:   */   {
/* 25:32 */     paramik.a(this);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public ho a()
/* 29:   */   {
/* 30:36 */     return this.a;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jj
 * JD-Core Version:    0.7.0.1
 */