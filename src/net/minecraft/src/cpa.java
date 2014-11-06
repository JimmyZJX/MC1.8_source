package net.minecraft.src;
/*   1:    */ public class cpa
/*   2:    */ {
/*   3: 21 */   public float[][] a = new float[6][4];
/*   4: 22 */   public float[] b = new float[16];
/*   5: 23 */   public float[] c = new float[16];
/*   6: 24 */   public float[] d = new float[16];
/*   7:    */   
/*   8:    */   private double a(float[] paramArrayOfFloat, double paramDouble1, double paramDouble2, double paramDouble3)
/*   9:    */   {
/*  10: 80 */     return paramArrayOfFloat[0] * paramDouble1 + paramArrayOfFloat[1] * paramDouble2 + paramArrayOfFloat[2] * paramDouble3 + paramArrayOfFloat[3];
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
/*  14:    */   {
/*  15: 87 */     for (int i = 0; i < 6; i++)
/*  16:    */     {
/*  17: 88 */       float[] arrayOfFloat = this.a[i];
/*  18: 90 */       if (a(arrayOfFloat, paramDouble1, paramDouble2, paramDouble3) <= 0.0D) {
/*  19: 93 */         if (a(arrayOfFloat, paramDouble4, paramDouble2, paramDouble3) <= 0.0D) {
/*  20: 96 */           if (a(arrayOfFloat, paramDouble1, paramDouble5, paramDouble3) <= 0.0D) {
/*  21: 99 */             if (a(arrayOfFloat, paramDouble4, paramDouble5, paramDouble3) <= 0.0D) {
/*  22:102 */               if (a(arrayOfFloat, paramDouble1, paramDouble2, paramDouble6) <= 0.0D) {
/*  23:105 */                 if (a(arrayOfFloat, paramDouble4, paramDouble2, paramDouble6) <= 0.0D) {
/*  24:108 */                   if (a(arrayOfFloat, paramDouble1, paramDouble5, paramDouble6) <= 0.0D) {
/*  25:111 */                     if (a(arrayOfFloat, paramDouble4, paramDouble5, paramDouble6) <= 0.0D) {
/*  26:115 */                       return false;
/*  27:    */                     }
/*  28:    */                   }
/*  29:    */                 }
/*  30:    */               }
/*  31:    */             }
/*  32:    */           }
/*  33:    */         }
/*  34:    */       }
/*  35:    */     }
/*  36:118 */     return true;
/*  37:    */   }
/*  38:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpa
 * JD-Core Version:    0.7.0.1
 */