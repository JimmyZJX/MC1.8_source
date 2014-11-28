package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   4:    */ 
/*   5:    */ public class VillageManager
/*   6:    */   extends bqc
/*   7:    */ {
/*   8:    */   private World world;
/*   9: 25 */   private final List<BlockPosition> villagerPosQueue = Lists.newArrayList();
/*  10: 26 */   private final List<VillageDoor> availableDoors = Lists.newArrayList();
/*  11: 27 */   private final List<Village> villages = Lists.newArrayList();
/*  12:    */   private int tick;
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
/*  34:    */   public void queueVillager(BlockPosition paramdt)
/*  35:    */   {
/*  36: 49 */     if (this.villagerPosQueue.size() > 64) {
/*  37: 50 */       return;
/*  38:    */     }
/*  39: 52 */     if (!isInQueue(paramdt)) {
/*  40: 53 */       this.villagerPosQueue.add(paramdt);
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void tick()
/*  45:    */   {
/*  46: 58 */     this.tick += 1;
/*  47: 59 */     for (Village village : this.villages) {
/*  48: 60 */       village.tick(this.tick);
/*  49:    */     }
/*  50: 62 */     removeDeadVillages();
/*  51: 63 */     tickVillagerPosQueue();
/*  52: 64 */     analyzeDoors();
/*  53: 66 */     if (this.tick % 400 == 0) {
/*  54: 67 */       c();
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   private void removeDeadVillages()
/*  59:    */   {
/*  60: 72 */     for (Iterator<Village> it = this.villages.iterator(); it.hasNext();)
/*  61:    */     {
/*  62: 73 */       Village village = it.next();
/*  63: 74 */       if (village.isDead())
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
/*  76:    */   public Village getNearestVillage(BlockPosition pos, int dist)
/*  77:    */   {
/*  78: 86 */     Village res = null;
/*  79: 87 */     double min = 3.402823466385289E+038D;
/*  80: 88 */     for (Village village : this.villages)
/*  81:    */     {
/*  82: 89 */       double dist2 = village.getCenter().dist2(pos);
/*  83: 90 */       if (dist2 < min)
/*  84:    */       {
/*  85: 94 */         float f1 = dist + village.getRadius();
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
/*  96:    */   private void tickVillagerPosQueue()
/*  97:    */   {
/*  98:106 */     if (this.villagerPosQueue.isEmpty()) {
/*  99:107 */       return;
/* 100:    */     }
/* 101:109 */     checkVillager(this.villagerPosQueue.remove(0));
/* 102:    */   }
/* 103:    */   
/* 104:    */   private void analyzeDoors()
/* 105:    */   {
/* 106:114 */     for (int i = 0; i < this.availableDoors.size(); i++)
/* 107:    */     {
/* 108:115 */       VillageDoor door = this.availableDoors.get(i);
/* 109:116 */       Village village = getNearestVillage(door.getPos(), 32);
/* 110:117 */       if (village == null)
/* 111:    */       {
/* 112:119 */         village = new Village(this.world);
/* 113:120 */         this.villages.add(village);
/* 114:121 */         c();
/* 115:    */       }
/* 116:123 */       village.addDoor(door);
/* 117:    */     }
/* 118:126 */     this.availableDoors.clear();
/* 119:    */   }
/* 120:    */   
/* 121:    */   private void checkVillager(BlockPosition pos)
/* 122:    */   {
/* 123:130 */     int dxMax = 16;int dyMax = 4;int dzMax = 16;
/* 124:131 */     for (int dx = -dxMax; dx < dxMax; dx++) {
/* 125:132 */       for (int dy = -dyMax; dy < dyMax; dy++) {
/* 126:133 */         for (int dz = -dzMax; dz < dzMax; dz++)
/* 127:    */         {
/* 128:134 */           BlockPosition doorPos = pos.offset(dx, dy, dz);
/* 129:135 */           if (isWoodenDoor(doorPos))
/* 130:    */           {
/* 131:136 */             VillageDoor door = findDoor(doorPos);
/* 132:137 */             if (door == null) {
/* 133:138 */               tryAddDoor(doorPos);
/* 134:    */             } else {
/* 135:140 */               door.confirm(this.tick);
/* 136:    */             }
/* 137:    */           }
/* 138:    */         }
/* 139:    */       }
/* 140:    */     }
/* 141:    */   }
/* 142:    */   
/* 143:    */   private VillageDoor findDoor(BlockPosition pos)
/* 144:    */   {
/* 145:149 */     for (Iterator<VillageDoor> it = this.availableDoors.iterator(); it.hasNext();)
/* 146:    */     {
/* 147:149 */       VillageDoor door = it.next();
/* 148:150 */       if ((door.getPos().getX() == pos.getX()) && (door.getPos().getZ() == pos.getZ()) && (Math.abs(door.getPos().getY() - pos.getY()) <= 1)) {
/* 149:151 */         return door;
/* 150:    */       }
/* 151:    */     }
/* 152:    */     
/* 153:154 */     for (Iterator<Village> it = this.villages.iterator(); it.hasNext();)
/* 154:    */     {
/* 155:154 */       Village village = it.next();
/* 156:155 */       VillageDoor door = village.getDoor(pos);
/* 157:156 */       if (door != null) {
/* 158:157 */         return door;
/* 159:    */       }
/* 160:    */     }
/* 161:160 */     return null;
/* 162:    */   }
/* 163:    */   
/* 164:    */   private void tryAddDoor(BlockPosition pos)
/* 165:    */   {
/* 166:164 */     EnumDirection dir = BlockDoor.h(this.world, pos);
/* 167:165 */     EnumDirection dir2 = dir.opposite();
/* 168:    */     
/* 169:167 */     int i = countOutsideBlocks(pos, dir, 5);
/* 170:168 */     int j = countOutsideBlocks(pos, dir2, i + 1);
/* 171:170 */     if (i != j) {
/* 172:171 */       this.availableDoors.add(new VillageDoor(pos, i < j ? dir : dir2, this.tick));
/* 173:    */     }
/* 174:    */   }
/* 175:    */   
/* 176:    */   private int countOutsideBlocks(BlockPosition pos, EnumDirection dir, int max)
/* 177:    */   {
/* 178:176 */     int i = 0;
/* 179:177 */     for (int j = 1; j <= 5; j++) {
/* 180:178 */       if (this.world.hasDaylight(pos.offset(dir, j)))
/* 181:    */       {
/* 182:180 */         i++;
/* 183:180 */         if (i >= max) {
/* 184:181 */           return i;
/* 185:    */         }
/* 186:    */       }
/* 187:    */     }
/* 188:186 */     return i;
/* 189:    */   }
/* 190:    */   
/* 191:    */   private boolean isInQueue(BlockPosition pos)
/* 192:    */   {
/* 193:190 */     for (BlockPosition pos1 : this.villagerPosQueue) {
/* 194:191 */       if (pos1.equals(pos)) {
/* 195:192 */         return true;
/* 196:    */       }
/* 197:    */     }
/* 198:195 */     return false;
/* 199:    */   }
/* 200:    */   
/* 201:    */   private boolean isWoodenDoor(BlockPosition pos)
/* 202:    */   {
/* 203:199 */     ProtoBlock block = this.world.getBlock(pos).getProto();
/* 204:200 */     if ((block instanceof BlockDoor)) {
/* 205:201 */       return block.getMaterial() == Material.wood;
/* 206:    */     }
/* 207:203 */     return false;
/* 208:    */   }
/* 209:    */   
/* 210:    */   public void readFromNBT(NBTTagCompound tag)
/* 211:    */   {
/* 212:208 */     this.tick = tag.getInteger("Tick");
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
/* 225:220 */     tag.setInt("Tick", this.tick);
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