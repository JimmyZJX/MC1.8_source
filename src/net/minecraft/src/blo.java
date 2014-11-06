package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class blo
/*   4:    */   extends bln
/*   5:    */ {
/*   6:    */   private boolean e;
/*   7:    */   
/*   8:    */   public blo() {}
/*   9:    */   
/*  10:    */   public blo(Random paramRandom, int paramInt1, int paramInt2)
/*  11:    */   {
/*  12:620 */     super(paramRandom, paramInt1, 64, paramInt2, 7, 5, 9);
/*  13:    */   }
/*  14:    */   
/*  15:    */   protected void a(NBTTagCompound paramfn)
/*  16:    */   {
/*  17:625 */     super.a(paramfn);
/*  18:626 */     paramfn.setBoolean("Witch", this.e);
/*  19:    */   }
/*  20:    */   
/*  21:    */   protected void b(NBTTagCompound paramfn)
/*  22:    */   {
/*  23:631 */     super.b(paramfn);
/*  24:632 */     this.e = paramfn.getBoolean("Witch");
/*  25:    */   }
/*  26:    */   
/*  27:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*  28:    */   {
/*  29:637 */     if (!a(paramaqu, parambjb, 0)) {
/*  30:638 */       return false;
/*  31:    */     }
/*  32:642 */     a(paramaqu, parambjb, 1, 1, 1, 5, 1, 7, BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), false);
/*  33:643 */     a(paramaqu, parambjb, 1, 4, 2, 5, 4, 7, BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), false);
/*  34:644 */     a(paramaqu, parambjb, 2, 1, 0, 4, 1, 0, BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), false);
/*  35:    */     
/*  36:    */ 
/*  37:647 */     a(paramaqu, parambjb, 2, 2, 2, 3, 3, 2, BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), false);
/*  38:648 */     a(paramaqu, parambjb, 1, 2, 3, 1, 3, 6, BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), false);
/*  39:649 */     a(paramaqu, parambjb, 5, 2, 3, 5, 3, 6, BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), false);
/*  40:650 */     a(paramaqu, parambjb, 2, 2, 7, 4, 3, 7, BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), BlockList.planks.a(EnumWoodVariant.SPRUCE.getIndex()), false);
/*  41:    */     
/*  42:    */ 
/*  43:653 */     a(paramaqu, parambjb, 1, 0, 2, 1, 3, 2, BlockList.log.instance(), BlockList.log.instance(), false);
/*  44:654 */     a(paramaqu, parambjb, 5, 0, 2, 5, 3, 2, BlockList.log.instance(), BlockList.log.instance(), false);
/*  45:655 */     a(paramaqu, parambjb, 1, 0, 7, 1, 3, 7, BlockList.log.instance(), BlockList.log.instance(), false);
/*  46:656 */     a(paramaqu, parambjb, 5, 0, 7, 5, 3, 7, BlockList.log.instance(), BlockList.log.instance(), false);
/*  47:    */     
/*  48:    */ 
/*  49:659 */     a(paramaqu, BlockList.fence.instance(), 2, 3, 2, parambjb);
/*  50:660 */     a(paramaqu, BlockList.fence.instance(), 3, 3, 7, parambjb);
/*  51:661 */     a(paramaqu, BlockList.air.instance(), 1, 3, 4, parambjb);
/*  52:662 */     a(paramaqu, BlockList.air.instance(), 5, 3, 4, parambjb);
/*  53:663 */     a(paramaqu, BlockList.air.instance(), 5, 3, 5, parambjb);
/*  54:664 */     a(paramaqu, BlockList.ca.instance().a(awd.b, awf.MUSHROOM_RED), 1, 3, 5, parambjb);
/*  55:    */     
/*  56:    */ 
/*  57:667 */     a(paramaqu, BlockList.ai.instance(), 3, 2, 6, parambjb);
/*  58:668 */     a(paramaqu, BlockList.bE.instance(), 4, 2, 6, parambjb);
/*  59:    */     
/*  60:    */ 
/*  61:671 */     a(paramaqu, BlockList.fence.instance(), 1, 2, 1, parambjb);
/*  62:672 */     a(paramaqu, BlockList.fence.instance(), 5, 2, 1, parambjb);
/*  63:    */     
/*  64:    */ 
/*  65:675 */     int i = a(BlockList.ad, 3);
/*  66:676 */     int j = a(BlockList.ad, 1);
/*  67:677 */     int k = a(BlockList.ad, 0);
/*  68:678 */     int m = a(BlockList.ad, 2);
/*  69:    */     
/*  70:680 */     a(paramaqu, parambjb, 0, 4, 1, 6, 4, 1, BlockList.bU.a(i), BlockList.bU.a(i), false);
/*  71:681 */     a(paramaqu, parambjb, 0, 4, 2, 0, 4, 7, BlockList.bU.a(k), BlockList.bU.a(k), false);
/*  72:682 */     a(paramaqu, parambjb, 6, 4, 2, 6, 4, 7, BlockList.bU.a(j), BlockList.bU.a(j), false);
/*  73:683 */     a(paramaqu, parambjb, 0, 4, 8, 6, 4, 8, BlockList.bU.a(m), BlockList.bU.a(m), false);
/*  74:    */     int i1;
/*  75:686 */     for (int n = 2; n <= 7; n += 5) {
/*  76:687 */       for (i1 = 1; i1 <= 5; i1 += 4) {
/*  77:688 */         b(paramaqu, BlockList.log.instance(), i1, -1, n, parambjb);
/*  78:    */       }
/*  79:    */     }
/*  80:692 */     if (!this.e)
/*  81:    */     {
/*  82:693 */       n = a(2, 5);
/*  83:694 */       i1 = d(2);
/*  84:695 */       int i2 = b(2, 5);
/*  85:697 */       if (parambjb.b(new BlockPosition(n, i1, i2)))
/*  86:    */       {
/*  87:698 */         this.e = true;
/*  88:    */         
/*  89:700 */         EntityWitch localagi = new EntityWitch(paramaqu);
/*  90:701 */         localagi.setPositionAndAngles(n + 0.5D, i1, i2 + 0.5D, 0.0F, 0.0F);
/*  91:702 */         localagi.beforeSpawn(paramaqu.E(new BlockPosition(n, i1, i2)), null);
/*  92:703 */         paramaqu.spawnEntity(localagi);
/*  93:    */       }
/*  94:    */     }
/*  95:707 */     return true;
/*  96:    */   }
/*  97:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     blo
 * JD-Core Version:    0.7.0.1
 */