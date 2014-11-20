package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class aiy
/*   4:    */   extends aib
/*   5:    */ {
/*   6:    */   private vq a;
/*   7:    */   private EntityHorse f;
/*   8:    */   
/*   9:    */   public aiy(vq paramvq1, vq paramvq2, EntityHorse paramabt, EntityPlayer paramahd)
/*  10:    */   {
/*  11: 16 */     this.a = paramvq2;
/*  12: 17 */     this.f = paramabt;
/*  13: 18 */     int i = 3;
/*  14: 19 */     paramvq2.b(paramahd);
/*  15:    */     
/*  16: 21 */     int j = (i - 4) * 18;
/*  17:    */     
/*  18:    */ 
/*  19: 24 */     a(new aiz(this, paramvq2, 0, 8, 18));
/*  20:    */     
/*  21:    */ 
/*  22:    */ 
/*  23:    */ 
/*  24:    */ 
/*  25: 30 */     a(new aja(this, paramvq2, 1, 8, 36, paramabt));
/*  26:    */     int m;
/*  27: 42 */     if (paramabt.cu()) {
/*  28: 43 */       for (int k = 0; k < i; k++) {
/*  29: 44 */         for (m = 0; m < 5; m++) {
/*  30: 45 */           a(new ajk(paramvq2, 2 + m + k * 5, 80 + m * 18, 18 + k * 18));
/*  31:    */         }
/*  32:    */       }
/*  33:    */     }
/*  34: 50 */     for (int k = 0; k < 3; k++) {
/*  35: 51 */       for (m = 0; m < 9; m++) {
/*  36: 52 */         a(new ajk(paramvq1, m + k * 9 + 9, 8 + m * 18, 102 + k * 18 + j));
/*  37:    */       }
/*  38:    */     }
/*  39: 55 */     for (int k = 0; k < 9; k++) {
/*  40: 56 */       a(new ajk(paramvq1, k, 8 + k * 18, 160 + j));
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean a(EntityPlayer paramahd)
/*  45:    */   {
/*  46: 62 */     return (this.a.a(paramahd)) && (this.f.ai()) && (this.f.g((Entity)paramahd) < 8.0F);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public ItemStack b(EntityPlayer paramahd, int paramInt)
/*  50:    */   {
/*  51: 68 */     ItemStack localamj1 = null;
/*  52: 69 */     ajk localajk = (ajk)this.c.get(paramInt);
/*  53: 70 */     if ((localajk != null) && (localajk.e()))
/*  54:    */     {
/*  55: 71 */       ItemStack localamj2 = localajk.d();
/*  56: 72 */       localamj1 = localamj2.k();
/*  57: 74 */       if (paramInt < this.a.getSize())
/*  58:    */       {
/*  59: 75 */         if (!a(localamj2, this.a.getSize(), this.c.size(), true)) {
/*  60: 76 */           return null;
/*  61:    */         }
/*  62:    */       }
/*  63: 79 */       else if ((a(1).a(localamj2)) && (!a(1).e()))
/*  64:    */       {
/*  65: 80 */         if (!a(localamj2, 1, 2, false)) {
/*  66: 81 */           return null;
/*  67:    */         }
/*  68:    */       }
/*  69: 83 */       else if (a(0).a(localamj2))
/*  70:    */       {
/*  71: 84 */         if (!a(localamj2, 0, 1, false)) {
/*  72: 85 */           return null;
/*  73:    */         }
/*  74:    */       }
/*  75: 87 */       else if ((this.a.getSize() <= 2) || (!a(localamj2, 2, this.a.getSize(), false))) {
/*  76: 88 */         return null;
/*  77:    */       }
/*  78: 91 */       if (localamj2.stackSize == 0) {
/*  79: 92 */         localajk.d(null);
/*  80:    */       } else {
/*  81: 94 */         localajk.f();
/*  82:    */       }
/*  83:    */     }
/*  84: 97 */     return localamj1;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void b(EntityPlayer paramahd)
/*  88:    */   {
/*  89:102 */     super.b(paramahd);
/*  90:103 */     this.a.c(paramahd);
/*  91:    */   }
/*  92:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aiy
 * JD-Core Version:    0.7.0.1
 */