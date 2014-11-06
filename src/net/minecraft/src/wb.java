package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.lang.management.ManagementFactory;
/*   3:    */ import java.lang.management.RuntimeMXBean;
/*   4:    */ import java.net.MalformedURLException;
/*   5:    */ import java.net.URL;
/*   6:    */ import java.util.Iterator;
/*   7:    */ import java.util.LinkedHashMap;
/*   8:    */ import java.util.List;
/*   9:    */ import java.util.Map;
/*  12:    */ import java.util.Timer;
/*  13:    */ import java.util.UUID;
/*  14:    */ 
/*  15:    */ public class wb
/*  16:    */ {
/*  17: 18 */   private final Map<String,Object> a = Maps.newHashMap();
/*  18: 19 */   private final Map<String,Object> b = Maps.newHashMap();
/*  19: 21 */   private final String c = UUID.randomUUID().toString();
/*  20:    */   private final URL d;
/*  21:    */   private final wd e;
/*  22: 24 */   private final Timer f = new Timer("Snooper Timer", true);
/*  23: 25 */   private final Object g = new Object();
/*  24:    */   private final long h;
/*  25:    */   private boolean i;
/*  26:    */   private int j;
/*  27:    */   
/*  28:    */   public wb(String paramString, wd paramwd, long paramLong)
/*  29:    */   {
/*  30:    */     try
/*  31:    */     {
/*  32: 32 */       this.d = new URL("http://snoop.minecraft.net/" + paramString + "?version=" + 2);
/*  33:    */     }
/*  34:    */     catch (MalformedURLException localMalformedURLException)
/*  35:    */     {
/*  36: 34 */       throw new IllegalArgumentException();
/*  37:    */     }
/*  38: 37 */     this.e = paramwd;
/*  39: 38 */     this.h = paramLong;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void a()
/*  43:    */   {
/*  44: 42 */     if (this.i) {
/*  45: 43 */       return;
/*  46:    */     }
/*  47: 45 */     this.i = true;
/*  48:    */     
/*  49: 47 */     h();
/*  50:    */     
/*  51: 49 */     this.f.schedule(new wc(this), 0L, 900000L);
/*  52:    */   }
/*  53:    */   
/*  54:    */   private void h()
/*  55:    */   {
/*  56: 72 */     i();
/*  57:    */     
/*  58: 74 */     a("snooper_token", this.c);
/*  59: 75 */     b("snooper_token", this.c);
/*  60: 76 */     b("os_name", System.getProperty("os.name"));
/*  61: 77 */     b("os_version", System.getProperty("os.version"));
/*  62: 78 */     b("os_architecture", System.getProperty("os.arch"));
/*  63: 79 */     b("java_version", System.getProperty("java.version"));
/*  64: 80 */     b("version", "1.8");
/*  65:    */     
/*  66: 82 */     this.e.b(this);
/*  67:    */   }
/*  68:    */   
/*  69:    */   private void i()
/*  70:    */   {
/*  71: 86 */     RuntimeMXBean localRuntimeMXBean = ManagementFactory.getRuntimeMXBean();
/*  72: 87 */     List<String> localList = localRuntimeMXBean.getInputArguments();
/*  73: 88 */     int k = 0;
/*  74: 90 */     for (String str : localList) {
/*  75: 91 */       if (str.startsWith("-X")) {
/*  76: 92 */         a("jvm_arg[" + k++ + "]", str);
/*  77:    */       }
/*  78:    */     }
/*  79: 96 */     a("jvm_args", Integer.valueOf(k));
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void b()
/*  83:    */   {
/*  84:100 */     b("memory_total", Long.valueOf(Runtime.getRuntime().totalMemory()));
/*  85:101 */     b("memory_max", Long.valueOf(Runtime.getRuntime().maxMemory()));
/*  86:102 */     b("memory_free", Long.valueOf(Runtime.getRuntime().freeMemory()));
/*  87:103 */     b("cpu_cores", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
/*  88:    */     
/*  89:105 */     this.e.a(this);
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void a(String paramString, Object paramObject)
/*  93:    */   {
/*  94:109 */     synchronized (this.g)
/*  95:    */     {
/*  96:110 */       this.b.put(paramString, paramObject);
/*  97:    */     }
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void b(String paramString, Object paramObject)
/* 101:    */   {
/* 102:115 */     synchronized (this.g)
/* 103:    */     {
/* 104:116 */       this.a.put(paramString, paramObject);
/* 105:    */     }
/* 106:    */   }
/* 107:    */   
/* 108:    */   public Map<String,String> c()
/* 109:    */   {
/* 110:121 */     LinkedHashMap<String,String> localLinkedHashMap = Maps.newLinkedHashMap();
/* 111:    */     Iterator<Map.Entry<String,Object>> localIterator;
/* 112:    */     Map.Entry<String,Object> localEntry;
/* 113:123 */     synchronized (this.g)
/* 114:    */     {
/* 115:124 */       b();
/* 116:126 */       for (localIterator = this.a.entrySet().iterator(); localIterator.hasNext();)
/* 117:    */       {
/* 118:126 */         localEntry = localIterator.next();
/* 119:127 */         localLinkedHashMap.put(localEntry.getKey(), localEntry.getValue().toString());
/* 120:    */       }
/* 121:130 */       for (localIterator = this.b.entrySet().iterator(); localIterator.hasNext();)
/* 122:    */       {
/* 123:130 */         localEntry = localIterator.next();
/* 124:131 */         localLinkedHashMap.put(localEntry.getKey(), localEntry.getValue().toString());
/* 125:    */       }
/* 126:    */     }
/* 127:135 */     return localLinkedHashMap;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public boolean d()
/* 131:    */   {
/* 132:139 */     return this.i;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void e()
/* 136:    */   {
/* 137:143 */     this.f.cancel();
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String f()
/* 141:    */   {
/* 142:147 */     return this.c;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public long g()
/* 146:    */   {
/* 147:151 */     return this.h;
/* 148:    */   }
				static wd a(wb arg0) {return arg0.e;}
				static Object b(wb arg0) {return arg0.g;}
				static Map<String,Object> c(wb arg0) {return arg0.b;}
				static int d(wb arg0) {return arg0.j;}
				static Map<String,Object> e(wb arg0) {return arg0.a;}
				static int f(wb arg0) {return arg0.j++;}
				static String g(wb arg0) {return arg0.c;}
				static URL h(wb arg0) {return arg0.d;}
/* 149:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wb
 * JD-Core Version:    0.7.0.1
 */