package net.minecraft.src;
/*  1:   */ public class anp
/*  2:   */   extends ann
/*  3:   */ {
/*  4:   */   public anp(BlockType paramatr)
/*  5:   */   {
/*  6:16 */     super(paramatr, false);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 10:   */   {
/* 11:21 */     HitResult localbru = a(paramaqu, paramahd, true);
/* 12:22 */     if (localbru == null) {
/* 13:23 */       return paramamj;
/* 14:   */     }
/* 15:26 */     if (localbru.a == brv.BLOCK)
/* 16:   */     {
/* 17:27 */       BlockPosition localdt1 = localbru.a();
/* 18:29 */       if (!paramaqu.a(paramahd, localdt1)) {
/* 19:30 */         return paramamj;
/* 20:   */       }
/* 21:32 */       if (!paramahd.a(localdt1.offset(localbru.b), localbru.b, paramamj)) {
/* 22:33 */         return paramamj;
/* 23:   */       }
/* 24:36 */       BlockPosition localdt2 = localdt1.up();
/* 25:37 */       Block localbec = paramaqu.getBlock(localdt1);
/* 26:38 */       if ((localbec.getType().getMaterial() == Material.water) && (((Integer)localbec.getData(BlockLiquid.level)).intValue() == 0) && (paramaqu.isEmpty(localdt2)))
/* 27:   */       {
/* 28:39 */         paramaqu.setBlock(localdt2, BlockList.waterLily.instance());
/* 29:40 */         if (!paramahd.abilities.instabuild) {
/* 30:41 */           paramamj.stackSize -= 1;
/* 31:   */         }
/* 32:43 */         paramahd.increaseStat(StatList.J[Item.b(this)]);
/* 33:   */       }
/* 34:   */     }
/* 35:46 */     return paramamj;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public int a(ItemStack paramamj, int paramInt)
/* 39:   */   {
/* 40:51 */     return BlockList.waterLily.h(BlockList.waterLily.instance(paramamj.getDamage2()));
/* 41:   */   }
/* 42:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     anp
 * JD-Core Version:    0.7.0.1
 */