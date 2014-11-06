package net.minecraft.src;
/*  1:   */ public class aon
/*  2:   */ {
/*  3:12 */   private Object[][] a = { { BlockList.R, new ItemStack(ItemList.k, 9) }, { BlockList.S, new ItemStack(ItemList.j, 9) }, { BlockList.diamondBlock, new ItemStack(ItemList.diamond, 9) }, { BlockList.emeraldBlock, new ItemStack(ItemList.bO, 9) }, { BlockList.y, new ItemStack(ItemList.dye, 9, EnumDyeColor.BLUE.b()) }, { BlockList.cn, new ItemStack(ItemList.aC, 9) }, { BlockList.cA, new ItemStack(ItemList.h, 9, 0) }, { BlockList.cx, new ItemStack(ItemList.O, 9) }, { BlockList.cE, new ItemStack(ItemList.aM, 9) } };
/*  4:   */   
/*  5:   */   public void a(aop paramaop)
/*  6:   */   {
/*  7:25 */     for (int i = 0; i < this.a.length; i++)
/*  8:   */     {
/*  9:26 */       ProtoBlock localatr = (ProtoBlock)this.a[i][0];
/* 10:27 */       ItemStack localamj = (ItemStack)this.a[i][1];
/* 11:28 */       paramaop.a(new ItemStack(localatr), new Object[] { "###", "###", "###", Character.valueOf('#'), localamj });
/* 12:   */       
/* 13:   */ 
/* 14:   */ 
/* 15:   */ 
/* 16:   */ 
/* 17:   */ 
/* 18:   */ 
/* 19:36 */       paramaop.a(localamj, new Object[] { "#", Character.valueOf('#'), localatr });
/* 20:   */     }
/* 21:42 */     paramaop.a(new ItemStack(ItemList.k), new Object[] { "###", "###", "###", Character.valueOf('#'), ItemList.goldNugget });
/* 22:   */     
/* 23:   */ 
/* 24:   */ 
/* 25:   */ 
/* 26:   */ 
/* 27:   */ 
/* 28:49 */     paramaop.a(new ItemStack(ItemList.goldNugget, 9), new Object[] { "#", Character.valueOf('#'), ItemList.k });
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aon
 * JD-Core Version:    0.7.0.1
 */