package net.minecraft.src;
/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ import com.mojang.authlib.exceptions.AuthenticationException;
/*  3:   */ import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
/*  4:   */ import com.mojang.authlib.exceptions.InvalidCredentialsException;
/*  5:   */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*  6:   */ import io.netty.util.concurrent.GenericFutureListener;
/*  7:   */ import java.math.BigInteger;
/*  8:   */ import java.security.PublicKey;
/*  9:   */ import javax.crypto.SecretKey;
/* 10:   */ import org.apache.logging.log4j.LogManager;
/* 11:   */ import org.apache.logging.log4j.Logger;
/* 12:   */ 
/* 13:   */ public class cec
/* 14:   */   implements nc
/* 15:   */ {
/* 16:27 */   private static final Logger a = LogManager.getLogger();
/* 17:   */   private final bsu b;
/* 18:   */   private final bxf c;
/* 19:   */   private final gr d;
/* 20:   */   private GameProfile e;
/* 21:   */   
/* 22:   */   public cec(gr paramgr, bsu parambsu, bxf parambxf)
/* 23:   */   {
/* 24:34 */     this.d = paramgr;
/* 25:35 */     this.b = parambsu;
/* 26:36 */     this.c = parambxf;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(ne paramne)
/* 30:   */   {
/* 31:41 */     SecretKey localSecretKey = ug.a();
/* 32:42 */     String str1 = paramne.a();
/* 33:43 */     PublicKey localPublicKey = paramne.b();
/* 34:44 */     String str2 = new BigInteger(ug.a(str1, localPublicKey, localSecretKey)).toString(16);
/* 35:   */     try
/* 36:   */     {
/* 37:47 */       b().joinServer(this.b.K().e(), this.b.K().d(), str2);
/* 38:   */     }
/* 39:   */     catch (AuthenticationUnavailableException localAuthenticationUnavailableException)
/* 40:   */     {
/* 41:49 */       this.d.a(new hz("disconnect.loginFailedInfo", new Object[] { new hz("disconnect.loginFailedInfo.serversUnavailable", new Object[0]) }));
/* 42:50 */       return;
/* 43:   */     }
/* 44:   */     catch (InvalidCredentialsException localInvalidCredentialsException)
/* 45:   */     {
/* 46:52 */       this.d.a(new hz("disconnect.loginFailedInfo", new Object[] { new hz("disconnect.loginFailedInfo.invalidSession", new Object[0]) }));
/* 47:53 */       return;
/* 48:   */     }
/* 49:   */     catch (AuthenticationException localAuthenticationException)
/* 50:   */     {
/* 51:55 */       this.d.a(new hz("disconnect.loginFailedInfo", new Object[] { localAuthenticationException.getMessage() }));
/* 52:56 */       return;
/* 53:   */     }
/* 54:59 */     this.d.a(new nj(localSecretKey, localPublicKey, paramne.c()), new ced(this, localSecretKey), new GenericFutureListener[0]);
/* 55:   */   }
/* 56:   */   
/* 57:   */   private MinecraftSessionService b()
/* 58:   */   {
/* 59:68 */     return this.b.Y();
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void a(nd paramnd)
/* 63:   */   {
/* 64:73 */     this.e = paramnd.a();
/* 65:74 */     this.d.a(gy.b);
/* 66:75 */     this.d.a(new cee(this.b, this.c, this.d, this.e));
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void a(ho paramho)
/* 70:   */   {
/* 71:80 */     this.b.a(new bwo(this.c, "connect.failed", paramho));
/* 72:   */   }
/* 73:   */   
/* 74:   */   public void a(ng paramng)
/* 75:   */   {
/* 76:90 */     this.d.a(paramng.a());
/* 77:   */   }
/* 78:   */   
/* 79:   */   public void a(nf paramnf)
/* 80:   */   {
/* 81:95 */     if (!this.d.c()) {
/* 82:96 */       this.d.a(paramnf.a());
/* 83:   */     }
/* 84:   */   }
			  static gr a(cec arg0) {return arg0.d;}
/* 85:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cec
 * JD-Core Version:    0.7.0.1
 */