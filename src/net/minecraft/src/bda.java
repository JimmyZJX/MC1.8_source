package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bda
/*  4:   */   extends bcm
/*  5:   */   implements pm
/*  6:   */ {
/*  7:   */   public float a;
/*  8:   */   public float f;
/*  9:   */   public int g;
/* 10:   */   private int h;
/* 11:   */   
/* 12:   */   public void c()
/* 13:   */   {
/* 14:18 */     if (++this.h % 20 * 4 == 0) {
/* 15:19 */       this.world.c(this.pos, BlockList.bQ, 1, this.g);
/* 16:   */     }
/* 17:22 */     this.f = this.a;
/* 18:   */     
/* 19:24 */     int i = this.pos.getX();
/* 20:25 */     int j = this.pos.getY();
/* 21:26 */     int k = this.pos.getZ();
/* 22:   */     
/* 23:28 */     float f1 = 0.1F;
/* 24:   */     double d2;
/* 25:29 */     if ((this.g > 0) && (this.a == 0.0F))
/* 26:   */     {
/* 27:30 */       double d1 = i + 0.5D;
/* 28:31 */       d2 = k + 0.5D;
/* 29:   */       
/* 30:33 */       this.world.a(d1, j + 0.5D, d2, "random.chestopen", 0.5F, this.world.rng.nextFloat() * 0.1F + 0.9F);
/* 31:   */     }
/* 32:35 */     if (((this.g == 0) && (this.a > 0.0F)) || ((this.g > 0) && (this.a < 1.0F)))
/* 33:   */     {
/* 34:36 */       float f2 = this.a;
/* 35:37 */       if (this.g > 0) {
/* 36:38 */         this.a += f1;
/* 37:   */       } else {
/* 38:40 */         this.a -= f1;
/* 39:   */       }
/* 40:42 */       if (this.a > 1.0F) {
/* 41:43 */         this.a = 1.0F;
/* 42:   */       }
/* 43:45 */       float f3 = 0.5F;
/* 44:46 */       if ((this.a < f3) && (f2 >= f3))
/* 45:   */       {
/* 46:47 */         d2 = i + 0.5D;
/* 47:48 */         double d3 = k + 0.5D;
/* 48:   */         
/* 49:50 */         this.world.a(d2, j + 0.5D, d3, "random.chestclosed", 0.5F, this.world.rng.nextFloat() * 0.1F + 0.9F);
/* 50:   */       }
/* 51:52 */       if (this.a < 0.0F) {
/* 52:53 */         this.a = 0.0F;
/* 53:   */       }
/* 54:   */     }
/* 55:   */   }
/* 56:   */   
/* 57:   */   public boolean c(int paramInt1, int paramInt2)
/* 58:   */   {
/* 59:60 */     if (paramInt1 == 1)
/* 60:   */     {
/* 61:61 */       this.g = paramInt2;
/* 62:62 */       return true;
/* 63:   */     }
/* 64:64 */     return super.c(paramInt1, paramInt2);
/* 65:   */   }
/* 66:   */   
/* 67:   */   public void y()
/* 68:   */   {
/* 69:69 */     E();
/* 70:70 */     super.y();
/* 71:   */   }
/* 72:   */   
/* 73:   */   public void b()
/* 74:   */   {
/* 75:74 */     this.g += 1;
/* 76:75 */     this.world.c(this.pos, BlockList.bQ, 1, this.g);
/* 77:   */   }
/* 78:   */   
/* 79:   */   public void d()
/* 80:   */   {
/* 81:79 */     this.g -= 1;
/* 82:80 */     this.world.c(this.pos, BlockList.bQ, 1, this.g);
/* 83:   */   }
/* 84:   */   
/* 85:   */   public boolean a(EntityPlayer paramahd)
/* 86:   */   {
/* 87:84 */     if (this.world.s(this.pos) != this) {
/* 88:85 */       return false;
/* 89:   */     }
/* 90:87 */     if (paramahd.dist2(this.pos.getX() + 0.5D, this.pos.getY() + 0.5D, this.pos.getZ() + 0.5D) > 64.0D) {
/* 91:88 */       return false;
/* 92:   */     }
/* 93:91 */     return true;
/* 94:   */   }
/* 95:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bda
 * JD-Core Version:    0.7.0.1
 */