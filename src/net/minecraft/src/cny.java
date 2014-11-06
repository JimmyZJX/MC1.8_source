package net.minecraft.src;
/*   1:    */ import java.nio.FloatBuffer;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class cny
/*   5:    */   extends cnp<bdn>
/*   6:    */ {
/*   7: 18 */   private static final oa d = new oa("textures/environment/end_sky.png");
/*   8: 19 */   private static final oa e = new oa("textures/entity/end_portal.png");
/*   9: 21 */   private static final Random f = new Random(31100L);
/*  10:    */   
/*  11:    */   public void a(bdn parambdn, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, int paramInt)
/*  12:    */   {
/*  13: 25 */     float f1 = (float)this.b.j;
/*  14: 26 */     float f2 = (float)this.b.k;
/*  15: 27 */     float f3 = (float)this.b.l;
/*  16:    */     
/*  17: 29 */     cjm.disableLighting();
/*  18:    */     
/*  19: 31 */     f.setSeed(31100L);
/*  20:    */     
/*  21: 33 */     float f4 = 0.75F;
/*  22: 34 */     for (int i = 0; i < 16; i++)
/*  23:    */     {
/*  24: 35 */       cjm.glPushMatrix();
/*  25:    */       
/*  26: 37 */       float f5 = 16 - i;
/*  27: 38 */       float f6 = 0.0625F;
/*  28:    */       
/*  29: 40 */       float f7 = 1.0F / (f5 + 1.0F);
/*  30: 41 */       if (i == 0)
/*  31:    */       {
/*  32: 42 */         a(d);
/*  33: 43 */         f7 = 0.1F;
/*  34: 44 */         f5 = 65.0F;
/*  35: 45 */         f6 = 0.125F;
/*  36: 46 */         cjm.enableBlend();
/*  37: 47 */         cjm.glBlendFunc(770, 771);
/*  38:    */       }
/*  39: 50 */       if (i >= 1) {
/*  40: 51 */         a(e);
/*  41:    */       }
/*  42: 53 */       if (i == 1)
/*  43:    */       {
/*  44: 54 */         cjm.enableBlend();
/*  45: 55 */         cjm.glBlendFunc(1, 1);
/*  46: 56 */         f6 = 0.5F;
/*  47:    */       }
/*  48: 59 */       float f8 = (float)-(paramDouble2 + f4);
/*  49:    */       
/*  50: 61 */       float f9 = f8 + (float)bsp.a().y;
/*  51: 62 */       float f10 = f8 + f5 + (float)bsp.a().y;
/*  52: 63 */       float f11 = f9 / f10;
/*  53: 64 */       f11 = (float)(paramDouble2 + f4) + f11;
/*  54:    */       
/*  55: 66 */       cjm.glTranslatef(f1, f11, f3);
/*  56:    */       
/*  57: 68 */       cjm.a(ckc.a, 9217);
/*  58: 69 */       cjm.a(ckc.b, 9217);
/*  59: 70 */       cjm.a(ckc.c, 9217);
/*  60: 71 */       cjm.a(ckc.d, 9216);
/*  61: 72 */       cjm.a(ckc.a, 9473, a(1.0F, 0.0F, 0.0F, 0.0F));
/*  62: 73 */       cjm.a(ckc.b, 9473, a(0.0F, 0.0F, 1.0F, 0.0F));
/*  63: 74 */       cjm.a(ckc.c, 9473, a(0.0F, 0.0F, 0.0F, 1.0F));
/*  64: 75 */       cjm.a(ckc.d, 9474, a(0.0F, 1.0F, 0.0F, 0.0F));
/*  65: 76 */       cjm.a(ckc.a);
/*  66: 77 */       cjm.a(ckc.b);
/*  67: 78 */       cjm.a(ckc.c);
/*  68: 79 */       cjm.a(ckc.d);
/*  69:    */       
/*  70: 81 */       cjm.glPopMatrix();
/*  71: 82 */       cjm.glMatrixMode(5890);
/*  72:    */       
/*  73: 84 */       cjm.glPushMatrix();
/*  74: 85 */       cjm.glLoadIdentity();
/*  75:    */       
/*  76: 87 */       cjm.glTranslatef(0.0F, (float)(bsu.I() % 700000L) / 700000.0F, 0.0F);
/*  77: 88 */       cjm.glScalef(f6, f6, f6);
/*  78: 89 */       cjm.glTranslatef(0.5F, 0.5F, 0.0F);
/*  79: 90 */       cjm.glRotatef((i * i * 4321 + i * 9) * 2.0F, 0.0F, 0.0F, 1.0F);
/*  80: 91 */       cjm.glTranslatef(-0.5F, -0.5F, 0.0F);
/*  81: 92 */       cjm.glTranslatef(-f1, -f3, -f2);
/*  82: 93 */       f9 = f8 + (float)bsp.a().y;
/*  83: 94 */       cjm.glTranslatef((float)bsp.a().x * f5 / f9, (float)bsp.a().z * f5 / f9, -f2);
/*  84:    */       
/*  85: 96 */       ckx localckx = ckx.getInstance();
/*  86: 97 */       VertexBuffer localciv = localckx.getBuffer();
/*  87:    */       
/*  88: 99 */       localciv.begin();
/*  89:    */       
/*  90:101 */       float f12 = f.nextFloat() * 0.5F + 0.1F;
/*  91:102 */       float f13 = f.nextFloat() * 0.5F + 0.4F;
/*  92:103 */       float f14 = f.nextFloat() * 0.5F + 0.5F;
/*  93:104 */       if (i == 0) {
/*  94:105 */         f12 = f13 = f14 = 1.0F;
/*  95:    */       }
/*  96:107 */       localciv.setColor(f12 * f7, f13 * f7, f14 * f7, 1.0F);
/*  97:108 */       localciv.addVertex(paramDouble1, paramDouble2 + f4, paramDouble3);
/*  98:109 */       localciv.addVertex(paramDouble1, paramDouble2 + f4, paramDouble3 + 1.0D);
/*  99:110 */       localciv.addVertex(paramDouble1 + 1.0D, paramDouble2 + f4, paramDouble3 + 1.0D);
/* 100:111 */       localciv.addVertex(paramDouble1 + 1.0D, paramDouble2 + f4, paramDouble3);
/* 101:112 */       localckx.draw();
/* 102:    */       
/* 103:114 */       cjm.glPopMatrix();
/* 104:115 */       cjm.glMatrixMode(5888);
/* 105:    */     }
/* 106:117 */     cjm.disableBlend();
/* 107:    */     
/* 108:119 */     cjm.b(ckc.a);
/* 109:120 */     cjm.b(ckc.b);
/* 110:121 */     cjm.b(ckc.c);
/* 111:122 */     cjm.b(ckc.d);
/* 112:123 */     cjm.enableLighting();
/* 113:    */   }
/* 114:    */   
/* 115:126 */   FloatBuffer c = bst.h(16);
/* 116:    */   
/* 117:    */   private FloatBuffer a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 118:    */   {
/* 119:129 */     this.c.clear();
/* 120:130 */     this.c.put(paramFloat1).put(paramFloat2).put(paramFloat3).put(paramFloat4);
/* 121:131 */     this.c.flip();
/* 122:132 */     return this.c;
/* 123:    */   }
/* 124:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cny
 * JD-Core Version:    0.7.0.1
 */