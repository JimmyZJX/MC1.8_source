package net.minecraft.src;
/*   1:    */ public class BlockList
/*   2:    */ {
/*   3:    */   static
/*   4:    */   {
/*   5: 13 */     if (!od.a()) {
/*   6: 14 */       throw new RuntimeException("Accessed Blocks before Bootstrap!");
/*   7:    */     }
/*   8:    */   }
/*   9:    */   
/*  10: 18 */   public static final ProtoBlock air = a("air");
/*  11: 19 */   public static final ProtoBlock stone = a("stone");
/*  12: 20 */   public static final BlockGrass grass = (BlockGrass)a("grass");
/*  13: 21 */   public static final ProtoBlock dirt = a("dirt");
/*  14: 22 */   public static final ProtoBlock cobblestone = a("cobblestone");
/*  15: 23 */   public static final ProtoBlock planks = a("planks");
/*  16: 24 */   public static final ProtoBlock sapling = a("sapling");
/*  17: 25 */   public static final ProtoBlock bedrock = a("bedrock");
/*  18: 26 */   public static final BlockFlowingLiquid flowingWater = (BlockFlowingLiquid)a("flowing_water");
/*  19: 27 */   public static final BlockStillLiquid water = (BlockStillLiquid)a("water");
/*  20: 28 */   public static final BlockFlowingLiquid flowingLava = (BlockFlowingLiquid)a("flowing_lava");
/*  21: 29 */   public static final BlockStillLiquid lava = (BlockStillLiquid)a("lava");
/*  22: 30 */   public static final BlockSand sand = (BlockSand)a("sand");
/*  23: 31 */   public static final ProtoBlock gravel = a("gravel");
/*  24: 32 */   public static final ProtoBlock goldOre = a("gold_ore");
/*  25: 33 */   public static final ProtoBlock ironOre = a("iron_ore");
/*  26: 34 */   public static final ProtoBlock coalOre = a("coal_ore");
/*  27: 35 */   public static final ProtoBlock log = a("log");
/*  28: 36 */   public static final ProtoBlock log2 = a("log2");
/*  29: 37 */   public static final BlockLeaves leaves = (BlockLeaves)a("leaves");
/*  30: 38 */   public static final BlockLeaves leaves2 = (BlockLeaves)a("leaves2");
/*  31: 39 */   public static final ProtoBlock v = a("sponge");
/*  32: 40 */   public static final ProtoBlock glass = a("glass");
/*  33: 41 */   public static final ProtoBlock lapisOre = a("lapis_ore");
/*  34: 42 */   public static final ProtoBlock y = a("lapis_block");
/*  35: 43 */   public static final ProtoBlock z = a("dispenser");
/*  36: 44 */   public static final ProtoBlock A = a("sandstone");
/*  37: 45 */   public static final ProtoBlock B = a("noteblock");
/*  38: 46 */   public static final ProtoBlock C = a("bed");
/*  39: 47 */   public static final ProtoBlock D = a("golden_rail");
/*  40: 48 */   public static final ProtoBlock detector_rail = a("detector_rail");
/*  41: 49 */   public static final bdq F = (bdq)a("sticky_piston");
/*  42: 50 */   public static final ProtoBlock web = a("web");
/*  43: 51 */   public static final bbh tallgrass = (bbh)a("tallgrass");
/*  44: 52 */   public static final auw deadbush = (auw)a("deadbush");
/*  45: 53 */   public static final bdq J = (bdq)a("piston");
/*  46: 54 */   public static final bds K = (bds)a("piston_head");
/*  47: 55 */   public static final ProtoBlock wool = a("wool");
/*  48: 56 */   public static final bdx M = (bdx)a("piston_extension");
/*  49: 57 */   public static final avy yellowFlower = (avy)a("yellow_flower");
/*  50: 58 */   public static final avy redFlower = (avy)a("red_flower");
/*  51: 59 */   public static final BlockMushroom brownMushroom = (BlockMushroom)a("brown_mushroom");
/*  52: 60 */   public static final BlockMushroom redMushroom = (BlockMushroom)a("red_mushroom");
/*  53: 61 */   public static final ProtoBlock R = a("gold_block");
/*  54: 62 */   public static final ProtoBlock S = a("iron_block");
/*  55: 63 */   public static final BlockSlab T = (BlockSlab)a("double_stone_slab");
/*  56: 64 */   public static final BlockSlab U = (BlockSlab)a("stone_slab");
/*  57: 65 */   public static final ProtoBlock V = a("brick_block");
/*  58: 66 */   public static final ProtoBlock W = a("tnt");
/*  59: 67 */   public static final ProtoBlock bookshelf = a("bookshelf");
/*  60: 68 */   public static final ProtoBlock mossyCobblestone = a("mossy_cobblestone");
/*  61: 69 */   public static final ProtoBlock obsidian = a("obsidian");
/*  62: 70 */   public static final ProtoBlock torch = a("torch");
/*  63: 71 */   public static final BlockFire fire = (BlockFire)a("fire");
/*  64: 72 */   public static final ProtoBlock mobSpawner = a("mob_spawner");
/*  65: 73 */   public static final ProtoBlock ad = a("oak_stairs");
/*  66: 74 */   public static final BlockChest chest = (BlockChest)a("chest");
/*  67: 75 */   public static final BlockRedstoneWire redstoneWire = (BlockRedstoneWire)a("redstone_wire");
/*  68: 76 */   public static final ProtoBlock diamondOre = a("diamond_ore");
/*  69: 77 */   public static final ProtoBlock diamondBlock = a("diamond_block");
/*  70: 78 */   public static final ProtoBlock ai = a("crafting_table");
/*  71: 79 */   public static final ProtoBlock aj = a("wheat");
/*  72: 80 */   public static final ProtoBlock ak = a("farmland");
/*  73: 81 */   public static final ProtoBlock al = a("furnace");
/*  74: 82 */   public static final ProtoBlock am = a("lit_furnace");
/*  75: 83 */   public static final ProtoBlock an = a("standing_sign");
/*  76: 84 */   public static final ProtoBlock woodenDoor = a("wooden_door");
/*  77: 85 */   public static final ProtoBlock ap = a("spruce_door");
/*  78: 86 */   public static final ProtoBlock aq = a("birch_door");
/*  79: 87 */   public static final ProtoBlock ar = a("jungle_door");
/*  80: 88 */   public static final ProtoBlock as = a("acacia_door");
/*  81: 89 */   public static final ProtoBlock at = a("dark_oak_door");
/*  82: 90 */   public static final ProtoBlock au = a("ladder");
/*  83: 91 */   public static final ProtoBlock av = a("rail");
/*  84: 92 */   public static final ProtoBlock aw = a("stone_stairs");
/*  85: 93 */   public static final ProtoBlock ax = a("wall_sign");
/*  86: 94 */   public static final ProtoBlock ay = a("lever");
/*  87: 95 */   public static final ProtoBlock az = a("stone_pressure_plate");
/*  88: 96 */   public static final ProtoBlock ironDoor = a("iron_door");
/*  89: 97 */   public static final ProtoBlock aB = a("wooden_pressure_plate");
/*  90: 98 */   public static final ProtoBlock redstoneOre = a("redstone_ore");
/*  91: 99 */   public static final ProtoBlock aD = a("lit_redstone_ore");
/*  92:100 */   public static final ProtoBlock aE = a("unlit_redstone_torch");
/*  93:101 */   public static final ProtoBlock aF = a("redstone_torch");
/*  94:102 */   public static final ProtoBlock stoneButton = a("stone_button");
/*  95:103 */   public static final ProtoBlock aH = a("snow_layer");
/*  96:104 */   public static final ProtoBlock aI = a("ice");
/*  97:105 */   public static final ProtoBlock aJ = a("snow");
/*  98:106 */   public static final auf cactus = (auf)a("cactus");
/*  99:107 */   public static final ProtoBlock aL = a("clay");
/* 100:108 */   public static final azy reeds = (azy)a("reeds");
/* 101:109 */   public static final ProtoBlock aN = a("jukebox");
/* 102:110 */   public static final ProtoBlock fence = a("fence");
/* 103:111 */   public static final ProtoBlock aP = a("spruce_fence");
/* 104:112 */   public static final ProtoBlock aQ = a("birch_fence");
/* 105:113 */   public static final ProtoBlock aR = a("jungle_fence");
/* 106:114 */   public static final ProtoBlock darkOakFence = a("dark_oak_fence");
/* 107:115 */   public static final ProtoBlock aT = a("acacia_fence");
/* 108:116 */   public static final ProtoBlock pumpkin = a("pumpkin");
/* 109:117 */   public static final ProtoBlock netherrack = a("netherrack");
/* 110:118 */   public static final ProtoBlock soulSand = a("soul_sand");
/* 111:119 */   public static final ProtoBlock glowstone = a("glowstone");
/* 112:120 */   public static final ayy aY = (ayy)a("portal");
/* 113:121 */   public static final ProtoBlock aZ = a("lit_pumpkin");
/* 114:122 */   public static final ProtoBlock ba = a("cake");
/* 115:123 */   public static final BlockRepeater unpoweredRepeater = (BlockRepeater)a("unpowered_repeater");
/* 116:124 */   public static final BlockRepeater poweredRepeater = (BlockRepeater)a("powered_repeater");
/* 117:125 */   public static final ProtoBlock bd = a("trapdoor");
/* 118:126 */   public static final ProtoBlock monsterEgg = a("monster_egg");
/* 119:127 */   public static final ProtoBlock stoneBrick = a("stonebrick");
/* 120:128 */   public static final ProtoBlock bg = a("brown_mushroom_block");
/* 121:129 */   public static final ProtoBlock bh = a("red_mushroom_block");
/* 122:130 */   public static final ProtoBlock ironBars = a("iron_bars");
/* 123:131 */   public static final ProtoBlock bj = a("glass_pane");
/* 124:132 */   public static final ProtoBlock melonBlock = a("melon_block");
/* 125:133 */   public static final ProtoBlock bl = a("pumpkin_stem");
/* 126:134 */   public static final ProtoBlock bm = a("melon_stem");
/* 127:135 */   public static final ProtoBlock vine = a("vine");
/* 128:136 */   public static final ProtoBlock bo = a("fence_gate");
/* 129:137 */   public static final ProtoBlock bp = a("spruce_fence_gate");
/* 130:138 */   public static final ProtoBlock bq = a("birch_fence_gate");
/* 131:139 */   public static final ProtoBlock br = a("jungle_fence_gate");
/* 132:140 */   public static final ProtoBlock bs = a("dark_oak_fence_gate");
/* 133:141 */   public static final ProtoBlock bt = a("acacia_fence_gate");
/* 134:142 */   public static final ProtoBlock bu = a("brick_stairs");
/* 135:143 */   public static final ProtoBlock bv = a("stone_brick_stairs");
/* 136:144 */   public static final ayc bw = (ayc)a("mycelium");
/* 137:145 */   public static final ProtoBlock waterLily = a("waterlily");
/* 138:146 */   public static final ProtoBlock netherBrick = a("nether_brick");
/* 139:147 */   public static final ProtoBlock bz = a("nether_brick_fence");
/* 140:148 */   public static final ProtoBlock bA = a("nether_brick_stairs");
/* 141:149 */   public static final ProtoBlock bB = a("nether_wart");
/* 142:150 */   public static final ProtoBlock bC = a("enchanting_table");
/* 143:151 */   public static final ProtoBlock bD = a("brewing_stand");
/* 144:152 */   public static final aui bE = (aui)a("cauldron");
/* 145:153 */   public static final ProtoBlock endPortal = a("end_portal");
/* 146:154 */   public static final ProtoBlock endPortalFrame = a("end_portal_frame");
/* 147:155 */   public static final ProtoBlock endStone = a("end_stone");
/* 148:156 */   public static final ProtoBlock dragonEgg = a("dragon_egg");
/* 149:157 */   public static final ProtoBlock bJ = a("redstone_lamp");
/* 150:158 */   public static final ProtoBlock bK = a("lit_redstone_lamp");
/* 151:159 */   public static final BlockSlab bL = (BlockSlab)a("double_wooden_slab");
/* 152:160 */   public static final BlockSlab bM = (BlockSlab)a("wooden_slab");
/* 153:161 */   public static final ProtoBlock bN = a("cocoa");
/* 154:162 */   public static final ProtoBlock bO = a("sandstone_stairs");
/* 155:163 */   public static final ProtoBlock bP = a("emerald_ore");
/* 156:164 */   public static final ProtoBlock bQ = a("ender_chest");
/* 157:165 */   public static final bbt bR = (bbt)a("tripwire_hook");
/* 158:166 */   public static final ProtoBlock tripwire = a("tripwire");
/* 159:167 */   public static final ProtoBlock emeraldBlock = a("emerald_block");
/* 160:168 */   public static final ProtoBlock bU = a("spruce_stairs");
/* 161:169 */   public static final ProtoBlock bV = a("birch_stairs");
/* 162:170 */   public static final ProtoBlock bW = a("jungle_stairs");
/* 163:171 */   public static final ProtoBlock bX = a("command_block");
/* 164:172 */   public static final BlockBeacon bY = (BlockBeacon)a("beacon");
/* 165:173 */   public static final ProtoBlock bZ = a("cobblestone_wall");
/* 166:174 */   public static final ProtoBlock ca = a("flower_pot");
/* 167:175 */   public static final ProtoBlock cb = a("carrots");
/* 168:176 */   public static final ProtoBlock cc = a("potatoes");
/* 169:177 */   public static final ProtoBlock cd = a("wooden_button");
/* 170:178 */   public static final baj ce = (baj)a("skull");
/* 171:179 */   public static final ProtoBlock cf = a("anvil");
/* 172:180 */   public static final ProtoBlock cg = a("trapped_chest");
/* 173:181 */   public static final ProtoBlock ch = a("light_weighted_pressure_plate");
/* 174:182 */   public static final ProtoBlock ci = a("heavy_weighted_pressure_plate");
/* 175:183 */   public static final BlockComparator cj = (BlockComparator)a("unpowered_comparator");
/* 176:184 */   public static final BlockComparator ck = (BlockComparator)a("powered_comparator");
/* 177:185 */   public static final BlockDaylightDetector cl = (BlockDaylightDetector)a("daylight_detector");
/* 178:186 */   public static final BlockDaylightDetector cm = (BlockDaylightDetector)a("daylight_detector_inverted");
/* 179:187 */   public static final ProtoBlock cn = a("redstone_block");
/* 180:188 */   public static final ProtoBlock quartzOre = a("quartz_ore");
/* 181:189 */   public static final BlockHopper cp = (BlockHopper)a("hopper");
/* 182:190 */   public static final ProtoBlock cq = a("quartz_block");
/* 183:191 */   public static final ProtoBlock cr = a("quartz_stairs");
/* 184:192 */   public static final ProtoBlock activatorRail = a("activator_rail");
/* 185:193 */   public static final ProtoBlock ct = a("dropper");
/* 186:194 */   public static final ProtoBlock cu = a("stained_hardened_clay");
/* 187:195 */   public static final ProtoBlock barrier = a("barrier");
/* 188:196 */   public static final ProtoBlock cw = a("iron_trapdoor");
/* 189:197 */   public static final ProtoBlock cx = a("hay_block");
/* 190:198 */   public static final ProtoBlock cy = a("carpet");
/* 191:199 */   public static final ProtoBlock cz = a("hardened_clay");
/* 192:200 */   public static final ProtoBlock cA = a("coal_block");
/* 193:201 */   public static final ProtoBlock cB = a("packed_ice");
/* 194:202 */   public static final ProtoBlock cC = a("acacia_stairs");
/* 195:203 */   public static final ProtoBlock cD = a("dark_oak_stairs");
/* 196:204 */   public static final ProtoBlock cE = a("slime");
/* 197:205 */   public static final avi cF = (avi)a("double_plant");
/* 198:206 */   public static final bar cG = (bar)a("stained_glass");
/* 199:207 */   public static final bas stainedGlassPane = (bas)a("stained_glass_pane");
/* 200:208 */   public static final ProtoBlock cI = a("prismarine");
/* 201:209 */   public static final ProtoBlock seaLantern = a("sea_lantern");
/* 202:210 */   public static final ProtoBlock cK = a("standing_banner");
/* 203:211 */   public static final ProtoBlock cL = a("wall_banner");
/* 204:212 */   public static final ProtoBlock cM = a("red_sandstone");
/* 205:213 */   public static final ProtoBlock cN = a("red_sandstone_stairs");
/* 206:214 */   public static final BlockSlab cO = (BlockSlab)a("double_stone_slab2");
/* 207:215 */   public static final BlockSlab cP = (BlockSlab)a("stone_slab2");
/* 208:    */   
/* 209:    */   private static ProtoBlock a(String paramString)
/* 210:    */   {
/* 211:219 */     return ProtoBlock.c.a(new oa(paramString));
/* 212:    */   }
/* 213:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aty
 * JD-Core Version:    0.7.0.1
 */