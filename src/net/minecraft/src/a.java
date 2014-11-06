package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.Collection;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Map;
/*   7:    */ import java.util.regex.Matcher;
/*   8:    */ import java.util.regex.Pattern;
/*   9:    */ 
/*  10:    */ public enum a
/*  11:    */ { a("",'\0',0),
				b("",'\0',0),
				c("",'\0',0),
				d("",'\0',0),
				e("",'\0',0),
				f("",'\0',0),
				g("",'\0',0),
				h("",'\0',0),
				i("",'\0',0),
				j("",'\0',0),
				k("",'\0',0),
				l("",'\0',0),
				m("",'\0',0),
				n("",'\0',0),
				o("",'\0',0),
				p("",'\0',0),
				q("",'\0',0),
				r("",'\0',0),
				s("",'\0',0),
				t("",'\0',0),
				u("",'\0',0),
				v("",'\0',0); // TODO: BROKEN
/*  12:    */   private static final Map w;
/*  13:    */   private static final Pattern x;
/*  14:    */   private final String y;
/*  15:    */   private final char z;
/*  16:    */   private final boolean A;
/*  17:    */   private final String B;
/*  18:    */   private final int C;
/*  19:    */   
/*  20:    */   static
/*  21:    */   {
/*  22: 37 */     w = Maps.newHashMap();
/*  23: 38 */     x = Pattern.compile("(?i)" + String.valueOf('§') + "[0-9A-FK-OR]");
/*  24: 41 */     for (a locala : values()) {
/*  25: 42 */       w.put(c(locala.y), locala);
/*  26:    */     }
/*  27:    */   }
/*  28:    */   
/*  29:    */   private static String c(String paramString)
/*  30:    */   {
/*  31: 47 */     return paramString.toLowerCase().replaceAll("[^a-z]", "");
/*  32:    */   }
/*  33:    */   
/*  34:    */   private a(String paramString, char paramChar, int paramInt)
/*  35:    */   {
/*  36: 57 */     this(paramString, paramChar, false, paramInt);
/*  37:    */   }
/*  38:    */   
/*  39:    */   private a(String paramString, char paramChar, boolean paramBoolean)
/*  40:    */   {
/*  41: 61 */     this(paramString, paramChar, paramBoolean, -1);
/*  42:    */   }
/*  43:    */   
/*  44:    */   private a(String paramString, char paramChar, boolean paramBoolean, int paramInt)
/*  45:    */   {
/*  46: 65 */     this.y = paramString;
/*  47: 66 */     this.z = paramChar;
/*  48: 67 */     this.A = paramBoolean;
/*  49: 68 */     this.C = paramInt;
/*  50:    */     
/*  51: 70 */     this.B = ("§" + paramChar);
/*  52:    */   }
/*  53:    */   
/*  54:    */   public int b()
/*  55:    */   {
/*  56: 78 */     return this.C;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public boolean c()
/*  60:    */   {
/*  61: 82 */     return this.A;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public boolean d()
/*  65:    */   {
/*  66: 86 */     return (!this.A) && (this != v);
/*  67:    */   }
/*  68:    */   
/*  69:    */   public String e()
/*  70:    */   {
/*  71: 90 */     return name().toLowerCase();
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String toString()
/*  75:    */   {
/*  76: 95 */     return this.B;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public static String a(String paramString)
/*  80:    */   {
/*  81:100 */     return paramString == null ? null : x.matcher(paramString).replaceAll("");
/*  82:    */   }
/*  83:    */   
/*  84:    */   public static a b(String paramString)
/*  85:    */   {
/*  86:105 */     if (paramString == null) {
/*  87:106 */       return null;
/*  88:    */     }
/*  89:108 */     return (a)w.get(c(paramString));
/*  90:    */   }
/*  91:    */   
/*  92:    */   public static a a(int paramInt)
/*  93:    */   {
/*  94:113 */     if (paramInt < 0) {
/*  95:114 */       return v;
/*  96:    */     }
/*  97:116 */     for (a locala : values()) {
/*  98:117 */       if (locala.b() == paramInt) {
/*  99:118 */         return locala;
/* 100:    */       }
/* 101:    */     }
/* 102:121 */     return null;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public static Collection a(boolean paramBoolean1, boolean paramBoolean2)
/* 106:    */   {
/* 107:125 */     ArrayList localArrayList = Lists.newArrayList();
/* 108:127 */     for (a locala : values()) {
/* 109:128 */       if ((!locala.d()) || (paramBoolean1)) {
/* 110:131 */         if ((!locala.c()) || (paramBoolean2)) {
/* 111:134 */           localArrayList.add(locala.e());
/* 112:    */         }
/* 113:    */       }
/* 114:    */     }
/* 115:137 */     return localArrayList;
/* 116:    */   }
/* 117:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     a
 * JD-Core Version:    0.7.0.1
 */