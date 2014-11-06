package net.minecraft.src;
/*  1:   */ import org.lwjgl.input.Mouse;
/*  2:   */ import org.lwjgl.opengl.Display;
/*  3:   */ 
/*  4:   */ public class btm
/*  5:   */ {
/*  6:   */   public int a;
/*  7:   */   public int b;
/*  8:   */   
/*  9:   */   public void a()
/* 10:   */   {
/* 11:10 */     Mouse.setGrabbed(true);
/* 12:11 */     this.a = 0;
/* 13:12 */     this.b = 0;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void b()
/* 17:   */   {
/* 18:16 */     Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
/* 19:17 */     Mouse.setGrabbed(false);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void c()
/* 23:   */   {
/* 24:21 */     this.a = Mouse.getDX();
/* 25:22 */     this.b = Mouse.getDY();
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     btm
 * JD-Core Version:    0.7.0.1
 */