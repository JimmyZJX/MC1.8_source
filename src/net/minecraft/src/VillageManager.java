package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   4:    */ 
/*   5:    */ public class VillageManager
/*   6:    */   extends bqc
/*   7:    */ {
/*   8:    */   private World world;
/*   9: 25 */   private final List<BlockPosition> c = Lists.newArrayList();
/*  10: 26 */   private final List<VillageDoor> d = Lists.newArrayList();
/*  11: 27 */   private final List<Village> villages = Lists.newArrayList();
/*  12:    */   private int f;
/*  13:    */   
/*  14:    */   public VillageManager(String paramString)
/*  15:    */   {
/*  16: 31 */     super(paramString);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public VillageManager(World world)
/*  20:    */   {
/*  21: 35 */     super(a(world.t));
/*  22: 36 */     this.world = world;
/*  23: 37 */     c();
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void setWorld(World paramaqu)
/*  27:    */   {
/*  28: 41 */     this.world = paramaqu;
/*  29: 43 */     for (Village village : this.villages) {
/*  30: 44 */       village.setWorld(paramaqu);
/*  31:    */     }
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void a(BlockPosition paramdt)
/*  35:    */   {
/*  36: 49 */     if (this.c.size() > 64) {
/*  37: 50 */       return;
/*  38:    */     }
/*  39: 52 */     if (!e(paramdt)) {
/*  40: 53 */       this.c.add(paramdt);
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void a()
/*  45:    */   {
/*  46: 58 */     this.f += 1;
/*  47: 59 */     for (Village village : this.villages) {
/*  48: 60 */       village.a(this.f);
/*  49:    */     }
/*  50: 62 */     e();
/*  51: 63 */     f();
/*  52: 64 */     g();
/*  53: 66 */     if (this.f % 400 == 0) {
/*  54: 67 */       c();
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   private void e()
/*  59:    */   {
/*  60: 72 */     for (Iterator<Village> it = this.villages.iterator(); it.hasNext();)
/*  61:    */     {
/*  62: 73 */       Village village = it.next();
/*  63: 74 */       if (village.g())
/*  64:    */       {
/*  65: 75 */         it.remove();
/*  66: 76 */         c();
/*  67:    */       }
/*  68:    */     }
/*  69:    */   }
/*  70:    */   
/*  71:    */   public List<Village> getVillages()
/*  72:    */   {
/*  73: 82 */     return this.villages;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public Village getNearestVillage(BlockPosition pos, int paramInt)
/*  77:    */   {
/*  78: 86 */     Village res = null;
/*  79: 87 */     double min = 3.402823466385289E+038D;
/*  80: 88 */     for (Village village : this.villages)
/*  81:    */     {
/*  82: 89 */       double dist2 = village.a().dist2(pos);
/*  83: 90 */       if (dist2 < min)
/*  84:    */       {
/*  85: 94 */         float f1 = paramInt + village.b();
/*  86: 95 */         if (dist2 <= f1 * f1)
/*  87:    */         {
/*  88: 99 */           res = village;
/*  89:100 */           min = dist2;
/*  90:    */         }
/*  91:    */       }
/*  92:    */     }
/*  93:102 */     return res;
/*  94:    */   }
/*  95:    */   
/*  96:    */   private void f()
/*  97:    */   {
/*  98:106 */     if (this.c.isEmpty()) {
/*  99:107 */       return;
/* 100:    */     }
/* 101:109 */     b((BlockPosition)this.c.remove(0));
/* 102:    */   }
/* 103:    */   
/* 104:    */   private void g()
/* 105:    */   {
/* 106:114 */     for (int i = 0; i < this.d.size(); i++)
/* 107:    */     {
/* 108:115 */       VillageDoor localabh = this.d.get(i);
/* 109:116 */       Village village = getNearestVillage(localabh.d(), 32);
/* 110:117 */       if (village == null)
/* 111:    */       {
/* 112:119 */         village = new Village(this.world);
/* 113:120 */         this.villages.add(village);
/* 114:121 */         c();
/* 115:    */       }
/* 116:123 */       village.a(localabh);
/* 117:    */     }
/* 118:126 */     this.d.clear();
/* 119:    */   }
/* 120:    */   
/* 121:    */   private void b(BlockPosition paramdt)
/* 122:    */   {
/* 123:130 */     int i = 16;int j = 4;int k = 16;
/* 124:131 */     for (int m = -i; m < i; m++) {
/* 125:132 */       for (int n = -j; n < j; n++) {
/* 126:133 */         for (int i1 = -k; i1 < k; i1++)
/* 127:    */         {
/* 128:134 */           BlockPosition localdt = paramdt.offset(m, n, i1);
/* 129:135 */           if (f(localdt))
/* 130:    */           {
/* 131:136 */             VillageDoor localabh = c(localdt);
/* 132:137 */             if (localabh == null) {
/* 133:138 */               d(localdt);
/* 134:    */             } else {
/* 135:140 */               localabh.a(this.f);
/* 136:    */             }
/* 137:    */           }
/* 138:    */         }
/* 139:    */       }
/* 140:    */     }
/* 141:    */   }
/* 142:    */   
/* 143:    */   private VillageDoor c(BlockPosition paramdt)
/* 144:    */   {
/* 145:149 */     for (Iterator<VillageDoor> localIterator = this.d.iterator(); localIterator.hasNext();)
/* 146:    */     {
/* 147:149 */       VillageDoor localObject = (VillageDoor)localIterator.next();
/* 148:150 */       if ((((VillageDoor)localObject).d().getX() == paramdt.getX()) && (((VillageDoor)localObject).d().getZ() == paramdt.getZ()) && (Math.abs(((VillageDoor)localObject).d().getY() - paramdt.getY()) <= 1)) {
/* 149:151 */         return localObject;
/* 150:    */       }
/* 151:    */     }
/* 152:    */     Object localObject;
/* 153:154 */     for (Iterator<Village> localIterator = this.villages.iterator(); localIterator.hasNext();)
/* 154:    */     {
/* 155:154 */       localObject = (Village)localIterator.next();
/* 156:155 */       VillageDoor localabh = ((Village)localObject).e(paramdt);
/* 157:156 */       if (localabh != null) {
/* 158:157 */         return localabh;
/* 159:    */       }
/* 160:    */     }
/* 161:160 */     return null;
/* 162:    */   }
/* 163:    */   
/* 164:    */   private void d(BlockPosition paramdt)
/* 165:    */   {
/* 166:164 */     EnumDirection localej1 = avf.h(this.world, paramdt);
/* 167:165 */     EnumDirection localej2 = localej1.d();
/* 168:    */     
/* 169:167 */     int i = a(paramdt, localej1, 5);
/* 170:168 */     int j = a(paramdt, localej2, i + 1);
/* 171:170 */     if (i != j) {
/* 172:171 */       this.d.add(new VillageDoor(paramdt, i < j ? localej1 : localej2, this.f));
/* 173:    */     }
/* 174:    */   }
/* 175:    */   
/* 176:    */   private int a(BlockPosition paramdt, EnumDirection paramej, int paramInt)
/* 177:    */   {
/* 178:176 */     int i = 0;
/* 179:177 */     for (int j = 1; j <= 5; j++) {
/* 180:178 */       if (this.world.i(paramdt.a(paramej, j)))
/* 181:    */       {
/* 182:180 */         i++;
/* 183:180 */         if (i >= paramInt) {
/* 184:181 */           return i;
/* 185:    */         }
/* 186:    */       }
/* 187:    */     }
/* 188:186 */     return i;
/* 189:    */   }
/* 190:    */   
/* 191:    */   private boolean e(BlockPosition paramdt)
/* 192:    */   {
/* 193:190 */     for (BlockPosition localdt : this.c) {
/* 194:191 */       if (localdt.equals(paramdt)) {
/* 195:192 */         return true;
/* 196:    */       }
/* 197:    */     }
/* 198:195 */     return false;
/* 199:    */   }
/* 200:    */   
/* 201:    */   private boolean f(BlockPosition paramdt)
/* 202:    */   {
/* 203:199 */     ProtoBlock localatr = this.world.getBlock(paramdt).getProto();
/* 204:200 */     if ((localatr instanceof avf)) {
/* 205:201 */       return localatr.getMaterial() == Material.d;
/* 206:    */     }
/* 207:203 */     return false;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public void readFromNBT(NBTTagCompound tag)
/* 211:    */   {
/* 212:208 */     this.f = tag.getInteger("Tick");
/* 213:209 */     fv localfv = tag.c("Villages", 10);
/* 214:210 */     for (int i = 0; i < localfv.c(); i++)
/* 215:    */     {
/* 216:211 */       NBTTagCompound localfn = localfv.b(i);
/* 217:212 */       Village village = new Village();
/* 218:213 */       village.readFromNBT(localfn);
/* 219:214 */       this.villages.add(village);
/* 220:    */     }
/* 221:    */   }
/* 222:    */   
/* 223:    */   public void writeToNBT(NBTTagCompound tag)
/* 224:    */   {
/* 225:220 */     tag.setInt("Tick", this.f);
/* 226:221 */     fv localfv = new fv();
/* 227:222 */     for (Village localabi : this.villages)
/* 228:    */     {
/* 229:223 */       NBTTagCompound localfn = new NBTTagCompound();
/* 230:224 */       localabi.writeToNBT(localfn);
/* 231:225 */       localfv.a(localfn);
/* 232:    */     }
/* 233:227 */     tag.setNBT("Villages", localfv);
/* 234:    */   }
/* 235:    */   
/* 236:    */   public static String a(bgd parambgd)
/* 237:    */   {
/* 238:231 */     return "villages" + parambgd.l();
/* 239:    */   }
/* 240:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abl
 * JD-Core Version:    0.7.0.1
 */