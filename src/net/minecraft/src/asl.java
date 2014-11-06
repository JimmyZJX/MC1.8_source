package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class asl
/*  5:   */   extends arm
/*  6:   */ {
/*  7:   */   protected arm aE;
/*  8:   */   
/*  9:   */   public asl(int paramInt, arm paramarm)
/* 10:   */   {
/* 11:15 */     super(paramInt);
/* 12:16 */     this.aE = paramarm;
/* 13:17 */     a(paramarm.ai, true);
/* 14:   */     
/* 15:19 */     this.ah = (paramarm.ah + " M");
/* 16:   */     
/* 17:21 */     this.ak = paramarm.ak;
/* 18:22 */     this.al = paramarm.al;
/* 19:23 */     this.am = paramarm.am;
/* 20:24 */     this.an = paramarm.an;
/* 21:25 */     this.ao = paramarm.ao;
/* 22:26 */     this.ap = paramarm.ap;
/* 23:27 */     this.aq = paramarm.aq;
/* 24:28 */     this.ar = paramarm.ar;
/* 25:29 */     this.ax = paramarm.ax;
/* 26:30 */     this.ay = paramarm.ay;
/* 27:   */     
/* 28:32 */     this.au = Lists.newArrayList(paramarm.au);
/* 29:33 */     this.at = Lists.newArrayList(paramarm.at);
/* 30:34 */     this.aw = Lists.newArrayList(paramarm.aw);
/* 31:35 */     this.av = Lists.newArrayList(paramarm.av);
/* 32:   */     
/* 33:37 */     this.ap = paramarm.ap;
/* 34:38 */     this.aq = paramarm.aq;
/* 35:   */     
/* 36:40 */     this.an = (paramarm.an + 0.1F);
/* 37:41 */     this.ao = (paramarm.ao + 0.2F);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void a(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 41:   */   {
/* 42:46 */     this.aE.as.a(paramaqu, paramRandom, this, paramdt);
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void a(World paramaqu, Random paramRandom, bgk parambgk, int paramInt1, int paramInt2, double paramDouble)
/* 46:   */   {
/* 47:51 */     this.aE.a(paramaqu, paramRandom, parambgk, paramInt1, paramInt2, paramDouble);
/* 48:   */   }
/* 49:   */   
/* 50:   */   public float g()
/* 51:   */   {
/* 52:56 */     return this.aE.g();
/* 53:   */   }
/* 54:   */   
/* 55:   */   public bhc a(Random paramRandom)
/* 56:   */   {
/* 57:61 */     return this.aE.a(paramRandom);
/* 58:   */   }
/* 59:   */   
/* 60:   */   public int c(BlockPosition paramdt)
/* 61:   */   {
/* 62:66 */     return this.aE.c(paramdt);
/* 63:   */   }
/* 64:   */   
/* 65:   */   public int b(BlockPosition paramdt)
/* 66:   */   {
/* 67:71 */     return this.aE.b(paramdt);
/* 68:   */   }
/* 69:   */   
/* 70:   */   public Class l()
/* 71:   */   {
/* 72:76 */     return this.aE.l();
/* 73:   */   }
/* 74:   */   
/* 75:   */   public boolean a(arm paramarm)
/* 76:   */   {
/* 77:81 */     return this.aE.a(paramarm);
/* 78:   */   }
/* 79:   */   
/* 80:   */   public arp m()
/* 81:   */   {
/* 82:86 */     return this.aE.m();
/* 83:   */   }
/* 84:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asl
 * JD-Core Version:    0.7.0.1
 */