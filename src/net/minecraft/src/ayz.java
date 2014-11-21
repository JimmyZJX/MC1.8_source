package net.minecraft.src;
/*   1:    */ public class ayz
/*   2:    */ {
/*   3:    */   private final World a;
/*   4:    */   private final EnumAxis b;
/*   5:    */   private final EnumDirection c;
/*   6:    */   private final EnumDirection d;
/*   7:242 */   private int e = 0;
/*   8:    */   private BlockPosition f;
/*   9:    */   private int g;
/*  10:    */   private int h;
/*  11:    */   
/*  12:    */   public ayz(World paramaqu, BlockPosition paramdt, EnumAxis paramel)
/*  13:    */   {
/*  14:248 */     this.a = paramaqu;
/*  15:249 */     this.b = paramel;
/*  16:250 */     if (paramel == EnumAxis.X)
/*  17:    */     {
/*  18:251 */       this.d = EnumDirection.EAST;
/*  19:252 */       this.c = EnumDirection.WEST;
/*  20:    */     }
/*  21:    */     else
/*  22:    */     {
/*  23:255 */       this.d = EnumDirection.NORTH;
/*  24:256 */       this.c = EnumDirection.SOUTH;
/*  25:    */     }
/*  26:259 */     BlockPosition localdt = paramdt;
/*  27:260 */     while ((paramdt.getY() > localdt.getY() - 21) && (paramdt.getY() > 0) && (a(paramaqu.getBlock(paramdt.down()).getProto()))) {
/*  28:261 */       paramdt = paramdt.down();
/*  29:    */     }
/*  30:264 */     int i = a(paramdt, this.d) - 1;
/*  31:266 */     if (i >= 0)
/*  32:    */     {
/*  33:267 */       this.f = paramdt.offset(this.d, i);
/*  34:    */       
/*  35:269 */       this.h = a(this.f, this.c);
/*  36:271 */       if ((this.h < 2) || (this.h > 21))
/*  37:    */       {
/*  38:272 */         this.f = null;
/*  39:273 */         this.h = 0;
/*  40:    */       }
/*  41:    */     }
/*  42:277 */     if (this.f != null) {
/*  43:278 */       this.g = a();
/*  44:    */     }
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected int a(BlockPosition paramdt, EnumDirection paramej)
/*  48:    */   {
				  int i;
/*  49:284 */     for (i = 0; i < 22; i++)
/*  50:    */     {
/*  51:285 */       BlockPosition localObject = paramdt.offset(paramej, i);
/*  52:286 */       if (!a(this.a.getBlock((BlockPosition)localObject).getProto())) {
/*  53:    */         break;
/*  54:    */       }
/*  55:290 */       if (this.a.getBlock(((BlockPosition)localObject).down()).getProto() != BlockList.obsidian) {
/*  56:    */         break;
/*  57:    */       }
/*  58:    */     }
/*  59:295 */     Object localObject = this.a.getBlock(paramdt.offset(paramej, i)).getProto();
/*  60:296 */     if (localObject == BlockList.obsidian) {
/*  61:297 */       return i;
/*  62:    */     }
/*  63:300 */     return 0;
/*  64:    */   }
/*  65:    */   
/*  66:    */   protected int a()
/*  67:    */   {
				  label181:
/*  68:304 */     for (this.g = 0; this.g < 21; this.g += 1) {
/*  69:305 */       for (int i = 0; i < this.h; i++)
/*  70:    */       {
/*  71:306 */         BlockPosition localdt = this.f.offset(this.c, i).up(this.g);
/*  72:    */         
/*  73:308 */         ProtoBlock localatr = this.a.getBlock(localdt).getProto();
/*  74:309 */         if (!a(localatr)) {
/*  75:    */           break label181;
/*  76:    */         }
/*  77:313 */         if (localatr == BlockList.aY) {
/*  78:314 */           this.e += 1;
/*  79:    */         }
/*  80:317 */         if (i == 0)
/*  81:    */         {
/*  82:318 */           localatr = this.a.getBlock(localdt.a(this.d)).getProto();
/*  83:319 */           if (localatr != BlockList.obsidian) {
/*  84:    */             break label181;
/*  85:    */           }
/*  86:    */         }
/*  87:322 */         else if (i == this.h - 1)
/*  88:    */         {
/*  89:323 */           localatr = this.a.getBlock(localdt.a(this.c)).getProto();
/*  90:324 */           if (localatr != BlockList.obsidian) {
/*  91:    */             break label181;
/*  92:    */           }
/*  93:    */         }
/*  94:    */       }
/*  95:    */     }
/*  96:    */     
/*  97:331 */     for (int i = 0; i < this.h; i++) {
/*  98:332 */       if (this.a.getBlock(this.f.offset(this.c, i).up(this.g)).getProto() != BlockList.obsidian)
/*  99:    */       {
/* 100:333 */         this.g = 0;
/* 101:334 */         break;
/* 102:    */       }
/* 103:    */     }
/* 104:338 */     if ((this.g > 21) || (this.g < 3))
/* 105:    */     {
/* 106:339 */       this.f = null;
/* 107:340 */       this.h = 0;
/* 108:341 */       this.g = 0;
/* 109:342 */       return 0;
/* 110:    */     }
/* 111:344 */     return this.g;
/* 112:    */   }
/* 113:    */   
/* 114:    */   protected boolean a(ProtoBlock paramatr)
/* 115:    */   {
/* 116:349 */     return (paramatr.material == Material.air) || (paramatr == BlockList.fire) || (paramatr == BlockList.aY);
/* 117:    */   }
/* 118:    */   
/* 119:    */   public boolean b()
/* 120:    */   {
/* 121:353 */     return (this.f != null) && (this.h >= 2) && (this.h <= 21) && (this.g >= 3) && (this.g <= 21);
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void c()
/* 125:    */   {
/* 126:357 */     for (int i = 0; i < this.h; i++)
/* 127:    */     {
/* 128:358 */       BlockPosition localdt = this.f.offset(this.c, i);
/* 129:359 */       for (int j = 0; j < this.g; j++) {
/* 130:360 */         this.a.setBlock(localdt.up(j), BlockList.aY.instance().a(ayy.a, this.b), 2);
/* 131:    */       }
/* 132:    */     }
/* 133:    */   }
				static int a(ayz arg0) {return arg0.e;}
				static int b(ayz arg0) {return arg0.h;}
				static int c(ayz arg0) {return arg0.g;}
/* 134:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayz
 * JD-Core Version:    0.7.0.1
 */