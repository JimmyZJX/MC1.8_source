package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class axc
/*   4:    */   extends atg
/*   5:    */ {
/*   6: 57 */   public static final BlockDataBoolean a = BlockDataBoolean.getInstance("has_record");
/*   7:    */   
/*   8:    */   protected axc()
/*   9:    */   {
/*  10: 60 */     super(Material.wood);
/*  11: 61 */     j(this.L.b().setData(a, Boolean.valueOf(false)));
/*  12: 62 */     setCreativeTab(CreativeTabs.tabDeco);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  16:    */   {
/*  17: 67 */     if (((Boolean)parambec.getProperty(a)).booleanValue())
/*  18:    */     {
/*  19: 68 */       e(paramaqu, paramdt, parambec);
/*  20:    */       
/*  21: 70 */       parambec = parambec.setData(a, Boolean.valueOf(false));
/*  22: 71 */       paramaqu.setBlock(paramdt, parambec, 2);
/*  23: 72 */       return true;
/*  24:    */     }
/*  25: 75 */     return false;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ItemStack paramamj)
/*  29:    */   {
/*  30: 79 */     if (paramaqu.isClient) {
/*  31: 80 */       return;
/*  32:    */     }
/*  33: 83 */     bcm localbcm = paramaqu.s(paramdt);
/*  34: 84 */     if (!(localbcm instanceof axd)) {
/*  35: 85 */       return;
/*  36:    */     }
/*  37: 88 */     ((axd)localbcm).a(new ItemStack(paramamj.getItem(), 1, paramamj.getDamage2()));
/*  38: 89 */     paramaqu.setBlock(paramdt, parambec.setData(a, Boolean.valueOf(true)), 2);
/*  39:    */   }
/*  40:    */   
/*  41:    */   private void e(World paramaqu, BlockPosition paramdt, Block parambec)
/*  42:    */   {
/*  43: 93 */     if (paramaqu.isClient) {
/*  44: 94 */       return;
/*  45:    */     }
/*  46: 97 */     bcm localbcm = paramaqu.s(paramdt);
/*  47: 98 */     if (!(localbcm instanceof axd)) {
/*  48: 99 */       return;
/*  49:    */     }
/*  50:102 */     axd localaxd = (axd)localbcm;
/*  51:103 */     ItemStack localamj1 = localaxd.a();
/*  52:104 */     if (localamj1 == null) {
/*  53:105 */       return;
/*  54:    */     }
/*  55:108 */     paramaqu.playLevelEvent(1005, paramdt, 0);
/*  56:109 */     paramaqu.a(paramdt, null);
/*  57:110 */     localaxd.a((ItemStack)null);
/*  58:    */     
/*  59:112 */     float f = 0.7F;
/*  60:113 */     double d1 = paramaqu.rng.nextFloat() * f + (1.0F - f) * 0.5D;
/*  61:114 */     double d2 = paramaqu.rng.nextFloat() * f + (1.0F - f) * 0.2D + 0.6D;
/*  62:115 */     double d3 = paramaqu.rng.nextFloat() * f + (1.0F - f) * 0.5D;
/*  63:    */     
/*  64:117 */     ItemStack localamj2 = localamj1.k();
/*  65:    */     
/*  66:119 */     EntityItem localadw = new EntityItem(paramaqu, paramdt.getX() + d1, paramdt.getY() + d2, paramdt.getZ() + d3, localamj2);
/*  67:120 */     localadw.initPickupDelay();
/*  68:121 */     paramaqu.spawnEntity(localadw);
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/*  72:    */   {
/*  73:128 */     e(paramaqu, paramdt, parambec);
/*  74:129 */     super.b(paramaqu, paramdt, parambec);
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, float paramFloat, int paramInt)
/*  78:    */   {
/*  79:134 */     if (paramaqu.isClient) {
/*  80:135 */       return;
/*  81:    */     }
/*  82:137 */     super.a(paramaqu, paramdt, parambec, paramFloat, 0);
/*  83:    */   }
/*  84:    */   
/*  85:    */   public bcm a(World paramaqu, int paramInt)
/*  86:    */   {
/*  87:142 */     return new axd();
/*  88:    */   }
/*  89:    */   
/*  90:    */   public boolean N()
/*  91:    */   {
/*  92:147 */     return true;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public int l(World paramaqu, BlockPosition paramdt)
/*  96:    */   {
/*  97:152 */     bcm localbcm = paramaqu.s(paramdt);
/*  98:153 */     if ((localbcm instanceof axd))
/*  99:    */     {
/* 100:154 */       ItemStack localamj = ((axd)localbcm).a();
/* 101:156 */       if (localamj != null) {
/* 102:158 */         return Item.b(localamj.getItem()) + 1 - Item.b(ItemList.cq);
/* 103:    */       }
/* 104:    */     }
/* 105:162 */     return 0;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public int b()
/* 109:    */   {
/* 110:167 */     return 3;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public Block instance(int paramInt)
/* 114:    */   {
/* 115:172 */     return instance().setData(a, Boolean.valueOf(paramInt > 0));
/* 116:    */   }
/* 117:    */   
/* 118:    */   public int c(Block parambec)
/* 119:    */   {
/* 120:178 */     return ((Boolean)parambec.getProperty(a)).booleanValue() ? 1 : 0;
/* 121:    */   }
/* 122:    */   
/* 123:    */   protected bed e()
/* 124:    */   {
/* 125:183 */     return new bed(this, new IBlockData[] { a });
/* 126:    */   }
/* 127:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     axc
 * JD-Core Version:    0.7.0.1
 */