package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;

/*   3:    */ import net.minecraft.server.MinecraftServer;
/*   4:    */ 
/*   5:    */ public class br
/*   6:    */   extends CommandBase
/*   7:    */ {
/*   8:    */   public String c()
/*   9:    */   {
/*  10: 23 */     return "give";
/*  11:    */   }
/*  12:    */   
/*  13:    */   public int a()
/*  14:    */   {
/*  15: 28 */     return 2;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public String c(ICommandSender paramae)
/*  19:    */   {
/*  20: 33 */     return "commands.give.usage";
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  24:    */   {
/*  25: 38 */     if (paramArrayOfString.length < 2) {
/*  26: 39 */       throw new WrongUsageException("commands.give.usage", new Object[0]);
/*  27:    */     }
/*  28: 42 */     qw localqw = a(paramae, paramArrayOfString[0]);
/*  29: 43 */     Item localalq = f(paramae, paramArrayOfString[1]);
/*  30: 44 */     int i = paramArrayOfString.length >= 3 ? a(paramArrayOfString[2], 1, 64) : 1;
/*  31: 45 */     int j = paramArrayOfString.length >= 4 ? a(paramArrayOfString[3]) : 0;
/*  32: 46 */     ItemStack localamj = new ItemStack(localalq, i, j);
/*  33: 48 */     if (paramArrayOfString.length >= 5)
/*  34:    */     {
/*  35: 49 */       String str = a(paramae, paramArrayOfString, 4).c();
/*  36:    */       try
/*  37:    */       {
/*  38: 51 */         localamj.setTagCompound(gg.a(str));
/*  39:    */       }
/*  40:    */       catch (gf localgf)
/*  41:    */       {
/*  42: 53 */         throw new CommandException("commands.give.tagError", new Object[] { localgf.getMessage() });
/*  43:    */       }
/*  44:    */     }
/*  45: 57 */     boolean bool = localqw.bg.a(localamj);
/*  46: 58 */     if (bool)
/*  47:    */     {
/*  48: 59 */       localqw.world.a(localqw, "random.pop", 0.2F, ((localqw.bb().nextFloat() - localqw.bb().nextFloat()) * 0.7F + 1.0F) * 2.0F);
/*  49: 60 */       localqw.bh.b();
/*  50:    */     }
/*  51:    */     EntityItem localadw;
/*  52: 62 */     if ((!bool) || (localamj.stackSize > 0))
/*  53:    */     {
/*  54: 63 */       paramae.a(ag.d, i - localamj.stackSize);
/*  55: 64 */       localadw = localqw.a(localamj, false);
/*  56: 65 */       if (localadw != null)
/*  57:    */       {
/*  58: 66 */         localadw.q();
/*  59: 67 */         localadw.b(localqw.getName());
/*  60:    */       }
/*  61:    */     }
/*  62:    */     else
/*  63:    */     {
/*  64: 70 */       localamj.stackSize = 1;
/*  65: 71 */       paramae.a(ag.d, i);
/*  66: 72 */       localadw = localqw.a(localamj, false);
/*  67: 73 */       if (localadw != null) {
/*  68: 74 */         localadw.v();
/*  69:    */       }
/*  70:    */     }
/*  71: 78 */     a(paramae, this, "commands.give.success", new Object[] { localamj.C(), Integer.valueOf(i), localqw.getName() });
/*  72:    */   }
/*  73:    */   
/*  74:    */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/*  75:    */   {
/*  76: 84 */     if (paramArrayOfString.length == 1) {
/*  77: 85 */       return a(paramArrayOfString, d());
/*  78:    */     }
/*  79: 87 */     if (paramArrayOfString.length == 2) {
/*  80: 88 */       return a(paramArrayOfString, Item.e.c());
/*  81:    */     }
/*  82: 91 */     return null;
/*  83:    */   }
/*  84:    */   
/*  85:    */   protected String[] d()
/*  86:    */   {
/*  87: 95 */     return MinecraftServer.M().I();
/*  88:    */   }
/*  89:    */   
/*  90:    */   public boolean b(String[] paramArrayOfString, int paramInt)
/*  91:    */   {
/*  92:100 */     return paramInt == 0;
/*  93:    */   }
/*  94:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     br
 * JD-Core Version:    0.7.0.1
 */