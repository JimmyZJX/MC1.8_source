package net.minecraft.src;
/*  1:   */ public class aob
/*  2:   */ {
/*  3: 8 */   private String[][] a = { { "XXX", "X X" }, { "X X", "XXX", "XXX" }, { "XXX", "X X", "X X" }, { "X X", "X X" } };
/*  4:30 */   private Item[][] b = { { ItemList.leather, ItemList.ironIngot, ItemList.diamond, ItemList.goldIngot }, { ItemList.Q, ItemList.Y, ItemList.ac, ItemList.ag }, { ItemList.R, ItemList.Z, ItemList.ad, ItemList.ah }, { ItemList.S, ItemList.aa, ItemList.ae, ItemList.ai }, { ItemList.leatherBoots, ItemList.ab, ItemList.af, ItemList.aj } };
/*  5:   */   
/*  6:   */   public void a(aop paramaop)
/*  7:   */   {
/*  8:39 */     for (int i = 0; i < this.b[0].length; i++)
/*  9:   */     {
/* 10:40 */       Item localalq1 = this.b[0][i];
/* 11:42 */       for (int j = 0; j < this.b.length - 1; j++)
/* 12:   */       {
/* 13:43 */         Item localalq2 = this.b[(j + 1)][i];
/* 14:44 */         paramaop.a(new ItemStack(localalq2), new Object[] { this.a[j], Character.valueOf('X'), localalq1 });
/* 15:   */       }
/* 16:   */     }
/* 17:   */   }
/* 18:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aob
 * JD-Core Version:    0.7.0.1
 */