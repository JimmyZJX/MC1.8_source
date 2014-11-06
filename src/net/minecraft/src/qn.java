package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Sets;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.Iterator;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Set;
/*   7:    */ import net.minecraft.server.MinecraftServer;
/*   8:    */ import org.apache.logging.log4j.LogManager;
/*   9:    */ import org.apache.logging.log4j.Logger;
/*  10:    */ 
/*  11:    */ public class qn
/*  12:    */ {
/*  13: 32 */   private static final Logger a = LogManager.getLogger();
/*  14:    */   private final WorldServer b;
/*  15: 34 */   private Set<qy> c = Sets.newHashSet();
/*  16: 35 */   private um d = new um();
/*  17:    */   private int e;
/*  18:    */   
/*  19:    */   public qn(WorldServer paramqt)
/*  20:    */   {
/*  21: 39 */     this.b = paramqt;
/*  22: 40 */     this.e = paramqt.r().an().d();
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void a(Entity paramwv)
/*  26:    */   {
/*  27:    */     qw localqw;
/*  28: 44 */     if ((paramwv instanceof qw))
/*  29:    */     {
/*  30: 45 */       a(paramwv, 512, 2);
/*  31: 46 */       localqw = (qw)paramwv;
/*  32: 47 */       for (qy localqy : this.c) {
/*  33: 48 */         if (localqy.a != localqw) {
/*  34: 49 */           localqy.b(localqw);
/*  35:    */         }
/*  36:    */       }
/*  37:    */     }
/*  38: 52 */     else if ((paramwv instanceof EntityFishHook))
/*  39:    */     {
/*  40: 53 */       a(paramwv, 64, 5, true);
/*  41:    */     }
/*  42: 54 */     else if ((paramwv instanceof ahj))
/*  43:    */     {
/*  44: 55 */       a(paramwv, 64, 20, false);
/*  45:    */     }
/*  46: 56 */     else if ((paramwv instanceof ahp))
/*  47:    */     {
/*  48: 57 */       a(paramwv, 64, 10, false);
/*  49:    */     }
/*  50: 58 */     else if ((paramwv instanceof ahl))
/*  51:    */     {
/*  52: 59 */       a(paramwv, 64, 10, false);
/*  53:    */     }
/*  54: 60 */     else if ((paramwv instanceof ahq))
/*  55:    */     {
/*  56: 61 */       a(paramwv, 64, 10, true);
/*  57:    */     }
/*  58: 62 */     else if ((paramwv instanceof aht))
/*  59:    */     {
/*  60: 63 */       a(paramwv, 64, 10, true);
/*  61:    */     }
/*  62: 64 */     else if ((paramwv instanceof EntityEnderEye))
/*  63:    */     {
/*  64: 65 */       a(paramwv, 64, 4, true);
/*  65:    */     }
/*  66: 66 */     else if ((paramwv instanceof ahs))
/*  67:    */     {
/*  68: 67 */       a(paramwv, 64, 10, true);
/*  69:    */     }
/*  70: 68 */     else if ((paramwv instanceof ahv))
/*  71:    */     {
/*  72: 69 */       a(paramwv, 64, 10, true);
/*  73:    */     }
/*  74: 70 */     else if ((paramwv instanceof ahu))
/*  75:    */     {
/*  76: 71 */       a(paramwv, 64, 10, true);
/*  77:    */     }
/*  78: 72 */     else if ((paramwv instanceof ahm))
/*  79:    */     {
/*  80: 73 */       a(paramwv, 64, 10, true);
/*  81:    */     }
/*  82: 74 */     else if ((paramwv instanceof EntityItem))
/*  83:    */     {
/*  84: 75 */       a(paramwv, 64, 20, true);
/*  85:    */     }
/*  86: 76 */     else if ((paramwv instanceof adx))
/*  87:    */     {
/*  88: 77 */       a(paramwv, 80, 3, true);
/*  89:    */     }
/*  90: 78 */     else if ((paramwv instanceof adu))
/*  91:    */     {
/*  92: 79 */       a(paramwv, 80, 3, true);
/*  93:    */     }
/*  94: 80 */     else if ((paramwv instanceof EntitySquid))
/*  95:    */     {
/*  96: 81 */       a(paramwv, 64, 3, true);
/*  97:    */     }
/*  98: 82 */     else if ((paramwv instanceof EntityWither))
/*  99:    */     {
/* 100: 83 */       a(paramwv, 80, 3, false);
/* 101:    */     }
/* 102: 84 */     else if ((paramwv instanceof EntityBat))
/* 103:    */     {
/* 104: 85 */       a(paramwv, 80, 3, false);
/* 105:    */     }
/* 106: 86 */     else if ((paramwv instanceof EntityEnderDragon))
/* 107:    */     {
/* 108: 87 */       a(paramwv, 160, 3, true);
/* 109:    */     }
/* 110: 88 */     else if ((paramwv instanceof wt))
/* 111:    */     {
/* 112: 89 */       a(paramwv, 80, 3, true);
/* 113:    */     }
/* 114: 90 */     else if ((paramwv instanceof aek))
/* 115:    */     {
/* 116: 91 */       a(paramwv, 160, 10, true);
/* 117:    */     }
/* 118: 92 */     else if ((paramwv instanceof adv))
/* 119:    */     {
/* 120: 93 */       a(paramwv, 160, 20, true);
/* 121:    */     }
/* 122: 94 */     else if ((paramwv instanceof adj))
/* 123:    */     {
/* 124: 95 */       a(paramwv, 160, 2147483647, false);
/* 125:    */     }
/* 126: 96 */     else if ((paramwv instanceof EntityArmorStand))
/* 127:    */     {
/* 128: 97 */       a(paramwv, 160, 3, true);
/* 129:    */     }
/* 130: 98 */     else if ((paramwv instanceof xk))
/* 131:    */     {
/* 132: 99 */       a(paramwv, 160, 20, true);
/* 133:    */     }
/* 134:100 */     else if ((paramwv instanceof ada))
/* 135:    */     {
/* 136:101 */       a(paramwv, 256, 2147483647, false);
/* 137:    */     }
/* 138:    */   }
/* 139:    */   
/* 140:    */   public void a(Entity paramwv, int paramInt1, int paramInt2)
/* 141:    */   {
/* 142:106 */     a(paramwv, paramInt1, paramInt2, false);
/* 143:    */   }
/* 144:    */   
/* 145:    */   public void a(Entity paramwv, int paramInt1, int paramInt2, boolean paramBoolean)
/* 146:    */   {
/* 147:110 */     if (paramInt1 > this.e) {
/* 148:111 */       paramInt1 = this.e;
/* 149:    */     }
/* 150:    */     try
/* 151:    */     {
/* 152:115 */       if (this.d.b(paramwv.getID())) {
/* 153:116 */         throw new IllegalStateException("Entity is already tracked!");
/* 154:    */       }
/* 155:118 */       qy localqy = new qy(paramwv, paramInt1, paramInt2, paramBoolean);
/* 156:119 */       this.c.add(localqy);
/* 157:120 */       this.d.a(paramwv.getID(), localqy);
/* 158:121 */       localqy.b(this.b.playerList);
/* 159:    */     }
/* 160:    */     catch (Throwable localThrowable)
/* 161:    */     {
/* 162:123 */       b localb = net.minecraft.src.b.a(localThrowable, "Adding entity to track");
/* 163:124 */       j localj1 = localb.a("Entity To Track");
/* 164:    */       
/* 165:126 */       localj1.a("Tracking range", paramInt1 + " blocks");
/* 166:127 */       localj1.a("Update interval", new qo(this, paramInt2));
/* 167:    */       
/* 168:    */ 
/* 169:    */ 
/* 170:    */ 
/* 171:    */ 
/* 172:    */ 
/* 173:    */ 
/* 174:    */ 
/* 175:    */ 
/* 176:137 */       paramwv.a(localj1);
/* 177:    */       
/* 178:139 */       j localj2 = localb.a("Entity That Is Already Tracked");
/* 179:140 */       ((qy)this.d.a(paramwv.getID())).a.a(localj2);
/* 180:    */       try
/* 181:    */       {
/* 182:143 */         throw new u(localb);
/* 183:    */       }
/* 184:    */       catch (u localu)
/* 185:    */       {
/* 186:145 */         a.error("\"Silently\" catching entity tracking error.", localu);
/* 187:    */       }
/* 188:    */     }
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void b(Entity paramwv)
/* 192:    */   {
/* 193:151 */     if ((paramwv instanceof qw))
/* 194:    */     {
/* 195:152 */       qw localObject = (qw)paramwv;
/* 196:153 */       for (qy localqy : this.c) {
/* 197:154 */         localqy.a((qw)localObject);
/* 198:    */       }
/* 199:    */     }
/* 200:157 */     Object localObject = (qy)this.d.d(paramwv.getID());
/* 201:158 */     if (localObject != null)
/* 202:    */     {
/* 203:159 */       this.c.remove(localObject);
/* 204:160 */       ((qy)localObject).a();
/* 205:    */     }
/* 206:    */   }
/* 207:    */   
/* 208:    */   public void a()
/* 209:    */   {
/* 210:165 */     ArrayList localArrayList = Lists.newArrayList();
/* 211:166 */     for (Iterator localIterator1 = this.c.iterator(); localIterator1.hasNext();)
/* 212:    */     {
/* 213:166 */       qy localObject = (qy)localIterator1.next();
/* 214:167 */       ((qy)localObject).a(this.b.playerList);
/* 215:168 */       if ((((qy)localObject).n) && ((((qy)localObject).a instanceof qw))) {
/* 216:169 */         localArrayList.add((qw)((qy)localObject).a);
/* 217:    */       }
/* 218:    */     }
/* 219:    */     Object localObject;
/* 220:173 */     for (int i = 0; i < localArrayList.size(); i++)
/* 221:    */     {
/* 222:174 */       localObject = (qw)localArrayList.get(i);
/* 223:175 */       for (qy localqy : this.c) {
/* 224:176 */         if (localqy.a != localObject) {
/* 225:177 */           localqy.b((qw)localObject);
/* 226:    */         }
/* 227:    */       }
/* 228:    */     }
/* 229:    */   }
/* 230:    */   
/* 231:    */   public void a(qw paramqw)
/* 232:    */   {
/* 233:184 */     for (qy localqy : this.c) {
/* 234:185 */       if (localqy.a == paramqw) {
/* 235:186 */         localqy.b(this.b.playerList);
/* 236:    */       } else {
/* 237:188 */         localqy.b(paramqw);
/* 238:    */       }
/* 239:    */     }
/* 240:    */   }
/* 241:    */   
/* 242:    */   public void a(Entity paramwv, id paramid)
/* 243:    */   {
/* 244:194 */     qy localqy = (qy)this.d.a(paramwv.getID());
/* 245:195 */     if (localqy != null) {
/* 246:196 */       localqy.a(paramid);
/* 247:    */     }
/* 248:    */   }
/* 249:    */   
/* 250:    */   public void b(Entity paramwv, id paramid)
/* 251:    */   {
/* 252:201 */     qy localqy = (qy)this.d.a(paramwv.getID());
/* 253:202 */     if (localqy != null) {
/* 254:203 */       localqy.b(paramid);
/* 255:    */     }
/* 256:    */   }
/* 257:    */   
/* 258:    */   public void b(qw paramqw)
/* 259:    */   {
/* 260:208 */     for (qy localqy : this.c) {
/* 261:209 */       localqy.d(paramqw);
/* 262:    */     }
/* 263:    */   }
/* 264:    */   
/* 265:    */   public void a(qw paramqw, Chunk parambfh)
/* 266:    */   {
/* 267:214 */     for (qy localqy : this.c) {
/* 268:215 */       if ((localqy.a != paramqw) && (localqy.a.ae == parambfh.x) && (localqy.a.ag == parambfh.z)) {
/* 269:216 */         localqy.b(paramqw);
/* 270:    */       }
/* 271:    */     }
/* 272:    */   }
/* 273:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     qn
 * JD-Core Version:    0.7.0.1
 */