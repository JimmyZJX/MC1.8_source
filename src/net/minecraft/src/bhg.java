package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhg
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   private final ProtoBlock a;
/*  7:   */   private final int b;
/*  8:   */   
/*  9:   */   public bhg(ProtoBlock paramatr, int paramInt)
/* 10:   */   {
/* 11:15 */     super(false);
/* 12:16 */     this.a = paramatr;
/* 13:17 */     this.b = paramInt;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 17:   */   {
/* 18:22 */     while (paramdt.getY() > 3)
/* 19:   */     {
/* 20:23 */       if (!paramaqu.d(paramdt.down()))
/* 21:   */       {
/* 22:24 */         ProtoBlock localatr = paramaqu.getBlock(paramdt.down()).getProto();
/* 23:25 */         if ((localatr == BlockList.grass) || (localatr == BlockList.dirt) || (localatr == BlockList.stone)) {
/* 24:   */           break;
/* 25:   */         }
/* 26:   */       }
/* 27:29 */       paramdt = paramdt.down();
/* 28:   */     }
/* 29:31 */     if (paramdt.getY() <= 3) {
/* 30:32 */       return false;
/* 31:   */     }
/* 32:35 */     int i = this.b;
/* 33:36 */     int j = 0;
/* 34:37 */     while ((i >= 0) && (j < 3))
/* 35:   */     {
/* 36:38 */       int k = i + paramRandom.nextInt(2);
/* 37:39 */       int m = i + paramRandom.nextInt(2);
/* 38:40 */       int n = i + paramRandom.nextInt(2);
/* 39:41 */       float f = (k + m + n) * 0.333F + 0.5F;
/* 40:43 */       for (BlockPosition localdt : BlockPosition.a(paramdt.offset(-k, -m, -n), paramdt.offset(k, m, n))) {
/* 41:44 */         if (localdt.i(paramdt) <= f * f) {
/* 42:45 */           paramaqu.setBlock(localdt, this.a.instance(), 4);
/* 43:   */         }
/* 44:   */       }
/* 45:49 */       paramdt = paramdt.offset(-(i + 1) + paramRandom.nextInt(2 + i * 2), 0 - paramRandom.nextInt(2), -(i + 1) + paramRandom.nextInt(2 + i * 2));
/* 46:50 */       j++;
/* 47:   */     }
/* 48:53 */     return true;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhg
 * JD-Core Version:    0.7.0.1
 */