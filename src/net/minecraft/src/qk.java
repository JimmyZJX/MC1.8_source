package net.minecraft.src;
/*   1:    */ public class qk
/*   2:    */   extends qx
/*   3:    */ {
/*   4:    */   private boolean c;
/*   5:    */   private boolean d;
/*   6:    */   private int e;
/*   7:    */   private int f;
/*   8:    */   
/*   9:    */   public qk(World paramaqu)
/*  10:    */   {
/*  11: 22 */     super(paramaqu);
/*  12:    */   }
/*  13:    */   
/*  14:    */   public void a()
/*  15:    */   {
/*  16: 27 */     super.a();
/*  17: 28 */     this.f += 1;
/*  18:    */     
/*  19: 30 */     long l1 = this.a.K();
/*  20: 31 */     long l2 = l1 / 24000L + 1L;
/*  21: 33 */     if ((!this.c) && (this.f > 20))
/*  22:    */     {
/*  23: 34 */       this.c = true;
/*  24: 35 */       this.b.a.a(new jo(5, 0.0F));
/*  25:    */     }
/*  26: 38 */     this.d = (l1 > 120500L);
/*  27: 39 */     if (this.d) {
/*  28: 40 */       this.e += 1;
/*  29:    */     }
/*  30: 43 */     if (l1 % 24000L == 500L)
/*  31:    */     {
/*  32: 44 */       if (l2 <= 6L) {
/*  33: 45 */         this.b.a(new hz("demo.day." + l2, new Object[0]));
/*  34:    */       }
/*  35:    */     }
/*  36: 47 */     else if (l2 == 1L)
/*  37:    */     {
/*  38: 48 */       if (l1 == 100L) {
/*  39: 49 */         this.b.a.a(new jo(5, 101.0F));
/*  40: 50 */       } else if (l1 == 175L) {
/*  41: 51 */         this.b.a.a(new jo(5, 102.0F));
/*  42: 52 */       } else if (l1 == 250L) {
/*  43: 53 */         this.b.a.a(new jo(5, 103.0F));
/*  44:    */       }
/*  45:    */     }
/*  46: 55 */     else if ((l2 == 5L) && 
/*  47: 56 */       (l1 % 24000L == 22000L)) {
/*  48: 57 */       this.b.a(new hz("demo.day.warning", new Object[0]));
/*  49:    */     }
/*  50:    */   }
/*  51:    */   
/*  52:    */   private void f()
/*  53:    */   {
/*  54: 63 */     if (this.e > 100)
/*  55:    */     {
/*  56: 64 */       this.b.a(new hz("demo.reminder", new Object[0]));
/*  57: 65 */       this.e = 0;
/*  58:    */     }
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void a(BlockPosition paramdt, EnumDirection paramej)
/*  62:    */   {
/*  63: 71 */     if (this.d)
/*  64:    */     {
/*  65: 72 */       f();
/*  66: 73 */       return;
/*  67:    */     }
/*  68: 75 */     super.a(paramdt, paramej);
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void a(BlockPosition paramdt)
/*  72:    */   {
/*  73: 80 */     if (this.d) {
/*  74: 81 */       return;
/*  75:    */     }
/*  76: 83 */     super.a(paramdt);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public boolean b(BlockPosition paramdt)
/*  80:    */   {
/*  81: 88 */     if (this.d) {
/*  82: 89 */       return false;
/*  83:    */     }
/*  84: 91 */     return super.b(paramdt);
/*  85:    */   }
/*  86:    */   
/*  87:    */   public boolean a(EntityPlayer paramahd, World paramaqu, ItemStack paramamj)
/*  88:    */   {
/*  89: 96 */     if (this.d)
/*  90:    */     {
/*  91: 97 */       f();
/*  92: 98 */       return false;
/*  93:    */     }
/*  94:100 */     return super.a(paramahd, paramaqu, paramamj);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public boolean a(EntityPlayer paramahd, World paramaqu, ItemStack paramamj, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  98:    */   {
/*  99:105 */     if (this.d)
/* 100:    */     {
/* 101:106 */       f();
/* 102:107 */       return false;
/* 103:    */     }
/* 104:109 */     return super.a(paramahd, paramaqu, paramamj, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3);
/* 105:    */   }
/* 106:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     qk
 * JD-Core Version:    0.7.0.1
 */