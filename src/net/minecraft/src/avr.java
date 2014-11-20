package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class avr
/*   4:    */   extends atg
/*   5:    */ {
/*   6: 29 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing", en.HORIZONTAL);
/*   7:    */   
/*   8:    */   protected avr()
/*   9:    */   {
/*  10: 32 */     super(Material.rock);
/*  11: 33 */     j(this.L.b().a(a, EnumDirection.NORTH));
/*  12: 34 */     setCreativeTab(CreativeTabs.tabDeco);
/*  13: 35 */     a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public boolean c()
/*  17:    */   {
/*  18: 40 */     return false;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public boolean isOpaqueCube()
/*  22:    */   {
/*  23: 45 */     return false;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public int b()
/*  27:    */   {
/*  28: 50 */     return 2;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  32:    */   {
/*  33: 56 */     return Item.fromProtoBlock(BlockList.obsidian);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public int a(Random paramRandom)
/*  37:    */   {
/*  38: 61 */     return 8;
/*  39:    */   }
/*  40:    */   
/*  41:    */   protected boolean G()
/*  42:    */   {
/*  43: 66 */     return true;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/*  47:    */   {
/*  48: 71 */     return instance().a(a, paramxm.aO().d());
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityLiving paramxm, ItemStack paramamj)
/*  52:    */   {
/*  53: 76 */     paramaqu.setBlock(paramdt, parambec.a(a, paramxm.aO().d()), 2);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  57:    */   {
/*  58: 81 */     ajh localajh = paramahd.cn();
/*  59: 82 */     bcm localbcm = paramaqu.s(paramdt);
/*  60: 83 */     if ((localajh == null) || (!(localbcm instanceof bda))) {
/*  61: 84 */       return true;
/*  62:    */     }
/*  63: 87 */     if (paramaqu.getBlock(paramdt.up()).getProto().blocksMovement()) {
/*  64: 88 */       return true;
/*  65:    */     }
/*  66: 91 */     if (paramaqu.isClient) {
/*  67: 92 */       return true;
/*  68:    */     }
/*  69: 95 */     localajh.a((bda)localbcm);
/*  70: 96 */     paramahd.a(localajh);
/*  71:    */     
/*  72: 98 */     return true;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public bcm a(World paramaqu, int paramInt)
/*  76:    */   {
/*  77:103 */     return new bda();
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  81:    */   {
/*  82:108 */     for (int i = 0; i < 3; i++)
/*  83:    */     {
/*  84:109 */       int j = paramRandom.nextInt(2) * 2 - 1;
/*  85:110 */       int k = paramRandom.nextInt(2) * 2 - 1;
/*  86:    */       
/*  87:112 */       double d1 = paramdt.getX() + 0.5D + 0.25D * j;
/*  88:113 */       double d2 = paramdt.getY() + paramRandom.nextFloat();
/*  89:114 */       double d3 = paramdt.getZ() + 0.5D + 0.25D * k;
/*  90:115 */       double d4 = paramRandom.nextFloat() * j;
/*  91:116 */       double d5 = (paramRandom.nextFloat() - 0.5D) * 0.125D;
/*  92:117 */       double d6 = paramRandom.nextFloat() * k;
/*  93:    */       
/*  94:119 */       paramaqu.a(EnumParticleEffect.y, d1, d2, d3, d4, d5, d6, new int[0]);
/*  95:    */     }
/*  96:    */   }
/*  97:    */   
/*  98:    */   public Block a(int paramInt)
/*  99:    */   {
/* 100:125 */     EnumDirection localej = EnumDirection.a(paramInt);
/* 101:126 */     if (localej.k() == EnumAxis.Y) {
/* 102:127 */       localej = EnumDirection.NORTH;
/* 103:    */     }
/* 104:129 */     return instance().a(a, localej);
/* 105:    */   }
/* 106:    */   
/* 107:    */   public int c(Block parambec)
/* 108:    */   {
/* 109:135 */     return ((EnumDirection)parambec.getProperty(a)).a();
/* 110:    */   }
/* 111:    */   
/* 112:    */   protected bed e()
/* 113:    */   {
/* 114:140 */     return new bed(this, new IBlockData[] { a });
/* 115:    */   }
/* 116:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avr
 * JD-Core Version:    0.7.0.1
 */