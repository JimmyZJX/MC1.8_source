package net.minecraft.src;
/*  1:   */ import java.util.Map;
/*  2:   */ 
/*  3:   */ public class brm
/*  4:   */   extends brn
/*  5:   */ {
/*  6:   */   public brm()
/*  7:   */   {
/*  8:11 */     super(null);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public bqc a(Class paramClass, String paramString)
/* 12:   */   {
/* 13:16 */     return (bqc)this.a.get(paramString);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(String paramString, bqc parambqc)
/* 17:   */   {
/* 18:21 */     this.a.put(paramString, parambqc);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a() {}
/* 22:   */   
/* 23:   */   public int a(String paramString)
/* 24:   */   {
/* 25:30 */     return 0;
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     brm
 * JD-Core Version:    0.7.0.1
 */