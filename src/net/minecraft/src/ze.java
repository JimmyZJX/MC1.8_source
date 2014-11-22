package net.minecraft.src;
/*   1:    */ public class ze
/*   2:    */   extends zn
/*   3:    */ {
/*   4:    */   private final EntityVillager c;
/*   5:    */   private boolean d;
/*   6:    */   private boolean e;
/*   7:    */   private int f;
/*   8:    */   
/*   9:    */   public ze(EntityVillager paramagp, double paramDouble)
/*  10:    */   {
/*  11: 27 */     super(paramagp, paramDouble, 16);
/*  12: 28 */     this.c = paramagp;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public boolean canStart()
/*  16:    */   {
/*  17: 33 */     if (this.a <= 0)
/*  18:    */     {
/*  19: 34 */       if (!this.c.world.getGameRules().getBoolean("mobGriefing")) {
/*  20: 35 */         return false;
/*  21:    */       }
/*  22: 39 */       this.f = -1;
/*  23: 40 */       this.d = this.c.cs();
/*  24: 41 */       this.e = this.c.cr();
/*  25:    */     }
/*  26: 44 */     return super.canStart();
/*  27:    */   }
/*  28:    */   
/*  29:    */   public boolean canContinue()
/*  30:    */   {
/*  31: 49 */     return (this.f >= 0) && (super.canContinue());
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void start()
/*  35:    */   {
/*  36: 54 */     super.start();
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void stop()
/*  40:    */   {
/*  41: 59 */     super.stop();
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void tick()
/*  45:    */   {
/*  46: 64 */     super.tick();
/*  47:    */     
/*  48: 66 */     this.c.p().a(this.b.getX() + 0.5D, this.b.getY() + 1, this.b.getZ() + 0.5D, 10.0F, this.c.bP());
/*  49: 68 */     if (f())
/*  50:    */     {
/*  51: 69 */       World localaqu = this.c.world;
/*  52: 70 */       BlockPosition localdt = this.b.up();
/*  53:    */       
/*  54: 72 */       Block localbec = localaqu.getBlock(localdt);
/*  55: 73 */       ProtoBlock localatr = localbec.getProto();
/*  56: 75 */       if ((this.f == 0) && ((localatr instanceof auu)) && (((Integer)localbec.getProperty(auu.a)).intValue() == 7))
/*  57:    */       {
/*  58: 76 */         localaqu.b(localdt, true);
/*  59:    */       }
/*  60: 77 */       else if ((this.f == 1) && (localatr == BlockList.air))
/*  61:    */       {
/*  62: 80 */         wa localwa = this.c.getInventory();
/*  63: 81 */         for (int i = 0; i < localwa.getSize(); i++)
/*  64:    */         {
/*  65: 82 */           ItemStack localamj = localwa.get(i);
/*  66: 83 */           int j = 0;
/*  67: 84 */           if (localamj != null) {
/*  68: 85 */             if (localamj.getItem() == ItemList.N)
/*  69:    */             {
/*  70: 86 */               localaqu.setBlock(localdt, BlockList.aj.instance(), 3);
/*  71: 87 */               j = 1;
/*  72:    */             }
/*  73: 88 */             else if (localamj.getItem() == ItemList.potato)
/*  74:    */             {
/*  75: 89 */               localaqu.setBlock(localdt, BlockList.cc.instance(), 3);
/*  76: 90 */               j = 1;
/*  77:    */             }
/*  78: 91 */             else if (localamj.getItem() == ItemList.carrot)
/*  79:    */             {
/*  80: 92 */               localaqu.setBlock(localdt, BlockList.cb.instance(), 3);
/*  81: 93 */               j = 1;
/*  82:    */             }
/*  83:    */           }
/*  84: 96 */           if (j != 0)
/*  85:    */           {
/*  86: 97 */             localamj.stackSize -= 1;
/*  87: 98 */             if (localamj.stackSize > 0) {
/*  88:    */               break;
/*  89:    */             }
/*  90: 99 */             localwa.a(i, null); break;
/*  91:    */           }
/*  92:    */         }
/*  93:    */       }
/*  94:105 */       this.f = -1;
/*  95:    */       
/*  96:107 */       this.a = 10;
/*  97:    */     }
/*  98:    */   }
/*  99:    */   
/* 100:    */   protected boolean a(World paramaqu, BlockPosition paramdt)
/* 101:    */   {
/* 102:113 */     ProtoBlock localatr = paramaqu.getBlock(paramdt).getProto();
/* 103:115 */     if (localatr == BlockList.ak)
/* 104:    */     {
/* 105:116 */       paramdt = paramdt.up();
/* 106:117 */       Block localbec = paramaqu.getBlock(paramdt);
/* 107:118 */       localatr = localbec.getProto();
/* 108:120 */       if (((localatr instanceof auu)) && (((Integer)localbec.getProperty(auu.a)).intValue() == 7) && (this.e) && ((this.f == 0) || (this.f < 0)))
/* 109:    */       {
/* 110:121 */         this.f = 0;
/* 111:122 */         return true;
/* 112:    */       }
/* 113:123 */       if ((localatr == BlockList.air) && (this.d) && ((this.f == 1) || (this.f < 0)))
/* 114:    */       {
/* 115:124 */         this.f = 1;
/* 116:125 */         return true;
/* 117:    */       }
/* 118:    */     }
/* 119:128 */     return false;
/* 120:    */   }
/* 121:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ze
 * JD-Core Version:    0.7.0.1
 */