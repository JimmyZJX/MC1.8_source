package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class aim
/*  4:   */   extends aib
/*  5:   */ {
/*  6:   */   private vq a;
/*  7:   */   private int f;
/*  8:   */   
/*  9:   */   public aim(vq paramvq1, vq paramvq2, EntityPlayer paramahd)
/* 10:   */   {
/* 11:14 */     this.a = paramvq2;
/* 12:15 */     this.f = (paramvq2.getSize() / 9);
/* 13:16 */     paramvq2.b(paramahd);
/* 14:   */     
/* 15:18 */     int i = (this.f - 4) * 18;
/* 16:   */     int k;
/* 17:20 */     for (int j = 0; j < this.f; j++) {
/* 18:21 */       for (k = 0; k < 9; k++) {
/* 19:22 */         a(new ajk(paramvq2, k + j * 9, 8 + k * 18, 18 + j * 18));
/* 20:   */       }
/* 21:   */     }
/* 22:26 */     for (int j = 0; j < 3; j++) {
/* 23:27 */       for (k = 0; k < 9; k++) {
/* 24:28 */         a(new ajk(paramvq1, k + j * 9 + 9, 8 + k * 18, 103 + j * 18 + i));
/* 25:   */       }
/* 26:   */     }
/* 27:31 */     for (int j = 0; j < 9; j++) {
/* 28:32 */       a(new ajk(paramvq1, j, 8 + j * 18, 161 + i));
/* 29:   */     }
/* 30:   */   }
/* 31:   */   
/* 32:   */   public boolean a(EntityPlayer paramahd)
/* 33:   */   {
/* 34:38 */     return this.a.a(paramahd);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public ItemStack b(EntityPlayer paramahd, int paramInt)
/* 38:   */   {
/* 39:44 */     ItemStack localamj1 = null;
/* 40:45 */     ajk localajk = (ajk)this.c.get(paramInt);
/* 41:46 */     if ((localajk != null) && (localajk.e()))
/* 42:   */     {
/* 43:47 */       ItemStack localamj2 = localajk.d();
/* 44:48 */       localamj1 = localamj2.k();
/* 45:50 */       if (paramInt < this.f * 9)
/* 46:   */       {
/* 47:51 */         if (!a(localamj2, this.f * 9, this.c.size(), true)) {
/* 48:52 */           return null;
/* 49:   */         }
/* 50:   */       }
/* 51:55 */       else if (!a(localamj2, 0, this.f * 9, false)) {
/* 52:56 */         return null;
/* 53:   */       }
/* 54:59 */       if (localamj2.stackSize == 0) {
/* 55:60 */         localajk.d(null);
/* 56:   */       } else {
/* 57:62 */         localajk.f();
/* 58:   */       }
/* 59:   */     }
/* 60:65 */     return localamj1;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public void b(EntityPlayer paramahd)
/* 64:   */   {
/* 65:70 */     super.b(paramahd);
/* 66:71 */     this.a.c(paramahd);
/* 67:   */   }
/* 68:   */   
/* 69:   */   public vq e()
/* 70:   */   {
/* 71:75 */     return this.a;
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aim
 * JD-Core Version:    0.7.0.1
 */