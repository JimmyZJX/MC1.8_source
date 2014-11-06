package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.Collection;
/*   4:    */ import java.util.List;

import net.minecraft.server.MinecraftServer;
/*   6:    */ 
/*   7:    */ public class ct
/*   8:    */   extends CommandBase
/*   9:    */ {
/*  10:    */   public String c()
/*  11:    */   {
/*  12: 25 */     return "stats";
/*  13:    */   }
/*  14:    */   
/*  15:    */   public int a()
/*  16:    */   {
/*  17: 30 */     return 2;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public String c(ICommandSender paramae)
/*  21:    */   {
/*  22: 35 */     return "commands.stats.usage";
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  26:    */   {
/*  27: 40 */     if (paramArrayOfString.length < 1) {
/*  28: 41 */       throw new WrongUsageException("commands.stats.usage", new Object[0]);
/*  29:    */     }
/*  30:    */     int i;
/*  31: 45 */     if (paramArrayOfString[0].equals("entity")) {
/*  32: 46 */       i = 0;
/*  33: 47 */     } else if (paramArrayOfString[0].equals("block")) {
/*  34: 48 */       i = 1;
/*  35:    */     } else {
/*  36: 50 */       throw new WrongUsageException("commands.stats.usage", new Object[0]);
/*  37:    */     }
/*  38:    */     int j;
/*  39: 54 */     if (i != 0)
/*  40:    */     {
/*  41: 55 */       if (paramArrayOfString.length < 5) {
/*  42: 56 */         throw new WrongUsageException("commands.stats.block.usage", new Object[0]);
/*  43:    */       }
/*  44: 58 */       j = 4;
/*  45:    */     }
/*  46:    */     else
/*  47:    */     {
/*  48: 60 */       if (paramArrayOfString.length < 3) {
/*  49: 61 */         throw new WrongUsageException("commands.stats.entity.usage", new Object[0]);
/*  50:    */       }
/*  51: 63 */       j = 2;
/*  52:    */     }
/*  53: 66 */     String str = paramArrayOfString[(j++)];
/*  54: 67 */     if ("set".equals(str))
/*  55:    */     {
/*  56: 68 */       if (paramArrayOfString.length < j + 3)
/*  57:    */       {
/*  58: 69 */         if (j == 5) {
/*  59: 70 */           throw new WrongUsageException("commands.stats.block.set.usage", new Object[0]);
/*  60:    */         }
/*  61: 72 */         throw new WrongUsageException("commands.stats.entity.set.usage", new Object[0]);
/*  62:    */       }
/*  63:    */     }
/*  64: 74 */     else if ("clear".equals(str))
/*  65:    */     {
/*  66: 75 */       if (paramArrayOfString.length < j + 1)
/*  67:    */       {
/*  68: 76 */         if (j == 5) {
/*  69: 77 */           throw new WrongUsageException("commands.stats.block.clear.usage", new Object[0]);
/*  70:    */         }
/*  71: 79 */         throw new WrongUsageException("commands.stats.entity.clear.usage", new Object[0]);
/*  72:    */       }
/*  73:    */     }
/*  74:    */     else {
/*  75: 82 */       throw new WrongUsageException("commands.stats.usage", new Object[0]);
/*  76:    */     }
/*  77: 85 */     ag localag = ag.a(paramArrayOfString[(j++)]);
/*  78: 87 */     if (localag == null) {
/*  79: 88 */       throw new CommandException("commands.stats.failed", new Object[0]);
/*  80:    */     }
/*  81: 91 */     World localaqu = paramae.e();
/*  82:    */     Object localObject1;
/*  83:    */     Object localObject2;
/*  84:    */     af localaf;
/*  85: 93 */     if (i != 0)
/*  86:    */     {
/*  87: 94 */       localObject1 = a(paramae, paramArrayOfString, 1, false);
/*  88: 95 */       localObject2 = localaqu.s((BlockPosition)localObject1);
/*  89: 97 */       if (localObject2 == null) {
/*  90: 98 */         throw new CommandException("commands.stats.noCompatibleBlock", new Object[] { Integer.valueOf(((BlockPosition)localObject1).getX()), Integer.valueOf(((BlockPosition)localObject1).getY()), Integer.valueOf(((BlockPosition)localObject1).getZ()) });
/*  91:    */       }
/*  92:101 */       if ((localObject2 instanceof bct)) {
/*  93:102 */         localaf = ((bct)localObject2).c();
/*  94:103 */       } else if ((localObject2 instanceof bdj)) {
/*  95:104 */         localaf = ((bdj)localObject2).d();
/*  96:    */       } else {
/*  97:106 */         throw new CommandException("commands.stats.noCompatibleBlock", new Object[] { Integer.valueOf(((BlockPosition)localObject1).getX()), Integer.valueOf(((BlockPosition)localObject1).getY()), Integer.valueOf(((BlockPosition)localObject1).getZ()) });
/*  98:    */       }
/*  99:    */     }
/* 100:    */     else
/* 101:    */     {
/* 102:109 */       localObject1 = b(paramae, paramArrayOfString[1]);
/* 103:110 */       localaf = ((Entity)localObject1).aT();
/* 104:    */     }
/* 105:113 */     if ("set".equals(str))
/* 106:    */     {
/* 107:114 */       localObject1 = paramArrayOfString[(j++)];
/* 108:115 */       localObject2 = paramArrayOfString[j];
/* 109:116 */       if ((((String)localObject1).length() == 0) || (((String)localObject2).length() == 0)) {
/* 110:117 */         throw new CommandException("commands.stats.failed", new Object[0]);
/* 111:    */       }
/* 112:119 */       af.a(localaf, localag, (String)localObject1, (String)localObject2);
/* 113:120 */       a(paramae, this, "commands.stats.success", new Object[] { localag.b(), localObject2, localObject1 });
/* 114:    */     }
/* 115:121 */     else if ("clear".equals(str))
/* 116:    */     {
/* 117:122 */       af.a(localaf, localag, null, null);
/* 118:123 */       a(paramae, this, "commands.stats.cleared", new Object[] { localag.b() });
/* 119:    */     }
/* 120:126 */     if (i != 0)
/* 121:    */     {
/* 122:127 */       localObject1 = a(paramae, paramArrayOfString, 1, false);
/* 123:128 */       localObject2 = localaqu.s((BlockPosition)localObject1);
/* 124:129 */       ((bcm)localObject2).o_();
/* 125:    */     }
/* 126:    */   }
/* 127:    */   
/* 128:    */   public List<String> a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 129:    */   {
/* 130:136 */     if (paramArrayOfString.length == 1) {
/* 131:137 */       return a(paramArrayOfString, new String[] { "entity", "block" });
/* 132:    */     }
/* 133:139 */     if ((paramArrayOfString.length == 2) && (paramArrayOfString[0].equals("entity"))) {
/* 134:140 */       return a(paramArrayOfString, d());
/* 135:    */     }
/* 136:142 */     if (((paramArrayOfString.length == 3) && (paramArrayOfString[0].equals("entity"))) || ((paramArrayOfString.length == 5) && (paramArrayOfString[0].equals("block")))) {
/* 137:143 */       return a(paramArrayOfString, new String[] { "set", "clear" });
/* 138:    */     }
/* 139:145 */     if (((paramArrayOfString.length == 4) && (paramArrayOfString[0].equals("entity"))) || ((paramArrayOfString.length == 6) && (paramArrayOfString[0].equals("block")))) {
/* 140:146 */       return a(paramArrayOfString, ag.c());
/* 141:    */     }
/* 142:148 */     if (((paramArrayOfString.length == 6) && (paramArrayOfString[0].equals("entity"))) || ((paramArrayOfString.length == 8) && (paramArrayOfString[0].equals("block")))) {
/* 143:149 */       return a(paramArrayOfString, e());
/* 144:    */     }
/* 145:152 */     return null;
/* 146:    */   }
/* 147:    */   
/* 148:    */   protected String[] d()
/* 149:    */   {
/* 150:156 */     return MinecraftServer.M().I();
/* 151:    */   }
/* 152:    */   
/* 153:    */   protected List<String> e()
/* 154:    */   {
/* 155:160 */     Collection<bry> localCollection = MinecraftServer.M().a(0).Z().c();
/* 156:161 */     ArrayList<String> localArrayList = Lists.newArrayList();
/* 157:163 */     for (bry localbry : localCollection) {
/* 158:164 */       if (!localbry.c().b()) {
/* 159:165 */         localArrayList.add(localbry.b());
/* 160:    */       }
/* 161:    */     }
/* 162:169 */     return localArrayList;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 166:    */   {
/* 167:174 */     return (paramArrayOfString.length > 0) && (paramArrayOfString[0].equals("entity")) && (paramInt == 1);
/* 168:    */   }
/* 169:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ct
 * JD-Core Version:    0.7.0.1
 */