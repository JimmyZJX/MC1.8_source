package net.minecraft.src;
/*  1:   */ public class bdb
/*  2:   */   extends bcm
/*  3:   */ {
/*  4:   */   private Item item;
/*  5:   */   private int data;
/*  6:   */   
/*  7:   */   public bdb() {}
/*  8:   */   
/*  9:   */   public bdb(Item paramalq, int paramInt)
/* 10:   */   {
/* 11:19 */     this.item = paramalq;
/* 12:20 */     this.data = paramInt;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void b(NBTTagCompound paramfn)
/* 16:   */   {
/* 17:25 */     super.b(paramfn);
/* 18:26 */     oa localoa = (oa)Item.e.c(this.item);
/* 19:27 */     paramfn.setString("Item", localoa == null ? "" : localoa.toString());
/* 20:28 */     paramfn.setInt("Data", this.data);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(NBTTagCompound paramfn)
/* 24:   */   {
/* 25:33 */     super.a(paramfn);
/* 26:34 */     if (paramfn.hasKey("Item", 8)) {
/* 27:35 */       this.item = Item.d(paramfn.getString("Item"));
/* 28:   */     } else {
/* 29:38 */       this.item = Item.b(paramfn.getInteger("Item"));
/* 30:   */     }
/* 31:40 */     this.data = paramfn.getInteger("Data");
/* 32:   */   }
/* 33:   */   
/* 34:   */   public id x_()
/* 35:   */   {
/* 36:45 */     NBTTagCompound localfn = new NBTTagCompound();
/* 37:46 */     b(localfn);
/* 38:   */     
/* 39:48 */     localfn.o("Item");
/* 40:49 */     localfn.setInt("Item", Item.b(this.item));
/* 41:50 */     return new iu(this.c, 5, localfn);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void a(Item paramalq, int paramInt)
/* 45:   */   {
/* 46:54 */     this.item = paramalq;
/* 47:55 */     this.data = paramInt;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public Item b()
/* 51:   */   {
/* 52:59 */     return this.item;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public int c()
/* 56:   */   {
/* 57:63 */     return this.data;
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bdb
 * JD-Core Version:    0.7.0.1
 */