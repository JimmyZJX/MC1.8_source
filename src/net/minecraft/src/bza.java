package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ class bza
/*   5:    */   extends aib
/*   6:    */ {
/*   7: 60 */   public List<ItemStack> a = Lists.newArrayList();
/*   8:    */   
/*   9:    */   public bza(EntityPlayer paramahd)
/*  10:    */   {
/*  11: 63 */     ahb localahb = paramahd.bg;
/*  12: 64 */     for (int i = 0; i < 5; i++) {
/*  13: 65 */       for (int j = 0; j < 9; j++) {
/*  14: 66 */         a(new ajk(byz.f(), i * 9 + j, 9 + j * 18, 18 + i * 18));
/*  15:    */       }
/*  16:    */     }
/*  17: 70 */     for (int i = 0; i < 9; i++) {
/*  18: 71 */       a(new ajk(localahb, i, 9 + i * 18, 112));
/*  19:    */     }
/*  20: 74 */     a(0.0F);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean a(EntityPlayer paramahd)
/*  24:    */   {
/*  25: 79 */     return true;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void a(float paramFloat)
/*  29:    */   {
/*  30: 83 */     int i = (this.a.size() + 8) / 9 - 5;
/*  31:    */     
/*  32: 85 */     int j = (int)(paramFloat * i + 0.5D);
/*  33: 86 */     if (j < 0) {
/*  34: 87 */       j = 0;
/*  35:    */     }
/*  36: 89 */     for (int k = 0; k < 5; k++) {
/*  37: 90 */       for (int m = 0; m < 9; m++)
/*  38:    */       {
/*  39: 91 */         int n = m + (k + j) * 9;
/*  40: 92 */         if ((n >= 0) && (n < this.a.size())) {
/*  41: 93 */           byz.f().a(m + k * 9, (ItemStack)this.a.get(n));
/*  42:    */         } else {
/*  43: 95 */           byz.f().a(m + k * 9, null);
/*  44:    */         }
/*  45:    */       }
/*  46:    */     }
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean e()
/*  50:    */   {
/*  51:102 */     return this.a.size() > 45;
/*  52:    */   }
/*  53:    */   
/*  54:    */   protected void a(int paramInt1, int paramInt2, boolean paramBoolean, EntityPlayer paramahd) {}
/*  55:    */   
/*  56:    */   public ItemStack b(EntityPlayer paramahd, int paramInt)
/*  57:    */   {
/*  58:118 */     if ((paramInt >= this.c.size() - 9) && (paramInt < this.c.size()))
/*  59:    */     {
/*  60:119 */       ajk localajk = (ajk)this.c.get(paramInt);
/*  61:121 */       if ((localajk != null) && (localajk.e())) {
/*  62:122 */         localajk.d(null);
/*  63:    */       }
/*  64:    */     }
/*  65:126 */     return null;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public boolean a(ItemStack paramamj, ajk paramajk)
/*  69:    */   {
/*  70:131 */     return paramajk.g > 90;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public boolean b(ajk paramajk)
/*  74:    */   {
/*  75:136 */     return ((paramajk.d instanceof ahb)) || ((paramajk.g > 90) && (paramajk.f <= 162));
/*  76:    */   }
/*  77:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bza
 * JD-Core Version:    0.7.0.1
 */