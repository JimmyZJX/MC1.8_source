package net.minecraft.src;
/*  1:   */ public class aoc
/*  2:   */ {
/*  3:   */   void a(aop paramaop)
/*  4:   */   {
/*  5:24 */     for (EnumDyeColor localakv : EnumDyeColor.values()) { // TODO: BROKEN
/*  6:25 */       paramaop.a(new ItemStack(ItemList.cE, 1, localakv.b()), new Object[] { "###", "###", " | ", Character.valueOf('#'), new ItemStack(BlockList.wool, 1, localakv.a()), Character.valueOf('|'), ItemList.stick });
/*  7:   */     }
/*  8:35 */     paramaop.a(new aof(null));
/*  9:36 */     paramaop.a(new aoe(null));
/* 10:   */   }
/* 11:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aoc
 * JD-Core Version:    0.7.0.1
 */