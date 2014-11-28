package net.minecraft.src;
/*   1:    */ public class ItemList
/*   2:    */ {
/*   3:    */   static
/*   4:    */   {
/*   5: 10 */     if (!od.a()) {
/*   6: 11 */       throw new RuntimeException("Accessed Items before Bootstrap!");
/*   7:    */     }
/*   8:    */   }
/*   9:    */   
/*  10: 15 */   public static final Item ironShovel = a("iron_shovel");
/*  11: 16 */   public static final Item ironPickaxe = a("iron_pickaxe");
/*  12: 17 */   public static final Item ironAxe = a("iron_axe");
/*  13: 18 */   public static final Item d = a("flint_and_steel");
/*  14: 19 */   public static final Item apple = a("apple");
/*  15: 20 */   public static final ItemBow bow = (ItemBow)a("bow");
/*  16: 21 */   public static final Item arrow = a("arrow");
/*  17: 22 */   public static final Item coal = a("coal");
/*  18: 23 */   public static final Item diamond = a("diamond");
/*  19: 24 */   public static final Item ironIngot = a("iron_ingot");
/*  20: 25 */   public static final Item goldIngot = a("gold_ingot");
/*  21: 26 */   public static final Item ironSword = a("iron_sword");
/*  22: 27 */   public static final Item m = a("wooden_sword");
/*  23: 28 */   public static final Item n = a("wooden_shovel");
/*  24: 29 */   public static final Item o = a("wooden_pickaxe");
/*  25: 30 */   public static final Item p = a("wooden_axe");
/*  26: 31 */   public static final Item q = a("stone_sword");
/*  27: 32 */   public static final Item r = a("stone_shovel");
/*  28: 33 */   public static final Item s = a("stone_pickaxe");
/*  29: 34 */   public static final Item t = a("stone_axe");
/*  30: 35 */   public static final Item diamondSword = a("diamond_sword");
/*  31: 36 */   public static final Item v = a("diamond_shovel");
/*  32: 37 */   public static final Item diamondPickaxe = a("diamond_pickaxe");
/*  33: 38 */   public static final Item diamondAxe = a("diamond_axe");
/*  34: 39 */   public static final Item stick = a("stick");
/*  35: 40 */   public static final Item z = a("bowl");
/*  36: 41 */   public static final Item A = a("mushroom_stew");
/*  37: 42 */   public static final Item goldenSword = a("golden_sword");
/*  38: 43 */   public static final Item C = a("golden_shovel");
/*  39: 44 */   public static final Item D = a("golden_pickaxe");
/*  40: 45 */   public static final Item E = a("golden_axe");
/*  41: 46 */   public static final Item string = a("string");
/*  42: 47 */   public static final Item G = a("feather");
/*  43: 48 */   public static final Item H = a("gunpowder");
/*  44: 49 */   public static final Item I = a("wooden_hoe");
/*  45: 50 */   public static final Item J = a("stone_hoe");
/*  46: 51 */   public static final Item K = a("iron_hoe");
/*  47: 52 */   public static final Item L = a("diamond_hoe");
/*  48: 53 */   public static final Item M = a("golden_hoe");
/*  49: 54 */   public static final Item N = a("wheat_seeds");
/*  50: 55 */   public static final Item wheat = a("wheat");
/*  51: 56 */   public static final Item bread = a("bread");
/*  52: 57 */   public static final ItemArmor Q = (ItemArmor)a("leather_helmet");
/*  53: 58 */   public static final ItemArmor leatherChestplate = (ItemArmor)a("leather_chestplate");
/*  54: 59 */   public static final ItemArmor leatherLeggings = (ItemArmor)a("leather_leggings");
/*  55: 60 */   public static final ItemArmor leatherBoots = (ItemArmor)a("leather_boots");
/*  56: 61 */   public static final ItemArmor chainmailHelmet = (ItemArmor)a("chainmail_helmet");
/*  57: 62 */   public static final ItemArmor chainmailChestplate = (ItemArmor)a("chainmail_chestplate");
/*  58: 63 */   public static final ItemArmor chainmailLeggings = (ItemArmor)a("chainmail_leggings");
/*  59: 64 */   public static final ItemArmor chainmailBoots = (ItemArmor)a("chainmail_boots");
/*  60: 65 */   public static final ItemArmor ironHelmet = (ItemArmor)a("iron_helmet");
/*  61: 66 */   public static final ItemArmor ironChestplate = (ItemArmor)a("iron_chestplate");
/*  62: 67 */   public static final ItemArmor aa = (ItemArmor)a("iron_leggings");
/*  63: 68 */   public static final ItemArmor ab = (ItemArmor)a("iron_boots");
/*  64: 69 */   public static final ItemArmor ac = (ItemArmor)a("diamond_helmet");
/*  65: 70 */   public static final ItemArmor diamondChestplate = (ItemArmor)a("diamond_chestplate");
/*  66: 71 */   public static final ItemArmor ae = (ItemArmor)a("diamond_leggings");
/*  67: 72 */   public static final ItemArmor af = (ItemArmor)a("diamond_boots");
/*  68: 73 */   public static final ItemArmor ag = (ItemArmor)a("golden_helmet");
/*  69: 74 */   public static final ItemArmor ah = (ItemArmor)a("golden_chestplate");
/*  70: 75 */   public static final ItemArmor ai = (ItemArmor)a("golden_leggings");
/*  71: 76 */   public static final ItemArmor aj = (ItemArmor)a("golden_boots");
/*  72: 77 */   public static final Item flint = a("flint");
/*  73: 78 */   public static final Item porkchop = a("porkchop");
/*  74: 79 */   public static final Item cookedPorkchop = a("cooked_porkchop");
/*  75: 80 */   public static final Item an = a("painting");
/*  76: 81 */   public static final Item ao = a("golden_apple");
/*  77: 82 */   public static final Item ap = a("sign");
/*  78: 83 */   public static final Item aq = a("wooden_door");
/*  79: 84 */   public static final Item ar = a("spruce_door");
/*  80: 85 */   public static final Item as = a("birch_door");
/*  81: 86 */   public static final Item at = a("jungle_door");
/*  82: 87 */   public static final Item au = a("acacia_door");
/*  83: 88 */   public static final Item av = a("dark_oak_door");
/*  84: 89 */   public static final Item aw = a("bucket");
/*  85: 90 */   public static final Item ax = a("water_bucket");
/*  86: 91 */   public static final Item ay = a("lava_bucket");
/*  87: 92 */   public static final Item az = a("minecart");
/*  88: 93 */   public static final Item saddle = a("saddle");
/*  89: 94 */   public static final Item aB = a("iron_door");
/*  90: 95 */   public static final Item redstone = a("redstone");
/*  91: 96 */   public static final Item aD = a("snowball");
/*  92: 97 */   public static final Item aE = a("boat");
/*  93: 98 */   public static final Item leather = a("leather");
/*  94: 99 */   public static final Item aG = a("milk_bucket");
/*  95:100 */   public static final Item aH = a("brick");
/*  96:101 */   public static final Item aI = a("clay_ball");
/*  97:102 */   public static final Item aJ = a("reeds");
/*  98:103 */   public static final Item paper = a("paper");
/*  99:104 */   public static final Item book = a("book");
/* 100:105 */   public static final Item aM = a("slime_ball");
/* 101:106 */   public static final Item aN = a("chest_minecart");
/* 102:107 */   public static final Item aO = a("furnace_minecart");
/* 103:108 */   public static final Item aP = a("egg");
/* 104:109 */   public static final Item compass = a("compass");
/* 105:110 */   public static final ItemFishingRod fishingRod = (ItemFishingRod)a("fishing_rod");
/* 106:111 */   public static final Item clock = a("clock");
/* 107:112 */   public static final Item aT = a("glowstone_dust");
/* 108:113 */   public static final Item fish = a("fish");
/* 109:114 */   public static final Item aV = a("cooked_fish");
/* 110:115 */   public static final Item dye = a("dye");
/* 111:116 */   public static final Item bone = a("bone");
/* 112:117 */   public static final Item aY = a("sugar");
/* 113:118 */   public static final Item cake = a("cake");
/* 114:119 */   public static final Item ba = a("bed");
/* 115:120 */   public static final Item bb = a("repeater");
/* 116:121 */   public static final Item cookie = a("cookie");
/* 117:122 */   public static final ItemFilledMap filledMap = (ItemFilledMap)a("filled_map");
/* 118:123 */   public static final ItemShears shears = (ItemShears)a("shears");
/* 119:124 */   public static final Item bf = a("melon");
/* 120:125 */   public static final Item bg = a("pumpkin_seeds");
/* 121:126 */   public static final Item bh = a("melon_seeds");
/* 122:127 */   public static final Item bi = a("beef");
/* 123:128 */   public static final Item bj = a("cooked_beef");
/* 124:129 */   public static final Item chicken = a("chicken");
/* 125:130 */   public static final Item cookedChicken = a("cooked_chicken");
/* 126:131 */   public static final Item bm = a("mutton");
/* 127:132 */   public static final Item bn = a("cooked_mutton");
/* 128:133 */   public static final Item bo = a("rabbit");
/* 129:134 */   public static final Item bp = a("cooked_rabbit");
/* 130:135 */   public static final Item bq = a("rabbit_stew");
/* 131:136 */   public static final Item br = a("rabbit_foot");
/* 132:137 */   public static final Item bs = a("rabbit_hide");
/* 133:138 */   public static final Item rottenFlesh = a("rotten_flesh");
/* 134:139 */   public static final Item bu = a("ender_pearl");
/* 135:140 */   public static final Item blazeRod = a("blaze_rod");
/* 136:141 */   public static final Item ghastTear = a("ghast_tear");
/* 137:142 */   public static final Item goldNugget = a("gold_nugget");
/* 138:143 */   public static final Item by = a("nether_wart");
/* 139:144 */   public static final ItemPotion potion = (ItemPotion)a("potion");
/* 140:145 */   public static final Item bA = a("glass_bottle");
/* 141:146 */   public static final Item bB = a("spider_eye");
/* 142:147 */   public static final Item bC = a("fermented_spider_eye");
/* 143:148 */   public static final Item bD = a("blaze_powder");
/* 144:149 */   public static final Item bE = a("magma_cream");
/* 145:150 */   public static final Item bF = a("brewing_stand");
/* 146:151 */   public static final Item bG = a("cauldron");
/* 147:152 */   public static final Item enderEye = a("ender_eye");
/* 148:153 */   public static final Item bI = a("speckled_melon");
/* 149:154 */   public static final Item spawnEgg = a("spawn_egg");
/* 150:155 */   public static final Item experienceBottle = a("experience_bottle");
/* 151:156 */   public static final Item bL = a("fire_charge");
/* 152:157 */   public static final Item bM = a("writable_book");
/* 153:158 */   public static final Item writtenBook = a("written_book");
/* 154:159 */   public static final Item emerald = a("emerald");
/* 155:160 */   public static final Item itemFrame = a("item_frame");
/* 156:161 */   public static final Item bQ = a("flower_pot");
/* 157:162 */   public static final Item carrot = a("carrot");
/* 158:163 */   public static final Item potato = a("potato");
/* 159:164 */   public static final Item bT = a("baked_potato");
/* 160:165 */   public static final Item bU = a("poisonous_potato");
/* 161:166 */   public static final akz map = (akz)a("map");
/* 162:167 */   public static final Item bW = a("golden_carrot");
/* 163:168 */   public static final Item skull = a("skull");
/* 164:169 */   public static final Item bY = a("carrot_on_a_stick");
/* 165:170 */   public static final Item bZ = a("nether_star");
/* 166:171 */   public static final Item pumpkinPie = a("pumpkin_pie");
/* 167:172 */   public static final Item cb = a("fireworks");
/* 168:173 */   public static final Item cc = a("firework_charge");
/* 169:174 */   public static final ItemEnchantedBook enchantedBook = (ItemEnchantedBook)a("enchanted_book");
/* 170:175 */   public static final Item ce = a("comparator");
/* 171:176 */   public static final Item cf = a("netherbrick");
/* 172:177 */   public static final Item cg = a("quartz");
/* 173:178 */   public static final Item ch = a("tnt_minecart");
/* 174:179 */   public static final Item ci = a("hopper_minecart");
/* 175:180 */   public static final ajq armorStand = (ajq)a("armor_stand");
/* 176:181 */   public static final Item ck = a("iron_horse_armor");
/* 177:182 */   public static final Item cl = a("golden_horse_armor");
/* 178:183 */   public static final Item cm = a("diamond_horse_armor");
/* 179:184 */   public static final Item cn = a("lead");
/* 180:185 */   public static final Item nameTag = a("name_tag");
/* 181:186 */   public static final Item cp = a("command_block_minecart");
/* 182:187 */   public static final Item cq = a("record_13");
/* 183:188 */   public static final Item cr = a("record_cat");
/* 184:189 */   public static final Item cs = a("record_blocks");
/* 185:190 */   public static final Item ct = a("record_chirp");
/* 186:191 */   public static final Item cu = a("record_far");
/* 187:192 */   public static final Item cv = a("record_mall");
/* 188:193 */   public static final Item cw = a("record_mellohi");
/* 189:194 */   public static final Item cx = a("record_stal");
/* 190:195 */   public static final Item cy = a("record_strad");
/* 191:196 */   public static final Item cz = a("record_ward");
/* 192:197 */   public static final Item cA = a("record_11");
/* 193:198 */   public static final Item cB = a("record_wait");
/* 194:199 */   public static final Item cC = a("prismarine_shard");
/* 195:200 */   public static final Item cD = a("prismarine_crystals");
/* 196:201 */   public static final Item cE = a("banner");
/* 197:    */   
/* 198:    */   private static Item a(String paramString)
/* 199:    */   {
/* 200:206 */     return (Item)Item.e.a(new oa(paramString));
/* 201:    */   }
/* 202:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     amk
 * JD-Core Version:    0.7.0.1
 */