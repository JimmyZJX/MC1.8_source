package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class axp
/*  4:   */   extends BlockType
/*  5:   */ {
/*  6:   */   protected axp()
/*  7:   */   {
/*  8:14 */     super(Material.C);
/*  9:15 */     setCreativeTab(CreativeTabs.tabBlock);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 13:   */   {
/* 14:21 */     return ItemList.bf;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public int a(Random paramRandom)
/* 18:   */   {
/* 19:26 */     return 3 + paramRandom.nextInt(5);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public int a(int paramInt, Random paramRandom)
/* 23:   */   {
/* 24:31 */     return Math.min(9, a(paramRandom) + paramRandom.nextInt(1 + paramInt));
/* 25:   */   }
/* 26:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axp
 * JD-Core Version:    0.7.0.1
 */