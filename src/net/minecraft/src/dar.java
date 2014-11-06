package net.minecraft.src;
/*   1:    */ import com.google.gson.JsonObject;
/*   2:    */ import com.google.gson.JsonParser;
/*   3:    */ import com.mojang.authlib.properties.Property;
/*   4:    */ import java.io.IOException;
/*   5:    */ import java.net.URL;
/*   6:    */ import java.net.URLEncoder;
/*   8:    */ import tv.twitch.AuthToken;
/*   9:    */ 
/*  10:    */ class dar
/*  11:    */   extends Thread
/*  12:    */ {
				private final Property a;
				final daq b;
/*  13:    */   dar(daq paramdaq, String paramString, Property paramProperty)
/*  14:    */   {
/*  15: 80 */     super(paramString);
				  a=paramProperty;b=paramdaq;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void run()
/*  19:    */   {
/*  20:    */     try
/*  21:    */     {
/*  22: 84 */       URL localURL = new URL("https://api.twitch.tv/kraken?oauth_token=" + URLEncoder.encode(this.a.getValue(), "UTF-8"));
/*  23: 85 */       String str1 = ui.a(localURL);
/*  24: 86 */       JsonObject localJsonObject1 = uh.l(new JsonParser().parse(str1), "Response");
/*  25: 87 */       JsonObject localJsonObject2 = uh.s(localJsonObject1, "token");
/*  26: 89 */       if (uh.i(localJsonObject2, "valid"))
/*  27:    */       {
/*  28: 90 */         String str2 = uh.h(localJsonObject2, "user_name");
/*  29: 91 */         daq.G().debug(daq.a, "Authenticated with twitch; username is {}", new Object[] { str2 });
/*  30: 92 */         AuthToken localAuthToken = new AuthToken();
/*  31: 93 */         localAuthToken.data = this.a.getValue();
/*  32:    */         
/*  33: 95 */         daq.a(this.b).a(str2, localAuthToken);
/*  34: 96 */         daq.b(this.b).c(str2);
/*  35: 97 */         daq.b(this.b).a(localAuthToken);
/*  36:    */         
/*  37: 99 */         Runtime.getRuntime().addShutdownHook(new das(this, "Twitch shutdown hook"));
/*  38:    */         
/*  39:    */ 
/*  40:    */ 
/*  41:    */ 
/*  42:    */ 
/*  43:105 */         daq.a(this.b).C();
/*  44:    */         
/*  45:    */ 
/*  46:108 */         daq.b(this.b).n();
/*  47:    */       }
/*  48:    */       else
/*  49:    */       {
/*  50:110 */         daq.a(this.b, dap.b);
/*  51:111 */         daq.G().error(daq.a, "Given twitch access token is invalid");
/*  52:    */       }
/*  53:    */     }
/*  54:    */     catch (IOException localIOException)
/*  55:    */     {
/*  56:114 */       daq.a(this.b, dap.a);
/*  57:115 */       daq.G().error(daq.a, "Could not authenticate with twitch", localIOException);
/*  58:    */     }
/*  59:    */   }
/*  60:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dar
 * JD-Core Version:    0.7.0.1
 */