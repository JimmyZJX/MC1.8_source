package net.minecraft.src;
/*   1:    */ public class azc
/*   2:    */   extends ati
/*   3:    */ {
/*   4: 15 */   public static final BlockDataEnum b = BlockDataEnum.getInstance("shape", EnumRailState.class, new azd());
/*   5: 24 */   public static final BlockDataBoolean M = BlockDataBoolean.getInstance("powered");
/*   6:    */   
/*   7:    */   protected azc()
/*   8:    */   {
/*   9: 27 */     super(true);
/*  10: 28 */     j(this.L.b().setData(b, EnumRailState.a).setData(M, Boolean.valueOf(false)));
/*  11:    */   }
/*  12:    */   
/*  13:    */   protected boolean a(World paramaqu, BlockPosition paramdt, Block parambec, boolean paramBoolean, int paramInt)
/*  14:    */   {
/*  15: 32 */     if (paramInt >= 8) {
/*  16: 33 */       return false;
/*  17:    */     }
/*  18: 36 */     int i = paramdt.getX();
/*  19: 37 */     int j = paramdt.getY();
/*  20: 38 */     int k = paramdt.getZ();
/*  21:    */     
/*  22: 40 */     int m = 1;
/*  23: 41 */     EnumRailState localatl = (EnumRailState)parambec.getData(b);
/*  24: 42 */     switch (aze.a[localatl.ordinal()])
/*  25:    */     {
/*  26:    */     case 1: 
/*  27: 44 */       if (paramBoolean) {
/*  28: 45 */         k++;
/*  29:    */       } else {
/*  30: 47 */         k--;
/*  31:    */       }
/*  32: 49 */       break;
/*  33:    */     case 2: 
/*  34: 51 */       if (paramBoolean) {
/*  35: 52 */         i--;
/*  36:    */       } else {
/*  37: 54 */         i++;
/*  38:    */       }
/*  39: 56 */       break;
/*  40:    */     case 3: 
/*  41: 58 */       if (paramBoolean)
/*  42:    */       {
/*  43: 59 */         i--;
/*  44:    */       }
/*  45:    */       else
/*  46:    */       {
/*  47: 61 */         i++;
/*  48: 62 */         j++;
/*  49: 63 */         m = 0;
/*  50:    */       }
/*  51: 65 */       localatl = EnumRailState.b;
/*  52: 66 */       break;
/*  53:    */     case 4: 
/*  54: 68 */       if (paramBoolean)
/*  55:    */       {
/*  56: 69 */         i--;
/*  57: 70 */         j++;
/*  58: 71 */         m = 0;
/*  59:    */       }
/*  60:    */       else
/*  61:    */       {
/*  62: 73 */         i++;
/*  63:    */       }
/*  64: 75 */       localatl = EnumRailState.b;
/*  65: 76 */       break;
/*  66:    */     case 5: 
/*  67: 78 */       if (paramBoolean)
/*  68:    */       {
/*  69: 79 */         k++;
/*  70:    */       }
/*  71:    */       else
/*  72:    */       {
/*  73: 81 */         k--;
/*  74: 82 */         j++;
/*  75: 83 */         m = 0;
/*  76:    */       }
/*  77: 85 */       localatl = EnumRailState.a;
/*  78: 86 */       break;
/*  79:    */     case 6: 
/*  80: 88 */       if (paramBoolean)
/*  81:    */       {
/*  82: 89 */         k++;
/*  83: 90 */         j++;
/*  84: 91 */         m = 0;
/*  85:    */       }
/*  86:    */       else
/*  87:    */       {
/*  88: 93 */         k--;
/*  89:    */       }
/*  90: 95 */       localatl = EnumRailState.a;
/*  91:    */     }
/*  92: 99 */     if (a(paramaqu, new BlockPosition(i, j, k), paramBoolean, paramInt, localatl)) {
/*  93:100 */       return true;
/*  94:    */     }
/*  95:102 */     if ((m != 0) && (a(paramaqu, new BlockPosition(i, j - 1, k), paramBoolean, paramInt, localatl))) {
/*  96:103 */       return true;
/*  97:    */     }
/*  98:105 */     return false;
/*  99:    */   }
/* 100:    */   
/* 101:    */   protected boolean a(World paramaqu, BlockPosition paramdt, boolean paramBoolean, int paramInt, EnumRailState paramatl)
/* 102:    */   {
/* 103:109 */     Block localbec = paramaqu.getBlock(paramdt);
/* 104:111 */     if (localbec.getType() != this) {
/* 105:112 */       return false;
/* 106:    */     }
/* 107:115 */     EnumRailState localatl = (EnumRailState)localbec.getData(b);
/* 108:116 */     if ((paramatl == EnumRailState.b) && ((localatl == EnumRailState.a) || (localatl == EnumRailState.e) || (localatl == EnumRailState.f))) {
/* 109:117 */       return false;
/* 110:    */     }
/* 111:119 */     if ((paramatl == EnumRailState.a) && ((localatl == EnumRailState.b) || (localatl == EnumRailState.c) || (localatl == EnumRailState.d))) {
/* 112:120 */       return false;
/* 113:    */     }
/* 114:123 */     if (((Boolean)localbec.getData(M)).booleanValue())
/* 115:    */     {
/* 116:124 */       if (paramaqu.z(paramdt)) {
/* 117:125 */         return true;
/* 118:    */       }
/* 119:127 */       return a(paramaqu, paramdt, localbec, paramBoolean, paramInt + 1);
/* 120:    */     }
/* 121:130 */     return false;
/* 122:    */   }
/* 123:    */   
/* 124:    */   protected void b(World paramaqu, BlockPosition paramdt, Block parambec, BlockType paramatr)
/* 125:    */   {
/* 126:135 */     boolean bool1 = ((Boolean)parambec.getData(M)).booleanValue();
/* 127:136 */     boolean bool2 = (paramaqu.z(paramdt)) || (a(paramaqu, paramdt, parambec, true, 0)) || (a(paramaqu, paramdt, parambec, false, 0));
/* 128:138 */     if (bool2 != bool1)
/* 129:    */     {
/* 130:139 */       paramaqu.setBlock(paramdt, parambec.setData(M, Boolean.valueOf(bool2)), 3);
/* 131:    */       
/* 132:    */ 
/* 133:    */ 
/* 134:    */ 
/* 135:144 */       paramaqu.c(paramdt.down(), this);
/* 136:145 */       if (((EnumRailState)parambec.getData(b)).c()) {
/* 137:146 */         paramaqu.c(paramdt.up(), this);
/* 138:    */       }
/* 139:    */     }
/* 140:    */   }
/* 141:    */   
/* 142:    */   public IBlockData l()
/* 143:    */   {
/* 144:153 */     return b;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public Block instance(int paramInt)
/* 148:    */   {
/* 149:158 */     return instance().setData(b, EnumRailState.a(paramInt & 0x7)).setData(M, Boolean.valueOf((paramInt & 0x8) > 0));
/* 150:    */   }
/* 151:    */   
/* 152:    */   public int c(Block parambec)
/* 153:    */   {
/* 154:165 */     int i = 0;
/* 155:    */     
/* 156:167 */     i |= ((EnumRailState)parambec.getData(b)).a();
/* 157:169 */     if (((Boolean)parambec.getData(M)).booleanValue()) {
/* 158:170 */       i |= 0x8;
/* 159:    */     }
/* 160:173 */     return i;
/* 161:    */   }
/* 162:    */   
/* 163:    */   protected bed e()
/* 164:    */   {
/* 165:178 */     return new bed(this, new IBlockData[] { b, M });
/* 166:    */   }
/* 167:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azc
 * JD-Core Version:    0.7.0.1
 */