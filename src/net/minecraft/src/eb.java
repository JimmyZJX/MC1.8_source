package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Iterables;
/*  2:   */ import com.google.common.collect.Lists;
/*  3:   */ import java.lang.reflect.Array;
/*  4:   */ import java.util.ArrayList;
/*  5:   */ import java.util.List;
/*  6:   */ 
/*  7:   */ public class eb
/*  8:   */ {
/*  9:   */   public static <E> Iterable<E[]> a(Class<E> paramClass, Iterable<Iterable> paramIterable)
/* 10:   */   {
/* 11:13 */     return new ee<E>(paramClass, (Iterable[])b(Iterable.class, paramIterable), null);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public static <E> Iterable a(Iterable paramIterable)
/* 15:   */   {
/* 16:21 */     return b(a(Object.class, paramIterable));
/* 17:   */   }
/* 18:   */   
/* 19:   */   private static <E> Iterable<List<E>> b(Iterable<E[]> paramIterable)
/* 20:   */   {
/* 21:29 */     return Iterables.transform(paramIterable, new ed<E>(null));
/* 22:   */   }
/* 23:   */   
/* 24:   */   private static <E> E[] b(Class<E> paramClass, Iterable<E> paramIterable)
/* 25:   */   {
/* 26:33 */     ArrayList<E> localArrayList = Lists.newArrayList();
/* 27:34 */     for (E localObject : paramIterable) {
/* 28:35 */       localArrayList.add(localObject);
/* 29:   */     }
/* 30:38 */     return (E[])localArrayList.toArray(b(paramClass, localArrayList.size()));
/* 31:   */   }
/* 32:   */   
/* 33:   */   private static <E> E[] b(Class<E> paramClass, int paramInt)
/* 34:   */   {
/* 35:43 */     return (E[])Array.newInstance(paramClass, paramInt);
/* 36:   */   }
			  static <E> E[] a(Class<E> arg0, int arg1) {return b(arg0,arg1);}
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     eb
 * JD-Core Version:    0.7.0.1
 */