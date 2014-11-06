package net.minecraft.src;
/*  1:   */ public abstract class up<T>
/*  2:   */ {
/*  3:   */   private T a;
/*  4: 5 */   private boolean b = false;
/*  5:   */   
/*  6:   */   public T c()
/*  7:   */   {
/*  8: 8 */     if (!this.b)
/*  9:   */     {
/* 10: 9 */       this.b = true;
/* 11:10 */       this.a = b();
/* 12:   */     }
/* 13:13 */     return this.a;
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected abstract T b();
/* 17:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     up
 * JD-Core Version:    0.7.0.1
 */