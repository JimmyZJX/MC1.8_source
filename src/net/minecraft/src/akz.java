package net.minecraft.src;
/*  1:   */ public class akz
/*  2:   */   extends ake
/*  3:   */ {
/*  4:   */   protected akz()
/*  5:   */   {
/*  6:10 */     setTabToDisplayOn(CreativeTabs.tabMisc);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 10:   */   {
/* 11:15 */     ItemStack localamj = new ItemStack(ItemList.filledMap, 1, paramaqu.b("map"));
/* 12:   */     
/* 13:17 */     String str = "map_" + localamj.i();
/* 14:18 */     MapInfo localbqe = new MapInfo(str);
/* 15:19 */     paramaqu.a(str, localbqe);
/* 16:   */     
/* 17:21 */     localbqe.scale = 0;
/* 18:22 */     localbqe.a(paramahd.xPos, paramahd.zPos, localbqe.scale);
/* 19:23 */     localbqe.dimension = ((byte)paramaqu.t.q());
/* 20:   */     
/* 21:25 */     localbqe.c();
/* 22:   */     
/* 23:27 */     paramamj.stackSize -= 1;
/* 24:28 */     if (paramamj.stackSize <= 0) {
/* 25:29 */       return localamj;
/* 26:   */     }
/* 27:31 */     if (!paramahd.bg.a(localamj.k())) {
/* 28:32 */       paramahd.a(localamj, false);
/* 29:   */     }
/* 30:35 */     paramahd.b(StatList.J[Item.b(this)]);
/* 31:   */     
/* 32:37 */     return paramamj;
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     akz
 * JD-Core Version:    0.7.0.1
 */