package net.minecraft.src;
/*   1:    */ public abstract class aaz
/*   2:    */ {
/*   3:    */   protected EntityMob b;
/*   4:    */   protected World c;
/*   5:    */   protected bpv d;
/*   6:    */   protected double e;
/*   7:    */   private final xz a;
/*   8:    */   private int f;
/*   9:    */   private int g;
/*  10: 30 */   private Vec3 h = new Vec3(0.0D, 0.0D, 0.0D);
/*  11: 31 */   private float i = 1.0F;
/*  12:    */   private final bpw j;
/*  13:    */   
/*  14:    */   public aaz(EntityMob paramxn, World paramaqu)
/*  15:    */   {
/*  16: 36 */     this.b = paramxn;
/*  17: 37 */     this.c = paramaqu;
/*  18: 38 */     this.a = paramxn.a(afs.b);
/*  19: 39 */     this.j = a();
/*  20:    */   }
/*  21:    */   
/*  22:    */   protected abstract bpw a();
/*  23:    */   
/*  24:    */   public void a(double paramDouble)
/*  25:    */   {
/*  26: 45 */     this.e = paramDouble;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public float i()
/*  30:    */   {
/*  31: 49 */     return (float)this.a.e();
/*  32:    */   }
/*  33:    */   
/*  34:    */   public final bpv a(double paramDouble1, double paramDouble2, double paramDouble3)
/*  35:    */   {
/*  36: 54 */     return a(new BlockPosition(MathUtils.floor(paramDouble1), (int)paramDouble2, MathUtils.floor(paramDouble3)));
/*  37:    */   }
/*  38:    */   
/*  39:    */   public bpv a(BlockPosition paramdt)
/*  40:    */   {
/*  41: 59 */     if (!b()) {
/*  42: 60 */       return null;
/*  43:    */     }
/*  44: 63 */     float f1 = i();
/*  45: 64 */     this.c.profiler.a("pathfind");
/*  46: 65 */     BlockPosition localdt = new BlockPosition(this.b);
/*  47: 66 */     int k = (int)(f1 + 8.0F);
/*  48:    */     
/*  49: 68 */     arj localarj = new arj(this.c, localdt.offset(-k, -k, -k), localdt.offset(k, k, k), 0);
/*  50: 69 */     bpv localbpv = this.j.a(localarj, this.b, paramdt, f1);
/*  51: 70 */     this.c.profiler.b();
/*  52: 71 */     return localbpv;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/*  56:    */   {
/*  57: 75 */     bpv localbpv = a(MathUtils.floor(paramDouble1), (int)paramDouble2, MathUtils.floor(paramDouble3));
/*  58: 76 */     return a(localbpv, paramDouble4);
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void a(float paramFloat)
/*  62:    */   {
/*  63: 80 */     this.i = paramFloat;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public bpv a(Entity paramwv)
/*  67:    */   {
/*  68: 85 */     if (!b()) {
/*  69: 86 */       return null;
/*  70:    */     }
/*  71: 89 */     float f1 = i();
/*  72: 90 */     this.c.profiler.a("pathfind");
/*  73: 91 */     BlockPosition localdt = new BlockPosition(this.b).up();
/*  74: 92 */     int k = (int)(f1 + 16.0F);
/*  75:    */     
/*  76: 94 */     arj localarj = new arj(this.c, localdt.offset(-k, -k, -k), localdt.offset(k, k, k), 0);
/*  77: 95 */     bpv localbpv = this.j.a(localarj, this.b, paramwv, f1);
/*  78: 96 */     this.c.profiler.b();
/*  79: 97 */     return localbpv;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public boolean a(Entity paramwv, double paramDouble)
/*  83:    */   {
/*  84:101 */     bpv localbpv = a(paramwv);
/*  85:102 */     if (localbpv != null) {
/*  86:103 */       return a(localbpv, paramDouble);
/*  87:    */     }
/*  88:105 */     return false;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public boolean a(bpv parambpv, double paramDouble)
/*  92:    */   {
/*  93:110 */     if (parambpv == null)
/*  94:    */     {
/*  95:111 */       this.d = null;
/*  96:112 */       return false;
/*  97:    */     }
/*  98:114 */     if (!parambpv.a(this.d)) {
/*  99:115 */       this.d = parambpv;
/* 100:    */     }
/* 101:117 */     d();
/* 102:118 */     if (this.d.d() == 0) {
/* 103:119 */       return false;
/* 104:    */     }
/* 105:122 */     this.e = paramDouble;
/* 106:123 */     Vec3 localbrw = c();
/* 107:124 */     this.g = this.f;
/* 108:125 */     this.h = localbrw;
/* 109:126 */     return true;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public bpv j()
/* 113:    */   {
/* 114:130 */     return this.d;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public void k()
/* 118:    */   {
/* 119:134 */     this.f += 1;
/* 120:135 */     if (m()) {
/* 121:136 */       return;
/* 122:    */     }
/* 123:139 */     if (b())
/* 124:    */     {
/* 125:140 */       l();
/* 126:    */     }
/* 127:142 */     else if ((this.d != null) && (this.d.e() < this.d.d()))
/* 128:    */     {
/* 129:143 */       Vec3 localbrw1 = c();
/* 130:144 */       Vec3 localbrw2 = this.d.a(this.b, this.d.e());
/* 131:145 */       if ((localbrw1.y > localbrw2.y) && (!this.b.C) && (MathUtils.floor(localbrw1.x) == MathUtils.floor(localbrw2.x)) && (MathUtils.floor(localbrw1.z) == MathUtils.floor(localbrw2.z))) {
/* 132:146 */         this.d.c(this.d.e() + 1);
/* 133:    */       }
/* 134:    */     }
/* 135:163 */     if (m()) {
/* 136:164 */       return;
/* 137:    */     }
/* 138:166 */     Vec3 localbrw1 = this.d.a(this.b);
/* 139:167 */     if (localbrw1 == null) {
/* 140:168 */       return;
/* 141:    */     }
/* 142:171 */     this.b.q().a(localbrw1.x, localbrw1.y, localbrw1.z, this.e);
/* 143:    */   }
/* 144:    */   
/* 145:    */   protected void l()
/* 146:    */   {
/* 147:175 */     Vec3 localbrw1 = c();
/* 148:    */     
/* 149:    */ 
/* 150:178 */     int k = this.d.d();
/* 151:179 */     for (int m = this.d.e(); m < this.d.d(); m++) {
/* 152:180 */       if (this.d.a(m).b != (int)localbrw1.y)
/* 153:    */       {
/* 154:181 */         k = m;
/* 155:182 */         break;
/* 156:    */       }
/* 157:    */     }
/* 158:188 */     float f1 = this.b.J * this.b.J * this.i;
/* 159:189 */     for (int n = this.d.e(); n < k; n++)
/* 160:    */     {
/* 161:190 */       Vec3 localbrw2 = this.d.a(this.b, n);
/* 162:191 */       if (localbrw1.g(localbrw2) < f1) {
/* 163:192 */         this.d.c(n + 1);
/* 164:    */       }
/* 165:    */     }
/* 166:197 */     int n = MathUtils.ceil(this.b.J);
/* 167:198 */     int i1 = (int)this.b.K + 1;
/* 168:199 */     int i2 = n;
/* 169:200 */     for (int i3 = k - 1; i3 >= this.d.e(); i3--) {
/* 170:201 */       if (a(localbrw1, this.d.a(this.b, i3), n, i1, i2))
/* 171:    */       {
/* 172:202 */         this.d.c(i3);
/* 173:203 */         break;
/* 174:    */       }
/* 175:    */     }
/* 176:207 */     a(localbrw1);
/* 177:    */   }
/* 178:    */   
/* 179:    */   protected void a(Vec3 parambrw)
/* 180:    */   {
/* 181:212 */     if (this.f - this.g > 100)
/* 182:    */     {
/* 183:213 */       if (parambrw.g(this.h) < 2.25D) {
/* 184:214 */         n();
/* 185:    */       }
/* 186:216 */       this.g = this.f;
/* 187:217 */       this.h = parambrw;
/* 188:    */     }
/* 189:    */   }
/* 190:    */   
/* 191:    */   public boolean m()
/* 192:    */   {
/* 193:222 */     return (this.d == null) || (this.d.b());
/* 194:    */   }
/* 195:    */   
/* 196:    */   public void n()
/* 197:    */   {
/* 198:226 */     this.d = null;
/* 199:    */   }
/* 200:    */   
/* 201:    */   protected abstract Vec3 c();
/* 202:    */   
/* 203:    */   protected abstract boolean b();
/* 204:    */   
/* 205:    */   protected boolean o()
/* 206:    */   {
/* 207:234 */     return (this.b.V()) || (this.b.ab());
/* 208:    */   }
/* 209:    */   
/* 210:    */   protected void d() {}
/* 211:    */   
/* 212:    */   protected abstract boolean a(Vec3 parambrw1, Vec3 parambrw2, int paramInt1, int paramInt2, int paramInt3);
/* 213:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aaz
 * JD-Core Version:    0.7.0.1
 */