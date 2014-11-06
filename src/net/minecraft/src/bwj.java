package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import com.google.common.primitives.Floats;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Random;
/*   5:    */ 
/*   6:    */ public class bwj
/*   7:    */   extends bxf
/*   8:    */   implements bun, bvb
/*   9:    */ {
/*  10:    */   private bwf i;
/*  11:165 */   protected String a = "Customize World Settings";
/*  12:166 */   protected String f = "Page 1 of 3";
/*  13:167 */   protected String g = "Basic Settings";
/*  14:168 */   protected String[] h = new String[4];
/*  15:    */   private buz r;
/*  16:    */   private bug s;
/*  17:    */   private bug t;
/*  18:    */   private bug u;
/*  19:    */   private bug v;
/*  20:    */   private bug w;
/*  21:    */   private bug x;
/*  22:    */   private bug y;
/*  23:    */   private bug z;
/*  24:179 */   private boolean A = false;
/*  25:180 */   private int B = 0;
/*  26:181 */   private boolean C = false;
/*  27:183 */   private Predicate<String> D = new bwk(this);
/*  28:191 */   private bgn E = new bgn();
/*  29:    */   private bgn F;
/*  30:193 */   private Random G = new Random();
/*  31:    */   
/*  32:    */   public bwj(bxf parambxf, String paramString)
/*  33:    */   {
/*  34:196 */     this.i = ((bwf)parambxf);
/*  35:197 */     a(paramString);
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void b()
/*  39:    */   {
/*  40:202 */     this.a = cwc.a("options.customizeTitle", new Object[0]);
/*  41:203 */     this.n.clear();
/*  42:    */     
/*  43:205 */     this.n.add(this.v = new bug(302, 20, 5, 80, 20, cwc.a("createWorld.customize.custom.prev", new Object[0])));
/*  44:206 */     this.n.add(this.w = new bug(303, this.l - 100, 5, 80, 20, cwc.a("createWorld.customize.custom.next", new Object[0])));
/*  45:    */     
/*  46:208 */     this.n.add(this.u = new bug(304, this.l / 2 - 187, this.m - 27, 90, 20, cwc.a("createWorld.customize.custom.defaults", new Object[0])));
/*  47:209 */     this.n.add(this.t = new bug(301, this.l / 2 - 92, this.m - 27, 90, 20, cwc.a("createWorld.customize.custom.randomize", new Object[0])));
/*  48:210 */     this.n.add(this.z = new bug(305, this.l / 2 + 3, this.m - 27, 90, 20, cwc.a("createWorld.customize.custom.presets", new Object[0])));
/*  49:211 */     this.n.add(this.s = new bug(300, this.l / 2 + 98, this.m - 27, 90, 20, cwc.a("gui.done", new Object[0])));
/*  50:    */     
/*  51:213 */     this.x = new bug(306, this.l / 2 - 55, 160, 50, 20, cwc.a("gui.yes", new Object[0]));
/*  52:214 */     this.x.m = false;
/*  53:215 */     this.n.add(this.x);
/*  54:    */     
/*  55:217 */     this.y = new bug(307, this.l / 2 + 5, 160, 50, 20, cwc.a("gui.no", new Object[0]));
/*  56:218 */     this.y.m = false;
/*  57:219 */     this.n.add(this.y);
/*  58:    */     
/*  59:221 */     f();
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void k()
/*  63:    */   {
/*  64:226 */     super.k();
/*  65:227 */     this.r.p();
/*  66:    */   }
/*  67:    */   
/*  68:    */   private void f()
/*  69:    */   {
/*  70:231 */     bvf[] arrayOfbvf1 = { new bvg(160, cwc.a("createWorld.customize.custom.seaLevel", new Object[0]), true, this, 1.0F, 255.0F, this.F.r), new bva(148, cwc.a("createWorld.customize.custom.useCaves", new Object[0]), true, this.F.s), new bva(150, cwc.a("createWorld.customize.custom.useStrongholds", new Object[0]), true, this.F.v), new bva(151, cwc.a("createWorld.customize.custom.useVillages", new Object[0]), true, this.F.w), new bva(152, cwc.a("createWorld.customize.custom.useMineShafts", new Object[0]), true, this.F.x), new bva(153, cwc.a("createWorld.customize.custom.useTemples", new Object[0]), true, this.F.y), new bva(210, cwc.a("createWorld.customize.custom.useMonuments", new Object[0]), true, this.F.z), new bva(154, cwc.a("createWorld.customize.custom.useRavines", new Object[0]), true, this.F.A), new bva(149, cwc.a("createWorld.customize.custom.useDungeons", new Object[0]), true, this.F.t), new bvg(157, cwc.a("createWorld.customize.custom.dungeonChance", new Object[0]), true, this, 1.0F, 100.0F, this.F.u), new bva(155, cwc.a("createWorld.customize.custom.useWaterLakes", new Object[0]), true, this.F.B), new bvg(158, cwc.a("createWorld.customize.custom.waterLakeChance", new Object[0]), true, this, 1.0F, 100.0F, this.F.C), new bva(156, cwc.a("createWorld.customize.custom.useLavaLakes", new Object[0]), true, this.F.D), new bvg(159, cwc.a("createWorld.customize.custom.lavaLakeChance", new Object[0]), true, this, 10.0F, 100.0F, this.F.E), new bva(161, cwc.a("createWorld.customize.custom.useLavaOceans", new Object[0]), true, this.F.F), new bvg(162, cwc.a("createWorld.customize.custom.fixedBiome", new Object[0]), true, this, -1.0F, 37.0F, this.F.G), new bvg(163, cwc.a("createWorld.customize.custom.biomeSize", new Object[0]), true, this, 1.0F, 8.0F, this.F.H), new bvg(164, cwc.a("createWorld.customize.custom.riverSize", new Object[0]), true, this, 1.0F, 5.0F, this.F.I) };
/*  71:    */     
/*  72:    */ 
/*  73:    */ 
/*  74:    */ 
/*  75:    */ 
/*  76:    */ 
/*  77:    */ 
/*  78:    */ 
/*  79:    */ 
/*  80:    */ 
/*  81:    */ 
/*  82:    */ 
/*  83:    */ 
/*  84:    */ 
/*  85:    */ 
/*  86:    */ 
/*  87:    */ 
/*  88:    */ 
/*  89:    */ 
/*  90:    */ 
/*  91:252 */     bvf[] arrayOfbvf2 = { new bve(416, cwc.a("tile.dirt.name", new Object[0]), false), null, new bvg(165, cwc.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, this.F.dirtRadius), new bvg(166, cwc.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, this.F.dirtPerChunk), new bvg(167, cwc.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.L), new bvg(168, cwc.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.M), new bve(417, cwc.a("tile.gravel.name", new Object[0]), false), null, new bvg(169, cwc.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, this.F.N), new bvg(170, cwc.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, this.F.O), new bvg(171, cwc.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.P), new bvg(172, cwc.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.Q), new bve(418, cwc.a("tile.stone.granite.name", new Object[0]), false), null, new bvg(173, cwc.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, this.F.R), new bvg(174, cwc.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, this.F.S), new bvg(175, cwc.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.T), new bvg(176, cwc.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.U), new bve(419, cwc.a("tile.stone.diorite.name", new Object[0]), false), null, new bvg(177, cwc.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, this.F.V), new bvg(178, cwc.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, this.F.W), new bvg(179, cwc.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.X), new bvg(180, cwc.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.Y), new bve(420, cwc.a("tile.stone.andesite.name", new Object[0]), false), null, new bvg(181, cwc.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, this.F.Z), new bvg(182, cwc.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, this.F.aa), new bvg(183, cwc.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.ab), new bvg(184, cwc.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.ac), new bve(421, cwc.a("tile.oreCoal.name", new Object[0]), false), null, new bvg(185, cwc.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, this.F.ad), new bvg(186, cwc.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, this.F.ae), new bvg(187, cwc.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.af), new bvg(189, cwc.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.ag), new bve(422, cwc.a("tile.oreIron.name", new Object[0]), false), null, new bvg(190, cwc.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, this.F.ah), new bvg(191, cwc.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, this.F.ai), new bvg(192, cwc.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.aj), new bvg(193, cwc.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.ak), new bve(423, cwc.a("tile.oreGold.name", new Object[0]), false), null, new bvg(194, cwc.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, this.F.al), new bvg(195, cwc.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, this.F.am), new bvg(196, cwc.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.an), new bvg(197, cwc.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.ao), new bve(424, cwc.a("tile.oreRedstone.name", new Object[0]), false), null, new bvg(198, cwc.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, this.F.redStoneRadius), new bvg(199, cwc.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, this.F.redstonePerChunk), new bvg(200, cwc.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.redstoneY1), new bvg(201, cwc.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.redstoneY2), new bve(425, cwc.a("tile.oreDiamond.name", new Object[0]), false), null, new bvg(202, cwc.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, this.F.diamondRadius), new bvg(203, cwc.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, this.F.diamondPerChunk), new bvg(204, cwc.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.diamondY1), new bvg(205, cwc.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, this.F.diamondY2), new bve(426, cwc.a("tile.oreLapis.name", new Object[0]), false), null, new bvg(206, cwc.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, this.F.lapisRadius), new bvg(207, cwc.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, this.F.lapisPerChunk), new bvg(208, cwc.a("createWorld.customize.custom.center", new Object[0]), false, this, 0.0F, 255.0F, this.F.az), new bvg(209, cwc.a("createWorld.customize.custom.spread", new Object[0]), false, this, 0.0F, 255.0F, this.F.aA) };
/*  92:    */     
/*  93:    */ 
/*  94:    */ 
/*  95:    */ 
/*  96:    */ 
/*  97:    */ 
/*  98:    */ 
/*  99:    */ 
/* 100:    */ 
/* 101:    */ 
/* 102:    */ 
/* 103:    */ 
/* 104:    */ 
/* 105:    */ 
/* 106:    */ 
/* 107:    */ 
/* 108:    */ 
/* 109:    */ 
/* 110:    */ 
/* 111:    */ 
/* 112:    */ 
/* 113:    */ 
/* 114:    */ 
/* 115:    */ 
/* 116:    */ 
/* 117:    */ 
/* 118:    */ 
/* 119:    */ 
/* 120:    */ 
/* 121:    */ 
/* 122:    */ 
/* 123:    */ 
/* 124:    */ 
/* 125:    */ 
/* 126:    */ 
/* 127:    */ 
/* 128:    */ 
/* 129:    */ 
/* 130:    */ 
/* 131:    */ 
/* 132:    */ 
/* 133:    */ 
/* 134:    */ 
/* 135:    */ 
/* 136:    */ 
/* 137:    */ 
/* 138:    */ 
/* 139:    */ 
/* 140:    */ 
/* 141:    */ 
/* 142:    */ 
/* 143:    */ 
/* 144:    */ 
/* 145:    */ 
/* 146:    */ 
/* 147:    */ 
/* 148:    */ 
/* 149:310 */     bvf[] arrayOfbvf3 = { new bvg(100, cwc.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0]), false, this, 1.0F, 5000.0F, this.F.i), new bvg(101, cwc.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0]), false, this, 1.0F, 5000.0F, this.F.j), new bvg(102, cwc.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]), false, this, 1.0F, 5000.0F, this.F.k), new bvg(103, cwc.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0]), false, this, 1.0F, 2000.0F, this.F.f), new bvg(104, cwc.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]), false, this, 1.0F, 2000.0F, this.F.g), new bvg(105, cwc.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]), false, this, 0.01F, 20.0F, this.F.h), new bvg(106, cwc.a("createWorld.customize.custom.baseSize", new Object[0]), false, this, 1.0F, 25.0F, this.F.l), new bvg(107, cwc.a("createWorld.customize.custom.coordinateScale", new Object[0]), false, this, 1.0F, 6000.0F, this.F.b), new bvg(108, cwc.a("createWorld.customize.custom.heightScale", new Object[0]), false, this, 1.0F, 6000.0F, this.F.c), new bvg(109, cwc.a("createWorld.customize.custom.stretchY", new Object[0]), false, this, 0.01F, 50.0F, this.F.m), new bvg(110, cwc.a("createWorld.customize.custom.upperLimitScale", new Object[0]), false, this, 1.0F, 5000.0F, this.F.d), new bvg(111, cwc.a("createWorld.customize.custom.lowerLimitScale", new Object[0]), false, this, 1.0F, 5000.0F, this.F.e), new bvg(112, cwc.a("createWorld.customize.custom.biomeDepthWeight", new Object[0]), false, this, 1.0F, 20.0F, this.F.n), new bvg(113, cwc.a("createWorld.customize.custom.biomeDepthOffset", new Object[0]), false, this, 0.0F, 20.0F, this.F.o), new bvg(114, cwc.a("createWorld.customize.custom.biomeScaleWeight", new Object[0]), false, this, 1.0F, 20.0F, this.F.p), new bvg(115, cwc.a("createWorld.customize.custom.biomeScaleOffset", new Object[0]), false, this, 0.0F, 20.0F, this.F.q) };
/* 150:    */     
/* 151:    */ 
/* 152:    */ 
/* 153:    */ 
/* 154:    */ 
/* 155:    */ 
/* 156:    */ 
/* 157:    */ 
/* 158:    */ 
/* 159:    */ 
/* 160:    */ 
/* 161:    */ 
/* 162:    */ 
/* 163:    */ 
/* 164:    */ 
/* 165:    */ 
/* 166:    */ 
/* 167:    */ 
/* 168:329 */     bvf[] arrayOfbvf4 = { new bve(400, cwc.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0]) + ":", false), new bvc(132, String.format("%5.3f", new Object[] { Float.valueOf(this.F.i) }), false, this.D), new bve(401, cwc.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0]) + ":", false), new bvc(133, String.format("%5.3f", new Object[] { Float.valueOf(this.F.j) }), false, this.D), new bve(402, cwc.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]) + ":", false), new bvc(134, String.format("%5.3f", new Object[] { Float.valueOf(this.F.k) }), false, this.D), new bve(403, cwc.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0]) + ":", false), new bvc(135, String.format("%5.3f", new Object[] { Float.valueOf(this.F.f) }), false, this.D), new bve(404, cwc.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]) + ":", false), new bvc(136, String.format("%5.3f", new Object[] { Float.valueOf(this.F.g) }), false, this.D), new bve(405, cwc.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]) + ":", false), new bvc(137, String.format("%2.3f", new Object[] { Float.valueOf(this.F.h) }), false, this.D), new bve(406, cwc.a("createWorld.customize.custom.baseSize", new Object[0]) + ":", false), new bvc(138, String.format("%2.3f", new Object[] { Float.valueOf(this.F.l) }), false, this.D), new bve(407, cwc.a("createWorld.customize.custom.coordinateScale", new Object[0]) + ":", false), new bvc(139, String.format("%5.3f", new Object[] { Float.valueOf(this.F.b) }), false, this.D), new bve(408, cwc.a("createWorld.customize.custom.heightScale", new Object[0]) + ":", false), new bvc(140, String.format("%5.3f", new Object[] { Float.valueOf(this.F.c) }), false, this.D), new bve(409, cwc.a("createWorld.customize.custom.stretchY", new Object[0]) + ":", false), new bvc(141, String.format("%2.3f", new Object[] { Float.valueOf(this.F.m) }), false, this.D), new bve(410, cwc.a("createWorld.customize.custom.upperLimitScale", new Object[0]) + ":", false), new bvc(142, String.format("%5.3f", new Object[] { Float.valueOf(this.F.d) }), false, this.D), new bve(411, cwc.a("createWorld.customize.custom.lowerLimitScale", new Object[0]) + ":", false), new bvc(143, String.format("%5.3f", new Object[] { Float.valueOf(this.F.e) }), false, this.D), new bve(412, cwc.a("createWorld.customize.custom.biomeDepthWeight", new Object[0]) + ":", false), new bvc(144, String.format("%2.3f", new Object[] { Float.valueOf(this.F.n) }), false, this.D), new bve(413, cwc.a("createWorld.customize.custom.biomeDepthOffset", new Object[0]) + ":", false), new bvc(145, String.format("%2.3f", new Object[] { Float.valueOf(this.F.o) }), false, this.D), new bve(414, cwc.a("createWorld.customize.custom.biomeScaleWeight", new Object[0]) + ":", false), new bvc(146, String.format("%2.3f", new Object[] { Float.valueOf(this.F.p) }), false, this.D), new bve(415, cwc.a("createWorld.customize.custom.biomeScaleOffset", new Object[0]) + ":", false), new bvc(147, String.format("%2.3f", new Object[] { Float.valueOf(this.F.q) }), false, this.D) };
/* 169:    */     
/* 170:    */ 
/* 171:    */ 
/* 172:    */ 
/* 173:    */ 
/* 174:    */ 
/* 175:    */ 
/* 176:    */ 
/* 177:    */ 
/* 178:    */ 
/* 179:    */ 
/* 180:    */ 
/* 181:    */ 
/* 182:    */ 
/* 183:    */ 
/* 184:    */ 
/* 185:    */ 
/* 186:    */ 
/* 187:    */ 
/* 188:    */ 
/* 189:    */ 
/* 190:    */ 
/* 191:    */ 
/* 192:    */ 
/* 193:    */ 
/* 194:    */ 
/* 195:    */ 
/* 196:    */ 
/* 197:    */ 
/* 198:    */ 
/* 199:    */ 
/* 200:    */ 
/* 201:    */ 
/* 202:    */ 
/* 203:364 */     this.r = new buz(this.j, this.l, this.m, 32, this.m - 32, 25, this, new bvf[][] { arrayOfbvf1, arrayOfbvf2, arrayOfbvf3, arrayOfbvf4 });
/* 204:366 */     for (int j = 0; j < 4; j++) {
/* 205:367 */       this.h[j] = cwc.a("createWorld.customize.custom.page" + j, new Object[0]);
/* 206:    */     }
/* 207:369 */     i();
/* 208:    */   }
/* 209:    */   
/* 210:    */   public String a()
/* 211:    */   {
/* 212:373 */     return this.F.toString().replace("\n", "");
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void a(String paramString)
/* 216:    */   {
/* 217:377 */     if ((paramString != null) && (paramString.length() != 0)) {
/* 218:378 */       this.F = bgn.a(paramString);
/* 219:    */     } else {
/* 220:380 */       this.F = new bgn();
/* 221:    */     }
/* 222:    */   }
/* 223:    */   
/* 224:    */   public void a(int paramInt, String paramString)
/* 225:    */   {
/* 226:386 */     float f1 = 0.0F;
/* 227:    */     try
/* 228:    */     {
/* 229:388 */       f1 = Float.parseFloat(paramString);
/* 230:    */     }
/* 231:    */     catch (NumberFormatException localNumberFormatException) {}
/* 232:393 */     float f2 = 0.0F;
/* 233:394 */     switch (paramInt)
/* 234:    */     {
/* 235:    */     case 139: 
/* 236:396 */       f2 = this.F.b = MathUtils.clamp(f1, 1.0F, 6000.0F);
/* 237:397 */       break;
/* 238:    */     case 140: 
/* 239:399 */       f2 = this.F.c = MathUtils.clamp(f1, 1.0F, 6000.0F);
/* 240:400 */       break;
/* 241:    */     case 142: 
/* 242:402 */       f2 = this.F.d = MathUtils.clamp(f1, 1.0F, 5000.0F);
/* 243:403 */       break;
/* 244:    */     case 143: 
/* 245:405 */       f2 = this.F.e = MathUtils.clamp(f1, 1.0F, 5000.0F);
/* 246:406 */       break;
/* 247:    */     case 135: 
/* 248:408 */       f2 = this.F.f = MathUtils.clamp(f1, 1.0F, 2000.0F);
/* 249:409 */       break;
/* 250:    */     case 136: 
/* 251:411 */       f2 = this.F.g = MathUtils.clamp(f1, 1.0F, 2000.0F);
/* 252:412 */       break;
/* 253:    */     case 137: 
/* 254:414 */       f2 = this.F.h = MathUtils.clamp(f1, 0.01F, 20.0F);
/* 255:415 */       break;
/* 256:    */     case 132: 
/* 257:417 */       f2 = this.F.i = MathUtils.clamp(f1, 1.0F, 5000.0F);
/* 258:418 */       break;
/* 259:    */     case 133: 
/* 260:420 */       f2 = this.F.j = MathUtils.clamp(f1, 1.0F, 5000.0F);
/* 261:421 */       break;
/* 262:    */     case 134: 
/* 263:423 */       f2 = this.F.k = MathUtils.clamp(f1, 1.0F, 5000.0F);
/* 264:424 */       break;
/* 265:    */     case 138: 
/* 266:426 */       f2 = this.F.l = MathUtils.clamp(f1, 1.0F, 25.0F);
/* 267:427 */       break;
/* 268:    */     case 141: 
/* 269:429 */       f2 = this.F.m = MathUtils.clamp(f1, 0.01F, 50.0F);
/* 270:430 */       break;
/* 271:    */     case 144: 
/* 272:432 */       f2 = this.F.n = MathUtils.clamp(f1, 1.0F, 20.0F);
/* 273:433 */       break;
/* 274:    */     case 145: 
/* 275:435 */       f2 = this.F.o = MathUtils.clamp(f1, 0.0F, 20.0F);
/* 276:436 */       break;
/* 277:    */     case 146: 
/* 278:438 */       f2 = this.F.p = MathUtils.clamp(f1, 1.0F, 20.0F);
/* 279:439 */       break;
/* 280:    */     case 147: 
/* 281:441 */       f2 = this.F.q = MathUtils.clamp(f1, 0.0F, 20.0F);
/* 282:    */     }
/* 283:445 */     if ((f2 != f1) && (f1 != 0.0F)) {
/* 284:446 */       ((bul)this.r.c(paramInt)).a(b(paramInt, f2));
/* 285:    */     }
/* 286:448 */     ((bum)this.r.c(paramInt - 132 + 100)).a(f2, false);
/* 287:450 */     if (!this.F.equals(this.E)) {
/* 288:451 */       this.A = true;
/* 289:    */     }
/* 290:    */   }
/* 291:    */   
/* 292:    */   public String a(int paramInt, String paramString, float paramFloat)
/* 293:    */   {
/* 294:457 */     return paramString + ": " + b(paramInt, paramFloat);
/* 295:    */   }
/* 296:    */   
/* 297:    */   private String b(int paramInt, float paramFloat)
/* 298:    */   {
/* 299:461 */     switch (paramInt)
/* 300:    */     {
/* 301:    */     case 100: 
/* 302:    */     case 101: 
/* 303:    */     case 102: 
/* 304:    */     case 103: 
/* 305:    */     case 104: 
/* 306:    */     case 107: 
/* 307:    */     case 108: 
/* 308:    */     case 110: 
/* 309:    */     case 111: 
/* 310:    */     case 132: 
/* 311:    */     case 133: 
/* 312:    */     case 134: 
/* 313:    */     case 135: 
/* 314:    */     case 136: 
/* 315:    */     case 139: 
/* 316:    */     case 140: 
/* 317:    */     case 142: 
/* 318:    */     case 143: 
/* 319:480 */       return String.format("%5.3f", new Object[] { Float.valueOf(paramFloat) });
/* 320:    */     case 105: 
/* 321:    */     case 106: 
/* 322:    */     case 109: 
/* 323:    */     case 112: 
/* 324:    */     case 113: 
/* 325:    */     case 114: 
/* 326:    */     case 115: 
/* 327:    */     case 137: 
/* 328:    */     case 138: 
/* 329:    */     case 141: 
/* 330:    */     case 144: 
/* 331:    */     case 145: 
/* 332:    */     case 146: 
/* 333:    */     case 147: 
/* 334:495 */       return String.format("%2.3f", new Object[] { Float.valueOf(paramFloat) });
/* 335:    */     case 162: 
/* 336:497 */       if (paramFloat < 0.0F) {
/* 337:498 */         return cwc.a("gui.all", new Object[0]);
/* 338:    */       }
/* 339:500 */       if ((int)paramFloat >= arm.x.az)
/* 340:    */       {
/* 341:501 */         arm localarm = arm.n()[((int)paramFloat + 2)];
/* 342:502 */         return localarm != null ? localarm.ah : "?";
/* 343:    */       }
/* 344:504 */       arm localarm = arm.n()[((int)paramFloat)];
/* 345:505 */       return localarm != null ? localarm.ah : "?";
/* 346:    */     }
/* 347:507 */     return String.format("%d", new Object[] { Integer.valueOf((int)paramFloat) });
/* 348:    */   }
/* 349:    */   
/* 350:    */   public void a(int paramInt, boolean paramBoolean)
/* 351:    */   {
/* 352:513 */     switch (paramInt)
/* 353:    */     {
/* 354:    */     case 148: 
/* 355:515 */       this.F.s = paramBoolean;
/* 356:516 */       break;
/* 357:    */     case 149: 
/* 358:518 */       this.F.t = paramBoolean;
/* 359:519 */       break;
/* 360:    */     case 150: 
/* 361:521 */       this.F.v = paramBoolean;
/* 362:522 */       break;
/* 363:    */     case 151: 
/* 364:524 */       this.F.w = paramBoolean;
/* 365:525 */       break;
/* 366:    */     case 152: 
/* 367:527 */       this.F.x = paramBoolean;
/* 368:528 */       break;
/* 369:    */     case 153: 
/* 370:530 */       this.F.y = paramBoolean;
/* 371:531 */       break;
/* 372:    */     case 154: 
/* 373:533 */       this.F.A = paramBoolean;
/* 374:534 */       break;
/* 375:    */     case 210: 
/* 376:536 */       this.F.z = paramBoolean;
/* 377:537 */       break;
/* 378:    */     case 155: 
/* 379:539 */       this.F.B = paramBoolean;
/* 380:540 */       break;
/* 381:    */     case 156: 
/* 382:542 */       this.F.D = paramBoolean;
/* 383:543 */       break;
/* 384:    */     case 161: 
/* 385:545 */       this.F.F = paramBoolean;
/* 386:    */     }
/* 387:549 */     if (!this.F.equals(this.E)) {
/* 388:550 */       this.A = true;
/* 389:    */     }
/* 390:    */   }
/* 391:    */   
/* 392:    */   public void a(int paramInt, float paramFloat)
/* 393:    */   {
/* 394:556 */     switch (paramInt)
/* 395:    */     {
/* 396:    */     case 107: 
/* 397:558 */       this.F.b = paramFloat;
/* 398:559 */       break;
/* 399:    */     case 108: 
/* 400:561 */       this.F.c = paramFloat;
/* 401:562 */       break;
/* 402:    */     case 110: 
/* 403:564 */       this.F.d = paramFloat;
/* 404:565 */       break;
/* 405:    */     case 111: 
/* 406:567 */       this.F.e = paramFloat;
/* 407:568 */       break;
/* 408:    */     case 103: 
/* 409:570 */       this.F.f = paramFloat;
/* 410:571 */       break;
/* 411:    */     case 104: 
/* 412:573 */       this.F.g = paramFloat;
/* 413:574 */       break;
/* 414:    */     case 105: 
/* 415:576 */       this.F.h = paramFloat;
/* 416:577 */       break;
/* 417:    */     case 100: 
/* 418:579 */       this.F.i = paramFloat;
/* 419:580 */       break;
/* 420:    */     case 101: 
/* 421:582 */       this.F.j = paramFloat;
/* 422:583 */       break;
/* 423:    */     case 102: 
/* 424:585 */       this.F.k = paramFloat;
/* 425:586 */       break;
/* 426:    */     case 106: 
/* 427:588 */       this.F.l = paramFloat;
/* 428:589 */       break;
/* 429:    */     case 109: 
/* 430:591 */       this.F.m = paramFloat;
/* 431:592 */       break;
/* 432:    */     case 112: 
/* 433:594 */       this.F.n = paramFloat;
/* 434:595 */       break;
/* 435:    */     case 113: 
/* 436:597 */       this.F.o = paramFloat;
/* 437:598 */       break;
/* 438:    */     case 114: 
/* 439:600 */       this.F.p = paramFloat;
/* 440:601 */       break;
/* 441:    */     case 115: 
/* 442:603 */       this.F.q = paramFloat;
/* 443:604 */       break;
/* 444:    */     case 157: 
/* 445:606 */       this.F.u = ((int)paramFloat);
/* 446:607 */       break;
/* 447:    */     case 158: 
/* 448:609 */       this.F.C = ((int)paramFloat);
/* 449:610 */       break;
/* 450:    */     case 159: 
/* 451:612 */       this.F.E = ((int)paramFloat);
/* 452:613 */       break;
/* 453:    */     case 160: 
/* 454:615 */       this.F.r = ((int)paramFloat);
/* 455:616 */       break;
/* 456:    */     case 162: 
/* 457:618 */       this.F.G = ((int)paramFloat);
/* 458:619 */       break;
/* 459:    */     case 163: 
/* 460:621 */       this.F.H = ((int)paramFloat);
/* 461:622 */       break;
/* 462:    */     case 164: 
/* 463:624 */       this.F.I = ((int)paramFloat);
/* 464:625 */       break;
/* 465:    */     case 166: 
/* 466:627 */       this.F.dirtPerChunk = ((int)paramFloat);
/* 467:628 */       break;
/* 468:    */     case 165: 
/* 469:630 */       this.F.dirtRadius = ((int)paramFloat);
/* 470:631 */       break;
/* 471:    */     case 167: 
/* 472:633 */       this.F.L = ((int)paramFloat);
/* 473:634 */       break;
/* 474:    */     case 168: 
/* 475:636 */       this.F.M = ((int)paramFloat);
/* 476:637 */       break;
/* 477:    */     case 170: 
/* 478:639 */       this.F.O = ((int)paramFloat);
/* 479:640 */       break;
/* 480:    */     case 169: 
/* 481:642 */       this.F.N = ((int)paramFloat);
/* 482:643 */       break;
/* 483:    */     case 171: 
/* 484:645 */       this.F.P = ((int)paramFloat);
/* 485:646 */       break;
/* 486:    */     case 172: 
/* 487:648 */       this.F.Q = ((int)paramFloat);
/* 488:649 */       break;
/* 489:    */     case 174: 
/* 490:651 */       this.F.S = ((int)paramFloat);
/* 491:652 */       break;
/* 492:    */     case 173: 
/* 493:654 */       this.F.R = ((int)paramFloat);
/* 494:655 */       break;
/* 495:    */     case 175: 
/* 496:657 */       this.F.T = ((int)paramFloat);
/* 497:658 */       break;
/* 498:    */     case 176: 
/* 499:660 */       this.F.U = ((int)paramFloat);
/* 500:661 */       break;
/* 501:    */     case 178: 
/* 502:663 */       this.F.W = ((int)paramFloat);
/* 503:664 */       break;
/* 504:    */     case 177: 
/* 505:666 */       this.F.V = ((int)paramFloat);
/* 506:667 */       break;
/* 507:    */     case 179: 
/* 508:669 */       this.F.X = ((int)paramFloat);
/* 509:670 */       break;
/* 510:    */     case 180: 
/* 511:672 */       this.F.Y = ((int)paramFloat);
/* 512:673 */       break;
/* 513:    */     case 182: 
/* 514:675 */       this.F.aa = ((int)paramFloat);
/* 515:676 */       break;
/* 516:    */     case 181: 
/* 517:678 */       this.F.Z = ((int)paramFloat);
/* 518:679 */       break;
/* 519:    */     case 183: 
/* 520:681 */       this.F.ab = ((int)paramFloat);
/* 521:682 */       break;
/* 522:    */     case 184: 
/* 523:684 */       this.F.ac = ((int)paramFloat);
/* 524:685 */       break;
/* 525:    */     case 186: 
/* 526:687 */       this.F.ae = ((int)paramFloat);
/* 527:688 */       break;
/* 528:    */     case 185: 
/* 529:690 */       this.F.ad = ((int)paramFloat);
/* 530:691 */       break;
/* 531:    */     case 187: 
/* 532:693 */       this.F.af = ((int)paramFloat);
/* 533:694 */       break;
/* 534:    */     case 189: 
/* 535:696 */       this.F.ag = ((int)paramFloat);
/* 536:697 */       break;
/* 537:    */     case 191: 
/* 538:699 */       this.F.ai = ((int)paramFloat);
/* 539:700 */       break;
/* 540:    */     case 190: 
/* 541:702 */       this.F.ah = ((int)paramFloat);
/* 542:703 */       break;
/* 543:    */     case 192: 
/* 544:705 */       this.F.aj = ((int)paramFloat);
/* 545:706 */       break;
/* 546:    */     case 193: 
/* 547:708 */       this.F.ak = ((int)paramFloat);
/* 548:709 */       break;
/* 549:    */     case 195: 
/* 550:711 */       this.F.am = ((int)paramFloat);
/* 551:712 */       break;
/* 552:    */     case 194: 
/* 553:714 */       this.F.al = ((int)paramFloat);
/* 554:715 */       break;
/* 555:    */     case 196: 
/* 556:717 */       this.F.an = ((int)paramFloat);
/* 557:718 */       break;
/* 558:    */     case 197: 
/* 559:720 */       this.F.ao = ((int)paramFloat);
/* 560:721 */       break;
/* 561:    */     case 199: 
/* 562:723 */       this.F.redstonePerChunk = ((int)paramFloat);
/* 563:724 */       break;
/* 564:    */     case 198: 
/* 565:726 */       this.F.redStoneRadius = ((int)paramFloat);
/* 566:727 */       break;
/* 567:    */     case 200: 
/* 568:729 */       this.F.redstoneY1 = ((int)paramFloat);
/* 569:730 */       break;
/* 570:    */     case 201: 
/* 571:732 */       this.F.redstoneY2 = ((int)paramFloat);
/* 572:733 */       break;
/* 573:    */     case 203: 
/* 574:735 */       this.F.diamondPerChunk = ((int)paramFloat);
/* 575:736 */       break;
/* 576:    */     case 202: 
/* 577:738 */       this.F.diamondRadius = ((int)paramFloat);
/* 578:739 */       break;
/* 579:    */     case 204: 
/* 580:741 */       this.F.diamondY1 = ((int)paramFloat);
/* 581:742 */       break;
/* 582:    */     case 205: 
/* 583:744 */       this.F.diamondY2 = ((int)paramFloat);
/* 584:745 */       break;
/* 585:    */     case 207: 
/* 586:747 */       this.F.lapisPerChunk = ((int)paramFloat);
/* 587:748 */       break;
/* 588:    */     case 206: 
/* 589:750 */       this.F.lapisRadius = ((int)paramFloat);
/* 590:751 */       break;
/* 591:    */     case 208: 
/* 592:753 */       this.F.az = ((int)paramFloat);
/* 593:754 */       break;
/* 594:    */     case 209: 
/* 595:756 */       this.F.aA = ((int)paramFloat);
/* 596:    */     }
/* 597:760 */     if ((paramInt >= 100) && (paramInt < 116))
/* 598:    */     {
/* 599:761 */       bub localbub = this.r.c(paramInt - 100 + 132);
/* 600:762 */       if (localbub != null) {
/* 601:763 */         ((bul)localbub).a(b(paramInt, paramFloat));
/* 602:    */       }
/* 603:    */     }
/* 604:767 */     if (!this.F.equals(this.E)) {
/* 605:768 */       this.A = true;
/* 606:    */     }
/* 607:    */   }
/* 608:    */   
/* 609:    */   protected void a(bug parambug)
/* 610:    */   {
/* 611:774 */     if (!parambug.l) {
/* 612:775 */       return;
/* 613:    */     }
/* 614:778 */     switch (parambug.k)
/* 615:    */     {
/* 616:    */     case 300: 
/* 617:780 */       this.i.a = this.F.toString();
/* 618:781 */       this.j.a(this.i);
/* 619:782 */       break;
/* 620:    */     case 305: 
/* 621:784 */       this.j.a(new bwg(this));
/* 622:785 */       break;
/* 623:    */     case 301: 
/* 624:787 */       for (int j = 0; j < this.r.b(); j++)
/* 625:    */       {
/* 626:788 */         bvd localbvd = this.r.b(j);
/* 627:789 */         bub localbub = localbvd.a();
/* 628:790 */         if ((localbub instanceof bug))
/* 629:    */         {
/* 630:791 */           bug localObject = (bug)localbub;
/* 631:792 */           if ((localObject instanceof bum))
/* 632:    */           {
/* 633:793 */             float f1 = ((bum)localObject).d() * (0.75F + this.G.nextFloat() * 0.5F) + (this.G.nextFloat() * 0.1F - 0.05F);
/* 634:794 */             ((bum)localObject).a(MathUtils.clamp(f1, 0.0F, 1.0F));
/* 635:    */           }
/* 636:795 */           else if ((localObject instanceof bur))
/* 637:    */           {
/* 638:796 */             ((bur)localObject).b(this.G.nextBoolean());
/* 639:    */           }
/* 640:    */         }
/* 641:800 */         Object localObject = localbvd.b();
/* 642:801 */         if ((localObject instanceof bug))
/* 643:    */         {
/* 644:802 */           bug localbug = (bug)localObject;
/* 645:803 */           if ((localbug instanceof bum))
/* 646:    */           {
/* 647:804 */             float f2 = ((bum)localbug).d() * (0.75F + this.G.nextFloat() * 0.5F) + (this.G.nextFloat() * 0.1F - 0.05F);
/* 648:805 */             ((bum)localbug).a(MathUtils.clamp(f2, 0.0F, 1.0F));
/* 649:    */           }
/* 650:806 */           else if ((localbug instanceof bur))
/* 651:    */           {
/* 652:807 */             ((bur)localbug).b(this.G.nextBoolean());
/* 653:    */           }
/* 654:    */         }
/* 655:    */       }
/* 656:811 */       break;
/* 657:    */     case 302: 
/* 658:813 */       this.r.h();
/* 659:814 */       i();
/* 660:815 */       break;
/* 661:    */     case 303: 
/* 662:817 */       this.r.i();
/* 663:818 */       i();
/* 664:819 */       break;
/* 665:    */     case 304: 
/* 666:821 */       if (this.A) {
/* 667:824 */         b(304);
/* 668:    */       }
/* 669:825 */       break;
/* 670:    */     case 307: 
/* 671:827 */       this.B = 0;
/* 672:828 */       h();
/* 673:829 */       break;
/* 674:    */     case 306: 
/* 675:831 */       h();
/* 676:    */     }
/* 677:    */   }
/* 678:    */   
/* 679:    */   private void g()
/* 680:    */   {
/* 681:837 */     this.F.a();
/* 682:838 */     f();
/* 683:    */   }
/* 684:    */   
/* 685:    */   private void b(int paramInt)
/* 686:    */   {
/* 687:842 */     this.B = paramInt;
/* 688:843 */     a(true);
/* 689:    */   }
/* 690:    */   
/* 691:    */   private void h()
/* 692:    */   {
/* 693:847 */     switch (this.B)
/* 694:    */     {
/* 695:    */     case 300: 
/* 696:849 */       a((bur)this.r.c(300));
/* 697:850 */       break;
/* 698:    */     case 304: 
/* 699:852 */       g();
/* 700:    */     }
/* 701:855 */     this.B = 0;
/* 702:856 */     this.C = true;
/* 703:857 */     a(false);
/* 704:    */   }
/* 705:    */   
/* 706:    */   private void a(boolean paramBoolean)
/* 707:    */   {
/* 708:861 */     this.x.m = paramBoolean;
/* 709:862 */     this.y.m = paramBoolean;
/* 710:863 */     this.t.l = (!paramBoolean);
/* 711:864 */     this.s.l = (!paramBoolean);
/* 712:865 */     this.v.l = (!paramBoolean);
/* 713:866 */     this.w.l = (!paramBoolean);
/* 714:867 */     this.u.l = (!paramBoolean);
/* 715:868 */     this.z.l = (!paramBoolean);
/* 716:    */   }
/* 717:    */   
/* 718:    */   private void i()
/* 719:    */   {
/* 720:872 */     this.v.l = (this.r.e() != 0);
/* 721:873 */     this.w.l = (this.r.e() != this.r.f() - 1);
/* 722:874 */     this.f = cwc.a("book.pageIndicator", new Object[] { Integer.valueOf(this.r.e() + 1), Integer.valueOf(this.r.f()) });
/* 723:875 */     this.g = this.h[this.r.e()];
/* 724:876 */     this.t.l = (this.r.e() != this.r.f() - 1);
/* 725:    */   }
/* 726:    */   
/* 727:    */   protected void a(char paramChar, int paramInt)
/* 728:    */   {
/* 729:881 */     super.a(paramChar, paramInt);
/* 730:883 */     if (this.B != 0) {
/* 731:884 */       return;
/* 732:    */     }
/* 733:887 */     switch (paramInt)
/* 734:    */     {
/* 735:    */     case 208: 
/* 736:889 */       a(-1.0F);
/* 737:890 */       break;
/* 738:    */     case 200: 
/* 739:892 */       a(1.0F);
/* 740:893 */       break;
/* 741:    */     default: 
/* 742:895 */       this.r.a(paramChar, paramInt);
/* 743:    */     }
/* 744:    */   }
/* 745:    */   
/* 746:    */   private void a(float paramFloat)
/* 747:    */   {
/* 748:901 */     bub localbub = this.r.g();
/* 749:902 */     if (!(localbub instanceof bul)) {
/* 750:903 */       return;
/* 751:    */     }
/* 752:906 */     float f1 = paramFloat;
/* 753:907 */     if (bxf.r())
/* 754:    */     {
/* 755:908 */       f1 *= 0.1F;
/* 756:909 */       if (bxf.q()) {
/* 757:910 */         f1 *= 0.1F;
/* 758:    */       }
/* 759:    */     }
/* 760:912 */     else if (bxf.q())
/* 761:    */     {
/* 762:913 */       f1 *= 10.0F;
/* 763:914 */       if (bxf.s()) {
/* 764:915 */         f1 *= 10.0F;
/* 765:    */       }
/* 766:    */     }
/* 767:919 */     bul localbul = (bul)localbub;
/* 768:920 */     Float localFloat = Floats.tryParse(localbul.b());
/* 769:921 */     if (localFloat == null) {
/* 770:922 */       return;
/* 771:    */     }
/* 772:924 */     localFloat = Float.valueOf(localFloat.floatValue() + f1);
/* 773:925 */     int j = localbul.d();
/* 774:926 */     String str = b(localbul.d(), localFloat.floatValue());
/* 775:927 */     localbul.a(str);
/* 776:928 */     a(j, str);
/* 777:    */   }
/* 778:    */   
/* 779:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 780:    */   {
/* 781:933 */     super.a(paramInt1, paramInt2, paramInt3);
/* 782:934 */     if ((this.B != 0) || (this.C)) {
/* 783:935 */       return;
/* 784:    */     }
/* 785:937 */     this.r.b(paramInt1, paramInt2, paramInt3);
/* 786:    */   }
/* 787:    */   
/* 788:    */   protected void b(int paramInt1, int paramInt2, int paramInt3)
/* 789:    */   {
/* 790:942 */     super.b(paramInt1, paramInt2, paramInt3);
/* 791:943 */     if (this.C)
/* 792:    */     {
/* 793:944 */       this.C = false;
/* 794:945 */       return;
/* 795:    */     }
/* 796:947 */     if (this.B != 0) {
/* 797:948 */       return;
/* 798:    */     }
/* 799:950 */     this.r.c(paramInt1, paramInt2, paramInt3);
/* 800:    */   }
/* 801:    */   
/* 802:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 803:    */   {
/* 804:955 */     c();
/* 805:956 */     this.r.a(paramInt1, paramInt2, paramFloat);
/* 806:    */     
/* 807:958 */     a(this.q, this.a, this.l / 2, 2, 16777215);
/* 808:959 */     a(this.q, this.f, this.l / 2, 12, 16777215);
/* 809:960 */     a(this.q, this.g, this.l / 2, 22, 16777215);
/* 810:    */     
/* 811:962 */     super.a(paramInt1, paramInt2, paramFloat);
/* 812:964 */     if (this.B != 0)
/* 813:    */     {
/* 814:965 */       a(0, 0, this.l, this.m, -2147483648);
/* 815:    */       
/* 816:967 */       a(this.l / 2 - 91, this.l / 2 + 90, 99, -2039584);
/* 817:968 */       a(this.l / 2 - 91, this.l / 2 + 90, 185, -6250336);
/* 818:969 */       b(this.l / 2 - 91, 99, 185, -2039584);
/* 819:970 */       b(this.l / 2 + 90, 99, 185, -6250336);
/* 820:    */       
/* 821:972 */       float f1 = 85.0F;
/* 822:973 */       float f2 = 180.0F;
/* 823:    */       
/* 824:975 */       cjm.disableLighting();
/* 825:976 */       cjm.n();
/* 826:977 */       ckx localckx = ckx.getInstance();
/* 827:978 */       VertexBuffer localciv = localckx.getBuffer();
/* 828:979 */       this.j.N().a(b);
/* 829:980 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 830:981 */       float f3 = 32.0F;
/* 831:982 */       localciv.begin();
/* 832:983 */       localciv.setColor(4210752);
/* 833:984 */       localciv.addVertexWithUV(this.l / 2 - 90, 185.0D, 0.0D, 0.0D, 2.65625D);
/* 834:985 */       localciv.addVertexWithUV(this.l / 2 + 90, 185.0D, 0.0D, 5.625D, 2.65625D);
/* 835:986 */       localciv.addVertexWithUV(this.l / 2 + 90, 100.0D, 0.0D, 5.625D, 0.0D);
/* 836:987 */       localciv.addVertexWithUV(this.l / 2 - 90, 100.0D, 0.0D, 0.0D, 0.0D);
/* 837:988 */       localckx.draw();
/* 838:    */       
/* 839:990 */       a(this.q, cwc.a("createWorld.customize.custom.confirmTitle", new Object[0]), this.l / 2, 105, 16777215);
/* 840:991 */       a(this.q, cwc.a("createWorld.customize.custom.confirm1", new Object[0]), this.l / 2, 125, 16777215);
/* 841:992 */       a(this.q, cwc.a("createWorld.customize.custom.confirm2", new Object[0]), this.l / 2, 135, 16777215);
/* 842:    */       
/* 843:994 */       this.x.a(this.j, paramInt1, paramInt2);
/* 844:995 */       this.y.a(this.j, paramInt1, paramInt2);
/* 845:    */     }
/* 846:    */   }
/* 847:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwj
 * JD-Core Version:    0.7.0.1
 */