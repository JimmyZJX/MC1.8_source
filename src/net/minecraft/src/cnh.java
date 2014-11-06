package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.Collections;
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ public class cnh
/*  6:   */ {
/*  7:   */   private bex a;
/*  8:   */   private String b;
/*  9:51 */   private final List<bex> c = Lists.newArrayList();
/* 10:   */   
/* 11:   */   public cnh a(bex parambex)
/* 12:   */   {
/* 13:57 */     this.a = parambex;
/* 14:58 */     return this;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public cnh a(String paramString)
/* 18:   */   {
/* 19:62 */     this.b = paramString;
/* 20:63 */     return this;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public cnh a(bex... paramVarArgs)
/* 24:   */   {
/* 25:67 */     Collections.addAll(this.c, paramVarArgs);
/* 26:68 */     return this;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public cnf a()
/* 30:   */   {
/* 31:72 */     return new cnf(this.a, this.b, this.c, null);
/* 32:   */   }
/* 33:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cnh
 * JD-Core Version:    0.7.0.1
 */