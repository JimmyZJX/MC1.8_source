package net.minecraft.src;
/*  1:   */ public class aov
/*  2:   */ {
/*  3:10 */   private String[][] a = { { "XXX", " # ", " # " }, { "X", "#", "#" }, { "XX", "X#", " #" }, { "XX", " #", " #" } };
/*  4:33 */   private Object[][] b = { { BlockList.planks, BlockList.cobblestone, ItemList.ironIngot, ItemList.diamond, ItemList.goldIngot }, { ItemList.o, ItemList.s, ItemList.ironPickaxe, ItemList.diamondPickaxe, ItemList.D }, { ItemList.n, ItemList.r, ItemList.ironShovel, ItemList.v, ItemList.C }, { ItemList.p, ItemList.t, ItemList.ironAxe, ItemList.diamondAxe, ItemList.E }, { ItemList.I, ItemList.J, ItemList.K, ItemList.L, ItemList.M } };
/*  5:   */   
/*  6:   */   public void a(RecipeList paramaop)
/*  7:   */   {
/*  8:43 */     for (int i = 0; i < this.b[0].length; i++)
/*  9:   */     {
/* 10:44 */       Object localObject = this.b[0][i];
/* 11:46 */       for (int j = 0; j < this.b.length - 1; j++)
/* 12:   */       {
/* 13:47 */         Item localalq = (Item)this.b[(j + 1)][i];
/* 14:48 */         paramaop.addShapedRecipe(new ItemStack(localalq), new Object[] { this.a[j], Character.valueOf('#'), ItemList.stick, Character.valueOf('X'), localObject });
/* 15:   */       }
/* 16:   */     }
/* 17:57 */     paramaop.addShapedRecipe(new ItemStack(ItemList.shears), new Object[] { " #", "# ", Character.valueOf('#'), ItemList.ironIngot });
/* 18:   */   }
/* 19:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aov
 * JD-Core Version:    0.7.0.1
 */