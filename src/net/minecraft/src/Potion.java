package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;

/*   2:    */ import java.util.Map;
/*   4:    */ import java.util.UUID;
/*   5:    */ 
/*   6:    */ public class Potion
/*   7:    */ {
/*   8: 25 */   public static final Potion[] potionList = new Potion[32];
/*   9: 26 */   private static final Map<oa,Potion> I = Maps.newHashMap();
/*  10: 28 */   public static final Potion b = null;
/*  11: 29 */   public static final Potion speed = new Potion(1, new oa("speed"), false, 8171462).setName("potion.moveSpeed").b(0, 0).a(afs.d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2000000029802322D, 2);
/*  12: 30 */   public static final Potion slowness = new Potion(2, new oa("slowness"), true, 5926017).setName("potion.moveSlowdown").b(1, 0).a(afs.d, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.1500000059604645D, 2);
/*  13: 31 */   public static final Potion haste = new Potion(3, new oa("haste"), false, 14270531).setName("potion.digSpeed").b(2, 0).a(1.5D);
/*  14: 32 */   public static final Potion miningFatigue = new Potion(4, new oa("mining_fatigue"), true, 4866583).setName("potion.digSlowDown").b(3, 0);
/*  15: 33 */   public static final Potion strength = new wm(5, new oa("strength"), false, 9643043).setName("potion.damageBoost").b(4, 0).a(afs.e, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 2.5D, 2);
/*  16: 34 */   public static final Potion instantHealth = new InstantPotion(6, new oa("instant_health"), false, 16262179).setName("potion.heal");
/*  17: 35 */   public static final Potion instantDamage = new InstantPotion(7, new oa("instant_damage"), true, 4393481).setName("potion.harm");
/*  18: 36 */   public static final Potion jumpBoost = new Potion(8, new oa("jump_boost"), false, 2293580).setName("potion.jump").b(2, 1);
/*  19: 37 */   public static final Potion nausea = new Potion(9, new oa("nausea"), true, 5578058).setName("potion.confusion").b(3, 1).a(0.25D);
/*  20: 38 */   public static final Potion regeneration = new Potion(10, new oa("regeneration"), false, 13458603).setName("potion.regeneration").b(7, 0).a(0.25D);
/*  21: 39 */   public static final Potion resistance = new Potion(11, new oa("resistance"), false, 10044730).setName("potion.resistance").b(6, 1);
/*  22: 40 */   public static final Potion fireResistance = new Potion(12, new oa("fire_resistance"), false, 14981690).setName("potion.fireResistance").b(7, 1);
/*  23: 41 */   public static final Potion waterBreathing = new Potion(13, new oa("water_breathing"), false, 3035801).setName("potion.waterBreathing").b(0, 2);
/*  24: 42 */   public static final Potion invisibility = new Potion(14, new oa("invisibility"), false, 8356754).setName("potion.invisibility").b(0, 1);
/*  25: 43 */   public static final Potion blindness = new Potion(15, new oa("blindness"), true, 2039587).setName("potion.blindness").b(5, 1).a(0.25D);
/*  26: 44 */   public static final Potion nightVision = new Potion(16, new oa("night_vision"), false, 2039713).setName("potion.nightVision").b(4, 1);
/*  27: 45 */   public static final Potion hunger = new Potion(17, new oa("hunger"), true, 5797459).setName("potion.hunger").b(1, 1);
/*  28: 46 */   public static final Potion weakness = new wm(18, new oa("weakness"), true, 4738376).setName("potion.weakness").b(5, 0).a(afs.e, "22653B89-116E-49DC-9B6B-9971489B5BE5", 2.0D, 0);
/*  29: 47 */   public static final Potion poison = new Potion(19, new oa("poison"), true, 5149489).setName("potion.poison").b(6, 0).a(0.25D);
/*  30: 48 */   public static final Potion wither = new Potion(20, new oa("wither"), true, 3484199).setName("potion.wither").b(1, 2).a(0.25D);
/*  31: 49 */   public static final Potion healthBoost = new wn(21, new oa("health_boost"), false, 16284963).setName("potion.healthBoost").b(2, 2).a(afs.a, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0D, 0);
/*  32: 50 */   public static final Potion absorption = new wl(22, new oa("absorption"), false, 2445989).setName("potion.absorption").b(2, 2);
/*  33: 51 */   public static final Potion saturation = new InstantPotion(23, new oa("saturation"), false, 16262179).setName("potion.saturation");
/*  34: 52 */   public static final Potion z = null;
/*  35: 53 */   public static final Potion A = null;
/*  36: 54 */   public static final Potion B = null;
/*  37: 55 */   public static final Potion C = null;
/*  38: 56 */   public static final Potion D = null;
/*  39: 57 */   public static final Potion E = null;
/*  40: 58 */   public static final Potion F = null;
/*  41: 59 */   public static final Potion G = null;
/*  42:    */   public final int id;
/*  43: 62 */   private final Map<xy,ya> J = Maps.newHashMap();
/*  44:    */   private final boolean K;
/*  45:    */   private final int L;
/*  46: 65 */   private String name = "";
/*  47: 66 */   private int N = -1;
/*  48:    */   private double O;
/*  49:    */   private boolean P;
/*  50:    */   
/*  51:    */   protected Potion(int id, oa paramoa, boolean paramBoolean, int paramInt2)
/*  52:    */   {
/*  53: 71 */     this.id = id;
/*  54:    */     
/*  55: 73 */     potionList[id] = this;
/*  56: 74 */     I.put(paramoa, this);
/*  57: 75 */     this.K = paramBoolean;
/*  58: 76 */     if (paramBoolean) {
/*  59: 77 */       this.O = 0.5D;
/*  60:    */     } else {
/*  61: 79 */       this.O = 1.0D;
/*  62:    */     }
/*  63: 81 */     this.L = paramInt2;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public static Potion b(String paramString)
/*  67:    */   {
/*  68: 86 */     return I.get(new oa(paramString));
/*  69:    */   }
/*  70:    */   
/*  71:    */   public static String[] c()
/*  72:    */   {
/*  73: 90 */     String[] arrayOfString = new String[I.size()];
/*  74: 91 */     int i1 = 0;
/*  75: 92 */     for (oa localoa : I.keySet()) {
/*  76: 93 */       arrayOfString[(i1++)] = localoa.toString();
/*  77:    */     }
/*  78: 95 */     return arrayOfString;
/*  79:    */   }
/*  80:    */   
/*  81:    */   protected Potion b(int paramInt1, int paramInt2)
/*  82:    */   {
/*  83: 99 */     this.N = (paramInt1 + paramInt2 * 8);
/*  84:100 */     return this;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public int getID()
/*  88:    */   {
/*  89:104 */     return this.id;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void tickEffect(EntityLiving paramxm, int paramInt)
/*  93:    */   {
/*  94:117 */     if (this.id == regeneration.id)
/*  95:    */     {
/*  96:118 */       if (paramxm.getHealth() < paramxm.bt()) {
/*  97:119 */         paramxm.g(1.0F);
/*  98:    */       }
/*  99:    */     }
/* 100:121 */     else if (this.id == poison.id)
/* 101:    */     {
/* 102:122 */       if (paramxm.getHealth() > 1.0F) {
/* 103:123 */         paramxm.a(DamageSource.l, 1.0F);
/* 104:    */       }
/* 105:    */     }
/* 106:125 */     else if (this.id == wither.id) {
/* 107:126 */       paramxm.a(DamageSource.m, 1.0F);
/* 108:127 */     } else if ((this.id == hunger.id) && ((paramxm instanceof EntityPlayer))) {
/* 109:130 */       ((EntityPlayer)paramxm).a(0.025F * (paramInt + 1));
/* 110:131 */     } else if ((this.id == saturation.id) && ((paramxm instanceof EntityPlayer)))
/* 111:    */     {
/* 112:132 */       if (!paramxm.world.isClient) {
/* 113:133 */         ((EntityPlayer)paramxm).ck().a(paramInt + 1, 1.0F);
/* 114:    */       }
/* 115:    */     }
/* 116:135 */     else if (((this.id == instantHealth.id) && (!paramxm.bl())) || ((this.id == instantDamage.id) && (paramxm.bl()))) {
/* 117:136 */       paramxm.g(Math.max(4 << paramInt, 0));
/* 118:137 */     } else if (((this.id == instantDamage.id) && (!paramxm.bl())) || ((this.id == instantHealth.id) && (paramxm.bl()))) {
/* 119:138 */       paramxm.a(DamageSource.l, 6 << paramInt);
/* 120:    */     }
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void a(Entity paramwv1, Entity paramwv2, EntityLiving paramxm, int paramInt, double paramDouble)
/* 124:    */   {
/* 125:    */     int i1;
/* 126:143 */     if (((this.id == instantHealth.id) && (!paramxm.bl())) || ((this.id == instantDamage.id) && (paramxm.bl())))
/* 127:    */     {
/* 128:144 */       i1 = (int)(paramDouble * (4 << paramInt) + 0.5D);
/* 129:145 */       paramxm.g(i1);
/* 130:    */     }
/* 131:146 */     else if (((this.id == instantDamage.id) && (!paramxm.bl())) || ((this.id == instantHealth.id) && (paramxm.bl())))
/* 132:    */     {
/* 133:147 */       i1 = (int)(paramDouble * (6 << paramInt) + 0.5D);
/* 134:148 */       if (paramwv1 == null) {
/* 135:149 */         paramxm.a(DamageSource.l, i1);
/* 136:    */       } else {
/* 137:151 */         paramxm.a(DamageSource.b(paramwv1, paramwv2), i1);
/* 138:    */       }
/* 139:    */     }
/* 140:    */   }
/* 141:    */   
/* 142:    */   public boolean isInstant()
/* 143:    */   {
/* 144:157 */     return false;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public boolean a(int paramInt1, int paramInt2)
/* 148:    */   {
/* 149:    */     int i1;
/* 150:172 */     if (this.id == regeneration.id)
/* 151:    */     {
/* 152:174 */       i1 = 50 >> paramInt2;
/* 153:175 */       if (i1 > 0) {
/* 154:176 */         return paramInt1 % i1 == 0;
/* 155:    */       }
/* 156:178 */       return true;
/* 157:    */     }
/* 158:179 */     if (this.id == poison.id)
/* 159:    */     {
/* 160:181 */       i1 = 25 >> paramInt2;
/* 161:182 */       if (i1 > 0) {
/* 162:183 */         return paramInt1 % i1 == 0;
/* 163:    */       }
/* 164:185 */       return true;
/* 165:    */     }
/* 166:186 */     if (this.id == wither.id)
/* 167:    */     {
/* 168:187 */       i1 = 40 >> paramInt2;
/* 169:188 */       if (i1 > 0) {
/* 170:189 */         return paramInt1 % i1 == 0;
/* 171:    */       }
/* 172:191 */       return true;
/* 173:    */     }
/* 174:192 */     if (this.id == hunger.id) {
/* 175:193 */       return true;
/* 176:    */     }
/* 177:196 */     return false;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public Potion setName(String paramString)
/* 181:    */   {
/* 182:201 */     this.name = paramString;
/* 183:202 */     return this;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public String getName()
/* 187:    */   {
/* 188:207 */     return this.name;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public boolean e()
/* 192:    */   {
/* 193:211 */     return this.N >= 0;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public int f()
/* 197:    */   {
/* 198:215 */     return this.N;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public boolean g()
/* 202:    */   {
/* 203:219 */     return this.K;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public static String getDurationString(PotionEffect paramwq)
/* 207:    */   {
/* 208:223 */     if (paramwq.h()) {
/* 209:224 */       return "**:**";
/* 210:    */     }
/* 211:226 */     int i1 = paramwq.getDuration();
/* 212:227 */     return vb.a(i1);
/* 213:    */   }
/* 214:    */   
/* 215:    */   protected Potion a(double paramDouble)
/* 216:    */   {
/* 217:231 */     this.O = paramDouble;
/* 218:232 */     return this;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public double h()
/* 222:    */   {
/* 223:236 */     return this.O;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public boolean j()
/* 227:    */   {
/* 228:245 */     return this.P;
/* 229:    */   }
/* 230:    */   
/* 231:    */   public int k()
/* 232:    */   {
/* 233:249 */     return this.L;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public Potion a(xy paramxy, String paramString, double paramDouble, int paramInt)
/* 237:    */   {
/* 238:253 */     ya localya = new ya(UUID.fromString(paramString), getName(), paramDouble, paramInt);
/* 239:254 */     this.J.put(paramxy, localya);
/* 240:255 */     return this;
/* 241:    */   }
/* 242:    */   
/* 243:    */   public Map<xy, ya> l()
/* 244:    */   {
/* 245:259 */     return this.J;
/* 246:    */   }
/* 247:    */   
/* 248:    */   public void a(EntityLiving paramxm, yc paramyc, int paramInt)
/* 249:    */   {
/* 250:263 */     for (Map.Entry<xy,ya> localEntry : this.J.entrySet())
/* 251:    */     {
/* 252:264 */       xz localxz = paramyc.a((xy)localEntry.getKey());
/* 253:266 */       if (localxz != null) {
/* 254:267 */         localxz.c((ya)localEntry.getValue());
/* 255:    */       }
/* 256:    */     }
/* 257:    */   }
/* 258:    */   
/* 259:    */   public void b(EntityLiving paramxm, yc paramyc, int paramInt)
/* 260:    */   {
/* 261:273 */     for (Map.Entry<xy,ya> localEntry : this.J.entrySet())
/* 262:    */     {
/* 263:274 */       xz localxz = paramyc.a((xy)localEntry.getKey());
/* 264:276 */       if (localxz != null)
/* 265:    */       {
/* 266:277 */         ya localya = (ya)localEntry.getValue();
/* 267:278 */         localxz.c(localya);
/* 268:279 */         localxz.b(new ya(localya.a(), getName() + " " + paramInt, a(paramInt, localya), localya.c()));
/* 269:    */       }
/* 270:    */     }
/* 271:    */   }
/* 272:    */   
/* 273:    */   public double a(int paramInt, ya paramya)
/* 274:    */   {
/* 275:285 */     return paramya.d() * (paramInt + 1);
/* 276:    */   }
/* 277:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wp
 * JD-Core Version:    0.7.0.1
 */