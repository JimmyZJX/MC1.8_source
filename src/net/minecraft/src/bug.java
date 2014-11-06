package net.minecraft.src;
/*   1:    */ public class bug
/*   2:    */   extends bub
/*   3:    */ {
/*   4: 14 */   protected static final oa a = new oa("textures/gui/widgets.png");
/*   5: 16 */   protected int f = 200;
/*   6: 17 */   protected int g = 20;
/*   7:    */   public int h;
/*   8:    */   public int i;
/*   9:    */   public String j;
/*  10:    */   public int k;
/*  11: 21 */   public boolean l = true;
/*  12: 22 */   public boolean m = true;
/*  13:    */   protected boolean n;
/*  14:    */   
/*  15:    */   public bug(int paramInt1, int paramInt2, int paramInt3, String paramString)
/*  16:    */   {
/*  17: 26 */     this(paramInt1, paramInt2, paramInt3, 200, 20, paramString);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public bug(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString)
/*  21:    */   {
/*  22: 30 */     this.k = paramInt1;
/*  23: 31 */     this.h = paramInt2;
/*  24: 32 */     this.i = paramInt3;
/*  25: 33 */     this.f = paramInt4;
/*  26: 34 */     this.g = paramInt5;
/*  27: 35 */     this.j = paramString;
/*  28:    */   }
/*  29:    */   
/*  30:    */   protected int a(boolean paramBoolean)
/*  31:    */   {
/*  32: 39 */     int i1 = 1;
/*  33: 40 */     if (!this.l) {
/*  34: 41 */       i1 = 0;
/*  35: 42 */     } else if (paramBoolean) {
/*  36: 43 */       i1 = 2;
/*  37:    */     }
/*  38: 45 */     return i1;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void a(bsu parambsu, int paramInt1, int paramInt2)
/*  42:    */   {
/*  43: 49 */     if (!this.m) {
/*  44: 50 */       return;
/*  45:    */     }
/*  46: 53 */     bty localbty = parambsu.k;
/*  47:    */     
/*  48: 55 */     parambsu.N().a(a);
/*  49: 56 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  50:    */     
/*  51: 58 */     this.n = ((paramInt1 >= this.h) && (paramInt2 >= this.i) && (paramInt1 < this.h + this.f) && (paramInt2 < this.i + this.g));
/*  52: 59 */     int i1 = a(this.n);
/*  53:    */     
/*  54: 61 */     cjm.enableBlend();
/*  55: 62 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/*  56: 63 */     cjm.glBlendFunc(770, 771);
/*  57: 64 */     b(this.h, this.i, 0, 46 + i1 * 20, this.f / 2, this.g);
/*  58: 65 */     b(this.h + this.f / 2, this.i, 200 - this.f / 2, 46 + i1 * 20, this.f / 2, this.g);
/*  59:    */     
/*  60: 67 */     b(parambsu, paramInt1, paramInt2);
/*  61:    */     
/*  62: 69 */     int i2 = 14737632;
/*  63: 70 */     if (!this.l) {
/*  64: 71 */       i2 = 10526880;
/*  65: 72 */     } else if (this.n) {
/*  66: 73 */       i2 = 16777120;
/*  67:    */     }
/*  68: 75 */     a(localbty, this.j, this.h + this.f / 2, this.i + (this.g - 8) / 2, i2);
/*  69:    */   }
/*  70:    */   
/*  71:    */   protected void b(bsu parambsu, int paramInt1, int paramInt2) {}
/*  72:    */   
/*  73:    */   public void a(int paramInt1, int paramInt2) {}
/*  74:    */   
/*  75:    */   public boolean c(bsu parambsu, int paramInt1, int paramInt2)
/*  76:    */   {
/*  77: 85 */     return (this.l) && (this.m) && (paramInt1 >= this.h) && (paramInt2 >= this.i) && (paramInt1 < this.h + this.f) && (paramInt2 < this.i + this.g);
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean a()
/*  81:    */   {
/*  82: 89 */     return this.n;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void b(int paramInt1, int paramInt2) {}
/*  86:    */   
/*  87:    */   public void a(czh paramczh)
/*  88:    */   {
/*  89: 96 */     paramczh.a(cxy.a(new oa("gui.button.press"), 1.0F));
/*  90:    */   }
/*  91:    */   
/*  92:    */   public int b()
/*  93:    */   {
/*  94:100 */     return this.f;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void a(int paramInt)
/*  98:    */   {
/*  99:104 */     this.f = paramInt;
/* 100:    */   }
/* 101:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bug
 * JD-Core Version:    0.7.0.1
 */