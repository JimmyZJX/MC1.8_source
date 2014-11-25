package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Sets;
/*  2:   */ import java.util.Set;
/*  3:   */ 
/*  4:   */ public class ItemAxe
/*  5:   */   extends ItemTool
/*  6:   */ {
/*  7:11 */   private static final Set<ProtoBlock> blocksEffectiveAgainst = Sets.newHashSet(new ProtoBlock[] { BlockList.planks, BlockList.bookshelf, BlockList.log, BlockList.log2, BlockList.chest, BlockList.pumpkin, BlockList.aZ, BlockList.bk, BlockList.au });
/*  8:   */   
/*  9:   */   protected ItemAxe(EnumToolMaterial material)
/* 10:   */   {
/* 11:24 */     super(3.0F, material, blocksEffectiveAgainst);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public float getStrVsBlock(ItemStack paramamj, ProtoBlock paramatr)
/* 15:   */   {
/* 16:29 */     if ((paramatr.getMaterial() == Material.wood) || (paramatr.getMaterial() == Material.plants) || (paramatr.getMaterial() == Material.l)) {
/* 17:30 */       return this.efficiencyOnProperMaterial;
/* 18:   */     }
/* 19:32 */     return super.getStrVsBlock(paramamj, paramatr);
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajr
 * JD-Core Version:    0.7.0.1
 */