package net.minecraft.src;
/*   1:    */ public class bpy
/*   2:    */   extends bpu
/*   3:    */ {
/*   4:    */   private boolean f;
/*   5:    */   private boolean g;
/*   6:    */   private boolean h;
/*   7:    */   private boolean i;
/*   8:    */   private boolean j;
/*   9:    */   
/*  10:    */   public void a(IBlockAccess paramard, Entity paramwv)
/*  11:    */   {
/*  12: 27 */     super.a(paramard, paramwv);
/*  13: 28 */     this.j = this.h;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void a()
/*  17:    */   {
/*  18: 33 */     super.a();
/*  19: 34 */     this.h = this.j;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public bpt a(Entity paramwv)
/*  23:    */   {
/*  24:    */     int k;
/*  25: 41 */     if ((this.i) && (paramwv.V()))
/*  26:    */     {
/*  27: 42 */       k = (int)paramwv.getAABB().minY;
/*  28: 43 */       ProtoBlock localatr = this.a.getBlock(new BlockPosition(MathUtils.floor(paramwv.xPos), k, MathUtils.floor(paramwv.zPos))).getProto();
/*  29: 44 */       while ((localatr == BlockList.flowingWater) || (localatr == BlockList.water))
/*  30:    */       {
/*  31: 45 */         k++;
/*  32: 46 */         localatr = this.a.getBlock(new BlockPosition(MathUtils.floor(paramwv.xPos), k, MathUtils.floor(paramwv.zPos))).getProto();
/*  33:    */       }
/*  34: 48 */       this.h = false;
/*  35:    */     }
/*  36:    */     else
/*  37:    */     {
/*  38: 50 */       k = MathUtils.floor(paramwv.getAABB().minY + 0.5D);
/*  39:    */     }
/*  40: 53 */     return a(MathUtils.floor(paramwv.getAABB().minX), k, MathUtils.floor(paramwv.getAABB().minZ));
/*  41:    */   }
/*  42:    */   
/*  43:    */   public bpt a(Entity paramwv, double paramDouble1, double paramDouble2, double paramDouble3)
/*  44:    */   {
/*  45: 58 */     return a(MathUtils.floor(paramDouble1 - paramwv.J / 2.0F), MathUtils.floor(paramDouble2), MathUtils.floor(paramDouble3 - paramwv.J / 2.0F));
/*  46:    */   }
/*  47:    */   
/*  48:    */   public int a(bpt[] paramArrayOfbpt, Entity paramwv, bpt parambpt1, bpt parambpt2, float paramFloat)
/*  49:    */   {
/*  50: 63 */     int k = 0;
/*  51:    */     
/*  52: 65 */     int m = 0;
/*  53: 66 */     if (a(paramwv, parambpt1.a, parambpt1.b + 1, parambpt1.c) == 1) {
/*  54: 67 */       m = 1;
/*  55:    */     }
/*  56: 70 */     bpt localbpt1 = a(paramwv, parambpt1.a, parambpt1.b, parambpt1.c + 1, m);
/*  57: 71 */     bpt localbpt2 = a(paramwv, parambpt1.a - 1, parambpt1.b, parambpt1.c, m);
/*  58: 72 */     bpt localbpt3 = a(paramwv, parambpt1.a + 1, parambpt1.b, parambpt1.c, m);
/*  59: 73 */     bpt localbpt4 = a(paramwv, parambpt1.a, parambpt1.b, parambpt1.c - 1, m);
/*  60: 75 */     if ((localbpt1 != null) && (!localbpt1.i) && (localbpt1.a(parambpt2) < paramFloat)) {
/*  61: 76 */       paramArrayOfbpt[(k++)] = localbpt1;
/*  62:    */     }
/*  63: 78 */     if ((localbpt2 != null) && (!localbpt2.i) && (localbpt2.a(parambpt2) < paramFloat)) {
/*  64: 79 */       paramArrayOfbpt[(k++)] = localbpt2;
/*  65:    */     }
/*  66: 81 */     if ((localbpt3 != null) && (!localbpt3.i) && (localbpt3.a(parambpt2) < paramFloat)) {
/*  67: 82 */       paramArrayOfbpt[(k++)] = localbpt3;
/*  68:    */     }
/*  69: 84 */     if ((localbpt4 != null) && (!localbpt4.i) && (localbpt4.a(parambpt2) < paramFloat)) {
/*  70: 85 */       paramArrayOfbpt[(k++)] = localbpt4;
/*  71:    */     }
/*  72: 88 */     return k;
/*  73:    */   }
/*  74:    */   
/*  75:    */   private bpt a(Entity paramwv, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  76:    */   {
/*  77: 93 */     bpt localbpt = null;
/*  78: 94 */     int k = a(paramwv, paramInt1, paramInt2, paramInt3);
/*  79: 95 */     if (k == 2) {
/*  80: 96 */       return a(paramInt1, paramInt2, paramInt3);
/*  81:    */     }
/*  82: 98 */     if (k == 1) {
/*  83: 99 */       localbpt = a(paramInt1, paramInt2, paramInt3);
/*  84:    */     }
/*  85:101 */     if ((localbpt == null) && (paramInt4 > 0) && (k != -3) && (k != -4) && (a(paramwv, paramInt1, paramInt2 + paramInt4, paramInt3) == 1))
/*  86:    */     {
/*  87:102 */       localbpt = a(paramInt1, paramInt2 + paramInt4, paramInt3);
/*  88:103 */       paramInt2 += paramInt4;
/*  89:    */     }
/*  90:106 */     if (localbpt != null)
/*  91:    */     {
/*  92:107 */       int m = 0;
/*  93:108 */       int n = 0;
/*  94:110 */       while (paramInt2 > 0)
/*  95:    */       {
/*  96:111 */         n = a(paramwv, paramInt1, paramInt2 - 1, paramInt3);
/*  97:112 */         if ((this.h) && (n == -1)) {
/*  98:113 */           return null;
/*  99:    */         }
/* 100:115 */         if (n == 1)
/* 101:    */         {
/* 102:120 */           if (m++ >= paramwv.aF()) {
/* 103:121 */             return null;
/* 104:    */           }
/* 105:123 */           paramInt2--;
/* 106:124 */           if (paramInt2 > 0) {
/* 107:125 */             localbpt = a(paramInt1, paramInt2, paramInt3);
/* 108:    */           } else {
/* 109:127 */             return null;
/* 110:    */           }
/* 111:    */         }
/* 112:    */       }
/* 113:131 */       if (n == -2) {
/* 114:132 */         return null;
/* 115:    */       }
/* 116:    */     }
/* 117:136 */     return localbpt;
/* 118:    */   }
/* 119:    */   
/* 120:    */   private int a(Entity paramwv, int paramInt1, int paramInt2, int paramInt3)
/* 121:    */   {
/* 122:140 */     return a(this.a, paramwv, paramInt1, paramInt2, paramInt3, this.c, this.d, this.e, this.h, this.g, this.f);
/* 123:    */   }
/* 124:    */   
/* 125:    */   public static int a(IBlockAccess paramard, Entity paramwv, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/* 126:    */   {
/* 127:144 */     int k = 0;
/* 128:145 */     BlockPosition localdt1 = new BlockPosition(paramwv);
/* 129:147 */     for (int m = paramInt1; m < paramInt1 + paramInt4; m++) {
/* 130:148 */       for (int n = paramInt2; n < paramInt2 + paramInt5; n++) {
/* 131:149 */         for (int i1 = paramInt3; i1 < paramInt3 + paramInt6; i1++)
/* 132:    */         {
/* 133:150 */           BlockPosition localdt2 = new BlockPosition(m, n, i1);
/* 134:151 */           ProtoBlock localatr = paramard.getBlock(localdt2).getProto();
/* 135:152 */           if (localatr.getMaterial() != Material.air)
/* 136:    */           {
/* 137:155 */             if ((localatr == BlockList.bd) || (localatr == BlockList.cw))
/* 138:    */             {
/* 139:156 */               k = 1;
/* 140:    */             }
/* 141:157 */             else if ((localatr == BlockList.flowingWater) || (localatr == BlockList.water))
/* 142:    */             {
/* 143:158 */               if (paramBoolean1) {
/* 144:159 */                 return -1;
/* 145:    */               }
/* 146:161 */               k = 1;
/* 147:    */             }
/* 148:163 */             else if ((!paramBoolean3) && ((localatr instanceof avf)) && (localatr.getMaterial() == Material.d))
/* 149:    */             {
/* 150:164 */               return 0;
/* 151:    */             }
/* 152:167 */             if ((paramwv.world.getBlock(localdt2).getProto() instanceof ati))
/* 153:    */             {
/* 154:168 */               if ((!(paramwv.world.getBlock(localdt1).getProto() instanceof ati)) && (!(paramwv.world.getBlock(localdt1.down()).getProto() instanceof ati))) {
/* 155:171 */                 return -3;
/* 156:    */               }
/* 157:    */             }
/* 158:175 */             else if (!localatr.b(paramard, localdt2)) {
/* 159:178 */               if ((!paramBoolean2) || (!(localatr instanceof avf)) || (localatr.getMaterial() != Material.d))
/* 160:    */               {
/* 161:182 */                 if (((localatr instanceof avv)) || ((localatr instanceof avw)) || ((localatr instanceof bbx))) {
/* 162:183 */                   return -3;
/* 163:    */                 }
/* 164:186 */                 if ((localatr == BlockList.bd) || (localatr == BlockList.cw)) {
/* 165:187 */                   return -4;
/* 166:    */                 }
/* 167:189 */                 Material localbof = localatr.getMaterial();
/* 168:190 */                 if (localbof == Material.lava)
/* 169:    */                 {
/* 170:191 */                   if (!paramwv.ab()) {
/* 171:194 */                     return -2;
/* 172:    */                   }
/* 173:    */                 }
/* 174:    */                 else {
/* 175:196 */                   return 0;
/* 176:    */                 }
/* 177:    */               }
/* 178:    */             }
/* 179:    */           }
/* 180:    */         }
/* 181:    */       }
/* 182:    */     }
/* 183:200 */     return k != 0 ? 2 : 1;
/* 184:    */   }
/* 185:    */   
/* 186:    */   public void a(boolean paramBoolean)
/* 187:    */   {
/* 188:204 */     this.f = paramBoolean;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void b(boolean paramBoolean)
/* 192:    */   {
/* 193:208 */     this.g = paramBoolean;
/* 194:    */   }
/* 195:    */   
/* 196:    */   public void c(boolean paramBoolean)
/* 197:    */   {
/* 198:212 */     this.h = paramBoolean;
/* 199:    */   }
/* 200:    */   
/* 201:    */   public void d(boolean paramBoolean)
/* 202:    */   {
/* 203:216 */     this.i = paramBoolean;
/* 204:    */   }
/* 205:    */   
/* 206:    */   public boolean b()
/* 207:    */   {
/* 208:220 */     return this.f;
/* 209:    */   }
/* 210:    */   
/* 211:    */   public boolean d()
/* 212:    */   {
/* 213:228 */     return this.i;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public boolean e()
/* 217:    */   {
/* 218:232 */     return this.h;
/* 219:    */   }
/* 220:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpy
 * JD-Core Version:    0.7.0.1
 */