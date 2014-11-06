package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class ads
/*  5:   */   extends adr
/*  6:   */ {
/*  7:   */   private int b;
/*  8:   */   public long a;
/*  9:   */   private int c;
/* 10:   */   
/* 11:   */   public ads(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 12:   */   {
/* 13:23 */     super(paramaqu);
/* 14:24 */     setPositionAndAngles(paramDouble1, paramDouble2, paramDouble3, 0.0F, 0.0F);
/* 15:25 */     this.b = 2;
/* 16:26 */     this.a = this.random.nextLong();
/* 17:27 */     this.c = (this.random.nextInt(3) + 1);
/* 18:29 */     if ((!paramaqu.isClient) && (paramaqu.getGameRules().getBoolean("doFireTick")) && ((paramaqu.getDifficulty() == EnumDifficulty.NORMAL) || (paramaqu.getDifficulty() == EnumDifficulty.HARD)) && (paramaqu.a(new BlockPosition(this), 10)))
/* 19:   */     {
/* 20:30 */       BlockPosition localdt1 = new BlockPosition(this);
/* 21:32 */       if ((paramaqu.getBlock(localdt1).getProto().getMaterial() == Material.air) && (BlockList.ab.c(paramaqu, localdt1))) {
/* 22:33 */         paramaqu.setBlock(localdt1, BlockList.ab.instance());
/* 23:   */       }
/* 24:37 */       for (int i = 0; i < 4; i++)
/* 25:   */       {
/* 26:38 */         BlockPosition localdt2 = localdt1.offset(this.random.nextInt(3) - 1, this.random.nextInt(3) - 1, this.random.nextInt(3) - 1);
/* 27:39 */         if ((paramaqu.getBlock(localdt2).getProto().getMaterial() == Material.air) && (BlockList.ab.c(paramaqu, localdt2))) {
/* 28:40 */           paramaqu.setBlock(localdt2, BlockList.ab.instance());
/* 29:   */         }
/* 30:   */       }
/* 31:   */     }
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void onUpdate()
/* 35:   */   {
/* 36:48 */     super.onUpdate();
/* 37:50 */     if (this.b == 2)
/* 38:   */     {
/* 39:51 */       this.world.a(this.xPos, this.yPos, this.zPos, "ambient.weather.thunder", 10000.0F, 0.8F + this.random.nextFloat() * 0.2F);
/* 40:52 */       this.world.a(this.xPos, this.yPos, this.zPos, "random.explode", 2.0F, 0.5F + this.random.nextFloat() * 0.2F);
/* 41:   */     }
/* 42:55 */     this.b -= 1;
/* 43:56 */     if (this.b < 0) {
/* 44:57 */       if (this.c == 0)
/* 45:   */       {
/* 46:58 */         setDead();
/* 47:   */       }
/* 48:59 */       else if (this.b < -this.random.nextInt(10))
/* 49:   */       {
/* 50:60 */         this.c -= 1;
/* 51:61 */         this.b = 1;
/* 52:62 */         this.a = this.random.nextLong();
/* 53:63 */         BlockPosition localdt = new BlockPosition(this);
/* 54:64 */         if ((!this.world.isClient) && (this.world.getGameRules().getBoolean("doFireTick")) && (this.world.a(localdt, 10)) && 
/* 55:65 */           (this.world.getBlock(localdt).getProto().getMaterial() == Material.air) && (BlockList.ab.c(this.world, localdt))) {
/* 56:66 */           this.world.setBlock(localdt, BlockList.ab.instance());
/* 57:   */         }
/* 58:   */       }
/* 59:   */     }
/* 60:72 */     if (this.b >= 0) {
/* 61:73 */       if (this.world.isClient)
/* 62:   */       {
/* 63:74 */         this.world.c(2);
/* 64:   */       }
/* 65:   */       else
/* 66:   */       {
/* 67:76 */         double d = 3.0D;
/* 68:77 */         List localList = this.world.b(this, new AABB(this.xPos - d, this.yPos - d, this.zPos - d, this.xPos + d, this.yPos + 6.0D + d, this.zPos + d));
/* 69:78 */         for (int i = 0; i < localList.size(); i++)
/* 70:   */         {
/* 71:79 */           Entity localwv = (Entity)localList.get(i);
/* 72:80 */           localwv.a(this);
/* 73:   */         }
/* 74:   */       }
/* 75:   */     }
/* 76:   */   }
/* 77:   */   
/* 78:   */   protected void h() {}
/* 79:   */   
/* 80:   */   protected void readEntityFromNBT(NBTTagCompound paramfn) {}
/* 81:   */   
/* 82:   */   protected void writeEntityToNBT(NBTTagCompound paramfn) {}
/* 83:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ads
 * JD-Core Version:    0.7.0.1
 */