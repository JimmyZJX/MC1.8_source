package net.minecraft.src;
/*   2:    */ 
/*   3:    */ class MapRenderer
/*   4:    */ {
/*   5:    */   private final MapInfo b;
/*   6:    */   private final ctp c;
/*   7:    */   private final oa d;
/*   8:    */   private final int[] e;
				private final buc a;
/*   9:    */   
/*  10:    */   private MapRenderer(buc parambuc, MapInfo parambqe)
/*  11:    */   {
				  a=parambuc;
/*  12: 63 */     this.b = parambqe;
/*  13: 64 */     this.c = new ctp(128, 128);
/*  14: 65 */     this.e = this.c.e();
/*  15: 66 */     this.d = buc.a(parambuc).a("map/" + parambqe.a, this.c);
/*  16: 69 */     for (int i = 0; i < this.e.length; i++) {
/*  17: 70 */       this.e[i] = 0;
/*  18:    */     }
/*  19:    */   }
/*  20:    */   
/*  21:    */   private void a()
/*  22:    */   {
/*  23: 75 */     for (int i = 0; i < 16384; i++)
/*  24:    */     {
/*  25: 76 */       int j = this.b.content[i] & 0xFF;
/*  26: 77 */       if (j / 4 == 0) {
/*  27: 78 */         this.e[i] = ((i + i / 128 & 0x1) * 8 + 16 << 24);
/*  28:    */       } else {
/*  29: 80 */         this.e[i] = MapColor.a[(j / 4)].a(j & 0x3);
/*  30:    */       }
/*  31:    */     }
/*  32: 84 */     this.c.d();
/*  33:    */   }
/*  34:    */   
/*  35:    */   private void a(boolean paramBoolean)
/*  36:    */   {
/*  37: 88 */     int i = 0;
/*  38: 89 */     int j = 0;
/*  39: 90 */     ckx localckx = ckx.getInstance();
/*  40: 91 */     VertexBuffer localciv = localckx.getBuffer();
/*  41:    */     
/*  42: 93 */     float f1 = 0.0F;
/*  43:    */     
/*  44: 95 */     buc.a(this.a).a(this.d);
/*  45: 96 */     cjm.enableBlend();
/*  46: 97 */     cjm.glBlendFuncSeparate(1, 771, 0, 1);
/*  47: 98 */     cjm.disableAlphaTest();
/*  48: 99 */     localciv.begin();
/*  49:100 */     localciv.addVertexWithUV(i + 0 + f1, j + 128 - f1, -0.009999999776482582D, 0.0D, 1.0D);
/*  50:101 */     localciv.addVertexWithUV(i + 128 - f1, j + 128 - f1, -0.009999999776482582D, 1.0D, 1.0D);
/*  51:102 */     localciv.addVertexWithUV(i + 128 - f1, j + 0 + f1, -0.009999999776482582D, 1.0D, 0.0D);
/*  52:103 */     localciv.addVertexWithUV(i + 0 + f1, j + 0 + f1, -0.009999999776482582D, 0.0D, 0.0D);
/*  53:104 */     localckx.draw();
/*  54:105 */     cjm.enableAlphaTest();
/*  55:106 */     cjm.disableBlend();
/*  56:    */     
/*  57:108 */     buc.a(this.a).a(buc.b());
/*  58:109 */     int k = 0;
/*  59:110 */     for (MapIcon icon : this.b.icons.values()) {
/*  60:111 */       if ((!paramBoolean) || (icon.getType() == 1))
/*  61:    */       {
/*  62:114 */         cjm.glPushMatrix();
/*  63:115 */         cjm.glTranslatef(i + icon.getX() / 2.0F + 64.0F, j + icon.getY() / 2.0F + 64.0F, -0.02F);
/*  64:116 */         cjm.glRotatef(icon.getOrientation() * 360 / 16.0F, 0.0F, 0.0F, 1.0F);
/*  65:117 */         cjm.glScalef(4.0F, 4.0F, 3.0F);
/*  66:118 */         cjm.glTranslatef(-0.125F, 0.125F, 0.0F);
/*  67:    */         
/*  68:120 */         int m = icon.getType();
/*  69:121 */         float f2 = (m % 4 + 0) / 4.0F;
/*  70:122 */         float f3 = (m / 4 + 0) / 4.0F;
/*  71:123 */         float f4 = (m % 4 + 1) / 4.0F;
/*  72:124 */         float f5 = (m / 4 + 1) / 4.0F;
/*  73:    */         
/*  74:126 */         localciv.begin();
/*  75:127 */         localciv.addVertexWithUV(-1.0D, 1.0D, k * 0.001F, f2, f3);
/*  76:128 */         localciv.addVertexWithUV(1.0D, 1.0D, k * 0.001F, f4, f3);
/*  77:129 */         localciv.addVertexWithUV(1.0D, -1.0D, k * 0.001F, f4, f5);
/*  78:130 */         localciv.addVertexWithUV(-1.0D, -1.0D, k * 0.001F, f2, f5);
/*  79:131 */         localckx.draw();
/*  80:132 */         cjm.glPopMatrix();
/*  81:133 */         k++;
/*  82:    */       }
/*  83:    */     }
/*  84:136 */     cjm.glPushMatrix();
/*  85:137 */     cjm.glTranslatef(0.0F, 0.0F, -0.04F);
/*  86:138 */     cjm.glScalef(1.0F, 1.0F, 1.0F);
/*  87:139 */     cjm.glPopMatrix();
/*  88:    */   }
				static void a(MapRenderer arg0) {arg0.a();}
				static void a(MapRenderer arg0, boolean arg1) {arg0.a(arg1);}
				MapRenderer(buc arg0, MapInfo arg1, bud arg2) {this(arg0,arg1);}
				static oa b(MapRenderer arg0) {return arg0.d;}
/*  89:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bue
 * JD-Core Version:    0.7.0.1
 */