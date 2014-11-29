package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import net.minecraft.server.MinecraftServer;
/*   3:    */ 
/*   4:    */ public class bk
/*   5:    */   extends CommandBase
/*   6:    */ {
/*   7:    */   public String c()
/*   8:    */   {
/*   9: 25 */     return "execute";
/*  10:    */   }
/*  11:    */   
/*  12:    */   public int a()
/*  13:    */   {
/*  14: 30 */     return 2;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public String c(ICommandSender paramae)
/*  18:    */   {
/*  19: 35 */     return "commands.execute.usage";
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  23:    */   {
/*  24: 40 */     if (paramArrayOfString.length < 5) {
/*  25: 41 */       throw new WrongUsageException("commands.execute.usage", new Object[0]);
/*  26:    */     }
/*  27: 44 */     Entity localwv = a(paramae, paramArrayOfString[0], Entity.class);
/*  28: 45 */     double d1 = b(localwv.xPos, paramArrayOfString[1], false);
/*  29: 46 */     double d2 = b(localwv.yPos, paramArrayOfString[2], false);
/*  30: 47 */     double d3 = b(localwv.zPos, paramArrayOfString[3], false);
/*  31: 48 */     BlockPosition localdt1 = new BlockPosition(d1, d2, d3);
/*  32:    */     
/*  33: 50 */     int i = 4;
/*  34: 51 */     if (("detect".equals(paramArrayOfString[4])) && (paramArrayOfString.length > 10))
/*  35:    */     {
/*  36: 52 */       World localObject = paramae.e();
/*  37: 53 */       double d4 = b(d1, paramArrayOfString[5], false);
/*  38: 54 */       double d5 = b(d2, paramArrayOfString[6], false);
/*  39: 55 */       double d6 = b(d3, paramArrayOfString[7], false);
/*  40: 56 */       BlockType localatr = g(paramae, paramArrayOfString[8]);
/*  41: 57 */       int k = a(paramArrayOfString[9], -1, 15);
/*  42: 58 */       BlockPosition localdt2 = new BlockPosition(d4, d5, d6);
/*  43: 59 */       Block localbec = ((World)localObject).getBlock(localdt2);
/*  44: 60 */       if ((localbec.getType() != localatr) || ((k >= 0) && (localbec.getType().c(localbec) != k))) {
/*  45: 61 */         throw new CommandException("commands.execute.failed", new Object[] { "detect", localwv.getName() });
/*  46:    */       }
/*  47: 63 */       i = 10;
/*  48:    */     }
/*  49: 66 */     Object localObject = a(paramArrayOfString, i);
/*  50: 67 */     ICommandSender localae = paramae;
/*  51: 68 */     bl localbl = new bl(this, localwv, localae, localdt1, d1, d2, d3);
/*  52:    */     
/*  53:    */ 
/*  54:    */ 
/*  55:    */ 
/*  56:    */ 
/*  57:    */ 
/*  58:    */ 
/*  59:    */ 
/*  60:    */ 
/*  61:    */ 
/*  62:    */ 
/*  63:    */ 
/*  64:    */ 
/*  65:    */ 
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
/*  80:    */ 
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
/* 102:    */ 
/* 103:    */ 
/* 104:121 */     ad localad = MinecraftServer.M().O();
/* 105:    */     try
/* 106:    */     {
/* 107:123 */       int j = localad.a(localbl, (String)localObject);
/* 108:124 */       if (j < 1) {
/* 109:125 */         throw new CommandException("commands.execute.allInvocationsFailed", new Object[] { localObject });
/* 110:    */       }
/* 111:    */     }
/* 112:    */     catch (Throwable localThrowable)
/* 113:    */     {
/* 114:128 */       throw new CommandException("commands.execute.failed", new Object[] { localObject, localwv.getName() });
/* 115:    */     }
/* 116:    */   }
/* 117:    */   
/* 118:    */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 119:    */   {
/* 120:135 */     if (paramArrayOfString.length == 1) {
/* 121:136 */       return a(paramArrayOfString, MinecraftServer.M().I());
/* 122:    */     }
/* 123:137 */     if ((paramArrayOfString.length > 1) && (paramArrayOfString.length <= 4)) {
/* 124:138 */       return a(paramArrayOfString, 1, paramdt);
/* 125:    */     }
/* 126:139 */     if ((paramArrayOfString.length > 5) && (paramArrayOfString.length <= 8) && ("detect".equals(paramArrayOfString[4]))) {
/* 127:140 */       return a(paramArrayOfString, 5, paramdt);
/* 128:    */     }
/* 129:141 */     if ((paramArrayOfString.length == 9) && ("detect".equals(paramArrayOfString[4]))) {
/* 130:142 */       return a(paramArrayOfString, BlockType.c.c());
/* 131:    */     }
/* 132:145 */     return null;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 136:    */   {
/* 137:150 */     return paramInt == 0;
/* 138:    */   }
/* 139:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bk
 * JD-Core Version:    0.7.0.1
 */