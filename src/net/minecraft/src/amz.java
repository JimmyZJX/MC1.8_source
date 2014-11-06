package net.minecraft.src;
/*  1:   */ public class amz
/*  2:   */   extends Item
/*  3:   */ {
/*  4:   */   public amz()
/*  5:   */   {
/*  6:12 */     setTabToDisplayOn(CreativeTabs.tabRedstone);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 10:   */   {
/* 11:17 */     boolean bool = paramaqu.getBlock(paramdt).getProto().f(paramaqu, paramdt);
/* 12:18 */     BlockPosition localdt = bool ? paramdt : paramdt.a(paramej);
/* 13:20 */     if (!paramahd.a(localdt, paramej, paramamj)) {
/* 14:21 */       return false;
/* 15:   */     }
/* 16:24 */     ProtoBlock localatr = paramaqu.getBlock(localdt).getProto();
/* 17:25 */     if (!paramaqu.a(localatr, localdt, false, paramej, null, paramamj)) {
/* 18:26 */       return false;
/* 19:   */     }
/* 20:29 */     if (BlockList.af.c(paramaqu, localdt))
/* 21:   */     {
/* 22:30 */       paramamj.stackSize -= 1;
/* 23:31 */       paramaqu.setBlock(localdt, BlockList.af.instance());
/* 24:32 */       return true;
/* 25:   */     }
/* 26:35 */     return false;
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     amz
 * JD-Core Version:    0.7.0.1
 */