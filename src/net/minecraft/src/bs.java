package net.minecraft.src;
/*   1:    */ import java.util.Arrays;
/*   2:    */ import java.util.Collections;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Map;
/*   5:    */ import java.util.Set;

/*   6:    */ import net.minecraft.server.MinecraftServer;
/*   7:    */ 
/*   8:    */ public class bs
/*   9:    */   extends CommandBase
/*  10:    */ {
/*  11:    */   public String c()
/*  12:    */   {
/*  13: 24 */     return "help";
/*  14:    */   }
/*  15:    */   
/*  16:    */   public int a()
/*  17:    */   {
/*  18: 29 */     return 0;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public String c(ICommandSender paramae)
/*  22:    */   {
/*  23: 34 */     return "commands.help.usage";
/*  24:    */   }
/*  25:    */   
/*  26:    */   public List b()
/*  27:    */   {
/*  28: 39 */     return Arrays.asList(new String[] { "?" });
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  32:    */   {
/*  33: 44 */     List localList = d(paramae);
/*  34: 45 */     int i = 7;
/*  35: 46 */     int j = (localList.size() - 1) / 7;
/*  36: 47 */     int k = 0;
/*  37:    */     try
/*  38:    */     {
/*  39: 50 */       k = paramArrayOfString.length == 0 ? 0 : a(paramArrayOfString[0], 1, j + 1) - 1;
/*  40:    */     }
/*  41:    */     catch (NumberInvalidException localdk)
/*  42:    */     {
/*  43: 53 */       Map localObject = d();
/*  44: 54 */       ICommand localac1 = (ICommand)((Map)localObject).get(paramArrayOfString[0]);
/*  45: 56 */       if (localac1 != null) {
/*  46: 58 */         throw new WrongUsageException(localac1.c(paramae), new Object[0]);
/*  47:    */       }
/*  48: 59 */       if (MathUtils.getInt(paramArrayOfString[0], -1) != -1) {
/*  49: 60 */         throw localdk;
/*  50:    */       }
/*  51: 62 */       throw new dn();
/*  52:    */     }
/*  53: 66 */     int m = Math.min((k + 1) * 7, localList.size());
/*  54:    */     
/*  55: 68 */     Object localObject = new hz("commands.help.header", new Object[] { Integer.valueOf(k + 1), Integer.valueOf(j + 1) });
/*  56: 69 */     ((hz)localObject).b().a(a.c);
/*  57: 70 */     paramae.a((ho)localObject);
/*  58: 72 */     for (int n = k * 7; n < m; n++)
/*  59:    */     {
/*  60: 73 */       ICommand localac2 = (ICommand)localList.get(n);
/*  61:    */       
/*  62: 75 */       hz localhz2 = new hz(localac2.c(paramae), new Object[0]);
/*  63: 76 */       localhz2.b().a(new hm(hn.e, "/" + localac2.c() + " "));
/*  64: 77 */       paramae.a(localhz2);
/*  65:    */     }
/*  66: 80 */     if ((k == 0) && ((paramae instanceof EntityPlayer)))
/*  67:    */     {
/*  68: 81 */       hz localhz1 = new hz("commands.help.footer", new Object[0]);
/*  69: 82 */       localhz1.b().a(a.k);
/*  70: 83 */       paramae.a(localhz1);
/*  71:    */     }
/*  72:    */   }
/*  73:    */   
/*  74:    */   protected List d(ICommandSender paramae)
/*  75:    */   {
/*  76: 88 */     List localList = MinecraftServer.M().O().a(paramae);
/*  77: 89 */     Collections.sort(localList);
/*  78: 90 */     return localList;
/*  79:    */   }
/*  80:    */   
/*  81:    */   protected Map d()
/*  82:    */   {
/*  83: 94 */     return MinecraftServer.M().O().a();
/*  84:    */   }
/*  85:    */   
/*  86:    */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/*  87:    */   {
/*  88:100 */     if (paramArrayOfString.length == 1)
/*  89:    */     {
/*  90:101 */       Set localSet = d().keySet();
/*  91:102 */       return a(paramArrayOfString, (String[])localSet.toArray(new String[localSet.size()]));
/*  92:    */     }
/*  93:105 */     return null;
/*  94:    */   }
/*  95:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bs
 * JD-Core Version:    0.7.0.1
 */