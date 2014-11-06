package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.Collections;
/*   5:    */ import java.util.Iterator;
/*   6:    */ import java.util.List;
/*   7:    */ import java.util.Map;
/*   8:    */ import java.util.Set;
/*   9:    */ import org.apache.logging.log4j.LogManager;
/*  10:    */ import org.apache.logging.log4j.Logger;
/*  11:    */ 
/*  12:    */ public class uw
/*  13:    */ {
/*  14: 13 */   private static final Logger b = LogManager.getLogger();
/*  15:    */   private final List c;
/*  16:    */   private final List d;
/*  17:    */   public boolean a;
/*  18:    */   private String e;
/*  19:    */   private final Map f;
/*  20:    */   
/*  21:    */   public uw()
/*  22:    */   {
/*  23: 14 */     this.c = Lists.newArrayList();
/*  24: 15 */     this.d = Lists.newArrayList();
/*  25:    */     
/*  26: 17 */     this.e = "";
/*  27: 18 */     this.f = Maps.newHashMap();
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void a()
/*  31:    */   {
/*  32: 48 */     this.f.clear();
/*  33: 49 */     this.e = "";
/*  34: 50 */     this.c.clear();
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void a(String paramString)
/*  38:    */   {
/*  39: 54 */     if (!this.a) {
/*  40: 55 */       return;
/*  41:    */     }
/*  42: 57 */     if (this.e.length() > 0) {
/*  43: 58 */       this.e += ".";
/*  44:    */     }
/*  45: 60 */     this.e += paramString;
/*  46: 61 */     this.c.add(this.e);
/*  47: 62 */     this.d.add(Long.valueOf(System.nanoTime()));
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void b()
/*  51:    */   {
/*  52: 66 */     if (!this.a) {
/*  53: 67 */       return;
/*  54:    */     }
/*  55: 69 */     long l1 = System.nanoTime();
/*  56: 70 */     long l2 = ((Long)this.d.remove(this.d.size() - 1)).longValue();
/*  57: 71 */     this.c.remove(this.c.size() - 1);
/*  58: 72 */     long l3 = l1 - l2;
/*  59: 74 */     if (this.f.containsKey(this.e)) {
/*  60: 75 */       this.f.put(this.e, Long.valueOf(((Long)this.f.get(this.e)).longValue() + l3));
/*  61:    */     } else {
/*  62: 77 */       this.f.put(this.e, Long.valueOf(l3));
/*  63:    */     }
/*  64: 80 */     if (l3 > 100000000L) {
/*  65: 81 */       b.warn("Something's taking too long! '" + this.e + "' took aprox " + l3 / 1000000.0D + " ms");
/*  66:    */     }
/*  67: 84 */     this.e = (!this.c.isEmpty() ? (String)this.c.get(this.c.size() - 1) : "");
/*  68:    */   }
/*  69:    */   
/*  70:    */   public List b(String paramString)
/*  71:    */   {
/*  72: 88 */     if (!this.a) {
/*  73: 89 */       return null;
/*  74:    */     }
/*  75: 92 */     String str1 = paramString;
/*  76: 93 */     long l1 = this.f.containsKey("root") ? ((Long)this.f.get("root")).longValue() : 0L;
/*  77: 94 */     long l2 = this.f.containsKey(paramString) ? ((Long)this.f.get(paramString)).longValue() : -1L;
/*  78:    */     
/*  79: 96 */     ArrayList localArrayList = Lists.newArrayList();
/*  80: 98 */     if (paramString.length() > 0) {
/*  81: 99 */       paramString = paramString + ".";
/*  82:    */     }
/*  83:101 */     long l3 = 0L;
/*  84:103 */     for (Iterator localIterator = this.f.keySet().iterator(); localIterator.hasNext();)
/*  85:    */     {
/*  86:103 */       String localObject = (String)localIterator.next();
/*  87:104 */       if ((((String)localObject).length() > paramString.length()) && (((String)localObject).startsWith(paramString)) && (((String)localObject).indexOf(".", paramString.length() + 1) < 0)) {
/*  88:105 */         l3 += ((Long)this.f.get(localObject)).longValue();
/*  89:    */       }
/*  90:    */     }
/*  91:109 */     float f1 = (float)l3;
/*  92:110 */     if (l3 < l2) {
/*  93:111 */       l3 = l2;
/*  94:    */     }
/*  95:113 */     if (l1 < l3) {
/*  96:114 */       l1 = l3;
/*  97:    */     }
/*  98:117 */     for (Iterator<String> localObject = this.f.keySet().iterator(); localObject.hasNext();)
/*  99:    */     {
/* 100:117 */       String str2 = localObject.next();
/* 101:118 */       if ((str2.length() > paramString.length()) && (str2.startsWith(paramString)) && (str2.indexOf(".", paramString.length() + 1) < 0))
/* 102:    */       {
/* 103:119 */         long l4 = ((Long)this.f.get(str2)).longValue();
/* 104:120 */         double d1 = l4 * 100.0D / l3;
/* 105:121 */         double d2 = l4 * 100.0D / l1;
/* 106:122 */         String str3 = str2.substring(paramString.length());
/* 107:123 */         localArrayList.add(new ux(str3, d1, d2));
/* 108:    */       }
/* 109:    */     }
/* 110:    */     String str2;
/* 111:127 */     for (Iterator<String> localObject = this.f.keySet().iterator(); ((Iterator)localObject).hasNext();)
/* 112:    */     {
/* 113:127 */       str2 = (String)((Iterator)localObject).next();
/* 114:128 */       this.f.put(str2, Long.valueOf(((Long)this.f.get(str2)).longValue() * 999L / 1000L));
/* 115:    */     }
/* 116:131 */     if ((float)l3 > f1) {
/* 117:132 */       localArrayList.add(new ux("unspecified", ((float)l3 - f1) * 100.0D / l3, ((float)l3 - f1) * 100.0D / l1));
/* 118:    */     }
/* 119:135 */     Collections.sort(localArrayList);
/* 120:136 */     localArrayList.add(0, new ux(str1, 100.0D, l3 * 100.0D / l1));
/* 121:137 */     return localArrayList;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void c(String paramString)
/* 125:    */   {
/* 126:141 */     b();
/* 127:142 */     a(paramString);
/* 128:    */   }
/* 129:    */   
/* 130:    */   public String c()
/* 131:    */   {
/* 132:146 */     return this.c.size() == 0 ? "[UNKNOWN]" : (String)this.c.get(this.c.size() - 1);
/* 133:    */   }
/* 134:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     uw
 * JD-Core Version:    0.7.0.1
 */