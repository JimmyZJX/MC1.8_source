/*  1:   */ package net.minecraft.realms;
/*  2:   */ 
/*  3:   */ import net.minecraft.src.cev;
/*  4:   */ 
/*  5:   */ public class RealmsServerAddress
/*  6:   */ {
/*  7:   */   private final String host;
/*  8:   */   private final int port;
/*  9:   */   
/* 10:   */   protected RealmsServerAddress(String paramString, int paramInt)
/* 11:   */   {
/* 12:10 */     this.host = paramString;
/* 13:11 */     this.port = paramInt;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public String getHost()
/* 17:   */   {
/* 18:15 */     return this.host;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public int getPort()
/* 22:   */   {
/* 23:19 */     return this.port;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public static RealmsServerAddress parseString(String paramString)
/* 27:   */   {
/* 28:23 */     cev localcev = cev.a(paramString);
/* 29:24 */     return new RealmsServerAddress(localcev.a(), localcev.b());
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.RealmsServerAddress
 * JD-Core Version:    0.7.0.1
 */