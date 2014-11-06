package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ import com.google.common.base.Predicates;
/*  3:   */ import com.google.common.collect.Collections2;
/*  4:   */ import com.google.common.collect.ImmutableSet;
/*  5:   */ import com.google.common.collect.Lists;
/*  6:   */ import com.google.common.collect.Maps;
/*  7:   */ import java.util.Collection;
/*  8:   */ import java.util.Map;
/*  9:   */ 
/* 10:   */ public class bev<E extends Enum<E>>
/* 11:   */   extends bes<E>
/* 12:   */ {
/* 13:   */   private final ImmutableSet<E> a;
/* 14:16 */   private final Map<String,E> b = Maps.newHashMap();
/* 15:   */   
/* 16:   */   protected bev(String paramString, Class<E> paramClass, Collection<E> paramCollection)
/* 17:   */   {
/* 18:19 */     super(paramString, paramClass);
/* 19:20 */     this.a = ImmutableSet.copyOf(paramCollection);
/* 20:22 */     for (E localEnum : paramCollection)
/* 21:   */     {
/* 22:23 */       String str = ((va)localEnum).l();
/* 23:24 */       if (this.b.containsKey(str)) {
/* 24:25 */         throw new IllegalArgumentException("Multiple values have the same name '" + str + "'");
/* 25:   */       }
/* 26:27 */       this.b.put(str, localEnum);
/* 27:   */     }
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Collection<E> c()
/* 31:   */   {
/* 32:33 */     return this.a;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String a(E paramEnum)
/* 36:   */   {
/* 37:43 */     return ((va)paramEnum).l();
/* 38:   */   }
/* 39:   */   
/* 40:   */   public static <T extends Enum<T>> bev<T> a(String paramString, Class<T> paramClass)
/* 41:   */   {
/* 42:47 */     return a(paramString, paramClass, Predicates.<T>alwaysTrue());
/* 43:   */   }
/* 44:   */   
/* 45:   */   public static <T extends Enum<T>> bev<T> a(String paramString, Class<T> paramClass, Predicate<T> paramPredicate)
/* 46:   */   {
/* 47:51 */     return a(paramString, paramClass, Collections2.filter(Lists.newArrayList(paramClass.getEnumConstants()), paramPredicate));
/* 48:   */   }
/* 49:   */   
/* 50:   */   public static <T extends Enum<T>> bev<T> a(String paramString, Class<T> paramClass, T... paramVarArgs)
/* 51:   */   {
/* 52:55 */     return a(paramString, paramClass, Lists.newArrayList(paramVarArgs));
/* 53:   */   }
/* 54:   */   
/* 55:   */   public static <T extends Enum<T>> bev<T> a(String paramString, Class<T> paramClass, Collection<T> paramCollection)
/* 56:   */   {
/* 57:59 */     return new bev<T>(paramString, paramClass, paramCollection);
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bev
 * JD-Core Version:    0.7.0.1
 */