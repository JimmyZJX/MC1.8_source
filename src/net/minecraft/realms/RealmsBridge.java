/*  1:   */ package net.minecraft.realms;
/*  2:   */ 
/*  3:   */ /*  5:   */ import java.lang.reflect.Constructor;

import net.minecraft.src.bsu;
import net.minecraft.src.bxf;

/*  6:   */ import org.apache.logging.log4j.LogManager;
/*  7:   */ import org.apache.logging.log4j.Logger;
/*  8:   */ 
/*  9:   */ public class RealmsBridge
/* 10:   */   extends RealmsScreen
/* 11:   */ {
/* 12:11 */   private static final Logger LOGGER = LogManager.getLogger();
/* 13:   */   private bxf previousScreen;
/* 14:   */   
/* 15:   */   public void switchToRealms(bxf parambxf)
/* 16:   */   {
/* 17:16 */     this.previousScreen = parambxf;
/* 18:   */     try
/* 19:   */     {
/* 20:18 */       Class localClass = Class.forName("com.mojang.realmsclient.RealmsMainScreen");
/* 21:19 */       Constructor localConstructor = localClass.getDeclaredConstructor(new Class[] { RealmsScreen.class });
/* 22:20 */       localConstructor.setAccessible(true);
/* 23:21 */       Object localObject = localConstructor.newInstance(new Object[] { this });
/* 24:22 */       bsu.z().a(((RealmsScreen)localObject).getProxy());
/* 25:   */     }
/* 26:   */     catch (Exception localException)
/* 27:   */     {
/* 28:24 */       LOGGER.error("Realms module missing", localException);
/* 29:   */     }
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void init()
/* 33:   */   {
/* 34:30 */     bsu.z().a(this.previousScreen);
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.RealmsBridge
 * JD-Core Version:    0.7.0.1
 */