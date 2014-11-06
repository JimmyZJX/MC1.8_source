package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class aii
/*   4:    */   extends aib
/*   5:    */ {
/*   6:    */   private vq a;
/*   7:    */   private final ajk f;
/*   8:    */   private int g;
/*   9:    */   
/*  10:    */   public aii(ahb paramahb, vq paramvq)
/*  11:    */   {
/*  12: 27 */     this.a = paramvq;
/*  13:    */     
/*  14: 29 */     a(new aik(paramahb.d, paramvq, 0, 56, 46));
/*  15: 30 */     a(new aik(paramahb.d, paramvq, 1, 79, 53));
/*  16: 31 */     a(new aik(paramahb.d, paramvq, 2, 102, 46));
/*  17: 32 */     this.f = a(new aij(this, paramvq, 3, 79, 17));
/*  18: 34 */     for (int i = 0; i < 3; i++) {
/*  19: 35 */       for (int j = 0; j < 9; j++) {
/*  20: 36 */         a(new ajk(paramahb, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*  21:    */       }
/*  22:    */     }
/*  23: 39 */     for (int i = 0; i < 9; i++) {
/*  24: 40 */       a(new ajk(paramahb, i, 8 + i * 18, 142));
/*  25:    */     }
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void a(ail paramail)
/*  29:    */   {
/*  30: 48 */     super.a(paramail);
/*  31: 49 */     paramail.a(this, this.a);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void b()
/*  35:    */   {
/*  36: 54 */     super.b();
/*  37: 56 */     for (int i = 0; i < this.e.size(); i++)
/*  38:    */     {
/*  39: 57 */       ail localail = (ail)this.e.get(i);
/*  40: 58 */       if (this.g != this.a.a_(0)) {
/*  41: 59 */         localail.a(this, 0, this.a.a_(0));
/*  42:    */       }
/*  43:    */     }
/*  44: 62 */     this.g = this.a.a_(0);
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void b(int paramInt1, int paramInt2)
/*  48:    */   {
/*  49: 67 */     this.a.b(paramInt1, paramInt2);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public boolean a(EntityPlayer paramahd)
/*  53:    */   {
/*  54: 72 */     return this.a.a(paramahd);
/*  55:    */   }
/*  56:    */   
/*  57:    */   public ItemStack b(EntityPlayer paramahd, int paramInt)
/*  58:    */   {
/*  59: 78 */     ItemStack localamj1 = null;
/*  60: 79 */     ajk localajk = (ajk)this.c.get(paramInt);
/*  61: 80 */     if ((localajk != null) && (localajk.e()))
/*  62:    */     {
/*  63: 81 */       ItemStack localamj2 = localajk.d();
/*  64: 82 */       localamj1 = localamj2.k();
/*  65: 84 */       if (((paramInt >= 0) && (paramInt <= 2)) || (paramInt == 3))
/*  66:    */       {
/*  67: 85 */         if (!a(localamj2, 4, 40, true)) {
/*  68: 86 */           return null;
/*  69:    */         }
/*  70: 88 */         localajk.a(localamj2, localamj1);
/*  71:    */       }
/*  72: 89 */       else if ((!this.f.e()) && (this.f.a(localamj2)))
/*  73:    */       {
/*  74: 90 */         if (!a(localamj2, 3, 4, false)) {
/*  75: 91 */           return null;
/*  76:    */         }
/*  77:    */       }
/*  78: 93 */       else if (aik.b_(localamj1))
/*  79:    */       {
/*  80: 94 */         if (!a(localamj2, 0, 3, false)) {
/*  81: 95 */           return null;
/*  82:    */         }
/*  83:    */       }
/*  84: 97 */       else if ((paramInt >= 4) && (paramInt < 31))
/*  85:    */       {
/*  86: 98 */         if (!a(localamj2, 31, 40, false)) {
/*  87: 99 */           return null;
/*  88:    */         }
/*  89:    */       }
/*  90:101 */       else if ((paramInt >= 31) && (paramInt < 40))
/*  91:    */       {
/*  92:102 */         if (!a(localamj2, 4, 31, false)) {
/*  93:103 */           return null;
/*  94:    */         }
/*  95:    */       }
/*  96:106 */       else if (!a(localamj2, 4, 40, false))
/*  97:    */       {
/*  98:107 */         return null;
/*  99:    */       }
/* 100:110 */       if (localamj2.stackSize == 0) {
/* 101:111 */         localajk.d(null);
/* 102:    */       } else {
/* 103:113 */         localajk.f();
/* 104:    */       }
/* 105:115 */       if (localamj2.stackSize == localamj1.stackSize) {
/* 106:116 */         return null;
/* 107:    */       }
/* 108:118 */       localajk.a(paramahd, localamj2);
/* 109:    */     }
/* 110:121 */     return localamj1;
/* 111:    */   }
/* 112:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aii
 * JD-Core Version:    0.7.0.1
 */