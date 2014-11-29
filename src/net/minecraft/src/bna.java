package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bna
/*    5:     */   extends bnn
/*    6:     */ {
/*    7:     */   public bna() {}
/*    8:     */   
/*    9:     */   public bna(bnk parambnk, int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   10:     */   {
/*   11: 926 */     super(parambnk, paramInt);
/*   12:     */     
/*   13: 928 */     this.m = paramej;
/*   14: 929 */     this.l = parambjb;
/*   15:     */   }
/*   16:     */   
/*   17:     */   public static bna a(bnk parambnk, List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   18:     */   {
/*   19: 933 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, 0, 0, 0, 9, 9, 6, paramej);
/*   20: 935 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   21: 936 */       return null;
/*   22:     */     }
/*   23: 939 */     return new bna(parambnk, paramInt4, paramRandom, localbjb, paramej);
/*   24:     */   }
/*   25:     */   
/*   26:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   27:     */   {
/*   28: 944 */     if (this.h < 0)
/*   29:     */     {
/*   30: 945 */       this.h = b(paramaqu, parambjb);
/*   31: 946 */       if (this.h < 0) {
/*   32: 947 */         return true;
/*   33:     */       }
/*   34: 949 */       this.l.a(0, this.h - this.l.e + 9 - 1, 0);
/*   35:     */     }
/*   36: 953 */     a(paramaqu, parambjb, 1, 1, 1, 7, 5, 4, BlockList.air.instance(), BlockList.air.instance(), false);
/*   37:     */     
/*   38:     */ 
/*   39: 956 */     a(paramaqu, parambjb, 0, 0, 0, 8, 0, 5, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   40:     */     
/*   41: 958 */     a(paramaqu, parambjb, 0, 5, 0, 8, 5, 5, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   42: 959 */     a(paramaqu, parambjb, 0, 6, 1, 8, 6, 4, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   43: 960 */     a(paramaqu, parambjb, 0, 7, 2, 8, 7, 3, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   44: 961 */     int i = a(BlockList.ad, 3);
/*   45: 962 */     int j = a(BlockList.ad, 2);
/*   46: 963 */     for (int k = -1; k <= 2; k++) {
/*   47: 964 */       for (int m = 0; m <= 8; m++)
/*   48:     */       {
/*   49: 965 */         a(paramaqu, BlockList.ad.instance(i), m, 6 + k, k, parambjb);
/*   50: 966 */         a(paramaqu, BlockList.ad.instance(j), m, 6 + k, 5 - k, parambjb);
/*   51:     */       }
/*   52:     */     }
/*   53: 971 */     a(paramaqu, parambjb, 0, 1, 0, 0, 1, 5, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   54: 972 */     a(paramaqu, parambjb, 1, 1, 5, 8, 1, 5, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   55: 973 */     a(paramaqu, parambjb, 8, 1, 0, 8, 1, 4, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   56: 974 */     a(paramaqu, parambjb, 2, 1, 0, 7, 1, 0, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   57: 975 */     a(paramaqu, parambjb, 0, 2, 0, 0, 4, 0, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   58: 976 */     a(paramaqu, parambjb, 0, 2, 5, 0, 4, 5, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   59: 977 */     a(paramaqu, parambjb, 8, 2, 5, 8, 4, 5, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   60: 978 */     a(paramaqu, parambjb, 8, 2, 0, 8, 4, 0, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   61:     */     
/*   62:     */ 
/*   63: 981 */     a(paramaqu, parambjb, 0, 2, 1, 0, 4, 4, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   64: 982 */     a(paramaqu, parambjb, 1, 2, 5, 7, 4, 5, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   65: 983 */     a(paramaqu, parambjb, 8, 2, 1, 8, 4, 4, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   66: 984 */     a(paramaqu, parambjb, 1, 2, 0, 7, 4, 0, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   67:     */     
/*   68:     */ 
/*   69: 987 */     a(paramaqu, BlockList.bj.instance(), 4, 2, 0, parambjb);
/*   70: 988 */     a(paramaqu, BlockList.bj.instance(), 5, 2, 0, parambjb);
/*   71: 989 */     a(paramaqu, BlockList.bj.instance(), 6, 2, 0, parambjb);
/*   72: 990 */     a(paramaqu, BlockList.bj.instance(), 4, 3, 0, parambjb);
/*   73: 991 */     a(paramaqu, BlockList.bj.instance(), 5, 3, 0, parambjb);
/*   74: 992 */     a(paramaqu, BlockList.bj.instance(), 6, 3, 0, parambjb);
/*   75: 993 */     a(paramaqu, BlockList.bj.instance(), 0, 2, 2, parambjb);
/*   76: 994 */     a(paramaqu, BlockList.bj.instance(), 0, 2, 3, parambjb);
/*   77: 995 */     a(paramaqu, BlockList.bj.instance(), 0, 3, 2, parambjb);
/*   78: 996 */     a(paramaqu, BlockList.bj.instance(), 0, 3, 3, parambjb);
/*   79: 997 */     a(paramaqu, BlockList.bj.instance(), 8, 2, 2, parambjb);
/*   80: 998 */     a(paramaqu, BlockList.bj.instance(), 8, 2, 3, parambjb);
/*   81: 999 */     a(paramaqu, BlockList.bj.instance(), 8, 3, 2, parambjb);
/*   82:1000 */     a(paramaqu, BlockList.bj.instance(), 8, 3, 3, parambjb);
/*   83:1001 */     a(paramaqu, BlockList.bj.instance(), 2, 2, 5, parambjb);
/*   84:1002 */     a(paramaqu, BlockList.bj.instance(), 3, 2, 5, parambjb);
/*   85:1003 */     a(paramaqu, BlockList.bj.instance(), 5, 2, 5, parambjb);
/*   86:1004 */     a(paramaqu, BlockList.bj.instance(), 6, 2, 5, parambjb);
/*   87:     */     
/*   88:     */ 
/*   89:1007 */     a(paramaqu, parambjb, 1, 4, 1, 7, 4, 1, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   90:1008 */     a(paramaqu, parambjb, 1, 4, 4, 7, 4, 4, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   91:1009 */     a(paramaqu, parambjb, 1, 3, 4, 7, 3, 4, BlockList.bookshelf.instance(), BlockList.bookshelf.instance(), false);
/*   92:     */     
/*   93:     */ 
/*   94:1012 */     a(paramaqu, BlockList.planks.instance(), 7, 1, 4, parambjb);
/*   95:1013 */     a(paramaqu, BlockList.ad.instance(a(BlockList.ad, 0)), 7, 1, 3, parambjb);
/*   96:1014 */     int k = a(BlockList.ad, 3);
/*   97:1015 */     a(paramaqu, BlockList.ad.instance(k), 6, 1, 4, parambjb);
/*   98:1016 */     a(paramaqu, BlockList.ad.instance(k), 5, 1, 4, parambjb);
/*   99:1017 */     a(paramaqu, BlockList.ad.instance(k), 4, 1, 4, parambjb);
/*  100:1018 */     a(paramaqu, BlockList.ad.instance(k), 3, 1, 4, parambjb);
/*  101:     */     
/*  102:     */ 
/*  103:1021 */     a(paramaqu, BlockList.fence.instance(), 6, 1, 3, parambjb);
/*  104:1022 */     a(paramaqu, BlockList.aB.instance(), 6, 2, 3, parambjb);
/*  105:1023 */     a(paramaqu, BlockList.fence.instance(), 4, 1, 3, parambjb);
/*  106:1024 */     a(paramaqu, BlockList.aB.instance(), 4, 2, 3, parambjb);
/*  107:1025 */     a(paramaqu, BlockList.ai.instance(), 7, 1, 1, parambjb);
/*  108:     */     
/*  109:     */ 
/*  110:1028 */     a(paramaqu, BlockList.air.instance(), 1, 1, 0, parambjb);
/*  111:1029 */     a(paramaqu, BlockList.air.instance(), 1, 2, 0, parambjb);
/*  112:1030 */     a(paramaqu, parambjb, paramRandom, 1, 1, 0, EnumDirection.b(a(BlockList.woodenDoor, 1)));
/*  113:1031 */     if ((a(paramaqu, 1, 0, -1, parambjb).getType().getMaterial() == Material.air) && (a(paramaqu, 1, -1, -1, parambjb).getType().getMaterial() != Material.air)) {
/*  114:1032 */       a(paramaqu, BlockList.aw.instance(a(BlockList.aw, 3)), 1, 0, -1, parambjb);
/*  115:     */     }
/*  116:1035 */     for (int m = 0; m < 6; m++) {
/*  117:1036 */       for (int n = 0; n < 9; n++)
/*  118:     */       {
/*  119:1037 */         b(paramaqu, n, 9, m, parambjb);
/*  120:1038 */         b(paramaqu, BlockList.cobblestone.instance(), n, -1, m, parambjb);
/*  121:     */       }
/*  122:     */     }
/*  123:1042 */     a(paramaqu, parambjb, 2, 1, 2, 1);
/*  124:     */     
/*  125:1044 */     return true;
/*  126:     */   }
/*  127:     */   
/*  128:     */   protected int c(int paramInt1, int paramInt2)
/*  129:     */   {
/*  130:1049 */     return 1;
/*  131:     */   }
/*  132:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bna
 * JD-Core Version:    0.7.0.1
 */