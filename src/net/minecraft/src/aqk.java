package net.minecraft.src;
/*  1:   */ public class aqk
/*  2:   */ {
/*  3:   */   private BlockPosition a;
/*  4:   */   private ProtoBlock b;
/*  5:   */   private int c;
/*  6:   */   private int d;
/*  7:   */   
/*  8:   */   public aqk(BlockPosition paramdt, ProtoBlock paramatr, int paramInt1, int paramInt2)
/*  9:   */   {
/* 10:13 */     this.a = paramdt;
/* 11:14 */     this.c = paramInt1;
/* 12:15 */     this.d = paramInt2;
/* 13:16 */     this.b = paramatr;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public BlockPosition a()
/* 17:   */   {
/* 18:20 */     return this.a;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public int b()
/* 22:   */   {
/* 23:24 */     return this.c;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public int c()
/* 27:   */   {
/* 28:28 */     return this.d;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public ProtoBlock d()
/* 32:   */   {
/* 33:32 */     return this.b;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public boolean equals(Object paramObject)
/* 37:   */   {
/* 38:37 */     if ((paramObject instanceof aqk))
/* 39:   */     {
/* 40:38 */       aqk localaqk = (aqk)paramObject;
/* 41:39 */       return (this.a.equals(localaqk.a)) && (this.c == localaqk.c) && (this.d == localaqk.d) && (this.b == localaqk.b);
/* 42:   */     }
/* 43:41 */     return false;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String toString()
/* 47:   */   {
/* 48:46 */     return "TE(" + this.a + ")," + this.c + "," + this.d + "," + this.b;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqk
 * JD-Core Version:    0.7.0.1
 */