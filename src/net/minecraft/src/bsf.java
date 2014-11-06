package net.minecraft.src;
/*  1:   */ import java.util.Collection;
/*  2:   */ 
/*  3:   */ public abstract class bsf
/*  4:   */ {
/*  5:   */   public boolean a(bsf parambsf)
/*  6:   */   {
/*  7:12 */     if (parambsf == null) {
/*  8:13 */       return false;
/*  9:   */     }
/* 10:15 */     if (this == parambsf) {
/* 11:16 */       return true;
/* 12:   */     }
/* 13:18 */     return false;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public abstract String b();
/* 17:   */   
/* 18:   */   public abstract String d(String paramString);
/* 19:   */   
/* 20:   */   public abstract boolean h();
/* 21:   */   
/* 22:   */   public abstract boolean g();
/* 23:   */   
/* 24:   */   public abstract bsg i();
/* 25:   */   
/* 26:   */   public abstract Collection d();
/* 27:   */   
/* 28:   */   public abstract bsg j();
/* 29:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsf
 * JD-Core Version:    0.7.0.1
 */