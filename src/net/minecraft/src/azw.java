package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Map;
/*   5:    */ import java.util.Random;
/*   6:    */ 
/*   7:    */ public class azw
/*   8:    */   extends bbl
/*   9:    */ {
/*  10: 24 */   private static Map<World,List<azx>> b = Maps.newHashMap();
/*  11:    */   private final boolean M;
/*  12:    */   
/*  13:    */   private boolean a(World paramaqu, BlockPosition paramdt, boolean paramBoolean)
/*  14:    */   {
/*  15: 39 */     if (!b.containsKey(paramaqu)) {
/*  16: 40 */       b.put(paramaqu, Lists.<azx>newArrayList());
/*  17:    */     }
/*  18: 43 */     List<azx> localList = b.get(paramaqu);
/*  19: 44 */     if (paramBoolean) {
/*  20: 45 */       localList.add(new azx(paramdt, paramaqu.K()));
/*  21:    */     }
/*  22: 48 */     int i = 0;
/*  23: 49 */     for (int j = 0; j < localList.size(); j++)
/*  24:    */     {
/*  25: 50 */       azx localazx = (azx)localList.get(j);
/*  26: 51 */       if (localazx.a.equals(paramdt))
/*  27:    */       {
/*  28: 52 */         i++;
/*  29: 53 */         if (i >= 8) {
/*  30: 54 */           return true;
/*  31:    */         }
/*  32:    */       }
/*  33:    */     }
/*  34: 58 */     return false;
/*  35:    */   }
/*  36:    */   
/*  37:    */   protected azw(boolean paramBoolean)
/*  38:    */   {
/*  39: 62 */     this.M = paramBoolean;
/*  40: 63 */     a(true);
/*  41: 64 */     setCreativeTab(null);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public int a(World paramaqu)
/*  45:    */   {
/*  46: 69 */     return 2;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/*  50:    */   {
/*  51: 74 */     if (this.M) {
/*  52: 75 */       for (EnumDirection localej : EnumDirection.values()) {
/*  53: 76 */         paramaqu.c(paramdt.a(localej), this);
/*  54:    */       }
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/*  59:    */   {
/*  60: 83 */     if (this.M) {
/*  61: 84 */       for (EnumDirection localej : EnumDirection.values()) {
/*  62: 85 */         paramaqu.c(paramdt.a(localej), this);
/*  63:    */       }
/*  64:    */     }
/*  65:    */   }
/*  66:    */   
/*  67:    */   public int a(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/*  68:    */   {
/*  69: 92 */     if ((this.M) && (parambec.getProperty(a) != paramej)) {
/*  70: 93 */       return 15;
/*  71:    */     }
/*  72: 96 */     return 0;
/*  73:    */   }
/*  74:    */   
/*  75:    */   private boolean g(World paramaqu, BlockPosition paramdt, Block parambec)
/*  76:    */   {
/*  77:100 */     EnumDirection localej = ((EnumDirection)parambec.getProperty(a)).d();
/*  78:    */     
/*  79:102 */     return paramaqu.b(paramdt.a(localej), localej);
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom) {}
/*  83:    */   
/*  84:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  85:    */   {
/*  86:111 */     boolean bool = g(paramaqu, paramdt, parambec);
/*  87:    */     
/*  88:    */ 
/*  89:114 */     List<azx> localList = b.get(paramaqu);
/*  90:115 */     while ((localList != null) && (!localList.isEmpty()) && (paramaqu.K() - ((azx)localList.get(0)).b > 60L)) {
/*  91:116 */       localList.remove(0);
/*  92:    */     }
/*  93:119 */     if (this.M)
/*  94:    */     {
/*  95:120 */       if (bool)
/*  96:    */       {
/*  97:121 */         paramaqu.setBlock(paramdt, BlockList.aE.instance().a(a, parambec.getProperty(a)), 3);
/*  98:123 */         if (a(paramaqu, paramdt, true))
/*  99:    */         {
/* 100:124 */           paramaqu.a(paramdt.getX() + 0.5F, paramdt.getY() + 0.5F, paramdt.getZ() + 0.5F, "random.fizz", 0.5F, 2.6F + (paramaqu.rng.nextFloat() - paramaqu.rng.nextFloat()) * 0.8F);
/* 101:125 */           for (int i = 0; i < 5; i++)
/* 102:    */           {
/* 103:126 */             double d1 = paramdt.getX() + paramRandom.nextDouble() * 0.6D + 0.2D;
/* 104:127 */             double d2 = paramdt.getY() + paramRandom.nextDouble() * 0.6D + 0.2D;
/* 105:128 */             double d3 = paramdt.getZ() + paramRandom.nextDouble() * 0.6D + 0.2D;
/* 106:    */             
/* 107:130 */             paramaqu.a(EnumParticleEffect.l, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 108:    */           }
/* 109:133 */           paramaqu.a(paramdt, paramaqu.getBlock(paramdt).getProto(), 160);
/* 110:    */         }
/* 111:    */       }
/* 112:    */     }
/* 113:137 */     else if ((!bool) && 
/* 114:138 */       (!a(paramaqu, paramdt, false))) {
/* 115:139 */       paramaqu.setBlock(paramdt, BlockList.aF.instance().a(a, parambec.getProperty(a)), 3);
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/* 120:    */   {
/* 121:147 */     if (e(paramaqu, paramdt, parambec)) {
/* 122:148 */       return;
/* 123:    */     }
/* 124:151 */     if (this.M == g(paramaqu, paramdt, parambec)) {
/* 125:152 */       paramaqu.a(paramdt, this, a(paramaqu));
/* 126:    */     }
/* 127:    */   }
/* 128:    */   
/* 129:    */   public int b(IBlockAccess paramard, BlockPosition paramdt, Block parambec, EnumDirection paramej)
/* 130:    */   {
/* 131:158 */     if (paramej == EnumDirection.DOWN) {
/* 132:159 */       return a(paramard, paramdt, parambec, paramej);
/* 133:    */     }
/* 134:161 */     return 0;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 138:    */   {
/* 139:167 */     return Item.fromProtoBlock(BlockList.aF);
/* 140:    */   }
/* 141:    */   
/* 142:    */   public boolean protoBlock_g()
/* 143:    */   {
/* 144:172 */     return true;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/* 148:    */   {
/* 149:177 */     if (!this.M) {
/* 150:178 */       return;
/* 151:    */     }
/* 152:180 */     double d1 = paramdt.getX() + 0.5F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/* 153:181 */     double d2 = paramdt.getY() + 0.7F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/* 154:182 */     double d3 = paramdt.getZ() + 0.5F + (paramRandom.nextFloat() - 0.5F) * 0.2D;
/* 155:    */     
/* 156:184 */     EnumDirection localej1 = (EnumDirection)parambec.getProperty(a);
/* 157:185 */     if (localej1.k().c())
/* 158:    */     {
/* 159:186 */       EnumDirection localej2 = localej1.d();
/* 160:    */       
/* 161:188 */       double d4 = 0.2700000107288361D;
/* 162:    */       
/* 163:190 */       d1 += 0.2700000107288361D * localej2.g();
/* 164:191 */       d2 += 0.219999998807907D;
/* 165:192 */       d3 += 0.2700000107288361D * localej2.i();
/* 166:    */     }
/* 167:194 */     paramaqu.a(EnumParticleEffect.E, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/* 168:    */   }
/* 169:    */   
/* 170:    */   public Item b(World paramaqu, BlockPosition paramdt)
/* 171:    */   {
/* 172:199 */     return Item.fromProtoBlock(BlockList.aF);
/* 173:    */   }
/* 174:    */   
/* 175:    */   public boolean b(ProtoBlock paramatr)
/* 176:    */   {
/* 177:204 */     return (paramatr == BlockList.aE) || (paramatr == BlockList.aF);
/* 178:    */   }
/* 179:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azw
 * JD-Core Version:    0.7.0.1
 */