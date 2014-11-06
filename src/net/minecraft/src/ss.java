package net.minecraft.src;
/*   1:    */ import com.google.common.base.Charsets;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import com.google.common.collect.Maps;
/*   4:    */ import com.google.common.io.Files;
/*   5:    */ import com.google.gson.Gson;
/*   6:    */ import com.google.gson.GsonBuilder;
/*   7:    */ import com.google.gson.JsonObject;

/*   8:    */ import java.io.BufferedWriter;
/*   9:    */ import java.io.File;
/*  10:    */ import java.io.IOException;
/*  11:    */ import java.lang.reflect.ParameterizedType;
/*  12:    */ import java.util.ArrayList;
/*  13:    */ import java.util.Collection;
/*  14:    */ import java.util.Iterator;
/*  15:    */ import java.util.List;
/*  16:    */ import java.util.Map;
/*  17:    */ import java.util.Set;

/*  18:    */ import org.apache.commons.io.IOUtils;
/*  19:    */ import org.apache.logging.log4j.LogManager;
/*  20:    */ import org.apache.logging.log4j.Logger;
/*  21:    */ 
/*  22:    */ public class ss<E extends sr>
/*  23:    */ {
/*  24: 20 */   protected static final Logger a = LogManager.getLogger();
/*  25:    */   protected final Gson b;
/*  26:    */   private final File c;
/*  27: 23 */   private final Map<String, E> d = Maps.newHashMap();
/*  28: 24 */   private boolean e = true;
/*  29:    */   
/*  30:    */   public ss(File paramFile)
/*  31:    */   {
/*  32: 27 */     this.c = paramFile;
/*  33: 28 */     GsonBuilder localGsonBuilder = new GsonBuilder().setPrettyPrinting();
/*  34: 29 */     localGsonBuilder.registerTypeHierarchyAdapter(sr.class, new su(this, null));
/*  35: 30 */     this.b = localGsonBuilder.create();
/*  36:    */   }
/*  37:    */   
/*  38:    */   public boolean b()
/*  39:    */   {
/*  40: 34 */     return this.e;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void a(boolean paramBoolean)
/*  44:    */   {
/*  45: 38 */     this.e = paramBoolean;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void a(E paramsr)
/*  49:    */   {
/*  50: 46 */     this.d.put(a(paramsr.f()), paramsr);
/*  51:    */     try
/*  52:    */     {
/*  53: 48 */       f();
/*  54:    */     }
/*  55:    */     catch (IOException localIOException)
/*  56:    */     {
/*  57: 50 */       a.warn("Could not save the list after adding a user.", localIOException);
/*  58:    */     }
/*  59:    */   }
/*  60:    */   
/*  61:    */   public sr b(Object paramObject)
/*  62:    */   {
/*  63: 55 */     h();
/*  64: 56 */     return this.d.get(a(paramObject));
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void c(Object paramObject)
/*  68:    */   {
/*  69: 60 */     this.d.remove(a(paramObject));
/*  70:    */     try
/*  71:    */     {
/*  72: 62 */       f();
/*  73:    */     }
/*  74:    */     catch (IOException localIOException)
/*  75:    */     {
/*  76: 64 */       a.warn("Could not save the list after removing a user.", localIOException);
/*  77:    */     }
/*  78:    */   }
/*  79:    */   
/*  80:    */   public String[] a()
/*  81:    */   {
/*  82: 73 */     return this.d.keySet().toArray(new String[this.d.size()]);
/*  83:    */   }
/*  84:    */   
/*  85:    */   protected String a(Object paramObject)
/*  86:    */   {
/*  87: 81 */     return paramObject.toString();
/*  88:    */   }
/*  89:    */   
/*  90:    */   protected boolean d(Object paramObject)
/*  91:    */   {
/*  92: 85 */     return this.d.containsKey(a(paramObject));
/*  93:    */   }
/*  94:    */   
/*  95:    */   private void h()
/*  96:    */   {
/*  97: 89 */     ArrayList<Object> localArrayList = Lists.newArrayList();
/*  98: 90 */     for (Iterator<E> localIterator = this.d.values().iterator(); localIterator.hasNext();)
/*  99:    */     {
/* 100: 90 */       E localObject = localIterator.next();
/* 101: 91 */       if ((localObject).e()) {
/* 102: 92 */         localArrayList.add(localObject.f());
/* 103:    */       }
/* 104:    */     }
/* 105:    */     Object localObject;
/* 106: 95 */     for (Iterator<Object> localIterator = localArrayList.iterator(); localIterator.hasNext();)
/* 107:    */     {
/* 108: 95 */       localObject = localIterator.next();
/* 109: 96 */       this.d.remove(localObject);
/* 110:    */     }
/* 111:    */   }
/* 112:    */   
/* 113:    */   protected sr a(JsonObject paramJsonObject)
/* 114:    */   {
/* 115:101 */     return new sr((Object)null, paramJsonObject);
/* 116:    */   }
/* 117:    */   
/* 118:    */   protected Map<String, E> e()
/* 119:    */   {
/* 120:105 */     return this.d;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void f() throws IOException
/* 124:    */   {
/* 125:109 */     Collection<E> localCollection = this.d.values();
/* 126:110 */     String str = this.b.toJson(localCollection);
/* 127:111 */     BufferedWriter localBufferedWriter = null;
/* 128:    */     try
/* 129:    */     {
/* 130:113 */       localBufferedWriter = Files.newWriter(this.c, Charsets.UTF_8);
/* 131:114 */       localBufferedWriter.write(str);
/* 132:    */     }
/* 133:    */     finally
/* 134:    */     {
/* 135:116 */       IOUtils.closeQuietly(localBufferedWriter);
/* 136:    */     }
/* 137:    */   }
/* 138:    */   
/* 139:158 */   private static final ParameterizedType f = new st();
/* 140:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ss
 * JD-Core Version:    0.7.0.1
 */