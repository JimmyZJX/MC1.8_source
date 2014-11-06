package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class akd
/*  4:   */   extends Item
/*  5:   */ {
/*  6:   */   public akd()
/*  7:   */   {
/*  8:12 */     a(true);
/*  9:13 */     setMaxDamage(0);
/* 10:14 */     setTabToDisplayOn(CreativeTabs.tabMaterials);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public String e_(ItemStack paramamj)
/* 14:   */   {
/* 15:19 */     if (paramamj.i() == 1) {
/* 16:20 */       return "item.charcoal";
/* 17:   */     }
/* 18:22 */     return "item.coal";
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/* 22:   */   {
/* 23:27 */     paramList.add(new ItemStack(paramalq, 1, 0));
/* 24:28 */     paramList.add(new ItemStack(paramalq, 1, 1));
/* 25:   */   }
/* 26:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     akd
 * JD-Core Version:    0.7.0.1
 */