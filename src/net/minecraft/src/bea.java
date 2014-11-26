package net.minecraft.src;
/*  1:   */ import com.google.common.base.Function;
/*  2:   */ import com.google.common.base.Joiner;
/*  3:   */ import com.google.common.collect.ImmutableMap;
/*  4:   */ import com.google.common.collect.Iterables;
/*  5:   */ import java.util.Collection;
/*  6:   */ import java.util.Iterator;
/*  7:   */ 
/*  8:   */ public abstract class bea
/*  9:   */   implements Block
/* 10:   */ {
/* 11:15 */   private static final Joiner a = Joiner.on(',');
/* 12:16 */   private static final Function b = new beb();
/* 13:   */   
/* 14:   */   public Block a(IBlockData parambex)
/* 15:   */   {
/* 16:31 */     return setData(parambex, (Comparable)a(parambex.getValues(), getProperty(parambex)));
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected static Object a(Collection paramCollection, Object paramObject)
/* 20:   */   {
/* 21:35 */     Iterator localIterator = paramCollection.iterator();
/* 22:37 */     while (localIterator.hasNext()) {
/* 23:38 */       if (localIterator.next().equals(paramObject))
/* 24:   */       {
/* 25:39 */         if (localIterator.hasNext()) {
/* 26:40 */           return localIterator.next();
/* 27:   */         }
/* 28:42 */         return paramCollection.iterator().next();
/* 29:   */       }
/* 30:   */     }
/* 31:46 */     return localIterator.next();
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String toString()
/* 35:   */   {
/* 36:51 */     StringBuilder localStringBuilder = new StringBuilder();
/* 37:52 */     localStringBuilder.append(ProtoBlock.c.c(getProto()));
/* 38:54 */     if (!b().isEmpty())
/* 39:   */     {
/* 40:55 */       localStringBuilder.append("[");
/* 41:56 */       a.appendTo(localStringBuilder, Iterables.transform(b().entrySet(), b));
/* 42:57 */       localStringBuilder.append("]");
/* 43:   */     }
/* 44:60 */     return localStringBuilder.toString();
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bea
 * JD-Core Version:    0.7.0.1
 */