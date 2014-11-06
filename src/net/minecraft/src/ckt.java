package net.minecraft.src;
/*  1:   */ import java.nio.FloatBuffer;
/*  2:   */ import java.util.Comparator;
/*  3:   */ 
/*  4:   */ public class ckt
/*  5:   */   implements Comparator<Integer>
/*  6:   */ {
/*  7:   */   private float a;
/*  8:   */   private float b;
/*  9:   */   private float c;
/* 10:   */   private FloatBuffer d;
/* 11:   */   private int e;
/* 12:   */   
/* 13:   */   public ckt(FloatBuffer paramFloatBuffer, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
/* 14:   */   {
/* 15:16 */     this.d = paramFloatBuffer;
/* 16:17 */     this.a = paramFloat1;
/* 17:18 */     this.b = paramFloat2;
/* 18:19 */     this.c = paramFloat3;
/* 19:20 */     this.e = paramInt;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public int compare(Integer paramInteger1, Integer paramInteger2)
/* 23:   */   {
/* 24:25 */     float f1 = this.d.get(paramInteger1.intValue()) - this.a;
/* 25:26 */     float f2 = this.d.get(paramInteger1.intValue() + 1) - this.b;
/* 26:27 */     float f3 = this.d.get(paramInteger1.intValue() + 2) - this.c;
/* 27:28 */     float f4 = this.d.get(paramInteger1.intValue() + this.e + 0) - this.a;
/* 28:29 */     float f5 = this.d.get(paramInteger1.intValue() + this.e + 1) - this.b;
/* 29:30 */     float f6 = this.d.get(paramInteger1.intValue() + this.e + 2) - this.c;
/* 30:31 */     float f7 = this.d.get(paramInteger1.intValue() + this.e * 2 + 0) - this.a;
/* 31:32 */     float f8 = this.d.get(paramInteger1.intValue() + this.e * 2 + 1) - this.b;
/* 32:33 */     float f9 = this.d.get(paramInteger1.intValue() + this.e * 2 + 2) - this.c;
/* 33:34 */     float f10 = this.d.get(paramInteger1.intValue() + this.e * 3 + 0) - this.a;
/* 34:35 */     float f11 = this.d.get(paramInteger1.intValue() + this.e * 3 + 1) - this.b;
/* 35:36 */     float f12 = this.d.get(paramInteger1.intValue() + this.e * 3 + 2) - this.c;
/* 36:   */     
/* 37:38 */     float f13 = this.d.get(paramInteger2.intValue()) - this.a;
/* 38:39 */     float f14 = this.d.get(paramInteger2.intValue() + 1) - this.b;
/* 39:40 */     float f15 = this.d.get(paramInteger2.intValue() + 2) - this.c;
/* 40:41 */     float f16 = this.d.get(paramInteger2.intValue() + this.e + 0) - this.a;
/* 41:42 */     float f17 = this.d.get(paramInteger2.intValue() + this.e + 1) - this.b;
/* 42:43 */     float f18 = this.d.get(paramInteger2.intValue() + this.e + 2) - this.c;
/* 43:44 */     float f19 = this.d.get(paramInteger2.intValue() + this.e * 2 + 0) - this.a;
/* 44:45 */     float f20 = this.d.get(paramInteger2.intValue() + this.e * 2 + 1) - this.b;
/* 45:46 */     float f21 = this.d.get(paramInteger2.intValue() + this.e * 2 + 2) - this.c;
/* 46:47 */     float f22 = this.d.get(paramInteger2.intValue() + this.e * 3 + 0) - this.a;
/* 47:48 */     float f23 = this.d.get(paramInteger2.intValue() + this.e * 3 + 1) - this.b;
/* 48:49 */     float f24 = this.d.get(paramInteger2.intValue() + this.e * 3 + 2) - this.c;
/* 49:   */     
/* 50:51 */     float f25 = (f1 + f4 + f7 + f10) * 0.25F;
/* 51:52 */     float f26 = (f2 + f5 + f8 + f11) * 0.25F;
/* 52:53 */     float f27 = (f3 + f6 + f9 + f12) * 0.25F;
/* 53:   */     
/* 54:55 */     float f28 = (f13 + f16 + f19 + f22) * 0.25F;
/* 55:56 */     float f29 = (f14 + f17 + f20 + f23) * 0.25F;
/* 56:57 */     float f30 = (f15 + f18 + f21 + f24) * 0.25F;
/* 57:   */     
/* 58:59 */     float f31 = f25 * f25 + f26 * f26 + f27 * f27;
/* 59:60 */     float f32 = f28 * f28 + f29 * f29 + f30 * f30;
/* 60:   */     
/* 61:62 */     return Float.compare(f32, f31);
/* 62:   */   }
/* 63:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ckt
 * JD-Core Version:    0.7.0.1
 */