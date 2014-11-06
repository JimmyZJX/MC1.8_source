package net.minecraft.src;
/*  1:   */ public class axd
/*  2:   */   extends bcm
/*  3:   */ {
/*  4:   */   private ItemStack a;
/*  5:   */   
/*  6:   */   public void a(NBTTagCompound paramfn)
/*  7:   */   {
/*  8:29 */     super.a(paramfn);
/*  9:31 */     if (paramfn.hasKey("RecordItem", 10)) {
/* 10:32 */       a(ItemStack.loadItemStackFromNBT(paramfn.getCompoundTag("RecordItem")));
/* 11:33 */     } else if (paramfn.getInteger("Record") > 0) {
/* 12:34 */       a(new ItemStack(Item.b(paramfn.getInteger("Record")), 1, 0));
/* 13:   */     }
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void b(NBTTagCompound paramfn)
/* 17:   */   {
/* 18:40 */     super.b(paramfn);
/* 19:42 */     if (a() != null) {
/* 20:43 */       paramfn.setNBT("RecordItem", a().writeToNBT(new NBTTagCompound()));
/* 21:   */     }
/* 22:   */   }
/* 23:   */   
/* 24:   */   public ItemStack a()
/* 25:   */   {
/* 26:48 */     return this.a;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(ItemStack paramamj)
/* 30:   */   {
/* 31:52 */     this.a = paramamj;
/* 32:53 */     o_();
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axd
 * JD-Core Version:    0.7.0.1
 */