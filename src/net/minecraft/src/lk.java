package net.minecraft.src;
/*   1:    */ public enum lk
/*   2:    */ { a,b,c,d,e; // TODO: BROKEN NAME
/*   3:    */   public static lk a(String paramString)
/*   4:    */   {
/*   5: 97 */     for (lk locallk : values()) {
/*   6: 98 */       if (locallk.name().equalsIgnoreCase(paramString)) {
/*   7: 99 */         return locallk;
/*   8:    */       }
/*   9:    */     }
/*  10:102 */     return a;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public static String[] a()
/*  14:    */   {
/*  15:106 */     String[] arrayOfString = new String[values().length];
/*  16:107 */     int i = 0;
/*  17:108 */     for (lk locallk : values()) {
/*  18:109 */       arrayOfString[(i++)] = locallk.name().toLowerCase();
/*  19:    */     }
/*  20:111 */     return arrayOfString;
/*  21:    */   }
/*  22:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     lk
 * JD-Core Version:    0.7.0.1
 */