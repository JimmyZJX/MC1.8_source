package net.minecraft.src;
/*   1:    */ import com.google.common.collect.HashBasedTable;
/*   2:    */ import com.google.common.collect.ImmutableMap;
/*   3:    */ import com.google.common.collect.ImmutableSet;
/*   4:    */ import com.google.common.collect.ImmutableTable;
/*   5:    */ import com.google.common.collect.Maps;
/*   6:    */ import com.google.common.collect.Table;
/*   7:    */ import java.util.Collection;
/*   8:    */ import java.util.Collections;
/*   9:    */ import java.util.HashMap;
/*  10:    */ import java.util.Iterator;
/*  11:    */ import java.util.Map;
/*  12:    */ 
/*  13:    */ class beg
/*  14:    */   extends bea
/*  15:    */ {
/*  16:    */   private final ProtoBlock a;
/*  17:    */   private final ImmutableMap<bex,Comparable> b;
/*  18:    */   private ImmutableTable c;
/*  19:    */   
/*  20:    */   private beg(ProtoBlock paramatr, ImmutableMap<bex,Comparable> paramImmutableMap)
/*  21:    */   {
/*  22:100 */     this.a = paramatr;
/*  23:101 */     this.b = paramImmutableMap;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public Collection<bex> a()
/*  27:    */   {
/*  28:106 */     return Collections.unmodifiableCollection(this.b.keySet());
/*  29:    */   }
/*  30:    */   
/*  31:    */   public Comparable<?> getProperty(bex property)
/*  32:    */   {
/*  33:111 */     if (!this.b.containsKey(property)) {
/*  34:112 */       throw new IllegalArgumentException("Cannot get property " + property + " as it does not exist in " + this.a.O());
/*  35:    */     }
/*  36:115 */     return (Comparable)property.b().cast(this.b.get(property));
/*  37:    */   }
/*  38:    */   
/*  39:    */   public Block a(bex parambex, Comparable paramComparable)
/*  40:    */   {
/*  41:120 */     if (!this.b.containsKey(parambex)) {
/*  42:121 */       throw new IllegalArgumentException("Cannot set property " + parambex + " as it does not exist in " + this.a.O());
/*  43:    */     }
/*  44:123 */     if (!parambex.c().contains(paramComparable)) {
/*  45:124 */       throw new IllegalArgumentException("Cannot set property " + parambex + " to " + paramComparable + " on block " + ProtoBlock.c.c(this.a) + ", it is not an allowed value");
/*  46:    */     }
/*  47:126 */     if (this.b.get(parambex) == paramComparable) {
/*  48:127 */       return this;
/*  49:    */     }
/*  50:130 */     return (Block)this.c.get(parambex, paramComparable);
/*  51:    */   }
/*  52:    */   
/*  53:    */   public ImmutableMap b()
/*  54:    */   {
/*  55:135 */     return this.b;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public ProtoBlock getProto()
/*  59:    */   {
/*  60:140 */     return this.a;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public boolean equals(Object paramObject)
/*  64:    */   {
/*  65:146 */     return this == paramObject;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public int hashCode()
/*  69:    */   {
/*  70:151 */     return this.b.hashCode();
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void a(Map paramMap)
/*  74:    */   {
/*  75:155 */     if (this.c != null) {
/*  76:156 */       throw new IllegalStateException();
/*  77:    */     }
/*  78:159 */     HashBasedTable localHashBasedTable = HashBasedTable.create();
/*  79:160 */     for (Iterator localIterator1 = this.b.keySet().iterator(); localIterator1.hasNext();)
/*  80:    */     {
/*  81:160 */       bex<?> localbex = (bex)localIterator1.next();
/*  82:161 */       for (Comparable localComparable : localbex.c()) {
/*  83:162 */         if (localComparable != this.b.get(localbex)) {
/*  84:163 */           localHashBasedTable.put(localbex, localComparable, paramMap.get(b(localbex, localComparable)));
/*  85:    */         }
/*  86:    */       }
/*  87:    */     }
/*  88:    */     bex localbex;
/*  89:168 */     this.c = ImmutableTable.copyOf(localHashBasedTable);
/*  90:    */   }
/*  91:    */   
/*  92:    */   private Map b(bex parambex, Comparable paramComparable)
/*  93:    */   {
/*  94:172 */     HashMap localHashMap = Maps.newHashMap(this.b);
/*  95:173 */     localHashMap.put(parambex, paramComparable);
/*  96:174 */     return localHashMap;
/*  97:    */   }
				beg(ProtoBlock arg0, ImmutableMap arg1, bee arg2) {this(arg0,arg1);}
/*  98:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     beg
 * JD-Core Version:    0.7.0.1
 */