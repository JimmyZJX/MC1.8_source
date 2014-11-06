package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import org.lwjgl.opengl.GL11;
/*   4:    */ 
/*   5:    */ public class cdy
/*   6:    */ {
/*   7: 18 */   public float a = 64.0F;
/*   8: 19 */   public float b = 32.0F;
/*   9:    */   private int r;
/*  10:    */   private int s;
/*  11:    */   public float c;
/*  12:    */   public float d;
/*  13:    */   public float e;
/*  14:    */   public float f;
/*  15:    */   public float g;
/*  16:    */   public float h;
/*  17:    */   private boolean t;
/*  18:    */   private int u;
/*  19:    */   public boolean i;
/*  20: 30 */   public boolean j = true;
/*  21:    */   public boolean k;
/*  22: 33 */   public List l = Lists.newArrayList();
/*  23:    */   public List m;
/*  24:    */   public final String n;
/*  25:    */   private ccq v;
/*  26:    */   public float o;
/*  27:    */   public float p;
/*  28:    */   public float q;
/*  29:    */   
/*  30:    */   public cdy(ccq paramccq, String paramString)
/*  31:    */   {
/*  32: 41 */     this.v = paramccq;
/*  33: 42 */     paramccq.s.add(this);
/*  34: 43 */     this.n = paramString;
/*  35: 44 */     b(paramccq.t, paramccq.u);
/*  36:    */   }
/*  37:    */   
/*  38:    */   public cdy(ccq paramccq)
/*  39:    */   {
/*  40: 48 */     this(paramccq, null);
/*  41:    */   }
/*  42:    */   
/*  43:    */   public cdy(ccq paramccq, int paramInt1, int paramInt2)
/*  44:    */   {
/*  45: 52 */     this(paramccq);
/*  46: 53 */     a(paramInt1, paramInt2);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void a(cdy paramcdy)
/*  50:    */   {
/*  51: 57 */     if (this.m == null) {
/*  52: 58 */       this.m = Lists.newArrayList();
/*  53:    */     }
/*  54: 60 */     this.m.add(paramcdy);
/*  55:    */   }
/*  56:    */   
/*  57:    */   public cdy a(int paramInt1, int paramInt2)
/*  58:    */   {
/*  59: 69 */     this.r = paramInt1;
/*  60: 70 */     this.s = paramInt2;
/*  61: 71 */     return this;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public cdy a(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2, int paramInt3)
/*  65:    */   {
/*  66: 75 */     paramString = this.n + "." + paramString;
/*  67: 76 */     cdz localcdz = this.v.a(paramString);
/*  68: 77 */     a(localcdz.a, localcdz.b);
/*  69: 78 */     this.l.add(new cdt(this, this.r, this.s, paramFloat1, paramFloat2, paramFloat3, paramInt1, paramInt2, paramInt3, 0.0F).a(paramString));
/*  70: 79 */     return this;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public cdy a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2, int paramInt3)
/*  74:    */   {
/*  75: 83 */     this.l.add(new cdt(this, this.r, this.s, paramFloat1, paramFloat2, paramFloat3, paramInt1, paramInt2, paramInt3, 0.0F));
/*  76: 84 */     return this;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public cdy a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*  80:    */   {
/*  81: 88 */     this.l.add(new cdt(this, this.r, this.s, paramFloat1, paramFloat2, paramFloat3, paramInt1, paramInt2, paramInt3, 0.0F, paramBoolean));
/*  82: 89 */     return this;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2, int paramInt3, float paramFloat4)
/*  86:    */   {
/*  87: 93 */     this.l.add(new cdt(this, this.r, this.s, paramFloat1, paramFloat2, paramFloat3, paramInt1, paramInt2, paramInt3, paramFloat4));
/*  88:    */   }
/*  89:    */   
/*  90:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3)
/*  91:    */   {
/*  92:101 */     this.c = paramFloat1;
/*  93:102 */     this.d = paramFloat2;
/*  94:103 */     this.e = paramFloat3;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void a(float paramFloat)
/*  98:    */   {
/*  99:107 */     if (this.k) {
/* 100:108 */       return;
/* 101:    */     }
/* 102:110 */     if (!this.j) {
/* 103:111 */       return;
/* 104:    */     }
/* 105:113 */     if (!this.t) {
/* 106:114 */       d(paramFloat);
/* 107:    */     }
/* 108:117 */     cjm.glTranslatef(this.o, this.p, this.q);
/* 109:    */     int i1;
/* 110:119 */     if ((this.f != 0.0F) || (this.g != 0.0F) || (this.h != 0.0F))
/* 111:    */     {
/* 112:120 */       cjm.glPushMatrix();
/* 113:121 */       cjm.glTranslatef(this.c * paramFloat, this.d * paramFloat, this.e * paramFloat);
/* 114:122 */       if (this.h != 0.0F) {
/* 115:123 */         cjm.glRotatef(this.h * 57.295776F, 0.0F, 0.0F, 1.0F);
/* 116:    */       }
/* 117:125 */       if (this.g != 0.0F) {
/* 118:126 */         cjm.glRotatef(this.g * 57.295776F, 0.0F, 1.0F, 0.0F);
/* 119:    */       }
/* 120:128 */       if (this.f != 0.0F) {
/* 121:129 */         cjm.glRotatef(this.f * 57.295776F, 1.0F, 0.0F, 0.0F);
/* 122:    */       }
/* 123:131 */       cjm.o(this.u);
/* 124:132 */       if (this.m != null) {
/* 125:133 */         for (i1 = 0; i1 < this.m.size(); i1++) {
/* 126:134 */           ((cdy)this.m.get(i1)).a(paramFloat);
/* 127:    */         }
/* 128:    */       }
/* 129:137 */       cjm.glPopMatrix();
/* 130:    */     }
/* 131:138 */     else if ((this.c != 0.0F) || (this.d != 0.0F) || (this.e != 0.0F))
/* 132:    */     {
/* 133:139 */       cjm.glTranslatef(this.c * paramFloat, this.d * paramFloat, this.e * paramFloat);
/* 134:140 */       cjm.o(this.u);
/* 135:141 */       if (this.m != null) {
/* 136:142 */         for (i1 = 0; i1 < this.m.size(); i1++) {
/* 137:143 */           ((cdy)this.m.get(i1)).a(paramFloat);
/* 138:    */         }
/* 139:    */       }
/* 140:146 */       cjm.glTranslatef(-this.c * paramFloat, -this.d * paramFloat, -this.e * paramFloat);
/* 141:    */     }
/* 142:    */     else
/* 143:    */     {
/* 144:148 */       cjm.o(this.u);
/* 145:149 */       if (this.m != null) {
/* 146:150 */         for (i1 = 0; i1 < this.m.size(); i1++) {
/* 147:151 */           ((cdy)this.m.get(i1)).a(paramFloat);
/* 148:    */         }
/* 149:    */       }
/* 150:    */     }
/* 151:156 */     cjm.glTranslatef(-this.o, -this.p, -this.q);
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void b(float paramFloat)
/* 155:    */   {
/* 156:160 */     if (this.k) {
/* 157:161 */       return;
/* 158:    */     }
/* 159:163 */     if (!this.j) {
/* 160:164 */       return;
/* 161:    */     }
/* 162:166 */     if (!this.t) {
/* 163:167 */       d(paramFloat);
/* 164:    */     }
/* 165:170 */     cjm.glPushMatrix();
/* 166:171 */     cjm.glTranslatef(this.c * paramFloat, this.d * paramFloat, this.e * paramFloat);
/* 167:172 */     if (this.g != 0.0F) {
/* 168:173 */       cjm.glRotatef(this.g * 57.295776F, 0.0F, 1.0F, 0.0F);
/* 169:    */     }
/* 170:175 */     if (this.f != 0.0F) {
/* 171:176 */       cjm.glRotatef(this.f * 57.295776F, 1.0F, 0.0F, 0.0F);
/* 172:    */     }
/* 173:178 */     if (this.h != 0.0F) {
/* 174:179 */       cjm.glRotatef(this.h * 57.295776F, 0.0F, 0.0F, 1.0F);
/* 175:    */     }
/* 176:181 */     cjm.o(this.u);
/* 177:182 */     cjm.glPopMatrix();
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void c(float paramFloat)
/* 181:    */   {
/* 182:186 */     if (this.k) {
/* 183:187 */       return;
/* 184:    */     }
/* 185:189 */     if (!this.j) {
/* 186:190 */       return;
/* 187:    */     }
/* 188:192 */     if (!this.t) {
/* 189:193 */       d(paramFloat);
/* 190:    */     }
/* 191:196 */     if ((this.f != 0.0F) || (this.g != 0.0F) || (this.h != 0.0F))
/* 192:    */     {
/* 193:197 */       cjm.glTranslatef(this.c * paramFloat, this.d * paramFloat, this.e * paramFloat);
/* 194:198 */       if (this.h != 0.0F) {
/* 195:199 */         cjm.glRotatef(this.h * 57.295776F, 0.0F, 0.0F, 1.0F);
/* 196:    */       }
/* 197:201 */       if (this.g != 0.0F) {
/* 198:202 */         cjm.glRotatef(this.g * 57.295776F, 0.0F, 1.0F, 0.0F);
/* 199:    */       }
/* 200:204 */       if (this.f != 0.0F) {
/* 201:205 */         cjm.glRotatef(this.f * 57.295776F, 1.0F, 0.0F, 0.0F);
/* 202:    */       }
/* 203:    */     }
/* 204:207 */     else if ((this.c != 0.0F) || (this.d != 0.0F) || (this.e != 0.0F))
/* 205:    */     {
/* 206:208 */       cjm.glTranslatef(this.c * paramFloat, this.d * paramFloat, this.e * paramFloat);
/* 207:    */     }
/* 208:    */   }
/* 209:    */   
/* 210:    */   private void d(float paramFloat)
/* 211:    */   {
/* 212:213 */     this.u = bst.a(1);
/* 213:    */     
/* 214:215 */     GL11.glNewList(this.u, 4864);
/* 215:216 */     VertexBuffer localciv = ckx.getInstance().getBuffer();
/* 216:217 */     for (int i1 = 0; i1 < this.l.size(); i1++) {
/* 217:218 */       ((cdt)this.l.get(i1)).a(localciv, paramFloat);
/* 218:    */     }
/* 219:220 */     GL11.glEndList();
/* 220:    */     
/* 221:222 */     this.t = true;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public cdy b(int paramInt1, int paramInt2)
/* 225:    */   {
/* 226:226 */     this.a = paramInt1;
/* 227:227 */     this.b = paramInt2;
/* 228:228 */     return this;
/* 229:    */   }
/* 230:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdy
 * JD-Core Version:    0.7.0.1
 */