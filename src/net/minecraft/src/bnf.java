package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bnf
/*    5:     */   extends bnn
/*    6:     */ {
/*    7:     */   public bnf() {}
/*    8:     */   
/*    9:     */   public bnf(bnk parambnk, int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   10:     */   {
/*   11:1184 */     super(parambnk, paramInt);
/*   12:     */     
/*   13:1186 */     this.m = paramej;
/*   14:1187 */     this.l = parambjb;
/*   15:     */   }
/*   16:     */   
/*   17:     */   public static bnf a(bnk parambnk, List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   18:     */   {
/*   19:1191 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, 0, 0, 0, 9, 7, 11, paramej);
/*   20:1193 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   21:1194 */       return null;
/*   22:     */     }
/*   23:1197 */     return new bnf(parambnk, paramInt4, paramRandom, localbjb, paramej);
/*   24:     */   }
/*   25:     */   
/*   26:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   27:     */   {
/*   28:1202 */     if (this.h < 0)
/*   29:     */     {
/*   30:1203 */       this.h = b(paramaqu, parambjb);
/*   31:1204 */       if (this.h < 0) {
/*   32:1205 */         return true;
/*   33:     */       }
/*   34:1207 */       this.l.a(0, this.h - this.l.e + 7 - 1, 0);
/*   35:     */     }
/*   36:1211 */     a(paramaqu, parambjb, 1, 1, 1, 7, 4, 4, BlockList.air.instance(), BlockList.air.instance(), false);
/*   37:1212 */     a(paramaqu, parambjb, 2, 1, 6, 8, 4, 10, BlockList.air.instance(), BlockList.air.instance(), false);
/*   38:     */     
/*   39:     */ 
/*   40:1215 */     a(paramaqu, parambjb, 2, 0, 6, 8, 0, 10, BlockList.dirt.instance(), BlockList.dirt.instance(), false);
/*   41:1216 */     a(paramaqu, BlockList.cobblestone.instance(), 6, 0, 6, parambjb);
/*   42:     */     
/*   43:1218 */     a(paramaqu, parambjb, 2, 1, 6, 2, 1, 10, BlockList.fence.instance(), BlockList.fence.instance(), false);
/*   44:1219 */     a(paramaqu, parambjb, 8, 1, 6, 8, 1, 10, BlockList.fence.instance(), BlockList.fence.instance(), false);
/*   45:1220 */     a(paramaqu, parambjb, 3, 1, 10, 7, 1, 10, BlockList.fence.instance(), BlockList.fence.instance(), false);
/*   46:     */     
/*   47:     */ 
/*   48:1223 */     a(paramaqu, parambjb, 1, 0, 1, 7, 0, 4, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   49:1224 */     a(paramaqu, parambjb, 0, 0, 0, 0, 3, 5, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   50:1225 */     a(paramaqu, parambjb, 8, 0, 0, 8, 3, 5, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   51:1226 */     a(paramaqu, parambjb, 1, 0, 0, 7, 1, 0, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   52:1227 */     a(paramaqu, parambjb, 1, 0, 5, 7, 1, 5, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   53:     */     
/*   54:     */ 
/*   55:1230 */     a(paramaqu, parambjb, 1, 2, 0, 7, 3, 0, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   56:1231 */     a(paramaqu, parambjb, 1, 2, 5, 7, 3, 5, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   57:1232 */     a(paramaqu, parambjb, 0, 4, 1, 8, 4, 1, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   58:1233 */     a(paramaqu, parambjb, 0, 4, 4, 8, 4, 4, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   59:1234 */     a(paramaqu, parambjb, 0, 5, 2, 8, 5, 3, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   60:1235 */     a(paramaqu, BlockList.planks.instance(), 0, 4, 2, parambjb);
/*   61:1236 */     a(paramaqu, BlockList.planks.instance(), 0, 4, 3, parambjb);
/*   62:1237 */     a(paramaqu, BlockList.planks.instance(), 8, 4, 2, parambjb);
/*   63:1238 */     a(paramaqu, BlockList.planks.instance(), 8, 4, 3, parambjb);
/*   64:     */     
/*   65:1240 */     int i = a(BlockList.ad, 3);
/*   66:1241 */     int j = a(BlockList.ad, 2);
/*   67:     */     int m;
/*   68:1242 */     for (int k = -1; k <= 2; k++) {
/*   69:1243 */       for (m = 0; m <= 8; m++)
/*   70:     */       {
/*   71:1244 */         a(paramaqu, BlockList.ad.instance(i), m, 4 + k, k, parambjb);
/*   72:1245 */         a(paramaqu, BlockList.ad.instance(j), m, 4 + k, 5 - k, parambjb);
/*   73:     */       }
/*   74:     */     }
/*   75:1250 */     a(paramaqu, BlockList.log.instance(), 0, 2, 1, parambjb);
/*   76:1251 */     a(paramaqu, BlockList.log.instance(), 0, 2, 4, parambjb);
/*   77:1252 */     a(paramaqu, BlockList.log.instance(), 8, 2, 1, parambjb);
/*   78:1253 */     a(paramaqu, BlockList.log.instance(), 8, 2, 4, parambjb);
/*   79:1254 */     a(paramaqu, BlockList.bj.instance(), 0, 2, 2, parambjb);
/*   80:1255 */     a(paramaqu, BlockList.bj.instance(), 0, 2, 3, parambjb);
/*   81:1256 */     a(paramaqu, BlockList.bj.instance(), 8, 2, 2, parambjb);
/*   82:1257 */     a(paramaqu, BlockList.bj.instance(), 8, 2, 3, parambjb);
/*   83:1258 */     a(paramaqu, BlockList.bj.instance(), 2, 2, 5, parambjb);
/*   84:1259 */     a(paramaqu, BlockList.bj.instance(), 3, 2, 5, parambjb);
/*   85:1260 */     a(paramaqu, BlockList.bj.instance(), 5, 2, 0, parambjb);
/*   86:1261 */     a(paramaqu, BlockList.bj.instance(), 6, 2, 5, parambjb);
/*   87:     */     
/*   88:     */ 
/*   89:1264 */     a(paramaqu, BlockList.fence.instance(), 2, 1, 3, parambjb);
/*   90:1265 */     a(paramaqu, BlockList.aB.instance(), 2, 2, 3, parambjb);
/*   91:1266 */     a(paramaqu, BlockList.planks.instance(), 1, 1, 4, parambjb);
/*   92:1267 */     a(paramaqu, BlockList.ad.instance(a(BlockList.ad, 3)), 2, 1, 4, parambjb);
/*   93:1268 */     a(paramaqu, BlockList.ad.instance(a(BlockList.ad, 1)), 1, 1, 3, parambjb);
/*   94:     */     
/*   95:     */ 
/*   96:1271 */     a(paramaqu, parambjb, 5, 0, 1, 7, 0, 3, BlockList.T.instance(), BlockList.T.instance(), false);
/*   97:1272 */     a(paramaqu, BlockList.T.instance(), 6, 1, 1, parambjb);
/*   98:1273 */     a(paramaqu, BlockList.T.instance(), 6, 1, 2, parambjb);
/*   99:     */     
/*  100:     */ 
/*  101:1276 */     a(paramaqu, BlockList.air.instance(), 2, 1, 0, parambjb);
/*  102:1277 */     a(paramaqu, BlockList.air.instance(), 2, 2, 0, parambjb);
/*  103:1278 */     a(paramaqu, BlockList.torch.instance().setData(bbl.a, this.m), 2, 3, 1, parambjb);
/*  104:1279 */     a(paramaqu, parambjb, paramRandom, 2, 1, 0, EnumDirection.b(a(BlockList.woodenDoor, 1)));
/*  105:1280 */     if ((a(paramaqu, 2, 0, -1, parambjb).getProto().getMaterial() == Material.air) && (a(paramaqu, 2, -1, -1, parambjb).getProto().getMaterial() != Material.air)) {
/*  106:1281 */       a(paramaqu, BlockList.aw.instance(a(BlockList.aw, 3)), 2, 0, -1, parambjb);
/*  107:     */     }
/*  108:1285 */     a(paramaqu, BlockList.air.instance(), 6, 1, 5, parambjb);
/*  109:1286 */     a(paramaqu, BlockList.air.instance(), 6, 2, 5, parambjb);
/*  110:1287 */     a(paramaqu, BlockList.torch.instance().setData(bbl.a, this.m.opposite()), 6, 3, 4, parambjb);
/*  111:1288 */     a(paramaqu, parambjb, paramRandom, 6, 1, 5, EnumDirection.b(a(BlockList.woodenDoor, 1)));
/*  112:1290 */     for (int k = 0; k < 5; k++) {
/*  113:1291 */       for (m = 0; m < 9; m++)
/*  114:     */       {
/*  115:1292 */         b(paramaqu, m, 7, k, parambjb);
/*  116:1293 */         b(paramaqu, BlockList.cobblestone.instance(), m, -1, k, parambjb);
/*  117:     */       }
/*  118:     */     }
/*  119:1297 */     a(paramaqu, parambjb, 4, 1, 2, 2);
/*  120:     */     
/*  121:1299 */     return true;
/*  122:     */   }
/*  123:     */   
/*  124:     */   protected int c(int paramInt1, int paramInt2)
/*  125:     */   {
/*  126:1304 */     if (paramInt1 == 0) {
/*  127:1305 */       return 4;
/*  128:     */     }
/*  129:1307 */     return super.c(paramInt1, paramInt2);
/*  130:     */   }
/*  131:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bnf
 * JD-Core Version:    0.7.0.1
 */