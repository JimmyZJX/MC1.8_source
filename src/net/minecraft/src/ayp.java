package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class ayp
/*   5:    */   extends BlockLeaves
/*   6:    */ {
/*   7: 22 */   public static final bev P = bev.a("variant", EnumWoodVariant.class, new ayq());
/*   8:    */   
/*   9:    */   public ayp()
/*  10:    */   {
/*  11: 30 */     j(this.L.b().a(P, EnumWoodVariant.OAK).a(b, Boolean.valueOf(true)).a(a, Boolean.valueOf(true)));
/*  12:    */   }
/*  13:    */   
/*  14:    */   public int h(Block parambec)
/*  15:    */   {
/*  16: 35 */     if (parambec.getProto() != this) {
/*  17: 36 */       return super.h(parambec);
/*  18:    */     }
/*  19: 39 */     EnumWoodVariant localayx = (EnumWoodVariant)parambec.getProperty(P);
/*  20: 40 */     if (localayx == EnumWoodVariant.SPRUCE) {
/*  21: 41 */       return aqp.a();
/*  22:    */     }
/*  23: 43 */     if (localayx == EnumWoodVariant.BIRCH) {
/*  24: 44 */       return aqp.b();
/*  25:    */     }
/*  26: 47 */     return super.h(parambec);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a(IBlockAccess paramard, BlockPosition paramdt, int paramInt)
/*  30:    */   {
/*  31: 52 */     Block localbec = paramard.getBlock(paramdt);
/*  32: 53 */     if (localbec.getProto() == this)
/*  33:    */     {
/*  34: 54 */       EnumWoodVariant localayx = (EnumWoodVariant)localbec.getProperty(P);
/*  35: 56 */       if (localayx == EnumWoodVariant.SPRUCE) {
/*  36: 57 */         return aqp.a();
/*  37:    */       }
/*  38: 59 */       if (localayx == EnumWoodVariant.BIRCH) {
/*  39: 60 */         return aqp.b();
/*  40:    */       }
/*  41:    */     }
/*  42: 64 */     return super.a(paramard, paramdt, paramInt);
/*  43:    */   }
/*  44:    */   
/*  45:    */   protected void a(World paramaqu, BlockPosition paramdt, Block parambec, int paramInt)
/*  46:    */   {
/*  47: 69 */     if ((parambec.getProperty(P) == EnumWoodVariant.OAK) && (paramaqu.rng.nextInt(paramInt) == 0)) {
/*  48: 70 */       a(paramaqu, paramdt, new ItemStack(ItemList.apple, 1, 0));
/*  49:    */     }
/*  50:    */   }
/*  51:    */   
/*  52:    */   protected int d(Block parambec)
/*  53:    */   {
/*  54: 76 */     if (parambec.getProperty(P) == EnumWoodVariant.JUNGLE) {
/*  55: 77 */       return 40;
/*  56:    */     }
/*  57: 80 */     return super.d(parambec);
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/*  61:    */   {
/*  62: 85 */     paramList.add(new ItemStack(paramalq, 1, EnumWoodVariant.OAK.getIndex()));
/*  63: 86 */     paramList.add(new ItemStack(paramalq, 1, EnumWoodVariant.SPRUCE.getIndex()));
/*  64: 87 */     paramList.add(new ItemStack(paramalq, 1, EnumWoodVariant.BIRCH.getIndex()));
/*  65: 88 */     paramList.add(new ItemStack(paramalq, 1, EnumWoodVariant.JUNGLE.getIndex()));
/*  66:    */   }
/*  67:    */   
/*  68:    */   protected ItemStack i(Block parambec)
/*  69:    */   {
/*  70: 93 */     return new ItemStack(Item.fromProtoBlock(this), 1, ((EnumWoodVariant)parambec.getProperty(P)).getIndex());
/*  71:    */   }
/*  72:    */   
/*  73:    */   public Block a(int paramInt)
/*  74:    */   {
/*  75: 98 */     return instance().a(P, b(paramInt)).a(a, Boolean.valueOf((paramInt & 0x4) == 0)).a(b, Boolean.valueOf((paramInt & 0x8) > 0));
/*  76:    */   }
/*  77:    */   
/*  78:    */   public int c(Block parambec)
/*  79:    */   {
/*  80:106 */     int i = 0;
/*  81:    */     
/*  82:108 */     i |= ((EnumWoodVariant)parambec.getProperty(P)).getIndex();
/*  83:110 */     if (!((Boolean)parambec.getProperty(a)).booleanValue()) {
/*  84:111 */       i |= 0x4;
/*  85:    */     }
/*  86:114 */     if (((Boolean)parambec.getProperty(b)).booleanValue()) {
/*  87:115 */       i |= 0x8;
/*  88:    */     }
/*  89:118 */     return i;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public EnumWoodVariant b(int paramInt)
/*  93:    */   {
/*  94:123 */     return EnumWoodVariant.fromIndex((paramInt & 0x3) % 4);
/*  95:    */   }
/*  96:    */   
/*  97:    */   protected bed e()
/*  98:    */   {
/*  99:128 */     return new bed(this, new bex[] { P, b, a });
/* 100:    */   }
/* 101:    */   
/* 102:    */   public int a(Block parambec)
/* 103:    */   {
/* 104:133 */     return ((EnumWoodVariant)parambec.getProperty(P)).getIndex();
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void a(World paramaqu, EntityPlayer paramahd, BlockPosition paramdt, Block parambec, bcm parambcm)
/* 108:    */   {
/* 109:138 */     if ((!paramaqu.isClient) && (paramahd.bY() != null) && (paramahd.bY().getItem() == ItemList.be))
/* 110:    */     {
/* 111:139 */       paramahd.b(StatList.H[ProtoBlock.a(this)]);
/* 112:    */       
/* 113:    */ 
/* 114:142 */       a(paramaqu, paramdt, new ItemStack(Item.fromProtoBlock(this), 1, ((EnumWoodVariant)parambec.getProperty(P)).getIndex()));
/* 115:143 */       return;
/* 116:    */     }
/* 117:146 */     super.a(paramaqu, paramahd, paramdt, parambec, parambcm);
/* 118:    */   }
/* 119:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayp
 * JD-Core Version:    0.7.0.1
 */