package net.minecraft.src;
/*   1:    */ import com.google.common.base.Objects;
/*   3:    */ 
/*   4:    */ public class fd
/*   5:    */   implements Comparable<fd>
/*   6:    */ {
/*   7: 12 */   public static final fd e = new fd(0, 0, 0);
/*   8:    */   private final int a;
/*   9:    */   private final int b;
/*  10:    */   private final int c;
/*  11:    */   
/*  12:    */   public fd(int paramInt1, int paramInt2, int paramInt3)
/*  13:    */   {
/*  14: 19 */     this.a = paramInt1;
/*  15: 20 */     this.b = paramInt2;
/*  16: 21 */     this.c = paramInt3;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public fd(double paramDouble1, double paramDouble2, double paramDouble3)
/*  20:    */   {
/*  21: 25 */     this(MathUtils.floor(paramDouble1), MathUtils.floor(paramDouble2), MathUtils.floor(paramDouble3));
/*  22:    */   }
/*  23:    */   
/*  24:    */   public boolean equals(Object paramObject)
/*  25:    */   {
/*  26: 30 */     if (this == paramObject) {
/*  27: 31 */       return true;
/*  28:    */     }
/*  29: 33 */     if (!(paramObject instanceof fd)) {
/*  30: 34 */       return false;
/*  31:    */     }
/*  32: 37 */     fd localfd = (fd)paramObject;
/*  33: 39 */     if (getX() != localfd.getX()) {
/*  34: 40 */       return false;
/*  35:    */     }
/*  36: 42 */     if (getY() != localfd.getY()) {
/*  37: 43 */       return false;
/*  38:    */     }
/*  39: 45 */     if (getZ() != localfd.getZ()) {
/*  40: 46 */       return false;
/*  41:    */     }
/*  42: 49 */     return true;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public int hashCode()
/*  46:    */   {
/*  47: 54 */     return (getY() + getZ() * 31) * 31 + getX();
/*  48:    */   }
/*  49:    */   
/*  50:    */   public int compareTo(fd paramfd)
/*  51:    */   {
/*  52: 59 */     if (getY() == paramfd.getY())
/*  53:    */     {
/*  54: 60 */       if (getZ() == paramfd.getZ()) {
/*  55: 61 */         return getX() - paramfd.getX();
/*  56:    */       }
/*  57: 63 */       return getZ() - paramfd.getZ();
/*  58:    */     }
/*  59: 65 */     return getY() - paramfd.getY();
/*  60:    */   }
/*  61:    */   
/*  62:    */   public int getX()
/*  63:    */   {
/*  64: 69 */     return this.a;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public int getY()
/*  68:    */   {
/*  69: 73 */     return this.b;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public int getZ()
/*  73:    */   {
/*  74: 77 */     return this.c;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public fd d(fd paramfd)
/*  78:    */   {
/*  79:164 */     return new fd(getY() * paramfd.getZ() - getZ() * paramfd.getY(), getZ() * paramfd.getX() - getX() * paramfd.getZ(), getX() * paramfd.getY() - getY() * paramfd.getX());
/*  80:    */   }
/*  81:    */   
/*  82:    */   public double dist2(double paramDouble1, double paramDouble2, double paramDouble3)
/*  83:    */   {
/*  84:180 */     double d1 = getX() - paramDouble1;
/*  85:181 */     double d2 = getY() - paramDouble2;
/*  86:182 */     double d3 = getZ() - paramDouble3;
/*  87:183 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public double d(double paramDouble1, double paramDouble2, double paramDouble3)
/*  91:    */   {
/*  92:187 */     double d1 = getX() + 0.5D - paramDouble1;
/*  93:188 */     double d2 = getY() + 0.5D - paramDouble2;
/*  94:189 */     double d3 = getZ() + 0.5D - paramDouble3;
/*  95:190 */     return d1 * d1 + d2 * d2 + d3 * d3;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public double i(fd paramfd)
/*  99:    */   {
/* 100:194 */     return dist2(paramfd.getX(), paramfd.getY(), paramfd.getZ());
/* 101:    */   }
/* 102:    */   
/* 103:    */   public String toString()
/* 104:    */   {
/* 105:199 */     return Objects.toStringHelper(this).add("x", getX()).add("y", getY()).add("z", getZ()).toString();
/* 106:    */   }
/* 107:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     fd
 * JD-Core Version:    0.7.0.1
 */