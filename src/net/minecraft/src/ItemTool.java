package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Multimap;

/*  2:   */ import java.util.Set;
/*  3:   */ 
/*  4:   */ public class ItemTool
/*  5:   */   extends Item
/*  6:   */ {
/*  7:   */   private Set<BlockType> blocksEffectiveAgainst;
/*  8:15 */   protected float efficiencyOnProperMaterial = 4.0F;
/*  9:   */   private float damageVsEntity;
/* 10:   */   protected EnumToolMaterial toolMaterial;
/* 11:   */   
/* 12:   */   protected ItemTool(float baseDamage, EnumToolMaterial material, Set<BlockType> blocks)
/* 13:   */   {
/* 14:21 */     this.toolMaterial = material;
/* 15:22 */     this.blocksEffectiveAgainst = blocks;
/* 16:23 */     this.maxStackSize = 1;
/* 17:24 */     setMaxDamage(material.getMaxUses());
/* 18:25 */     this.efficiencyOnProperMaterial = material.getEfficiencyOnProperMaterial();
/* 19:26 */     this.damageVsEntity = (baseDamage + material.getDamageVsEntity());
/* 20:27 */     setTabToDisplayOn(CreativeTabs.tabTools);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public float getStrVsBlock(ItemStack itemStack, BlockType block)
/* 24:   */   {
/* 25:32 */     return this.blocksEffectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : 1.0F;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public boolean a(ItemStack itemStack, EntityLiving paramxm1, EntityLiving paramxm2)
/* 29:   */   {
/* 30:37 */     itemStack.a(2, paramxm2);
/* 31:38 */     return true;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public boolean a(ItemStack paramamj, World paramaqu, BlockType paramatr, BlockPosition paramdt, EntityLiving paramxm)
/* 35:   */   {
/* 36:44 */     if (paramatr.g(paramaqu, paramdt) != 0.0D) {
/* 37:45 */       paramamj.a(1, paramxm);
/* 38:   */     }
/* 39:47 */     return true;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean v_()
/* 43:   */   {
/* 44:52 */     return true;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public EnumToolMaterial g()
/* 48:   */   {
/* 49:56 */     return this.toolMaterial;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public int getItemEnchantability()
/* 53:   */   {
/* 54:61 */     return this.toolMaterial.getEnchantability();
/* 55:   */   }
/* 56:   */   
/* 57:   */   public String getToolMaterialString()
/* 58:   */   {
/* 59:65 */     return this.toolMaterial.toString();
/* 60:   */   }
/* 61:   */   
/* 62:   */   public boolean a(ItemStack paramamj1, ItemStack paramamj2)
/* 63:   */   {
/* 64:70 */     if (this.toolMaterial.f() == paramamj2.getItem()) {
/* 65:71 */       return true;
/* 66:   */     }
/* 67:73 */     return super.a(paramamj1, paramamj2);
/* 68:   */   }
/* 69:   */   
/* 70:   */   public Multimap<String, ya> i()
/* 71:   */   {
/* 72:78 */     Multimap<String, ya> localMultimap = super.i();
/* 73:   */     
/* 74:80 */     localMultimap.put(MobAttribute.attackDamage.a(), new ya(f, "Tool modifier", this.damageVsEntity, 0));
/* 75:   */     
/* 76:82 */     return localMultimap;
/* 77:   */   }
/* 78:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aks
 * JD-Core Version:    0.7.0.1
 */