package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class alk
/*  4:   */   extends Item
/*  5:   */ {
/*  6:   */   public alk()
/*  7:   */   {
/*  8:12 */     this.maxStackSize = 1;
/*  9:13 */     setMaxDamage(64);
/* 10:14 */     setTabToDisplayOn(CreativeTabs.tabTools);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 14:   */   {
/* 15:19 */     paramdt = paramdt.offset(paramej);
/* 16:21 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/* 17:22 */       return false;
/* 18:   */     }
/* 19:25 */     if (paramaqu.getBlock(paramdt).getType().getMaterial() == Material.air)
/* 20:   */     {
/* 21:26 */       paramaqu.a(paramdt.getX() + 0.5D, paramdt.getY() + 0.5D, paramdt.getZ() + 0.5D, "fire.ignite", 1.0F, random.nextFloat() * 0.4F + 0.8F);
/* 22:27 */       paramaqu.setBlock(paramdt, BlockList.fire.instance());
/* 23:   */     }
/* 24:30 */     paramamj.a(1, paramahd);
/* 25:31 */     return true;
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     alk
 * JD-Core Version:    0.7.0.1
 */