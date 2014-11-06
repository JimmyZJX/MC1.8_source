package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class cty
/*   5:    */ {
/*   6:    */   private final int a;
/*   7:    */   private final int b;
/*   8:    */   private final int c;
/*   9:    */   private final int d;
/*  10:    */   private List<cty> e;
/*  11:    */   private ctx f;
/*  12:    */   
/*  13:    */   public cty(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  14:    */   {
/*  15:276 */     this.a = paramInt1;
/*  16:277 */     this.b = paramInt2;
/*  17:278 */     this.c = paramInt3;
/*  18:279 */     this.d = paramInt4;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public ctx a()
/*  22:    */   {
/*  23:283 */     return this.f;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public int b()
/*  27:    */   {
/*  28:287 */     return this.a;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public int c()
/*  32:    */   {
/*  33:291 */     return this.b;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean a(ctx paramctx)
/*  37:    */   {
/*  38:296 */     if (this.f != null) {
/*  39:297 */       return false;
/*  40:    */     }
/*  41:300 */     int i = paramctx.b();
/*  42:301 */     int j = paramctx.c();
/*  43:304 */     if ((i > this.c) || (j > this.d)) {
/*  44:305 */       return false;
/*  45:    */     }
/*  46:309 */     if ((i == this.c) && (j == this.d))
/*  47:    */     {
/*  48:311 */       this.f = paramctx;
/*  49:312 */       return true;
/*  50:    */     }
/*  51:316 */     if (this.e == null)
/*  52:    */     {
/*  53:317 */       this.e = Lists.newArrayListWithCapacity(1);
/*  54:    */       
/*  55:    */ 
/*  56:320 */       this.e.add(new cty(this.a, this.b, i, j));
/*  57:    */       
/*  58:322 */       int k = this.c - i;
/*  59:323 */       int m = this.d - j;
/*  60:325 */       if ((m > 0) && (k > 0))
/*  61:    */       {
/*  62:340 */         int n = Math.max(this.d, k);
/*  63:341 */         int i1 = Math.max(this.c, m);
/*  64:342 */         if (n >= i1)
/*  65:    */         {
/*  66:343 */           this.e.add(new cty(this.a, this.b + j, i, m));
/*  67:344 */           this.e.add(new cty(this.a + i, this.b, k, this.d));
/*  68:    */         }
/*  69:    */         else
/*  70:    */         {
/*  71:346 */           this.e.add(new cty(this.a + i, this.b, k, j));
/*  72:347 */           this.e.add(new cty(this.a, this.b + j, this.c, m));
/*  73:    */         }
/*  74:    */       }
/*  75:349 */       else if (k == 0)
/*  76:    */       {
/*  77:359 */         this.e.add(new cty(this.a, this.b + j, i, m));
/*  78:    */       }
/*  79:360 */       else if (m == 0)
/*  80:    */       {
/*  81:371 */         this.e.add(new cty(this.a + i, this.b, k, j));
/*  82:    */       }
/*  83:    */     }
/*  84:375 */     for (cty localcty : this.e) {
/*  85:376 */       if (localcty.a(paramctx)) {
/*  86:377 */         return true;
/*  87:    */       }
/*  88:    */     }
/*  89:381 */     return false;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void a(List<cty> paramList)
/*  93:    */   {
/*  94:385 */     if (this.f != null) {
/*  95:386 */       paramList.add(this);
/*  96:387 */     } else if (this.e != null) {
/*  97:388 */       for (cty localcty : this.e) {
/*  98:389 */         localcty.a(paramList);
/*  99:    */       }
/* 100:    */     }
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String toString()
/* 104:    */   {
/* 105:396 */     return "Slot{originX=" + this.a + ", originY=" + this.b + ", width=" + this.c + ", height=" + this.d + ", texture=" + this.f + ", subSlots=" + this.e + '}';
/* 106:    */   }
/* 107:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cty
 * JD-Core Version:    0.7.0.1
 */