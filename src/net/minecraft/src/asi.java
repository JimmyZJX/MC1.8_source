package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class asi
/*  5:   */   extends arm
/*  6:   */ {
/*  7:   */   private boolean aD;
/*  8:   */   
/*  9:   */   public asi(int paramInt, boolean paramBoolean)
/* 10:   */   {
/* 11:17 */     super(paramInt);
/* 12:18 */     this.aD = paramBoolean;
/* 13:19 */     if (paramBoolean) {
/* 14:20 */       this.as.A = 2;
/* 15:   */     } else {
/* 16:22 */       this.as.A = 50;
/* 17:   */     }
/* 18:24 */     this.as.C = 25;
/* 19:25 */     this.as.B = 4;
/* 20:27 */     if (!paramBoolean) {
/* 21:28 */       this.at.add(new SpawnListEntry(EntityOcelot.class, 2, 1, 1));
/* 22:   */     }
/* 23:32 */     this.au.add(new SpawnListEntry(EntityChicken.class, 10, 4, 4));
/* 24:   */   }
/* 25:   */   
/* 26:   */   public bhc a(Random paramRandom)
/* 27:   */   {
/* 28:37 */     if (paramRandom.nextInt(10) == 0) {
/* 29:38 */       return this.aB;
/* 30:   */     }
/* 31:40 */     if (paramRandom.nextInt(2) == 0) {
/* 32:41 */       return new bhr(EnumWoodVariant.JUNGLE.getIndex(), EnumWoodVariant.OAK.getIndex());
/* 33:   */     }
/* 34:43 */     if ((!this.aD) && (paramRandom.nextInt(3) == 0)) {
/* 35:44 */       return new bia(false, 10, 20, EnumWoodVariant.JUNGLE.getIndex(), EnumWoodVariant.JUNGLE.getIndex());
/* 36:   */     }
/* 37:46 */     return new bir(false, 4 + paramRandom.nextInt(7), EnumWoodVariant.JUNGLE.getIndex(), EnumWoodVariant.JUNGLE.getIndex(), true);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public TerrainGenerator b(Random paramRandom)
/* 41:   */   {
/* 42:51 */     if (paramRandom.nextInt(4) == 0) {
/* 43:52 */       return new biq(bbi.c);
/* 44:   */     }
/* 45:54 */     return new biq(bbi.b);
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void a(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 49:   */   {
/* 50:59 */     super.a(paramaqu, paramRandom, paramdt);
/* 51:   */     
/* 52:   */ 
/* 53:62 */     int i = paramRandom.nextInt(16) + 8;
/* 54:63 */     int j = paramRandom.nextInt(16) + 8;
/* 55:64 */     int k = paramRandom.nextInt(paramaqu.m(paramdt.offset(i, 0, j)).getY() * 2);
/* 56:65 */     new bid().generate(paramaqu, paramRandom, paramdt.offset(i, k, j));
/* 57:   */     
/* 58:   */ 
/* 59:68 */     bis localbis = new bis();
/* 60:70 */     for (j = 0; j < 50; j++)
/* 61:   */     {
/* 62:71 */       k = paramRandom.nextInt(16) + 8;
/* 63:72 */       int m = 128;
/* 64:73 */       int n = paramRandom.nextInt(16) + 8;
/* 65:   */       
/* 66:75 */       localbis.generate(paramaqu, paramRandom, paramdt.offset(k, 128, n));
/* 67:   */     }
/* 68:   */   }
/* 69:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asi
 * JD-Core Version:    0.7.0.1
 */