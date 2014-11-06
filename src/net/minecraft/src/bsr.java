package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Sets;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Set;
/*   5:    */ 
/*   6:    */ public class bsr
/*   7:    */   implements Comparable<bsr>
/*   8:    */ {
/*   9: 13 */   private static final List<bsr> a = Lists.newArrayList();
/*  10: 14 */   private static final um b = new um();
/*  11: 15 */   private static final Set<String> c = Sets.newHashSet();
/*  12:    */   private final String d;
/*  13:    */   private final int e;
/*  14:    */   private final String f;
/*  15:    */   private int g;
/*  16:    */   private boolean h;
/*  17:    */   private int i;
/*  18:    */   
/*  19:    */   public static void a(int paramInt)
/*  20:    */   {
/*  21: 26 */     if (paramInt == 0) {
/*  22: 27 */       return;
/*  23:    */     }
/*  24: 29 */     bsr localbsr = (bsr)b.a(paramInt);
/*  25: 30 */     if (localbsr != null) {
/*  26: 31 */       localbsr.i += 1;
/*  27:    */     }
/*  28:    */   }
/*  29:    */   
/*  30:    */   public static void a(int paramInt, boolean paramBoolean)
/*  31:    */   {
/*  32: 36 */     if (paramInt == 0) {
/*  33: 37 */       return;
/*  34:    */     }
/*  35: 39 */     bsr localbsr = (bsr)b.a(paramInt);
/*  36: 40 */     if (localbsr != null) {
/*  37: 41 */       localbsr.h = paramBoolean;
/*  38:    */     }
/*  39:    */   }
/*  40:    */   
/*  41:    */   public static void a()
/*  42:    */   {
/*  43: 46 */     for (bsr localbsr : a) {
/*  44: 47 */       localbsr.j();
/*  45:    */     }
/*  46:    */   }
/*  47:    */   
/*  48:    */   public static void b()
/*  49:    */   {
/*  50: 52 */     b.c();
/*  51: 53 */     for (bsr localbsr : a) {
/*  52: 54 */       b.a(localbsr.g, localbsr);
/*  53:    */     }
/*  54:    */   }
/*  55:    */   
/*  56:    */   public static Set<String> c()
/*  57:    */   {
/*  58: 59 */     return c;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public bsr(String paramString1, int paramInt, String paramString2)
/*  62:    */   {
/*  63: 70 */     this.d = paramString1;
/*  64: 71 */     this.g = paramInt;
/*  65: 72 */     this.e = paramInt;
/*  66: 73 */     this.f = paramString2;
/*  67:    */     
/*  68: 75 */     a.add(this);
/*  69: 76 */     b.a(paramInt, this);
/*  70: 77 */     c.add(paramString2);
/*  71:    */   }
/*  72:    */   
/*  73:    */   public boolean d()
/*  74:    */   {
/*  75: 81 */     return this.h;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public String e()
/*  79:    */   {
/*  80: 85 */     return this.f;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public boolean f()
/*  84:    */   {
/*  85: 89 */     if (this.i == 0) {
/*  86: 90 */       return false;
/*  87:    */     }
/*  88: 92 */     this.i -= 1;
/*  89: 93 */     return true;
/*  90:    */   }
/*  91:    */   
/*  92:    */   private void j()
/*  93:    */   {
/*  94: 97 */     this.i = 0;
/*  95: 98 */     this.h = false;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public String g()
/*  99:    */   {
/* 100:102 */     return this.d;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public int h()
/* 104:    */   {
/* 105:106 */     return this.e;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public int i()
/* 109:    */   {
/* 110:110 */     return this.g;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void b(int paramInt)
/* 114:    */   {
/* 115:114 */     this.g = paramInt;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public int compareTo(bsr parambsr)
/* 119:    */   {
/* 120:119 */     int j = cwc.a(this.f, new Object[0]).compareTo(cwc.a(parambsr.f, new Object[0]));
/* 121:121 */     if (j == 0) {
/* 122:122 */       j = cwc.a(this.d, new Object[0]).compareTo(cwc.a(parambsr.d, new Object[0]));
/* 123:    */     }
/* 124:125 */     return j;
/* 125:    */   }
/* 126:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsr
 * JD-Core Version:    0.7.0.1
 */