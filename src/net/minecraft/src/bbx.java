package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class bbx
/*   4:    */   extends ProtoBlock
/*   5:    */ {
/*   6: 22 */   public static final BlockDataBoolean a = BlockDataBoolean.getInstance("up");
/*   7: 23 */   public static final BlockDataBoolean b = BlockDataBoolean.getInstance("north");
/*   8: 24 */   public static final BlockDataBoolean M = BlockDataBoolean.getInstance("east");
/*   9: 25 */   public static final BlockDataBoolean N = BlockDataBoolean.getInstance("south");
/*  10: 26 */   public static final BlockDataBoolean O = BlockDataBoolean.getInstance("west");
/*  11: 27 */   public static final BlockDataEnum P = BlockDataEnum.getInstance("variant", EnumCobblestoneVariant.class);
/*  12:    */   
/*  13:    */   public bbx(ProtoBlock paramatr)
/*  14:    */   {
/*  15: 35 */     super(paramatr.material);
/*  16: 36 */     j(this.L.b().setData(a, Boolean.valueOf(false)).setData(b, Boolean.valueOf(false)).setData(M, Boolean.valueOf(false)).setData(N, Boolean.valueOf(false)).setData(O, Boolean.valueOf(false)).setData(P, EnumCobblestoneVariant.a));
/*  17: 37 */     c(paramatr.w);
/*  18: 38 */     b(paramatr.x / 3.0F);
/*  19: 39 */     a(paramatr.H);
/*  20: 40 */     setCreativeTab(CreativeTabs.tabBlock);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean isOpaqueCube()
/*  24:    */   {
/*  25: 45 */     return false;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public boolean b(IBlockAccess paramard, BlockPosition paramdt)
/*  29:    */   {
/*  30: 50 */     return false;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public boolean c()
/*  34:    */   {
/*  35: 55 */     return false;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  39:    */   {
/*  40: 60 */     boolean bool1 = e(paramard, paramdt.north());
/*  41: 61 */     boolean bool2 = e(paramard, paramdt.south());
/*  42: 62 */     boolean bool3 = e(paramard, paramdt.west());
/*  43: 63 */     boolean bool4 = e(paramard, paramdt.east());
/*  44:    */     
/*  45: 65 */     float f1 = 0.25F;
/*  46: 66 */     float f2 = 0.75F;
/*  47: 67 */     float f3 = 0.25F;
/*  48: 68 */     float f4 = 0.75F;
/*  49: 69 */     float f5 = 1.0F;
/*  50: 71 */     if (bool1) {
/*  51: 72 */       f3 = 0.0F;
/*  52:    */     }
/*  53: 74 */     if (bool2) {
/*  54: 75 */       f4 = 1.0F;
/*  55:    */     }
/*  56: 77 */     if (bool3) {
/*  57: 78 */       f1 = 0.0F;
/*  58:    */     }
/*  59: 80 */     if (bool4) {
/*  60: 81 */       f2 = 1.0F;
/*  61:    */     }
/*  62: 84 */     if ((bool1) && (bool2) && (!bool3) && (!bool4))
/*  63:    */     {
/*  64: 85 */       f5 = 0.8125F;
/*  65: 86 */       f1 = 0.3125F;
/*  66: 87 */       f2 = 0.6875F;
/*  67:    */     }
/*  68: 88 */     else if ((!bool1) && (!bool2) && (bool3) && (bool4))
/*  69:    */     {
/*  70: 89 */       f5 = 0.8125F;
/*  71: 90 */       f3 = 0.3125F;
/*  72: 91 */       f4 = 0.6875F;
/*  73:    */     }
/*  74: 94 */     a(f1, 0.0F, f3, f2, f5, f4);
/*  75:    */   }
/*  76:    */   
/*  77:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  78:    */   {
/*  79:100 */     a(paramaqu, paramdt);
/*  80:101 */     this.F = 1.5D;
/*  81:102 */     return super.a(paramaqu, paramdt, parambec);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public boolean e(IBlockAccess paramard, BlockPosition paramdt)
/*  85:    */   {
/*  86:106 */     ProtoBlock localatr = paramard.getBlock(paramdt).getProto();
/*  87:107 */     if (localatr == BlockList.barrier) {
/*  88:108 */       return false;
/*  89:    */     }
/*  90:110 */     if ((localatr == this) || ((localatr instanceof avw))) {
/*  91:111 */       return true;
/*  92:    */     }
/*  93:113 */     if ((localatr.material.isOpaque()) && (localatr.isOpaqueCube())) {
/*  94:114 */       return localatr.material != Material.C;
/*  95:    */     }
/*  96:116 */     return false;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/* 100:    */   {
/* 101:121 */     for (EnumCobblestoneVariant localbby : EnumCobblestoneVariant.values()) {
/* 102:122 */       paramList.add(new ItemStack(paramalq, 1, localbby.a()));
/* 103:    */     }
/* 104:    */   }
/* 105:    */   
/* 106:    */   public int a(Block parambec)
/* 107:    */   {
/* 108:128 */     return ((EnumCobblestoneVariant)parambec.getData(P)).a();
/* 109:    */   }
/* 110:    */   
/* 111:    */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/* 112:    */   {
/* 113:133 */     if (paramej == EnumDirection.DOWN) {
/* 114:134 */       return super.a(paramard, paramdt, paramej);
/* 115:    */     }
/* 116:136 */     return true;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public Block instance(int paramInt)
/* 120:    */   {
/* 121:141 */     return instance().setData(P, EnumCobblestoneVariant.a(paramInt));
/* 122:    */   }
/* 123:    */   
/* 124:    */   public int c(Block parambec)
/* 125:    */   {
/* 126:147 */     return ((EnumCobblestoneVariant)parambec.getData(P)).a();
/* 127:    */   }
/* 128:    */   
/* 129:    */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/* 130:    */   {
/* 131:152 */     return parambec.setData(a, Boolean.valueOf(!paramard.isEmpty(paramdt.up()))).setData(b, Boolean.valueOf(e(paramard, paramdt.north()))).setData(M, Boolean.valueOf(e(paramard, paramdt.east()))).setData(N, Boolean.valueOf(e(paramard, paramdt.south()))).setData(O, Boolean.valueOf(e(paramard, paramdt.west())));
/* 132:    */   }
/* 133:    */   
/* 134:    */   protected bed e()
/* 135:    */   {
/* 136:162 */     return new bed(this, new IBlockData[] { a, b, M, O, N, P });
/* 137:    */   }
/* 138:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbx
 * JD-Core Version:    0.7.0.1
 */