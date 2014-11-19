package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class NetherLavaGenerator
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   private final ProtoBlock block;
/*  7:   */   private final boolean closedOnly;
/*  8:   */   
/*  9:   */   public NetherLavaGenerator(ProtoBlock paramatr, boolean paramBoolean)
/* 10:   */   {
/* 11:16 */     this.block = paramatr;
/* 12:17 */     this.closedOnly = paramBoolean;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition pos)
/* 16:   */   {
/* 17:22 */     if (paramaqu.getBlock(pos.up()).getProto() != BlockList.netherrack) {
/* 18:23 */       return false;
/* 19:   */     }
/* 20:25 */     if ((paramaqu.getBlock(pos).getProto().getMaterial() != Material.air) && (paramaqu.getBlock(pos).getProto() != BlockList.netherrack)) {
/* 21:26 */       return false;
/* 22:   */     }
/* 23:29 */     int i = 0;
/* 24:30 */     if (paramaqu.getBlock(pos.west()).getProto() == BlockList.netherrack) {
/* 25:31 */       i++;
/* 26:   */     }
/* 27:33 */     if (paramaqu.getBlock(pos.east()).getProto() == BlockList.netherrack) {
/* 28:34 */       i++;
/* 29:   */     }
/* 30:36 */     if (paramaqu.getBlock(pos.north()).getProto() == BlockList.netherrack) {
/* 31:37 */       i++;
/* 32:   */     }
/* 33:39 */     if (paramaqu.getBlock(pos.south()).getProto() == BlockList.netherrack) {
/* 34:40 */       i++;
/* 35:   */     }
/* 36:42 */     if (paramaqu.getBlock(pos.down()).getProto() == BlockList.netherrack) {
/* 37:43 */       i++;
/* 38:   */     }
/* 39:46 */     int j = 0;
/* 40:47 */     if (paramaqu.isEmpty(pos.west())) {
/* 41:48 */       j++;
/* 42:   */     }
/* 43:50 */     if (paramaqu.isEmpty(pos.east())) {
/* 44:51 */       j++;
/* 45:   */     }
/* 46:53 */     if (paramaqu.isEmpty(pos.north())) {
/* 47:54 */       j++;
/* 48:   */     }
/* 49:56 */     if (paramaqu.isEmpty(pos.south())) {
/* 50:57 */       j++;
/* 51:   */     }
/* 52:59 */     if (paramaqu.isEmpty(pos.down())) {
/* 53:60 */       j++;
/* 54:   */     }
/* 55:63 */     if (((!this.closedOnly) && (i == 4) && (j == 1)) || (i == 5))
/* 56:   */     {
/* 57:64 */       paramaqu.setBlock(pos, this.block.instance(), 2);
/* 58:65 */       paramaqu.a(this.block, pos, paramRandom);
/* 59:   */     }
/* 60:68 */     return true;
/* 61:   */   }
/* 62:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhu
 * JD-Core Version:    0.7.0.1
 */