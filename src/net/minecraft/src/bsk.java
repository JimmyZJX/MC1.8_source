package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;

/*  2:   */ import java.util.List;
/*  3:   */ import java.util.Map;
/*  4:   */ 
/*  5:   */ public abstract interface bsk
/*  6:   */ {
/*  7:11 */   public static final Map<String,bsk> a = Maps.newHashMap();
/*  8:13 */   public static final bsk b = new bsi("dummy");
/*  9:14 */   public static final bsk c = new bsi("trigger");
/* 10:15 */   public static final bsk d = new bsi("deathCount");
/* 11:16 */   public static final bsk e = new bsi("playerKillCount");
/* 12:17 */   public static final bsk f = new bsi("totalKillCount");
/* 13:18 */   public static final bsk g = new bsj("health");
/* 14:19 */   public static final bsk[] h = { new bsh("teamkill.", net.minecraft.src.a.a), new bsh("teamkill.", net.minecraft.src.a.b), new bsh("teamkill.", net.minecraft.src.a.c), new bsh("teamkill.", net.minecraft.src.a.d), new bsh("teamkill.", net.minecraft.src.a.e), new bsh("teamkill.", net.minecraft.src.a.f), new bsh("teamkill.", net.minecraft.src.a.g), new bsh("teamkill.", net.minecraft.src.a.h), new bsh("teamkill.", net.minecraft.src.a.i), new bsh("teamkill.", net.minecraft.src.a.j), new bsh("teamkill.", net.minecraft.src.a.k), new bsh("teamkill.", net.minecraft.src.a.l), new bsh("teamkill.", net.minecraft.src.a.m), new bsh("teamkill.", net.minecraft.src.a.n), new bsh("teamkill.", net.minecraft.src.a.o), new bsh("teamkill.", net.minecraft.src.a.p) };
/* 15:29 */   public static final bsk[] i = { new bsh("killedByTeam.", net.minecraft.src.a.a), new bsh("killedByTeam.", net.minecraft.src.a.b), new bsh("killedByTeam.", net.minecraft.src.a.c), new bsh("killedByTeam.", net.minecraft.src.a.d), new bsh("killedByTeam.", net.minecraft.src.a.e), new bsh("killedByTeam.", net.minecraft.src.a.f), new bsh("killedByTeam.", net.minecraft.src.a.g), new bsh("killedByTeam.", net.minecraft.src.a.h), new bsh("killedByTeam.", net.minecraft.src.a.i), new bsh("killedByTeam.", net.minecraft.src.a.j), new bsh("killedByTeam.", net.minecraft.src.a.k), new bsh("killedByTeam.", net.minecraft.src.a.l), new bsh("killedByTeam.", net.minecraft.src.a.m), new bsh("killedByTeam.", net.minecraft.src.a.n), new bsh("killedByTeam.", net.minecraft.src.a.o), new bsh("killedByTeam.", net.minecraft.src.a.p) };
/* 16:   */   
/* 17:   */   public abstract String a();
/* 18:   */   
/* 19:   */   public abstract int a(List<EntityPlayer> paramList);
/* 20:   */   
/* 21:   */   public abstract boolean b();
/* 22:   */   
/* 23:   */   public abstract bsl c();
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsk
 * JD-Core Version:    0.7.0.1
 */