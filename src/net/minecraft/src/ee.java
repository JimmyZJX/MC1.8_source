package net.minecraft.src;
/*  1:   */ import java.util.Collections;
/*  2:   */ import java.util.Iterator;
/*  4:   */ 
/*  5:   */ class ee<E>
/*  6:   */   implements Iterable<E[]>
/*  7:   */ {
/*  8:   */   private final Class<E> a;
/*  9:   */   private final Iterable<E>[] b;
/* 10:   */   
/* 11:   */   private ee(Class<E> paramClass, Iterable<E>[] paramArrayOfIterable)
/* 12:   */   {
/* 13:59 */     this.a = paramClass;
/* 14:60 */     this.b = paramArrayOfIterable;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public Iterator<E[]> iterator()
/* 18:   */   {
/* 19:65 */     if (this.b.length <= 0) {
/* 20:67 */       return Collections.singletonList(eb.a(this.a, 0)).iterator();
/* 21:   */     }
/* 22:69 */     return new ef<E>(this.a, this.b, null);
/* 23:   */   }
			  ee(Class<E> arg0, Iterable<E>[] arg1, ec arg2) {this(arg0,arg1);}
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ee
 * JD-Core Version:    0.7.0.1
 */