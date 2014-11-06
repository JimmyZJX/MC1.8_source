/*  1:   */ package net.minecraft.realms;
/*  2:   */ 
/*  3:   */ /*  7:   */ import com.mojang.authlib.GameProfile;
/*  8:   */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*  9:   */ import com.mojang.util.UUIDTypeAdapter;

/* 10:   */ import java.io.File;
/* 11:   */ import java.net.Proxy;

import net.minecraft.src.EnumGameType;
import net.minecraft.src.bsu;
import net.minecraft.src.bto;
import net.minecraft.src.btw;
/* 12:   */ 
/* 13:   */ public class Realms
/* 14:   */ {
/* 15:   */   public static boolean isTouchScreen()
/* 16:   */   {
/* 17:14 */     return bsu.z().t.z;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public static Proxy getProxy()
/* 21:   */   {
/* 22:18 */     return bsu.z().M();
/* 23:   */   }
/* 24:   */   
/* 25:   */   public static String sessionId()
/* 26:   */   {
/* 27:22 */     btw localbtw = bsu.z().K();
/* 28:23 */     if (localbtw == null) {
/* 29:24 */       return null;
/* 30:   */     }
/* 31:26 */     return localbtw.a();
/* 32:   */   }
/* 33:   */   
/* 34:   */   public static String userName()
/* 35:   */   {
/* 36:30 */     btw localbtw = bsu.z().K();
/* 37:31 */     if (localbtw == null) {
/* 38:32 */       return null;
/* 39:   */     }
/* 40:34 */     return localbtw.c();
/* 41:   */   }
/* 42:   */   
/* 43:   */   public static long currentTimeMillis()
/* 44:   */   {
/* 45:38 */     return bsu.I();
/* 46:   */   }
/* 47:   */   
/* 48:   */   public static String getSessionId()
/* 49:   */   {
/* 50:42 */     return bsu.z().K().a();
/* 51:   */   }
/* 52:   */   
/* 53:   */   public static String getName()
/* 54:   */   {
/* 55:46 */     return bsu.z().K().c();
/* 56:   */   }
/* 57:   */   
/* 58:   */   public static String uuidToName(String paramString)
/* 59:   */   {
/* 60:50 */     return bsu.z().Y().fillProfileProperties(new GameProfile(UUIDTypeAdapter.fromString(paramString), null), false).getName();
/* 61:   */   }
/* 62:   */   
/* 63:   */   public static void setScreen(RealmsScreen paramRealmsScreen)
/* 64:   */   {
/* 65:54 */     bsu.z().a(paramRealmsScreen.getProxy());
/* 66:   */   }
/* 67:   */   
/* 68:   */   public static String getGameDirectoryPath()
/* 69:   */   {
/* 70:58 */     return bsu.z().v.getAbsolutePath();
/* 71:   */   }
/* 72:   */   
/* 73:   */   public static int survivalId()
/* 74:   */   {
/* 75:62 */     return EnumGameType.b.a();
/* 76:   */   }
/* 77:   */   
/* 78:   */   public static int creativeId()
/* 79:   */   {
/* 80:66 */     return EnumGameType.CREATIVE.a();
/* 81:   */   }
/* 82:   */   
/* 83:   */   public static int adventureId()
/* 84:   */   {
/* 85:70 */     return EnumGameType.d.a();
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.Realms
 * JD-Core Version:    0.7.0.1
 */