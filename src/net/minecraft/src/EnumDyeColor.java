package net.minecraft.src;
/*  1:   */ public enum EnumDyeColor
/*  2:   */   implements va
/*  3:   */ { WHITE(0,15,"white","white",MapColor.j,net.minecraft.src.a.p),
	          ORANGE(1,14,"orange","orange",MapColor.q,net.minecraft.src.a.g),
	          MAGENTA(2,13,"magenta","magenta",MapColor.r,net.minecraft.src.a.l),
	          LIGHT_BLUE(3,12,"light_blue","lightBlue",MapColor.s,net.minecraft.src.a.j),
	          YELLOW(4,11,"yellow","yellow",MapColor.t,net.minecraft.src.a.o),
	          LIME(5,10,"lime","lime",MapColor.u,net.minecraft.src.a.k),
	          PINK(6,9,"pink","pink",MapColor.v,net.minecraft.src.a.n),
	          GRAY(7,8,"gray","gray",MapColor.w,net.minecraft.src.a.i),
	          SILVER(8,7,"silver","silver",MapColor.x,net.minecraft.src.a.h),
	          CYAN(9,6,"cyan","cyan",MapColor.y,net.minecraft.src.a.d),
	          PURPLE(10,5,"purple","purple",MapColor.z,net.minecraft.src.a.f),
	          BLUE(11,4,"blue","blue",MapColor.A,net.minecraft.src.a.b),
	          BROWN(12,3,"brown","brown",MapColor.B,net.minecraft.src.a.g),
	          GREEN(13,2,"green","green",MapColor.C,net.minecraft.src.a.c),
	          RED(14,1,"red","red",MapColor.D,net.minecraft.src.a.e),
	          BLACK(15,0,"black","black",MapColor.E,net.minecraft.src.a.a);
/*  4:   */   private static final EnumDyeColor[] q;
/*  5:   */   private static final EnumDyeColor[] r;
/*  6:   */   private final int s;
/*  7:   */   private final int t;
/*  8:   */   private final String u;
/*  9:   */   private final String v;
/* 10:   */   private final MapColor w;
/* 11:   */   private final a x;
/* 12:   */   
/* 13:   */   static
/* 14:   */   {
/* 15:36 */     q = new EnumDyeColor[values().length];
/* 16:37 */     r = new EnumDyeColor[values().length];
/* 17:39 */     for (EnumDyeColor localakv : values())
/* 18:   */     {
/* 19:40 */       q[localakv.a()] = localakv;
/* 20:41 */       r[localakv.b()] = localakv;
/* 21:   */     }
/* 22:   */   }
/* 23:   */   
/* 24:   */   private EnumDyeColor(int paramInt1, int paramInt2, String paramString1, String paramString2, MapColor paramboh, a parama)
/* 25:   */   {
/* 26:46 */     this.s = paramInt1;
/* 27:47 */     this.t = paramInt2;
/* 28:48 */     this.u = paramString1;
/* 29:49 */     this.v = paramString2;
/* 30:50 */     this.w = paramboh;
/* 31:51 */     this.x = parama;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public int a()
/* 35:   */   {
/* 36:55 */     return this.s;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public int b()
/* 40:   */   {
/* 41:59 */     return this.t;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String d()
/* 45:   */   {
/* 46:67 */     return this.v;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public MapColor e()
/* 50:   */   {
/* 51:71 */     return this.w;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public static EnumDyeColor fromIndex(int paramInt)
/* 55:   */   {
/* 56:79 */     if ((paramInt < 0) || (paramInt >= r.length)) {
/* 57:80 */       paramInt = 0;
/* 58:   */     }
/* 59:82 */     return r[paramInt];
/* 60:   */   }
/* 61:   */   
/* 62:   */   public static EnumDyeColor b(int paramInt)
/* 63:   */   {
/* 64:86 */     if ((paramInt < 0) || (paramInt >= q.length)) {
/* 65:87 */       paramInt = 0;
/* 66:   */     }
/* 67:89 */     return q[paramInt];
/* 68:   */   }
/* 69:   */   
/* 70:   */   public String toString()
/* 71:   */   {
/* 72:94 */     return this.v;
/* 73:   */   }
/* 74:   */   
/* 75:   */   public String toString2()
/* 76:   */   {
/* 77:99 */     return this.u;
/* 78:   */   }
/* 79:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     akv
 * JD-Core Version:    0.7.0.1
 */