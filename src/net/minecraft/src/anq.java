package net.minecraft.src;
/*  1:   */ public class anq
/*  2:   */   extends Item
/*  3:   */ {
/*  4:   */   public anq()
/*  5:   */   {
/*  6:12 */     setStackLimit(1);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 10:   */   {
/* 11:17 */     paramahd.a(paramamj);
/* 12:18 */     paramahd.increaseStat(StatList.J[Item.b(this)]);
/* 13:19 */     return paramamj;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public static boolean b(NBTTagCompound paramfn)
/* 17:   */   {
/* 18:23 */     if (paramfn == null) {
/* 19:24 */       return false;
/* 20:   */     }
/* 21:26 */     if (!paramfn.hasKey("pages", 9)) {
/* 22:27 */       return false;
/* 23:   */     }
/* 24:30 */     fv localfv = paramfn.c("pages", 8);
/* 25:31 */     for (int i = 0; i < localfv.c(); i++)
/* 26:   */     {
/* 27:32 */       String str = localfv.f(i);
/* 28:34 */       if (str == null) {
/* 29:35 */         return false;
/* 30:   */       }
/* 31:37 */       if (str.length() > 32767) {
/* 32:38 */         return false;
/* 33:   */       }
/* 34:   */     }
/* 35:42 */     return true;
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     anq
 * JD-Core Version:    0.7.0.1
 */