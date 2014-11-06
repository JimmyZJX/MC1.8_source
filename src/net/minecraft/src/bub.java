package net.minecraft.src;
/*   1:    */ public class bub
/*   2:    */ {
/*   3: 12 */   public static final oa b = new oa("textures/gui/options_background.png");
/*   4: 13 */   public static final oa c = new oa("textures/gui/container/stats_icons.png");
/*   5: 14 */   public static final oa d = new oa("textures/gui/icons.png");
/*   6:    */   protected float e;
/*   7:    */   
/*   8:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*   9:    */   {
/*  10: 18 */     if (paramInt2 < paramInt1)
/*  11:    */     {
/*  12: 19 */       int i = paramInt1;
/*  13: 20 */       paramInt1 = paramInt2;
/*  14: 21 */       paramInt2 = i;
/*  15:    */     }
/*  16: 23 */     a(paramInt1, paramInt3, paramInt2 + 1, paramInt3 + 1, paramInt4);
/*  17:    */   }
/*  18:    */   
/*  19:    */   protected void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  20:    */   {
/*  21: 27 */     if (paramInt3 < paramInt2)
/*  22:    */     {
/*  23: 28 */       int i = paramInt2;
/*  24: 29 */       paramInt2 = paramInt3;
/*  25: 30 */       paramInt3 = i;
/*  26:    */     }
/*  27: 32 */     a(paramInt1, paramInt2 + 1, paramInt1 + 1, paramInt3, paramInt4);
/*  28:    */   }
/*  29:    */   
/*  30:    */   public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*  31:    */   {
/*  32:    */     int i;
/*  33: 36 */     if (paramInt1 < paramInt3)
/*  34:    */     {
/*  35: 37 */       i = paramInt1;
/*  36: 38 */       paramInt1 = paramInt3;
/*  37: 39 */       paramInt3 = i;
/*  38:    */     }
/*  39: 41 */     if (paramInt2 < paramInt4)
/*  40:    */     {
/*  41: 42 */       i = paramInt2;
/*  42: 43 */       paramInt2 = paramInt4;
/*  43: 44 */       paramInt4 = i;
/*  44:    */     }
/*  45: 46 */     float f1 = (paramInt5 >> 24 & 0xFF) / 255.0F;
/*  46: 47 */     float f2 = (paramInt5 >> 16 & 0xFF) / 255.0F;
/*  47: 48 */     float f3 = (paramInt5 >> 8 & 0xFF) / 255.0F;
/*  48: 49 */     float f4 = (paramInt5 & 0xFF) / 255.0F;
/*  49: 50 */     ckx localckx = ckx.getInstance();
/*  50: 51 */     VertexBuffer localciv = localckx.getBuffer();
/*  51: 52 */     cjm.enableBlend();
/*  52: 53 */     cjm.x();
/*  53: 54 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/*  54: 55 */     cjm.c(f2, f3, f4, f1);
/*  55: 56 */     localciv.begin();
/*  56: 57 */     localciv.addVertex(paramInt1, paramInt4, 0.0D);
/*  57: 58 */     localciv.addVertex(paramInt3, paramInt4, 0.0D);
/*  58: 59 */     localciv.addVertex(paramInt3, paramInt2, 0.0D);
/*  59: 60 */     localciv.addVertex(paramInt1, paramInt2, 0.0D);
/*  60: 61 */     localckx.draw();
/*  61: 62 */     cjm.w();
/*  62: 63 */     cjm.disableBlend();
/*  63:    */   }
/*  64:    */   
/*  65:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  66:    */   {
/*  67: 67 */     float f1 = (paramInt5 >> 24 & 0xFF) / 255.0F;
/*  68: 68 */     float f2 = (paramInt5 >> 16 & 0xFF) / 255.0F;
/*  69: 69 */     float f3 = (paramInt5 >> 8 & 0xFF) / 255.0F;
/*  70: 70 */     float f4 = (paramInt5 & 0xFF) / 255.0F;
/*  71:    */     
/*  72: 72 */     float f5 = (paramInt6 >> 24 & 0xFF) / 255.0F;
/*  73: 73 */     float f6 = (paramInt6 >> 16 & 0xFF) / 255.0F;
/*  74: 74 */     float f7 = (paramInt6 >> 8 & 0xFF) / 255.0F;
/*  75: 75 */     float f8 = (paramInt6 & 0xFF) / 255.0F;
/*  76: 76 */     cjm.x();
/*  77: 77 */     cjm.enableBlend();
/*  78: 78 */     cjm.disableAlphaTest();
/*  79: 79 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/*  80: 80 */     cjm.j(7425);
/*  81:    */     
/*  82: 82 */     ckx localckx = ckx.getInstance();
/*  83: 83 */     VertexBuffer localciv = localckx.getBuffer();
/*  84: 84 */     localciv.begin();
/*  85: 85 */     localciv.setColor(f2, f3, f4, f1);
/*  86: 86 */     localciv.setColor(paramInt3, paramInt2, this.e);
/*  87: 87 */     localciv.setColor(paramInt1, paramInt2, this.e);
/*  88: 88 */     localciv.setColor(f6, f7, f8, f5);
/*  89: 89 */     localciv.setColor(paramInt1, paramInt4, this.e);
/*  90: 90 */     localciv.setColor(paramInt3, paramInt4, this.e);
/*  91: 91 */     localckx.draw();
/*  92:    */     
/*  93: 93 */     cjm.j(7424);
/*  94: 94 */     cjm.disableBlend();
/*  95: 95 */     cjm.enableAlphaTest();
/*  96: 96 */     cjm.w();
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void a(bty parambty, String paramString, int paramInt1, int paramInt2, int paramInt3)
/* 100:    */   {
/* 101:100 */     parambty.a(paramString, paramInt1 - parambty.a(paramString) / 2, paramInt2, paramInt3);
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void c(bty parambty, String paramString, int paramInt1, int paramInt2, int paramInt3)
/* 105:    */   {
/* 106:108 */     parambty.a(paramString, paramInt1, paramInt2, paramInt3);
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 110:    */   {
/* 111:112 */     float f1 = 0.0039063F;
/* 112:113 */     float f2 = 0.0039063F;
/* 113:114 */     ckx localckx = ckx.getInstance();
/* 114:115 */     VertexBuffer localciv = localckx.getBuffer();
/* 115:116 */     localciv.begin();
/* 116:117 */     localciv.addVertexWithUV(paramInt1 + 0, paramInt2 + paramInt6, this.e, (paramInt3 + 0) * f1, (paramInt4 + paramInt6) * f2);
/* 117:118 */     localciv.addVertexWithUV(paramInt1 + paramInt5, paramInt2 + paramInt6, this.e, (paramInt3 + paramInt5) * f1, (paramInt4 + paramInt6) * f2);
/* 118:119 */     localciv.addVertexWithUV(paramInt1 + paramInt5, paramInt2 + 0, this.e, (paramInt3 + paramInt5) * f1, (paramInt4 + 0) * f2);
/* 119:120 */     localciv.addVertexWithUV(paramInt1 + 0, paramInt2 + 0, this.e, (paramInt3 + 0) * f1, (paramInt4 + 0) * f2);
/* 120:121 */     localckx.draw();
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 124:    */   {
/* 125:125 */     float f1 = 0.0039063F;
/* 126:126 */     float f2 = 0.0039063F;
/* 127:127 */     ckx localckx = ckx.getInstance();
/* 128:128 */     VertexBuffer localciv = localckx.getBuffer();
/* 129:129 */     localciv.begin();
/* 130:130 */     localciv.addVertexWithUV(paramFloat1 + 0.0F, paramFloat2 + paramInt4, this.e, (paramInt1 + 0) * f1, (paramInt2 + paramInt4) * f2);
/* 131:131 */     localciv.addVertexWithUV(paramFloat1 + paramInt3, paramFloat2 + paramInt4, this.e, (paramInt1 + paramInt3) * f1, (paramInt2 + paramInt4) * f2);
/* 132:132 */     localciv.addVertexWithUV(paramFloat1 + paramInt3, paramFloat2 + 0.0F, this.e, (paramInt1 + paramInt3) * f1, (paramInt2 + 0) * f2);
/* 133:133 */     localciv.addVertexWithUV(paramFloat1 + 0.0F, paramFloat2 + 0.0F, this.e, (paramInt1 + 0) * f1, (paramInt2 + 0) * f2);
/* 134:134 */     localckx.draw();
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void a(int paramInt1, int paramInt2, cue paramcue, int paramInt3, int paramInt4)
/* 138:    */   {
/* 139:138 */     ckx localckx = ckx.getInstance();
/* 140:139 */     VertexBuffer localciv = localckx.getBuffer();
/* 141:140 */     localciv.begin();
/* 142:141 */     localciv.addVertexWithUV(paramInt1 + 0, paramInt2 + paramInt4, this.e, paramcue.e(), paramcue.h());
/* 143:142 */     localciv.addVertexWithUV(paramInt1 + paramInt3, paramInt2 + paramInt4, this.e, paramcue.f(), paramcue.h());
/* 144:143 */     localciv.addVertexWithUV(paramInt1 + paramInt3, paramInt2 + 0, this.e, paramcue.f(), paramcue.g());
/* 145:144 */     localciv.addVertexWithUV(paramInt1 + 0, paramInt2 + 0, this.e, paramcue.e(), paramcue.g());
/* 146:145 */     localckx.draw();
/* 147:    */   }
/* 148:    */   
/* 149:    */   public static void a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, float paramFloat3, float paramFloat4)
/* 150:    */   {
/* 151:149 */     float f1 = 1.0F / paramFloat3;
/* 152:150 */     float f2 = 1.0F / paramFloat4;
/* 153:151 */     ckx localckx = ckx.getInstance();
/* 154:152 */     VertexBuffer localciv = localckx.getBuffer();
/* 155:153 */     localciv.begin();
/* 156:154 */     localciv.addVertexWithUV(paramInt1, paramInt2 + paramInt4, 0.0D, paramFloat1 * f1, (paramFloat2 + paramInt4) * f2);
/* 157:155 */     localciv.addVertexWithUV(paramInt1 + paramInt3, paramInt2 + paramInt4, 0.0D, (paramFloat1 + paramInt3) * f1, (paramFloat2 + paramInt4) * f2);
/* 158:156 */     localciv.addVertexWithUV(paramInt1 + paramInt3, paramInt2, 0.0D, (paramFloat1 + paramInt3) * f1, paramFloat2 * f2);
/* 159:157 */     localciv.addVertexWithUV(paramInt1, paramInt2, 0.0D, paramFloat1 * f1, paramFloat2 * f2);
/* 160:158 */     localckx.draw();
/* 161:    */   }
/* 162:    */   
/* 163:    */   public static void a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat3, float paramFloat4)
/* 164:    */   {
/* 165:162 */     float f1 = 1.0F / paramFloat3;
/* 166:163 */     float f2 = 1.0F / paramFloat4;
/* 167:164 */     ckx localckx = ckx.getInstance();
/* 168:165 */     VertexBuffer localciv = localckx.getBuffer();
/* 169:166 */     localciv.begin();
/* 170:167 */     localciv.addVertexWithUV(paramInt1, paramInt2 + paramInt6, 0.0D, paramFloat1 * f1, (paramFloat2 + paramInt4) * f2);
/* 171:168 */     localciv.addVertexWithUV(paramInt1 + paramInt5, paramInt2 + paramInt6, 0.0D, (paramFloat1 + paramInt3) * f1, (paramFloat2 + paramInt4) * f2);
/* 172:169 */     localciv.addVertexWithUV(paramInt1 + paramInt5, paramInt2, 0.0D, (paramFloat1 + paramInt3) * f1, paramFloat2 * f2);
/* 173:170 */     localciv.addVertexWithUV(paramInt1, paramInt2, 0.0D, paramFloat1 * f1, paramFloat2 * f2);
/* 174:171 */     localckx.draw();
/* 175:    */   }
/* 176:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bub
 * JD-Core Version:    0.7.0.1
 */