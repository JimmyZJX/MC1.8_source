package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class baj
/*   5:    */   extends atg
/*   6:    */ {
/*   7: 36 */   public static final BlockDataDirection a = BlockDataDirection.getInstance("facing");
/*   8: 37 */   public static final BlockDataBoolean b = BlockDataBoolean.getInstance("nodrop");
/*   9: 39 */   private static final Predicate M = new bak();
/*  10:    */   private bek N;
/*  11:    */   private bek O;
/*  12:    */   
/*  13:    */   protected baj()
/*  14:    */   {
/*  15: 50 */     super(Material.q);
/*  16: 51 */     j(this.L.b().setData(a, EnumDirection.NORTH).setData(b, Boolean.valueOf(false)));
/*  17: 52 */     a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public boolean c()
/*  21:    */   {
/*  22: 57 */     return false;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public boolean isOpaqueCube()
/*  26:    */   {
/*  27: 62 */     return false;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void a(IBlockAccess paramard, BlockPosition paramdt)
/*  31:    */   {
/*  32: 67 */     switch (bal.a[((EnumDirection)paramard.getBlock(paramdt).getProperty(a)).ordinal()])
/*  33:    */     {
/*  34:    */     case 1: 
/*  35:    */     default: 
/*  36: 70 */       a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
/*  37: 71 */       break;
/*  38:    */     case 2: 
/*  39: 73 */       a(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
/*  40: 74 */       break;
/*  41:    */     case 3: 
/*  42: 76 */       a(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
/*  43: 77 */       break;
/*  44:    */     case 4: 
/*  45: 79 */       a(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);
/*  46: 80 */       break;
/*  47:    */     case 5: 
/*  48: 82 */       a(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
/*  49:    */     }
/*  50:    */   }
/*  51:    */   
/*  52:    */   public AABB a(World paramaqu, BlockPosition paramdt, Block parambec)
/*  53:    */   {
/*  54: 90 */     a(paramaqu, paramdt);
/*  55: 91 */     return super.a(paramaqu, paramdt, parambec);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/*  59:    */   {
/*  60: 96 */     return instance().setData(a, paramxm.aO()).setData(b, Boolean.valueOf(false));
/*  61:    */   }
/*  62:    */   
/*  63:    */   public bcm a(World paramaqu, int paramInt)
/*  64:    */   {
/*  65:101 */     return new bdm();
/*  66:    */   }
/*  67:    */   
/*  68:    */   public Item b(World paramaqu, BlockPosition paramdt)
/*  69:    */   {
/*  70:106 */     return ItemList.skull;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public int j(World paramaqu, BlockPosition paramdt)
/*  74:    */   {
/*  75:111 */     bcm localbcm = paramaqu.s(paramdt);
/*  76:112 */     if ((localbcm instanceof bdm)) {
/*  77:113 */       return ((bdm)localbcm).c();
/*  78:    */     }
/*  79:115 */     return super.j(paramaqu, paramdt);
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, float paramFloat, int paramInt) {}
/*  83:    */   
/*  84:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd)
/*  85:    */   {
/*  86:126 */     if (paramahd.by.d)
/*  87:    */     {
/*  88:128 */       parambec = parambec.setData(b, Boolean.valueOf(true));
/*  89:129 */       paramaqu.setBlock(paramdt, parambec, 4);
/*  90:    */     }
/*  91:131 */     super.a(paramaqu, paramdt, parambec, paramahd);
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/*  95:    */   {
/*  96:136 */     if (paramaqu.isClient) {
/*  97:137 */       return;
/*  98:    */     }
/*  99:140 */     if (!((Boolean)parambec.getProperty(b)).booleanValue())
/* 100:    */     {
/* 101:141 */       bcm localbcm = paramaqu.s(paramdt);
/* 102:142 */       if ((localbcm instanceof bdm))
/* 103:    */       {
/* 104:143 */         bdm localbdm = (bdm)localbcm;
/* 105:144 */         ItemStack localamj = new ItemStack(ItemList.skull, 1, j(paramaqu, paramdt));
/* 106:146 */         if ((localbdm.c() == 3) && (localbdm.b() != null))
/* 107:    */         {
/* 108:147 */           localamj.setTagCompound(new NBTTagCompound());
/* 109:    */           
/* 110:149 */           NBTTagCompound localfn = new NBTTagCompound();
/* 111:    */           
/* 112:151 */           ga.a(localfn, localbdm.b());
/* 113:152 */           localamj.getTagCompound().setNBT("SkullOwner", localfn);
/* 114:    */         }
/* 115:155 */         a(paramaqu, paramdt, localamj);
/* 116:    */       }
/* 117:    */     }
/* 118:158 */     super.b(paramaqu, paramdt, parambec);
/* 119:    */   }
/* 120:    */   
/* 121:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/* 122:    */   {
/* 123:164 */     return ItemList.skull;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean b(World paramaqu, BlockPosition paramdt, ItemStack paramamj)
/* 127:    */   {
/* 128:168 */     if ((paramamj.getDamage2() == 1) && (paramdt.getY() >= 2) && (paramaqu.getDifficulty() != EnumDifficulty.PEACEFUL) && (!paramaqu.isClient)) {
/* 129:169 */       return j().a(paramaqu, paramdt) != null;
/* 130:    */     }
/* 131:172 */     return false;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void a(World paramaqu, BlockPosition paramdt, bdm parambdm)
/* 135:    */   {
/* 136:176 */     if ((parambdm.c() != 1) || (paramdt.getY() < 2) || (paramaqu.getDifficulty() == EnumDifficulty.PEACEFUL) || (paramaqu.isClient)) {
/* 137:177 */       return;
/* 138:    */     }
/* 139:180 */     bek localbek = l();
/* 140:181 */     bem localbem = localbek.a(paramaqu, paramdt);
/* 141:182 */     if (localbem == null) {
/* 142:183 */       return;
/* 143:    */     }
/* 144:186 */     for (int i = 0; i < 3; i++)
/* 145:    */     {
/* 146:187 */       bei localbei1 = localbem.a(i, 0, 0);
/* 147:188 */       paramaqu.setBlock(localbei1.d(), localbei1.a().setData(b, Boolean.valueOf(true)), 2);
/* 148:    */     }
/* 149:190 */     for (int i = 0; i < localbek.c(); i++) {
/* 150:191 */       for (int j = 0; j < localbek.b(); j++)
/* 151:    */       {
/* 152:192 */         bei localObject = localbem.a(i, j, 0);
/* 153:193 */         paramaqu.setBlock(((bei)localObject).d(), BlockList.air.instance(), 2);
/* 154:    */       }
/* 155:    */     }
/* 156:197 */     BlockPosition localdt = localbem.a(1, 0, 0).d();
/* 157:    */     
/* 158:199 */     EntityWither localadf = new EntityWither(paramaqu);
/* 159:200 */     Object localObject = localbem.a(1, 2, 0).d();
/* 160:201 */     localadf.setPositionAndAngles(((BlockPosition)localObject).getX() + 0.5D, ((BlockPosition)localObject).getY() + 0.55D, ((BlockPosition)localObject).getZ() + 0.5D, localbem.b().k() == EnumAxis.X ? 0.0F : 90.0F, 0.0F);
/* 161:202 */     localadf.aG = (localbem.b().k() == EnumAxis.X ? 0.0F : 90.0F);
/* 162:203 */     localadf.n();
/* 163:205 */     for (EntityPlayer localahd : paramaqu.getEntityList(EntityPlayer.class, localadf.getAABB().expand(50.0D, 50.0D, 50.0D))) {
/* 164:206 */       localahd.b(AchievementList.I);
/* 165:    */     }
/* 166:209 */     paramaqu.spawnEntity(localadf);
/* 167:211 */     for (int k = 0; k < 120; k++) {
/* 168:212 */       paramaqu.a(EnumParticleEffect.F, localdt.getX() + paramaqu.rng.nextDouble(), localdt.getY() - 2 + paramaqu.rng.nextDouble() * 3.9D, localdt.getZ() + paramaqu.rng.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
/* 169:    */     }
/* 170:215 */     for (int k = 0; k < localbek.c(); k++) {
/* 171:216 */       for (int m = 0; m < localbek.b(); m++)
/* 172:    */       {
/* 173:217 */         bei localbei2 = localbem.a(k, m, 0);
/* 174:218 */         paramaqu.b(localbei2.d(), BlockList.air);
/* 175:    */       }
/* 176:    */     }
/* 177:    */   }
/* 178:    */   
/* 179:    */   public Block instance(int paramInt)
/* 180:    */   {
/* 181:225 */     return instance().setData(a, EnumDirection.a(paramInt & 0x7)).setData(b, Boolean.valueOf((paramInt & 0x8) > 0));
/* 182:    */   }
/* 183:    */   
/* 184:    */   public int c(Block parambec)
/* 185:    */   {
/* 186:232 */     int i = 0;
/* 187:    */     
/* 188:234 */     i |= ((EnumDirection)parambec.getProperty(a)).a();
/* 189:236 */     if (((Boolean)parambec.getProperty(b)).booleanValue()) {
/* 190:237 */       i |= 0x8;
/* 191:    */     }
/* 192:240 */     return i;
/* 193:    */   }
/* 194:    */   
/* 195:    */   protected bed e()
/* 196:    */   {
/* 197:245 */     return new bed(this, new IBlockData[] { a, b });
/* 198:    */   }
/* 199:    */   
/* 200:    */   protected bek j()
/* 201:    */   {
/* 202:249 */     if (this.N == null) {
/* 203:250 */       this.N = ben.a().a(new String[] { "   ", "###", "~#~" }).a('#', bei.a(beq.a(BlockList.soulSand))).a('~', bei.a(beq.a(BlockList.air))).b();
/* 204:    */     }
/* 205:261 */     return this.N;
/* 206:    */   }
/* 207:    */   
/* 208:    */   protected bek l()
/* 209:    */   {
/* 210:265 */     if (this.O == null) {
/* 211:266 */       this.O = ben.a().a(new String[] { "^^^", "###", "~#~" }).a('#', bei.a(beq.a(BlockList.soulSand))).a('^', M).a('~', bei.a(beq.a(BlockList.air))).b();
/* 212:    */     }
/* 213:278 */     return this.O;
/* 214:    */   }
/* 215:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     baj
 * JD-Core Version:    0.7.0.1
 */