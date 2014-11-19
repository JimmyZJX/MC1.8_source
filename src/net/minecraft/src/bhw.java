package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhw
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   private ProtoBlock a;
/*  7:   */   private int b;
/*  8:   */   
/*  9:   */   public bhw(int paramInt)
/* 10:   */   {
/* 11:15 */     this.a = BlockList.cB;
/* 12:16 */     this.b = paramInt;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 16:   */   {
/* 17:21 */     while ((paramaqu.isEmpty(paramdt)) && (paramdt.getY() > 2)) {
/* 18:22 */       paramdt = paramdt.down();
/* 19:   */     }
/* 20:25 */     if (paramaqu.getBlock(paramdt).getProto() != BlockList.aJ) {
/* 21:26 */       return false;
/* 22:   */     }
/* 23:28 */     int i = paramRandom.nextInt(this.b - 2) + 2;
/* 24:29 */     int j = 1;
/* 25:30 */     for (int k = paramdt.getX() - i; k <= paramdt.getX() + i; k++) {
/* 26:31 */       for (int m = paramdt.getZ() - i; m <= paramdt.getZ() + i; m++)
/* 27:   */       {
/* 28:32 */         int n = k - paramdt.getX();
/* 29:33 */         int i1 = m - paramdt.getZ();
/* 30:34 */         if (n * n + i1 * i1 <= i * i) {
/* 31:37 */           for (int i2 = paramdt.getY() - j; i2 <= paramdt.getY() + j; i2++)
/* 32:   */           {
/* 33:38 */             BlockPosition localdt = new BlockPosition(k, i2, m);
/* 34:39 */             ProtoBlock localatr = paramaqu.getBlock(localdt).getProto();
/* 35:40 */             if ((localatr == BlockList.dirt) || (localatr == BlockList.aJ) || (localatr == BlockList.aI)) {
/* 36:41 */               paramaqu.setBlock(localdt, this.a.instance(), 2);
/* 37:   */             }
/* 38:   */           }
/* 39:   */         }
/* 40:   */       }
/* 41:   */     }
/* 42:47 */     return true;
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhw
 * JD-Core Version:    0.7.0.1
 */