package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bah
/*  4:   */   extends ProtoBlock
/*  5:   */ {
/*  6:   */   public bah(Material parambof)
/*  7:   */   {
/*  8:15 */     super(parambof);
/*  9:16 */     setCreativeTab(CreativeTabs.tabBlock);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a(Random paramRandom)
/* 13:   */   {
/* 14:21 */     return 2 + paramRandom.nextInt(2);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public int a(int paramInt, Random paramRandom)
/* 18:   */   {
/* 19:26 */     return MathUtils.clamp(a(paramRandom) + paramRandom.nextInt(paramInt + 1), 1, 5);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 23:   */   {
/* 24:31 */     return ItemList.cD;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public MapColor g(Block parambec)
/* 28:   */   {
/* 29:36 */     return MapColor.p;
/* 30:   */   }
/* 31:   */   
/* 32:   */   protected boolean G()
/* 33:   */   {
/* 34:41 */     return true;
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bah
 * JD-Core Version:    0.7.0.1
 */