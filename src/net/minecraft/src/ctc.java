package net.minecraft.src;
/*   1:    */ public class ctc
/*   2:    */   extends cqv<cil>
/*   3:    */ {
/*   4:    */   private boolean a;
/*   5:    */   
/*   6:    */   public ctc(cpt paramcpt)
/*   7:    */   {
/*   8: 24 */     this(paramcpt, false);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public ctc(cpt paramcpt, boolean paramBoolean)
/*  12:    */   {
/*  13: 28 */     super(paramcpt, new cct(0.0F, paramBoolean), 0.5F);
/*  14: 29 */     this.a = paramBoolean;
/*  15:    */     
/*  16: 31 */     a(new csm(this));
/*  17: 32 */     a(new csn(this));
/*  18: 33 */     a(new csd(this));
/*  19: 34 */     a(new csi(this));
/*  20: 35 */     a(new cse(this));
/*  21: 36 */     a(new csh(b().e));
/*  22:    */   }
/*  23:    */   
/*  24:    */   public cct b()
/*  25:    */   {
/*  26: 41 */     return (cct)super.b();
/*  27:    */   }
/*  28:    */   
/*  29:    */   public void a(cil paramcil, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  30:    */   {
/*  31: 46 */     if ((paramcil.cb()) && (this.b.c != paramcil)) {
/*  32: 48 */       return;
/*  33:    */     }
/*  34: 51 */     double d = paramDouble2;
/*  35: 52 */     if ((paramcil.aw()) && (!(paramcil instanceof cio))) {
/*  36: 53 */       d -= 0.125D;
/*  37:    */     }
/*  38: 56 */     d(paramcil);
/*  39:    */     
/*  40: 58 */     super.a(paramcil, paramDouble1, d, paramDouble3, paramFloat1, paramFloat2);
/*  41:    */   }
/*  42:    */   
/*  43:    */   private void d(cil paramcil)
/*  44:    */   {
/*  45: 62 */     cct localcct = b();
/*  46: 63 */     if (paramcil.v())
/*  47:    */     {
/*  48: 64 */       localcct.a(false);
/*  49: 65 */       localcct.e.j = true;
/*  50: 66 */       localcct.f.j = true;
/*  51:    */     }
/*  52:    */     else
/*  53:    */     {
/*  54: 68 */       ItemStack localamj = paramcil.bg.h();
/*  55:    */       
/*  56: 70 */       localcct.a(true);
/*  57:    */       
/*  58: 72 */       localcct.f.j = paramcil.a(ahh.g);
/*  59: 73 */       localcct.v.j = paramcil.a(ahh.b);
/*  60: 74 */       localcct.c.j = paramcil.a(ahh.e);
/*  61: 75 */       localcct.d.j = paramcil.a(ahh.f);
/*  62: 76 */       localcct.a.j = paramcil.a(ahh.c);
/*  63: 77 */       localcct.b.j = paramcil.a(ahh.d);
/*  64:    */       
/*  65: 79 */       localcct.l = 0;
/*  66: 80 */       localcct.o = false;
/*  67: 81 */       localcct.n = paramcil.aw();
/*  68: 83 */       if (localamj == null)
/*  69:    */       {
/*  70: 84 */         localcct.m = 0;
/*  71:    */       }
/*  72:    */       else
/*  73:    */       {
/*  74: 86 */         localcct.m = 1;
/*  75: 87 */         if (paramcil.bQ() > 0)
/*  76:    */         {
/*  77: 88 */           ano localano = localamj.m();
/*  78: 89 */           if (localano == ano.d) {
/*  79: 90 */             localcct.m = 3;
/*  80: 91 */           } else if (localano == ano.e) {
/*  81: 92 */             localcct.o = true;
/*  82:    */           }
/*  83:    */         }
/*  84:    */       }
/*  85:    */     }
/*  86:    */   }
/*  87:    */   
/*  88:    */   protected oa a(cil paramcil)
/*  89:    */   {
/*  90:101 */     return paramcil.i();
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void B_()
/*  94:    */   {
/*  95:106 */     cjm.glTranslatef(0.0F, 0.1875F, 0.0F);
/*  96:    */   }
/*  97:    */   
/*  98:    */   protected void a(cil paramcil, float paramFloat)
/*  99:    */   {
/* 100:111 */     float f = 0.9375F;
/* 101:112 */     cjm.glScalef(f, f, f);
/* 102:    */   }
/* 103:    */   
/* 104:    */   protected void a(cil paramcil, double paramDouble1, double paramDouble2, double paramDouble3, String paramString, float paramFloat, double paramDouble4)
/* 105:    */   {
/* 106:117 */     if (paramDouble4 < 100.0D)
/* 107:    */     {
/* 108:118 */       bsd localbsd = paramcil.co();
/* 109:119 */       bry localbry = localbsd.a(2);
/* 110:120 */       if (localbry != null)
/* 111:    */       {
/* 112:121 */         bsa localbsa = localbsd.c(paramcil.getName(), localbry);
/* 113:    */         
/* 114:123 */         a(paramcil, localbsa.c() + " " + localbry.d(), paramDouble1, paramDouble2, paramDouble3, 64);
/* 115:    */         
/* 116:125 */         paramDouble2 += c().a * 1.15F * paramFloat;
/* 117:    */       }
/* 118:    */     }
/* 119:129 */     super.a(paramcil, paramDouble1, paramDouble2, paramDouble3, paramString, paramFloat, paramDouble4);
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void ctc_b(cil paramcil)
/* 123:    */   {
/* 124:133 */     float f = 1.0F;
/* 125:134 */     cjm.c(f, f, f);
/* 126:    */     
/* 127:136 */     cct localcct = b();
/* 128:137 */     d(paramcil);
/* 129:138 */     localcct.p = 0.0F;
/* 130:139 */     localcct.n = false;
/* 131:140 */     localcct.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, paramcil);
/* 132:141 */     localcct.a();
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void ctc_c(cil paramcil)
/* 136:    */   {
/* 137:145 */     float f = 1.0F;
/* 138:146 */     cjm.c(f, f, f);
/* 139:    */     
/* 140:148 */     cct localcct = b();
/* 141:149 */     d(paramcil);
/* 142:150 */     localcct.n = false;
/* 143:151 */     localcct.p = 0.0F;
/* 144:152 */     localcct.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, paramcil);
/* 145:153 */     localcct.b();
/* 146:    */   }
/* 147:    */   
/* 148:    */   protected void cqv_a(cil paramcil, double paramDouble1, double paramDouble2, double paramDouble3)
/* 149:    */   {
/* 150:158 */     if ((paramcil.ai()) && (paramcil.bI())) {
/* 151:159 */       super.a(paramcil, paramDouble1 + paramcil.bw, paramDouble2 + paramcil.bX, paramDouble3 + paramcil.bx);
/* 152:    */     } else {
/* 153:161 */       super.a(paramcil, paramDouble1, paramDouble2, paramDouble3);
/* 154:    */     }
/* 155:    */   }
/* 156:    */   
/* 157:    */   protected void a(cil paramcil, float paramFloat1, float paramFloat2, float paramFloat3)
/* 158:    */   {
/* 159:167 */     if ((paramcil.ai()) && (paramcil.bI()))
/* 160:    */     {
/* 161:168 */       cjm.glRotatef(paramcil.cd(), 0.0F, 1.0F, 0.0F);
/* 162:169 */       cjm.glRotatef(cqv_b(paramcil), 0.0F, 0.0F, 1.0F);
/* 163:170 */       cjm.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
/* 164:    */     }
/* 165:    */     else
/* 166:    */     {
/* 167:172 */       super.a(paramcil, paramFloat1, paramFloat2, paramFloat3);
/* 168:    */     }
/* 169:    */   }
/* 170:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctc
 * JD-Core Version:    0.7.0.1
 */