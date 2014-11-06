package net.minecraft.src;
/*   1:    */ import java.text.DecimalFormat;
/*   2:    */ import java.text.NumberFormat;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Locale;
/*   5:    */ import java.util.Map;
/*   6:    */ 
/*   7:    */ public class tq
/*   8:    */ {
/*   9:    */   public final String e;
/*  10:    */   private final ho a;
/*  11:    */   public boolean f;
/*  12:    */   private final tv b;
/*  13:    */   private final bsk c;
/*  14:    */   private Class d;
/*  15:    */   
/*  16:    */   public tq(String paramString, ho paramho, tv paramtv)
/*  17:    */   {
/*  18: 23 */     this.e = paramString;
/*  19: 24 */     this.a = paramho;
/*  20: 25 */     this.b = paramtv;
/*  21: 26 */     this.c = new bsm(this);
/*  22:    */     
/*  23: 28 */     bsk.a.put(this.c.a(), this.c);
/*  24:    */   }
/*  25:    */   
/*  26:    */   public tq(String paramString, ho paramho)
/*  27:    */   {
/*  28: 32 */     this(paramString, paramho, g);
/*  29:    */   }
/*  30:    */   
/*  31:    */   public tq i()
/*  32:    */   {
/*  33: 36 */     this.f = true;
/*  34: 37 */     return this;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public tq h()
/*  38:    */   {
/*  39: 41 */     if (StatList.a.containsKey(this.e)) {
/*  40: 42 */       throw new RuntimeException("Duplicate stat id: \"" + ((tq)StatList.a.get(this.e)).a + "\" and \"" + this.a + "\" at id " + this.e);
/*  41:    */     }
/*  42: 44 */     StatList.b.add(this);
/*  43: 45 */     StatList.a.put(this.e, this);
/*  44:    */     
/*  45: 47 */     return this;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public boolean d()
/*  49:    */   {
/*  50: 51 */     return false;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public String a(int paramInt)
/*  54:    */   {
/*  55: 55 */     return this.b.a(paramInt);
/*  56:    */   }
/*  57:    */   
/*  58: 58 */   private static NumberFormat k = NumberFormat.getIntegerInstance(Locale.US);
/*  59: 59 */   public static tv g = new tr();
/*  60: 66 */   private static DecimalFormat l = new DecimalFormat("########0.00");
/*  61: 67 */   public static tv h = new ts();
/*  62: 89 */   public static tv i = new tt();
/*  63:105 */   public static tv j = new tu();
/*  64:    */   
/*  65:    */   public ho e()
/*  66:    */   {
/*  67:113 */     ho localho = this.a.f();
/*  68:114 */     localho.b().a(net.minecraft.src.a.h);
/*  69:115 */     localho.b().a(new hr(hs.b, new hy(this.e)));
/*  70:116 */     return localho;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public ho j()
/*  74:    */   {
/*  75:120 */     ho localho1 = e();
/*  76:121 */     ho localho2 = new hy("[").a(localho1).a("]");
/*  77:122 */     localho2.a(localho1.b());
/*  78:123 */     return localho2;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public boolean equals(Object paramObject)
/*  82:    */   {
/*  83:128 */     if (this == paramObject) {
/*  84:129 */       return true;
/*  85:    */     }
/*  86:131 */     if ((paramObject == null) || (getClass() != paramObject.getClass())) {
/*  87:132 */       return false;
/*  88:    */     }
/*  89:135 */     tq localtq = (tq)paramObject;
/*  90:    */     
/*  91:137 */     return this.e.equals(localtq.e);
/*  92:    */   }
/*  93:    */   
/*  94:    */   public int hashCode()
/*  95:    */   {
/*  96:142 */     return this.e.hashCode();
/*  97:    */   }
/*  98:    */   
/*  99:    */   public String toString()
/* 100:    */   {
/* 101:147 */     return "Stat{id=" + this.e + ", nameId=" + this.a + ", awardLocallyOnly=" + this.f + ", formatter=" + this.b + ", objectiveCriteria=" + this.c + '}';
/* 102:    */   }
/* 103:    */   
/* 104:    */   public bsk k()
/* 105:    */   {
/* 106:157 */     return this.c;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public Class l()
/* 110:    */   {
/* 111:161 */     return this.d;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public tq b(Class paramClass)
/* 115:    */   {
/* 116:165 */     this.d = paramClass;
/* 117:166 */     return this;
/* 118:    */   }
				static NumberFormat m(){return k;}
				static DecimalFormat n(){return l;}
/* 119:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     tq
 * JD-Core Version:    0.7.0.1
 */