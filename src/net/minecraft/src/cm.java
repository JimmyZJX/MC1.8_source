package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class cm
/*   4:    */   extends CommandBase
/*   5:    */ {
/*   6:    */   public String c()
/*   7:    */   {
/*   8: 25 */     return "setblock";
/*   9:    */   }
/*  10:    */   
/*  11:    */   public int a()
/*  12:    */   {
/*  13: 30 */     return 2;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public String c(ICommandSender paramae)
/*  17:    */   {
/*  18: 35 */     return "commands.setblock.usage";
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  22:    */   {
/*  23: 40 */     if (paramArrayOfString.length < 4) {
/*  24: 41 */       throw new WrongUsageException("commands.setblock.usage", new Object[0]);
/*  25:    */     }
/*  26: 43 */     paramae.a(ag.b, 0);
/*  27:    */     
/*  28: 45 */     BlockPosition localdt = a(paramae, paramArrayOfString, 0, false);
/*  29: 46 */     ProtoBlock localatr = CommandBase.g(paramae, paramArrayOfString[3]);
/*  30:    */     
/*  31: 48 */     int i = 0;
/*  32: 49 */     if (paramArrayOfString.length >= 5) {
/*  33: 50 */       i = a(paramArrayOfString[4], 0, 15);
/*  34:    */     }
/*  35: 53 */     World localaqu = paramae.e();
/*  36: 54 */     if (!localaqu.e(localdt)) {
/*  37: 55 */       throw new CommandException("commands.setblock.outOfWorld", new Object[0]);
/*  38:    */     }
/*  39: 58 */     NBTTagCompound localfn = new NBTTagCompound();
/*  40: 59 */     int j = 0;
/*  41: 60 */     if ((paramArrayOfString.length >= 7) && (localatr.x()))
/*  42:    */     {
/*  43: 61 */       String localObject = a(paramae, paramArrayOfString, 6).c();
/*  44:    */       try
/*  45:    */       {
/*  46: 63 */         localfn = gg.a((String)localObject);
/*  47: 64 */         j = 1;
/*  48:    */       }
/*  49:    */       catch (gf localgf)
/*  50:    */       {
/*  51: 66 */         throw new CommandException("commands.setblock.tagError", new Object[] { localgf.getMessage() });
/*  52:    */       }
/*  53:    */     }
/*  54: 70 */     if (paramArrayOfString.length >= 6) {
/*  55: 71 */       if (paramArrayOfString[5].equals("destroy"))
/*  56:    */       {
/*  57: 72 */         localaqu.b(localdt, true);
/*  58: 73 */         if (localatr == BlockList.air) {
/*  59: 74 */           a(paramae, this, "commands.setblock.success", new Object[0]);
/*  60:    */         }
/*  61:    */       }
/*  62: 77 */       else if ((paramArrayOfString[5].equals("keep")) && 
/*  63: 78 */         (!localaqu.isEmpty(localdt)))
/*  64:    */       {
/*  65: 79 */         throw new CommandException("commands.setblock.noChange", new Object[0]);
/*  66:    */       }
/*  67:    */     }
/*  68: 84 */     Object localObject = localaqu.s(localdt);
/*  69: 85 */     if (localObject != null)
/*  70:    */     {
/*  71: 86 */       if ((localObject instanceof vq)) {
/*  72: 87 */         ((vq)localObject).l();
/*  73:    */       }
/*  74: 89 */       localaqu.setBlock(localdt, BlockList.air.instance(), localatr == BlockList.air ? 2 : 4);
/*  75:    */     }
/*  76: 92 */     Block localbec = localatr.instance(i);
/*  77: 93 */     if (!localaqu.setBlock(localdt, localbec, 2)) {
/*  78: 94 */       throw new CommandException("commands.setblock.noChange", new Object[0]);
/*  79:    */     }
/*  80: 97 */     if (j != 0)
/*  81:    */     {
/*  82: 98 */       bcm localbcm = localaqu.s(localdt);
/*  83: 99 */       if (localbcm != null)
/*  84:    */       {
/*  85:100 */         localfn.setInt("x", localdt.getX());
/*  86:101 */         localfn.setInt("y", localdt.getY());
/*  87:102 */         localfn.setInt("z", localdt.getZ());
/*  88:    */         
/*  89:104 */         localbcm.readFromNBT(localfn);
/*  90:    */       }
/*  91:    */     }
/*  92:107 */     localaqu.b(localdt, localbec.getProto());
/*  93:108 */     paramae.a(ag.b, 1);
/*  94:109 */     a(paramae, this, "commands.setblock.success", new Object[0]);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/*  98:    */   {
/*  99:115 */     if ((paramArrayOfString.length > 0) && (paramArrayOfString.length <= 3)) {
/* 100:116 */       return a(paramArrayOfString, 0, paramdt);
/* 101:    */     }
/* 102:117 */     if (paramArrayOfString.length == 4) {
/* 103:118 */       return a(paramArrayOfString, ProtoBlock.c.c());
/* 104:    */     }
/* 105:119 */     if (paramArrayOfString.length == 6) {
/* 106:120 */       return a(paramArrayOfString, new String[] { "replace", "destroy", "keep" });
/* 107:    */     }
/* 108:123 */     return null;
/* 109:    */   }
/* 110:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cm
 * JD-Core Version:    0.7.0.1
 */