package net.minecraft.src;
/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class ahv
/*   5:    */   extends ahr
/*   6:    */ {
/*   7:    */   private ItemStack c;
/*   8:    */   
/*   9:    */   public ahv(World paramaqu)
/*  10:    */   {
/*  11: 26 */     super(paramaqu);
/*  12:    */   }
/*  13:    */   
/*  14:    */   public ahv(World paramaqu, EntityLiving paramxm, int paramInt)
/*  15:    */   {
/*  16: 30 */     this(paramaqu, paramxm, new ItemStack(ItemList.bz, 1, paramInt));
/*  17:    */   }
/*  18:    */   
/*  19:    */   public ahv(World paramaqu, EntityLiving paramxm, ItemStack paramamj)
/*  20:    */   {
/*  21: 34 */     super(paramaqu, paramxm);
/*  22:    */     
/*  23: 36 */     this.c = paramamj;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public ahv(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
/*  27:    */   {
/*  28: 40 */     this(paramaqu, paramDouble1, paramDouble2, paramDouble3, new ItemStack(ItemList.bz, 1, paramInt));
/*  29:    */   }
/*  30:    */   
/*  31:    */   public ahv(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, ItemStack paramamj)
/*  32:    */   {
/*  33: 44 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  34: 45 */     this.c = paramamj;
/*  35:    */   }
/*  36:    */   
/*  37:    */   protected float m()
/*  38:    */   {
/*  39: 50 */     return 0.05F;
/*  40:    */   }
/*  41:    */   
/*  42:    */   protected float j()
/*  43:    */   {
/*  44: 55 */     return 0.5F;
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected float l()
/*  48:    */   {
/*  49: 60 */     return -20.0F;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void a(int paramInt)
/*  53:    */   {
/*  54: 64 */     if (this.c == null) {
/*  55: 65 */       this.c = new ItemStack(ItemList.bz, 1, 0);
/*  56:    */     }
/*  57: 67 */     this.c.b(paramInt);
/*  58:    */   }
/*  59:    */   
/*  60:    */   public int o()
/*  61:    */   {
/*  62: 71 */     if (this.c == null) {
/*  63: 72 */       this.c = new ItemStack(ItemList.bz, 1, 0);
/*  64:    */     }
/*  65: 74 */     return this.c.i();
/*  66:    */   }
/*  67:    */   
/*  68:    */   protected void a(HitResult parambru)
/*  69:    */   {
/*  70: 79 */     if (!this.world.isClient)
/*  71:    */     {
/*  72: 80 */       List<wq> localList1 = ItemList.bz.h(this.c);
/*  73:    */       Iterator localIterator1;
/*  74: 82 */       if ((localList1 != null) && (!localList1.isEmpty()))
/*  75:    */       {
/*  76: 83 */         AABB localbrt = getAABB().expand(4.0D, 2.0D, 4.0D);
/*  77: 84 */         List localList2 = this.world.a(EntityLiving.class, localbrt);
/*  78: 86 */         if (!localList2.isEmpty()) {
/*  79: 87 */           for (localIterator1 = localList2.iterator(); localIterator1.hasNext();)
/*  80:    */           {
/*  81: 87 */             EntityLiving localxm = (EntityLiving)localIterator1.next();
/*  82: 88 */             double d1 = h(localxm);
/*  83: 89 */             if (d1 < 16.0D)
/*  84:    */             {
/*  85: 90 */               double d2 = 1.0D - Math.sqrt(d1) / 4.0D;
/*  86: 91 */               if (localxm == parambru.d) {
/*  87: 92 */                 d2 = 1.0D;
/*  88:    */               }
/*  89: 95 */               for (wq localwq : localList1)
/*  90:    */               {
/*  91: 96 */                 int i = localwq.a();
/*  92: 97 */                 if (Potion.a[i].b())
/*  93:    */                 {
/*  94: 98 */                   Potion.a[i].a(this, n(), localxm, localwq.c(), d2);
/*  95:    */                 }
/*  96:    */                 else
/*  97:    */                 {
/*  98:100 */                   int j = (int)(d2 * localwq.b() + 0.5D);
/*  99:101 */                   if (j > 20) {
/* 100:102 */                     localxm.c(new wq(i, j, localwq.c()));
/* 101:    */                   }
/* 102:    */                 }
/* 103:    */               }
/* 104:    */             }
/* 105:    */           }
/* 106:    */         }
/* 107:    */       }
/* 110:110 */       this.world.playLevelEvent(2002, new BlockPosition(this), o());
/* 111:    */       
/* 112:112 */       setDead();
/* 113:    */     }
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 117:    */   {
/* 118:118 */     super.readEntityFromNBT(paramfn);
/* 119:120 */     if (paramfn.hasKey("Potion", 10)) {
/* 120:121 */       this.c = ItemStack.loadItemStackFromNBT(paramfn.getCompoundTag("Potion"));
/* 121:    */     } else {
/* 122:123 */       a(paramfn.getInteger("potionValue"));
/* 123:    */     }
/* 124:126 */     if (this.c == null) {
/* 125:127 */       setDead();
/* 126:    */     }
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 130:    */   {
/* 131:133 */     super.writeEntityToNBT(paramfn);
/* 132:134 */     if (this.c != null) {
/* 133:135 */       paramfn.setNBT("Potion", this.c.writeToNBT(new NBTTagCompound()));
/* 134:    */     }
/* 135:    */   }
/* 136:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ahv
 * JD-Core Version:    0.7.0.1
 */