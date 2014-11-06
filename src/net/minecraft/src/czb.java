package net.minecraft.src;
/*   2:    */ import paulscode.sound.SoundSystemConfig;
/*   3:    */ 
/*   4:    */ class czb
/*   5:    */   implements Runnable
/*   6:    */ {
				private final cza a;
/*   7:    */   czb(cza paramcza) {a=paramcza;}
/*   8:    */   
/*   9:    */   public void run()
/*  10:    */   {
/*  11: 88 */     SoundSystemConfig.setLogger(new czc(this));
/*  12:    */     
/*  13:    */ 
/*  14:    */ 
/*  15:    */ 
/*  16:    */ 
/*  17:    */ 
/*  18:    */ 
/*  19:    */ 
/*  20:    */ 
/*  21:    */ 
/*  22:    */ 
/*  23:    */ 
/*  24:    */ 
/*  25:    */ 
/*  26:    */ 
/*  27:    */ 
/*  28:    */ 
/*  29:    */ 
/*  30:    */ 
/*  31:    */ 
/*  32:    */ 
/*  33:    */ 
/*  34:111 */     cza.a(this.a, new czf(this.a, null));
/*  35:112 */     cza.a(this.a, true);
/*  36:113 */     cza.b(this.a).setMasterVolume(cza.a(this.a).a(cxz.a));
/*  37:114 */     cza.g().info(cza.h(), "Sound engine started");
/*  38:    */   }
/*  39:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     czb
 * JD-Core Version:    0.7.0.1
 */