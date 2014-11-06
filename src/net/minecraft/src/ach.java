package net.minecraft.src;
/*   1:    */ public class ach
/*   2:    */   extends yl
/*   3:    */ {
/*   4:    */   private EntityRabbit c;
/*   5:443 */   private boolean d = false;
/*   6:    */   
/*   7:    */   public ach(EntityRabbit paramacb1, EntityRabbit paramacb2)
/*   8:    */   {
/*   9:446 */     super(paramacb2);
/*  10:447 */     this.c = paramacb2;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean c()
/*  14:    */   {
/*  15:451 */     return this.a;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean d()
/*  19:    */   {
/*  20:455 */     return this.d;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void a(boolean paramBoolean)
/*  24:    */   {
/*  25:459 */     this.d = paramBoolean;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void b()
/*  29:    */   {
/*  30:464 */     if (this.a)
/*  31:    */     {
/*  32:465 */       this.c.b(ace.c);
/*  33:466 */       this.a = false;
/*  34:    */     }
/*  35:    */   }
/*  36:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ach
 * JD-Core Version:    0.7.0.1
 */