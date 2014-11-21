package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import org.lwjgl.opengl.GL11;
/*   3:    */ 
/*   4:    */ public class cnn
/*   5:    */   extends cnp<bck>
/*   6:    */ {
/*   7: 16 */   private static final oa c = new oa("textures/entity/beacon_beam.png");
/*   8:    */   
/*   9:    */   public void a(bck parambck, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, int paramInt)
/*  10:    */   {
/*  11: 20 */     float f1 = parambck.o();
/*  12:    */     
/*  13: 22 */     cjm.glAlphaFunc(516, 0.1F);
/*  14: 23 */     if (f1 > 0.0F)
/*  15:    */     {
/*  16: 24 */       ckx localckx = ckx.getInstance();
/*  17: 25 */       VertexBuffer localciv = localckx.getBuffer();
/*  18:    */       
/*  19: 27 */       List<bcl> localList = parambck.n();
/*  20: 28 */       int i = 0;
/*  21: 29 */       for (int j = 0; j < localList.size(); j++)
/*  22:    */       {
/*  23: 30 */         bcl localbcl = (bcl)localList.get(j);
/*  24: 31 */         int k = i + localbcl.c();
/*  25:    */         
/*  26: 33 */         a(c);
/*  27: 34 */         GL11.glTexParameterf(3553, 10242, 10497.0F);
/*  28: 35 */         GL11.glTexParameterf(3553, 10243, 10497.0F);
/*  29: 36 */         cjm.disableLighting();
/*  30: 37 */         cjm.p();
/*  31: 38 */         cjm.disableBlend();
/*  32: 39 */         cjm.a(true);
/*  33: 40 */         cjm.glBlendFuncSeparate(770, 1, 1, 0);
/*  34:    */         
/*  35: 42 */         float f2 = (float)parambck.getWorld().K() + paramFloat;
/*  36: 43 */         float f3 = -f2 * 0.2F - MathUtils.floor(-f2 * 0.1F);
/*  37:    */         
/*  38:    */ 
/*  39: 46 */         double d1 = f2 * 0.025D * -1.5D;
/*  40:    */         
/*  41: 48 */         localciv.begin();
/*  42:    */         
/*  43: 50 */         double d2 = 0.2D;
/*  44:    */         
/*  45: 52 */         double d3 = 0.5D + Math.cos(d1 + 2.356194490192345D) * d2;
/*  46: 53 */         double d4 = 0.5D + Math.sin(d1 + 2.356194490192345D) * d2;
/*  47: 54 */         double d5 = 0.5D + Math.cos(d1 + 0.7853981633974483D) * d2;
/*  48: 55 */         double d6 = 0.5D + Math.sin(d1 + 0.7853981633974483D) * d2;
/*  49:    */         
/*  50: 57 */         double d7 = 0.5D + Math.cos(d1 + 3.926990816987241D) * d2;
/*  51: 58 */         double d8 = 0.5D + Math.sin(d1 + 3.926990816987241D) * d2;
/*  52: 59 */         double d9 = 0.5D + Math.cos(d1 + 5.497787143782138D) * d2;
/*  53: 60 */         double d10 = 0.5D + Math.sin(d1 + 5.497787143782138D) * d2;
/*  54:    */         
/*  55: 62 */         double d11 = 0.0D;
/*  56: 63 */         double d12 = 1.0D;
/*  57: 64 */         double d13 = -1.0F + f3;
/*  58: 65 */         double d14 = localbcl.c() * f1 * (0.5D / d2) + d13;
/*  59:    */         
/*  60: 67 */         localciv.setColor(localbcl.b()[0], localbcl.b()[1], localbcl.b()[2], 0.125F);
/*  61: 68 */         localciv.addVertexWithUV(paramDouble1 + d3, paramDouble2 + k, paramDouble3 + d4, d12, d14);
/*  62: 69 */         localciv.addVertexWithUV(paramDouble1 + d3, paramDouble2 + i, paramDouble3 + d4, d12, d13);
/*  63: 70 */         localciv.addVertexWithUV(paramDouble1 + d5, paramDouble2 + i, paramDouble3 + d6, d11, d13);
/*  64: 71 */         localciv.addVertexWithUV(paramDouble1 + d5, paramDouble2 + k, paramDouble3 + d6, d11, d14);
/*  65:    */         
/*  66: 73 */         localciv.addVertexWithUV(paramDouble1 + d9, paramDouble2 + k, paramDouble3 + d10, d12, d14);
/*  67: 74 */         localciv.addVertexWithUV(paramDouble1 + d9, paramDouble2 + i, paramDouble3 + d10, d12, d13);
/*  68: 75 */         localciv.addVertexWithUV(paramDouble1 + d7, paramDouble2 + i, paramDouble3 + d8, d11, d13);
/*  69: 76 */         localciv.addVertexWithUV(paramDouble1 + d7, paramDouble2 + k, paramDouble3 + d8, d11, d14);
/*  70:    */         
/*  71: 78 */         localciv.addVertexWithUV(paramDouble1 + d5, paramDouble2 + k, paramDouble3 + d6, d12, d14);
/*  72: 79 */         localciv.addVertexWithUV(paramDouble1 + d5, paramDouble2 + i, paramDouble3 + d6, d12, d13);
/*  73: 80 */         localciv.addVertexWithUV(paramDouble1 + d9, paramDouble2 + i, paramDouble3 + d10, d11, d13);
/*  74: 81 */         localciv.addVertexWithUV(paramDouble1 + d9, paramDouble2 + k, paramDouble3 + d10, d11, d14);
/*  75:    */         
/*  76: 83 */         localciv.addVertexWithUV(paramDouble1 + d7, paramDouble2 + k, paramDouble3 + d8, d12, d14);
/*  77: 84 */         localciv.addVertexWithUV(paramDouble1 + d7, paramDouble2 + i, paramDouble3 + d8, d12, d13);
/*  78: 85 */         localciv.addVertexWithUV(paramDouble1 + d3, paramDouble2 + i, paramDouble3 + d4, d11, d13);
/*  79: 86 */         localciv.addVertexWithUV(paramDouble1 + d3, paramDouble2 + k, paramDouble3 + d4, d11, d14);
/*  80:    */         
/*  81: 88 */         localckx.draw();
/*  82:    */         
/*  83:    */ 
/*  84: 91 */         cjm.enableBlend();
/*  85: 92 */         cjm.glBlendFuncSeparate(770, 771, 1, 0);
/*  86: 93 */         cjm.a(false);
/*  87:    */         
/*  88:    */ 
/*  89: 96 */         localciv.begin();
/*  90: 97 */         localciv.setColor(localbcl.b()[0], localbcl.b()[1], localbcl.b()[2], 0.125F);
/*  91:    */         
/*  92: 99 */         d1 = 0.2D;
/*  93:100 */         d2 = 0.2D;
/*  94:101 */         d3 = 0.8D;
/*  95:102 */         d4 = 0.2D;
/*  96:    */         
/*  97:104 */         d5 = 0.2D;
/*  98:105 */         d6 = 0.8D;
/*  99:106 */         d7 = 0.8D;
/* 100:107 */         d8 = 0.8D;
/* 101:    */         
/* 102:109 */         d9 = 0.0D;
/* 103:110 */         d10 = 1.0D;
/* 104:111 */         d11 = -1.0F + f3;
/* 105:112 */         d12 = localbcl.c() * f1 + d11;
/* 106:    */         
/* 107:114 */         localciv.addVertexWithUV(paramDouble1 + d1, paramDouble2 + k, paramDouble3 + d2, d10, d12);
/* 108:115 */         localciv.addVertexWithUV(paramDouble1 + d1, paramDouble2 + i, paramDouble3 + d2, d10, d11);
/* 109:116 */         localciv.addVertexWithUV(paramDouble1 + d3, paramDouble2 + i, paramDouble3 + d4, d9, d11);
/* 110:117 */         localciv.addVertexWithUV(paramDouble1 + d3, paramDouble2 + k, paramDouble3 + d4, d9, d12);
/* 111:    */         
/* 112:119 */         localciv.addVertexWithUV(paramDouble1 + d7, paramDouble2 + k, paramDouble3 + d8, d10, d12);
/* 113:120 */         localciv.addVertexWithUV(paramDouble1 + d7, paramDouble2 + i, paramDouble3 + d8, d10, d11);
/* 114:121 */         localciv.addVertexWithUV(paramDouble1 + d5, paramDouble2 + i, paramDouble3 + d6, d9, d11);
/* 115:122 */         localciv.addVertexWithUV(paramDouble1 + d5, paramDouble2 + k, paramDouble3 + d6, d9, d12);
/* 116:    */         
/* 117:124 */         localciv.addVertexWithUV(paramDouble1 + d3, paramDouble2 + k, paramDouble3 + d4, d10, d12);
/* 118:125 */         localciv.addVertexWithUV(paramDouble1 + d3, paramDouble2 + i, paramDouble3 + d4, d10, d11);
/* 119:126 */         localciv.addVertexWithUV(paramDouble1 + d7, paramDouble2 + i, paramDouble3 + d8, d9, d11);
/* 120:127 */         localciv.addVertexWithUV(paramDouble1 + d7, paramDouble2 + k, paramDouble3 + d8, d9, d12);
/* 121:    */         
/* 122:129 */         localciv.addVertexWithUV(paramDouble1 + d5, paramDouble2 + k, paramDouble3 + d6, d10, d12);
/* 123:130 */         localciv.addVertexWithUV(paramDouble1 + d5, paramDouble2 + i, paramDouble3 + d6, d10, d11);
/* 124:131 */         localciv.addVertexWithUV(paramDouble1 + d1, paramDouble2 + i, paramDouble3 + d2, d9, d11);
/* 125:132 */         localciv.addVertexWithUV(paramDouble1 + d1, paramDouble2 + k, paramDouble3 + d2, d9, d12);
/* 126:    */         
/* 127:134 */         localckx.draw();
/* 128:    */         
/* 129:    */ 
/* 130:137 */         cjm.enableLighting();
/* 131:138 */         cjm.w();
/* 132:    */         
/* 133:140 */         cjm.a(true);
/* 134:    */         
/* 135:142 */         i = k;
/* 136:    */       }
/* 137:    */     }
/* 138:    */   }
/* 139:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cnn
 * JD-Core Version:    0.7.0.1
 */