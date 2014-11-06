package net.minecraft.src;
/*  1:   */ public class km
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int[] a;
/*  5:   */   
/*  6:   */   public km() {}
/*  7:   */   
/*  8:   */   public km(int... paramVarArgs)
/*  9:   */   {
/* 10:19 */     this.a = paramVarArgs;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 14:   */   {
/* 15:24 */     this.a = new int[paramhd.e()];
/* 16:26 */     for (int i = 0; i < this.a.length; i++) {
/* 17:27 */       this.a[i] = paramhd.e();
/* 18:   */     }
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 22:   */   {
/* 23:33 */     paramhd.b(this.a.length);
/* 24:35 */     for (int i = 0; i < this.a.length; i++) {
/* 25:36 */       paramhd.b(this.a[i]);
/* 26:   */     }
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(ik paramik)
/* 30:   */   {
/* 31:42 */     paramik.a(this);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public int[] a()
/* 35:   */   {
/* 36:46 */     return this.a;
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     km
 * JD-Core Version:    0.7.0.1
 */