package net.minecraft.src;
/*   1:    */ public enum EnumFileEvent
/*   2:    */ { a("file"),b("event");
/*   3:    */   private final String c;
/*   4:    */   
/*   5:    */   private EnumFileEvent(String paramString)
/*   6:    */   {
/*   7: 95 */     this.c = paramString;
/*   8:    */   }
/*   9:    */   
/*  10:    */   public static EnumFileEvent a(String paramString)
/*  11:    */   {
/*  12: 99 */     for (EnumFileEvent localcyc : values()) {
/*  13:100 */       if (localcyc.c.equals(paramString)) {
/*  14:101 */         return localcyc;
/*  15:    */       }
/*  16:    */     }
/*  17:104 */     return null;
/*  18:    */   }
/*  19:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cyc
 * JD-Core Version:    0.7.0.1
 */