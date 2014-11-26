package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class asu
/*   5:    */   extends arm
/*   6:    */ {
/*   7: 16 */   private static final big aD = new big();
/*   8: 17 */   private static final bio aE = new bio(false);
/*   9: 18 */   private static final bib aF = new bib(false, false);
/*  10: 19 */   private static final bib aG = new bib(false, true);
/*  11: 20 */   private static final bhg aH = new bhg(BlockList.mossyCobblestone, 0);
/*  12:    */   private int aI;
/*  13:    */   
/*  14:    */   public asu(int paramInt1, int paramInt2)
/*  15:    */   {
/*  16: 29 */     super(paramInt1);
/*  17: 30 */     this.aI = paramInt2;
/*  18:    */     
/*  19: 32 */     this.au.add(new SpawnListEntry(EntityWolf.class, 8, 4, 4));
/*  20:    */     
/*  21: 34 */     this.as.A = 10;
/*  22: 35 */     if ((paramInt2 == 1) || (paramInt2 == 2))
/*  23:    */     {
/*  24: 36 */       this.as.C = 7;
/*  25: 37 */       this.as.D = 1;
/*  26: 38 */       this.as.E = 3;
/*  27:    */     }
/*  28:    */     else
/*  29:    */     {
/*  30: 40 */       this.as.C = 1;
/*  31: 41 */       this.as.E = 1;
/*  32:    */     }
/*  33:    */   }
/*  34:    */   
/*  35:    */   public bhc a(Random paramRandom)
/*  36:    */   {
/*  37: 47 */     if (((this.aI == 1) || (this.aI == 2)) && (paramRandom.nextInt(3) == 0))
/*  38:    */     {
/*  39: 48 */       if ((this.aI == 2) || (paramRandom.nextInt(13) == 0)) {
/*  40: 49 */         return aG;
/*  41:    */       }
/*  42: 51 */       return aF;
/*  43:    */     }
/*  44: 53 */     if (paramRandom.nextInt(3) == 0) {
/*  45: 54 */       return aD;
/*  46:    */     }
/*  47: 56 */     return aE;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public TerrainGenerator b(Random paramRandom)
/*  51:    */   {
/*  52: 61 */     if (paramRandom.nextInt(5) > 0) {
/*  53: 62 */       return new biq(bbi.c);
/*  54:    */     }
/*  55: 64 */     return new biq(bbi.b);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void a(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  59:    */   {
/*  60:    */     int j;
/*  61:    */     int k;
/*  62:    */     int m;
/*  63: 69 */     if ((this.aI == 1) || (this.aI == 2))
/*  64:    */     {
/*  65: 70 */       int i = paramRandom.nextInt(3);
/*  66: 71 */       for (j = 0; j < i; j++)
/*  67:    */       {
/*  68: 72 */         k = paramRandom.nextInt(16) + 8;
/*  69: 73 */         m = paramRandom.nextInt(16) + 8;
/*  70: 74 */         BlockPosition localdt = paramaqu.m(paramdt.offset(k, 0, m));
/*  71: 75 */         aH.generate(paramaqu, paramRandom, localdt);
/*  72:    */       }
/*  73:    */     }
/*  74: 79 */     ag.a(avk.d);
/*  75: 80 */     for (int i = 0; i < 7; i++)
/*  76:    */     {
/*  77: 81 */       j = paramRandom.nextInt(16) + 8;
/*  78: 82 */       k = paramRandom.nextInt(16) + 8;
/*  79: 83 */       m = paramRandom.nextInt(paramaqu.m(paramdt.offset(j, 0, k)).getY() + 32);
/*  80: 84 */       ag.generate(paramaqu, paramRandom, paramdt.offset(j, m, k));
/*  81:    */     }
/*  82: 86 */     super.a(paramaqu, paramRandom, paramdt);
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void a(World paramaqu, Random paramRandom, bgk parambgk, int paramInt1, int paramInt2, double paramDouble)
/*  86:    */   {
/*  87: 91 */     if ((this.aI == 1) || (this.aI == 2))
/*  88:    */     {
/*  89: 92 */       this.ak = BlockList.grass.instance();
/*  90: 93 */       this.al = BlockList.dirt.instance();
/*  91: 94 */       if (paramDouble > 1.75D) {
/*  92: 95 */         this.ak = BlockList.dirt.instance().setData(BlockDirt.a, avd.b);
/*  93: 96 */       } else if (paramDouble > -0.95D) {
/*  94: 97 */         this.ak = BlockList.dirt.instance().setData(BlockDirt.a, avd.c);
/*  95:    */       }
/*  96:    */     }
/*  97:100 */     b(paramaqu, paramRandom, parambgk, paramInt1, paramInt2, paramDouble);
/*  98:    */   }
/*  99:    */   
/* 100:    */   protected arm d(int paramInt)
/* 101:    */   {
/* 102:105 */     if (this.az == arm.V.az) {
/* 103:106 */       return new asu(paramInt, 2).a(5858897, true).a("Mega Spruce Taiga").a(5159473).a(0.25F, 0.8F).a(new aro(this.an, this.ao));
/* 104:    */     }
/* 105:108 */     return super.d(paramInt);
/* 106:    */   }
/* 107:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asu
 * JD-Core Version:    0.7.0.1
 */