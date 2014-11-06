package net.minecraft.src;
/*   1:    */ import com.google.common.cache.CacheBuilder;
/*   2:    */ import com.google.common.cache.LoadingCache;
/*   3:    */ import com.mojang.authlib.GameProfile;
/*   4:    */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*   5:    */ import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
/*   6:    */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*   7:    */ import java.io.File;
/*   8:    */ import java.util.Map;
/*   9:    */ import java.util.concurrent.ExecutorService;
/*  10:    */ import java.util.concurrent.LinkedBlockingQueue;
/*  11:    */ import java.util.concurrent.ThreadPoolExecutor;
/*  12:    */ import java.util.concurrent.TimeUnit;
/*  13:    */ 
/*  14:    */ public class cvw
/*  15:    */ {
/*  16: 29 */   private static final ExecutorService a = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
/*  17:    */   private final cug b;
/*  18:    */   private final File c;
/*  19:    */   private final MinecraftSessionService d;
/*  20:    */   private final LoadingCache e;
/*  21:    */   
/*  22:    */   public cvw(cug paramcug, File paramFile, MinecraftSessionService paramMinecraftSessionService)
/*  23:    */   {
/*  24: 37 */     this.b = paramcug;
/*  25: 38 */     this.c = paramFile;
/*  26: 39 */     this.d = paramMinecraftSessionService;
/*  27:    */     
/*  28: 41 */     this.e = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.SECONDS).build(new cvx(this));
/*  29:    */   }
/*  30:    */   
/*  31:    */   public oa a(MinecraftProfileTexture paramMinecraftProfileTexture, MinecraftProfileTexture.Type paramType)
/*  32:    */   {
/*  33: 53 */     return a(paramMinecraftProfileTexture, paramType, null);
/*  34:    */   }
/*  35:    */   
/*  36:    */   public oa a(MinecraftProfileTexture paramMinecraftProfileTexture, MinecraftProfileTexture.Type paramType, cwb paramcwb)
/*  37:    */   {
/*  38: 57 */     oa localoa = new oa("skins/" + paramMinecraftProfileTexture.getHash());
/*  39: 58 */     cui localcui = this.b.b(localoa);
/*  40: 60 */     if (localcui != null)
/*  41:    */     {
/*  42: 61 */       if (paramcwb != null) {
/*  43: 62 */         paramcwb.a(paramType, localoa, paramMinecraftProfileTexture);
/*  44:    */       }
/*  45:    */     }
/*  46:    */     else
/*  47:    */     {
/*  48: 65 */       File localFile1 = new File(this.c, paramMinecraftProfileTexture.getHash().substring(0, 2));
/*  49: 66 */       File localFile2 = new File(localFile1, paramMinecraftProfileTexture.getHash());
/*  50: 67 */       ckh localckh = paramType == MinecraftProfileTexture.Type.SKIN ? new ckr() : null;
/*  51: 68 */       ctq localctq = new ctq(localFile2, paramMinecraftProfileTexture.getUrl(), cva.a(), new cvy(this, localckh, paramcwb, paramType, localoa, paramMinecraftProfileTexture));
/*  52:    */       
/*  53:    */ 
/*  54:    */ 
/*  55:    */ 
/*  56:    */ 
/*  57:    */ 
/*  58:    */ 
/*  59:    */ 
/*  60:    */ 
/*  61:    */ 
/*  62:    */ 
/*  63:    */ 
/*  64:    */ 
/*  65:    */ 
/*  66:    */ 
/*  67:    */ 
/*  68:    */ 
/*  69:    */ 
/*  70: 87 */       this.b.a(localoa, localctq);
/*  71:    */     }
/*  72: 90 */     return localoa;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void a(GameProfile paramGameProfile, cwb paramcwb, boolean paramBoolean)
/*  76:    */   {
/*  77: 94 */     a.submit(new cvz(this, paramGameProfile, paramBoolean, paramcwb));
/*  78:    */   }
/*  79:    */   
/*  80:    */   public Map a(GameProfile paramGameProfile)
/*  81:    */   {
/*  82:124 */     return (Map)this.e.getUnchecked(paramGameProfile);
/*  83:    */   }
				static MinecraftSessionService a(cvw paramcvw) {return paramcvw.d;}
/*  84:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cvw
 * JD-Core Version:    0.7.0.1
 */