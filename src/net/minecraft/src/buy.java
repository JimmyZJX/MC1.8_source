package net.minecraft.src;
/*   1:    */ public class buy
/*   2:    */   implements buv
/*   3:    */ {
/*   4:    */   private final bsu a;
/*   5:    */   private final bug b;
/*   6:    */   private final bug c;
/*   7:    */   
/*   8:    */   public buy(bug parambug1, bug parambug2)
/*   9:    */   {
/*  10: 61 */     this.a = bsu.z();
/*  11: 62 */     this.b = parambug1;
/*  12: 63 */     this.c = parambug2;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
/*  16:    */   {
/*  17: 68 */     if (this.b != null)
/*  18:    */     {
/*  19: 69 */       this.b.i = paramInt3;
/*  20: 70 */       this.b.a(this.a, paramInt6, paramInt7);
/*  21:    */     }
/*  22: 73 */     if (this.c != null)
/*  23:    */     {
/*  24: 74 */       this.c.i = paramInt3;
/*  25: 75 */       this.c.a(this.a, paramInt6, paramInt7);
/*  26:    */     }
/*  27:    */   }
/*  28:    */   
/*  29:    */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  30:    */   {
/*  31: 81 */     if (this.b.c(this.a, paramInt2, paramInt3))
/*  32:    */     {
/*  33: 82 */       if ((this.b instanceof buw))
/*  34:    */       {
/*  35: 83 */         this.a.t.a(((buw)this.b).c(), 1);
/*  36: 84 */         this.b.j = this.a.t.c(btr.a(this.b.k));
/*  37:    */       }
/*  38: 86 */       return true;
/*  39:    */     }
/*  40: 87 */     if ((this.c != null) && (this.c.c(this.a, paramInt2, paramInt3)))
/*  41:    */     {
/*  42: 88 */       if ((this.c instanceof buw))
/*  43:    */       {
/*  44: 89 */         this.a.t.a(((buw)this.c).c(), 1);
/*  45: 90 */         this.c.j = this.a.t.c(btr.a(this.c.k));
/*  46:    */       }
/*  47: 92 */       return true;
/*  48:    */     }
/*  49: 95 */     return false;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  53:    */   {
/*  54:100 */     if (this.b != null) {
/*  55:101 */       this.b.a(paramInt2, paramInt3);
/*  56:    */     }
/*  57:103 */     if (this.c != null) {
/*  58:104 */       this.c.a(paramInt2, paramInt3);
/*  59:    */     }
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void a(int paramInt1, int paramInt2, int paramInt3) {}
/*  63:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     buy
 * JD-Core Version:    0.7.0.1
 */