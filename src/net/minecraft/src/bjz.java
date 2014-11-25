package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bjz
/*    5:     */   extends bkb
/*    6:     */ {
/*    7:     */   public bjz() {}
/*    8:     */   
/*    9:     */   public bjz(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   10:     */   {
/*   11: 956 */     super(paramInt);
/*   12:     */     
/*   13: 958 */     this.m = paramej;
/*   14: 959 */     this.l = parambjb;
/*   15:     */   }
/*   16:     */   
/*   17:     */   public void a(bms parambms, List paramList, Random paramRandom)
/*   18:     */   {
/*   19: 964 */     a((bkf)parambms, paramList, paramRandom, 5, 3, true);
/*   20: 965 */     a((bkf)parambms, paramList, paramRandom, 5, 11, true);
/*   21:     */   }
/*   22:     */   
/*   23:     */   public static bjz a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   24:     */   {
/*   25: 969 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -5, -3, 0, 13, 14, 13, paramej);
/*   26: 971 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   27: 972 */       return null;
/*   28:     */     }
/*   29: 975 */     return new bjz(paramInt4, paramRandom, localbjb, paramej);
/*   30:     */   }
/*   31:     */   
/*   32:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   33:     */   {
/*   34: 981 */     a(paramaqu, parambjb, 0, 3, 0, 12, 4, 12, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   35:     */     
/*   36: 983 */     a(paramaqu, parambjb, 0, 5, 0, 12, 13, 12, BlockList.air.instance(), BlockList.air.instance(), false);
/*   37:     */     
/*   38:     */ 
/*   39: 986 */     a(paramaqu, parambjb, 0, 5, 0, 1, 12, 12, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   40: 987 */     a(paramaqu, parambjb, 11, 5, 0, 12, 12, 12, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   41: 988 */     a(paramaqu, parambjb, 2, 5, 11, 4, 12, 12, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   42: 989 */     a(paramaqu, parambjb, 8, 5, 11, 10, 12, 12, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   43: 990 */     a(paramaqu, parambjb, 5, 9, 11, 7, 12, 12, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   44: 991 */     a(paramaqu, parambjb, 2, 5, 0, 4, 12, 1, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   45: 992 */     a(paramaqu, parambjb, 8, 5, 0, 10, 12, 1, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   46: 993 */     a(paramaqu, parambjb, 5, 9, 0, 7, 12, 1, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   47:     */     
/*   48:     */ 
/*   49: 996 */     a(paramaqu, parambjb, 2, 11, 2, 10, 12, 10, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   50: 999 */     for (int i = 1; i <= 11; i += 2)
/*   51:     */     {
/*   52:1000 */       a(paramaqu, parambjb, i, 10, 0, i, 11, 0, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   53:1001 */       a(paramaqu, parambjb, i, 10, 12, i, 11, 12, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   54:1002 */       a(paramaqu, parambjb, 0, 10, i, 0, 11, i, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   55:1003 */       a(paramaqu, parambjb, 12, 10, i, 12, 11, i, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   56:1004 */       a(paramaqu, BlockList.netherBrick.instance(), i, 13, 0, parambjb);
/*   57:1005 */       a(paramaqu, BlockList.netherBrick.instance(), i, 13, 12, parambjb);
/*   58:1006 */       a(paramaqu, BlockList.netherBrick.instance(), 0, 13, i, parambjb);
/*   59:1007 */       a(paramaqu, BlockList.netherBrick.instance(), 12, 13, i, parambjb);
/*   60:1008 */       a(paramaqu, BlockList.bz.instance(), i + 1, 13, 0, parambjb);
/*   61:1009 */       a(paramaqu, BlockList.bz.instance(), i + 1, 13, 12, parambjb);
/*   62:1010 */       a(paramaqu, BlockList.bz.instance(), 0, 13, i + 1, parambjb);
/*   63:1011 */       a(paramaqu, BlockList.bz.instance(), 12, 13, i + 1, parambjb);
/*   64:     */     }
/*   65:1013 */     a(paramaqu, BlockList.bz.instance(), 0, 13, 0, parambjb);
/*   66:1014 */     a(paramaqu, BlockList.bz.instance(), 0, 13, 12, parambjb);
/*   67:1015 */     a(paramaqu, BlockList.bz.instance(), 0, 13, 0, parambjb);
/*   68:1016 */     a(paramaqu, BlockList.bz.instance(), 12, 13, 0, parambjb);
/*   69:1019 */     for (int i = 3; i <= 9; i += 2)
/*   70:     */     {
/*   71:1020 */       a(paramaqu, parambjb, 1, 7, i, 1, 8, i, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   72:1021 */       a(paramaqu, parambjb, 11, 7, i, 11, 8, i, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   73:     */     }
/*   74:1025 */     int i = a(BlockList.bA, 3);
/*   75:1026 */     for (int j = 0; j <= 6; j++)
/*   76:     */     {
/*   77:1027 */       int k = j + 4;
/*   78:1028 */       for (int m = 5; m <= 7; m++) {
/*   79:1029 */         a(paramaqu, BlockList.bA.instance(i), m, 5 + j, k, parambjb);
/*   80:     */       }
/*   81:1031 */       if ((k >= 5) && (k <= 8)) {
/*   82:1032 */         a(paramaqu, parambjb, 5, 5, k, 7, j + 4, k, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   83:1033 */       } else if ((k >= 9) && (k <= 10)) {
/*   84:1034 */         a(paramaqu, parambjb, 5, 8, k, 7, j + 4, k, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   85:     */       }
/*   86:1036 */       if (j >= 1) {
/*   87:1037 */         a(paramaqu, parambjb, 5, 6 + j, k, 7, 9 + j, k, BlockList.air.instance(), BlockList.air.instance(), false);
/*   88:     */       }
/*   89:     */     }
/*   90:1040 */     for (int j = 5; j <= 7; j++) {
/*   91:1041 */       a(paramaqu, BlockList.bA.instance(i), j, 12, 11, parambjb);
/*   92:     */     }
/*   93:1043 */     a(paramaqu, parambjb, 5, 6, 7, 5, 7, 7, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   94:1044 */     a(paramaqu, parambjb, 7, 6, 7, 7, 7, 7, BlockList.bz.instance(), BlockList.bz.instance(), false);
/*   95:1045 */     a(paramaqu, parambjb, 5, 13, 12, 7, 13, 12, BlockList.air.instance(), BlockList.air.instance(), false);
/*   96:     */     
/*   97:     */ 
/*   98:1048 */     a(paramaqu, parambjb, 2, 5, 2, 3, 5, 3, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*   99:1049 */     a(paramaqu, parambjb, 2, 5, 9, 3, 5, 10, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  100:1050 */     a(paramaqu, parambjb, 2, 5, 4, 2, 5, 8, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  101:1051 */     a(paramaqu, parambjb, 9, 5, 2, 10, 5, 3, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  102:1052 */     a(paramaqu, parambjb, 9, 5, 9, 10, 5, 10, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  103:1053 */     a(paramaqu, parambjb, 10, 5, 4, 10, 5, 8, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  104:1054 */     int j = a(BlockList.bA, 0);
/*  105:1055 */     int k = a(BlockList.bA, 1);
/*  106:1056 */     a(paramaqu, BlockList.bA.instance(k), 4, 5, 2, parambjb);
/*  107:1057 */     a(paramaqu, BlockList.bA.instance(k), 4, 5, 3, parambjb);
/*  108:1058 */     a(paramaqu, BlockList.bA.instance(k), 4, 5, 9, parambjb);
/*  109:1059 */     a(paramaqu, BlockList.bA.instance(k), 4, 5, 10, parambjb);
/*  110:1060 */     a(paramaqu, BlockList.bA.instance(j), 8, 5, 2, parambjb);
/*  111:1061 */     a(paramaqu, BlockList.bA.instance(j), 8, 5, 3, parambjb);
/*  112:1062 */     a(paramaqu, BlockList.bA.instance(j), 8, 5, 9, parambjb);
/*  113:1063 */     a(paramaqu, BlockList.bA.instance(j), 8, 5, 10, parambjb);
/*  114:     */     
/*  115:     */ 
/*  116:1066 */     a(paramaqu, parambjb, 3, 4, 4, 4, 4, 8, BlockList.soulSand.instance(), BlockList.soulSand.instance(), false);
/*  117:1067 */     a(paramaqu, parambjb, 8, 4, 4, 9, 4, 8, BlockList.soulSand.instance(), BlockList.soulSand.instance(), false);
/*  118:1068 */     a(paramaqu, parambjb, 3, 5, 4, 4, 5, 8, BlockList.bB.instance(), BlockList.bB.instance(), false);
/*  119:1069 */     a(paramaqu, parambjb, 8, 5, 4, 9, 5, 8, BlockList.bB.instance(), BlockList.bB.instance(), false);
/*  120:     */     
/*  121:     */ 
/*  122:1072 */     a(paramaqu, parambjb, 4, 2, 0, 8, 2, 12, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  123:1073 */     a(paramaqu, parambjb, 0, 2, 4, 12, 2, 8, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  124:     */     
/*  125:1075 */     a(paramaqu, parambjb, 4, 0, 0, 8, 1, 3, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  126:1076 */     a(paramaqu, parambjb, 4, 0, 9, 8, 1, 12, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  127:1077 */     a(paramaqu, parambjb, 0, 0, 4, 3, 1, 8, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  128:1078 */     a(paramaqu, parambjb, 9, 0, 4, 12, 1, 8, BlockList.netherBrick.instance(), BlockList.netherBrick.instance(), false);
/*  129:     */     int n;
/*  130:1080 */     for (int m = 4; m <= 8; m++) {
/*  131:1081 */       for (n = 0; n <= 2; n++)
/*  132:     */       {
/*  133:1082 */         b(paramaqu, BlockList.netherBrick.instance(), m, -1, n, parambjb);
/*  134:1083 */         b(paramaqu, BlockList.netherBrick.instance(), m, -1, 12 - n, parambjb);
/*  135:     */       }
/*  136:     */     }
/*  137:1086 */     for (int m = 0; m <= 2; m++) {
/*  138:1087 */       for (n = 4; n <= 8; n++)
/*  139:     */       {
/*  140:1088 */         b(paramaqu, BlockList.netherBrick.instance(), m, -1, n, parambjb);
/*  141:1089 */         b(paramaqu, BlockList.netherBrick.instance(), 12 - m, -1, n, parambjb);
/*  142:     */       }
/*  143:     */     }
/*  144:1093 */     return true;
/*  145:     */   }
/*  146:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjz
 * JD-Core Version:    0.7.0.1
 */