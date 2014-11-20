package net.minecraft.src;
/*   1:    */ public class avw
/*   2:    */   extends avb
/*   3:    */ {
/*   4: 19 */   public static final BlockDataBoolean a = BlockDataBoolean.getInstance("open");
/*   5: 20 */   public static final BlockDataBoolean b = BlockDataBoolean.getInstance("powered");
/*   6: 21 */   public static final BlockDataBoolean M = BlockDataBoolean.getInstance("in_wall");
/*   7:    */   
/*   8:    */   public avw()
/*   9:    */   {
/*  10: 24 */     super(Material.wood);
/*  11:    */     
/*  12: 26 */     j(this.L.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false)));
/*  13: 27 */     setCreativeTab(CreativeTabs.tabRedstone);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public Block a(Block parambec, IBlockAccess paramard, BlockPosition paramdt)
/*  17:    */   {
/*  18: 32 */     EnumAxis localel = ((EnumDirection)parambec.getProperty(N)).k();
/*  19: 33 */     if (((localel == EnumAxis.Z) && ((paramard.getBlock(paramdt.west()).getProto() == BlockList.bZ) || (paramard.getBlock(paramdt.east()).getProto() == BlockList.bZ))) || ((localel == EnumAxis.X) && ((paramard.getBlock(paramdt.north()).getProto() == BlockList.bZ) || (paramard.getBlock(paramdt.south()).getProto() == BlockList.bZ)))) {
/*  20: 37 */       parambec = parambec.a(M, Boolean.valueOf(true));
/*  21:    */     }
/*  22: 40 */     return parambec;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  26:    */   {
/*  27: 45 */     if (paramaqu.getBlock(paramdt.down()).getProto().getMaterial().a()) {
/*  28: 46 */       return super.c(paramaqu, paramdt);
/*  29:    */     }
/*  30: 49 */     return false;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  34:    */   {
/*  35: 55 */     if (((Boolean)parambec.getProperty(a)).booleanValue()) {
/*  36: 56 */       return null;
/*  37:    */     }
/*  38: 59 */     EnumAxis localel = ((EnumDirection)parambec.getProperty(N)).k();
/*  39: 60 */     if (localel == EnumAxis.Z) {
/*  40: 61 */       return new AABB(paramdt.getX(), paramdt.getY(), paramdt.getZ() + 0.375F, paramdt.getX() + 1, paramdt.getY() + 1.5F, paramdt.getZ() + 0.625F);
/*  41:    */     }
/*  42: 64 */     return new AABB(paramdt.getX() + 0.375F, paramdt.getY(), paramdt.getZ(), paramdt.getX() + 0.625F, paramdt.getY() + 1.5F, paramdt.getZ() + 1);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  46:    */   {
/*  47: 69 */     EnumAxis localel = ((EnumDirection)paramard.getBlock(paramdt).getProperty(N)).k();
/*  48: 70 */     if (localel == EnumAxis.Z) {
/*  49: 71 */       a(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
/*  50:    */     } else {
/*  51: 73 */       a(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
/*  52:    */     }
/*  53:    */   }
/*  54:    */   
/*  55:    */   public boolean c()
/*  56:    */   {
/*  57: 79 */     return false;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public boolean isOpaqueCube()
/*  61:    */   {
/*  62: 84 */     return false;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public boolean b(IBlockAccess paramard, BlockPosition paramdt)
/*  66:    */   {
/*  67: 89 */     return ((Boolean)paramard.getBlock(paramdt).getProperty(a)).booleanValue();
/*  68:    */   }
/*  69:    */   
/*  70:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/*  71:    */   {
/*  72: 94 */     return instance().a(N, paramxm.aO()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(M, Boolean.valueOf(false));
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  76:    */   {
/*  77: 99 */     if (((Boolean)parambec.getProperty(a)).booleanValue())
/*  78:    */     {
/*  79:100 */       parambec = parambec.a(a, Boolean.valueOf(false));
/*  80:101 */       paramaqu.setBlock(paramdt, parambec, 2);
/*  81:    */     }
/*  82:    */     else
/*  83:    */     {
/*  84:104 */       EnumDirection localej = EnumDirection.a(paramahd.yaw);
/*  85:105 */       if (parambec.getProperty(N) == localej.d()) {
/*  86:106 */         parambec = parambec.a(N, localej);
/*  87:    */       }
/*  88:108 */       parambec = parambec.a(a, Boolean.valueOf(true));
/*  89:109 */       paramaqu.setBlock(paramdt, parambec, 2);
/*  90:    */     }
/*  91:112 */     paramaqu.playLevelEvent(paramahd, ((Boolean)parambec.getProperty(a)).booleanValue() ? 1003 : 1006, paramdt, 0);
/*  92:113 */     return true;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  96:    */   {
/*  97:118 */     if (paramaqu.isClient) {
/*  98:119 */       return;
/*  99:    */     }
/* 100:122 */     boolean bool = paramaqu.z(paramdt);
/* 101:123 */     if ((bool) || (paramatr.protoBlock_g())) {
/* 102:124 */       if ((bool) && (!((Boolean)parambec.getProperty(a)).booleanValue()) && (!((Boolean)parambec.getProperty(b)).booleanValue()))
/* 103:    */       {
/* 104:125 */         paramaqu.setBlock(paramdt, parambec.a(a, Boolean.valueOf(true)).a(b, Boolean.valueOf(true)), 2);
/* 105:126 */         paramaqu.playLevelEvent(null, 1003, paramdt, 0);
/* 106:    */       }
/* 107:127 */       else if ((!bool) && (((Boolean)parambec.getProperty(a)).booleanValue()) && (((Boolean)parambec.getProperty(b)).booleanValue()))
/* 108:    */       {
/* 109:128 */         paramaqu.setBlock(paramdt, parambec.a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
/* 110:129 */         paramaqu.playLevelEvent(null, 1006, paramdt, 0);
/* 111:    */       }
/* 112:130 */       else if (bool != ((Boolean)parambec.getProperty(b)).booleanValue())
/* 113:    */       {
/* 114:131 */         paramaqu.setBlock(paramdt, parambec.a(b, Boolean.valueOf(bool)), 2);
/* 115:    */       }
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/* 120:    */   {
/* 121:138 */     return true;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public Block a(int paramInt)
/* 125:    */   {
/* 126:143 */     return instance().a(N, EnumDirection.b(paramInt)).a(a, Boolean.valueOf((paramInt & 0x4) != 0)).a(b, Boolean.valueOf((paramInt & 0x8) != 0));
/* 127:    */   }
/* 128:    */   
/* 129:    */   public int c(Block parambec)
/* 130:    */   {
/* 131:151 */     int i = 0;
/* 132:    */     
/* 133:153 */     i |= ((EnumDirection)parambec.getProperty(N)).b();
/* 134:155 */     if (((Boolean)parambec.getProperty(b)).booleanValue()) {
/* 135:156 */       i |= 0x8;
/* 136:    */     }
/* 137:159 */     if (((Boolean)parambec.getProperty(a)).booleanValue()) {
/* 138:160 */       i |= 0x4;
/* 139:    */     }
/* 140:163 */     return i;
/* 141:    */   }
/* 142:    */   
/* 143:    */   protected bed e()
/* 144:    */   {
/* 145:168 */     return new bed(this, new IBlockData[] { N, a, b, M });
/* 146:    */   }
/* 147:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avw
 * JD-Core Version:    0.7.0.1
 */