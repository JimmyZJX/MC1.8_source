package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class aye
/*   4:    */   extends auc
/*   5:    */ {
/*   6: 17 */   public static final BlockDataInteger a = BlockDataInteger.getInstance("age", 0, 3);
/*   7:    */   
/*   8:    */   protected aye()
/*   9:    */   {
/*  10: 20 */     j(this.L.b().a(a, Integer.valueOf(0)));
/*  11: 21 */     a(true);
/*  12: 22 */     float f = 0.5F;
/*  13: 23 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
/*  14: 24 */     setCreativeTab(null);
/*  15:    */   }
/*  16:    */   
/*  17:    */   protected boolean c(ProtoBlock paramatr)
/*  18:    */   {
/*  19: 29 */     return paramatr == BlockList.aW;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public boolean f(World paramaqu, BlockPosition paramdt, Block parambec)
/*  23:    */   {
/*  24: 34 */     return c(paramaqu.getBlock(paramdt.down()).getProto());
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  28:    */   {
/*  29: 39 */     int i = ((Integer)parambec.getProperty(a)).intValue();
/*  30: 40 */     if ((i < 3) && (paramRandom.nextInt(10) == 0))
/*  31:    */     {
/*  32: 41 */       parambec = parambec.a(a, Integer.valueOf(i + 1));
/*  33: 42 */       paramaqu.setBlock(paramdt, parambec, 2);
/*  34:    */     }
/*  35: 45 */     super.b(paramaqu, paramdt, parambec, paramRandom);
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, float paramFloat, int paramInt)
/*  39:    */   {
/*  40: 54 */     if (paramaqu.isClient) {
/*  41: 55 */       return;
/*  42:    */     }
/*  43: 58 */     int i = 1;
/*  44: 59 */     if (((Integer)parambec.getProperty(a)).intValue() >= 3)
/*  45:    */     {
/*  46: 60 */       i = 2 + paramaqu.rng.nextInt(3);
/*  47: 61 */       if (paramInt > 0) {
/*  48: 62 */         i += paramaqu.rng.nextInt(paramInt + 1);
/*  49:    */       }
/*  50:    */     }
/*  51: 66 */     for (int j = 0; j < i; j++) {
/*  52: 67 */       a(paramaqu, paramdt, new ItemStack(ItemList.by));
/*  53:    */     }
/*  54:    */   }
/*  55:    */   
/*  56:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  57:    */   {
/*  58: 74 */     return null;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public int a(Random paramRandom)
/*  62:    */   {
/*  63: 79 */     return 0;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public Item b(World paramaqu, BlockPosition paramdt)
/*  67:    */   {
/*  68: 84 */     return ItemList.by;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public Block a(int paramInt)
/*  72:    */   {
/*  73: 89 */     return instance().a(a, Integer.valueOf(paramInt));
/*  74:    */   }
/*  75:    */   
/*  76:    */   public int c(Block parambec)
/*  77:    */   {
/*  78: 95 */     return ((Integer)parambec.getProperty(a)).intValue();
/*  79:    */   }
/*  80:    */   
/*  81:    */   protected bed e()
/*  82:    */   {
/*  83:100 */     return new bed(this, new IBlockData[] { a });
/*  84:    */   }
/*  85:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aye
 * JD-Core Version:    0.7.0.1
 */