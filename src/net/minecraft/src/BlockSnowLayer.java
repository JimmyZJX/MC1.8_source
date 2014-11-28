package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class BlockSnowLayer
/*   4:    */   extends ProtoBlock
/*   5:    */ {
/*   6: 26 */   public static final BlockDataInteger a = BlockDataInteger.getInstance("layers", 1, 8);
/*   7:    */   
/*   8:    */   protected BlockSnowLayer()
/*   9:    */   {
/*  10: 33 */     super(Material.y);
/*  11: 34 */     j(this.L.b().setData(a, Integer.valueOf(1)));
/*  12: 35 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*  13: 36 */     a(true);
/*  14: 37 */     setCreativeTab(CreativeTabs.tabDeco);
/*  15: 38 */     h();
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean b(IBlockAccess paramard, BlockPosition paramdt)
/*  19:    */   {
/*  20: 43 */     return ((Integer)paramard.getBlock(paramdt).getData(a)).intValue() < 5;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  24:    */   {
/*  25: 49 */     int i = ((Integer)parambec.getData(a)).intValue() - 1;
/*  26: 50 */     float f = 0.125F;
/*  27: 51 */     return new AABB(paramdt.getX() + this.B, paramdt.getY() + this.C, paramdt.getZ() + this.D, paramdt.getX() + this.E, paramdt.getY() + i * f, paramdt.getZ() + this.G);
/*  28:    */   }
/*  29:    */   
/*  30:    */   public boolean c()
/*  31:    */   {
/*  32: 61 */     return false;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public boolean isOpaqueCube()
/*  36:    */   {
/*  37: 66 */     return false;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void h()
/*  41:    */   {
/*  42: 71 */     b(0);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  46:    */   {
/*  47: 76 */     Block localbec = paramard.getBlock(paramdt);
/*  48: 77 */     b(((Integer)localbec.getData(a)).intValue());
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected void b(int paramInt)
/*  52:    */   {
/*  53: 81 */     a(0.0F, 0.0F, 0.0F, 1.0F, paramInt / 8.0F, 1.0F);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  57:    */   {
/*  58: 86 */     Block localbec = paramaqu.getBlock(paramdt.down());
/*  59: 87 */     ProtoBlock localatr = localbec.getProto();
/*  60: 89 */     if ((localatr == BlockList.aI) || (localatr == BlockList.cB)) {
/*  61: 90 */       return false;
/*  62:    */     }
/*  63: 93 */     if (localatr.getMaterial() == Material.leaves) {
/*  64: 94 */       return true;
/*  65:    */     }
/*  66: 97 */     if ((localatr == this) && (((Integer)localbec.getData(a)).intValue() == 7)) {
/*  67: 98 */       return true;
/*  68:    */     }
/*  69:101 */     return (localatr.c()) && (localatr.material.material_c());
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  73:    */   {
/*  74:106 */     e(paramaqu, paramdt, parambec);
/*  75:    */   }
/*  76:    */   
/*  77:    */   private boolean e(World paramaqu, BlockPosition paramdt, Block parambec)
/*  78:    */   {
/*  79:110 */     if (!c(paramaqu, paramdt))
/*  80:    */     {
/*  81:111 */       b(paramaqu, paramdt, parambec, 0);
/*  82:112 */       paramaqu.g(paramdt);
/*  83:113 */       return false;
/*  84:    */     }
/*  85:115 */     return true;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void a(World paramaqu, EntityPlayer paramahd, BlockPosition paramdt, Block parambec, bcm parambcm)
/*  89:    */   {
/*  90:120 */     a(paramaqu, paramdt, new ItemStack(ItemList.aD, ((Integer)parambec.getData(a)).intValue() + 1, 0));
/*  91:121 */     paramaqu.g(paramdt);
/*  92:    */     
/*  93:123 */     paramahd.increaseStat(StatList.H[ProtoBlock.a(this)]);
/*  94:    */   }
/*  95:    */   
/*  96:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  97:    */   {
/*  98:129 */     return ItemList.aD;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public int a(Random paramRandom)
/* 102:    */   {
/* 103:134 */     return 0;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 107:    */   {
/* 108:139 */     if (paramaqu.getLightLevel(EnumSkyBlock.BLOCK, paramdt) > 11)
/* 109:    */     {
/* 110:140 */       b(paramaqu, paramdt, paramaqu.getBlock(paramdt), 0);
/* 111:141 */       paramaqu.g(paramdt);
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/* 116:    */   {
/* 117:147 */     if (paramej == EnumDirection.UP) {
/* 118:148 */       return true;
/* 119:    */     }
/* 120:150 */     return super.a(paramard, paramdt, paramej);
/* 121:    */   }
/* 122:    */   
/* 123:    */   public Block instance(int paramInt)
/* 124:    */   {
/* 125:155 */     return instance().setData(a, Integer.valueOf((paramInt & 0x7) + 1));
/* 126:    */   }
/* 127:    */   
/* 128:    */   public boolean f(World paramaqu, BlockPosition paramdt)
/* 129:    */   {
/* 130:161 */     return ((Integer)paramaqu.getBlock(paramdt).getData(a)).intValue() == 1;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public int c(Block parambec)
/* 134:    */   {
/* 135:166 */     return ((Integer)parambec.getData(a)).intValue() - 1;
/* 136:    */   }
/* 137:    */   
/* 138:    */   protected bed e()
/* 139:    */   {
/* 140:171 */     return new bed(this, new IBlockData[] { a });
/* 141:    */   }
/* 142:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bao
 * JD-Core Version:    0.7.0.1
 */