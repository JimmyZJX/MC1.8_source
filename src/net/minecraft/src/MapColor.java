package net.minecraft.src;
/*  1:   */ public class MapColor
/*  2:   */ {
/*  3: 4 */   public static final MapColor[] a = new MapColor[64];
/*  4: 6 */   public static final MapColor b = new MapColor(0, 0);
/*  5: 7 */   public static final MapColor c = new MapColor(1, 8368696);
/*  6: 8 */   public static final MapColor d = new MapColor(2, 16247203);
/*  7: 9 */   public static final MapColor e = new MapColor(3, 10987431);
/*  8:10 */   public static final MapColor f = new MapColor(4, 16711680);
/*  9:11 */   public static final MapColor g = new MapColor(5, 10526975);
/* 10:12 */   public static final MapColor h = new MapColor(6, 10987431);
/* 11:13 */   public static final MapColor i = new MapColor(7, 31744);
/* 12:14 */   public static final MapColor j = new MapColor(8, 16777215);
/* 13:15 */   public static final MapColor k = new MapColor(9, 10791096);
/* 14:16 */   public static final MapColor l = new MapColor(10, 12020271);
/* 15:17 */   public static final MapColor m = new MapColor(11, 7368816);
/* 16:18 */   public static final MapColor n = new MapColor(12, 4210943);
/* 17:19 */   public static final MapColor o = new MapColor(13, 6837042);
/* 18:20 */   public static final MapColor p = new MapColor(14, 16776437);
/* 19:21 */   public static final MapColor q = new MapColor(15, 14188339);
/* 20:22 */   public static final MapColor r = new MapColor(16, 11685080);
/* 21:23 */   public static final MapColor s = new MapColor(17, 6724056);
/* 22:24 */   public static final MapColor t = new MapColor(18, 15066419);
/* 23:25 */   public static final MapColor u = new MapColor(19, 8375321);
/* 24:26 */   public static final MapColor v = new MapColor(20, 15892389);
/* 25:27 */   public static final MapColor w = new MapColor(21, 5000268);
/* 26:28 */   public static final MapColor x = new MapColor(22, 10066329);
/* 27:29 */   public static final MapColor y = new MapColor(23, 5013401);
/* 28:30 */   public static final MapColor z = new MapColor(24, 8339378);
/* 29:31 */   public static final MapColor A = new MapColor(25, 3361970);
/* 30:32 */   public static final MapColor B = new MapColor(26, 6704179);
/* 31:33 */   public static final MapColor C = new MapColor(27, 6717235);
/* 32:34 */   public static final MapColor D = new MapColor(28, 10040115);
/* 33:35 */   public static final MapColor E = new MapColor(29, 1644825);
/* 34:36 */   public static final MapColor F = new MapColor(30, 16445005);
/* 35:37 */   public static final MapColor G = new MapColor(31, 6085589);
/* 36:38 */   public static final MapColor H = new MapColor(32, 4882687);
/* 37:39 */   public static final MapColor I = new MapColor(33, 55610);
/* 38:40 */   public static final MapColor J = new MapColor(34, 1381407);
/* 39:41 */   public static final MapColor K = new MapColor(35, 7340544);
/* 40:   */   public final int L;
/* 41:   */   public final int M;
/* 42:   */   
/* 43:   */   private MapColor(int paramInt1, int paramInt2)
/* 44:   */   {
/* 45:47 */     if ((paramInt1 < 0) || (paramInt1 > 63)) {
/* 46:48 */       throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
/* 47:   */     }
/* 48:50 */     this.M = paramInt1;
/* 49:51 */     this.L = paramInt2;
/* 50:52 */     a[paramInt1] = this;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public int a(int paramInt)
/* 54:   */   {
/* 55:56 */     int i1 = 220;
/* 56:57 */     if (paramInt == 3) {
/* 57:58 */       i1 = 135;
/* 58:   */     }
/* 59:60 */     if (paramInt == 2) {
/* 60:61 */       i1 = 255;
/* 61:   */     }
/* 62:63 */     if (paramInt == 1) {
/* 63:64 */       i1 = 220;
/* 64:   */     }
/* 65:66 */     if (paramInt == 0) {
/* 66:67 */       i1 = 180;
/* 67:   */     }
/* 68:70 */     int i2 = (this.L >> 16 & 0xFF) * i1 / 255;
/* 69:71 */     int i3 = (this.L >> 8 & 0xFF) * i1 / 255;
/* 70:72 */     int i4 = (this.L & 0xFF) * i1 / 255;
/* 71:   */     
/* 72:74 */     return 0xFF000000 | i2 << 16 | i3 << 8 | i4;
/* 73:   */   }
/* 74:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     boh
 * JD-Core Version:    0.7.0.1
 */