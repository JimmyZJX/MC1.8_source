package net.minecraft.src;
/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class qj
/*  4:   */   extends WorldServer
/*  5:   */ {
/*  6:14 */   private static final long I = "North Carolina".hashCode();
/*  7:16 */   public static final WorldSettings a = new WorldSettings(I, EnumGameType.b, true, false, WorldType.DEFAULT).a();
/*  8:   */   
/*  9:   */   public qj(MinecraftServer paramMinecraftServer, bqy parambqy, WorldInfo parambqo, int paramInt, uw paramuw)
/* 10:   */   {
/* 11:19 */     super(paramMinecraftServer, parambqy, parambqo, paramInt, paramuw);
/* 12:20 */     this.worldInfo.a(a);
/* 13:   */   }
/* 14:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     qj
 * JD-Core Version:    0.7.0.1
 */