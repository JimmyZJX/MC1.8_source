package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ abstract class bkb
/*   6:    */   extends bms
/*   7:    */ {
/*   8:126 */   protected static final List a = Lists.newArrayList(new vl[] { new vl(ItemList.diamond, 0, 1, 3, 5), new vl(ItemList.ironIngot, 0, 1, 5, 5), new vl(ItemList.goldIngot, 0, 1, 3, 15), new vl(ItemList.goldenSword, 0, 1, 1, 5), new vl(ItemList.ah, 0, 1, 1, 5), new vl(ItemList.d, 0, 1, 1, 5), new vl(ItemList.by, 0, 3, 7, 5), new vl(ItemList.saddle, 0, 1, 1, 10), new vl(ItemList.cl, 0, 1, 1, 8), new vl(ItemList.ck, 0, 1, 1, 5), new vl(ItemList.cm, 0, 1, 1, 3), new vl(Item.fromProtoBlock(BlockList.obsidian), 0, 2, 4, 2) });
/*   9:    */   
/*  10:    */   public bkb() {}
/*  11:    */   
/*  12:    */   protected bkb(int paramInt)
/*  13:    */   {
/*  14:147 */     super(paramInt);
/*  15:    */   }
/*  16:    */   
/*  17:    */   protected void b(NBTTagCompound paramfn) {}
/*  18:    */   
/*  19:    */   protected void a(NBTTagCompound paramfn) {}
/*  20:    */   
/*  21:    */   private int a(List<bkc> paramList)
/*  22:    */   {
/*  23:159 */     int i = 0;
/*  24:160 */     int j = 0;
/*  25:161 */     for (bkc localbkc : paramList)
/*  26:    */     {
/*  27:162 */       if ((localbkc.d > 0) && (localbkc.c < localbkc.d)) {
/*  28:163 */         i = 1;
/*  29:    */       }
/*  30:165 */       j += localbkc.b;
/*  31:    */     }
/*  32:167 */     return i != 0 ? j : -1;
/*  33:    */   }
/*  34:    */   
/*  35:    */   private bkb a(bkf parambkf, List<bkc> paramList1, List paramList2, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*  36:    */   {
/*  37:171 */     int i = a(paramList1);
/*  38:172 */     int j = (i > 0) && (paramInt4 <= 30) ? 1 : 0;
/*  39:    */     
/*  40:174 */     int k = 0;
/*  41:    */     int m;
/*  42:175 */     while ((k < 5) && (j != 0))
/*  43:    */     {
/*  44:176 */       k++;
/*  45:    */       
/*  46:178 */       m = paramRandom.nextInt(i);
/*  47:179 */       for (bkc localbkc : paramList1)
/*  48:    */       {
/*  49:180 */         m -= localbkc.b;
/*  50:181 */         if (m < 0)
/*  51:    */         {
/*  52:182 */           if ((!localbkc.a(paramInt4)) || ((localbkc == parambkf.b) && (!localbkc.e))) {
/*  53:    */             break;
/*  54:    */           }
/*  55:186 */           bkb localbkb = bjn.a(localbkc, paramList2, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  56:187 */           if (localbkb != null)
/*  57:    */           {
/*  58:188 */             localbkc.c += 1;
/*  59:189 */             parambkf.b = localbkc;
/*  60:191 */             if (!localbkc.a()) {
/*  61:192 */               paramList1.remove(localbkc);
/*  62:    */             }
/*  63:194 */             return localbkb;
/*  64:    */           }
/*  65:    */         }
/*  66:    */       }
/*  67:    */     }
/*  68:199 */     return bjq.a(paramList2, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  69:    */   }
/*  70:    */   
/*  71:    */   private bms a(bkf parambkf, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4, boolean paramBoolean)
/*  72:    */   {
/*  73:203 */     if ((Math.abs(paramInt1 - parambkf.c().a) > 112) || (Math.abs(paramInt3 - parambkf.c().c) > 112)) {
/*  74:204 */       return bjq.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  75:    */     }
/*  76:206 */     List localList = parambkf.c;
/*  77:207 */     if (paramBoolean) {
/*  78:208 */       localList = parambkf.d;
/*  79:    */     }
/*  80:210 */     bkb localbkb = a(parambkf, localList, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4 + 1);
/*  81:211 */     if (localbkb != null)
/*  82:    */     {
/*  83:212 */       paramList.add(localbkb);
/*  84:213 */       parambkf.e.add(localbkb);
/*  85:    */     }
/*  86:215 */     return localbkb;
/*  87:    */   }
/*  88:    */   
/*  89:    */   protected bms a(bkf parambkf, List paramList, Random paramRandom, int paramInt1, int paramInt2, boolean paramBoolean)
/*  90:    */   {
/*  91:219 */     if (this.m != null) {
/*  92:220 */       switch (bjo.a[this.m.ordinal()])
/*  93:    */       {
/*  94:    */       case 1: 
/*  95:222 */         return a(parambkf, paramList, paramRandom, this.l.a + paramInt1, this.l.b + paramInt2, this.l.c - 1, this.m, d(), paramBoolean);
/*  96:    */       case 2: 
/*  97:224 */         return a(parambkf, paramList, paramRandom, this.l.a + paramInt1, this.l.b + paramInt2, this.l.f + 1, this.m, d(), paramBoolean);
/*  98:    */       case 3: 
/*  99:226 */         return a(parambkf, paramList, paramRandom, this.l.a - 1, this.l.b + paramInt2, this.l.c + paramInt1, this.m, d(), paramBoolean);
/* 100:    */       case 4: 
/* 101:228 */         return a(parambkf, paramList, paramRandom, this.l.d + 1, this.l.b + paramInt2, this.l.c + paramInt1, this.m, d(), paramBoolean);
/* 102:    */       }
/* 103:    */     }
/* 104:231 */     return null;
/* 105:    */   }
/* 106:    */   
/* 107:    */   protected bms b(bkf parambkf, List paramList, Random paramRandom, int paramInt1, int paramInt2, boolean paramBoolean)
/* 108:    */   {
/* 109:235 */     if (this.m != null) {
/* 110:236 */       switch (bjo.a[this.m.ordinal()])
/* 111:    */       {
/* 112:    */       case 1: 
/* 113:238 */         return a(parambkf, paramList, paramRandom, this.l.a - 1, this.l.b + paramInt1, this.l.c + paramInt2, EnumDirection.WEST, d(), paramBoolean);
/* 114:    */       case 2: 
/* 115:240 */         return a(parambkf, paramList, paramRandom, this.l.a - 1, this.l.b + paramInt1, this.l.c + paramInt2, EnumDirection.WEST, d(), paramBoolean);
/* 116:    */       case 3: 
/* 117:242 */         return a(parambkf, paramList, paramRandom, this.l.a + paramInt2, this.l.b + paramInt1, this.l.c - 1, EnumDirection.NORTH, d(), paramBoolean);
/* 118:    */       case 4: 
/* 119:244 */         return a(parambkf, paramList, paramRandom, this.l.a + paramInt2, this.l.b + paramInt1, this.l.c - 1, EnumDirection.NORTH, d(), paramBoolean);
/* 120:    */       }
/* 121:    */     }
/* 122:247 */     return null;
/* 123:    */   }
/* 124:    */   
/* 125:    */   protected bms c(bkf parambkf, List paramList, Random paramRandom, int paramInt1, int paramInt2, boolean paramBoolean)
/* 126:    */   {
/* 127:251 */     if (this.m != null) {
/* 128:252 */       switch (bjo.a[this.m.ordinal()])
/* 129:    */       {
/* 130:    */       case 1: 
/* 131:254 */         return a(parambkf, paramList, paramRandom, this.l.d + 1, this.l.b + paramInt1, this.l.c + paramInt2, EnumDirection.EAST, d(), paramBoolean);
/* 132:    */       case 2: 
/* 133:256 */         return a(parambkf, paramList, paramRandom, this.l.d + 1, this.l.b + paramInt1, this.l.c + paramInt2, EnumDirection.EAST, d(), paramBoolean);
/* 134:    */       case 3: 
/* 135:258 */         return a(parambkf, paramList, paramRandom, this.l.a + paramInt2, this.l.b + paramInt1, this.l.f + 1, EnumDirection.SOUTH, d(), paramBoolean);
/* 136:    */       case 4: 
/* 137:260 */         return a(parambkf, paramList, paramRandom, this.l.a + paramInt2, this.l.b + paramInt1, this.l.f + 1, EnumDirection.SOUTH, d(), paramBoolean);
/* 138:    */       }
/* 139:    */     }
/* 140:263 */     return null;
/* 141:    */   }
/* 142:    */   
/* 143:    */   protected static boolean a(bjb parambjb)
/* 144:    */   {
/* 145:267 */     return (parambjb != null) && (parambjb.b > 10);
/* 146:    */   }
/* 147:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkb
 * JD-Core Version:    0.7.0.1
 */