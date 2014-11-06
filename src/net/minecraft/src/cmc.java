package net.minecraft.src;
/*   1:    */ import com.google.gson.Gson;
/*   2:    */ import com.google.gson.GsonBuilder;

/*   3:    */ import java.io.Reader;
/*   4:    */ import java.io.StringReader;
/*   5:    */ import java.util.Collections;
/*   6:    */ import java.util.List;
/*   7:    */ import java.util.Map;

/*   8:    */ import org.apache.logging.log4j.LogManager;
/*   9:    */ import org.apache.logging.log4j.Logger;
/*  10:    */ 
/*  11:    */ public class cmc
/*  12:    */ {
/*  13: 23 */   private static final Logger f = LogManager.getLogger();
/*  14: 25 */   static final Gson a = new GsonBuilder().registerTypeAdapter(cmc.class, new cmf()).registerTypeAdapter(clu.class, new clw()).registerTypeAdapter(clx.class, new cly()).registerTypeAdapter(cma.class, new cmb()).registerTypeAdapter(cmv.class, new cmw()).registerTypeAdapter(cmx.class, new cmy()).create();
/*  15:    */   private final List<clu> g;
/*  16:    */   private final boolean h;
/*  17:    */   private final boolean i;
/*  18:    */   private cmx j;
/*  19: 39 */   public String b = "";
/*  20:    */   protected final Map c;
/*  21:    */   protected cmc d;
/*  22:    */   protected oa e;
/*  23:    */   
/*  24:    */   public static cmc a(Reader paramReader)
/*  25:    */   {
/*  26: 50 */     return (cmc)a.fromJson(paramReader, cmc.class);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public static cmc a(String paramString)
/*  30:    */   {
/*  31: 54 */     return a(new StringReader(paramString));
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected cmc(List paramList, Map paramMap, boolean paramBoolean1, boolean paramBoolean2, cmx paramcmx)
/*  35:    */   {
/*  36: 58 */     this(null, paramList, paramMap, paramBoolean1, paramBoolean2, paramcmx);
/*  37:    */   }
/*  38:    */   
/*  39:    */   protected cmc(oa paramoa, Map paramMap, boolean paramBoolean1, boolean paramBoolean2, cmx paramcmx)
/*  40:    */   {
/*  41: 62 */     this(paramoa, Collections.emptyList(), paramMap, paramBoolean1, paramBoolean2, paramcmx);
/*  42:    */   }
/*  43:    */   
/*  44:    */   private cmc(oa paramoa, List paramList, Map paramMap, boolean paramBoolean1, boolean paramBoolean2, cmx paramcmx)
/*  45:    */   {
/*  46: 66 */     this.g = paramList;
/*  47: 67 */     this.i = paramBoolean1;
/*  48: 68 */     this.h = paramBoolean2;
/*  49: 69 */     this.c = paramMap;
/*  50: 70 */     this.e = paramoa;
/*  51: 71 */     this.j = paramcmx;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public List<clu> a()
/*  55:    */   {
/*  56: 75 */     if (k()) {
/*  57: 76 */       return this.d.a();
/*  58:    */     }
/*  59: 79 */     return this.g;
/*  60:    */   }
/*  61:    */   
/*  62:    */   private boolean k()
/*  63:    */   {
/*  64: 83 */     return this.d != null;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public boolean b()
/*  68:    */   {
/*  69: 87 */     if (k()) {
/*  70: 88 */       return this.d.b();
/*  71:    */     }
/*  72: 90 */     return this.i;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean c()
/*  76:    */   {
/*  77: 94 */     return this.h;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean d()
/*  81:    */   {
/*  82: 98 */     return (this.e == null) || ((this.d != null) && (this.d.d()));
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void a(Map paramMap)
/*  86:    */   {
/*  87:102 */     if (this.e != null) {
/*  88:103 */       this.d = ((cmc)paramMap.get(this.e));
/*  89:    */     }
/*  90:    */   }
/*  91:    */   
/*  92:    */   public boolean b(String paramString)
/*  93:    */   {
/*  94:117 */     return !"missingno".equals(c(paramString));
/*  95:    */   }
/*  96:    */   
/*  97:    */   public String c(String paramString)
/*  98:    */   {
/*  99:121 */     if (!d(paramString)) {
/* 100:122 */       paramString = '#' + paramString;
/* 101:    */     }
/* 102:124 */     return a(paramString, new cme(this, null));
/* 103:    */   }
/* 104:    */   
/* 105:    */   private String a(String paramString, cme paramcme)
/* 106:    */   {
/* 107:128 */     if (d(paramString))
/* 108:    */     {
/* 109:129 */       if (this == paramcme.b)
/* 110:    */       {
/* 111:130 */         f.warn("Unable to resolve texture due to upward reference: " + paramString + " in " + this.b);
/* 112:131 */         return "missingno";
/* 113:    */       }
/* 114:134 */       String str = (String)this.c.get(paramString.substring(1));
/* 115:135 */       if ((str == null) && (k())) {
/* 116:136 */         str = this.d.a(paramString, paramcme);
/* 117:    */       }
/* 118:138 */       paramcme.b = this;
/* 119:140 */       if ((str != null) && (d(str))) {
/* 120:141 */         str = paramcme.a.a(str, paramcme);
/* 121:    */       }
/* 122:144 */       if ((str == null) || (d(str))) {
/* 123:145 */         return "missingno";
/* 124:    */       }
/* 125:148 */       return str;
/* 126:    */     }
/* 127:151 */     return paramString;
/* 128:    */   }
/* 129:    */   
/* 130:    */   private boolean d(String paramString)
/* 131:    */   {
/* 132:155 */     return paramString.charAt(0) == '#';
/* 133:    */   }
/* 134:    */   
/* 135:    */   public oa e()
/* 136:    */   {
/* 137:160 */     return this.e;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public cmc f()
/* 141:    */   {
/* 142:164 */     return k() ? this.d.f() : this;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public cmv g()
/* 146:    */   {
/* 147:168 */     if ((this.d != null) && (this.j.b == cmv.a)) {
/* 148:169 */       return this.d.g();
/* 149:    */     }
/* 150:171 */     return this.j.b;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public cmv h()
/* 154:    */   {
/* 155:175 */     if ((this.d != null) && (this.j.c == cmv.a)) {
/* 156:176 */       return this.d.h();
/* 157:    */     }
/* 158:178 */     return this.j.c;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public cmv i()
/* 162:    */   {
/* 163:182 */     if ((this.d != null) && (this.j.d == cmv.a)) {
/* 164:183 */       return this.d.i();
/* 165:    */     }
/* 166:185 */     return this.j.d;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public cmv j()
/* 170:    */   {
/* 171:189 */     if ((this.d != null) && (this.j.e == cmv.a)) {
/* 172:190 */       return this.d.j();
/* 173:    */     }
/* 174:192 */     return this.j.e;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public static void b(Map<oa,cmc> paramMap)
/* 178:    */   {
/* 179:268 */     for (cmc localcmc1 : paramMap.values()) {
/* 180:    */       try
/* 181:    */       {
/* 182:270 */         cmc localcmc2 = localcmc1.d;
/* 183:271 */         cmc localcmc3 = localcmc2.d;
/* 184:273 */         while (localcmc2 != localcmc3)
/* 185:    */         {
/* 186:274 */           localcmc2 = localcmc2.d;
/* 187:275 */           localcmc3 = localcmc3.d.d;
/* 188:    */         }
/* 189:278 */         throw new cmg();
/* 190:    */       }
/* 191:    */       catch (NullPointerException localNullPointerException) {}
/* 192:    */     }
/* 193:    */   }
/* 194:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmc
 * JD-Core Version:    0.7.0.1
 */