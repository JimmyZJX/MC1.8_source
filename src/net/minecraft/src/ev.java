package net.minecraft.src;
/*  1:   */ import com.google.common.collect.BiMap;
/*  2:   */ import com.google.common.collect.HashBiMap;
/*  3:   */ import java.util.Iterator;
/*  4:   */ import java.util.Map;
/*  5:   */ 
/*  6:   */ public class ev<K,V>
/*  7:   */   extends fb<K,V>
/*  8:   */   implements eq<V>
/*  9:   */ {
/* 10:11 */   protected final er<V> a = new er<V>();
/* 11:   */   protected final Map<V,K> b;
/* 12:   */   
/* 13:   */   public ev()
/* 14:   */   {
/* 15:17 */     this.b = ((BiMap<K,V>)this.c).inverse();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void a(int paramInt, K paramObject1, V paramObject2)
/* 19:   */   {
/* 20:21 */     this.a.a(paramObject2, paramInt);
/* 21:22 */     a(paramObject1, paramObject2);
/* 22:   */   }
/* 23:   */   
/* 24:   */   protected Map<K,V> b()
/* 25:   */   {
/* 26:27 */     return HashBiMap.create();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public V a(K paramObject)
/* 30:   */   {
/* 31:33 */     return super.a(paramObject);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public K c(V paramObject)
/* 35:   */   {
/* 36:38 */     return this.b.get(paramObject);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public boolean d(K paramObject)
/* 40:   */   {
/* 41:43 */     return super.d(paramObject);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public int b(V paramObject)
/* 45:   */   {
/* 46:48 */     return this.a.b(paramObject);
/* 47:   */   }
/* 48:   */   
/* 49:   */   public V a(int paramInt)
/* 50:   */   {
/* 51:54 */     return this.a.a(paramInt);
/* 52:   */   }
/* 53:   */   
/* 54:   */   public Iterator<V> iterator()
/* 55:   */   {
/* 56:59 */     return this.a.iterator();
/* 57:   */   }
/* 58:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ev
 * JD-Core Version:    0.7.0.1
 */