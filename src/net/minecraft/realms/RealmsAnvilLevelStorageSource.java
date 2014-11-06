/*  1:   */ package net.minecraft.realms;
/*  2:   */ 
/*  3:   */ /*  5:   */ import com.google.common.collect.Lists;

/*  6:   */ import java.util.ArrayList;
/*  7:   */ import java.util.List;

import net.minecraft.src.bqz;
import net.minecraft.src.bra;
import net.minecraft.src.brb;
import net.minecraft.src.uy;
/*  9:   */ 
/* 10:   */ public class RealmsAnvilLevelStorageSource
/* 11:   */ {
/* 12:   */   private bra levelStorageSource;
/* 13:   */   
/* 14:   */   public RealmsAnvilLevelStorageSource(bra parambra)
/* 15:   */   {
/* 16:15 */     this.levelStorageSource = parambra;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public String getName()
/* 20:   */   {
/* 21:19 */     return this.levelStorageSource.a();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public boolean levelExists(String paramString)
/* 25:   */   {
/* 26:23 */     return this.levelStorageSource.f(paramString);
/* 27:   */   }
/* 28:   */   
/* 29:   */   public boolean convertLevel(String paramString, uy paramuy)
/* 30:   */   {
/* 31:27 */     return this.levelStorageSource.a(paramString, paramuy);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public boolean requiresConversion(String paramString)
/* 35:   */   {
/* 36:31 */     return this.levelStorageSource.b(paramString);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public boolean isNewLevelIdAcceptable(String paramString)
/* 40:   */   {
/* 41:35 */     return this.levelStorageSource.d(paramString);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public boolean deleteLevel(String paramString)
/* 45:   */   {
/* 46:39 */     return this.levelStorageSource.e(paramString);
/* 47:   */   }
/* 48:   */   
/* 49:   */   public boolean isConvertible(String paramString)
/* 50:   */   {
/* 51:43 */     return this.levelStorageSource.a(paramString);
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void renameLevel(String paramString1, String paramString2)
/* 55:   */   {
/* 56:47 */     this.levelStorageSource.a(paramString1, paramString2);
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void clearAll()
/* 60:   */   {
/* 61:51 */     this.levelStorageSource.d();
/* 62:   */   }
/* 63:   */   
/* 64:   */   public List<RealmsLevelSummary> getLevelList() throws bqz
/* 65:   */   {
/* 66:55 */     ArrayList<RealmsLevelSummary> localArrayList = Lists.newArrayList();
/* 67:56 */     for (brb localbrb : this.levelStorageSource.b()) {
/* 68:57 */       localArrayList.add(new RealmsLevelSummary(localbrb));
/* 69:   */     }
/* 70:59 */     return localArrayList;
/* 71:   */   }
/* 72:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.RealmsAnvilLevelStorageSource
 * JD-Core Version:    0.7.0.1
 */