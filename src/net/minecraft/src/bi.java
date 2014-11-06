package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import net.minecraft.server.MinecraftServer;
/*   3:    */ 
/*   4:    */ public class bi
/*   5:    */   extends CommandBase
/*   6:    */ {
/*   7:    */   public String c()
/*   8:    */   {
/*   9: 22 */     return "enchant";
/*  10:    */   }
/*  11:    */   
/*  12:    */   public int a()
/*  13:    */   {
/*  14: 27 */     return 2;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public String c(ICommandSender paramae)
/*  18:    */   {
/*  19: 32 */     return "commands.enchant.usage";
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  23:    */   {
/*  24: 37 */     if (paramArrayOfString.length < 2) {
/*  25: 38 */       throw new WrongUsageException("commands.enchant.usage", new Object[0]);
/*  26:    */     }
/*  27: 41 */     qw localqw = a(paramae, paramArrayOfString[0]);
/*  28: 42 */     paramae.a(ag.d, 0);
/*  29:    */     int i;
/*  30:    */     try
/*  31:    */     {
/*  32: 46 */       i = a(paramArrayOfString[1], 0);
/*  33:    */     }
/*  34:    */     catch (NumberInvalidException localdk)
/*  35:    */     {
/*  36: 48 */       Enchantment localObject = Enchantment.b(paramArrayOfString[1]);
/*  37: 49 */       if (localObject == null) {
/*  38: 50 */         throw localdk;
/*  39:    */       }
/*  40: 52 */       i = ((Enchantment)localObject).B;
/*  41:    */     }
/*  42: 54 */     int j = 1;
/*  43:    */     
/*  44: 56 */     Object localObject = localqw.bY();
/*  45: 57 */     if (localObject == null) {
/*  46: 58 */       throw new CommandException("commands.enchant.noItem", new Object[0]);
/*  47:    */     }
/*  48: 61 */     Enchantment localapf1 = Enchantment.c(i);
/*  49: 62 */     if (localapf1 == null) {
/*  50: 63 */       throw new NumberInvalidException("commands.enchant.notFound", new Object[] { Integer.valueOf(i) });
/*  51:    */     }
/*  52: 66 */     if (!localapf1.a((ItemStack)localObject)) {
/*  53: 67 */       throw new CommandException("commands.enchant.cantEnchant", new Object[0]);
/*  54:    */     }
/*  55: 70 */     if (paramArrayOfString.length >= 3) {
/*  56: 71 */       j = a(paramArrayOfString[2], localapf1.e(), localapf1.b());
/*  57:    */     }
/*  58: 74 */     if (((ItemStack)localObject).hasTagCompound())
/*  59:    */     {
/*  60: 75 */       fv localfv = ((ItemStack)localObject).p();
/*  61: 76 */       if (localfv != null) {
/*  62: 77 */         for (int k = 0; k < localfv.c(); k++)
/*  63:    */         {
/*  64: 78 */           int m = localfv.b(k).e("id");
/*  65: 80 */           if (Enchantment.c(m) != null)
/*  66:    */           {
/*  67: 81 */             Enchantment localapf2 = Enchantment.c(m);
/*  68: 82 */             if (!localapf2.a(localapf1)) {
/*  69: 83 */               throw new CommandException("commands.enchant.cantCombine", new Object[] { localapf1.d(j), localapf2.d(localfv.b(k).e("lvl")) });
/*  70:    */             }
/*  71:    */           }
/*  72:    */         }
/*  73:    */       }
/*  74:    */     }
/*  75: 90 */     ((ItemStack)localObject).a(localapf1, j);
/*  76: 91 */     a(paramae, this, "commands.enchant.success", new Object[0]);
/*  77: 92 */     paramae.a(ag.d, 1);
/*  78:    */   }
/*  79:    */   
/*  80:    */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/*  81:    */   {
/*  82: 98 */     if (paramArrayOfString.length == 1) {
/*  83: 99 */       return a(paramArrayOfString, d());
/*  84:    */     }
/*  85:101 */     if (paramArrayOfString.length == 2) {
/*  86:102 */       return a(paramArrayOfString, Enchantment.c());
/*  87:    */     }
/*  88:105 */     return null;
/*  89:    */   }
/*  90:    */   
/*  91:    */   protected String[] d()
/*  92:    */   {
/*  93:109 */     return MinecraftServer.M().I();
/*  94:    */   }
/*  95:    */   
/*  96:    */   public boolean b(String[] paramArrayOfString, int paramInt)
/*  97:    */   {
/*  98:114 */     return paramInt == 0;
/*  99:    */   }
/* 100:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bi
 * JD-Core Version:    0.7.0.1
 */