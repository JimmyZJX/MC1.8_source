package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicates;
/*  2:   */ import com.google.common.collect.Iterators;
/*  3:   */ import com.google.common.collect.Lists;
/*  4:   */ import java.util.IdentityHashMap;
/*  5:   */ import java.util.Iterator;
/*  6:   */ import java.util.List;
/*  7:   */ 
/*  8:   */ public class er<E>
/*  9:   */   implements eq<E>
/* 10:   */ {
/* 11:15 */   private final IdentityHashMap<E,Integer> a = new IdentityHashMap<E,Integer>(512);
/* 12:16 */   private final List<E> b = Lists.newArrayList();
/* 13:   */   
/* 14:   */   public void a(E paramObject, int paramInt)
/* 15:   */   {
/* 16:19 */     this.a.put(paramObject, Integer.valueOf(paramInt));
/* 17:22 */     while (this.b.size() <= paramInt) {
/* 18:23 */       this.b.add(null);
/* 19:   */     }
/* 20:26 */     this.b.set(paramInt, paramObject);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public int b(E paramObject)
/* 24:   */   {
/* 25:31 */     Integer localInteger = this.a.get(paramObject);
/* 26:32 */     return localInteger == null ? -1 : localInteger.intValue();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public final E a(int paramInt)
/* 30:   */   {
/* 31:38 */     if ((paramInt >= 0) && (paramInt < this.b.size())) {
/* 32:39 */       return this.b.get(paramInt);
/* 33:   */     }
/* 34:42 */     return null;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public Iterator<E> iterator()
/* 38:   */   {
/* 39:47 */     return Iterators.filter(this.b.iterator(), Predicates.notNull());
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     er
 * JD-Core Version:    0.7.0.1
 */