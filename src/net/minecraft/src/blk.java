package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class blk
/*   6:    */   extends bln
/*   7:    */ {
/*   8: 98 */   private boolean[] e = new boolean[4];
/*   9:101 */   private static final List<vl> f = Lists.newArrayList(new vl[] { new vl(ItemList.diamond, 0, 1, 3, 3), new vl(ItemList.ironIngot, 0, 1, 5, 10), new vl(ItemList.goldIngot, 0, 2, 7, 15), new vl(ItemList.emerald, 0, 1, 3, 2), new vl(ItemList.bone, 0, 4, 6, 20), new vl(ItemList.bt, 0, 3, 7, 16), new vl(ItemList.saddle, 0, 1, 1, 3), new vl(ItemList.ck, 0, 1, 1, 1), new vl(ItemList.cl, 0, 1, 1, 1), new vl(ItemList.cm, 0, 1, 1, 1) });
/*  10:    */   
/*  11:    */   public blk() {}
/*  12:    */   
/*  13:    */   public blk(Random paramRandom, int paramInt1, int paramInt2)
/*  14:    */   {
/*  15:121 */     super(paramRandom, paramInt1, 64, paramInt2, 21, 15, 21);
/*  16:    */   }
/*  17:    */   
/*  18:    */   protected void a(NBTTagCompound paramfn)
/*  19:    */   {
/*  20:126 */     super.a(paramfn);
/*  21:127 */     paramfn.setBoolean("hasPlacedChest0", this.e[0]);
/*  22:128 */     paramfn.setBoolean("hasPlacedChest1", this.e[1]);
/*  23:129 */     paramfn.setBoolean("hasPlacedChest2", this.e[2]);
/*  24:130 */     paramfn.setBoolean("hasPlacedChest3", this.e[3]);
/*  25:    */   }
/*  26:    */   
/*  27:    */   protected void b(NBTTagCompound paramfn)
/*  28:    */   {
/*  29:135 */     super.b(paramfn);
/*  30:136 */     this.e[0] = paramfn.getBoolean("hasPlacedChest0");
/*  31:137 */     this.e[1] = paramfn.getBoolean("hasPlacedChest1");
/*  32:138 */     this.e[2] = paramfn.getBoolean("hasPlacedChest2");
/*  33:139 */     this.e[3] = paramfn.getBoolean("hasPlacedChest3");
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*  37:    */   {
/*  38:145 */     a(paramaqu, parambjb, 0, -4, 0, this.a - 1, 0, this.c - 1, BlockList.A.instance(), BlockList.A.instance(), false);
/*  39:146 */     for (int i = 1; i <= 9; i++)
/*  40:    */     {
/*  41:147 */       a(paramaqu, parambjb, i, i, i, this.a - 1 - i, i, this.c - 1 - i, BlockList.A.instance(), BlockList.A.instance(), false);
/*  42:148 */       a(paramaqu, parambjb, i + 1, i, i + 1, this.a - 2 - i, i, this.c - 2 - i, BlockList.air.instance(), BlockList.air.instance(), false);
/*  43:    */     }
/*  44:150 */     for (int i = 0; i < this.a; i++) {
/*  45:151 */       for (int j = 0; j < this.c; j++)
/*  46:    */       {
/*  47:152 */         int k = -5;
/*  48:153 */         b(paramaqu, BlockList.A.instance(), i, k, j, parambjb);
/*  49:    */       }
/*  50:    */     }
/*  51:157 */     int i = a(BlockList.bO, 3);
/*  52:158 */     int j = a(BlockList.bO, 2);
/*  53:159 */     int k = a(BlockList.bO, 0);
/*  54:160 */     int m = a(BlockList.bO, 1);
/*  55:161 */     int n = (EnumDyeColor.ORANGE.b() ^ 0xFFFFFFFF) & 0xF;
/*  56:162 */     int i1 = (EnumDyeColor.BLUE.b() ^ 0xFFFFFFFF) & 0xF;
/*  57:    */     
/*  58:    */ 
/*  59:165 */     a(paramaqu, parambjb, 0, 0, 0, 4, 9, 4, BlockList.A.instance(), BlockList.air.instance(), false);
/*  60:166 */     a(paramaqu, parambjb, 1, 10, 1, 3, 10, 3, BlockList.A.instance(), BlockList.A.instance(), false);
/*  61:167 */     a(paramaqu, BlockList.bO.a(i), 2, 10, 0, parambjb);
/*  62:168 */     a(paramaqu, BlockList.bO.a(j), 2, 10, 4, parambjb);
/*  63:169 */     a(paramaqu, BlockList.bO.a(k), 0, 10, 2, parambjb);
/*  64:170 */     a(paramaqu, BlockList.bO.a(m), 4, 10, 2, parambjb);
/*  65:171 */     a(paramaqu, parambjb, this.a - 5, 0, 0, this.a - 1, 9, 4, BlockList.A.instance(), BlockList.air.instance(), false);
/*  66:172 */     a(paramaqu, parambjb, this.a - 4, 10, 1, this.a - 2, 10, 3, BlockList.A.instance(), BlockList.A.instance(), false);
/*  67:173 */     a(paramaqu, BlockList.bO.a(i), this.a - 3, 10, 0, parambjb);
/*  68:174 */     a(paramaqu, BlockList.bO.a(j), this.a - 3, 10, 4, parambjb);
/*  69:175 */     a(paramaqu, BlockList.bO.a(k), this.a - 5, 10, 2, parambjb);
/*  70:176 */     a(paramaqu, BlockList.bO.a(m), this.a - 1, 10, 2, parambjb);
/*  71:    */     
/*  72:    */ 
/*  73:179 */     a(paramaqu, parambjb, 8, 0, 0, 12, 4, 4, BlockList.A.instance(), BlockList.air.instance(), false);
/*  74:180 */     a(paramaqu, parambjb, 9, 1, 0, 11, 3, 4, BlockList.air.instance(), BlockList.air.instance(), false);
/*  75:181 */     a(paramaqu, BlockList.A.a(bae.c.a()), 9, 1, 1, parambjb);
/*  76:182 */     a(paramaqu, BlockList.A.a(bae.c.a()), 9, 2, 1, parambjb);
/*  77:183 */     a(paramaqu, BlockList.A.a(bae.c.a()), 9, 3, 1, parambjb);
/*  78:184 */     a(paramaqu, BlockList.A.a(bae.c.a()), 10, 3, 1, parambjb);
/*  79:185 */     a(paramaqu, BlockList.A.a(bae.c.a()), 11, 3, 1, parambjb);
/*  80:186 */     a(paramaqu, BlockList.A.a(bae.c.a()), 11, 2, 1, parambjb);
/*  81:187 */     a(paramaqu, BlockList.A.a(bae.c.a()), 11, 1, 1, parambjb);
/*  82:    */     
/*  83:    */ 
/*  84:190 */     a(paramaqu, parambjb, 4, 1, 1, 8, 3, 3, BlockList.A.instance(), BlockList.air.instance(), false);
/*  85:191 */     a(paramaqu, parambjb, 4, 1, 2, 8, 2, 2, BlockList.air.instance(), BlockList.air.instance(), false);
/*  86:192 */     a(paramaqu, parambjb, 12, 1, 1, 16, 3, 3, BlockList.A.instance(), BlockList.air.instance(), false);
/*  87:193 */     a(paramaqu, parambjb, 12, 1, 2, 16, 2, 2, BlockList.air.instance(), BlockList.air.instance(), false);
/*  88:    */     
/*  89:    */ 
/*  90:196 */     a(paramaqu, parambjb, 5, 4, 5, this.a - 6, 4, this.c - 6, BlockList.A.instance(), BlockList.A.instance(), false);
/*  91:197 */     a(paramaqu, parambjb, 9, 4, 9, 11, 4, 11, BlockList.air.instance(), BlockList.air.instance(), false);
/*  92:198 */     a(paramaqu, parambjb, 8, 1, 8, 8, 3, 8, BlockList.A.a(bae.c.a()), BlockList.A.a(bae.c.a()), false);
/*  93:199 */     a(paramaqu, parambjb, 12, 1, 8, 12, 3, 8, BlockList.A.a(bae.c.a()), BlockList.A.a(bae.c.a()), false);
/*  94:200 */     a(paramaqu, parambjb, 8, 1, 12, 8, 3, 12, BlockList.A.a(bae.c.a()), BlockList.A.a(bae.c.a()), false);
/*  95:201 */     a(paramaqu, parambjb, 12, 1, 12, 12, 3, 12, BlockList.A.a(bae.c.a()), BlockList.A.a(bae.c.a()), false);
/*  96:    */     
/*  97:    */ 
/*  98:204 */     a(paramaqu, parambjb, 1, 1, 5, 4, 4, 11, BlockList.A.instance(), BlockList.A.instance(), false);
/*  99:205 */     a(paramaqu, parambjb, this.a - 5, 1, 5, this.a - 2, 4, 11, BlockList.A.instance(), BlockList.A.instance(), false);
/* 100:206 */     a(paramaqu, parambjb, 6, 7, 9, 6, 7, 11, BlockList.A.instance(), BlockList.A.instance(), false);
/* 101:207 */     a(paramaqu, parambjb, this.a - 7, 7, 9, this.a - 7, 7, 11, BlockList.A.instance(), BlockList.A.instance(), false);
/* 102:208 */     a(paramaqu, parambjb, 5, 5, 9, 5, 7, 11, BlockList.A.a(bae.c.a()), BlockList.A.a(bae.c.a()), false);
/* 103:209 */     a(paramaqu, parambjb, this.a - 6, 5, 9, this.a - 6, 7, 11, BlockList.A.a(bae.c.a()), BlockList.A.a(bae.c.a()), false);
/* 104:210 */     a(paramaqu, BlockList.air.instance(), 5, 5, 10, parambjb);
/* 105:211 */     a(paramaqu, BlockList.air.instance(), 5, 6, 10, parambjb);
/* 106:212 */     a(paramaqu, BlockList.air.instance(), 6, 6, 10, parambjb);
/* 107:213 */     a(paramaqu, BlockList.air.instance(), this.a - 6, 5, 10, parambjb);
/* 108:214 */     a(paramaqu, BlockList.air.instance(), this.a - 6, 6, 10, parambjb);
/* 109:215 */     a(paramaqu, BlockList.air.instance(), this.a - 7, 6, 10, parambjb);
/* 110:    */     
/* 111:    */ 
/* 112:218 */     a(paramaqu, parambjb, 2, 4, 4, 2, 6, 4, BlockList.air.instance(), BlockList.air.instance(), false);
/* 113:219 */     a(paramaqu, parambjb, this.a - 3, 4, 4, this.a - 3, 6, 4, BlockList.air.instance(), BlockList.air.instance(), false);
/* 114:220 */     a(paramaqu, BlockList.bO.a(i), 2, 4, 5, parambjb);
/* 115:221 */     a(paramaqu, BlockList.bO.a(i), 2, 3, 4, parambjb);
/* 116:222 */     a(paramaqu, BlockList.bO.a(i), this.a - 3, 4, 5, parambjb);
/* 117:223 */     a(paramaqu, BlockList.bO.a(i), this.a - 3, 3, 4, parambjb);
/* 118:224 */     a(paramaqu, parambjb, 1, 1, 3, 2, 2, 3, BlockList.A.instance(), BlockList.A.instance(), false);
/* 119:225 */     a(paramaqu, parambjb, this.a - 3, 1, 3, this.a - 2, 2, 3, BlockList.A.instance(), BlockList.A.instance(), false);
/* 120:226 */     a(paramaqu, BlockList.bO.instance(), 1, 1, 2, parambjb);
/* 121:227 */     a(paramaqu, BlockList.bO.instance(), this.a - 2, 1, 2, parambjb);
/* 122:228 */     a(paramaqu, BlockList.U.a(bbg.b.a()), 1, 2, 2, parambjb);
/* 123:229 */     a(paramaqu, BlockList.U.a(bbg.b.a()), this.a - 2, 2, 2, parambjb);
/* 124:230 */     a(paramaqu, BlockList.bO.a(m), 2, 1, 2, parambjb);
/* 125:231 */     a(paramaqu, BlockList.bO.a(k), this.a - 3, 1, 2, parambjb);
/* 126:    */     
/* 127:    */ 
/* 128:234 */     a(paramaqu, parambjb, 4, 3, 5, 4, 3, 18, BlockList.A.instance(), BlockList.A.instance(), false);
/* 129:235 */     a(paramaqu, parambjb, this.a - 5, 3, 5, this.a - 5, 3, 17, BlockList.A.instance(), BlockList.A.instance(), false);
/* 130:236 */     a(paramaqu, parambjb, 3, 1, 5, 4, 2, 16, BlockList.air.instance(), BlockList.air.instance(), false);
/* 131:237 */     a(paramaqu, parambjb, this.a - 6, 1, 5, this.a - 5, 2, 16, BlockList.air.instance(), BlockList.air.instance(), false);
/* 132:238 */     for (int i2 = 5; i2 <= 17; i2 += 2)
/* 133:    */     {
/* 134:239 */       a(paramaqu, BlockList.A.a(bae.c.a()), 4, 1, i2, parambjb);
/* 135:240 */       a(paramaqu, BlockList.A.a(bae.b.a()), 4, 2, i2, parambjb);
/* 136:241 */       a(paramaqu, BlockList.A.a(bae.c.a()), this.a - 5, 1, i2, parambjb);
/* 137:242 */       a(paramaqu, BlockList.A.a(bae.b.a()), this.a - 5, 2, i2, parambjb);
/* 138:    */     }
/* 139:244 */     a(paramaqu, BlockList.cu.a(n), 10, 0, 7, parambjb);
/* 140:245 */     a(paramaqu, BlockList.cu.a(n), 10, 0, 8, parambjb);
/* 141:246 */     a(paramaqu, BlockList.cu.a(n), 9, 0, 9, parambjb);
/* 142:247 */     a(paramaqu, BlockList.cu.a(n), 11, 0, 9, parambjb);
/* 143:248 */     a(paramaqu, BlockList.cu.a(n), 8, 0, 10, parambjb);
/* 144:249 */     a(paramaqu, BlockList.cu.a(n), 12, 0, 10, parambjb);
/* 145:250 */     a(paramaqu, BlockList.cu.a(n), 7, 0, 10, parambjb);
/* 146:251 */     a(paramaqu, BlockList.cu.a(n), 13, 0, 10, parambjb);
/* 147:252 */     a(paramaqu, BlockList.cu.a(n), 9, 0, 11, parambjb);
/* 148:253 */     a(paramaqu, BlockList.cu.a(n), 11, 0, 11, parambjb);
/* 149:254 */     a(paramaqu, BlockList.cu.a(n), 10, 0, 12, parambjb);
/* 150:255 */     a(paramaqu, BlockList.cu.a(n), 10, 0, 13, parambjb);
/* 151:256 */     a(paramaqu, BlockList.cu.a(i1), 10, 0, 10, parambjb);
/* 152:259 */     for (int i2 = 0; i2 <= this.a - 1; i2 += this.a - 1)
/* 153:    */     {
/* 154:260 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2, 2, 1, parambjb);
/* 155:261 */       a(paramaqu, BlockList.cu.a(n), i2, 2, 2, parambjb);
/* 156:262 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2, 2, 3, parambjb);
/* 157:263 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2, 3, 1, parambjb);
/* 158:264 */       a(paramaqu, BlockList.cu.a(n), i2, 3, 2, parambjb);
/* 159:265 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2, 3, 3, parambjb);
/* 160:266 */       a(paramaqu, BlockList.cu.a(n), i2, 4, 1, parambjb);
/* 161:267 */       a(paramaqu, BlockList.A.a(bae.b.a()), i2, 4, 2, parambjb);
/* 162:268 */       a(paramaqu, BlockList.cu.a(n), i2, 4, 3, parambjb);
/* 163:269 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2, 5, 1, parambjb);
/* 164:270 */       a(paramaqu, BlockList.cu.a(n), i2, 5, 2, parambjb);
/* 165:271 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2, 5, 3, parambjb);
/* 166:272 */       a(paramaqu, BlockList.cu.a(n), i2, 6, 1, parambjb);
/* 167:273 */       a(paramaqu, BlockList.A.a(bae.b.a()), i2, 6, 2, parambjb);
/* 168:274 */       a(paramaqu, BlockList.cu.a(n), i2, 6, 3, parambjb);
/* 169:275 */       a(paramaqu, BlockList.cu.a(n), i2, 7, 1, parambjb);
/* 170:276 */       a(paramaqu, BlockList.cu.a(n), i2, 7, 2, parambjb);
/* 171:277 */       a(paramaqu, BlockList.cu.a(n), i2, 7, 3, parambjb);
/* 172:278 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2, 8, 1, parambjb);
/* 173:279 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2, 8, 2, parambjb);
/* 174:280 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2, 8, 3, parambjb);
/* 175:    */     }
/* 176:282 */     for (int i2 = 2; i2 <= this.a - 3; i2 += this.a - 3 - 2)
/* 177:    */     {
/* 178:283 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2 - 1, 2, 0, parambjb);
/* 179:284 */       a(paramaqu, BlockList.cu.a(n), i2, 2, 0, parambjb);
/* 180:285 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2 + 1, 2, 0, parambjb);
/* 181:286 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2 - 1, 3, 0, parambjb);
/* 182:287 */       a(paramaqu, BlockList.cu.a(n), i2, 3, 0, parambjb);
/* 183:288 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2 + 1, 3, 0, parambjb);
/* 184:289 */       a(paramaqu, BlockList.cu.a(n), i2 - 1, 4, 0, parambjb);
/* 185:290 */       a(paramaqu, BlockList.A.a(bae.b.a()), i2, 4, 0, parambjb);
/* 186:291 */       a(paramaqu, BlockList.cu.a(n), i2 + 1, 4, 0, parambjb);
/* 187:292 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2 - 1, 5, 0, parambjb);
/* 188:293 */       a(paramaqu, BlockList.cu.a(n), i2, 5, 0, parambjb);
/* 189:294 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2 + 1, 5, 0, parambjb);
/* 190:295 */       a(paramaqu, BlockList.cu.a(n), i2 - 1, 6, 0, parambjb);
/* 191:296 */       a(paramaqu, BlockList.A.a(bae.b.a()), i2, 6, 0, parambjb);
/* 192:297 */       a(paramaqu, BlockList.cu.a(n), i2 + 1, 6, 0, parambjb);
/* 193:298 */       a(paramaqu, BlockList.cu.a(n), i2 - 1, 7, 0, parambjb);
/* 194:299 */       a(paramaqu, BlockList.cu.a(n), i2, 7, 0, parambjb);
/* 195:300 */       a(paramaqu, BlockList.cu.a(n), i2 + 1, 7, 0, parambjb);
/* 196:301 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2 - 1, 8, 0, parambjb);
/* 197:302 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2, 8, 0, parambjb);
/* 198:303 */       a(paramaqu, BlockList.A.a(bae.c.a()), i2 + 1, 8, 0, parambjb);
/* 199:    */     }
/* 200:305 */     a(paramaqu, parambjb, 8, 4, 0, 12, 6, 0, BlockList.A.a(bae.c.a()), BlockList.A.a(bae.c.a()), false);
/* 201:306 */     a(paramaqu, BlockList.air.instance(), 8, 6, 0, parambjb);
/* 202:307 */     a(paramaqu, BlockList.air.instance(), 12, 6, 0, parambjb);
/* 203:308 */     a(paramaqu, BlockList.cu.a(n), 9, 5, 0, parambjb);
/* 204:309 */     a(paramaqu, BlockList.A.a(bae.b.a()), 10, 5, 0, parambjb);
/* 205:310 */     a(paramaqu, BlockList.cu.a(n), 11, 5, 0, parambjb);
/* 206:    */     
/* 207:    */ 
/* 208:313 */     a(paramaqu, parambjb, 8, -14, 8, 12, -11, 12, BlockList.A.a(bae.c.a()), BlockList.A.a(bae.c.a()), false);
/* 209:314 */     a(paramaqu, parambjb, 8, -10, 8, 12, -10, 12, BlockList.A.a(bae.b.a()), BlockList.A.a(bae.b.a()), false);
/* 210:315 */     a(paramaqu, parambjb, 8, -9, 8, 12, -9, 12, BlockList.A.a(bae.c.a()), BlockList.A.a(bae.c.a()), false);
/* 211:316 */     a(paramaqu, parambjb, 8, -8, 8, 12, -1, 12, BlockList.A.instance(), BlockList.A.instance(), false);
/* 212:317 */     a(paramaqu, parambjb, 9, -11, 9, 11, -1, 11, BlockList.air.instance(), BlockList.air.instance(), false);
/* 213:318 */     a(paramaqu, BlockList.az.instance(), 10, -11, 10, parambjb);
/* 214:319 */     a(paramaqu, parambjb, 9, -13, 9, 11, -13, 11, BlockList.W.instance(), BlockList.air.instance(), false);
/* 215:320 */     a(paramaqu, BlockList.air.instance(), 8, -11, 10, parambjb);
/* 216:321 */     a(paramaqu, BlockList.air.instance(), 8, -10, 10, parambjb);
/* 217:322 */     a(paramaqu, BlockList.A.a(bae.b.a()), 7, -10, 10, parambjb);
/* 218:323 */     a(paramaqu, BlockList.A.a(bae.c.a()), 7, -11, 10, parambjb);
/* 219:324 */     a(paramaqu, BlockList.air.instance(), 12, -11, 10, parambjb);
/* 220:325 */     a(paramaqu, BlockList.air.instance(), 12, -10, 10, parambjb);
/* 221:326 */     a(paramaqu, BlockList.A.a(bae.b.a()), 13, -10, 10, parambjb);
/* 222:327 */     a(paramaqu, BlockList.A.a(bae.c.a()), 13, -11, 10, parambjb);
/* 223:328 */     a(paramaqu, BlockList.air.instance(), 10, -11, 8, parambjb);
/* 224:329 */     a(paramaqu, BlockList.air.instance(), 10, -10, 8, parambjb);
/* 225:330 */     a(paramaqu, BlockList.A.a(bae.b.a()), 10, -10, 7, parambjb);
/* 226:331 */     a(paramaqu, BlockList.A.a(bae.c.a()), 10, -11, 7, parambjb);
/* 227:332 */     a(paramaqu, BlockList.air.instance(), 10, -11, 12, parambjb);
/* 228:333 */     a(paramaqu, BlockList.air.instance(), 10, -10, 12, parambjb);
/* 229:334 */     a(paramaqu, BlockList.A.a(bae.b.a()), 10, -10, 13, parambjb);
/* 230:335 */     a(paramaqu, BlockList.A.a(bae.c.a()), 10, -11, 13, parambjb);
/* 231:338 */     for (EnumDirection localej : en.HORIZONTAL) {
/* 232:339 */       if (!this.e[localej.b()])
/* 233:    */       {
/* 234:340 */         int i3 = localej.g() * 2;
/* 235:341 */         int i4 = localej.i() * 2;
/* 236:342 */         this.e[localej.b()] = a(paramaqu, parambjb, paramRandom, 10 + i3, -11, 10 + i4, vl.a(f, new vl[] { ItemList.cd.b(paramRandom) }), 2 + paramRandom.nextInt(5));
/* 237:    */       }
/* 238:    */     }
/* 239:346 */     return true;
/* 240:    */   }
/* 241:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     blk
 * JD-Core Version:    0.7.0.1
 */