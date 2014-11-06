package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import com.google.common.collect.Sets;
/*   4:    */ import java.util.ArrayList;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Map;
/*   7:    */ import java.util.Map.Entry;
/*   8:    */ import java.util.Set;
/*   9:    */ import java.util.UUID;
/*  10:    */ import org.apache.logging.log4j.LogManager;
/*  11:    */ import org.apache.logging.log4j.Logger;
/*  12:    */ 
/*  13:    */ public class ab
/*  14:    */   implements ad
/*  15:    */ {
/*  16: 21 */   private static final Logger a = null; // TODO: BROKEN
/*  17: 22 */   private final Map<String,ICommand> b = Maps.newHashMap();
/*  18: 23 */   private final Set<ICommand> c = Sets.newHashSet();
/*  19:    */   
/*  20:    */   public int a(ICommandSender paramae, String paramString)
/*  21:    */   {
/*  22: 27 */     paramString = paramString.trim();
/*  23: 28 */     if (paramString.startsWith("/")) {
/*  24: 29 */       paramString = paramString.substring(1);
/*  25:    */     }
/*  26: 32 */     String[] arrayOfString = paramString.split(" ");
/*  27: 33 */     String str1 = arrayOfString[0];
/*  28:    */     
/*  29: 35 */     arrayOfString = a(arrayOfString);
/*  30:    */     
/*  31: 37 */     ICommand localac = this.b.get(str1);
/*  32: 38 */     int i = a(localac, arrayOfString);
/*  33: 39 */     int j = 0;
/*  34:    */     Object localObject;
/*  35: 41 */     if (localac == null)
/*  36:    */     {
/*  37: 42 */       hz localObject1 = new hz("commands.generic.notFound", new Object[0]);
/*  38: 43 */       localObject1.b().a(net.minecraft.src.a.m);
/*  39: 44 */       paramae.a(localObject1);
/*  40:    */     }
/*  41: 46 */     else if (localac.a(paramae))
/*  42:    */     {
/*  43: 47 */       if (i > -1)
/*  44:    */       {
/*  45: 49 */         List<Entity> localObject1 = ah.b(paramae, arrayOfString[i], Entity.class);
/*  46: 50 */         String str2 = arrayOfString[i];
/*  47: 51 */         paramae.a(ag.c, localObject1.size());
/*  48: 53 */         for (Entity localwv : localObject1)
/*  49:    */         {
/*  50: 54 */           arrayOfString[i] = localwv.getUUID().toString();
/*  51: 56 */           if (a(paramae, arrayOfString, localac, paramString)) {
/*  52: 57 */             j++;
/*  53:    */           }
/*  54:    */         }
/*  55: 60 */         arrayOfString[i] = str2;
/*  56:    */       }
/*  57:    */       else
/*  58:    */       {
/*  59: 62 */         paramae.a(ag.c, 1);
/*  60: 63 */         if (a(paramae, arrayOfString, localac, paramString)) {
/*  61: 64 */           j++;
/*  62:    */         }
/*  63:    */       }
/*  64:    */     }
/*  65:    */     else
/*  66:    */     {
/*  67: 68 */       localObject = new hz("commands.generic.permission", new Object[0]);
/*  68: 69 */       ((hz)localObject).b().a(net.minecraft.src.a.m);
/*  69: 70 */       paramae.a((ho)localObject);
/*  70:    */     }
/*  71: 74 */     paramae.a(ag.a, j);
/*  72: 75 */     return j;
/*  73:    */   }
/*  74:    */   
/*  75:    */   protected boolean a(ICommandSender paramae, String[] paramArrayOfString, ICommand paramac, String paramString)
/*  76:    */   {
/*  77:    */     try
/*  78:    */     {
/*  79: 80 */       paramac.a(paramae, paramArrayOfString);
/*  80: 81 */       return true;
/*  81:    */     }
/*  82:    */     catch (WrongUsageException localdp)
/*  83:    */     {
/*  84: 83 */       hz localhz = new hz("commands.generic.usage", new Object[] { new hz(localdp.getMessage(), localdp.a()) });
/*  85: 84 */       localhz.b().a(net.minecraft.src.a.m);
/*  86: 85 */       paramae.a(localhz);
/*  87:    */     }
/*  88:    */     catch (CommandException localdi)
/*  89:    */     {
/*  90: 87 */       hz localhz = new hz(localdi.getMessage(), localdi.a());
/*  91: 88 */       localhz.b().a(net.minecraft.src.a.m);
/*  92: 89 */       paramae.a(localhz);
/*  93:    */     }
/*  94:    */     catch (Throwable localThrowable)
/*  95:    */     {
/*  96: 91 */       hz localhz = new hz("commands.generic.exception", new Object[0]);
/*  97: 92 */       localhz.b().a(net.minecraft.src.a.m);
/*  98: 93 */       paramae.a(localhz);
/*  99: 94 */       a.error("Couldn't process command: '" + paramString + "'", localThrowable);
/* 100:    */     }
/* 101: 97 */     return false;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public ICommand a(ICommand paramac)
/* 105:    */   {
/* 106:101 */     this.b.put(paramac.c(), paramac);
/* 107:102 */     this.c.add(paramac);
/* 108:104 */     for (String str : paramac.b())
/* 109:    */     {
/* 110:105 */       ICommand localac = (ICommand)this.b.get(str);
/* 111:107 */       if ((localac == null) || (!localac.c().equals(str))) {
/* 112:111 */         this.b.put(str, paramac);
/* 113:    */       }
/* 114:    */     }
/* 115:114 */     return paramac;
/* 116:    */   }
/* 117:    */   
/* 118:    */   private static String[] a(String[] paramArrayOfString)
/* 119:    */   {
/* 120:118 */     String[] arrayOfString = new String[paramArrayOfString.length - 1];
/* 121:119 */     System.arraycopy(paramArrayOfString, 1, arrayOfString, 0, paramArrayOfString.length - 1);
/* 122:120 */     return arrayOfString;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public List a(ICommandSender paramae, String paramString, BlockPosition paramdt)
/* 126:    */   {
/* 127:126 */     String[] arrayOfString = paramString.split(" ", -1);
/* 128:127 */     String str = arrayOfString[0];
/* 130:129 */     if (arrayOfString.length == 1)
/* 131:    */     {
/* 132:131 */       List<String> localObject = Lists.newArrayList();
/* 133:133 */       for (Map.Entry<String,ICommand> localEntry : this.b.entrySet()) {
/* 134:134 */         if ((CommandBase.a(str, localEntry.getKey())) && (localEntry.getValue().a(paramae))) {
/* 135:135 */           localObject.add(localEntry.getKey());
/* 136:    */         }
/* 137:    */       }
/* 138:139 */       return localObject;
/* 139:    */     }
/* 140:140 */     if (arrayOfString.length > 1)
/* 141:    */     {
/* 142:142 */       ICommand localObject1 = this.b.get(str);
/* 143:144 */       if ((localObject1 != null) && (localObject1.a(paramae))) {
/* 144:145 */         return localObject1.a(paramae, a(arrayOfString), paramdt);
/* 145:    */       }
/* 146:    */     }
/* 147:149 */     return null;
/* 148:    */   }
/* 149:    */   
/* 150:    */   public List a(ICommandSender paramae)
/* 151:    */   {
/* 152:154 */     ArrayList localArrayList = Lists.newArrayList();
/* 153:156 */     for (ICommand localac : this.c) {
/* 154:157 */       if (localac.a(paramae)) {
/* 155:158 */         localArrayList.add(localac);
/* 156:    */       }
/* 157:    */     }
/* 158:162 */     return localArrayList;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public Map a()
/* 162:    */   {
/* 163:167 */     return this.b;
/* 164:    */   }
/* 165:    */   
/* 166:    */   private int a(ICommand paramac, String[] paramArrayOfString)
/* 167:    */   {
/* 168:171 */     if (paramac == null) {
/* 169:172 */       return -1;
/* 170:    */     }
/* 171:175 */     for (int i = 0; i < paramArrayOfString.length; i++) {
/* 172:176 */       if ((paramac.b(paramArrayOfString, i)) && (ah.a(paramArrayOfString[i]))) {
/* 173:177 */         return i;
/* 174:    */       }
/* 175:    */     }
/* 176:181 */     return -1;
/* 177:    */   }
/* 178:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ab
 * JD-Core Version:    0.7.0.1
 */