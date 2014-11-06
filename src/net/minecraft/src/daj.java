package net.minecraft.src;
/*   2:    */ import tv.twitch.AuthToken;
/*   3:    */ import tv.twitch.ErrorCode;
/*   4:    */ import tv.twitch.broadcast.ArchivingState;
/*   5:    */ import tv.twitch.broadcast.ChannelInfo;
/*   6:    */ import tv.twitch.broadcast.GameInfoList;
/*   7:    */ import tv.twitch.broadcast.IStreamCallbacks;
/*   8:    */ import tv.twitch.broadcast.IngestList;
/*  10:    */ import tv.twitch.broadcast.StreamInfo;
/*  11:    */ import tv.twitch.broadcast.UserInfo;
/*  12:    */ 
/*  13:    */ class daj
/*  14:    */   implements IStreamCallbacks
/*  15:    */ {
				private final dai a;
/*  16:    */   daj(dai paramdai) {a=paramdai;}
/*  17:    */   
/*  18:    */   public void requestAuthTokenCallback(ErrorCode paramErrorCode, AuthToken paramAuthToken) {}
/*  19:    */   
/*  20:    */   public void loginCallback(ErrorCode paramErrorCode, ChannelInfo paramChannelInfo) {}
/*  21:    */   
/*  22:    */   public void getIngestServersCallback(ErrorCode paramErrorCode, IngestList paramIngestList) {}
/*  23:    */   
/*  24:    */   public void getUserInfoCallback(ErrorCode paramErrorCode, UserInfo paramUserInfo) {}
/*  25:    */   
/*  26:    */   public void getStreamInfoCallback(ErrorCode paramErrorCode, StreamInfo paramStreamInfo) {}
/*  27:    */   
/*  28:    */   public void getArchivingStateCallback(ErrorCode paramErrorCode, ArchivingState paramArchivingState) {}
/*  29:    */   
/*  30:    */   public void runCommercialCallback(ErrorCode paramErrorCode) {}
/*  31:    */   
/*  32:    */   public void setStreamInfoCallback(ErrorCode paramErrorCode) {}
/*  33:    */   
/*  34:    */   public void getGameNameListCallback(ErrorCode paramErrorCode, GameInfoList paramGameInfoList) {}
/*  35:    */   
/*  36:    */   public void bufferUnlockCallback(long paramLong) {}
/*  37:    */   
/*  38:    */   public void startCallback(ErrorCode paramErrorCode)
/*  39:    */   {
/*  40:187 */     this.a.y = false;
/*  41:190 */     if (ErrorCode.succeeded(paramErrorCode))
/*  42:    */     {
/*  43:192 */       this.a.x = true;
/*  44:193 */       this.a.k = System.currentTimeMillis();
/*  45:    */       
/*  46:195 */       this.a.a(dan.c);
/*  47:    */     }
/*  48:    */     else
/*  49:    */     {
/*  50:200 */       this.a.m = false;
/*  51:201 */       this.a.a(dan.e);
/*  52:    */     }
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void stopCallback(ErrorCode paramErrorCode)
/*  56:    */   {
/*  57:210 */     if (ErrorCode.failed(paramErrorCode)) {
/*  58:213 */       System.out.println("IngestTester.stopCallback failed to stop - " + this.a.p.serverName + ": " + paramErrorCode.toString());
/*  59:    */     }
/*  60:216 */     this.a.z = false;
/*  61:217 */     this.a.x = false;
/*  62:    */     
/*  63:219 */     this.a.a(dan.e);
/*  64:    */     
/*  65:221 */     this.a.p = null;
/*  66:223 */     if (this.a.q) {
/*  67:225 */       this.a.a(dan.g);
/*  68:    */     }
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void sendActionMetaDataCallback(ErrorCode paramErrorCode) {}
/*  72:    */   
/*  73:    */   public void sendStartSpanMetaDataCallback(ErrorCode paramErrorCode) {}
/*  74:    */   
/*  75:    */   public void sendEndSpanMetaDataCallback(ErrorCode paramErrorCode) {}
/*  76:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     daj
 * JD-Core Version:    0.7.0.1
 */