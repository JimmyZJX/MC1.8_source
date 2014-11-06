package net.minecraft.src;
/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ import java.util.UUID;
/*  3:   */ 
/*  4:   */ public class nd
/*  5:   */   implements id<nc>
/*  6:   */ {
/*  7:   */   private GameProfile a;
/*  8:   */   
/*  9:   */   public nd() {}
/* 10:   */   
/* 11:   */   public nd(GameProfile paramGameProfile)
/* 12:   */   {
/* 13:19 */     this.a = paramGameProfile;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 17:   */   {
/* 18:24 */     String str1 = paramhd.c(36);
/* 19:25 */     String str2 = paramhd.c(16);
/* 20:26 */     UUID localUUID = UUID.fromString(str1);
/* 21:27 */     this.a = new GameProfile(localUUID, str2);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 25:   */   {
/* 26:32 */     UUID localUUID = this.a.getId();
/* 27:33 */     paramhd.a(localUUID == null ? "" : localUUID.toString());
/* 28:34 */     paramhd.a(this.a.getName());
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(nc paramnc)
/* 32:   */   {
/* 33:39 */     paramnc.a(this);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public GameProfile a()
/* 37:   */   {
/* 38:43 */     return this.a;
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     nd
 * JD-Core Version:    0.7.0.1
 */