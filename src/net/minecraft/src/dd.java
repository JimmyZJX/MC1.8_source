package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.List;

/*   4:    */ import net.minecraft.server.MinecraftServer;
/*   5:    */ 
/*   6:    */ public class dd
/*   7:    */   extends CommandBase
/*   8:    */ {
/*   9:    */   public String c()
/*  10:    */   {
/*  11: 23 */     return "trigger";
/*  12:    */   }
/*  13:    */   
/*  14:    */   public int a()
/*  15:    */   {
/*  16: 28 */     return 0;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public String c(ICommandSender paramae)
/*  20:    */   {
/*  21: 33 */     return "commands.trigger.usage";
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  25:    */   {
/*  26: 38 */     if (paramArrayOfString.length < 3) {
/*  27: 39 */       throw new WrongUsageException("commands.trigger.usage", new Object[0]);
/*  28:    */     }
/*  29:    */     qw localqw;
/*  30: 43 */     if ((paramae instanceof qw))
/*  31:    */     {
/*  32: 44 */       localqw = (qw)paramae;
/*  33:    */     }
/*  34:    */     else
/*  35:    */     {
/*  36: 46 */       Entity localObject = paramae.f();
/*  37: 47 */       if ((localObject instanceof qw)) {
/*  38: 48 */         localqw = (qw)localObject;
/*  39:    */       } else {
/*  40: 50 */         throw new CommandException("commands.trigger.invalidPlayer", new Object[0]);
/*  41:    */       }
/*  42:    */     }
/*  43: 54 */     Object localObject = MinecraftServer.M().a(0).Z();
/*  44: 55 */     bry localbry = ((bsd)localObject).b(paramArrayOfString[0]);
/*  45: 56 */     if ((localbry == null) || (localbry.c() != bsk.c)) {
/*  46: 57 */       throw new CommandException("commands.trigger.invalidObjective", new Object[] { paramArrayOfString[0] });
/*  47:    */     }
/*  48: 60 */     int i = a(paramArrayOfString[2]);
/*  49: 61 */     if (!((bsd)localObject).b(localqw.getName(), localbry)) {
/*  50: 62 */       throw new CommandException("commands.trigger.invalidObjective", new Object[] { paramArrayOfString[0] });
/*  51:    */     }
/*  52: 65 */     bsa localbsa = ((bsd)localObject).c(localqw.getName(), localbry);
/*  53: 66 */     if (localbsa.g()) {
/*  54: 67 */       throw new CommandException("commands.trigger.disabled", new Object[] { paramArrayOfString[0] });
/*  55:    */     }
/*  56: 70 */     if ("set".equals(paramArrayOfString[1])) {
/*  57: 71 */       localbsa.c(i);
/*  58: 72 */     } else if ("add".equals(paramArrayOfString[1])) {
/*  59: 73 */       localbsa.a(i);
/*  60:    */     } else {
/*  61: 75 */       throw new CommandException("commands.trigger.invalidMode", new Object[] { paramArrayOfString[1] });
/*  62:    */     }
/*  63: 78 */     localbsa.a(true);
/*  64: 79 */     if (localqw.c.d()) {
/*  65: 80 */       a(paramae, this, "commands.trigger.success", new Object[] { paramArrayOfString[0], paramArrayOfString[1], paramArrayOfString[2] });
/*  66:    */     }
/*  67:    */   }
/*  68:    */   
/*  69:    */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/*  70:    */   {
/*  71: 87 */     if (paramArrayOfString.length == 1)
/*  72:    */     {
/*  73: 88 */       bsd localbsd = MinecraftServer.M().a(0).Z();
/*  74: 89 */       ArrayList<String> localArrayList = Lists.newArrayList();
/*  75: 90 */       for (bry localbry : localbsd.c()) {
/*  76: 91 */         if (localbry.c() == bsk.c) {
/*  77: 92 */           localArrayList.add(localbry.b());
/*  78:    */         }
/*  79:    */       }
/*  80: 95 */       return a(paramArrayOfString, (String[])localArrayList.toArray(new String[localArrayList.size()]));
/*  81:    */     }
/*  82: 97 */     if (paramArrayOfString.length == 2) {
/*  83: 98 */       return a(paramArrayOfString, new String[] { "add", "set" });
/*  84:    */     }
/*  85:101 */     return null;
/*  86:    */   }
/*  87:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dd
 * JD-Core Version:    0.7.0.1
 */