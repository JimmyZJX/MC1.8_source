package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class BlockHopper
/*   4:    */   extends atg
/*   5:    */ {
/*   6: 28 */   public static final beu a = beu.a("facing", new awy());
/*   7: 34 */   public static final bet b = bet.a("enabled");
/*   8:    */   
/*   9:    */   public BlockHopper()
/*  10:    */   {
/*  11: 37 */     super(Material.f);
/*  12: 38 */     j(this.L.b().a(a, EnumDirection.DOWN).a(b, Boolean.valueOf(true)));
/*  13: 39 */     setCreativeTab(CreativeTabs.tabRedstone);
/*  14: 40 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  18:    */   {
/*  19: 45 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, AABB parambrt, List<AABB> paramList, Entity paramwv)
/*  23:    */   {
/*  24: 50 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
/*  25: 51 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  26: 52 */     float f = 0.125F;
/*  27: 53 */     a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*  28: 54 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  29: 55 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  30: 56 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  31: 57 */     a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  32: 58 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  33: 59 */     a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  34: 60 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  35:    */     
/*  36: 62 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/*  40:    */   {
/*  41: 67 */     EnumDirection localej = paramej.d();
/*  42: 68 */     if (localej == EnumDirection.UP) {
/*  43: 69 */       localej = EnumDirection.DOWN;
/*  44:    */     }
/*  45: 71 */     return instance().a(a, localej).a(b, Boolean.valueOf(true));
/*  46:    */   }
/*  47:    */   
/*  48:    */   public bcm a(World paramaqu, int paramInt)
/*  49:    */   {
/*  50: 76 */     return new bde();
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityLiving paramxm, ItemStack paramamj)
/*  54:    */   {
/*  55: 81 */     super.a(paramaqu, paramdt, parambec, paramxm, paramamj);
/*  56: 83 */     if (paramamj.s())
/*  57:    */     {
/*  58: 84 */       bcm localbcm = paramaqu.s(paramdt);
/*  59: 85 */       if ((localbcm instanceof bde)) {
/*  60: 86 */         ((bde)localbcm).a(paramamj.q());
/*  61:    */       }
/*  62:    */     }
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/*  66:    */   {
/*  67: 93 */     e(paramaqu, paramdt, parambec);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  71:    */   {
/*  72: 98 */     if (paramaqu.isClient) {
/*  73: 99 */       return true;
/*  74:    */     }
/*  75:102 */     bcm localbcm = paramaqu.s(paramdt);
/*  76:103 */     if ((localbcm instanceof bde)) {
/*  77:104 */       paramahd.a((vq)localbcm);
/*  78:    */     }
/*  79:106 */     return true;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  83:    */   {
/*  84:111 */     e(paramaqu, paramdt, parambec);
/*  85:    */   }
/*  86:    */   
/*  87:    */   private void e(World paramaqu, BlockPosition paramdt, Block parambec)
/*  88:    */   {
/*  89:115 */     boolean bool = !paramaqu.z(paramdt);
/*  90:116 */     if (bool != ((Boolean)parambec.getProperty(b)).booleanValue()) {
/*  91:117 */       paramaqu.setBlock(paramdt, parambec.a(b, Boolean.valueOf(bool)), 4);
/*  92:    */     }
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/*  96:    */   {
/*  97:123 */     bcm localbcm = paramaqu.s(paramdt);
/*  98:124 */     if ((localbcm instanceof bde))
/*  99:    */     {
/* 100:125 */       vs.a(paramaqu, paramdt, (bde)localbcm);
/* 101:    */       
/* 102:127 */       paramaqu.e(paramdt, this);
/* 103:    */     }
/* 104:130 */     super.b(paramaqu, paramdt, parambec);
/* 105:    */   }
/* 106:    */   
/* 107:    */   public int b()
/* 108:    */   {
/* 109:135 */     return 3;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public boolean isOpaqueCube()
/* 113:    */   {
/* 114:140 */     return false;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public boolean c()
/* 118:    */   {
/* 119:145 */     return false;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/* 123:    */   {
/* 124:150 */     return true;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public static EnumDirection b(int paramInt)
/* 128:    */   {
/* 129:154 */     return EnumDirection.a(paramInt & 0x7);
/* 130:    */   }
/* 131:    */   
/* 132:    */   public static boolean f(int paramInt)
/* 133:    */   {
/* 134:158 */     return (paramInt & 0x8) != 8;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public boolean N()
/* 138:    */   {
/* 139:163 */     return true;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public int l(World paramaqu, BlockPosition paramdt)
/* 143:    */   {
/* 144:168 */     return aib.a(paramaqu.s(paramdt));
/* 145:    */   }
/* 146:    */   
/* 147:    */   public aql k()
/* 148:    */   {
/* 149:173 */     return aql.b;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public Block a(int paramInt)
/* 153:    */   {
/* 154:178 */     return instance().a(a, b(paramInt)).a(b, Boolean.valueOf(f(paramInt)));
/* 155:    */   }
/* 156:    */   
/* 157:    */   public int c(Block parambec)
/* 158:    */   {
/* 159:185 */     int i = 0;
/* 160:    */     
/* 161:187 */     i |= ((EnumDirection)parambec.getProperty(a)).a();
/* 162:189 */     if (!((Boolean)parambec.getProperty(b)).booleanValue()) {
/* 163:190 */       i |= 0x8;
/* 164:    */     }
/* 165:193 */     return i;
/* 166:    */   }
/* 167:    */   
/* 168:    */   protected bed e()
/* 169:    */   {
/* 170:198 */     return new bed(this, new bex[] { a, b });
/* 171:    */   }
/* 172:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     awx
 * JD-Core Version:    0.7.0.1
 */