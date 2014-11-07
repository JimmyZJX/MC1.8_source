package net.minecraft.src;
/*   1:    */ import io.netty.buffer.Unpooled;
/*   2:    */ import java.util.List;
/*   3:    */ import org.apache.logging.log4j.LogManager;
/*   4:    */ import org.apache.logging.log4j.Logger;
/*   5:    */ 
/*   6:    */ public class byn
/*   7:    */   extends byl
/*   8:    */ {
/*   9: 23 */   private static final Logger u = LogManager.getLogger();
/*  10: 26 */   private static final oa v = new oa("textures/gui/container/beacon.png");
/*  11:    */   private vq w;
/*  12:    */   private byp x;
/*  13:    */   private boolean y;
/*  14:    */   
/*  15:    */   public byn(ahb paramahb, vq paramvq)
/*  16:    */   {
/*  17: 34 */     super(new aig(paramahb, paramvq));
/*  18: 35 */     this.w = paramvq;
/*  19:    */     
/*  20: 37 */     this.f = 230;
/*  21: 38 */     this.g = 219;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void b()
/*  25:    */   {
/*  26: 43 */     super.b();
/*  27:    */     
/*  28: 45 */     this.n.add(this.x = new byp(this, -1, this.i + 164, this.r + 107));
/*  29: 46 */     this.n.add(new byo(this, -2, this.i + 190, this.r + 107));
/*  30:    */     
/*  31: 48 */     this.y = true;
/*  32:    */     
/*  33: 50 */     this.x.l = false;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void e()
/*  37:    */   {
/*  38: 55 */     super.e();
/*  39:    */     
/*  40: 57 */     int i = this.w.a_(0);
/*  41: 58 */     int j = this.w.a_(1);
/*  42: 59 */     int k = this.w.a_(2);
/*  43: 61 */     if ((this.y) && (i >= 0))
/*  44:    */     {
/*  45: 62 */       this.y = false;
/*  46:    */       int i3;
/*  47:    */       byq localbyq2;
/*  48: 64 */       for (int m = 0; m <= 2; m++)
/*  49:    */       {
/*  50: 65 */         int n = bck.a[m].length;
/*  51: 66 */         int i1 = n * 22 + (n - 1) * 2;
/*  52: 68 */         for (int i2 = 0; i2 < n; i2++)
/*  53:    */         {
/*  54: 69 */           i3 = bck.a[m][i2].id;
/*  55: 70 */           localbyq2 = new byq(this, m << 8 | i3, this.i + 76 + i2 * 24 - i1 / 2, this.r + 22 + m * 25, i3, m);
/*  56: 71 */           this.n.add(localbyq2);
/*  57: 73 */           if (m >= i) {
/*  58: 74 */             localbyq2.l = false;
/*  59: 75 */           } else if (i3 == j) {
/*  60: 76 */             localbyq2.b(true);
/*  61:    */           }
/*  62:    */         }
/*  63:    */       }
/*  64: 81 */       m = 3;
/*  65:    */       
/*  66: 83 */       int n = bck.a[m].length + 1;
/*  67: 84 */       int i1 = n * 22 + (n - 1) * 2;
/*  68: 86 */       for (int i2 = 0; i2 < n - 1; i2++)
/*  69:    */       {
/*  70: 87 */         i3 = bck.a[m][i2].id;
/*  71: 88 */         localbyq2 = new byq(this, m << 8 | i3, this.i + 167 + i2 * 24 - i1 / 2, this.r + 47, i3, m);
/*  72: 89 */         this.n.add(localbyq2);
/*  73: 91 */         if (m >= i) {
/*  74: 92 */           localbyq2.l = false;
/*  75: 93 */         } else if (i3 == k) {
/*  76: 94 */           localbyq2.b(true);
/*  77:    */         }
/*  78:    */       }
/*  79: 97 */       if (j > 0)
/*  80:    */       {
/*  81: 98 */         byq localbyq1 = new byq(this, m << 8 | j, this.i + 167 + (n - 1) * 24 - i1 / 2, this.r + 47, j, m);
/*  82: 99 */         this.n.add(localbyq1);
/*  83:101 */         if (m >= i) {
/*  84:102 */           localbyq1.l = false;
/*  85:103 */         } else if (j == k) {
/*  86:104 */           localbyq1.b(true);
/*  87:    */         }
/*  88:    */       }
/*  89:    */     }
/*  90:109 */     this.x.l = ((this.w.a(0) != null) && (j > 0));
/*  91:    */   }
/*  92:    */   
/*  93:    */   protected void a(bug parambug)
/*  94:    */   {
/*  95:114 */     if (parambug.k == -2)
/*  96:    */     {
/*  97:115 */       this.j.a((bxf)null);
/*  98:    */     }
/*  99:116 */     else if (parambug.k == -1)
/* 100:    */     {
/* 101:117 */       String str = "MC|Beacon";
/* 102:    */       
/* 103:119 */       ByteBufWrapper localhd = new ByteBufWrapper(Unpooled.buffer());
/* 104:    */       
/* 105:121 */       localhd.writeInt(this.w.a_(1));
/* 106:122 */       localhd.writeInt(this.w.a_(2));
/* 107:123 */       this.j.t().a(new mc(str, localhd));
/* 108:124 */       this.j.a((bxf)null);
/* 109:    */     }
/* 110:126 */     else if ((parambug instanceof byq))
/* 111:    */     {
/* 112:127 */       if (((byq)parambug).c()) {
/* 113:128 */         return;
/* 114:    */       }
/* 115:130 */       int i = parambug.k;
/* 116:131 */       int j = i & 0xFF;
/* 117:132 */       int k = i >> 8;
/* 118:134 */       if (k < 3) {
/* 119:135 */         this.w.b(1, j);
/* 120:    */       } else {
/* 121:137 */         this.w.b(2, j);
/* 122:    */       }
/* 123:140 */       this.n.clear();
/* 124:141 */       b();
/* 125:142 */       e();
/* 126:    */     }
/* 127:    */   }
/* 128:    */   
/* 129:    */   protected void b(int paramInt1, int paramInt2)
/* 130:    */   {
/* 131:148 */     bss.a();
/* 132:149 */     a(this.q, cwc.a("tile.beacon.primary", new Object[0]), 62, 10, 14737632);
/* 133:150 */     a(this.q, cwc.a("tile.beacon.secondary", new Object[0]), 169, 10, 14737632);
/* 134:152 */     for (bug localbug : this.n) {
/* 135:153 */       if (localbug.a())
/* 136:    */       {
/* 137:154 */         localbug.b(paramInt1 - this.i, paramInt2 - this.r);
/* 138:155 */         break;
/* 139:    */       }
/* 140:    */     }
/* 141:158 */     bss.c();
/* 142:    */   }
/* 143:    */   
/* 144:    */   protected void a(float paramFloat, int paramInt1, int paramInt2)
/* 145:    */   {
/* 146:163 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 147:164 */     this.j.N().a(v);
/* 148:165 */     int i = (this.l - this.f) / 2;
/* 149:166 */     int j = (this.m - this.g) / 2;
/* 150:167 */     b(i, j, 0, 0, this.f, this.g);
/* 151:    */     
/* 152:169 */     this.k.a = 100.0F;
/* 153:170 */     this.k.b(new ItemStack(ItemList.bO), i + 42, j + 109);
/* 154:171 */     this.k.b(new ItemStack(ItemList.diamond), i + 42 + 22, j + 109);
/* 155:172 */     this.k.b(new ItemStack(ItemList.k), i + 42 + 44, j + 109);
/* 156:173 */     this.k.b(new ItemStack(ItemList.j), i + 42 + 66, j + 109);
/* 157:174 */     this.k.a = 0.0F;
/* 158:    */   }
				static oa a() {return v;}
				static void a(byn arg0, String arg1, int arg2, int arg3) {arg0.a(arg1,arg2,arg3);}
				static void b(byn arg0, String arg1, int arg2, int arg3) {arg0.a(arg1,arg2,arg3);}
				static void c(byn arg0, String arg1, int arg2, int arg3) {arg0.a(arg1,arg2,arg3);}
/* 159:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byn
 * JD-Core Version:    0.7.0.1
 */