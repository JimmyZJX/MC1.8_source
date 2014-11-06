package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Multimap;
/*   2:    */ 
/*   3:    */ public class ItemSword
/*   4:    */   extends Item
/*   5:    */ {
/*   6:    */   private float a;
/*   7:    */   private final EnumToolMaterial material;
/*   8:    */   
/*   9:    */   public ItemSword(EnumToolMaterial material)
/*  10:    */   {
/*  11: 19 */     this.material = material;
/*  12: 20 */     this.maxStackSize = 1;
/*  13: 21 */     setMaxDamage(material.getMaxUses());
/*  14: 22 */     setTabToDisplayOn(CreativeTabs.tabCombat);
/*  15:    */     
/*  16: 24 */     this.a = (4.0F + material.getDamageVsEntity());
/*  17:    */   }
/*  18:    */   
/*  19:    */   public float g()
/*  20:    */   {
/*  21: 28 */     return this.material.getDamageVsEntity();
/*  22:    */   }
/*  23:    */   
/*  24:    */   public float getStrVsBlock(ItemStack paramamj, ProtoBlock paramatr)
/*  25:    */   {
/*  26: 33 */     if (paramatr == BlockList.web) {
/*  27: 35 */       return 15.0F;
/*  28:    */     }
/*  29: 39 */     Material localbof = paramatr.getMaterial();
/*  30: 40 */     if ((localbof == Material.plants) || (localbof == Material.l) || (localbof == Material.v) || (localbof == Material.leaves) || (localbof == Material.C)) {
/*  31: 41 */       return 1.5F;
/*  32:    */     }
/*  33: 43 */     return 1.0F;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean a(ItemStack paramamj, EntityLiving paramxm1, EntityLiving paramxm2)
/*  37:    */   {
/*  38: 48 */     paramamj.a(1, paramxm2);
/*  39: 49 */     return true;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public boolean a(ItemStack paramamj, World paramaqu, ProtoBlock paramatr, BlockPosition paramdt, EntityLiving paramxm)
/*  43:    */   {
/*  44: 55 */     if (paramatr.g(paramaqu, paramdt) != 0.0D) {
/*  45: 56 */       paramamj.a(2, paramxm);
/*  46:    */     }
/*  47: 58 */     return true;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public boolean v_()
/*  51:    */   {
/*  52: 63 */     return true;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public ano e(ItemStack paramamj)
/*  56:    */   {
/*  57: 68 */     return ano.d;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public int d(ItemStack paramamj)
/*  61:    */   {
/*  62: 73 */     return 72000;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/*  66:    */   {
/*  67: 78 */     paramahd.a(paramamj, d(paramamj));
/*  68: 79 */     return paramamj;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public boolean canHarvestBlock(ProtoBlock paramatr)
/*  72:    */   {
/*  73: 84 */     return paramatr == BlockList.web;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public int getItemEnchantability()
/*  77:    */   {
/*  78: 89 */     return this.material.getEnchantability();
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String h()
/*  82:    */   {
/*  83: 93 */     return this.material.toString();
/*  84:    */   }
/*  85:    */   
/*  86:    */   public boolean a(ItemStack paramamj1, ItemStack paramamj2)
/*  87:    */   {
/*  88: 98 */     if (this.material.f() == paramamj2.getItem()) {
/*  89: 99 */       return true;
/*  90:    */     }
/*  91:101 */     return super.a(paramamj1, paramamj2);
/*  92:    */   }
/*  93:    */   
/*  94:    */   public Multimap<String,ya> i()
/*  95:    */   {
/*  96:106 */     Multimap<String,ya> localMultimap = super.i();
/*  97:    */     
/*  98:108 */     localMultimap.put(afs.e.a(), new ya(f, "Weapon modifier", this.a, 0));
/*  99:    */     
/* 100:110 */     return localMultimap;
/* 101:    */   }
/* 102:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     anm
 * JD-Core Version:    0.7.0.1
 */