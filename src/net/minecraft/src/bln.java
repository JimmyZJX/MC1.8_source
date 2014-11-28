package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ abstract class bln
/*  4:   */   extends bms
/*  5:   */ {
/*  6:   */   protected int a;
/*  7:   */   protected int b;
/*  8:   */   protected int c;
/*  9:29 */   protected int d = -1;
/* 10:   */   
/* 11:   */   public bln() {}
/* 12:   */   
/* 13:   */   protected bln(Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/* 14:   */   {
/* 15:36 */     super(0);
/* 16:   */     
/* 17:38 */     this.a = paramInt4;
/* 18:39 */     this.b = paramInt5;
/* 19:40 */     this.c = paramInt6;
/* 20:   */     
/* 21:42 */     this.m = EnumHorizontalVertical.HORIZONTAL.getRandomDirection(paramRandom);
/* 22:44 */     switch (blj.a[this.m.ordinal()])
/* 23:   */     {
/* 24:   */     case 1: 
/* 25:   */     case 2: 
/* 26:47 */       this.l = new bjb(paramInt1, paramInt2, paramInt3, paramInt1 + paramInt4 - 1, paramInt2 + paramInt5 - 1, paramInt3 + paramInt6 - 1);
/* 27:48 */       break;
/* 28:   */     default: 
/* 29:50 */       this.l = new bjb(paramInt1, paramInt2, paramInt3, paramInt1 + paramInt6 - 1, paramInt2 + paramInt5 - 1, paramInt3 + paramInt4 - 1);
/* 30:   */     }
/* 31:   */   }
/* 32:   */   
/* 33:   */   protected void a(NBTTagCompound paramfn)
/* 34:   */   {
/* 35:57 */     paramfn.setInt("Width", this.a);
/* 36:58 */     paramfn.setInt("Height", this.b);
/* 37:59 */     paramfn.setInt("Depth", this.c);
/* 38:60 */     paramfn.setInt("HPos", this.d);
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected void b(NBTTagCompound paramfn)
/* 42:   */   {
/* 43:65 */     this.a = paramfn.getInteger("Width");
/* 44:66 */     this.b = paramfn.getInteger("Height");
/* 45:67 */     this.c = paramfn.getInteger("Depth");
/* 46:68 */     this.d = paramfn.getInteger("HPos");
/* 47:   */   }
/* 48:   */   
/* 49:   */   protected boolean a(World paramaqu, bjb parambjb, int paramInt)
/* 50:   */   {
/* 51:72 */     if (this.d >= 0) {
/* 52:73 */       return true;
/* 53:   */     }
/* 54:76 */     int i = 0;
/* 55:77 */     int j = 0;
/* 56:78 */     for (int k = this.l.c; k <= this.l.f; k++) {
/* 57:79 */       for (int m = this.l.a; m <= this.l.d; m++)
/* 58:   */       {
/* 59:80 */         BlockPosition localdt = new BlockPosition(m, 64, k);
/* 60:81 */         if (parambjb.b(localdt))
/* 61:   */         {
/* 62:82 */           i += Math.max(paramaqu.r(localdt).getY(), paramaqu.t.i());
/* 63:83 */           j++;
/* 64:   */         }
/* 65:   */       }
/* 66:   */     }
/* 67:88 */     if (j == 0) {
/* 68:89 */       return false;
/* 69:   */     }
/* 70:91 */     this.d = (i / j);
/* 71:92 */     this.l.a(0, this.d - this.l.b + paramInt, 0);
/* 72:93 */     return true;
/* 73:   */   }
/* 74:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bln
 * JD-Core Version:    0.7.0.1
 */