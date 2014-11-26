package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Map;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class anl
/*   6:    */   extends Item
/*   7:    */ {
/*   8:    */   public anl()
/*   9:    */   {
/*  10: 30 */     a(true);
/*  11: 31 */     setTabToDisplayOn(CreativeTabs.tabMisc);
/*  12:    */   }
/*  13:    */   
/*  14:    */   public String a(ItemStack paramamj)
/*  15:    */   {
/*  16: 36 */     String str1 = ("" + fi.a(new StringBuilder().append(a()).append(".name").toString())).trim();
/*  17:    */     
/*  18: 38 */     String str2 = EntityList.b(paramamj.getDamage2());
/*  19: 39 */     if (str2 != null) {
/*  20: 40 */       str1 = str1 + " " + fi.a(new StringBuilder().append("entity.").append(str2).append(".name").toString());
/*  21:    */     }
/*  22: 43 */     return str1;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public int a(ItemStack paramamj, int paramInt)
/*  26:    */   {
/*  27: 48 */     xc localxc = (xc)EntityList.entityEggs.get(Integer.valueOf(paramamj.getDamage2()));
/*  28: 49 */     if (localxc != null)
/*  29:    */     {
/*  30: 50 */       if (paramInt == 0) {
/*  31: 51 */         return localxc.b;
/*  32:    */       }
/*  33: 53 */       return localxc.c;
/*  34:    */     }
/*  35: 55 */     return 16777215;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  39:    */   {
/*  40: 60 */     if (paramaqu.isClient) {
/*  41: 61 */       return true;
/*  42:    */     }
/*  43: 63 */     if (!paramahd.a(paramdt.offset(paramej), paramej, paramamj)) {
/*  44: 64 */       return false;
/*  45:    */     }
/*  46: 67 */     Block localbec = paramaqu.getBlock(paramdt);
/*  47: 68 */     if (localbec.getProto() == BlockList.mobSpawner)
/*  48:    */     {
/*  49: 69 */       bcm localbcm = paramaqu.s(paramdt);
/*  50: 70 */       if ((localbcm instanceof bdg))
/*  51:    */       {
/*  52: 71 */         aqi localaqi = ((bdg)localbcm).b();
/*  53: 72 */         localaqi.a(EntityList.b(paramamj.getDamage2()));
/*  54: 73 */         localbcm.o_();
/*  55: 74 */         paramaqu.h(paramdt);
/*  56: 75 */         if (!paramahd.by.d) {
/*  57: 76 */           paramamj.stackSize -= 1;
/*  58:    */         }
/*  59: 78 */         return true;
/*  60:    */       }
/*  61:    */     }
/*  62: 82 */     paramdt = paramdt.offset(paramej);
/*  63:    */     
/*  64: 84 */     double d = 0.0D;
/*  65: 85 */     if ((paramej == EnumDirection.UP) && ((localbec instanceof avv))) {
/*  66: 87 */       d = 0.5D;
/*  67:    */     }
/*  68: 90 */     Entity localwv = a(paramaqu, paramamj.getDamage2(), paramdt.getX() + 0.5D, paramdt.getY() + d, paramdt.getZ() + 0.5D);
/*  69: 91 */     if (localwv != null)
/*  70:    */     {
/*  71: 92 */       if (((localwv instanceof EntityLiving)) && (paramamj.s())) {
/*  72: 93 */         localwv.a(paramamj.q());
/*  73:    */       }
/*  74: 95 */       if (!paramahd.by.d) {
/*  75: 96 */         paramamj.stackSize -= 1;
/*  76:    */       }
/*  77:    */     }
/*  78:100 */     return true;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/*  82:    */   {
/*  83:105 */     if (paramaqu.isClient) {
/*  84:106 */       return paramamj;
/*  85:    */     }
/*  86:109 */     HitResult localbru = a(paramaqu, paramahd, true);
/*  87:110 */     if (localbru == null) {
/*  88:111 */       return paramamj;
/*  89:    */     }
/*  90:114 */     if (localbru.a == brv.BLOCK)
/*  91:    */     {
/*  92:115 */       BlockPosition localdt = localbru.a();
/*  93:117 */       if (!paramaqu.a(paramahd, localdt)) {
/*  94:118 */         return paramamj;
/*  95:    */       }
/*  96:120 */       if (!paramahd.a(localdt, localbru.b, paramamj)) {
/*  97:121 */         return paramamj;
/*  98:    */       }
/*  99:124 */       if ((paramaqu.getBlock(localdt).getProto() instanceof BlockLiquid))
/* 100:    */       {
/* 101:125 */         Entity localwv = a(paramaqu, paramamj.getDamage2(), localdt.getX() + 0.5D, localdt.getY() + 0.5D, localdt.getZ() + 0.5D);
/* 102:126 */         if (localwv != null)
/* 103:    */         {
/* 104:127 */           if (((localwv instanceof EntityLiving)) && (paramamj.s())) {
/* 105:128 */             ((EntityMob)localwv).a(paramamj.q());
/* 106:    */           }
/* 107:130 */           if (!paramahd.by.d) {
/* 108:131 */             paramamj.stackSize -= 1;
/* 109:    */           }
/* 110:133 */           paramahd.b(StatList.J[Item.b(this)]);
/* 111:    */         }
/* 112:    */       }
/* 113:    */     }
/* 114:137 */     return paramamj;
/* 115:    */   }
/* 116:    */   
/* 117:    */   public static Entity a(World paramaqu, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
/* 118:    */   {
/* 119:141 */     if (!EntityList.entityEggs.containsKey(Integer.valueOf(paramInt))) {
/* 120:142 */       return null;
/* 121:    */     }
/* 122:145 */     Entity localwv = null;
/* 123:147 */     for (int i = 0; i < 1; i++)
/* 124:    */     {
/* 125:148 */       localwv = EntityList.a(paramInt, paramaqu);
/* 126:150 */       if ((localwv instanceof EntityLiving))
/* 127:    */       {
/* 128:151 */         EntityMob localxn = (EntityMob)localwv;
/* 129:152 */         localwv.setPositionAndAngles(paramDouble1, paramDouble2, paramDouble3, MathUtils.wrapDegrees(paramaqu.rng.nextFloat() * 360.0F), 0.0F);
/* 130:153 */         localxn.aI = localxn.yaw;
/* 131:154 */         localxn.aG = localxn.yaw;
/* 132:    */         
/* 133:156 */         localxn.beforeSpawn(paramaqu.E(new BlockPosition(localxn)), null);
/* 134:157 */         paramaqu.spawnEntity(localwv);
/* 135:158 */         localxn.x();
/* 136:    */       }
/* 137:    */     }
/* 138:162 */     return localwv;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/* 142:    */   {
/* 143:167 */     for (xc localxc : EntityList.entityEggs.values()) {
/* 144:168 */       paramList.add(new ItemStack(paramalq, 1, localxc.a));
/* 145:    */     }
/* 146:    */   }
/* 147:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     anl
 * JD-Core Version:    0.7.0.1
 */