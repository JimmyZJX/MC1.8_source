package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class ban
/*  4:   */   extends BlockType
/*  5:   */ {
/*  6:   */   protected ban()
/*  7:   */   {
/*  8:17 */     super(Material.z);
/*  9:18 */     a(true);
/* 10:19 */     setCreativeTab(CreativeTabs.tabBlock);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 14:   */   {
/* 15:25 */     return ItemList.aD;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public int a(Random paramRandom)
/* 19:   */   {
/* 20:30 */     return 4;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 24:   */   {
/* 25:35 */     if (paramaqu.getLightLevel(EnumSkyBlock.BLOCK, paramdt) > 11)
/* 26:   */     {
/* 27:36 */       b(paramaqu, paramdt, paramaqu.getBlock(paramdt), 0);
/* 28:37 */       paramaqu.g(paramdt);
/* 29:   */     }
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ban
 * JD-Core Version:    0.7.0.1
 */