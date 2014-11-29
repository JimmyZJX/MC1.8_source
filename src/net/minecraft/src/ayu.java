package net.minecraft.src;
/*  3:   */ import java.util.Random;
/*  4:   */ 
/*  5:   */ public class ayu
/*  6:   */   extends BlockType
/*  7:   */ {
/*  8:   */   public ayu()
/*  9:   */   {
/* 10:18 */     super(Material.rock);
/* 11:19 */     setCreativeTab(CreativeTabs.tabBlock);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 15:   */   {
/* 16:25 */     if (this == BlockList.coalOre) {
/* 17:26 */       return ItemList.coal;
/* 18:   */     }
/* 19:28 */     if (this == BlockList.diamondOre) {
/* 20:29 */       return ItemList.diamond;
/* 21:   */     }
/* 22:31 */     if (this == BlockList.lapisOre) {
/* 23:32 */       return ItemList.dye;
/* 24:   */     }
/* 25:34 */     if (this == BlockList.bP) {
/* 26:35 */       return ItemList.emerald;
/* 27:   */     }
/* 28:37 */     if (this == BlockList.quartzOre) {
/* 29:38 */       return ItemList.quartz;
/* 30:   */     }
/* 31:40 */     return Item.fromBlock(this);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public int a(Random paramRandom)
/* 35:   */   {
/* 36:45 */     if (this == BlockList.lapisOre) {
/* 37:46 */       return 4 + paramRandom.nextInt(5);
/* 38:   */     }
/* 39:48 */     return 1;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public int a(int paramInt, Random paramRandom)
/* 43:   */   {
/* 44:53 */     if ((paramInt > 0) && (Item.fromBlock(this) != a((Block)O().a().iterator().next(), paramRandom, paramInt)))
/* 45:   */     {
/* 46:54 */       int i = paramRandom.nextInt(paramInt + 2) - 1;
/* 47:55 */       if (i < 0) {
/* 48:56 */         i = 0;
/* 49:   */       }
/* 50:58 */       return a(paramRandom) * (i + 1);
/* 51:   */     }
/* 52:60 */     return a(paramRandom);
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, float paramFloat, int paramInt)
/* 56:   */   {
/* 57:65 */     super.a(paramaqu, paramdt, parambec, paramFloat, paramInt);
/* 58:68 */     if (a(parambec, paramaqu.rng, paramInt) != Item.fromBlock(this))
/* 59:   */     {
/* 60:69 */       int i = 0;
/* 61:70 */       if (this == BlockList.coalOre) {
/* 62:71 */         i = MathUtils.nextInt(paramaqu.rng, 0, 2);
/* 63:72 */       } else if (this == BlockList.diamondOre) {
/* 64:73 */         i = MathUtils.nextInt(paramaqu.rng, 3, 7);
/* 65:74 */       } else if (this == BlockList.bP) {
/* 66:75 */         i = MathUtils.nextInt(paramaqu.rng, 3, 7);
/* 67:76 */       } else if (this == BlockList.lapisOre) {
/* 68:77 */         i = MathUtils.nextInt(paramaqu.rng, 2, 5);
/* 69:78 */       } else if (this == BlockList.quartzOre) {
/* 70:79 */         i = MathUtils.nextInt(paramaqu.rng, 2, 5);
/* 71:   */       }
/* 72:81 */       b(paramaqu, paramdt, i);
/* 73:   */     }
/* 74:   */   }
/* 75:   */   
/* 76:   */   public int j(World paramaqu, BlockPosition paramdt)
/* 77:   */   {
/* 78:87 */     return 0;
/* 79:   */   }
/* 80:   */   
/* 81:   */   public int a(Block parambec)
/* 82:   */   {
/* 83:93 */     if (this == BlockList.lapisOre) {
/* 84:94 */       return EnumDyeColor.BLUE.b();
/* 85:   */     }
/* 86:96 */     return 0;
/* 87:   */   }
/* 88:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayu
 * JD-Core Version:    0.7.0.1
 */