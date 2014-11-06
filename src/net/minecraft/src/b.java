package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.io.File;
/*   3:    */ import java.io.FileWriter;
/*   4:    */ import java.io.PrintStream;
/*   5:    */ import java.io.PrintWriter;
/*   6:    */ import java.io.StringWriter;
/*   7:    */ import java.text.SimpleDateFormat;
/*   8:    */ import java.util.Date;
/*   9:    */ import java.util.Iterator;
/*  10:    */ import java.util.List;
/*  11:    */ import org.apache.commons.io.IOUtils;
/*  12:    */ import org.apache.commons.lang3.ArrayUtils;
/*  13:    */ import org.apache.logging.log4j.LogManager;
/*  14:    */ import org.apache.logging.log4j.Logger;
/*  15:    */ 
/*  16:    */ public class b
/*  17:    */ {
/*  18: 22 */   private static final Logger a = LogManager.getLogger();
/*  19:    */   private final String b;
/*  20:    */   private final Throwable c;
/*  21: 25 */   private final j d = new j(this, "System Details");
/*  22: 26 */   private final List<j> e = Lists.newArrayList();
/*  23:    */   private File f;
/*  24: 28 */   private boolean g = true;
/*  25: 29 */   private StackTraceElement[] h = new StackTraceElement[0];
/*  26:    */   
/*  27:    */   public b(String paramString, Throwable paramThrowable)
/*  28:    */   {
/*  29: 32 */     this.b = paramString;
/*  30: 33 */     this.c = paramThrowable;
/*  31:    */     
/*  32: 35 */     h();
/*  33:    */   }
/*  34:    */   
/*  35:    */   private void h()
/*  36:    */   {
/*  37: 39 */     this.d.a("Minecraft Version", new c(this));
/*  38:    */     
/*  39:    */ 
/*  40:    */ 
/*  41:    */ 
/*  42:    */ 
/*  43:    */ 
/*  44: 46 */     this.d.a("Operating System", new d(this));
/*  45:    */     
/*  46:    */ 
/*  47:    */ 
/*  48:    */ 
/*  49:    */ 
/*  50:    */ 
/*  51: 53 */     this.d.a("Java Version", new e(this));
/*  52:    */     
/*  53:    */ 
/*  54:    */ 
/*  55:    */ 
/*  56:    */ 
/*  57:    */ 
/*  58: 60 */     this.d.a("Java VM Version", new f(this));
/*  59:    */     
/*  60:    */ 
/*  61:    */ 
/*  62:    */ 
/*  63:    */ 
/*  64:    */ 
/*  65: 67 */     this.d.a("Memory", new g(this));
/*  66:    */     
/*  67:    */ 
/*  68:    */ 
/*  69:    */ 
/*  70:    */ 
/*  71:    */ 
/*  72:    */ 
/*  73:    */ 
/*  74:    */ 
/*  75:    */ 
/*  76:    */ 
/*  77:    */ 
/*  78:    */ 
/*  79:    */ 
/*  80: 82 */     this.d.a("JVM Flags", new h(this));
/*  81:    */     
/*  82:    */ 
/*  83:    */ 
/*  84:    */ 
/*  85:    */ 
/*  86:    */ 
/*  87:    */ 
/*  88:    */ 
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
/* 102:104 */     this.d.a("IntCache", new i(this));
/* 103:    */   }
/* 104:    */   
/* 105:    */   public String a()
/* 106:    */   {
/* 107:113 */     return this.b;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public Throwable b()
/* 111:    */   {
/* 112:117 */     return this.c;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void a(StringBuilder paramStringBuilder)
/* 116:    */   {
/* 117:129 */     if (((this.h == null) || (this.h.length <= 0)) && (this.e.size() > 0)) {
/* 118:130 */       this.h = ((StackTraceElement[])ArrayUtils.subarray(((j)this.e.get(0)).a(), 0, 1));
/* 119:    */     }
/* 120:133 */     if ((this.h != null) && (this.h.length > 0))
/* 121:    */     {
/* 122:134 */       paramStringBuilder.append("-- Head --\n");
/* 123:135 */       paramStringBuilder.append("Stacktrace:\n");
/* 124:137 */       for (Object localObject2 : this.h)
/* 125:    */       {
/* 126:138 */         paramStringBuilder.append("\t").append("at ").append(localObject2.toString());
/* 127:139 */         paramStringBuilder.append("\n");
/* 128:    */       }
/* 129:142 */       paramStringBuilder.append("\n");
/* 130:    */     }
/* 131:145 */     for (Iterator<j> it = this.e.iterator(); it.hasNext();)
/* 132:    */     {
/* 133:145 */       j localj = it.next();
/* 134:146 */       localj.a(paramStringBuilder);
/* 135:147 */       paramStringBuilder.append("\n\n");
/* 136:    */     }
/* 137:150 */     this.d.a(paramStringBuilder);
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String d()
/* 141:    */   {
/* 142:154 */     StringWriter localStringWriter = null;
/* 143:155 */     PrintWriter localPrintWriter = null;
/* 144:156 */     Object localObject1 = this.c;
/* 145:158 */     if (((Throwable)localObject1).getMessage() == null)
/* 146:    */     {
/* 147:160 */       if ((localObject1 instanceof NullPointerException)) {
/* 148:161 */         localObject1 = new NullPointerException(this.b);
/* 149:162 */       } else if ((localObject1 instanceof StackOverflowError)) {
/* 150:163 */         localObject1 = new StackOverflowError(this.b);
/* 151:164 */       } else if ((localObject1 instanceof OutOfMemoryError)) {
/* 152:165 */         localObject1 = new OutOfMemoryError(this.b);
/* 153:    */       }
/* 154:168 */       ((Throwable)localObject1).setStackTrace(this.c.getStackTrace());
/* 155:    */     }
/* 156:171 */     String str = ((Throwable)localObject1).toString();
/* 157:    */     try
/* 158:    */     {
/* 159:174 */       localStringWriter = new StringWriter();
/* 160:175 */       localPrintWriter = new PrintWriter(localStringWriter);
/* 161:176 */       ((Throwable)localObject1).printStackTrace(localPrintWriter);
/* 162:177 */       str = localStringWriter.toString();
/* 163:    */     }
/* 164:    */     finally
/* 165:    */     {
/* 166:179 */       IOUtils.closeQuietly(localStringWriter);
/* 167:180 */       IOUtils.closeQuietly(localPrintWriter);
/* 168:    */     }
/* 169:183 */     return str;
/* 170:    */   }
/* 171:    */   
/* 172:    */   public String e()
/* 173:    */   {
/* 174:187 */     StringBuilder localStringBuilder = new StringBuilder();
/* 175:    */     
/* 176:189 */     localStringBuilder.append("---- Minecraft Crash Report ----\n");
/* 177:190 */     localStringBuilder.append("// ");
/* 178:191 */     localStringBuilder.append(i());
/* 179:192 */     localStringBuilder.append("\n\n");
/* 180:    */     
/* 181:194 */     localStringBuilder.append("Time: ");
/* 182:195 */     localStringBuilder.append(new SimpleDateFormat().format(new Date()));
/* 183:196 */     localStringBuilder.append("\n");
/* 184:    */     
/* 185:198 */     localStringBuilder.append("Description: ");
/* 186:199 */     localStringBuilder.append(this.b);
/* 187:200 */     localStringBuilder.append("\n\n");
/* 188:    */     
/* 189:202 */     localStringBuilder.append(d());
/* 190:203 */     localStringBuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
/* 191:205 */     for (int i = 0; i < 87; i++) {
/* 192:206 */       localStringBuilder.append("-");
/* 193:    */     }
/* 194:208 */     localStringBuilder.append("\n\n");
/* 195:209 */     a(localStringBuilder);
/* 196:    */     
/* 197:211 */     return localStringBuilder.toString();
/* 198:    */   }
/* 199:    */   
/* 200:    */   public File f()
/* 201:    */   {
/* 202:215 */     return this.f;
/* 203:    */   }
/* 204:    */   
/* 205:    */   public boolean a(File paramFile)
/* 206:    */   {
/* 207:219 */     if (this.f != null) {
/* 208:220 */       return false;
/* 209:    */     }
/* 210:222 */     if (paramFile.getParentFile() != null) {
/* 211:223 */       paramFile.getParentFile().mkdirs();
/* 212:    */     }
/* 213:    */     try
/* 214:    */     {
/* 215:227 */       FileWriter localFileWriter = new FileWriter(paramFile);
/* 216:228 */       localFileWriter.write(e());
/* 217:229 */       localFileWriter.close();
/* 218:    */       
/* 219:231 */       this.f = paramFile;
/* 220:232 */       return true;
/* 221:    */     }
/* 222:    */     catch (Throwable localThrowable)
/* 223:    */     {
/* 224:234 */       a.error("Could not save crash report to " + paramFile, localThrowable);
/* 225:    */     }
/* 226:235 */     return false;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public j g()
/* 230:    */   {
/* 231:240 */     return this.d;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public j a(String paramString)
/* 235:    */   {
/* 236:244 */     return a(paramString, 1);
/* 237:    */   }
/* 238:    */   
/* 239:    */   public j a(String paramString, int paramInt)
/* 240:    */   {
/* 241:248 */     j localj1 = new j(this, paramString);
/* 242:250 */     if (this.g)
/* 243:    */     {
/* 244:251 */       int i = localj1.a(paramInt);
/* 245:252 */       StackTraceElement[] arrayOfStackTraceElement = this.c.getStackTrace();
/* 246:253 */       StackTraceElement localStackTraceElement1 = null;
/* 247:254 */       StackTraceElement localStackTraceElement2 = null;
/* 248:    */       
/* 249:256 */       int j = arrayOfStackTraceElement.length - i;
/* 250:257 */       if (j < 0) {
/* 251:258 */         System.out.println("Negative index in crash report handler (" + arrayOfStackTraceElement.length + "/" + i + ")");
/* 252:    */       }
/* 253:261 */       if ((arrayOfStackTraceElement != null) && (0 <= j) && (j < arrayOfStackTraceElement.length))
/* 254:    */       {
/* 255:262 */         localStackTraceElement1 = arrayOfStackTraceElement[j];
/* 256:264 */         if (arrayOfStackTraceElement.length + 1 - i < arrayOfStackTraceElement.length) {
/* 257:265 */           localStackTraceElement2 = arrayOfStackTraceElement[(arrayOfStackTraceElement.length + 1 - i)];
/* 258:    */         }
/* 259:    */       }
/* 260:269 */       this.g = localj1.a(localStackTraceElement1, localStackTraceElement2);
/* 261:271 */       if ((i > 0) && (!this.e.isEmpty()))
/* 262:    */       {
/* 263:272 */         j localj2 = (j)this.e.get(this.e.size() - 1);
/* 264:273 */         localj2.b(i);
/* 265:    */       }
/* 266:274 */       else if ((arrayOfStackTraceElement != null) && (arrayOfStackTraceElement.length >= i) && (0 <= j) && (j < arrayOfStackTraceElement.length))
/* 267:    */       {
/* 268:275 */         this.h = new StackTraceElement[j];
/* 269:276 */         System.arraycopy(arrayOfStackTraceElement, 0, this.h, 0, this.h.length);
/* 270:    */       }
/* 271:    */       else
/* 272:    */       {
/* 273:278 */         this.g = false;
/* 274:    */       }
/* 275:    */     }
/* 276:282 */     this.e.add(localj1);
/* 277:283 */     return localj1;
/* 278:    */   }
/* 279:    */   
/* 280:    */   private static String i()
/* 281:    */   {
/* 282:288 */     String[] arrayOfString = { "Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine." };
/* 283:    */     try
/* 284:    */     {
/* 285:326 */       return arrayOfString[((int)(System.nanoTime() % arrayOfString.length))];
/* 286:    */     }
/* 287:    */     catch (Throwable localThrowable) {}
/* 288:328 */     return "Witty comment unavailable :(";
/* 289:    */   }
/* 290:    */   
/* 291:    */   public static b a(Throwable paramThrowable, String paramString)
/* 292:    */   {
/* 293:    */     b localb;
/* 294:335 */     if ((paramThrowable instanceof u)) {
/* 295:336 */       localb = ((u)paramThrowable).a();
/* 296:    */     } else {
/* 297:338 */       localb = new b(paramString, paramThrowable);
/* 298:    */     }
/* 299:341 */     return localb;
/* 300:    */   }
/* 301:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     b
 * JD-Core Version:    0.7.0.1
 */