package net.minecraft.src;
/*  1:   */ import com.google.common.collect.AbstractIterator;
/*  2:   */ import java.util.Iterator;
/*  3:   */ 
/*  4:   */ class ue<E>
/*  5:   */   extends AbstractIterator<E>
/*  6:   */ {
			  private Iterator<E> a;
/*  7:   */   ue(MyList<E> paramuc, Iterator<E> paramIterator) {a=paramIterator;}
/*  8:   */   
/*  9:   */   protected E computeNext()
/* 10:   */   {
/* 11:87 */     if (!this.a.hasNext()) {
/* 12:88 */       return endOfData();
/* 13:   */     }
/* 14:90 */     return this.a.next();
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ue
 * JD-Core Version:    0.7.0.1
 */