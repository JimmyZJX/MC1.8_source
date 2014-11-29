package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class BlockSlab
/*   5:    */   extends BlockType
/*   6:    */ {
/*   7: 21 */   public static final BlockDataEnum half = BlockDataEnum.getInstance("half", EnumSlabHalf.class);
/*   8:    */   
/*   9:    */   public BlockSlab(Material parambof)
/*  10:    */   {
/*  11: 27 */     super(parambof);
/*  12: 29 */     if (j()) {
/*  13: 30 */       this.r = true;
/*  14:    */     } else {
/*  15: 32 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*  16:    */     }
/*  17: 34 */     e(255);
/*  18:    */   }
/*  19:    */   
/*  20:    */   protected boolean G()
/*  21:    */   {
/*  22: 39 */     return false;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  26:    */   {
/*  27: 44 */     if (j())
/*  28:    */     {
/*  29: 45 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  30: 46 */       return;
/*  31:    */     }
/*  32: 49 */     Block localbec = paramard.getBlock(paramdt);
/*  33: 50 */     if (localbec.getType() == this) {
/*  34: 51 */       if (localbec.getData(half) == EnumSlabHalf.TOP) {
/*  35: 52 */         a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  36:    */       } else {
/*  37: 54 */         a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*  38:    */       }
/*  39:    */     }
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void h()
/*  43:    */   {
/*  44: 61 */     if (j()) {
/*  45: 62 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  46:    */     } else {
/*  47: 64 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, AABB parambrt, List paramList, Entity paramwv)
/*  52:    */   {
/*  53: 70 */     a(paramaqu, paramdt);
/*  54: 71 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean c()
/*  58:    */   {
/*  59: 76 */     return j();
/*  60:    */   }
/*  61:    */   
/*  62:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/*  63:    */   {
/*  64: 81 */     Block localbec = super.a(paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3, paramInt, paramxm).setData(half, EnumSlabHalf.BOTTOM);
/*  65: 83 */     if (j()) {
/*  66: 84 */       return localbec;
/*  67:    */     }
/*  68: 87 */     if ((paramej == EnumDirection.DOWN) || ((paramej != EnumDirection.UP) && (paramFloat2 > 0.5D))) {
/*  69: 88 */       return localbec.setData(half, EnumSlabHalf.TOP);
/*  70:    */     }
/*  71: 90 */     return localbec;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public int a(Random paramRandom)
/*  75:    */   {
/*  76: 95 */     if (j()) {
/*  77: 96 */       return 2;
/*  78:    */     }
/*  79: 98 */     return 1;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public boolean isOpaqueCube()
/*  83:    */   {
/*  84:103 */     return j();
/*  85:    */   }
/*  86:    */   
/*  87:    */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/*  88:    */   {
/*  89:108 */     if (j()) {
/*  90:109 */       return super.a(paramard, paramdt, paramej);
/*  91:    */     }
/*  92:112 */     if ((paramej != EnumDirection.UP) && (paramej != EnumDirection.DOWN) && (!super.a(paramard, paramdt, paramej))) {
/*  93:113 */       return false;
/*  94:    */     }
/*  95:116 */     BlockPosition localdt = paramdt.offset(paramej.opposite());
/*  96:    */     
/*  97:118 */     Block localbec1 = paramard.getBlock(paramdt);
/*  98:119 */     Block localbec2 = paramard.getBlock(localdt);
/*  99:    */     
/* 100:121 */     int i = (c(localbec1.getType())) && (localbec1.getData(half) == EnumSlabHalf.TOP) ? 1 : 0;
/* 101:122 */     int j = (c(localbec2.getType())) && (localbec2.getData(half) == EnumSlabHalf.TOP) ? 1 : 0;
/* 102:123 */     if (j != 0)
/* 103:    */     {
/* 104:124 */       if (paramej == EnumDirection.DOWN) {
/* 105:125 */         return true;
/* 106:    */       }
/* 107:127 */       if ((paramej == EnumDirection.UP) && (super.a(paramard, paramdt, paramej))) {
/* 108:128 */         return true;
/* 109:    */       }
/* 110:130 */       return (!c(localbec1.getType())) || (i == 0);
/* 111:    */     }
/* 112:132 */     if (paramej == EnumDirection.UP) {
/* 113:133 */       return true;
/* 114:    */     }
/* 115:135 */     if ((paramej == EnumDirection.DOWN) && (super.a(paramard, paramdt, paramej))) {
/* 116:136 */       return true;
/* 117:    */     }
/* 118:138 */     return (!c(localbec1.getType())) || (i != 0);
/* 119:    */   }
/* 120:    */   
/* 121:    */   protected static boolean c(BlockType paramatr)
/* 122:    */   {
/* 123:143 */     return (paramatr == BlockList.U) || (paramatr == BlockList.bM) || (paramatr == BlockList.cP);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public abstract String b(int paramInt);
/* 127:    */   
/* 128:    */   public int j(World paramaqu, BlockPosition paramdt)
/* 129:    */   {
/* 130:150 */     return super.j(paramaqu, paramdt) & 0x7;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public abstract boolean j();
/* 134:    */   
/* 135:    */   public abstract IBlockData l();
/* 136:    */   
/* 137:    */   public abstract Object a(ItemStack paramamj);
/* 138:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     awq
 * JD-Core Version:    0.7.0.1
 */