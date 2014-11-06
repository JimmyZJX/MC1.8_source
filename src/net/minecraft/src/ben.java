package net.minecraft.src;
/*  1:   */ import com.google.common.base.Joiner;
/*  2:   */ import com.google.common.base.Predicate;
/*  3:   */ import com.google.common.base.Predicates;
/*  4:   */ import com.google.common.collect.Lists;
/*  5:   */ import com.google.common.collect.Maps;
/*  6:   */ import java.lang.reflect.Array;
/*  7:   */ import java.util.ArrayList;
/*  8:   */ import java.util.List;
/*  9:   */ import java.util.Map;
/* 10:   */ import java.util.Map.Entry;
/* 11:   */ import org.apache.commons.lang3.ArrayUtils;
/* 12:   */ import org.apache.commons.lang3.StringUtils;
/* 13:   */ 
/* 14:   */ public class ben
/* 15:   */ {
/* 16:16 */   private static final Joiner a = Joiner.on(",");
/* 17:18 */   private final List b = Lists.newArrayList();
/* 18:19 */   private final Map<Character,Predicate> c = Maps.newHashMap();
/* 19:   */   private int d;
/* 20:   */   private int e;
/* 21:   */   
/* 22:   */   private ben()
/* 23:   */   {
/* 24:24 */     this.c.put(Character.valueOf(' '), Predicates.alwaysTrue());
/* 25:   */   }
/* 26:   */   
/* 27:   */   public ben a(String... paramVarArgs)
/* 28:   */   {
/* 29:28 */     if ((ArrayUtils.isEmpty(paramVarArgs)) || (StringUtils.isEmpty(paramVarArgs[0]))) {
/* 30:29 */       throw new IllegalArgumentException("Empty pattern for aisle");
/* 31:   */     }
/* 32:32 */     if (this.b.isEmpty())
/* 33:   */     {
/* 34:33 */       this.d = paramVarArgs.length;
/* 35:34 */       this.e = paramVarArgs[0].length();
/* 36:   */     }
/* 37:37 */     if (paramVarArgs.length != this.d) {
/* 38:38 */       throw new IllegalArgumentException("Expected aisle with height of " + this.d + ", but was given one with a height of " + paramVarArgs.length + ")");
/* 39:   */     }
/* 40:41 */     for (String str : paramVarArgs)
/* 41:   */     {
/* 42:42 */       if (str.length() != this.e) {
/* 43:43 */         throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.e + ", found one with " + str.length() + ")");
/* 44:   */       }
/* 45:45 */       for (char c1 : str.toCharArray()) {
/* 46:46 */         if (!this.c.containsKey(Character.valueOf(c1))) {
/* 47:47 */           this.c.put(Character.valueOf(c1), null);
/* 48:   */         }
/* 49:   */       }
/* 50:   */     }
/* 51:52 */     this.b.add(paramVarArgs);
/* 52:   */     
/* 53:54 */     return this;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public static ben a()
/* 57:   */   {
/* 58:58 */     return new ben();
/* 59:   */   }
/* 60:   */   
/* 61:   */   public ben a(char paramChar, Predicate paramPredicate)
/* 62:   */   {
/* 63:62 */     this.c.put(Character.valueOf(paramChar), paramPredicate);
/* 64:   */     
/* 65:64 */     return this;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public bek b()
/* 69:   */   {
/* 70:68 */     return new bek(c());
/* 71:   */   }
/* 72:   */   
/* 73:   */   private Predicate[][][] c()
/* 74:   */   {
/* 75:73 */     d();
/* 76:   */     
/* 77:75 */     Predicate[][][] arrayOfPredicate = (Predicate[][][])Array.newInstance(Predicate.class, new int[] { this.b.size(), this.d, this.e });
/* 78:77 */     for (int i = 0; i < this.b.size(); i++) {
/* 79:78 */       for (int j = 0; j < this.d; j++) {
/* 80:79 */         for (int k = 0; k < this.e; k++) {
/* 81:80 */           arrayOfPredicate[i][j][k] = ((Predicate)this.c.get(Character.valueOf(((String[])this.b.get(i))[j].charAt(k))));
/* 82:   */         }
/* 83:   */       }
/* 84:   */     }
/* 85:85 */     return arrayOfPredicate;
/* 86:   */   }
/* 87:   */   
/* 88:   */   private void d()
/* 89:   */   {
/* 90:89 */     ArrayList localArrayList = Lists.newArrayList();
/* 91:91 */     for (Map.Entry localEntry : this.c.entrySet()) {
/* 92:92 */       if (localEntry.getValue() == null) {
/* 93:93 */         localArrayList.add(localEntry.getKey());
/* 94:   */       }
/* 95:   */     }
/* 96:97 */     if (!localArrayList.isEmpty()) {
/* 97:98 */       throw new IllegalStateException("Predicates for character(s) " + a.join(localArrayList) + " are missing");
/* 98:   */     }
/* 99:   */   }
/* :0:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ben
 * JD-Core Version:    0.7.0.1
 */