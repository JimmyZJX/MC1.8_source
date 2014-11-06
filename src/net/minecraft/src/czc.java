package net.minecraft.src;
/*   1:    */ import org.apache.logging.log4j.Logger;
/*   2:    */ import paulscode.sound.SoundSystemLogger;
/*   3:    */ 
/*   4:    */ class czc
/*   5:    */   extends SoundSystemLogger
/*   6:    */ {
/*   7:    */   czc(czb paramczb) {}
/*   8:    */   
/*   9:    */   public void message(String paramString, int paramInt)
/*  10:    */   {
/*  11: 91 */     if (!paramString.isEmpty()) {
/*  12: 92 */       cza.g().info(paramString);
/*  13:    */     }
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void importantMessage(String paramString, int paramInt)
/*  17:    */   {
/*  18: 98 */     if (!paramString.isEmpty()) {
/*  19: 99 */       cza.g().warn(paramString);
/*  20:    */     }
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void errorMessage(String paramString1, String paramString2, int paramInt)
/*  24:    */   {
/*  25:105 */     if (!paramString2.isEmpty())
/*  26:    */     {
/*  27:106 */       cza.g().error("Error in class '" + paramString1 + "'");
/*  28:107 */       cza.g().error(paramString2);
/*  29:    */     }
/*  30:    */   }
/*  31:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     czc
 * JD-Core Version:    0.7.0.1
 */