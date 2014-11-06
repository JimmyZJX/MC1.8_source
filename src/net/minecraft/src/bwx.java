package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bwx
/*  4:   */   extends bxf
/*  5:   */ {
/*  6:   */   public void b()
/*  7:   */   {
/*  8:10 */     this.n.clear();
/*  9:11 */     this.n.add(new buw(0, this.l / 2 - 155, this.m / 4 + 120 + 12, cwc.a("gui.toMenu", new Object[0])));
/* 10:12 */     this.n.add(new buw(1, this.l / 2 - 155 + 160, this.m / 4 + 120 + 12, cwc.a("menu.quit", new Object[0])));
/* 11:   */   }
/* 12:   */   
/* 13:   */   protected void a(bug parambug)
/* 14:   */   {
/* 15:17 */     if (parambug.k == 0) {
/* 16:18 */       this.j.a(new bxq());
/* 17:19 */     } else if (parambug.k == 1) {
/* 18:20 */       this.j.m();
/* 19:   */     }
/* 20:   */   }
/* 21:   */   
/* 22:   */   protected void a(char paramChar, int paramInt) {}
/* 23:   */   
/* 24:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 25:   */   {
/* 26:30 */     c();
/* 27:   */     
/* 28:32 */     a(this.q, "Out of memory!", this.l / 2, this.m / 4 - 60 + 20, 16777215);
/* 29:33 */     c(this.q, "Minecraft has run out of memory.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 0, 10526880);
/* 30:34 */     c(this.q, "This could be caused by a bug in the game or by the", this.l / 2 - 140, this.m / 4 - 60 + 60 + 18, 10526880);
/* 31:35 */     c(this.q, "Java Virtual Machine not being allocated enough", this.l / 2 - 140, this.m / 4 - 60 + 60 + 27, 10526880);
/* 32:36 */     c(this.q, "memory.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 36, 10526880);
/* 33:37 */     c(this.q, "To prevent level corruption, the current game has quit.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 54, 10526880);
/* 34:38 */     c(this.q, "We've tried to free up enough memory to let you go back to", this.l / 2 - 140, this.m / 4 - 60 + 60 + 63, 10526880);
/* 35:39 */     c(this.q, "the main menu and back to playing, but this may not have worked.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 72, 10526880);
/* 36:40 */     c(this.q, "Please restart the game if you see this message again.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 81, 10526880);
/* 37:   */     
/* 38:42 */     super.a(paramInt1, paramInt2, paramFloat);
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwx
 * JD-Core Version:    0.7.0.1
 */