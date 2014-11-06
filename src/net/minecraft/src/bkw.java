package net.minecraft.src;
/*    1:     */ import java.util.Random;
/*    2:     */ 
/*    3:     */ public class bkw
/*    4:     */   extends blb
/*    5:     */ {
/*    6:     */   public bkw() {}
/*    7:     */   
/*    8:     */   public bkw(EnumDirection paramej, blf paramblf, Random paramRandom)
/*    9:     */   {
/*   10:1121 */     super(1, paramej, paramblf, 1, 2, 1);
/*   11:     */   }
/*   12:     */   
/*   13:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   14:     */   {
/*   15:1126 */     if (this.k.a / 25 > 0) {
/*   16:1127 */       a(paramaqu, parambjb, 0, 0, this.k.c[EnumDirection.DOWN.a()]);
/*   17:     */     }
/*   18:1129 */     blf localblf1 = this.k.b[EnumDirection.UP.a()];
/*   19:1130 */     if (localblf1.b[EnumDirection.UP.a()] == null) {
/*   20:1131 */       a(paramaqu, parambjb, 1, 8, 1, 6, 8, 6, a);
/*   21:     */     }
/*   22:1136 */     a(paramaqu, parambjb, 0, 4, 0, 0, 4, 7, b, b, false);
/*   23:1137 */     a(paramaqu, parambjb, 7, 4, 0, 7, 4, 7, b, b, false);
/*   24:1138 */     a(paramaqu, parambjb, 1, 4, 0, 6, 4, 0, b, b, false);
/*   25:1139 */     a(paramaqu, parambjb, 1, 4, 7, 6, 4, 7, b, b, false);
/*   26:     */     
/*   27:1141 */     a(paramaqu, parambjb, 2, 4, 1, 2, 4, 2, b, b, false);
/*   28:1142 */     a(paramaqu, parambjb, 1, 4, 2, 1, 4, 2, b, b, false);
/*   29:1143 */     a(paramaqu, parambjb, 5, 4, 1, 5, 4, 2, b, b, false);
/*   30:1144 */     a(paramaqu, parambjb, 6, 4, 2, 6, 4, 2, b, b, false);
/*   31:1145 */     a(paramaqu, parambjb, 2, 4, 5, 2, 4, 6, b, b, false);
/*   32:1146 */     a(paramaqu, parambjb, 1, 4, 5, 1, 4, 5, b, b, false);
/*   33:1147 */     a(paramaqu, parambjb, 5, 4, 5, 5, 4, 6, b, b, false);
/*   34:1148 */     a(paramaqu, parambjb, 6, 4, 5, 6, 4, 5, b, b, false);
/*   35:     */     
/*   36:1150 */     blf localblf2 = this.k;
/*   37:1151 */     for (int i = 1; i <= 5; i += 4)
/*   38:     */     {
/*   39:1152 */       int j = 0;
/*   40:1153 */       if (localblf2.c[EnumDirection.SOUTH.a()])
/*   41:     */       {
/*   42:1154 */         a(paramaqu, parambjb, 2, i, j, 2, i + 2, j, b, b, false);
/*   43:1155 */         a(paramaqu, parambjb, 5, i, j, 5, i + 2, j, b, b, false);
/*   44:1156 */         a(paramaqu, parambjb, 3, i + 2, j, 4, i + 2, j, b, b, false);
/*   45:     */       }
/*   46:     */       else
/*   47:     */       {
/*   48:1158 */         a(paramaqu, parambjb, 0, i, j, 7, i + 2, j, b, b, false);
/*   49:1159 */         a(paramaqu, parambjb, 0, i + 1, j, 7, i + 1, j, a, a, false);
/*   50:     */       }
/*   51:1161 */       j = 7;
/*   52:1162 */       if (localblf2.c[EnumDirection.NORTH.a()])
/*   53:     */       {
/*   54:1163 */         a(paramaqu, parambjb, 2, i, j, 2, i + 2, j, b, b, false);
/*   55:1164 */         a(paramaqu, parambjb, 5, i, j, 5, i + 2, j, b, b, false);
/*   56:1165 */         a(paramaqu, parambjb, 3, i + 2, j, 4, i + 2, j, b, b, false);
/*   57:     */       }
/*   58:     */       else
/*   59:     */       {
/*   60:1167 */         a(paramaqu, parambjb, 0, i, j, 7, i + 2, j, b, b, false);
/*   61:1168 */         a(paramaqu, parambjb, 0, i + 1, j, 7, i + 1, j, a, a, false);
/*   62:     */       }
/*   63:1170 */       int k = 0;
/*   64:1171 */       if (localblf2.c[EnumDirection.WEST.a()])
/*   65:     */       {
/*   66:1172 */         a(paramaqu, parambjb, k, i, 2, k, i + 2, 2, b, b, false);
/*   67:1173 */         a(paramaqu, parambjb, k, i, 5, k, i + 2, 5, b, b, false);
/*   68:1174 */         a(paramaqu, parambjb, k, i + 2, 3, k, i + 2, 4, b, b, false);
/*   69:     */       }
/*   70:     */       else
/*   71:     */       {
/*   72:1176 */         a(paramaqu, parambjb, k, i, 0, k, i + 2, 7, b, b, false);
/*   73:1177 */         a(paramaqu, parambjb, k, i + 1, 0, k, i + 1, 7, a, a, false);
/*   74:     */       }
/*   75:1179 */       k = 7;
/*   76:1180 */       if (localblf2.c[EnumDirection.EAST.a()])
/*   77:     */       {
/*   78:1181 */         a(paramaqu, parambjb, k, i, 2, k, i + 2, 2, b, b, false);
/*   79:1182 */         a(paramaqu, parambjb, k, i, 5, k, i + 2, 5, b, b, false);
/*   80:1183 */         a(paramaqu, parambjb, k, i + 2, 3, k, i + 2, 4, b, b, false);
/*   81:     */       }
/*   82:     */       else
/*   83:     */       {
/*   84:1185 */         a(paramaqu, parambjb, k, i, 0, k, i + 2, 7, b, b, false);
/*   85:1186 */         a(paramaqu, parambjb, k, i + 1, 0, k, i + 1, 7, a, a, false);
/*   86:     */       }
/*   87:1188 */       localblf2 = localblf1;
/*   88:     */     }
/*   89:1192 */     return true;
/*   90:     */   }
/*   91:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkw
 * JD-Core Version:    0.7.0.1
 */