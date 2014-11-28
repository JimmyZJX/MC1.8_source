package net.minecraft.src;
/*   1:    */ import java.text.DateFormat;
/*   2:    */ import java.text.SimpleDateFormat;
/*   3:    */ import java.util.Collections;
/*   4:    */ import java.util.List;
/*   5:    */ import org.apache.commons.lang3.StringUtils;
/*   6:    */ import org.apache.logging.log4j.LogManager;
/*   7:    */ import org.apache.logging.log4j.Logger;
/*   8:    */ 
/*   9:    */ public class bxg
/*  10:    */   extends bxf
/*  11:    */   implements bvz
/*  12:    */ {
/*  13: 21 */   private static final Logger g = LogManager.getLogger();
/*  14: 32 */   private final DateFormat h = new SimpleDateFormat();
/*  15:    */   protected bxf a;
/*  16: 35 */   protected String f = "Select world";
/*  17:    */   private boolean i;
/*  18:    */   private int r;
/*  19:    */   private List<brb> s;
/*  20:    */   private bxh t;
/*  21:    */   private String u;
/*  22:    */   private String v;
/*  23: 42 */   private String[] w = new String[4];
/*  24:    */   private boolean x;
/*  25:    */   private bug y;
/*  26:    */   private bug z;
/*  27:    */   private bug A;
/*  28:    */   private bug B;
/*  29:    */   
/*  30:    */   public bxg(bxf parambxf)
/*  31:    */   {
/*  32: 51 */     this.a = parambxf;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void b()
/*  36:    */   {
/*  37: 56 */     this.f = cwc.a("selectWorld.title", new Object[0]);
/*  38:    */     try
/*  39:    */     {
/*  40: 59 */       f();
/*  41:    */     }
/*  42:    */     catch (bqz localbqz)
/*  43:    */     {
/*  44: 61 */       g.error("Couldn't load level list", localbqz);
/*  45: 62 */       this.j.a(new bwq("Unable to load worlds", localbqz.getMessage()));
/*  46: 63 */       return;
/*  47:    */     }
/*  48: 66 */     this.u = cwc.a("selectWorld.world", new Object[0]);
/*  49: 67 */     this.v = cwc.a("selectWorld.conversion", new Object[0]);
/*  50: 68 */     this.w[EnumGameMode.SURVIVAL.a()] = cwc.a("gameMode.survival", new Object[0]);
/*  51: 69 */     this.w[EnumGameMode.CREATIVE.a()] = cwc.a("gameMode.creative", new Object[0]);
/*  52: 70 */     this.w[EnumGameMode.ADVENTURE.a()] = cwc.a("gameMode.adventure", new Object[0]);
/*  53: 71 */     this.w[EnumGameMode.SPECTATOR.a()] = cwc.a("gameMode.spectator", new Object[0]);
/*  54:    */     
/*  55: 73 */     this.t = new bxh(this, this.j);
/*  56: 74 */     this.t.d(4, 5);
/*  57:    */     
/*  58: 76 */     a();
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void k()
/*  62:    */   {
/*  63: 81 */     super.k();
/*  64: 82 */     this.t.p();
/*  65:    */   }
/*  66:    */   
/*  67:    */   private void f() throws bqz
/*  68:    */   {
/*  69: 86 */     bra localbra = this.j.f();
/*  70: 87 */     this.s = localbra.b();
/*  71: 88 */     Collections.sort(this.s);
/*  72: 89 */     this.r = -1;
/*  73:    */   }
/*  74:    */   
/*  75:    */   protected String b(int paramInt)
/*  76:    */   {
/*  77: 93 */     return ((brb)this.s.get(paramInt)).a();
/*  78:    */   }
/*  79:    */   
/*  80:    */   protected String h(int paramInt)
/*  81:    */   {
/*  82: 97 */     String str = ((brb)this.s.get(paramInt)).b();
/*  83: 99 */     if (StringUtils.isEmpty(str)) {
/*  84:100 */       str = cwc.a("selectWorld.world", new Object[0]) + " " + (paramInt + 1);
/*  85:    */     }
/*  86:103 */     return str;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void a()
/*  90:    */   {
/*  91:107 */     this.n.add(this.z = new bug(1, this.l / 2 - 154, this.m - 52, 150, 20, cwc.a("selectWorld.select", new Object[0])));
/*  92:108 */     this.n.add(new bug(3, this.l / 2 + 4, this.m - 52, 150, 20, cwc.a("selectWorld.create", new Object[0])));
/*  93:    */     
/*  94:110 */     this.n.add(this.A = new bug(6, this.l / 2 - 154, this.m - 28, 72, 20, cwc.a("selectWorld.rename", new Object[0])));
/*  95:111 */     this.n.add(this.y = new bug(2, this.l / 2 - 76, this.m - 28, 72, 20, cwc.a("selectWorld.delete", new Object[0])));
/*  96:112 */     this.n.add(this.B = new bug(7, this.l / 2 + 4, this.m - 28, 72, 20, cwc.a("selectWorld.recreate", new Object[0])));
/*  97:113 */     this.n.add(new bug(0, this.l / 2 + 82, this.m - 28, 72, 20, cwc.a("gui.cancel", new Object[0])));
/*  98:    */     
/*  99:115 */     this.z.l = false;
/* 100:116 */     this.y.l = false;
/* 101:117 */     this.A.l = false;
/* 102:118 */     this.B.l = false;
/* 103:    */   }
/* 104:    */   
/* 105:    */   protected void a(bug parambug)
/* 106:    */   {
/* 107:123 */     if (!parambug.l) {
/* 108:    */       return;
/* 109:    */     }
/* 110:    */     Object localObject1;
/* 111:    */     Object localObject2;
/* 112:126 */     if (parambug.k == 2)
/* 113:    */     {
/* 114:127 */       localObject1 = h(this.r);
/* 115:128 */       if (localObject1 != null)
/* 116:    */       {
/* 117:129 */         this.x = true;
/* 118:    */         
/* 119:131 */         localObject2 = a(this, (String)localObject1, this.r);
/* 120:132 */         this.j.a((bxf)localObject2);
/* 121:    */       }
/* 122:    */     }
/* 123:134 */     else if (parambug.k == 1)
/* 124:    */     {
/* 125:135 */       i(this.r);
/* 126:    */     }
/* 127:136 */     else if (parambug.k == 3)
/* 128:    */     {
/* 129:137 */       this.j.a(new bwf(this));
/* 130:    */     }
/* 131:138 */     else if (parambug.k == 6)
/* 132:    */     {
/* 133:139 */       this.j.a(new bxe(this, b(this.r)));
/* 134:    */     }
/* 135:140 */     else if (parambug.k == 0)
/* 136:    */     {
/* 137:141 */       this.j.a(this.a);
/* 138:    */     }
/* 139:142 */     else if (parambug.k == 7)
/* 140:    */     {
/* 141:143 */       localObject1 = new bwf(this);
/* 142:144 */       localObject2 = this.j.f().a(b(this.r), false);
/* 143:145 */       WorldInfo localbqo = ((bqy)localObject2).d();
/* 144:146 */       ((bqy)localObject2).a();
/* 145:    */       
/* 146:148 */       ((bwf)localObject1).a(localbqo);
/* 147:149 */       this.j.a((bxf)localObject1);
/* 148:    */     }
/* 149:    */     else
/* 150:    */     {
/* 151:151 */       this.t.a(parambug);
/* 152:    */     }
/* 153:    */   }
/* 154:    */   
/* 155:    */   public void i(int paramInt)
/* 156:    */   {
/* 157:156 */     this.j.a((bxf)null);
/* 158:157 */     if (this.i) {
/* 159:158 */       return;
/* 160:    */     }
/* 161:160 */     this.i = true;
/* 162:    */     
/* 163:162 */     String str1 = b(paramInt);
/* 164:163 */     if (str1 == null) {
/* 165:164 */       str1 = "World" + paramInt;
/* 166:    */     }
/* 167:166 */     String str2 = h(paramInt);
/* 168:167 */     if (str2 == null) {
/* 169:168 */       str2 = "World" + paramInt;
/* 170:    */     }
/* 171:171 */     if (this.j.f().f(str1)) {
/* 172:172 */       this.j.a(str1, str2, null);
/* 173:    */     }
/* 174:    */   }
/* 175:    */   
/* 176:    */   public void a(boolean paramBoolean, int paramInt)
/* 177:    */   {
/* 178:178 */     if (this.x)
/* 179:    */     {
/* 180:179 */       this.x = false;
/* 181:180 */       if (paramBoolean)
/* 182:    */       {
/* 183:181 */         bra localbra = this.j.f();
/* 184:182 */         localbra.d();
/* 185:183 */         localbra.e(b(paramInt));
/* 186:    */         try
/* 187:    */         {
/* 188:186 */           f();
/* 189:    */         }
/* 190:    */         catch (bqz localbqz)
/* 191:    */         {
/* 192:188 */           g.error("Couldn't load level list", localbqz);
/* 193:    */         }
/* 194:    */       }
/* 195:191 */       this.j.a(this);
/* 196:    */     }
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 200:    */   {
/* 201:197 */     this.t.a(paramInt1, paramInt2, paramFloat);
/* 202:    */     
/* 203:199 */     a(this.q, this.f, this.l / 2, 20, 16777215);
/* 204:    */     
/* 205:201 */     super.a(paramInt1, paramInt2, paramFloat);
/* 206:    */   }
/* 207:    */   
/* 208:    */   public static bwa a(bvz parambvz, String paramString, int paramInt)
/* 209:    */   {
/* 210:278 */     String str1 = cwc.a("selectWorld.deleteQuestion", new Object[0]);
/* 211:279 */     String str2 = "'" + paramString + "' " + cwc.a("selectWorld.deleteWarning", new Object[0]);
/* 212:280 */     String str3 = cwc.a("selectWorld.deleteButton", new Object[0]);
/* 213:281 */     String str4 = cwc.a("gui.cancel", new Object[0]);
/* 214:    */     
/* 215:283 */     bwa localbwa = new bwa(parambvz, str1, str2, str3, str4, paramInt);
/* 216:    */     
/* 217:285 */     return localbwa;
/* 218:    */   }
				static List<brb> a(bxg arg0) {return arg0.s;}
				static int a(bxg arg0, int arg1) {return arg0.r=arg1;}
				static int b(bxg arg0) {return arg0.r;}
				static bug c(bxg arg0) {return arg0.z;}
				static bug d(bxg arg0) {return arg0.y;}
				static bug e(bxg arg0) {return arg0.A;}
				static bug f(bxg arg0) {return arg0.B;}
				static String g(bxg arg0) {return arg0.u;}
				static DateFormat h(bxg arg0) {return arg0.h;}
				static String i(bxg arg0) {return arg0.v;}
				static String[] j(bxg arg0) {return arg0.w;}
/* 219:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxg
 * JD-Core Version:    0.7.0.1
 */