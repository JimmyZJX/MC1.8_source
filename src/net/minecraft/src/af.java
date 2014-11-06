package net.minecraft.src;
/*   1:    */ public class af
/*   2:    */ {
/*   3: 13 */   private static final int a = ag.values().length;
/*   4: 14 */   private static final String[] b = new String[a];
/*   5: 16 */   private String[] c = b;
/*   6: 17 */   private String[] d = b;
/*   7:    */   
/*   8:    */   public void a(ICommandSender paramae, ag paramag, int paramInt)
/*   9:    */   {
/*  10: 23 */     String str1 = this.c[paramag.a()];
/*  11: 24 */     if (str1 == null) {
/*  12:    */       return;
/*  13:    */     }
/*  14:    */     String str2;
/*  15:    */     try
/*  16:    */     {
/*  17: 29 */       str2 = CommandBase.e(paramae, str1);
/*  18:    */     }
/*  19:    */     catch (dj localdj)
/*  20:    */     {
/*  21: 31 */       return;
/*  22:    */     }
/*  23: 33 */     String str3 = this.d[paramag.a()];
/*  24: 34 */     if (str3 == null) {
/*  25: 35 */       return;
/*  26:    */     }
/*  27: 37 */     bsd localbsd = paramae.e().Z();
/*  28: 38 */     bry localbry = localbsd.b(str3);
/*  29: 39 */     if (localbry == null) {
/*  30: 40 */       return;
/*  31:    */     }
/*  32: 42 */     if (!localbsd.b(str2, localbry)) {
/*  33: 43 */       return;
/*  34:    */     }
/*  35: 45 */     bsa localbsa = localbsd.c(str2, localbry);
/*  36: 46 */     localbsa.c(paramInt);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void a(NBTTagCompound paramfn)
/*  40:    */   {
/*  41: 50 */     if (!paramfn.hasKey("CommandStats", 10)) {
/*  42: 51 */       return;
/*  43:    */     }
/*  44: 53 */     NBTTagCompound localfn = paramfn.getCompoundTag("CommandStats");
/*  45: 54 */     for (ag localag : ag.values())
/*  46:    */     {
/*  47: 55 */       String str1 = localag.b() + "Name";
/*  48: 56 */       String str2 = localag.b() + "Objective";
/*  49: 57 */       if ((localfn.hasKey(str1, 8)) && (localfn.hasKey(str2, 8)))
/*  50:    */       {
/*  51: 60 */         String str3 = localfn.getString(str1);
/*  52: 61 */         String str4 = localfn.getString(str2);
/*  53: 62 */         a(this, localag, str3, str4);
/*  54:    */       }
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void b(NBTTagCompound paramfn)
/*  59:    */   {
/*  60: 67 */     NBTTagCompound localfn = new NBTTagCompound();
/*  61: 68 */     for (ag localag : ag.values())
/*  62:    */     {
/*  63: 69 */       String str1 = this.c[localag.a()];
/*  64: 70 */       String str2 = this.d[localag.a()];
/*  65: 71 */       if ((str1 != null) && (str2 != null))
/*  66:    */       {
/*  67: 74 */         localfn.setString(localag.b() + "Name", str1);
/*  68: 75 */         localfn.setString(localag.b() + "Objective", str2);
/*  69:    */       }
/*  70:    */     }
/*  71: 77 */     if (!localfn.c_()) {
/*  72: 78 */       paramfn.setNBT("CommandStats", localfn);
/*  73:    */     }
/*  74:    */   }
/*  75:    */   
/*  76:    */   public static void a(af paramaf, ag paramag, String paramString1, String paramString2)
/*  77:    */   {
/*  78: 83 */     if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0))
/*  79:    */     {
/*  80: 84 */       a(paramaf, paramag);
/*  81: 85 */       return;
/*  82:    */     }
/*  83: 87 */     if ((paramaf.c == b) || (paramaf.d == b))
/*  84:    */     {
/*  85: 88 */       paramaf.c = new String[a];
/*  86: 89 */       paramaf.d = new String[a];
/*  87:    */     }
/*  88: 91 */     paramaf.c[paramag.a()] = paramString1;
/*  89: 92 */     paramaf.d[paramag.a()] = paramString2;
/*  90:    */   }
/*  91:    */   
/*  92:    */   private static void a(af paramaf, ag paramag)
/*  93:    */   {
/*  94: 96 */     if ((paramaf.c == b) || (paramaf.d == b)) {
/*  95: 97 */       return;
/*  96:    */     }
/*  97: 99 */     paramaf.c[paramag.a()] = null;
/*  98:100 */     paramaf.d[paramag.a()] = null;
/*  99:    */     
/* 100:102 */     int i = 1;
/* 101:103 */     for (ag localag : ag.values()) {
/* 102:104 */       if ((paramaf.c[localag.a()] != null) && (paramaf.d[localag.a()] != null))
/* 103:    */       {
/* 104:105 */         i = 0;
/* 105:106 */         break;
/* 106:    */       }
/* 107:    */     }
/* 108:109 */     if (i != 0)
/* 109:    */     {
/* 110:110 */       paramaf.c = b;
/* 111:111 */       paramaf.d = b;
/* 112:    */     }
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void a(af paramaf)
/* 116:    */   {
/* 117:116 */     for (ag localag : ag.values()) {
/* 118:117 */       a(this, localag, paramaf.c[localag.a()], paramaf.d[localag.a()]);
/* 119:    */     }
/* 120:    */   }
/* 121:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     af
 * JD-Core Version:    0.7.0.1
 */