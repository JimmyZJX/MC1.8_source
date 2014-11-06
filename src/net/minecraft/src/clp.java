package net.minecraft.src;
/*   1:    */ public enum clp
/*   2:    */ {	a(new EnumDirection[]{EnumDirection.WEST,EnumDirection.EAST,EnumDirection.NORTH,EnumDirection.SOUTH},0.5f,false,new cls[]{},new cls[]{},new cls[]{},new cls[]{}),
				b(new EnumDirection[]{EnumDirection.EAST,EnumDirection.WEST,EnumDirection.NORTH,EnumDirection.SOUTH},1.0f,false,new cls[]{},new cls[]{},new cls[]{},new cls[]{}),
				c(new EnumDirection[]{EnumDirection.UP,EnumDirection.DOWN,EnumDirection.EAST,EnumDirection.WEST},0.8f,true,
						new cls[]{cls.b,cls.k,cls.b,cls.e,cls.h,cls.e,cls.h,cls.k},
						new cls[]{cls.b,cls.l,cls.b,cls.f,cls.h,cls.f,cls.h,cls.l},
						new cls[]{cls.a,cls.l,cls.a,cls.f,cls.g,cls.f,cls.g,cls.l},
						new cls[]{cls.a,cls.k,cls.a,cls.e,cls.g,cls.e,cls.g,cls.k}
				),
				d(new EnumDirection[]{EnumDirection.WEST,EnumDirection.EAST,EnumDirection.DOWN,EnumDirection.UP},0.8f,true,
						new cls[]{cls.b,cls.k,cls.h,cls.k,cls.h,cls.e,cls.b,cls.e},
						new cls[]{cls.a,cls.k,cls.g,cls.k,cls.g,cls.e,cls.a,cls.e},
						new cls[]{cls.a,cls.l,cls.g,cls.l,cls.g,cls.f,cls.a,cls.f},
						new cls[]{cls.b,cls.l,cls.h,cls.l,cls.h,cls.f,cls.b,cls.f}
				),
				e(new EnumDirection[]{EnumDirection.UP,EnumDirection.DOWN,EnumDirection.NORTH,EnumDirection.SOUTH},0.6f,true,
						new cls[]{cls.b,cls.d,cls.b,cls.j,cls.h,cls.j,cls.h,cls.d},
						new cls[]{cls.b,cls.c,cls.b,cls.i,cls.h,cls.i,cls.h,cls.c},
						new cls[]{cls.a,cls.c,cls.a,cls.i,cls.g,cls.i,cls.g,cls.c},
						new cls[]{cls.a,cls.d,cls.a,cls.j,cls.g,cls.j,cls.g,cls.d}
				),
				f(new EnumDirection[]{EnumDirection.DOWN,EnumDirection.UP,EnumDirection.NORTH,EnumDirection.SOUTH},0.6f,true,
						new cls[]{cls.g,cls.d,cls.g,cls.j,cls.a,cls.j,cls.a,cls.d},
						new cls[]{cls.g,cls.c,cls.g,cls.i,cls.a,cls.i,cls.a,cls.c},
						new cls[]{cls.h,cls.c,cls.h,cls.i,cls.b,cls.i,cls.b,cls.c},
						new cls[]{cls.h,cls.d,cls.h,cls.j,cls.b,cls.j,cls.b,cls.d}
				);
/*   3:    */   protected final EnumDirection[] g;
/*   4:    */   protected final float h;
/*   5:    */   protected final boolean i;
/*   6:    */   protected final cls[] j;
/*   7:    */   protected final cls[] k;
/*   8:    */   protected final cls[] l;
/*   9:    */   protected final cls[] m;
/*  10:    */   private static final clp[] n;
/*  11:    */   
/*  12:    */   static
/*  13:    */   {
/*  14:564 */     n = new clp[6];
/*  15:    */     
/*  16:    */ 
/*  17:567 */     n[EnumDirection.DOWN.a()] = a;
/*  18:568 */     n[EnumDirection.UP.a()] = b;
/*  19:569 */     n[EnumDirection.NORTH.a()] = c;
/*  20:570 */     n[EnumDirection.SOUTH.a()] = d;
/*  21:571 */     n[EnumDirection.WEST.a()] = e;
/*  22:572 */     n[EnumDirection.EAST.a()] = f;
/*  23:    */   }
/*  24:    */   
/*  25:    */   private clp(EnumDirection[] paramArrayOfej, float paramFloat, boolean paramBoolean, cls[] paramArrayOfcls1, cls[] paramArrayOfcls2, cls[] paramArrayOfcls3, cls[] paramArrayOfcls4)
/*  26:    */   {
/*  27:576 */     this.g = paramArrayOfej;
/*  28:577 */     this.h = paramFloat;
/*  29:578 */     this.i = paramBoolean;
/*  30:579 */     this.j = paramArrayOfcls1;
/*  31:580 */     this.k = paramArrayOfcls2;
/*  32:581 */     this.l = paramArrayOfcls3;
/*  33:582 */     this.m = paramArrayOfcls4;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public static clp a(EnumDirection paramej)
/*  37:    */   {
/*  38:586 */     return n[paramej.a()];
/*  39:    */   }
/*  40:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     clp
 * JD-Core Version:    0.7.0.1
 */