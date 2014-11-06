package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Iterators;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.List;
/*   5:    */ 
/*   6:    */ public abstract class hj
/*   7:    */   implements ho
/*   8:    */ {
/*   9: 12 */   protected List<ho> a = Lists.newArrayList();
/*  10:    */   private hv b;
/*  11:    */   
/*  12:    */   public ho a(ho paramho)
/*  13:    */   {
/*  14: 17 */     paramho.b().a(b());
/*  15: 18 */     this.a.add(paramho);
/*  16: 19 */     return this;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public List<ho> a()
/*  20:    */   {
/*  21: 24 */     return this.a;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public ho a(String paramString)
/*  25:    */   {
/*  26: 29 */     return a(new hy(paramString));
/*  27:    */   }
/*  28:    */   
/*  29:    */   public ho a(hv paramhv)
/*  30:    */   {
/*  31: 34 */     this.b = paramhv;
/*  32: 36 */     for (ho localho : this.a) {
/*  33: 37 */       localho.b().a(b());
/*  34:    */     }
/*  35: 40 */     return this;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public hv b()
/*  39:    */   {
/*  40: 45 */     if (this.b == null)
/*  41:    */     {
/*  42: 46 */       this.b = new hv();
/*  43: 47 */       for (ho localho : this.a) {
/*  44: 48 */         localho.b().a(this.b);
/*  45:    */       }
/*  46:    */     }
/*  47: 51 */     return this.b;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public Iterator iterator()
/*  51:    */   {
/*  52: 56 */     return Iterators.concat(Iterators.forArray(new hj[] { this }), a(this.a));
/*  53:    */   }
/*  54:    */   
/*  55:    */   public final String c()
/*  56:    */   {
/*  57: 61 */     StringBuilder localStringBuilder = new StringBuilder();
/*  58: 63 */     for (ho localho : this) {
/*  59: 64 */       localStringBuilder.append(localho.e());
/*  60:    */     }
/*  61: 67 */     return localStringBuilder.toString();
/*  62:    */   }
/*  63:    */   
/*  64:    */   public final String d()
/*  65:    */   {
/*  66: 72 */     StringBuilder localStringBuilder = new StringBuilder();
/*  67: 74 */     for (ho localho : this)
/*  68:    */     {
/*  69: 75 */       localStringBuilder.append(localho.b().k());
/*  70: 76 */       localStringBuilder.append(localho.e());
/*  71: 77 */       localStringBuilder.append(net.minecraft.src.a.v);
/*  72:    */     }
/*  73: 80 */     return localStringBuilder.toString();
/*  74:    */   }
/*  75:    */   
/*  76:    */   public static Iterator a(Iterable paramIterable)
/*  77:    */   {
/*  78: 84 */     Iterator localIterator = Iterators.concat(Iterators.transform(paramIterable.iterator(), new hk()));
/*  79:    */     
/*  80:    */ 
/*  81:    */ 
/*  82:    */ 
/*  83:    */ 
/*  84: 90 */     localIterator = Iterators.transform(localIterator, new hl());
/*  85:    */     
/*  86:    */ 
/*  87:    */ 
/*  88:    */ 
/*  89:    */ 
/*  90:    */ 
/*  91:    */ 
/*  92: 98 */     return localIterator;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public boolean equals(Object paramObject)
/*  96:    */   {
/*  97:103 */     if (this == paramObject) {
/*  98:104 */       return true;
/*  99:    */     }
/* 100:107 */     if ((paramObject instanceof hj))
/* 101:    */     {
/* 102:108 */       hj localhj = (hj)paramObject;
/* 103:109 */       return (this.a.equals(localhj.a)) && (b().equals(localhj.b()));
/* 104:    */     }
/* 105:112 */     return false;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public int hashCode()
/* 109:    */   {
/* 110:117 */     return 31 * this.b.hashCode() + this.a.hashCode();
/* 111:    */   }
/* 112:    */   
/* 113:    */   public String toString()
/* 114:    */   {
/* 115:122 */     return "BaseComponent{style=" + this.b + ", siblings=" + this.a + '}';
/* 116:    */   }
/* 117:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hj
 * JD-Core Version:    0.7.0.1
 */