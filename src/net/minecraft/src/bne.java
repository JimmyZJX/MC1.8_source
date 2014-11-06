package net.minecraft.src;
/*  1:   */ public class bne
/*  2:   */ {
/*  3:   */   public Class a;
/*  4:   */   public final int b;
/*  5:   */   public int c;
/*  6:   */   public int d;
/*  7:   */   
/*  8:   */   public bne(Class paramClass, int paramInt1, int paramInt2)
/*  9:   */   {
/* 10:57 */     this.a = paramClass;
/* 11:58 */     this.b = paramInt1;
/* 12:59 */     this.d = paramInt2;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean a(int paramInt)
/* 16:   */   {
/* 17:63 */     return (this.d == 0) || (this.c < this.d);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean a()
/* 21:   */   {
/* 22:67 */     return (this.d == 0) || (this.c < this.d);
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bne
 * JD-Core Version:    0.7.0.1
 */