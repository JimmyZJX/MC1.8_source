package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bcc
/*  4:   */   extends BlockType
/*  5:   */ {
/*  6:   */   public bcc()
/*  7:   */   {
/*  8:19 */     super(Material.G);
/*  9:20 */     setCreativeTab(CreativeTabs.tabDeco);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Entity paramwv)
/* 13:   */   {
/* 14:25 */     paramwv.aB();
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean c()
/* 18:   */   {
/* 19:30 */     return false;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/* 23:   */   {
/* 24:36 */     return null;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public boolean isOpaqueCube()
/* 28:   */   {
/* 29:41 */     return false;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 33:   */   {
/* 34:48 */     return ItemList.string;
/* 35:   */   }
/* 36:   */   
/* 37:   */   protected boolean G()
/* 38:   */   {
/* 39:53 */     return true;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public aql k()
/* 43:   */   {
/* 44:58 */     return aql.c;
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcc
 * JD-Core Version:    0.7.0.1
 */