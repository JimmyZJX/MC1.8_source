package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.ArrayList;
/*   5:    */ import java.util.Map;
/*   6:    */ 
/*   7:    */ public enum ew
/*   8:    */ { a("",0,false),
				b("",0,false),
				c("",0,false),
				d("",0,false),
				e("",0,false),
				f("",0,false),
				g("",0,false),
				h("",0,false),
				i("",0,false),
				j("",0,false),
				k("",0,false),
				l("",0,false),
				m("",0,false),
				n("",0,false),
				o("",0,false),
				p("",0,false),
				q("",0,false),
				r("",0,false),
				s("",0,false),
				t("",0,false),
				u("",0,false),
				VILLAGER_HAPPY("happyVillager",21,false),
				w("",0,false),
				x("",0,false),
				y("",0,false),
				z("",0,false),
				A("",0,false),
				B("",0,false),
				C("",0,false),
				D("",0,false),
				E("",0,false),
				F("",0,false),
				G("",0,false),
				H("",0,false),
				I("",0,false),
				J("",0,false),
				K("",0,false),
				L("",0,false),
				M("",0,false),
				N("",0,false),
				O("",0,false),
				P("",0,false); // TODO: BROKEN
/*   9:    */   private final String Q;
/*  10:    */   private final int R;
/*  11:    */   private final boolean S;
/*  12:    */   private final int T;
/*  13:    */   private static final Map<Integer,ew> U;
/*  14:    */   private static final String[] V;
/*  15:    */   
/*  16:    */   static
/*  17:    */   {
/*  18: 58 */     U = Maps.newHashMap();
/*  19:    */     
/*  20:    */ 
/*  21:    */ 
/*  22:    */ 
/*  23: 63 */     ArrayList<String> localArrayList = Lists.newArrayList();
/*  24: 64 */     for (ew localew : values())
/*  25:    */     {
/*  26: 65 */       U.put(Integer.valueOf(localew.c()), localew);
/*  27: 67 */       if (!localew.b().endsWith("_")) {
/*  28: 68 */         localArrayList.add(localew.b());
/*  29:    */       }
/*  30:    */     }
/*  31: 72 */     V = (String[])localArrayList.toArray(new String[localArrayList.size()]);
/*  32:    */   }
/*  33:    */   
/*  34:    */   private ew(String paramString, int paramInt1, boolean paramBoolean, int paramInt2)
/*  35:    */   {
/*  36: 76 */     this.Q = paramString;
/*  37: 77 */     this.R = paramInt1;
/*  38: 78 */     this.S = paramBoolean;
/*  39: 79 */     this.T = paramInt2;
/*  40:    */   }
/*  41:    */   
/*  42:    */   private ew(String paramString, int paramInt, boolean paramBoolean)
/*  43:    */   {
/*  44: 83 */     this(paramString, paramInt, paramBoolean, 0);
/*  45:    */   }
/*  46:    */   
/*  47:    */   public static String[] a()
/*  48:    */   {
/*  49: 87 */     return V;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public String b()
/*  53:    */   {
/*  54: 91 */     return this.Q;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public int c()
/*  58:    */   {
/*  59: 95 */     return this.R;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public int d()
/*  63:    */   {
/*  64: 99 */     return this.T;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public boolean e()
/*  68:    */   {
/*  69:103 */     return this.S;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public boolean f()
/*  73:    */   {
/*  74:107 */     return this.T > 0;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public static ew a(int paramInt)
/*  78:    */   {
/*  79:111 */     return (ew)U.get(Integer.valueOf(paramInt));
/*  80:    */   }
/*  81:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ew
 * JD-Core Version:    0.7.0.1
 */