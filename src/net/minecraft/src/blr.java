package net.minecraft.src;
/*    1:     */ import com.google.common.collect.Lists;
/*    2:     */ import java.util.List;
/*    3:     */ import java.util.Random;
/*    4:     */ 
/*    5:     */ public class blr
/*    6:     */ {
/*    7:     */   public static void a()
/*    8:     */   {
/*    9:  31 */     bmq.a(blv.class, "SHCC");
/*   10:  32 */     bmq.a(blw.class, "SHFC");
/*   11:  33 */     bmq.a(blx.class, "SH5C");
/*   12:  34 */     bmq.a(bly.class, "SHLT");
/*   13:  35 */     bmq.a(blz.class, "SHLi");
/*   14:  36 */     bmq.a(bmb.class, "SHPR");
/*   15:  37 */     bmq.a(bmc.class, "SHPH");
/*   16:  38 */     bmq.a(bmd.class, "SHRT");
/*   17:  39 */     bmq.a(bme.class, "SHRC");
/*   18:  40 */     bmq.a(bmg.class, "SHSD");
/*   19:  41 */     bmq.a(bmh.class, "SHStart");
/*   20:  42 */     bmq.a(bmi.class, "SHS");
/*   21:  43 */     bmq.a(bmj.class, "SHSSD");
/*   22:     */   }
/*   23:     */   
/*   24:  68 */   private static final bma[] b = { new bma(bmi.class, 40, 0), new bma(bmc.class, 5, 5), new bma(bly.class, 20, 0), new bma(bmd.class, 20, 0), new bma(bme.class, 10, 6), new bma(bmj.class, 5, 5), new bma(bmg.class, 5, 5), new bma(blx.class, 5, 4), new bma(blv.class, 5, 4), new bls(blz.class, 10, 2), new blt(bmb.class, 20, 1) };
/*   25:     */   private static List<bma> c;
/*   26:     */   private static Class d;
/*   27:     */   static int a;
/*   28:     */   
/*   29:     */   public static void b()
/*   30:     */   {
/*   31:  97 */     c = Lists.newArrayList();
/*   32:  98 */     for (bma localbma : b)
/*   33:     */     {
/*   34:  99 */       localbma.c = 0;
/*   35: 100 */       c.add(localbma);
/*   36:     */     }
/*   37: 102 */     d = null;
/*   38:     */   }
/*   39:     */   
/*   40:     */   private static boolean d()
/*   41:     */   {
/*   42: 106 */     boolean bool = false;
/*   43: 107 */     a = 0;
/*   44: 108 */     for (bma localbma : c)
/*   45:     */     {
/*   46: 109 */       if ((localbma.d > 0) && (localbma.c < localbma.d)) {
/*   47: 110 */         bool = true;
/*   48:     */       }
/*   49: 112 */       a += localbma.b;
/*   50:     */     }
/*   51: 114 */     return bool;
/*   52:     */   }
/*   53:     */   
/*   54:     */   private static bmk a(Class paramClass, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   55:     */   {
/*   56: 118 */     bmk localObject = null;
/*   57: 120 */     if (paramClass == bmi.class) {
/*   58: 121 */       localObject = bmi.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*   59: 122 */     } else if (paramClass == bmc.class) {
/*   60: 123 */       localObject = bmc.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*   61: 124 */     } else if (paramClass == bly.class) {
/*   62: 125 */       localObject = bly.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*   63: 126 */     } else if (paramClass == bmd.class) {
/*   64: 127 */       localObject = bmd.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*   65: 128 */     } else if (paramClass == bme.class) {
/*   66: 129 */       localObject = bme.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*   67: 130 */     } else if (paramClass == bmj.class) {
/*   68: 131 */       localObject = bmj.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*   69: 132 */     } else if (paramClass == bmg.class) {
/*   70: 133 */       localObject = bmg.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*   71: 134 */     } else if (paramClass == blx.class) {
/*   72: 135 */       localObject = blx.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*   73: 136 */     } else if (paramClass == blv.class) {
/*   74: 137 */       localObject = blv.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*   75: 138 */     } else if (paramClass == blz.class) {
/*   76: 139 */       localObject = blz.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*   77: 140 */     } else if (paramClass == bmb.class) {
/*   78: 141 */       localObject = bmb.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*   79:     */     }
/*   80: 144 */     return localObject;
/*   81:     */   }
/*   82:     */   
/*   83:     */   private static bmk b(bmh parambmh, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   84:     */   {
/*   85: 148 */     if (!d()) {
/*   86: 149 */       return null;
/*   87:     */     }
/*   88: 152 */     if (d != null)
/*   89:     */     {
/*   90: 153 */       bmk localbmk1 = a(d, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*   91: 154 */       d = null;
/*   92: 156 */       if (localbmk1 != null) {
/*   93: 157 */         return localbmk1;
/*   94:     */       }
/*   95:     */     }
/*   96: 161 */     int i = 0;
/*   97:     */     int j;
/*   98: 162 */     while (i < 5)
/*   99:     */     {
/*  100: 163 */       i++;
/*  101:     */       
/*  102: 165 */       j = paramRandom.nextInt(a);
/*  103: 166 */       for (bma localbma : c)
/*  104:     */       {
/*  105: 167 */         j -= localbma.b;
/*  106: 168 */         if (j < 0)
/*  107:     */         {
/*  108: 169 */           if ((!localbma.a(paramInt4)) || (localbma == parambmh.a)) {
/*  109:     */             break;
/*  110:     */           }
/*  111: 173 */           bmk localbmk2 = a(localbma.a, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4);
/*  112: 174 */           if (localbmk2 != null)
/*  113:     */           {
/*  114: 175 */             localbma.c += 1;
/*  115: 176 */             parambmh.a = localbma;
/*  116: 178 */             if (!localbma.a()) {
/*  117: 179 */               c.remove(localbma);
/*  118:     */             }
/*  119: 181 */             return localbmk2;
/*  120:     */           }
/*  121:     */         }
/*  122:     */       }
/*  123:     */     }
/*  124: 186 */     bjb localbjb = blw.a(paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej);
/*  125: 187 */     if ((localbjb != null) && (localbjb.b > 1)) {
/*  126: 188 */       return new blw(paramInt4, paramRandom, localbjb, paramej);
/*  127:     */     }
/*  128: 191 */     return null;
/*  129:     */   }
/*  130:     */   
/*  131:     */   private static bms c(bmh parambmh, List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*  132:     */   {
/*  133: 195 */     if (paramInt4 > 50) {
/*  134: 196 */       return null;
/*  135:     */     }
/*  136: 198 */     if ((Math.abs(paramInt1 - parambmh.c().a) > 112) || (Math.abs(paramInt3 - parambmh.c().c) > 112)) {
/*  137: 199 */       return null;
/*  138:     */     }
/*  139: 202 */     bmk localbmk = b(parambmh, paramList, paramRandom, paramInt1, paramInt2, paramInt3, paramej, paramInt4 + 1);
/*  140: 203 */     if (localbmk != null)
/*  141:     */     {
/*  142: 204 */       paramList.add(localbmk);
/*  143: 205 */       parambmh.c.add(localbmk);
/*  144:     */     }
/*  145: 207 */     return localbmk;
/*  146:     */   }
/*  147:     */   
/*  148:1616 */   private static final bmf e = new bmf(null);
				  static bms a(bmh arg0, List<bms> arg1, Random arg2, int arg3, int arg4, int arg5, EnumDirection arg6, int arg7) {return c(arg0,arg1,arg2,arg3,arg4,arg5,arg6,arg7);}
				  static Class a(Class arg0) {return d=arg0;}
				  static bmf c() {return e;}
/*  149:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     blr
 * JD-Core Version:    0.7.0.1
 */