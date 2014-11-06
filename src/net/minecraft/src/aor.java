package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.ArrayList;
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ public class aor
/*  6:   */   implements aoo
/*  7:   */ {
/*  8:   */   public boolean a(ain paramain, World paramaqu)
/*  9:   */   {
/* 10:15 */     ArrayList localArrayList = Lists.newArrayList();
/* 11:17 */     for (int i = 0; i < paramain.n_(); i++)
/* 12:   */     {
/* 13:18 */       ItemStack localamj1 = paramain.a(i);
/* 14:20 */       if (localamj1 != null)
/* 15:   */       {
/* 16:21 */         localArrayList.add(localamj1);
/* 17:23 */         if (localArrayList.size() > 1)
/* 18:   */         {
/* 19:24 */           ItemStack localamj2 = (ItemStack)localArrayList.get(0);
/* 20:25 */           if ((localamj1.getItem() != localamj2.getItem()) || (localamj2.stackSize != 1) || (localamj1.stackSize != 1) || (!localamj2.getItem().m())) {
/* 21:26 */             return false;
/* 22:   */           }
/* 23:   */         }
/* 24:   */       }
/* 25:   */     }
/* 26:32 */     return localArrayList.size() == 2;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public ItemStack a(ain paramain)
/* 30:   */   {
/* 31:38 */     ArrayList localArrayList = Lists.newArrayList();
/* 32:   */     ItemStack localamj2;
/* 33:   */     Object localObject;
/* 34:40 */     for (int i = 0; i < paramain.n_(); i++)
/* 35:   */     {
/* 36:41 */       localamj2 = paramain.a(i);
/* 37:43 */       if (localamj2 != null)
/* 38:   */       {
/* 39:44 */         localArrayList.add(localamj2);
/* 40:46 */         if (localArrayList.size() > 1)
/* 41:   */         {
/* 42:47 */           localObject = (ItemStack)localArrayList.get(0);
/* 43:48 */           if ((localamj2.getItem() != ((ItemStack)localObject).getItem()) || (((ItemStack)localObject).stackSize != 1) || (localamj2.stackSize != 1) || (!((ItemStack)localObject).getItem().m())) {
/* 44:49 */             return null;
/* 45:   */           }
/* 46:   */         }
/* 47:   */       }
/* 48:   */     }
/* 49:55 */     if (localArrayList.size() == 2)
/* 50:   */     {
/* 51:56 */       ItemStack localamj1 = (ItemStack)localArrayList.get(0);
/* 52:57 */       localamj2 = (ItemStack)localArrayList.get(1);
/* 53:59 */       if ((localamj1.getItem() == localamj2.getItem()) && (localamj1.stackSize == 1) && (localamj2.stackSize == 1) && (localamj1.getItem().m()))
/* 54:   */       {
/* 55:60 */         localObject = localamj1.getItem();
/* 56:61 */         int j = ((Item)localObject).l() - localamj1.h();
/* 57:62 */         int k = ((Item)localObject).l() - localamj2.h();
/* 58:63 */         int m = j + k + ((Item)localObject).l() * 5 / 100;
/* 59:64 */         int n = ((Item)localObject).l() - m;
/* 60:65 */         if (n < 0) {
/* 61:66 */           n = 0;
/* 62:   */         }
/* 63:68 */         return new ItemStack(localamj1.getItem(), 1, n);
/* 64:   */       }
/* 65:   */     }
/* 66:72 */     return null;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public int a()
/* 70:   */   {
/* 71:77 */     return 4;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public ItemStack b()
/* 75:   */   {
/* 76:83 */     return null;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public ItemStack[] b(ain paramain)
/* 80:   */   {
/* 81:88 */     ItemStack[] arrayOfamj = new ItemStack[paramain.n_()];
/* 82:90 */     for (int i = 0; i < arrayOfamj.length; i++)
/* 83:   */     {
/* 84:91 */       ItemStack localamj = paramain.a(i);
/* 85:92 */       if ((localamj != null) && (localamj.getItem().r())) {
/* 86:93 */         arrayOfamj[i] = new ItemStack(localamj.getItem().q());
/* 87:   */       }
/* 88:   */     }
/* 89:97 */     return arrayOfamj;
/* 90:   */   }
/* 91:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aor
 * JD-Core Version:    0.7.0.1
 */