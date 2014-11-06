package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.io.File;
/*   3:    */ import java.io.FileInputStream;
/*   4:    */ import java.io.FileOutputStream;
/*   5:    */ import java.util.ArrayList;
/*   6:    */ import java.util.List;
/*   7:    */ import org.apache.logging.log4j.LogManager;
/*   8:    */ import org.apache.logging.log4j.Logger;
/*   9:    */ 
/*  10:    */ public class bqn
/*  11:    */   implements bra
/*  12:    */ {
/*  13: 16 */   private static final Logger b = LogManager.getLogger();
/*  14:    */   protected final File a;
/*  15:    */   
/*  16:    */   public bqn(File paramFile)
/*  17:    */   {
/*  18: 21 */     if (!paramFile.exists()) {
/*  19: 22 */       paramFile.mkdirs();
/*  20:    */     }
/*  21: 24 */     this.a = paramFile;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public String a()
/*  25:    */   {
/*  26: 29 */     return "Old Format";
/*  27:    */   }
/*  28:    */   
/*  29:    */   public List<brb> b() throws bqz
/*  30:    */   {
/*  31: 34 */     ArrayList<brb> localArrayList = Lists.newArrayList();
/*  32: 36 */     for (int i = 0; i < 5; i++)
/*  33:    */     {
/*  34: 37 */       String str = "World" + (i + 1);
/*  35:    */       
/*  36: 39 */       WorldInfo localbqo = c(str);
/*  37: 40 */       if (localbqo != null) {
/*  38: 41 */         localArrayList.add(new brb(str, "", localbqo.m(), localbqo.h(), localbqo.r(), false, localbqo.isHardcore(), localbqo.v()));
/*  39:    */       }
/*  40:    */     }
/*  41: 45 */     return localArrayList;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void d() {}
/*  45:    */   
/*  46:    */   public WorldInfo c(String paramString)
/*  47:    */   {
/*  48: 54 */     File localFile1 = new File(this.a, paramString);
/*  49: 55 */     if (!localFile1.exists()) {
/*  50: 56 */       return null;
/*  51:    */     }
/*  52: 59 */     File localFile2 = new File(localFile1, "level.dat");
/*  53:    */     NBTTagCompound localfn3;
/*  54: 60 */     if (localFile2.exists()) {
/*  55:    */       try
/*  56:    */       {
/*  57: 62 */         NBTTagCompound localfn1 = fz.a(new FileInputStream(localFile2));
/*  58: 63 */         localfn3 = localfn1.getCompoundTag("Data");
/*  59: 64 */         return new WorldInfo(localfn3);
/*  60:    */       }
/*  61:    */       catch (Exception localException1)
/*  62:    */       {
/*  63: 66 */         b.error("Exception reading " + localFile2, localException1);
/*  64:    */       }
/*  65:    */     }
/*  66: 70 */     localFile2 = new File(localFile1, "level.dat_old");
/*  67: 71 */     if (localFile2.exists()) {
/*  68:    */       try
/*  69:    */       {
/*  70: 73 */         NBTTagCompound localfn2 = fz.a(new FileInputStream(localFile2));
/*  71: 74 */         localfn3 = localfn2.getCompoundTag("Data");
/*  72: 75 */         return new WorldInfo(localfn3);
/*  73:    */       }
/*  74:    */       catch (Exception localException2)
/*  75:    */       {
/*  76: 77 */         b.error("Exception reading " + localFile2, localException2);
/*  77:    */       }
/*  78:    */     }
/*  79: 80 */     return null;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void a(String paramString1, String paramString2)
/*  83:    */   {
/*  84: 85 */     File localFile1 = new File(this.a, paramString1);
/*  85: 86 */     if (!localFile1.exists()) {
/*  86: 87 */       return;
/*  87:    */     }
/*  88: 90 */     File localFile2 = new File(localFile1, "level.dat");
/*  89: 91 */     if (localFile2.exists()) {
/*  90:    */       try
/*  91:    */       {
/*  92: 93 */         NBTTagCompound localfn1 = fz.a(new FileInputStream(localFile2));
/*  93: 94 */         NBTTagCompound localfn2 = localfn1.getCompoundTag("Data");
/*  94: 95 */         localfn2.setString("LevelName", paramString2);
/*  95:    */         
/*  96: 97 */         fz.a(localfn1, new FileOutputStream(localFile2));
/*  97:    */       }
/*  98:    */       catch (Exception localException)
/*  99:    */       {
/* 100: 99 */         localException.printStackTrace();
/* 101:    */       }
/* 102:    */     }
/* 103:    */   }
/* 104:    */   
/* 105:    */   public boolean d(String paramString)
/* 106:    */   {
/* 107:106 */     File localFile = new File(this.a, paramString);
/* 108:107 */     if (localFile.exists()) {
/* 109:108 */       return false;
/* 110:    */     }
/* 111:    */     try
/* 112:    */     {
/* 113:112 */       localFile.mkdir();
/* 114:113 */       localFile.delete();
/* 115:    */     }
/* 116:    */     catch (Throwable localThrowable)
/* 117:    */     {
/* 118:115 */       b.warn("Couldn't make new level", localThrowable);
/* 119:116 */       return false;
/* 120:    */     }
/* 121:119 */     return true;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public boolean e(String paramString)
/* 125:    */   {
/* 126:124 */     File localFile = new File(this.a, paramString);
/* 127:125 */     if (!localFile.exists()) {
/* 128:126 */       return true;
/* 129:    */     }
/* 130:129 */     b.info("Deleting level " + paramString);
/* 131:131 */     for (int i = 1; i <= 5; i++)
/* 132:    */     {
/* 133:132 */       b.info("Attempt " + i + "...");
/* 134:134 */       if (a(localFile.listFiles())) {
/* 135:    */         break;
/* 136:    */       }
/* 137:137 */       b.warn("Unsuccessful in deleting contents.");
/* 138:140 */       if (i < 5) {
/* 139:    */         try
/* 140:    */         {
/* 141:142 */           Thread.sleep(500L);
/* 142:    */         }
/* 143:    */         catch (InterruptedException localInterruptedException) {}
/* 144:    */       }
/* 145:    */     }
/* 146:148 */     return localFile.delete();
/* 147:    */   }
/* 148:    */   
/* 149:    */   protected static boolean a(File[] paramArrayOfFile)
/* 150:    */   {
/* 151:152 */     for (int i = 0; i < paramArrayOfFile.length; i++)
/* 152:    */     {
/* 153:153 */       File localFile = paramArrayOfFile[i];
/* 154:154 */       b.debug("Deleting " + localFile);
/* 155:156 */       if ((localFile.isDirectory()) && 
/* 156:157 */         (!a(localFile.listFiles())))
/* 157:    */       {
/* 158:158 */         b.warn("Couldn't delete directory " + localFile);
/* 159:159 */         return false;
/* 160:    */       }
/* 161:163 */       if (!localFile.delete())
/* 162:    */       {
/* 163:164 */         b.warn("Couldn't delete file " + localFile);
/* 164:165 */         return false;
/* 165:    */       }
/* 166:    */     }
/* 167:169 */     return true;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public bqy a(String paramString, boolean paramBoolean)
/* 171:    */   {
/* 172:174 */     return new bqm(this.a, paramString, paramBoolean);
/* 173:    */   }
/* 174:    */   
/* 175:    */   public boolean a(String paramString)
/* 176:    */   {
/* 177:179 */     return false;
/* 178:    */   }
/* 179:    */   
/* 180:    */   public boolean b(String paramString)
/* 181:    */   {
/* 182:184 */     return false;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public boolean a(String paramString, uy paramuy)
/* 186:    */   {
/* 187:189 */     return false;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public boolean f(String paramString)
/* 191:    */   {
/* 192:194 */     File localFile = new File(this.a, paramString);
/* 193:195 */     return localFile.isDirectory();
/* 194:    */   }
/* 195:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqn
 * JD-Core Version:    0.7.0.1
 */