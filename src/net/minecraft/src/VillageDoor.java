package net.minecraft.src;
/*   1:    */ public class VillageDoor
/*   2:    */ {
/*   3:    */   private final BlockPosition pos;
/*   4:    */   private final BlockPosition insidePos;
/*   5:    */   private final EnumDirection insideDir;
/*   6:    */   private int lastConfirmed;
/*   7:    */   private boolean dead;
/*   8:    */   private int f;
/*   9:    */   
/*  10:    */   public VillageDoor(BlockPosition pos, int paramInt1, int paramInt2, int paramInt3)
/*  11:    */   {
/*  12: 21 */     this(pos, toDirection(paramInt1, paramInt2), paramInt3);
/*  13:    */   }
/*  14:    */   
/*  15:    */   private static EnumDirection toDirection(int paramInt1, int paramInt2)
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
/*  29:    */   public VillageDoor(BlockPosition pos, EnumDirection insideDir, int tick)
/*  30:    */   {
/*  31: 37 */     this.pos = pos;
/*  32: 38 */     this.insideDir = insideDir;
/*  33: 39 */     this.insidePos = pos.offset(insideDir, 2);
/*  34: 40 */     this.lastConfirmed = tick;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public int b(int paramInt1, int paramInt2, int paramInt3)
/*  38:    */   {
/*  39: 48 */     return (int)this.pos.dist2(paramInt1, paramInt2, paramInt3);
/*  40:    */   }
/*  41:    */   
/*  42:    */   public int dist2(BlockPosition pos)
/*  43:    */   {
/*  44: 52 */     return (int)pos.dist2(getPos());
/*  45:    */   }
/*  46:    */   
/*  47:    */   public int dist2Inside(BlockPosition paramdt)
/*  48:    */   {
/*  49: 56 */     return (int)this.insidePos.dist2(paramdt);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public boolean isInside(BlockPosition paramdt)
/*  53:    */   {
/*  54: 60 */     int i = paramdt.getX() - this.pos.getX();
/*  55: 61 */     int j = paramdt.getZ() - this.pos.getY(); // TODO: bug?!
/*  56: 62 */     return i * this.insideDir.g() + j * this.insideDir.i() >= 0;
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
/*  74:    */   public BlockPosition getPos()
/*  75:    */   {
/*  76: 78 */     return this.pos;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public BlockPosition getInsidePos()
/*  80:    */   {
/*  81: 82 */     return this.insidePos;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public int f()
/*  85:    */   {
/*  86: 86 */     return this.insideDir.g() * 2;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public int g()
/*  90:    */   {
/*  91: 90 */     return this.insideDir.i() * 2;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public int getLastConfirmed()
/*  95:    */   {
/*  96: 94 */     return this.lastConfirmed;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void confirm(int paramInt)
/* 100:    */   {
/* 101: 98 */     this.lastConfirmed = paramInt;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public boolean isDead()
/* 105:    */   {
/* 106:102 */     return this.dead;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setDead(boolean paramBoolean)
/* 110:    */   {
/* 111:106 */     this.dead = paramBoolean;
/* 112:    */   }
/* 113:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abh
 * JD-Core Version:    0.7.0.1
 */