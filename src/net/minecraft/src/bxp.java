package net.minecraft.src;
/*   1:    */ class bxp
/*   2:    */   extends bug
/*   3:    */ {
/*   4:    */   private final cxz r;
/*   5:    */   private final String s;
/*   6: 79 */   public float o = 1.0F;
/*   7:    */   public boolean p;
				private final bxo q;
/*   8:    */   
/*   9:    */   public bxp(bxo parambxo, int paramInt1, int paramInt2, int paramInt3, cxz paramcxz, boolean paramBoolean)
/*  10:    */   {
/*  11: 83 */     super(paramInt1, paramInt2, paramInt3, paramBoolean ? 310 : 150, 20, "");
				  q=parambxo;
/*  12: 84 */     this.r = paramcxz;
/*  13: 85 */     this.s = cwc.a("soundCategory." + paramcxz.a(), new Object[0]);
/*  14: 86 */     this.j = (this.s + ": " + parambxo.a(paramcxz));
/*  15: 87 */     this.o = bxo.a(parambxo).a(paramcxz);
/*  16:    */   }
/*  17:    */   
/*  18:    */   protected int a(boolean paramBoolean)
/*  19:    */   {
/*  20: 92 */     return 0;
/*  21:    */   }
/*  22:    */   
/*  23:    */   protected void b(bsu parambsu, int paramInt1, int paramInt2)
/*  24:    */   {
/*  25: 97 */     if (!this.m) {
/*  26: 98 */       return;
/*  27:    */     }
/*  28:101 */     if (this.p)
/*  29:    */     {
/*  30:102 */       this.o = ((paramInt1 - (this.h + 4)) / (this.f - 8));
/*  31:103 */       this.o = MathUtils.clamp(this.o, 0.0F, 1.0F);
/*  32:104 */       parambsu.t.a(this.r, this.o);
/*  33:105 */       parambsu.t.b();
/*  34:106 */       this.j = (this.s + ": " + this.q.a(this.r));
/*  35:    */     }
/*  36:109 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  37:110 */     b(this.h + (int)(this.o * (this.f - 8)), this.i, 0, 66, 4, 20);
/*  38:111 */     b(this.h + (int)(this.o * (this.f - 8)) + 4, this.i, 196, 66, 4, 20);
/*  39:    */   }
/*  40:    */   
/*  41:    */   public boolean c(bsu parambsu, int paramInt1, int paramInt2)
/*  42:    */   {
/*  43:116 */     if (super.c(parambsu, paramInt1, paramInt2))
/*  44:    */     {
/*  45:117 */       this.o = ((paramInt1 - (this.h + 4)) / (this.f - 8));
/*  46:118 */       this.o = MathUtils.clamp(this.o, 0.0F, 1.0F);
/*  47:119 */       parambsu.t.a(this.r, this.o);
/*  48:120 */       parambsu.t.b();
/*  49:121 */       this.j = (this.s + ": " + this.q.a(this.r));
/*  50:122 */       this.p = true;
/*  51:123 */       return true;
/*  52:    */     }
/*  53:126 */     return false;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void a(czh paramczh) {}
/*  57:    */   
/*  58:    */   public void a(int paramInt1, int paramInt2)
/*  59:    */   {
/*  60:135 */     if (this.p)
/*  61:    */     {
/*  62:136 */       float f = this.r == cxz.a ? 1.0F : bxo.a(this.q).a(this.r);
/*  63:137 */       this.q.j.U().a(cxy.a(new oa("gui.button.press"), 1.0F));
/*  64:    */     }
/*  65:139 */     this.p = false;
/*  66:    */   }
/*  67:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxp
 * JD-Core Version:    0.7.0.1
 */