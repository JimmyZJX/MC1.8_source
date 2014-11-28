package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class aiv
/*   4:    */   extends aib
/*   5:    */ {
/*   6:    */   private final vq a;
/*   7:    */   private int f;
/*   8:    */   private int g;
/*   9:    */   private int h;
/*  10:    */   private int i;
/*  11:    */   
/*  12:    */   public aiv(Inventory paramahb, vq paramvq)
/*  13:    */   {
/*  14: 26 */     this.a = paramvq;
/*  15:    */     
/*  16: 28 */     a(new ajk(paramvq, 0, 56, 17));
/*  17: 29 */     a(new aiu(paramvq, 1, 56, 53));
/*  18: 30 */     a(new aiw(paramahb.d, paramvq, 2, 116, 35));
/*  19: 32 */     for (int j = 0; j < 3; j++) {
/*  20: 33 */       for (int k = 0; k < 9; k++) {
/*  21: 34 */         a(new ajk(paramahb, k + j * 9 + 9, 8 + k * 18, 84 + j * 18));
/*  22:    */       }
/*  23:    */     }
/*  24: 37 */     for (int j = 0; j < 9; j++) {
/*  25: 38 */       a(new ajk(paramahb, j, 8 + j * 18, 142));
/*  26:    */     }
/*  27:    */   }
/*  28:    */   
/*  29:    */   public void a(ail paramail)
/*  30:    */   {
/*  31: 49 */     super.a(paramail);
/*  32: 50 */     paramail.a(this, this.a);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void b()
/*  36:    */   {
/*  37: 55 */     super.b();
/*  38: 57 */     for (int j = 0; j < this.e.size(); j++)
/*  39:    */     {
/*  40: 58 */       ail localail = (ail)this.e.get(j);
/*  41: 59 */       if (this.f != this.a.a_(2)) {
/*  42: 60 */         localail.a(this, 2, this.a.a_(2));
/*  43:    */       }
/*  44: 62 */       if (this.h != this.a.a_(0)) {
/*  45: 63 */         localail.a(this, 0, this.a.a_(0));
/*  46:    */       }
/*  47: 65 */       if (this.i != this.a.a_(1)) {
/*  48: 66 */         localail.a(this, 1, this.a.a_(1));
/*  49:    */       }
/*  50: 68 */       if (this.g != this.a.a_(3)) {
/*  51: 69 */         localail.a(this, 3, this.a.a_(3));
/*  52:    */       }
/*  53:    */     }
/*  54: 73 */     this.f = this.a.a_(2);
/*  55: 74 */     this.h = this.a.a_(0);
/*  56: 75 */     this.i = this.a.a_(1);
/*  57: 76 */     this.g = this.a.a_(3);
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void b(int paramInt1, int paramInt2)
/*  61:    */   {
/*  62: 81 */     this.a.b(paramInt1, paramInt2);
/*  63:    */   }
/*  64:    */   
/*  65:    */   public boolean a(EntityPlayer paramahd)
/*  66:    */   {
/*  67: 86 */     return this.a.a(paramahd);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public ItemStack b(EntityPlayer paramahd, int paramInt)
/*  71:    */   {
/*  72: 92 */     ItemStack localamj1 = null;
/*  73: 93 */     ajk localajk = (ajk)this.c.get(paramInt);
/*  74: 94 */     if ((localajk != null) && (localajk.e()))
/*  75:    */     {
/*  76: 95 */       ItemStack localamj2 = localajk.d();
/*  77: 96 */       localamj1 = localamj2.k();
/*  78: 98 */       if (paramInt == 2)
/*  79:    */       {
/*  80: 99 */         if (!a(localamj2, 3, 39, true)) {
/*  81:100 */           return null;
/*  82:    */         }
/*  83:102 */         localajk.a(localamj2, localamj1);
/*  84:    */       }
/*  85:103 */       else if ((paramInt == 1) || (paramInt == 0))
/*  86:    */       {
/*  87:104 */         if (!a(localamj2, 3, 39, false)) {
/*  88:105 */           return null;
/*  89:    */         }
/*  90:    */       }
/*  91:107 */       else if (aok.a().a(localamj2) != null)
/*  92:    */       {
/*  93:108 */         if (!a(localamj2, 0, 1, false)) {
/*  94:109 */           return null;
/*  95:    */         }
/*  96:    */       }
/*  97:111 */       else if (bdc.c(localamj2))
/*  98:    */       {
/*  99:112 */         if (!a(localamj2, 1, 2, false)) {
/* 100:113 */           return null;
/* 101:    */         }
/* 102:    */       }
/* 103:115 */       else if ((paramInt >= 3) && (paramInt < 30))
/* 104:    */       {
/* 105:116 */         if (!a(localamj2, 30, 39, false)) {
/* 106:117 */           return null;
/* 107:    */         }
/* 108:    */       }
/* 109:119 */       else if ((paramInt >= 30) && (paramInt < 39) && 
/* 110:120 */         (!a(localamj2, 3, 30, false)))
/* 111:    */       {
/* 112:121 */         return null;
/* 113:    */       }
/* 114:124 */       if (localamj2.stackSize == 0) {
/* 115:125 */         localajk.d(null);
/* 116:    */       } else {
/* 117:127 */         localajk.f();
/* 118:    */       }
/* 119:129 */       if (localamj2.stackSize == localamj1.stackSize) {
/* 120:130 */         return null;
/* 121:    */       }
/* 122:132 */       localajk.a(paramahd, localamj2);
/* 123:    */     }
/* 124:135 */     return localamj1;
/* 125:    */   }
/* 126:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aiv
 * JD-Core Version:    0.7.0.1
 */