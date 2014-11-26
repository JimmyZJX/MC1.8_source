package net.minecraft.src;
/*   1:    */ public class axe
/*   2:    */   extends ProtoBlock
/*   3:    */ {
/*   4: 19 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing", en.HORIZONTAL);
/*   5:    */   
/*   6:    */   protected axe()
/*   7:    */   {
/*   8: 22 */     super(Material.q);
/*   9: 23 */     j(this.L.b().setData(a, EnumDirection.NORTH));
/*  10: 24 */     setCreativeTab(CreativeTabs.tabDeco);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  14:    */   {
/*  15: 30 */     a(paramaqu, paramdt);
/*  16: 31 */     return super.a(paramaqu, paramdt, parambec);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public AABB a(World paramaqu, BlockPosition paramdt)
/*  20:    */   {
/*  21: 36 */     a(paramaqu, paramdt);
/*  22: 37 */     return super.a(paramaqu, paramdt);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  26:    */   {
/*  27: 42 */     Block localbec = paramard.getBlock(paramdt);
/*  28: 43 */     if (localbec.getProto() != this) {
/*  29: 44 */       return;
/*  30:    */     }
/*  31: 47 */     float f = 0.125F;
/*  32: 48 */     switch (axf.a[((EnumDirection)localbec.getProperty(a)).ordinal()])
/*  33:    */     {
/*  34:    */     case 1: 
/*  35: 50 */       a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  36: 51 */       break;
/*  37:    */     case 2: 
/*  38: 53 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  39: 54 */       break;
/*  40:    */     case 3: 
/*  41: 56 */       a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  42: 57 */       break;
/*  43:    */     case 4: 
/*  44:    */     default: 
/*  45: 60 */       a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*  46:    */     }
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean c()
/*  50:    */   {
/*  51: 67 */     return false;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public boolean isOpaqueCube()
/*  55:    */   {
/*  56: 72 */     return false;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  60:    */   {
/*  61: 77 */     if (paramaqu.getBlock(paramdt.west()).getProto().blocksMovement()) {
/*  62: 78 */       return true;
/*  63:    */     }
/*  64: 79 */     if (paramaqu.getBlock(paramdt.east()).getProto().blocksMovement()) {
/*  65: 80 */       return true;
/*  66:    */     }
/*  67: 81 */     if (paramaqu.getBlock(paramdt.north()).getProto().blocksMovement()) {
/*  68: 82 */       return true;
/*  69:    */     }
/*  70: 83 */     if (paramaqu.getBlock(paramdt.south()).getProto().blocksMovement()) {
/*  71: 84 */       return true;
/*  72:    */     }
/*  73: 86 */     return false;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/*  77:    */   {
/*  78: 91 */     if ((paramej.k().c()) && (b(paramaqu, paramdt, paramej))) {
/*  79: 92 */       return instance().setData(a, paramej);
/*  80:    */     }
/*  81: 95 */     for (EnumDirection localej : en.HORIZONTAL) {
/*  82: 96 */       if (b(paramaqu, paramdt, localej)) {
/*  83: 97 */         return instance().setData(a, localej);
/*  84:    */       }
/*  85:    */     }
/*  86:101 */     return instance();
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  90:    */   {
/*  91:106 */     EnumDirection localej = (EnumDirection)parambec.getProperty(a);
/*  92:107 */     if (!b(paramaqu, paramdt, localej))
/*  93:    */     {
/*  94:108 */       b(paramaqu, paramdt, parambec, 0);
/*  95:109 */       paramaqu.g(paramdt);
/*  96:    */     }
/*  97:112 */     super.a(paramaqu, paramdt, parambec, paramatr);
/*  98:    */   }
/*  99:    */   
/* 100:    */   protected boolean b(World paramaqu, BlockPosition paramdt, EnumDirection paramej)
/* 101:    */   {
/* 102:116 */     return paramaqu.getBlock(paramdt.offset(paramej.d())).getProto().blocksMovement();
/* 103:    */   }
/* 104:    */   
/* 105:    */   public aql k()
/* 106:    */   {
/* 107:121 */     return aql.c;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public Block instance(int paramInt)
/* 111:    */   {
/* 112:126 */     EnumDirection localej = EnumDirection.a(paramInt);
/* 113:127 */     if (localej.k() == EnumAxis.Y) {
/* 114:128 */       localej = EnumDirection.NORTH;
/* 115:    */     }
/* 116:130 */     return instance().setData(a, localej);
/* 117:    */   }
/* 118:    */   
/* 119:    */   public int c(Block parambec)
/* 120:    */   {
/* 121:136 */     return ((EnumDirection)parambec.getProperty(a)).a();
/* 122:    */   }
/* 123:    */   
/* 124:    */   protected bed e()
/* 125:    */   {
/* 126:141 */     return new bed(this, new IBlockData[] { a });
/* 127:    */   }
/* 128:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axe
 * JD-Core Version:    0.7.0.1
 */