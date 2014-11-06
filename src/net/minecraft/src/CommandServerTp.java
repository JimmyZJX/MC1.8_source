package net.minecraft.src;
/*   1:    */ import java.util.EnumSet;
/*   2:    */ import java.util.List;
/*   4:    */ import net.minecraft.server.MinecraftServer;
/*   5:    */ 
/*   6:    */ public class CommandServerTp
/*   7:    */   extends CommandBase
/*   8:    */ {
/*   9:    */   public String c()
/*  10:    */   {
/*  11: 22 */     return "tp";
/*  12:    */   }
/*  13:    */   
/*  14:    */   public int a()
/*  15:    */   {
/*  16: 27 */     return 2;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public String c(ICommandSender sender)
/*  20:    */   {
/*  21: 32 */     return "commands.tp.usage";
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void a(ICommandSender sender, String[] arguments) throws CommandException
/*  25:    */   {
/*  26: 37 */     if (arguments.length < 1) {
/*  27: 38 */       throw new WrongUsageException("commands.tp.usage", new Object[0]);
/*  28:    */     }
/*  29: 41 */     int i = 0;
/*  30:    */     Entity target;
/*  31: 43 */     if ((arguments.length == 2) || (arguments.length == 4) || (arguments.length == 6))
/*  32:    */     {
/*  33: 44 */       target = b(sender, arguments[0]);
/*  34: 45 */       i = 1;
/*  35:    */     }
/*  36:    */     else
/*  37:    */     {
/*  38: 47 */       target = b(sender);
/*  39:    */     }
/*  40: 50 */     if ((arguments.length == 1) || (arguments.length == 2))
/*  41:    */     {
/*  42: 51 */       Entity destination = b(sender, arguments[(arguments.length - 1)]);
/*  43: 52 */       if (destination.world != target.world) {
/*  44: 53 */         throw new CommandException("commands.tp.notSameDimension", new Object[0]);
/*  45:    */       }
/*  46: 56 */       target.mount((Entity)null);
/*  47: 57 */       if ((target instanceof qw)) {
/*  48: 58 */         ((qw)target).a.a(destination.xPos, destination.yPos, destination.zPos, destination.yaw, destination.pitch);
/*  49:    */       } else {
/*  50: 60 */         target.setPositionAndAngles(destination.xPos, destination.yPos, destination.zPos, destination.yaw, destination.pitch);
/*  51:    */       }
/*  52: 62 */       a(sender, this, "commands.tp.success", new Object[] { target.getName(), destination.getName() });
/*  53: 63 */       return;
/*  54:    */     }
/*  55: 66 */     if (arguments.length < i + 3) {
/*  56: 67 */       throw new WrongUsageException("commands.tp.usage", new Object[0]);
/*  57:    */     }
/*  58: 70 */     if (target.world == null) {
/*  59: 71 */       return;
/*  60:    */     }
/*  61: 74 */     int j = i;
/*  62: 75 */     aa localaa1 = a(target.xPos, arguments[j++], true);
/*  63: 76 */     aa localaa2 = a(target.yPos, arguments[j++], 0, 0, false);
/*  64: 77 */     aa localaa3 = a(target.zPos, arguments[j++], true);
/*  65: 78 */     aa localaa4 = a(target.yaw, arguments.length > j ? arguments[j++] : "~", false);
/*  66: 79 */     aa localaa5 = a(target.pitch, arguments.length > j ? arguments[j] : "~", false);
/*  67:    */     float f2;
/*  68: 81 */     if ((target instanceof qw))
/*  69:    */     {
/*  70: 82 */       EnumSet<ij> localEnumSet = EnumSet.noneOf(ij.class);
/*  71: 84 */       if (localaa1.c()) {
/*  72: 85 */         localEnumSet.add(ij.a);
/*  73:    */       }
/*  74: 87 */       if (localaa2.c()) {
/*  75: 88 */         localEnumSet.add(ij.b);
/*  76:    */       }
/*  77: 90 */       if (localaa3.c()) {
/*  78: 91 */         localEnumSet.add(ij.c);
/*  79:    */       }
/*  80: 93 */       if (localaa5.c()) {
/*  81: 94 */         localEnumSet.add(ij.e);
/*  82:    */       }
/*  83: 96 */       if (localaa4.c()) {
/*  84: 97 */         localEnumSet.add(ij.d);
/*  85:    */       }
/*  86:100 */       f2 = (float)localaa4.b();
/*  87:101 */       if (!localaa4.c()) {
/*  88:102 */         f2 = MathUtils.wrapDegrees(f2);
/*  89:    */       }
/*  90:104 */       float f3 = (float)localaa5.b();
/*  91:105 */       if (!localaa5.c()) {
/*  92:106 */         f3 = MathUtils.wrapDegrees(f3);
/*  93:    */       }
/*  94:110 */       if ((f3 > 90.0F) || (f3 < -90.0F))
/*  95:    */       {
/*  96:111 */         f3 = MathUtils.wrapDegrees(180.0F - f3);
/*  97:112 */         f2 = MathUtils.wrapDegrees(f2 + 180.0F);
/*  98:    */       }
/*  99:115 */       ((Entity)target).mount((Entity)null);
/* 100:116 */       ((qw)target).a.a(localaa1.b(), localaa2.b(), localaa3.b(), f2, f3, localEnumSet);
/* 101:117 */       ((Entity)target).f(f2);
/* 102:    */     }
/* 103:    */     else
/* 104:    */     {
/* 105:119 */       float f1 = (float)MathUtils.wrapDegrees(localaa4.a());
/* 106:120 */       f2 = (float)MathUtils.wrapDegrees(localaa5.a());
/* 107:123 */       if ((f2 > 90.0F) || (f2 < -90.0F))
/* 108:    */       {
/* 109:124 */         f2 = MathUtils.wrapDegrees(180.0F - f2);
/* 110:125 */         f1 = MathUtils.wrapDegrees(f1 + 180.0F);
/* 111:    */       }
/* 112:128 */       ((Entity)target).setPositionAndAngles(localaa1.a(), localaa2.a(), localaa3.a(), f1, f2);
/* 113:129 */       ((Entity)target).f(f1);
/* 114:    */     }
/* 115:131 */     a(sender, this, "commands.tp.success.coordinates", new Object[] { ((Entity)target).getName(), Double.valueOf(localaa1.a()), Double.valueOf(localaa2.a()), Double.valueOf(localaa3.a()) });
/* 116:    */   }
/* 117:    */   
/* 118:    */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 119:    */   {
/* 120:137 */     if ((paramArrayOfString.length == 1) || (paramArrayOfString.length == 2)) {
/* 121:138 */       return a(paramArrayOfString, MinecraftServer.M().I());
/* 122:    */     }
/* 123:141 */     return null;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 127:    */   {
/* 128:146 */     return paramInt == 0;
/* 129:    */   }
/* 130:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cw
 * JD-Core Version:    0.7.0.1
 */