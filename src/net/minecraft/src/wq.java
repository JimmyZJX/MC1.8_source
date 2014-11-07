package net.minecraft.src;
/*   1:    */ import org.apache.logging.log4j.LogManager;
/*   2:    */ import org.apache.logging.log4j.Logger;
/*   3:    */ 
/*   4:    */ public class wq
/*   5:    */ {
/*   6: 10 */   private static final Logger a = LogManager.getLogger();
/*   7:    */   private int id;
/*   8:    */   private int duration;
/*   9:    */   private int amplifier;
/*  10:    */   private boolean splash;
/*  11:    */   private boolean ambient;
/*  12:    */   private boolean g;
/*  13:    */   private boolean showParticles;
/*  14:    */   
/*  15:    */   public wq(int paramInt1, int paramInt2)
/*  16:    */   {
/*  17: 28 */     this(paramInt1, paramInt2, 0);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public wq(int paramInt1, int paramInt2, int paramInt3)
/*  21:    */   {
/*  22: 32 */     this(paramInt1, paramInt2, paramInt3, false, true);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public wq(int id, int duration, int amplifier, boolean ambient, boolean showParticles)
/*  26:    */   {
/*  27: 36 */     this.id = id;
/*  28: 37 */     this.duration = duration;
/*  29: 38 */     this.amplifier = amplifier;
/*  30: 39 */     this.ambient = ambient;
/*  31: 40 */     this.showParticles = showParticles;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public wq(wq paramwq)
/*  35:    */   {
/*  36: 44 */     this.id = paramwq.id;
/*  37: 45 */     this.duration = paramwq.duration;
/*  38: 46 */     this.amplifier = paramwq.amplifier;
/*  39: 47 */     this.ambient = paramwq.ambient;
/*  40: 48 */     this.showParticles = paramwq.showParticles;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public void a(wq paramwq)
/*  44:    */   {
/*  45: 52 */     if (this.id != paramwq.id) {
/*  46: 53 */       a.warn("This method should only be called for matching effects!");
/*  47:    */     }
/*  48: 55 */     if (paramwq.amplifier > this.amplifier)
/*  49:    */     {
/*  50: 56 */       this.amplifier = paramwq.amplifier;
/*  51: 57 */       this.duration = paramwq.duration;
/*  52:    */     }
/*  53: 58 */     else if ((paramwq.amplifier == this.amplifier) && (this.duration < paramwq.duration))
/*  54:    */     {
/*  55: 59 */       this.duration = paramwq.duration;
/*  56:    */     }
/*  57: 60 */     else if ((!paramwq.ambient) && (this.ambient))
/*  58:    */     {
/*  59: 61 */       this.ambient = paramwq.ambient;
/*  60:    */     }
/*  61: 63 */     this.showParticles = paramwq.showParticles;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public int getID()
/*  65:    */   {
/*  66: 67 */     return this.id;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public int getDuration()
/*  70:    */   {
/*  71: 71 */     return this.duration;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public int getAmplifier()
/*  75:    */   {
/*  76: 75 */     return this.amplifier;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void a(boolean paramBoolean)
/*  80:    */   {
/*  81: 83 */     this.splash = paramBoolean;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public boolean getAmbient()
/*  85:    */   {
/*  86: 87 */     return this.ambient;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public boolean getShowParticles()
/*  90:    */   {
/*  91: 91 */     return this.showParticles;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public boolean a(EntityLiving paramxm)
/*  95:    */   {
/*  96:101 */     if (this.duration > 0)
/*  97:    */     {
/*  98:102 */       if (Potion.potionList[this.id].a(this.duration, this.amplifier)) {
/*  99:103 */         b(paramxm);
/* 100:    */       }
/* 101:105 */       i();
/* 102:    */     }
/* 103:107 */     return this.duration > 0;
/* 104:    */   }
/* 105:    */   
/* 106:    */   private int i()
/* 107:    */   {
/* 108:111 */     return --this.duration;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void b(EntityLiving paramxm)
/* 112:    */   {
/* 113:115 */     if (this.duration > 0) {
/* 114:116 */       Potion.potionList[this.id].a(paramxm, this.amplifier);
/* 115:    */     }
/* 116:    */   }
/* 117:    */   
/* 118:    */   public String getPotionName()
/* 119:    */   {
/* 120:121 */     return Potion.potionList[this.id].getName();
/* 121:    */   }
/* 122:    */   
/* 123:    */   public int hashCode()
/* 124:    */   {
/* 125:126 */     return this.id;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public String toString()
/* 129:    */   {
/* 130:131 */     String str = "";
/* 131:132 */     if (getAmplifier() > 0) {
/* 132:133 */       str = getPotionName() + " x " + (getAmplifier() + 1) + ", Duration: " + getDuration();
/* 133:    */     } else {
/* 134:135 */       str = getPotionName() + ", Duration: " + getDuration();
/* 135:    */     }
/* 136:137 */     if (this.splash) {
/* 137:138 */       str = str + ", Splash: true";
/* 138:    */     }
/* 139:140 */     if (!this.showParticles) {
/* 140:141 */       str = str + ", Particles: false";
/* 141:    */     }
/* 142:143 */     if (Potion.potionList[this.id].j()) {
/* 143:144 */       return "(" + str + ")";
/* 144:    */     }
/* 145:146 */     return str;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public boolean equals(Object paramObject)
/* 149:    */   {
/* 150:151 */     if (!(paramObject instanceof wq)) {
/* 151:152 */       return false;
/* 152:    */     }
/* 153:154 */     wq localwq = (wq)paramObject;
/* 154:155 */     return (this.id == localwq.id) && (this.amplifier == localwq.amplifier) && (this.duration == localwq.duration) && (this.splash == localwq.splash) && (this.ambient == localwq.ambient);
/* 155:    */   }
/* 156:    */   
/* 157:    */   public NBTTagCompound writeToNBT(NBTTagCompound tag)
/* 158:    */   {
/* 159:159 */     tag.setByte("Id", (byte)getID());
/* 160:160 */     tag.setByte("Amplifier", (byte)getAmplifier());
/* 161:161 */     tag.setInt("Duration", getDuration());
/* 162:162 */     tag.setBoolean("Ambient", getAmbient());
/* 163:163 */     tag.setBoolean("ShowParticles", getShowParticles());
/* 164:164 */     return tag;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public static wq fromNBT(NBTTagCompound tag)
/* 168:    */   {
/* 169:168 */     int id = tag.d("Id");
/* 170:169 */     if ((id < 0) || (id >= Potion.potionList.length) || (Potion.potionList[id] == null)) {
/* 171:170 */       return null;
/* 172:    */     }
/* 173:172 */     int amplifier = tag.d("Amplifier");
/* 174:173 */     int duration = tag.getInteger("Duration");
/* 175:174 */     boolean ambient = tag.getBoolean("Ambient");
/* 176:175 */     boolean showParticles = true;
/* 177:176 */     if (tag.hasKey("ShowParticles", 1)) {
/* 178:177 */       showParticles = tag.getBoolean("ShowParticles");
/* 179:    */     }
/* 180:179 */     return new wq(id, duration, amplifier, ambient, showParticles);
/* 181:    */   }
/* 182:    */   
/* 183:    */   public void b(boolean paramBoolean)
/* 184:    */   {
/* 185:183 */     this.g = paramBoolean;
/* 186:    */   }
/* 187:    */   
/* 188:    */   public boolean h()
/* 189:    */   {
/* 190:187 */     return this.g;
/* 191:    */   }
/* 192:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wq
 * JD-Core Version:    0.7.0.1
 */