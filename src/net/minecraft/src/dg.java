package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class dg
/*   4:    */   extends CommandBase
/*   5:    */ {
/*   6:    */   public String c()
/*   7:    */   {
/*   8: 20 */     return "worldborder";
/*   9:    */   }
/*  10:    */   
/*  11:    */   public int a()
/*  12:    */   {
/*  13: 25 */     return 2;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public String c(ICommandSender paramae)
/*  17:    */   {
/*  18: 30 */     return "commands.worldborder.usage";
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws WrongUsageException, NumberInvalidException
/*  22:    */   {
/*  23: 35 */     if (paramArrayOfString.length < 1) {
/*  24: 36 */       throw new WrongUsageException("commands.worldborder.usage", new Object[0]);
/*  25:    */     }
/*  26: 39 */     bfb localbfb = d();
/*  27:    */     double d1;
/*  28:    */     double d5;
/*  29:    */     long l;
/*  30: 40 */     if (paramArrayOfString[0].equals("set"))
/*  31:    */     {
/*  32: 41 */       if ((paramArrayOfString.length != 2) && (paramArrayOfString.length != 3)) {
/*  33: 42 */         throw new WrongUsageException("commands.worldborder.set.usage", new Object[0]);
/*  34:    */       }
/*  35: 45 */       d1 = localbfb.j();
/*  36: 46 */       d5 = a(paramArrayOfString[1], 1.0D, 60000000.0D);
/*  37: 47 */       l = paramArrayOfString.length > 2 ? a(paramArrayOfString[2], 0L, 9223372036854775L) * 1000L : 0L;
/*  38: 49 */       if (l > 0L)
/*  39:    */       {
/*  40: 50 */         localbfb.a(d1, d5, l);
/*  41: 51 */         if (d1 > d5) {
/*  42: 52 */           a(paramae, this, "commands.worldborder.setSlowly.shrink.success", new Object[] { String.format("%.1f", new Object[] { Double.valueOf(d5) }), String.format("%.1f", new Object[] { Double.valueOf(d1) }), Long.toString(l / 1000L) });
/*  43:    */         } else {
/*  44: 54 */           a(paramae, this, "commands.worldborder.setSlowly.grow.success", new Object[] { String.format("%.1f", new Object[] { Double.valueOf(d5) }), String.format("%.1f", new Object[] { Double.valueOf(d1) }), Long.toString(l / 1000L) });
/*  45:    */         }
/*  46:    */       }
/*  47:    */       else
/*  48:    */       {
/*  49: 57 */         localbfb.a(d5);
/*  50: 58 */         a(paramae, this, "commands.worldborder.set.success", new Object[] { String.format("%.1f", new Object[] { Double.valueOf(d5) }), String.format("%.1f", new Object[] { Double.valueOf(d1) }) });
/*  51:    */       }
/*  52:    */     }
/*  53: 60 */     else if (paramArrayOfString[0].equals("add"))
/*  54:    */     {
/*  55: 61 */       if ((paramArrayOfString.length != 2) && (paramArrayOfString.length != 3)) {
/*  56: 62 */         throw new WrongUsageException("commands.worldborder.add.usage", new Object[0]);
/*  57:    */       }
/*  58: 65 */       d1 = localbfb.h();
/*  59: 66 */       d5 = d1 + a(paramArrayOfString[1], -d1, 60000000.0D - d1);
/*  60: 67 */       l = localbfb.i() + (paramArrayOfString.length > 2 ? a(paramArrayOfString[2], 0L, 9223372036854775L) * 1000L : 0L);
/*  61: 69 */       if (l > 0L)
/*  62:    */       {
/*  63: 70 */         localbfb.a(d1, d5, l);
/*  64: 71 */         if (d1 > d5) {
/*  65: 72 */           a(paramae, this, "commands.worldborder.setSlowly.shrink.success", new Object[] { String.format("%.1f", new Object[] { Double.valueOf(d5) }), String.format("%.1f", new Object[] { Double.valueOf(d1) }), Long.toString(l / 1000L) });
/*  66:    */         } else {
/*  67: 74 */           a(paramae, this, "commands.worldborder.setSlowly.grow.success", new Object[] { String.format("%.1f", new Object[] { Double.valueOf(d5) }), String.format("%.1f", new Object[] { Double.valueOf(d1) }), Long.toString(l / 1000L) });
/*  68:    */         }
/*  69:    */       }
/*  70:    */       else
/*  71:    */       {
/*  72: 77 */         localbfb.a(d5);
/*  73: 78 */         a(paramae, this, "commands.worldborder.set.success", new Object[] { String.format("%.1f", new Object[] { Double.valueOf(d5) }), String.format("%.1f", new Object[] { Double.valueOf(d1) }) });
/*  74:    */       }
/*  75:    */     }
/*  76: 80 */     else if (paramArrayOfString[0].equals("center"))
/*  77:    */     {
/*  78: 81 */       if (paramArrayOfString.length != 3) {
/*  79: 82 */         throw new WrongUsageException("commands.worldborder.center.usage", new Object[0]);
/*  80:    */       }
/*  81: 85 */       BlockPosition localdt = paramae.c();
/*  82: 86 */       double d4 = b(localdt.getX() + 0.5D, paramArrayOfString[1], true);
/*  83: 87 */       double d6 = b(localdt.getZ() + 0.5D, paramArrayOfString[2], true);
/*  84:    */       
/*  85: 89 */       localbfb.c(d4, d6);
/*  86: 90 */       a(paramae, this, "commands.worldborder.center.success", new Object[] { Double.valueOf(d4), Double.valueOf(d6) });
/*  87:    */     }
/*  88: 91 */     else if (paramArrayOfString[0].equals("damage"))
/*  89:    */     {
/*  90: 92 */       if (paramArrayOfString.length < 2) {
/*  91: 93 */         throw new WrongUsageException("commands.worldborder.damage.usage", new Object[0]);
/*  92:    */       }
/*  93:    */       double d2;
/*  94: 96 */       if (paramArrayOfString[1].equals("buffer"))
/*  95:    */       {
/*  96: 97 */         if (paramArrayOfString.length != 3) {
/*  97: 98 */           throw new WrongUsageException("commands.worldborder.damage.buffer.usage", new Object[0]);
/*  98:    */         }
/*  99:101 */         d2 = a(paramArrayOfString[2], 0.0D);
/* 100:102 */         d5 = localbfb.m();
/* 101:103 */         localbfb.b(d2);
/* 102:104 */         a(paramae, this, "commands.worldborder.damage.buffer.success", new Object[] { String.format("%.1f", new Object[] { Double.valueOf(d2) }), String.format("%.1f", new Object[] { Double.valueOf(d5) }) });
/* 103:    */       }
/* 104:105 */       else if (paramArrayOfString[1].equals("amount"))
/* 105:    */       {
/* 106:106 */         if (paramArrayOfString.length != 3) {
/* 107:107 */           throw new WrongUsageException("commands.worldborder.damage.amount.usage", new Object[0]);
/* 108:    */         }
/* 109:110 */         d2 = a(paramArrayOfString[2], 0.0D);
/* 110:111 */         d5 = localbfb.n();
/* 111:112 */         localbfb.c(d2);
/* 112:113 */         a(paramae, this, "commands.worldborder.damage.amount.success", new Object[] { String.format("%.2f", new Object[] { Double.valueOf(d2) }), String.format("%.2f", new Object[] { Double.valueOf(d5) }) });
/* 113:    */       }
/* 114:    */     }
/* 115:115 */     else if (paramArrayOfString[0].equals("warning"))
/* 116:    */     {
/* 117:116 */       if (paramArrayOfString.length < 2) {
/* 118:117 */         throw new WrongUsageException("commands.worldborder.warning.usage", new Object[0]);
/* 119:    */       }
/* 120:120 */       int i = a(paramArrayOfString[2], 0);
/* 121:    */       int j;
/* 122:121 */       if (paramArrayOfString[1].equals("time"))
/* 123:    */       {
/* 124:122 */         if (paramArrayOfString.length != 3) {
/* 125:123 */           throw new WrongUsageException("commands.worldborder.warning.time.usage", new Object[0]);
/* 126:    */         }
/* 127:126 */         j = localbfb.p();
/* 128:127 */         localbfb.b(i);
/* 129:128 */         a(paramae, this, "commands.worldborder.warning.time.success", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
/* 130:    */       }
/* 131:129 */       else if (paramArrayOfString[1].equals("distance"))
/* 132:    */       {
/* 133:130 */         if (paramArrayOfString.length != 3) {
/* 134:131 */           throw new WrongUsageException("commands.worldborder.warning.distance.usage", new Object[0]);
/* 135:    */         }
/* 136:134 */         j = localbfb.q();
/* 137:135 */         localbfb.c(i);
/* 138:136 */         a(paramae, this, "commands.worldborder.warning.distance.success", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
/* 139:    */       }
/* 140:    */     }
/* 141:138 */     else if (paramArrayOfString[0].equals("get"))
/* 142:    */     {
/* 143:139 */       double d3 = localbfb.h();
/* 144:140 */       paramae.a(ag.e, MathUtils.floor(d3 + 0.5D));
/* 145:141 */       paramae.a(new hz("commands.worldborder.get.success", new Object[] { String.format("%.0f", new Object[] { Double.valueOf(d3) }) }));
/* 146:    */     }
/* 147:    */   }
/* 148:    */   
/* 149:    */   protected bfb d()
/* 150:    */   {
/* 151:146 */     return net.minecraft.server.MinecraftServer.M().c[0].af();
/* 152:    */   }
/* 153:    */   
/* 154:    */   public List a(ICommandSender paramae, String[] paramArrayOfString, BlockPosition paramdt)
/* 155:    */   {
/* 156:152 */     if (paramArrayOfString.length == 1) {
/* 157:153 */       return a(paramArrayOfString, new String[] { "set", "center", "damage", "warning", "add", "get" });
/* 158:    */     }
/* 159:156 */     if ((paramArrayOfString.length == 2) && (paramArrayOfString[0].equals("damage"))) {
/* 160:157 */       return a(paramArrayOfString, new String[] { "buffer", "amount" });
/* 161:    */     }
/* 162:158 */     if ((paramArrayOfString.length == 2) && (paramArrayOfString[0].equals("warning"))) {
/* 163:159 */       return a(paramArrayOfString, new String[] { "time", "distance" });
/* 164:    */     }
/* 165:162 */     return null;
/* 166:    */   }
/* 167:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dg
 * JD-Core Version:    0.7.0.1
 */