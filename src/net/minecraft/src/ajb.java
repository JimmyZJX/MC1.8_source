package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class ajb
/*   4:    */   extends aib
/*   5:    */ {
/*   6: 26 */   public ain a = new ain(this, 2, 2);
/*   7: 27 */   public vq f = new aji();
/*   8:    */   public boolean g;
/*   9:    */   private final EntityPlayer h;
/*  10:    */   
/*  11:    */   public ajb(ahb paramahb, boolean paramBoolean, EntityPlayer paramahd)
/*  12:    */   {
/*  13: 32 */     this.g = paramBoolean;
/*  14: 33 */     this.h = paramahd;
/*  15: 34 */     a(new ajj(paramahb.d, this.a, this.f, 0, 144, 36));
/*  16:    */     int j;
/*  17: 36 */     for (int i = 0; i < 2; i++) {
/*  18: 37 */       for (j = 0; j < 2; j++) {
/*  19: 38 */         a(new ajk(this.a, j + i * 2, 88 + j * 18, 26 + i * 18));
/*  20:    */       }
/*  21:    */     }
/*  22: 42 */     for (int i = 0; i < 4; i++)
/*  23:    */     {
/*  24: 43 */       j = i;
/*  25: 44 */       a(new ajc(this, paramahb, paramahb.getSize() - 1 - i, 8, 8 + i * 18, j));
/*  26:    */     }
/*  27: 71 */     for (int i = 0; i < 3; i++) {
/*  28: 72 */       for (j = 0; j < 9; j++) {
/*  29: 73 */         a(new ajk(paramahb, j + (i + 1) * 9, 8 + j * 18, 84 + i * 18));
/*  30:    */       }
/*  31:    */     }
/*  32: 76 */     for (int i = 0; i < 9; i++) {
/*  33: 77 */       a(new ajk(paramahb, i, 8 + i * 18, 142));
/*  34:    */     }
/*  35: 80 */     a(this.a);
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void a(vq paramvq)
/*  39:    */   {
/*  40: 85 */     this.f.a(0, aop.a().a(this.a, this.h.world));
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void b(EntityPlayer paramahd)
/*  44:    */   {
/*  45: 90 */     super.b(paramahd);
/*  46: 91 */     for (int i = 0; i < 4; i++)
/*  47:    */     {
/*  48: 92 */       ItemStack localamj = this.a.b(i);
/*  49: 93 */       if (localamj != null) {
/*  50: 94 */         paramahd.a(localamj, false);
/*  51:    */       }
/*  52:    */     }
/*  53: 97 */     this.f.a(0, null);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean a(EntityPlayer paramahd)
/*  57:    */   {
/*  58:102 */     return true;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public ItemStack b(EntityPlayer paramahd, int paramInt)
/*  62:    */   {
/*  63:108 */     ItemStack localamj1 = null;
/*  64:109 */     ajk localajk = (ajk)this.c.get(paramInt);
/*  65:110 */     if ((localajk != null) && (localajk.e()))
/*  66:    */     {
/*  67:111 */       ItemStack localamj2 = localajk.d();
/*  68:112 */       localamj1 = localamj2.k();
/*  69:114 */       if (paramInt == 0)
/*  70:    */       {
/*  71:115 */         if (!a(localamj2, 9, 45, true)) {
/*  72:116 */           return null;
/*  73:    */         }
/*  74:118 */         localajk.a(localamj2, localamj1);
/*  75:    */       }
/*  76:119 */       else if ((paramInt >= 1) && (paramInt < 5))
/*  77:    */       {
/*  78:120 */         if (!a(localamj2, 9, 45, false)) {
/*  79:121 */           return null;
/*  80:    */         }
/*  81:    */       }
/*  82:123 */       else if ((paramInt >= 5) && (paramInt < 9))
/*  83:    */       {
/*  84:124 */         if (!a(localamj2, 9, 45, false)) {
/*  85:125 */           return null;
/*  86:    */         }
/*  87:    */       }
/*  88:127 */       else if (((localamj1.getItem() instanceof ItemArmor)) && (!((ajk)this.c.get(5 + ((ItemArmor)localamj1.getItem()).b)).e()))
/*  89:    */       {
/*  90:128 */         int i = 5 + ((ItemArmor)localamj1.getItem()).b;
/*  91:129 */         if (!a(localamj2, i, i + 1, false)) {
/*  92:130 */           return null;
/*  93:    */         }
/*  94:    */       }
/*  95:132 */       else if ((paramInt >= 9) && (paramInt < 36))
/*  96:    */       {
/*  97:133 */         if (!a(localamj2, 36, 45, false)) {
/*  98:134 */           return null;
/*  99:    */         }
/* 100:    */       }
/* 101:136 */       else if ((paramInt >= 36) && (paramInt < 45))
/* 102:    */       {
/* 103:137 */         if (!a(localamj2, 9, 36, false)) {
/* 104:138 */           return null;
/* 105:    */         }
/* 106:    */       }
/* 107:141 */       else if (!a(localamj2, 9, 45, false))
/* 108:    */       {
/* 109:142 */         return null;
/* 110:    */       }
/* 111:145 */       if (localamj2.stackSize == 0) {
/* 112:146 */         localajk.d(null);
/* 113:    */       } else {
/* 114:148 */         localajk.f();
/* 115:    */       }
/* 116:150 */       if (localamj2.stackSize == localamj1.stackSize) {
/* 117:152 */         return null;
/* 118:    */       }
/* 119:154 */       localajk.a(paramahd, localamj2);
/* 120:    */     }
/* 121:157 */     return localamj1;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public boolean a(ItemStack paramamj, ajk paramajk)
/* 125:    */   {
/* 126:162 */     return (paramajk.d != this.f) && (super.a(paramamj, paramajk));
/* 127:    */   }
/* 128:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajb
 * JD-Core Version:    0.7.0.1
 */