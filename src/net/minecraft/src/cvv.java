package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import com.google.gson.JsonElement;
/*   3:    */ import com.google.gson.JsonObject;
/*   4:    */ import com.google.gson.JsonParser;
/*   5:    */ import java.io.BufferedReader;
/*   6:    */ import java.io.InputStream;
/*   7:    */ import java.io.InputStreamReader;
/*   8:    */ import java.io.Reader;
/*   9:    */ import java.util.Map;
/*  10:    */ import org.apache.commons.io.IOUtils;
/*  11:    */ 
/*  12:    */ public class cvv
/*  13:    */   implements cvj
/*  14:    */ {
/*  15: 17 */   private final Map a = Maps.newHashMap();
/*  16:    */   private final String b;
/*  17:    */   private final oa c;
/*  18:    */   private final InputStream d;
/*  19:    */   private final InputStream e;
/*  20:    */   private final cwk f;
/*  21:    */   private boolean g;
/*  22:    */   private JsonObject h;
/*  23:    */   
/*  24:    */   public cvv(String paramString, oa paramoa, InputStream paramInputStream1, InputStream paramInputStream2, cwk paramcwk)
/*  25:    */   {
/*  26: 27 */     this.b = paramString;
/*  27: 28 */     this.c = paramoa;
/*  28: 29 */     this.d = paramInputStream1;
/*  29: 30 */     this.e = paramInputStream2;
/*  30: 31 */     this.f = paramcwk;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public oa a()
/*  34:    */   {
/*  35: 36 */     return this.c;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public InputStream b()
/*  39:    */   {
/*  40: 41 */     return this.d;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public boolean c()
/*  44:    */   {
/*  45: 46 */     return this.e != null;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public cwi a(String paramString)
/*  49:    */   {
/*  50: 51 */     if (!c()) {
/*  51: 52 */       return null;
/*  52:    */     }
/*  53: 55 */     if ((this.h == null) && (!this.g))
/*  54:    */     {
/*  55: 56 */       this.g = true;
/*  56:    */       
/*  57: 58 */       Reader localObject1 = null;
/*  58:    */       try
/*  59:    */       {
/*  60: 60 */         localObject1 = new BufferedReader(new InputStreamReader(this.e));
/*  61: 61 */         this.h = new JsonParser().parse((Reader)localObject1).getAsJsonObject();
/*  62:    */       }
/*  63:    */       finally
/*  64:    */       {
/*  65: 63 */         IOUtils.closeQuietly((Reader)localObject1);
/*  66:    */       }
/*  67:    */     }
/*  68: 68 */     cwi localObject1 = (cwi)this.a.get(paramString);
/*  69: 69 */     if (localObject1 == null) {
/*  70: 70 */       localObject1 = this.f.a(paramString, this.h);
/*  71:    */     }
/*  72: 72 */     return localObject1;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public String d()
/*  76:    */   {
/*  77: 77 */     return this.b;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean equals(Object paramObject)
/*  81:    */   {
/*  82: 82 */     if (this == paramObject) {
/*  83: 83 */       return true;
/*  84:    */     }
/*  85: 85 */     if (!(paramObject instanceof cvv)) {
/*  86: 86 */       return false;
/*  87:    */     }
/*  88: 89 */     cvv localcvv = (cvv)paramObject;
/*  89: 91 */     if (this.c != null ? !this.c.equals(localcvv.c) : localcvv.c != null) {
/*  90: 92 */       return false;
/*  91:    */     }
/*  92: 94 */     if (this.b != null ? !this.b.equals(localcvv.b) : localcvv.b != null) {
/*  93: 95 */       return false;
/*  94:    */     }
/*  95: 98 */     return true;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public int hashCode()
/*  99:    */   {
/* 100:103 */     int i = this.b != null ? this.b.hashCode() : 0;
/* 101:104 */     i = 31 * i + (this.c != null ? this.c.hashCode() : 0);
/* 102:105 */     return i;
/* 103:    */   }
/* 104:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cvv
 * JD-Core Version:    0.7.0.1
 */