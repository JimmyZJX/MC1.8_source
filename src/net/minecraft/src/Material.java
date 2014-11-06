package net.minecraft.src;
/*   1:    */ public class Material
/*   2:    */ {
/*   3:  4 */   public static final Material air = new bod(MapColor.b);
/*   4:  5 */   public static final Material grass = new Material(MapColor.c);
/*   5:  6 */   public static final Material dirt = new Material(MapColor.l);
/*   6:  7 */   public static final Material d = new Material(MapColor.o).g();
/*   7:  8 */   public static final Material rock = new Material(MapColor.m).f();
/*   8:  9 */   public static final Material f = new Material(MapColor.h).f();
/*   9: 10 */   public static final Material g = new Material(MapColor.h).f().o();
/*  10: 11 */   public static final Material water = new MaterialLiquid(MapColor.n).n();
/*  11: 12 */   public static final Material lava = new MaterialLiquid(MapColor.f).n();
/*  12: 13 */   public static final Material leaves = new Material(MapColor.i).g().setTranslucent().n();
/*  13: 14 */   public static final Material plants = new boc(MapColor.i).n();
/*  14: 15 */   public static final Material l = new boc(MapColor.i).g().n().i();
/*  15: 16 */   public static final Material m = new Material(MapColor.e);
/*  16: 17 */   public static final Material n = new Material(MapColor.e).g();
/*  17: 18 */   public static final Material o = new bod(MapColor.b).n();
/*  18: 19 */   public static final Material p = new Material(MapColor.d);
/*  19: 20 */   public static final Material q = new boc(MapColor.b).n();
/*  20: 21 */   public static final Material r = new boc(MapColor.e).g();
/*  21: 22 */   public static final Material s = new Material(MapColor.b).setTranslucent().p();
/*  22: 23 */   public static final Material t = new Material(MapColor.b).p();
/*  23: 24 */   public static final Material u = new Material(MapColor.f).g().setTranslucent();
/*  24: 25 */   public static final Material v = new Material(MapColor.i).n();
/*  25: 26 */   public static final Material w = new Material(MapColor.g).setTranslucent().p();
/*  26: 27 */   public static final Material x = new Material(MapColor.g).p();
/*  27: 28 */   public static final Material y = new boc(MapColor.j).i().setTranslucent().f().n();
/*  28: 29 */   public static final Material z = new Material(MapColor.j).f();
/*  29: 30 */   public static final Material A = new Material(MapColor.i).setTranslucent().n();
/*  30: 31 */   public static final Material B = new Material(MapColor.k);
/*  31: 32 */   public static final Material C = new Material(MapColor.i).n();
/*  32: 33 */   public static final Material D = new Material(MapColor.i).n();
/*  33: 34 */   public static final Material E = new boi(MapColor.b).o();
/*  34: 35 */   public static final Material F = new Material(MapColor.b).n();
/*  35: 36 */   public static final Material G = new bog(MapColor.e).f().n();
/*  36: 42 */   public static final Material H = new Material(MapColor.m).o();
/*  37: 43 */   public static final Material I = new Material(MapColor.b).f().o();
/*  38:    */   private boolean J;
/*  39:    */   private boolean K;
/*  40:    */   private boolean isTranslucent;
/*  41:    */   private final MapColor M;
/*  42: 52 */   private boolean N = true;
/*  43:    */   private int O;
/*  44:    */   private boolean P;
/*  45:    */   
/*  46:    */   public Material(MapColor paramboh)
/*  47:    */   {
/*  48: 57 */     this.M = paramboh;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public boolean isLiquid()
/*  52:    */   {
/*  53: 61 */     return false;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean a()
/*  57:    */   {
/*  58: 69 */     return true;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public boolean b()
/*  62:    */   {
/*  63: 73 */     return true;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public boolean c()
/*  67:    */   {
/*  68: 77 */     return true;
/*  69:    */   }
/*  70:    */   
/*  71:    */   private Material setTranslucent()
/*  72:    */   {
/*  73: 81 */     this.isTranslucent = true;
/*  74: 82 */     return this;
/*  75:    */   }
/*  76:    */   
/*  77:    */   protected Material f()
/*  78:    */   {
/*  79: 86 */     this.N = false;
/*  80: 87 */     return this;
/*  81:    */   }
/*  82:    */   
/*  83:    */   protected Material g()
/*  84:    */   {
/*  85: 91 */     this.J = true;
/*  86: 92 */     return this;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public boolean h()
/*  90:    */   {
/*  91: 96 */     return this.J;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public Material i()
/*  95:    */   {
/*  96:100 */     this.K = true;
/*  97:101 */     return this;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public boolean j()
/* 101:    */   {
/* 102:105 */     return this.K;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public boolean isOpaque()
/* 106:    */   {
/* 107:109 */     if (this.isTranslucent) {
/* 108:110 */       return false;
/* 109:    */     }
/* 110:112 */     return c();
/* 111:    */   }
/* 112:    */   
/* 113:    */   public boolean l()
/* 114:    */   {
/* 115:118 */     return this.N;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public int m()
/* 119:    */   {
/* 120:122 */     return this.O;
/* 121:    */   }
/* 122:    */   
/* 123:    */   protected Material n()
/* 124:    */   {
/* 125:126 */     this.O = 1;
/* 126:127 */     return this;
/* 127:    */   }
/* 128:    */   
/* 129:    */   protected Material o()
/* 130:    */   {
/* 131:131 */     this.O = 2;
/* 132:132 */     return this;
/* 133:    */   }
/* 134:    */   
/* 135:    */   protected Material p()
/* 136:    */   {
/* 137:136 */     this.P = true;
/* 138:137 */     return this;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public MapColor r()
/* 142:    */   {
/* 143:145 */     return this.M;
/* 144:    */   }
/* 145:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bof
 * JD-Core Version:    0.7.0.1
 */