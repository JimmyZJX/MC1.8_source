package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;

/*   4:    */ import java.util.ArrayList;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Map;
/*   7:    */ import java.util.Set;
import org.apache.logging.log4j.LogManager;
/*   9:    */ import org.apache.logging.log4j.Logger;
/*  10:    */ 
/*  11:    */ public class EntityList
/*  12:    */ {
/*  13: 39 */   private static final Logger b = LogManager.getLogger();
/*  14: 40 */   private static final Map<String,Class<? extends Entity>> stringToClassMapping = Maps.newHashMap();
/*  15: 41 */   private static final Map<Class<? extends Entity>,String> classToStringMapping = Maps.newHashMap();
/*  16: 42 */   private static final Map<Integer,Class<? extends Entity>> IDtoClassMapping = Maps.newHashMap();
/*  17: 43 */   private static final Map<Class<? extends Entity>,Integer> classToIDMapping = Maps.newHashMap();
/*  18: 44 */   private static final Map<String,Integer> stringToIDMapping = Maps.newHashMap();
/*  19: 46 */   public static final Map<Integer,xc> entityEggs = Maps.newLinkedHashMap();
/*  20:    */   
/*  21:    */   private static void a(Class<? extends Entity> paramClass, String paramString, int paramInt)
/*  22:    */   {
/*  23: 49 */     if (stringToClassMapping.containsKey(paramString)) {
/*  24: 50 */       throw new IllegalArgumentException("ID is already registered: " + paramString);
/*  25:    */     }
/*  26: 52 */     if (IDtoClassMapping.containsKey(Integer.valueOf(paramInt))) {
/*  27: 53 */       throw new IllegalArgumentException("ID is already registered: " + paramInt);
/*  28:    */     }
/*  29: 55 */     if (paramInt == 0) {
/*  30: 56 */       throw new IllegalArgumentException("Cannot register to reserved id: " + paramInt);
/*  31:    */     }
/*  32: 58 */     if (paramClass == null) {
/*  33: 59 */       throw new IllegalArgumentException("Cannot register null clazz for id: " + paramInt);
/*  34:    */     }
/*  35: 61 */     stringToClassMapping.put(paramString, paramClass);
/*  36: 62 */     classToStringMapping.put(paramClass, paramString);
/*  37: 63 */     IDtoClassMapping.put(Integer.valueOf(paramInt), paramClass);
/*  38: 64 */     classToIDMapping.put(paramClass, Integer.valueOf(paramInt));
/*  39: 65 */     stringToIDMapping.put(paramString, Integer.valueOf(paramInt));
/*  40:    */   }
/*  41:    */   
/*  42:    */   private static void a(Class<? extends Entity> paramClass, String paramString, int paramInt1, int paramInt2, int paramInt3)
/*  43:    */   {
/*  44: 69 */     a(paramClass, paramString, paramInt1);
/*  45:    */     
/*  46: 71 */     entityEggs.put(Integer.valueOf(paramInt1), new xc(paramInt1, paramInt2, paramInt3));
/*  47:    */   }
/*  48:    */   
/*  49:    */   static
/*  50:    */   {
/*  51: 75 */     a(EntityItem.class, "Item", 1);
/*  52: 76 */     a(EntityExperienceOrb.class, "XPOrb", 2);
/*  53:    */     
/*  54: 78 */     a(adl.class, "LeashKnot", 8);
/*  55: 79 */     a(adm.class, "Painting", 9);
/*  56: 80 */     a(ahj.class, "Arrow", 10);
/*  57: 81 */     a(ahq.class, "Snowball", 11);
/*  58: 82 */     a(ahn.class, "Fireball", 12);
/*  59: 83 */     a(ahp.class, "SmallFireball", 13);
/*  60: 84 */     a(aht.class, "ThrownEnderpearl", 14);
/*  61: 85 */     a(EntityEnderEye.class, "EyeOfEnderSignal", 15);
/*  62: 86 */     a(ahv.class, "ThrownPotion", 16);
/*  63: 87 */     a(ahu.class, "ThrownExpBottle", 17);
/*  64: 88 */     a(EntityItemFrame.class, "ItemFrame", 18);
/*  65: 89 */     a(ahw.class, "WitherSkull", 19);
/*  66:    */     
/*  67: 91 */     a(aek.class, "PrimedTnt", 20);
/*  68: 92 */     a(adv.class, "FallingSand", 21);
/*  69:    */     
/*  70: 94 */     a(ahm.class, "FireworksRocketEntity", 22);
/*  71:    */     
/*  72: 96 */     a(EntityArmorStand.class, "ArmorStand", 30);
/*  73:    */     
/*  74: 98 */     a(adu.class, "Boat", 41);
/*  75: 99 */     a(aeg.class, EnumMinecartVariant.a.b(), 42);
/*  76:100 */     a(aea.class, EnumMinecartVariant.b.b(), 43);
/*  77:101 */     a(aee.class, EnumMinecartVariant.c.b(), 44);
/*  78:102 */     a(aej.class, EnumMinecartVariant.d.b(), 45);
/*  79:103 */     a(aef.class, EnumMinecartVariant.f.b(), 46);
/*  80:104 */     a(aeh.class, EnumMinecartVariant.e.b(), 47);
/*  81:105 */     a(aeb.class, EnumMinecartVariant.g.b(), 40);
/*  82:    */     
/*  83:107 */     a(EntityMob.class, "Mob", 48);
/*  84:108 */     a(EntityHostileMob.class, "Monster", 49);
/*  85:    */     
/*  86:110 */     a(EntityCreeper.class, "Creeper", 50, 894731, 0);
/*  87:111 */     a(EntitySkeleton.class, "Skeleton", 51, 12698049, 4802889);
/*  88:112 */     a(EntitySpider.class, "Spider", 52, 3419431, 11013646);
/*  89:113 */     a(EntityGiant.class, "Giant", 53);
/*  90:114 */     a(EntityZombie.class, "Zombie", 54, 44975, 7969893);
/*  91:115 */     a(EntitySlime.class, "Slime", 55, 5349438, 8306542);
/*  92:116 */     a(EntityGhast.class, "Ghast", 56, 16382457, 12369084);
/*  93:117 */     a(EntityZombiePigman.class, "PigZombie", 57, 15373203, 5009705);
/*  94:118 */     a(EntityEnderman.class, "Enderman", 58, 1447446, 0);
/*  95:119 */     a(aeo.class, "CaveSpider", 59, 803406, 11013646);
/*  96:120 */     a(EntitySilverfish.class, "Silverfish", 60, 7237230, 3158064);
/*  97:121 */     a(EntityBlaze.class, "Blaze", 61, 16167425, 16775294);
/*  98:122 */     a(EntityLavaSlime.class, "LavaSlime", 62, 3407872, 16579584);
/*  99:123 */     a(EntityEnderDragon.class, "EnderDragon", 63);
/* 100:124 */     a(EntityWither.class, "WitherBoss", 64);
/* 101:125 */     a(EntityBat.class, "Bat", 65, 4996656, 986895);
/* 102:126 */     a(EntityWitch.class, "Witch", 66, 3407872, 5349438);
/* 103:127 */     a(EntityEndermite.class, "Endermite", 67, 1447446, 7237230);
/* 104:128 */     a(EntityGuardian.class, "Guardian", 68, 5931634, 15826224);
/* 105:    */     
/* 106:130 */     a(EntityPig.class, "Pig", 90, 15771042, 14377823);
/* 107:131 */     a(EntitySheep.class, "Sheep", 91, 15198183, 16758197);
/* 108:132 */     a(EntityCow.class, "Cow", 92, 4470310, 10592673);
/* 109:133 */     a(EntityChicken.class, "Chicken", 93, 10592673, 16711680);
/* 110:134 */     a(EntitySquid.class, "Squid", 94, 2243405, 7375001);
/* 111:135 */     a(EntityWolf.class, "Wolf", 95, 14144467, 13545366);
/* 112:136 */     a(EntityMooshroom.class, "MushroomCow", 96, 10489616, 12040119);
/* 113:137 */     a(EntitySnowGolem.class, "SnowMan", 97);
/* 114:138 */     a(EntityOcelot.class, "Ozelot", 98, 15720061, 5653556);
/* 115:139 */     a(EntityIronGolem.class, "VillagerGolem", 99);
/* 116:140 */     a(EntityHorse.class, "EntityHorse", 100, 12623485, 15656192);
/* 117:141 */     a(EntityRabbit.class, "Rabbit", 101, 10051392, 7555121);
/* 118:    */     
/* 119:143 */     a(EntityVillager.class, "Villager", 120, 5651507, 12422002);
/* 120:    */     
/* 121:145 */     a(ada.class, "EnderCrystal", 200);
/* 122:    */   }
/* 123:    */   
/* 124:    */   public static Entity a(String paramString, World paramaqu)
/* 125:    */   {
/* 126:150 */     Entity localwv = null;
/* 127:    */     try
/* 128:    */     {
/* 129:152 */       Class<? extends Entity> localClass = stringToClassMapping.get(paramString);
/* 130:153 */       if (localClass != null) {
/* 131:154 */         localwv = (Entity)localClass.getConstructor(new Class[] { World.class }).newInstance(new Object[] { paramaqu });
/* 132:    */       }
/* 133:    */     }
/* 134:    */     catch (Exception localException)
/* 135:    */     {
/* 136:157 */       localException.printStackTrace();
/* 137:    */     }
/* 138:159 */     return localwv;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public static Entity a(NBTTagCompound tag, World world)
/* 142:    */   {
/* 143:164 */     Entity localwv = null;
/* 144:167 */     if ("Minecart".equals(tag.getString("id")))
/* 145:    */     {
/* 146:168 */       tag.setString("id", EnumMinecartVariant.a(tag.getInteger("Type")).b());
/* 147:169 */       tag.o("Type");
/* 148:    */     }
/* 149:    */     try
/* 150:    */     {
/* 151:173 */       Class<? extends Entity> localClass = stringToClassMapping.get(tag.getString("id"));
/* 152:174 */       if (localClass != null) {
/* 153:175 */         localwv = localClass.getConstructor(new Class[] { World.class }).newInstance(new Object[] { world });
/* 154:    */       }
/* 155:    */     }
/* 156:    */     catch (Exception localException)
/* 157:    */     {
/* 158:178 */       localException.printStackTrace();
/* 159:    */     }
/* 160:180 */     if (localwv != null) {
/* 161:181 */       localwv.f(tag);
/* 162:    */     } else {
/* 163:183 */       b.warn("Skipping Entity with id " + tag.getString("id"));
/* 164:    */     }
/* 165:185 */     return localwv;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public static Entity a(int paramInt, World paramaqu)
/* 169:    */   {
/* 170:190 */     Entity localwv = null;
/* 171:    */     try
/* 172:    */     {
/* 173:192 */       Class<? extends Entity> localClass = fromID(paramInt);
/* 174:193 */       if (localClass != null) {
/* 175:194 */         localwv = localClass.getConstructor(new Class[] { World.class }).newInstance(new Object[] { paramaqu });
/* 176:    */       }
/* 177:    */     }
/* 178:    */     catch (Exception localException)
/* 179:    */     {
/* 180:197 */       localException.printStackTrace();
/* 181:    */     }
/* 182:199 */     if (localwv == null) {
/* 183:200 */       b.warn("Skipping Entity with id " + paramInt);
/* 184:    */     }
/* 185:202 */     return localwv;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public static int a(Entity paramwv)
/* 189:    */   {
/* 190:206 */     Integer localInteger = (Integer)classToIDMapping.get(paramwv.getClass());
/* 191:207 */     return localInteger == null ? 0 : localInteger.intValue();
/* 192:    */   }
/* 193:    */   
/* 194:    */   public static Class<? extends Entity> fromID(int paramInt)
/* 195:    */   {
/* 196:212 */     return IDtoClassMapping.get(Integer.valueOf(paramInt));
/* 197:    */   }
/* 198:    */   
/* 199:    */   public static String b(Entity paramwv)
/* 200:    */   {
/* 201:216 */     return classToStringMapping.get(paramwv.getClass());
/* 202:    */   }
/* 203:    */   
/* 204:    */   public static int a(String paramString)
/* 205:    */   {
/* 206:220 */     Integer localInteger = stringToIDMapping.get(paramString);
/* 207:221 */     if (localInteger == null) {
/* 208:223 */       return 90;
/* 209:    */     }
/* 210:225 */     return localInteger.intValue();
/* 211:    */   }
/* 212:    */   
/* 213:    */   public static String b(int paramInt)
/* 214:    */   {
/* 215:230 */     return (String)classToStringMapping.get(fromID(paramInt));
/* 216:    */   }
/* 217:    */   
/* 218:    */   public static List<String> b()
/* 219:    */   {
/* 220:238 */     Set<String> localSet = stringToClassMapping.keySet();
/* 221:239 */     ArrayList<String> localArrayList = Lists.newArrayList();
/* 222:240 */     for (String str : localSet)
/* 223:    */     {
/* 224:241 */       Class<? extends Entity> localClass = stringToClassMapping.get(str);
/* 225:242 */       if ((localClass.getModifiers() & 0x400) != 1024) {
/* 226:243 */         localArrayList.add(str);
/* 227:    */       }
/* 228:    */     }
/* 229:247 */     localArrayList.add("LightningBolt");
/* 230:248 */     return localArrayList;
/* 231:    */   }
/* 232:    */   
/* 233:    */   public static boolean a(Entity paramwv, String paramString)
/* 234:    */   {
/* 235:252 */     String str = b(paramwv);
/* 236:253 */     if ((str == null) && ((paramwv instanceof EntityPlayer))) {
/* 237:254 */       str = "Player";
/* 238:255 */     } else if ((str == null) && ((paramwv instanceof ads))) {
/* 239:256 */       str = "LightningBolt";
/* 240:    */     }
/* 241:258 */     return paramString.equals(str);
/* 242:    */   }
/* 243:    */   
/* 244:    */   public static boolean b(String paramString)
/* 245:    */   {
/* 246:262 */     return ("Player".equals(paramString)) || (b().contains(paramString));
/* 247:    */   }
/* 248:    */   
/* 249:    */   public static void a() {}
/* 250:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     xb
 * JD-Core Version:    0.7.0.1
 */