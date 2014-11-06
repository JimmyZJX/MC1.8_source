package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class ay
/*  4:   */   extends CommandBase
/*  5:   */ {
/*  6:   */   public String c()
/*  7:   */   {
/*  8:21 */     return "blockdata";
/*  9:   */   }
/* 10:   */   
/* 11:   */   public int a()
/* 12:   */   {
/* 13:26 */     return 2;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public String c(ICommandSender paramae)
/* 17:   */   {
/* 18:31 */     return "commands.blockdata.usage";
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/* 22:   */   {
/* 23:36 */     if (paramArrayOfString.length < 4) {
/* 24:37 */       throw new WrongUsageException("commands.blockdata.usage", new Object[0]);
/* 25:   */     }
/* 26:39 */     paramae.a(ag.b, 0);
/* 27:   */     
/* 28:41 */     BlockPosition localdt = a(paramae, paramArrayOfString, 0, false);
/* 29:   */     
/* 30:43 */     World localaqu = paramae.e();
/* 31:44 */     if (!localaqu.e(localdt)) {
/* 32:45 */       throw new CommandException("commands.blockdata.outOfWorld", new Object[0]);
/* 33:   */     }
/* 34:48 */     bcm localbcm = localaqu.s(localdt);
/* 35:49 */     if (localbcm == null) {
/* 36:50 */       throw new CommandException("commands.blockdata.notValid", new Object[0]);
/* 37:   */     }
/* 38:53 */     NBTTagCompound localfn1 = new NBTTagCompound();
/* 39:54 */     localbcm.b(localfn1);
/* 40:55 */     NBTTagCompound localfn2 = (NBTTagCompound)localfn1.b();
/* 41:   */     NBTTagCompound localfn3;
/* 42:   */     try
/* 43:   */     {
/* 44:59 */       localfn3 = gg.a(a(paramae, paramArrayOfString, 3).c());
/* 45:   */     }
/* 46:   */     catch (gf localgf)
/* 47:   */     {
/* 48:61 */       throw new CommandException("commands.blockdata.tagError", new Object[] { localgf.getMessage() });
/* 49:   */     }
/* 50:64 */     localfn1.a(localfn3);
/* 51:   */     
/* 52:66 */     localfn1.setInt("x", localdt.getX());
/* 53:67 */     localfn1.setInt("y", localdt.getY());
/* 54:68 */     localfn1.setInt("z", localdt.getZ());
/* 55:70 */     if (localfn1.equals(localfn2)) {
/* 56:71 */       throw new CommandException("commands.blockdata.failed", new Object[] { localfn1.toString() });
/* 57:   */     }
/* 58:74 */     localbcm.a(localfn1);
/* 59:75 */     localbcm.o_();
/* 60:76 */     localaqu.h(localdt);
/* 61:   */     
/* 62:78 */     paramae.a(ag.b, 1);
/* 63:79 */     a(paramae, this, "commands.blockdata.success", new Object[] { localfn1.toString() });
/* 64:   */   }
/* 65:   */   
/* 66:   */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 67:   */   {
/* 68:85 */     if ((paramArrayOfString.length > 0) && (paramArrayOfString.length <= 3)) {
/* 69:86 */       return a(paramArrayOfString, 0, paramdt);
/* 70:   */     }
/* 71:88 */     return null;
/* 72:   */   }
/* 73:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ay
 * JD-Core Version:    0.7.0.1
 */