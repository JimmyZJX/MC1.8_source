package net.minecraft.src;
/*   1:    */ import java.nio.Buffer;
/*   2:    */ import java.nio.FloatBuffer;
/*   3:    */ 
/*   4:    */ public class coy
/*   5:    */   extends cpa
/*   6:    */ {
/*   7: 33 */   private static coy e = new coy();
/*   8:    */   
/*   9:    */   public static cpa a()
/*  10:    */   {
/*  11: 36 */     e.b();
/*  12: 37 */     return e;
/*  13:    */   }
/*  14:    */   
/*  15:    */   private void a(float[] paramArrayOfFloat)
/*  16:    */   {
/*  17: 50 */     float f1 = MathUtils.sqrt(paramArrayOfFloat[0] * paramArrayOfFloat[0] + paramArrayOfFloat[1] * paramArrayOfFloat[1] + paramArrayOfFloat[2] * paramArrayOfFloat[2]);
/*  18:    */     
/*  19:    */ 
/*  20:    */ 
/*  21: 54 */     paramArrayOfFloat[0] /= f1;
/*  22: 55 */     paramArrayOfFloat[1] /= f1;
/*  23: 56 */     paramArrayOfFloat[2] /= f1;
/*  24: 57 */     paramArrayOfFloat[3] /= f1;
/*  25:    */   }
/*  26:    */   
/*  27: 60 */   private FloatBuffer f = bst.h(16);
/*  28: 61 */   private FloatBuffer g = bst.h(16);
/*  29: 62 */   private FloatBuffer h = bst.h(16);
/*  30:    */   
/*  31:    */   public void b()
/*  32:    */   {
/*  33: 65 */     this.f.clear();
/*  34: 66 */     this.g.clear();
/*  35: 67 */     this.h.clear();
/*  36:    */     
/*  37:    */ 
/*  38:    */ 
/*  39:    */ 
/*  40: 72 */     cjm.glGetFloat(2983, this.f);
/*  41:    */     
/*  42:    */ 
/*  43:    */ 
/*  44: 76 */     cjm.glGetFloat(2982, this.g);
/*  45:    */     
/*  46: 78 */     float[] arrayOfFloat1 = this.b;
/*  47: 79 */     float[] arrayOfFloat2 = this.c;
/*  48:    */     
/*  49: 81 */     this.f.flip().limit(16);
/*  50: 82 */     this.f.get(arrayOfFloat1);
/*  51: 83 */     this.g.flip().limit(16);
/*  52: 84 */     this.g.get(arrayOfFloat2);
/*  53:    */     
/*  54:    */ 
/*  55:    */ 
/*  56:    */ 
/*  57: 89 */     this.d[0] = (arrayOfFloat2[0] * arrayOfFloat1[0] + arrayOfFloat2[1] * arrayOfFloat1[4] + arrayOfFloat2[2] * arrayOfFloat1[8] + arrayOfFloat2[3] * arrayOfFloat1[12]);
/*  58: 90 */     this.d[1] = (arrayOfFloat2[0] * arrayOfFloat1[1] + arrayOfFloat2[1] * arrayOfFloat1[5] + arrayOfFloat2[2] * arrayOfFloat1[9] + arrayOfFloat2[3] * arrayOfFloat1[13]);
/*  59: 91 */     this.d[2] = (arrayOfFloat2[0] * arrayOfFloat1[2] + arrayOfFloat2[1] * arrayOfFloat1[6] + arrayOfFloat2[2] * arrayOfFloat1[10] + arrayOfFloat2[3] * arrayOfFloat1[14]);
/*  60: 92 */     this.d[3] = (arrayOfFloat2[0] * arrayOfFloat1[3] + arrayOfFloat2[1] * arrayOfFloat1[7] + arrayOfFloat2[2] * arrayOfFloat1[11] + arrayOfFloat2[3] * arrayOfFloat1[15]);
/*  61:    */     
/*  62: 94 */     this.d[4] = (arrayOfFloat2[4] * arrayOfFloat1[0] + arrayOfFloat2[5] * arrayOfFloat1[4] + arrayOfFloat2[6] * arrayOfFloat1[8] + arrayOfFloat2[7] * arrayOfFloat1[12]);
/*  63: 95 */     this.d[5] = (arrayOfFloat2[4] * arrayOfFloat1[1] + arrayOfFloat2[5] * arrayOfFloat1[5] + arrayOfFloat2[6] * arrayOfFloat1[9] + arrayOfFloat2[7] * arrayOfFloat1[13]);
/*  64: 96 */     this.d[6] = (arrayOfFloat2[4] * arrayOfFloat1[2] + arrayOfFloat2[5] * arrayOfFloat1[6] + arrayOfFloat2[6] * arrayOfFloat1[10] + arrayOfFloat2[7] * arrayOfFloat1[14]);
/*  65: 97 */     this.d[7] = (arrayOfFloat2[4] * arrayOfFloat1[3] + arrayOfFloat2[5] * arrayOfFloat1[7] + arrayOfFloat2[6] * arrayOfFloat1[11] + arrayOfFloat2[7] * arrayOfFloat1[15]);
/*  66:    */     
/*  67: 99 */     this.d[8] = (arrayOfFloat2[8] * arrayOfFloat1[0] + arrayOfFloat2[9] * arrayOfFloat1[4] + arrayOfFloat2[10] * arrayOfFloat1[8] + arrayOfFloat2[11] * arrayOfFloat1[12]);
/*  68:100 */     this.d[9] = (arrayOfFloat2[8] * arrayOfFloat1[1] + arrayOfFloat2[9] * arrayOfFloat1[5] + arrayOfFloat2[10] * arrayOfFloat1[9] + arrayOfFloat2[11] * arrayOfFloat1[13]);
/*  69:101 */     this.d[10] = (arrayOfFloat2[8] * arrayOfFloat1[2] + arrayOfFloat2[9] * arrayOfFloat1[6] + arrayOfFloat2[10] * arrayOfFloat1[10] + arrayOfFloat2[11] * arrayOfFloat1[14]);
/*  70:102 */     this.d[11] = (arrayOfFloat2[8] * arrayOfFloat1[3] + arrayOfFloat2[9] * arrayOfFloat1[7] + arrayOfFloat2[10] * arrayOfFloat1[11] + arrayOfFloat2[11] * arrayOfFloat1[15]);
/*  71:    */     
/*  72:104 */     this.d[12] = (arrayOfFloat2[12] * arrayOfFloat1[0] + arrayOfFloat2[13] * arrayOfFloat1[4] + arrayOfFloat2[14] * arrayOfFloat1[8] + arrayOfFloat2[15] * arrayOfFloat1[12]);
/*  73:105 */     this.d[13] = (arrayOfFloat2[12] * arrayOfFloat1[1] + arrayOfFloat2[13] * arrayOfFloat1[5] + arrayOfFloat2[14] * arrayOfFloat1[9] + arrayOfFloat2[15] * arrayOfFloat1[13]);
/*  74:106 */     this.d[14] = (arrayOfFloat2[12] * arrayOfFloat1[2] + arrayOfFloat2[13] * arrayOfFloat1[6] + arrayOfFloat2[14] * arrayOfFloat1[10] + arrayOfFloat2[15] * arrayOfFloat1[14]);
/*  75:107 */     this.d[15] = (arrayOfFloat2[12] * arrayOfFloat1[3] + arrayOfFloat2[13] * arrayOfFloat1[7] + arrayOfFloat2[14] * arrayOfFloat1[11] + arrayOfFloat2[15] * arrayOfFloat1[15]);
/*  76:    */     
/*  77:    */ 
/*  78:    */ 
/*  79:    */ 
/*  80:    */ 
/*  81:113 */     float[] arrayOfFloat3 = this.a[0];
/*  82:114 */     arrayOfFloat3[0] = (this.d[3] - this.d[0]);
/*  83:115 */     arrayOfFloat3[1] = (this.d[7] - this.d[4]);
/*  84:116 */     arrayOfFloat3[2] = (this.d[11] - this.d[8]);
/*  85:117 */     arrayOfFloat3[3] = (this.d[15] - this.d[12]);
/*  86:    */     
/*  87:119 */     a(arrayOfFloat3);
/*  88:    */     
/*  89:    */ 
/*  90:122 */     float[] arrayOfFloat4 = this.a[1];
/*  91:123 */     arrayOfFloat4[0] = (this.d[3] + this.d[0]);
/*  92:124 */     arrayOfFloat4[1] = (this.d[7] + this.d[4]);
/*  93:125 */     arrayOfFloat4[2] = (this.d[11] + this.d[8]);
/*  94:126 */     arrayOfFloat4[3] = (this.d[15] + this.d[12]);
/*  95:    */     
/*  96:128 */     a(arrayOfFloat4);
/*  97:    */     
/*  98:    */ 
/*  99:131 */     float[] arrayOfFloat5 = this.a[2];
/* 100:132 */     arrayOfFloat5[0] = (this.d[3] + this.d[1]);
/* 101:133 */     arrayOfFloat5[1] = (this.d[7] + this.d[5]);
/* 102:134 */     arrayOfFloat5[2] = (this.d[11] + this.d[9]);
/* 103:135 */     arrayOfFloat5[3] = (this.d[15] + this.d[13]);
/* 104:    */     
/* 105:137 */     a(arrayOfFloat5);
/* 106:    */     
/* 107:    */ 
/* 108:140 */     float[] arrayOfFloat6 = this.a[3];
/* 109:141 */     arrayOfFloat6[0] = (this.d[3] - this.d[1]);
/* 110:142 */     arrayOfFloat6[1] = (this.d[7] - this.d[5]);
/* 111:143 */     arrayOfFloat6[2] = (this.d[11] - this.d[9]);
/* 112:144 */     arrayOfFloat6[3] = (this.d[15] - this.d[13]);
/* 113:    */     
/* 114:146 */     a(arrayOfFloat6);
/* 115:    */     
/* 116:    */ 
/* 117:149 */     float[] arrayOfFloat7 = this.a[4];
/* 118:150 */     arrayOfFloat7[0] = (this.d[3] - this.d[2]);
/* 119:151 */     arrayOfFloat7[1] = (this.d[7] - this.d[6]);
/* 120:152 */     arrayOfFloat7[2] = (this.d[11] - this.d[10]);
/* 121:153 */     arrayOfFloat7[3] = (this.d[15] - this.d[14]);
/* 122:    */     
/* 123:155 */     a(arrayOfFloat7);
/* 124:    */     
/* 125:    */ 
/* 126:158 */     float[] arrayOfFloat8 = this.a[5];
/* 127:159 */     arrayOfFloat8[0] = (this.d[3] + this.d[2]);
/* 128:160 */     arrayOfFloat8[1] = (this.d[7] + this.d[6]);
/* 129:161 */     arrayOfFloat8[2] = (this.d[11] + this.d[10]);
/* 130:162 */     arrayOfFloat8[3] = (this.d[15] + this.d[14]);
/* 131:    */     
/* 132:164 */     a(arrayOfFloat8);
/* 133:    */   }
/* 134:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     coy
 * JD-Core Version:    0.7.0.1
 */