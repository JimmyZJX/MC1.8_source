package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class awm
/*  4:   */   extends BlockType
/*  5:   */ {
/*  6:   */   public awm(Material parambof)
/*  7:   */   {
/*  8:16 */     super(parambof);
/*  9:17 */     setCreativeTab(CreativeTabs.tabBlock);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a(int paramInt, Random paramRandom)
/* 13:   */   {
/* 14:22 */     return MathUtils.clamp(a(paramRandom) + paramRandom.nextInt(paramInt + 1), 1, 4);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public int a(Random paramRandom)
/* 18:   */   {
/* 19:27 */     return 2 + paramRandom.nextInt(3);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 23:   */   {
/* 24:33 */     return ItemList.aT;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public MapColor g(Block parambec)
/* 28:   */   {
/* 29:38 */     return MapColor.d;
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     awm
 * JD-Core Version:    0.7.0.1
 */