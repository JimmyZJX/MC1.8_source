package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class BlockGrass
/*   4:    */   extends BlockType
/*   5:    */   implements atz
/*   6:    */ {
/*   7: 20 */   public static final BlockDataBoolean a = BlockDataBoolean.getInstance("snowy");
/*   8:    */   
/*   9:    */   protected BlockGrass()
/*  10:    */   {
/*  11: 25 */     super(Material.grass);
/*  12: 26 */     j(this.L.b().setData(a, Boolean.valueOf(false)));
/*  13: 27 */     a(true);
/*  14: 28 */     setCreativeTab(CreativeTabs.tabBlock);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/*  18:    */   {
/*  19: 33 */     BlockType localatr = paramard.getBlock(paramdt.up()).getType();
/*  20: 34 */     return parambec.setData(a, Boolean.valueOf((localatr == BlockList.aJ) || (localatr == BlockList.aH)));
/*  21:    */   }
/*  22:    */   
/*  23:    */   public int F()
/*  24:    */   {
/*  25: 39 */     return aqt.a(0.5D, 1.0D);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public int h(Block parambec)
/*  29:    */   {
/*  30: 44 */     return F();
/*  31:    */   }
/*  32:    */   
/*  33:    */   public int a(IBlockAccess paramard, BlockPosition paramdt, int paramInt)
/*  34:    */   {
/*  35: 49 */     return art.a(paramard, paramdt);
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  39:    */   {
/*  40: 54 */     if (paramaqu.isClient) {
/*  41: 55 */       return;
/*  42:    */     }
/*  43: 58 */     if ((paramaqu.l(paramdt.up()) < 4) && (paramaqu.getBlock(paramdt.up()).getType().getLightOpacity() > 2))
/*  44:    */     {
/*  45: 59 */       paramaqu.setBlock(paramdt, BlockList.dirt.instance());
/*  46: 60 */       return;
/*  47:    */     }
/*  48: 63 */     if (paramaqu.l(paramdt.up()) >= 9) {
/*  49: 64 */       for (int i = 0; i < 4; i++)
/*  50:    */       {
/*  51: 65 */         BlockPosition localdt = paramdt.offset(paramRandom.nextInt(3) - 1, paramRandom.nextInt(5) - 3, paramRandom.nextInt(3) - 1);
/*  52: 66 */         BlockType localatr = paramaqu.getBlock(localdt.up()).getType();
/*  53: 67 */         Block localbec = paramaqu.getBlock(localdt);
/*  54: 68 */         if ((localbec.getType() == BlockList.dirt) && (localbec.getData(BlockDirt.a) == avd.a) && (paramaqu.l(localdt.up()) >= 4) && (localatr.getLightOpacity() <= 2)) {
/*  55: 69 */           paramaqu.setBlock(localdt, BlockList.grass.instance());
/*  56:    */         }
/*  57:    */       }
/*  58:    */     }
/*  59:    */   }
/*  60:    */   
/*  61:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  62:    */   {
/*  63: 78 */     return BlockList.dirt.a(BlockList.dirt.instance().setData(BlockDirt.a, avd.a), paramRandom, paramInt);
/*  64:    */   }
/*  65:    */   
/*  66:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, boolean paramBoolean)
/*  67:    */   {
/*  68: 83 */     return true;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public boolean a(World paramaqu, Random paramRandom, BlockPosition paramdt, Block parambec)
/*  72:    */   {
/*  73: 88 */     return true;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void b(World paramaqu, Random paramRandom, BlockPosition paramdt, Block parambec)
/*  77:    */   {
/*  78: 93 */     BlockPosition localdt1 = paramdt.up();
/*  79:    */     label260:
/*  80: 95 */     for (int i = 0; i < 128; i++)
/*  81:    */     {
/*  82: 96 */       BlockPosition localdt2 = localdt1;
/*  83: 97 */       for (int j = 0; j < i / 16; j++)
/*  84:    */       {
/*  85: 98 */         localdt2 = localdt2.offset(paramRandom.nextInt(3) - 1, (paramRandom.nextInt(3) - 1) * paramRandom.nextInt(3) / 2, paramRandom.nextInt(3) - 1);
/*  86: 99 */         if ((paramaqu.getBlock(localdt2.down()).getType() != BlockList.grass) || (paramaqu.getBlock(localdt2).getType().blocksMovement())) {
/*  87:    */           break label260;
/*  88:    */         }
/*  89:    */       }
/*  90:104 */       if (paramaqu.getBlock(localdt2).getType().material == Material.air)
/*  91:    */       {
/*  92:    */         Object localObject;
/*  93:108 */         if (paramRandom.nextInt(8) == 0)
/*  94:    */         {
/*  95:109 */           localObject = paramaqu.b(localdt2).a(paramRandom, localdt2);
/*  96:110 */           avy localavy = ((EnumFlowerVariant)localObject).a().a();
/*  97:111 */           Block localbec = localavy.instance().setData(localavy.l(), (Comparable)localObject);
/*  98:112 */           if (localavy.f(paramaqu, localdt2, localbec)) {
/*  99:113 */             paramaqu.setBlock(localdt2, localbec, 3);
/* 100:    */           }
/* 101:    */         }
/* 102:    */         else
/* 103:    */         {
/* 104:116 */           localObject = BlockList.tallgrass.instance().setData(bbh.a, bbi.b);
/* 105:117 */           if (BlockList.tallgrass.f(paramaqu, localdt2, (Block)localObject)) {
/* 106:118 */             paramaqu.setBlock(localdt2, (Block)localObject, 3);
/* 107:    */           }
/* 108:    */         }
/* 109:    */       }
/* 110:    */     }
/* 111:    */   }
/* 112:    */   
/* 113:    */   public aql k()
/* 114:    */   {
/* 115:126 */     return aql.b;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public int c(Block parambec)
/* 119:    */   {
/* 120:131 */     return 0;
/* 121:    */   }
/* 122:    */   
/* 123:    */   protected bed e()
/* 124:    */   {
/* 125:136 */     return new bed(this, new IBlockData[] { a });
/* 126:    */   }
/* 127:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     awn
 * JD-Core Version:    0.7.0.1
 */