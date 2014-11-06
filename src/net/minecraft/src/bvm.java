package net.minecraft.src;
/*   1:    */ public class bvm
/*   2:    */ {
/*   3: 10 */   private static final oa a = new oa("textures/gui/stream_indicator.png");
/*   4:    */   private final bsu b;
/*   5: 22 */   private float c = 1.0F;
/*   6: 23 */   private int d = 1;
/*   7:    */   
/*   8:    */   public bvm(bsu parambsu)
/*   9:    */   {
/*  10: 26 */     this.b = parambsu;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public void a(int paramInt1, int paramInt2)
/*  14:    */   {
/*  15: 30 */     if (this.b.W().k())
/*  16:    */     {
/*  17: 31 */       cjm.enableBlend();
/*  18:    */       
/*  19:    */ 
/*  20: 34 */       int i = this.b.W().x();
/*  21: 35 */       if (i > 0)
/*  22:    */       {
/*  23: 36 */         String str = "" + i;
/*  24: 37 */         int j = this.b.k.a(str);
/*  25: 38 */         int k = 20;
/*  26:    */         
/*  27: 40 */         int m = paramInt1 - j - 1;
/*  28: 41 */         int n = paramInt2 + 20 - 1;
/*  29: 42 */         int i1 = paramInt1;
/*  30: 43 */         int i2 = paramInt2 + 20 + this.b.k.a - 1;
/*  31: 44 */         cjm.x();
/*  32: 45 */         ckx localckx = ckx.getInstance();
/*  33: 46 */         VertexBuffer localciv = localckx.getBuffer();
/*  34: 47 */         cjm.c(0.0F, 0.0F, 0.0F, (0.65F + 0.35F * this.c) / 2.0F);
/*  35: 48 */         localciv.begin();
/*  36: 49 */         localciv.addVertex(m, i2, 0.0D);
/*  37: 50 */         localciv.addVertex(i1, i2, 0.0D);
/*  38: 51 */         localciv.addVertex(i1, n, 0.0D);
/*  39: 52 */         localciv.addVertex(m, n, 0.0D);
/*  40: 53 */         localckx.draw();
/*  41: 54 */         cjm.w();
/*  42: 55 */         this.b.k.a(str, paramInt1 - j, paramInt2 + 20, 16777215);
/*  43:    */       }
/*  44: 59 */       a(paramInt1, paramInt2, b(), 0);
/*  45:    */       
/*  46:    */ 
/*  47: 62 */       a(paramInt1, paramInt2, c(), 17);
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  52:    */   {
/*  53: 67 */     cjm.c(1.0F, 1.0F, 1.0F, 0.65F + 0.35F * this.c);
/*  54: 68 */     this.b.N().a(a);
/*  55: 69 */     float f1 = 150.0F;
/*  56:    */     
/*  57: 71 */     float f2 = 0.0F;
/*  58: 72 */     float f3 = paramInt3 * 0.015625F;
/*  59: 73 */     float f4 = 1.0F;
/*  60: 74 */     float f5 = (paramInt3 + 16) * 0.015625F;
/*  61:    */     
/*  62: 76 */     ckx localckx = ckx.getInstance();
/*  63: 77 */     VertexBuffer localciv = localckx.getBuffer();
/*  64: 78 */     localciv.begin();
/*  65: 79 */     localciv.addVertexWithUV(paramInt1 - 16 - paramInt4, paramInt2 + 16, f1, f2, f5);
/*  66: 80 */     localciv.addVertexWithUV(paramInt1 - paramInt4, paramInt2 + 16, f1, f4, f5);
/*  67: 81 */     localciv.addVertexWithUV(paramInt1 - paramInt4, paramInt2 + 0, f1, f4, f3);
/*  68: 82 */     localciv.addVertexWithUV(paramInt1 - 16 - paramInt4, paramInt2 + 0, f1, f2, f3);
/*  69: 83 */     localckx.draw();
/*  70: 84 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  71:    */   }
/*  72:    */   
/*  73:    */   private int b()
/*  74:    */   {
/*  75: 88 */     return this.b.W().l() ? 16 : 0;
/*  76:    */   }
/*  77:    */   
/*  78:    */   private int c()
/*  79:    */   {
/*  80: 92 */     return this.b.W().D() ? 48 : 32;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void a()
/*  84:    */   {
/*  85: 96 */     if (this.b.W().k())
/*  86:    */     {
/*  87: 97 */       this.c += 0.025F * this.d;
/*  88: 99 */       if (this.c < 0.0F)
/*  89:    */       {
/*  90:100 */         this.d *= -1;
/*  91:101 */         this.c = 0.0F;
/*  92:    */       }
/*  93:102 */       else if (this.c > 1.0F)
/*  94:    */       {
/*  95:103 */         this.d *= -1;
/*  96:104 */         this.c = 1.0F;
/*  97:    */       }
/*  98:    */     }
/*  99:    */     else
/* 100:    */     {
/* 101:107 */       this.c = 1.0F;
/* 102:108 */       this.d = 1;
/* 103:    */     }
/* 104:    */   }
/* 105:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvm
 * JD-Core Version:    0.7.0.1
 */