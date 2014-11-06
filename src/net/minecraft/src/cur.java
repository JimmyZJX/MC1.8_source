package net.minecraft.src;
/*  1:   */ import java.nio.ByteBuffer;
/*  2:   */ import org.lwjgl.opengl.GL11;
/*  3:   */ 
/*  4:   */ public class cur
/*  5:   */ {
/*  6:   */   private int a;
/*  7:   */   private final VertexFormat b;
/*  8:   */   private int c;
/*  9:   */   
/* 10:   */   public cur(VertexFormat paramcus)
/* 11:   */   {
/* 12:15 */     this.b = paramcus;
/* 13:16 */     this.a = dax.e();
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a()
/* 17:   */   {
/* 18:20 */     dax.g(dax.P, this.a);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(ByteBuffer paramByteBuffer, int paramInt)
/* 22:   */   {
/* 23:24 */     a();
/* 24:25 */     dax.a(dax.P, paramByteBuffer, 35044);
/* 25:26 */     b();
/* 26:27 */     this.c = (paramInt / this.b.getSize());
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void a(int paramInt)
/* 30:   */   {
/* 31:31 */     GL11.glDrawArrays(paramInt, 0, this.c);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void b()
/* 35:   */   {
/* 36:35 */     dax.g(dax.P, 0);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void c()
/* 40:   */   {
/* 41:39 */     if (this.a >= 0)
/* 42:   */     {
/* 43:40 */       dax.g(this.a);
/* 44:41 */       this.a = -1;
/* 45:   */     }
/* 46:   */   }
/* 47:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cur
 * JD-Core Version:    0.7.0.1
 */