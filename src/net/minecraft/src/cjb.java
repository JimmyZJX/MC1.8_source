package net.minecraft.src;
/*  1:   */ public class cjb
/*  2:   */ {
/*  3:11 */   private final VertexBuffer[] a = new VertexBuffer[aql.values().length];
/*  4:   */   
/*  5:   */   public cjb()
/*  6:   */   {
/*  7:15 */     this.a[aql.a.ordinal()] = new VertexBuffer(2097152);
/*  8:16 */     this.a[aql.c.ordinal()] = new VertexBuffer(131072);
/*  9:17 */     this.a[aql.b.ordinal()] = new VertexBuffer(131072);
/* 10:18 */     this.a[aql.d.ordinal()] = new VertexBuffer(262144);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public VertexBuffer a(aql paramaql)
/* 14:   */   {
/* 15:22 */     return this.a[paramaql.ordinal()];
/* 16:   */   }
/* 17:   */   
/* 18:   */   public VertexBuffer a(int paramInt)
/* 19:   */   {
/* 20:26 */     return this.a[paramInt];
/* 21:   */   }
/* 22:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cjb
 * JD-Core Version:    0.7.0.1
 */