/*  1:   */ package net.minecraft.realms;
/*  2:   */ 
/*  3:   */ import net.minecraft.src.bsu;
import net.minecraft.src.bul;
/*  5:   */ 
/*  6:   */ public class RealmsEditBox
/*  7:   */ {
/*  8:   */   private final bul editBox;
/*  9:   */   
/* 10:   */   public RealmsEditBox(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/* 11:   */   {
/* 12:11 */     this.editBox = new bul(paramInt1, bsu.z().k, paramInt2, paramInt3, paramInt4, paramInt5);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public String getValue()
/* 16:   */   {
/* 17:15 */     return this.editBox.b();
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void tick()
/* 21:   */   {
/* 22:19 */     this.editBox.a();
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setFocus(boolean paramBoolean)
/* 26:   */   {
/* 27:23 */     this.editBox.b(paramBoolean);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void setValue(String paramString)
/* 31:   */   {
/* 32:27 */     this.editBox.a(paramString);
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void keyPressed(char paramChar, int paramInt)
/* 36:   */   {
/* 37:31 */     this.editBox.a(paramChar, paramInt);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public boolean isFocused()
/* 41:   */   {
/* 42:35 */     return this.editBox.m();
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void mouseClicked(int paramInt1, int paramInt2, int paramInt3)
/* 46:   */   {
/* 47:39 */     this.editBox.a(paramInt1, paramInt2, paramInt3);
/* 48:   */   }
/* 49:   */   
/* 50:   */   public void render()
/* 51:   */   {
/* 52:43 */     this.editBox.g();
/* 53:   */   }
/* 54:   */   
/* 55:   */   public void setMaxLength(int paramInt)
/* 56:   */   {
/* 57:47 */     this.editBox.f(paramInt);
/* 58:   */   }
/* 59:   */   
/* 60:   */   public void setIsEditable(boolean paramBoolean)
/* 61:   */   {
/* 62:51 */     this.editBox.c(paramBoolean);
/* 63:   */   }
/* 64:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     net.minecraft.realms.RealmsEditBox
 * JD-Core Version:    0.7.0.1
 */