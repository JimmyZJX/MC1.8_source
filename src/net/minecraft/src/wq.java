package net.minecraft.src;
/*   1:    */ import org.apache.logging.log4j.LogManager;
/*   2:    */ import org.apache.logging.log4j.Logger;
/*   3:    */ 
/*   4:    */ public class wq
/*   5:    */ {
/*   6: 10 */   private static final Logger a = LogManager.getLogger();
/*   7:    */   private int b;
/*   8:    */   private int c;
/*   9:    */   private int d;
/*  10:    */   private boolean e;
/*  11:    */   private boolean f;
/*  12:    */   private boolean g;
/*  13:    */   private boolean h;
/*  14:    */   
/*  15:    */   public wq(int paramInt1, int paramInt2)
/*  16:    */   {
/*  17: 28 */     this(paramInt1, paramInt2, 0);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public wq(int paramInt1, int paramInt2, int paramInt3)
/*  21:    */   {
/*  22: 32 */     this(paramInt1, paramInt2, paramInt3, false, true);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public wq(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
/*  26:    */   {
/*  27: 36 */     this.b = paramInt1;
/*  28: 37 */     this.c = paramInt2;
/*  29: 38 */     this.d = paramInt3;
/*  30: 39 */     this.f = paramBoolean1;
/*  31: 40 */     this.h = paramBoolean2;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public wq(wq paramwq)
/*  35:    */   {
/*  36: 44 */     this.b = paramwq.b;
/*  37: 45 */     this.c = paramwq.c;
/*  38: 46 */     this.d = paramwq.d;
/*  39: 47 */     this.f = paramwq.f;
/*  40: 48 */     this.h = paramwq.h;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void a(wq paramwq)
/*  44:    */   {
/*  45: 52 */     if (this.b != paramwq.b) {
/*  46: 53 */       a.warn("This method should only be called for matching effects!");
/*  47:    */     }
/*  48: 55 */     if (paramwq.d > this.d)
/*  49:    */     {
/*  50: 56 */       this.d = paramwq.d;
/*  51: 57 */       this.c = paramwq.c;
/*  52:    */     }
/*  53: 58 */     else if ((paramwq.d == this.d) && (this.c < paramwq.c))
/*  54:    */     {
/*  55: 59 */       this.c = paramwq.c;
/*  56:    */     }
/*  57: 60 */     else if ((!paramwq.f) && (this.f))
/*  58:    */     {
/*  59: 61 */       this.f = paramwq.f;
/*  60:    */     }
/*  61: 63 */     this.h = paramwq.h;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public int a()
/*  65:    */   {
/*  66: 67 */     return this.b;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public int b()
/*  70:    */   {
/*  71: 71 */     return this.c;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public int c()
/*  75:    */   {
/*  76: 75 */     return this.d;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void a(boolean paramBoolean)
/*  80:    */   {
/*  81: 83 */     this.e = paramBoolean;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public boolean e()
/*  85:    */   {
/*  86: 87 */     return this.f;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public boolean f()
/*  90:    */   {
/*  91: 91 */     return this.h;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public boolean a(EntityLiving paramxm)
/*  95:    */   {
/*  96:101 */     if (this.c > 0)
/*  97:    */     {
/*  98:102 */       if (Potion.a[this.b].a(this.c, this.d)) {
/*  99:103 */         b(paramxm);
/* 100:    */       }
/* 101:105 */       i();
/* 102:    */     }
/* 103:107 */     return this.c > 0;
/* 104:    */   }
/* 105:    */   
/* 106:    */   private int i()
/* 107:    */   {
/* 108:111 */     return --this.c;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void b(EntityLiving paramxm)
/* 112:    */   {
/* 113:115 */     if (this.c > 0) {
/* 114:116 */       Potion.a[this.b].a(paramxm, this.d);
/* 115:    */     }
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String g()
/* 119:    */   {
/* 120:121 */     return Potion.a[this.b].a();
/* 121:    */   }
/* 122:    */   
/* 123:    */   public int hashCode()
/* 124:    */   {
/* 125:126 */     return this.b;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String toString()
/* 129:    */   {
/* 130:131 */     String str = "";
/* 131:132 */     if (c() > 0) {
/* 132:133 */       str = g() + " x " + (c() + 1) + ", Duration: " + b();
/* 133:    */     } else {
/* 134:135 */       str = g() + ", Duration: " + b();
/* 135:    */     }
/* 136:137 */     if (this.e) {
/* 137:138 */       str = str + ", Splash: true";
/* 138:    */     }
/* 139:140 */     if (!this.h) {
/* 140:141 */       str = str + ", Particles: false";
/* 141:    */     }
/* 142:143 */     if (Potion.a[this.b].j()) {
/* 143:144 */       return "(" + str + ")";
/* 144:    */     }
/* 145:146 */     return str;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public boolean equals(Object paramObject)
/* 149:    */   {
/* 150:151 */     if (!(paramObject instanceof wq)) {
/* 151:152 */       return false;
/* 152:    */     }
/* 153:154 */     wq localwq = (wq)paramObject;
/* 154:155 */     return (this.b == localwq.b) && (this.d == localwq.d) && (this.c == localwq.c) && (this.e == localwq.e) && (this.f == localwq.f);
/* 155:    */   }
/* 156:    */   
/* 157:    */   public NBTTagCompound a(NBTTagCompound paramfn)
/* 158:    */   {
/* 159:159 */     paramfn.setByte("Id", (byte)a());
/* 160:160 */     paramfn.setByte("Amplifier", (byte)c());
/* 161:161 */     paramfn.setInt("Duration", b());
/* 162:162 */     paramfn.setBoolean("Ambient", e());
/* 163:163 */     paramfn.setBoolean("ShowParticles", f());
/* 164:164 */     return paramfn;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public static wq b(NBTTagCompound paramfn)
/* 168:    */   {
/* 169:168 */     int i = paramfn.d("Id");
/* 170:169 */     if ((i < 0) || (i >= Potion.a.length) || (Potion.a[i] == null)) {
/* 171:170 */       return null;
/* 172:    */     }
/* 173:172 */     int j = paramfn.d("Amplifier");
/* 174:173 */     int k = paramfn.getInteger("Duration");
/* 175:174 */     boolean bool1 = paramfn.getBoolean("Ambient");
/* 176:175 */     boolean bool2 = true;
/* 177:176 */     if (paramfn.hasKey("ShowParticles", 1)) {
/* 178:177 */       bool2 = paramfn.getBoolean("ShowParticles");
/* 179:    */     }
/* 180:179 */     return new wq(i, k, j, bool1, bool2);
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void b(boolean paramBoolean)
/* 184:    */   {
/* 185:183 */     this.g = paramBoolean;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public boolean h()
/* 189:    */   {
/* 190:187 */     return this.g;
/* 191:    */   }
/* 192:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wq
 * JD-Core Version:    0.7.0.1
 */