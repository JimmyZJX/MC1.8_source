package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class BlockFarmLand
/*   4:    */   extends ProtoBlock
/*   5:    */ {
/*   6: 20 */   public static final BlockDataInteger a = BlockDataInteger.getInstance("moisture", 0, 7);
/*   7:    */   
/*   8:    */   protected BlockFarmLand()
/*   9:    */   {
/*  10: 25 */     super(Material.dirt);
/*  11: 26 */     j(this.L.b().setData(a, Integer.valueOf(0)));
/*  12: 27 */     a(true);
/*  13: 28 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
/*  14: 29 */     e(255);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  18:    */   {
/*  19: 35 */     return new AABB(paramdt.getX(), paramdt.getY(), paramdt.getZ(), paramdt.getX() + 1, paramdt.getY() + 1, paramdt.getZ() + 1);
/*  20:    */   }
/*  21:    */   
/*  22:    */   public boolean c()
/*  23:    */   {
/*  24: 40 */     return false;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public boolean isOpaqueCube()
/*  28:    */   {
/*  29: 45 */     return false;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  33:    */   {
/*  34: 50 */     int i = ((Integer)parambec.getData(a)).intValue();
/*  35: 52 */     if ((e(paramaqu, paramdt)) || (paramaqu.C(paramdt.up())))
/*  36:    */     {
/*  37: 53 */       if (i < 7) {
/*  38: 54 */         paramaqu.setBlock(paramdt, parambec.setData(a, Integer.valueOf(7)), 2);
/*  39:    */       }
/*  40:    */     }
/*  41: 56 */     else if (i > 0) {
/*  42: 57 */       paramaqu.setBlock(paramdt, parambec.setData(a, Integer.valueOf(i - 1)), 2);
/*  43: 58 */     } else if (!d(paramaqu, paramdt)) {
/*  44: 59 */       paramaqu.setBlock(paramdt, BlockList.dirt.instance());
/*  45:    */     }
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void a(World paramaqu, BlockPosition paramdt, Entity paramwv, float paramFloat)
/*  49:    */   {
/*  50: 65 */     if (!(paramwv instanceof EntityLiving)) {
/*  51: 66 */       return;
/*  52:    */     }
/*  53: 68 */     if ((!paramaqu.isClient) && (paramaqu.rng.nextFloat() < paramFloat - 0.5F))
/*  54:    */     {
/*  55: 69 */       if ((!(paramwv instanceof EntityPlayer)) && (!paramaqu.getGameRules().getBoolean("mobGriefing"))) {
/*  56: 70 */         return;
/*  57:    */       }
/*  58: 72 */       paramaqu.setBlock(paramdt, BlockList.dirt.instance());
/*  59:    */     }
/*  60: 74 */     super.a(paramaqu, paramdt, paramwv, paramFloat);
/*  61:    */   }
/*  62:    */   
/*  63:    */   private boolean d(World paramaqu, BlockPosition paramdt)
/*  64:    */   {
/*  65: 78 */     ProtoBlock localatr = paramaqu.getBlock(paramdt.up()).getProto();
/*  66: 79 */     return ((localatr instanceof auu)) || ((localatr instanceof bay));
/*  67:    */   }
/*  68:    */   
/*  69:    */   private boolean e(World paramaqu, BlockPosition paramdt)
/*  70:    */   {
/*  71: 83 */     for (dy localdy : BlockPosition.b(paramdt.offset(-4, 0, -4), paramdt.offset(4, 1, 4))) {
/*  72: 84 */       if (paramaqu.getBlock(localdy).getProto().getMaterial() == Material.water) {
/*  73: 85 */         return true;
/*  74:    */       }
/*  75:    */     }
/*  76: 88 */     return false;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  80:    */   {
/*  81: 93 */     super.a(paramaqu, paramdt, parambec, paramatr);
/*  82: 95 */     if (paramaqu.getBlock(paramdt.up()).getProto().getMaterial().a()) {
/*  83: 96 */       paramaqu.setBlock(paramdt, BlockList.dirt.instance());
/*  84:    */     }
/*  85:    */   }
/*  86:    */   
/*  87:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  88:    */   {
/*  89:103 */     return BlockList.dirt.a(BlockList.dirt.instance().setData(BlockDirt.a, avd.a), paramRandom, paramInt);
/*  90:    */   }
/*  91:    */   
/*  92:    */   public Item b(World paramaqu, BlockPosition paramdt)
/*  93:    */   {
/*  94:108 */     return Item.fromProtoBlock(BlockList.dirt);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public Block instance(int paramInt)
/*  98:    */   {
/*  99:113 */     return instance().setData(a, Integer.valueOf(paramInt & 0x7));
/* 100:    */   }
/* 101:    */   
/* 102:    */   public int c(Block parambec)
/* 103:    */   {
/* 104:119 */     return ((Integer)parambec.getData(a)).intValue();
/* 105:    */   }
/* 106:    */   
/* 107:    */   protected bed e()
/* 108:    */   {
/* 109:124 */     return new bed(this, new IBlockData[] { a });
/* 110:    */   }
/* 111:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avu
 * JD-Core Version:    0.7.0.1
 */