package net.minecraft.src;
/*   1:    */ public enum EnumBannerPattern
/*   2:    */ { a("base","b"),
				b("square_bottom_left","bl",
						"   ",
						"   ",
						"#  "),
				c("square_bottom_right","br",
						"   ",
						"   ",
						"  #"),
				d("square_top_left","tl",
						"#  ",
						"   ",
						"   "),
				e("square_top_right","tr",
						"#  ",
						"   ",
						"   "),
				f("stripe_bottom","bs",
						"   ",
						"   ",
						"###"),
				g("stripe_top","ts",
						"###",
						"   ",
						"   "),
				h("stripe_left","ls",
						"#  ",
						"#  ",
						"#  "),
				i("stripe_right","rs",
						"  #",
						"  #",
						"  #"),
				j("stripe_center","cs",
						" # ",
						" # ",
						" # "),
				k("stripe_middle","ms",
						"   ",
						"###",
						"   "),
				l("stripe_downright","drs",
						"#  ",
						" # ",
						"  #"),
				m("stripe_downleft","dls",
						"  #",
						" # ",
						"#  "),
				n("small_stripes","ss",
						"# #",
						"# #",
						"   "),
				o("cross","cr",
						"# #",
						" # ",
						"# #"),
				p("straight_cross","sc",
						" # ",
						"###",
						" # "),
				q("triangle_bottom","bt",
						"   ",
						" # ",
						"# #"),
				r("triangle_top","tt",
						"# #",
						" # ",
						"   "),
				s("triangles_bottom","bts",
						"   ",
						"# #",
						" # "),
				t("triangles_top","tts",
						" # ",
						"# #",
						"   "),
				u("diagonal_left","ld",
						"## ",
						"#  ",
						"   "),
				v("diagonal_up_right","rd",
						"   ",
						"  #",
						" ##"),
				w("diagonal_up_left","lud",
						"   ",
						"#  ",
						"## "),
				x("diagonal_right","rud",
						" ##",
						"  #",
						"   "),
				y("circle","mc",
						"   ",
						" # ",
						"   "),
				z("rhombus","mr",
						" # ",
						"# #",
						" # "),
				A("half_vertical","vh",
						"## ",
						"## ",
						"## "),
				B("half_horizontal","hh",
						"###",
						"###",
						"   "),
				C("half_vertical_right","vhr",
						" ##",
						" ##",
						" ##"),
				D("half_horizontal_bottom","hhb",
						"   ",
						"###",
						"###"),
				E("border","bo",
						"###",
						"# #",
						"###"),
				F("curly_border","cbo",new ItemStack(BlockList.vine)),
				G("creeper","cre",new ItemStack(ItemList.bX,1,4)),
				H("gradient","gra",
						"# #",
						" # ",
						" # "),
				I("gradient","gru",
						" # ",
						" # ",
						"# #"),
				J("bricks","bri",new ItemStack(BlockList.V)),
				K("skull","sku",new ItemStack(ItemList.bX,1,1)),
				L("flower","flo",new ItemStack(BlockList.redFlower,1,EnumFlowerVariant.j.b())),
				M("mojang","moj",new ItemStack(ItemList.ao,1,1));
/*   3:    */   private String N;
/*   4:    */   private String O;
/*   5:201 */   private String[] P = new String[3];
/*   6:    */   private ItemStack Q;
/*   7:    */   
/*   8:    */   private EnumBannerPattern(String paramString1, String paramString2)
/*   9:    */   {
/*  10:205 */     this.N = paramString1;
/*  11:206 */     this.O = paramString2;
/*  12:    */   }
/*  13:    */   
/*  14:    */   private EnumBannerPattern(String paramString1, String paramString2, ItemStack paramamj)
/*  15:    */   {
/*  16:210 */     this(paramString1, paramString2);
/*  17:211 */     this.Q = paramamj;
/*  18:    */   }
/*  19:    */   
/*  20:    */   private EnumBannerPattern(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
/*  21:    */   {
/*  22:215 */     this(paramString1, paramString2);
/*  23:216 */     this.P[0] = paramString3;
/*  24:217 */     this.P[1] = paramString4;
/*  25:218 */     this.P[2] = paramString5;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public String a()
/*  29:    */   {
/*  30:222 */     return this.N;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String b()
/*  34:    */   {
/*  35:226 */     return this.O;
/*  36:    */   }
/*  37:    */   
/*  38:    */   public String[] c()
/*  39:    */   {
/*  40:230 */     return this.P;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public boolean d()
/*  44:    */   {
/*  45:234 */     return (this.Q != null) || (this.P[0] != null);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public boolean e()
/*  49:    */   {
/*  50:238 */     return this.Q != null;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public ItemStack f()
/*  54:    */   {
/*  55:242 */     return this.Q;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public static EnumBannerPattern a(String paramString)
/*  59:    */   {
/*  60:247 */     for (EnumBannerPattern localbcj : values()) {
/*  61:248 */       if (localbcj.O.equals(paramString)) {
/*  62:249 */         return localbcj;
/*  63:    */       }
/*  64:    */     }
/*  65:252 */     return null;
/*  66:    */   }
/*  67:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcj
 * JD-Core Version:    0.7.0.1
 */