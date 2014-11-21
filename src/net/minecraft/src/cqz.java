package net.minecraft.src;
/*   1:    */ public abstract class cqz<T extends EntityMob>
/*   2:    */   extends cqv<T>
/*   3:    */ {
/*   4:    */   public cqz(cpt paramcpt, ccq paramccq, float paramFloat)
/*   5:    */   {
/*   6: 17 */     super(paramcpt, paramccq, paramFloat);
/*   7:    */   }
/*   8:    */   
/*   9:    */   protected boolean b(T paramxn)
/*  10:    */   {
/*  11: 22 */     return (super.b(paramxn)) && ((paramxn.aN()) || ((paramxn.k_()) && (paramxn == this.b.d)));
/*  12:    */   }
/*  13:    */   
/*  14:    */   public boolean a(T paramxn, cox paramcox, double paramDouble1, double paramDouble2, double paramDouble3)
/*  15:    */   {
/*  16: 27 */     if (super.a(paramxn, paramcox, paramDouble1, paramDouble2, paramDouble3)) {
/*  17: 28 */       return true;
/*  18:    */     }
/*  19: 31 */     if ((paramxn.cb()) && (paramxn.cc() != null))
/*  20:    */     {
/*  21: 32 */       Entity localwv = paramxn.cc();
/*  22: 33 */       return paramcox.a(localwv.getAABB());
/*  23:    */     }
/*  24: 35 */     return false;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void a(T paramxn, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  28:    */   {
/*  29: 40 */     super.a(paramxn, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*  30:    */     
/*  31: 42 */     b(paramxn, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void cqz_a(T paramxn, float paramFloat)
/*  35:    */   {
/*  36: 46 */     int i = paramxn.b(paramFloat);
/*  37: 47 */     int j = i % 65536;
/*  38: 48 */     int k = i / 65536;
/*  39: 49 */     dax.glMultiTexCoord2f(dax.q, j / 1.0F, k / 1.0F);
/*  40:    */   }
/*  41:    */   
/*  42:    */   private double a(double paramDouble1, double paramDouble2, double paramDouble3)
/*  43:    */   {
/*  44: 53 */     return paramDouble1 + (paramDouble2 - paramDouble1) * paramDouble3;
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected void cqz_b(T paramxn, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  48:    */   {
/*  49: 57 */     Entity localwv = paramxn.cc();
/*  50: 58 */     if (localwv != null)
/*  51:    */     {
/*  52: 59 */       paramDouble2 -= (1.6D - paramxn.height) * 0.5D;
/*  53: 60 */       ckx localckx = ckx.getInstance();
/*  54: 61 */       VertexBuffer localciv = localckx.getBuffer();
/*  55: 62 */       double d1 = a(localwv.lastYaw, localwv.yaw, paramFloat2 * 0.5F) * 0.0174532923847437D;
/*  56: 63 */       double d2 = a(localwv.lastPitch, localwv.pitch, paramFloat2 * 0.5F) * 0.0174532923847437D;
/*  57: 64 */       double d3 = Math.cos(d1);
/*  58: 65 */       double d4 = Math.sin(d1);
/*  59: 66 */       double d5 = Math.sin(d2);
/*  60: 67 */       if ((localwv instanceof EntityFrame))
/*  61:    */       {
/*  62: 68 */         d3 = 0.0D;
/*  63: 69 */         d4 = 0.0D;
/*  64: 70 */         d5 = -1.0D;
/*  65:    */       }
/*  66: 72 */       double d6 = Math.cos(d2);
/*  67: 73 */       double d7 = a(localwv.lastX, localwv.xPos, paramFloat2) - d3 * 0.7D - d4 * 0.5D * d6;
/*  68: 74 */       double d8 = a(localwv.lastY + localwv.getEyeHeight() * 0.7D, localwv.yPos + localwv.getEyeHeight() * 0.7D, paramFloat2) - d5 * 0.5D - 0.25D;
/*  69: 75 */       double d9 = a(localwv.lastZ, localwv.zPos, paramFloat2) - d4 * 0.7D + d3 * 0.5D * d6;
/*  70:    */       
/*  71: 77 */       double d10 = a(paramxn.aH, paramxn.aG, paramFloat2) * 0.0174532923847437D + 1.570796326794897D;
/*  72: 78 */       d3 = Math.cos(d10) * paramxn.width * 0.4D;
/*  73: 79 */       d4 = Math.sin(d10) * paramxn.width * 0.4D;
/*  74: 80 */       double d11 = a(paramxn.lastX, paramxn.xPos, paramFloat2) + d3;
/*  75: 81 */       double d12 = a(paramxn.lastY, paramxn.yPos, paramFloat2);
/*  76: 82 */       double d13 = a(paramxn.lastZ, paramxn.zPos, paramFloat2) + d4;
/*  77: 83 */       paramDouble1 += d3;
/*  78: 84 */       paramDouble3 += d4;
/*  79:    */       
/*  80: 86 */       double d14 = (float)(d7 - d11);
/*  81: 87 */       double d15 = (float)(d8 - d12);
/*  82: 88 */       double d16 = (float)(d9 - d13);
/*  83:    */       
/*  84: 90 */       cjm.x();
/*  85: 91 */       cjm.disableLighting();
/*  86: 92 */       cjm.p();
/*  87:    */       
/*  88: 94 */       int i = 24;
/*  89: 95 */       double d17 = 0.025D;
/*  90: 96 */       localciv.a(5);
/*  91:    */       float f;
/*  92: 97 */       for (int j = 0; j <= 24; j++)
/*  93:    */       {
/*  94: 98 */         if (j % 2 == 0) {
/*  95: 99 */           localciv.setColor(0.5F, 0.4F, 0.3F, 1.0F);
/*  96:    */         } else {
/*  97:101 */           localciv.setColor(0.35F, 0.28F, 0.21F, 1.0F);
/*  98:    */         }
/*  99:103 */         f = j / 24.0F;
/* 100:104 */         localciv.addVertex(paramDouble1 + d14 * f + 0.0D, paramDouble2 + d15 * (f * f + f) * 0.5D + ((24.0F - j) / 18.0F + 0.125F), paramDouble3 + d16 * f);
/* 101:105 */         localciv.addVertex(paramDouble1 + d14 * f + 0.025D, paramDouble2 + d15 * (f * f + f) * 0.5D + ((24.0F - j) / 18.0F + 0.125F) + 0.025D, paramDouble3 + d16 * f);
/* 102:    */       }
/* 103:107 */       localckx.draw();
/* 104:    */       
/* 105:109 */       localciv.a(5);
/* 106:110 */       for (int j = 0; j <= 24; j++)
/* 107:    */       {
/* 108:111 */         if (j % 2 == 0) {
/* 109:112 */           localciv.setColor(0.5F, 0.4F, 0.3F, 1.0F);
/* 110:    */         } else {
/* 111:114 */           localciv.setColor(0.35F, 0.28F, 0.21F, 1.0F);
/* 112:    */         }
/* 113:116 */         f = j / 24.0F;
/* 114:117 */         localciv.addVertex(paramDouble1 + d14 * f + 0.0D, paramDouble2 + d15 * (f * f + f) * 0.5D + ((24.0F - j) / 18.0F + 0.125F) + 0.025D, paramDouble3 + d16 * f);
/* 115:118 */         localciv.addVertex(paramDouble1 + d14 * f + 0.025D, paramDouble2 + d15 * (f * f + f) * 0.5D + ((24.0F - j) / 18.0F + 0.125F), paramDouble3 + d16 * f + 0.025D);
/* 116:    */       }
/* 117:120 */       localckx.draw();
/* 118:    */       
/* 119:122 */       cjm.enableLighting();
/* 120:123 */       cjm.w();
/* 121:124 */       cjm.o();
/* 122:    */     }
/* 123:    */   }
/* 124:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqz
 * JD-Core Version:    0.7.0.1
 */