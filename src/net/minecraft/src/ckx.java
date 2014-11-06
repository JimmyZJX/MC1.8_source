package net.minecraft.src;
/*  1:   */ public class ckx
/*  2:   */ {
/*  3:   */   private VertexBuffer buffer;
/*  4: 8 */   private ciy b = new ciy();
/*  5:10 */   private static final ckx c = new ckx(2097152);
/*  6:   */   
/*  7:   */   public static ckx getInstance()
/*  8:   */   {
/*  9:13 */     return c;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public ckx(int paramInt)
/* 13:   */   {
/* 14:17 */     this.buffer = new VertexBuffer(paramInt);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public int draw()
/* 18:   */   {
/* 19:21 */     return this.b.draw(this.buffer, this.buffer.d());
/* 20:   */   }
/* 21:   */   
/* 22:   */   public VertexBuffer getBuffer()
/* 23:   */   {
/* 24:25 */     return this.buffer;
/* 25:   */   }
/* 26:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ckx
 * JD-Core Version:    0.7.0.1
 */