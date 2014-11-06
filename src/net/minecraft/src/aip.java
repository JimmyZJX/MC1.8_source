package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class aip
/*  4:   */   extends aib
/*  5:   */ {
/*  6:   */   private vq a;
/*  7:   */   
/*  8:   */   public aip(vq paramvq1, vq paramvq2)
/*  9:   */   {
/* 10:18 */     this.a = paramvq2;
/* 11:   */     int j;
/* 12:20 */     for (int i = 0; i < 3; i++) {
/* 13:21 */       for (j = 0; j < 3; j++) {
/* 14:22 */         a(new ajk(paramvq2, j + i * 3, 62 + j * 18, 17 + i * 18));
/* 15:   */       }
/* 16:   */     }
/* 17:26 */     for (int i = 0; i < 3; i++) {
/* 18:27 */       for (j = 0; j < 9; j++) {
/* 19:28 */         a(new ajk(paramvq1, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/* 20:   */       }
/* 21:   */     }
/* 22:31 */     for (int i = 0; i < 9; i++) {
/* 23:32 */       a(new ajk(paramvq1, i, 8 + i * 18, 142));
/* 24:   */     }
/* 25:   */   }
/* 26:   */   
/* 27:   */   public boolean a(EntityPlayer paramahd)
/* 28:   */   {
/* 29:38 */     return this.a.a(paramahd);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public ItemStack b(EntityPlayer paramahd, int paramInt)
/* 33:   */   {
/* 34:44 */     ItemStack localamj1 = null;
/* 35:45 */     ajk localajk = (ajk)this.c.get(paramInt);
/* 36:46 */     if ((localajk != null) && (localajk.e()))
/* 37:   */     {
/* 38:47 */       ItemStack localamj2 = localajk.d();
/* 39:48 */       localamj1 = localamj2.k();
/* 40:50 */       if (paramInt < 9)
/* 41:   */       {
/* 42:51 */         if (!a(localamj2, 9, 45, true)) {
/* 43:52 */           return null;
/* 44:   */         }
/* 45:   */       }
/* 46:55 */       else if (!a(localamj2, 0, 9, false)) {
/* 47:56 */         return null;
/* 48:   */       }
/* 49:59 */       if (localamj2.stackSize == 0) {
/* 50:60 */         localajk.d(null);
/* 51:   */       } else {
/* 52:62 */         localajk.f();
/* 53:   */       }
/* 54:64 */       if (localamj2.stackSize == localamj1.stackSize) {
/* 55:66 */         return null;
/* 56:   */       }
/* 57:68 */       localajk.a(paramahd, localamj2);
/* 58:   */     }
/* 59:71 */     return localamj1;
/* 60:   */   }
/* 61:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aip
 * JD-Core Version:    0.7.0.1
 */