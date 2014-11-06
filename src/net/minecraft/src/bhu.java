package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhu
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private final ProtoBlock a;
/*  7:   */   private final boolean b;
/*  8:   */   
/*  9:   */   public bhu(ProtoBlock paramatr, boolean paramBoolean)
/* 10:   */   {
/* 11:16 */     this.a = paramatr;
/* 12:17 */     this.b = paramBoolean;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 16:   */   {
/* 17:22 */     if (paramaqu.getBlock(paramdt.up()).getProto() != BlockList.netherrack) {
/* 18:23 */       return false;
/* 19:   */     }
/* 20:25 */     if ((paramaqu.getBlock(paramdt).getProto().getMaterial() != Material.air) && (paramaqu.getBlock(paramdt).getProto() != BlockList.netherrack)) {
/* 21:26 */       return false;
/* 22:   */     }
/* 23:29 */     int i = 0;
/* 24:30 */     if (paramaqu.getBlock(paramdt.west()).getProto() == BlockList.netherrack) {
/* 25:31 */       i++;
/* 26:   */     }
/* 27:33 */     if (paramaqu.getBlock(paramdt.east()).getProto() == BlockList.netherrack) {
/* 28:34 */       i++;
/* 29:   */     }
/* 30:36 */     if (paramaqu.getBlock(paramdt.north()).getProto() == BlockList.netherrack) {
/* 31:37 */       i++;
/* 32:   */     }
/* 33:39 */     if (paramaqu.getBlock(paramdt.south()).getProto() == BlockList.netherrack) {
/* 34:40 */       i++;
/* 35:   */     }
/* 36:42 */     if (paramaqu.getBlock(paramdt.down()).getProto() == BlockList.netherrack) {
/* 37:43 */       i++;
/* 38:   */     }
/* 39:46 */     int j = 0;
/* 40:47 */     if (paramaqu.d(paramdt.west())) {
/* 41:48 */       j++;
/* 42:   */     }
/* 43:50 */     if (paramaqu.d(paramdt.east())) {
/* 44:51 */       j++;
/* 45:   */     }
/* 46:53 */     if (paramaqu.d(paramdt.north())) {
/* 47:54 */       j++;
/* 48:   */     }
/* 49:56 */     if (paramaqu.d(paramdt.south())) {
/* 50:57 */       j++;
/* 51:   */     }
/* 52:59 */     if (paramaqu.d(paramdt.down())) {
/* 53:60 */       j++;
/* 54:   */     }
/* 55:63 */     if (((!this.b) && (i == 4) && (j == 1)) || (i == 5))
/* 56:   */     {
/* 57:64 */       paramaqu.setBlock(paramdt, this.a.instance(), 2);
/* 58:65 */       paramaqu.a(this.a, paramdt, paramRandom);
/* 59:   */     }
/* 60:68 */     return true;
/* 61:   */   }
/* 62:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhu
 * JD-Core Version:    0.7.0.1
 */