package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import com.google.common.collect.Sets;

import java.util.ArrayList;
/*   4:    */ import java.util.Collection;
/*   5:    */ import java.util.HashSet;
/*   6:    */ import java.util.Iterator;
/*   7:    */ import java.util.Map;
/*   8:    */ import java.util.Set;
/*   9:    */ import java.util.UUID;
/*  10:    */ 
/*  11:    */ public class ye
/*  12:    */   implements xz
/*  13:    */ {
/*  14:    */   private final yc a;
/*  15:    */   private final xy b;
/*  16: 15 */   private final Map c = Maps.newHashMap();
/*  17: 16 */   private final Map d = Maps.newHashMap();
/*  18: 17 */   private final Map<UUID,ya> e = Maps.newHashMap();
/*  19:    */   private double f;
/*  20: 19 */   private boolean g = true;
/*  21:    */   private double h;
/*  22:    */   
/*  23:    */   public ye(yc paramyc, xy paramxy)
/*  24:    */   {
/*  25: 23 */     this.a = paramyc;
/*  26: 24 */     this.b = paramxy;
/*  27: 25 */     this.f = paramxy.b();
/*  28: 27 */     for (int i = 0; i < 3; i++) {
/*  29: 28 */       this.c.put(Integer.valueOf(i), Sets.newHashSet());
/*  30:    */     }
/*  31:    */   }
/*  32:    */   
/*  33:    */   public xy a()
/*  34:    */   {
/*  35: 34 */     return this.b;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public double b()
/*  39:    */   {
/*  40: 39 */     return this.f;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void a(double paramDouble)
/*  44:    */   {
/*  45: 44 */     if (paramDouble == b()) {
/*  46: 45 */       return;
/*  47:    */     }
/*  48: 47 */     this.f = paramDouble;
/*  49: 48 */     f();
/*  50:    */   }
/*  51:    */   
/*  52:    */   public Collection<ya> a(int paramInt)
/*  53:    */   {
/*  54: 53 */     return (Collection)this.c.get(Integer.valueOf(paramInt));
/*  55:    */   }
/*  56:    */   
/*  57:    */   public Collection c()
/*  58:    */   {
/*  59: 58 */     HashSet localHashSet = Sets.newHashSet();
/*  60: 60 */     for (int i = 0; i < 3; i++) {
/*  61: 61 */       localHashSet.addAll(a(i));
/*  62:    */     }
/*  63: 64 */     return localHashSet;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public ya a(UUID paramUUID)
/*  67:    */   {
/*  68: 69 */     return (ya)this.e.get(paramUUID);
/*  69:    */   }
/*  70:    */   
/*  71:    */   public boolean a(ya paramya)
/*  72:    */   {
/*  73: 74 */     return this.e.get(paramya.a()) != null;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void b(ya paramya)
/*  77:    */   {
/*  78: 86 */     if (a(paramya.a()) != null) {
/*  79: 87 */       throw new IllegalArgumentException("Modifier is already applied on this attribute!");
/*  80:    */     }
/*  81: 90 */     Set localObject = (Set)this.d.get(paramya.b());
/*  82: 92 */     if (localObject == null)
/*  83:    */     {
/*  84: 93 */       localObject = Sets.newHashSet();
/*  85: 94 */       this.d.put(paramya.b(), localObject);
/*  86:    */     }
/*  87: 97 */     ((Set)this.c.get(Integer.valueOf(paramya.c()))).add(paramya);
/*  88: 98 */     ((Set)localObject).add(paramya);
/*  89: 99 */     this.e.put(paramya.a(), paramya);
/*  90:    */     
/*  91:101 */     f();
/*  92:    */   }
/*  93:    */   
/*  94:    */   protected void f()
/*  95:    */   {
/*  96:105 */     this.g = true;
/*  97:106 */     this.a.a(this);
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void c(ya paramya)
/* 101:    */   {
/* 102:111 */     for (int i = 0; i < 3; i++)
/* 103:    */     {
/* 104:112 */       Set localSet2 = (Set)this.c.get(Integer.valueOf(i));
/* 105:113 */       localSet2.remove(paramya);
/* 106:    */     }
/* 107:116 */     Set localSet1 = (Set)this.d.get(paramya.b());
/* 108:118 */     if (localSet1 != null)
/* 109:    */     {
/* 110:119 */       localSet1.remove(paramya);
/* 111:121 */       if (localSet1.isEmpty()) {
/* 112:122 */         this.d.remove(paramya.b());
/* 113:    */       }
/* 114:    */     }
/* 115:126 */     this.e.remove(paramya.a());
/* 116:127 */     f();
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void d()
/* 120:    */   {
/* 121:159 */     Collection<ya> localObject = c();
/* 122:160 */     if (localObject == null) {
/* 123:161 */       return;
/* 124:    */     }
/* 125:164 */     ArrayList<ya> localObject1 = Lists.newArrayList(localObject);
/* 126:166 */     for (ya localya : localObject1) {
/* 127:167 */       c(localya);
/* 128:    */     }
/* 129:    */   }
/* 130:    */   
/* 131:    */   public double e()
/* 132:    */   {
/* 133:173 */     if (this.g)
/* 134:    */     {
/* 135:174 */       this.h = g();
/* 136:175 */       this.g = false;
/* 137:    */     }
/* 138:178 */     return this.h;
/* 139:    */   }
/* 140:    */   
/* 141:    */   private double g()
/* 142:    */   {
/* 143:182 */     double d1 = b();
/* 144:184 */     for (ya localya1 : b(0)) {
/* 145:185 */       d1 += localya1.d();
/* 146:    */     }
/* 147:188 */     double d2 = d1;
/* 153:    */     ya localya2;
/* 148:190 */     for (Iterator<ya> localIterator2 = b(1).iterator(); localIterator2.hasNext();)
/* 149:    */     {
/* 150:190 */       localya2 = localIterator2.next();
/* 151:191 */       d2 += d1 * localya2.d();
/* 152:    */     }
/* 154:194 */     for (Iterator<ya> localIterator2 = b(2).iterator(); localIterator2.hasNext();)
/* 155:    */     {
/* 156:194 */       localya2 = localIterator2.next();
/* 157:195 */       d2 *= (1.0D + localya2.d());
/* 158:    */     }
/* 159:198 */     return this.b.a(d2);
/* 160:    */   }
/* 161:    */   
/* 162:    */   private Collection<ya> b(int paramInt)
/* 163:    */   {
/* 164:202 */     HashSet<ya> localHashSet = Sets.newHashSet(a(paramInt));
/* 165:    */     
/* 166:204 */     xy localxy = this.b.d();
/* 167:205 */     while (localxy != null)
/* 168:    */     {
/* 169:206 */       xz localxz = this.a.a(localxy);
/* 170:207 */       if (localxz != null) {
/* 171:208 */         localHashSet.addAll(localxz.a(paramInt));
/* 172:    */       }
/* 173:210 */       localxy = localxy.d();
/* 174:    */     }
/* 175:213 */     return localHashSet;
/* 176:    */   }
/* 177:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ye
 * JD-Core Version:    0.7.0.1
 */