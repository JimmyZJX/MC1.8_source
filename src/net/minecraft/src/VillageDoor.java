package net.minecraft.src;
/*   1:    */ public class VillageDoor
/*   2:    */ {
/*   3:    */   private final BlockPosition a;
/*   4:    */   private final BlockPosition b;
/*   5:    */   private final EnumDirection c;
/*   6:    */   private int d;
/*   7:    */   private boolean e;
/*   8:    */   private int f;
/*   9:    */   
/*  10:    */   public VillageDoor(BlockPosition pos, int paramInt1, int paramInt2, int paramInt3)
/*  11:    */   {
/*  12: 21 */     this(pos, a(paramInt1, paramInt2), paramInt3);
/*  13:    */   }
/*  14:    */   
/*  15:    */   private static EnumDirection a(int paramInt1, int paramInt2)
/*  16:    */   {
/*  17: 25 */     if (paramInt1 < 0) {
/*  18: 26 */       return EnumDirection.WEST;
/*  19:    */     }
/*  20: 27 */     if (paramInt1 > 0) {
/*  21: 28 */       return EnumDirection.EAST;
/*  22:    */     }
/*  23: 29 */     if (paramInt2 < 0) {
/*  24: 30 */       return EnumDirection.NORTH;
/*  25:    */     }
/*  26: 32 */     return EnumDirection.SOUTH;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public VillageDoor(BlockPosition paramdt, EnumDirection paramej, int paramInt)
/*  30:    */   {
/*  31: 37 */     this.a = paramdt;
/*  32: 38 */     this.c = paramej;
/*  33: 39 */     this.b = paramdt.a(paramej, 2);
/*  34: 40 */     this.d = paramInt;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public int b(int paramInt1, int paramInt2, int paramInt3)
/*  38:    */   {
/*  39: 48 */     return (int)this.a.dist2(paramInt1, paramInt2, paramInt3);
/*  40:    */   }
/*  41:    */   
/*  42:    */   public int a(BlockPosition paramdt)
/*  43:    */   {
/*  44: 52 */     return (int)paramdt.dist2(d());
/*  45:    */   }
/*  46:    */   
/*  47:    */   public int b(BlockPosition paramdt)
/*  48:    */   {
/*  49: 56 */     return (int)this.b.dist2(paramdt);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public boolean c(BlockPosition paramdt)
/*  53:    */   {
/*  54: 60 */     int i = paramdt.getX() - this.a.getX();
/*  55: 61 */     int j = paramdt.getZ() - this.a.getY();
/*  56: 62 */     return i * this.c.g() + j * this.c.i() >= 0;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public void a()
/*  60:    */   {
/*  61: 66 */     this.f = 0;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void b()
/*  65:    */   {
/*  66: 70 */     this.f += 1;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public int c()
/*  70:    */   {
/*  71: 74 */     return this.f;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public BlockPosition d()
/*  75:    */   {
/*  76: 78 */     return this.a;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public BlockPosition e()
/*  80:    */   {
/*  81: 82 */     return this.b;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public int f()
/*  85:    */   {
/*  86: 86 */     return this.c.g() * 2;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public int g()
/*  90:    */   {
/*  91: 90 */     return this.c.i() * 2;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public int h()
/*  95:    */   {
/*  96: 94 */     return this.d;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void a(int paramInt)
/* 100:    */   {
/* 101: 98 */     this.d = paramInt;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public boolean i()
/* 105:    */   {
/* 106:102 */     return this.e;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void a(boolean paramBoolean)
/* 110:    */   {
/* 111:106 */     this.e = paramBoolean;
/* 112:    */   }
/* 113:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abh
 * JD-Core Version:    0.7.0.1
 */