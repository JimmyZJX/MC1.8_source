package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ import org.apache.logging.log4j.LogManager;
/*   4:    */ import org.apache.logging.log4j.Logger;
/*   5:    */ 
/*   6:    */ public abstract class bcm
/*   7:    */ {
/*   8: 21 */   private static final Logger a = LogManager.getLogger();
/*   9: 22 */   private static Map<String,Class<? extends bcm>> idToClassMapping = Maps.newHashMap();
/*  10: 23 */   private static Map<Class<? extends bcm>,String> classToIDMapping = Maps.newHashMap();
/*  11:    */   protected World world;
/*  12:    */   
/*  13:    */   private static void a(Class<? extends bcm> paramClass, String paramString)
/*  14:    */   {
/*  15: 26 */     if (idToClassMapping.containsKey(paramString)) {
/*  16: 27 */       throw new IllegalArgumentException("Duplicate id: " + paramString);
/*  17:    */     }
/*  18: 29 */     idToClassMapping.put(paramString, paramClass);
/*  19: 30 */     classToIDMapping.put(paramClass, paramString);
/*  20:    */   }
/*  21:    */   
/*  22:    */   static
/*  23:    */   {
/*  24: 34 */     a(bdc.class, "Furnace");
/*  25: 35 */     a(bcr.class, "Chest");
/*  26: 36 */     a(bda.class, "EnderChest");
/*  27: 37 */     a(axd.class, "RecordPlayer");
/*  28: 38 */     a(bcx.class, "Trap");
/*  29: 39 */     a(bcy.class, "Dropper");
/*  30: 40 */     a(bdj.class, "Sign");
/*  31: 41 */     a(bdg.class, "MobSpawner");
/*  32: 42 */     a(bdi.class, "Music");
/*  33: 43 */     a(bdv.class, "Piston");
/*  34: 44 */     a(bcq.class, "Cauldron");
/*  35: 45 */     a(bcz.class, "EnchantTable");
/*  36: 46 */     a(bdn.class, "Airportal");
/*  37: 47 */     a(bct.class, "Control");
/*  38: 48 */     a(bck.class, "Beacon");
/*  39: 49 */     a(bdm.class, "Skull");
/*  40: 50 */     a(bcw.class, "DLDetector");
/*  41: 51 */     a(bde.class, "Hopper");
/*  42: 52 */     a(bcv.class, "Comparator");
/*  43: 53 */     a(bdb.class, "FlowerPot");
/*  44: 54 */     a(bci.class, "Banner");
/*  45:    */   }
/*  46:    */   
/*  47: 58 */   protected BlockPosition pos = BlockPosition.zero;
/*  48:    */   protected boolean d;
/*  49: 61 */   private int data = -1;
/*  50:    */   protected ProtoBlock e;
/*  51:    */   
/*  52:    */   public World z()
/*  53:    */   {
/*  54: 65 */     return this.world;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void a(World paramaqu)
/*  58:    */   {
/*  59: 69 */     this.world = paramaqu;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public boolean t()
/*  63:    */   {
/*  64: 73 */     return this.world != null;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void readFromNBT(NBTTagCompound paramfn)
/*  68:    */   {
/*  69: 77 */     this.pos = new BlockPosition(paramfn.getInteger("x"), paramfn.getInteger("y"), paramfn.getInteger("z"));
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void writeToNBT(NBTTagCompound paramfn)
/*  73:    */   {
/*  74: 81 */     String str = classToIDMapping.get(getClass());
/*  75: 82 */     if (str == null) {
/*  76: 83 */       throw new RuntimeException(getClass() + " is missing a mapping! This is a bug!");
/*  77:    */     }
/*  78: 85 */     paramfn.setString("id", str);
/*  79: 86 */     paramfn.setInt("x", this.pos.getX());
/*  80: 87 */     paramfn.setInt("y", this.pos.getY());
/*  81: 88 */     paramfn.setInt("z", this.pos.getZ());
/*  82:    */   }
/*  83:    */   
/*  84:    */   public static bcm fromNBT(NBTTagCompound paramfn)
/*  85:    */   {
/*  86: 92 */     bcm localbcm = null;
/*  87:    */     try
/*  88:    */     {
/*  89: 94 */       Class<? extends bcm> localClass = idToClassMapping.get(paramfn.getString("id"));
/*  90: 95 */       if (localClass != null) {
/*  91: 96 */         localbcm = localClass.newInstance();
/*  92:    */       }
/*  93:    */     }
/*  94:    */     catch (Exception localException)
/*  95:    */     {
/*  96: 99 */       localException.printStackTrace();
/*  97:    */     }
/*  98:101 */     if (localbcm != null) {
/*  99:102 */       localbcm.readFromNBT(paramfn);
/* 100:    */     } else {
/* 101:104 */       a.warn("Skipping BlockEntity with id " + paramfn.getString("id"));
/* 102:    */     }
/* 103:106 */     return localbcm;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public int getData()
/* 107:    */   {
/* 108:110 */     if (this.data == -1)
/* 109:    */     {
/* 110:111 */       Block localbec = this.world.getBlock(this.pos);
/* 111:112 */       this.data = localbec.getProto().c(localbec);
/* 112:    */     }
/* 113:114 */     return this.data;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void o_()
/* 117:    */   {
/* 118:122 */     if (this.world != null)
/* 119:    */     {
/* 120:123 */       Block localbec = this.world.getBlock(this.pos);
/* 121:124 */       this.data = localbec.getProto().c(localbec);
/* 122:125 */       this.world.b(this.pos, this);
/* 123:127 */       if (w() != BlockList.air) {
/* 124:128 */         this.world.e(this.pos, w());
/* 125:    */       }
/* 126:    */     }
/* 127:    */   }
/* 128:    */   
/* 129:    */   public double a(double paramDouble1, double paramDouble2, double paramDouble3)
/* 130:    */   {
/* 131:134 */     double d1 = this.pos.getX() + 0.5D - paramDouble1;
/* 132:135 */     double d2 = this.pos.getY() + 0.5D - paramDouble2;
/* 133:136 */     double d3 = this.pos.getZ() + 0.5D - paramDouble3;
/* 134:137 */     return d1 * d1 + d2 * d2 + d3 * d3;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public double s()
/* 138:    */   {
/* 139:141 */     return 4096.0D;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public BlockPosition v()
/* 143:    */   {
/* 144:145 */     return this.pos;
/* 145:    */   }
/* 146:    */   
/* 147:    */   public ProtoBlock w()
/* 148:    */   {
/* 149:151 */     if (this.e == null) {
/* 150:152 */       this.e = this.world.getBlock(this.pos).getProto();
/* 151:    */     }
/* 152:154 */     return this.e;
/* 153:    */   }
/* 154:    */   
/* 155:    */   public id x_()
/* 156:    */   {
/* 157:158 */     return null;
/* 158:    */   }
/* 159:    */   
/* 160:    */   public boolean x()
/* 161:    */   {
/* 162:162 */     return this.d;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public void y()
/* 166:    */   {
/* 167:166 */     this.d = true;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void D()
/* 171:    */   {
/* 172:170 */     this.d = false;
/* 173:    */   }
/* 174:    */   
/* 175:    */   public boolean c(int paramInt1, int paramInt2)
/* 176:    */   {
/* 177:174 */     return false;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void E()
/* 181:    */   {
/* 182:178 */     this.e = null;
/* 183:179 */     this.data = -1;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void a(j paramj)
/* 187:    */   {
/* 188:183 */     paramj.a("Name", new bcn(this));
/* 189:190 */     if (this.world == null) {
/* 190:191 */       return;
/* 191:    */     }
/* 192:194 */     j.a(paramj, this.pos, w(), getData());
/* 193:    */     
/* 194:196 */     paramj.a("Actual block type", new bco(this));
/* 195:    */     
/* 196:    */ 
/* 197:    */ 
/* 198:    */ 
/* 199:    */ 
/* 200:    */ 
/* 201:    */ 
/* 202:    */ 
/* 203:    */ 
/* 204:    */ 
/* 205:    */ 
/* 206:208 */     paramj.a("Actual block data value", new bcp(this));
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void setPos(BlockPosition pos)
/* 210:    */   {
/* 211:225 */     this.pos = pos;
/* 212:    */   }
				static Map<Class<? extends bcm>,String> F() {return classToIDMapping;}
/* 213:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcm
 * JD-Core Version:    0.7.0.1
 */