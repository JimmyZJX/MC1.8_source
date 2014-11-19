package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bin
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private ProtoBlock a;
/*  7:   */   
/*  8:   */   public bin(ProtoBlock paramatr)
/*  9:   */   {
/* 10:15 */     this.a = paramatr;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 14:   */   {
/* 15:20 */     if (paramaqu.getBlock(paramdt.up()).getProto() != BlockList.stone) {
/* 16:21 */       return false;
/* 17:   */     }
/* 18:23 */     if (paramaqu.getBlock(paramdt.down()).getProto() != BlockList.stone) {
/* 19:24 */       return false;
/* 20:   */     }
/* 21:27 */     if ((paramaqu.getBlock(paramdt).getProto().getMaterial() != Material.air) && (paramaqu.getBlock(paramdt).getProto() != BlockList.stone)) {
/* 22:28 */       return false;
/* 23:   */     }
/* 24:31 */     int i = 0;
/* 25:32 */     if (paramaqu.getBlock(paramdt.west()).getProto() == BlockList.stone) {
/* 26:33 */       i++;
/* 27:   */     }
/* 28:35 */     if (paramaqu.getBlock(paramdt.east()).getProto() == BlockList.stone) {
/* 29:36 */       i++;
/* 30:   */     }
/* 31:38 */     if (paramaqu.getBlock(paramdt.north()).getProto() == BlockList.stone) {
/* 32:39 */       i++;
/* 33:   */     }
/* 34:41 */     if (paramaqu.getBlock(paramdt.south()).getProto() == BlockList.stone) {
/* 35:42 */       i++;
/* 36:   */     }
/* 37:45 */     int j = 0;
/* 38:46 */     if (paramaqu.isEmpty(paramdt.west())) {
/* 39:47 */       j++;
/* 40:   */     }
/* 41:49 */     if (paramaqu.isEmpty(paramdt.east())) {
/* 42:50 */       j++;
/* 43:   */     }
/* 44:52 */     if (paramaqu.isEmpty(paramdt.north())) {
/* 45:53 */       j++;
/* 46:   */     }
/* 47:55 */     if (paramaqu.isEmpty(paramdt.south())) {
/* 48:56 */       j++;
/* 49:   */     }
/* 50:59 */     if ((i == 3) && (j == 1))
/* 51:   */     {
/* 52:60 */       paramaqu.setBlock(paramdt, this.a.instance(), 2);
/* 53:61 */       paramaqu.a(this.a, paramdt, paramRandom);
/* 54:   */     }
/* 55:64 */     return true;
/* 56:   */   }
/* 57:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bin
 * JD-Core Version:    0.7.0.1
 */