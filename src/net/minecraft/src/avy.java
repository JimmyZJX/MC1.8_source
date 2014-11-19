package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public abstract class avy
/*   4:    */   extends auc
/*   5:    */ {
/*   6:    */   protected BlockDataEnum a;
/*   7:    */   
/*   8:    */   protected avy()
/*   9:    */   {
/*  10: 23 */     super(Material.plants);
/*  11: 24 */     j(this.L.b().a(l(), j() == awc.b ? EnumFlowerVariant.b : EnumFlowerVariant.a));
/*  12:    */   }
/*  13:    */   
/*  14:    */   public int a(Block parambec)
/*  15:    */   {
/*  16: 29 */     return ((EnumFlowerVariant)parambec.getProperty(l())).b();
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void a(Item paramalq, CreativeTabs paramakf, List<ItemStack> paramList)
/*  20:    */   {
/*  21: 34 */     for (EnumFlowerVariant localawa : EnumFlowerVariant.a(j())) {
/*  22: 35 */       paramList.add(new ItemStack(paramalq, 1, localawa.b()));
/*  23:    */     }
/*  24:    */   }
/*  25:    */   
/*  26:    */   public Block a(int paramInt)
/*  27:    */   {
/*  28: 41 */     return instance().a(l(), EnumFlowerVariant.a(j(), paramInt));
/*  29:    */   }
/*  30:    */   
/*  31:    */   public abstract awc j();
/*  32:    */   
/*  33:    */   public IBlockData<Enum<?>> l()
/*  34:    */   {
/*  35: 48 */     if (this.a == null) {
/*  36: 49 */       this.a = BlockDataEnum.getInstance("type", EnumFlowerVariant.class, new avz(this));
/*  37:    */     }
/*  38: 56 */     return this.a;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public int c(Block parambec)
/*  42:    */   {
/*  43: 61 */     return ((EnumFlowerVariant)parambec.getProperty(l())).b();
/*  44:    */   }
/*  45:    */   
/*  46:    */   protected bed e()
/*  47:    */   {
/*  48: 66 */     return new bed(this, new IBlockData[] { l() });
/*  49:    */   }
/*  50:    */   
/*  51:    */   public atw Q()
/*  52:    */   {
/*  53:169 */     return atw.b;
/*  54:    */   }
/*  55:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avy
 * JD-Core Version:    0.7.0.1
 */