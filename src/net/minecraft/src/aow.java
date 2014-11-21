package net.minecraft.src;
/*  1:   */ public class aow
/*  2:   */ {
/*  3: 9 */   private String[][] a = { { "X", "X", "#" } };
/*  4:17 */   private Object[][] b = { { BlockList.planks, BlockList.cobblestone, ItemList.ironIngot, ItemList.diamond, ItemList.goldIngot }, { ItemList.m, ItemList.q, ItemList.l, ItemList.u, ItemList.goldenSword } };
/*  5:   */   
/*  6:   */   public void a(aop paramaop)
/*  7:   */   {
/*  8:23 */     for (int i = 0; i < this.b[0].length; i++)
/*  9:   */     {
/* 10:24 */       Object localObject = this.b[0][i];
/* 11:26 */       for (int j = 0; j < this.b.length - 1; j++)
/* 12:   */       {
/* 13:27 */         Item localalq = (Item)this.b[(j + 1)][i];
/* 14:28 */         paramaop.a(new ItemStack(localalq), new Object[] { this.a[j], Character.valueOf('#'), ItemList.stick, Character.valueOf('X'), localObject });
/* 15:   */       }
/* 16:   */     }
/* 17:37 */     paramaop.a(new ItemStack(ItemList.bow, 1), new Object[] { " #X", "# X", " #X", Character.valueOf('X'), ItemList.F, Character.valueOf('#'), ItemList.stick });
/* 18:   */     
/* 19:   */ 
/* 20:   */ 
/* 21:   */ 
/* 22:   */ 
/* 23:   */ 
/* 24:   */ 
/* 25:   */ 
/* 26:46 */     paramaop.a(new ItemStack(ItemList.g, 4), new Object[] { "X", "#", "Y", Character.valueOf('Y'), ItemList.G, Character.valueOf('X'), ItemList.ak, Character.valueOf('#'), ItemList.stick });
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aow
 * JD-Core Version:    0.7.0.1
 */