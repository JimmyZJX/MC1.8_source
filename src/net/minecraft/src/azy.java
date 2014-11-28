package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class azy
/*   4:    */   extends ProtoBlock
/*   5:    */ {
/*   6: 20 */   public static final BlockDataInteger a = BlockDataInteger.getInstance("age", 0, 15);
/*   7:    */   
/*   8:    */   protected azy()
/*   9:    */   {
/*  10: 23 */     super(Material.plants);
/*  11: 24 */     j(this.L.b().setData(a, Integer.valueOf(0)));
/*  12: 25 */     float f = 0.375F;
/*  13: 26 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
/*  14: 27 */     a(true);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  18:    */   {
/*  19: 32 */     if ((paramaqu.getBlock(paramdt.down()).getProto() != BlockList.reeds) && (!e(paramaqu, paramdt, parambec))) {
/*  20: 33 */       return;
/*  21:    */     }
/*  22: 36 */     if (paramaqu.isEmpty(paramdt.up()))
/*  23:    */     {
/*  24: 37 */       int i = 1;
/*  25: 38 */       while (paramaqu.getBlock(paramdt.down(i)).getProto() == this) {
/*  26: 39 */         i++;
/*  27:    */       }
/*  28: 41 */       if (i < 3)
/*  29:    */       {
/*  30: 42 */         int j = ((Integer)parambec.getData(a)).intValue();
/*  31: 43 */         if (j == 15)
/*  32:    */         {
/*  33: 44 */           paramaqu.setBlock(paramdt.up(), instance());
/*  34: 45 */           paramaqu.setBlock(paramdt, parambec.setData(a, Integer.valueOf(0)), 4);
/*  35:    */         }
/*  36:    */         else
/*  37:    */         {
/*  38: 47 */           paramaqu.setBlock(paramdt, parambec.setData(a, Integer.valueOf(j + 1)), 4);
/*  39:    */         }
/*  40:    */       }
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  45:    */   {
/*  46: 55 */     ProtoBlock localatr = paramaqu.getBlock(paramdt.down()).getProto();
/*  47: 56 */     if (localatr == this) {
/*  48: 57 */       return true;
/*  49:    */     }
/*  50: 60 */     if ((localatr == BlockList.grass) || (localatr == BlockList.dirt) || (localatr == BlockList.sand))
/*  51:    */     {
/*  52: 61 */       for (EnumDirection localej : EnumHorizontalVertical.HORIZONTAL) {
/*  53: 62 */         if (paramaqu.getBlock(paramdt.offset(localej).down()).getProto().getMaterial() == Material.water) {
/*  54: 63 */           return true;
/*  55:    */         }
/*  56:    */       }
/*  57: 66 */       return false;
/*  58:    */     }
/*  59: 69 */     return false;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  63:    */   {
/*  64: 74 */     e(paramaqu, paramdt, parambec);
/*  65:    */   }
/*  66:    */   
/*  67:    */   protected final boolean e(World paramaqu, BlockPosition paramdt, Block parambec)
/*  68:    */   {
/*  69: 78 */     if (d(paramaqu, paramdt)) {
/*  70: 79 */       return true;
/*  71:    */     }
/*  72: 82 */     b(paramaqu, paramdt, parambec, 0);
/*  73: 83 */     paramaqu.g(paramdt);
/*  74: 84 */     return false;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public boolean d(World paramaqu, BlockPosition paramdt)
/*  78:    */   {
/*  79: 88 */     return c(paramaqu, paramdt);
/*  80:    */   }
/*  81:    */   
/*  82:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  83:    */   {
/*  84: 94 */     return null;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  88:    */   {
/*  89:100 */     return ItemList.aJ;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public boolean c()
/*  93:    */   {
/*  94:105 */     return false;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public boolean isOpaqueCube()
/*  98:    */   {
/*  99:110 */     return false;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public Item b(World paramaqu, BlockPosition paramdt)
/* 103:    */   {
/* 104:115 */     return ItemList.aJ;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public int a(IBlockAccess paramard, BlockPosition paramdt, int paramInt)
/* 108:    */   {
/* 109:120 */     return paramard.b(paramdt).b(paramdt);
/* 110:    */   }
/* 111:    */   
/* 112:    */   public aql k()
/* 113:    */   {
/* 114:125 */     return aql.c;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public Block instance(int paramInt)
/* 118:    */   {
/* 119:130 */     return instance().setData(a, Integer.valueOf(paramInt));
/* 120:    */   }
/* 121:    */   
/* 122:    */   public int c(Block parambec)
/* 123:    */   {
/* 124:136 */     return ((Integer)parambec.getData(a)).intValue();
/* 125:    */   }
/* 126:    */   
/* 127:    */   protected bed e()
/* 128:    */   {
/* 129:141 */     return new bed(this, new IBlockData[] { a });
/* 130:    */   }
/* 131:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azy
 * JD-Core Version:    0.7.0.1
 */