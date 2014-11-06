package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bcb
/*  4:   */   extends auc
/*  5:   */ {
/*  6:   */   protected bcb()
/*  7:   */   {
/*  8:21 */     float f1 = 0.5F;
/*  9:22 */     float f2 = 0.015625F;
/* 10:23 */     a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f2, 0.5F + f1);
/* 11:24 */     setCreativeTab(CreativeTabs.tabDeco);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, AABB parambrt, List paramList, Entity paramwv)
/* 15:   */   {
/* 16:29 */     if ((paramwv == null) || (!(paramwv instanceof adu))) {
/* 17:30 */       super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/* 18:   */     }
/* 19:   */   }
/* 20:   */   
/* 21:   */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/* 22:   */   {
/* 23:37 */     return new AABB(paramdt.getX() + this.B, paramdt.getY() + this.C, paramdt.getZ() + this.D, paramdt.getX() + this.E, paramdt.getY() + this.F, paramdt.getZ() + this.G);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public int F()
/* 27:   */   {
/* 28:42 */     return 7455580;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public int h(Block parambec)
/* 32:   */   {
/* 33:47 */     return 7455580;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int a(IBlockAccess paramard, BlockPosition paramdt, int paramInt)
/* 37:   */   {
/* 38:52 */     return 2129968;
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected boolean c(ProtoBlock paramatr)
/* 42:   */   {
/* 43:57 */     return paramatr == BlockList.j;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public boolean f(World paramaqu, BlockPosition paramdt, Block parambec)
/* 47:   */   {
/* 48:62 */     if ((paramdt.getY() < 0) || (paramdt.getY() >= 256)) {
/* 49:63 */       return false;
/* 50:   */     }
/* 51:65 */     Block localbec = paramaqu.getBlock(paramdt.down());
/* 52:66 */     return (localbec.getProto().getMaterial() == Material.water) && (((Integer)localbec.getProperty(axl.b)).intValue() == 0);
/* 53:   */   }
/* 54:   */   
/* 55:   */   public int c(Block parambec)
/* 56:   */   {
/* 57:71 */     return 0;
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcb
 * JD-Core Version:    0.7.0.1
 */