package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class aua
/*  4:   */   extends ProtoBlock
/*  5:   */ {
/*  6:   */   public aua()
/*  7:   */   {
/*  8:14 */     super(Material.d);
/*  9:15 */     setCreativeTab(CreativeTabs.tabBlock);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public int a(Random paramRandom)
/* 13:   */   {
/* 14:20 */     return 3;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 18:   */   {
/* 19:26 */     return ItemList.book;
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aua
 * JD-Core Version:    0.7.0.1
 */