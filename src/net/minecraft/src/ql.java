package net.minecraft.src;
/*  1:   */ import net.minecraft.server.MinecraftServer;
/*  2:   */ 
/*  3:   */ public class ql
/*  4:   */   extends WorldServer
/*  5:   */ {
/*  6:   */   private WorldServer a;
/*  7:   */   
/*  8:   */   public ql(MinecraftServer paramMinecraftServer, bqy parambqy, int paramInt, WorldServer paramqt, Profiler paramuw)
/*  9:   */   {
/* 10:16 */     super(paramMinecraftServer, parambqy, new bql(paramqt.getWorldInfo()), paramInt, paramuw);
/* 11:17 */     this.a = paramqt;
/* 12:   */     
/* 13:19 */     paramqt.af().a(new qm(this));
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected void a() {}
/* 17:   */   
/* 18:   */   public World getSelf()
/* 19:   */   {
/* 20:65 */     this.z = this.a.T();
/* 21:66 */     this.C = this.a.Z();
/* 22:   */     
/* 23:   */ 
/* 24:69 */     String str = VillageManager.a(this.t);
/* 25:70 */     VillageManager localabl = (VillageManager)this.z.a(VillageManager.class, str);
/* 26:71 */     if (localabl == null)
/* 27:   */     {
/* 28:72 */       this.villageManager = new VillageManager(this);
/* 29:73 */       this.z.a(str, this.villageManager);
/* 30:   */     }
/* 31:   */     else
/* 32:   */     {
/* 33:75 */       this.villageManager = localabl;
/* 34:76 */       this.villageManager.setWorld(this);
/* 35:   */     }
/* 36:79 */     return this;
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ql
 * JD-Core Version:    0.7.0.1
 */