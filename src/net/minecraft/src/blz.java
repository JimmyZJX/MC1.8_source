package net.minecraft.src;
/*    1:     */ import com.google.common.collect.Lists;
/*    2:     */ import java.util.List;
/*    3:     */ import java.util.Random;
/*    4:     */ 
/*    5:     */ public class blz
/*    6:     */   extends bmk
/*    7:     */ {
/*    8:1142 */   private static final List a = Lists.newArrayList(new vl[] { new vl(ItemList.book, 0, 1, 3, 20), new vl(ItemList.aK, 0, 2, 7, 20), new vl(ItemList.bV, 0, 1, 1, 1), new vl(ItemList.aQ, 0, 1, 1, 1) });
/*    9:     */   private boolean b;
/*   10:     */   
/*   11:     */   public blz() {}
/*   12:     */   
/*   13:     */   public blz(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   14:     */   {
/*   15:1162 */     super(paramInt);
/*   16:     */     
/*   17:1164 */     this.m = paramej;
/*   18:1165 */     this.d = a(paramRandom);
/*   19:1166 */     this.l = parambjb;
/*   20:1167 */     this.b = (parambjb.d() > 6);
/*   21:     */   }
/*   22:     */   
/*   23:     */   protected void a(NBTTagCompound paramfn)
/*   24:     */   {
/*   25:1172 */     super.a(paramfn);
/*   26:1173 */     paramfn.setBoolean("Tall", this.b);
/*   27:     */   }
/*   28:     */   
/*   29:     */   protected void b(NBTTagCompound paramfn)
/*   30:     */   {
/*   31:1178 */     super.b(paramfn);
/*   32:1179 */     this.b = paramfn.getBoolean("Tall");
/*   33:     */   }
/*   34:     */   
/*   35:     */   public static blz a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   36:     */   {
/*   37:1184 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -4, -1, 0, 14, 11, 15, paramej);
/*   38:1186 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null))
/*   39:     */     {
/*   40:1188 */       localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -4, -1, 0, 14, 6, 15, paramej);
/*   41:1190 */       if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   42:1191 */         return null;
/*   43:     */       }
/*   44:     */     }
/*   45:1195 */     return new blz(paramInt4, paramRandom, localbjb, paramej);
/*   46:     */   }
/*   47:     */   
/*   48:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   49:     */   {
/*   50:1200 */     if (a(paramaqu, parambjb)) {
/*   51:1201 */       return false;
/*   52:     */     }
/*   53:1204 */     int i = 11;
/*   54:1205 */     if (!this.b) {
/*   55:1206 */       i = 6;
/*   56:     */     }
/*   57:1210 */     a(paramaqu, parambjb, 0, 0, 0, 13, i - 1, 14, true, paramRandom, blr.c());
/*   58:     */     
/*   59:1212 */     a(paramaqu, paramRandom, parambjb, this.d, 4, 1, 0);
/*   60:     */     
/*   61:     */ 
/*   62:1215 */     a(paramaqu, parambjb, paramRandom, 0.07F, 2, 1, 1, 11, 4, 13, BlockList.web.instance(), BlockList.web.instance(), false);
/*   63:     */     
/*   64:1217 */     int j = 1;
/*   65:1218 */     int k = 12;
/*   66:1221 */     for (int m = 1; m <= 13; m++) {
/*   67:1222 */       if ((m - 1) % 4 == 0)
/*   68:     */       {
/*   69:1223 */         a(paramaqu, parambjb, 1, 1, m, 1, 4, m, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   70:1224 */         a(paramaqu, parambjb, 12, 1, m, 12, 4, m, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   71:     */         
/*   72:1226 */         a(paramaqu, BlockList.torch.instance(), 2, 3, m, parambjb);
/*   73:1227 */         a(paramaqu, BlockList.torch.instance(), 11, 3, m, parambjb);
/*   74:1229 */         if (this.b)
/*   75:     */         {
/*   76:1230 */           a(paramaqu, parambjb, 1, 6, m, 1, 9, m, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   77:1231 */           a(paramaqu, parambjb, 12, 6, m, 12, 9, m, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   78:     */         }
/*   79:     */       }
/*   80:     */       else
/*   81:     */       {
/*   82:1234 */         a(paramaqu, parambjb, 1, 1, m, 1, 4, m, BlockList.bookshelf.instance(), BlockList.bookshelf.instance(), false);
/*   83:1235 */         a(paramaqu, parambjb, 12, 1, m, 12, 4, m, BlockList.bookshelf.instance(), BlockList.bookshelf.instance(), false);
/*   84:1237 */         if (this.b)
/*   85:     */         {
/*   86:1238 */           a(paramaqu, parambjb, 1, 6, m, 1, 9, m, BlockList.bookshelf.instance(), BlockList.bookshelf.instance(), false);
/*   87:1239 */           a(paramaqu, parambjb, 12, 6, m, 12, 9, m, BlockList.bookshelf.instance(), BlockList.bookshelf.instance(), false);
/*   88:     */         }
/*   89:     */       }
/*   90:     */     }
/*   91:1245 */     for (int m = 3; m < 12; m += 2)
/*   92:     */     {
/*   93:1246 */       a(paramaqu, parambjb, 3, 1, m, 4, 3, m, BlockList.bookshelf.instance(), BlockList.bookshelf.instance(), false);
/*   94:1247 */       a(paramaqu, parambjb, 6, 1, m, 7, 3, m, BlockList.bookshelf.instance(), BlockList.bookshelf.instance(), false);
/*   95:1248 */       a(paramaqu, parambjb, 9, 1, m, 10, 3, m, BlockList.bookshelf.instance(), BlockList.bookshelf.instance(), false);
/*   96:     */     }
/*   97:1251 */     if (this.b)
/*   98:     */     {
/*   99:1253 */       a(paramaqu, parambjb, 1, 5, 1, 3, 5, 13, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*  100:1254 */       a(paramaqu, parambjb, 10, 5, 1, 12, 5, 13, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*  101:1255 */       a(paramaqu, parambjb, 4, 5, 1, 9, 5, 2, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*  102:1256 */       a(paramaqu, parambjb, 4, 5, 12, 9, 5, 13, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*  103:     */       
/*  104:1258 */       a(paramaqu, BlockList.planks.instance(), 9, 5, 11, parambjb);
/*  105:1259 */       a(paramaqu, BlockList.planks.instance(), 8, 5, 11, parambjb);
/*  106:1260 */       a(paramaqu, BlockList.planks.instance(), 9, 5, 10, parambjb);
/*  107:     */       
/*  108:     */ 
/*  109:1263 */       a(paramaqu, parambjb, 3, 6, 2, 3, 6, 12, BlockList.fence.instance(), BlockList.fence.instance(), false);
/*  110:1264 */       a(paramaqu, parambjb, 10, 6, 2, 10, 6, 10, BlockList.fence.instance(), BlockList.fence.instance(), false);
/*  111:1265 */       a(paramaqu, parambjb, 4, 6, 2, 9, 6, 2, BlockList.fence.instance(), BlockList.fence.instance(), false);
/*  112:1266 */       a(paramaqu, parambjb, 4, 6, 12, 8, 6, 12, BlockList.fence.instance(), BlockList.fence.instance(), false);
/*  113:1267 */       a(paramaqu, BlockList.fence.instance(), 9, 6, 11, parambjb);
/*  114:1268 */       a(paramaqu, BlockList.fence.instance(), 8, 6, 11, parambjb);
/*  115:1269 */       a(paramaqu, BlockList.fence.instance(), 9, 6, 10, parambjb);
/*  116:     */       
/*  117:     */ 
/*  118:1272 */       int m = a(BlockList.au, 3);
/*  119:1273 */       a(paramaqu, BlockList.au.a(m), 10, 1, 13, parambjb);
/*  120:1274 */       a(paramaqu, BlockList.au.a(m), 10, 2, 13, parambjb);
/*  121:1275 */       a(paramaqu, BlockList.au.a(m), 10, 3, 13, parambjb);
/*  122:1276 */       a(paramaqu, BlockList.au.a(m), 10, 4, 13, parambjb);
/*  123:1277 */       a(paramaqu, BlockList.au.a(m), 10, 5, 13, parambjb);
/*  124:1278 */       a(paramaqu, BlockList.au.a(m), 10, 6, 13, parambjb);
/*  125:1279 */       a(paramaqu, BlockList.au.a(m), 10, 7, 13, parambjb);
/*  126:     */       
/*  127:     */ 
/*  128:1282 */       int n = 7;
/*  129:1283 */       int i1 = 7;
/*  130:1284 */       a(paramaqu, BlockList.fence.instance(), n - 1, 9, i1, parambjb);
/*  131:1285 */       a(paramaqu, BlockList.fence.instance(), n, 9, i1, parambjb);
/*  132:1286 */       a(paramaqu, BlockList.fence.instance(), n - 1, 8, i1, parambjb);
/*  133:1287 */       a(paramaqu, BlockList.fence.instance(), n, 8, i1, parambjb);
/*  134:1288 */       a(paramaqu, BlockList.fence.instance(), n - 1, 7, i1, parambjb);
/*  135:1289 */       a(paramaqu, BlockList.fence.instance(), n, 7, i1, parambjb);
/*  136:     */       
/*  137:1291 */       a(paramaqu, BlockList.fence.instance(), n - 2, 7, i1, parambjb);
/*  138:1292 */       a(paramaqu, BlockList.fence.instance(), n + 1, 7, i1, parambjb);
/*  139:1293 */       a(paramaqu, BlockList.fence.instance(), n - 1, 7, i1 - 1, parambjb);
/*  140:1294 */       a(paramaqu, BlockList.fence.instance(), n - 1, 7, i1 + 1, parambjb);
/*  141:1295 */       a(paramaqu, BlockList.fence.instance(), n, 7, i1 - 1, parambjb);
/*  142:1296 */       a(paramaqu, BlockList.fence.instance(), n, 7, i1 + 1, parambjb);
/*  143:     */       
/*  144:1298 */       a(paramaqu, BlockList.torch.instance(), n - 2, 8, i1, parambjb);
/*  145:1299 */       a(paramaqu, BlockList.torch.instance(), n + 1, 8, i1, parambjb);
/*  146:1300 */       a(paramaqu, BlockList.torch.instance(), n - 1, 8, i1 - 1, parambjb);
/*  147:1301 */       a(paramaqu, BlockList.torch.instance(), n - 1, 8, i1 + 1, parambjb);
/*  148:1302 */       a(paramaqu, BlockList.torch.instance(), n, 8, i1 - 1, parambjb);
/*  149:1303 */       a(paramaqu, BlockList.torch.instance(), n, 8, i1 + 1, parambjb);
/*  150:     */     }
/*  151:1307 */     a(paramaqu, parambjb, paramRandom, 3, 3, 5, vl.a(a, new vl[] { ItemList.cd.a(paramRandom, 1, 5, 2) }), 1 + paramRandom.nextInt(4));
/*  152:1308 */     if (this.b)
/*  153:     */     {
/*  154:1309 */       a(paramaqu, BlockList.air.instance(), 12, 9, 1, parambjb);
/*  155:1310 */       a(paramaqu, parambjb, paramRandom, 12, 8, 1, vl.a(a, new vl[] { ItemList.cd.a(paramRandom, 1, 5, 2) }), 1 + paramRandom.nextInt(4));
/*  156:     */     }
/*  157:1313 */     return true;
/*  158:     */   }
/*  159:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     blz
 * JD-Core Version:    0.7.0.1
 */