package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class awz
/*  4:   */   extends BlockType
/*  5:   */ {
/*  6:18 */   public static final BlockDataEnum a = BlockDataEnum.getInstance("variant", axa.class);
/*  7:   */   private final BlockType b;
/*  8:   */   
/*  9:   */   public awz(Material parambof, BlockType paramatr)
/* 10:   */   {
/* 11:23 */     super(parambof);
/* 12:24 */     j(this.L.b().setData(a, axa.l));
/* 13:25 */     this.b = paramatr;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public int a(Random paramRandom)
/* 17:   */   {
/* 18:30 */     return Math.max(0, paramRandom.nextInt(10) - 7);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 22:   */   {
/* 23:36 */     return Item.fromBlock(this.b);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public Item b(World paramaqu, BlockPosition paramdt)
/* 27:   */   {
/* 28:41 */     return Item.fromBlock(this.b);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/* 32:   */   {
/* 33:46 */     return instance();
/* 34:   */   }
/* 35:   */   
/* 36:   */   public Block instance(int paramInt)
/* 37:   */   {
/* 38:51 */     return instance().setData(a, axa.a(paramInt));
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int c(Block parambec)
/* 42:   */   {
/* 43:57 */     return ((axa)parambec.getData(a)).a();
/* 44:   */   }
/* 45:   */   
/* 46:   */   protected bed e()
/* 47:   */   {
/* 48:62 */     return new bed(this, new IBlockData[] { a });
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     awz
 * JD-Core Version:    0.7.0.1
 */