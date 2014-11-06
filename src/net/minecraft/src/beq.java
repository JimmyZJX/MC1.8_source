package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ import com.google.common.collect.Maps;
/*  3:   */ import java.util.Collection;
/*  4:   */ import java.util.Map;
/*  5:   */ import java.util.Map.Entry;
/*  6:   */ 
/*  7:   */ public class beq
/*  8:   */   implements Predicate<Block>
/*  9:   */ {
/* 10:   */   private final bed a;
/* 11:15 */   private final Map<bex,Predicate<Comparable>> b = Maps.newHashMap();
/* 12:   */   
/* 13:   */   private beq(bed parambed)
/* 14:   */   {
/* 15:18 */     this.a = parambed;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public static beq a(ProtoBlock paramatr)
/* 19:   */   {
/* 20:22 */     return new beq(paramatr.O());
/* 21:   */   }
/* 22:   */   
/* 23:   */   public boolean apply(Block parambec)
/* 24:   */   {
/* 25:32 */     if ((parambec == null) || (!parambec.getProto().equals(this.a.c()))) {
/* 26:33 */       return false;
/* 27:   */     }
/* 28:36 */     for (Map.Entry<bex,Predicate<Comparable>> localEntry : this.b.entrySet())
/* 29:   */     {
/* 30:37 */       Comparable localComparable = parambec.getProperty(localEntry.getKey());
/* 31:38 */       if (!(localEntry.getValue()).apply(localComparable)) {
/* 32:39 */         return false;
/* 33:   */       }
/* 34:   */     }
/* 35:43 */     return true;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public beq a(bex parambex, Predicate<Comparable> paramPredicate)
/* 39:   */   {
/* 40:47 */     if (!this.a.d().contains(parambex)) {
/* 41:48 */       throw new IllegalArgumentException(this.a + " cannot support property " + parambex);
/* 42:   */     }
/* 43:50 */     this.b.put(parambex, paramPredicate);
/* 44:51 */     return this;
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     beq
 * JD-Core Version:    0.7.0.1
 */