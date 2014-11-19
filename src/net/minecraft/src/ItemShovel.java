package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Sets;
/*  2:   */ import java.util.Set;
/*  3:   */ 
/*  4:   */ public class ItemShovel
/*  5:   */   extends ItemTool
/*  6:   */ {
/*  7:10 */   private static final Set c = Sets.newHashSet(new ProtoBlock[] { BlockList.aL, BlockList.dirt, BlockList.ak, BlockList.grass, BlockList.gravel, BlockList.bw, BlockList.sand, BlockList.aJ, BlockList.aH, BlockList.soulSand });
/*  8:   */   
/*  9:   */   public ItemShovel(EnumToolMaterial paramami)
/* 10:   */   {
/* 11:24 */     super(1.0F, paramami, c);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean canHarvestBlock(ProtoBlock paramatr)
/* 15:   */   {
/* 16:29 */     if (paramatr == BlockList.aH) {
/* 17:30 */       return true;
/* 18:   */     }
/* 19:32 */     if (paramatr == BlockList.aJ) {
/* 20:33 */       return true;
/* 21:   */     }
/* 22:35 */     return false;
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ane
 * JD-Core Version:    0.7.0.1
 */