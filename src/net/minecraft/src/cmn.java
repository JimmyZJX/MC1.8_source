package net.minecraft.src;
/*  1:   */ import java.util.Arrays;
/*  2:   */ 
/*  3:   */ public class cmn
/*  4:   */   extends clt
/*  5:   */ {
/*  6:   */   private final cue d;
/*  7:   */   
/*  8:   */   public cmn(clt paramclt, cue paramcue)
/*  9:   */   {
/* 10:13 */     super(Arrays.copyOf(paramclt.a(), paramclt.a().length), paramclt.b, cmp.a(paramclt.a()));
/* 11:14 */     this.d = paramcue;
/* 12:15 */     e();
/* 13:   */   }
/* 14:   */   
/* 15:   */   private void e()
/* 16:   */   {
/* 17:19 */     for (int i = 0; i < 4; i++) {
/* 18:20 */       a(i);
/* 19:   */     }
/* 20:   */   }
/* 21:   */   
/* 22:   */   private void a(int paramInt)
/* 23:   */   {
/* 24:25 */     int i = 7 * paramInt;
/* 25:26 */     float f1 = Float.intBitsToFloat(this.a[i]);
/* 26:27 */     float f2 = Float.intBitsToFloat(this.a[(i + 1)]);
/* 27:28 */     float f3 = Float.intBitsToFloat(this.a[(i + 2)]);
/* 28:29 */     float f4 = 0.0F;
/* 29:30 */     float f5 = 0.0F;
/* 30:31 */     switch (cmo.a[this.c.ordinal()])
/* 31:   */     {
/* 32:   */     case 1: 
/* 33:34 */       f4 = f1 * 16.0F;
/* 34:35 */       f5 = (1.0F - f3) * 16.0F;
/* 35:36 */       break;
/* 36:   */     case 2: 
/* 37:39 */       f4 = f1 * 16.0F;
/* 38:40 */       f5 = f3 * 16.0F;
/* 39:41 */       break;
/* 40:   */     case 3: 
/* 41:44 */       f4 = (1.0F - f1) * 16.0F;
/* 42:45 */       f5 = (1.0F - f2) * 16.0F;
/* 43:46 */       break;
/* 44:   */     case 4: 
/* 45:49 */       f4 = f1 * 16.0F;
/* 46:50 */       f5 = (1.0F - f2) * 16.0F;
/* 47:51 */       break;
/* 48:   */     case 5: 
/* 49:54 */       f4 = f3 * 16.0F;
/* 50:55 */       f5 = (1.0F - f2) * 16.0F;
/* 51:56 */       break;
/* 52:   */     case 6: 
/* 53:59 */       f4 = (1.0F - f3) * 16.0F;
/* 54:60 */       f5 = (1.0F - f2) * 16.0F;
/* 55:   */     }
/* 56:63 */     this.a[(i + 4)] = Float.floatToRawIntBits(this.d.a(f4));
/* 57:64 */     this.a[(i + 4 + 1)] = Float.floatToRawIntBits(this.d.b(f5));
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmn
 * JD-Core Version:    0.7.0.1
 */