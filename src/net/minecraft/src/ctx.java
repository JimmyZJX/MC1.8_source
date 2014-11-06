package net.minecraft.src;
/*   1:    */ public class ctx
/*   2:    */   implements Comparable<ctx>
/*   3:    */ {
/*   4:    */   private final cue a;
/*   5:    */   private final int b;
/*   6:    */   private final int c;
/*   7:    */   private final int d;
/*   8:    */   private boolean e;
/*   9:201 */   private float f = 1.0F;
/*  10:    */   
/*  11:    */   public ctx(cue paramcue, int paramInt)
/*  12:    */   {
/*  13:204 */     this.a = paramcue;
/*  14:205 */     this.b = paramcue.c();
/*  15:206 */     this.c = paramcue.d();
/*  16:207 */     this.d = paramInt;
/*  17:    */     
/*  18:209 */     this.e = (ctw.a(this.c, paramInt) > ctw.a(this.b, paramInt));
/*  19:    */   }
/*  20:    */   
/*  21:    */   public cue a()
/*  22:    */   {
/*  23:213 */     return this.a;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public int b()
/*  27:    */   {
/*  28:217 */     return this.e ? ctw.a((int)(this.c * this.f), this.d) : ctw.a((int)(this.b * this.f), this.d);
/*  29:    */   }
/*  30:    */   
/*  31:    */   public int c()
/*  32:    */   {
/*  33:221 */     return this.e ? ctw.a((int)(this.b * this.f), this.d) : ctw.a((int)(this.c * this.f), this.d);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void d()
/*  37:    */   {
/*  38:225 */     this.e = (!this.e);
/*  39:    */   }
/*  40:    */   
/*  41:    */   public boolean e()
/*  42:    */   {
/*  43:229 */     return this.e;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void a(int paramInt)
/*  47:    */   {
/*  48:233 */     if ((this.b <= paramInt) || (this.c <= paramInt)) {
/*  49:234 */       return;
/*  50:    */     }
/*  51:237 */     this.f = (paramInt / Math.min(this.b, this.c));
/*  52:    */   }
/*  53:    */   
/*  54:    */   public String toString()
/*  55:    */   {
/*  56:242 */     return "Holder{width=" + this.b + ", height=" + this.c + '}';
/*  57:    */   }
/*  58:    */   
/*  59:    */   public int compareTo(ctx paramctx)
/*  60:    */   {
/*  61:    */     int i;
/*  62:248 */     if (c() == paramctx.c())
/*  63:    */     {
/*  64:249 */       if (b() == paramctx.b())
/*  65:    */       {
/*  66:250 */         if (this.a.i() == null) {
/*  67:251 */           return paramctx.a.i() == null ? 0 : -1;
/*  68:    */         }
/*  69:253 */         return this.a.i().compareTo(paramctx.a.i());
/*  70:    */       }
/*  71:255 */       i = b() < paramctx.b() ? 1 : -1;
/*  72:    */     }
/*  73:    */     else
/*  74:    */     {
/*  75:257 */       i = c() < paramctx.c() ? 1 : -1;
/*  76:    */     }
/*  77:259 */     return i;
/*  78:    */   }
/*  79:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctx
 * JD-Core Version:    0.7.0.1
 */