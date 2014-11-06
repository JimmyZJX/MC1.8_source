package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class aig
/*   4:    */   extends aib
/*   5:    */ {
/*   6:    */   private vq a;
/*   7:    */   private final aih f;
/*   8:    */   
/*   9:    */   public aig(vq paramvq1, vq paramvq2)
/*  10:    */   {
/*  11: 21 */     this.a = paramvq2;
/*  12:    */     
/*  13: 23 */     a(this.f = new aih(this, paramvq2, 0, 136, 110));
/*  14:    */     
/*  15: 25 */     int i = 36;
/*  16: 26 */     int j = 137;
/*  17: 28 */     for (int k = 0; k < 3; k++) {
/*  18: 29 */       for (int m = 0; m < 9; m++) {
/*  19: 30 */         a(new ajk(paramvq1, m + k * 9 + 9, i + m * 18, j + k * 18));
/*  20:    */       }
/*  21:    */     }
/*  22: 33 */     for (int k = 0; k < 9; k++) {
/*  23: 34 */       a(new ajk(paramvq1, k, i + k * 18, 58 + j));
/*  24:    */     }
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void a(ail paramail)
/*  28:    */   {
/*  29: 40 */     super.a(paramail);
/*  30: 41 */     paramail.a(this, this.a);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void b(int paramInt1, int paramInt2)
/*  34:    */   {
/*  35: 46 */     this.a.b(paramInt1, paramInt2);
/*  36:    */   }
/*  37:    */   
/*  38:    */   public vq e()
/*  39:    */   {
/*  40: 50 */     return this.a;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public boolean a(EntityPlayer paramahd)
/*  44:    */   {
/*  45: 55 */     return this.a.a(paramahd);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public ItemStack b(EntityPlayer paramahd, int paramInt)
/*  49:    */   {
/*  50: 61 */     ItemStack localamj1 = null;
/*  51: 62 */     ajk localajk = (ajk)this.c.get(paramInt);
/*  52: 63 */     if ((localajk != null) && (localajk.e()))
/*  53:    */     {
/*  54: 64 */       ItemStack localamj2 = localajk.d();
/*  55: 65 */       localamj1 = localamj2.k();
/*  56: 67 */       if (paramInt == 0)
/*  57:    */       {
/*  58: 68 */         if (!a(localamj2, 1, 37, true)) {
/*  59: 69 */           return null;
/*  60:    */         }
/*  61: 71 */         localajk.a(localamj2, localamj1);
/*  62:    */       }
/*  63: 72 */       else if ((!this.f.e()) && (this.f.a(localamj2)) && (localamj2.stackSize == 1))
/*  64:    */       {
/*  65: 73 */         if (!a(localamj2, 0, 1, false)) {
/*  66: 74 */           return null;
/*  67:    */         }
/*  68:    */       }
/*  69: 76 */       else if ((paramInt >= 1) && (paramInt < 28))
/*  70:    */       {
/*  71: 77 */         if (!a(localamj2, 28, 37, false)) {
/*  72: 78 */           return null;
/*  73:    */         }
/*  74:    */       }
/*  75: 80 */       else if ((paramInt >= 28) && (paramInt < 37))
/*  76:    */       {
/*  77: 81 */         if (!a(localamj2, 1, 28, false)) {
/*  78: 82 */           return null;
/*  79:    */         }
/*  80:    */       }
/*  81: 85 */       else if (!a(localamj2, 1, 37, false))
/*  82:    */       {
/*  83: 86 */         return null;
/*  84:    */       }
/*  85: 89 */       if (localamj2.stackSize == 0) {
/*  86: 90 */         localajk.d(null);
/*  87:    */       } else {
/*  88: 92 */         localajk.f();
/*  89:    */       }
/*  90: 94 */       if (localamj2.stackSize == localamj1.stackSize) {
/*  91: 95 */         return null;
/*  92:    */       }
/*  93: 97 */       localajk.a(paramahd, localamj2);
/*  94:    */     }
/*  95:100 */     return localamj1;
/*  96:    */   }
/*  97:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aig
 * JD-Core Version:    0.7.0.1
 */