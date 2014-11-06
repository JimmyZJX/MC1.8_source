package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Iterators;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import com.mojang.authlib.Agent;
/*   4:    */ import com.mojang.authlib.GameProfile;
/*   5:    */ import com.mojang.authlib.GameProfileRepository;
/*   6:    */ import com.mojang.authlib.ProfileLookupCallback;
/*   7:    */ import java.io.File;
/*   8:    */ import java.util.ArrayList;
/*   9:    */ import java.util.Collection;
/*  10:    */ import java.util.List;
/*  11:    */ import java.util.UUID;
/*  12:    */ import net.minecraft.server.MinecraftServer;
/*  13:    */ import org.apache.logging.log4j.LogManager;
/*  14:    */ import org.apache.logging.log4j.Logger;
/*  15:    */ 
/*  16:    */ public class sf
/*  17:    */ {
/*  18: 29 */   private static final Logger e = LogManager.getLogger();
/*  19: 30 */   public static final File a = new File("banned-ips.txt");
/*  20: 31 */   public static final File b = new File("banned-players.txt");
/*  21: 32 */   public static final File c = new File("ops.txt");
/*  22: 33 */   public static final File d = new File("white-list.txt");
/*  23:    */   
/*  24:    */   private static void a(MinecraftServer paramMinecraftServer, Collection paramCollection, ProfileLookupCallback paramProfileLookupCallback)
/*  25:    */   {
/*  26: 49 */     String[] arrayOfString1 = (String[])Iterators.toArray(Iterators.filter(paramCollection.iterator(), new sg()), String.class);
/*  27: 55 */     if (paramMinecraftServer.ae()) {
/*  28: 56 */       paramMinecraftServer.aC().findProfilesByNames(arrayOfString1, Agent.MINECRAFT, paramProfileLookupCallback);
/*  29:    */     } else {
/*  30: 58 */       for (String str : arrayOfString1)
/*  31:    */       {
/*  32: 59 */         UUID localUUID = EntityPlayer.a(new GameProfile(null, str));
/*  33: 60 */         GameProfile localGameProfile = new GameProfile(localUUID, str);
/*  34: 61 */         paramProfileLookupCallback.onProfileLookupSucceeded(localGameProfile);
/*  35:    */       }
/*  36:    */     }
/*  37:    */   }
/*  38:    */   
/*  39:    */   public static String a(String paramString)
/*  40:    */   {
/*  41:238 */     if ((vb.b(paramString)) || (paramString.length() > 16)) {
/*  42:239 */       return paramString;
/*  43:    */     }
/*  44:241 */     MinecraftServer localMinecraftServer = MinecraftServer.M();
/*  45:242 */     GameProfile localGameProfile = localMinecraftServer.aD().a(paramString);
/*  46:243 */     if ((localGameProfile != null) && (localGameProfile.getId() != null)) {
/*  47:244 */       return localGameProfile.getId().toString();
/*  48:    */     }
/*  49:246 */     if ((localMinecraftServer.S()) || (!localMinecraftServer.ae())) {
/*  50:247 */       return EntityPlayer.a(new GameProfile(null, paramString)).toString();
/*  51:    */     }
/*  52:249 */     ArrayList localArrayList = Lists.newArrayList();
/*  53:250 */     sk localsk = new sk(localMinecraftServer, localArrayList);
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
/*  65:262 */     a(localMinecraftServer, Lists.newArrayList(new String[] { paramString }), localsk);
/*  66:263 */     if ((localArrayList.size() > 0) && (((GameProfile)localArrayList.get(0)).getId() != null)) {
/*  67:264 */       return ((GameProfile)localArrayList.get(0)).getId().toString();
/*  68:    */     }
/*  69:267 */     return "";
/*  70:    */   }
				static Logger a() {return e;}
/*  71:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     sf
 * JD-Core Version:    0.7.0.1
 */