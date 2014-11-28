package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.mojang.authlib.GameProfile;
/*   3:    */ import com.mojang.authlib.properties.Property;
/*   4:    */ import com.mojang.authlib.properties.PropertyMap;
/*   5:    */ import java.util.List;
/*   6:    */ 
/*   7:    */ public class kh
/*   8:    */   implements id<ik>
/*   9:    */ {
/*  10:    */   private kj a;
/*  11: 19 */   private final List<kk> b = Lists.newArrayList();
/*  12:    */   
/*  13:    */   public kh() {}
/*  14:    */   
/*  15:    */   public kh(kj paramkj, qw... paramVarArgs)
/*  16:    */   {
/*  17: 26 */     this.a = paramkj;
/*  18: 28 */     for (qw localqw : paramVarArgs) {
/*  19: 29 */       this.b.add(new kk(this, localqw.cc(), localqw.h, localqw.c.b(), localqw.E()));
/*  20:    */     }
/*  21:    */   }
/*  22:    */   
/*  23:    */   public kh(kj paramkj, Iterable<qw> paramIterable)
/*  24:    */   {
/*  25: 34 */     this.a = paramkj;
/*  26: 36 */     for (qw localqw : paramIterable) {
/*  27: 37 */       this.b.add(new kk(this, localqw.cc(), localqw.h, localqw.c.b(), localqw.E()));
/*  28:    */     }
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  32:    */   {
/*  33: 43 */     this.a = ((kj)paramhd.a(kj.class));
/*  34:    */     
/*  35: 45 */     int i = paramhd.e();
/*  36: 46 */     for (int j = 0; j < i; j++)
/*  37:    */     {
/*  38: 47 */       GameProfile localGameProfile = null;
/*  39: 48 */       int k = 0;
/*  40: 49 */       EnumGameMode localarc = null;
/*  41: 50 */       ho localho = null;
/*  42: 52 */       switch (ki.a[this.a.ordinal()])
/*  43:    */       {
/*  44:    */       case 1: 
/*  45: 54 */         localGameProfile = new GameProfile(paramhd.g(), paramhd.c(16));
/*  46: 55 */         int m = paramhd.e();
/*  47: 56 */         for (int n = 0; n < m; n++)
/*  48:    */         {
/*  49: 57 */           String str1 = paramhd.c(32767);
/*  50: 58 */           String str2 = paramhd.c(32767);
/*  51: 60 */           if (paramhd.readBoolean()) {
/*  52: 61 */             localGameProfile.getProperties().put(str1, new Property(str1, str2, paramhd.c(32767)));
/*  53:    */           } else {
/*  54: 63 */             localGameProfile.getProperties().put(str1, new Property(str1, str2));
/*  55:    */           }
/*  56:    */         }
/*  57: 66 */         localarc = EnumGameMode.a(paramhd.e());
/*  58: 67 */         k = paramhd.e();
/*  59: 68 */         if (paramhd.readBoolean()) {
/*  60: 69 */           localho = paramhd.d();
/*  61:    */         }
/*  62:    */         break;
/*  63:    */       case 2: 
/*  64: 73 */         localGameProfile = new GameProfile(paramhd.g(), null);
/*  65: 74 */         localarc = EnumGameMode.a(paramhd.e());
/*  66: 75 */         break;
/*  67:    */       case 3: 
/*  68: 77 */         localGameProfile = new GameProfile(paramhd.g(), null);
/*  69: 78 */         k = paramhd.e();
/*  70: 79 */         break;
/*  71:    */       case 4: 
/*  72: 81 */         localGameProfile = new GameProfile(paramhd.g(), null);
/*  73: 82 */         if (paramhd.readBoolean()) {
/*  74: 83 */           localho = paramhd.d();
/*  75:    */         }
/*  76:    */         break;
/*  77:    */       case 5: 
/*  78: 87 */         localGameProfile = new GameProfile(paramhd.g(), null);
/*  79:    */       }
/*  80: 91 */       this.b.add(new kk(this, localGameProfile, k, localarc, localho));
/*  81:    */     }
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  85:    */   {
/*  86: 97 */     paramhd.a(this.a);
/*  87:    */     
/*  88: 99 */     paramhd.b(this.b.size());
/*  89:100 */     for (kk localkk : this.b) {
/*  90:101 */       switch (ki.a[this.a.ordinal()])
/*  91:    */       {
/*  92:    */       case 1: 
/*  93:103 */         paramhd.a(localkk.a().getId());
/*  94:104 */         paramhd.a(localkk.a().getName());
/*  95:105 */         paramhd.b(localkk.a().getProperties().size());
/*  96:106 */         for (Property localProperty : localkk.a().getProperties().values())
/*  97:    */         {
/*  98:107 */           paramhd.a(localProperty.getName());
/*  99:108 */           paramhd.a(localProperty.getValue());
/* 100:109 */           if (localProperty.hasSignature())
/* 101:    */           {
/* 102:110 */             paramhd.writeBoolean(true);
/* 103:111 */             paramhd.a(localProperty.getSignature());
/* 104:    */           }
/* 105:    */           else
/* 106:    */           {
/* 107:113 */             paramhd.writeBoolean(false);
/* 108:    */           }
/* 109:    */         }
/* 110:116 */         paramhd.b(localkk.c().a());
/* 111:117 */         paramhd.b(localkk.b());
/* 112:119 */         if (localkk.d() == null)
/* 113:    */         {
/* 114:120 */           paramhd.writeBoolean(false);
/* 115:    */         }
/* 116:    */         else
/* 117:    */         {
/* 118:122 */           paramhd.writeBoolean(true);
/* 119:123 */           paramhd.a(localkk.d());
/* 120:    */         }
/* 121:125 */         break;
/* 122:    */       case 2: 
/* 123:127 */         paramhd.a(localkk.a().getId());
/* 124:128 */         paramhd.b(localkk.c().a());
/* 125:129 */         break;
/* 126:    */       case 3: 
/* 127:131 */         paramhd.a(localkk.a().getId());
/* 128:132 */         paramhd.b(localkk.b());
/* 129:133 */         break;
/* 130:    */       case 4: 
/* 131:135 */         paramhd.a(localkk.a().getId());
/* 132:136 */         if (localkk.d() == null)
/* 133:    */         {
/* 134:137 */           paramhd.writeBoolean(false);
/* 135:    */         }
/* 136:    */         else
/* 137:    */         {
/* 138:139 */           paramhd.writeBoolean(true);
/* 139:140 */           paramhd.a(localkk.d());
/* 140:    */         }
/* 141:142 */         break;
/* 142:    */       case 5: 
/* 143:144 */         paramhd.a(localkk.a().getId());
/* 144:    */       }
/* 145:    */     }
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void a(ik paramik)
/* 149:    */   {
/* 150:152 */     paramik.a(this);
/* 151:    */   }
/* 152:    */   
/* 153:    */   public List<kk> a()
/* 154:    */   {
/* 155:156 */     return this.b;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public kj b()
/* 159:    */   {
/* 160:160 */     return this.a;
/* 161:    */   }
/* 162:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     kh
 * JD-Core Version:    0.7.0.1
 */