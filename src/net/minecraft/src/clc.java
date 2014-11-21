package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;

/*   2:    */ import java.util.Map;
/*   4:    */ 
/*   5:    */ public class clc
/*   6:    */ {
/*   7: 27 */   private final Map<Block,cxe> a = Maps.newIdentityHashMap();
/*   8: 28 */   private final cnd b = new cnd();
/*   9:    */   private final cxk c;
/*  10:    */   
/*  11:    */   public clc(cxk paramcxk)
/*  12:    */   {
/*  13: 32 */     this.c = paramcxk;
/*  14:    */     
/*  15: 34 */     d();
/*  16:    */   }
/*  17:    */   
/*  18:    */   public cnd a()
/*  19:    */   {
/*  20: 38 */     return this.b;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public cue a(Block parambec)
/*  24:    */   {
/*  25: 42 */     ProtoBlock localatr = parambec.getProto();
/*  26: 43 */     cxe localcxe = b(parambec);
/*  27: 44 */     if ((localcxe == null) || (localcxe == this.c.a()))
/*  28:    */     {
/*  29: 47 */       if ((localatr == BlockList.ax) || (localatr == BlockList.an) || (localatr == BlockList.ae) || (localatr == BlockList.cg) || (localatr == BlockList.cK) || (localatr == BlockList.cL)) {
/*  30: 48 */         return this.c.b().a("minecraft:blocks/planks_oak");
/*  31:    */       }
/*  32: 49 */       if (localatr == BlockList.bQ) {
/*  33: 50 */         return this.c.b().a("minecraft:blocks/obsidian");
/*  34:    */       }
/*  35: 51 */       if ((localatr == BlockList.flowingLava) || (localatr == BlockList.lava)) {
/*  36: 52 */         return this.c.b().a("minecraft:blocks/lava_still");
/*  37:    */       }
/*  38: 53 */       if ((localatr == BlockList.flowingWater) || (localatr == BlockList.water)) {
/*  39: 54 */         return this.c.b().a("minecraft:blocks/water_still");
/*  40:    */       }
/*  41: 55 */       if (localatr == BlockList.ce) {
/*  42: 56 */         return this.c.b().a("minecraft:blocks/soul_sand");
/*  43:    */       }
/*  44: 57 */       if (localatr == BlockList.barrier) {
/*  45: 58 */         return this.c.b().a("minecraft:items/barrier");
/*  46:    */       }
/*  47:    */     }
/*  48: 61 */     if (localcxe == null) {
/*  49: 62 */       localcxe = this.c.a();
/*  50:    */     }
/*  51: 64 */     return localcxe.e();
/*  52:    */   }
/*  53:    */   
/*  54:    */   public cxe b(Block parambec)
/*  55:    */   {
/*  56: 68 */     cxe localcxe = (cxe)this.a.get(parambec);
/*  57: 69 */     if (localcxe == null) {
/*  58: 70 */       localcxe = this.c.a();
/*  59:    */     }
/*  60: 73 */     return localcxe;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public cxk b()
/*  64:    */   {
/*  65: 77 */     return this.c;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void c()
/*  69:    */   {
/*  70: 81 */     this.a.clear();
/*  71: 82 */     for (Map.Entry<Block,cxl> localEntry : this.b.a().entrySet()) {
/*  72: 83 */       this.a.put(localEntry.getKey(), this.c.a(localEntry.getValue()));
/*  73:    */     }
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void a(ProtoBlock paramatr, cni paramcni)
/*  77:    */   {
/*  78: 88 */     this.b.a(paramatr, paramcni);
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void a(ProtoBlock... paramVarArgs)
/*  82:    */   {
/*  83: 92 */     this.b.a(paramVarArgs);
/*  84:    */   }
/*  85:    */   
/*  86:    */   private void d()
/*  87:    */   {
/*  88: 96 */     a(new ProtoBlock[] { BlockList.air, BlockList.flowingWater, BlockList.water, BlockList.flowingLava, BlockList.lava, BlockList.M, BlockList.ae, BlockList.bQ, BlockList.cg, BlockList.an, BlockList.ce, BlockList.endPortal, BlockList.barrier, BlockList.ax, BlockList.cL, BlockList.cK });
/*  89:    */     
/*  90:    */ 
/*  91:    */ 
/*  92:    */ 
/*  93:    */ 
/*  94:    */ 
/*  95:    */ 
/*  96:    */ 
/*  97:    */ 
/*  98:    */ 
/*  99:    */ 
/* 100:    */ 
/* 101:    */ 
/* 102:    */ 
/* 103:    */ 
/* 104:    */ 
/* 105:    */ 
/* 106:    */ 
/* 107:115 */     a(BlockList.stone, new cnh().a(bba.a).a());
/* 108:116 */     a(BlockList.cI, new cnh().a(azi.a).a());
/* 109:117 */     a(BlockList.leaves, new cnh().a(ayp.P).a("_leaves").a(new IBlockData[] { BlockLeaves.b, BlockLeaves.a }).a());
/* 110:118 */     a(BlockList.leaves2, new cnh().a(ayg.P).a("_leaves").a(new IBlockData[] { BlockLeaves.b, BlockLeaves.a }).a());
/* 111:119 */     a(BlockList.cactus, new cnh().a(new IBlockData[] { auf.a }).a());
/* 112:120 */     a(BlockList.reeds, new cnh().a(new IBlockData[] { azy.a }).a());
/* 113:121 */     a(BlockList.aN, new cnh().a(new IBlockData[] { axc.a }).a());
/* 114:122 */     a(BlockList.bX, new cnh().a(new IBlockData[] { auo.a }).a());
/* 115:123 */     a(BlockList.bZ, new cnh().a(bbx.P).a("_wall").a());
/* 116:124 */     a(BlockList.cF, new cnh().a(avi.a).a());
/* 117:125 */     a(BlockList.bo, new cnh().a(new IBlockData[] { avw.b }).a());
/* 118:126 */     a(BlockList.bp, new cnh().a(new IBlockData[] { avw.b }).a());
/* 119:127 */     a(BlockList.bq, new cnh().a(new IBlockData[] { avw.b }).a());
/* 120:128 */     a(BlockList.br, new cnh().a(new IBlockData[] { avw.b }).a());
/* 121:129 */     a(BlockList.bs, new cnh().a(new IBlockData[] { avw.b }).a());
/* 122:130 */     a(BlockList.bt, new cnh().a(new IBlockData[] { avw.b }).a());
/* 123:131 */     a(BlockList.tripwire, new cnh().a(new IBlockData[] { bbs.N, bbs.a }).a());
/* 124:132 */     a(BlockList.bL, new cnh().a(ayw.a).a("_double_slab").a());
/* 125:133 */     a(BlockList.bM, new cnh().a(ayw.a).a("_slab").a());
/* 126:134 */     a(BlockList.W, new cnh().a(new IBlockData[] { bbk.a }).a());
/* 127:135 */     a(BlockList.fire, new cnh().a(new IBlockData[] { BlockFire.age }).a());
/* 128:136 */     a(BlockList.af, new cnh().a(new IBlockData[] { azt.O }).a());
/* 129:137 */     a(BlockList.ao, new cnh().a(new IBlockData[] { BlockDoor.N }).a());
/* 130:138 */     a(BlockList.ap, new cnh().a(new IBlockData[] { BlockDoor.N }).a());
/* 131:139 */     a(BlockList.aq, new cnh().a(new IBlockData[] { BlockDoor.N }).a());
/* 132:140 */     a(BlockList.ar, new cnh().a(new IBlockData[] { BlockDoor.N }).a());
/* 133:141 */     a(BlockList.as, new cnh().a(new IBlockData[] { BlockDoor.N }).a());
/* 134:142 */     a(BlockList.at, new cnh().a(new IBlockData[] { BlockDoor.N }).a());
/* 135:143 */     a(BlockList.aA, new cnh().a(new IBlockData[] { BlockDoor.N }).a());
/* 136:144 */     a(BlockList.wool, new cnh().a(aun.a).a("_wool").a());
/* 137:145 */     a(BlockList.cy, new cnh().a(aun.a).a("_carpet").a());
/* 138:146 */     a(BlockList.cu, new cnh().a(aun.a).a("_stained_hardened_clay").a());
/* 139:147 */     a(BlockList.stainedGlassPane, new cnh().a(aun.a).a("_stained_glass_pane").a());
/* 140:148 */     a(BlockList.cG, new cnh().a(aun.a).a("_stained_glass").a());
/* 141:149 */     a(BlockList.A, new cnh().a(bad.a).a());
/* 142:150 */     a(BlockList.cM, new cnh().a(azq.a).a());
/* 143:151 */     a(BlockList.tallgrass, new cnh().a(bbh.a).a());
/* 144:152 */     a(BlockList.C, new cnh().a(new IBlockData[] { atp.b }).a());
/* 145:153 */     a(BlockList.yellowFlower, new cnh().a(BlockList.yellowFlower.l()).a());
/* 146:154 */     a(BlockList.redFlower, new cnh().a(BlockList.redFlower.l()).a());
/* 147:155 */     a(BlockList.U, new cnh().a(bbf.M).a("_slab").a());
/* 148:156 */     a(BlockList.cP, new cnh().a(ayl.M).a("_slab").a());
/* 149:157 */     a(BlockList.monsterEgg, new cnh().a(axs.a).a("_monster_egg").a());
/* 150:158 */     a(BlockList.bf, new cnh().a(bbc.a).a());
/* 151:159 */     a(BlockList.z, new cnh().a(new IBlockData[] { ave.b }).a());
/* 152:160 */     a(BlockList.ct, new cnh().a(new IBlockData[] { avm.b }).a());
/* 153:161 */     a(BlockList.log, new cnh().a(ayr.b).a("_log").a());
/* 154:162 */     a(BlockList.log2, new cnh().a(ayi.b).a("_log").a());
/* 155:163 */     a(BlockList.planks, new cnh().a(ayw.a).a("_planks").a());
/* 156:164 */     a(BlockList.sapling, new cnh().a(baf.a).a("_sapling").a());
/* 157:165 */     a(BlockList.sand, new cnh().a(BlockSand.a).a());
/* 158:166 */     a(BlockList.cp, new cnh().a(new IBlockData[] { BlockHopper.b }).a());
/* 159:167 */     a(BlockList.ca, new cnh().a(new IBlockData[] { awd.a }).a());
/* 160:    */     
/* 161:169 */     a(BlockList.cq, new cld(this));
/* 162:    */     
/* 163:    */ 
/* 164:    */ 
/* 165:    */ 
/* 166:    */ 
/* 167:    */ 
/* 168:    */ 
/* 169:    */ 
/* 170:    */ 
/* 171:    */ 
/* 172:    */ 
/* 173:    */ 
/* 174:    */ 
/* 175:    */ 
/* 176:    */ 
/* 177:    */ 
/* 178:    */ 
/* 179:    */ 
/* 180:    */ 
/* 181:189 */     a(BlockList.deadbush, new cle(this));
/* 182:    */     
/* 183:    */ 
/* 184:    */ 
/* 185:    */ 
/* 186:    */ 
/* 187:    */ 
/* 188:196 */     a(BlockList.bl, new clf(this));
/* 189:    */     
/* 190:    */ 
/* 191:    */ 
/* 192:    */ 
/* 193:    */ 
/* 194:    */ 
/* 195:    */ 
/* 196:    */ 
/* 197:    */ 
/* 198:    */ 
/* 199:    */ 
/* 200:208 */     a(BlockList.bm, new clg(this));
/* 201:    */     
/* 202:    */ 
/* 203:    */ 
/* 204:    */ 
/* 205:    */ 
/* 206:    */ 
/* 207:    */ 
/* 208:    */ 
/* 209:    */ 
/* 210:    */ 
/* 211:    */ 
/* 212:220 */     a(BlockList.dirt, new clh(this));
/* 213:    */     
/* 214:    */ 
/* 215:    */ 
/* 216:    */ 
/* 217:    */ 
/* 218:    */ 
/* 219:    */ 
/* 220:    */ 
/* 221:    */ 
/* 222:    */ 
/* 223:    */ 
/* 224:    */ 
/* 225:    */ 
/* 226:234 */     a(BlockList.T, new cli(this));
/* 227:    */     
/* 228:    */ 
/* 229:    */ 
/* 230:    */ 
/* 231:    */ 
/* 232:    */ 
/* 233:    */ 
/* 234:    */ 
/* 235:    */ 
/* 236:    */ 
/* 237:    */ 
/* 238:    */ 
/* 239:247 */     a(BlockList.cO, new clj(this));
/* 240:    */   }
/* 241:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     clc
 * JD-Core Version:    0.7.0.1
 */