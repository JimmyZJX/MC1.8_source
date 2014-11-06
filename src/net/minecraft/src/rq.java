package net.minecraft.src;
/*   1:    */ import com.google.common.base.Charsets;
/*   2:    */ import com.mojang.authlib.GameProfile;
/*   3:    */ import io.netty.util.concurrent.GenericFutureListener;
/*   5:    */ import java.security.PrivateKey;
/*   6:    */ import java.util.Arrays;
/*   7:    */ import java.util.Random;
/*   8:    */ import java.util.UUID;
/*   9:    */ import java.util.concurrent.atomic.AtomicInteger;
/*  10:    */ import javax.crypto.SecretKey;
/*  11:    */ import net.minecraft.server.MinecraftServer;
/*  12:    */ import org.apache.commons.lang3.Validate;
/*  13:    */ import org.apache.logging.log4j.LogManager;
/*  14:    */ import org.apache.logging.log4j.Logger;
/*  15:    */ 
/*  16:    */ public class rq
/*  17:    */   implements nh, pm
/*  18:    */ {
/*  19: 31 */   private static final AtomicInteger b = new AtomicInteger(0);
/*  20: 32 */   private static final Logger c = LogManager.getLogger();
/*  21: 34 */   private static final Random d = new Random();
/*  22: 36 */   private final byte[] e = new byte[4];
/*  23:    */   private final MinecraftServer f;
/*  24:    */   public final gr a;
/*  25: 39 */   private rt g = rt.a;
/*  26:    */   private int h;
/*  27:    */   private GameProfile i;
/*  28: 42 */   private String j = "";
/*  29:    */   private SecretKey k;
/*  30:    */   
/*  31:    */   public rq(MinecraftServer paramMinecraftServer, gr paramgr)
/*  32:    */   {
/*  33: 46 */     this.f = paramMinecraftServer;
/*  34: 47 */     this.a = paramgr;
/*  35: 48 */     d.nextBytes(this.e);
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void c()
/*  39:    */   {
/*  40: 53 */     if (this.g == rt.d) {
/*  41: 54 */       b();
/*  42:    */     }
/*  43: 56 */     if (this.h++ == 600) {
/*  44: 57 */       a("Took too long to log in");
/*  45:    */     }
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void a(String paramString)
/*  49:    */   {
/*  50:    */     try
/*  51:    */     {
/*  52: 68 */       c.info("Disconnecting " + d() + ": " + paramString);
/*  53: 69 */       hy localhy = new hy(paramString);
/*  54: 70 */       this.a.a(new ng(localhy));
/*  55: 71 */       this.a.a(localhy);
/*  56:    */     }
/*  57:    */     catch (Exception localException)
/*  58:    */     {
/*  59: 73 */       c.error("Error whilst disconnecting player", localException);
/*  60:    */     }
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void b()
/*  64:    */   {
/*  65: 78 */     if (!this.i.isComplete()) {
/*  66: 79 */       this.i = a(this.i);
/*  67:    */     }
/*  68: 82 */     String str = this.f.an().a(this.a.b(), this.i);
/*  69: 83 */     if (str != null)
/*  70:    */     {
/*  71: 84 */       a(str);
/*  72:    */     }
/*  73:    */     else
/*  74:    */     {
/*  75: 86 */       this.g = rt.e;
/*  76: 87 */       if ((this.f.aI() >= 0) && (!this.a.c())) {
/*  77: 88 */         this.a.a(new nf(this.f.aI()), new rr(this), new GenericFutureListener[0]);
/*  78:    */       }
/*  79: 95 */       this.a.a(new nd(this.i));
/*  80: 96 */       this.f.an().a(this.a, this.f.an().f(this.i));
/*  81:    */     }
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void a(ho paramho)
/*  85:    */   {
/*  86:102 */     c.info(d() + " lost connection: " + paramho.c());
/*  87:    */   }
/*  88:    */   
/*  89:    */   public String d()
/*  90:    */   {
/*  91:110 */     if (this.i != null) {
/*  92:111 */       return this.i.toString() + " (" + this.a.b().toString() + ")";
/*  93:    */     }
/*  94:113 */     return String.valueOf(this.a.b());
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void a(ni paramni)
/*  98:    */   {
/*  99:118 */     Validate.validState(this.g == rt.a, "Unexpected hello packet", new Object[0]);
/* 100:119 */     this.i = paramni.a();
/* 101:121 */     if ((this.f.ae()) && (!this.a.c()))
/* 102:    */     {
/* 103:122 */       this.g = rt.b;
/* 104:123 */       this.a.a(new ne(this.j, this.f.P().getPublic(), this.e));
/* 105:    */     }
/* 106:    */     else
/* 107:    */     {
/* 108:125 */       this.g = rt.d;
/* 109:    */     }
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void a(nj paramnj)
/* 113:    */   {
/* 114:131 */     Validate.validState(this.g == rt.b, "Unexpected key packet", new Object[0]);
/* 115:132 */     PrivateKey localPrivateKey = this.f.P().getPrivate();
/* 116:134 */     if (!Arrays.equals(this.e, paramnj.b(localPrivateKey))) {
/* 117:135 */       throw new IllegalStateException("Invalid nonce!");
/* 118:    */     }
/* 119:138 */     this.k = paramnj.a(localPrivateKey);
/* 120:139 */     this.g = rt.c;
/* 121:    */     
/* 122:141 */     this.a.a(this.k);
/* 123:    */     
/* 124:143 */     new rs(this, "User Authenticator #" + b.incrementAndGet()).start();
/* 125:    */   }
/* 126:    */   
/* 127:    */   protected GameProfile a(GameProfile paramGameProfile)
/* 128:    */   {
/* 129:178 */     UUID localUUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + paramGameProfile.getName()).getBytes(Charsets.UTF_8));
/* 130:179 */     return new GameProfile(localUUID, paramGameProfile.getName());
/* 131:    */   }
				static MinecraftServer a(rq arg0) {return arg0.f;}
				static GameProfile b(rq arg0) {return arg0.i;}
				static String c(rq arg0) {return arg0.j;}
				static SecretKey d(rq arg0) {return arg0.k;}
				static GameProfile a(rq arg0, GameProfile arg1) {return arg0.i=arg1;}
				static Logger e() {return c;}
				static rt a(rq arg0, rt arg1) {return arg0.g=arg1;}
/* 132:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     rq
 * JD-Core Version:    0.7.0.1
 */