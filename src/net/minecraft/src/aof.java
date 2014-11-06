package net.minecraft.src;
/*   1:    */ class aof
/*   2:    */   implements aoo
/*   3:    */ {
/*   4:    */   public boolean a(ain paramain, World paramaqu)
/*   5:    */   {
/*   6: 43 */     ItemStack localObject1 = null;
/*   7: 44 */     ItemStack localObject2 = null;
/*   8: 45 */     for (int i = 0; i < paramain.n_(); i++)
/*   9:    */     {
/*  10: 46 */       ItemStack localamj = paramain.a(i);
/*  11: 47 */       if (localamj != null)
/*  12:    */       {
/*  13: 51 */         if (localamj.getItem() != ItemList.cE) {
/*  14: 52 */           return false;
/*  15:    */         }
/*  16: 55 */         if ((localObject1 != null) && (localObject2 != null)) {
/*  17: 57 */           return false;
/*  18:    */         }
/*  19: 59 */         int j = bci.b(localamj);
/*  20: 60 */         int k = bci.c(localamj) > 0 ? 1 : 0;
/*  21: 62 */         if (localObject1 != null)
/*  22:    */         {
/*  23: 63 */           if (k != 0) {
/*  24: 65 */             return false;
/*  25:    */           }
/*  26: 67 */           if (j != bci.b((ItemStack)localObject1)) {
/*  27: 69 */             return false;
/*  28:    */           }
/*  29: 71 */           localObject2 = localamj;
/*  30:    */         }
/*  31: 72 */         else if (localObject2 != null)
/*  32:    */         {
/*  33: 73 */           if (k == 0) {
/*  34: 75 */             return false;
/*  35:    */           }
/*  36: 77 */           if (j != bci.b(localObject2)) {
/*  37: 79 */             return false;
/*  38:    */           }
/*  39: 81 */           localObject1 = localamj;
/*  40:    */         }
/*  41: 82 */         else if (k != 0)
/*  42:    */         {
/*  43: 83 */           localObject1 = localamj;
/*  44:    */         }
/*  45:    */         else
/*  46:    */         {
/*  47: 85 */           localObject2 = localamj;
/*  48:    */         }
/*  49:    */       }
/*  50:    */     }
/*  51: 89 */     return (localObject1 != null) && (localObject2 != null);
/*  52:    */   }
/*  53:    */   
/*  54:    */   public ItemStack a(ain paramain)
/*  55:    */   {
/*  56: 96 */     for (int i = 0; i < paramain.n_(); i++)
/*  57:    */     {
/*  58: 97 */       ItemStack localamj1 = paramain.a(i);
/*  59: 98 */       if (localamj1 != null) {
/*  60:101 */         if (bci.c(localamj1) > 0)
/*  61:    */         {
/*  62:102 */           ItemStack localamj2 = localamj1.k();
/*  63:103 */           localamj2.stackSize = 1;
/*  64:104 */           return localamj2;
/*  65:    */         }
/*  66:    */       }
/*  67:    */     }
/*  68:108 */     return null;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public int a()
/*  72:    */   {
/*  73:113 */     return 2;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public ItemStack b()
/*  77:    */   {
/*  78:120 */     return null;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public ItemStack[] b(ain paramain)
/*  82:    */   {
/*  83:125 */     ItemStack[] arrayOfamj = new ItemStack[paramain.n_()];
/*  84:127 */     for (int i = 0; i < arrayOfamj.length; i++)
/*  85:    */     {
/*  86:128 */       ItemStack localamj = paramain.a(i);
/*  87:129 */       if (localamj != null) {
/*  88:130 */         if (localamj.getItem().r())
/*  89:    */         {
/*  90:131 */           arrayOfamj[i] = new ItemStack(localamj.getItem().q());
/*  91:    */         }
/*  92:132 */         else if ((localamj.hasTagCompound()) && 
/*  93:133 */           (bci.c(localamj) > 0))
/*  94:    */         {
/*  95:134 */           arrayOfamj[i] = localamj.k();
/*  96:135 */           arrayOfamj[i].stackSize = 1;
/*  97:    */         }
/*  98:    */       }
/*  99:    */     }
/* 100:141 */     return arrayOfamj;
/* 101:    */   }
				aof(aod arg0) {}
/* 102:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aof
 * JD-Core Version:    0.7.0.1
 */