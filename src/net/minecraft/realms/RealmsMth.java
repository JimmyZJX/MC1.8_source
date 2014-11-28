/*   1:    */ package net.minecraft.realms;
/*   2:    */ 
/*   3:    */ import java.util.Random;

import net.minecraft.src.MathUtils;

/*   4:    */ import org.apache.commons.lang3.StringUtils;
/*   6:    */ 
/*   7:    */ public class RealmsMth
/*   8:    */ {
/*   9:    */   public static float sin(float paramFloat)
/*  10:    */   {
/*  11: 10 */     return MathUtils.sin(paramFloat);
/*  12:    */   }
/*  13:    */   
/*  14:    */   public static double nextDouble(Random paramRandom, double paramDouble1, double paramDouble2)
/*  15:    */   {
/*  16: 14 */     return MathUtils.nextDouble(paramRandom, paramDouble1, paramDouble2);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public static int ceil(float paramFloat)
/*  20:    */   {
/*  21: 18 */     return MathUtils.ceil(paramFloat);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public static int floor(double paramDouble)
/*  25:    */   {
/*  26: 22 */     return MathUtils.floor(paramDouble);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public static int intFloorDiv(int paramInt1, int paramInt2)
/*  30:    */   {
/*  31: 26 */     return MathUtils.intFloorDiv(paramInt1, paramInt2);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public static float abs(float paramFloat)
/*  35:    */   {
/*  36: 30 */     return MathUtils.abs(paramFloat);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static int clamp(int paramInt1, int paramInt2, int paramInt3)
/*  40:    */   {
/*  41: 34 */     return MathUtils.clamp(paramInt1, paramInt2, paramInt3);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public static double clampedLerp(double paramDouble1, double paramDouble2, double paramDouble3)
/*  45:    */   {
/*  46: 38 */     return MathUtils.clampedLerp(paramDouble1, paramDouble2, paramDouble3);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public static int ceil(double paramDouble)
/*  50:    */   {
/*  51: 42 */     return MathUtils.ceil(paramDouble);
/*  52:    */   }
/*  53:    */   
/*  54:    */   public static boolean isEmpty(String paramString)
/*  55:    */   {
/*  56: 46 */     return StringUtils.isEmpty(paramString);
/*  57:    */   }
/*  58:    */   
/*  59:    */   public static long lfloor(double paramDouble)
/*  60:    */   {
/*  61: 50 */     return MathUtils.lfloor(paramDouble);
/*  62:    */   }
/*  63:    */   
/*  64:    */   public static float sqrt(double paramDouble)
/*  65:    */   {
/*  66: 54 */     return MathUtils.sqrt(paramDouble);
/*  67:    */   }
/*  68:    */   
/*  69:    */   public static double clamp(double paramDouble1, double paramDouble2, double paramDouble3)
/*  70:    */   {
/*  71: 58 */     return MathUtils.clamp(paramDouble1, paramDouble2, paramDouble3);
/*  72:    */   }
/*  73:    */   
/*  74:    */   public static int getInt(String paramString, int paramInt)
/*  75:    */   {
/*  76: 62 */     return MathUtils.getInt(paramString, paramInt);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public static double getDouble(String paramString, double paramDouble)
/*  80:    */   {
/*  81: 66 */     return MathUtils.getDouble(paramString, paramDouble);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public static int log2(int paramInt)
/*  85:    */   {
/*  86: 70 */     return MathUtils.log2(paramInt);
/*  87:    */   }
/*  88:    */   
/*  89:    */   public static int absFloor(double paramDouble)
/*  90:    */   {
/*  91: 74 */     return MathUtils.absFloor(paramDouble);
/*  92:    */   }
/*  93:    */   
/*  94:    */   public static int smallestEncompassingPowerOfTwo(int paramInt)
/*  95:    */   {
/*  96: 78 */     return MathUtils.smallestEncompassingPowerOfTwo(paramInt);
/*  97:    */   }
/*  98:    */   
/*  99:    */   public static float sqrt(float paramFloat)
/* 100:    */   {
/* 101: 82 */     return MathUtils.sqrt(paramFloat);
/* 102:    */   }
/* 103:    */   
/* 104:    */   public static float cos(float paramFloat)
/* 105:    */   {
/* 106: 86 */     return MathUtils.cos(paramFloat);
/* 107:    */   }
/* 108:    */   
/* 109:    */   public static int getInt(String paramString, int paramInt1, int paramInt2)
/* 110:    */   {
/* 111: 90 */     return MathUtils.getInt(paramString, paramInt1, paramInt2);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public static int fastFloor(double paramDouble)
/* 115:    */   {
/* 116: 94 */     return MathUtils.fastFloor(paramDouble);
/* 117:    */   }
/* 118:    */   
/* 119:    */   public static double absMax(double paramDouble1, double paramDouble2)
/* 120:    */   {
/* 121: 98 */     return MathUtils.absMax(paramDouble1, paramDouble2);
/* 122:    */   }
/* 123:    */   
/* 124:    */   public static float nextFloat(Random paramRandom, float paramFloat1, float paramFloat2)
/* 125:    */   {
/* 126:102 */     return MathUtils.nextFloat(paramRandom, paramFloat1, paramFloat2);
/* 127:    */   }
/* 128:    */   
/* 129:    */   public static double wrapDegrees(double paramDouble)
/* 130:    */   {
/* 131:106 */     return MathUtils.wrapDegrees(paramDouble);
/* 132:    */   }
/* 133:    */   
/* 134:    */   public static float wrapDegrees(float paramFloat)
/* 135:    */   {
/* 136:110 */     return MathUtils.wrapDegrees(paramFloat);
/* 137:    */   }
/* 138:    */   
/* 139:    */   public static float clamp(float paramFloat1, float paramFloat2, float paramFloat3)
/* 140:    */   {
/* 141:114 */     return MathUtils.clamp(paramFloat1, paramFloat2, paramFloat3);
/* 142:    */   }
/* 143:    */   
/* 144:    */   public static double getDouble(String paramString, double paramDouble1, double paramDouble2)
/* 145:    */   {
/* 146:118 */     return MathUtils.getDouble(paramString, paramDouble1, paramDouble2);
/* 147:    */   }
/* 148:    */   
/* 149:    */   public static int roundUp(int paramInt1, int paramInt2)
/* 150:    */   {
/* 151:122 */     return MathUtils.roundUp(paramInt1, paramInt2);
/* 152:    */   }
/* 153:    */   
/* 154:    */   public static double average(long[] paramArrayOfLong)
/* 155:    */   {
/* 156:126 */     return MathUtils.average(paramArrayOfLong);
/* 157:    */   }
/* 158:    */   
/* 159:    */   public static int floor(float paramFloat)
/* 160:    */   {
/* 161:130 */     return MathUtils.floor(paramFloat);
/* 162:    */   }
/* 163:    */   
/* 164:    */   public static int abs(int paramInt)
/* 165:    */   {
/* 166:134 */     return MathUtils.abs(paramInt);
/* 167:    */   }
/* 168:    */   
/* 169:    */   public static int nextInt(Random paramRandom, int paramInt1, int paramInt2)
/* 170:    */   {
/* 171:138 */     return MathUtils.nextInt(paramRandom, paramInt1, paramInt2);
/* 172:    */   }
/* 173:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.RealmsMth
 * JD-Core Version:    0.7.0.1
 */