package net.minecraft.src;
/*  1:   */ public class aai
/*  2:   */   extends zf
/*  3:   */ {
/*  4:   */   private int e;
/*  5:   */   private EntityVillager f;
/*  6:   */   
/*  7:   */   public aai(EntityVillager paramagp)
/*  8:   */   {
/*  9:16 */     super(paramagp, EntityVillager.class, 3.0F, 0.02F);
/* 10:17 */     this.f = paramagp;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void start()
/* 14:   */   {
/* 15:22 */     super.start();
/* 16:24 */     if ((this.f.cq()) && ((this.b instanceof EntityVillager)) && (((EntityVillager)this.b).cr())) {
/* 17:25 */       this.e = 10;
/* 18:   */     } else {
/* 19:27 */       this.e = 0;
/* 20:   */     }
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void tick()
/* 24:   */   {
/* 25:33 */     super.tick();
/* 26:35 */     if (this.e > 0)
/* 27:   */     {
/* 28:36 */       this.e -= 1;
/* 29:38 */       if (this.e == 0)
/* 30:   */       {
/* 31:40 */         wa localwa = this.f.getInventory();
/* 32:41 */         for (int i = 0; i < localwa.getSize(); i++)
/* 33:   */         {
/* 34:42 */           ItemStack localamj1 = localwa.get(i);
/* 35:43 */           ItemStack localamj2 = null;
/* 36:45 */           if (localamj1 != null)
/* 37:   */           {
/* 38:46 */             Item localalq = localamj1.getItem();
/* 39:   */             int j;
/* 40:48 */             if (((localalq == ItemList.bread) || (localalq == ItemList.potato) || (localalq == ItemList.carrot)) && (localamj1.stackSize > 3))
/* 41:   */             {
/* 42:49 */               j = localamj1.stackSize / 2;
/* 43:50 */               localamj1.stackSize -= j;
/* 44:51 */               localamj2 = new ItemStack(localalq, j, localamj1.getDamage2());
/* 45:   */             }
/* 46:52 */             else if ((localalq == ItemList.O) && (localamj1.stackSize > 5))
/* 47:   */             {
/* 48:53 */               j = localamj1.stackSize / 2 / 3 * 3;
/* 49:54 */               int k = j / 3;
/* 50:55 */               localamj1.stackSize -= j;
/* 51:56 */               localamj2 = new ItemStack(ItemList.bread, k, 0);
/* 52:   */             }
/* 53:58 */             if (localamj1.stackSize <= 0) {
/* 54:59 */               localwa.a(i, null);
/* 55:   */             }
/* 56:   */           }
/* 57:62 */           if (localamj2 != null)
/* 58:   */           {
/* 59:63 */             double d = this.f.yPos - 0.300000011920929D + this.f.getEyeHeight();
/* 60:64 */             EntityItem entityItem = new EntityItem(this.f.world, this.f.xPos, d, this.f.zPos, localamj2);
/* 61:65 */             float f1 = 0.3F;
/* 62:66 */             float f2 = this.f.aI;
/* 63:67 */             float f3 = this.f.pitch;
/* 64:68 */             entityItem.xVelocity = (-MathUtils.sin(f2 / 180.0F * 3.141593F) * MathUtils.cos(f3 / 180.0F * 3.141593F) * f1);
/* 65:69 */             entityItem.zVelocity = (MathUtils.cos(f2 / 180.0F * 3.141593F) * MathUtils.cos(f3 / 180.0F * 3.141593F) * f1);
/* 66:70 */             entityItem.yVelocity = (-MathUtils.sin(f3 / 180.0F * 3.141593F) * f1 + 0.1F);
/* 67:71 */             entityItem.initPickupDelay();
/* 68:   */             
/* 69:73 */             this.f.world.spawnEntity(entityItem);
/* 70:   */             
/* 71:75 */             break;
/* 72:   */           }
/* 73:   */         }
/* 74:   */       }
/* 75:   */     }
/* 76:   */   }
/* 77:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aai
 * JD-Core Version:    0.7.0.1
 */