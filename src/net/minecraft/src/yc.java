package net.minecraft.src;
/*  1:   */ import com.google.common.collect.HashMultimap;
/*  2:   */ import com.google.common.collect.Maps;
/*  3:   */ import com.google.common.collect.Multimap;
/*  4:   */ import java.util.Collection;
/*  5:   */ import java.util.Map;
/*  7:   */ 
/*  8:   */ public abstract class yc
/*  9:   */ {
/* 10:12 */   protected final Map<xy,xz> a = Maps.newHashMap();
/* 11:13 */   protected final Map<String,xz> b = new StringLinkedHashMap<xz>();
/* 12:14 */   protected final Multimap<xy,xy> c = HashMultimap.create();
/* 13:   */   
/* 14:   */   public xz a(xy paramxy)
/* 15:   */   {
/* 16:17 */     return this.a.get(paramxy);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public xz a(String paramString)
/* 20:   */   {
/* 21:21 */     return this.b.get(paramString);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public xz b(xy paramxy)
/* 25:   */   {
/* 26:25 */     if (this.b.containsKey(paramxy.a())) {
/* 27:26 */       throw new IllegalArgumentException("Attribute is already registered!");
/* 28:   */     }
/* 29:29 */     xz localxz = c(paramxy);
/* 30:30 */     this.b.put(paramxy.a(), localxz);
/* 31:31 */     this.a.put(paramxy, localxz);
/* 32:   */     
/* 33:33 */     xy localxy = paramxy.d();
/* 34:34 */     while (localxy != null)
/* 35:   */     {
/* 36:35 */       this.c.put(localxy, paramxy);
/* 37:36 */       localxy = localxy.d();
/* 38:   */     }
/* 39:39 */     return localxz;
/* 40:   */   }
/* 41:   */   
/* 42:   */   protected abstract xz c(xy paramxy);
/* 43:   */   
/* 44:   */   public Collection<xz> a()
/* 45:   */   {
/* 46:45 */     return this.b.values();
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void a(xz paramxz) {}
/* 50:   */   
/* 51:   */   public void a(Multimap<String,ya> paramMultimap)
/* 52:   */   {
/* 53:52 */     for (Map.Entry<String,ya> localEntry : paramMultimap.entries())
/* 54:   */     {
/* 55:53 */       xz localxz = a(localEntry.getKey());
/* 56:55 */       if (localxz != null) {
/* 57:56 */         localxz.c(localEntry.getValue());
/* 58:   */       }
/* 59:   */     }
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void b(Multimap<String,ya> paramMultimap)
/* 63:   */   {
/* 64:62 */     for (Map.Entry<String,ya> localEntry : paramMultimap.entries())
/* 65:   */     {
/* 66:63 */       xz localxz = a(localEntry.getKey());
/* 67:65 */       if (localxz != null)
/* 68:   */       {
/* 69:66 */         localxz.c(localEntry.getValue());
/* 70:67 */         localxz.b(localEntry.getValue());
/* 71:   */       }
/* 72:   */     }
/* 73:   */   }
/* 74:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yc
 * JD-Core Version:    0.7.0.1
 */