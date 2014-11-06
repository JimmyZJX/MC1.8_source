package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class aio
/*   4:    */   extends aib
/*   5:    */ {
/*   6: 23 */   public ain a = new ain(this, 3, 3);
/*   7: 24 */   public vq f = new aji();
/*   8:    */   private World g;
/*   9:    */   private BlockPosition h;
/*  10:    */   
/*  11:    */   public aio(ahb paramahb, World paramaqu, BlockPosition paramdt)
/*  12:    */   {
/*  13: 30 */     this.g = paramaqu;
/*  14: 31 */     this.h = paramdt;
/*  15: 32 */     a(new ajj(paramahb.d, this.a, this.f, 0, 124, 35));
/*  16:    */     int j;
/*  17: 34 */     for (int i = 0; i < 3; i++) {
/*  18: 35 */       for (j = 0; j < 3; j++) {
/*  19: 36 */         a(new ajk(this.a, j + i * 3, 30 + j * 18, 17 + i * 18));
/*  20:    */       }
/*  21:    */     }
/*  22: 40 */     for (int i = 0; i < 3; i++) {
/*  23: 41 */       for (j = 0; j < 9; j++) {
/*  24: 42 */         a(new ajk(paramahb, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*  25:    */       }
/*  26:    */     }
/*  27: 45 */     for (int i = 0; i < 9; i++) {
/*  28: 46 */       a(new ajk(paramahb, i, 8 + i * 18, 142));
/*  29:    */     }
/*  30: 49 */     a(this.a);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void a(vq paramvq)
/*  34:    */   {
/*  35: 54 */     this.f.a(0, aop.a().a(this.a, this.g));
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void b(EntityPlayer paramahd)
/*  39:    */   {
/*  40: 59 */     super.b(paramahd);
/*  41: 60 */     if (this.g.isClient) {
/*  42: 61 */       return;
/*  43:    */     }
/*  44: 64 */     for (int i = 0; i < 9; i++)
/*  45:    */     {
/*  46: 65 */       ItemStack localamj = this.a.b(i);
/*  47: 66 */       if (localamj != null) {
/*  48: 67 */         paramahd.a(localamj, false);
/*  49:    */       }
/*  50:    */     }
/*  51:    */   }
/*  52:    */   
/*  53:    */   public boolean a(EntityPlayer paramahd)
/*  54:    */   {
/*  55: 74 */     if (this.g.getBlock(this.h).getProto() != BlockList.ai) {
/*  56: 75 */       return false;
/*  57:    */     }
/*  58: 77 */     if (paramahd.e(this.h.getX() + 0.5D, this.h.getY() + 0.5D, this.h.getZ() + 0.5D) > 64.0D) {
/*  59: 78 */       return false;
/*  60:    */     }
/*  61: 80 */     return true;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public ItemStack b(EntityPlayer paramahd, int paramInt)
/*  65:    */   {
/*  66: 86 */     ItemStack localamj1 = null;
/*  67: 87 */     ajk localajk = (ajk)this.c.get(paramInt);
/*  68: 88 */     if ((localajk != null) && (localajk.e()))
/*  69:    */     {
/*  70: 89 */       ItemStack localamj2 = localajk.d();
/*  71: 90 */       localamj1 = localamj2.k();
/*  72: 92 */       if (paramInt == 0)
/*  73:    */       {
/*  74: 93 */         if (!a(localamj2, 10, 46, true)) {
/*  75: 94 */           return null;
/*  76:    */         }
/*  77: 96 */         localajk.a(localamj2, localamj1);
/*  78:    */       }
/*  79: 97 */       else if ((paramInt >= 10) && (paramInt < 37))
/*  80:    */       {
/*  81: 98 */         if (!a(localamj2, 37, 46, false)) {
/*  82: 99 */           return null;
/*  83:    */         }
/*  84:    */       }
/*  85:101 */       else if ((paramInt >= 37) && (paramInt < 46))
/*  86:    */       {
/*  87:102 */         if (!a(localamj2, 10, 37, false)) {
/*  88:103 */           return null;
/*  89:    */         }
/*  90:    */       }
/*  91:106 */       else if (!a(localamj2, 10, 46, false))
/*  92:    */       {
/*  93:107 */         return null;
/*  94:    */       }
/*  95:110 */       if (localamj2.stackSize == 0) {
/*  96:111 */         localajk.d(null);
/*  97:    */       } else {
/*  98:113 */         localajk.f();
/*  99:    */       }
/* 100:115 */       if (localamj2.stackSize == localamj1.stackSize) {
/* 101:117 */         return null;
/* 102:    */       }
/* 103:119 */       localajk.a(paramahd, localamj2);
/* 104:    */     }
/* 105:122 */     return localamj1;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public boolean a(ItemStack paramamj, ajk paramajk)
/* 109:    */   {
/* 110:127 */     return (paramajk.d != this.f) && (super.a(paramamj, paramajk));
/* 111:    */   }
/* 112:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aio
 * JD-Core Version:    0.7.0.1
 */