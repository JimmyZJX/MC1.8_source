package net.minecraft.src;
/*   1:    */ class ack
/*   2:    */   extends zn
/*   3:    */ {
/*   4:    */   private final EntityRabbit c;
/*   5:    */   private boolean d;
/*   6:506 */   private boolean e = false;
/*   7:    */   
/*   8:    */   public ack(EntityRabbit paramacb)
/*   9:    */   {
/*  10:509 */     super(paramacb, 0.699999988079071D, 16);
/*  11:510 */     this.c = paramacb;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public boolean canStart()
/*  15:    */   {
/*  16:515 */     if (this.a <= 0)
/*  17:    */     {
/*  18:516 */       if (!this.c.world.getGameRules().getBoolean("mobGriefing")) {
/*  19:517 */         return false;
/*  20:    */       }
/*  21:521 */       this.e = false;
/*  22:522 */       this.d = EntityRabbit.a(this.c);
/*  23:    */     }
/*  24:525 */     return super.canStart();
/*  25:    */   }
/*  26:    */   
/*  27:    */   public boolean canContinue()
/*  28:    */   {
/*  29:530 */     return (this.e) && (super.canContinue());
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void start()
/*  33:    */   {
/*  34:535 */     super.start();
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void stop()
/*  38:    */   {
/*  39:540 */     super.stop();
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void tick()
/*  43:    */   {
/*  44:545 */     super.tick();
/*  45:    */     
/*  46:547 */     this.c.p().a(this.b.getX() + 0.5D, this.b.getY() + 1, this.b.getZ() + 0.5D, 10.0F, this.c.bP());
/*  47:549 */     if (f())
/*  48:    */     {
/*  49:550 */       World localaqu = this.c.world;
/*  50:551 */       BlockPosition localdt = this.b.up();
/*  51:    */       
/*  52:553 */       Block localbec = localaqu.getBlock(localdt);
/*  53:554 */       BlockType localatr = localbec.getType();
/*  54:556 */       if ((this.e) && ((localatr instanceof auh)) && (((Integer)localbec.getData(auh.a)).intValue() == 7))
/*  55:    */       {
/*  56:557 */         localaqu.setBlock(localdt, BlockList.air.instance(), 2);
/*  57:558 */         localaqu.b(localdt, true);
/*  58:559 */         this.c.cn();
/*  59:    */       }
/*  60:562 */       this.e = false;
/*  61:    */       
/*  62:    */ 
/*  63:565 */       this.a = 10;
/*  64:    */     }
/*  65:    */   }
/*  66:    */   
/*  67:    */   protected boolean a(World paramaqu, BlockPosition paramdt)
/*  68:    */   {
/*  69:571 */     BlockType localatr = paramaqu.getBlock(paramdt).getType();
/*  70:573 */     if (localatr == BlockList.ak)
/*  71:    */     {
/*  72:574 */       paramdt = paramdt.up();
/*  73:575 */       Block localbec = paramaqu.getBlock(paramdt);
/*  74:576 */       localatr = localbec.getType();
/*  75:578 */       if (((localatr instanceof auh)) && (((Integer)localbec.getData(auh.a)).intValue() == 7) && (this.d) && (!this.e))
/*  76:    */       {
/*  77:579 */         this.e = true;
/*  78:580 */         return true;
/*  79:    */       }
/*  80:    */     }
/*  81:583 */     return false;
/*  82:    */   }
/*  83:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ack
 * JD-Core Version:    0.7.0.1
 */