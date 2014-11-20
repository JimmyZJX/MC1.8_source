package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class azk
/*   4:    */   extends avb
/*   5:    */ {
/*   6:    */   private bek a;
/*   7:    */   private bek b;
/*   8:    */   private bek M;
/*   9:    */   private bek O;
/*  10:    */   
/*  11:    */   protected azk()
/*  12:    */   {
/*  13: 26 */     super(Material.C);
/*  14: 27 */     j(this.L.b().a(N, EnumDirection.NORTH));
/*  15: 28 */     a(true);
/*  16: 29 */     setCreativeTab(CreativeTabs.tabBlock);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/*  20:    */   {
/*  21: 34 */     super.c(paramaqu, paramdt, parambec);
/*  22: 35 */     e(paramaqu, paramdt);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public boolean d(World paramaqu, BlockPosition paramdt)
/*  26:    */   {
/*  27: 39 */     return (j().a(paramaqu, paramdt) != null) || (S().a(paramaqu, paramdt) != null);
/*  28:    */   }
/*  29:    */   
/*  30:    */   private void e(World paramaqu, BlockPosition paramdt)
/*  31:    */   {
/*  32:    */     bem localbem;
/*  33:    */     int m;
/*  34: 45 */     if ((localbem = l().a(paramaqu, paramdt)) != null)
/*  35:    */     {
/*  36: 46 */       for (int i = 0; i < l().b(); i++)
/*  37:    */       {
/*  38: 47 */         bei localObject = localbem.a(0, i, 0);
/*  39: 48 */         paramaqu.setBlock(((bei)localObject).d(), BlockList.air.instance(), 2);
/*  40:    */       }
/*  41: 51 */       EntitySnowGolem localacn = new EntitySnowGolem(paramaqu);
/*  42: 52 */       Object localObject = localbem.a(0, 2, 0).d();
/*  43: 53 */       localacn.setPositionAndAngles(((BlockPosition)localObject).getX() + 0.5D, ((BlockPosition)localObject).getY() + 0.05D, ((BlockPosition)localObject).getZ() + 0.5D, 0.0F, 0.0F);
/*  44: 54 */       paramaqu.spawnEntity(localacn);
/*  45: 56 */       for (m = 0; m < 120; m++) {
/*  46: 57 */         paramaqu.a(EnumParticleEffect.G, ((BlockPosition)localObject).getX() + paramaqu.rng.nextDouble(), ((BlockPosition)localObject).getY() + paramaqu.rng.nextDouble() * 2.5D, ((BlockPosition)localObject).getZ() + paramaqu.rng.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
/*  47:    */       }
/*  48: 60 */       for (m = 0; m < l().b(); m++)
/*  49:    */       {
/*  50: 61 */         bei localbei1 = localbem.a(0, m, 0);
/*  51: 62 */         paramaqu.b(localbei1.d(), BlockList.air);
/*  52:    */       }
/*  53:    */     }
/*  54: 64 */     else if ((localbem = T().a(paramaqu, paramdt)) != null)
/*  55:    */     {
/*  56: 65 */       for (int j = 0; j < T().c(); j++) {
/*  57: 66 */         for (int k = 0; k < T().b(); k++) {
/*  58: 67 */           paramaqu.setBlock(localbem.a(j, k, 0).d(), BlockList.air.instance(), 2);
/*  59:    */         }
/*  60:    */       }
/*  61: 71 */       BlockPosition localdt = localbem.a(1, 2, 0).d();
/*  62:    */       
/*  63: 73 */       EntityIronGolem localacq = new EntityIronGolem(paramaqu);
/*  64: 74 */       localacq.l(true);
/*  65: 75 */       localacq.setPositionAndAngles(localdt.getX() + 0.5D, localdt.getY() + 0.05D, localdt.getZ() + 0.5D, 0.0F, 0.0F);
/*  66: 76 */       paramaqu.spawnEntity(localacq);
/*  67: 78 */       for (m = 0; m < 120; m++) {
/*  68: 79 */         paramaqu.a(EnumParticleEffect.F, localdt.getX() + paramaqu.rng.nextDouble(), localdt.getY() + paramaqu.rng.nextDouble() * 3.9D, localdt.getZ() + paramaqu.rng.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
/*  69:    */       }
/*  70: 82 */       for (m = 0; m < T().c(); m++) {
/*  71: 83 */         for (int n = 0; n < T().b(); n++)
/*  72:    */         {
/*  73: 84 */           bei localbei2 = localbem.a(m, n, 0);
/*  74: 85 */           paramaqu.b(localbei2.d(), BlockList.air);
/*  75:    */         }
/*  76:    */       }
/*  77:    */     }
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  81:    */   {
/*  82: 93 */     return (paramaqu.getBlock(paramdt).getProto().material.j()) && (World.isFlatSurface(paramaqu, paramdt.down()));
/*  83:    */   }
/*  84:    */   
/*  85:    */   public Block a(World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, EntityLiving paramxm)
/*  86:    */   {
/*  87: 98 */     return instance().a(N, paramxm.aO().d());
/*  88:    */   }
/*  89:    */   
/*  90:    */   public Block a(int paramInt)
/*  91:    */   {
/*  92:103 */     return instance().a(N, EnumDirection.b(paramInt));
/*  93:    */   }
/*  94:    */   
/*  95:    */   public int c(Block parambec)
/*  96:    */   {
/*  97:109 */     return ((EnumDirection)parambec.getProperty(N)).b();
/*  98:    */   }
/*  99:    */   
/* 100:    */   protected bed e()
/* 101:    */   {
/* 102:114 */     return new bed(this, new IBlockData[] { N });
/* 103:    */   }
/* 104:    */   
/* 105:    */   protected bek j()
/* 106:    */   {
/* 107:118 */     if (this.a == null) {
/* 108:119 */       this.a = ben.a().a(new String[] { " ", "#", "#" }).a('#', bei.a(beq.a(BlockList.aJ))).b();
/* 109:    */     }
/* 110:129 */     return this.a;
/* 111:    */   }
/* 112:    */   
/* 113:    */   protected bek l()
/* 114:    */   {
/* 115:133 */     if (this.b == null) {
/* 116:134 */       this.b = ben.a().a(new String[] { "^", "#", "#" }).a('^', bei.a(beq.a(BlockList.pumpkin))).a('#', bei.a(beq.a(BlockList.aJ))).b();
/* 117:    */     }
/* 118:145 */     return this.b;
/* 119:    */   }
/* 120:    */   
/* 121:    */   protected bek S()
/* 122:    */   {
/* 123:149 */     if (this.M == null) {
/* 124:150 */       this.M = ben.a().a(new String[] { "~ ~", "###", "~#~" }).a('#', bei.a(beq.a(BlockList.S))).a('~', bei.a(beq.a(BlockList.air))).b();
/* 125:    */     }
/* 126:161 */     return this.M;
/* 127:    */   }
/* 128:    */   
/* 129:    */   protected bek T()
/* 130:    */   {
/* 131:165 */     if (this.O == null) {
/* 132:166 */       this.O = ben.a().a(new String[] { "~^~", "###", "~#~" }).a('^', bei.a(beq.a(BlockList.pumpkin))).a('#', bei.a(beq.a(BlockList.S))).a('~', bei.a(beq.a(BlockList.air))).b();
/* 133:    */     }
/* 134:178 */     return this.O;
/* 135:    */   }
/* 136:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     azk
 * JD-Core Version:    0.7.0.1
 */