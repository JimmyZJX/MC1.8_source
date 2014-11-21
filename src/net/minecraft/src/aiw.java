package net.minecraft.src;
/*  1:   */ public class aiw
/*  2:   */   extends ajk
/*  3:   */ {
/*  4:   */   private EntityPlayer a;
/*  5:   */   private int b;
/*  6:   */   
/*  7:   */   public aiw(EntityPlayer paramahd, vq paramvq, int paramInt1, int paramInt2, int paramInt3)
/*  8:   */   {
/*  9:17 */     super(paramvq, paramInt1, paramInt2, paramInt3);
/* 10:   */     
/* 11:19 */     this.a = paramahd;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean a(ItemStack paramamj)
/* 15:   */   {
/* 16:24 */     return false;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public ItemStack a(int paramInt)
/* 20:   */   {
/* 21:29 */     if (e()) {
/* 22:30 */       this.b += Math.min(paramInt, d().stackSize);
/* 23:   */     }
/* 24:32 */     return super.a(paramInt);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(EntityPlayer paramahd, ItemStack paramamj)
/* 28:   */   {
/* 29:37 */     c(paramamj);
/* 30:38 */     super.a(paramahd, paramamj);
/* 31:   */   }
/* 32:   */   
/* 33:   */   protected void a(ItemStack paramamj, int paramInt)
/* 34:   */   {
/* 35:43 */     this.b += paramInt;
/* 36:44 */     c(paramamj);
/* 37:   */   }
/* 38:   */   
/* 39:   */   protected void c(ItemStack paramamj)
/* 40:   */   {
/* 41:49 */     paramamj.a(this.a.world, this.a, this.b);
/* 42:51 */     if (!this.a.world.isClient)
/* 43:   */     {
/* 44:52 */       int i = this.b;
/* 45:53 */       float f = aok.a().b(paramamj);
/* 46:   */       int j;
/* 47:55 */       if (f == 0.0F)
/* 48:   */       {
/* 49:56 */         i = 0;
/* 50:   */       }
/* 51:57 */       else if (f < 1.0F)
/* 52:   */       {
/* 53:58 */         j = MathUtils.floor(i * f);
/* 54:59 */         if ((j < MathUtils.ceil(i * f)) && (Math.random() < i * f - j)) {
/* 55:60 */           j++;
/* 56:   */         }
/* 57:62 */         i = j;
/* 58:   */       }
/* 59:65 */       while (i > 0)
/* 60:   */       {
/* 61:66 */         j = EntityExperienceOrb.a(i);
/* 62:67 */         i -= j;
/* 63:68 */         this.a.world.spawnEntity(new EntityExperienceOrb(this.a.world, this.a.xPos, this.a.yPos + 0.5D, this.a.zPos + 0.5D, j));
/* 64:   */       }
/* 65:   */     }
/* 66:71 */     this.b = 0;
/* 67:73 */     if (paramamj.getItem() == ItemList.ironIngot) {
/* 68:74 */       this.a.b(AchievementList.k);
/* 69:   */     }
/* 70:76 */     if (paramamj.getItem() == ItemList.aV) {
/* 71:77 */       this.a.b(AchievementList.p);
/* 72:   */     }
/* 73:   */   }
/* 74:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aiw
 * JD-Core Version:    0.7.0.1
 */