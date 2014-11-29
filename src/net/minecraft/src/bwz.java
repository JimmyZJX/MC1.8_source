package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.Arrays;
/*   4:    */ import java.util.List;
/*   6:    */ import org.lwjgl.input.Keyboard;
/*   7:    */ 
/*   8:    */ public class bwz
/*   9:    */   extends bxf
/*  10:    */ {
/*  11: 41 */   private static final List<bxa> a = Lists.newArrayList();
/*  12:    */   private final bwd f;
/*  13:    */   private String g;
/*  14:    */   private String h;
/*  15:    */   private String i;
/*  16:    */   private bxb r;
/*  17:    */   private bug s;
/*  18:    */   private bul t;
/*  19:    */   
/*  20:    */   static
/*  21:    */   {
/*  22: 52 */     a("Classic Flat", Item.fromBlock(BlockList.grass), arm.q, Arrays.asList(new String[] { "village" }), new biw[] { new biw(1, BlockList.grass), new biw(2, BlockList.dirt), new biw(1, BlockList.bedrock) });
/*  23:    */     
/*  24:    */ 
/*  25:    */ 
/*  26:    */ 
/*  27:    */ 
/*  28:    */ 
/*  29: 59 */     a("Tunnelers' Dream", Item.fromBlock(BlockList.stone), arm.s, Arrays.asList(new String[] { "biome_1", "dungeon", "decoration", "stronghold", "mineshaft" }), new biw[] { new biw(1, BlockList.grass), new biw(5, BlockList.dirt), new biw(230, BlockList.stone), new biw(1, BlockList.bedrock) });
/*  30:    */     
/*  31:    */ 
/*  32:    */ 
/*  33:    */ 
/*  34:    */ 
/*  35:    */ 
/*  36:    */ 
/*  37:    */ 
/*  38:    */ 
/*  39:    */ 
/*  40:    */ 
/*  41:    */ 
/*  42:    */ 
/*  43:    */ 
/*  44: 74 */     a("Water World", ItemList.ax, arm.N, Arrays.asList(new String[] { "biome_1", "oceanmonument" }), new biw[] { new biw(90, BlockList.water), new biw(5, BlockList.sand), new biw(5, BlockList.dirt), new biw(5, BlockList.stone), new biw(1, BlockList.bedrock) });
/*  45:    */     
/*  46:    */ 
/*  47:    */ 
/*  48:    */ 
/*  49:    */ 
/*  50:    */ 
/*  51:    */ 
/*  52:    */ 
/*  53: 83 */     a("Overworld", Item.fromBlock(BlockList.tallgrass), bbi.b.a(), arm.q, Arrays.asList(new String[] { "village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake" }), new biw[] { new biw(1, BlockList.grass), new biw(3, BlockList.dirt), new biw(59, BlockList.stone), new biw(1, BlockList.bedrock) });
/*  54:    */     
/*  55:    */ 
/*  56:    */ 
/*  57:    */ 
/*  58:    */ 
/*  59:    */ 
/*  60:    */ 
/*  61:    */ 
/*  62:    */ 
/*  63:    */ 
/*  64:    */ 
/*  65:    */ 
/*  66:    */ 
/*  67:    */ 
/*  68:    */ 
/*  69:    */ 
/*  70:100 */     a("Snowy Kingdom", Item.fromBlock(BlockList.aH), arm.B, Arrays.asList(new String[] { "village", "biome_1" }), new biw[] { new biw(1, BlockList.aH), new biw(1, BlockList.grass), new biw(3, BlockList.dirt), new biw(59, BlockList.stone), new biw(1, BlockList.bedrock) });
/*  71:    */     
/*  72:    */ 
/*  73:    */ 
/*  74:    */ 
/*  75:    */ 
/*  76:    */ 
/*  77:    */ 
/*  78:    */ 
/*  79:109 */     a("Bottomless Pit", ItemList.G, arm.q, Arrays.asList(new String[] { "village", "biome_1" }), new biw[] { new biw(1, BlockList.grass), new biw(3, BlockList.dirt), new biw(2, BlockList.cobblestone) });
/*  80:    */     
/*  81:    */ 
/*  82:    */ 
/*  83:    */ 
/*  84:    */ 
/*  85:    */ 
/*  86:116 */     a("Desert", Item.fromBlock(BlockList.sand), arm.r, Arrays.asList(new String[] { "village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon" }), new biw[] { new biw(8, BlockList.sand), new biw(52, BlockList.A), new biw(3, BlockList.stone), new biw(1, BlockList.bedrock) });
/*  87:    */     
/*  88:    */ 
/*  89:    */ 
/*  90:    */ 
/*  91:    */ 
/*  92:    */ 
/*  93:    */ 
/*  94:    */ 
/*  95:    */ 
/*  96:    */ 
/*  97:    */ 
/*  98:    */ 
/*  99:    */ 
/* 100:    */ 
/* 101:131 */     a("Redstone Ready", ItemList.redstone, arm.r, new biw[] { new biw(52, BlockList.A), new biw(3, BlockList.stone), new biw(1, BlockList.bedrock) });
/* 102:    */   }
/* 103:    */   
/* 104:    */   public bwz(bwd parambwd)
/* 105:    */   {
/* 106:139 */     this.f = parambwd;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void b()
/* 110:    */   {
/* 111:144 */     this.n.clear();
/* 112:145 */     Keyboard.enableRepeatEvents(true);
/* 113:    */     
/* 114:147 */     this.g = cwc.a("createWorld.customize.presets.title", new Object[0]);
/* 115:148 */     this.h = cwc.a("createWorld.customize.presets.share", new Object[0]);
/* 116:149 */     this.i = cwc.a("createWorld.customize.presets.list", new Object[0]);
/* 117:150 */     this.t = new bul(2, this.q, 50, 40, this.l - 100, 20);
/* 118:151 */     this.r = new bxb(this);
/* 119:    */     
/* 120:153 */     this.t.f(1230);
/* 121:154 */     this.t.a(this.f.a());
/* 122:    */     
/* 123:156 */     this.n.add(this.s = new bug(0, this.l / 2 - 155, this.m - 28, 150, 20, cwc.a("createWorld.customize.presets.select", new Object[0])));
/* 124:157 */     this.n.add(new bug(1, this.l / 2 + 5, this.m - 28, 150, 20, cwc.a("gui.cancel", new Object[0])));
/* 125:    */     
/* 126:159 */     a();
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void k()
/* 130:    */   {
/* 131:164 */     super.k();
/* 132:165 */     this.r.p();
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void m()
/* 136:    */   {
/* 137:170 */     Keyboard.enableRepeatEvents(false);
/* 138:    */   }
/* 139:    */   
/* 140:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 141:    */   {
/* 142:175 */     this.t.a(paramInt1, paramInt2, paramInt3);
/* 143:176 */     super.a(paramInt1, paramInt2, paramInt3);
/* 144:    */   }
/* 145:    */   
/* 146:    */   protected void a(char paramChar, int paramInt)
/* 147:    */   {
/* 148:181 */     if (!this.t.a(paramChar, paramInt)) {
/* 149:182 */       super.a(paramChar, paramInt);
/* 150:    */     }
/* 151:    */   }
/* 152:    */   
/* 153:    */   protected void a(bug parambug)
/* 154:    */   {
/* 155:188 */     if ((parambug.k == 0) && (g()))
/* 156:    */     {
/* 157:189 */       this.f.a(this.t.b());
/* 158:190 */       this.j.a(this.f);
/* 159:    */     }
/* 160:191 */     else if (parambug.k == 1)
/* 161:    */     {
/* 162:192 */       this.j.a(this.f);
/* 163:    */     }
/* 164:    */   }
/* 165:    */   
/* 166:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 167:    */   {
/* 168:198 */     c();
/* 169:    */     
/* 170:200 */     this.r.a(paramInt1, paramInt2, paramFloat);
/* 171:201 */     a(this.q, this.g, this.l / 2, 8, 16777215);
/* 172:202 */     c(this.q, this.h, 50, 30, 10526880);
/* 173:203 */     c(this.q, this.i, 50, 70, 10526880);
/* 174:    */     
/* 175:205 */     this.t.g();
/* 176:206 */     super.a(paramInt1, paramInt2, paramFloat);
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void e()
/* 180:    */   {
/* 181:211 */     this.t.a();
/* 182:212 */     super.e();
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void a()
/* 186:    */   {
/* 187:216 */     boolean bool = g();
/* 188:217 */     this.s.l = bool;
/* 189:    */   }
/* 190:    */   
/* 191:    */   private boolean g()
/* 192:    */   {
/* 193:221 */     return ((this.r.u > -1) && (this.r.u < a.size())) || (this.t.b().length() > 1);
/* 194:    */   }
/* 195:    */   
/* 196:    */   private static void a(String paramString, Item paramalq, arm paramarm, biw... paramVarArgs)
/* 197:    */   {
/* 198:296 */     a(paramString, paramalq, 0, paramarm, null, paramVarArgs);
/* 199:    */   }
/* 200:    */   
/* 201:    */   private static void a(String paramString, Item paramalq, arm paramarm, List<String> paramList, biw... paramVarArgs)
/* 202:    */   {
/* 203:300 */     a(paramString, paramalq, 0, paramarm, paramList, paramVarArgs);
/* 204:    */   }
/* 205:    */   
/* 206:    */   private static void a(String paramString, Item paramalq, int paramInt, arm paramarm, List<String> paramList, biw... paramVarArgs)
/* 207:    */   {
/* 208:304 */     biv localbiv = new biv();
/* 209:306 */     for (int j = paramVarArgs.length - 1; j >= 0; j--) {
/* 210:307 */       localbiv.c().add(paramVarArgs[j]);
/* 211:    */     }
/* 212:310 */     localbiv.a(paramarm.az);
/* 213:311 */     localbiv.d();
/* 214:313 */     if (paramList != null) {
/* 215:314 */       for (String str : paramList) {
/* 216:315 */         localbiv.b().put(str, Maps.<String,String>newHashMap());
/* 217:    */       }
/* 218:    */     }
/* 219:319 */     a.add(new bxa(paramalq, paramInt, paramString, localbiv.toString()));
/* 220:    */   }
				static float a(bwz arg0) {return arg0.e;}
				static float b(bwz arg0) {return arg0.e;}
				static float c(bwz arg0) {return arg0.e;}
				static float d(bwz arg0) {return arg0.e;}
				static List<bxa> f() {return a;}
				static bxb e(bwz arg0) {return arg0.r;}
				static bul f(bwz arg0) {return arg0.t;}
				
/* 221:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwz
 * JD-Core Version:    0.7.0.1
 */