package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Iterators;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.Iterator;
/*   5:    */ import java.util.List;
/*   6:    */ import net.minecraft.server.MinecraftServer;
/*   7:    */ 
/*   8:    */ public class au
/*   9:    */   extends CommandBase
/*  10:    */ {
/*  11:    */   public String c()
/*  12:    */   {
/*  13: 24 */     return "achievement";
/*  14:    */   }
/*  15:    */   
/*  16:    */   public int a()
/*  17:    */   {
/*  18: 29 */     return 2;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public String c(ICommandSender paramae)
/*  22:    */   {
/*  23: 34 */     return "commands.achievement.usage";
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  27:    */   {
/*  28: 39 */     if (paramArrayOfString.length < 2) {
/*  29: 40 */       throw new WrongUsageException("commands.achievement.usage", new Object[0]);
/*  30:    */     }
/*  31: 43 */     PlayerStat localtq = StatList.a(paramArrayOfString[1]);
/*  32: 44 */     if ((localtq == null) && (!paramArrayOfString[1].equals("*"))) {
/*  33: 45 */       throw new CommandException("commands.achievement.unknownAchievement", new Object[] { paramArrayOfString[1] });
/*  34:    */     }
/*  35: 48 */     qw localqw = paramArrayOfString.length >= 3 ? a(paramae, paramArrayOfString[2]) : b(paramae);
/*  36: 49 */     boolean bool1 = paramArrayOfString[0].equalsIgnoreCase("give");
/*  37: 50 */     boolean bool2 = paramArrayOfString[0].equalsIgnoreCase("take");
/*  38: 51 */     if ((!bool1) && (!bool2)) {
/*  39:    */       return;
/*  40:    */     }
/*  41:    */     Object localObject1;
/*  42:    */     Object localObject2;
/*  43: 55 */     if (localtq == null)
/*  44:    */     {
/*  45: 56 */       if (bool1)
/*  46:    */       {
/*  47: 57 */         for (localObject1 = AchievementList.e.iterator(); ((Iterator)localObject1).hasNext();)
/*  48:    */         {
/*  49: 57 */           localObject2 = (tk)((Iterator)localObject1).next();
/*  50: 58 */           localqw.increaseStat((PlayerStat)localObject2);
/*  51:    */         }
/*  52: 60 */         a(paramae, this, "commands.achievement.give.success.all", new Object[] { localqw.getName() });
/*  53:    */       }
/*  54: 61 */       else if (bool2)
/*  55:    */       {
/*  56: 62 */         for (localObject1 = Lists.reverse(AchievementList.e).iterator(); ((Iterator)localObject1).hasNext();)
/*  57:    */         {
/*  58: 62 */           localObject2 = (tk)((Iterator)localObject1).next();
/*  59: 63 */           localqw.a((PlayerStat)localObject2);
/*  60:    */         }
/*  61: 65 */         a(paramae, this, "commands.achievement.take.success.all", new Object[] { localqw.getName() });
/*  62:    */       }
/*  63:    */       return;
/*  64:    */     }
/*  65:    */     Iterator localIterator;
/*  66:    */     tk localtk;
/*  67: 70 */     if ((localtq instanceof tk))
/*  68:    */     {
/*  69: 71 */       localObject1 = (tk)localtq;
/*  70: 73 */       if (bool1)
/*  71:    */       {
/*  72: 74 */         if (localqw.A().a((tk)localObject1)) {
/*  73: 75 */           throw new CommandException("commands.achievement.alreadyHave", new Object[] { localqw.getName(), localtq.j() });
/*  74:    */         }
/*  75: 77 */         localObject2 = Lists.newArrayList();
/*  76: 78 */         while ((((tk)localObject1).c != null) && (!localqw.A().a(((tk)localObject1).c)))
/*  77:    */         {
/*  78: 79 */           ((List)localObject2).add(((tk)localObject1).c);
/*  79: 80 */           localObject1 = ((tk)localObject1).c;
/*  80:    */         }
/*  81: 83 */         for (localIterator = Lists.reverse((List)localObject2).iterator(); localIterator.hasNext();)
/*  82:    */         {
/*  83: 83 */           localtk = (tk)localIterator.next();
/*  84: 84 */           localqw.increaseStat(localtk);
/*  85:    */         }
/*  86:    */       }
/*  87: 86 */       else if (bool2)
/*  88:    */       {
/*  89: 87 */         if (!localqw.A().a((tk)localObject1)) {
/*  90: 88 */           throw new CommandException("commands.achievement.dontHave", new Object[] { localqw.getName(), localtq.j() });
/*  91:    */         }
/*  92: 90 */         localObject2 = Lists.newArrayList(Iterators.filter(AchievementList.e.iterator(), new av(this, localqw, localtq)));
/*  93: 96 */         while ((((tk)localObject1).c != null) && (localqw.A().a(((tk)localObject1).c)))
/*  94:    */         {
/*  95: 97 */           ((List)localObject2).remove(((tk)localObject1).c);
/*  96: 98 */           localObject1 = ((tk)localObject1).c;
/*  97:    */         }
/*  98:101 */         for (localIterator = ((List)localObject2).iterator(); localIterator.hasNext();)
/*  99:    */         {
/* 100:101 */           localtk = (tk)localIterator.next();
/* 101:102 */           localqw.a(localtk);
/* 102:    */         }
/* 103:    */       }
/* 104:    */     }
/* 105:107 */     if (bool1)
/* 106:    */     {
/* 107:108 */       localqw.increaseStat(localtq);
/* 108:109 */       a(paramae, this, "commands.achievement.give.success.one", new Object[] { localqw.getName(), localtq.j() });
/* 109:    */     }
/* 110:110 */     else if (bool2)
/* 111:    */     {
/* 112:111 */       localqw.a(localtq);
/* 113:112 */       a(paramae, this, "commands.achievement.take.success.one", new Object[] { localtq.j(), localqw.getName() });
/* 114:    */     }
/* 115:    */   }
/* 116:    */   
/* 117:    */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 118:    */   {
/* 119:119 */     if (paramArrayOfString.length == 1) {
/* 120:120 */       return a(paramArrayOfString, new String[] { "give", "take" });
/* 121:    */     }
/* 122:123 */     if (paramArrayOfString.length == 2)
/* 123:    */     {
/* 124:124 */       ArrayList localArrayList = Lists.newArrayList();
/* 125:125 */       for (PlayerStat localtq : StatList.b) {
/* 126:126 */         localArrayList.add(localtq.e);
/* 127:    */       }
/* 128:129 */       return a(paramArrayOfString, localArrayList);
/* 129:    */     }
/* 130:132 */     if (paramArrayOfString.length == 3) {
/* 131:133 */       return a(paramArrayOfString, MinecraftServer.M().I());
/* 132:    */     }
/* 133:136 */     return null;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 137:    */   {
/* 138:141 */     return paramInt == 2;
/* 139:    */   }
/* 140:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     au
 * JD-Core Version:    0.7.0.1
 */