package net.minecraft.src;
/*   1:    */ import java.util.Set;
/*   2:    */ import java.util.TreeMap;
/*   3:    */ 
/*   4:    */ public class GameRules
/*   5:    */ {
/*   6: 25 */   private TreeMap<String,aqr> a = new TreeMap<String,aqr>();
/*   7:    */   
/*   8:    */   public GameRules()
/*   9:    */   {
/*  10: 28 */     a("doFireTick", "true", aqs.b);
/*  11: 29 */     a("mobGriefing", "true", aqs.b);
/*  12: 30 */     a("keepInventory", "false", aqs.b);
/*  13: 31 */     a("doMobSpawning", "true", aqs.b);
/*  14: 32 */     a("doMobLoot", "true", aqs.b);
/*  15: 33 */     a("doTileDrops", "true", aqs.b);
/*  16: 34 */     a("commandBlockOutput", "true", aqs.b);
/*  17: 35 */     a("naturalRegeneration", "true", aqs.b);
/*  18: 36 */     a("doDaylightCycle", "true", aqs.b);
/*  19: 37 */     a("logAdminCommands", "true", aqs.b);
/*  20: 38 */     a("showDeathMessages", "true", aqs.b);
/*  21: 39 */     a("randomTickSpeed", "3", aqs.c);
/*  22: 40 */     a("sendCommandFeedback", "true", aqs.b);
/*  23: 41 */     a("reducedDebugInfo", "false", aqs.b);
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void a(String paramString1, String paramString2, aqs paramaqs)
/*  27:    */   {
/*  28: 45 */     this.a.put(paramString1, new aqr(paramString2, paramaqs));
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void a(String paramString1, String paramString2)
/*  32:    */   {
/*  33: 49 */     aqr localaqr = (aqr)this.a.get(paramString1);
/*  34: 50 */     if (localaqr != null) {
/*  35: 51 */       localaqr.a(paramString2);
/*  36:    */     } else {
/*  37: 53 */       a(paramString1, paramString2, aqs.a);
/*  38:    */     }
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getString(String paramString)
/*  42:    */   {
/*  43: 58 */     aqr localaqr = (aqr)this.a.get(paramString);
/*  44: 59 */     if (localaqr != null) {
/*  45: 60 */       return localaqr.a();
/*  46:    */     }
/*  47: 62 */     return "";
/*  48:    */   }
/*  49:    */   
/*  50:    */   public boolean getBoolean(String paramString)
/*  51:    */   {
/*  52: 66 */     aqr localaqr = (aqr)this.a.get(paramString);
/*  53: 67 */     if (localaqr != null) {
/*  54: 68 */       return localaqr.b();
/*  55:    */     }
/*  56: 70 */     return false;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public int c(String paramString)
/*  60:    */   {
/*  61: 74 */     aqr localaqr = (aqr)this.a.get(paramString);
/*  62: 75 */     if (localaqr != null) {
/*  63: 76 */       return localaqr.c();
/*  64:    */     }
/*  65: 78 */     return 0;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public NBTTagCompound a()
/*  69:    */   {
/*  70: 90 */     NBTTagCompound localfn = new NBTTagCompound();
/*  71: 92 */     for (String str : this.a.keySet())
/*  72:    */     {
/*  73: 93 */       aqr localaqr = (aqr)this.a.get(str);
/*  74: 94 */       localfn.setString(str, localaqr.a());
/*  75:    */     }
/*  76: 97 */     return localfn;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void a(NBTTagCompound paramfn)
/*  80:    */   {
/*  81:101 */     Set<String> localSet = paramfn.c();
/*  82:102 */     for (String str1 : localSet)
/*  83:    */     {
/*  84:103 */       String str2 = str1;
/*  85:104 */       String str3 = paramfn.getString(str1);
/*  86:    */       
/*  87:106 */       a(str2, str3);
/*  88:    */     }
/*  89:    */   }
/*  90:    */   
/*  91:    */   public String[] b()
/*  92:    */   {
/*  93:111 */     return (String[])this.a.keySet().toArray(new String[0]);
/*  94:    */   }
/*  95:    */   
/*  96:    */   public boolean e(String paramString)
/*  97:    */   {
/*  98:115 */     return this.a.containsKey(paramString);
/*  99:    */   }
/* 100:    */   
/* 101:    */   public boolean a(String paramString, aqs paramaqs)
/* 102:    */   {
/* 103:119 */     aqr localaqr = (aqr)this.a.get(paramString);
/* 104:120 */     if ((localaqr != null) && ((localaqr.e() == paramaqs) || (paramaqs == aqs.a))) {
/* 105:121 */       return true;
/* 106:    */     }
/* 107:123 */     return false;
/* 108:    */   }
/* 109:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqq
 * JD-Core Version:    0.7.0.1
 */