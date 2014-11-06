package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class ala
/*   5:    */   extends Item
/*   6:    */ {
/*   7:    */   public boolean f(ItemStack paramamj)
/*   8:    */   {
/*   9: 21 */     return true;
/*  10:    */   }
/*  11:    */   
/*  12:    */   public boolean f_(ItemStack paramamj)
/*  13:    */   {
/*  14: 26 */     return false;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public amx g(ItemStack paramamj)
/*  18:    */   {
/*  19: 31 */     if (h(paramamj).c() > 0) {
/*  20: 32 */       return amx.b;
/*  21:    */     }
/*  22: 34 */     return super.g(paramamj);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public fv h(ItemStack paramamj)
/*  26:    */   {
/*  27: 39 */     NBTTagCompound localfn = paramamj.getTagCompound();
/*  28: 40 */     if ((localfn == null) || (!localfn.hasKey("StoredEnchantments", 9))) {
/*  29: 41 */       return new fv();
/*  30:    */     }
/*  31: 44 */     return (fv)localfn.a("StoredEnchantments");
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void a(ItemStack paramamj, EntityPlayer paramahd, List paramList, boolean paramBoolean)
/*  35:    */   {
/*  36: 49 */     super.a(paramamj, paramahd, paramList, paramBoolean);
/*  37:    */     
/*  38: 51 */     fv localfv = h(paramamj);
/*  39: 53 */     if (localfv != null) {
/*  40: 54 */       for (int i = 0; i < localfv.c(); i++)
/*  41:    */       {
/*  42: 55 */         int j = localfv.b(i).e("id");
/*  43: 56 */         int k = localfv.b(i).e("lvl");
/*  44: 58 */         if (Enchantment.c(j) != null) {
/*  45: 59 */           paramList.add(Enchantment.c(j).d(k));
/*  46:    */         }
/*  47:    */       }
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(ItemStack paramamj, apo paramapo)
/*  52:    */   {
/*  53: 66 */     fv localfv = h(paramamj);
/*  54: 67 */     int i = 1;
/*  55: 69 */     for (int j = 0; j < localfv.c(); j++)
/*  56:    */     {
/*  57: 70 */       NBTTagCompound localfn2 = localfv.b(j);
/*  58: 72 */       if (localfn2.e("id") == paramapo.b.B)
/*  59:    */       {
/*  60: 73 */         if (localfn2.e("lvl") < paramapo.c) {
/*  61: 74 */           localfn2.setShort("lvl", (short)paramapo.c);
/*  62:    */         }
/*  63: 77 */         i = 0;
/*  64: 78 */         break;
/*  65:    */       }
/*  66:    */     }
/*  67: 82 */     if (i != 0)
/*  68:    */     {
/*  69: 83 */       NBTTagCompound localfn1 = new NBTTagCompound();
/*  70:    */       
/*  71: 85 */       localfn1.setShort("id", (short)paramapo.b.B);
/*  72: 86 */       localfn1.setShort("lvl", (short)paramapo.c);
/*  73:    */       
/*  74: 88 */       localfv.a(localfn1);
/*  75:    */     }
/*  76: 91 */     if (!paramamj.hasTagCompound()) {
/*  77: 92 */       paramamj.setTagCompound(new NBTTagCompound());
/*  78:    */     }
/*  79: 94 */     paramamj.getTagCompound().setNBT("StoredEnchantments", localfv);
/*  80:    */   }
/*  81:    */   
/*  82:    */   public ItemStack a(apo paramapo)
/*  83:    */   {
/*  84: 98 */     ItemStack localamj = new ItemStack(this);
/*  85: 99 */     a(localamj, paramapo);
/*  86:100 */     return localamj;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void a(Enchantment paramapf, List paramList)
/*  90:    */   {
/*  91:104 */     for (int i = paramapf.e(); i <= paramapf.b(); i++) {
/*  92:105 */       paramList.add(a(new apo(paramapf, i)));
/*  93:    */     }
/*  94:    */   }
/*  95:    */   
/*  96:    */   public vl b(Random paramRandom)
/*  97:    */   {
/*  98:120 */     return a(paramRandom, 1, 1, 1);
/*  99:    */   }
/* 100:    */   
/* 101:    */   public vl a(Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/* 102:    */   {
/* 103:124 */     ItemStack localamj = new ItemStack(ItemList.book, 1, 0);
/* 104:125 */     aph.a(paramRandom, localamj, 30);
/* 105:    */     
/* 106:127 */     return new vl(localamj, paramInt1, paramInt2, paramInt3);
/* 107:    */   }
/* 108:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ala
 * JD-Core Version:    0.7.0.1
 */