package net.minecraft.src;
/*   1:    */ import com.mojang.authlib.GameProfile;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class anh
/*   5:    */   extends Item
/*   6:    */ {
/*   7: 23 */   private static final String[] a = { "skeleton", "wither", "zombie", "char", "creeper" };
/*   8:    */   
/*   9:    */   public anh()
/*  10:    */   {
/*  11: 28 */     setTabToDisplayOn(CreativeTabs.tabDeco);
/*  12: 29 */     setMaxDamage(0);
/*  13: 30 */     a(true);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  17:    */   {
/*  18: 35 */     if (paramej == EnumDirection.DOWN) {
/*  19: 36 */       return false;
/*  20:    */     }
/*  21: 39 */     Block localbec = paramaqu.getBlock(paramdt);
/*  22: 40 */     ProtoBlock localatr = localbec.getProto();
/*  23: 41 */     boolean bool = localatr.f(paramaqu, paramdt);
/*  24: 43 */     if (!bool)
/*  25:    */     {
/*  26: 44 */       if (!paramaqu.getBlock(paramdt).getProto().getMaterial().a()) {
/*  27: 45 */         return false;
/*  28:    */       }
/*  29: 47 */       paramdt = paramdt.offset(paramej);
/*  30:    */     }
/*  31: 50 */     if (!paramahd.a(paramdt, paramej, paramamj)) {
/*  32: 51 */       return false;
/*  33:    */     }
/*  34: 53 */     if (!BlockList.ce.c(paramaqu, paramdt)) {
/*  35: 54 */       return false;
/*  36:    */     }
/*  37: 57 */     if (!paramaqu.isClient)
/*  38:    */     {
/*  39: 58 */       paramaqu.setBlock(paramdt, BlockList.ce.instance().setData(baj.a, paramej), 3);
/*  40:    */       
/*  41: 60 */       int i = 0;
/*  42: 61 */       if (paramej == EnumDirection.UP) {
/*  43: 62 */         i = MathUtils.floor(paramahd.yaw * 16.0F / 360.0F + 0.5D) & 0xF;
/*  44:    */       }
/*  45: 65 */       bcm localbcm = paramaqu.s(paramdt);
/*  46: 66 */       if ((localbcm instanceof bdm))
/*  47:    */       {
/*  48: 67 */         bdm localbdm = (bdm)localbcm;
/*  49: 68 */         if (paramamj.getDamage2() == 3)
/*  50:    */         {
/*  51: 69 */           GameProfile localGameProfile = null;
/*  52: 70 */           if (paramamj.hasTagCompound())
/*  53:    */           {
/*  54: 71 */             NBTTagCompound localfn = paramamj.getTagCompound();
/*  55: 73 */             if (localfn.hasKey("SkullOwner", 10)) {
/*  56: 74 */               localGameProfile = ga.a(localfn.getCompoundTag("SkullOwner"));
/*  57: 75 */             } else if ((localfn.hasKey("SkullOwner", 8)) && (localfn.getString("SkullOwner").length() > 0)) {
/*  58: 76 */               localGameProfile = new GameProfile(null, localfn.getString("SkullOwner"));
/*  59:    */             }
/*  60:    */           }
/*  61: 80 */           localbdm.a(localGameProfile);
/*  62:    */         }
/*  63:    */         else
/*  64:    */         {
/*  65: 82 */           localbdm.a(paramamj.getDamage2());
/*  66:    */         }
/*  67: 84 */         localbdm.b(i);
/*  68: 85 */         BlockList.ce.a(paramaqu, paramdt, localbdm);
/*  69:    */       }
/*  70: 88 */       paramamj.stackSize -= 1;
/*  71:    */     }
/*  72: 91 */     return true;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void a(Item paramalq, CreativeTabs paramakf, List paramList)
/*  76:    */   {
/*  77: 96 */     for (int i = 0; i < a.length; i++) {
/*  78: 97 */       paramList.add(new ItemStack(paramalq, 1, i));
/*  79:    */     }
/*  80:    */   }
/*  81:    */   
/*  82:    */   public int a(int paramInt)
/*  83:    */   {
/*  84:103 */     return paramInt;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public String e_(ItemStack paramamj)
/*  88:    */   {
/*  89:108 */     int i = paramamj.getDamage2();
/*  90:109 */     if ((i < 0) || (i >= a.length)) {
/*  91:110 */       i = 0;
/*  92:    */     }
/*  93:112 */     return super.a() + "." + a[i];
/*  94:    */   }
/*  95:    */   
/*  96:    */   public String a(ItemStack paramamj)
/*  97:    */   {
/*  98:117 */     if ((paramamj.getDamage2() == 3) && (paramamj.hasTagCompound()))
/*  99:    */     {
/* 100:118 */       if (paramamj.getTagCompound().hasKey("SkullOwner", 8)) {
/* 101:119 */         return fi.a("item.skull.player.name", new Object[] { paramamj.getTagCompound().getString("SkullOwner") });
/* 102:    */       }
/* 103:120 */       if (paramamj.getTagCompound().hasKey("SkullOwner", 10))
/* 104:    */       {
/* 105:121 */         NBTTagCompound localfn = paramamj.getTagCompound().getCompoundTag("SkullOwner");
/* 106:122 */         if (localfn.hasKey("Name", 8)) {
/* 107:123 */           return fi.a("item.skull.player.name", new Object[] { localfn.getString("Name") });
/* 108:    */         }
/* 109:    */       }
/* 110:    */     }
/* 111:127 */     return super.a(paramamj);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public boolean a(NBTTagCompound paramfn)
/* 115:    */   {
/* 116:132 */     super.a(paramfn);
/* 117:133 */     if ((paramfn.hasKey("SkullOwner", 8)) && (paramfn.getString("SkullOwner").length() > 0))
/* 118:    */     {
/* 119:134 */       GameProfile localGameProfile = new GameProfile(null, paramfn.getString("SkullOwner"));
/* 120:135 */       localGameProfile = bdm.b(localGameProfile);
/* 121:136 */       paramfn.setNBT("SkullOwner", ga.a(new NBTTagCompound(), localGameProfile));
/* 122:137 */       return true;
/* 123:    */     }
/* 124:139 */     return false;
/* 125:    */   }
/* 126:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     anh
 * JD-Core Version:    0.7.0.1
 */