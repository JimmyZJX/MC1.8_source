package net.minecraft.src;
/*  1:   */ public class coo
/*  2:   */   extends cop
/*  3:   */ {
/*  4:10 */   private final int d = bst.a(aql.values().length);
/*  5:   */   
/*  6:   */   public coo(World paramaqu, ckn paramckn, BlockPosition paramdt, int paramInt)
/*  7:   */   {
/*  8:13 */     super(paramaqu, paramckn, paramdt, paramInt);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public int a(aql paramaql, cok paramcok)
/* 12:   */   {
/* 13:17 */     if (!paramcok.b(paramaql)) {
/* 14:18 */       return this.d + paramaql.ordinal();
/* 15:   */     }
/* 16:20 */     return -1;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a()
/* 20:   */   {
/* 21:25 */     super.a();
/* 22:26 */     bst.a(this.d, aql.values().length);
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     coo
 * JD-Core Version:    0.7.0.1
 */