package net.minecraft.src;
/*   1:    */ import java.util.Collections;
/*   2:    */ import java.util.Comparator;
/*   3:    */ import java.util.List;
/*   4:    */ import org.lwjgl.input.Mouse;
/*   5:    */ 
/*   6:    */ abstract class byc
/*   7:    */   extends bvk
/*   8:    */ {
/*   9:246 */   protected int v = -1;
/*  10:    */   protected List<to> w;
/*  11:    */   protected Comparator x;
/*  12:250 */   protected int y = -1;
/*  13:    */   protected int z;
				private final bxv A;
/*  14:    */   
/*  15:    */   protected byc(bxv parambxv, bsu parambsu)
/*  16:    */   {
/*  17:254 */     super(parambsu, parambxv.l, parambxv.m, 32, parambxv.m - 64, 20);
/*  18:    */     A=parambxv;
/*  19:256 */     a(false);
/*  20:257 */     a(true, 20);
/*  21:    */   }
/*  22:    */   
/*  23:    */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {}
/*  24:    */   
/*  25:    */   protected boolean a(int paramInt)
/*  26:    */   {
/*  27:266 */     return false;
/*  28:    */   }
/*  29:    */   
/*  30:    */   protected void a()
/*  31:    */   {
/*  32:271 */     this.A.c();
/*  33:    */   }
/*  34:    */   
/*  35:    */   protected void a(int paramInt1, int paramInt2, ckx paramckx)
/*  36:    */   {
/*  37:276 */     if (!Mouse.isButtonDown(0)) {
/*  38:277 */       this.v = -1;
/*  39:    */     }
/*  40:280 */     if (this.v == 0) {
/*  41:281 */       bxv.a(this.A, paramInt1 + 115 - 18, paramInt2 + 1, 0, 0);
/*  42:    */     } else {
/*  43:283 */       bxv.a(this.A, paramInt1 + 115 - 18, paramInt2 + 1, 0, 18);
/*  44:    */     }
/*  45:286 */     if (this.v == 1) {
/*  46:287 */       bxv.a(this.A, paramInt1 + 165 - 18, paramInt2 + 1, 0, 0);
/*  47:    */     } else {
/*  48:289 */       bxv.a(this.A, paramInt1 + 165 - 18, paramInt2 + 1, 0, 18);
/*  49:    */     }
/*  50:292 */     if (this.v == 2) {
/*  51:293 */       bxv.a(this.A, paramInt1 + 215 - 18, paramInt2 + 1, 0, 0);
/*  52:    */     } else {
/*  53:295 */       bxv.a(this.A, paramInt1 + 215 - 18, paramInt2 + 1, 0, 18);
/*  54:    */     }
/*  55:298 */     if (this.y != -1)
/*  56:    */     {
/*  57:299 */       int i = 79;
/*  58:300 */       int j = 18;
/*  59:302 */       if (this.y == 1) {
/*  60:303 */         i = 129;
/*  61:304 */       } else if (this.y == 2) {
/*  62:305 */         i = 179;
/*  63:    */       }
/*  64:308 */       if (this.z == 1) {
/*  65:309 */         j = 36;
/*  66:    */       }
/*  67:311 */       bxv.a(this.A, paramInt1 + i, paramInt2 + 1, j, 0);
/*  68:    */     }
/*  69:    */   }
/*  70:    */   
/*  71:    */   protected void a(int paramInt1, int paramInt2)
/*  72:    */   {
/*  73:317 */     this.v = -1;
/*  74:318 */     if ((paramInt1 >= 79) && (paramInt1 < 115)) {
/*  75:319 */       this.v = 0;
/*  76:320 */     } else if ((paramInt1 >= 129) && (paramInt1 < 165)) {
/*  77:321 */       this.v = 1;
/*  78:322 */     } else if ((paramInt1 >= 179) && (paramInt1 < 215)) {
/*  79:323 */       this.v = 2;
/*  80:    */     }
/*  81:326 */     if (this.v >= 0)
/*  82:    */     {
/*  83:327 */       d(this.v);
/*  84:328 */       this.a.U().a(cxy.a(new oa("gui.button.press"), 1.0F));
/*  85:    */     }
/*  86:    */   }
/*  87:    */   
/*  88:    */   protected final int b()
/*  89:    */   {
/*  90:334 */     return this.w.size();
/*  91:    */   }
/*  92:    */   
/*  93:    */   protected final to c(int paramInt)
/*  94:    */   {
/*  95:338 */     return (to)this.w.get(paramInt);
/*  96:    */   }
/*  97:    */   
/*  98:    */   protected abstract String b(int paramInt);
/*  99:    */   
/* 100:    */   protected void a(PlayerStat paramtq, int paramInt1, int paramInt2, boolean paramBoolean)
/* 101:    */   {
/* 102:    */     String str;
/* 103:344 */     if (paramtq != null)
/* 104:    */     {
/* 105:345 */       str = paramtq.a(bxv.b(this.A).a(paramtq));
/* 106:346 */       this.A.c(bxv.e(this.A), str, paramInt1 - bxv.f(this.A).a(str), paramInt2 + 5, paramBoolean ? 16777215 : 9474192);
/* 107:    */     }
/* 108:    */     else
/* 109:    */     {
/* 110:348 */       str = "-";
/* 111:349 */       this.A.c(bxv.g(this.A), str, paramInt1 - bxv.h(this.A).a(str), paramInt2 + 5, paramBoolean ? 16777215 : 9474192);
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   protected void b(int paramInt1, int paramInt2)
/* 116:    */   {
/* 117:355 */     if ((paramInt2 < this.d) || (paramInt2 > this.e)) {
/* 118:356 */       return;
/* 119:    */     }
/* 120:359 */     int i = c(paramInt1, paramInt2);
/* 121:360 */     int j = this.b / 2 - 92 - 16;
/* 122:    */     Object localObject;
/* 123:361 */     if (i >= 0)
/* 124:    */     {
/* 125:362 */       if ((paramInt1 < j + 40) || (paramInt1 > j + 40 + 20)) {
/* 126:363 */         return;
/* 127:    */       }
/* 128:366 */       localObject = c(i);
/* 129:367 */       a((to)localObject, paramInt1, paramInt2);
/* 130:    */     }
/* 131:    */     else
/* 132:    */     {
/* 133:369 */       localObject = "";
/* 134:370 */       if ((paramInt1 >= j + 115 - 18) && (paramInt1 <= j + 115)) {
/* 135:371 */         localObject = b(0);
/* 136:372 */       } else if ((paramInt1 >= j + 165 - 18) && (paramInt1 <= j + 165)) {
/* 137:373 */         localObject = b(1);
/* 138:374 */       } else if ((paramInt1 >= j + 215 - 18) && (paramInt1 <= j + 215)) {
/* 139:375 */         localObject = b(2);
/* 140:    */       } else {
/* 141:377 */         return;
/* 142:    */       }
/* 143:380 */       localObject = ("" + cwc.a((String)localObject, new Object[0])).trim();
/* 144:382 */       if (((String)localObject).length() > 0)
/* 145:    */       {
/* 146:383 */         int k = paramInt1 + 12;
/* 147:384 */         int m = paramInt2 - 12;
/* 148:385 */         int n = bxv.i(this.A).a((String)localObject);
/* 149:386 */         bxv.a(this.A, k - 3, m - 3, k + n + 3, m + 8 + 3, -1073741824, -1073741824);
/* 150:    */         
/* 151:388 */         bxv.j(this.A).a((String)localObject, k, m, -1);
/* 152:    */       }
/* 153:    */     }
/* 154:    */   }
/* 155:    */   
/* 156:    */   protected void a(to paramto, int paramInt1, int paramInt2)
/* 157:    */   {
/* 158:394 */     if (paramto == null) {
/* 159:395 */       return;
/* 160:    */     }
/* 161:398 */     Item localalq = paramto.a();
/* 162:399 */     ItemStack localamj = new ItemStack(localalq);
/* 163:400 */     String str1 = localamj.a();
/* 164:    */     
/* 165:402 */     String str2 = ("" + cwc.a(new StringBuilder().append(str1).append(".name").toString(), new Object[0])).trim();
/* 166:404 */     if (str2.length() > 0)
/* 167:    */     {
/* 168:405 */       int i = paramInt1 + 12;
/* 169:406 */       int j = paramInt2 - 12;
/* 170:407 */       int k = bxv.k(this.A).a(str2);
/* 171:408 */       bxv.b(this.A, i - 3, j - 3, i + k + 3, j + 8 + 3, -1073741824, -1073741824);
/* 172:    */       
/* 173:410 */       bxv.l(this.A).a(str2, i, j, -1);
/* 174:    */     }
/* 175:    */   }
/* 176:    */   
/* 177:    */   protected void d(int paramInt)
/* 178:    */   {
/* 179:415 */     if (paramInt != this.y)
/* 180:    */     {
/* 181:416 */       this.y = paramInt;
/* 182:417 */       this.z = -1;
/* 183:    */     }
/* 184:418 */     else if (this.z == -1)
/* 185:    */     {
/* 186:419 */       this.z = 1;
/* 187:    */     }
/* 188:    */     else
/* 189:    */     {
/* 190:421 */       this.y = -1;
/* 191:422 */       this.z = 0;
/* 192:    */     }
/* 193:425 */     Collections.sort(this.w, this.x);
/* 194:    */   }
/* 195:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byc
 * JD-Core Version:    0.7.0.1
 */