package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Map;
/*   5:    */ 
/*   6:    */ public class MapInfo
/*   7:    */   extends bqc
/*   8:    */ {
/*   9:    */   public int xCenter;
/*  10:    */   public int zCenter;
/*  11:    */   public byte dimension;
/*  12:    */   public byte scale;
/*  13: 74 */   public byte[] f = new byte[16384];
/*  14: 75 */   public List<bqf> g = Lists.newArrayList();
/*  15: 76 */   private Map<EntityPlayer,bqf> i = Maps.newHashMap();
/*  16: 77 */   public Map<String,MapIcon> icons = Maps.newLinkedHashMap();
/*  17:    */   
/*  18:    */   public MapInfo(String paramString)
/*  19:    */   {
/*  20: 80 */     super(paramString);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void a(double paramDouble1, double paramDouble2, int paramInt)
/*  24:    */   {
/*  25: 84 */     int j = 128 * (1 << paramInt);
/*  26:    */     
/*  27: 86 */     int k = MathUtils.floor((paramDouble1 + 64.0D) / j);
/*  28: 87 */     int m = MathUtils.floor((paramDouble2 + 64.0D) / j);
/*  29:    */     
/*  30: 89 */     this.xCenter = (k * j + j / 2 - 64);
/*  31: 90 */     this.zCenter = (m * j + j / 2 - 64);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void readFromNBT(NBTTagCompound tag)
/*  35:    */   {
/*  36: 95 */     this.dimension = tag.d("dimension");
/*  37: 96 */     this.xCenter = tag.getInteger("xCenter");
/*  38: 97 */     this.zCenter = tag.getInteger("zCenter");
/*  39: 98 */     this.scale = tag.d("scale");
/*  40: 99 */     this.scale = ((byte)MathUtils.clamp(this.scale, 0, 4));
/*  41:    */     
/*  42:101 */     int j = tag.e("width");
/*  43:102 */     int k = tag.e("height");
/*  44:103 */     if ((j == 128) && (k == 128))
/*  45:    */     {
/*  46:104 */       this.f = tag.k("colors");
/*  47:    */     }
/*  48:    */     else
/*  49:    */     {
/*  50:106 */       byte[] arrayOfByte = tag.k("colors");
/*  51:107 */       this.f = new byte[16384];
/*  52:108 */       int m = (128 - j) / 2;
/*  53:109 */       int n = (128 - k) / 2;
/*  54:110 */       for (int i1 = 0; i1 < k; i1++)
/*  55:    */       {
/*  56:111 */         int i2 = i1 + n;
/*  57:112 */         if ((i2 >= 0) || (i2 < 128)) {
/*  58:115 */           for (int i3 = 0; i3 < j; i3++)
/*  59:    */           {
/*  60:116 */             int i4 = i3 + m;
/*  61:117 */             if ((i4 >= 0) || (i4 < 128)) {
/*  62:120 */               this.f[(i4 + i2 * 128)] = arrayOfByte[(i3 + i1 * j)];
/*  63:    */             }
/*  64:    */           }
/*  65:    */         }
/*  66:    */       }
/*  67:    */     }
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void writeToNBT(NBTTagCompound tag)
/*  71:    */   {
/*  72:128 */     tag.setByte("dimension", this.dimension);
/*  73:129 */     tag.setInt("xCenter", this.xCenter);
/*  74:130 */     tag.setInt("zCenter", this.zCenter);
/*  75:131 */     tag.setByte("scale", this.scale);
/*  76:132 */     tag.setShort("width", (short)128);
/*  77:133 */     tag.setShort("height", (short)128);
/*  78:134 */     tag.setByteArray("colors", this.f);
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void a(EntityPlayer paramahd, ItemStack paramamj)
/*  82:    */   {
/*  83:138 */     if (!this.i.containsKey(paramahd))
/*  84:    */     {
/*  85:139 */       bqf localbqf = new bqf(this, paramahd);
/*  86:140 */       this.i.put(paramahd, localbqf);
/*  87:141 */       this.g.add(localbqf);
/*  88:    */     }
/*  89:144 */     if (!paramahd.bg.c(paramamj)) {
/*  90:145 */       this.icons.remove(paramahd.getName());
/*  91:    */     }
/*  92:    */     
/*  93:148 */     for (int j = 0; j < this.g.size(); j++)
/*  94:    */     {
/*  95:149 */       bqf localbqf = this.g.get(j);
/*  96:151 */       if ((localbqf.player.isDead) || ((!localbqf.player.bg.c(paramamj)) && (!paramamj.y())))
/*  97:    */       {
/*  98:152 */         this.i.remove(localbqf.player);
/*  99:153 */         this.g.remove(localbqf);
/* 100:    */       }
/* 101:154 */       else if ((!paramamj.y()) && (localbqf.player.dimension == this.dimension))
/* 102:    */       {
/* 103:155 */         updateIcon(0, localbqf.player.world, localbqf.player.getName(), localbqf.player.xPos, localbqf.player.zPos, localbqf.player.yaw);
/* 104:    */       }
/* 105:    */     }
/* 106:    */     
/* 107:159 */     if (paramamj.y())
/* 108:    */     {
/* 109:160 */       adk localObject1 = paramamj.z();
/* 110:161 */       BlockPosition pos = localObject1.n();
/* 111:162 */       updateIcon(1, paramahd.world, "frame-" + localObject1.getID(), pos.getX(), pos.getZ(), localObject1.b.b() * 90);
/* 112:    */     }
/* 113:165 */     if ((paramamj.hasTagCompound()) && (paramamj.getTagCompound().hasKey("Decorations", 9)))
/* 114:    */     {
/* 115:166 */       fv localObject1 = paramamj.getTagCompound().c("Decorations", 10);
/* 116:167 */       for (int k = 0; k < ((fv)localObject1).c(); k++)
/* 117:    */       {
/* 118:168 */         NBTTagCompound localfn = ((fv)localObject1).b(k);
/* 119:169 */         if (!this.icons.containsKey(localfn.getString("id"))) {
/* 120:170 */           updateIcon(localfn.d("type"), paramahd.world, localfn.getString("id"), localfn.i("x"), localfn.i("z"), localfn.i("rot"));
/* 121:    */         }
/* 122:    */       }
/* 123:    */     }
/* 124:    */   }
/* 125:    */   
/* 126:    */   private void updateIcon(int type, World world, String iconName, double x, double z, double yaw)
/* 127:    */   {
/* 128:177 */     int j = 1 << this.scale;
/* 129:178 */     float dx = (float)(x - this.xCenter) / j;
/* 130:179 */     float dz = (float)(z - this.zCenter) / j;
/* 131:180 */     byte mapX = (byte)(int)(dx * 2.0F + 0.5D);
/* 132:181 */     byte mapY = (byte)(int)(dz * 2.0F + 0.5D);
/* 133:    */     
/* 134:183 */     int k = 63;
/* 135:    */     byte orientation;
/* 136:185 */     if ((dx >= -k) && (dz >= -k) && (dx <= k) && (dz <= k))
/* 137:    */     {
/* 138:186 */       yaw += (yaw < 0.0D ? -8.0D : 8.0D);
/* 139:187 */       orientation = (byte)(int)(yaw * 16.0D / 360.0D);
/* 140:189 */       if (this.dimension < 0)
/* 141:    */       {
/* 142:190 */         int m = (int)(world.getWorldInfo().getTime() / 10L);
/* 143:191 */         orientation = (byte)(m * m * 34187121 + m * 121 >> 15 & 0xF);
/* 144:    */       }
/* 145:    */     }
/* 146:193 */     else if ((Math.abs(dx) < 320.0F) && (Math.abs(dz) < 320.0F))
/* 147:    */     {
/* 148:194 */       type = 6;
/* 149:195 */       orientation = 0;
/* 150:196 */       if (dx <= -k) {
/* 151:197 */         mapX = (byte)(int)(k * 2 + 2.5D);
/* 152:    */       }
/* 153:199 */       if (dz <= -k) {
/* 154:200 */         mapY = (byte)(int)(k * 2 + 2.5D);
/* 155:    */       }
/* 156:202 */       if (dx >= k) {
/* 157:203 */         mapX = (byte)(k * 2 + 1);
/* 158:    */       }
/* 159:205 */       if (dz >= k) {
/* 160:206 */         mapY = (byte)(k * 2 + 1);
/* 161:    */       }
/* 162:    */     }
/* 163:    */     else
/* 164:    */     {
/* 165:209 */       this.icons.remove(iconName);
/* 166:210 */       return;
/* 167:    */     }
/* 168:213 */     this.icons.put(iconName, new MapIcon((byte)type, mapX, mapY, orientation));
/* 169:    */   }
/* 170:    */   
/* 171:    */   public id<ik> a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 172:    */   {
/* 173:218 */     bqf localbqf = (bqf)this.i.get(paramahd);
/* 174:220 */     if (localbqf == null) {
/* 175:221 */       return null;
/* 176:    */     }
/* 177:224 */     return localbqf.a(paramamj);
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void a(int paramInt1, int paramInt2)
/* 181:    */   {
/* 182:228 */     super.c();
/* 183:229 */     for (bqf localbqf : this.g) {
/* 184:230 */       localbqf.a(paramInt1, paramInt2);
/* 185:    */     }
/* 186:    */   }
/* 187:    */   
/* 188:    */   public bqf a(EntityPlayer paramahd)
/* 189:    */   {
/* 190:235 */     bqf localbqf = (bqf)this.i.get(paramahd);
/* 191:237 */     if (localbqf == null)
/* 192:    */     {
/* 193:238 */       localbqf = new bqf(this, paramahd);
/* 194:239 */       this.i.put(paramahd, localbqf);
/* 195:240 */       this.g.add(localbqf);
/* 196:    */     }
/* 197:243 */     return localbqf;
/* 198:    */   }
/* 199:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqe
 * JD-Core Version:    0.7.0.1
 */