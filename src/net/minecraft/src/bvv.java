package net.minecraft.src;
/*   1:    */ import net.minecraft.realms.RealmsSimpleScrolledSelectionList;
/*   2:    */ 
/*   3:    */ public class bvv
/*   4:    */   extends bvk
/*   5:    */ {
/*   6:    */   private final RealmsSimpleScrolledSelectionList u;
/*   7:    */   
/*   8:    */   public bvv(RealmsSimpleScrolledSelectionList paramRealmsSimpleScrolledSelectionList, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*   9:    */   {
/*  10: 17 */     super(bsu.z(), paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*  11: 18 */     this.u = paramRealmsSimpleScrolledSelectionList;
/*  12:    */   }
/*  13:    */   
/*  14:    */   protected int b()
/*  15:    */   {
/*  16: 23 */     return this.u.getItemCount();
/*  17:    */   }
/*  18:    */   
/*  19:    */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/*  20:    */   {
/*  21: 28 */     this.u.selectItem(paramInt1, paramBoolean, paramInt2, paramInt3);
/*  22:    */   }
/*  23:    */   
/*  24:    */   protected boolean a(int paramInt)
/*  25:    */   {
/*  26: 33 */     return this.u.isSelectedItem(paramInt);
/*  27:    */   }
/*  28:    */   
/*  29:    */   protected void a()
/*  30:    */   {
/*  31: 38 */     this.u.renderBackground();
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  35:    */   {
/*  36: 43 */     this.u.renderItem(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public int e()
/*  40:    */   {
/*  41: 47 */     return this.b;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public int f()
/*  45:    */   {
/*  46: 51 */     return this.j;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public int g()
/*  50:    */   {
/*  51: 55 */     return this.i;
/*  52:    */   }
/*  53:    */   
/*  54:    */   protected int k()
/*  55:    */   {
/*  56: 60 */     return this.u.getMaxPosition();
/*  57:    */   }
/*  58:    */   
/*  59:    */   protected int d()
/*  60:    */   {
/*  61: 65 */     return this.u.getScrollbarPosition();
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void p()
/*  65:    */   {
/*  66: 70 */     super.p();
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  70:    */   {
/*  71: 75 */     if (!this.q) {
/*  72: 76 */       return;
/*  73:    */     }
/*  74: 79 */     this.i = paramInt1;
/*  75: 80 */     this.j = paramInt2;
/*  76: 81 */     a();
/*  77:    */     
/*  78: 83 */     int i = d();
/*  79: 84 */     int j = i + 6;
/*  80:    */     
/*  81: 86 */     l();
/*  82:    */     
/*  83: 88 */     cjm.disableLighting();
/*  84: 89 */     cjm.n();
/*  85: 90 */     ckx localckx = ckx.getInstance();
/*  86: 91 */     VertexBuffer localciv = localckx.getBuffer();
/*  87:    */     
/*  88: 93 */     int k = this.g + (this.b / 2 - c() / 2 + 2);
/*  89: 94 */     int m = this.d + 4 - (int)this.n;
/*  90: 96 */     if (this.s) {
/*  91: 97 */       a(k, m, localckx);
/*  92:    */     }
/*  93:100 */     b(k, m, paramInt1, paramInt2);
/*  94:    */     
/*  95:102 */     cjm.i();
/*  96:    */     
/*  97:104 */     int n = 4;
/*  98:    */     
/*  99:106 */     c(0, this.d, 255, 255);
/* 100:107 */     c(this.e, this.c, 255, 255);
/* 101:    */     
/* 102:109 */     cjm.enableBlend();
/* 103:110 */     cjm.glBlendFuncSeparate(770, 771, 0, 1);
/* 104:111 */     cjm.disableAlphaTest();
/* 105:112 */     cjm.j(7425);
/* 106:    */     
/* 107:114 */     cjm.x();
/* 108:    */     
/* 109:116 */     int i1 = m();
/* 110:117 */     if (i1 > 0)
/* 111:    */     {
/* 112:118 */       int i2 = (this.e - this.d) * (this.e - this.d) / k();
/* 113:119 */       i2 = MathUtils.clamp(i2, 32, this.e - this.d - 8);
/* 114:    */       
/* 115:121 */       int i3 = (int)this.n * (this.e - this.d - i2) / i1 + this.d;
/* 116:122 */       if (i3 < this.d) {
/* 117:123 */         i3 = this.d;
/* 118:    */       }
/* 119:126 */       localciv.begin();
/* 120:127 */       localciv.setColor(0, 255);
/* 121:128 */       localciv.addVertexWithUV(i, this.e, 0.0D, 0.0D, 1.0D);
/* 122:129 */       localciv.addVertexWithUV(j, this.e, 0.0D, 1.0D, 1.0D);
/* 123:130 */       localciv.addVertexWithUV(j, this.d, 0.0D, 1.0D, 0.0D);
/* 124:131 */       localciv.addVertexWithUV(i, this.d, 0.0D, 0.0D, 0.0D);
/* 125:132 */       localckx.draw();
/* 126:    */       
/* 127:134 */       localciv.begin();
/* 128:135 */       localciv.setColor(8421504, 255);
/* 129:136 */       localciv.addVertexWithUV(i, i3 + i2, 0.0D, 0.0D, 1.0D);
/* 130:137 */       localciv.addVertexWithUV(j, i3 + i2, 0.0D, 1.0D, 1.0D);
/* 131:138 */       localciv.addVertexWithUV(j, i3, 0.0D, 1.0D, 0.0D);
/* 132:139 */       localciv.addVertexWithUV(i, i3, 0.0D, 0.0D, 0.0D);
/* 133:140 */       localckx.draw();
/* 134:    */       
/* 135:142 */       localciv.begin();
/* 136:143 */       localciv.setColor(12632256, 255);
/* 137:144 */       localciv.addVertexWithUV(i, i3 + i2 - 1, 0.0D, 0.0D, 1.0D);
/* 138:145 */       localciv.addVertexWithUV(j - 1, i3 + i2 - 1, 0.0D, 1.0D, 1.0D);
/* 139:146 */       localciv.addVertexWithUV(j - 1, i3, 0.0D, 1.0D, 0.0D);
/* 140:147 */       localciv.addVertexWithUV(i, i3, 0.0D, 0.0D, 0.0D);
/* 141:148 */       localckx.draw();
/* 142:    */     }
/* 143:151 */     b(paramInt1, paramInt2);
/* 144:    */     
/* 145:153 */     cjm.w();
/* 146:    */     
/* 147:155 */     cjm.j(7424);
/* 148:156 */     cjm.enableAlphaTest();
/* 149:157 */     cjm.disableBlend();
/* 150:    */   }
/* 151:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvv
 * JD-Core Version:    0.7.0.1
 */