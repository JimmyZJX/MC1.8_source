package net.minecraft.src;
/*  1:   */ public class bap
/*  2:   */   extends ProtoBlock
/*  3:   */ {
/*  4:   */   public bap()
/*  5:   */   {
/*  6:15 */     super(Material.p);
/*  7:16 */     setCreativeTab(CreativeTabs.tabBlock);
/*  8:   */   }
/*  9:   */   
/* 10:   */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/* 11:   */   {
/* 12:22 */     float f = 0.125F;
/* 13:23 */     return new AABB(paramdt.getX(), paramdt.getY(), paramdt.getZ(), paramdt.getX() + 1, paramdt.getY() + 1 - f, paramdt.getZ() + 1);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Entity paramwv)
/* 17:   */   {
/* 18:28 */     paramwv.xVelocity *= 0.4D;
/* 19:29 */     paramwv.zVelocity *= 0.4D;
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bap
 * JD-Core Version:    0.7.0.1
 */