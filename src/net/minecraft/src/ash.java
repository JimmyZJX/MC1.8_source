package net.minecraft.src;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class ash
/*  5:   */   extends arm
/*  6:   */ {
/*  7:   */   private boolean aD;
/*  8:15 */   private bhx aE = new bhx();
/*  9:16 */   private bhw aF = new bhw(4);
/* 10:   */   
/* 11:   */   public ash(int paramInt, boolean paramBoolean)
/* 12:   */   {
/* 13:19 */     super(paramInt);
/* 14:20 */     this.aD = paramBoolean;
/* 15:22 */     if (paramBoolean) {
/* 16:23 */       this.ak = BlockList.aJ.instance();
/* 17:   */     }
/* 18:25 */     this.au.clear();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 22:   */   {
/* 23:30 */     if (this.aD)
/* 24:   */     {
/* 25:   */       int j;
/* 26:   */       int k;
/* 27:31 */       for (int i = 0; i < 3; i++)
/* 28:   */       {
/* 29:32 */         j = paramRandom.nextInt(16) + 8;
/* 30:33 */         k = paramRandom.nextInt(16) + 8;
/* 31:34 */         this.aE.generate(paramaqu, paramRandom, paramaqu.m(paramdt.offset(j, 0, k)));
/* 32:   */       }
/* 33:36 */       for (int i = 0; i < 2; i++)
/* 34:   */       {
/* 35:37 */         j = paramRandom.nextInt(16) + 8;
/* 36:38 */         k = paramRandom.nextInt(16) + 8;
/* 37:39 */         this.aF.generate(paramaqu, paramRandom, paramaqu.m(paramdt.offset(j, 0, k)));
/* 38:   */       }
/* 39:   */     }
/* 40:43 */     super.a(paramaqu, paramRandom, paramdt);
/* 41:   */   }
/* 42:   */   
/* 43:   */   public bhc a(Random paramRandom)
/* 44:   */   {
/* 45:48 */     return new bio(false);
/* 46:   */   }
/* 47:   */   
/* 48:   */   protected arm d(int paramInt)
/* 49:   */   {
/* 50:53 */     arm localarm = new ash(paramInt, true).a(13828095, true).a(this.ah + " Spikes").c().a(0.0F, 0.5F).a(new aro(this.an + 0.1F, this.ao + 0.1F));
/* 51:   */     
/* 52:55 */     localarm.an = (this.an + 0.3F);
/* 53:56 */     localarm.ao = (this.ao + 0.4F);
/* 54:   */     
/* 55:58 */     return localarm;
/* 56:   */   }
/* 57:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ash
 * JD-Core Version:    0.7.0.1
 */