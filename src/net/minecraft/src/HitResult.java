package net.minecraft.src;
/*  1:   */ public class HitResult
/*  2:   */ {
/*  3:   */   private BlockPosition e;
/*  4:   */   public brv a;
/*  5:   */   public EnumDirection b;
/*  6:   */   public Vec3 c;
/*  7:   */   public Entity d;
/*  8:   */   
/*  9:   */   public HitResult(Vec3 parambrw, EnumDirection paramej, BlockPosition paramdt)
/* 10:   */   {
/* 11:19 */     this(brv.BLOCK, parambrw, paramej, paramdt);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public HitResult(Vec3 parambrw, EnumDirection paramej)
/* 15:   */   {
/* 16:23 */     this(brv.BLOCK, parambrw, paramej, BlockPosition.a);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public HitResult(Entity paramwv)
/* 20:   */   {
/* 21:27 */     this(paramwv, new Vec3(paramwv.xPos, paramwv.yPos, paramwv.zPos));
/* 22:   */   }
/* 23:   */   
/* 24:   */   public HitResult(brv parambrv, Vec3 parambrw, EnumDirection paramej, BlockPosition paramdt)
/* 25:   */   {
/* 26:31 */     this.a = parambrv;
/* 27:32 */     this.e = paramdt;
/* 28:33 */     this.b = paramej;
/* 29:34 */     this.c = new Vec3(parambrw.x, parambrw.y, parambrw.z);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public HitResult(Entity paramwv, Vec3 parambrw)
/* 33:   */   {
/* 34:38 */     this.a = brv.ENTITY;
/* 35:39 */     this.d = paramwv;
/* 36:40 */     this.c = parambrw;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public BlockPosition a()
/* 40:   */   {
/* 41:51 */     return this.e;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public String toString()
/* 45:   */   {
/* 46:56 */     return "HitResult{type=" + this.a + ", blockpos=" + this.e + ", f=" + this.b + ", pos=" + this.c + ", entity=" + this.d + '}';
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bru
 * JD-Core Version:    0.7.0.1
 */