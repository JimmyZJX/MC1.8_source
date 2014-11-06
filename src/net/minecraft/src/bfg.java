package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class bfg
/*   6:    */   extends Chunk
/*   7:    */ {
/*   8:    */   public bfg(World paramaqu, int paramInt1, int paramInt2)
/*   9:    */   {
/*  10: 20 */     super(paramaqu, paramInt1, paramInt2);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean isAtLocation(int paramInt1, int paramInt2)
/*  14:    */   {
/*  15: 25 */     return (paramInt1 == this.x) && (paramInt2 == this.z);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public int getHeight(int paramInt1, int paramInt2)
/*  19:    */   {
/*  20: 30 */     return 0;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void generateHeightMap() {}
/*  24:    */   
/*  25:    */   public void generateSkylightMap() {}
/*  26:    */   
/*  27:    */   public ProtoBlock getBlock(BlockPosition paramdt)
/*  28:    */   {
/*  29: 43 */     return BlockList.air;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public int b(BlockPosition paramdt)
/*  33:    */   {
/*  34: 48 */     return 255;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public int c(BlockPosition paramdt)
/*  38:    */   {
/*  39: 53 */     return 0;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public int a(EnumSkyBlock paramarf, BlockPosition paramdt)
/*  43:    */   {
/*  44: 58 */     return paramarf.c;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void a(EnumSkyBlock paramarf, BlockPosition paramdt, int paramInt) {}
/*  48:    */   
/*  49:    */   public int a(BlockPosition paramdt, int paramInt)
/*  50:    */   {
/*  51: 67 */     return 0;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void addEntity(Entity paramwv) {}
/*  55:    */   
/*  56:    */   public void b(Entity paramwv) {}
/*  57:    */   
/*  58:    */   public void a(Entity paramwv, int paramInt) {}
/*  59:    */   
/*  60:    */   public boolean d(BlockPosition paramdt)
/*  61:    */   {
/*  62: 84 */     return false;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public bcm a(BlockPosition paramdt, bfl parambfl)
/*  66:    */   {
/*  67: 90 */     return null;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void a(bcm parambcm) {}
/*  71:    */   
/*  72:    */   public void a(BlockPosition paramdt, bcm parambcm) {}
/*  73:    */   
/*  74:    */   public void e(BlockPosition paramdt) {}
/*  75:    */   
/*  76:    */   public void c() {}
/*  77:    */   
/*  78:    */   public void d() {}
/*  79:    */   
/*  80:    */   public void e() {}
/*  81:    */   
/*  82:    */   public void a(Entity paramwv, AABB parambrt, List paramList, Predicate paramPredicate) {}
/*  83:    */   
/*  84:    */   public void a(Class paramClass, AABB parambrt, List paramList, Predicate paramPredicate) {}
/*  85:    */   
/*  86:    */   public boolean a(boolean paramBoolean)
/*  87:    */   {
/*  88:127 */     return false;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public Random a(long paramLong)
/*  92:    */   {
/*  93:153 */     return new Random(p().J() + this.x * this.x * 4987142 + this.x * 5947611 + this.z * this.z * 4392871L + this.z * 389711 ^ paramLong);
/*  94:    */   }
/*  95:    */   
/*  96:    */   public boolean f()
/*  97:    */   {
/*  98:158 */     return true;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public boolean c(int paramInt1, int paramInt2)
/* 102:    */   {
/* 103:163 */     return true;
/* 104:    */   }
/* 105:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bfg
 * JD-Core Version:    0.7.0.1
 */