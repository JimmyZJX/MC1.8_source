package net.minecraft.src;
/*   1:    */ import java.util.Collection;
/*   3:    */ import org.apache.logging.log4j.LogManager;
/*   4:    */ import org.apache.logging.log4j.Logger;
/*   5:    */ 
/*   6:    */ public class bse
/*   7:    */   extends bqc
/*   8:    */ {
/*   9: 16 */   private static final Logger b = LogManager.getLogger();
/*  10:    */   private bsd c;
/*  11:    */   private NBTTagCompound d;
/*  12:    */   
/*  13:    */   public bse()
/*  14:    */   {
/*  15: 23 */     this("scoreboard");
/*  16:    */   }
/*  17:    */   
/*  18:    */   public bse(String paramString)
/*  19:    */   {
/*  20: 27 */     super(paramString);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void a(bsd parambsd)
/*  24:    */   {
/*  25: 31 */     this.c = parambsd;
/*  26: 33 */     if (this.d != null) {
/*  27: 34 */       readFromNBT(this.d);
/*  28:    */     }
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void readFromNBT(NBTTagCompound paramfn)
/*  32:    */   {
/*  33: 40 */     if (this.c == null)
/*  34:    */     {
/*  35: 41 */       this.d = paramfn;
/*  36: 42 */       return;
/*  37:    */     }
/*  38: 45 */     b(paramfn.c("Objectives", 10));
/*  39: 46 */     c(paramfn.c("PlayerScores", 10));
/*  40: 48 */     if (paramfn.hasKey("DisplaySlots", 10)) {
/*  41: 49 */       c(paramfn.getCompoundTag("DisplaySlots"));
/*  42:    */     }
/*  43: 52 */     if (paramfn.hasKey("Teams", 9)) {
/*  44: 53 */       a(paramfn.c("Teams", 10));
/*  45:    */     }
/*  46:    */   }
/*  47:    */   
/*  48:    */   protected void a(fv paramfv)
/*  49:    */   {
/*  50: 58 */     for (int i = 0; i < paramfv.c(); i++)
/*  51:    */     {
/*  52: 59 */       NBTTagCompound localfn = paramfv.b(i);
/*  53:    */       
/*  54: 61 */       brz localbrz = this.c.e(localfn.getString("Name"));
/*  55: 62 */       localbrz.a(localfn.getString("DisplayName"));
/*  56: 63 */       if (localfn.hasKey("TeamColor", 8)) {
/*  57: 64 */         localbrz.a(net.minecraft.src.a.b(localfn.getString("TeamColor")));
/*  58:    */       }
/*  59: 66 */       localbrz.b(localfn.getString("Prefix"));
/*  60: 67 */       localbrz.c(localfn.getString("Suffix"));
/*  61: 68 */       if (localfn.hasKey("AllowFriendlyFire", 99)) {
/*  62: 69 */         localbrz.a(localfn.getBoolean("AllowFriendlyFire"));
/*  63:    */       }
/*  64: 71 */       if (localfn.hasKey("SeeFriendlyInvisibles", 99)) {
/*  65: 72 */         localbrz.b(localfn.getBoolean("SeeFriendlyInvisibles"));
/*  66:    */       }
/*  67:    */       bsg localbsg;
/*  68: 74 */       if (localfn.hasKey("NameTagVisibility", 8))
/*  69:    */       {
/*  70: 75 */         localbsg = bsg.a(localfn.getString("NameTagVisibility"));
/*  71: 76 */         if (localbsg != null) {
/*  72: 77 */           localbrz.a(localbsg);
/*  73:    */         }
/*  74:    */       }
/*  75: 80 */       if (localfn.hasKey("DeathMessageVisibility", 8))
/*  76:    */       {
/*  77: 81 */         localbsg = bsg.a(localfn.getString("DeathMessageVisibility"));
/*  78: 82 */         if (localbsg != null) {
/*  79: 83 */           localbrz.b(localbsg);
/*  80:    */         }
/*  81:    */       }
/*  82: 87 */       a(localbrz, localfn.c("Players", 8));
/*  83:    */     }
/*  84:    */   }
/*  85:    */   
/*  86:    */   protected void a(brz parambrz, fv paramfv)
/*  87:    */   {
/*  88: 92 */     for (int i = 0; i < paramfv.c(); i++) {
/*  89: 93 */       this.c.a(paramfv.f(i), parambrz.b());
/*  90:    */     }
/*  91:    */   }
/*  92:    */   
/*  93:    */   protected void c(NBTTagCompound paramfn)
/*  94:    */   {
/*  95: 98 */     for (int i = 0; i < 19; i++) {
/*  96: 99 */       if (paramfn.hasKey("slot_" + i, 8))
/*  97:    */       {
/*  98:100 */         String str = paramfn.getString("slot_" + i);
/*  99:101 */         bry localbry = this.c.b(str);
/* 100:102 */         this.c.a(i, localbry);
/* 101:    */       }
/* 102:    */     }
/* 103:    */   }
/* 104:    */   
/* 105:    */   protected void b(fv paramfv)
/* 106:    */   {
/* 107:108 */     for (int i = 0; i < paramfv.c(); i++)
/* 108:    */     {
/* 109:109 */       NBTTagCompound localfn = paramfv.b(i);
/* 110:    */       
/* 111:111 */       bsk localbsk = (bsk)bsk.a.get(localfn.getString("CriteriaName"));
/* 112:112 */       if (localbsk != null)
/* 113:    */       {
/* 114:115 */         bry localbry = this.c.a(localfn.getString("Name"), localbsk);
/* 115:116 */         localbry.a(localfn.getString("DisplayName"));
/* 116:117 */         localbry.a(bsl.a(localfn.getString("RenderType")));
/* 117:    */       }
/* 118:    */     }
/* 119:    */   }
/* 120:    */   
/* 121:    */   protected void c(fv paramfv)
/* 122:    */   {
/* 123:122 */     for (int i = 0; i < paramfv.c(); i++)
/* 124:    */     {
/* 125:123 */       NBTTagCompound localfn = paramfv.b(i);
/* 126:    */       
/* 127:125 */       bry localbry = this.c.b(localfn.getString("Objective"));
/* 128:126 */       bsa localbsa = this.c.c(localfn.getString("Name"), localbry);
/* 129:127 */       localbsa.c(localfn.getInteger("Score"));
/* 130:128 */       if (localfn.c("Locked")) {
/* 131:129 */         localbsa.a(localfn.getBoolean("Locked"));
/* 132:    */       }
/* 133:    */     }
/* 134:    */   }
/* 135:    */   
/* 136:    */   public void writeToNBT(NBTTagCompound paramfn)
/* 137:    */   {
/* 138:136 */     if (this.c == null)
/* 139:    */     {
/* 140:137 */       b.warn("Tried to save scoreboard without having a scoreboard...");
/* 141:138 */       return;
/* 142:    */     }
/* 143:141 */     paramfn.setNBT("Objectives", b());
/* 144:142 */     paramfn.setNBT("PlayerScores", e());
/* 145:143 */     paramfn.setNBT("Teams", a());
/* 146:    */     
/* 147:145 */     d(paramfn);
/* 148:    */   }
/* 149:    */   
/* 150:    */   protected fv a()
/* 151:    */   {
/* 152:149 */     fv localfv1 = new fv();
/* 153:150 */     Collection<brz> localCollection = this.c.g();
/* 154:152 */     for (brz localbrz : localCollection)
/* 155:    */     {
/* 156:153 */       NBTTagCompound localfn = new NBTTagCompound();
/* 157:    */       
/* 158:155 */       localfn.setString("Name", localbrz.b());
/* 159:156 */       localfn.setString("DisplayName", localbrz.c());
/* 160:157 */       if (localbrz.l().b() >= 0) {
/* 161:158 */         localfn.setString("TeamColor", localbrz.l().e());
/* 162:    */       }
/* 163:160 */       localfn.setString("Prefix", localbrz.e());
/* 164:161 */       localfn.setString("Suffix", localbrz.f());
/* 165:162 */       localfn.setBoolean("AllowFriendlyFire", localbrz.g());
/* 166:163 */       localfn.setBoolean("SeeFriendlyInvisibles", localbrz.h());
/* 167:164 */       localfn.setString("NameTagVisibility", localbrz.i().e);
/* 168:165 */       localfn.setString("DeathMessageVisibility", localbrz.j().e);
/* 169:    */       
/* 170:167 */       fv localfv2 = new fv();
/* 171:169 */       for (String str : localbrz.d()) {
/* 172:170 */         localfv2.a(new gc(str));
/* 173:    */       }
/* 174:173 */       localfn.setNBT("Players", localfv2);
/* 175:    */       
/* 176:175 */       localfv1.a(localfn);
/* 177:    */     }
/* 178:178 */     return localfv1;
/* 179:    */   }
/* 180:    */   
/* 181:    */   protected void d(NBTTagCompound paramfn)
/* 182:    */   {
/* 183:182 */     NBTTagCompound localfn = new NBTTagCompound();
/* 184:183 */     int i = 0;
/* 185:185 */     for (int j = 0; j < 19; j++)
/* 186:    */     {
/* 187:186 */       bry localbry = this.c.a(j);
/* 188:188 */       if (localbry != null)
/* 189:    */       {
/* 190:189 */         localfn.setString("slot_" + j, localbry.b());
/* 191:190 */         i = 1;
/* 192:    */       }
/* 193:    */     }
/* 194:194 */     if (i != 0) {
/* 195:195 */       paramfn.setNBT("DisplaySlots", localfn);
/* 196:    */     }
/* 197:    */   }
/* 198:    */   
/* 199:    */   protected fv b()
/* 200:    */   {
/* 201:200 */     fv localfv = new fv();
/* 202:201 */     Collection<bry> localCollection = this.c.c();
/* 203:203 */     for (bry localbry : localCollection) {
/* 204:204 */       if (localbry.c() != null)
/* 205:    */       {
/* 206:208 */         NBTTagCompound localfn = new NBTTagCompound();
/* 207:209 */         localfn.setString("Name", localbry.b());
/* 208:210 */         localfn.setString("CriteriaName", localbry.c().a());
/* 209:211 */         localfn.setString("DisplayName", localbry.d());
/* 210:212 */         localfn.setString("RenderType", localbry.e().a());
/* 211:    */         
/* 212:214 */         localfv.a(localfn);
/* 213:    */       }
/* 214:    */     }
/* 215:217 */     return localfv;
/* 216:    */   }
/* 217:    */   
/* 218:    */   protected fv e()
/* 219:    */   {
/* 220:221 */     fv localfv = new fv();
/* 221:222 */     Collection<bsa> localCollection = this.c.e();
/* 222:224 */     for (bsa localbsa : localCollection) {
/* 223:225 */       if (localbsa.d() != null)
/* 224:    */       {
/* 225:229 */         NBTTagCompound localfn = new NBTTagCompound();
/* 226:230 */         localfn.setString("Name", localbsa.e());
/* 227:231 */         localfn.setString("Objective", localbsa.d().b());
/* 228:232 */         localfn.setInt("Score", localbsa.c());
/* 229:233 */         localfn.setBoolean("Locked", localbsa.g());
/* 230:    */         
/* 231:235 */         localfv.a(localfn);
/* 232:    */       }
/* 233:    */     }
/* 234:238 */     return localfv;
/* 235:    */   }
/* 236:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bse
 * JD-Core Version:    0.7.0.1
 */