package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Sets;
/*   2:    */ import java.util.Collection;
/*   3:    */ import java.util.Set;
/*   4:    */ 
/*   5:    */ public class brz
/*   6:    */   extends bsf
/*   7:    */ {
/*   8:    */   private final bsd a;
/*   9:    */   private final String b;
/*  10: 21 */   private final Set<String> c = Sets.newHashSet();
/*  11:    */   private String d;
/*  12: 23 */   private String e = "";
/*  13: 24 */   private String f = "";
/*  14: 25 */   private boolean g = true;
/*  15: 26 */   private boolean h = true;
/*  16: 27 */   private bsg i = bsg.ALWAYS;
/*  17: 28 */   private bsg j = bsg.ALWAYS;
/*  18: 29 */   private a k = net.minecraft.src.a.v;
/*  19:    */   
/*  20:    */   public brz(bsd parambsd, String paramString)
/*  21:    */   {
/*  22: 32 */     this.a = parambsd;
/*  23: 33 */     this.b = paramString;
/*  24: 34 */     this.d = paramString;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String b()
/*  28:    */   {
/*  29: 43 */     return this.b;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public String c()
/*  33:    */   {
/*  34: 47 */     return this.d;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void a(String paramString)
/*  38:    */   {
/*  39: 51 */     if (paramString == null) {
/*  40: 52 */       throw new IllegalArgumentException("Name cannot be null");
/*  41:    */     }
/*  42: 54 */     this.d = paramString;
/*  43: 55 */     this.a.b(this);
/*  44:    */   }
/*  45:    */   
/*  46:    */   public Collection<String> d()
/*  47:    */   {
/*  48: 60 */     return this.c;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String e()
/*  52:    */   {
/*  53: 64 */     return this.e;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void b(String paramString)
/*  57:    */   {
/*  58: 68 */     if (paramString == null) {
/*  59: 69 */       throw new IllegalArgumentException("Prefix cannot be null");
/*  60:    */     }
/*  61: 71 */     this.e = paramString;
/*  62: 72 */     this.a.b(this);
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String f()
/*  66:    */   {
/*  67: 76 */     return this.f;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void c(String paramString)
/*  71:    */   {
/*  72: 80 */     this.f = paramString;
/*  73: 81 */     this.a.b(this);
/*  74:    */   }
/*  75:    */   
/*  76:    */   public String d(String paramString)
/*  77:    */   {
/*  78: 86 */     return e() + paramString + f();
/*  79:    */   }
/*  80:    */   
/*  81:    */   public static String a(bsf parambsf, String paramString)
/*  82:    */   {
/*  83: 94 */     if (parambsf == null) {
/*  84: 95 */       return paramString;
/*  85:    */     }
/*  86: 97 */     return parambsf.d(paramString);
/*  87:    */   }
/*  88:    */   
/*  89:    */   public boolean g()
/*  90:    */   {
/*  91:102 */     return this.g;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void a(boolean paramBoolean)
/*  95:    */   {
/*  96:106 */     this.g = paramBoolean;
/*  97:107 */     this.a.b(this);
/*  98:    */   }
/*  99:    */   
/* 100:    */   public boolean h()
/* 101:    */   {
/* 102:112 */     return this.h;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void b(boolean paramBoolean)
/* 106:    */   {
/* 107:116 */     this.h = paramBoolean;
/* 108:117 */     this.a.b(this);
/* 109:    */   }
/* 110:    */   
/* 111:    */   public bsg i()
/* 112:    */   {
/* 113:122 */     return this.i;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public bsg j()
/* 117:    */   {
/* 118:127 */     return this.j;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void a(bsg parambsg)
/* 122:    */   {
/* 123:131 */     this.i = parambsg;
/* 124:132 */     this.a.b(this);
/* 125:    */   }
/* 126:    */   
/* 127:    */   public void b(bsg parambsg)
/* 128:    */   {
/* 129:136 */     this.j = parambsg;
/* 130:137 */     this.a.b(this);
/* 131:    */   }
/* 132:    */   
/* 133:    */   public int k()
/* 134:    */   {
/* 135:141 */     int m = 0;
/* 136:143 */     if (g()) {
/* 137:144 */       m |= 0x1;
/* 138:    */     }
/* 139:146 */     if (h()) {
/* 140:147 */       m |= 0x2;
/* 141:    */     }
/* 142:150 */     return m;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void a(int paramInt)
/* 146:    */   {
/* 147:154 */     a((paramInt & 0x1) > 0);
/* 148:155 */     b((paramInt & 0x2) > 0);
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void a(a parama)
/* 152:    */   {
/* 153:159 */     this.k = parama;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public a l()
/* 157:    */   {
/* 158:163 */     return this.k;
/* 159:    */   }
/* 160:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     brz
 * JD-Core Version:    0.7.0.1
 */