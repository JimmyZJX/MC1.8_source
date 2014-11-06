package net.minecraft.src;
/*   1:    */ import java.util.Arrays;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class asc
/*   6:    */   extends arz
/*   7:    */ {
/*   8:    */   private arm b;
/*   9:    */   private float c;
/*  10:    */   
/*  11:    */   public asc(arm paramarm, float paramFloat)
/*  12:    */   {
/*  13: 14 */     this.b = paramarm;
/*  14: 15 */     this.c = paramFloat;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public arm a(BlockPosition paramdt)
/*  18:    */   {
/*  19: 20 */     return this.b;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public arm[] a(arm[] paramArrayOfarm, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  23:    */   {
/*  24: 31 */     if ((paramArrayOfarm == null) || (paramArrayOfarm.length < paramInt3 * paramInt4)) {
/*  25: 32 */       paramArrayOfarm = new arm[paramInt3 * paramInt4];
/*  26:    */     }
/*  27: 35 */     Arrays.fill(paramArrayOfarm, 0, paramInt3 * paramInt4, this.b);
/*  28:    */     
/*  29: 37 */     return paramArrayOfarm;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public float[] a(float[] paramArrayOfFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  33:    */   {
/*  34: 42 */     if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length < paramInt3 * paramInt4)) {
/*  35: 43 */       paramArrayOfFloat = new float[paramInt3 * paramInt4];
/*  36:    */     }
/*  37: 45 */     Arrays.fill(paramArrayOfFloat, 0, paramInt3 * paramInt4, this.c);
/*  38:    */     
/*  39: 47 */     return paramArrayOfFloat;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public arm[] b(arm[] paramArrayOfarm, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  43:    */   {
/*  44: 61 */     if ((paramArrayOfarm == null) || (paramArrayOfarm.length < paramInt3 * paramInt4)) {
/*  45: 62 */       paramArrayOfarm = new arm[paramInt3 * paramInt4];
/*  46:    */     }
/*  47: 65 */     Arrays.fill(paramArrayOfarm, 0, paramInt3 * paramInt4, this.b);
/*  48:    */     
/*  49: 67 */     return paramArrayOfarm;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public arm[] a(arm[] paramArrayOfarm, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
/*  53:    */   {
/*  54: 72 */     return b(paramArrayOfarm, paramInt1, paramInt2, paramInt3, paramInt4);
/*  55:    */   }
/*  56:    */   
/*  57:    */   public BlockPosition a(int paramInt1, int paramInt2, int paramInt3, List paramList, Random paramRandom)
/*  58:    */   {
/*  59: 86 */     if (paramList.contains(this.b)) {
/*  60: 87 */       return new BlockPosition(paramInt1 - paramInt3 + paramRandom.nextInt(paramInt3 * 2 + 1), 0, paramInt2 - paramInt3 + paramRandom.nextInt(paramInt3 * 2 + 1));
/*  61:    */     }
/*  62: 90 */     return null;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public boolean a(int paramInt1, int paramInt2, int paramInt3, List paramList)
/*  66:    */   {
/*  67:100 */     return paramList.contains(this.b);
/*  68:    */   }
/*  69:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asc
 * JD-Core Version:    0.7.0.1
 */