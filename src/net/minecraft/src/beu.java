package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ import com.google.common.base.Predicates;
/*  3:   */ import com.google.common.collect.Collections2;
/*  4:   */ import com.google.common.collect.Lists;
/*  5:   */ import java.util.Collection;
/*  6:   */ 
/*  7:   */ public class beu
/*  8:   */   extends bev<EnumDirection>
/*  9:   */ {
/* 10:   */   protected beu(String paramString, Collection paramCollection)
/* 11:   */   {
/* 12:13 */     super(paramString, EnumDirection.class, paramCollection);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public static beu a(String paramString)
/* 16:   */   {
/* 17:17 */     return a(paramString, Predicates.alwaysTrue());
/* 18:   */   }
/* 19:   */   
/* 20:   */   public static beu a(String paramString, Predicate paramPredicate)
/* 21:   */   {
/* 22:21 */     return a(paramString, Collections2.filter(Lists.newArrayList(EnumDirection.values()), paramPredicate));
/* 23:   */   }
/* 24:   */   
/* 25:   */   public static beu a(String paramString, Collection paramCollection)
/* 26:   */   {
/* 27:29 */     return new beu(paramString, paramCollection);
/* 28:   */   }
/* 29:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     beu
 * JD-Core Version:    0.7.0.1
 */