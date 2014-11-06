package net.minecraft.src;
/*  1:   */ import java.util.Arrays;
/*  2:   */ 
/*  3:   */ public class cja
/*  4:   */   extends arj
/*  5:   */ {
/*  6:16 */   private static final Block f = BlockList.air.instance();
/*  7:   */   private final BlockPosition g;
/*  8:   */   private int[] h;
/*  9:   */   private Block[] i;
/* 10:   */   
/* 11:   */   public cja(World paramaqu, BlockPosition paramdt1, BlockPosition paramdt2, int paramInt)
/* 12:   */   {
/* 13:26 */     super(paramaqu, paramdt1, paramdt2, paramInt);
/* 14:27 */     this.g = paramdt1.b(new fd(paramInt, paramInt, paramInt));
/* 15:   */     
/* 16:29 */     int j = 8000;
/* 17:30 */     this.h = new int[8000];
/* 18:31 */     Arrays.fill(this.h, -1);
/* 19:32 */     this.i = new Block[8000];
/* 20:   */   }
/* 21:   */   
/* 22:   */   public bcm s(BlockPosition paramdt)
/* 23:   */   {
/* 24:38 */     int j = (paramdt.getX() >> 4) - this.a;
/* 25:39 */     int k = (paramdt.getZ() >> 4) - this.b;
/* 26:   */     
/* 27:41 */     return this.c[j][k].a(paramdt, bfl.b);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public int b(BlockPosition paramdt, int paramInt)
/* 31:   */   {
/* 32:46 */     int j = e(paramdt);
/* 33:47 */     int k = this.h[j];
/* 34:48 */     if (k == -1)
/* 35:   */     {
/* 36:49 */       k = super.b(paramdt, paramInt);
/* 37:50 */       this.h[j] = k;
/* 38:   */     }
/* 39:52 */     return k;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public Block getBlock(BlockPosition paramdt)
/* 43:   */   {
/* 44:57 */     int j = e(paramdt);
/* 45:58 */     Block localbec = this.i[j];
/* 46:59 */     if (localbec == null)
/* 47:   */     {
/* 48:60 */       localbec = c(paramdt);
/* 49:61 */       this.i[j] = localbec;
/* 50:   */     }
/* 51:63 */     return localbec;
/* 52:   */   }
/* 53:   */   
/* 54:   */   private Block c(BlockPosition paramdt)
/* 55:   */   {
/* 56:67 */     if ((paramdt.getY() >= 0) && (paramdt.getY() < 256))
/* 57:   */     {
/* 58:68 */       int j = (paramdt.getX() >> 4) - this.a;
/* 59:69 */       int k = (paramdt.getZ() >> 4) - this.b;
/* 60:   */       
/* 61:71 */       return this.c[j][k].g(paramdt);
/* 62:   */     }
/* 63:74 */     return f;
/* 64:   */   }
/* 65:   */   
/* 66:   */   private int e(BlockPosition paramdt)
/* 67:   */   {
/* 68:78 */     int j = paramdt.getX() - this.g.getX();
/* 69:79 */     int k = paramdt.getY() - this.g.getY();
/* 70:80 */     int m = paramdt.getZ() - this.g.getZ();
/* 71:81 */     return j * 400 + m * 20 + k;
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cja
 * JD-Core Version:    0.7.0.1
 */