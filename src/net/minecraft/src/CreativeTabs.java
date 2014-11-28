package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public abstract class CreativeTabs
/*   4:    */ {
/*   5: 12 */   public static final CreativeTabs[] a = new CreativeTabs[12];
/*   6: 13 */   public static final CreativeTabs tabBlock = new akg(0, "buildingBlocks");
/*   7: 19 */   public static final CreativeTabs tabDeco = new akk(1, "decorations");
/*   8: 30 */   public static final CreativeTabs tabRedstone = new akl(2, "redstone");
/*   9: 36 */   public static final CreativeTabs tabTransport = new akm(3, "transportation");
/*  10: 42 */   public static final CreativeTabs tabMisc = new akn(4, "misc").a(new apg[] { apg.a });
/*  11: 48 */   public static final CreativeTabs tabAllSearch = new ako(5, "search").a("item_search.png");
/*  12: 55 */   public static final CreativeTabs tabFood = new akp(6, "food");
/*  13: 61 */   public static final CreativeTabs tabTools = new akq(7, "tools").a(new apg[] { apg.h, apg.i, apg.j });
/*  14: 67 */   public static final CreativeTabs tabCombat = new akr(8, "combat").a(new apg[] { apg.b, apg.c, apg.f, apg.d, apg.e, apg.k, apg.g });
/*  15: 73 */   public static final CreativeTabs tabBrewing = new akh(9, "brewing");
/*  16: 79 */   public static final CreativeTabs tabMaterials = new aki(10, "materials");
/*  17: 85 */   public static final CreativeTabs tabInventory = new akj(11, "inventory").a("inventory.png").k().i();
/*  18:    */   private final int n;
/*  19:    */   private final String o;
/*  20: 94 */   private String p = "items.png";
/*  21: 95 */   private boolean q = true;
/*  22: 96 */   private boolean r = true;
/*  23:    */   private apg[] s;
/*  24:    */   private ItemStack t;
/*  25:    */   
/*  26:    */   public CreativeTabs(int paramInt, String paramString)
/*  27:    */   {
/*  28:101 */     this.n = paramInt;
/*  29:102 */     this.o = paramString;
/*  30:    */     
/*  31:104 */     a[paramInt] = this;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public int a()
/*  35:    */   {
/*  36:108 */     return this.n;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String b()
/*  40:    */   {
/*  41:112 */     return this.o;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public String c()
/*  45:    */   {
/*  46:116 */     return "itemGroup." + b();
/*  47:    */   }
/*  48:    */   
/*  49:    */   public ItemStack d()
/*  50:    */   {
/*  51:120 */     if (this.t == null) {
/*  52:121 */       this.t = new ItemStack(e(), 1, f());
/*  53:    */     }
/*  54:123 */     return this.t;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public abstract Item e();
/*  58:    */   
/*  59:    */   public int f()
/*  60:    */   {
/*  61:129 */     return 0;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String g()
/*  65:    */   {
/*  66:133 */     return this.p;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public CreativeTabs a(String paramString)
/*  70:    */   {
/*  71:137 */     this.p = paramString;
/*  72:138 */     return this;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean h()
/*  76:    */   {
/*  77:142 */     return this.r;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public CreativeTabs i()
/*  81:    */   {
/*  82:146 */     this.r = false;
/*  83:147 */     return this;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public boolean j()
/*  87:    */   {
/*  88:151 */     return this.q;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public CreativeTabs k()
/*  92:    */   {
/*  93:155 */     this.q = false;
/*  94:156 */     return this;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public int l()
/*  98:    */   {
/*  99:160 */     return this.n % 6;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public boolean m()
/* 103:    */   {
/* 104:164 */     return this.n < 6;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public apg[] n()
/* 108:    */   {
/* 109:168 */     return this.s;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public CreativeTabs a(apg... paramVarArgs)
/* 113:    */   {
/* 114:172 */     this.s = paramVarArgs;
/* 115:173 */     return this;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public boolean a(apg paramapg)
/* 119:    */   {
/* 120:177 */     if (this.s == null) {
/* 121:178 */       return false;
/* 122:    */     }
/* 123:181 */     for (apg localapg : this.s) {
/* 124:182 */       if (localapg == paramapg) {
/* 125:183 */         return true;
/* 126:    */       }
/* 127:    */     }
/* 128:187 */     return false;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void a(List<ItemStack> paramList)
/* 132:    */   {
/* 133:191 */     for (Item localalq : Item.e) {
/* 134:192 */       if ((localalq != null) && 
/* 135:193 */         (localalq.getCreativeTab() == this)) {
/* 136:194 */         localalq.a(localalq, this, paramList);
/* 137:    */       }
/* 138:    */     }
/* 139:199 */     if (n() != null) {
/* 140:200 */       a(paramList, n());
/* 141:    */     }
/* 142:    */   }
/* 143:    */   
/* 144:    */   public void a(List<ItemStack> paramList, apg... paramVarArgs)
/* 145:    */   {
/* 146:205 */     for (Enchantment localapf : Enchantment.list) {
/* 147:206 */       if ((localapf != null) && (localapf.C != null))
/* 148:    */       {
/* 149:209 */         int i3 = 0;
/* 150:211 */         for (int i4 = 0; (i4 < paramVarArgs.length) && (i3 == 0); i4++) {
/* 151:212 */           if (localapf.C == paramVarArgs[i4]) {
/* 152:213 */             i3 = 1;
/* 153:    */           }
/* 154:    */         }
/* 155:217 */         if (i3 != 0) {
/* 156:218 */           paramList.add(ItemList.enchantedBook.addEnchantment(new WeightedRandomItemEnchantment(localapf, localapf.getHighestLevel())));
/* 157:    */         }
/* 158:    */       }
/* 159:    */     }
/* 160:    */   }
/* 161:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     akf
 * JD-Core Version:    0.7.0.1
 */