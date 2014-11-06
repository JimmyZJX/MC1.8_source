package net.minecraft.src;
/*   1:    */ public class bgl
/*   2:    */ {
/*   3:    */   public final float a;
/*   4:    */   public final float b;
/*   5:    */   public final float c;
/*   6:    */   public final float d;
/*   7:    */   public final float e;
/*   8:    */   public final float f;
/*   9:    */   public final float g;
/*  10:    */   public final float h;
/*  11:    */   public final float i;
/*  12:    */   public final float j;
/*  13:    */   public final float k;
/*  14:    */   public final float l;
/*  15:    */   public final float m;
/*  16:    */   public final float n;
/*  17:    */   public final float o;
/*  18:    */   public final float p;
/*  19:    */   public final int q;
/*  20:    */   public final boolean r;
/*  21:    */   public final boolean s;
/*  22:    */   public final int t;
/*  23:    */   public final boolean u;
/*  24:    */   public final boolean v;
/*  25:    */   public final boolean w;
/*  26:    */   public final boolean x;
/*  27:    */   public final boolean y;
/*  28:    */   public final boolean z;
/*  29:    */   public final boolean A;
/*  30:    */   public final int B;
/*  31:    */   public final boolean C;
/*  32:    */   public final int D;
/*  33:    */   public final boolean E;
/*  34:    */   public final int F;
/*  35:    */   public final int G;
/*  36:    */   public final int H;
/*  37:    */   public final int dirtRadius;
/*  38:    */   public final int dirtPerChunk;
/*  39:    */   public final int K;
/*  40:    */   public final int L;
/*  41:    */   public final int gravelRadius;
/*  42:    */   public final int gravelPerChunk;
/*  43:    */   public final int O;
/*  44:    */   public final int P;
/*  45:    */   public final int graniteRadius;
/*  46:    */   public final int granitePerChunk;
/*  47:    */   public final int S;
/*  48:    */   public final int T;
/*  49:    */   public final int dioriteRadius;
/*  50:    */   public final int dioritePerChunk;
/*  51:    */   public final int W;
/*  52:    */   public final int X;
/*  53:    */   public final int andesiteRadius;
/*  54:    */   public final int andesitePerChunk;
/*  55:    */   public final int aa;
/*  56:    */   public final int ab;
/*  57:    */   public final int coalRadius;
/*  58:    */   public final int coalPerChunk;
/*  59:    */   public final int ae;
/*  60:    */   public final int af;
/*  61:    */   public final int ironRadius;
/*  62:    */   public final int ironPerChunk;
/*  63:    */   public final int ironY1;
/*  64:    */   public final int aj;
/*  65:    */   public final int goldRadius;
/*  66:    */   public final int goldPerChunk;
/*  67:    */   public final int goldY1;
/*  68:    */   public final int an;
/*  69:    */   public final int redStoneRadius;
/*  70:    */   public final int redstonePerChunk;
/*  71:    */   public final int redstoneY1;
/*  72:    */   public final int redstoneY2;
/*  73:    */   public final int diamondRadius;
/*  74:    */   public final int diamondPerChunk;
/*  75:    */   public final int diamondY1;
/*  76:    */   public final int diamondY2;
/*  77:    */   public final int lapisRadius;
/*  78:    */   public final int lapisPerChunk;
/*  79:    */   public final int ay;
/*  80:    */   public final int az;
/*  81:    */   
/*  82:    */   private bgl(bgn parambgn)
/*  83:    */   {
/*  84:132 */     this.a = parambgn.b;
/*  85:133 */     this.b = parambgn.c;
/*  86:134 */     this.c = parambgn.d;
/*  87:135 */     this.d = parambgn.e;
/*  88:136 */     this.e = parambgn.f;
/*  89:137 */     this.f = parambgn.g;
/*  90:138 */     this.g = parambgn.h;
/*  91:139 */     this.h = parambgn.i;
/*  92:140 */     this.i = parambgn.j;
/*  93:141 */     this.j = parambgn.k;
/*  94:142 */     this.k = parambgn.l;
/*  95:143 */     this.l = parambgn.m;
/*  96:144 */     this.m = parambgn.n;
/*  97:145 */     this.n = parambgn.o;
/*  98:146 */     this.o = parambgn.p;
/*  99:147 */     this.p = parambgn.q;
/* 100:148 */     this.q = parambgn.r;
/* 101:    */     
/* 102:150 */     this.r = parambgn.s;
/* 103:151 */     this.s = parambgn.t;
/* 104:152 */     this.t = parambgn.u;
/* 105:153 */     this.u = parambgn.v;
/* 106:154 */     this.v = parambgn.w;
/* 107:155 */     this.w = parambgn.x;
/* 108:156 */     this.x = parambgn.y;
/* 109:157 */     this.y = parambgn.z;
/* 110:158 */     this.z = parambgn.A;
/* 111:159 */     this.A = parambgn.B;
/* 112:160 */     this.B = parambgn.C;
/* 113:161 */     this.C = parambgn.D;
/* 114:162 */     this.D = parambgn.E;
/* 115:163 */     this.E = parambgn.F;
/* 116:    */     
/* 117:165 */     this.F = parambgn.G;
/* 118:166 */     this.G = parambgn.H;
/* 119:167 */     this.H = parambgn.I;
/* 120:    */     
/* 121:169 */     this.dirtRadius = parambgn.dirtRadius;
/* 122:170 */     this.dirtPerChunk = parambgn.dirtPerChunk;
/* 123:171 */     this.K = parambgn.L;
/* 124:172 */     this.L = parambgn.M;
/* 125:173 */     this.gravelRadius = parambgn.N;
/* 126:174 */     this.gravelPerChunk = parambgn.O;
/* 127:175 */     this.O = parambgn.P;
/* 128:176 */     this.P = parambgn.Q;
/* 129:177 */     this.graniteRadius = parambgn.R;
/* 130:178 */     this.granitePerChunk = parambgn.S;
/* 131:179 */     this.S = parambgn.T;
/* 132:180 */     this.T = parambgn.U;
/* 133:181 */     this.dioriteRadius = parambgn.V;
/* 134:182 */     this.dioritePerChunk = parambgn.W;
/* 135:183 */     this.W = parambgn.X;
/* 136:184 */     this.X = parambgn.Y;
/* 137:185 */     this.andesiteRadius = parambgn.Z;
/* 138:186 */     this.andesitePerChunk = parambgn.aa;
/* 139:187 */     this.aa = parambgn.ab;
/* 140:188 */     this.ab = parambgn.ac;
/* 141:189 */     this.coalRadius = parambgn.ad;
/* 142:190 */     this.coalPerChunk = parambgn.ae;
/* 143:191 */     this.ae = parambgn.af;
/* 144:192 */     this.af = parambgn.ag;
/* 145:193 */     this.ironRadius = parambgn.ah;
/* 146:194 */     this.ironPerChunk = parambgn.ai;
/* 147:195 */     this.ironY1 = parambgn.aj;
/* 148:196 */     this.aj = parambgn.ak;
/* 149:197 */     this.goldRadius = parambgn.al;
/* 150:198 */     this.goldPerChunk = parambgn.am;
/* 151:199 */     this.goldY1 = parambgn.an;
/* 152:200 */     this.an = parambgn.ao;
/* 153:201 */     this.redStoneRadius = parambgn.redStoneRadius;
/* 154:202 */     this.redstonePerChunk = parambgn.redstonePerChunk;
/* 155:203 */     this.redstoneY1 = parambgn.redstoneY1;
/* 156:204 */     this.redstoneY2 = parambgn.redstoneY2;
/* 157:205 */     this.diamondRadius = parambgn.diamondRadius;
/* 158:206 */     this.diamondPerChunk = parambgn.diamondPerChunk;
/* 159:207 */     this.diamondY1 = parambgn.diamondY1;
/* 160:208 */     this.diamondY2 = parambgn.diamondY2;
/* 161:209 */     this.lapisRadius = parambgn.lapisRadius;
/* 162:210 */     this.lapisPerChunk = parambgn.lapisPerChunk;
/* 163:211 */     this.ay = parambgn.az;
/* 164:212 */     this.az = parambgn.aA;
/* 165:    */   }
				bgl(bgn arg0, bgm arg1) {this(arg0);}
/* 166:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bgl
 * JD-Core Version:    0.7.0.1
 */