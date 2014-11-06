package net.minecraft.src;
/*   1:    */ public class BlockPosition
/*   2:    */   extends fd
/*   3:    */ {
/*   4: 13 */   public static final BlockPosition a = new BlockPosition(0, 0, 0);
/*   5: 15 */   private static final int b = 1 + MathUtils.log2(MathUtils.smallestEncompassingPowerOfTwo(30000000));
/*   6: 16 */   private static final int c = b;
/*   7: 17 */   private static final int d = 64 - b - c;
/*   8: 19 */   private static final int f = 0 + c;
/*   9: 20 */   private static final int g = f + d;
/*  10: 21 */   private static final long h = (1L << b) - 1L;
/*  11: 22 */   private static final long i = (1L << d) - 1L;
/*  12: 23 */   private static final long j = (1L << c) - 1L;
/*  13:    */   
/*  14:    */   public BlockPosition(int paramInt1, int paramInt2, int paramInt3)
/*  15:    */   {
/*  16: 26 */     super(paramInt1, paramInt2, paramInt3);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public BlockPosition(double paramDouble1, double paramDouble2, double paramDouble3)
/*  20:    */   {
/*  21: 30 */     super(paramDouble1, paramDouble2, paramDouble3);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public BlockPosition(Entity paramwv)
/*  25:    */   {
/*  26: 34 */     this(paramwv.xPos, paramwv.yPos, paramwv.zPos);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public BlockPosition(Vec3 parambrw)
/*  30:    */   {
/*  31: 38 */     this(parambrw.x, parambrw.y, parambrw.z);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public BlockPosition(fd paramfd)
/*  35:    */   {
/*  36: 42 */     this(paramfd.getX(), paramfd.getY(), paramfd.getZ());
/*  37:    */   }
/*  38:    */   
/*  39:    */   public BlockPosition a(double paramDouble1, double paramDouble2, double paramDouble3)
/*  40:    */   {
/*  41: 47 */     return new BlockPosition(getX() + paramDouble1, getY() + paramDouble2, getZ() + paramDouble3);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public BlockPosition offset(int paramInt1, int paramInt2, int paramInt3)
/*  45:    */   {
/*  46: 52 */     return new BlockPosition(getX() + paramInt1, getY() + paramInt2, getZ() + paramInt3);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public BlockPosition offset(fd paramfd)
/*  50:    */   {
/*  51: 57 */     return new BlockPosition(getX() + paramfd.getX(), getY() + paramfd.getY(), getZ() + paramfd.getZ());
/*  52:    */   }
/*  53:    */   
/*  54:    */   public BlockPosition b(fd paramfd)
/*  55:    */   {
/*  56: 62 */     return new BlockPosition(getX() - paramfd.getX(), getY() - paramfd.getY(), getZ() - paramfd.getZ());
/*  57:    */   }
/*  58:    */   
/*  59:    */   public BlockPosition a(int paramInt)
/*  60:    */   {
/*  61: 67 */     return new BlockPosition(getX() * paramInt, getY() * paramInt, getZ() * paramInt);
/*  62:    */   }
/*  63:    */   
/*  64:    */   public BlockPosition up()
/*  65:    */   {
/*  66: 72 */     return up(1);
/*  67:    */   }
/*  68:    */   
/*  69:    */   public BlockPosition up(int paramInt)
/*  70:    */   {
/*  71: 77 */     return a(EnumDirection.UP, paramInt);
/*  72:    */   }
/*  73:    */   
/*  74:    */   public BlockPosition down()
/*  75:    */   {
/*  76: 82 */     return down(1);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public BlockPosition down(int paramInt)
/*  80:    */   {
/*  81: 87 */     return a(EnumDirection.DOWN, paramInt);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public BlockPosition north()
/*  85:    */   {
/*  86: 92 */     return north(1);
/*  87:    */   }
/*  88:    */   
/*  89:    */   public BlockPosition north(int paramInt)
/*  90:    */   {
/*  91: 97 */     return a(EnumDirection.NORTH, paramInt);
/*  92:    */   }
/*  93:    */   
/*  94:    */   public BlockPosition south()
/*  95:    */   {
/*  96:102 */     return south(1);
/*  97:    */   }
/*  98:    */   
/*  99:    */   public BlockPosition south(int paramInt)
/* 100:    */   {
/* 101:107 */     return a(EnumDirection.SOUTH, paramInt);
/* 102:    */   }
/* 103:    */   
/* 104:    */   public BlockPosition west()
/* 105:    */   {
/* 106:112 */     return west(1);
/* 107:    */   }
/* 108:    */   
/* 109:    */   public BlockPosition west(int paramInt)
/* 110:    */   {
/* 111:117 */     return a(EnumDirection.WEST, paramInt);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public BlockPosition east()
/* 115:    */   {
/* 116:122 */     return east(1);
/* 117:    */   }
/* 118:    */   
/* 119:    */   public BlockPosition east(int paramInt)
/* 120:    */   {
/* 121:127 */     return a(EnumDirection.EAST, paramInt);
/* 122:    */   }
/* 123:    */   
/* 124:    */   public BlockPosition a(EnumDirection paramej)
/* 125:    */   {
/* 126:132 */     return a(paramej, 1);
/* 127:    */   }
/* 128:    */   
/* 129:    */   public BlockPosition a(EnumDirection paramej, int paramInt)
/* 130:    */   {
/* 131:137 */     return new BlockPosition(getX() + paramej.g() * paramInt, getY() + paramej.h() * paramInt, getZ() + paramej.i() * paramInt);
/* 132:    */   }
/* 133:    */   
/* 134:    */   public BlockPosition c(fd paramfd)
/* 135:    */   {
/* 136:150 */     return new BlockPosition(getY() * paramfd.getZ() - getZ() * paramfd.getY(), getZ() * paramfd.getX() - getX() * paramfd.getZ(), getX() * paramfd.getY() - getY() * paramfd.getX());
/* 137:    */   }
/* 138:    */   
/* 139:    */   public long g()
/* 140:    */   {
/* 141:155 */     return (getX() & h) << g | (getY() & i) << f | (getZ() & j) << 0;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public static BlockPosition a(long paramLong)
/* 145:    */   {
/* 146:159 */     int k = (int)(paramLong << 64 - g - b >> 64 - b);
/* 147:160 */     int m = (int)(paramLong << 64 - f - d >> 64 - d);
/* 148:161 */     int n = (int)(paramLong << 64 - c >> 64 - c);
/* 149:    */     
/* 150:163 */     return new BlockPosition(k, m, n);
/* 151:    */   }
/* 152:    */   
/* 153:    */   public static Iterable<BlockPosition> a(BlockPosition paramdt1, BlockPosition paramdt2)
/* 154:    */   {
/* 155:167 */     BlockPosition localdt1 = new BlockPosition(Math.min(paramdt1.getX(), paramdt2.getX()), Math.min(paramdt1.getY(), paramdt2.getY()), Math.min(paramdt1.getZ(), paramdt2.getZ()));
/* 156:168 */     BlockPosition localdt2 = new BlockPosition(Math.max(paramdt1.getX(), paramdt2.getX()), Math.max(paramdt1.getY(), paramdt2.getY()), Math.max(paramdt1.getZ(), paramdt2.getZ()));
/* 157:    */     
/* 158:170 */     return new du(localdt1, localdt2);
/* 159:    */   }
/* 160:    */   
/* 161:    */   public static Iterable<dy> b(BlockPosition paramdt1, BlockPosition paramdt2)
/* 162:    */   {
/* 163:238 */     BlockPosition localdt1 = new BlockPosition(Math.min(paramdt1.getX(), paramdt2.getX()), Math.min(paramdt1.getY(), paramdt2.getY()), Math.min(paramdt1.getZ(), paramdt2.getZ()));
/* 164:239 */     BlockPosition localdt2 = new BlockPosition(Math.max(paramdt1.getX(), paramdt2.getX()), Math.max(paramdt1.getY(), paramdt2.getY()), Math.max(paramdt1.getZ(), paramdt2.getZ()));
/* 165:    */     
/* 166:241 */     return new dw(localdt1, localdt2);
/* 167:    */   }
/* 168:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dt
 * JD-Core Version:    0.7.0.1
 */