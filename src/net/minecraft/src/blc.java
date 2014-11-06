package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ public class blc
/*    4:     */   extends blb
/*    5:     */ {
/*    6:     */   private int o;
/*    7:     */   
/*    8:     */   public blc() {}
/*    9:     */   
/*   10:     */   public blc(EnumDirection paramej, blf paramblf, Random paramRandom)
/*   11:     */   {
/*   12: 893 */     super(1, paramej, paramblf, 1, 1, 1);
/*   13: 894 */     this.o = paramRandom.nextInt(3);
/*   14:     */   }
/*   15:     */   
/*   16:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   17:     */   {
/*   18: 899 */     if (this.k.a / 25 > 0) {
/*   19: 900 */       a(paramaqu, parambjb, 0, 0, this.k.c[EnumDirection.DOWN.a()]);
/*   20:     */     }
/*   21: 902 */     if (this.k.b[EnumDirection.UP.a()] == null) {
/*   22: 903 */       a(paramaqu, parambjb, 1, 4, 1, 6, 4, 6, a);
/*   23:     */     }
/*   24: 906 */     int i = (this.o != 0) && (paramRandom.nextBoolean()) && (!this.k.c[EnumDirection.DOWN.a()]) && (!this.k.c[EnumDirection.UP.a()]) && (this.k.c() > 1) ? 1 : 0;
/*   25: 908 */     if (this.o == 0)
/*   26:     */     {
/*   27: 910 */       a(paramaqu, parambjb, 0, 1, 0, 2, 1, 2, b, b, false);
/*   28: 911 */       a(paramaqu, parambjb, 0, 3, 0, 2, 3, 2, b, b, false);
/*   29: 912 */       a(paramaqu, parambjb, 0, 2, 0, 0, 2, 2, a, a, false);
/*   30: 913 */       a(paramaqu, parambjb, 1, 2, 0, 2, 2, 0, a, a, false);
/*   31: 914 */       a(paramaqu, e, 1, 2, 1, parambjb);
/*   32:     */       
/*   33:     */ 
/*   34: 917 */       a(paramaqu, parambjb, 5, 1, 0, 7, 1, 2, b, b, false);
/*   35: 918 */       a(paramaqu, parambjb, 5, 3, 0, 7, 3, 2, b, b, false);
/*   36: 919 */       a(paramaqu, parambjb, 7, 2, 0, 7, 2, 2, a, a, false);
/*   37: 920 */       a(paramaqu, parambjb, 5, 2, 0, 6, 2, 0, a, a, false);
/*   38: 921 */       a(paramaqu, e, 6, 2, 1, parambjb);
/*   39:     */       
/*   40:     */ 
/*   41: 924 */       a(paramaqu, parambjb, 0, 1, 5, 2, 1, 7, b, b, false);
/*   42: 925 */       a(paramaqu, parambjb, 0, 3, 5, 2, 3, 7, b, b, false);
/*   43: 926 */       a(paramaqu, parambjb, 0, 2, 5, 0, 2, 7, a, a, false);
/*   44: 927 */       a(paramaqu, parambjb, 1, 2, 7, 2, 2, 7, a, a, false);
/*   45: 928 */       a(paramaqu, e, 1, 2, 6, parambjb);
/*   46:     */       
/*   47:     */ 
/*   48: 931 */       a(paramaqu, parambjb, 5, 1, 5, 7, 1, 7, b, b, false);
/*   49: 932 */       a(paramaqu, parambjb, 5, 3, 5, 7, 3, 7, b, b, false);
/*   50: 933 */       a(paramaqu, parambjb, 7, 2, 5, 7, 2, 7, a, a, false);
/*   51: 934 */       a(paramaqu, parambjb, 5, 2, 7, 6, 2, 7, a, a, false);
/*   52: 935 */       a(paramaqu, e, 6, 2, 6, parambjb);
/*   53: 937 */       if (this.k.c[EnumDirection.SOUTH.a()])
/*   54:     */       {
/*   55: 938 */         a(paramaqu, parambjb, 3, 3, 0, 4, 3, 0, b, b, false);
/*   56:     */       }
/*   57:     */       else
/*   58:     */       {
/*   59: 940 */         a(paramaqu, parambjb, 3, 3, 0, 4, 3, 1, b, b, false);
/*   60: 941 */         a(paramaqu, parambjb, 3, 2, 0, 4, 2, 0, a, a, false);
/*   61: 942 */         a(paramaqu, parambjb, 3, 1, 0, 4, 1, 1, b, b, false);
/*   62:     */       }
/*   63: 944 */       if (this.k.c[EnumDirection.NORTH.a()])
/*   64:     */       {
/*   65: 945 */         a(paramaqu, parambjb, 3, 3, 7, 4, 3, 7, b, b, false);
/*   66:     */       }
/*   67:     */       else
/*   68:     */       {
/*   69: 947 */         a(paramaqu, parambjb, 3, 3, 6, 4, 3, 7, b, b, false);
/*   70: 948 */         a(paramaqu, parambjb, 3, 2, 7, 4, 2, 7, a, a, false);
/*   71: 949 */         a(paramaqu, parambjb, 3, 1, 6, 4, 1, 7, b, b, false);
/*   72:     */       }
/*   73: 951 */       if (this.k.c[EnumDirection.WEST.a()])
/*   74:     */       {
/*   75: 952 */         a(paramaqu, parambjb, 0, 3, 3, 0, 3, 4, b, b, false);
/*   76:     */       }
/*   77:     */       else
/*   78:     */       {
/*   79: 954 */         a(paramaqu, parambjb, 0, 3, 3, 1, 3, 4, b, b, false);
/*   80: 955 */         a(paramaqu, parambjb, 0, 2, 3, 0, 2, 4, a, a, false);
/*   81: 956 */         a(paramaqu, parambjb, 0, 1, 3, 1, 1, 4, b, b, false);
/*   82:     */       }
/*   83: 958 */       if (this.k.c[EnumDirection.EAST.a()])
/*   84:     */       {
/*   85: 959 */         a(paramaqu, parambjb, 7, 3, 3, 7, 3, 4, b, b, false);
/*   86:     */       }
/*   87:     */       else
/*   88:     */       {
/*   89: 961 */         a(paramaqu, parambjb, 6, 3, 3, 7, 3, 4, b, b, false);
/*   90: 962 */         a(paramaqu, parambjb, 7, 2, 3, 7, 2, 4, a, a, false);
/*   91: 963 */         a(paramaqu, parambjb, 6, 1, 3, 7, 1, 4, b, b, false);
/*   92:     */       }
/*   93:     */     }
/*   94: 965 */     else if (this.o == 1)
/*   95:     */     {
/*   96: 967 */       a(paramaqu, parambjb, 2, 1, 2, 2, 3, 2, b, b, false);
/*   97: 968 */       a(paramaqu, parambjb, 2, 1, 5, 2, 3, 5, b, b, false);
/*   98: 969 */       a(paramaqu, parambjb, 5, 1, 5, 5, 3, 5, b, b, false);
/*   99: 970 */       a(paramaqu, parambjb, 5, 1, 2, 5, 3, 2, b, b, false);
/*  100: 971 */       a(paramaqu, e, 2, 2, 2, parambjb);
/*  101: 972 */       a(paramaqu, e, 2, 2, 5, parambjb);
/*  102: 973 */       a(paramaqu, e, 5, 2, 5, parambjb);
/*  103: 974 */       a(paramaqu, e, 5, 2, 2, parambjb);
/*  104:     */       
/*  105:     */ 
/*  106: 977 */       a(paramaqu, parambjb, 0, 1, 0, 1, 3, 0, b, b, false);
/*  107: 978 */       a(paramaqu, parambjb, 0, 1, 1, 0, 3, 1, b, b, false);
/*  108: 979 */       a(paramaqu, parambjb, 0, 1, 7, 1, 3, 7, b, b, false);
/*  109: 980 */       a(paramaqu, parambjb, 0, 1, 6, 0, 3, 6, b, b, false);
/*  110: 981 */       a(paramaqu, parambjb, 6, 1, 7, 7, 3, 7, b, b, false);
/*  111: 982 */       a(paramaqu, parambjb, 7, 1, 6, 7, 3, 6, b, b, false);
/*  112: 983 */       a(paramaqu, parambjb, 6, 1, 0, 7, 3, 0, b, b, false);
/*  113: 984 */       a(paramaqu, parambjb, 7, 1, 1, 7, 3, 1, b, b, false);
/*  114: 985 */       a(paramaqu, a, 1, 2, 0, parambjb);
/*  115: 986 */       a(paramaqu, a, 0, 2, 1, parambjb);
/*  116: 987 */       a(paramaqu, a, 1, 2, 7, parambjb);
/*  117: 988 */       a(paramaqu, a, 0, 2, 6, parambjb);
/*  118: 989 */       a(paramaqu, a, 6, 2, 7, parambjb);
/*  119: 990 */       a(paramaqu, a, 7, 2, 6, parambjb);
/*  120: 991 */       a(paramaqu, a, 6, 2, 0, parambjb);
/*  121: 992 */       a(paramaqu, a, 7, 2, 1, parambjb);
/*  122: 993 */       if (!this.k.c[EnumDirection.SOUTH.a()])
/*  123:     */       {
/*  124: 994 */         a(paramaqu, parambjb, 1, 3, 0, 6, 3, 0, b, b, false);
/*  125: 995 */         a(paramaqu, parambjb, 1, 2, 0, 6, 2, 0, a, a, false);
/*  126: 996 */         a(paramaqu, parambjb, 1, 1, 0, 6, 1, 0, b, b, false);
/*  127:     */       }
/*  128: 998 */       if (!this.k.c[EnumDirection.NORTH.a()])
/*  129:     */       {
/*  130: 999 */         a(paramaqu, parambjb, 1, 3, 7, 6, 3, 7, b, b, false);
/*  131:1000 */         a(paramaqu, parambjb, 1, 2, 7, 6, 2, 7, a, a, false);
/*  132:1001 */         a(paramaqu, parambjb, 1, 1, 7, 6, 1, 7, b, b, false);
/*  133:     */       }
/*  134:1003 */       if (!this.k.c[EnumDirection.WEST.a()])
/*  135:     */       {
/*  136:1004 */         a(paramaqu, parambjb, 0, 3, 1, 0, 3, 6, b, b, false);
/*  137:1005 */         a(paramaqu, parambjb, 0, 2, 1, 0, 2, 6, a, a, false);
/*  138:1006 */         a(paramaqu, parambjb, 0, 1, 1, 0, 1, 6, b, b, false);
/*  139:     */       }
/*  140:1008 */       if (!this.k.c[EnumDirection.EAST.a()])
/*  141:     */       {
/*  142:1009 */         a(paramaqu, parambjb, 7, 3, 1, 7, 3, 6, b, b, false);
/*  143:1010 */         a(paramaqu, parambjb, 7, 2, 1, 7, 2, 6, a, a, false);
/*  144:1011 */         a(paramaqu, parambjb, 7, 1, 1, 7, 1, 6, b, b, false);
/*  145:     */       }
/*  146:     */     }
/*  147:1013 */     else if (this.o == 2)
/*  148:     */     {
/*  149:1014 */       a(paramaqu, parambjb, 0, 1, 0, 0, 1, 7, b, b, false);
/*  150:1015 */       a(paramaqu, parambjb, 7, 1, 0, 7, 1, 7, b, b, false);
/*  151:1016 */       a(paramaqu, parambjb, 1, 1, 0, 6, 1, 0, b, b, false);
/*  152:1017 */       a(paramaqu, parambjb, 1, 1, 7, 6, 1, 7, b, b, false);
/*  153:     */       
/*  154:1019 */       a(paramaqu, parambjb, 0, 2, 0, 0, 2, 7, c, c, false);
/*  155:1020 */       a(paramaqu, parambjb, 7, 2, 0, 7, 2, 7, c, c, false);
/*  156:1021 */       a(paramaqu, parambjb, 1, 2, 0, 6, 2, 0, c, c, false);
/*  157:1022 */       a(paramaqu, parambjb, 1, 2, 7, 6, 2, 7, c, c, false);
/*  158:     */       
/*  159:1024 */       a(paramaqu, parambjb, 0, 3, 0, 0, 3, 7, b, b, false);
/*  160:1025 */       a(paramaqu, parambjb, 7, 3, 0, 7, 3, 7, b, b, false);
/*  161:1026 */       a(paramaqu, parambjb, 1, 3, 0, 6, 3, 0, b, b, false);
/*  162:1027 */       a(paramaqu, parambjb, 1, 3, 7, 6, 3, 7, b, b, false);
/*  163:     */       
/*  164:1029 */       a(paramaqu, parambjb, 0, 1, 3, 0, 2, 4, c, c, false);
/*  165:1030 */       a(paramaqu, parambjb, 7, 1, 3, 7, 2, 4, c, c, false);
/*  166:1031 */       a(paramaqu, parambjb, 3, 1, 0, 4, 2, 0, c, c, false);
/*  167:1032 */       a(paramaqu, parambjb, 3, 1, 7, 4, 2, 7, c, c, false);
/*  168:1034 */       if (this.k.c[EnumDirection.SOUTH.a()]) {
/*  169:1035 */         a(paramaqu, parambjb, 3, 1, 0, 4, 2, 0, f, f, false);
/*  170:     */       }
/*  171:1037 */       if (this.k.c[EnumDirection.NORTH.a()]) {
/*  172:1038 */         a(paramaqu, parambjb, 3, 1, 7, 4, 2, 7, f, f, false);
/*  173:     */       }
/*  174:1040 */       if (this.k.c[EnumDirection.WEST.a()]) {
/*  175:1041 */         a(paramaqu, parambjb, 0, 1, 3, 0, 2, 4, f, f, false);
/*  176:     */       }
/*  177:1043 */       if (this.k.c[EnumDirection.EAST.a()]) {
/*  178:1044 */         a(paramaqu, parambjb, 7, 1, 3, 7, 2, 4, f, f, false);
/*  179:     */       }
/*  180:     */     }
/*  181:1047 */     if (i != 0)
/*  182:     */     {
/*  183:1048 */       a(paramaqu, parambjb, 3, 1, 3, 4, 1, 4, b, b, false);
/*  184:1049 */       a(paramaqu, parambjb, 3, 2, 3, 4, 2, 4, a, a, false);
/*  185:1050 */       a(paramaqu, parambjb, 3, 3, 3, 4, 3, 4, b, b, false);
/*  186:     */     }
/*  187:1053 */     return true;
/*  188:     */   }
/*  189:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     blc
 * JD-Core Version:    0.7.0.1
 */