/*  1:   */ package net.minecraft.realms;
/*  2:   */ 
/*  3:   */ /*  4:   */ import java.util.List;

import net.minecraft.src.ho;
/*  5:   */ 
/*  6:   */ public class DisconnectedRealmsScreen
/*  7:   */   extends RealmsScreen
/*  8:   */ {
/*  9:   */   private String title;
/* 10:   */   private ho reason;
/* 11:   */   private List<String> lines;
/* 12:   */   private final RealmsScreen parent;
/* 13:   */   
/* 14:   */   public DisconnectedRealmsScreen(RealmsScreen paramRealmsScreen, String paramString, ho paramho)
/* 15:   */   {
/* 16:15 */     this.parent = paramRealmsScreen;
/* 17:16 */     this.title = getLocalizedString(paramString);
/* 18:17 */     this.reason = paramho;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void init()
/* 22:   */   {
/* 23:22 */     buttonsClear();
/* 24:23 */     buttonsAdd(newButton(0, width() / 2 - 100, height() / 4 + 120 + 12, getLocalizedString("gui.back")));
/* 25:   */     
/* 26:25 */     this.lines = fontSplit(this.reason.d(), width() - 50);
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void keyPressed(char paramChar, int paramInt)
/* 30:   */   {
/* 31:30 */     if (paramInt == 1) {
/* 32:31 */       Realms.setScreen(this.parent);
/* 33:   */     }
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void buttonClicked(RealmsButton paramRealmsButton)
/* 37:   */   {
/* 38:37 */     if (paramRealmsButton.id() == 0) {
/* 39:38 */       Realms.setScreen(this.parent);
/* 40:   */     }
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void render(int paramInt1, int paramInt2, float paramFloat)
/* 44:   */   {
/* 45:44 */     renderBackground();
/* 46:   */     
/* 47:46 */     drawCenteredString(this.title, width() / 2, height() / 2 - 50, 11184810);
/* 48:   */     
/* 49:48 */     int i = height() / 2 - 30;
/* 50:50 */     if (this.lines != null) {
/* 51:51 */       for (String str : this.lines)
/* 52:   */       {
/* 53:52 */         drawCenteredString(str, width() / 2, i, 16777215);
/* 54:53 */         i += fontLineHeight();
/* 55:   */       }
/* 56:   */     }
/* 57:57 */     super.render(paramInt1, paramInt2, paramFloat);
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.DisconnectedRealmsScreen
 * JD-Core Version:    0.7.0.1
 */