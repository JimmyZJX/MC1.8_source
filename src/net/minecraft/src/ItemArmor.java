package net.minecraft.src;
/*   1:    */ public class ItemArmor
/*   2:    */   extends Item
/*   3:    */ {
/*   4: 28 */   private static final int[] k = { 11, 16, 15, 13 };
/*   5: 33 */   public static final String[] a = { "minecraft:items/empty_armor_slot_helmet", "minecraft:items/empty_armor_slot_chestplate", "minecraft:items/empty_armor_slot_leggings", "minecraft:items/empty_armor_slot_boots" };
/*   6: 37 */   private static final eo l = new ajo();
/*   7:    */   public final int b;
/*   8:    */   public final int c;
/*   9:    */   public final int d;
/*  10:    */   private final EnumArmorMaterial material;
/*  11:    */   
/*  12:    */   public ItemArmor(EnumArmorMaterial paramajp, int paramInt1, int paramInt2)
/*  13:    */   {
/*  14:123 */     this.material = paramajp;
/*  15:124 */     this.b = paramInt2;
/*  16:125 */     this.d = paramInt1;
/*  17:126 */     this.c = paramajp.b(paramInt2);
/*  18:127 */     setMaxDamage(paramajp.a(paramInt2));
/*  19:128 */     this.maxStackSize = 1;
/*  20:129 */     setTabToDisplayOn(CreativeTabs.tabCombat);
/*  21:130 */     ave.M.a(this, l);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public int a(ItemStack paramamj, int paramInt)
/*  25:    */   {
/*  26:135 */     if (paramInt > 0) {
/*  27:136 */       return 16777215;
/*  28:    */     }
/*  29:139 */     int i = b(paramamj);
/*  30:140 */     if (i < 0) {
/*  31:141 */       i = 16777215;
/*  32:    */     }
/*  33:143 */     return i;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public int getItemEnchantability()
/*  37:    */   {
/*  38:148 */     return this.material.a();
/*  39:    */   }
/*  40:    */   
/*  41:    */   public EnumArmorMaterial w_()
/*  42:    */   {
/*  43:152 */     return this.material;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public boolean d_(ItemStack paramamj)
/*  47:    */   {
/*  48:156 */     if (this.material != EnumArmorMaterial.LEATHER) {
/*  49:157 */       return false;
/*  50:    */     }
/*  51:159 */     if (!paramamj.hasTagCompound()) {
/*  52:160 */       return false;
/*  53:    */     }
/*  54:162 */     if (!paramamj.getTagCompound().hasKey("display", 10)) {
/*  55:163 */       return false;
/*  56:    */     }
/*  57:165 */     if (!paramamj.getTagCompound().getCompoundTag("display").hasKey("color", 3)) {
/*  58:166 */       return false;
/*  59:    */     }
/*  60:169 */     return true;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public int b(ItemStack paramamj)
/*  64:    */   {
/*  65:173 */     if (this.material != EnumArmorMaterial.LEATHER) {
/*  66:174 */       return -1;
/*  67:    */     }
/*  68:177 */     NBTTagCompound localfn1 = paramamj.getTagCompound();
/*  69:178 */     if (localfn1 != null)
/*  70:    */     {
/*  71:179 */       NBTTagCompound localfn2 = localfn1.getCompoundTag("display");
/*  72:180 */       if ((localfn2 != null) && 
/*  73:181 */         (localfn2.hasKey("color", 3))) {
/*  74:182 */         return localfn2.getInteger("color");
/*  75:    */       }
/*  76:    */     }
/*  77:186 */     return 10511680;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void c(ItemStack paramamj)
/*  81:    */   {
/*  82:190 */     if (this.material != EnumArmorMaterial.LEATHER) {
/*  83:191 */       return;
/*  84:    */     }
/*  85:193 */     NBTTagCompound localfn1 = paramamj.getTagCompound();
/*  86:194 */     if (localfn1 == null) {
/*  87:195 */       return;
/*  88:    */     }
/*  89:197 */     NBTTagCompound localfn2 = localfn1.getCompoundTag("display");
/*  90:198 */     if (localfn2.c("color")) {
/*  91:199 */       localfn2.o("color");
/*  92:    */     }
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void b(ItemStack paramamj, int paramInt)
/*  96:    */   {
/*  97:204 */     if (this.material != EnumArmorMaterial.LEATHER) {
/*  98:205 */       throw new UnsupportedOperationException("Can't dye non-leather!");
/*  99:    */     }
/* 100:208 */     NBTTagCompound localfn1 = paramamj.getTagCompound();
/* 101:210 */     if (localfn1 == null)
/* 102:    */     {
/* 103:211 */       localfn1 = new NBTTagCompound();
/* 104:212 */       paramamj.setTagCompound(localfn1);
/* 105:    */     }
/* 106:215 */     NBTTagCompound localfn2 = localfn1.getCompoundTag("display");
/* 107:216 */     if (!localfn1.hasKey("display", 10)) {
/* 108:217 */       localfn1.setNBT("display", localfn2);
/* 109:    */     }
/* 110:219 */     localfn2.setInt("color", paramInt);
/* 111:    */   }
/* 112:    */   
/* 113:    */   public boolean a(ItemStack paramamj1, ItemStack paramamj2)
/* 114:    */   {
/* 115:224 */     if (this.material.getItem() == paramamj2.getItem()) {
/* 116:225 */       return true;
/* 117:    */     }
/* 118:227 */     return super.a(paramamj1, paramamj2);
/* 119:    */   }
/* 120:    */   
/* 121:    */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 122:    */   {
/* 123:232 */     int i = EntityMob.getSlot(paramamj) - 1;
/* 124:233 */     ItemStack localamj = paramahd.getArmor(i);
/* 125:235 */     if (localamj == null)
/* 126:    */     {
/* 127:236 */       paramahd.setItemStack(i, paramamj.k());
/* 128:237 */       paramamj.stackSize = 0;
/* 129:    */     }
/* 130:240 */     return paramamj;
/* 131:    */   }
				static int[] d() {return k;}
/* 132:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajn
 * JD-Core Version:    0.7.0.1
 */