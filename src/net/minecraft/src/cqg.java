package net.minecraft.src;
/*   1:    */ import org.lwjgl.opengl.GL11;
/*   2:    */ 
/*   3:    */ public class cqg
/*   4:    */   extends cpu<adk>
/*   5:    */ {
/*   6: 27 */   private static final oa a = new oa("textures/map/map_background.png");
/*   7: 28 */   private final bsu e = bsu.z();
/*   8: 29 */   private final cxl f = new cxl("item_frame", "normal");
/*   9: 30 */   private final cxl g = new cxl("item_frame", "map");
/*  10:    */   private cqh h;
/*  11:    */   
/*  12:    */   public cqg(cpt paramcpt, cqh paramcqh)
/*  13:    */   {
/*  14: 34 */     super(paramcpt);
/*  15: 35 */     this.h = paramcqh;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void a(adk paramadk, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  19:    */   {
/*  20: 40 */     cjm.glPushMatrix();
/*  21:    */     
/*  22: 42 */     BlockPosition localdt = paramadk.n();
/*  23: 43 */     double d1 = localdt.getX() - paramadk.xPos + paramDouble1;
/*  24: 44 */     double d2 = localdt.getY() - paramadk.yPos + paramDouble2;
/*  25: 45 */     double d3 = localdt.getZ() - paramadk.zPos + paramDouble3;
/*  26: 46 */     cjm.glTranslated(d1 + 0.5D, d2 + 0.5D, d3 + 0.5D);
/*  27: 47 */     cjm.glRotatef(180.0F - paramadk.yaw, 0.0F, 1.0F, 0.0F);
/*  28:    */     
/*  29: 49 */     this.b.a.a(cua.g);
/*  30: 50 */     cll localcll = this.e.ab();
/*  31: 51 */     cxk localcxk = localcll.a().b();
/*  32:    */     cxe localcxe;
/*  33: 53 */     if ((paramadk.getItem() != null) && (paramadk.getItem().getItem() == ItemList.filledMap)) {
/*  34: 54 */       localcxe = localcxk.a(this.g);
/*  35:    */     } else {
/*  36: 56 */       localcxe = localcxk.a(this.f);
/*  37:    */     }
/*  38: 59 */     cjm.glPushMatrix();
/*  39: 60 */     cjm.glTranslatef(-0.5F, -0.5F, -0.5F);
/*  40: 61 */     localcll.b().a(localcxe, 1.0F, 1.0F, 1.0F, 1.0F);
/*  41: 62 */     cjm.glPopMatrix();
/*  42:    */     
/*  43: 64 */     cjm.glTranslatef(0.0F, 0.0F, 0.4375F);
/*  44: 65 */     cqg_b(paramadk);
/*  45:    */     
/*  46: 67 */     cjm.glPopMatrix();
/*  47: 68 */     a(paramadk, paramDouble1 + paramadk.b.g() * 0.3F, paramDouble2 - 0.25D, paramDouble3 + paramadk.b.i() * 0.3F);
/*  48:    */   }
/*  49:    */   
/*  50:    */   protected oa a(adk paramadk)
/*  51:    */   {
/*  52: 74 */     return null;
/*  53:    */   }
/*  54:    */   
/*  55:    */   private void cqg_b(adk paramadk)
/*  56:    */   {
/*  57: 78 */     ItemStack localamj = paramadk.getItem();
/*  58: 79 */     if (localamj == null) {
/*  59: 80 */       return;
/*  60:    */     }
/*  61: 83 */     EntityItem localadw = new EntityItem(paramadk.world, 0.0D, 0.0D, 0.0D, localamj);
/*  62: 84 */     Item localalq = localadw.getItemStack().getItem();
/*  63: 85 */     localadw.getItemStack().stackSize = 1;
/*  64: 86 */     localadw.a = 0.0F;
/*  65:    */     
/*  66: 88 */     cjm.glPushMatrix();
/*  67: 89 */     cjm.disableLighting();
/*  68:    */     
/*  69: 91 */     int i = paramadk.p();
/*  70: 92 */     if (localalq == ItemList.filledMap) {
/*  71: 93 */       i = i % 4 * 2;
/*  72:    */     }
/*  73: 95 */     cjm.glRotatef(i * 360.0F / 8.0F, 0.0F, 0.0F, 1.0F);
/*  74:    */     Object localObject;
/*  75: 97 */     if (localalq == ItemList.filledMap)
/*  76:    */     {
/*  77: 98 */       this.b.a.a(a);
/*  78:    */       
/*  79:100 */       cjm.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/*  80:101 */       float f1 = 0.007813F;
/*  81:102 */       cjm.glScalef(f1, f1, f1);
/*  82:103 */       cjm.glTranslatef(-64.0F, -64.0F, 0.0F);
/*  83:    */       
/*  84:105 */       localObject = ItemList.filledMap.a(localadw.getItemStack(), paramadk.world);
/*  85:106 */       cjm.glTranslatef(0.0F, 0.0F, -1.0F);
/*  86:107 */       if (localObject != null) {
/*  87:108 */         this.e.o.k().a((bqe)localObject, true);
/*  88:    */       }
/*  89:    */     }
/*  90:    */     else
/*  91:    */     {
/*  92:112 */       cue localcue = null;
/*  93:113 */       if (localalq == ItemList.aQ)
/*  94:    */       {
/*  95:114 */         localcue = this.e.R().a(cun.l);
/*  96:115 */         this.e.N().a(cua.g);
/*  97:118 */         if ((localcue instanceof cun))
/*  98:    */         {
/*  99:119 */           localObject = (cun)localcue;
/* 100:    */           
/* 101:121 */           double d1 = ((cun)localObject).j;
/* 102:122 */           double d2 = ((cun)localObject).k;
/* 103:123 */           ((cun)localObject).j = 0.0D;
/* 104:124 */           ((cun)localObject).k = 0.0D;
/* 105:125 */           ((cun)localObject).a(paramadk.world, paramadk.xPos, paramadk.zPos, MathUtils.wrapDegrees(180 + paramadk.b.b() * 90), false, true);
/* 106:126 */           ((cun)localObject).j = d1;
/* 107:127 */           ((cun)localObject).k = d2;
/* 108:    */         }
/* 109:    */         else
/* 110:    */         {
/* 111:129 */           localcue = null;
/* 112:    */         }
/* 113:    */       }
/* 114:133 */       cjm.glScalef(0.5F, 0.5F, 0.5F);
/* 115:134 */       if ((!this.h.a(localadw.getItemStack())) || ((localalq instanceof anh))) {
/* 116:135 */         cjm.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/* 117:    */       }
/* 118:137 */       cjm.a();
/* 119:138 */       bss.b();
/* 120:139 */       this.h.b(localadw.getItemStack());
/* 121:140 */       bss.a();
/* 122:141 */       cjm.b();
/* 123:144 */       if ((localcue != null) && 
/* 124:145 */         (localcue.k() > 0)) {
/* 125:146 */         localcue.j();
/* 126:    */       }
/* 127:    */     }
/* 128:151 */     cjm.enableLighting();
/* 129:152 */     cjm.glPopMatrix();
/* 130:    */   }
/* 131:    */   
/* 132:    */   protected void a(adk paramadk, double paramDouble1, double paramDouble2, double paramDouble3)
/* 133:    */   {
/* 134:157 */     if ((bsu.u()) && (paramadk.getItem() != null) && (paramadk.getItem().s()) && (this.b.d == paramadk))
/* 135:    */     {
/* 136:158 */       float f1 = 1.6F;
/* 137:159 */       float f2 = 0.01666667F * f1;
/* 138:160 */       double d = paramadk.h(this.b.c);
/* 139:    */       
/* 140:162 */       float f3 = paramadk.aw() ? 32.0F : 64.0F;
/* 141:164 */       if (d < f3 * f3)
/* 142:    */       {
/* 143:165 */         String str = paramadk.getItem().q();
/* 144:167 */         if (paramadk.aw())
/* 145:    */         {
/* 146:168 */           bty localbty = c();
/* 147:169 */           cjm.glPushMatrix();
/* 148:170 */           cjm.glTranslatef((float)paramDouble1 + 0.0F, (float)paramDouble2 + paramadk.K + 0.5F, (float)paramDouble3);
/* 149:171 */           GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/* 150:    */           
/* 151:173 */           cjm.glRotatef(-this.b.e, 0.0F, 1.0F, 0.0F);
/* 152:174 */           cjm.glRotatef(this.b.f, 1.0F, 0.0F, 0.0F);
/* 153:    */           
/* 154:176 */           cjm.glScalef(-f2, -f2, f2);
/* 155:177 */           cjm.disableLighting();
/* 156:    */           
/* 157:179 */           cjm.glTranslatef(0.0F, 0.25F / f2, 0.0F);
/* 158:180 */           cjm.a(false);
/* 159:181 */           cjm.enableBlend();
/* 160:182 */           cjm.glBlendFunc(770, 771);
/* 161:    */           
/* 162:184 */           ckx localckx = ckx.getInstance();
/* 163:185 */           VertexBuffer localciv = localckx.getBuffer();
/* 164:    */           
/* 165:187 */           cjm.x();
/* 166:188 */           localciv.begin();
/* 167:189 */           int i = localbty.a(str) / 2;
/* 168:190 */           localciv.setColor(0.0F, 0.0F, 0.0F, 0.25F);
/* 169:191 */           localciv.addVertex(-i - 1, -1.0D, 0.0D);
/* 170:192 */           localciv.addVertex(-i - 1, 8.0D, 0.0D);
/* 171:193 */           localciv.addVertex(i + 1, 8.0D, 0.0D);
/* 172:194 */           localciv.addVertex(i + 1, -1.0D, 0.0D);
/* 173:195 */           localckx.draw();
/* 174:196 */           cjm.w();
/* 175:197 */           cjm.a(true);
/* 176:198 */           localbty.a(str, -localbty.a(str) / 2, 0, 553648127);
/* 177:199 */           cjm.enableLighting();
/* 178:200 */           cjm.disableBlend();
/* 179:201 */           cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 180:202 */           cjm.glPopMatrix();
/* 181:    */         }
/* 182:    */         else
/* 183:    */         {
/* 184:204 */           a(paramadk, str, paramDouble1, paramDouble2, paramDouble3, 64);
/* 185:    */         }
/* 186:    */       }
/* 187:    */     }
/* 188:    */   }
/* 189:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqg
 * JD-Core Version:    0.7.0.1
 */