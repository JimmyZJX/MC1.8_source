package net.minecraft.src;
/*   1:    */ public class wh
/*   2:    */ {
/*   3: 15 */   public static wh a = new wh("inFire").n();
/*   4: 16 */   public static wh b = new wh("lightningBolt");
/*   5: 17 */   public static wh c = new wh("onFire").k().n();
/*   6: 18 */   public static wh d = new wh("lava").n();
/*   7: 19 */   public static wh e = new wh("inWall").k();
/*   8: 20 */   public static wh f = new wh("drown").k();
/*   9: 21 */   public static wh g = new wh("starve").k().m();
/*  10: 22 */   public static wh h = new wh("cactus");
/*  11: 23 */   public static wh i = new wh("fall").k();
/*  12: 24 */   public static wh j = new wh("outOfWorld").k().l();
/*  13: 25 */   public static wh k = new wh("generic").k();
/*  14: 26 */   public static wh l = new wh("magic").k().t();
/*  15: 27 */   public static wh m = new wh("wither").k();
/*  16: 28 */   public static wh n = new wh("anvil");
/*  17: 29 */   public static wh o = new wh("fallingBlock");
/*  18:    */   private boolean q;
/*  19:    */   private boolean r;
/*  20:    */   private boolean s;
/*  21:    */   
/*  22:    */   public static wh a(EntityLiving paramxm)
/*  23:    */   {
/*  24: 32 */     return new wi("mob", paramxm);
/*  25:    */   }
/*  26:    */   
/*  27:    */   public static wh a(EntityPlayer paramahd)
/*  28:    */   {
/*  29: 36 */     return new wi("player", paramahd);
/*  30:    */   }
/*  31:    */   
/*  32:    */   public static wh a(ahj paramahj, Entity paramwv)
/*  33:    */   {
/*  34: 40 */     return new wj("arrow", paramahj, paramwv).b();
/*  35:    */   }
/*  36:    */   
/*  37:    */   public static wh a(ahl paramahl, Entity paramwv)
/*  38:    */   {
/*  39: 44 */     if (paramwv == null) {
/*  40: 45 */       return new wj("onFire", paramahl, paramahl).n().b();
/*  41:    */     }
/*  42: 47 */     return new wj("fireball", paramahl, paramwv).n().b();
/*  43:    */   }
/*  44:    */   
/*  45:    */   public static wh a(Entity paramwv1, Entity paramwv2)
/*  46:    */   {
/*  47: 51 */     return new wj("thrown", paramwv1, paramwv2).b();
/*  48:    */   }
/*  49:    */   
/*  50:    */   public static wh b(Entity paramwv1, Entity paramwv2)
/*  51:    */   {
/*  52: 55 */     return new wj("indirectMagic", paramwv1, paramwv2).k().t();
/*  53:    */   }
/*  54:    */   
/*  55:    */   public static wh a(Entity paramwv)
/*  56:    */   {
/*  57: 59 */     return new wi("thorns", paramwv).v().t();
/*  58:    */   }
/*  59:    */   
/*  60:    */   public static wh a(aqo paramaqo)
/*  61:    */   {
/*  62: 63 */     if ((paramaqo != null) && (paramaqo.c() != null)) {
/*  63: 64 */       return new wi("explosion.player", paramaqo.c()).q().d();
/*  64:    */     }
/*  65: 66 */     return new wh("explosion").q().d();
/*  66:    */   }
/*  67:    */   
/*  68: 74 */   private float t = 0.3F;
/*  69:    */   private boolean u;
/*  70:    */   private boolean v;
/*  71:    */   private boolean w;
/*  72:    */   private boolean x;
/*  73:    */   private boolean y;
/*  74:    */   public String p;
/*  75:    */   
/*  76:    */   public boolean a()
/*  77:    */   {
/*  78: 82 */     return this.v;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public wh b()
/*  82:    */   {
/*  83: 86 */     this.v = true;
/*  84: 87 */     return this;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public boolean c()
/*  88:    */   {
/*  89: 91 */     return this.y;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public wh d()
/*  93:    */   {
/*  94: 95 */     this.y = true;
/*  95: 96 */     return this;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public boolean e()
/*  99:    */   {
/* 100:100 */     return this.q;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public float f()
/* 104:    */   {
/* 105:104 */     return this.t;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public boolean g()
/* 109:    */   {
/* 110:108 */     return this.r;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public boolean h()
/* 114:    */   {
/* 115:112 */     return this.s;
/* 116:    */   }
/* 117:    */   
/* 118:    */   protected wh(String paramString)
/* 119:    */   {
/* 120:118 */     this.p = paramString;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public Entity i()
/* 124:    */   {
/* 125:122 */     return j();
/* 126:    */   }
/* 127:    */   
/* 128:    */   public Entity j()
/* 129:    */   {
/* 130:126 */     return null;
/* 131:    */   }
/* 132:    */   
/* 133:    */   protected wh k()
/* 134:    */   {
/* 135:130 */     this.q = true;
/* 136:    */     
/* 137:132 */     this.t = 0.0F;
/* 138:133 */     return this;
/* 139:    */   }
/* 140:    */   
/* 141:    */   protected wh l()
/* 142:    */   {
/* 143:137 */     this.r = true;
/* 144:138 */     return this;
/* 145:    */   }
/* 146:    */   
/* 147:    */   protected wh m()
/* 148:    */   {
/* 149:142 */     this.s = true;
/* 150:    */     
/* 151:144 */     this.t = 0.0F;
/* 152:145 */     return this;
/* 153:    */   }
/* 154:    */   
/* 155:    */   protected wh n()
/* 156:    */   {
/* 157:149 */     this.u = true;
/* 158:150 */     return this;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public ho b(EntityLiving paramxm)
/* 162:    */   {
/* 163:154 */     EntityLiving localxm = paramxm.bs();
/* 164:155 */     String str1 = "death.attack." + this.p;
/* 165:156 */     String str2 = str1 + ".player";
/* 166:158 */     if ((localxm != null) && (fi.c(str2))) {
/* 167:159 */       return new hz(str2, new Object[] { paramxm.e_(), localxm.e_() });
/* 168:    */     }
/* 169:161 */     return new hz(str1, new Object[] { paramxm.e_() });
/* 170:    */   }
/* 171:    */   
/* 172:    */   public boolean o()
/* 173:    */   {
/* 174:166 */     return this.u;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public String p()
/* 178:    */   {
/* 179:170 */     return this.p;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public wh q()
/* 183:    */   {
/* 184:174 */     this.w = true;
/* 185:175 */     return this;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public boolean r()
/* 189:    */   {
/* 190:179 */     return this.w;
/* 191:    */   }
/* 192:    */   
/* 193:    */   public boolean s()
/* 194:    */   {
/* 195:183 */     return this.x;
/* 196:    */   }
/* 197:    */   
/* 198:    */   public wh t()
/* 199:    */   {
/* 200:187 */     this.x = true;
/* 201:188 */     return this;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public boolean u()
/* 205:    */   {
/* 206:192 */     Entity localwv = j();
/* 207:193 */     if (((localwv instanceof EntityPlayer)) && (((EntityPlayer)localwv).by.d)) {
/* 208:194 */       return true;
/* 209:    */     }
/* 210:196 */     return false;
/* 211:    */   }
/* 212:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wh
 * JD-Core Version:    0.7.0.1
 */