package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class ItemEnderEye
/*   4:    */   extends Item
/*   5:    */ {
/*   6:    */   public ItemEnderEye()
/*   7:    */   {
/*   8: 20 */     setTabToDisplayOn(CreativeTabs.tabMisc);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean a(ItemStack itemStack, EntityPlayer player, World world, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  12:    */   {
/*  13: 25 */     Block localbec1 = world.getBlock(paramdt);
/*  14: 27 */     if ((player.a(paramdt.offset(paramej), paramej, itemStack)) && (localbec1.getType() == BlockList.endPortalFrame) && (!((Boolean)localbec1.getData(avq.b)).booleanValue()))
/*  15:    */     {
/*  16: 28 */       if (world.isClient) {
/*  17: 29 */         return true;
/*  18:    */       }
/*  19: 31 */       world.setBlock(paramdt, localbec1.setData(avq.b, Boolean.valueOf(true)), 2);
/*  20: 32 */       world.e(paramdt, BlockList.endPortalFrame);
/*  21: 33 */       itemStack.stackSize -= 1;
/*  22: 35 */       for (int i = 0; i < 16; i++)
/*  23:    */       {
/*  24: 36 */         double d1 = paramdt.getX() + (5.0F + random.nextFloat() * 6.0F) / 16.0F;
/*  25: 37 */         double d2 = paramdt.getY() + 0.8125F;
/*  26: 38 */         double d3 = paramdt.getZ() + (5.0F + random.nextFloat() * 6.0F) / 16.0F;
/*  27: 39 */         double d4 = 0.0D;
/*  28: 40 */         double d5 = 0.0D;
/*  29: 41 */         double d6 = 0.0D;
/*  30:    */         
/*  31: 43 */         world.a(EnumParticleEffect.l, d1, d2, d3, d4, d5, d6, new int[0]);
/*  32:    */       }
/*  33: 47 */       EnumDirection localej1 = (EnumDirection)localbec1.getData(avq.a);
/*  34:    */       
/*  35:    */ 
/*  36: 50 */       int i1 = 0;
/*  37: 51 */       int j1 = 0;
/*  38: 52 */       int j = 0;
/*  39: 53 */       int k = 1;
/*  40: 54 */       EnumDirection localej2 = localej1.cw();
/*  41:    */       BlockPosition localdt5;
/*  42:    */       Object localObject1;
/*  43: 55 */       for (int l1 = -2; l1 <= 2; l1++)
/*  44:    */       {
/*  45: 56 */         localdt5 = paramdt.offset(localej2, l1);
/*  46: 57 */         localObject1 = world.getBlock(localdt5);
/*  47: 59 */         if (((Block)localObject1).getType() == BlockList.endPortalFrame)
/*  48:    */         {
/*  49: 60 */           if (!((Boolean)((Block)localObject1).getData(avq.b)).booleanValue())
/*  50:    */           {
/*  51: 61 */             k = 0;
/*  52: 62 */             break;
/*  53:    */           }
/*  54: 64 */           j1 = l1;
/*  55: 65 */           if (j == 0)
/*  56:    */           {
/*  57: 66 */             i1 = l1;
/*  58: 67 */             j = 1;
/*  59:    */           }
/*  60:    */         }
/*  61:    */       }
/*  62: 73 */       if ((k != 0) && (j1 == i1 + 2))
/*  63:    */       {
/*  64: 75 */         BlockPosition localdt4 = paramdt.offset(localej1, 4);
/*  65:    */         Object localObject2;
/*  66: 76 */         for (int localdt51 = i1; localdt51 <= j1; localdt51++)
/*  67:    */         {
/*  68: 77 */           localObject1 = localdt4.offset(localej2, localdt51);
/*  69: 78 */           localObject2 = world.getBlock((BlockPosition)localObject1);
/*  70: 80 */           if ((((Block)localObject2).getType() != BlockList.endPortalFrame) || (!((Boolean)((Block)localObject2).getData(avq.b)).booleanValue()))
/*  71:    */           {
/*  72: 81 */             k = 0;
/*  73: 82 */             break;
/*  74:    */           }
/*  75:    */         }
/*  76:    */         int m;
/*  77: 87 */         for (int localdt6 = i1 - 1; localdt6 <= j1 + 1; localdt6 += 4)
/*  78:    */         {
/*  79: 88 */           localdt4 = paramdt.offset(localej2, localdt6);
/*  80: 89 */           for (m = 1; m <= 3; m++)
/*  81:    */           {
/*  82: 90 */             localObject2 = localdt4.offset(localej1, m);
/*  83: 91 */             Block localbec2 = world.getBlock((BlockPosition)localObject2);
/*  84: 93 */             if ((localbec2.getType() != BlockList.endPortalFrame) || (!((Boolean)localbec2.getData(avq.b)).booleanValue()))
/*  85:    */             {
/*  86: 94 */               k = 0;
/*  87: 95 */               break;
/*  88:    */             }
/*  89:    */           }
/*  90:    */         }
/*  91: 99 */         if (k != 0) {
/*  92:101 */           for (int localdt6 = i1; localdt6 <= j1; localdt6++)
/*  93:    */           {
/*  94:102 */             localdt4 = paramdt.offset(localej2, localdt6);
/*  95:103 */             for (m = 1; m <= 3; m++)
/*  96:    */             {
/*  97:104 */               localObject2 = localdt4.offset(localej1, m);
/*  98:    */               
/*  99:106 */               world.setBlock((BlockPosition)localObject2, BlockList.endPortal.instance(), 2);
/* 100:    */             }
/* 101:    */           }
/* 102:    */         }
/* 103:    */       }
/* 104:112 */       return true;
/* 105:    */     }
/* 106:114 */     return false;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public ItemStack a(ItemStack itemStack, World world, EntityPlayer player)
/* 110:    */   {
/* 111:119 */     HitResult hitResult = a(world, player, false);
/* 112:120 */     if ((hitResult != null) && (hitResult.a == brv.BLOCK) && 
/* 113:121 */       (world.getBlock(hitResult.a()).getType() == BlockList.endPortalFrame)) {
/* 114:122 */       return itemStack;
/* 115:    */     }
/* 116:126 */     if (!world.isClient)
/* 117:    */     {
/* 118:127 */       BlockPosition localdt = world.a("Stronghold", new BlockPosition(player));
/* 119:128 */       if (localdt != null)
/* 120:    */       {
/* 121:129 */         EntityEnderEye eye = new EntityEnderEye(world, player.xPos, player.yPos, player.zPos);
/* 122:130 */         eye.a(localdt);
/* 123:131 */         world.spawnEntity(eye);
/* 124:    */         
/* 125:133 */         world.a(player, "random.bow", 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
/* 126:134 */         world.playLevelEvent(null, 1002, new BlockPosition(player), 0);
/* 127:135 */         if (!player.abilities.instabuild) {
/* 128:136 */           itemStack.stackSize -= 1;
/* 129:    */         }
/* 130:138 */         player.increaseStat(StatList.J[Item.b(this)]);
/* 131:    */       }
/* 132:    */     }
/* 133:141 */     return itemStack;
/* 134:    */   }
/* 135:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     alb
 * JD-Core Version:    0.7.0.1
 */