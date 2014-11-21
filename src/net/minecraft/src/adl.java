package net.minecraft.src;
/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class adl
/*   5:    */   extends EntityFrame
/*   6:    */ {
/*   7:    */   public adl(World paramaqu)
/*   8:    */   {
/*   9: 24 */     super(paramaqu);
/*  10:    */   }
/*  11:    */   
/*  12:    */   public adl(World paramaqu, BlockPosition paramdt)
/*  13:    */   {
/*  14: 28 */     super(paramaqu, paramdt);
/*  15: 29 */     setPos(paramdt.getX() + 0.5D, paramdt.getY() + 0.5D, paramdt.getZ() + 0.5D);
/*  16: 30 */     float f1 = 0.125F;
/*  17: 31 */     float f2 = 0.1875F;
/*  18: 32 */     float f3 = 0.25F;
/*  19: 33 */     setAABB(new AABB(this.xPos - 0.1875D, this.yPos - 0.25D + 0.125D, this.zPos - 0.1875D, this.xPos + 0.1875D, this.yPos + 0.25D + 0.125D, this.zPos + 0.1875D));
/*  20:    */   }
/*  21:    */   
/*  22:    */   protected void h()
/*  23:    */   {
/*  24: 38 */     super.h();
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void a(EnumDirection paramej) {}
/*  28:    */   
/*  29:    */   public int l()
/*  30:    */   {
/*  31: 48 */     return 9;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public int m()
/*  35:    */   {
/*  36: 53 */     return 9;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public float getEyeHeight()
/*  40:    */   {
/*  41: 58 */     return -0.0625F;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean a(double paramDouble)
/*  45:    */   {
/*  46: 63 */     return paramDouble < 1024.0D;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void b(Entity paramwv) {}
/*  50:    */   
/*  51:    */   public boolean d(NBTTagCompound paramfn)
/*  52:    */   {
/*  53: 73 */     return false;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void writeEntityToNBT(NBTTagCompound paramfn) {}
/*  57:    */   
/*  58:    */   public void readEntityFromNBT(NBTTagCompound paramfn) {}
/*  59:    */   
/*  60:    */   public boolean e(EntityPlayer paramahd)
/*  61:    */   {
/*  62: 86 */     ItemStack localamj = paramahd.getHeldItemStack();
/*  63:    */     
/*  64: 88 */     int i = 0;
/*  65:    */     double d;
/*  66:    */     List localList;
/*  67:    */     Iterator localIterator;
/*  68: 89 */     if ((localamj != null) && (localamj.getItem() == ItemList.cn) && 
/*  69: 90 */       (!this.world.isClient))
/*  70:    */     {
/*  71: 92 */       d = 7.0D;
/*  72: 93 */       localList = this.world.getEntityList(EntityMob.class, new AABB(this.xPos - d, this.yPos - d, this.zPos - d, this.xPos + d, this.yPos + d, this.zPos + d));
/*  73: 94 */       for (localIterator = localList.iterator(); localIterator.hasNext();)
/*  74:    */       {
/*  75: 94 */         EntityMob localxn = (EntityMob)localIterator.next();
/*  76: 95 */         if ((localxn.cb()) && (localxn.cc() == paramahd))
/*  77:    */         {
/*  78: 96 */           localxn.a(this, true);
/*  79: 97 */           i = 1;
/*  80:    */         }
/*  81:    */       }
/*  82:    */     }
/*  83:    */     EntityMob localxn;
/*  84:102 */     if ((!this.world.isClient) && (i == 0))
/*  85:    */     {
/*  86:103 */       setDead();
/*  87:105 */       if (paramahd.by.d)
/*  88:    */       {
/*  89:107 */         d = 7.0D;
/*  90:108 */         localList = this.world.getEntityList(EntityMob.class, new AABB(this.xPos - d, this.yPos - d, this.zPos - d, this.xPos + d, this.yPos + d, this.zPos + d));
/*  91:109 */         for (localIterator = localList.iterator(); localIterator.hasNext();)
/*  92:    */         {
/*  93:109 */           localxn = (EntityMob)localIterator.next();
/*  94:110 */           if ((localxn.cb()) && (localxn.cc() == this)) {
/*  95:111 */             localxn.a(true, false);
/*  96:    */           }
/*  97:    */         }
/*  98:    */       }
/*  99:    */     }
/* 100:116 */     return true;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public boolean j()
/* 104:    */   {
/* 105:122 */     return this.world.getBlock(this.a).getProto() instanceof avv;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public static adl a(World paramaqu, BlockPosition paramdt)
/* 109:    */   {
/* 110:126 */     adl localadl = new adl(paramaqu, paramdt);
/* 111:127 */     localadl.n = true;
/* 112:128 */     paramaqu.spawnEntity(localadl);
/* 113:129 */     return localadl;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public static adl b(World paramaqu, BlockPosition paramdt)
/* 117:    */   {
/* 118:133 */     int i = paramdt.getX();
/* 119:134 */     int j = paramdt.getY();
/* 120:135 */     int k = paramdt.getZ();
/* 121:    */     
/* 122:137 */     List<adl> localList = paramaqu.getEntityList(adl.class, new AABB(i - 1.0D, j - 1.0D, k - 1.0D, i + 1.0D, j + 1.0D, k + 1.0D));
/* 123:138 */     for (adl localadl : localList) {
/* 124:139 */       if (localadl.n().equals(paramdt)) {
/* 125:140 */         return localadl;
/* 126:    */       }
/* 127:    */     }
/* 128:143 */     return null;
/* 129:    */   }
/* 130:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     adl
 * JD-Core Version:    0.7.0.1
 */