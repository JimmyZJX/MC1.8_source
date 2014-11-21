package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class auy
/*   6:    */   extends ati
/*   7:    */ {
/*   8: 27 */   public static final BlockDataEnum b = BlockDataEnum.getInstance("shape", EnumRailState.class, new auz());
/*   9: 36 */   public static final BlockDataBoolean M = BlockDataBoolean.getInstance("powered");
/*  10:    */   
/*  11:    */   public auy()
/*  12:    */   {
/*  13: 39 */     super(true);
/*  14: 40 */     j(this.L.b().a(M, Boolean.valueOf(false)).a(b, EnumRailState.a));
/*  15: 41 */     a(true);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public int a(World paramaqu)
/*  19:    */   {
/*  20: 46 */     return 20;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean protoBlock_g()
/*  24:    */   {
/*  25: 51 */     return true;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Entity paramwv)
/*  29:    */   {
/*  30: 56 */     if (paramaqu.isClient) {
/*  31: 57 */       return;
/*  32:    */     }
/*  33: 60 */     if (((Boolean)parambec.getProperty(M)).booleanValue()) {
/*  34: 61 */       return;
/*  35:    */     }
/*  36: 64 */     e(paramaqu, paramdt, parambec);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom) {}
/*  40:    */   
/*  41:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  42:    */   {
/*  43: 73 */     if ((paramaqu.isClient) || (!((Boolean)parambec.getProperty(M)).booleanValue())) {
/*  44: 74 */       return;
/*  45:    */     }
/*  46: 77 */     e(paramaqu, paramdt, parambec);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public int a(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/*  50:    */   {
/*  51: 82 */     return ((Boolean)parambec.getProperty(M)).booleanValue() ? 15 : 0;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public int b(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/*  55:    */   {
/*  56: 87 */     if (!((Boolean)parambec.getProperty(M)).booleanValue()) {
/*  57: 88 */       return 0;
/*  58:    */     }
/*  59: 90 */     return paramej == EnumDirection.UP ? 15 : 0;
/*  60:    */   }
/*  61:    */   
/*  62:    */   private void e(World paramaqu, BlockPosition paramdt, Block parambec)
/*  63:    */   {
/*  64: 94 */     boolean bool = ((Boolean)parambec.getProperty(M)).booleanValue();
/*  65: 95 */     int i = 0;
/*  66:    */     
/*  67: 97 */     List localList = a(paramaqu, paramdt, adx.class, new Predicate[0]);
/*  68: 98 */     if (!localList.isEmpty()) {
/*  69: 99 */       i = 1;
/*  70:    */     }
/*  71:102 */     if ((i != 0) && (!bool))
/*  72:    */     {
/*  73:103 */       paramaqu.setBlock(paramdt, parambec.a(M, Boolean.valueOf(true)), 3);
/*  74:104 */       paramaqu.c(paramdt, this);
/*  75:105 */       paramaqu.c(paramdt.down(), this);
/*  76:106 */       paramaqu.b(paramdt, paramdt);
/*  77:    */     }
/*  78:109 */     if ((i == 0) && (bool))
/*  79:    */     {
/*  80:110 */       paramaqu.setBlock(paramdt, parambec.a(M, Boolean.valueOf(false)), 3);
/*  81:111 */       paramaqu.c(paramdt, this);
/*  82:112 */       paramaqu.c(paramdt.down(), this);
/*  83:113 */       paramaqu.b(paramdt, paramdt);
/*  84:    */     }
/*  85:116 */     if (i != 0) {
/*  86:117 */       paramaqu.a(paramdt, this, a(paramaqu));
/*  87:    */     }
/*  88:120 */     paramaqu.e(paramdt, this);
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/*  92:    */   {
/*  93:125 */     super.c(paramaqu, paramdt, parambec);
/*  94:126 */     e(paramaqu, paramdt, parambec);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public IBlockData l()
/*  98:    */   {
/*  99:131 */     return b;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public boolean N()
/* 103:    */   {
/* 104:136 */     return true;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public int l(World paramaqu, BlockPosition paramdt)
/* 108:    */   {
/* 109:141 */     if (((Boolean)paramaqu.getBlock(paramdt).getProperty(M)).booleanValue())
/* 110:    */     {
/* 111:142 */       List localList1 = a(paramaqu, paramdt, aeb.class, new Predicate[0]);
/* 112:143 */       if (!localList1.isEmpty()) {
/* 113:144 */         return ((aeb)localList1.get(0)).j().j();
/* 114:    */       }
/* 115:147 */       List localList2 = a(paramaqu, paramdt, adx.class, new Predicate[] { xe.c });
/* 116:148 */       if (!localList2.isEmpty()) {
/* 117:149 */         return aib.b((vq)localList2.get(0));
/* 118:    */       }
/* 119:    */     }
/* 120:153 */     return 0;
/* 121:    */   }
/* 122:    */   
/* 123:    */   protected List a(World paramaqu, BlockPosition paramdt, Class paramClass, Predicate... paramVarArgs)
/* 124:    */   {
/* 125:157 */     AABB localbrt = a(paramdt);
/* 126:159 */     if (paramVarArgs.length != 1) {
/* 127:160 */       return paramaqu.getEntityList(paramClass, localbrt);
/* 128:    */     }
/* 129:162 */     return paramaqu.a(paramClass, localbrt, paramVarArgs[0]);
/* 130:    */   }
/* 131:    */   
/* 132:    */   private AABB a(BlockPosition paramdt)
/* 133:    */   {
/* 134:166 */     float f = 0.2F;
/* 135:    */     
/* 136:168 */     return new AABB(paramdt.getX() + 0.2F, paramdt.getY(), paramdt.getZ() + 0.2F, paramdt.getX() + 1 - 0.2F, paramdt.getY() + 1 - 0.2F, paramdt.getZ() + 1 - 0.2F);
/* 137:    */   }
/* 138:    */   
/* 139:    */   public Block a(int paramInt)
/* 140:    */   {
/* 141:173 */     return instance().a(b, EnumRailState.a(paramInt & 0x7)).a(M, Boolean.valueOf((paramInt & 0x8) > 0));
/* 142:    */   }
/* 143:    */   
/* 144:    */   public int c(Block parambec)
/* 145:    */   {
/* 146:180 */     int i = 0;
/* 147:    */     
/* 148:182 */     i |= ((EnumRailState)parambec.getProperty(b)).a();
/* 149:184 */     if (((Boolean)parambec.getProperty(M)).booleanValue()) {
/* 150:185 */       i |= 0x8;
/* 151:    */     }
/* 152:188 */     return i;
/* 153:    */   }
/* 154:    */   
/* 155:    */   protected bed e()
/* 156:    */   {
/* 157:193 */     return new bed(this, new IBlockData[] { b, M });
/* 158:    */   }
/* 159:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     auy
 * JD-Core Version:    0.7.0.1
 */