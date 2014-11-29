package net.minecraft.src;
/*  1:   */ public class akt
/*  2:   */   extends Item
/*  3:   */ {
/*  4:   */   private BlockType a;
/*  5:   */   
/*  6:   */   public akt(BlockType paramatr)
/*  7:   */   {
/*  8:15 */     this.a = paramatr;
/*  9:16 */     setTabToDisplayOn(CreativeTabs.tabRedstone);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 13:   */   {
/* 14:21 */     if (paramej != EnumDirection.UP) {
/* 15:22 */       return false;
/* 16:   */     }
/* 17:25 */     Block localbec = paramaqu.getBlock(paramdt);
/* 18:26 */     BlockType localatr = localbec.getType();
/* 19:28 */     if (!localatr.f(paramaqu, paramdt)) {
/* 20:29 */       paramdt = paramdt.offset(paramej);
/* 21:   */     }
/* 22:32 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/* 23:33 */       return false;
/* 24:   */     }
/* 25:35 */     if (!this.a.c(paramaqu, paramdt)) {
/* 26:36 */       return false;
/* 27:   */     }
/* 28:39 */     a(paramaqu, paramdt, EnumDirection.a(paramahd.yaw), this.a);
/* 29:   */     
/* 30:41 */     paramamj.stackSize -= 1;
/* 31:42 */     return true;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public static void a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, BlockType paramatr)
/* 35:   */   {
/* 36:46 */     BlockPosition localdt1 = paramdt.offset(paramej.cw());
/* 37:47 */     BlockPosition localdt2 = paramdt.offset(paramej.ccw());
/* 38:   */     
/* 39:49 */     int i = (paramaqu.getBlock(localdt2).getType().blocksMovement() ? 1 : 0) + (paramaqu.getBlock(localdt2.up()).getType().blocksMovement() ? 1 : 0);
/* 40:50 */     int j = (paramaqu.getBlock(localdt1).getType().blocksMovement() ? 1 : 0) + (paramaqu.getBlock(localdt1.up()).getType().blocksMovement() ? 1 : 0);
/* 41:   */     
/* 42:52 */     int k = (paramaqu.getBlock(localdt2).getType() == paramatr) || (paramaqu.getBlock(localdt2.up()).getType() == paramatr) ? 1 : 0;
/* 43:53 */     int m = (paramaqu.getBlock(localdt1).getType() == paramatr) || (paramaqu.getBlock(localdt1.up()).getType() == paramatr) ? 1 : 0;
/* 44:   */     
/* 45:   */ 
/* 46:56 */     int n = 0;
/* 47:57 */     if (((k != 0) && (m == 0)) || (j > i)) {
/* 48:58 */       n = 1;
/* 49:   */     }
/* 50:61 */     BlockPosition localdt3 = paramdt.up();
/* 51:62 */     Block localbec = paramatr.instance().setData(BlockDoor.a, paramej).setData(BlockDoor.M, n != 0 ? avh.b : avh.a);
/* 52:63 */     paramaqu.setBlock(paramdt, localbec.setData(BlockDoor.O, avg.b), 2);
/* 53:64 */     paramaqu.setBlock(localdt3, localbec.setData(BlockDoor.O, avg.a), 2);
/* 54:65 */     paramaqu.c(paramdt, paramatr);
/* 55:66 */     paramaqu.c(localdt3, paramatr);
/* 56:   */   }
/* 57:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     akt
 * JD-Core Version:    0.7.0.1
 */