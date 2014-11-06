package net.minecraft.src;
/*  1:   */ public class aha
/*  2:   */ {
/*  3:   */   public boolean a;
/*  4:   */   public boolean b;
/*  5:   */   public boolean c;
/*  6:   */   public boolean d;
/*  7:11 */   public boolean e = true;
/*  8:12 */   private float f = 0.05F;
/*  9:13 */   private float g = 0.1F;
/* 10:   */   
/* 11:   */   public void a(NBTTagCompound paramfn)
/* 12:   */   {
/* 13:16 */     NBTTagCompound localfn = new NBTTagCompound();
/* 14:   */     
/* 15:18 */     localfn.setBoolean("invulnerable", this.a);
/* 16:19 */     localfn.setBoolean("flying", this.b);
/* 17:20 */     localfn.setBoolean("mayfly", this.c);
/* 18:21 */     localfn.setBoolean("instabuild", this.d);
/* 19:22 */     localfn.setBoolean("mayBuild", this.e);
/* 20:23 */     localfn.setFloat("flySpeed", this.f);
/* 21:24 */     localfn.setFloat("walkSpeed", this.g);
/* 22:25 */     paramfn.setNBT("abilities", localfn);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void b(NBTTagCompound paramfn)
/* 26:   */   {
/* 27:29 */     if (paramfn.hasKey("abilities", 10))
/* 28:   */     {
/* 29:30 */       NBTTagCompound localfn = paramfn.getCompoundTag("abilities");
/* 30:   */       
/* 31:32 */       this.a = localfn.getBoolean("invulnerable");
/* 32:33 */       this.b = localfn.getBoolean("flying");
/* 33:34 */       this.c = localfn.getBoolean("mayfly");
/* 34:35 */       this.d = localfn.getBoolean("instabuild");
/* 35:37 */       if (localfn.hasKey("flySpeed", 99))
/* 36:   */       {
/* 37:38 */         this.f = localfn.getFloat("flySpeed");
/* 38:39 */         this.g = localfn.getFloat("walkSpeed");
/* 39:   */       }
/* 40:41 */       if (localfn.hasKey("mayBuild", 1)) {
/* 41:42 */         this.e = localfn.getBoolean("mayBuild");
/* 42:   */       }
/* 43:   */     }
/* 44:   */   }
/* 45:   */   
/* 46:   */   public float a()
/* 47:   */   {
/* 48:48 */     return this.f;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void a(float paramFloat)
/* 52:   */   {
/* 53:52 */     this.f = paramFloat;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public float b()
/* 57:   */   {
/* 58:56 */     return this.g;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void b(float paramFloat)
/* 62:   */   {
/* 63:60 */     this.g = paramFloat;
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aha
 * JD-Core Version:    0.7.0.1
 */