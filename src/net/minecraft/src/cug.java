package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.io.IOException;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Map;
/*   6:    */ import java.util.Map.Entry;
/*   7:    */ import org.apache.logging.log4j.LogManager;
/*   8:    */ import org.apache.logging.log4j.Logger;
/*   9:    */ 
/*  10:    */ public class cug
/*  11:    */   implements cuk, cvl
/*  12:    */ {
/*  13: 20 */   private static final Logger a = LogManager.getLogger();
/*  14: 21 */   private final Map<oa,cui> b = Maps.newHashMap();
/*  15: 23 */   private final List<cuk> c = Lists.newArrayList();
/*  16: 24 */   private final Map<String,Integer> d = Maps.newHashMap();
/*  17:    */   private cvk e;
/*  18:    */   
/*  19:    */   public cug(cvk paramcvk)
/*  20:    */   {
/*  21: 29 */     this.e = paramcvk;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void a(oa paramoa)
/*  25:    */   {
/*  26: 33 */     Object localObject = (cui)this.b.get(paramoa);
/*  27: 36 */     if (localObject == null)
/*  28:    */     {
/*  29: 37 */       localObject = new ctv(paramoa);
/*  30: 38 */       a(paramoa, (cui)localObject);
/*  31:    */     }
/*  32: 41 */     cuj.b(((cui)localObject).b());
/*  33:    */   }
/*  34:    */   
/*  35:    */   public boolean a(oa paramoa, cul paramcul)
/*  36:    */   {
/*  37: 45 */     if (a(paramoa, paramcul))
/*  38:    */     {
/*  39: 46 */       this.c.add(paramcul);
/*  40: 47 */       return true;
/*  41:    */     }
/*  42: 50 */     return false;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public boolean a(oa paramoa, cui paramcui)
/*  46:    */   {
/*  47: 54 */     boolean bool = true;
/*  48:    */     try
/*  49:    */     {
/*  50: 56 */       paramcui.a(this.e);
/*  51:    */     }
/*  52:    */     catch (IOException localIOException)
/*  53:    */     {
/*  54: 58 */       a.warn("Failed to load texture: " + paramoa, localIOException);
/*  55: 59 */       paramcui = cuj.a;
/*  56: 60 */       this.b.put(paramoa, paramcui);
/*  57: 61 */       bool = false;
/*  58:    */     }
/*  59:    */     catch (Throwable localThrowable)
/*  60:    */     {
/*  61: 63 */       b localb = net.minecraft.src.b.a(localThrowable, "Registering texture");
/*  62: 64 */       j localj = localb.a("Resource location being registered");
/*  63: 65 */       cui localcui = paramcui;
/*  64:    */       
/*  65: 67 */       localj.a("Resource location", paramoa);
/*  66: 68 */       localj.a("Texture object class", new cuh(this, localcui));
/*  67:    */       
/*  68:    */ 
/*  69:    */ 
/*  70:    */ 
/*  71:    */ 
/*  72:    */ 
/*  73: 75 */       throw new u(localb);
/*  74:    */     }
/*  75: 78 */     this.b.put(paramoa, paramcui);
/*  76:    */     
/*  77: 80 */     return bool;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public cui b(oa paramoa)
/*  81:    */   {
/*  82: 84 */     return (cui)this.b.get(paramoa);
/*  83:    */   }
/*  84:    */   
/*  85:    */   public oa a(String paramString, ctp paramctp)
/*  86:    */   {
/*  87: 89 */     Integer localInteger1 = (Integer)this.d.get(paramString);
/*  88: 90 */     if (localInteger1 == null)
/*  89:    */     {
/*  90: 91 */       localInteger1 = Integer.valueOf(1);
/*  91:    */     }
/*  92:    */     else
/*  93:    */     {
/*  94: 93 */       Integer localObject = localInteger1;Integer localInteger2 = localInteger1 = Integer.valueOf(localInteger1.intValue() + 1);
/*  95:    */     }
/*  96: 95 */     this.d.put(paramString, localInteger1);
/*  97:    */     
/*  98: 97 */     oa localObject = new oa(String.format("dynamic/%s_%d", new Object[] { paramString, localInteger1 }));
/*  99: 98 */     a((oa)localObject, paramctp);
/* 100:    */     
/* 101:100 */     return localObject;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void e()
/* 105:    */   {
/* 106:105 */     for (cuk localcuk : this.c) {
/* 107:106 */       localcuk.e();
/* 108:    */     }
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void c(oa paramoa)
/* 112:    */   {
/* 113:111 */     cui localcui = b(paramoa);
/* 114:112 */     if (localcui != null) {
/* 115:113 */       cuj.a(localcui.b());
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void a(cvk paramcvk)
/* 120:    */   {
/* 121:119 */     for (Map.Entry<oa,cui> localEntry : this.b.entrySet()) {
/* 122:120 */       a((oa)localEntry.getKey(), (cui)localEntry.getValue());
/* 123:    */     }
/* 124:    */   }
/* 125:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cug
 * JD-Core Version:    0.7.0.1
 */