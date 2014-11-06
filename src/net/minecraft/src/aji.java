package net.minecraft.src;
/*   1:    */ public class aji
/*   2:    */   implements vq
/*   3:    */ {
/*   4: 13 */   private ItemStack[] a = new ItemStack[1];
/*   5:    */   
/*   6:    */   public int n_()
/*   7:    */   {
/*   8: 17 */     return 1;
/*   9:    */   }
/*  10:    */   
/*  11:    */   public ItemStack a(int paramInt)
/*  12:    */   {
/*  13: 23 */     return this.a[0];
/*  14:    */   }
/*  15:    */   
/*  16:    */   public String getName()
/*  17:    */   {
/*  18: 28 */     return "Result";
/*  19:    */   }
/*  20:    */   
/*  21:    */   public boolean k_()
/*  22:    */   {
/*  23: 33 */     return false;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public ho e_()
/*  27:    */   {
/*  28: 38 */     if (k_()) {
/*  29: 39 */       return new hy(getName());
/*  30:    */     }
/*  31: 41 */     return new hz(getName(), new Object[0]);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public ItemStack a(int paramInt1, int paramInt2)
/*  35:    */   {
/*  36: 47 */     if (this.a[0] != null)
/*  37:    */     {
/*  38: 48 */       ItemStack localamj = this.a[0];
/*  39: 49 */       this.a[0] = null;
/*  40: 50 */       return localamj;
/*  41:    */     }
/*  42: 52 */     return null;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public ItemStack b(int paramInt)
/*  46:    */   {
/*  47: 58 */     if (this.a[0] != null)
/*  48:    */     {
/*  49: 59 */       ItemStack localamj = this.a[0];
/*  50: 60 */       this.a[0] = null;
/*  51: 61 */       return localamj;
/*  52:    */     }
/*  53: 63 */     return null;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void a(int paramInt, ItemStack paramamj)
/*  57:    */   {
/*  58: 68 */     this.a[0] = paramamj;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public int p_()
/*  62:    */   {
/*  63: 73 */     return 64;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void o_() {}
/*  67:    */   
/*  68:    */   public boolean a(EntityPlayer paramahd)
/*  69:    */   {
/*  70: 82 */     return true;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void b(EntityPlayer paramahd) {}
/*  74:    */   
/*  75:    */   public void c(EntityPlayer paramahd) {}
/*  76:    */   
/*  77:    */   public boolean b(int paramInt, ItemStack paramamj)
/*  78:    */   {
/*  79: 95 */     return true;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public int a_(int paramInt)
/*  83:    */   {
/*  84:100 */     return 0;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void b(int paramInt1, int paramInt2) {}
/*  88:    */   
/*  89:    */   public int g()
/*  90:    */   {
/*  91:109 */     return 0;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void l()
/*  95:    */   {
/*  96:114 */     for (int i = 0; i < this.a.length; i++) {
/*  97:115 */       this.a[i] = null;
/*  98:    */     }
/*  99:    */   }
/* 100:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aji
 * JD-Core Version:    0.7.0.1
 */