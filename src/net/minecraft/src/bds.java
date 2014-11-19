package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bds
/*   5:    */   extends ProtoBlock
/*   6:    */ {
/*   7: 26 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing");
/*   8: 27 */   public static final BlockDataEnum b = BlockDataEnum.getInstance("type", bdu.class);
/*   9: 28 */   public static final BlockDataBoolean M = BlockDataBoolean.a("short");
/*  10:    */   
/*  11:    */   public bds()
/*  12:    */   {
/*  13: 34 */     super(Material.H);
/*  14: 35 */     j(this.L.b().a(a, EnumDirection.NORTH).a(b, bdu.a).a(M, Boolean.valueOf(false)));
/*  15: 36 */     a(i);
/*  16: 37 */     c(0.5F);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd)
/*  20:    */   {
/*  21: 42 */     if (paramahd.by.d)
/*  22:    */     {
/*  23: 43 */       EnumDirection localej = (EnumDirection)parambec.getProperty(a);
/*  24: 44 */       if (localej != null)
/*  25:    */       {
/*  26: 45 */         BlockPosition localdt = paramdt.a(localej.d());
/*  27: 46 */         ProtoBlock localatr = paramaqu.getBlock(localdt).getProto();
/*  28: 47 */         if ((localatr == BlockList.J) || (localatr == BlockList.F)) {
/*  29: 48 */           paramaqu.g(localdt);
/*  30:    */         }
/*  31:    */       }
/*  32:    */     }
/*  33: 52 */     super.a(paramaqu, paramdt, parambec, paramahd);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/*  37:    */   {
/*  38: 57 */     super.b(paramaqu, paramdt, parambec);
/*  39: 58 */     EnumDirection localej = ((EnumDirection)parambec.getProperty(a)).d();
/*  40: 59 */     paramdt = paramdt.a(localej);
/*  41:    */     
/*  42: 61 */     Block localbec = paramaqu.getBlock(paramdt);
/*  43: 62 */     if (((localbec.getProto() == BlockList.J) || (localbec.getProto() == BlockList.F)) && 
/*  44: 63 */       (((Boolean)localbec.getProperty(bdq.b)).booleanValue()))
/*  45:    */     {
/*  46: 64 */       localbec.getProto().b(paramaqu, paramdt, localbec, 0);
/*  47: 65 */       paramaqu.g(paramdt);
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   public boolean c()
/*  52:    */   {
/*  53: 72 */     return false;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean isOpaqueCube()
/*  57:    */   {
/*  58: 77 */     return false;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  62:    */   {
/*  63: 82 */     return false;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public boolean a(World paramaqu, BlockPosition paramdt, EnumDirection paramej)
/*  67:    */   {
/*  68: 87 */     return false;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public int a(Random paramRandom)
/*  72:    */   {
/*  73: 92 */     return 0;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, AABB parambrt, List<AABB> paramList, Entity paramwv)
/*  77:    */   {
/*  78: 97 */     d(parambec);
/*  79: 98 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  80:    */     
/*  81:100 */     e(parambec);
/*  82:101 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  83:    */     
/*  84:103 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  85:    */   }
/*  86:    */   
/*  87:    */   private void e(Block parambec)
/*  88:    */   {
/*  89:107 */     float f1 = 0.25F;
/*  90:108 */     float f2 = 0.375F;
/*  91:109 */     float f3 = 0.625F;
/*  92:110 */     float f4 = 0.25F;
/*  93:111 */     float f5 = 0.75F;
/*  94:113 */     switch (bdt.a[((EnumDirection)parambec.getProperty(a)).ordinal()])
/*  95:    */     {
/*  96:    */     case 1: 
/*  97:115 */       a(0.375F, 0.25F, 0.375F, 0.625F, 1.0F, 0.625F);
/*  98:116 */       break;
/*  99:    */     case 2: 
/* 100:118 */       a(0.375F, 0.0F, 0.375F, 0.625F, 0.75F, 0.625F);
/* 101:119 */       break;
/* 102:    */     case 3: 
/* 103:121 */       a(0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 1.0F);
/* 104:122 */       break;
/* 105:    */     case 4: 
/* 106:124 */       a(0.25F, 0.375F, 0.0F, 0.75F, 0.625F, 0.75F);
/* 107:125 */       break;
/* 108:    */     case 5: 
/* 109:127 */       a(0.375F, 0.25F, 0.25F, 0.625F, 0.75F, 1.0F);
/* 110:128 */       break;
/* 111:    */     case 6: 
/* 112:130 */       a(0.0F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
/* 113:    */     }
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/* 117:    */   {
/* 118:137 */     d(paramard.getBlock(paramdt));
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void d(Block parambec)
/* 122:    */   {
/* 123:141 */     float f = 0.25F;
/* 124:142 */     EnumDirection localej = (EnumDirection)parambec.getProperty(a);
/* 125:143 */     if (localej == null) {
/* 126:144 */       return;
/* 127:    */     }
/* 128:147 */     switch (bdt.a[localej.ordinal()])
/* 129:    */     {
/* 130:    */     case 1: 
/* 131:149 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
/* 132:150 */       break;
/* 133:    */     case 2: 
/* 134:152 */       a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 135:153 */       break;
/* 136:    */     case 3: 
/* 137:155 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
/* 138:156 */       break;
/* 139:    */     case 4: 
/* 140:158 */       a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
/* 141:159 */       break;
/* 142:    */     case 5: 
/* 143:161 */       a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
/* 144:162 */       break;
/* 145:    */     case 6: 
/* 146:164 */       a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 147:    */     }
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/* 151:    */   {
/* 152:171 */     EnumDirection localej = (EnumDirection)parambec.getProperty(a);
/* 153:172 */     BlockPosition localdt = paramdt.a(localej.d());
/* 154:173 */     Block localbec = paramaqu.getBlock(localdt);
/* 155:174 */     if ((localbec.getProto() != BlockList.J) && (localbec.getProto() != BlockList.F)) {
/* 156:175 */       paramaqu.g(paramdt);
/* 157:    */     } else {
/* 158:177 */       localbec.getProto().a(paramaqu, localdt, localbec, paramatr);
/* 159:    */     }
/* 160:    */   }
/* 161:    */   
/* 162:    */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/* 163:    */   {
/* 164:183 */     return true;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public static EnumDirection b(int paramInt)
/* 168:    */   {
/* 169:188 */     int i = paramInt & 0x7;
/* 170:189 */     if (i > 5) {
/* 171:190 */       return null;
/* 172:    */     }
/* 173:192 */     return EnumDirection.a(i);
/* 174:    */   }
/* 175:    */   
/* 176:    */   public Item b(World paramaqu, BlockPosition paramdt)
/* 177:    */   {
/* 178:197 */     if (paramaqu.getBlock(paramdt).getProperty(b) == bdu.b) {
/* 179:198 */       return Item.fromProtoBlock(BlockList.F);
/* 180:    */     }
/* 181:200 */     return Item.fromProtoBlock(BlockList.J);
/* 182:    */   }
/* 183:    */   
/* 184:    */   public Block a(int paramInt)
/* 185:    */   {
/* 186:205 */     return instance().a(a, b(paramInt)).a(b, (paramInt & 0x8) > 0 ? bdu.b : bdu.a);
/* 187:    */   }
/* 188:    */   
/* 189:    */   public int c(Block parambec)
/* 190:    */   {
/* 191:212 */     int i = 0;
/* 192:    */     
/* 193:214 */     i |= ((EnumDirection)parambec.getProperty(a)).a();
/* 194:216 */     if (parambec.getProperty(b) == bdu.b) {
/* 195:217 */       i |= 0x8;
/* 196:    */     }
/* 197:220 */     return i;
/* 198:    */   }
/* 199:    */   
/* 200:    */   protected bed e()
/* 201:    */   {
/* 202:225 */     return new bed(this, new IBlockData[] { a, b, M });
/* 203:    */   }
/* 204:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bds
 * JD-Core Version:    0.7.0.1
 */