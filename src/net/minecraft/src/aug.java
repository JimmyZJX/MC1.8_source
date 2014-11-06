package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class aug
/*   4:    */   extends ProtoBlock
/*   5:    */ {
/*   6: 24 */   public static final bew a = bew.a("bites", 0, 6);
/*   7:    */   
/*   8:    */   protected aug()
/*   9:    */   {
/*  10: 27 */     super(Material.F);
/*  11: 28 */     j(this.L.b().a(a, Integer.valueOf(0)));
/*  12: 29 */     a(true);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  16:    */   {
/*  17: 34 */     float f1 = 0.0625F;
/*  18: 35 */     float f2 = (1 + ((Integer)paramard.getBlock(paramdt).getProperty(a)).intValue() * 2) / 16.0F;
/*  19: 36 */     float f3 = 0.5F;
/*  20: 37 */     a(f2, 0.0F, f1, 1.0F - f1, f3, 1.0F - f1);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void h()
/*  24:    */   {
/*  25: 42 */     float f1 = 0.0625F;
/*  26: 43 */     float f2 = 0.5F;
/*  27: 44 */     a(f1, 0.0F, f1, 1.0F - f1, f2, 1.0F - f1);
/*  28:    */   }
/*  29:    */   
/*  30:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  31:    */   {
/*  32: 50 */     float f1 = 0.0625F;
/*  33: 51 */     float f2 = (1 + ((Integer)parambec.getProperty(a)).intValue() * 2) / 16.0F;
/*  34: 52 */     float f3 = 0.5F;
/*  35: 53 */     return new AABB(paramdt.getX() + f2, paramdt.getY(), paramdt.getZ() + f1, paramdt.getX() + 1 - f1, paramdt.getY() + f3, paramdt.getZ() + 1 - f1);
/*  36:    */   }
/*  37:    */   
/*  38:    */   public AABB a(World paramaqu, BlockPosition paramdt)
/*  39:    */   {
/*  40: 58 */     return a(paramaqu, paramdt, paramaqu.getBlock(paramdt));
/*  41:    */   }
/*  42:    */   
/*  43:    */   public boolean isOpaqueCube()
/*  44:    */   {
/*  45: 63 */     return false;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public boolean c()
/*  49:    */   {
/*  50: 68 */     return false;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  54:    */   {
/*  55: 73 */     b(paramaqu, paramdt, parambec, paramahd);
/*  56: 74 */     return true;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void a(World paramaqu, BlockPosition paramdt, EntityPlayer paramahd)
/*  60:    */   {
/*  61: 79 */     b(paramaqu, paramdt, paramaqu.getBlock(paramdt), paramahd);
/*  62:    */   }
/*  63:    */   
/*  64:    */   private void b(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd)
/*  65:    */   {
/*  66: 83 */     if (!paramahd.j(false)) {
/*  67: 84 */       return;
/*  68:    */     }
/*  69: 87 */     paramahd.ck().a(2, 0.1F);
/*  70: 88 */     int i = ((Integer)parambec.getProperty(a)).intValue();
/*  71: 89 */     if (i < 6) {
/*  72: 90 */       paramaqu.setBlock(paramdt, parambec.a(a, Integer.valueOf(i + 1)), 3);
/*  73:    */     } else {
/*  74: 92 */       paramaqu.g(paramdt);
/*  75:    */     }
/*  76:    */   }
/*  77:    */   
/*  78:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  79:    */   {
/*  80: 98 */     if (super.c(paramaqu, paramdt)) {
/*  81: 99 */       return d(paramaqu, paramdt);
/*  82:    */     }
/*  83:102 */     return false;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  87:    */   {
/*  88:107 */     if (!d(paramaqu, paramdt)) {
/*  89:108 */       paramaqu.g(paramdt);
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:    */   private boolean d(World paramaqu, BlockPosition paramdt)
/*  94:    */   {
/*  95:113 */     return paramaqu.getBlock(paramdt.down()).getProto().getMaterial().a();
/*  96:    */   }
/*  97:    */   
/*  98:    */   public int a(Random paramRandom)
/*  99:    */   {
/* 100:118 */     return 0;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 104:    */   {
/* 105:124 */     return null;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public Item b(World paramaqu, BlockPosition paramdt)
/* 109:    */   {
/* 110:129 */     return ItemList.aZ;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public aql k()
/* 114:    */   {
/* 115:134 */     return aql.c;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public Block a(int paramInt)
/* 119:    */   {
/* 120:139 */     return instance().a(a, Integer.valueOf(paramInt));
/* 121:    */   }
/* 122:    */   
/* 123:    */   public int c(Block parambec)
/* 124:    */   {
/* 125:145 */     return ((Integer)parambec.getProperty(a)).intValue();
/* 126:    */   }
/* 127:    */   
/* 128:    */   protected bed e()
/* 129:    */   {
/* 130:150 */     return new bed(this, new bex[] { a });
/* 131:    */   }
/* 132:    */   
/* 133:    */   public int l(World paramaqu, BlockPosition paramdt)
/* 134:    */   {
/* 135:155 */     return (7 - ((Integer)paramaqu.getBlock(paramdt).getProperty(a)).intValue()) * 2;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public boolean N()
/* 139:    */   {
/* 140:160 */     return true;
/* 141:    */   }
/* 142:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aug
 * JD-Core Version:    0.7.0.1
 */