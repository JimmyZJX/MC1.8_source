package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

import java.util.List;
/*   3:    */ 
/*   4:    */ public class bdv
/*   5:    */   extends bcm
/*   6:    */   implements pm
/*   7:    */ {
/*   8:    */   private Block a;
/*   9:    */   private EnumDirection f;
/*  10:    */   private boolean g;
/*  11:    */   private boolean h;
/*  12:    */   private float i;
/*  13:    */   private float j;
/*  14:    */   
/*  15:    */   public bdv() {}
/*  16:    */   
/*  17:    */   public bdv(Block parambec, EnumDirection paramej, boolean paramBoolean1, boolean paramBoolean2)
/*  18:    */   {
/*  19: 29 */     this.a = parambec;
/*  20: 30 */     this.f = paramej;
/*  21: 31 */     this.g = paramBoolean1;
/*  22: 32 */     this.h = paramBoolean2;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public Block b()
/*  26:    */   {
/*  27: 36 */     return this.a;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public int getData()
/*  31:    */   {
/*  32: 41 */     return 0;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public boolean d()
/*  36:    */   {
/*  37: 45 */     return this.g;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public EnumDirection e()
/*  41:    */   {
/*  42: 49 */     return this.f;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public boolean g()
/*  46:    */   {
/*  47: 53 */     return this.h;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public float a(float paramFloat)
/*  51:    */   {
/*  52: 57 */     if (paramFloat > 1.0F) {
/*  53: 58 */       paramFloat = 1.0F;
/*  54:    */     }
/*  55: 60 */     return this.j + (this.i - this.j) * paramFloat;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public float b(float paramFloat)
/*  59:    */   {
/*  60: 64 */     if (this.g) {
/*  61: 65 */       return (a(paramFloat) - 1.0F) * this.f.g();
/*  62:    */     }
/*  63: 67 */     return (1.0F - a(paramFloat)) * this.f.g();
/*  64:    */   }
/*  65:    */   
/*  66:    */   public float c(float paramFloat)
/*  67:    */   {
/*  68: 72 */     if (this.g) {
/*  69: 73 */       return (a(paramFloat) - 1.0F) * this.f.h();
/*  70:    */     }
/*  71: 75 */     return (1.0F - a(paramFloat)) * this.f.h();
/*  72:    */   }
/*  73:    */   
/*  74:    */   public float d(float paramFloat)
/*  75:    */   {
/*  76: 80 */     if (this.g) {
/*  77: 81 */       return (a(paramFloat) - 1.0F) * this.f.i();
/*  78:    */     }
/*  79: 83 */     return (1.0F - a(paramFloat)) * this.f.i();
/*  80:    */   }
/*  81:    */   
/*  82: 87 */   private List<Entity> k = Lists.newArrayList();
/*  83:    */   
/*  84:    */   private void a(float paramFloat1, float paramFloat2)
/*  85:    */   {
/*  86: 90 */     if (this.g) {
/*  87: 91 */       paramFloat1 = 1.0F - paramFloat1;
/*  88:    */     } else {
/*  89: 93 */       paramFloat1 -= 1.0F;
/*  90:    */     }
/*  91: 96 */     AABB localbrt = BlockList.M.a(this.world, this.pos, this.a, paramFloat1, this.f);
/*  92: 97 */     if (localbrt != null)
/*  93:    */     {
/*  94: 98 */       List<Entity> localList = this.world.b(null, localbrt);
/*  95: 99 */       if (!localList.isEmpty())
/*  96:    */       {
/*  97:100 */         this.k.addAll(localList);
/*  98:102 */         for (Entity localwv : this.k) {
/*  99:103 */           if ((this.a.getProto() == BlockList.cE) && (this.g)) {
/* 100:104 */             switch (bdw.a[this.f.k().ordinal()])
/* 101:    */             {
/* 102:    */             case 1: 
/* 103:106 */               localwv.xVelocity = this.f.g();
/* 104:107 */               break;
/* 105:    */             case 2: 
/* 106:109 */               localwv.yVelocity = this.f.h();
/* 107:110 */               break;
/* 108:    */             case 3: 
/* 109:112 */               localwv.zVelocity = this.f.i();
/* 110:    */             }
/* 111:    */           } else {
/* 112:116 */             localwv.move(paramFloat2 * this.f.g(), paramFloat2 * this.f.h(), paramFloat2 * this.f.i());
/* 113:    */           }
/* 114:    */         }
/* 115:119 */         this.k.clear();
/* 116:    */       }
/* 117:    */     }
/* 118:    */   }
/* 119:    */   
/* 120:    */   public void h()
/* 121:    */   {
/* 122:125 */     if ((this.j < 1.0F) && (this.world != null))
/* 123:    */     {
/* 124:126 */       this.j = (this.i = 1.0F);
/* 125:127 */       this.world.t(this.pos);
/* 126:128 */       y();
/* 127:129 */       if (this.world.getBlock(this.pos).getProto() == BlockList.M)
/* 128:    */       {
/* 129:130 */         this.world.setBlock(this.pos, this.a, 3);
/* 130:131 */         this.world.d(this.pos, this.a.getProto());
/* 131:    */       }
/* 132:    */     }
/* 133:    */   }
/* 134:    */   
/* 135:    */   public void c()
/* 136:    */   {
/* 137:138 */     this.j = this.i;
/* 138:140 */     if (this.j >= 1.0F)
/* 139:    */     {
/* 140:141 */       a(1.0F, 0.25F);
/* 141:142 */       this.world.t(this.pos);
/* 142:143 */       y();
/* 143:144 */       if (this.world.getBlock(this.pos).getProto() == BlockList.M)
/* 144:    */       {
/* 145:145 */         this.world.setBlock(this.pos, this.a, 3);
/* 146:146 */         this.world.d(this.pos, this.a.getProto());
/* 147:    */       }
/* 148:148 */       return;
/* 149:    */     }
/* 150:151 */     this.i += 0.5F;
/* 151:152 */     if (this.i >= 1.0F) {
/* 152:153 */       this.i = 1.0F;
/* 153:    */     }
/* 154:156 */     if (this.g) {
/* 155:157 */       a(this.i, this.i - this.j + 0.0625F);
/* 156:    */     }
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void readFromNBT(NBTTagCompound paramfn)
/* 160:    */   {
/* 161:163 */     super.readFromNBT(paramfn);
/* 162:    */     
/* 163:165 */     this.a = ProtoBlock.c(paramfn.getInteger("blockId")).instance(paramfn.getInteger("blockData"));
/* 164:166 */     this.f = EnumDirection.a(paramfn.getInteger("facing"));
/* 165:167 */     this.j = (this.i = paramfn.getFloat("progress"));
/* 166:168 */     this.g = paramfn.getBoolean("extending");
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void writeToNBT(NBTTagCompound paramfn)
/* 170:    */   {
/* 171:173 */     super.writeToNBT(paramfn);
/* 172:    */     
/* 173:175 */     paramfn.setInt("blockId", ProtoBlock.a(this.a.getProto()));
/* 174:176 */     paramfn.setInt("blockData", this.a.getProto().c(this.a));
/* 175:177 */     paramfn.setInt("facing", this.f.a());
/* 176:178 */     paramfn.setFloat("progress", this.j);
/* 177:179 */     paramfn.setBoolean("extending", this.g);
/* 178:    */   }
/* 179:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bdv
 * JD-Core Version:    0.7.0.1
 */