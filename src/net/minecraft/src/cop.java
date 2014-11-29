package net.minecraft.src;
/*   1:    */ import java.nio.FloatBuffer;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.concurrent.locks.ReentrantLock;
/*   4:    */ 
/*   5:    */ public class cop
/*   6:    */ {
/*   7:    */   private World d;
/*   8:    */   private final ckn e;
/*   9:    */   public static int a;
/*  10:    */   private BlockPosition f;
/*  11: 39 */   public cok b = cok.a;
/*  12: 40 */   private final ReentrantLock g = new ReentrantLock();
/*  13: 41 */   private final ReentrantLock h = new ReentrantLock();
/*  14: 42 */   private coa i = null;
/*  15:    */   private final int j;
/*  16: 46 */   private final FloatBuffer k = bst.h(16);
/*  17: 47 */   private final cur[] l = new cur[aql.values().length];
/*  18:    */   public AABB c;
/*  19: 51 */   private int m = -1;
/*  20: 52 */   private boolean n = true;
/*  21:    */   
/*  22:    */   public cop(World paramaqu, ckn paramckn, BlockPosition paramdt, int paramInt)
/*  23:    */   {
/*  24: 55 */     this.d = paramaqu;
/*  25: 56 */     this.e = paramckn;
/*  26: 57 */     this.j = paramInt;
/*  27: 59 */     if (!paramdt.equals(j())) {
/*  28: 60 */       a(paramdt);
/*  29:    */     }
/*  30: 63 */     if (dax.f()) {
/*  31: 64 */       for (int i1 = 0; i1 < aql.values().length; i1++) {
/*  32: 65 */         this.l[i1] = new cur(cuq.a);
/*  33:    */       }
/*  34:    */     }
/*  35:    */   }
/*  36:    */   
/*  37:    */   public boolean a(int paramInt)
/*  38:    */   {
/*  39: 71 */     if (this.m == paramInt) {
/*  40: 72 */       return false;
/*  41:    */     }
/*  42: 74 */     this.m = paramInt;
/*  43: 75 */     return true;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public cur b(int paramInt)
/*  47:    */   {
/*  48: 79 */     return this.l[paramInt];
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(BlockPosition paramdt)
/*  52:    */   {
/*  53: 83 */     h();
/*  54: 84 */     this.f = paramdt;
/*  55: 85 */     this.c = new AABB(paramdt, paramdt.offset(16, 16, 16));
/*  56:    */     
/*  57: 87 */     n();
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, coa paramcoa)
/*  61:    */   {
/*  62: 91 */     cok localcok = paramcoa.c();
/*  63: 92 */     if ((localcok.c() == null) || (localcok.b(aql.d))) {
/*  64: 93 */       return;
/*  65:    */     }
/*  66: 96 */     a(paramcoa.d().a(aql.d), this.f);
/*  67:    */     
/*  68: 98 */     paramcoa.d().a(aql.d).a(localcok.c());
/*  69:    */     
/*  70:100 */     a(aql.d, paramFloat1, paramFloat2, paramFloat3, paramcoa.d().a(aql.d), localcok);
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void b(float paramFloat1, float paramFloat2, float paramFloat3, coa paramcoa)
/*  74:    */   {
/*  75:104 */     cok localcok = new cok();
/*  77:    */     
/*  78:107 */     BlockPosition localdt1 = this.f;
/*  79:108 */     BlockPosition localdt2 = localdt1.offset(15, 15, 15);
/*  80:    */     
/*  81:    */ 
/*  82:111 */     paramcoa.f().lock();
/*  83:    */     cja localcja;
/*  84:    */     try
/*  85:    */     {
/*  86:113 */       if (paramcoa.a() != cob.b) {
/*  87:    */         return;
/*  88:    */       }
/*  89:117 */       localcja = new cja(this.d, localdt1.offset(-1, -1, -1), localdt2.offset(1, 1, 1), 1);
/*  90:118 */       paramcoa.a(localcok);
/*  91:    */     }
/*  92:    */     finally
/*  93:    */     {
/*  94:120 */       paramcoa.f().unlock();
/*  95:    */     }
/*  96:123 */     cos localcos = new cos();
/*  97:124 */     if (!localcja.W())
/*  98:    */     {
/* 130:    */       BlockType localatr;
/*  99:125 */       a += 1;
/* 100:127 */       for (Iterator<dy> localObject2 = BlockPosition.b(localdt1, localdt2).iterator(); localObject2.hasNext();)
/* 101:    */       {
/* 102:127 */         dy localdy = localObject2.next();
/* 103:128 */         Block localbec = localcja.getBlock(localdy);
/* 104:129 */         localatr = localbec.getType();
/* 105:130 */         if (localatr.c()) {
/* 106:131 */           localcos.a(localdy);
/* 107:    */         }
/* 108:134 */         if (localatr.x())
/* 109:    */         {
/* 110:138 */           bcm localbcm = localcja.s(new BlockPosition(localdy));
/* 111:139 */           if ((localbcm != null) && (cno.a.a((bcm)localbcm))) {
/* 112:140 */             localcok.a((bcm)localbcm);
/* 113:    */           }
/* 114:    */         }
/* 115:144 */         aql localaql = localatr.k();
/* 116:145 */         int i4 = localaql.ordinal();
/* 117:147 */         if (localatr.b() != -1)
/* 118:    */         {
/* 119:148 */           VertexBuffer localciv = paramcoa.d().a(i4);
/* 120:149 */           if (!localcok.d(localaql))
/* 121:    */           {
/* 122:150 */             localcok.c(localaql);
/* 123:151 */             a(localciv, localdt1);
/* 124:    */           }
/* 125:154 */           if (bsu.z().ab().a(localbec, localdy, localcja, localciv)) {
/* 126:155 */             localcok.a(localaql);
/* 127:    */           }
/* 128:    */         }
/* 129:    */       }
/* 131:160 */       for (aql localaql : aql.values()) {
/* 132:161 */         if (localcok.d(localaql)) {
/* 133:162 */           a(localaql, paramFloat1, paramFloat2, paramFloat3, paramcoa.d().a(localaql), localcok);
/* 134:    */         }
/* 135:    */       }
/* 136:    */     }
/* 137:167 */     localcok.a(localcos.a());
/* 138:    */   }
/* 139:    */   
/* 140:    */   protected void b()
/* 141:    */   {
/* 142:171 */     this.g.lock();
/* 143:    */     try
/* 144:    */     {
/* 145:173 */       if ((this.i != null) && (this.i.a() != cob.d))
/* 146:    */       {
/* 147:174 */         this.i.e();
/* 148:175 */         this.i = null;
/* 149:    */       }
/* 150:    */     }
/* 151:    */     finally
/* 152:    */     {
/* 153:178 */       this.g.unlock();
/* 154:    */     }
/* 155:    */   }
/* 156:    */   
/* 157:    */   public ReentrantLock c()
/* 158:    */   {
/* 159:183 */     return this.g;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public coa d()
/* 163:    */   {
/* 164:187 */     this.g.lock();
/* 165:    */     try
/* 166:    */     {
/* 167:189 */       b();
/* 168:190 */       this.i = new coa(this, coc.a);
/* 169:191 */       return this.i;
/* 170:    */     }
/* 171:    */     finally
/* 172:    */     {
/* 173:193 */       this.g.unlock();
/* 174:    */     }
/* 175:    */   }
/* 176:    */   
/* 177:    */   public coa e()
/* 178:    */   {
/* 179:199 */     this.g.lock();
/* 180:    */     try
/* 181:    */     {
/* 183:201 */       if ((this.i != null) && (this.i.a() == cob.a)) {
/* 184:202 */         return null;
/* 185:    */       }
/* 186:203 */       if ((this.i != null) && (this.i.a() != cob.d))
/* 187:    */       {
/* 188:204 */         this.i.e();
/* 189:205 */         this.i = null;
/* 190:    */       }
/* 191:207 */       this.i = new coa(this, coc.b);
/* 192:208 */       this.i.a(this.b);
/* 193:209 */       return this.i;
/* 194:    */     }
/* 195:    */     finally
/* 196:    */     {
/* 197:211 */       this.g.unlock();
/* 198:    */     }
/* 199:    */   }
/* 200:    */   
/* 201:    */   private void a(VertexBuffer paramciv, BlockPosition paramdt)
/* 202:    */   {
/* 203:216 */     paramciv.a(7);
/* 204:217 */     paramciv.setFormat(cuq.a);
/* 205:218 */     paramciv.c(-paramdt.getX(), -paramdt.getY(), -paramdt.getZ());
/* 206:    */   }
/* 207:    */   
/* 208:    */   private void a(aql paramaql, float paramFloat1, float paramFloat2, float paramFloat3, VertexBuffer paramciv, cok paramcok)
/* 209:    */   {
/* 210:222 */     if ((paramaql == aql.d) && (!paramcok.b(paramaql))) {
/* 211:223 */       paramcok.a(paramciv.a(paramFloat1, paramFloat2, paramFloat3));
/* 212:    */     }
/* 213:225 */     paramciv.d();
/* 214:    */   }
/* 215:    */   
/* 216:    */   private void n()
/* 217:    */   {
/* 218:229 */     cjm.glPushMatrix();
/* 219:230 */     cjm.glLoadIdentity();
/* 220:231 */     float f1 = 1.000001F;
/* 221:232 */     cjm.glTranslatef(-8.0F, -8.0F, -8.0F);
/* 222:233 */     cjm.glScalef(f1, f1, f1);
/* 223:234 */     cjm.glTranslatef(8.0F, 8.0F, 8.0F);
/* 224:235 */     cjm.glGetFloat(2982, this.k);
/* 225:236 */     cjm.glPopMatrix();
/* 226:    */   }
/* 227:    */   
/* 228:    */   public void f()
/* 229:    */   {
/* 230:240 */     cjm.glMultMatrix(this.k);
/* 231:    */   }
/* 232:    */   
/* 233:    */   public cok g()
/* 234:    */   {
/* 235:244 */     return this.b;
/* 236:    */   }
/* 237:    */   
/* 238:    */   public void a(cok paramcok)
/* 239:    */   {
/* 240:248 */     this.h.lock();
/* 241:    */     try
/* 242:    */     {
/* 243:250 */       this.b = paramcok;
/* 244:    */     }
/* 245:    */     finally
/* 246:    */     {
/* 247:252 */       this.h.unlock();
/* 248:    */     }
/* 249:    */   }
/* 250:    */   
/* 251:    */   public void h()
/* 252:    */   {
/* 253:257 */     b();
/* 254:258 */     this.b = cok.a;
/* 255:    */   }
/* 256:    */   
/* 257:    */   public void a()
/* 258:    */   {
/* 259:262 */     h();
/* 260:263 */     this.d = null;
/* 261:264 */     for (int i1 = 0; i1 < aql.values().length; i1++) {
/* 262:265 */       if (this.l[i1] != null) {
/* 263:266 */         this.l[i1].c();
/* 264:    */       }
/* 265:    */     }
/* 266:    */   }
/* 267:    */   
/* 268:    */   public BlockPosition j()
/* 269:    */   {
/* 270:276 */     return this.f;
/* 271:    */   }
/* 272:    */   
/* 273:    */   public boolean l()
/* 274:    */   {
/* 275:284 */     this.g.lock();
/* 276:    */     try
/* 277:    */     {
/* 278:286 */       return (this.i == null) || (this.i.a() == cob.a);
/* 279:    */     }
/* 280:    */     finally
/* 281:    */     {
/* 282:288 */       this.g.unlock();
/* 283:    */     }
/* 284:    */   }
/* 285:    */   
/* 286:    */   public void a(boolean paramBoolean)
/* 287:    */   {
/* 288:293 */     this.n = paramBoolean;
/* 289:    */   }
/* 290:    */   
/* 291:    */   public boolean m()
/* 292:    */   {
/* 293:297 */     return this.n;
/* 294:    */   }
/* 295:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cop
 * JD-Core Version:    0.7.0.1
 */