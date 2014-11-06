package net.minecraft.src;
/*  1:   */ import java.util.Collections;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class cxb
/*  5:   */   implements cwi
/*  6:   */ {
/*  7:   */   private final boolean a;
/*  8:   */   private final boolean b;
/*  9:   */   private final List c;
/* 10:   */   
/* 11:   */   public cxb(boolean paramBoolean1, boolean paramBoolean2, List paramList)
/* 12:   */   {
/* 13:19 */     this.a = paramBoolean1;
/* 14:20 */     this.b = paramBoolean2;
/* 15:21 */     this.c = paramList;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean a()
/* 19:   */   {
/* 20:25 */     return this.a;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public boolean b()
/* 24:   */   {
/* 25:29 */     return this.b;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public List c()
/* 29:   */   {
/* 30:33 */     return Collections.unmodifiableList(this.c);
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxb
 * JD-Core Version:    0.7.0.1
 */