package net.minecraft.src;
/*  1:   */ import java.util.BitSet;
/*  2:   */ import java.util.Iterator;
/*  3:   */ import java.util.Set;
/*  4:   */ 
/*  5:   */ public class cou
/*  6:   */ {
/*  7: 9 */   private static final int a = EnumDirection.values().length;
/*  8:10 */   private final BitSet b = new BitSet(a * a);
/*  9:   */   
/* 10:   */   public void a(Set<EnumDirection> paramSet)
/* 11:   */   {
/* 19:   */     EnumDirection localej1;
/* 12:13 */     for (Iterator<EnumDirection> localIterator1 = paramSet.iterator(); localIterator1.hasNext();)
/* 13:   */     {
/* 14:13 */       localej1 = localIterator1.next();
/* 15:14 */       for (EnumDirection localej2 : paramSet) {
/* 16:15 */         a(localej1, localej2, true);
/* 17:   */       }
/* 18:   */     }
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(EnumDirection paramej1, EnumDirection paramej2, boolean paramBoolean)
/* 23:   */   {
/* 24:21 */     this.b.set(paramej1.ordinal() + paramej2.ordinal() * a, paramBoolean);
/* 25:22 */     this.b.set(paramej2.ordinal() + paramej1.ordinal() * a, paramBoolean);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(boolean paramBoolean)
/* 29:   */   {
/* 30:26 */     this.b.set(0, this.b.size(), paramBoolean);
/* 31:   */   }
/* 32:   */   
/* 33:   */   public boolean a(EnumDirection paramej1, EnumDirection paramej2)
/* 34:   */   {
/* 35:30 */     return this.b.get(paramej1.ordinal() + paramej2.ordinal() * a);
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String toString()
/* 39:   */   {
/* 40:35 */     StringBuilder localStringBuilder = new StringBuilder();
/* 41:36 */     localStringBuilder.append(' ');
/* 42:   */     
/* 43:37 */     for (EnumDirection localej1 : EnumDirection.values()) {
/* 44:38 */       localStringBuilder.append(' ').append(localej1.toString().toUpperCase().charAt(0));
/* 45:   */     }
/* 46:40 */     localStringBuilder.append('\n');
/* 47:42 */     for (EnumDirection localej1 : EnumDirection.values())
/* 48:   */     {
/* 49:43 */       localStringBuilder.append(localej1.toString().toUpperCase().charAt(0));
/* 50:44 */       for (EnumDirection localej2 : EnumDirection.values()) {
/* 51:45 */         if (localej1 == localej2)
/* 52:   */         {
/* 53:46 */           localStringBuilder.append("  ");
/* 54:   */         }
/* 55:   */         else
/* 56:   */         {
/* 57:48 */           boolean bool = a(localej1, localej2);
/* 58:49 */           localStringBuilder.append(' ').append(bool ? 'Y' : 'n');
/* 59:   */         }
/* 60:   */       }
/* 61:52 */       localStringBuilder.append('\n');
/* 62:   */     }
/* 63:55 */     return localStringBuilder.toString();
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cou
 * JD-Core Version:    0.7.0.1
 */