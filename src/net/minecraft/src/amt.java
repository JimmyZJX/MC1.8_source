package net.minecraft.src;
/*  1:   */ public class amt
/*  2:   */   extends Item
/*  3:   */ {
/*  4:   */   public amt()
/*  5:   */   {
/*  6: 9 */     setTabToDisplayOn(CreativeTabs.tabTools);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, EntityLiving paramxm)
/* 10:   */   {
/* 11:14 */     if (!paramamj.s()) {
/* 12:15 */       return false;
/* 13:   */     }
/* 14:18 */     if ((paramxm instanceof EntityMob))
/* 15:   */     {
/* 16:19 */       EntityMob localxn = (EntityMob)paramxm;
/* 17:20 */       localxn.a(paramamj.q());
/* 18:21 */       localxn.bW();
/* 19:22 */       paramamj.stackSize -= 1;
/* 20:23 */       return true;
/* 21:   */     }
/* 22:26 */     return super.a(paramamj, paramahd, paramxm);
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     amt
 * JD-Core Version:    0.7.0.1
 */