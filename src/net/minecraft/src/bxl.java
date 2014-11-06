package net.minecraft.src;
/*  1:   */ class bxl
/*  2:   */   extends bug
/*  3:   */ {
/*  4:   */   private final ahh p;
			  private final bxj o;
/*  5:   */   
/*  6:   */   private bxl(bxj parambxj, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, ahh paramahh)
/*  7:   */   {
/*  8:75 */     super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, bxj.a(parambxj, paramahh));
				o=parambxj;
/*  9:76 */     this.p = paramahh;
/* 10:   */   }
			  bxl(bxj arg0, int arg1, int arg2, int arg3, int arg4, int arg5, ahh arg6, bxk arg7) {this(arg0,arg1,arg2,arg3,arg4,arg5,arg6);}
			  static ahh a(bxl arg0) {return arg0.p;}
/* 11:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxl
 * JD-Core Version:    0.7.0.1
 */