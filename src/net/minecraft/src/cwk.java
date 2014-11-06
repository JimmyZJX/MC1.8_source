package net.minecraft.src;
/*  1:   */ import com.google.gson.Gson;
/*  2:   */ import com.google.gson.GsonBuilder;
/*  3:   */ import com.google.gson.JsonElement;
/*  4:   */ import com.google.gson.JsonObject;
/*  5:   */ 
/*  6:   */ public class cwk
/*  7:   */ {
/*  8:13 */   private final ez a = new fb();
/*  9:14 */   private final GsonBuilder b = new GsonBuilder();
/* 10:   */   private Gson c;
/* 11:   */   
/* 12:   */   public cwk()
/* 13:   */   {
/* 14:18 */     this.b.registerTypeHierarchyAdapter(ho.class, new hp());
/* 15:19 */     this.b.registerTypeHierarchyAdapter(hv.class, new hx());
/* 16:20 */     this.b.registerTypeAdapterFactory(new ut());
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(cwj paramcwj, Class paramClass)
/* 20:   */   {
/* 21:24 */     this.a.a(paramcwj.a(), new cwm(this, paramcwj, paramClass, null));
/* 22:25 */     this.b.registerTypeAdapter(paramClass, paramcwj);
/* 23:26 */     this.c = null;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public cwi a(String paramString, JsonObject paramJsonObject)
/* 27:   */   {
/* 28:30 */     if (paramString == null) {
/* 29:31 */       throw new IllegalArgumentException("Metadata section name cannot be null");
/* 30:   */     }
/* 31:33 */     if (!paramJsonObject.has(paramString)) {
/* 32:34 */       return null;
/* 33:   */     }
/* 34:36 */     if (!paramJsonObject.get(paramString).isJsonObject()) {
/* 35:37 */       throw new IllegalArgumentException("Invalid metadata for '" + paramString + "' - expected object, found " + paramJsonObject.get(paramString));
/* 36:   */     }
/* 37:40 */     cwm localcwm = (cwm)this.a.a(paramString);
/* 38:41 */     if (localcwm == null) {
/* 39:42 */       throw new IllegalArgumentException("Don't know how to handle metadata section '" + paramString + "'");
/* 40:   */     }
/* 41:45 */     return (cwi)a().fromJson(paramJsonObject.getAsJsonObject(paramString), localcwm.b);
/* 42:   */   }
/* 43:   */   
/* 44:   */   private Gson a()
/* 45:   */   {
/* 46:49 */     if (this.c == null) {
/* 47:50 */       this.c = this.b.create();
/* 48:   */     }
/* 49:52 */     return this.c;
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cwk
 * JD-Core Version:    0.7.0.1
 */