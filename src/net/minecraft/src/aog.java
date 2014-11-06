package net.minecraft.src;
/*  1:   */ public class aog
/*  2:   */   implements aoo
/*  3:   */ {
/*  4:   */   public boolean a(ain paramain, World paramaqu)
/*  5:   */   {
/*  6:15 */     int i = 0;
/*  7:16 */     Object localObject = null;
/*  8:18 */     for (int j = 0; j < paramain.n_(); j++)
/*  9:   */     {
/* 10:19 */       ItemStack localamj = paramain.a(j);
/* 11:20 */       if (localamj != null) {
/* 12:24 */         if (localamj.getItem() == ItemList.bN)
/* 13:   */         {
/* 14:25 */           if (localObject != null) {
/* 15:26 */             return false;
/* 16:   */           }
/* 17:28 */           localObject = localamj;
/* 18:   */         }
/* 19:29 */         else if (localamj.getItem() == ItemList.bM)
/* 20:   */         {
/* 21:30 */           i++;
/* 22:   */         }
/* 23:   */         else
/* 24:   */         {
/* 25:32 */           return false;
/* 26:   */         }
/* 27:   */       }
/* 28:   */     }
/* 29:36 */     return (localObject != null) && (i > 0);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public ItemStack a(ain paramain)
/* 33:   */   {
/* 34:42 */     int i = 0;
/* 35:43 */     ItemStack localObject = null;
/* 36:45 */     for (int j = 0; j < paramain.n_(); j++)
/* 37:   */     {
/* 38:46 */       ItemStack localamj2 = paramain.a(j);
/* 39:47 */       if (localamj2 != null) {
/* 40:51 */         if (localamj2.getItem() == ItemList.bN)
/* 41:   */         {
/* 42:52 */           if (localObject != null) {
/* 43:53 */             return null;
/* 44:   */           }
/* 45:55 */           localObject = localamj2;
/* 46:   */         }
/* 47:56 */         else if (localamj2.getItem() == ItemList.bM)
/* 48:   */         {
/* 49:57 */           i++;
/* 50:   */         }
/* 51:   */         else
/* 52:   */         {
/* 53:59 */           return null;
/* 54:   */         }
/* 55:   */       }
/* 56:   */     }
/* 57:63 */     if ((localObject == null) || (i < 1) || (anr.h(localObject) >= 2)) {
/* 58:64 */       return null;
/* 59:   */     }
/* 60:67 */     ItemStack localamj1 = new ItemStack(ItemList.bN, i);
/* 61:68 */     localamj1.setTagCompound((NBTTagCompound)localObject.getTagCompound().b());
/* 62:69 */     localamj1.getTagCompound().setInt("generation", anr.h(localObject) + 1);
/* 63:70 */     if (localObject.s()) {
/* 64:71 */       localamj1.c(localObject.q());
/* 65:   */     }
/* 66:73 */     return localamj1;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public int a()
/* 70:   */   {
/* 71:78 */     return 9;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public ItemStack b()
/* 75:   */   {
/* 76:84 */     return null;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public ItemStack[] b(ain paramain)
/* 80:   */   {
/* 81:89 */     ItemStack[] arrayOfamj = new ItemStack[paramain.n_()];
/* 82:91 */     for (int i = 0; i < arrayOfamj.length; i++)
/* 83:   */     {
/* 84:92 */       ItemStack localamj = paramain.a(i);
/* 85:93 */       if ((localamj != null) && ((localamj.getItem() instanceof anr)))
/* 86:   */       {
/* 87:94 */         arrayOfamj[i] = localamj;
/* 88:95 */         break;
/* 89:   */       }
/* 90:   */     }
/* 91:99 */     return arrayOfamj;
/* 92:   */   }
/* 93:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aog
 * JD-Core Version:    0.7.0.1
 */