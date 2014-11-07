package net.minecraft.src;
/*   1:    */ import com.google.common.base.Charsets;
/*   2:    */ import com.google.common.base.Joiner;
/*   3:    */ import com.google.common.collect.Lists;
/*   4:    */ import com.google.common.collect.Maps;
/*   5:    */ import com.google.common.collect.Queues;
/*   6:    */ import com.google.common.collect.Sets;

/*   7:    */ import java.io.FileNotFoundException;
/*   8:    */ import java.io.IOException;
/*   9:    */ import java.io.InputStream;
/*  10:    */ import java.io.InputStreamReader;
/*  11:    */ import java.io.Reader;
/*  12:    */ import java.io.StringReader;
/*  13:    */ import java.util.ArrayDeque;
/*  14:    */ import java.util.ArrayList;
/*  15:    */ import java.util.Collection;
/*  16:    */ import java.util.Collections;
/*  17:    */ import java.util.Deque;
/*  18:    */ import java.util.HashSet;
/*  19:    */ import java.util.Iterator;
/*  20:    */ import java.util.List;
/*  21:    */ import java.util.Map;
/*  22:    */ import java.util.Map.Entry;
/*  23:    */ import java.util.Set;

/*  24:    */ import org.apache.commons.io.IOUtils;
/*  25:    */ import org.apache.logging.log4j.LogManager;
/*  26:    */ import org.apache.logging.log4j.Logger;
/*  27:    */ 
/*  28:    */ public class cxh
/*  29:    */ {
/*  30: 33 */   private static final Set<oa> b = Sets.newHashSet(new oa[] { new oa("blocks/water_flow"), new oa("blocks/water_still"), new oa("blocks/lava_flow"), new oa("blocks/lava_still"), new oa("blocks/destroy_stage_0"), new oa("blocks/destroy_stage_1"), new oa("blocks/destroy_stage_2"), new oa("blocks/destroy_stage_3"), new oa("blocks/destroy_stage_4"), new oa("blocks/destroy_stage_5"), new oa("blocks/destroy_stage_6"), new oa("blocks/destroy_stage_7"), new oa("blocks/destroy_stage_8"), new oa("blocks/destroy_stage_9"), new oa("items/empty_armor_slot_helmet"), new oa("items/empty_armor_slot_chestplate"), new oa("items/empty_armor_slot_leggings"), new oa("items/empty_armor_slot_boots") });
/*  31: 55 */   private static final Logger c = LogManager.getLogger();
/*  32: 64 */   protected static final cxl a = new cxl("builtin/missing", "missing");
/*  33: 86 */   private static final Map<String,String> d = Maps.newHashMap();
/*  34:    */   private static final Joiner e;
/*  35:    */   private final cvk f;
/*  36: 94 */   private final Map<oa,cue> g = Maps.newHashMap();
/*  37: 95 */   private final Map<oa,cmc> h = Maps.newLinkedHashMap();
/*  38: 96 */   private final Map<cxl,cmm> i = Maps.newLinkedHashMap();
/*  39:    */   private final cua j;
/*  40:    */   private final clc k;
/*  41: 99 */   private final cmp l = new cmp();
/*  42:100 */   private final cmr m = new cmr();
/*  43:101 */   private fb n = new fb();
/*  44:    */   private static final cmc o;
/*  45:    */   private static final cmc p;
/*  46:    */   private static final cmc q;
/*  47:    */   private static final cmc r;
/*  48:    */   
/*  49:    */   static
/*  50:    */   {
/*  51: 88 */     d.put("missing", "{ \"textures\": {   \"particle\": \"missingno\",   \"missingno\": \"missingno\"}, \"elements\": [ {     \"from\": [ 0, 0, 0 ],     \"to\": [ 16, 16, 16 ],     \"faces\": {         \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"down\", \"texture\": \"#missingno\" },         \"up\":    { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"up\", \"texture\": \"#missingno\" },         \"north\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"north\", \"texture\": \"#missingno\" },         \"south\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"south\", \"texture\": \"#missingno\" },         \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"west\", \"texture\": \"#missingno\" },         \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"east\", \"texture\": \"#missingno\" }    }}]}");
/*  52:    */     
/*  53:    */ 
/*  54: 91 */     e = Joiner.on(" -> ");
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
/*  70:    */ 
/*  71:    */ 
/*  72:    */ 
/*  73:    */ 
/*  74:    */ 
/*  75:112 */     o = cmc.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
/*  76:113 */     p = cmc.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
/*  77:114 */     q = cmc.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
/*  78:115 */     r = cmc.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
/*  79:    */     
/*  80:    */ 
/*  81:118 */     o.b = "generation marker";
/*  82:119 */     p.b = "compass generation marker";
/*  83:120 */     q.b = "class generation marker";
/*  84:121 */     r.b = "block entity marker";
/*  85:    */   }
/*  86:    */   
/*  87:124 */   private Map<String,oa> s = Maps.newLinkedHashMap();
/*  88:125 */   private final Map<oa,cmh> t = Maps.newHashMap();
/*  89:126 */   private Map<Item,ArrayList<String>> u = Maps.newIdentityHashMap();
/*  90:    */   
/*  91:    */   public cxh(cvk paramcvk, cua paramcua, clc paramclc)
/*  92:    */   {
/*  93:129 */     this.f = paramcvk;
/*  94:130 */     this.j = paramcua;
/*  95:131 */     this.k = paramclc;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public ez a()
/*  99:    */   {
/* 100:135 */     b();
/* 101:    */     
/* 102:137 */     h();
/* 103:    */     
/* 104:139 */     j();
/* 105:    */     
/* 106:141 */     l();
/* 107:    */     
/* 108:143 */     f();
/* 109:    */     
/* 110:145 */     return this.n;
/* 111:    */   }
/* 112:    */   
/* 113:    */   private void b()
/* 114:    */   {
/* 115:149 */     a(this.k.a().a().values());
/* 116:    */     
/* 117:151 */     this.i.put(a, new cmm(a.c(), Lists.newArrayList(new cmk[] { new cmk(new oa(a.a()), cxf.a, false, 1) })));
/* 118:    */     
/* 119:    */ 
/* 120:154 */     oa localoa = new oa("item_frame");
/* 121:155 */     cmh localcmh = a(localoa);
/* 122:156 */     a(localcmh, new cxl(localoa, "normal"));
/* 123:157 */     a(localcmh, new cxl(localoa, "map"));
/* 124:    */     
/* 125:159 */     c();
/* 126:160 */     d();
/* 127:    */   }
/* 128:    */   
/* 129:    */   private void a(Collection<cxl> paramCollection)
/* 130:    */   {
/* 131:164 */     for (cxl localcxl : paramCollection) {
/* 132:    */       try
/* 133:    */       {
/* 134:166 */         cmh localcmh = a(localcxl);
/* 135:    */         try
/* 136:    */         {
/* 137:168 */           a(localcmh, localcxl);
/* 138:    */         }
/* 139:    */         catch (Exception localException2)
/* 140:    */         {
/* 141:170 */           c.warn("Unable to load variant: " + localcxl.c() + " from " + localcxl);
/* 142:    */         }
/* 143:    */       }
/* 144:    */       catch (Exception localException1)
/* 145:    */       {
/* 146:173 */         c.warn("Unable to load definition " + localcxl, localException1);
/* 147:    */       }
/* 148:    */     }
/* 149:    */   }
/* 150:    */   
/* 151:    */   private void a(cmh paramcmh, cxl paramcxl)
/* 152:    */   {
/* 153:179 */     this.i.put(paramcxl, paramcmh.b(paramcxl.c()));
/* 154:    */   }
/* 155:    */   
/* 156:    */   private cmh a(oa paramoa)
/* 157:    */   {
/* 158:183 */     oa localoa = b(paramoa);
/* 159:    */     
/* 160:185 */     cmh localcmh1 = (cmh)this.t.get(localoa);
/* 161:186 */     if (localcmh1 == null)
/* 162:    */     {
/* 163:187 */       ArrayList<cmh> localArrayList = Lists.newArrayList();
/* 164:    */       try
/* 165:    */       {
/* 166:189 */         for (cvj localcvj : this.f.b(localoa))
/* 167:    */         {
/* 168:190 */           InputStream localInputStream = null;
/* 169:    */           try
/* 170:    */           {
/* 171:192 */             localInputStream = localcvj.b();
/* 172:193 */             cmh localcmh2 = cmh.a(new InputStreamReader(localInputStream, Charsets.UTF_8));
/* 173:194 */             localArrayList.add(localcmh2);
/* 174:    */           }
/* 175:    */           catch (Exception localException)
/* 176:    */           {
/* 177:196 */             throw new RuntimeException("Encountered an exception when loading model definition of '" + paramoa + "' from: '" + localcvj.a() + "' in resourcepack: '" + localcvj.d() + "'", localException);
/* 178:    */           }
/* 179:    */           finally
/* 180:    */           {
/* 181:198 */             IOUtils.closeQuietly(localInputStream);
/* 182:    */           }
/* 183:    */         }
/* 184:    */       }
/* 185:    */       catch (IOException localIOException)
/* 186:    */       {
/* 187:202 */         throw new RuntimeException("Encountered an exception when loading model definition of model " + localoa.toString(), localIOException);
/* 188:    */       }
/* 189:205 */       localcmh1 = new cmh(localArrayList);
/* 190:206 */       this.t.put(localoa, localcmh1);
/* 191:    */     }
/* 192:209 */     return localcmh1;
/* 193:    */   }
/* 194:    */   
/* 195:    */   private oa b(oa paramoa)
/* 196:    */   {
/* 197:213 */     return new oa(paramoa.b(), "blockstates/" + paramoa.a() + ".json");
/* 198:    */   }
/* 199:    */   
/* 200:    */   private void c()
/* 201:    */   {
/* 202:217 */     for (Iterator<cxl> localIterator1 = this.i.keySet().iterator(); localIterator1.hasNext();)
/* 203:    */     {
/* 204:217 */       cxl localcxl = localIterator1.next();
/* 205:218 */       for (cmk localcmk : ((cmm)this.i.get(localcxl)).b())
/* 206:    */       {
/* 207:219 */         oa localoa = localcmk.a();
/* 208:222 */         if (this.h.get(localoa) == null) {
/* 209:    */           try
/* 210:    */           {
/* 211:227 */             cmc localcmc = c(localoa);
/* 212:228 */             this.h.put(localoa, localcmc);
/* 213:    */           }
/* 214:    */           catch (Exception localException)
/* 215:    */           {
/* 216:230 */             c.warn("Unable to load block model: '" + localoa + "' for variant: '" + localcxl + "'", localException);
/* 217:    */           }
/* 218:    */         }
/* 219:    */       }
/* 220:    */     }
				}
/* 223:    */   
/* 224:    */   private cmc c(oa paramoa) throws IOException
/* 225:    */   {
/* 226:239 */     String str = paramoa.a();
/* 227:241 */     if ("builtin/generated".equals(str)) {
/* 228:242 */       return o;
/* 229:    */     }
/* 230:243 */     if ("builtin/compass".equals(str)) {
/* 231:244 */       return p;
/* 232:    */     }
/* 233:245 */     if ("builtin/clock".equals(str)) {
/* 234:246 */       return q;
/* 235:    */     }
/* 236:247 */     if ("builtin/entity".equals(str)) {
/* 237:248 */       return r;
/* 238:    */     }
/* 239:    */     
/* 240:    */     Object localObject3;
/* 241:    */     Object localObject1;
/* 242:249 */     if (str.startsWith("builtin/"))
/* 243:    */     {
/* 244:251 */       String localObject2 = str.substring("builtin/".length());
/* 245:252 */       localObject3 = (String)d.get(localObject2);
/* 246:253 */       if (localObject3 == null) {
/* 247:254 */         throw new FileNotFoundException(paramoa.toString());
/* 248:    */       }
/* 249:257 */       localObject1 = new StringReader((String)localObject3);
/* 250:    */     }
/* 251:    */     else
/* 252:    */     {
/* 253:259 */       cvj localObject2 = this.f.a(d(paramoa));
/* 254:260 */       localObject1 = new InputStreamReader(((cvj)localObject2).b(), Charsets.UTF_8);
/* 255:    */     }
/* 256:    */     try
/* 257:    */     {
/* 258:264 */       cmc localObject2 = cmc.a((Reader)localObject1);
/* 259:265 */       ((cmc)localObject2).b = paramoa.toString();
/* 260:266 */       return localObject2;
/* 261:    */     }
/* 262:    */     finally
/* 263:    */     {
/* 264:268 */       ((Reader)localObject1).close();
/* 265:    */     }
/* 266:    */   }
/* 267:    */   
/* 268:    */   private oa d(oa paramoa)
/* 269:    */   {
/* 270:273 */     return new oa(paramoa.b(), "models/" + paramoa.a() + ".json");
/* 271:    */   }
/* 272:    */   
/* 273:    */   private void d()
/* 274:    */   {
/* 275:277 */     e();
/* 276:279 */     for (Iterator<Item> localIterator1 = Item.e.iterator(); localIterator1.hasNext();)
/* 277:    */     {
/* 278:279 */       Item localalq = localIterator1.next();
/* 279:280 */       List<String> localList = a(localalq);
/* 280:281 */       for (String str : localList)
/* 281:    */       {
/* 282:282 */         oa localoa = a(str);
/* 283:283 */         this.s.put(str, localoa);
/* 284:286 */         if (this.h.get(localoa) == null) {
/* 285:    */           try
/* 286:    */           {
/* 287:291 */             cmc localcmc = c(localoa);
/* 288:292 */             this.h.put(localoa, localcmc);
/* 289:    */           }
/* 290:    */           catch (Exception localException)
/* 291:    */           {
/* 292:294 */             c.warn("Unable to load item model: '" + localoa + "' for item: '" + Item.e.c(localalq) + "'", localException);
/* 293:    */           }
/* 294:    */         }
/* 295:    */       }
/* 296:    */     }   }
/* 299:    */   
/* 300:    */   private void e()
/* 301:    */   {
/* 302:301 */     this.u.put(Item.fromProtoBlock(BlockList.stone), Lists.newArrayList(new String[] { "stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth" }));
/* 303:302 */     this.u.put(Item.fromProtoBlock(BlockList.dirt), Lists.newArrayList(new String[] { "dirt", "coarse_dirt", "podzol" }));
/* 304:303 */     this.u.put(Item.fromProtoBlock(BlockList.planks), Lists.newArrayList(new String[] { "oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks" }));
/* 305:304 */     this.u.put(Item.fromProtoBlock(BlockList.sapling), Lists.newArrayList(new String[] { "oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling" }));
/* 306:305 */     this.u.put(Item.fromProtoBlock(BlockList.sand), Lists.newArrayList(new String[] { "sand", "red_sand" }));
/* 307:306 */     this.u.put(Item.fromProtoBlock(BlockList.log), Lists.newArrayList(new String[] { "oak_log", "spruce_log", "birch_log", "jungle_log" }));
/* 308:307 */     this.u.put(Item.fromProtoBlock(BlockList.leaves), Lists.newArrayList(new String[] { "oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves" }));
/* 309:308 */     this.u.put(Item.fromProtoBlock(BlockList.v), Lists.newArrayList(new String[] { "sponge", "sponge_wet" }));
/* 310:309 */     this.u.put(Item.fromProtoBlock(BlockList.A), Lists.newArrayList(new String[] { "sandstone", "chiseled_sandstone", "smooth_sandstone" }));
/* 311:310 */     this.u.put(Item.fromProtoBlock(BlockList.cM), Lists.newArrayList(new String[] { "red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone" }));
/* 312:311 */     this.u.put(Item.fromProtoBlock(BlockList.tallgrass), Lists.newArrayList(new String[] { "dead_bush", "tall_grass", "fern" }));
/* 313:312 */     this.u.put(Item.fromProtoBlock(BlockList.deadbush), Lists.newArrayList(new String[] { "dead_bush" }));
/* 314:313 */     this.u.put(Item.fromProtoBlock(BlockList.wool), Lists.newArrayList(new String[] { "black_wool", "red_wool", "green_wool", "brown_wool", "blue_wool", "purple_wool", "cyan_wool", "silver_wool", "gray_wool", "pink_wool", "lime_wool", "yellow_wool", "light_blue_wool", "magenta_wool", "orange_wool", "white_wool" }));
/* 315:314 */     this.u.put(Item.fromProtoBlock(BlockList.yellowFlower), Lists.newArrayList(new String[] { "dandelion" }));
/* 316:315 */     this.u.put(Item.fromProtoBlock(BlockList.redFlower), Lists.newArrayList(new String[] { "poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy" }));
/* 317:316 */     this.u.put(Item.fromProtoBlock(BlockList.U), Lists.newArrayList(new String[] { "stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab" }));
/* 318:317 */     this.u.put(Item.fromProtoBlock(BlockList.cP), Lists.newArrayList(new String[] { "red_sandstone_slab" }));
/* 319:318 */     this.u.put(Item.fromProtoBlock(BlockList.cG), Lists.newArrayList(new String[] { "black_stained_glass", "red_stained_glass", "green_stained_glass", "brown_stained_glass", "blue_stained_glass", "purple_stained_glass", "cyan_stained_glass", "silver_stained_glass", "gray_stained_glass", "pink_stained_glass", "lime_stained_glass", "yellow_stained_glass", "light_blue_stained_glass", "magenta_stained_glass", "orange_stained_glass", "white_stained_glass" }));
/* 320:319 */     this.u.put(Item.fromProtoBlock(BlockList.monsterEgg), Lists.newArrayList(new String[] { "stone_monster_egg", "cobblestone_monster_egg", "stone_brick_monster_egg", "mossy_brick_monster_egg", "cracked_brick_monster_egg", "chiseled_brick_monster_egg" }));
/* 321:320 */     this.u.put(Item.fromProtoBlock(BlockList.bf), Lists.newArrayList(new String[] { "stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick" }));
/* 322:321 */     this.u.put(Item.fromProtoBlock(BlockList.bM), Lists.newArrayList(new String[] { "oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab" }));
/* 323:322 */     this.u.put(Item.fromProtoBlock(BlockList.bZ), Lists.newArrayList(new String[] { "cobblestone_wall", "mossy_cobblestone_wall" }));
/* 324:323 */     this.u.put(Item.fromProtoBlock(BlockList.cf), Lists.newArrayList(new String[] { "anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged" }));
/* 325:324 */     this.u.put(Item.fromProtoBlock(BlockList.cq), Lists.newArrayList(new String[] { "quartz_block", "chiseled_quartz_block", "quartz_column" }));
/* 326:325 */     this.u.put(Item.fromProtoBlock(BlockList.cu), Lists.newArrayList(new String[] { "black_stained_hardened_clay", "red_stained_hardened_clay", "green_stained_hardened_clay", "brown_stained_hardened_clay", "blue_stained_hardened_clay", "purple_stained_hardened_clay", "cyan_stained_hardened_clay", "silver_stained_hardened_clay", "gray_stained_hardened_clay", "pink_stained_hardened_clay", "lime_stained_hardened_clay", "yellow_stained_hardened_clay", "light_blue_stained_hardened_clay", "magenta_stained_hardened_clay", "orange_stained_hardened_clay", "white_stained_hardened_clay" }));
/* 327:326 */     this.u.put(Item.fromProtoBlock(BlockList.stained_glass_pane), Lists.newArrayList(new String[] { "black_stained_glass_pane", "red_stained_glass_pane", "green_stained_glass_pane", "brown_stained_glass_pane", "blue_stained_glass_pane", "purple_stained_glass_pane", "cyan_stained_glass_pane", "silver_stained_glass_pane", "gray_stained_glass_pane", "pink_stained_glass_pane", "lime_stained_glass_pane", "yellow_stained_glass_pane", "light_blue_stained_glass_pane", "magenta_stained_glass_pane", "orange_stained_glass_pane", "white_stained_glass_pane" }));
/* 328:327 */     this.u.put(Item.fromProtoBlock(BlockList.leaves2), Lists.newArrayList(new String[] { "acacia_leaves", "dark_oak_leaves" }));
/* 329:328 */     this.u.put(Item.fromProtoBlock(BlockList.log2), Lists.newArrayList(new String[] { "acacia_log", "dark_oak_log" }));
/* 330:329 */     this.u.put(Item.fromProtoBlock(BlockList.cI), Lists.newArrayList(new String[] { "prismarine", "prismarine_bricks", "dark_prismarine" }));
/* 331:330 */     this.u.put(Item.fromProtoBlock(BlockList.cy), Lists.newArrayList(new String[] { "black_carpet", "red_carpet", "green_carpet", "brown_carpet", "blue_carpet", "purple_carpet", "cyan_carpet", "silver_carpet", "gray_carpet", "pink_carpet", "lime_carpet", "yellow_carpet", "light_blue_carpet", "magenta_carpet", "orange_carpet", "white_carpet" }));
/* 332:331 */     this.u.put(Item.fromProtoBlock(BlockList.cF), Lists.newArrayList(new String[] { "sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia" }));
/* 333:332 */     this.u.put(ItemList.f, Lists.newArrayList(new String[] { "bow", "bow_pulling_0", "bow_pulling_1", "bow_pulling_2" }));
/* 334:333 */     this.u.put(ItemList.h, Lists.newArrayList(new String[] { "coal", "charcoal" }));
/* 335:334 */     this.u.put(ItemList.fishingRod, Lists.newArrayList(new String[] { "fishing_rod", "fishing_rod_cast" }));
/* 336:335 */     this.u.put(ItemList.fish, Lists.newArrayList(new String[] { "cod", "salmon", "clownfish", "pufferfish" }));
/* 337:336 */     this.u.put(ItemList.aV, Lists.newArrayList(new String[] { "cooked_cod", "cooked_salmon" }));
/* 338:337 */     this.u.put(ItemList.dye, Lists.newArrayList(new String[] { "dye_black", "dye_red", "dye_green", "dye_brown", "dye_blue", "dye_purple", "dye_cyan", "dye_silver", "dye_gray", "dye_pink", "dye_lime", "dye_yellow", "dye_light_blue", "dye_magenta", "dye_orange", "dye_white" }));
/* 339:338 */     this.u.put(ItemList.potion, Lists.newArrayList(new String[] { "bottle_drinkable", "bottle_splash" }));
/* 340:339 */     this.u.put(ItemList.bX, Lists.newArrayList(new String[] { "skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper" }));
/* 341:    */     
/* 342:    */ 
/* 343:342 */     this.u.put(Item.fromProtoBlock(BlockList.bo), Lists.newArrayList(new String[] { "oak_fence_gate" }));
/* 344:343 */     this.u.put(Item.fromProtoBlock(BlockList.fence), Lists.newArrayList(new String[] { "oak_fence" }));
/* 345:344 */     this.u.put(ItemList.aq, Lists.newArrayList(new String[] { "oak_door" }));
/* 346:    */   }
/* 347:    */   
/* 348:    */   private List<String> a(Item paramalq)
/* 349:    */   {
/* 350:348 */     List<String> localList = this.u.get(paramalq);
/* 351:349 */     if (localList == null) {
/* 352:350 */       localList = Collections.singletonList(((oa)Item.e.c(paramalq)).toString());
/* 353:    */     }
/* 354:353 */     return localList;
/* 355:    */   }
/* 356:    */   
/* 357:    */   private oa a(String paramString)
/* 358:    */   {
/* 359:357 */     oa localoa = new oa(paramString);
/* 360:358 */     return new oa(localoa.b(), "item/" + localoa.a());
/* 361:    */   }
/* 362:    */   
/* 363:    */   private void f()
/* 364:    */   {
/* 365:362 */     for (Iterator<cxl> localIterator = this.i.keySet().iterator(); localIterator.hasNext();)
/* 366:    */     {
/* 367:362 */       cxl localObject1 = (cxl)localIterator.next();
/* 368:363 */       cxp localObject2 = new cxp();
/* 369:    */       
/* 370:365 */       int i1 = 0;
/* 371:366 */       for (Iterator<cmk> localObject3 = ((cmm)this.i.get(localObject1)).b().iterator(); localObject3.hasNext();)
/* 372:    */       {
/* 373:366 */         cmk localcmk = localObject3.next();
/* 374:367 */         cmc localcmc = this.h.get(localcmk.a());
/* 375:368 */         if ((localcmc == null) || (!localcmc.d()))
/* 376:    */         {
/* 377:369 */           c.warn("Missing model for: " + localObject1);
/* 378:    */         }
/* 379:    */         else
/* 380:    */         {
/* 381:372 */           i1++;
/* 382:373 */           ((cxp)localObject2).a(a(localcmc, localcmk.b(), localcmk.c()), localcmk.d());
/* 383:    */         }
/* 384:    */       }
/* 385:377 */       if (i1 == 0) {
/* 386:378 */         c.warn("No weighted models for: " + localObject1);
/* 387:379 */       } else if (i1 == 1) {
/* 388:380 */         this.n.a(localObject1, ((cxp)localObject2).b());
/* 389:    */       } else {
/* 390:382 */         this.n.a(localObject1, ((cxp)localObject2).a());
/* 391:    */       }
/* 392:    */     }
/* 393:    */     
/* 394:    */     Object localObject2;
/* 395:    */     Object localObject3;
/* 396:386 */     for (Iterator<Map.Entry<String, oa>> localIterator = this.s.entrySet().iterator(); localIterator.hasNext();)
/* 397:    */     {
/* 398:386 */       Map.Entry<String, oa> localObject1 = localIterator.next();
/* 399:387 */       localObject2 = (oa)(localObject1).getValue();
/* 400:388 */       cxl localcxl = new cxl((String)(localObject1).getKey(), "inventory");
/* 401:389 */       localObject3 = (cmc)this.h.get(localObject2);
/* 402:390 */       if ((localObject3 == null) || (!((cmc)localObject3).d())) {
/* 403:391 */         c.warn("Missing model for: " + localObject2);
/* 404:394 */       } else if (c((cmc)localObject3)) {
/* 405:395 */         this.n.a(localcxl, new cxg(new cmx(((cmc)localObject3).g(), ((cmc)localObject3).h(), ((cmc)localObject3).i(), ((cmc)localObject3).j())));
/* 406:    */       } else {
/* 407:397 */         this.n.a(localcxl, a((cmc)localObject3, cxf.a, false));
/* 408:    */       }
/* 409:    */     }
/* 410:    */   }
/* 411:    */   
/* 412:    */   private Set<oa> g()
/* 413:    */   {
/* 414:403 */     HashSet<oa> localHashSet = Sets.newHashSet();
/* 415:    */     
/* 416:405 */     ArrayList<cxl> localArrayList = Lists.newArrayList(this.i.keySet());
/* 417:406 */     Collections.sort(localArrayList, new cxi(this));
/* 418:412 */     for (Iterator<cxl> localIterator1 = localArrayList.iterator(); localIterator1.hasNext();)
/* 419:    */     {
/* 420:412 */       cxl localcxl = (cxl)localIterator1.next();
/* 421:413 */       cmm localcmm = (cmm)this.i.get(localcxl);
/* 422:414 */       for (cmk localcmk : localcmm.b())
/* 423:    */       {
/* 424:415 */         cmc localcmc = (cmc)this.h.get(localcmk.a());
/* 425:416 */         if (localcmc == null) {
/* 426:417 */           c.warn("Missing model for: " + localcxl);
/* 427:    */         } else {
/* 428:421 */           localHashSet.addAll(a(localcmc));
/* 429:    */         }
/* 430:    */       }
/* 431:    */     }
/* 433:426 */     localHashSet.addAll(b);
/* 434:    */     
/* 435:428 */     return localHashSet;
/* 436:    */   }
/* 437:    */   
/* 438:    */   private cxe a(cmc paramcmc, cxf paramcxf, boolean paramBoolean)
/* 439:    */   {
/* 440:432 */     cue localcue1 = (cue)this.g.get(new oa(paramcmc.c("particle")));
/* 441:    */     
/* 442:434 */     cxn localcxn = new cxn(paramcmc).a(localcue1);
/* 443:436 */     for (Iterator localIterator1 = paramcmc.a().iterator(); localIterator1.hasNext();)
/* 444:    */     {
/* 445:436 */       clu localclu = (clu)localIterator1.next();
/* 446:437 */       for (EnumDirection localej : localclu.c.keySet())
/* 447:    */       {
/* 448:438 */         clx localclx = (clx)localclu.c.get(localej);
/* 449:439 */         cue localcue2 = (cue)this.g.get(new oa(paramcmc.c(localclx.d)));
/* 450:441 */         if (localclx.b == null) {
/* 451:442 */           localcxn.a(a(localclu, localclx, localcue2, localej, paramcxf, paramBoolean));
/* 452:    */         } else {
/* 453:444 */           localcxn.a(paramcxf.a(localclx.b), a(localclu, localclx, localcue2, localej, paramcxf, paramBoolean));
/* 454:    */         }
/* 455:    */       }
/* 456:    */     }
/* 458:449 */     return localcxn.b();
/* 459:    */   }
/* 460:    */   
/* 461:    */   private clt a(clu paramclu, clx paramclx, cue paramcue, EnumDirection paramej, cxf paramcxf, boolean paramBoolean)
/* 462:    */   {
/* 463:453 */     return this.l.a(paramclu.a, paramclu.b, paramclx, paramcue, paramej, paramcxf, paramclu.d, paramBoolean, paramclu.e);
/* 464:    */   }
/* 465:    */   
/* 466:    */   private void h()
/* 467:    */   {
/* 468:457 */     i();
/* 469:459 */     for (cmc localcmc : this.h.values()) {
/* 470:460 */       localcmc.a(this.h);
/* 471:    */     }
/* 472:463 */     cmc.b(this.h);
/* 473:    */   }
/* 474:    */   
/* 475:    */   private void i()
/* 476:    */   {
/* 477:467 */     ArrayDeque<oa> localArrayDeque = Queues.newArrayDeque();
/* 478:468 */     HashSet<oa> localHashSet = Sets.newHashSet();
/* 479:470 */     for (Iterator<oa> localObject1 = this.h.keySet().iterator(); localObject1.hasNext();)
/* 480:    */     {
/* 481:470 */       oa localObject2 = localObject1.next();
/* 482:471 */       localHashSet.add(localObject2);
/* 483:    */       
/* 484:473 */       oa localoa = ((cmc)this.h.get(localObject2)).e();
/* 485:474 */       if (localoa != null) {
/* 486:475 */         localArrayDeque.add(localoa);
/* 487:    */       }
/* 488:    */     }
/* 490:    */     oa localoa;
/* 491:479 */     while (!localArrayDeque.isEmpty())
/* 492:    */     {
/* 493:480 */       oa localObject1 = (oa)localArrayDeque.pop();
/* 494:    */       try
/* 495:    */       {
/* 496:482 */         if (this.h.get(localObject1) != null) {
/* 497:    */           continue;
/* 498:    */         }
/* 499:486 */         cmc localObject21 = c((oa)localObject1);
/* 500:487 */         this.h.put(localObject1, localObject21);
/* 501:    */         
/* 502:489 */         localoa = ((cmc)localObject21).e();
/* 503:490 */         if ((localoa != null) && (!localHashSet.contains(localoa))) {
/* 504:491 */           localArrayDeque.add(localoa);
/* 505:    */         }
/* 506:    */       }
/* 507:    */       catch (Exception localException)
/* 508:    */       {
/* 509:494 */         c.warn("In parent chain: " + e.join(e((oa)localObject1)) + "; unable to load model: '" + localObject1 + "'", localException);
/* 510:    */       }
/* 511:496 */       localHashSet.add(localObject1);
/* 512:    */     }
/* 513:    */   }
/* 514:    */   
/* 515:    */   private List<oa> e(oa paramoa)
/* 516:    */   {
/* 517:501 */     ArrayList<oa> localArrayList = Lists.newArrayList(new oa[] { paramoa });
/* 518:502 */     oa localoa = paramoa;
/* 519:503 */     while ((localoa = f(localoa)) != null) {
/* 520:504 */       localArrayList.add(0, localoa);
/* 521:    */     }
/* 522:506 */     return localArrayList;
/* 523:    */   }
/* 524:    */   
/* 525:    */   private oa f(oa paramoa)
/* 526:    */   {
/* 527:511 */     for (Map.Entry<oa,cmc> localEntry : this.h.entrySet())
/* 528:    */     {
/* 529:512 */       cmc localcmc = (cmc)localEntry.getValue();
/* 530:513 */       if ((localcmc != null) && (paramoa.equals(localcmc.e()))) {
/* 531:514 */         return (oa)localEntry.getKey();
/* 532:    */       }
/* 533:    */     }
/* 534:518 */     return null;
/* 535:    */   }
/* 536:    */   
/* 537:    */   private Set<oa> a(cmc paramcmc)
/* 538:    */   {
/* 539:522 */     HashSet<oa> localHashSet = Sets.newHashSet();
/* 540:524 */     for (clu localclu : paramcmc.a()) {
/* 541:525 */       for (clx localclx : localclu.c.values())
/* 542:    */       {
/* 543:526 */         oa localoa = new oa(paramcmc.c(localclx.d));
/* 544:527 */         localHashSet.add(localoa);
/* 545:    */       }
/* 546:    */     }
/* 547:531 */     localHashSet.add(new oa(paramcmc.c("particle")));
/* 548:    */     
/* 549:533 */     return localHashSet;
/* 550:    */   }
/* 551:    */   
/* 552:    */   private void j()
/* 553:    */   {
/* 554:537 */     Set localSet = g();
/* 555:538 */     localSet.addAll(k());
/* 556:    */     
/* 557:    */ 
/* 558:541 */     localSet.remove(cua.f);
/* 559:    */     
/* 560:543 */     cxj localcxj = new cxj(this, localSet);
/* 561:    */     
/* 562:    */ 
/* 563:    */ 
/* 564:    */ 
/* 565:    */ 
/* 566:    */ 
/* 567:    */ 
/* 568:    */ 
/* 569:    */ 
/* 570:553 */     this.j.a(this.f, localcxj);
/* 571:    */     
/* 572:    */ 
/* 573:556 */     this.g.put(new oa("missingno"), this.j.f());
/* 574:    */   }
/* 575:    */   
/* 576:    */   private Set<oa> k()
/* 577:    */   {
/* 578:560 */     HashSet<oa> localHashSet = Sets.newHashSet();
/* 579:562 */     for (oa localoa1 : this.s.values())
/* 580:    */     {
/* 581:563 */       cmc localcmc = (cmc)this.h.get(localoa1);
/* 582:565 */       if (localcmc != null)
/* 583:    */       {
/* 584:569 */         localHashSet.add(new oa(localcmc.c("particle")));
/* 585:571 */         if (b(localcmc)) {
/* 586:572 */           for (Iterator<String> localIterator2 = cmr.a.iterator(); localIterator2.hasNext();)
/* 587:    */           {
/* 588:572 */             String localObject1 = localIterator2.next();
/* 589:573 */             oa localObject2 = new oa(localcmc.c(localObject1));
/* 590:574 */             if ((localcmc.f() == p) && (!cua.f.equals(localObject2))) {
/* 591:575 */               cue.b(((oa)localObject2).toString());
/* 592:576 */             } else if ((localcmc.f() == q) && (!cua.f.equals(localObject2))) {
/* 593:577 */               cue.a(((oa)localObject2).toString());
/* 594:    */             }
/* 595:579 */             localHashSet.add(localObject2);
/* 596:    */           }
/* 597:581 */         } else if (!c(localcmc)) {
/* 598:582 */           for (Iterator<clu> localIterator2 = localcmc.a().iterator(); localIterator2.hasNext();)
/* 599:    */           {
/* 600:582 */             clu localObject1 = localIterator2.next();
/* 601:583 */             for (Iterator<clx> localObject2 = (localObject1).c.values().iterator(); ((Iterator)localObject2).hasNext();)
/* 602:    */             {
/* 603:583 */               clx localclx = (clx)((Iterator)localObject2).next();
/* 604:584 */               oa localoa2 = new oa(localcmc.c(localclx.d));
/* 605:585 */               localHashSet.add(localoa2);
/* 606:    */             }
/* 607:    */           }
/* 608:    */         }
/* 609:    */       }
/* 610:    */     }
/* 615:591 */     return localHashSet;
/* 616:    */   }
/* 617:    */   
/* 618:    */   private boolean b(cmc paramcmc)
/* 619:    */   {
/* 620:595 */     if (paramcmc == null) {
/* 621:596 */       return false;
/* 622:    */     }
/* 623:599 */     cmc localcmc = paramcmc.f();
/* 624:600 */     return (localcmc == o) || (localcmc == p) || (localcmc == q);
/* 625:    */   }
/* 626:    */   
/* 627:    */   private boolean c(cmc paramcmc)
/* 628:    */   {
/* 629:604 */     if (paramcmc == null) {
/* 630:605 */       return false;
/* 631:    */     }
/* 632:607 */     cmc localcmc = paramcmc.f();
/* 633:608 */     return localcmc == r;
/* 634:    */   }
/* 635:    */   
/* 636:    */   private void l()
/* 637:    */   {
/* 638:612 */     for (Iterator<oa> localIterator = this.s.values().iterator(); localIterator.hasNext();)
/* 639:    */     {
/* 640:612 */       oa localObject = localIterator.next();
/* 641:613 */       cmc localcmc1 = (cmc)this.h.get(localObject);
/* 642:614 */       if (b(localcmc1))
/* 643:    */       {
/* 644:615 */         cmc localcmc2 = d(localcmc1);
/* 645:616 */         if (localcmc2 != null) {
/* 646:617 */           localcmc2.b = ((oa)localObject).toString();
/* 647:    */         }
/* 648:620 */         this.h.put(localObject, localcmc2);
/* 649:    */       }
/* 650:621 */       else if (c(localcmc1))
/* 651:    */       {
/* 652:622 */         this.h.put(localObject, localcmc1);
/* 653:    */       }
/* 654:    */     }
/* 655:    */     Object localObject;
/* 656:627 */     for (Iterator<cue> localIterator = this.g.values().iterator(); localIterator.hasNext();)
/* 657:    */     {
/* 658:627 */       localObject = (cue)localIterator.next();
/* 659:628 */       if (!((cue)localObject).m()) {
/* 660:629 */         ((cue)localObject).l();
/* 661:    */       }
/* 662:    */     }
/* 663:    */   }
/* 664:    */   
/* 665:    */   private cmc d(cmc paramcmc)
/* 666:    */   {
/* 667:635 */     return this.m.a(this.j, paramcmc);
/* 668:    */   }
				static Map<oa,cue> a(cxh arg0) {return arg0.g;}
/* 669:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxh
 * JD-Core Version:    0.7.0.1
 */