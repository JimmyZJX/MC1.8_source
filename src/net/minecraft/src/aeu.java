package net.minecraft.src;
/*   1:    */ import java.util.Collections;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ class aeu
/*   5:    */   extends aaq
/*   6:    */ {
/*   7:    */   private EntityPlayer g;
/*   8:    */   private int h;
/*   9:    */   private int i;
/*  10:    */   private EntityEnderman j;
/*  11:    */   
/*  12:    */   public aeu(EntityEnderman paramaer)
/*  13:    */   {
/*  14:361 */     super(paramaer, EntityPlayer.class, true);
/*  15:362 */     this.j = paramaer;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean a()
/*  19:    */   {
/*  20:367 */     double d = f();
/*  21:368 */     List localList = this.e.world.a(EntityPlayer.class, this.e.getAABB().expand(d, 4.0D, d), this.c);
/*  22:369 */     Collections.sort(localList, this.b);
/*  23:371 */     if (localList.isEmpty()) {
/*  24:372 */       return false;
/*  25:    */     }
/*  26:374 */     this.g = ((EntityPlayer)localList.get(0));
/*  27:375 */     return true;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void c()
/*  31:    */   {
/*  32:381 */     this.h = 5;
/*  33:382 */     this.i = 0;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void d()
/*  37:    */   {
/*  38:388 */     this.g = null;
/*  39:389 */     this.j.a(false);
/*  40:    */     
/*  41:391 */     xz localxz = this.j.a(afs.d);
/*  42:392 */     localxz.c(EntityEnderman.cn());
/*  43:    */     
/*  44:394 */     super.d();
/*  45:    */   }
/*  46:    */   
/*  47:    */   public boolean b()
/*  48:    */   {
/*  49:399 */     if (this.g != null)
/*  50:    */     {
/*  51:400 */       if (!EntityEnderman.a(this.j, this.g)) {
/*  52:401 */         return false;
/*  53:    */       }
/*  54:403 */       EntityEnderman.a(this.j, true);
/*  55:404 */       this.j.a(this.g, 10.0F, 10.0F);
/*  56:405 */       return true;
/*  57:    */     }
/*  58:407 */     return super.b();
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void e()
/*  62:    */   {
/*  63:412 */     if (this.g != null)
/*  64:    */     {
/*  65:413 */       if (--this.h <= 0)
/*  66:    */       {
/*  67:414 */         this.d = this.g;
/*  68:415 */         this.g = null;
/*  69:416 */         super.c();
/*  70:    */         
/*  71:418 */         this.j.a("mob.endermen.stare", 1.0F, 1.0F);
/*  72:419 */         this.j.a(true);
/*  73:    */         
/*  74:421 */         xz localxz = this.j.a(afs.d);
/*  75:422 */         localxz.b(EntityEnderman.cn());
/*  76:    */       }
/*  77:    */     }
/*  78:    */     else
/*  79:    */     {
/*  80:425 */       if (this.d != null) {
/*  81:426 */         if (((this.d instanceof EntityPlayer)) && (EntityEnderman.a(this.j, (EntityPlayer)this.d)))
/*  82:    */         {
/*  83:427 */           if (this.d.h(this.j) < 16.0D) {
/*  84:428 */             this.j.n();
/*  85:    */           }
/*  86:430 */           this.i = 0;
/*  87:    */         }
/*  88:431 */         else if ((this.d.h(this.j) > 256.0D) && 
/*  89:432 */           (this.i++ >= 30) && 
/*  90:433 */           (this.j.b((Entity)this.d)))
/*  91:    */         {
/*  92:434 */           this.i = 0;
/*  93:    */         }
/*  94:    */       }
/*  95:440 */       super.e();
/*  96:    */     }
/*  97:    */   }
/*  98:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aeu
 * JD-Core Version:    0.7.0.1
 */