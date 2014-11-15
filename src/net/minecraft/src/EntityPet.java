package net.minecraft.src;
/*   2:    */ import java.util.UUID;
/*   3:    */ 
/*   4:    */ public abstract class EntityPet
/*   5:    */   extends EntityAnimal
/*   6:    */   implements xt<EntityLiving>
/*   7:    */ {
/*   8: 21 */   protected aad bk = new aad(this);
/*   9:    */   
/*  10:    */   public EntityPet(World paramaqu)
/*  11:    */   {
/*  12: 24 */     super(paramaqu);
/*  13: 25 */     ck();
/*  14:    */   }
/*  15:    */   
/*  16:    */   protected void h()
/*  17:    */   {
/*  18: 30 */     super.h();
/*  19: 31 */     this.ac.a(16, Byte.valueOf((byte)0));
/*  20: 32 */     this.ac.a(17, "");
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/*  24:    */   {
/*  25: 37 */     super.writeEntityToNBT(paramfn);
/*  26: 38 */     if (b() == null) {
/*  27: 39 */       paramfn.setString("OwnerUUID", "");
/*  28:    */     } else {
/*  29: 41 */       paramfn.setString("OwnerUUID", b());
/*  30:    */     }
/*  31: 43 */     paramfn.setBoolean("Sitting", cl());
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/*  35:    */   {
/*  36: 48 */     super.readEntityFromNBT(paramfn);
/*  37: 49 */     String str1 = "";
/*  38: 50 */     if (paramfn.hasKey("OwnerUUID", 8))
/*  39:    */     {
/*  40: 51 */       str1 = paramfn.getString("OwnerUUID");
/*  41:    */     }
/*  42:    */     else
/*  43:    */     {
/*  44: 53 */       String str2 = paramfn.getString("Owner");
/*  45: 54 */       str1 = sf.a(str2);
/*  46:    */     }
/*  47: 56 */     if (str1.length() > 0)
/*  48:    */     {
/*  49: 57 */       b(str1);
/*  50: 58 */       m(true);
/*  51:    */     }
/*  52: 60 */     this.bk.a(paramfn.getBoolean("Sitting"));
/*  53: 61 */     n(paramfn.getBoolean("Sitting"));
/*  54:    */   }
/*  55:    */   
/*  56:    */   protected void l(boolean paramBoolean)
/*  57:    */   {
/*  58: 65 */     ew localew = ew.I;
/*  59: 66 */     if (!paramBoolean) {
/*  60: 67 */       localew = ew.l;
/*  61:    */     }
/*  62: 69 */     for (int i = 0; i < 7; i++)
/*  63:    */     {
/*  64: 70 */       double d1 = this.random.nextGaussian() * 0.02D;
/*  65: 71 */       double d2 = this.random.nextGaussian() * 0.02D;
/*  66: 72 */       double d3 = this.random.nextGaussian() * 0.02D;
/*  67: 73 */       this.world.a(localew, this.xPos + this.random.nextFloat() * this.J * 2.0F - this.J, this.yPos + 0.5D + this.random.nextFloat() * this.K, this.zPos + this.random.nextFloat() * this.J * 2.0F - this.J, d1, d2, d3, new int[0]);
/*  68:    */     }
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void a(byte paramByte)
/*  72:    */   {
/*  73: 79 */     if (paramByte == 7) {
/*  74: 80 */       l(true);
/*  75: 81 */     } else if (paramByte == 6) {
/*  76: 82 */       l(false);
/*  77:    */     } else {
/*  78: 84 */       super.a(paramByte);
/*  79:    */     }
/*  80:    */   }
/*  81:    */   
/*  82:    */   public boolean cj()
/*  83:    */   {
/*  84: 89 */     return (this.ac.a(16) & 0x4) != 0;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void m(boolean paramBoolean)
/*  88:    */   {
/*  89: 93 */     int i = this.ac.a(16);
/*  90: 94 */     if (paramBoolean) {
/*  91: 95 */       this.ac.b(16, Byte.valueOf((byte)(i | 0x4)));
/*  92:    */     } else {
/*  93: 97 */       this.ac.b(16, Byte.valueOf((byte)(i & 0xFFFFFFFB)));
/*  94:    */     }
/*  95:100 */     ck();
/*  96:    */   }
/*  97:    */   
/*  98:    */   protected void ck() {}
/*  99:    */   
/* 100:    */   public boolean cl()
/* 101:    */   {
/* 102:107 */     return (this.ac.a(16) & 0x1) != 0;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void n(boolean paramBoolean)
/* 106:    */   {
/* 107:111 */     int i = this.ac.a(16);
/* 108:112 */     if (paramBoolean) {
/* 109:113 */       this.ac.b(16, Byte.valueOf((byte)(i | 0x1)));
/* 110:    */     } else {
/* 111:115 */       this.ac.b(16, Byte.valueOf((byte)(i & 0xFFFFFFFE)));
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   public String b()
/* 116:    */   {
/* 117:121 */     return this.ac.e(17);
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void b(String paramString)
/* 121:    */   {
/* 122:125 */     this.ac.b(17, paramString);
/* 123:    */   }
/* 124:    */   
/* 125:    */   public EntityLiving l_()
/* 126:    */   {
/* 127:    */     try
/* 128:    */     {
/* 129:131 */       UUID localUUID = UUID.fromString(b());
/* 130:132 */       if (localUUID == null) {
/* 131:133 */         return null;
/* 132:    */       }
/* 133:135 */       return this.world.b(localUUID);
/* 134:    */     }
/* 135:    */     catch (IllegalArgumentException localIllegalArgumentException) {}
/* 136:137 */     return null;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public boolean e(EntityLiving paramxm)
/* 140:    */   {
/* 141:142 */     return paramxm == l_();
/* 142:    */   }
/* 143:    */   
/* 144:    */   public aad cn()
/* 145:    */   {
/* 146:146 */     return this.bk;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public boolean a(EntityLiving paramxm1, EntityLiving paramxm2)
/* 150:    */   {
/* 151:150 */     return true;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public bsf bN()
/* 155:    */   {
/* 156:155 */     if (cj())
/* 157:    */     {
/* 158:156 */       EntityLiving localxm = l_();
/* 159:157 */       if (localxm != null) {
/* 160:158 */         return localxm.bN();
/* 161:    */       }
/* 162:    */     }
/* 163:161 */     return super.bN();
/* 164:    */   }
/* 165:    */   
/* 166:    */   public boolean c(EntityLiving paramxm)
/* 167:    */   {
/* 168:166 */     if (cj())
/* 169:    */     {
/* 170:167 */       EntityLiving localxm = l_();
/* 171:168 */       if (paramxm == localxm) {
/* 172:169 */         return true;
/* 173:    */       }
/* 174:171 */       if (localxm != null) {
/* 175:172 */         return localxm.c(paramxm);
/* 176:    */       }
/* 177:    */     }
/* 178:175 */     return super.c(paramxm);
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void a(DamageSource paramwh)
/* 182:    */   {
/* 183:180 */     if ((!this.world.isClient) && (this.world.getGameRules().getBoolean("showDeathMessages")) && (k_()) && 
/* 184:181 */       ((l_() instanceof qw))) {
/* 185:182 */       ((qw)l_()).a(br().b());
/* 186:    */     }
/* 187:185 */     super.a(paramwh);
/* 188:    */   }
/* 189:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     xx
 * JD-Core Version:    0.7.0.1
 */