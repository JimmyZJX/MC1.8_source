package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class wg
/*   5:    */ {
/*   6: 21 */   private final List<wf> a = Lists.newArrayList();
/*   7:    */   private final EntityLiving b;
/*   8:    */   private int c;
/*   9:    */   private int d;
/*  10:    */   private int e;
/*  11:    */   private boolean f;
/*  12:    */   private boolean g;
/*  13:    */   private String h;
/*  14:    */   
/*  15:    */   public wg(EntityLiving paramxm)
/*  16:    */   {
/*  17: 31 */     this.b = paramxm;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void a()
/*  21:    */   {
/*  22: 35 */     j();
/*  23: 37 */     if (this.b.j_())
/*  24:    */     {
/*  25: 38 */       ProtoBlock localatr = this.b.world.getBlock(new BlockPosition(this.b.xPos, this.b.getAABB().minY, this.b.zPos)).getProto();
/*  26: 40 */       if (localatr == BlockList.au) {
/*  27: 41 */         this.h = "ladder";
/*  28: 42 */       } else if (localatr == BlockList.vine) {
/*  29: 43 */         this.h = "vines";
/*  30:    */       }
/*  31:    */     }
/*  32: 45 */     else if (this.b.isInWater())
/*  33:    */     {
/*  34: 46 */       this.h = "water";
/*  35:    */     }
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void a(DamageSource paramwh, float paramFloat1, float paramFloat2)
/*  39:    */   {
/*  40: 51 */     g();
/*  41: 52 */     a();
/*  42:    */     
/*  43: 54 */     wf localwf = new wf(paramwh, this.b.W, paramFloat1, paramFloat2, this.h, this.b.O);
/*  44:    */     
/*  45: 56 */     this.a.add(localwf);
/*  46: 57 */     this.c = this.b.W;
/*  47: 58 */     this.g = true;
/*  48: 60 */     if ((localwf.f()) && (!this.f) && (this.b.ai()))
/*  49:    */     {
/*  50: 61 */       this.f = true;
/*  51: 62 */       this.d = this.b.W;
/*  52: 63 */       this.e = this.d;
/*  53: 64 */       this.b.g_();
/*  54:    */     }
/*  55:    */   }
/*  56:    */   
/*  57:    */   public ho b()
/*  58:    */   {
/*  59: 69 */     if (this.a.size() == 0) {
/*  60: 70 */       return new hz("death.attack.generic", new Object[] { this.b.e_() });
/*  61:    */     }
/*  62: 73 */     wf localwf1 = i();
/*  63: 74 */     wf localwf2 = (wf)this.a.get(this.a.size() - 1);
/*  64:    */     
/*  65: 76 */     ho localho1 = localwf2.h();
/*  66: 77 */     Entity localwv1 = localwf2.a().getAttacker();
/*  67:    */     ho localObject1;
/*  68: 79 */     if ((localwf1 != null) && (localwf2.a() == DamageSource.fall))
/*  69:    */     {
/*  70: 80 */       ho localho2 = localwf1.h();
/*  71: 82 */       if ((localwf1.a() == DamageSource.fall) || (localwf1.a() == DamageSource.outOfWorld))
/*  72:    */       {
/*  73: 83 */         localObject1 = new hz("death.fell.accident." + a(localwf1), new Object[] { this.b.e_() });
/*  74:    */       }
/*  75:    */       else
/*  76:    */       {
/*  77:    */         Entity localwv2;
/*  78: 84 */         if ((localho2 != null) && ((localho1 == null) || (!localho2.equals(localho1))))
/*  79:    */         {
/*  80: 85 */           localwv2 = localwf1.a().getAttacker();
/*  81: 86 */           ItemStack localObject2 = (localwv2 instanceof EntityLiving) ? ((EntityLiving)localwv2).getHeldItemStack() : null;
/*  82: 88 */           if ((localObject2 != null) && (localObject2.s())) {
/*  83: 89 */             localObject1 = new hz("death.fell.assist.item", new Object[] { this.b.e_(), localho2, localObject2.C() });
/*  84:    */           } else {
/*  85: 91 */             localObject1 = new hz("death.fell.assist", new Object[] { this.b.e_(), localho2 });
/*  86:    */           }
/*  87:    */         }
/*  88: 93 */         else if (localho1 != null)
/*  89:    */         {
/*  90: 94 */           ItemStack localwv21 = (localwv1 instanceof EntityLiving) ? ((EntityLiving)localwv1).getHeldItemStack() : null;
/*  91: 95 */           if ((localwv21 != null) && (localwv21.s())) {
/*  92: 96 */             localObject1 = new hz("death.fell.finish.item", new Object[] { this.b.e_(), localho1, localwv21.C() });
/*  93:    */           } else {
/*  94: 98 */             localObject1 = new hz("death.fell.finish", new Object[] { this.b.e_(), localho1 });
/*  95:    */           }
/*  96:    */         }
/*  97:    */         else
/*  98:    */         {
/*  99:101 */           localObject1 = new hz("death.fell.killer", new Object[] { this.b.e_() });
/* 100:    */         }
/* 101:    */       }
/* 102:    */     }
/* 103:    */     else
/* 104:    */     {
/* 105:104 */       localObject1 = localwf2.a().b(this.b);
/* 106:    */     }
/* 107:107 */     return localObject1;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public EntityLiving c()
/* 111:    */   {
/* 112:111 */     EntityLiving localxm = null;
/* 113:112 */     EntityPlayer localahd = null;
/* 114:113 */     float f1 = 0.0F;
/* 115:114 */     float f2 = 0.0F;
/* 116:116 */     for (wf localwf : this.a)
/* 117:    */     {
/* 118:117 */       if (((localwf.a().getAttacker() instanceof EntityPlayer)) && ((localahd == null) || (localwf.c() > f2)))
/* 119:    */       {
/* 120:118 */         f2 = localwf.c();
/* 121:119 */         localahd = (EntityPlayer)localwf.a().getAttacker();
/* 122:    */       }
/* 123:122 */       if (((localwf.a().getAttacker() instanceof EntityLiving)) && ((localxm == null) || (localwf.c() > f1)))
/* 124:    */       {
/* 125:123 */         f1 = localwf.c();
/* 126:124 */         localxm = (EntityLiving)localwf.a().getAttacker();
/* 127:    */       }
/* 128:    */     }
/* 129:128 */     if ((localahd != null) && (f2 >= f1 / 3.0F)) {
/* 130:129 */       return localahd;
/* 131:    */     }
/* 132:131 */     return localxm;
/* 133:    */   }
/* 134:    */   
/* 135:    */   private wf i()
/* 136:    */   {
/* 137:136 */     wf localObject1 = null;
/* 138:137 */     wf localObject2 = null;
/* 139:138 */     int i = 0;
/* 140:139 */     float f1 = 0.0F;
/* 141:141 */     for (int j = 0; j < this.a.size(); j++)
/* 142:    */     {
/* 143:142 */       wf localwf = this.a.get(j);
/* 144:143 */       wf localObject3 = j > 0 ? this.a.get(j - 1) : null;
/* 145:145 */       if (((localwf.a() == DamageSource.fall) || (localwf.a() == DamageSource.outOfWorld)) && (localwf.i() > 0.0F) && ((localObject1 == null) || (localwf.i() > f1)))
/* 146:    */       {
/* 147:146 */         if (j > 0) {
/* 148:147 */           localObject1 = localObject3;
/* 149:    */         } else {
/* 150:149 */           localObject1 = localwf;
/* 151:    */         }
/* 152:151 */         f1 = localwf.i();
/* 153:    */       }
/* 154:154 */       if ((localwf.g() != null) && ((localObject2 == null) || (localwf.c() > i))) {
/* 155:155 */         localObject2 = localwf;
/* 156:    */       }
/* 157:    */     }
/* 158:159 */     if ((f1 > 5.0F) && (localObject1 != null)) {
/* 159:160 */       return localObject1;
/* 160:    */     }
/* 161:161 */     if ((i > 5) && (localObject2 != null)) {
/* 162:162 */       return localObject2;
/* 163:    */     }
/* 164:164 */     return null;
/* 165:    */   }
/* 166:    */   
/* 167:    */   private String a(wf paramwf)
/* 168:    */   {
/* 169:169 */     return paramwf.g() == null ? "generic" : paramwf.g();
/* 170:    */   }
/* 171:    */   
/* 172:    */   public int f()
/* 173:    */   {
/* 174:183 */     if (this.f) {
/* 175:184 */       return this.b.W - this.d;
/* 176:    */     }
/* 177:186 */     return this.e - this.d;
/* 178:    */   }
/* 179:    */   
/* 180:    */   private void j()
/* 181:    */   {
/* 182:191 */     this.h = null;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void g()
/* 186:    */   {
/* 187:195 */     int i = this.f ? 300 : 100;
/* 188:197 */     if ((this.g) && ((!this.b.ai()) || (this.b.W - this.c > i)))
/* 189:    */     {
/* 190:198 */       boolean bool = this.f;
/* 191:199 */       this.g = false;
/* 192:200 */       this.f = false;
/* 193:201 */       this.e = this.b.W;
/* 194:203 */       if (bool) {
/* 195:204 */         this.b.j();
/* 196:    */       }
/* 197:206 */       this.a.clear();
/* 198:    */     }
/* 199:    */   }
/* 200:    */   
/* 201:    */   public EntityLiving h()
/* 202:    */   {
/* 203:211 */     return this.b;
/* 204:    */   }
/* 205:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wg
 * JD-Core Version:    0.7.0.1
 */