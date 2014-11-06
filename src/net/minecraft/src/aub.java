package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class aub
/*   5:    */   extends atg
/*   6:    */ {
/*   7: 29 */   public static final bet[] a = { bet.a("has_bottle_0"), bet.a("has_bottle_1"), bet.a("has_bottle_2") };
/*   8: 35 */   private final Random b = new Random();
/*   9:    */   
/*  10:    */   public aub()
/*  11:    */   {
/*  12: 38 */     super(Material.f);
/*  13: 39 */     j(this.L.b().a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
/*  14:    */   }
/*  15:    */   
/*  16:    */   public boolean c()
/*  17:    */   {
/*  18: 44 */     return false;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public int b()
/*  22:    */   {
/*  23: 49 */     return 3;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public bcm a(World paramaqu, int paramInt)
/*  27:    */   {
/*  28: 54 */     return new bcq();
/*  29:    */   }
/*  30:    */   
/*  31:    */   public boolean isOpaqueCube()
/*  32:    */   {
/*  33: 59 */     return false;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, AABB parambrt, List paramList, Entity paramwv)
/*  37:    */   {
/*  38: 64 */     a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
/*  39: 65 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  40: 66 */     h();
/*  41: 67 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void h()
/*  45:    */   {
/*  46: 72 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  50:    */   {
/*  51: 77 */     if (paramaqu.isClient) {
/*  52: 78 */       return true;
/*  53:    */     }
/*  54: 81 */     bcm localbcm = paramaqu.s(paramdt);
/*  55: 82 */     if ((localbcm instanceof bcq)) {
/*  56: 83 */       paramahd.a((vq)localbcm);
/*  57:    */     }
/*  58: 86 */     return true;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, EntityLiving paramxm, ItemStack paramamj)
/*  62:    */   {
/*  63: 91 */     if (paramamj.s())
/*  64:    */     {
/*  65: 92 */       bcm localbcm = paramaqu.s(paramdt);
/*  66: 93 */       if ((localbcm instanceof bcq)) {
/*  67: 94 */         ((bcq)localbcm).a(paramamj.q());
/*  68:    */       }
/*  69:    */     }
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  73:    */   {
/*  74:101 */     double d1 = paramdt.getX() + 0.4F + paramRandom.nextFloat() * 0.2F;
/*  75:102 */     double d2 = paramdt.getY() + 0.7F + paramRandom.nextFloat() * 0.3F;
/*  76:103 */     double d3 = paramdt.getZ() + 0.4F + paramRandom.nextFloat() * 0.2F;
/*  77:    */     
/*  78:105 */     paramaqu.a(ew.l, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec)
/*  82:    */   {
/*  83:110 */     bcm localbcm = paramaqu.s(paramdt);
/*  84:111 */     if ((localbcm instanceof bcq)) {
/*  85:112 */       vs.a(paramaqu, paramdt, (bcq)localbcm);
/*  86:    */     }
/*  87:114 */     super.b(paramaqu, paramdt, parambec);
/*  88:    */   }
/*  89:    */   
/*  90:    */   public Item a(Block parambec, Random paramRandom, int paramInt)
/*  91:    */   {
/*  92:120 */     return ItemList.bF;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public Item b(World paramaqu, BlockPosition paramdt)
/*  96:    */   {
/*  97:125 */     return ItemList.bF;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public boolean N()
/* 101:    */   {
/* 102:130 */     return true;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public int l(World paramaqu, BlockPosition paramdt)
/* 106:    */   {
/* 107:135 */     return aib.a(paramaqu.s(paramdt));
/* 108:    */   }
/* 109:    */   
/* 110:    */   public aql k()
/* 111:    */   {
/* 112:140 */     return aql.c;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public Block a(int paramInt)
/* 116:    */   {
/* 117:145 */     Block localbec = instance();
/* 118:147 */     for (int i = 0; i < 3; i++) {
/* 119:148 */       localbec = localbec.a(a[i], Boolean.valueOf((paramInt & 1 << i) > 0));
/* 120:    */     }
/* 121:151 */     return localbec;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public int c(Block parambec)
/* 125:    */   {
/* 126:156 */     int i = 0;
/* 127:158 */     for (int j = 0; j < 3; j++) {
/* 128:159 */       if (((Boolean)parambec.getProperty(a[j])).booleanValue()) {
/* 129:160 */         i |= 1 << j;
/* 130:    */       }
/* 131:    */     }
/* 132:164 */     return i;
/* 133:    */   }
/* 134:    */   
/* 135:    */   protected bed e()
/* 136:    */   {
/* 137:169 */     return new bed(this, new bex[] { a[0], a[1], a[2] });
/* 138:    */   }
/* 139:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aub
 * JD-Core Version:    0.7.0.1
 */