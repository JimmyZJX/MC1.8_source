package net.minecraft.src;
/*   1:    */ import com.mojang.authlib.GameProfile;
/*   2:    */ import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
/*   4:    */ import java.math.BigInteger;
/*   8:    */ 
/*   9:    */ class rs
/*  10:    */   extends Thread
/*  11:    */ {
				private final rq a;
/*  12:    */   rs(rq paramrq, String paramString)
/*  13:    */   {
/*  14:143 */     super(paramString);
				  a=paramrq;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void run()
/*  18:    */   {
/*  19:146 */     GameProfile localGameProfile = rq.b(this.a);
/*  20:    */     try
/*  21:    */     {
/*  22:149 */       String str = new BigInteger(ug.a(rq.c(this.a), rq.a(this.a).P().getPublic(), rq.d(this.a))).toString(16);
/*  23:150 */       rq.a(this.a, rq.a(this.a).aB().hasJoinedServer(new GameProfile(null, localGameProfile.getName()), str));
/*  24:152 */       if (rq.b(this.a) != null)
/*  25:    */       {
/*  26:153 */         rq.e().info("UUID of player " + rq.b(this.a).getName() + " is " + rq.b(this.a).getId());
/*  27:154 */         rq.a(this.a, rt.d);
/*  28:    */       }
/*  29:155 */       else if (rq.a(this.a).S())
/*  30:    */       {
/*  31:156 */         rq.e().warn("Failed to verify username but will let them in anyway!");
/*  32:157 */         rq.a(this.a, this.a.a(localGameProfile));
/*  33:158 */         rq.a(this.a, rt.d);
/*  34:    */       }
/*  35:    */       else
/*  36:    */       {
/*  37:160 */         this.a.a("Failed to verify username!");
/*  38:161 */         rq.e().error("Username '" + rq.b(this.a).getName() + "' tried to join with an invalid session");
/*  39:    */       }
/*  40:    */     }
/*  41:    */     catch (AuthenticationUnavailableException localAuthenticationUnavailableException)
/*  42:    */     {
/*  43:164 */       if (rq.a(this.a).S())
/*  44:    */       {
/*  45:165 */         rq.e().warn("Authentication servers are down but will let them in anyway!");
/*  46:166 */         rq.a(this.a, this.a.a(localGameProfile));
/*  47:167 */         rq.a(this.a, rt.d);
/*  48:    */       }
/*  49:    */       else
/*  50:    */       {
/*  51:169 */         this.a.a("Authentication servers are down. Please try again later, sorry!");
/*  52:170 */         rq.e().error("Couldn't verify username because servers are unavailable");
/*  53:    */       }
/*  54:    */     }
/*  55:    */   }
/*  56:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     rs
 * JD-Core Version:    0.7.0.1
 */