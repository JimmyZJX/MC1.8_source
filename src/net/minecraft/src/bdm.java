package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Iterables;
/*   2:    */ import com.mojang.authlib.GameProfile;
/*   4:    */ import com.mojang.authlib.properties.Property;
/*   6:    */ import net.minecraft.server.MinecraftServer;
/*   7:    */ 
/*   8:    */ public class bdm
/*   9:    */   extends bcm
/*  10:    */ {
/*  11:    */   private int a;
/*  12:    */   private int f;
/*  13: 26 */   private GameProfile g = null;
/*  14:    */   
/*  15:    */   public void writeToNBT(NBTTagCompound paramfn)
/*  16:    */   {
/*  17: 30 */     super.writeToNBT(paramfn);
/*  18: 31 */     paramfn.setByte("SkullType", (byte)(this.a & 0xFF));
/*  19: 32 */     paramfn.setByte("Rot", (byte)(this.f & 0xFF));
/*  20: 34 */     if (this.g != null)
/*  21:    */     {
/*  22: 35 */       NBTTagCompound localfn = new NBTTagCompound();
/*  23: 36 */       ga.a(localfn, this.g);
/*  24: 37 */       paramfn.setNBT("Owner", localfn);
/*  25:    */     }
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void readFromNBT(NBTTagCompound paramfn)
/*  29:    */   {
/*  30: 43 */     super.readFromNBT(paramfn);
/*  31: 44 */     this.a = paramfn.d("SkullType");
/*  32: 45 */     this.f = paramfn.d("Rot");
/*  33: 47 */     if (this.a == 3) {
/*  34: 48 */       if (paramfn.hasKey("Owner", 10))
/*  35:    */       {
/*  36: 49 */         this.g = ga.a(paramfn.getCompoundTag("Owner"));
/*  37:    */       }
/*  38: 50 */       else if (paramfn.hasKey("ExtraType", 8))
/*  39:    */       {
/*  40: 51 */         String str = paramfn.getString("ExtraType");
/*  41: 52 */         if (!vb.b(str))
/*  42:    */         {
/*  43: 53 */           this.g = new GameProfile(null, str);
/*  44: 54 */           e();
/*  45:    */         }
/*  46:    */       }
/*  47:    */     }
/*  48:    */   }
/*  49:    */   
/*  50:    */   public GameProfile b()
/*  51:    */   {
/*  52: 62 */     return this.g;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public id<ik> x_()
/*  56:    */   {
/*  57: 67 */     NBTTagCompound localfn = new NBTTagCompound();
/*  58: 68 */     writeToNBT(localfn);
/*  59: 69 */     return new iu(this.pos, 4, localfn);
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void a(int paramInt)
/*  63:    */   {
/*  64: 73 */     this.a = paramInt;
/*  65: 74 */     this.g = null;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void a(GameProfile paramGameProfile)
/*  69:    */   {
/*  70: 78 */     this.a = 3;
/*  71: 79 */     this.g = paramGameProfile;
/*  72: 80 */     e();
/*  73:    */   }
/*  74:    */   
/*  75:    */   private void e()
/*  76:    */   {
/*  77: 84 */     this.g = b(this.g);
/*  78: 85 */     o_();
/*  79:    */   }
/*  80:    */   
/*  81:    */   public static GameProfile b(GameProfile paramGameProfile)
/*  82:    */   {
/*  83: 89 */     if ((paramGameProfile == null) || (vb.b(paramGameProfile.getName()))) {
/*  84: 90 */       return paramGameProfile;
/*  85:    */     }
/*  86: 91 */     if ((paramGameProfile.isComplete()) && (paramGameProfile.getProperties().containsKey("textures"))) {
/*  87: 92 */       return paramGameProfile;
/*  88:    */     }
/*  89: 95 */     if (MinecraftServer.M() == null) {
/*  90: 96 */       return paramGameProfile;
/*  91:    */     }
/*  92:100 */     GameProfile localGameProfile = MinecraftServer.M().aD().a(paramGameProfile.getName());
/*  93:101 */     if (localGameProfile == null) {
/*  94:102 */       return paramGameProfile;
/*  95:    */     }
/*  96:106 */     Property localProperty = (Property)Iterables.getFirst(localGameProfile.getProperties().get("textures"), null);
/*  97:107 */     if (localProperty == null) {
/*  98:108 */       localGameProfile = MinecraftServer.M().aB().fillProfileProperties(localGameProfile, true);
/*  99:    */     }
/* 100:110 */     return localGameProfile;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public int c()
/* 104:    */   {
/* 105:114 */     return this.a;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public int d()
/* 109:    */   {
/* 110:118 */     return this.f;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void b(int paramInt)
/* 114:    */   {
/* 115:122 */     this.f = paramInt;
/* 116:    */   }
/* 117:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bdm
 * JD-Core Version:    0.7.0.1
 */