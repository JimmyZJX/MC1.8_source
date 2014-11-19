package net.minecraft.src;
/*   1:    */ import java.util.Calendar;
/*   2:    */ 
/*   3:    */ public class cnq
/*   4:    */   extends cnp<bcr>
/*   5:    */ {
/*   6: 16 */   private static final oa c = new oa("textures/entity/chest/trapped_double.png");
/*   7: 17 */   private static final oa d = new oa("textures/entity/chest/christmas_double.png");
/*   8: 18 */   private static final oa e = new oa("textures/entity/chest/normal_double.png");
/*   9: 19 */   private static final oa f = new oa("textures/entity/chest/trapped.png");
/*  10: 20 */   private static final oa g = new oa("textures/entity/chest/christmas.png");
/*  11: 21 */   private static final oa h = new oa("textures/entity/chest/normal.png");
/*  12: 23 */   private ccb i = new ccb();
/*  13: 24 */   private ccb j = new ccm();
/*  14:    */   private boolean k;
/*  15:    */   
/*  16:    */   public cnq()
/*  17:    */   {
/*  18: 30 */     Calendar localCalendar = Calendar.getInstance();
/*  19: 31 */     if ((localCalendar.get(2) + 1 == 12) && (localCalendar.get(5) >= 24) && (localCalendar.get(5) <= 26)) {
/*  20: 32 */       this.k = true;
/*  21:    */     }
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void a(bcr parambcr, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, int paramInt)
/*  25:    */   {
/*  26:    */     int m;
/*  27:    */     Object localObject;
/*  28: 40 */     if (!parambcr.t())
/*  29:    */     {
/*  30: 41 */       m = 0;
/*  31:    */     }
/*  32:    */     else
/*  33:    */     {
/*  34: 43 */       localObject = parambcr.w();
/*  35: 44 */       m = parambcr.getData();
/*  36: 46 */       if (((localObject instanceof auj)) && (m == 0))
/*  37:    */       {
/*  38: 47 */         ((auj)localObject).e(parambcr.z(), parambcr.v(), parambcr.z().getBlock(parambcr.v()));
/*  39: 48 */         m = parambcr.getData();
/*  40:    */       }
/*  41: 51 */       parambcr.m();
/*  42:    */     }
/*  43: 53 */     if ((parambcr.f != null) || (parambcr.h != null)) {
/*  44: 54 */       return;
/*  45:    */     }
/*  46: 58 */     if ((parambcr.g != null) || (parambcr.i != null))
/*  47:    */     {
/*  48: 59 */       localObject = this.j;
/*  49: 61 */       if (paramInt >= 0)
/*  50:    */       {
/*  51: 62 */         a(a[paramInt]);
/*  52: 63 */         cjm.glMatrixMode(5890);
/*  53: 64 */         cjm.glPushMatrix();
/*  54: 65 */         cjm.glScalef(8.0F, 4.0F, 1.0F);
/*  55: 66 */         cjm.glTranslatef(0.0625F, 0.0625F, 0.0625F);
/*  56: 67 */         cjm.glMatrixMode(5888);
/*  57:    */       }
/*  58: 68 */       else if (parambcr.n() == 1)
/*  59:    */       {
/*  60: 69 */         a(c);
/*  61:    */       }
/*  62: 70 */       else if (this.k)
/*  63:    */       {
/*  64: 71 */         a(d);
/*  65:    */       }
/*  66:    */       else
/*  67:    */       {
/*  68: 73 */         a(e);
/*  69:    */       }
/*  70:    */     }
/*  71:    */     else
/*  72:    */     {
/*  73: 76 */       localObject = this.i;
/*  74: 77 */       if (paramInt >= 0)
/*  75:    */       {
/*  76: 78 */         a(a[paramInt]);
/*  77: 79 */         cjm.glMatrixMode(5890);
/*  78: 80 */         cjm.glPushMatrix();
/*  79: 81 */         cjm.glScalef(4.0F, 4.0F, 1.0F);
/*  80: 82 */         cjm.glTranslatef(0.0625F, 0.0625F, 0.0625F);
/*  81: 83 */         cjm.glMatrixMode(5888);
/*  82:    */       }
/*  83: 84 */       else if (parambcr.n() == 1)
/*  84:    */       {
/*  85: 85 */         a(f);
/*  86:    */       }
/*  87: 86 */       else if (this.k)
/*  88:    */       {
/*  89: 87 */         a(g);
/*  90:    */       }
/*  91:    */       else
/*  92:    */       {
/*  93: 89 */         a(h);
/*  94:    */       }
/*  95:    */     }
/*  96: 93 */     cjm.glPushMatrix();
/*  97: 94 */     cjm.B();
/*  98: 95 */     if (paramInt < 0) {
/*  99: 96 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 100:    */     }
/* 101: 98 */     cjm.glTranslatef((float)paramDouble1, (float)paramDouble2 + 1.0F, (float)paramDouble3 + 1.0F);
/* 102: 99 */     cjm.glScalef(1.0F, -1.0F, -1.0F);
/* 103:    */     
/* 104:101 */     cjm.glTranslatef(0.5F, 0.5F, 0.5F);
/* 105:102 */     int n = 0;
/* 106:103 */     if (m == 2) {
/* 107:104 */       n = 180;
/* 108:    */     }
/* 109:106 */     if (m == 3) {
/* 110:107 */       n = 0;
/* 111:    */     }
/* 112:109 */     if (m == 4) {
/* 113:110 */       n = 90;
/* 114:    */     }
/* 115:112 */     if (m == 5) {
/* 116:113 */       n = -90;
/* 117:    */     }
/* 118:116 */     if ((m == 2) && (parambcr.g != null)) {
/* 119:117 */       cjm.glTranslatef(1.0F, 0.0F, 0.0F);
/* 120:    */     }
/* 121:119 */     if ((m == 5) && (parambcr.i != null)) {
/* 122:120 */       cjm.glTranslatef(0.0F, 0.0F, -1.0F);
/* 123:    */     }
/* 124:122 */     cjm.glRotatef(n, 0.0F, 1.0F, 0.0F);
/* 125:123 */     cjm.glTranslatef(-0.5F, -0.5F, -0.5F);
/* 126:    */     
/* 127:125 */     float f1 = parambcr.k + (parambcr.j - parambcr.k) * paramFloat;
/* 128:    */     float f2;
/* 129:126 */     if (parambcr.f != null)
/* 130:    */     {
/* 131:127 */       f2 = parambcr.f.k + (parambcr.f.j - parambcr.f.k) * paramFloat;
/* 132:128 */       if (f2 > f1) {
/* 133:129 */         f1 = f2;
/* 134:    */       }
/* 135:    */     }
/* 136:132 */     if (parambcr.h != null)
/* 137:    */     {
/* 138:133 */       f2 = parambcr.h.k + (parambcr.h.j - parambcr.h.k) * paramFloat;
/* 139:134 */       if (f2 > f1) {
/* 140:135 */         f1 = f2;
/* 141:    */       }
/* 142:    */     }
/* 143:139 */     f1 = 1.0F - f1;
/* 144:140 */     f1 = 1.0F - f1 * f1 * f1;
/* 145:    */     
/* 146:142 */     ((ccb)localObject).a.f = (-(f1 * 3.141593F / 2.0F));
/* 147:143 */     ((ccb)localObject).a();
/* 148:144 */     cjm.C();
/* 149:145 */     cjm.glPopMatrix();
/* 150:146 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 151:148 */     if (paramInt >= 0)
/* 152:    */     {
/* 153:149 */       cjm.glMatrixMode(5890);
/* 154:150 */       cjm.glPopMatrix();
/* 155:151 */       cjm.glMatrixMode(5888);
/* 156:    */     }
/* 157:    */   }
/* 158:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cnq
 * JD-Core Version:    0.7.0.1
 */