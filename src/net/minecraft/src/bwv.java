package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class bwv
/*   4:    */   extends bxf
/*   5:    */   implements bvz
/*   6:    */ {
/*   7: 37 */   private static final btr[] f = { btr.c };
/*   8:    */   private final bxf g;
/*   9:    */   private final bto h;
/*  10:    */   private bug i;
/*  11:    */   private bus r;
/*  12: 45 */   protected String a = "Options";
/*  13:    */   
/*  14:    */   public bwv(bxf parambxf, bto parambto)
/*  15:    */   {
/*  16: 48 */     this.g = parambxf;
/*  17: 49 */     this.h = parambto;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void b()
/*  21:    */   {
/*  22: 54 */     int j = 0;
/*  23: 55 */     this.a = cwc.a("options.title", new Object[0]);
/*  24: 57 */     for (btr localbtr : f)
/*  25:    */     {
/*  26: 58 */       if (localbtr.a())
/*  27:    */       {
/*  28: 59 */         this.n.add(new bvl(localbtr.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 - 12 + 24 * (j >> 1), localbtr));
/*  29:    */       }
/*  30:    */       else
/*  31:    */       {
/*  32: 61 */         buw localbuw = new buw(localbtr.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 - 12 + 24 * (j >> 1), localbtr, this.h.c(localbtr));
/*  33:    */         
/*  34: 63 */         this.n.add(localbuw);
/*  35:    */       }
/*  36: 66 */       j++;
/*  37:    */     }
/*  38: 69 */     if (this.j.f != null)
/*  39:    */     {
/*  40: 70 */       EnumDifficulty localvt = this.j.f.getDifficulty();
/*  41: 71 */       this.i = new bug(108, this.l / 2 - 155 + j % 2 * 160, this.m / 6 - 12 + 24 * (j >> 1), 150, 20, a(localvt));
/*  42: 72 */       this.n.add(this.i);
/*  43: 74 */       if ((this.j.E()) && (!this.j.f.getWorldInfo().isHardcore()))
/*  44:    */       {
/*  45: 75 */         this.i.a(this.i.b() - 20);
/*  46: 76 */         this.r = new bus(109, this.i.h + this.i.b(), this.i.i);
/*  47: 77 */         this.n.add(this.r);
/*  48:    */         
/*  49: 79 */         this.r.b(this.j.f.getWorldInfo().z());
/*  50: 80 */         this.r.l = (!this.r.c());
/*  51: 81 */         this.i.l = (!this.r.c());
/*  52:    */       }
/*  53:    */       else
/*  54:    */       {
/*  55: 83 */         this.i.l = false;
/*  56:    */       }
/*  57:    */     }
/*  58: 87 */     this.n.add(new bug(110, this.l / 2 - 155, this.m / 6 + 48 - 6, 150, 20, cwc.a("options.skinCustomisation", new Object[0])));
/*  59: 88 */     this.n.add(new bww(this, 8675309, this.l / 2 + 5, this.m / 6 + 48 - 6, 150, 20, "Super Secret Settings..."));
/*  60:    */     
/*  61:    */ 
/*  62:    */ 
/*  63:    */ 
/*  64:    */ 
/*  65:    */ 
/*  66:    */ 
/*  67:    */ 
/*  68:    */ 
/*  69: 98 */     this.n.add(new bug(106, this.l / 2 - 155, this.m / 6 + 72 - 6, 150, 20, cwc.a("options.sounds", new Object[0])));
/*  70: 99 */     this.n.add(new bug(107, this.l / 2 + 5, this.m / 6 + 72 - 6, 150, 20, cwc.a("options.stream", new Object[0])));
/*  71:    */     
/*  72:101 */     this.n.add(new bug(101, this.l / 2 - 155, this.m / 6 + 96 - 6, 150, 20, cwc.a("options.video", new Object[0])));
/*  73:102 */     this.n.add(new bug(100, this.l / 2 + 5, this.m / 6 + 96 - 6, 150, 20, cwc.a("options.controls", new Object[0])));
/*  74:    */     
/*  75:104 */     this.n.add(new bug(102, this.l / 2 - 155, this.m / 6 + 120 - 6, 150, 20, cwc.a("options.language", new Object[0])));
/*  76:105 */     this.n.add(new bug(103, this.l / 2 + 5, this.m / 6 + 120 - 6, 150, 20, cwc.a("options.multiplayer.title", new Object[0])));
/*  77:    */     
/*  78:107 */     this.n.add(new bug(105, this.l / 2 - 155, this.m / 6 + 144 - 6, 150, 20, cwc.a("options.resourcepack", new Object[0])));
/*  79:108 */     this.n.add(new bug(104, this.l / 2 + 5, this.m / 6 + 144 - 6, 150, 20, cwc.a("options.snooper.view", new Object[0])));
/*  80:    */     
/*  81:110 */     this.n.add(new bug(200, this.l / 2 - 100, this.m / 6 + 168, cwc.a("gui.done", new Object[0])));
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String a(EnumDifficulty paramvt)
/*  85:    */   {
/*  86:114 */     hy localhy = new hy("");
/*  87:115 */     localhy.a(new hz("options.difficulty", new Object[0]));
/*  88:116 */     localhy.a(": ");
/*  89:117 */     localhy.a(new hz(paramvt.b(), new Object[0]));
/*  90:118 */     return localhy.d();
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void a(boolean paramBoolean, int paramInt)
/*  94:    */   {
/*  95:123 */     this.j.a(this);
/*  96:125 */     if ((paramInt == 109) && (paramBoolean) && (this.j.f != null))
/*  97:    */     {
/*  98:126 */       this.j.f.getWorldInfo().e(true);
/*  99:127 */       this.r.b(true);
/* 100:128 */       this.r.l = false;
/* 101:129 */       this.i.l = false;
/* 102:    */     }
/* 103:    */   }
/* 104:    */   
/* 105:    */   protected void a(bug parambug)
/* 106:    */   {
/* 107:135 */     if (!parambug.l) {
/* 108:    */       return;
/* 109:    */     }
/* 110:    */     Object localObject;
/* 111:139 */     if ((parambug.k < 100) && ((parambug instanceof buw)))
/* 112:    */     {
/* 113:140 */       localObject = ((buw)parambug).c();
/* 114:141 */       this.h.a((btr)localObject, 1);
/* 115:142 */       parambug.j = this.h.c(btr.a(parambug.k));
/* 116:    */     }
/* 117:144 */     if (parambug.k == 108)
/* 118:    */     {
/* 119:145 */       this.j.f.getWorldInfo().setDifficulty(EnumDifficulty.a(this.j.f.getDifficulty().a() + 1));
/* 120:146 */       this.i.j = a(this.j.f.getDifficulty());
/* 121:    */     }
/* 122:148 */     if (parambug.k == 109) {
/* 123:149 */       this.j.a(new bwa(this, new hz("difficulty.lock.title", new Object[0]).d(), new hz("difficulty.lock.question", new Object[] { new hz(this.j.f.getWorldInfo().y().b(), new Object[0]) }).d(), 109));
/* 124:    */     }
/* 125:151 */     if (parambug.k == 110)
/* 126:    */     {
/* 127:152 */       this.j.t.b();
/* 128:153 */       this.j.a(new bxj(this));
/* 129:    */     }
/* 130:155 */     if (parambug.k == 8675309) {
/* 131:156 */       this.j.o.d();
/* 132:    */     }
/* 133:158 */     if (parambug.k == 101)
/* 134:    */     {
/* 135:159 */       this.j.t.b();
/* 136:160 */       this.j.a(new bxr(this, this.h));
/* 137:    */     }
/* 138:162 */     if (parambug.k == 100)
/* 139:    */     {
/* 140:163 */       this.j.t.b();
/* 141:164 */       this.j.a(new byj(this, this.h));
/* 142:    */     }
/* 143:166 */     if (parambug.k == 102)
/* 144:    */     {
/* 145:167 */       this.j.t.b();
/* 146:168 */       this.j.a(new bws(this, this.h, this.j.Q()));
/* 147:    */     }
/* 148:170 */     if (parambug.k == 103)
/* 149:    */     {
/* 150:171 */       this.j.t.b();
/* 151:172 */       this.j.a(new bvw(this, this.h));
/* 152:    */     }
/* 153:174 */     if (parambug.k == 104)
/* 154:    */     {
/* 155:175 */       this.j.t.b();
/* 156:176 */       this.j.a(new bxm(this, this.h));
/* 157:    */     }
/* 158:178 */     if (parambug.k == 200)
/* 159:    */     {
/* 160:179 */       this.j.t.b();
/* 161:180 */       this.j.a(this.g);
/* 162:    */     }
/* 163:182 */     if (parambug.k == 105)
/* 164:    */     {
/* 165:183 */       this.j.t.b();
/* 166:184 */       this.j.a(new bzx(this));
/* 167:    */     }
/* 168:186 */     if (parambug.k == 106)
/* 169:    */     {
/* 170:187 */       this.j.t.b();
/* 171:188 */       this.j.a(new bxo(this, this.h));
/* 172:    */     }
/* 173:190 */     if (parambug.k == 107)
/* 174:    */     {
/* 175:191 */       this.j.t.b();
/* 176:    */       
/* 177:193 */       localObject = this.j.W();
/* 178:194 */       if ((((dao)localObject).i()) && (((dao)localObject).A())) {
/* 179:195 */         this.j.a(new caj(this, this.h));
/* 180:    */       } else {
/* 181:197 */         cak.a(this);
/* 182:    */       }
/* 183:    */     }
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 187:    */   {
/* 188:204 */     c();
/* 189:205 */     a(this.q, this.a, this.l / 2, 15, 16777215);
/* 190:206 */     super.a(paramInt1, paramInt2, paramFloat);
/* 191:    */   }
/* 192:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwv
 * JD-Core Version:    0.7.0.1
 */