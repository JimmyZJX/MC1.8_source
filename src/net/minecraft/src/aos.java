package net.minecraft.src;
/*   1:    */ public class aos
/*   2:    */   implements aoo
/*   3:    */ {
/*   4:    */   private final int a;
/*   5:    */   private final int b;
/*   6:    */   private final ItemStack[] c;
/*   7:    */   private final ItemStack d;
/*   8:    */   private boolean e;
/*   9:    */   
/*  10:    */   public aos(int paramInt1, int paramInt2, ItemStack[] paramArrayOfamj, ItemStack paramamj)
/*  11:    */   {
/*  12: 18 */     this.a = paramInt1;
/*  13: 19 */     this.b = paramInt2;
/*  14: 20 */     this.c = paramArrayOfamj;
/*  15: 21 */     this.d = paramamj;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public ItemStack b()
/*  19:    */   {
/*  20: 27 */     return this.d;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public ItemStack[] b(ain paramain)
/*  24:    */   {
/*  25: 32 */     ItemStack[] arrayOfamj = new ItemStack[paramain.getSize()];
/*  26: 34 */     for (int i = 0; i < arrayOfamj.length; i++)
/*  27:    */     {
/*  28: 35 */       ItemStack localamj = paramain.get(i);
/*  29: 36 */       if ((localamj != null) && (localamj.getItem().r())) {
/*  30: 37 */         arrayOfamj[i] = new ItemStack(localamj.getItem().q());
/*  31:    */       }
/*  32:    */     }
/*  33: 41 */     return arrayOfamj;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean a(ain paramain, World paramaqu)
/*  37:    */   {
/*  38: 46 */     for (int i = 0; i <= 3 - this.a; i++) {
/*  39: 47 */       for (int j = 0; j <= 3 - this.b; j++)
/*  40:    */       {
/*  41: 48 */         if (a(paramain, i, j, true)) {
/*  42: 49 */           return true;
/*  43:    */         }
/*  44: 51 */         if (a(paramain, i, j, false)) {
/*  45: 52 */           return true;
/*  46:    */         }
/*  47:    */       }
/*  48:    */     }
/*  49: 56 */     return false;
/*  50:    */   }
/*  51:    */   
/*  52:    */   private boolean a(ain paramain, int paramInt1, int paramInt2, boolean paramBoolean)
/*  53:    */   {
/*  54: 60 */     for (int i = 0; i < 3; i++) {
/*  55: 61 */       for (int j = 0; j < 3; j++)
/*  56:    */       {
/*  57: 62 */         int k = i - paramInt1;
/*  58: 63 */         int m = j - paramInt2;
/*  59: 64 */         ItemStack localamj1 = null;
/*  60: 65 */         if ((k >= 0) && (m >= 0) && (k < this.a) && (m < this.b)) {
/*  61: 66 */           if (paramBoolean) {
/*  62: 67 */             localamj1 = this.c[(this.a - k - 1 + m * this.a)];
/*  63:    */           } else {
/*  64: 69 */             localamj1 = this.c[(k + m * this.a)];
/*  65:    */           }
/*  66:    */         }
/*  67: 72 */         ItemStack localamj2 = paramain.c(i, j);
/*  68: 73 */         if ((localamj2 != null) || (localamj1 != null))
/*  69:    */         {
/*  70: 76 */           if (((localamj2 == null) && (localamj1 != null)) || ((localamj2 != null) && (localamj1 == null))) {
/*  71: 77 */             return false;
/*  72:    */           }
/*  73: 79 */           if (localamj1.getItem() != localamj2.getItem()) {
/*  74: 80 */             return false;
/*  75:    */           }
/*  76: 82 */           if ((localamj1.getDamage2() != 32767) && (localamj1.getDamage2() != localamj2.getDamage2())) {
/*  77: 83 */             return false;
/*  78:    */           }
/*  79:    */         }
/*  80:    */       }
/*  81:    */     }
/*  82: 87 */     return true;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public ItemStack a(ain paramain)
/*  86:    */   {
/*  87: 93 */     ItemStack localamj1 = b().k();
/*  88: 95 */     if (this.e) {
/*  89: 96 */       for (int i = 0; i < paramain.getSize(); i++)
/*  90:    */       {
/*  91: 97 */         ItemStack localamj2 = paramain.get(i);
/*  92: 99 */         if ((localamj2 != null) && (localamj2.hasTagCompound())) {
/*  93:100 */           localamj1.setTagCompound((NBTTagCompound)localamj2.getTagCompound().b());
/*  94:    */         }
/*  95:    */       }
/*  96:    */     }
/*  97:105 */     return localamj1;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public int a()
/* 101:    */   {
/* 102:110 */     return this.a * this.b;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public aos c()
/* 106:    */   {
/* 107:114 */     this.e = true;
/* 108:115 */     return this;
/* 109:    */   }
/* 110:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aos
 * JD-Core Version:    0.7.0.1
 */