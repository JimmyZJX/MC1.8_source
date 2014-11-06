package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import com.google.gson.Gson;
/*  3:   */ import com.google.gson.GsonBuilder;
/*  4:   */ import java.io.Reader;
/*  5:   */ import java.util.Collection;
/*  6:   */ import java.util.List;
/*  7:   */ import java.util.Map;
/*  8:   */ 
/*  9:   */ public class cmh
/* 10:   */ {
/* 11:19 */   static final Gson a = new GsonBuilder().registerTypeAdapter(cmh.class, new cmi()).registerTypeAdapter(cmk.class, new cml()).create();
/* 12:24 */   private final Map<String,cmm> b = Maps.newHashMap();
/* 13:   */   
/* 14:   */   public static cmh a(Reader paramReader)
/* 15:   */   {
/* 16:27 */     return (cmh)a.fromJson(paramReader, cmh.class);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public cmh(Collection<cmm> paramCollection)
/* 20:   */   {
/* 21:35 */     for (cmm localcmm : paramCollection) {
/* 22:36 */       this.b.put(cmm.a(localcmm), localcmm);
/* 23:   */     }
/* 24:   */   }
/* 25:   */   
/* 26:   */   public cmh(List<cmh> paramList)
/* 27:   */   {
/* 28:41 */     for (cmh localcmh : paramList) {
/* 29:42 */       this.b.putAll(localcmh.b);
/* 30:   */     }
/* 31:   */   }
/* 32:   */   
/* 33:   */   public cmm b(String paramString)
/* 34:   */   {
/* 35:51 */     cmm localcmm = (cmm)this.b.get(paramString);
/* 36:52 */     if (localcmm == null) {
/* 37:53 */       throw new cmj(this);
/* 38:   */     }
/* 39:55 */     return localcmm;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean equals(Object paramObject)
/* 43:   */   {
/* 44:60 */     if (this == paramObject) {
/* 45:61 */       return true;
/* 46:   */     }
/* 47:63 */     if ((paramObject instanceof cmh))
/* 48:   */     {
/* 49:64 */       cmh localcmh = (cmh)paramObject;
/* 50:65 */       return this.b.equals(localcmh.b);
/* 51:   */     }
/* 52:67 */     return false;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public int hashCode()
/* 56:   */   {
/* 57:72 */     return this.b.hashCode();
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmh
 * JD-Core Version:    0.7.0.1
 */