package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

/*   2:    */ import java.io.DataInputStream;
import java.io.DataOutput;
/*   3:    */ import java.io.DataOutputStream;
/*   4:    */ import java.io.File;
/*   5:    */ import java.io.IOException;
/*   6:    */ import java.util.ArrayList;
/*   7:    */ import java.util.Collection;
/*   8:    */ import java.util.Collections;
/*   9:    */ import java.util.List;

/*  10:    */ import org.apache.commons.lang3.StringUtils;
/*  11:    */ import org.apache.logging.log4j.LogManager;
/*  12:    */ import org.apache.logging.log4j.Logger;
/*  13:    */ 
/*  14:    */ public class bqj
/*  15:    */   extends bqn
/*  16:    */ {
/*  17: 25 */   private static final Logger b = LogManager.getLogger();
/*  18:    */   
/*  19:    */   public bqj(File paramFile)
/*  20:    */   {
/*  21: 28 */     super(paramFile);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public String a()
/*  25:    */   {
/*  26: 33 */     return "Anvil";
/*  27:    */   }
/*  28:    */   
/*  29:    */   public List b() throws bqz
/*  30:    */   {
/*  31: 38 */     if ((this.a == null) || (!this.a.exists()) || (!this.a.isDirectory())) {
/*  32: 39 */       throw new bqz("Unable to read or access folder where game worlds are saved!");
/*  33:    */     }
/*  34: 42 */     ArrayList localArrayList = Lists.newArrayList();
/*  35:    */     
/*  36: 44 */     File[] arrayOfFile1 = this.a.listFiles();
/*  37: 45 */     for (File localFile : arrayOfFile1) {
/*  38: 46 */       if (localFile.isDirectory())
/*  39:    */       {
/*  40: 50 */         String str1 = localFile.getName();
/*  41:    */         
/*  42: 52 */         WorldInfo localbqo = c(str1);
/*  43: 53 */         if ((localbqo != null) && ((localbqo.l() == 19132) || (localbqo.l() == 19133)))
/*  44:    */         {
/*  45: 54 */           boolean bool = localbqo.l() != c();
/*  46: 55 */           String str2 = localbqo.k();
/*  47: 56 */           if (StringUtils.isEmpty(str2)) {
/*  48: 57 */             str2 = str1;
/*  49:    */           }
/*  50: 59 */           long l = 0L;
/*  51: 60 */           localArrayList.add(new brb(str1, str2, localbqo.m(), l, localbqo.r(), bool, localbqo.isHardcore(), localbqo.v()));
/*  52:    */         }
/*  53:    */       }
/*  54:    */     }
/*  55: 64 */     return localArrayList;
/*  56:    */   }
/*  57:    */   
/*  58:    */   protected int c()
/*  59:    */   {
/*  60: 68 */     return 19133;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void d() {}
/*  64:    */   
/*  65:    */   public bqy a(String paramString, boolean paramBoolean)
/*  66:    */   {
/*  67: 78 */     return new bqi(this.a, paramString, paramBoolean);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public boolean a(String paramString)
/*  71:    */   {
/*  72: 84 */     WorldInfo localbqo = c(paramString);
/*  73: 85 */     if ((localbqo == null) || (localbqo.l() != 19132)) {
/*  74: 86 */       return false;
/*  75:    */     }
/*  76: 89 */     return true;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public boolean b(String paramString)
/*  80:    */   {
/*  81: 94 */     WorldInfo localbqo = c(paramString);
/*  82: 95 */     if ((localbqo == null) || (localbqo.l() == c())) {
/*  83: 96 */       return false;
/*  84:    */     }
/*  85: 98 */     return true;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public boolean a(String paramString, uy paramuy)
/*  89:    */   {
/*  90:103 */     paramuy.a(0);
/*  91:    */     
/*  92:105 */     ArrayList localArrayList1 = Lists.newArrayList();
/*  93:106 */     ArrayList localArrayList2 = Lists.newArrayList();
/*  94:107 */     ArrayList localArrayList3 = Lists.newArrayList();
/*  95:108 */     File localFile1 = new File(this.a, paramString);
/*  96:109 */     File localFile2 = new File(localFile1, "DIM-1");
/*  97:110 */     File localFile3 = new File(localFile1, "DIM1");
/*  98:    */     
/*  99:112 */     b.info("Scanning folders...");
/* 100:    */     
/* 101:    */ 
/* 102:115 */     a(localFile1, localArrayList1);
/* 103:118 */     if (localFile2.exists()) {
/* 104:119 */       a(localFile2, localArrayList2);
/* 105:    */     }
/* 106:121 */     if (localFile3.exists()) {
/* 107:122 */       a(localFile3, localArrayList3);
/* 108:    */     }
/* 109:125 */     int i = localArrayList1.size() + localArrayList2.size() + localArrayList3.size();
/* 110:126 */     b.info("Total conversion count is " + i);
/* 111:    */     
/* 112:128 */     WorldInfo localbqo = c(paramString);
/* 113:    */     
/* 114:130 */     Object localObject = null;
/* 115:131 */     if (localbqo.u() == WorldType.FLAT) {
/* 116:132 */       localObject = new asc(arm.q, 0.5F);
/* 117:    */     } else {
/* 118:134 */       localObject = new arz(localbqo.b(), localbqo.u(), localbqo.B());
/* 119:    */     }
/* 120:138 */     a(new File(localFile1, "region"), localArrayList1, (arz)localObject, 0, i, paramuy);
/* 121:    */     
/* 122:140 */     a(new File(localFile2, "region"), localArrayList2, new asc(arm.x, 0.0F), localArrayList1.size(), i, paramuy);
/* 123:    */     
/* 124:142 */     a(new File(localFile3, "region"), localArrayList3, new asc(arm.y, 0.0F), localArrayList1.size() + localArrayList2.size(), i, paramuy);
/* 125:    */     
/* 126:144 */     localbqo.e(19133);
/* 127:145 */     if (localbqo.u() == WorldType.DEFAULT_1_1) {
/* 128:146 */       localbqo.a(WorldType.DEFAULT);
/* 129:    */     }
/* 130:149 */     g(paramString);
/* 131:    */     
/* 132:151 */     bqy localbqy = a(paramString, false);
/* 133:152 */     localbqy.a(localbqo);
/* 134:    */     
/* 135:154 */     return true;
/* 136:    */   }
/* 137:    */   
/* 138:    */   private void g(String paramString)
/* 139:    */   {
/* 140:158 */     File localFile1 = new File(this.a, paramString);
/* 141:159 */     if (!localFile1.exists())
/* 142:    */     {
/* 143:160 */       b.warn("Unable to create level.dat_mcr backup");
/* 144:161 */       return;
/* 145:    */     }
/* 146:164 */     File localFile2 = new File(localFile1, "level.dat");
/* 147:165 */     if (!localFile2.exists())
/* 148:    */     {
/* 149:166 */       b.warn("Unable to create level.dat_mcr backup");
/* 150:167 */       return;
/* 151:    */     }
/* 152:170 */     File localFile3 = new File(localFile1, "level.dat_mcr");
/* 153:171 */     if (!localFile2.renameTo(localFile3)) {
/* 154:172 */       b.warn("Unable to create level.dat_mcr backup");
/* 155:    */     }
/* 156:    */   }
/* 157:    */   
/* 158:    */   private void a(File paramFile, Iterable<File> paramIterable, arz paramarz, int paramInt1, int paramInt2, uy paramuy)
/* 159:    */   {
/* 160:177 */     for (File localFile : paramIterable)
/* 161:    */     {
/* 162:178 */       a(paramFile, localFile, paramarz, paramInt1, paramInt2, paramuy);
/* 163:    */       
/* 164:180 */       paramInt1++;
/* 165:181 */       int i = (int)Math.round(100.0D * paramInt1 / paramInt2);
/* 166:182 */       paramuy.a(i);
/* 167:    */     }
/* 168:    */   }
/* 169:    */   
/* 170:    */   private void a(File paramFile1, File paramFile2, arz paramarz, int paramInt1, int paramInt2, uy paramuy)
/* 171:    */   {
/* 172:    */     try
/* 173:    */     {
/* 174:188 */       String str = paramFile2.getName();
/* 175:    */       
/* 176:190 */       bfv localbfv1 = new bfv(paramFile2);
/* 177:191 */       bfv localbfv2 = new bfv(new File(paramFile1, str.substring(0, str.length() - ".mcr".length()) + ".mca"));
/* 178:193 */       for (int i = 0; i < 32; i++)
/* 179:    */       {
/* 180:194 */         for (int j = 0; j < 32; j++) {
/* 181:195 */           if ((localbfv1.c(i, j)) && (!localbfv2.c(i, j)))
/* 182:    */           {
/* 183:196 */             DataInputStream localDataInputStream = localbfv1.a(i, j);
/* 184:197 */             if (localDataInputStream == null)
/* 185:    */             {
/* 186:198 */               b.warn("Failed to fetch input stream");
/* 187:    */             }
/* 188:    */             else
/* 189:    */             {
/* 190:201 */               NBTTagCompound localfn1 = fz.a(localDataInputStream);
/* 191:202 */               localDataInputStream.close();
/* 192:    */               
/* 193:204 */               NBTTagCompound localfn2 = localfn1.getCompoundTag("Level");
/* 194:205 */               bfu localbfu = bft.a(localfn2);
/* 195:    */               
/* 196:207 */               NBTTagCompound localfn3 = new NBTTagCompound();
/* 197:208 */               NBTTagCompound localfn4 = new NBTTagCompound();
/* 198:209 */               localfn3.setNBT("Level", localfn4);
/* 199:210 */               bft.a(localbfu, localfn4, paramarz);
/* 200:    */               
/* 201:212 */               DataOutputStream localDataOutputStream = localbfv2.b(i, j);
/* 202:213 */               fz.a(localfn3, (DataOutput)localDataOutputStream);
/* 203:214 */               localDataOutputStream.close();
/* 204:    */             }
/* 205:    */           }
/* 206:    */         }
/* 207:217 */         int j = (int)Math.round(100.0D * (paramInt1 * 1024) / (paramInt2 * 1024));
/* 208:218 */         int k = (int)Math.round(100.0D * ((i + 1) * 32 + paramInt1 * 1024) / (paramInt2 * 1024));
/* 209:219 */         if (k > j) {
/* 210:220 */           paramuy.a(k);
/* 211:    */         }
/* 212:    */       }
/* 213:224 */       localbfv1.c();
/* 214:225 */       localbfv2.c();
/* 215:    */     }
/* 216:    */     catch (IOException localIOException)
/* 217:    */     {
/* 218:227 */       localIOException.printStackTrace();
/* 219:    */     }
/* 220:    */   }
/* 221:    */   
/* 222:    */   private void a(File paramFile, Collection paramCollection)
/* 223:    */   {
/* 224:232 */     File localFile = new File(paramFile, "region");
/* 225:233 */     File[] arrayOfFile = localFile.listFiles(new bqk(this));
/* 226:240 */     if (arrayOfFile != null) {
/* 227:241 */       Collections.addAll(paramCollection, arrayOfFile);
/* 228:    */     }
/* 229:    */   }
/* 230:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqj
 * JD-Core Version:    0.7.0.1
 */