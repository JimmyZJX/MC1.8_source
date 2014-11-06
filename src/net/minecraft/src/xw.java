package net.minecraft.src;
/*   1:    */ public class xw
/*   2:    */ {
/*   3:    */   private final int a;
/*   4:    */   private final int b;
/*   5:    */   private Object c;
/*   6:    */   private boolean d;
/*   7:    */   
/*   8:    */   public xw(int paramInt1, int paramInt2, Object paramObject)
/*   9:    */   {
/*  10:352 */     this.b = paramInt2;
/*  11:353 */     this.c = paramObject;
/*  12:354 */     this.a = paramInt1;
/*  13:355 */     this.d = true;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public int a()
/*  17:    */   {
/*  18:359 */     return this.b;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(Object paramObject)
/*  22:    */   {
/*  23:363 */     this.c = paramObject;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public Object b()
/*  27:    */   {
/*  28:367 */     return this.c;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public int c()
/*  32:    */   {
/*  33:371 */     return this.a;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean d()
/*  37:    */   {
/*  38:375 */     return this.d;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void a(boolean paramBoolean)
/*  42:    */   {
/*  43:379 */     this.d = paramBoolean;
/*  44:    */   }
				static boolean a(xw arg0, boolean arg1) {return arg0.d=arg1;}
/*  45:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     xw
 * JD-Core Version:    0.7.0.1
 */