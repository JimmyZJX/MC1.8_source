package net.minecraft.src;
/*  1:   */ import com.google.common.collect.HashMultimap;
/*  2:   */ import com.google.common.collect.Multimap;
/*  3:   */ import com.google.common.collect.Sets;
/*  4:   */ import java.util.AbstractSet;
/*  6:   */ import java.util.Iterator;
/*  7:   */ import java.util.Set;
/*  8:   */ import org.apache.commons.lang3.ClassUtils;
/* 10:   */ 
/* 11:   */ public class MyList<E>
/* 12:   */   extends AbstractSet<E>
/* 13:   */ {
/* 14:12 */   private final Multimap<Class<?>,E> a = HashMultimap.create();
/* 15:13 */   private final Set<Class<?>> b = Sets.newIdentityHashSet();
/* 16:   */   private final Class<E> c;
/* 17:   */   
/* 18:   */   public MyList(Class<E> paramClass)
/* 19:   */   {
/* 20:17 */     this.c = paramClass;
/* 21:18 */     this.b.add(paramClass);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void a(Class<?> paramClass)
/* 25:   */   {
/* 26:23 */     for (E localObject : this.a.get(a(paramClass, false))) {
/* 27:24 */       if (paramClass.isAssignableFrom(localObject.getClass())) {
/* 28:25 */         this.a.put(paramClass, localObject);
/* 29:   */       }
/* 30:   */     }
/* 31:29 */     this.b.add(paramClass);
/* 32:   */   }
/* 33:   */   
/* 34:   */   protected Class<?> a(Class<?> paramClass, boolean paramBoolean)
/* 35:   */   {
/* 36:33 */     for (Class<?> localClass : ClassUtils.hierarchy(paramClass, ClassUtils.Interfaces.INCLUDE)) {
/* 37:34 */       if (this.b.contains(localClass))
/* 38:   */       {
/* 39:35 */         if ((localClass == this.c) && (paramBoolean)) {
/* 40:36 */           a(paramClass);
/* 41:   */         }
/* 42:38 */         return localClass;
/* 43:   */       }
/* 44:   */     }
/* 45:41 */     throw new IllegalArgumentException("Don't know how to search for " + paramClass);
/* 46:   */   }
/* 47:   */   
/* 48:   */   public boolean add(E paramObject)
/* 49:   */   {
/* 50:46 */     for (Class<?> localClass : this.b) {
/* 51:47 */       if (localClass.isAssignableFrom(paramObject.getClass())) {
/* 52:48 */         this.a.put(localClass, paramObject);
/* 53:   */       }
/* 54:   */     }
/* 55:52 */     return true;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public boolean remove(Object paramObject)
/* 59:   */   {
/* 60:58 */     Object localObject = paramObject;
/* 61:59 */     boolean bool = false;
/* 62:61 */     for (Class<?> localClass : this.b) {
/* 63:62 */       if (localClass.isAssignableFrom(localObject.getClass())) {
/* 64:63 */         bool |= this.a.remove(localClass, localObject);
/* 65:   */       }
/* 66:   */     }
/* 67:67 */     return bool;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public <T extends E> Iterable<T> b(Class<T> paramClass)
/* 71:   */   {
/* 72:71 */     return new ud<T,E>(this, paramClass);
/* 73:   */   }
/* 74:   */   
/* 75:   */   public Iterator<E> iterator()
/* 76:   */   {
/* 77:83 */     Iterator<E> localIterator = this.a.get(this.c).iterator();
/* 78:84 */     return new ue<E>(this, localIterator);
/* 79:   */   }
/* 80:   */   
/* 81:   */   public int size()
/* 82:   */   {
/* 83:97 */     return this.a.get(this.c).size();
/* 84:   */   }
			  static <E> Multimap<Class<?>,E> a(MyList<E> paramuc)
			  {
				  return paramuc.a;
			  }
/* 85:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     uc
 * JD-Core Version:    0.7.0.1
 */