/*  1:   */ package net.minecraft.realms;
import net.minecraft.src.brb;
/*  5:   */ 
/*  6:   */ public class RealmsLevelSummary
/*  7:   */   implements Comparable<brb>
/*  8:   */ {
/*  9:   */   private brb levelSummary;
/* 10:   */   
/* 11:   */   public RealmsLevelSummary(brb parambrb)
/* 12:   */   {
/* 13: 9 */     this.levelSummary = parambrb;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public int getGameMode()
/* 17:   */   {
/* 18:13 */     return this.levelSummary.f().a();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public String getLevelId()
/* 22:   */   {
/* 23:17 */     return this.levelSummary.a();
/* 24:   */   }
/* 25:   */   
/* 26:   */   public boolean hasCheats()
/* 27:   */   {
/* 28:21 */     return this.levelSummary.h();
/* 29:   */   }
/* 30:   */   
/* 31:   */   public boolean isHardcore()
/* 32:   */   {
/* 33:25 */     return this.levelSummary.g();
/* 34:   */   }
/* 35:   */   
/* 36:   */   public boolean isRequiresConversion()
/* 37:   */   {
/* 38:29 */     return this.levelSummary.d();
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String getLevelName()
/* 42:   */   {
/* 43:33 */     return this.levelSummary.b();
/* 44:   */   }
/* 45:   */   
/* 46:   */   public long getLastPlayed()
/* 47:   */   {
/* 48:37 */     return this.levelSummary.e();
/* 49:   */   }
/* 50:   */   
/* 51:   */   public int compareTo(brb parambrb)
/* 52:   */   {
/* 53:41 */     return this.levelSummary.compareTo(parambrb);
/* 54:   */   }
/* 55:   */   
/* 56:   */   public long getSizeOnDisk()
/* 57:   */   {
/* 58:45 */     return this.levelSummary.c();
/* 59:   */   }
/* 60:   */   
/* 61:   */   public int compareTo(RealmsLevelSummary paramRealmsLevelSummary)
/* 62:   */   {
/* 63:50 */     if (this.levelSummary.e() < paramRealmsLevelSummary.getLastPlayed()) {
/* 64:51 */       return 1;
/* 65:   */     }
/* 66:53 */     if (this.levelSummary.e() > paramRealmsLevelSummary.getLastPlayed()) {
/* 67:54 */       return -1;
/* 68:   */     }
/* 69:56 */     return this.levelSummary.a().compareTo(paramRealmsLevelSummary.getLevelId());
/* 70:   */   }
/* 71:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.RealmsLevelSummary
 * JD-Core Version:    0.7.0.1
 */