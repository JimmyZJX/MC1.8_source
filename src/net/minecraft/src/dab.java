package net.minecraft.src;
/*   1:    */ import tv.twitch.Core;
/*   2:    */ import tv.twitch.ErrorCode;
/*   3:    */ import tv.twitch.chat.Chat;
/*   4:    */ import tv.twitch.chat.IChatAPIListener;
/*   5:    */ 
/*   6:    */ class dab
/*   7:    */   implements IChatAPIListener
/*   8:    */ {
				private daa a;
/*   9:    */   dab(daa paramdaa) {}
/*  10:    */   
/*  11:    */   public void chatInitializationCallback(ErrorCode paramErrorCode)
/*  12:    */   {
/*  13:192 */     if (ErrorCode.succeeded(paramErrorCode))
/*  14:    */     {
/*  15:194 */       this.a.f.setMessageFlushInterval(this.a.n);
/*  16:195 */       this.a.f.setUserChangeEventInterval(this.a.o);
/*  17:    */       
/*  18:197 */       this.a.r();
/*  19:    */       
/*  20:199 */       this.a.a(daf.c);
/*  21:    */     }
/*  22:    */     else
/*  23:    */     {
/*  24:203 */       this.a.a(daf.a);
/*  25:    */     }
/*  26:    */     try
/*  27:    */     {
/*  28:208 */       if (this.a.a != null) {
/*  29:210 */         this.a.a.d(paramErrorCode);
/*  30:    */       }
/*  31:    */     }
/*  32:    */     catch (Exception localException)
/*  33:    */     {
/*  34:215 */       this.a.n(localException.toString());
/*  35:    */     }
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void chatShutdownCallback(ErrorCode paramErrorCode)
/*  39:    */   {
/*  40:222 */     if (ErrorCode.succeeded(paramErrorCode))
/*  41:    */     {
/*  42:224 */       ErrorCode localErrorCode = this.a.e.shutdown();
/*  43:225 */       if (ErrorCode.failed(localErrorCode))
/*  44:    */       {
/*  45:227 */         String str = ErrorCode.getString(localErrorCode);
/*  46:228 */         this.a.n(String.format("Error shutting down the Twitch sdk: %s", new Object[] { str }));
/*  47:    */       }
/*  48:231 */       this.a.a(daf.a);
/*  49:    */     }
/*  50:    */     else
/*  51:    */     {
/*  52:236 */       this.a.a(daf.c);
/*  53:    */       
/*  54:238 */       this.a.n(String.format("Error shutting down Twith chat: %s", new Object[] { paramErrorCode }));
/*  55:    */     }
/*  56:    */     try
/*  57:    */     {
/*  58:243 */       if (this.a.a != null) {
/*  59:245 */         this.a.a.e(paramErrorCode);
/*  60:    */       }
/*  61:    */     }
/*  62:    */     catch (Exception localException)
/*  63:    */     {
/*  64:250 */       this.a.n(localException.toString());
/*  65:    */     }
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void chatEmoticonDataDownloadCallback(ErrorCode paramErrorCode)
/*  69:    */   {
/*  70:257 */     if (ErrorCode.succeeded(paramErrorCode)) {
/*  71:259 */       this.a.s();
/*  72:    */     }
/*  73:    */   }
/*  74:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dab
 * JD-Core Version:    0.7.0.1
 */