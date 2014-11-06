package net.minecraft.src;
/*   1:    */ import org.lwjgl.opengl.GL11;
/*   2:    */ 
/*   3:    */ class GLOption
/*   4:    */ {
/*   5:    */   private final int id;
/*   6:701 */   private boolean enabled = false;
/*   7:    */   
/*   8:    */   public GLOption(int paramInt)
/*   9:    */   {
/*  10:704 */     this.id = paramInt;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public void disable()
/*  14:    */   {
/*  15:708 */     setEnabled(false);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void enable()
/*  19:    */   {
/*  20:712 */     setEnabled(true);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void setEnabled(boolean paramBoolean)
/*  24:    */   {
/*  25:716 */     if (paramBoolean != this.enabled)
/*  26:    */     {
/*  27:717 */       this.enabled = paramBoolean;
/*  28:718 */       if (paramBoolean) {
/*  29:719 */         GL11.glEnable(this.id);
/*  30:    */       } else {
/*  31:721 */         GL11.glDisable(this.id);
/*  32:    */       }
/*  33:    */     }
/*  34:    */   }
/*  35:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cjq
 * JD-Core Version:    0.7.0.1
 */