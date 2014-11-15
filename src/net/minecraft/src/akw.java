package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class akw
/*   5:    */   extends Item
/*   6:    */ {
/*   7: 17 */   public static final int[] a = { 1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320 };
/*   8:    */   
/*   9:    */   public akw()
/*  10:    */   {
/*  11: 22 */     a(true);
/*  12: 23 */     setMaxDamage(0);
/*  13: 24 */     setTabToDisplayOn(CreativeTabs.tabMaterials);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public String e_(ItemStack paramamj)
/*  17:    */   {
/*  18: 29 */     int i = paramamj.getDamage2();
/*  19: 30 */     return super.a() + "." + EnumDyeColor.fromIndex(i).d();
/*  20:    */   }
/*  21:    */   
/*  22:    */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World world, BlockPosition pos, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  23:    */   {
/*  24: 35 */     if (!paramahd.a(pos.a(paramej), paramej, paramamj)) {
/*  25: 36 */       return false;
/*  26:    */     }
/*  27: 39 */     EnumDyeColor localakv = EnumDyeColor.fromIndex(paramamj.getDamage2());
/*  28: 40 */     if (localakv == EnumDyeColor.WHITE)
/*  29:    */     {
/*  30: 43 */       if (a(paramamj, world, pos))
/*  31:    */       {
/*  32: 44 */         if (!world.isClient) {
/*  33: 45 */           world.playLevelEvent(2005, pos, 0);
/*  34:    */         }
/*  35: 47 */         return true;
/*  36:    */       }
/*  37:    */     }
/*  38: 49 */     else if (localakv == EnumDyeColor.BROWN)
/*  39:    */     {
/*  40: 52 */       Block localbec1 = world.getBlock(pos);
/*  41: 53 */       ProtoBlock localatr = localbec1.getProto();
/*  42: 55 */       if ((localatr == BlockList.log) && (localbec1.getProperty(ayw.a) == EnumWoodVariant.JUNGLE))
/*  43:    */       {
/*  44: 56 */         if (paramej == EnumDirection.DOWN) {
/*  45: 57 */           return false;
/*  46:    */         }
/*  47: 59 */         if (paramej == EnumDirection.UP) {
/*  48: 60 */           return false;
/*  49:    */         }
/*  50: 62 */         pos = pos.a(paramej);
/*  51: 64 */         if (world.d(pos))
/*  52:    */         {
/*  53: 65 */           Block localbec2 = BlockList.bN.a(world, pos, paramej, paramFloat1, paramFloat2, paramFloat3, 0, paramahd);
/*  54: 66 */           world.setBlock(pos, localbec2, 2);
/*  55: 67 */           if (!paramahd.by.d) {
/*  56: 68 */             paramamj.stackSize -= 1;
/*  57:    */           }
/*  58:    */         }
/*  59: 71 */         return true;
/*  60:    */       }
/*  61:    */     }
/*  62: 75 */     return false;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public static boolean a(ItemStack paramamj, World paramaqu, BlockPosition paramdt)
/*  66:    */   {
/*  67: 79 */     Block localbec = paramaqu.getBlock(paramdt);
/*  68: 81 */     if ((localbec.getProto() instanceof atz))
/*  69:    */     {
/*  70: 82 */       atz localatz = (atz)localbec.getProto();
/*  71: 84 */       if (localatz.a(paramaqu, paramdt, localbec, paramaqu.isClient))
/*  72:    */       {
/*  73: 85 */         if (!paramaqu.isClient)
/*  74:    */         {
/*  75: 86 */           if (localatz.a(paramaqu, paramaqu.rng, paramdt, localbec)) {
/*  76: 87 */             localatz.b(paramaqu, paramaqu.rng, paramdt, localbec);
/*  77:    */           }
/*  78: 89 */           paramamj.stackSize -= 1;
/*  79:    */         }
/*  80: 91 */         return true;
/*  81:    */       }
/*  82:    */     }
/*  83: 94 */     return false;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public static void a(World world, BlockPosition pos, int paramInt)
/*  87:    */   {
/*  88: 98 */     if (paramInt == 0) {
/*  89: 99 */       paramInt = 15;
/*  90:    */     }
/*  91:102 */     ProtoBlock localatr = world.getBlock(pos).getProto();
/*  92:103 */     if (localatr.getMaterial() == Material.air) {
/*  93:104 */       return;
/*  94:    */     }
/*  95:106 */     localatr.a(world, pos);
/*  96:108 */     for (int i = 0; i < paramInt; i++)
/*  97:    */     {
/*  98:109 */       double d1 = random.nextGaussian() * 0.02D;
/*  99:110 */       double d2 = random.nextGaussian() * 0.02D;
/* 100:111 */       double d3 = random.nextGaussian() * 0.02D;
/* 101:112 */       world.a(ew.VILLAGER_HAPPY, pos.getX() + random.nextFloat(), pos.getY() + random.nextFloat() * localatr.C(), pos.getZ() + random.nextFloat(), d1, d2, d3, new int[0]);
/* 102:    */     }
/* 103:    */   }
/* 104:    */   
/* 105:    */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, EntityLiving paramxm)
/* 106:    */   {
/* 107:118 */     if ((paramxm instanceof EntitySheep))
/* 108:    */     {
/* 109:119 */       EntitySheep localacl = (EntitySheep)paramxm;
/* 110:120 */       EnumDyeColor localakv = EnumDyeColor.fromIndex(paramamj.getDamage2());
/* 111:121 */       if ((!localacl.ck()) && (localacl.cj() != localakv))
/* 112:    */       {
/* 113:122 */         localacl.b(localakv);
/* 114:123 */         paramamj.stackSize -= 1;
/* 115:    */       }
/* 116:126 */       return true;
/* 117:    */     }
/* 118:128 */     return false;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/* 122:    */   {
/* 123:133 */     for (int i = 0; i < 16; i++) {
/* 124:134 */       paramList.add(new ItemStack(paramalq, 1, i));
/* 125:    */     }
/* 126:    */   }
/* 127:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     akw
 * JD-Core Version:    0.7.0.1
 */