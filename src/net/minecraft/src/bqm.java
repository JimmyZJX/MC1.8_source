package net.minecraft.src;
/*   1:    */ import java.io.DataInputStream;
/*   2:    */ import java.io.DataOutputStream;
/*   3:    */ import java.io.File;
/*   4:    */ import java.io.FileInputStream;
/*   5:    */ import java.io.FileOutputStream;
/*   6:    */ import java.io.IOException;
/*   7:    */ import java.util.UUID;
/*   8:    */ import net.minecraft.server.MinecraftServer;
/*   9:    */ import org.apache.logging.log4j.LogManager;
/*  10:    */ import org.apache.logging.log4j.Logger;
/*  11:    */ 
/*  12:    */ public class bqm
/*  13:    */   implements bqy, brl
/*  14:    */ {
/*  15: 16 */   private static final Logger a = LogManager.getLogger();
/*  16:    */   private final File b;
/*  17:    */   private final File c;
/*  18:    */   private final File d;
/*  19: 20 */   private final long e = MinecraftServer.ax();
/*  20:    */   private final String f;
/*  21:    */   
/*  22:    */   public bqm(File paramFile, String paramString, boolean paramBoolean)
/*  23:    */   {
/*  24: 24 */     this.b = new File(paramFile, paramString);
/*  25: 25 */     this.b.mkdirs();
/*  26: 26 */     this.c = new File(this.b, "playerdata");
/*  27: 27 */     this.d = new File(this.b, "data");
/*  28: 28 */     this.d.mkdirs();
/*  29: 29 */     this.f = paramString;
/*  30: 31 */     if (paramBoolean) {
/*  31: 32 */       this.c.mkdirs();
/*  32:    */     }
/*  33: 35 */     h();
/*  34:    */   }
/*  35:    */   
/*  36:    */   private void h()
/*  37:    */   {
/*  38:    */     try
/*  39:    */     {
/*  40: 40 */       File localFile = new File(this.b, "session.lock");
/*  41: 41 */       DataOutputStream localDataOutputStream = new DataOutputStream(new FileOutputStream(localFile));
/*  42:    */       try
/*  43:    */       {
/*  44: 43 */         localDataOutputStream.writeLong(this.e);
/*  45:    */       }
/*  46:    */       finally
/*  47:    */       {
/*  48: 45 */         localDataOutputStream.close();
/*  49:    */       }
/*  50:    */     }
/*  51:    */     catch (IOException localIOException)
/*  52:    */     {
/*  53: 48 */       localIOException.printStackTrace();
/*  54: 49 */       throw new RuntimeException("Failed to check session lock, aborting");
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   public File b()
/*  59:    */   {
/*  60: 55 */     return this.b;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void c() throws aqz
/*  64:    */   {
/*  65:    */     try
/*  66:    */     {
/*  67: 61 */       File localFile = new File(this.b, "session.lock");
/*  68: 62 */       DataInputStream localDataInputStream = new DataInputStream(new FileInputStream(localFile));
/*  69:    */       try
/*  70:    */       {
/*  71: 64 */         if (localDataInputStream.readLong() != this.e) {
/*  72: 65 */           throw new aqz("The save is being accessed from another location, aborting");
/*  73:    */         }
/*  74:    */       }
/*  75:    */       finally
/*  76:    */       {
/*  77: 68 */         localDataInputStream.close();
/*  78:    */       }
/*  79:    */     }
/*  80:    */     catch (IOException localIOException)
/*  81:    */     {
/*  82: 71 */       throw new aqz("Failed to check session lock, aborting");
/*  83:    */     }
/*  84:    */   }
/*  85:    */   
/*  86:    */   public bfq a(bgd parambgd)
/*  87:    */   {
/*  88: 77 */     throw new RuntimeException("Old Chunk Storage is no longer supported.");
/*  89:    */   }
/*  90:    */   
/*  91:    */   public WorldInfo d()
/*  92:    */   {
/*  93: 82 */     File localFile = new File(this.b, "level.dat");
/*  94:    */     NBTTagCompound localfn3;
/*  95: 83 */     if (localFile.exists()) {
/*  96:    */       try
/*  97:    */       {
/*  98: 85 */         NBTTagCompound localfn1 = fz.a(new FileInputStream(localFile));
/*  99: 86 */         localfn3 = localfn1.getCompoundTag("Data");
/* 100:    */         
/* 101: 88 */         return new WorldInfo(localfn3);
/* 102:    */       }
/* 103:    */       catch (Exception localException1)
/* 104:    */       {
/* 105: 91 */         localException1.printStackTrace();
/* 106:    */       }
/* 107:    */     }
/* 108: 94 */     localFile = new File(this.b, "level.dat_old");
/* 109: 95 */     if (localFile.exists()) {
/* 110:    */       try
/* 111:    */       {
/* 112: 97 */         NBTTagCompound localfn2 = fz.a(new FileInputStream(localFile));
/* 113: 98 */         localfn3 = localfn2.getCompoundTag("Data");
/* 114:    */         
/* 115:100 */         return new WorldInfo(localfn3);
/* 116:    */       }
/* 117:    */       catch (Exception localException2)
/* 118:    */       {
/* 119:103 */         localException2.printStackTrace();
/* 120:    */       }
/* 121:    */     }
/* 122:106 */     return null;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void a(WorldInfo parambqo, NBTTagCompound paramfn)
/* 126:    */   {
/* 127:111 */     NBTTagCompound localfn1 = parambqo.a(paramfn);
/* 128:    */     
/* 129:113 */     NBTTagCompound localfn2 = new NBTTagCompound();
/* 130:114 */     localfn2.setNBT("Data", localfn1);
/* 131:    */     try
/* 132:    */     {
/* 133:117 */       File localFile1 = new File(this.b, "level.dat_new");
/* 134:118 */       File localFile2 = new File(this.b, "level.dat_old");
/* 135:119 */       File localFile3 = new File(this.b, "level.dat");
/* 136:    */       
/* 137:121 */       fz.a(localfn2, new FileOutputStream(localFile1));
/* 138:123 */       if (localFile2.exists()) {
/* 139:124 */         localFile2.delete();
/* 140:    */       }
/* 141:126 */       localFile3.renameTo(localFile2);
/* 142:127 */       if (localFile3.exists()) {
/* 143:128 */         localFile3.delete();
/* 144:    */       }
/* 145:130 */       localFile1.renameTo(localFile3);
/* 146:131 */       if (localFile1.exists()) {
/* 147:132 */         localFile1.delete();
/* 148:    */       }
/* 149:    */     }
/* 150:    */     catch (Exception localException)
/* 151:    */     {
/* 152:135 */       localException.printStackTrace();
/* 153:    */     }
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void a(WorldInfo parambqo)
/* 157:    */   {
/* 158:141 */     NBTTagCompound localfn1 = parambqo.a();
/* 159:    */     
/* 160:143 */     NBTTagCompound localfn2 = new NBTTagCompound();
/* 161:144 */     localfn2.setNBT("Data", localfn1);
/* 162:    */     try
/* 163:    */     {
/* 164:147 */       File localFile1 = new File(this.b, "level.dat_new");
/* 165:148 */       File localFile2 = new File(this.b, "level.dat_old");
/* 166:149 */       File localFile3 = new File(this.b, "level.dat");
/* 167:    */       
/* 168:151 */       fz.a(localfn2, new FileOutputStream(localFile1));
/* 169:153 */       if (localFile2.exists()) {
/* 170:154 */         localFile2.delete();
/* 171:    */       }
/* 172:156 */       localFile3.renameTo(localFile2);
/* 173:157 */       if (localFile3.exists()) {
/* 174:158 */         localFile3.delete();
/* 175:    */       }
/* 176:160 */       localFile1.renameTo(localFile3);
/* 177:161 */       if (localFile1.exists()) {
/* 178:162 */         localFile1.delete();
/* 179:    */       }
/* 180:    */     }
/* 181:    */     catch (Exception localException)
/* 182:    */     {
/* 183:165 */       localException.printStackTrace();
/* 184:    */     }
/* 185:    */   }
/* 186:    */   
/* 187:    */   public void a(EntityPlayer paramahd)
/* 188:    */   {
/* 189:    */     try
/* 190:    */     {
/* 191:172 */       NBTTagCompound localfn = new NBTTagCompound();
/* 192:173 */       paramahd.e(localfn);
/* 193:174 */       File localFile1 = new File(this.c, paramahd.getUUID().toString() + ".dat.tmp");
/* 194:175 */       File localFile2 = new File(this.c, paramahd.getUUID().toString() + ".dat");
/* 195:176 */       fz.a(localfn, new FileOutputStream(localFile1));
/* 196:177 */       if (localFile2.exists()) {
/* 197:178 */         localFile2.delete();
/* 198:    */       }
/* 199:180 */       localFile1.renameTo(localFile2);
/* 200:    */     }
/* 201:    */     catch (Exception localException)
/* 202:    */     {
/* 203:182 */       a.warn("Failed to save player data for " + paramahd.getName());
/* 204:    */     }
/* 205:    */   }
/* 206:    */   
/* 207:    */   public NBTTagCompound b(EntityPlayer paramahd)
/* 208:    */   {
/* 209:188 */     NBTTagCompound localfn = null;
/* 210:    */     try
/* 211:    */     {
/* 212:190 */       File localFile = new File(this.c, paramahd.getUUID().toString() + ".dat");
/* 213:191 */       if ((localFile.exists()) && (localFile.isFile())) {
/* 214:192 */         localfn = fz.a(new FileInputStream(localFile));
/* 215:    */       }
/* 216:    */     }
/* 217:    */     catch (Exception localException)
/* 218:    */     {
/* 219:195 */       a.warn("Failed to load player data for " + paramahd.getName());
/* 220:    */     }
/* 221:197 */     if (localfn != null) {
/* 222:198 */       paramahd.f(localfn);
/* 223:    */     }
/* 224:200 */     return localfn;
/* 225:    */   }
/* 226:    */   
/* 227:    */   public brl e()
/* 228:    */   {
/* 229:205 */     return this;
/* 230:    */   }
/* 231:    */   
/* 232:    */   public String[] f()
/* 233:    */   {
/* 234:210 */     String[] arrayOfString = this.c.list();
/* 235:211 */     if (arrayOfString == null) {
/* 236:212 */       arrayOfString = new String[0];
/* 237:    */     }
/* 238:215 */     for (int i = 0; i < arrayOfString.length; i++) {
/* 239:216 */       if (arrayOfString[i].endsWith(".dat")) {
/* 240:217 */         arrayOfString[i] = arrayOfString[i].substring(0, arrayOfString[i].length() - 4);
/* 241:    */       }
/* 242:    */     }
/* 243:221 */     return arrayOfString;
/* 244:    */   }
/* 245:    */   
/* 246:    */   public void a() {}
/* 247:    */   
/* 248:    */   public File a(String paramString)
/* 249:    */   {
/* 250:230 */     return new File(this.d, paramString + ".dat");
/* 251:    */   }
/* 252:    */   
/* 253:    */   public String g()
/* 254:    */   {
/* 255:235 */     return this.f;
/* 256:    */   }
/* 257:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqm
 * JD-Core Version:    0.7.0.1
 */