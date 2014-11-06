package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Iterator;
/*  3:   */ import java.util.Map;
/*  4:   */ import java.util.NoSuchElementException;
/*  5:   */ 
/*  6:   */ public class eu
/*  7:   */ {
/*  8:   */   public static <K,V> Map<K,V> b(Iterable<K> paramIterable1, Iterable<V> paramIterable2)
/*  9:   */   {
/* 10:15 */     return a(paramIterable1, paramIterable2, Maps.<K,V>newLinkedHashMap());
/* 11:   */   }
/* 12:   */   
/* 13:   */   public static <K,V> Map<K,V> a(Iterable<K> paramIterable1, Iterable<V> paramIterable2, Map<K,V> paramMap)
/* 14:   */   {
/* 15:19 */     Iterator<V> localIterator1 = paramIterable2.iterator();
/* 16:20 */     for (K localObject : paramIterable1) {
/* 17:21 */       paramMap.put(localObject, localIterator1.next());
/* 18:   */     }
/* 19:24 */     if (localIterator1.hasNext()) {
/* 20:25 */       throw new NoSuchElementException();
/* 21:   */     }
/* 22:28 */     return paramMap;
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     eu
 * JD-Core Version:    0.7.0.1
 */