package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class ajf
/*   4:    */   extends aib
/*   5:    */ {
/*   6:    */   private aqb a;
/*   7:    */   private aje f;
/*   8:    */   private final World g;
/*   9:    */   
/*  10:    */   public ajf(ahb paramahb, aqb paramaqb, World paramaqu)
/*  11:    */   {
/*  12: 33 */     this.a = paramaqb;
/*  13: 34 */     this.g = paramaqu;
/*  14:    */     
/*  15: 36 */     this.f = new aje(paramahb.d, paramaqb);
/*  16: 37 */     a(new ajk(this.f, 0, 36, 53));
/*  17: 38 */     a(new ajk(this.f, 1, 62, 53));
/*  18: 39 */     a(new ajg(paramahb.d, paramaqb, this.f, 2, 120, 53));
/*  19: 41 */     for (int i = 0; i < 3; i++) {
/*  20: 42 */       for (int j = 0; j < 9; j++) {
/*  21: 43 */         a(new ajk(paramahb, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*  22:    */       }
/*  23:    */     }
/*  24: 46 */     for (int i = 0; i < 9; i++) {
/*  25: 47 */       a(new ajk(paramahb, i, 8 + i * 18, 142));
/*  26:    */     }
/*  27:    */   }
/*  28:    */   
/*  29:    */   public aje e()
/*  30:    */   {
/*  31: 52 */     return this.f;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void a(ail paramail)
/*  35:    */   {
/*  36: 57 */     super.a(paramail);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void b()
/*  40:    */   {
/*  41: 62 */     super.b();
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void a(vq paramvq)
/*  45:    */   {
/*  46: 67 */     this.f.h();
/*  47: 68 */     super.a(paramvq);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void d(int paramInt)
/*  51:    */   {
/*  52: 72 */     this.f.d(paramInt);
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void b(int paramInt1, int paramInt2) {}
/*  56:    */   
/*  57:    */   public boolean a(EntityPlayer paramahd)
/*  58:    */   {
/*  59: 81 */     return this.a.u_() == paramahd;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public ItemStack b(EntityPlayer paramahd, int paramInt)
/*  63:    */   {
/*  64: 87 */     ItemStack localamj1 = null;
/*  65: 88 */     ajk localajk = (ajk)this.c.get(paramInt);
/*  66: 89 */     if ((localajk != null) && (localajk.e()))
/*  67:    */     {
/*  68: 90 */       ItemStack localamj2 = localajk.d();
/*  69: 91 */       localamj1 = localamj2.k();
/*  70: 93 */       if (paramInt == 2)
/*  71:    */       {
/*  72: 94 */         if (!a(localamj2, 3, 39, true)) {
/*  73: 95 */           return null;
/*  74:    */         }
/*  75: 97 */         localajk.a(localamj2, localamj1);
/*  76:    */       }
/*  77: 98 */       else if ((paramInt == 0) || (paramInt == 1))
/*  78:    */       {
/*  79: 99 */         if (!a(localamj2, 3, 39, false)) {
/*  80:100 */           return null;
/*  81:    */         }
/*  82:    */       }
/*  83:102 */       else if ((paramInt >= 3) && (paramInt < 30))
/*  84:    */       {
/*  85:103 */         if (!a(localamj2, 30, 39, false)) {
/*  86:104 */           return null;
/*  87:    */         }
/*  88:    */       }
/*  89:106 */       else if ((paramInt >= 30) && (paramInt < 39) && 
/*  90:107 */         (!a(localamj2, 3, 30, false)))
/*  91:    */       {
/*  92:108 */         return null;
/*  93:    */       }
/*  94:111 */       if (localamj2.stackSize == 0) {
/*  95:112 */         localajk.d(null);
/*  96:    */       } else {
/*  97:114 */         localajk.f();
/*  98:    */       }
/*  99:116 */       if (localamj2.stackSize == localamj1.stackSize) {
/* 100:117 */         return null;
/* 101:    */       }
/* 102:119 */       localajk.a(paramahd, localamj2);
/* 103:    */     }
/* 104:122 */     return localamj1;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void b(EntityPlayer paramahd)
/* 108:    */   {
/* 109:127 */     super.b(paramahd);
/* 110:128 */     this.a.a_((EntityPlayer)null);
/* 111:    */     
/* 112:130 */     super.b(paramahd);
/* 113:131 */     if (this.g.isClient) {
/* 114:132 */       return;
/* 115:    */     }
/* 116:135 */     ItemStack localamj = this.f.b(0);
/* 117:136 */     if (localamj != null) {
/* 118:137 */       paramahd.a(localamj, false);
/* 119:    */     }
/* 120:139 */     localamj = this.f.b(1);
/* 121:140 */     if (localamj != null) {
/* 122:141 */       paramahd.a(localamj, false);
/* 123:    */     }
/* 124:    */   }
/* 125:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajf
 * JD-Core Version:    0.7.0.1
 */