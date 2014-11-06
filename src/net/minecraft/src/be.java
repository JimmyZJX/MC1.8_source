package net.minecraft.src;
/*   1:    */ import java.io.File;
/*   2:    */ import java.io.FileWriter;
/*   3:    */ import java.text.SimpleDateFormat;
/*   4:    */ import java.util.Date;
/*   5:    */ import java.util.List;
/*   6:    */ import net.minecraft.server.MinecraftServer;
/*   7:    */ import org.apache.logging.log4j.LogManager;
/*   8:    */ import org.apache.logging.log4j.Logger;
/*   9:    */ 
/*  10:    */ public class be
/*  11:    */   extends CommandBase
/*  12:    */ {
/*  13: 22 */   private static final Logger a = LogManager.getLogger();
/*  14:    */   private long b;
/*  15:    */   private int c;
/*  16:    */   
/*  17:    */   public String c()
/*  18:    */   {
/*  19: 28 */     return "debug";
/*  20:    */   }
/*  21:    */   
/*  22:    */   public int a()
/*  23:    */   {
/*  24: 33 */     return 3;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String c(ICommandSender paramae)
/*  28:    */   {
/*  29: 38 */     return "commands.debug.usage";
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  33:    */   {
/*  34: 43 */     if (paramArrayOfString.length < 1) {
/*  35: 44 */       throw new WrongUsageException("commands.debug.usage", new Object[0]);
/*  36:    */     }
/*  37: 47 */     if (paramArrayOfString[0].equals("start"))
/*  38:    */     {
/*  39: 48 */       if (paramArrayOfString.length != 1) {
/*  40: 49 */         throw new WrongUsageException("commands.debug.usage", new Object[0]);
/*  41:    */       }
/*  42: 52 */       a(paramae, this, "commands.debug.start", new Object[0]);
/*  43:    */       
/*  44: 54 */       MinecraftServer.M().as();
/*  45: 55 */       this.b = MinecraftServer.ax();
/*  46: 56 */       this.c = MinecraftServer.M().ar();
/*  47:    */     }
/*  48: 57 */     else if (paramArrayOfString[0].equals("stop"))
/*  49:    */     {
/*  50: 58 */       if (paramArrayOfString.length != 1) {
/*  51: 59 */         throw new WrongUsageException("commands.debug.usage", new Object[0]);
/*  52:    */       }
/*  53: 62 */       if (!MinecraftServer.M().b.a) {
/*  54: 63 */         throw new CommandException("commands.debug.notStarted", new Object[0]);
/*  55:    */       }
/*  56: 66 */       long l1 = MinecraftServer.ax();
/*  57: 67 */       int i = MinecraftServer.M().ar();
/*  58:    */       
/*  59: 69 */       long l2 = l1 - this.b;
/*  60: 70 */       int j = i - this.c;
/*  61: 71 */       a(l2, j);
/*  62:    */       
/*  63: 73 */       MinecraftServer.M().b.a = false;
/*  64: 74 */       a(paramae, this, "commands.debug.stop", new Object[] { Float.valueOf((float)l2 / 1000.0F), Integer.valueOf(j) });
/*  65:    */     }
/*  66: 75 */     else if (paramArrayOfString[0].equals("chunk"))
/*  67:    */     {
/*  68: 76 */       if (paramArrayOfString.length != 4) {
/*  69: 77 */         throw new WrongUsageException("commands.debug.usage", new Object[0]);
/*  70:    */       }
/*  71: 80 */       BlockPosition localdt = a(paramae, paramArrayOfString, 1, true);
/*  72:    */     }
/*  73:    */   }
/*  74:    */   
/*  75:    */   private void a(long paramLong, int paramInt)
/*  76:    */   {
/*  77: 85 */     File localFile = new File(MinecraftServer.M().d("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
/*  78:    */     
/*  79: 87 */     localFile.getParentFile().mkdirs();
/*  80:    */     try
/*  81:    */     {
/*  82: 90 */       FileWriter localFileWriter = new FileWriter(localFile);
/*  83: 91 */       localFileWriter.write(b(paramLong, paramInt));
/*  84: 92 */       localFileWriter.close();
/*  85:    */     }
/*  86:    */     catch (Throwable localThrowable)
/*  87:    */     {
/*  88: 94 */       a.error("Could not save profiler results to " + localFile, localThrowable);
/*  89:    */     }
/*  90:    */   }
/*  91:    */   
/*  92:    */   private String b(long paramLong, int paramInt)
/*  93:    */   {
/*  94: 99 */     StringBuilder localStringBuilder = new StringBuilder();
/*  95:    */     
/*  96:101 */     localStringBuilder.append("---- Minecraft Profiler Results ----\n");
/*  97:102 */     localStringBuilder.append("// ");
/*  98:103 */     localStringBuilder.append(d());
/*  99:104 */     localStringBuilder.append("\n\n");
/* 100:    */     
/* 101:106 */     localStringBuilder.append("Time span: ").append(paramLong).append(" ms\n");
/* 102:107 */     localStringBuilder.append("Tick span: ").append(paramInt).append(" ticks\n");
/* 103:108 */     localStringBuilder.append("// This is approximately ").append(String.format("%.2f", new Object[] { Float.valueOf(paramInt / ((float)paramLong / 1000.0F)) })).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
/* 104:    */     
/* 105:110 */     localStringBuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
/* 106:    */     
/* 107:112 */     a(0, "root", localStringBuilder);
/* 108:    */     
/* 109:114 */     localStringBuilder.append("--- END PROFILE DUMP ---\n\n");
/* 110:    */     
/* 111:116 */     return localStringBuilder.toString();
/* 112:    */   }
/* 113:    */   
/* 114:    */   private void a(int paramInt, String paramString, StringBuilder paramStringBuilder)
/* 115:    */   {
/* 116:120 */     List localList = MinecraftServer.M().b.b(paramString);
/* 117:121 */     if ((localList == null) || (localList.size() < 3)) {
/* 118:122 */       return;
/* 119:    */     }
/* 120:125 */     for (int i = 1; i < localList.size(); i++)
/* 121:    */     {
/* 122:126 */       ux localux = (ux)localList.get(i);
/* 123:    */       
/* 124:128 */       paramStringBuilder.append(String.format("[%02d] ", new Object[] { Integer.valueOf(paramInt) }));
/* 125:129 */       for (int j = 0; j < paramInt; j++) {
/* 126:130 */         paramStringBuilder.append(" ");
/* 127:    */       }
/* 128:132 */       paramStringBuilder.append(localux.c).append(" - ").append(String.format("%.2f", new Object[] { Double.valueOf(localux.a) })).append("%/").append(String.format("%.2f", new Object[] { Double.valueOf(localux.b) })).append("%\n");
/* 129:136 */       if (!localux.c.equals("unspecified")) {
/* 130:    */         try
/* 131:    */         {
/* 132:138 */           a(paramInt + 1, paramString + "." + localux.c, paramStringBuilder);
/* 133:    */         }
/* 134:    */         catch (Exception localException)
/* 135:    */         {
/* 136:140 */           paramStringBuilder.append("[[ EXCEPTION ").append(localException).append(" ]]");
/* 137:    */         }
/* 138:    */       }
/* 139:    */     }
/* 140:    */   }
/* 141:    */   
/* 142:    */   private static String d()
/* 143:    */   {
/* 144:148 */     String[] arrayOfString = { "Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server." };
/* 145:    */     try
/* 146:    */     {
/* 147:166 */       return arrayOfString[((int)(java.lang.System.nanoTime() % arrayOfString.length))];
/* 148:    */     }
/* 149:    */     catch (Throwable localThrowable) {}
/* 150:168 */     return "Witty comment unavailable :(";
/* 151:    */   }
/* 152:    */   
/* 153:    */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 154:    */   {
/* 155:175 */     if (paramArrayOfString.length == 1) {
/* 156:176 */       return a(paramArrayOfString, new String[] { "start", "stop" });
/* 157:    */     }
/* 158:179 */     return null;
/* 159:    */   }
/* 160:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     be
 * JD-Core Version:    0.7.0.1
 */