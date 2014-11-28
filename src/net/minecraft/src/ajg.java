package net.minecraft.src;
/*  1:   */ public class ajg
/*  2:   */   extends ajk
/*  3:   */ {
/*  4:   */   private final aje a;
/*  5:   */   private EntityPlayer b;
/*  6:   */   private int c;
/*  7:   */   private final aqb h;
/*  8:   */   
/*  9:   */   public ajg(EntityPlayer paramahd, aqb paramaqb, aje paramaje, int paramInt1, int paramInt2, int paramInt3)
/* 10:   */   {
/* 11:16 */     super(paramaje, paramInt1, paramInt2, paramInt3);
/* 12:17 */     this.b = paramahd;
/* 13:18 */     this.h = paramaqb;
/* 14:19 */     this.a = paramaje;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean a(ItemStack paramamj)
/* 18:   */   {
/* 19:24 */     return false;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public ItemStack a(int paramInt)
/* 23:   */   {
/* 24:29 */     if (e()) {
/* 25:30 */       this.c += Math.min(paramInt, d().stackSize);
/* 26:   */     }
/* 27:32 */     return super.a(paramInt);
/* 28:   */   }
/* 29:   */   
/* 30:   */   protected void a(ItemStack paramamj, int paramInt)
/* 31:   */   {
/* 32:37 */     this.c += paramInt;
/* 33:38 */     c(paramamj);
/* 34:   */   }
/* 35:   */   
/* 36:   */   protected void c(ItemStack paramamj)
/* 37:   */   {
/* 38:43 */     paramamj.a(this.b.world, this.b, this.c);
/* 39:44 */     this.c = 0;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void a(EntityPlayer paramahd, ItemStack paramamj)
/* 43:   */   {
/* 44:49 */     c(paramamj);
/* 45:   */     
/* 46:51 */     TradeOffer localaqc = this.a.i();
/* 47:52 */     if (localaqc != null)
/* 48:   */     {
/* 49:53 */       ItemStack stack1 = this.a.get(0);
/* 50:54 */       ItemStack stack2 = this.a.get(1);
/* 51:57 */       if ((a(localaqc, stack1, stack2)) || (a(localaqc, stack2, stack1)))
/* 52:   */       {
/* 53:58 */         this.h.trade(localaqc);
/* 54:59 */         paramahd.increaseStat(StatList.tradedWithVillager);
/* 55:61 */         if ((stack1 != null) && (stack1.stackSize <= 0)) {
/* 56:62 */           stack1 = null;
/* 57:   */         }
/* 58:64 */         if ((stack2 != null) && (stack2.stackSize <= 0)) {
/* 59:65 */           stack2 = null;
/* 60:   */         }
/* 61:67 */         this.a.a(0, stack1);
/* 62:68 */         this.a.a(1, stack2);
/* 63:   */       }
/* 64:   */     }
/* 65:   */   }
/* 66:   */   
/* 67:   */   private boolean a(TradeOffer paramaqc, ItemStack paramamj1, ItemStack paramamj2)
/* 68:   */   {
/* 69:74 */     ItemStack localamj1 = paramaqc.getItemBought();
/* 70:75 */     ItemStack localamj2 = paramaqc.getItemBoughtB();
/* 71:77 */     if ((paramamj1 != null) && (paramamj1.getItem() == localamj1.getItem()))
/* 72:   */     {
/* 73:78 */       if ((localamj2 != null) && (paramamj2 != null) && (localamj2.getItem() == paramamj2.getItem()))
/* 74:   */       {
/* 75:79 */         paramamj1.stackSize -= localamj1.stackSize;
/* 76:80 */         paramamj2.stackSize -= localamj2.stackSize;
/* 77:81 */         return true;
/* 78:   */       }
/* 79:82 */       if ((localamj2 == null) && (paramamj2 == null))
/* 80:   */       {
/* 81:83 */         paramamj1.stackSize -= localamj1.stackSize;
/* 82:84 */         return true;
/* 83:   */       }
/* 84:   */     }
/* 85:87 */     return false;
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajg
 * JD-Core Version:    0.7.0.1
 */