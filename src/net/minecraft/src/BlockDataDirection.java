package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ import com.google.common.base.Predicates;
/*  3:   */ import com.google.common.collect.Collections2;
/*  4:   */ import com.google.common.collect.Lists;
/*  5:   */ import java.util.Collection;
/*  6:   */ 
/*  7:   */ public class BlockDataDirection
/*  8:   */   extends BlockDataEnum<EnumDirection>
/*  9:   */ {
/* 10:   */   protected BlockDataDirection(String paramString, Collection<EnumDirection> paramCollection)
/* 11:   */   {
/* 12:13 */     super(paramString, EnumDirection.class, paramCollection);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public static BlockDataDirection getInstance(String paramString)
/* 16:   */   {
/* 17:17 */     return getInstance(paramString, Predicates.<EnumDirection>alwaysTrue());
/* 18:   */   }
/* 19:   */   
/* 20:   */   public static BlockDataDirection getInstance(String paramString, Predicate<EnumDirection> paramPredicate)
/* 21:   */   {
/* 22:21 */     return getInstance(paramString, Collections2.filter(Lists.newArrayList(EnumDirection.values()), paramPredicate));
/* 23:   */   }
/* 24:   */   
/* 25:   */   public static BlockDataDirection getInstance(String paramString, Collection<EnumDirection> paramCollection)
/* 26:   */   {
/* 27:29 */     return new BlockDataDirection(paramString, paramCollection);
/* 28:   */   }
/* 29:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     beu
 * JD-Core Version:    0.7.0.1
 */