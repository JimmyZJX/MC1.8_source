package net.minecraft.src;
/*   1:    */ import com.google.common.collect.ImmutableList;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import com.google.common.hash.HashCode;
/*   4:    */ import com.google.common.hash.HashFunction;
/*   5:    */ import com.google.common.hash.Hashing;
/*   6:    */ import com.google.common.io.Files;
/*   7:    */ import com.google.common.util.concurrent.Futures;
/*   8:    */ import com.google.common.util.concurrent.ListenableFuture;
/*   9:    */ import com.google.common.util.concurrent.SettableFuture;
/*  10:    */ import java.io.File;
/*  11:    */ import java.io.FileFilter;
/*  12:    */ import java.io.IOException;
/*  13:    */ import java.util.ArrayList;
/*  14:    */ import java.util.Arrays;
/*  15:    */ import java.util.Collections;
/*  16:    */ import java.util.Iterator;
/*  17:    */ import java.util.List;
/*  18:    */ import java.util.Map;
/*  19:    */ import java.util.concurrent.locks.ReentrantLock;
/*  20:    */ import org.apache.commons.io.FileUtils;
/*  21:    */ import org.apache.logging.log4j.LogManager;
/*  22:    */ import org.apache.logging.log4j.Logger;
/*  23:    */ 
/*  24:    */ public class cvo
/*  25:    */ {
/*  26: 38 */   private static final Logger c = LogManager.getLogger();
/*  27: 41 */   private static final FileFilter d = new cvp();
/*  28:    */   private final File e;
/*  29:    */   public final cvm a;
/*  30:    */   private final File f;
/*  31:    */   public final cwk b;
/*  32:    */   private cvm g;
/*  33: 58 */   private final ReentrantLock h = new ReentrantLock();
/*  34:    */   private ListenableFuture i;
/*  35: 61 */   private List<cvs> j = Lists.newArrayList();
/*  36: 62 */   private List<cvs> k = Lists.newArrayList();
/*  37:    */   
/*  38:    */   public cvo(File paramFile1, File paramFile2, cvm paramcvm, cwk paramcwk, bto parambto)
/*  39:    */   {
/*  40: 65 */     this.e = paramFile1;
/*  41: 66 */     this.f = paramFile2;
/*  42: 67 */     this.a = paramcvm;
/*  43: 68 */     this.b = paramcwk;
/*  44:    */     
/*  45: 70 */     g();
/*  46:    */     
/*  47: 72 */     a();
/*  48: 74 */     for (Iterator localIterator1 = parambto.k.iterator(); localIterator1.hasNext();)
/*  49:    */     {
/*  50: 74 */       String str = (String)localIterator1.next();
/*  51: 75 */       for (cvs localcvs : this.j) {
/*  52: 76 */         if (localcvs.d().equals(str))
/*  53:    */         {
/*  54: 77 */           this.k.add(localcvs);
/*  55: 78 */           break;
/*  56:    */         }
/*  57:    */       }
/*  58:    */     }
/*  59:    */     
/*  60:    */   }
/*  61:    */   
/*  62:    */   private void g()
/*  63:    */   {
/*  64: 85 */     if ((!this.e.isDirectory()) && (
/*  65: 86 */       (!this.e.delete()) || (!this.e.mkdirs()))) {
/*  66: 87 */       c.debug("Unable to create resourcepack folder: " + this.e);
/*  67:    */     }
/*  68:    */   }
/*  69:    */   
/*  70:    */   private List h()
/*  71:    */   {
/*  72: 93 */     if (this.e.isDirectory()) {
/*  73: 94 */       return Arrays.asList(this.e.listFiles(d));
/*  74:    */     }
/*  75: 97 */     return Collections.emptyList();
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void a()
/*  79:    */   {
/*  80:101 */     ArrayList localArrayList = Lists.newArrayList();
/*  81:103 */     for (Iterator localIterator = h().iterator(); localIterator.hasNext();)
/*  82:    */     {
/*  83:103 */       File localObject = (File)localIterator.next();
/*  84:104 */       cvs localcvs = new cvs(this, (File)localObject, null);
/*  85:106 */       if (!this.j.contains(localcvs))
/*  86:    */       {
/*  87:    */         try
/*  88:    */         {
/*  89:108 */           localcvs.a();
/*  90:109 */           localArrayList.add(localcvs);
/*  91:    */         }
/*  92:    */         catch (Exception localException)
/*  93:    */         {
/*  94:112 */           localArrayList.remove(localcvs);
/*  95:    */         }
/*  96:    */       }
/*  97:    */       else
/*  98:    */       {
/*  99:115 */         int m = this.j.indexOf(localcvs);
/* 100:116 */         if ((m > -1) && (m < this.j.size())) {
/* 101:117 */           localArrayList.add(this.j.get(m));
/* 102:    */         }
/* 103:    */       }
/* 104:    */     }
/* 105:    */     Object localObject;
/* 106:122 */     this.j.removeAll(localArrayList);
/* 107:123 */     for (Iterator<cvs> localIterator = this.j.iterator(); localIterator.hasNext();)
/* 108:    */     {
/* 109:123 */       localObject = (cvs)localIterator.next();
/* 110:124 */       ((cvs)localObject).b();
/* 111:    */     }
/* 112:127 */     this.j = localArrayList;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public List b()
/* 116:    */   {
/* 117:131 */     return ImmutableList.copyOf(this.j);
/* 118:    */   }
/* 119:    */   
/* 120:    */   public List<cvs> c()
/* 121:    */   {
/* 122:135 */     return ImmutableList.copyOf(this.k);
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void a(List paramList)
/* 126:    */   {
/* 127:139 */     this.k.clear();
/* 128:140 */     this.k.addAll(paramList);
/* 129:    */   }
/* 130:    */   
/* 131:    */   public File d()
/* 132:    */   {
/* 133:144 */     return this.e;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public ListenableFuture a(String paramString1, String paramString2)
/* 137:    */   {
/* 138:    */     String str1;
/* 139:150 */     if (paramString2.matches("^[a-f0-9]{40}$"))
/* 140:    */     {
/* 141:151 */       str1 = paramString2;
/* 142:    */     }
/* 143:    */     else
/* 144:    */     {
/* 145:153 */       str1 = paramString1.substring(paramString1.lastIndexOf("/") + 1);
/* 146:154 */       if (str1.contains("?")) {
/* 147:155 */         str1 = str1.substring(0, str1.indexOf("?"));
/* 148:    */       }
/* 149:157 */       if (!str1.endsWith(".zip")) {
/* 150:158 */         return Futures.immediateFailedFuture(new IllegalArgumentException("Invalid filename; must end in .zip"));
/* 151:    */       }
/* 152:160 */       str1 = "legacy_" + str1.replaceAll("\\W", "");
/* 153:    */     }
/* 154:163 */     File localFile = new File(this.f, str1);
/* 155:    */     
/* 156:165 */     this.h.lock();
/* 157:    */     try
/* 158:    */     {
/* 159:167 */       f();
/* 160:169 */       if ((localFile.exists()) && (paramString2.length() == 40)) {
/* 161:    */         try
/* 162:    */         {
/* 163:171 */           String str2 = Hashing.sha1().hashBytes(Files.toByteArray(localFile)).toString();
/* 164:172 */           if (str2.equals(paramString2)) {
/* 165:173 */             return a(localFile);
/* 166:    */           }
/* 167:175 */           c.warn("File " + localFile + " had wrong hash (expected " + paramString2 + ", found " + str2 + "). Deleting it.");
/* 168:176 */           FileUtils.deleteQuietly(localFile);
/* 169:    */         }
/* 170:    */         catch (IOException localIOException)
/* 171:    */         {
/* 172:179 */           c.warn("File " + localFile + " couldn't be hashed. Deleting it.", localIOException);
/* 173:180 */           FileUtils.deleteQuietly(localFile);
/* 174:    */         }
/* 175:    */       }
/* 176:184 */       bxc localbxc = new bxc();
/* 177:185 */       Object localObject1 = bsu.ai();
/* 178:    */       
/* 179:187 */       bsu localbsu = bsu.z();
/* 180:188 */       Futures.getUnchecked(localbsu.a(new cvq(this, localbsu, localbxc)));
/* 181:    */       
/* 182:    */ 
/* 183:    */ 
/* 184:    */ 
/* 185:    */ 
/* 186:    */ 
/* 187:195 */       SettableFuture localSettableFuture = SettableFuture.create();
/* 188:196 */       this.i = ui.a(localFile, paramString1, (Map)localObject1, 52428800, localbxc, localbsu.M());
/* 189:197 */       Futures.addCallback(this.i, new cvr(this, localFile, localSettableFuture));
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
/* 200:    */ 
/* 201:209 */       return this.i;
/* 202:    */     }
/* 203:    */     finally
/* 204:    */     {
/* 205:211 */       this.h.unlock();
/* 206:    */     }
/* 207:    */   }
/* 208:    */   
/* 209:    */   public ListenableFuture a(File paramFile)
/* 210:    */   {
/* 211:216 */     this.g = new cve(paramFile);
/* 212:217 */     return bsu.z().A();
/* 213:    */   }
/* 214:    */   
/* 215:    */   public cvm e()
/* 216:    */   {
/* 217:221 */     return this.g;
/* 218:    */   }
/* 219:    */   
/* 220:    */   public void f()
/* 221:    */   {
/* 222:225 */     this.h.lock();
/* 223:    */     try
/* 224:    */     {
/* 225:227 */       if (this.i != null) {
/* 226:228 */         this.i.cancel(true);
/* 227:    */       }
/* 228:230 */       this.i = null;
/* 229:231 */       this.g = null;
/* 230:    */     }
/* 231:    */     finally
/* 232:    */     {
/* 233:233 */       this.h.unlock();
/* 234:    */     }
/* 235:    */   }
/* 236:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cvo
 * JD-Core Version:    0.7.0.1
 */