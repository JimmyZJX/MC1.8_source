package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class asb
/*  4:   */   extends arm
/*  5:   */ {
/*  6:19 */   private TerrainGenerator aD = new OreGenerator(BlockList.monsterEgg.instance().setData(axs.a, EnumMonsterEggVariants.a), 9);
/*  7:20 */   private bio aE = new bio(false);
/*  8:22 */   private int aF = 0;
/*  9:23 */   private int aG = 1;
/* 10:24 */   private int aH = 2;
/* 11:   */   private int aI;
/* 12:   */   
/* 13:   */   protected asb(int paramInt, boolean paramBoolean)
/* 14:   */   {
/* 15:29 */     super(paramInt);
/* 16:30 */     this.aI = this.aF;
/* 17:31 */     if (paramBoolean)
/* 18:   */     {
/* 19:32 */       this.as.A = 3;
/* 20:33 */       this.aI = this.aG;
/* 21:   */     }
/* 22:   */   }
/* 23:   */   
/* 24:   */   public bhc a(Random paramRandom)
/* 25:   */   {
/* 26:39 */     if (paramRandom.nextInt(3) > 0) {
/* 27:40 */       return this.aE;
/* 28:   */     }
/* 29:42 */     return super.a(paramRandom);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void a(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 33:   */   {
/* 34:47 */     super.a(paramaqu, paramRandom, paramdt);
/* 35:   */     
/* 36:   */ 
/* 37:50 */     int i = 3 + paramRandom.nextInt(6);
				int j;
/* 38:   */     int k;
/* 39:   */     int m;
/* 40:51 */     for (j = 0; j < i; j++)
/* 41:   */     {
/* 42:52 */       k = paramRandom.nextInt(16);
/* 43:53 */       m = paramRandom.nextInt(28) + 4;
/* 44:54 */       int n = paramRandom.nextInt(16);
/* 45:   */       
/* 46:56 */       BlockPosition localdt = paramdt.offset(k, m, n);
/* 47:57 */       if (paramaqu.getBlock(localdt).getType() == BlockList.stone) {
/* 48:58 */         paramaqu.setBlock(localdt, BlockList.bP.instance(), 2);
/* 49:   */       }
/* 50:   */     }
/* 51:63 */     for (i = 0; i < 7; i++)
/* 52:   */     {
/* 53:64 */       j = paramRandom.nextInt(16);
/* 54:65 */       k = paramRandom.nextInt(64);
/* 55:66 */       m = paramRandom.nextInt(16);
/* 56:67 */       this.aD.generate(paramaqu, paramRandom, paramdt.offset(j, k, m));
/* 57:   */     }
/* 58:   */   }
/* 59:   */   
/* 60:   */   public void a(World paramaqu, Random paramRandom, bgk parambgk, int paramInt1, int paramInt2, double paramDouble)
/* 61:   */   {
/* 62:73 */     this.ak = BlockList.grass.instance();
/* 63:74 */     this.al = BlockList.dirt.instance();
/* 64:75 */     if (((paramDouble < -1.0D) || (paramDouble > 2.0D)) && (this.aI == this.aH))
/* 65:   */     {
/* 66:76 */       this.ak = BlockList.gravel.instance();
/* 67:77 */       this.al = BlockList.gravel.instance();
/* 68:   */     }
/* 69:78 */     else if ((paramDouble > 1.0D) && (this.aI != this.aG))
/* 70:   */     {
/* 71:79 */       this.ak = BlockList.stone.instance();
/* 72:80 */       this.al = BlockList.stone.instance();
/* 73:   */     }
/* 74:82 */     b(paramaqu, paramRandom, parambgk, paramInt1, paramInt2, paramDouble);
/* 75:   */   }
/* 76:   */   
/* 77:   */   private asb b(arm paramarm)
/* 78:   */   {
/* 79:86 */     this.aI = this.aH;
/* 80:   */     
/* 81:88 */     a(paramarm.ai, true);
/* 82:89 */     a(paramarm.ah + " M");
/* 83:90 */     a(new aro(paramarm.an, paramarm.ao));
/* 84:91 */     a(paramarm.ap, paramarm.aq);
/* 85:92 */     return this;
/* 86:   */   }
/* 87:   */   
/* 88:   */   protected arm d(int paramInt)
/* 89:   */   {
/* 90:97 */     return new asb(paramInt, false).b(this);
/* 91:   */   }
/* 92:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asb
 * JD-Core Version:    0.7.0.1
 */