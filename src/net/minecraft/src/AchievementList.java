package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class AchievementList
/*  5:   */ {
/*  6:   */   public static int a;
/*  7:   */   public static int b;
/*  8:   */   public static int c;
/*  9:   */   public static int d;
/* 10:18 */   public static List<tk> e = Lists.newArrayList();
/* 11:20 */   public static tk f = new tk("achievement.openInventory", "openInventory", 0, 0, ItemList.book, null).a().c();
/* 12:21 */   public static tk mineWood = new tk("achievement.mineWood", "mineWood", 2, 1, BlockList.log, f).c();
/* 13:22 */   public static tk h = new tk("achievement.buildWorkBench", "buildWorkBench", 4, -1, BlockList.ai, mineWood).c();
/* 14:23 */   public static tk i = new tk("achievement.buildPickaxe", "buildPickaxe", 4, 2, ItemList.o, h).c();
/* 15:24 */   public static tk j = new tk("achievement.buildFurnace", "buildFurnace", 3, 4, BlockList.al, i).c();
/* 16:25 */   public static tk k = new tk("achievement.acquireIron", "acquireIron", 1, 4, ItemList.j, j).c();
/* 17:26 */   public static tk l = new tk("achievement.buildHoe", "buildHoe", 2, -3, ItemList.I, h).c();
/* 18:27 */   public static tk m = new tk("achievement.makeBread", "makeBread", -1, -3, ItemList.bread, l).c();
/* 19:28 */   public static tk n = new tk("achievement.bakeCake", "bakeCake", 0, -5, ItemList.aZ, l).c();
/* 20:29 */   public static tk o = new tk("achievement.buildBetterPickaxe", "buildBetterPickaxe", 6, 2, ItemList.s, i).c();
/* 21:30 */   public static tk p = new tk("achievement.cookFish", "cookFish", 2, 6, ItemList.aV, j).c();
/* 22:31 */   public static tk q = new tk("achievement.onARail", "onARail", 2, 3, BlockList.av, k).b().c();
/* 23:32 */   public static tk r = new tk("achievement.buildSword", "buildSword", 6, -1, ItemList.m, h).c();
/* 24:33 */   public static tk s = new tk("achievement.killEnemy", "killEnemy", 8, -1, ItemList.bone, r).c();
/* 25:34 */   public static tk killCow = new tk("achievement.killCow", "killCow", 7, -3, ItemList.leather, r).c();
/* 26:35 */   public static tk u = new tk("achievement.flyPig", "flyPig", 9, -3, ItemList.saddle, killCow).b().c();
/* 27:36 */   public static tk v = new tk("achievement.snipeSkeleton", "snipeSkeleton", 7, 0, ItemList.f, s).b().c();
/* 28:37 */   public static tk w = new tk("achievement.diamonds", "diamonds", -1, 5, BlockList.diamondOre, k).c();
/* 29:38 */   public static tk x = new tk("achievement.diamondsToYou", "diamondsToYou", -1, 2, ItemList.diamond, w).c();
/* 30:39 */   public static tk y = new tk("achievement.portal", "portal", -1, 7, BlockList.obsidian, w).c();
/* 31:40 */   public static tk z = new tk("achievement.ghast", "ghast", -4, 8, ItemList.bw, y).b().c();
/* 32:41 */   public static tk A = new tk("achievement.blazeRod", "blazeRod", 0, 9, ItemList.bv, y).c();
/* 33:42 */   public static tk B = new tk("achievement.potion", "potion", 2, 8, ItemList.potion, A).c();
/* 34:43 */   public static tk C = new tk("achievement.theEnd", "theEnd", 3, 10, ItemList.bH, A).b().c();
/* 35:44 */   public static tk D = new tk("achievement.theEnd2", "theEnd2", 4, 13, BlockList.dragonEgg, C).b().c();
/* 36:45 */   public static tk E = new tk("achievement.enchantments", "enchantments", -4, 4, BlockList.bC, w).c();
/* 37:46 */   public static tk F = new tk("achievement.overkill", "overkill", -4, 1, ItemList.u, E).b().c();
/* 38:47 */   public static tk G = new tk("achievement.bookcase", "bookcase", -3, 6, BlockList.bookshelf, E).c();
/* 39:48 */   public static tk H = new tk("achievement.breedCow", "breedCow", 7, -5, ItemList.O, killCow).c();
/* 40:49 */   public static tk I = new tk("achievement.spawnWither", "spawnWither", 7, 12, new ItemStack(ItemList.bX, 1, 1), D).c();
/* 41:50 */   public static tk J = new tk("achievement.killWither", "killWither", 7, 10, ItemList.bZ, I).c();
/* 42:51 */   public static tk K = new tk("achievement.fullBeacon", "fullBeacon", 7, 8, BlockList.bY, J).b().c();
/* 43:52 */   public static tk L = new tk("achievement.exploreAllBiomes", "exploreAllBiomes", 4, 8, ItemList.af, C).a(ua.class).b().c();
/* 44:53 */   public static tk M = new tk("achievement.overpowered", "overpowered", 6, 4, ItemList.ao, o).b().c();
/* 45:   */   
/* 46:   */   public static void a() {}
/* 47:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     tl
 * JD-Core Version:    0.7.0.1
 */