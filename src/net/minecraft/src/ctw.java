package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Sets;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.Arrays;
/*   5:    */ import java.util.Iterator;
/*   6:    */ import java.util.List;
/*   7:    */ import java.util.Set;
/*   8:    */ 
/*   9:    */ public class ctw
/*  10:    */ {
/*  11:    */   private final int a;
/*  12: 14 */   private final Set<ctx> b = Sets.newHashSetWithExpectedSize(256);
/*  13: 15 */   private final List<cty> c = Lists.newArrayListWithCapacity(256);
/*  14:    */   private int d;
/*  15:    */   private int e;
/*  16:    */   private final int f;
/*  17:    */   private final int g;
/*  18:    */   private final boolean h;
/*  19:    */   private final int i;
/*  20:    */   
/*  21:    */   public ctw(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4)
/*  22:    */   {
/*  23: 25 */     this.a = paramInt4;
/*  24: 26 */     this.f = paramInt1;
/*  25: 27 */     this.g = paramInt2;
/*  26: 28 */     this.h = paramBoolean;
/*  27: 29 */     this.i = paramInt3;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public int a()
/*  31:    */   {
/*  32: 33 */     return this.d;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public int b()
/*  36:    */   {
/*  37: 37 */     return this.e;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void a(cue paramcue)
/*  41:    */   {
/*  42: 41 */     ctx localctx = new ctx(paramcue, this.a);
/*  43: 42 */     if (this.i > 0) {
/*  44: 43 */       localctx.a(this.i);
/*  45:    */     }
/*  46: 45 */     this.b.add(localctx);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void c()
/*  50:    */   {
/*  51: 49 */     ctx[] arrayOfctx1 = (ctx[])this.b.toArray(new ctx[this.b.size()]);
/*  52: 50 */     Arrays.sort(arrayOfctx1);
/*  53: 52 */     for (ctx localctx : arrayOfctx1) {
/*  54: 53 */       if (!a(localctx))
/*  55:    */       {
/*  56: 54 */         String str = String.format("Unable to fit: %s - size: %dx%d - Maybe try a lowerresolution resourcepack?", new Object[] { localctx.a().i(), Integer.valueOf(localctx.a().c()), Integer.valueOf(localctx.a().d()) });
/*  57:    */         
/*  58:    */ 
/*  59:    */ 
/*  60:    */ 
/*  61:    */ 
/*  62: 60 */         throw new ctz(localctx, str);
/*  63:    */       }
/*  64:    */     }
/*  65: 65 */     if (this.h)
/*  66:    */     {
/*  67: 67 */       this.d = MathUtils.smallestEncompassingPowerOfTwo(this.d);
/*  68: 68 */       this.e = MathUtils.smallestEncompassingPowerOfTwo(this.e);
/*  69:    */     }
/*  70:    */   }
/*  71:    */   
/*  72:    */   public List<cue> d()
/*  73:    */   {
/*  74: 73 */     ArrayList<cty> localArrayList = Lists.newArrayList();
/*  75: 75 */     for (Iterator<cty> localObject1 = this.c.iterator(); localObject1.hasNext();)
/*  76:    */     {
/*  77: 75 */       cty localObject2 = localObject1.next();
/*  78: 76 */       ((cty)localObject2).a(localArrayList);
/*  79:    */     }
/*  80: 79 */     List<cue> localObject1 = Lists.newArrayList();
/*  81: 80 */     for (Iterator<cty> localObject2 = localArrayList.iterator(); (localObject2).hasNext();)
/*  82:    */     {
/*  83: 80 */       cty localcty = localObject2.next();
/*  84: 81 */       ctx localctx = localcty.a();
/*  85:    */       
/*  86: 83 */       cue localcue = localctx.a();
/*  87: 84 */       localcue.a(this.d, this.e, localcty.b(), localcty.c(), localctx.e());
/*  88:    */       
/*  89: 86 */       localObject1.add(localcue);
/*  90:    */     }
/*  91: 89 */     return localObject1;
/*  92:    */   }
/*  93:    */   
/*  94:    */   private static int b(int paramInt1, int paramInt2)
/*  95:    */   {
/*  96: 93 */     return (paramInt1 >> paramInt2) + ((paramInt1 & (1 << paramInt2) - 1) == 0 ? 0 : 1) << paramInt2;
/*  97:    */   }
/*  98:    */   
/*  99:    */   private boolean a(ctx paramctx)
/* 100:    */   {
/* 101: 97 */     for (int j = 0; j < this.c.size(); j++)
/* 102:    */     {
/* 103: 98 */       if (((cty)this.c.get(j)).a(paramctx)) {
/* 104: 99 */         return true;
/* 105:    */       }
/* 106:103 */       paramctx.d();
/* 107:104 */       if (((cty)this.c.get(j)).a(paramctx)) {
/* 108:105 */         return true;
/* 109:    */       }
/* 110:109 */       paramctx.d();
/* 111:    */     }
/* 112:112 */     return b(paramctx);
/* 113:    */   }
/* 114:    */   
/* 115:    */   private boolean b(ctx paramctx)
/* 116:    */   {
/* 117:123 */     int j = Math.min(paramctx.b(), paramctx.c());
/* 118:124 */     int k = (this.d == 0) && (this.e == 0) ? 1 : 0;
/* 119:    */     int i1;
/* 120:    */     int m;
/* 121:128 */     if (this.h)
/* 122:    */     {
/* 123:129 */       int n = MathUtils.smallestEncompassingPowerOfTwo(this.d);
/* 124:130 */       i1 = MathUtils.smallestEncompassingPowerOfTwo(this.e);
/* 125:131 */       int i2 = MathUtils.smallestEncompassingPowerOfTwo(this.d + j);
/* 126:132 */       int i3 = MathUtils.smallestEncompassingPowerOfTwo(this.e + j);
/* 127:    */       
/* 128:134 */       int i4 = i2 <= this.f ? 1 : 0;
/* 129:135 */       int i5 = i3 <= this.g ? 1 : 0;
/* 130:137 */       if ((i4 == 0) && (i5 == 0)) {
/* 131:138 */         return false;
/* 132:    */       }
/* 133:141 */       int i6 = n != i2 ? 1 : 0;
/* 134:142 */       int i7 = i1 != i3 ? 1 : 0;
/* 135:144 */       if ((i6 ^ i7) != 0) {
/* 136:146 */         m = i6 == 0 ? 1 : 0;
/* 137:    */       } else {
/* 138:149 */         m = (i4 != 0) && (n <= i1) ? 1 : 0;
/* 139:    */       }
/* 140:    */     }
/* 141:    */     else
/* 142:    */     {
/* 143:153 */       int n = this.d + j <= this.f ? 1 : 0;
/* 144:154 */       i1 = this.e + j <= this.g ? 1 : 0;
/* 145:156 */       if ((n == 0) && (i1 == 0)) {
/* 146:157 */         return false;
/* 147:    */       }
/* 148:161 */       m = (n != 0) && ((k != 0) || (this.d <= this.e)) ? 1 : 0;
/* 149:    */     }
/* 150:165 */     int n = Math.max(paramctx.b(), paramctx.c());
/* 151:166 */     if (MathUtils.smallestEncompassingPowerOfTwo((m != 0 ? this.e : this.d) + n) > (m != 0 ? this.g : this.f)) {
/* 152:167 */       return false;
/* 153:    */     }
/* 154:    */     cty localcty;
/* 155:171 */     if (m != 0)
/* 156:    */     {
/* 157:172 */       if (paramctx.b() > paramctx.c()) {
/* 158:173 */         paramctx.d();
/* 159:    */       }
/* 160:177 */       if (this.e == 0) {
/* 161:178 */         this.e = paramctx.c();
/* 162:    */       }
/* 163:181 */       localcty = new cty(this.d, 0, paramctx.b(), this.e);
/* 164:182 */       this.d += paramctx.b();
/* 165:    */     }
/* 166:    */     else
/* 167:    */     {
/* 168:185 */       localcty = new cty(0, this.e, this.d, paramctx.c());
/* 169:186 */       this.e += paramctx.c();
/* 170:    */     }
/* 171:189 */     localcty.a(paramctx);
/* 172:190 */     this.c.add(localcty);
/* 173:    */     
/* 174:192 */     return true;
/* 175:    */   }
				static int a(int arg0,int arg1) {return b(arg0,arg1);}
/* 176:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctw
 * JD-Core Version:    0.7.0.1
 */