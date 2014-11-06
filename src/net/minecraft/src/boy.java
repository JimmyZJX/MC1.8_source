package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class boy
/*  5:   */ {
/*  6: 9 */   private static int a = 256;
/*  7:11 */   private static List<int[]> b = Lists.newArrayList();
/*  8:12 */   private static List<int[]> c = Lists.newArrayList();
/*  9:14 */   private static List<int[]> d = Lists.newArrayList();
/* 10:15 */   private static List<int[]> e = Lists.newArrayList();
/* 11:   */   
/* 12:   */   public static synchronized int[] a(int paramInt)
/* 13:   */   {
/* 14:18 */     if (paramInt <= 256)
/* 15:   */     {
/* 16:19 */       if (b.isEmpty())
/* 17:   */       {
/* 18:20 */         int[] arrayOfInt = new int[256];
/* 19:21 */         c.add(arrayOfInt);
/* 20:22 */         return arrayOfInt;
/* 21:   */       }
/* 22:24 */       int[] arrayOfInt = (int[])b.remove(b.size() - 1);
/* 23:25 */       c.add(arrayOfInt);
/* 24:26 */       return arrayOfInt;
/* 25:   */     }
/* 26:30 */     if (paramInt > a)
/* 27:   */     {
/* 28:31 */       a = paramInt;
/* 29:   */       
/* 30:33 */       d.clear();
/* 31:34 */       e.clear();
/* 32:   */       
/* 33:36 */       int[] arrayOfInt = new int[a];
/* 34:37 */       e.add(arrayOfInt);
/* 35:38 */       return arrayOfInt;
/* 36:   */     }
/* 37:40 */     if (d.isEmpty())
/* 38:   */     {
/* 39:41 */       int[] arrayOfInt = new int[a];
/* 40:42 */       e.add(arrayOfInt);
/* 41:43 */       return arrayOfInt;
/* 42:   */     }
/* 43:45 */     int[] arrayOfInt = (int[])d.remove(d.size() - 1);
/* 44:46 */     e.add(arrayOfInt);
/* 45:47 */     return arrayOfInt;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public static synchronized void a()
/* 49:   */   {
/* 50:53 */     if (!d.isEmpty()) {
/* 51:54 */       d.remove(d.size() - 1);
/* 52:   */     }
/* 53:56 */     if (!b.isEmpty()) {
/* 54:57 */       b.remove(b.size() - 1);
/* 55:   */     }
/* 56:60 */     d.addAll(e);
/* 57:61 */     b.addAll(c);
/* 58:   */     
/* 59:63 */     e.clear();
/* 60:64 */     c.clear();
/* 61:   */   }
/* 62:   */   
/* 63:   */   public static synchronized String b()
/* 64:   */   {
/* 65:68 */     return "cache: " + d.size() + ", tcache: " + b.size() + ", allocated: " + e.size() + ", tallocated: " + c.size();
/* 66:   */   }
/* 67:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     boy
 * JD-Core Version:    0.7.0.1
 */