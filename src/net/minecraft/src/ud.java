package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Iterators;
/*  2:   */ import com.google.common.collect.Multimap;
/*  3:   */ import java.util.Collection;
/*  4:   */ import java.util.Iterator;
/*  5:   */ 
/*  6:   */ class ud<T extends E,E>
/*  7:   */   implements Iterable<T>
/*  8:   */ {
			  private final Class<T> a;
			  private final MyList<E> b;
/*  9:   */   ud(MyList<E> paramuc, Class<T> paramClass) {a=paramClass;b=paramuc;}
/* 10:   */   
/* 11:   */   public Iterator<T> iterator()
/* 12:   */   {
/* 13:74 */     Iterator<E> localIterator = MyList.a(this.b).get(this.b.a(this.a, true)).iterator();
/* 14:75 */     return Iterators.filter(localIterator, this.a);
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ud
 * JD-Core Version:    0.7.0.1
 */