package net.minecraft.src;
/*   1:    */ import com.google.gson.JsonParseException;

/*   2:    */ import java.util.List;

/*   3:    */ import net.minecraft.server.MinecraftServer;

/*   4:    */ import org.apache.commons.lang3.exception.ExceptionUtils;
/*   5:    */ import org.apache.logging.log4j.LogManager;
/*   6:    */ import org.apache.logging.log4j.Logger;
/*   7:    */ 
/*   8:    */ public class db
/*   9:    */   extends CommandBase
/*  10:    */ {
/*  11: 23 */   private static final Logger a = LogManager.getLogger();
/*  12:    */   
/*  13:    */   public String c()
/*  14:    */   {
/*  15: 28 */     return "title";
/*  16:    */   }
/*  17:    */   
/*  18:    */   public int a()
/*  19:    */   {
/*  20: 33 */     return 2;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public String c(ICommandSender paramae)
/*  24:    */   {
/*  25: 38 */     return "commands.title.usage";
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  29:    */   {
/*  30: 43 */     if (paramArrayOfString.length < 2) {
/*  31: 44 */       throw new WrongUsageException("commands.title.usage", new Object[0]);
/*  32:    */     }
/*  33: 46 */     if (paramArrayOfString.length < 3)
/*  34:    */     {
/*  35: 47 */       if (("title".equals(paramArrayOfString[1])) || ("subtitle".equals(paramArrayOfString[1]))) {
/*  36: 48 */         throw new WrongUsageException("commands.title.usage.title", new Object[0]);
/*  37:    */       }
/*  38: 50 */       if ("times".equals(paramArrayOfString[1])) {
/*  39: 51 */         throw new WrongUsageException("commands.title.usage.times", new Object[0]);
/*  40:    */       }
/*  41:    */     }
/*  42: 55 */     qw localqw = a(paramae, paramArrayOfString[0]);
/*  43: 56 */     lk locallk = lk.a(paramArrayOfString[1]);
/*  44: 58 */     if ((locallk == lk.d) || (locallk == lk.
		e))
/*  45:    */     {
/*  46: 59 */       if (paramArrayOfString.length != 2) {
/*  47: 60 */         throw new WrongUsageException("commands.title.usage", new Object[0]);
/*  48:    */       }
/*  49: 62 */       lj locallj1 = new lj(locallk, null);
/*  50: 63 */       localqw.a.a(locallj1);
/*  51: 64 */       a(paramae, this, "commands.title.success", new Object[0]); return;
/*  52:    */     }
/*  53:    */     Object localObject;
/*  54: 68 */     if (locallk == lk.c)
/*  55:    */     {
/*  56: 69 */       if (paramArrayOfString.length != 5) {
/*  57: 70 */         throw new WrongUsageException("commands.title.usage", new Object[0]);
/*  58:    */       }
/*  59: 72 */       int i = a(paramArrayOfString[2]);
/*  60: 73 */       int j = a(paramArrayOfString[3]);
/*  61: 74 */       int k = a(paramArrayOfString[4]);
/*  62: 75 */       localObject = new lj(i, j, k);
/*  63: 76 */       localqw.a.a((id)localObject);
/*  64: 77 */       a(paramae, this, "commands.title.success", new Object[0]);
/*  65: 78 */       return;
/*  66:    */     }
/*  67: 81 */     if (paramArrayOfString.length < 3) {
/*  68: 82 */       throw new WrongUsageException("commands.title.usage", new Object[0]);
/*  69:    */     }
/*  70: 85 */     String str = a(paramArrayOfString, 2);
/*  71:    */     ho localho;
/*  72:    */     try
/*  73:    */     {
/*  74: 88 */       localho = hp.a(str);
/*  75:    */     }
/*  76:    */     catch (JsonParseException localJsonParseException)
/*  77:    */     {
/*  78: 90 */       localObject = ExceptionUtils.getRootCause(localJsonParseException);
/*  79: 91 */       throw new SyntaxErrorException("commands.tellraw.jsonException", new Object[] { localObject == null ? "" : ((Throwable)localObject).getMessage() });
/*  80:    */     }
/*  81: 94 */     lj locallj2 = new lj(locallk, hq.a(paramae, localho, localqw));
/*  82: 95 */     localqw.a.a(locallj2);
/*  83: 96 */     a(paramae, this, "commands.title.success", new Object[0]);
/*  84:    */   }
/*  85:    */   
/*  86:    */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/*  87:    */   {
/*  88:102 */     if (paramArrayOfString.length == 1) {
/*  89:103 */       return a(paramArrayOfString, MinecraftServer.M().I());
/*  90:    */     }
/*  91:105 */     if (paramArrayOfString.length == 2) {
/*  92:106 */       return a(paramArrayOfString, lk.a());
/*  93:    */     }
/*  94:108 */     return null;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public boolean b(String[] paramArrayOfString, int paramInt)
/*  98:    */   {
/*  99:113 */     return paramInt == 0;
/* 100:    */   }
/* 101:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     db
 * JD-Core Version:    0.7.0.1
 */