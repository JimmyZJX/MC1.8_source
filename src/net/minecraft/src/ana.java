package net.minecraft.src;
/*  1:   */ public class ana
/*  2:   */   extends Item
/*  3:   */ {
/*  4:   */   public ana()
/*  5:   */   {
/*  6: 9 */     this.maxStackSize = 1;
/*  7:10 */     setTabToDisplayOn(CreativeTabs.tabTransport);
/*  8:   */   }
/*  9:   */   
/* 10:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, EntityLiving paramxm)
/* 11:   */   {
/* 12:15 */     if ((paramxm instanceof EntityPig))
/* 13:   */     {
/* 14:16 */       EntityPig localaca = (EntityPig)paramxm;
/* 15:17 */       if ((!localaca.cj()) && (!localaca.i_()))
/* 16:   */       {
/* 17:18 */         localaca.l(true);
/* 18:19 */         localaca.world.a(localaca, "mob.horse.leather", 0.5F, 1.0F);
/* 19:20 */         paramamj.stackSize -= 1;
/* 20:   */       }
/* 21:23 */       return true;
/* 22:   */     }
/* 23:25 */     return false;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public boolean a(ItemStack paramamj, EntityLiving paramxm1, EntityLiving paramxm2)
/* 27:   */   {
/* 28:30 */     a(paramamj, null, paramxm1);
/* 29:31 */     return true;
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ana
 * JD-Core Version:    0.7.0.1
 */