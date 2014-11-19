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
/* 10:   */ public class BlockDataEnum<T extends Enum<T> & va>
/* 11:   */   extends BlockData<T>
/* 12:   */ {
/* 13:   */   private final ImmutableSet<T> values;
/* 14:16 */   private final Map<String,T> nameToValueMapping = Maps.newHashMap();
/* 15:   */   
/* 16:   */   protected BlockDataEnum(String paramString, Class<T> paramClass, Collection<T> values)
/* 17:   */   {
/* 18:19 */     super(paramString, paramClass);
/* 19:20 */     this.values = ImmutableSet.copyOf(values);
/* 20:22 */     for (T localEnum : values)
/* 21:   */     {
/* 22:23 */       String str = ((va)localEnum).toString2();
/* 23:24 */       if (this.nameToValueMapping.containsKey(str)) {
/* 24:25 */         throw new IllegalArgumentException("Multiple values have the same name '" + str + "'");
/* 25:   */       }
/* 26:27 */       this.nameToValueMapping.put(str, localEnum);
/* 27:   */     }
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Collection<T> getValues()
/* 31:   */   {
/* 32:33 */     return this.values;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public String toString(T paramEnum)
/* 36:   */   {
/* 37:43 */     return paramEnum.toString2();
/* 38:   */   }
/* 39:   */   
/* 40:   */   public static <T extends Enum<T> & va> BlockDataEnum<T> getInstance(String paramString, Class<T> paramClass)
/* 41:   */   {
/* 42:47 */     return getInstance(paramString, paramClass, Predicates.<T>alwaysTrue());
/* 43:   */   }
/* 44:   */   
/* 45:   */   public static <T extends Enum<T> & va> BlockDataEnum<T> getInstance(String paramString, Class<T> paramClass, Predicate<T> paramPredicate)
/* 46:   */   {
/* 47:51 */     return getInstance(paramString, paramClass, Collections2.filter(Lists.newArrayList(paramClass.getEnumConstants()), paramPredicate));
/* 48:   */   }
/* 49:   */   
/* 50:   */   public static <T extends Enum<T> & va> BlockDataEnum<T> getInstance(String paramString, Class<T> paramClass, T... paramVarArgs)
/* 51:   */   {
/* 52:55 */     return getInstance(paramString, paramClass, Lists.newArrayList(paramVarArgs));
/* 53:   */   }
/* 54:   */   
/* 55:   */   public static <T extends Enum<T> & va> BlockDataEnum<T> getInstance(String paramString, Class<T> paramClass, Collection<T> paramCollection)
/* 56:   */   {
/* 57:59 */     return new BlockDataEnum<T>(paramString, paramClass, paramCollection);
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bev
 * JD-Core Version:    0.7.0.1
 */